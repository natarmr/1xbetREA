package a;

/* JADX INFO: loaded from: classes2.dex */
public final class vqy extends jjt {
    private static final vqy DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile hq80 PARSER;
    private bly dekTemplate_;
    private String kekUri_ = "";

    static {
        vqy vqyVar = new vqy();
        DEFAULT_INSTANCE = vqyVar;
        jjt.u(vqy.class, vqyVar);
    }

    public static vqy B(og9 og9Var, qso qsoVar) {
        return (vqy) jjt.s(DEFAULT_INSTANCE, og9Var, qsoVar);
    }

    public static vqy x() {
        return DEFAULT_INSTANCE;
    }

    public final boolean A() {
        return this.dekTemplate_ != null;
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new vqy();
            case 4:
                return new fbb(DEFAULT_INSTANCE, (byte) 3);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (vqy.class) {
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

    public final bly y() {
        bly blyVar = this.dekTemplate_;
        return blyVar == null ? bly.x() : blyVar;
    }

    public final String z() {
        return this.kekUri_;
    }
}
