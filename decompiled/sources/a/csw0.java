package a;

/* JADX INFO: loaded from: classes2.dex */
public final class csw0 extends mew0 {
    private static final csw0 zzi;
    private static volatile yfw0 zzj;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private String zze = "";
    private String zzg = "";

    static {
        csw0 csw0Var = new csw0();
        zzi = csw0Var;
        mew0.m(csw0.class, csw0Var);
    }

    public static asw0 r() {
        return (asw0) zzi.h();
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new csw0();
        }
        if (i2 == 4) {
            return new asw0(zzi);
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
        synchronized (csw0.class) {
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

    public final /* synthetic */ void s(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void t() {
        this.zzb |= 2;
        this.zzf = true;
    }

    public final /* synthetic */ void u(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void v(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }
}
