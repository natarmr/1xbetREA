package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.csj0[], still in use, count: 1, list:
  (r0v1 a.csj0[]) from 0x003a: CONSTRUCTOR (r0v1 a.csj0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:59) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class csj0 {
    HISTORY_SHORTCUT(0),
    LINE_SHORTCUT(1),
    LIVE_SHORTCUT(2),
    ONE_X_GAMES_SHORTCUT(3),
    CYBER_SPORT_SHORTCUT(4);

    public static final /* synthetic */ c0o h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f4892a;

    static {
        h = new c0o(csj0VarArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public csj0(int i) {
        super(str, i);
        this.f4892a = i;
    }

    public static csj0 valueOf(String str) {
        return (csj0) Enum.valueOf(csj0.class, str);
    }

    public static csj0[] values() {
        return (csj0[]) g.clone();
    }

    public final String a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return "android.intent.action.HISTORY";
        }
        if (iOrdinal == 1) {
            return "android.intent.action.LINE";
        }
        if (iOrdinal == 2) {
            return "android.intent.action.LIVE";
        }
        if (iOrdinal == 3) {
            return "android.intent.action.ONE_X_GAMES";
        }
        if (iOrdinal == 4) {
            return "android.intent.action.CUBER_SPORT";
        }
        t9f.b();
        return null;
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return false;
        }
        if (iOrdinal == 3) {
            return true;
        }
        if (iOrdinal == 4) {
            return false;
        }
        t9f.b();
        return false;
    }

    public final boolean d() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0) {
            return true;
        }
        if (iOrdinal == 1 || iOrdinal == 2) {
            return false;
        }
        if (iOrdinal == 3) {
            return true;
        }
        if (iOrdinal == 4) {
            return false;
        }
        t9f.b();
        return false;
    }
}
