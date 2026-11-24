package a;

import java.io.Serializable;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.uk10[], still in use, count: 1, list:
  (r0v1 a.uk10[]) from 0x005c: CONSTRUCTOR (r0v1 a.uk10[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:93) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = vk10.class)
public final class uk10 implements Serializable {
    NOTHING("0"),
    DOUBLE_BONUS("1"),
    RETURN_HALF("2"),
    FREE_BET("3"),
    FREE_SPIN("4"),
    WILD_FREE_BET("5"),
    SPECIAL_BONUS("666");

    public static final tk10 Companion = new tk10();
    public static final /* synthetic */ c0o j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35805a;

    static {
        j = new c0o(new uk10[]{r0, r1, r2, r3, r4, r5, r6});
    }

    public uk10(String str) {
        super(str, i);
        this.f35805a = str;
    }

    public static uk10 valueOf(String str) {
        return (uk10) Enum.valueOf(uk10.class, str);
    }

    public static uk10[] values() {
        return (uk10[]) i.clone();
    }
}
