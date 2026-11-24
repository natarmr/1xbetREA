package a;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class etb0 extends mjt {
    private static final etb0 DEFAULT_INSTANCE;
    private static volatile jq80 PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private wo20 preferences_ = wo20.b;

    static {
        etb0 etb0Var = new etb0();
        DEFAULT_INSTANCE = etb0Var;
        mjt.j(etb0.class, etb0Var);
    }

    public static ctb0 n() {
        return (ctb0) ((bjt) DEFAULT_INSTANCE.c(5));
    }

    public static etb0 o(FileInputStream fileInputStream) {
        etb0 etb0Var = DEFAULT_INSTANCE;
        nyc nycVar = new nyc(fileInputStream);
        tso tsoVarA = tso.a();
        mjt mjtVarI = etb0Var.i();
        try {
            c5d0 c5d0Var = c5d0.c;
            c5d0Var.getClass();
            q2h0 q2h0VarA = c5d0Var.a(mjtVarI.getClass());
            hu5 hu5Var = (hu5) nycVar.b;
            if (hu5Var == null) {
                hu5Var = new hu5((oyc) nycVar, (byte) 0);
            }
            q2h0VarA.f(mjtVarI, hu5Var, tsoVarA);
            q2h0VarA.b(mjtVarI);
            if (mjt.f(mjtVarI, true)) {
                return (etb0) mjtVarI;
            }
            throw new box(new w7t0().getMessage());
        } catch (box e) {
            if (e.f2953a) {
                throw new box(e.getMessage(), e);
            }
            throw e;
        } catch (w7t0 e2) {
            throw new box(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof box) {
                throw ((box) e3.getCause());
            }
            throw new box(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof box) {
                throw ((box) e4.getCause());
            }
            throw e4;
        }
    }

    @Override // a.mjt
    public final Object c(int i) {
        jq80 ejtVar;
        switch (hne.E(i)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new z9e0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", dtb0.f6649a});
            case 3:
                return new etb0();
            case 4:
                return new ctb0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                jq80 jq80Var = PARSER;
                if (jq80Var != null) {
                    return jq80Var;
                }
                synchronized (etb0.class) {
                    try {
                        ejtVar = PARSER;
                        if (ejtVar == null) {
                            ejtVar = new ejt();
                            PARSER = ejtVar;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return ejtVar;
            default:
                e9d0.b();
                return null;
        }
    }

    public final Map l() {
        return Collections.unmodifiableMap(this.preferences_);
    }

    public final wo20 m() {
        wo20 wo20Var = this.preferences_;
        if (wo20Var.f39471a) {
            return wo20Var;
        }
        wo20 wo20VarB = wo20Var.b();
        this.preferences_ = wo20VarB;
        return wo20VarB;
    }
}
