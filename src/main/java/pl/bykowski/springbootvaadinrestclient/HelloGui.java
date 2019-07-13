package pl.bykowski.springbootvaadinrestclient;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("hello")
public class HelloGui extends VerticalLayout {

    public HelloGui() {

        TextField textFieldName = new TextField();
        Button buttonOk = new Button("witaj studencie", new Icon(VaadinIcon.ACADEMY_CAP));
        Label labelHello = new Label();

        add(textFieldName);
        add(buttonOk);
        add(labelHello);
    }

}
