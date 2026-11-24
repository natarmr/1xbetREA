package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class fn40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9815a;
    public final String b;
    public final boolean c;

    public fn40(String str, String str2, boolean z) {
        this.f9815a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fn40)) {
            return false;
        }
        fn40 fn40Var = (fn40) obj;
        return this.f9815a.equals(fn40Var.f9815a) && this.b.equals(fn40Var.b) && this.c == fn40Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f9815a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("ModuleInfoModel(id=", this.f9815a, ", title=", this.b, ", enabled="), this.c, Separators.RPAREN);
    }
}
