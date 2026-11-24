package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class f7k0 {
    public static final f7k0 c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final umk f9062a;
    public final umk b;

    static {
        smk smkVar = smk.f32450a;
        c = new f7k0(smkVar, smkVar);
    }

    public f7k0(umk umkVar, umk umkVar2) {
        this.f9062a = umkVar;
        this.b = umkVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f7k0)) {
            return false;
        }
        f7k0 f7k0Var = (f7k0) obj;
        return this.f9062a.equals(f7k0Var.f9062a) && this.b.equals(f7k0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f9062a.hashCode() * 31);
    }

    public final String toString() {
        return "Size(width=" + this.f9062a + ", height=" + this.b + Separators.RPAREN;
    }
}
