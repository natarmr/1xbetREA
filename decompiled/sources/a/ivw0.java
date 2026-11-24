package a;

/* JADX INFO: loaded from: classes2.dex */
public final class ivw0 extends mew0 {
    private static final ivw0 zzp;
    private static volatile yfw0 zzq;
    private int zzb;
    private String zze;
    private String zzf;
    private String zzg;
    private long zzh;
    private String zzi;
    private String zzj;
    private String zzk;
    private long zzl;
    private ifw0 zzm;
    private ifw0 zzn;
    private String zzo;

    static {
        ivw0 ivw0Var = new ivw0();
        zzp = ivw0Var;
        mew0.m(ivw0.class, ivw0Var);
    }

    public ivw0() {
        ifw0 ifw0Var = ifw0.b;
        this.zzm = ifw0Var;
        this.zzn = ifw0Var;
        this.zze = "";
        this.zzf = "";
        this.zzg = "";
        this.zzi = "";
        this.zzj = "";
        this.zzk = "";
        this.zzo = "";
    }

    public static avw0 W() {
        return (avw0) zzp.h();
    }

    public static ivw0 X() {
        return zzp;
    }

    public final ifw0 A() {
        ifw0 ifw0Var = this.zzm;
        if (ifw0Var.f14707a) {
            return ifw0Var;
        }
        ifw0 ifw0VarA = ifw0Var.a();
        this.zzm = ifw0VarA;
        return ifw0VarA;
    }

    public final ifw0 B() {
        ifw0 ifw0Var = this.zzn;
        if (ifw0Var.f14707a) {
            return ifw0Var;
        }
        ifw0 ifw0VarA = ifw0Var.a();
        this.zzn = ifw0VarA;
        return ifw0VarA;
    }

    public final /* synthetic */ void C(String str) {
        this.zzb |= 256;
        this.zzo = str;
    }

    public final /* synthetic */ void D() {
        this.zzb &= -257;
        this.zzo = zzp.zzo;
    }

    public final boolean E() {
        return (this.zzb & 1) != 0;
    }

    public final String F() {
        return this.zze;
    }

    public final boolean G() {
        return (this.zzb & 2) != 0;
    }

    public final String H() {
        return this.zzf;
    }

    public final boolean I() {
        return (this.zzb & 4) != 0;
    }

    public final String J() {
        return this.zzg;
    }

    public final boolean K() {
        return (this.zzb & 8) != 0;
    }

    public final long L() {
        return this.zzh;
    }

    public final boolean M() {
        return (this.zzb & 16) != 0;
    }

    public final String N() {
        return this.zzi;
    }

    public final boolean O() {
        return (this.zzb & 32) != 0;
    }

    public final String P() {
        return this.zzj;
    }

    public final boolean Q() {
        return (this.zzb & 64) != 0;
    }

    public final String R() {
        return this.zzk;
    }

    public final boolean S() {
        return (this.zzb & 128) != 0;
    }

    public final long T() {
        return this.zzl;
    }

    public final boolean U() {
        return (this.zzb & 256) != 0;
    }

    public final String V() {
        return this.zzo;
    }

    public final /* synthetic */ void Y(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void Z() {
        this.zzb &= -2;
        this.zze = zzp.zze;
    }

    public final /* synthetic */ void a0(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void b0() {
        this.zzb &= -3;
        this.zzf = zzp.zzf;
    }

    public final /* synthetic */ void c0(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzp, "\u0004\u000b\u0000\u0001\u0001\u000b\u000b\u0002\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bဂ\u0007\t2\n2\u000bဈ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", bvw0.f3297a, "zzn", evw0.f8494a, "zzo"});
        }
        if (i2 == 3) {
            return new ivw0();
        }
        if (i2 == 4) {
            return new avw0(zzp);
        }
        if (i2 == 5) {
            return zzp;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzq;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (ivw0.class) {
            try {
                jew0Var = zzq;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzp);
                    zzq = jew0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return jew0Var;
    }

    public final /* synthetic */ void r() {
        this.zzb &= -5;
        this.zzg = zzp.zzg;
    }

    public final /* synthetic */ void s(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void t(String str) {
        this.zzb |= 16;
        this.zzi = str;
    }

    public final /* synthetic */ void u() {
        this.zzb &= -17;
        this.zzi = zzp.zzi;
    }

    public final /* synthetic */ void v(String str) {
        this.zzb |= 32;
        this.zzj = str;
    }

    public final /* synthetic */ void w() {
        this.zzb &= -33;
        this.zzj = zzp.zzj;
    }

    public final /* synthetic */ void x(String str) {
        this.zzb |= 64;
        this.zzk = str;
    }

    public final /* synthetic */ void y() {
        this.zzb &= -65;
        this.zzk = zzp.zzk;
    }

    public final /* synthetic */ void z(long j) {
        this.zzb |= 128;
        this.zzl = j;
    }
}
