/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package browsernavisim;

/**
 *
 * @author USER
 */
public class BrowserSearch {
    public int linearSearch(String[] pages, int count, String keyword) {
    if (pages == null || keyword == null) {
            return -1;
        }

        if (count < 0 || count > pages.length) {
            return -1;
        }
        String key = keyword.trim();

        if (key.length() == 0) {
            return -1;
        }
         for (int i = 0; i < count; i++) {

            if (pages[i] != null && containsIgnoreCase(pages[i], key)) {
                return i;
            }
        }

        return -1;
    }

 private boolean containsIgnoreCase(String text, String keyword) {

        String haystack = text.toLowerCase();
        String needle = keyword.toLowerCase();

        int n = haystack.length();
        int m = needle.length();

        if (m == 0) {
            return true;
        }

        if (m > n) {
            return false;
        }
