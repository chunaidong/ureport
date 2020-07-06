package com.wangmike.ureport.bean;

import com.bstek.ureport.definition.searchform.TextInputComponent;
import com.bstek.ureport.parser.impl.searchform.TextInputParser;
import org.dom4j.Element;

/**
 * <pre>
 *    @author  : wangchun
 *    @time    : 2020/6/29 10:15
 *    @desc    : 输入描述
 *    @version : v1.0
 * </pre>
 */

public class CustomTextInputParser extends TextInputParser {

    @Override
    public TextInputComponent parse(Element element) {
        TextInputComponent component=new TextInputComponent();
        component.setBindParameter(element.attributeValue("bind-parameter"));
        component.setLabel(element.attributeValue("label"));
        component.setType(element.attributeValue("type"));
//        component.setLabelPosition(LabelPosition.left);
        return component;
    }
}
