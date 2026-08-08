package com.example.high_commission;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DocumentCheckList implements Serializable {
    private List<String> requiredDocuments = new ArrayList<>(List.of(
            "Passport Copy", "Passport Photo", "Bank Statement",
            "Invitation Letter", "Travel Itinerary", "Health Insurance"
    ));
    private List<String> submittedDocuments = new ArrayList<>();

    public boolean markDocumentSubmitted(String docName) {
        if (requiredDocuments.contains(docName) && !submittedDocuments.contains(docName)) {
            submittedDocuments.add(docName);
            return true;
        }
        return false;
    }

    public boolean unmarkDocument(String docName) {
        return submittedDocuments.remove(docName);
    }

    public boolean verifyChecklistCompletion() {
        return submittedDocuments.containsAll(requiredDocuments);
    }

    public String getSubmissionStatus() {
        return submittedDocuments.size() + " / " + requiredDocuments.size() + " submitted";
    }
}