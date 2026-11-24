package a;

/* JADX WARN: Enum visitor error
java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.nodes.MethodNode.getBasicBlocks()" is null
	at jadx.core.dex.visitors.EnumVisitor.searchEnumSuperCtrInsn(EnumVisitor.java:495)
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:473)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:370)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:160)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes3.dex */
public abstract class fzs0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bzs0 f10425a;
    public static final /* synthetic */ fzs0[] b;
    public static final /* synthetic */ c0o c;

    /* JADX INFO: Fake field, exist only in values array */
    fzs0 EF2;

    static {
        fzs0[] fzs0VarArr = {new fzs0() { // from class: a.czs0
        }, new fzs0() { // from class: a.ezs0
            @Override // a.fzs0
            public final int a() {
                return 2;
            }

            @Override // a.fzs0
            public final int b() {
                return 72;
            }
        }, new fzs0() { // from class: a.dzs0
            @Override // a.fzs0
            public final int a() {
                return 3;
            }

            @Override // a.fzs0
            public final int b() {
                return 120;
            }
        }};
        b = fzs0VarArr;
        c = new c0o(fzs0VarArr);
        f10425a = new bzs0((byte) 0);
    }

    public static fzs0 valueOf(String str) {
        return (fzs0) Enum.valueOf(fzs0.class, str);
    }

    public static fzs0[] values() {
        return (fzs0[]) b.clone();
    }

    public int a() {
        return 1;
    }

    public int b() {
        return 24;
    }
}
