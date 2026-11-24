package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class wxk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39936a;
    public final String b;
    public final int c;

    public wxk(int i, int i2, String str) {
        this.f39936a = i;
        this.b = str;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wxk)) {
            return false;
        }
        wxk wxkVar = (wxk) obj;
        return this.f39936a == wxkVar.f39936a && this.b.equals(wxkVar.b) && this.c == wxkVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ua80.b(Integer.hashCode(this.f39936a) * 31, 31, this.b);
    }

    public final String toString() {
        return rz4.j(this.c, Separators.RPAREN, vqd.r(this.f39936a, "DocumentModel(id=", ", title=", this.b, ", minAge="));
    }
}
