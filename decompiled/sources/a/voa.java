package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v16 a.voa[], still in use, count: 1, list:
  (r0v16 a.voa[]) from 0x00a1: CONSTRUCTOR (r0v16 a.voa[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:162) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes5.dex */
public final class voa {
    /* JADX INFO: Fake field, exist only in values array */
    FOG(1),
    /* JADX INFO: Fake field, exist only in values array */
    HAZE(2),
    /* JADX INFO: Fake field, exist only in values array */
    PARTLY_CLOUDY(3),
    /* JADX INFO: Fake field, exist only in values array */
    PARTLY_CLOUDY_RAIN(4),
    /* JADX INFO: Fake field, exist only in values array */
    PARTLY_CLOUDY_RAIN_STORM(5),
    /* JADX INFO: Fake field, exist only in values array */
    PARTLY_CLOUDY_SNOW(6),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUDY(7),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUDY_RAIN(8),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUDY_RAIN_STORM(9),
    /* JADX INFO: Fake field, exist only in values array */
    CLOUDY_SNOW(10),
    /* JADX INFO: Fake field, exist only in values array */
    MAINLY_CLOUDY(11),
    /* JADX INFO: Fake field, exist only in values array */
    MAINLY_CLOUDY_RAIN(12),
    /* JADX INFO: Fake field, exist only in values array */
    MAINLY_CLOUDY_RAIN_STORM(13),
    /* JADX INFO: Fake field, exist only in values array */
    SNOW(14),
    /* JADX INFO: Fake field, exist only in values array */
    CLEAR(15),
    UNKNOWN(-1);

    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f37756a;

    static {
        d = new c0o(voaVarArr);
    }

    public voa(int i) {
        super(str, i);
        this.f37756a = i;
    }

    public static voa valueOf(String str) {
        return (voa) Enum.valueOf(voa.class, str);
    }

    public static voa[] values() {
        return (voa[]) c.clone();
    }
}
