package a;

import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.rvn[], still in use, count: 1, list:
  (r0v1 a.rvn[]) from 0x0050: CONSTRUCTOR (r0v1 a.rvn[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:81) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = uvn.class)
public final class rvn implements Serializable {
    NONE("-1"),
    /* JADX INFO: Fake field, exist only in values array */
    LOST("0"),
    /* JADX INFO: Fake field, exist only in values array */
    WIN("1"),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_FULL("2"),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN("3"),
    /* JADX INFO: Fake field, exist only in values array */
    WIN_RETURN_HALF("4"),
    /* JADX INFO: Fake field, exist only in values array */
    RETURN_HALF("5");

    public static final ovn Companion = new ovn();
    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31178a;

    static {
        d = new c0o(new rvn[]{r0, new rvn("0"), new rvn("1"), new rvn("2"), new rvn("3"), new rvn("4"), new rvn("5")});
    }

    public rvn(String str) {
        super(str, i);
        this.f31178a = str;
    }

    public static rvn valueOf(String str) {
        return (rvn) Enum.valueOf(rvn.class, str);
    }

    public static rvn[] values() {
        return (rvn[]) c.clone();
    }
}
