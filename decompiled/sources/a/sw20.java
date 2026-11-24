package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 a.sw20[], still in use, count: 1, list:
  (r0v1 a.sw20[]) from 0x0037: CONSTRUCTOR (r0v1 a.sw20[]) A[MD:(java.lang.Enum[]):void (m), WRAPPED] (LINE:56) call: a.c0o.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
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
public final class sw20 {
    SIZE_1(1),
    /* JADX INFO: Fake field, exist only in values array */
    SIZE_2(2),
    SIZE_3(3),
    /* JADX INFO: Fake field, exist only in values array */
    SIZE_4(4),
    SIZE_5(5);

    public static final rw20 b = new rw20();
    public static final /* synthetic */ c0o g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f32901a;

    static {
        g = new c0o(new sw20[]{r0, r1, r2, r3, r4});
    }

    /* JADX WARN: Multi-variable type inference failed */
    public sw20(int i) {
        super(str, i);
        this.f32901a = i;
    }

    public static sw20 valueOf(String str) {
        return (sw20) Enum.valueOf(sw20.class, str);
    }

    public static sw20[] values() {
        return (sw20[]) f.clone();
    }
}
