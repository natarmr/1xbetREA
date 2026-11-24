package a;

/* JADX INFO: loaded from: classes2.dex */
public final class sfw extends jjt {
    private static final sfw DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile hq80 PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        sfw sfwVar = new sfw();
        DEFAULT_INSTANCE = sfwVar;
        jjt.u(sfw.class, sfwVar);
    }

    public static rfw A() {
        return (rfw) DEFAULT_INSTANCE.i();
    }

    public static sfw x() {
        return DEFAULT_INSTANCE;
    }

    public final void B(jnv jnvVar) {
        this.hash_ = jnvVar.a();
    }

    public final void C(int i) {
        this.tagSize_ = i;
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
                return new x9e0(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new sfw();
            case 4:
                return new rfw(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                hq80 hq80Var = PARSER;
                if (hq80Var != null) {
                    return hq80Var;
                }
                synchronized (sfw.class) {
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

    public final jnv y() {
        jnv jnvVar;
        int i = this.hash_;
        if (i == 0) {
            jnvVar = jnv.UNKNOWN_HASH;
        } else if (i == 1) {
            jnvVar = jnv.SHA1;
        } else if (i == 2) {
            jnvVar = jnv.SHA384;
        } else if (i == 3) {
            jnvVar = jnv.SHA256;
        } else if (i != 4) {
            jnvVar = i != 5 ? null : jnv.SHA224;
        } else {
            jnvVar = jnv.SHA512;
        }
        return jnvVar == null ? jnv.UNRECOGNIZED : jnvVar;
    }

    public final int z() {
        return this.tagSize_;
    }
}
