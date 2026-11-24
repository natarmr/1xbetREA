package a;

import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class w3x0 extends mew0 {
    private static final tew0 zzl = new cpw0((byte) 29);
    private static final w3x0 zzq;
    private static volatile yfw0 zzr;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private xew0 zzi;
    private xew0 zzj;
    private sew0 zzk;
    private b4x0 zzm;
    private boolean zzn;
    private boolean zzo;
    private s3x0 zzp;
    private qdw0 zze = qdw0.b;
    private String zzg = "";

    static {
        w3x0 w3x0Var = new w3x0();
        zzq = w3x0Var;
        mew0.m(w3x0.class, w3x0Var);
    }

    public w3x0() {
        bgw0 bgw0Var = bgw0.e;
        this.zzi = bgw0Var;
        this.zzj = bgw0Var;
        this.zzk = oew0.e;
    }

    public static u3x0 E() {
        return (u3x0) zzq.h();
    }

    public static w3x0 F() {
        return zzq;
    }

    public final b4x0 A() {
        b4x0 b4x0Var = this.zzm;
        return b4x0Var == null ? b4x0.t() : b4x0Var;
    }

    public final boolean B() {
        return this.zzn;
    }

    public final boolean C() {
        return this.zzo;
    }

    public final s3x0 D() {
        s3x0 s3x0Var = this.zzp;
        return s3x0Var == null ? s3x0.s() : s3x0Var;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    @Override // a.mew0
    public final Object q(int i) {
        yfw0 jew0Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new cgw0(zzq, "\u0004\u000b\u0000\u0001\u0001\f\u000b\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001a\u0006\u001a\u0007ࠬ\bဉ\u0004\nဇ\u0005\u000bဇ\u0006\fဉ\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", edw0.b, "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new w3x0();
        }
        if (i2 == 4) {
            return new u3x0(zzq);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        yfw0 yfw0Var = zzr;
        if (yfw0Var != null) {
            return yfw0Var;
        }
        synchronized (w3x0.class) {
            try {
                jew0Var = zzr;
                if (jew0Var == null) {
                    jew0Var = new jew0(zzq);
                    zzr = jew0Var;
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

    public final qdw0 s() {
        return this.zze;
    }

    public final boolean t() {
        return this.zzf;
    }

    public final String u() {
        return this.zzg;
    }

    public final long v() {
        return this.zzh;
    }

    public final xew0 w() {
        return this.zzi;
    }

    public final xew0 x() {
        return this.zzj;
    }

    public final List y() {
        return new uew0(this.zzk, zzl);
    }

    public final boolean z() {
        return (this.zzb & 16) != 0;
    }
}
