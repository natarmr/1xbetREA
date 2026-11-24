package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.slk[], still in use, count: 1, list:
  (r0v1 a.slk[]) from 0x003a: CONSTRUCTOR (r0v1 a.slk[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:59) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes3.dex */
public final class slk {
    /* JADX INFO: Fake field, exist only in values array */
    EVENTS("dictionary_update_time_events_v2"),
    /* JADX INFO: Fake field, exist only in values array */
    GROUPS("dictionary_update_time_groups"),
    /* JADX INFO: Fake field, exist only in values array */
    CURRENCIES("dictionary_update_time_currencies"),
    /* JADX INFO: Fake field, exist only in values array */
    COUNTRIES("dictionary_update_time_countries"),
    /* JADX INFO: Fake field, exist only in values array */
    APP_STRINGS("dictionary_update_time_app_strings");

    public static final /* synthetic */ c0o c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32403a;

    static {
        c = new c0o(slkVarArr);
    }

    public slk(String str) {
        super(str, i);
        this.f32403a = str;
    }

    public static slk valueOf(String str) {
        return (slk) Enum.valueOf(slk.class, str);
    }

    public static slk[] values() {
        return (slk[]) b.clone();
    }
}
