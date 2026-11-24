package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class ofh0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25170a;
    public final hjm b;
    public final boolean c;
    public final boolean d;

    public ofh0(String str, hjm hjmVar, boolean z, boolean z2) {
        this.f25170a = str;
        this.b = hjmVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ofh0)) {
            return false;
        }
        ofh0 ofh0Var = (ofh0) obj;
        return this.f25170a.equals(ofh0Var.f25170a) && this.b.equals(ofh0Var.b) && this.c == ofh0Var.c && this.d == ofh0Var.d;
    }

    @Override // a.p6t0
    public final String getKey() {
        return this.f25170a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + brm0.e(hne.e(this.b, this.f25170a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchEventsHeaderUiModel(key=");
        sb.append(this.f25170a);
        sb.append(", model=");
        sb.append(this.b);
        sb.append(", live=");
        return ohs0.p(", visibleMoreButton=", Separators.RPAREN, sb, this.c, this.d);
    }
}
