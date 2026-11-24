package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class eok0 implements hvk0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hjm f8143a;
    public final bqv b;
    public final i9h0 c;
    public final CharSequence d;

    public eok0(hjm hjmVar, bqv bqvVar, i9h0 i9h0Var) {
        this.f8143a = hjmVar;
        this.b = bqvVar;
        this.c = i9h0Var;
        this.d = hjmVar.f13167a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eok0)) {
            return false;
        }
        eok0 eok0Var = (eok0) obj;
        return this.f8143a.equals(eok0Var.f8143a) && this.b == eok0Var.b && this.c == eok0Var.c;
    }

    @Override // a.hvk0
    public final Object getKey() {
        return this.d;
    }

    public final int hashCode() {
        int iHashCode = this.f8143a.hashCode() * 31;
        bqv bqvVar = this.b;
        return this.c.hashCode() + ((iHashCode + (bqvVar == null ? 0 : bqvVar.hashCode())) * 31);
    }

    public final String toString() {
        return "SpecialEventHeaderUiModel(header=" + this.f8143a + ", type=" + this.b + ", screenStyle=" + this.c + Separators.RPAREN;
    }
}
