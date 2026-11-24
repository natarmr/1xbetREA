package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.bpf0[], still in use, count: 1, list:
  (r0v1 a.bpf0[]) from 0x0026: CONSTRUCTOR (r0v1 a.bpf0[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:39) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
@ahi0(with = cpf0.class)
public final class bpf0 {
    /* JADX INFO: Fake field, exist only in values array */
    SAFES("1"),
    /* JADX INFO: Fake field, exist only in values array */
    DOORS("2"),
    /* JADX INFO: Fake field, exist only in values array */
    FINISHED("3");

    public static final apf0 Companion = new apf0();
    public static final /* synthetic */ c0o c = new c0o(new bpf0[]{new bpf0("1"), new bpf0("2"), new bpf0("3")});

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2980a;

    static {
    }

    public bpf0(String str) {
        super(str, i);
        this.f2980a = str;
    }

    public static bpf0 valueOf(String str) {
        return (bpf0) Enum.valueOf(bpf0.class, str);
    }

    public static bpf0[] values() {
        return (bpf0[]) b.clone();
    }
}
