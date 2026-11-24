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
/* JADX INFO: loaded from: classes2.dex */
public class eov0 {
    public static final eov0 c;
    public static final eov0 d;
    public static final vnv0 e;
    public static final ynv0 f;
    public static final eov0 g;
    public static final /* synthetic */ eov0[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hov0 f8155a;
    public final byte b;

    /* JADX INFO: Fake field, exist only in values array */
    eov0 EF0;

    /* JADX INFO: Fake field, exist only in values array */
    eov0 EF1;

    /* JADX INFO: Fake field, exist only in values array */
    eov0 EF2;

    static {
        eov0 eov0Var = new eov0("DOUBLE", 0, hov0.DOUBLE, 1);
        eov0 eov0Var2 = new eov0("FLOAT", 1, hov0.FLOAT, 5);
        hov0 hov0Var = hov0.LONG;
        eov0 eov0Var3 = new eov0("INT64", 2, hov0Var, 0);
        eov0 eov0Var4 = new eov0("UINT64", 3, hov0Var, 0);
        hov0 hov0Var2 = hov0.INT;
        eov0 eov0Var5 = new eov0("INT32", 4, hov0Var2, 0);
        c = eov0Var5;
        eov0 eov0Var6 = new eov0("FIXED64", 5, hov0Var, 1);
        eov0 eov0Var7 = new eov0("FIXED32", 6, hov0Var2, 5);
        eov0 eov0Var8 = new eov0("BOOL", 7, hov0.BOOLEAN, 0);
        d = eov0Var8;
        snv0 snv0Var = new snv0("STRING", 8, hov0.STRING, 2);
        hov0 hov0Var3 = hov0.MESSAGE;
        vnv0 vnv0Var = new vnv0("GROUP", 9, hov0Var3, 3);
        e = vnv0Var;
        ynv0 ynv0Var = new ynv0("MESSAGE", 10, hov0Var3, 2);
        f = ynv0Var;
        bov0 bov0Var = new bov0("BYTES", 11, hov0.BYTE_STRING, 2);
        eov0 eov0Var9 = new eov0("UINT32", 12, hov0Var2, 0);
        eov0 eov0Var10 = new eov0("ENUM", 13, hov0.ENUM, 0);
        g = eov0Var10;
        h = new eov0[]{eov0Var, eov0Var2, eov0Var3, eov0Var4, eov0Var5, eov0Var6, eov0Var7, eov0Var8, snv0Var, vnv0Var, ynv0Var, bov0Var, eov0Var9, eov0Var10, new eov0("SFIXED32", 14, hov0Var2, 5), new eov0("SFIXED64", 15, hov0Var, 1), new eov0("SINT32", 16, hov0Var2, 0), new eov0("SINT64", 17, hov0Var, 0)};
    }

    /* JADX WARN: Multi-variable type inference failed */
    public eov0(String str, int i, hov0 hov0Var, int i2) {
        super(str, i);
        this.f8155a = hov0Var;
        this.b = i2;
    }

    public static eov0 valueOf(String str) {
        return (eov0) Enum.valueOf(eov0.class, str);
    }

    public static eov0[] values() {
        return (eov0[]) h.clone();
    }

    public boolean a() {
        return !(this instanceof snv0);
    }
}
