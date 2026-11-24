package a;

/* JADX INFO: loaded from: classes2.dex */
public final class qcf0 extends jjt {
    public static final int CONFIG_NAME_FIELD_NUMBER = 1;
    private static final qcf0 DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER = 2;
    private static volatile hq80 PARSER;
    private String configName_ = "";
    private zlx entry_ = d5d0.d;

    static {
        qcf0 qcf0Var = new qcf0();
        DEFAULT_INSTANCE = qcf0Var;
        jjt.u(qcf0.class, qcf0Var);
    }

    @Override // a.jjt
    public final Object j(int i) {
        hq80 cjtVar;
        switch (hne.E(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", hly.class});
            case 3:
                return new qcf0();
            case 4:
                return new fbb(DEFAULT_INSTANCE, (byte) 4);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (qcf0.class) {
                    try {
                        cjtVar = PARSER;
                        if (cjtVar == null) {
                            cjtVar = new cjt();
                            PARSER = cjtVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return cjtVar;
            default:
                e9d0.b();
                return null;
        }
    }
}
