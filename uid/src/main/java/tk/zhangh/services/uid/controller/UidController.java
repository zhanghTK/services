package tk.zhangh.services.uid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import tk.zhangh.services.uid.service.UidService;

/**
 * Created by ZhangHao on 2017/11/20.
 */
@RestController
public class UidController {
    @Autowired
    private UidService uidService;

    @PostMapping("/uid")
    public String getUid(@RequestParam("stub") String stub) {
        return uidService.getId(stub);
    }
}
