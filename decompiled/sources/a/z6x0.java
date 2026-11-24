package a;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class z6x0 extends mew0 {
    private static final z6x0 zzl;
    private static volatile yfw0 zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private xew0 zzg = bgw0.e;

    static {
        z6x0 z6x0Var = new z6x0();
        zzl = z6x0Var;
        mew0.m(z6x0.class, z6x0Var);
    }

    public static z6x0 t(InputStream inputStream, bew0 bew0Var) throws zew0 {
        z6x0 z6x0Var = zzl;
        tdw0 tdw0VarH = tdw0.h(inputStream, 4096);
        mew0 mew0VarG = z6x0Var.g();
        try {
            egw0 egw0VarA = agw0.c.a(mew0VarG.getClass());
            hu5 hu5Var = (hu5) tdw0VarH.c;
            if (hu5Var == null) {
                hu5Var = new hu5(tdw0VarH);
            }
            egw0VarA.e(mew0VarG, hu5Var, bew0Var);
            egw0VarA.h(mew0VarG);
            mew0.p(mew0VarG);
            return (z6x0) mew0VarG;
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

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", edw0.b, "zzi", "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new z6x0();
        }
        if (i2 == 4) {
            return new nsw0(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzm;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (z6x0.class) {
            try {
                jew0Var = zzm;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzl);
                    zzm = jew0Var;
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

    public final boolean s() {
        return this.zzf;
    }
}
