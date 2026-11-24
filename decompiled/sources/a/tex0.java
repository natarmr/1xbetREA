package a;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class tex0 extends jkw0 {
    private static final tex0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private int zzf;
    private jex0 zzg;
    private sjw0 zzh = sjw0.b;

    static {
        tex0 tex0Var = new tex0();
        zzc = tex0Var;
        jkw0.l(tex0.class, tex0Var);
    }

    public static sex0 A() {
        return (sex0) zzc.o();
    }

    public static tex0 B() {
        return zzc;
    }

    public static alw0 t() {
        return (alw0) zzc.h(7);
    }

    public static tex0 v(sjw0 sjw0Var, dkw0 dkw0Var) {
        return (tex0) jkw0.e(zzc, sjw0Var, dkw0Var);
    }

    public static /* synthetic */ void x(tex0 tex0Var, vjw0 vjw0Var) {
        Objects.requireNonNull(vjw0Var);
        tex0Var.zzh = vjw0Var;
    }

    public static /* synthetic */ void y(tex0 tex0Var, jex0 jex0Var) {
        tex0Var.zzg = jex0Var;
        tex0Var.zze |= 1;
    }

    public final sjw0 C() {
        return this.zzh;
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (rex0.f30359a[i - 1]) {
            case 1:
                return new tex0();
            case 2:
                return new sex0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"zze", "zzf", "zzg", "zzh"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (tex0.class) {
                    try {
                        ikw0Var = zzd;
                        if (ikw0Var == null) {
                            ikw0Var = new ikw0();
                            zzd = ikw0Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return ikw0Var;
            case 6:
                return (byte) 1;
            default:
                throw null;
        }
    }

    public final int u() {
        return this.zzf;
    }

    public final jex0 z() {
        jex0 jex0Var = this.zzg;
        return jex0Var == null ? jex0.A() : jex0Var;
    }
}
