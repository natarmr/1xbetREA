package a;

import java.util.List;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.d0c0[], still in use, count: 1, list:
  (r0v1 a.d0c0[]) from 0x005a: CONSTRUCTOR (r0v1 a.d0c0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:91) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class d0c0 {
    /* JADX INFO: Fake field, exist only in values array */
    BASIC(0),
    /* JADX INFO: Fake field, exist only in values array */
    LOCATION(1),
    /* JADX INFO: Fake field, exist only in values array */
    DOCUMENT(2);

    public static final /* synthetic */ c0o c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5261a;

    static {
        c = new c0o(d0c0VarArr);
    }

    public d0c0(int i) {
        super(str, i);
        this.f5261a = list;
    }

    public static d0c0 valueOf(String str) {
        return (d0c0) Enum.valueOf(d0c0.class, str);
    }

    public static d0c0[] values() {
        return (d0c0[]) b.clone();
    }
}
