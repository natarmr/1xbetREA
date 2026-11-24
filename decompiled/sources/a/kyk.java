package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.kyk[], still in use, count: 1, list:
  (r0v1 a.kyk[]) from 0x003d: CONSTRUCTOR (r0v1 a.kyk[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:62) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
/* JADX INFO: loaded from: classes6.dex */
public final class kyk {
    /* JADX INFO: Fake field, exist only in values array */
    EF11(R.color.static_green, "LOADED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF25(R.color.static_red, "REJECTED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF39(R.color.static_dark_orange, "NOT_LOADED"),
    /* JADX INFO: Fake field, exist only in values array */
    EF50(R.color.static_dark_orange, "CHECKING");

    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19108a;
    public final int b;

    static {
        d = new c0o(kykVarArr);
    }

    public kyk(int i, String str) {
        super(str, i);
        this.f19108a = i;
        this.b = i;
    }

    public static kyk valueOf(String str) {
        return (kyk) Enum.valueOf(kyk.class, str);
    }

    public static kyk[] values() {
        return (kyk[]) c.clone();
    }
}
