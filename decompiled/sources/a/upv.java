package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.upv[], still in use, count: 1, list:
  (r0v1 a.upv[]) from 0x002f: CONSTRUCTOR (r0v1 a.upv[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:48) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class upv {
    /* JADX INFO: Fake field, exist only in values array */
    HEAD_TO_HEAD(R.string.head_2_head_meeting, 1L),
    /* JADX INFO: Fake field, exist only in values array */
    FIRST_OPPONENT(R.string.first_opponent, 2L),
    /* JADX INFO: Fake field, exist only in values array */
    SECOND_OPPONENT(R.string.second_opponent, 3L);

    public static final /* synthetic */ c0o d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f36086a;
    public final int b;

    static {
        d = new c0o(upvVarArr);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    public upv(int i, long j) {
        super(str, i);
        this.f36086a = (int) j;
        this.b = i;
    }

    public static upv valueOf(String str) {
        return (upv) Enum.valueOf(upv.class, str);
    }

    public static upv[] values() {
        return (upv[]) c.clone();
    }
}
