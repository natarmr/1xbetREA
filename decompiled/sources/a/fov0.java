package a;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:422)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:351)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public class fov0 {
    public static final tnv0 c;
    public static final wnv0 d;
    public static final znv0 e;
    public static final /* synthetic */ fov0[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final iov0 f9903a;
    public final byte b;

    /* JADX INFO: Fake field, exist only in values array */
    fov0 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    fov0 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    fov0 EF2;

    static {
        fov0 fov0Var = new fov0("DOUBLE", 0, iov0.DOUBLE, 1);
        fov0 fov0Var2 = new fov0("FLOAT", 1, iov0.FLOAT, 5);
        iov0 iov0Var = iov0.LONG;
        fov0 fov0Var3 = new fov0("INT64", 2, iov0Var, 0);
        fov0 fov0Var4 = new fov0("UINT64", 3, iov0Var, 0);
        iov0 iov0Var2 = iov0.INT;
        fov0 fov0Var5 = new fov0("INT32", 4, iov0Var2, 0);
        fov0 fov0Var6 = new fov0("FIXED64", 5, iov0Var, 1);
        fov0 fov0Var7 = new fov0("FIXED32", 6, iov0Var2, 5);
        fov0 fov0Var8 = new fov0("BOOL", 7, iov0.BOOLEAN, 0);
        tnv0 tnv0Var = new tnv0("STRING", 8, iov0.STRING, 2);
        c = tnv0Var;
        iov0 iov0Var3 = iov0.MESSAGE;
        wnv0 wnv0Var = new wnv0("GROUP", 9, iov0Var3, 3);
        d = wnv0Var;
        znv0 znv0Var = new znv0("MESSAGE", 10, iov0Var3, 2);
        e = znv0Var;
        f = new fov0[]{fov0Var, fov0Var2, fov0Var3, fov0Var4, fov0Var5, fov0Var6, fov0Var7, fov0Var8, tnv0Var, wnv0Var, znv0Var, new cov0("BYTES", 11, iov0.BYTE_STRING, 2), new fov0("UINT32", 12, iov0Var2, 0), new fov0("ENUM", 13, iov0.ENUM, 0), new fov0("SFIXED32", 14, iov0Var2, 5), new fov0("SFIXED64", 15, iov0Var, 1), new fov0("SINT32", 16, iov0Var2, 0), new fov0("SINT64", 17, iov0Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public fov0(String str, int i, iov0 iov0Var, int i2) {
        super(str, i);
        this.f9903a = iov0Var;
        this.b = i2;
    }

    public static fov0 valueOf(String str) {
        return (fov0) Enum.valueOf(fov0.class, str);
    }

    public static fov0[] values() {
        return (fov0[]) f.clone();
    }
}
