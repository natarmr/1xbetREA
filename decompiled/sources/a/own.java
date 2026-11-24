package a;

import java.io.ByteArrayInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class own extends jjt {
    private static final own DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile hq80 PARSER;
    private og9 encryptedKeyset_ = og9.b;
    private mny keysetInfo_;

    static {
        own ownVar = new own();
        DEFAULT_INSTANCE = ownVar;
        jjt.u(own.class, ownVar);
    }

    public static nwn y() {
        return (nwn) DEFAULT_INSTANCE.i();
    }

    public static own z(ByteArrayInputStream byteArrayInputStream, qso qsoVar) throws ynx {
        jjt jjtVarT = jjt.t(DEFAULT_INSTANCE, new myc(byteArrayInputStream), qsoVar);
        jjt.h(jjtVarT);
        return (own) jjtVarT;
    }

    public final void A(kg9 kg9Var) {
        this.encryptedKeyset_ = kg9Var;
    }

    public final void B(mny mnyVar) {
        this.keysetInfo_ = mnyVar;
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new own();
            case 4:
                return new nwn(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (own.class) {
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

    public final og9 x() {
        return this.encryptedKeyset_;
    }
}
