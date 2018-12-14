//package main.java;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class DuplicateFile {

    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)", "root/c 3.txt(abcd)", "root/c/d 4.txt(efgh)", "root 4.txt(efgh)"};

        DuplicateFile duplicateFile = new DuplicateFile();
        List<List<String>> response = duplicateFile.findDuplicate(paths);
        for(List<String> files : response){
            System.out.print(files);
            System.out.println("");
        }
    }

    public List<List<String>> findDuplicate(String[] paths) {
        Map<String,List<String>> fileMap = new HashMap<>();
        for(String path : paths){
            List<String> files = Arrays.asList(path.split("\\s"));
            String dir = files.get(0);
            Pattern contentPattern = Pattern.compile("\\((.*?)\\)");
            Pattern namePattern = Pattern.compile("^[^\\(]*");
            for(String file:files){
                Matcher contentMatcher = contentPattern.matcher(file);
                Matcher nameMatcher = namePattern.matcher(file);
                while(contentMatcher.find() && nameMatcher.find()){
                    String contentKey = contentMatcher.group(1);
                    String fileName = dir.concat("/").concat(nameMatcher.group(0));
                    List<String> fileList = fileMap.get(contentKey);
                    if(fileList == null || fileList.size() == 0){
                        fileList = new ArrayList<>();
                    }
                    fileList.add(fileName);
                    fileMap.put(contentKey,fileList);
                }
            }
        }
        List<List<String>> result = fileMap.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 1)
                .map(entry -> entry.getValue())
                .collect(Collectors.toList());
        return result;
    }
}