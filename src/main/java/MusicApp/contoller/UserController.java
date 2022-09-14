package MusicApp.contoller;

import MusicApp.config.UrlConstants;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = UrlConstants.MAIN_URL_USER + UrlConstants.COMPANY_URL)
@Tag(name = "Контроллер компаний для пользователя", description = "Работа с компаниями")
public class UserController {
}
