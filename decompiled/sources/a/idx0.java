package a;

import java.io.ByteArrayInputStream;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class idx0 extends jkw0 {
    private static final idx0 zzc;
    private static volatile alw0 zzd;
    private int zze;
    private sjw0 zzf = sjw0.b;
    private sfx0 zzg;

    static {
        idx0 idx0Var = new idx0();
        zzc = idx0Var;
        jkw0.l(idx0.class, idx0Var);
    }

    public static idx0 t(ByteArrayInputStream byteArrayInputStream, dkw0 dkw0Var) throws qkw0 {
        jkw0 jkw0VarD = jkw0.d(zzc, new xjw0(byteArrayInputStream), dkw0Var);
        jkw0.m(jkw0VarD);
        return (idx0) jkw0VarD;
    }

    public static /* synthetic */ void u(idx0 idx0Var, vjw0 vjw0Var) {
        Objects.requireNonNull(vjw0Var);
        idx0Var.zzf = vjw0Var;
    }

    public static /* synthetic */ void v(idx0 idx0Var, sfx0 sfx0Var) {
        idx0Var.zzg = sfx0Var;
        idx0Var.zze |= 1;
    }

    public static hdx0 w() {
        return (hdx0) zzc.o();
    }

    @Override // a.jkw0
    public final Object h(int i) {
        alw0 ikw0Var;
        switch (gdx0.f11124a[i - 1]) {
            case 1:
                return new idx0();
            case 2:
                return new hdx0(zzc);
            case 3:
                return new elw0(zzc, "\u0000\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003ဉ\u0000", new Object[]{"zze", "zzf", "zzg"});
            case 4:
                return zzc;
            case 5:
                alw0 alw0Var = zzd;
                if (alw0Var != null) {
                    return alw0Var;
                }
                synchronized (idx0.class) {
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

    public final sjw0 x() {
        return this.zzf;
    }
}
