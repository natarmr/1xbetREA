package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class ojt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25376a;
    public final String b;
    public final boolean c;

    public ojt(String str, String str2, boolean z) {
        this.f25376a = str;
        this.b = str2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ojt)) {
            return false;
        }
        ojt ojtVar = (ojt) obj;
        return this.f25376a.equals(ojtVar.f25376a) && this.b.equals(ojtVar.b) && this.c == ojtVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ua80.b(this.f25376a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return rw2.p(b1j.n("GeneratedModuleInfoEntry(id=", this.f25376a, ", title=", this.b, ", enabled="), this.c, Separators.RPAREN);
    }
}
