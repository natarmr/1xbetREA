package a;

import org.xbet.client1.R;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.m4s[], still in use, count: 1, list:
  (r0v1 a.m4s[]) from 0x005a: CONSTRUCTOR (r0v1 a.m4s[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:91) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class m4s {
    ANY("any", R.string.any, new qg40(0, Integer.MAX_VALUE)),
    /* JADX INFO: Fake field, exist only in values array */
    FROM_2_TO_5("from2", R.string.from2, new qg40(2, 5)),
    /* JADX INFO: Fake field, exist only in values array */
    FROM_5_TO_50("from10", R.string.from10, new qg40(5, 50)),
    /* JADX INFO: Fake field, exist only in values array */
    FROM_50_TO_MAX("from100", R.string.from100, new qg40(50, Integer.MAX_VALUE));

    public static final ddk d = new ddk();
    public static final /* synthetic */ c0o g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21187a;
    public final int b;
    public final qg40 c;

    static {
        g = new c0o(new m4s[]{r0, new m4s("from2", R.string.from2, new qg40(2, 5)), new m4s("from10", R.string.from10, new qg40(5, 50)), new m4s("from100", R.string.from100, new qg40(50, Integer.MAX_VALUE))});
    }

    public m4s(String str, int i, qg40 qg40Var) {
        super(str, i);
        this.f21187a = str;
        this.b = i;
        this.c = qg40Var;
    }

    public static m4s valueOf(String str) {
        return (m4s) Enum.valueOf(m4s.class, str);
    }

    public static m4s[] values() {
        return (m4s[]) f.clone();
    }
}
