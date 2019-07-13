package pl.bykowski.springbootvaadinrestclient;

import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;

@Route("cat")
public class CatFactGui extends HorizontalLayout {

    @Autowired
    public CatFactGui(CatFactClient catFactClient) {
        CatFact catFact = catFactClient.getCatFactFormApi();
        Label label = new Label(catFact.getText());
        add(label);


    }
}
