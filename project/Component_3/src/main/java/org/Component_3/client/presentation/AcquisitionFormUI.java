package org.Component_3.client.presentation;

import org.Component_3.client.domain.AcquisitionDTO;

public class AcquisitionFormUI {

    public AcquisitionDTO fillRequestData(String title, String isbn, String courseId) {
        AcquisitionDTO dto = new AcquisitionDTO();
        dto.setTitle(title);
        dto.setIsbn(isbn);
        dto.setCourseId(courseId);
        return dto;
    }

    public void submit() {
        // Método vacío — envío de formulario iría aquí
    }
}
