package a;

/* JADX INFO: loaded from: classes2.dex */
public final class mny extends jjt {
    private static final mny DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile hq80 PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private zlx keyInfo_ = d5d0.d;
    private int primaryKeyId_;

    static {
        mny mnyVar = new mny();
        DEFAULT_INSTANCE = mnyVar;
        jjt.u(mny.class, mnyVar);
    }

    public static jny z() {
        return (jny) DEFAULT_INSTANCE.i();
    }

    public final void A(int i) {
        this.primaryKeyId_ = i;
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", lny.class});
            case 3:
                return new mny();
            case 4:
                return new jny(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (mny.class) {
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

    public final void x(lny lnyVar) {
        zlx zlxVarN = this.keyInfo_;
        if (!((m4) zlxVarN).f21141a) {
            int size = zlxVarN.size();
            zlxVarN = zlxVarN.n(size == 0 ? 10 : size * 2);
            this.keyInfo_ = zlxVarN;
        }
        zlxVarN.add(lnyVar);
    }

    public final lny y() {
        return (lny) this.keyInfo_.get(0);
    }
}
