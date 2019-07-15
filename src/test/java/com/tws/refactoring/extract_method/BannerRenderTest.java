package com.tws.refactoring.extract_method;

import com.tws.refactoring.extract_variable.BannerRender;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class BannerRenderTest {
    @Test
    //Given
    public void should_return_true_when_input_params(){
        BannerRender bannerRender = new BannerRender();
        //When
        String result=bannerRender.renderBanner("banner","mavin");

        //Then
        Assertions.assertEquals("banner",result);

    }


}
