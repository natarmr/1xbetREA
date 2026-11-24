package a;

/* JADX INFO: loaded from: classes2.dex */
public final class vsw0 extends mew0 {
    private static final vsw0 zzi;
    private static volatile yfw0 zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private xew0 zzh = bgw0.e;

    static {
        vsw0 vsw0Var = new vsw0();
        zzi = vsw0Var;
        mew0.m(vsw0.class, vsw0Var);
    }

    public static vsw0 y() {
        return zzi;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", edw0.d, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new vsw0();
        }
        if (i2 == 4) {
            return new nsw0(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzj;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (vsw0.class) {
            try {
                jew0Var = zzj;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzi);
                    zzj = jew0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jew0Var;
    }

    public final boolean r() {
        return (this.zzb & 1) != 0;
    }

    public final boolean s() {
        return (this.zzb & 2) != 0;
    }

    public final String t() {
        return this.zzf;
    }

    public final boolean u() {
        return (this.zzb & 4) != 0;
    }

    public final boolean v() {
        return this.zzg;
    }

    public final xew0 w() {
        return this.zzh;
    }

    public final int x() {
        return this.zzh.size();
    }

    public final int z() {
        int i;
        switch (this.zze) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
