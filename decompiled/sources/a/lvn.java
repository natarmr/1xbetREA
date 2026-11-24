package a;

import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.lvn[], still in use, count: 1, list:
  (r0v1 a.lvn[]) from 0x0068: CONSTRUCTOR (r0v1 a.lvn[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:105) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = wvn.class)
public final class lvn implements Serializable {
    NONE("-1"),
    LOST("0"),
    WIN("1"),
    RETURN_FULL("2"),
    RETURN("3"),
    WIN_RETURN_HALF("4"),
    RETURN_HALF("5"),
    RESULT("7");

    public static final kvn Companion = new kvn();
    public static final /* synthetic */ c0o k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f20722a;

    static {
        k = new c0o(new lvn[]{r0, r1, r2, r3, r4, r5, r6, r7});
    }

    public lvn(String str) {
        super(str, i);
        this.f20722a = str;
    }

    public static lvn valueOf(String str) {
        return (lvn) Enum.valueOf(lvn.class, str);
    }

    public static lvn[] values() {
        return (lvn[]) j.clone();
    }
}
