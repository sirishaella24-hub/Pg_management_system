import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/contact")
    public String contactPage() {
        return "contact";
    }

    @PostMapping("/saveContact")
    public String saveContact(Contact contact) {
        contactRepository.save(contact);
        return "redirect:/contact?success";
    }

    @GetMapping("/admin/contacts")
    public String viewContacts(Model model) {
        model.addAttribute("contacts", contactRepository.findAll());
        return "admin-contacts";
    }
}