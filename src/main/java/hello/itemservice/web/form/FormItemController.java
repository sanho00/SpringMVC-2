package hello.itemservice.web.form;

import hello.itemservice.domain.item.DeliveryCode;
import hello.itemservice.domain.item.Item;
import hello.itemservice.domain.item.ItemRepository;
import hello.itemservice.domain.item.ItemType;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

@Slf4j
@Controller
@RequestMapping("/form/items")
@RequiredArgsConstructor
public class FormItemController {

//    private final ItemRepository itemRepository;
//
//    @ModelAttribute("regions")
//    public Map<String, String> regions() {
//        Map<String, String> regions = new LinkedHashMap<>();
//        regions.put("SEOUL", "서울");
//        regions.put("BUSAN", "부산");
//        regions.put("JEJU", "제주");
//        return regions;
//    }
//    // 이 Controller를 호출 하면 regions 에 값이 담겨서 무조건 model 에 담김
//
//    @ModelAttribute("itemTypes")
//    public ItemType[] itemTypes() {
//        return ItemType.values();
//        // enum 을 values() 로 불러 오면 enum 의 모든 정보를 배열 형태로 반환함
//    }
//
//    @ModelAttribute("deliveryCodes")
//    public List<DeliveryCode> deliveryCodes() {
//        List<DeliveryCode> deliveryCodes = new ArrayList<>();
//        deliveryCodes.add(new DeliveryCode("FAST", "빠른 배송"));
//        deliveryCodes.add(new DeliveryCode("NORMAL", "일반 배송"));
//        deliveryCodes.add(new DeliveryCode("SLOW", "느린 배송"));
//        return deliveryCodes;
//    }
//    // Controller가 호출 될 때마다 deliveryCodes() 메서드가 사용되므로 deliveryCodes 객체도 계속 생성됨
//
//    @GetMapping
//    public String items(Model model) {
//        List<Item> items = itemRepository.findAll();
//        model.addAttribute("items", items);
//        return "form/items";
//    }
//
//    @GetMapping("/{itemId}")
//    public String item(@PathVariable long itemId, Model model) {
//        Item item = itemRepository.findById(itemId);
//        model.addAttribute("item", item);
//
//        return "form/item";
//    }
//
//    @GetMapping("/add")
//    public String addForm(Model model) {
//        model.addAttribute("item", new Item());
//
//        /*Map<String, String> regions = new LinkedHashMap<>();*/
//        // Map 을 쓰면 값이 순서대로 들어가지 않기 때문에 LinkedHashMap 을 사용해서 순서대로 들어가도록 함
//        /*regions.put("SEOUL", "서울");
//        regions.put("BUSAN", "부산");
//        regions.put("JEJU", "제주");
//        model.addAttribute("regions", regions);*/
//
//        return "form/addForm";
//    }
//
//    @PostMapping("/add")
//    public String addItem(@ModelAttribute Item item, RedirectAttributes redirectAttributes) {
//        log.info("item.open={}", item.getOpen());
//        log.info("item.regions={}", item.getRegions());
//        log.info("item.itemType={}", item.getItemType());
//
//        Item savedItem = itemRepository.save(item);
//        redirectAttributes.addAttribute("itemId", savedItem.getId());
//        redirectAttributes.addAttribute("status", true);
//        return "redirect:/form/items/{itemId}";
//    }
//
//    @GetMapping("/{itemId}/edit")
//    public String editForm(@PathVariable Long itemId, Model model) {
//        Item item = itemRepository.findById(itemId);
//        model.addAttribute("item", item);
//
//        return "form/editForm";
//    }
//
//    @PostMapping("/{itemId}/edit")
//    public String edit(@PathVariable Long itemId, @ModelAttribute Item item) {
//        itemRepository.update(itemId, item);
//        return "redirect:/form/items/{itemId}";
//    }

}

