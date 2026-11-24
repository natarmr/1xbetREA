package a;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes.dex */
public final class gtb0 extends mjt {
    private static final gtb0 DEFAULT_INSTANCE;
    private static volatile jq80 PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private bmx strings_ = f5d0.d;

    static {
        gtb0 gtb0Var = new gtb0();
        DEFAULT_INSTANCE = gtb0Var;
        mjt.j(gtb0.class, gtb0Var);
    }

    public static gtb0 m() {
        return DEFAULT_INSTANCE;
    }

    public static ftb0 o() {
        return (ftb0) ((bjt) DEFAULT_INSTANCE.c(5));
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
                return new z9e0(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 3:
                return new gtb0();
            case 4:
                return new ftb0(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                jq80 jq80Var = PARSER;
                if (jq80Var != null) {
                    return jq80Var;
                }
                synchronized (gtb0.class) {
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

    public final void l(Iterable iterable) {
        bmx bmxVarE = this.strings_;
        if (!((f5d0) bmxVarE).f8958a) {
            f5d0 f5d0Var = (f5d0) bmxVarE;
            int i = f5d0Var.c;
            bmxVarE = f5d0Var.e(i == 0 ? 10 : i * 2);
            this.strings_ = bmxVarE;
        }
        Charset charset = fmx.f9806a;
        if (iterable instanceof uez) {
            ((uez) iterable).a();
            hny.b();
            return;
        }
        if (iterable instanceof bwb0) {
            ((f5d0) bmxVarE).addAll((Collection) iterable);
            return;
        }
        if ((bmxVarE instanceof ArrayList) && (iterable instanceof Collection)) {
            ((ArrayList) bmxVarE).ensureCapacity(((Collection) iterable).size() + ((f5d0) bmxVarE).c);
        }
        f5d0 f5d0Var2 = (f5d0) bmxVarE;
        int i2 = f5d0Var2.c;
        for (Object obj : iterable) {
            if (obj == null) {
                String str = "Element at index " + (f5d0Var2.c - i2) + " is null.";
                for (int i3 = f5d0Var2.c - 1; i3 >= i2; i3--) {
                    f5d0Var2.remove(i3);
                }
                hny.u(str);
                return;
            }
            f5d0Var2.add(obj);
        }
    }

    public final bmx n() {
        return this.strings_;
    }
}
