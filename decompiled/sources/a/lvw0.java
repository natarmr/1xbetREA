package a;

/* JADX INFO: loaded from: classes2.dex */
public final class lvw0 extends mew0 {
    private static final lvw0 zzl;
    private static volatile yfw0 zzm;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        lvw0 lvw0Var = new lvw0();
        zzl = lvw0Var;
        mew0.m(lvw0.class, lvw0Var);
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new lvw0();
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
        synchronized (lvw0.class) {
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
}
