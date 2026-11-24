package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.zxp[], still in use, count: 1, list:
  (r0v1 a.zxp[]) from 0x003c: CONSTRUCTOR (r0v1 a.zxp[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:61) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class zxp {
    /* JADX INFO: Fake field, exist only in values array */
    ACCURACY_OF_STRIKES(R.string.hits_accuracy, 1L),
    /* JADX INFO: Fake field, exist only in values array */
    SUCCESSFULNESS_OF_TAKEDOWNS(R.string.successfulness_of_takedowns, 2L),
    /* JADX INFO: Fake field, exist only in values array */
    STRIKE_CHART(R.string.shot_map, 3L),
    /* JADX INFO: Fake field, exist only in values array */
    METHODS_OF_VICTORY(R.string.methods_of_victory, 4L);

    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f45171a;
    public final int b;

    static {
        d = new c0o(zxpVarArr);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public zxp(int i, long j) {
        super(str, i);
        this.f45171a = (int) j;
        this.b = i;
    }

    public static zxp valueOf(String str) {
        return (zxp) Enum.valueOf(zxp.class, str);
    }

    public static zxp[] values() {
        return (zxp[]) c.clone();
    }
}
