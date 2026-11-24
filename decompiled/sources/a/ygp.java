package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v41 a.ygp[], still in use, count: 1, list:
  (r0v41 a.ygp[]) from 0x045d: CONSTRUCTOR (r0v41 a.ygp[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:1118) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes4.dex */
public final class ygp {
    c("MobAndroid-40043 Экран Игры и История ставок.  Добавить id групп маркетов в тестовых сборках<", false),
    d("MobAndroid-74914 Диплинки. DeepLinkDelegate. Рефакторинг", false),
    e("MobAndroid-76363 Пополнение счета. Создать фичтогл", false),
    f("MobAndroid-78136 Меню. Перевести раздел на compose. Создать фича-тогл", true),
    g("MobAndroid-76352 Платежные обращения. Перевести на Compose", false),
    h("MobAndroid-77833 Избранное. Новый метод v3/favorites/games. Добавить локальный тогл", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF7("MobAndroid-39602: Акции.THIRD PARTY Рефакторинг. Переход на новый формат сообщений.", false),
    i("MobAndroid-46371 1xBet.kz. 78ref. Бонус за идентификацию. Новые алерты и боттом шит. ЦА1. 1 Этап", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF9("MobAndroid-55124 Баннеры. Подключить новые баннеры в МП", false),
    j("MobAndroid-61561 Онлайн-звонок. Добавить фича тогл", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF11("MobAndroid-63279 Альт дизайн. Ячейки. Фиды. Добавить локальный тогл", false),
    k("MobAndroid-68685 Альт дизайн. Ячейки. Интеграция. Популярное Classic (LIVE/Линия)", true),
    l("MobAndroid-66624 Добавление исходов в купон. Алерт замены события в разделе", true),
    /* JADX INFO: Fake field, exist only in values array */
    EF14("MobAndroid-67722 1xGames. Популярное. Отказаться от хардкода категорий. Добавить фича тогл", false),
    m("MobAndroid-75977 Альт дизайн 3. Jackpot. Провод ставки. Создать фича-тогл", true),
    n("MobAndroid-70117 Перевести CallbackHistoryFragment на compose", true),
    o("MobAndroid-75696 Альт.дизайн. Избранное. Добавить локальный тогл", true),
    p("MobAndroid-72270 История. Перевод на ДС экрана \"Информация о ставке\". Создать фича-тогл", true),
    q("MobAndroid-72673 Редактирвоание купона. Бш редактирования купона. OptiBet. Добавить стейт с отображением нескольких кефов", true),
    r("MobAndroid-68610 История ставок. Оценить приложение. Тестовый режим. Замена дней на минуты для тестирования", false),
    s("MobAndroid-67120 1xGames. Бонусы. Lucky Wheel. Рефакторинг/перевод на DS", true),
    t("MobAndroid-75164 Фичетогл на включение поддержки RTL для оппонентов, счета, маркетов", false),
    u("MobAndroid-62334 TeamBet. Избранные команды, новый раздел", false),
    v("MobAndroid-75553 История. Перевести историю казино на ДС (noTabsClassic). Создать фича-тогл", true),
    w("MobAndroid-75515 Альт.диз 3. Обычный провод + Дуэль игроков", false),
    x("MobAndroid-76630 История. Перевод Продажа/Автопродажа на ДС. Создать фича-тогл", true),
    y("MobAndroid-75864 Альт дизайн. Провод ставки. Реализовать стиль 3 провода ставки в разделе \"Купон\" ", false),
    z("MobAndroid-75882 Альт дизайн. Провод ставки. Реализовать стиль 3 провода ставки в разделе \"Финставки\"", false),
    A("MobAndroid-75170 Партнеры. Заглушки верификации/идентификации. Перевод на ДС + compose", true),
    B("MobAndroid-76094 Статистика. Турнирные сетки. Стэйты для одного или без оппонентов.", true),
    Y("MobAndroid-74449 Партнеры. Верификация. Перевод на ДС + compose", true),
    Z("MobAndroid-71990 Финставки. Перевести раздел на ДС", true),
    f1("MobAndroid-76635 История. Перевод PowerBet на ДС. Создать фича-тогл", true),
    g1("MobAndroid-75898 Альт дизайн. Провод ставки. Реализовать стиль 3 провода ставки в разделе \"Бетконструктор\"", false),
    h1("MobAndroid-75899 Альт дизайн. Провод ставки. Реализовать стиль 3 провода ставки в разделе \"ТОТО\"", false),
    i1("MobAndroid-78506 Экран игры. ZonePlay. Перевести на Compose", true),
    j1("MobAndroid-76636 История. Перевод История транзакций на ДС. Создать фича-тогл", true),
    k1("MobAndroid-56422 Бетконструктор. Перевести раздел на Дизайн-Систему", false),
    l1("MobAndroid-75240 Статистика. Турнирные сетки. Перевод на compose", false),
    m1("MobAndroid-79239 1xSwipe. Подтверждение ставки", true),
    n1("MobAndroid-78896 Экран загрузки/Старт приложения. Переезд на Compose. Локальный ключ", true),
    o1("MobAndroid-76003 Экран игры. Стиль Classic. Перевод на Compose. Создать фича-тогл", true),
    p1("MobAndroid-78686 Онлайн-звонок. Интегрировать новую библиотеку сипа на основу. Создать фича-тогл", false),
    q1("MobAndroid-79317 Альт.дизайн. Карточки Favourite Event Card в Отслеживаемом. Добавить локальный тогл", true),
    r1("MobAndroid-72258 1xGames. Бонусы. Jackpot. Перевод на ДС/Compose/рефакторинг", true),
    s1("MobAndroid-79776 Экран Игры. Стиль advanced. Реализовать режим Betbuilder. Добавить фича тогл", false),
    t1("MobAndroid-75434 Управление счетом. Стиль Singlepage. Перевод на Compose", true),
    u1("MobAndroid-75603 Диалоги успешного провод ставки. bottomSheetColoredText. Переписать на compose", true),
    v1("MobAndroid-75604 Диалоги успешного провод ставки. bottomSheetBlackText. Переписать на compose", true),
    w1("MobAndroid-79205 Партнеры. Алерт ошибки инициализации модуля. Перевод на ДС + compose", true),
    x1("MobAndroid-75606 Диалоги успешного провод ставки. alertBlackText. Переписать на compose", true),
    y1("MobAndroid-74028 1xGames. Кешбэк. Перевод на ДС", false),
    z1("MobAndroid-75605 Диалоги успешного провод ставки. alertColoredText. Переписать на compose", true),
    A1("MobAndroid-72981 Настройки безопасности. Смена пароля. Сокращение шагов без ОТП", true),
    B1("MobAndroid-80665 Перевести TotoBetTypeBottomSheetViewModel на UdfBaseViewModel", false),
    C1("MobAndroid-76355 Платежи (ИНФО). Перевести на Compose", false),
    D1("MobAndroid-80652 Онбординг спортов. Добавить локальный фича-тоггл", true),
    E1("MobAndroid-81015 Polybet. Добавить локальный фича-тоггл.", false),
    F1("MobAndroid-76522 Альт дизайн. Провод ставки. Перевести мапперы на mapHolder", false),
    G1("MobAndroid-76673 История. Интеграция кастомного календаря на ДС. Создать фича-тогл", false),
    H1("MobAndroid-80695 Перевести TotoBetComposeDsSharedViewModel на UdfBaseViewModel", false),
    I1("MobAndroid-80305 История. История ставок. Перевод экрана \"Поделиться\" на ДС", false),
    J1("MobAndroid-78035 Купон. БетБилдер. Реализовать новый функционал", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1(" MobAndroid-81161 Бш настройки ставки в Один клик. Перевести на compose", false),
    K1("MobAndroid-81179 Альт дизайн. Провод ставки в купоне. Перевести мапперы на mapHolder", false),
    /* JADX INFO: Fake field, exist only in values array */
    EF1("MobAndroid-81781 Реферальная Программа (Приведи друга). Перевод на Compose + ДС", false),
    L1("MobAndroid-82278 UFC. Экран чемпионата. Сделать фич тогл на блок \"Место проведения\"", false);

    public static final /* synthetic */ c0o N1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f42596a;
    public final String b;

    static {
        N1 = new c0o(ygpVarArr);
    }

    public ygp(String str, boolean z2) {
        super(str, i);
        this.f42596a = z2;
        this.b = str;
    }

    public static ygp valueOf(String str) {
        return (ygp) Enum.valueOf(ygp.class, str);
    }

    public static ygp[] values() {
        return (ygp[]) M1.clone();
    }
}
