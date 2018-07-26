package test01.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * TemplateController
 * @author kinglyjn
 * @date 2018年7月21日
 *
 */
@Controller
@RequestMapping("/test01")
public class TemplateController {

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public String toIndex() {
		return "index";
	}
}
