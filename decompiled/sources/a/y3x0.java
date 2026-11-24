package a;

/* JADX INFO: loaded from: classes2.dex */
public final class y3x0 extends mew0 {
    private static final y3x0 zzo;
    private static volatile yfw0 zzp;
    private int zzb;
    private boolean zzf;
    private xew0 zzh;
    private xew0 zzi;
    private sew0 zzj;
    private b4x0 zzk;
    private boolean zzl;
    private boolean zzm;
    private s3x0 zzn;
    private qdw0 zze = qdw0.b;
    private String zzg = "";

    static {
        y3x0 y3x0Var = new y3x0();
        zzo = y3x0Var;
        mew0.m(y3x0.class, y3x0Var);
    }

    public y3x0() {
        bgw0 bgw0Var = bgw0.e;
        this.zzh = bgw0Var;
        this.zzi = bgw0Var;
        this.zzj = oew0.e;
    }

    public static y3x0 r() {
        return zzo;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", edw0.b, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new y3x0();
        }
        if (i2 == 4) {
            return new nsw0(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzp;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (y3x0.class) {
            try {
                jew0Var = zzp;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzo);
                    zzp = jew0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jew0Var;
    }
}
