package a;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class a3x0 extends mew0 {
    private static final a3x0 zzj;
    private static volatile yfw0 zzk;
    private int zzb;
    private long zzh;
    private ifw0 zzi = ifw0.b;
    private String zze = "";
    private qdw0 zzf = qdw0.b;
    private String zzg = "";

    static {
        a3x0 a3x0Var = new a3x0();
        zzj = a3x0Var;
        mew0.m(a3x0.class, a3x0Var);
    }

    public static a3x0 x(tdw0 tdw0Var, bew0 bew0Var) throws zew0 {
        mew0 mew0VarG = zzj.g();
        try {
            egw0 egw0VarA = agw0.c.a(mew0VarG.getClass());
            hu5 hu5Var = (hu5) tdw0Var.c;
            if (hu5Var == null) {
                hu5Var = new hu5(tdw0Var);
            }
            egw0VarA.e(mew0VarG, hu5Var, bew0Var);
            egw0VarA.h(mew0VarG);
            mew0.p(mew0VarG);
            return (a3x0) mew0VarG;
        } catch (igw0 e) {
            throw e.a();
        } catch (zew0 e2) {
            if (e2.f44274a) {
                throw new zew0(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zew0) {
                throw ((zew0) e3.getCause());
            }
            throw new zew0(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zew0) {
                throw ((zew0) e4.getCause());
            }
            throw e4;
        }
    }

    public static a3x0 y() {
        return zzj;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", z2x0.f43693a});
        }
        if (i2 == 3) {
            return new a3x0();
        }
        if (i2 == 4) {
            return new nsw0(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzk;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (a3x0.class) {
            try {
                jew0Var = zzk;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzj);
                    zzk = jew0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jew0Var;
    }

    public final String r() {
        return this.zze;
    }

    public final qdw0 s() {
        return this.zzf;
    }

    public final String t() {
        return this.zzg;
    }

    public final long u() {
        return this.zzh;
    }

    public final int v() {
        return this.zzi.size();
    }

    public final Map w() {
        return Collections.unmodifiableMap(this.zzi);
    }
}
