package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.tc80[], still in use, count: 1, list:
  (r0v1 a.tc80[]) from 0x004c: CONSTRUCTOR (r0v1 a.tc80[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:77) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class tc80 implements fnf0 {
    REGISTRATION_FIELDS,
    GAMES_CONFIG,
    GAMES_PREVIEW,
    TIME_DIFF,
    TOP_CHAMP_EVENTS,
    /* JADX INFO: Fake field, exist only in values array */
    POPULAR_ML_CONFIG,
    CLEAR_SEEN_BANNERS;

    public static final /* synthetic */ c0o i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33708a;

    static {
        i = new c0o(tc80VarArr);
    }

    public tc80() {
        super(str, i);
        this.f33708a = name();
    }

    public static tc80 valueOf(String str) {
        return (tc80) Enum.valueOf(tc80.class, str);
    }

    public static tc80[] values() {
        return (tc80[]) h.clone();
    }

    @Override // a.fnf0
    public final String a() {
        return this.f33708a;
    }
}
