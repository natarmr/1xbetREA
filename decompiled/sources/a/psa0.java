package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class psa0 extends qsa0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final imm f27507a;
    public final ltr b;
    public final String c;
    public final mdm d;

    public psa0(imm immVar, ltr ltrVar, String str, mdm mdmVar) {
        this.f27507a = immVar;
        this.b = ltrVar;
        this.c = str;
        this.d = mdmVar;
    }

    @Override // a.qsa0
    public final ltr a() {
        return this.b;
    }

    @Override // a.qsa0
    public final String b() {
        return this.c;
    }

    @Override // a.qsa0
    public final imm c() {
        return this.f27507a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof psa0)) {
            return false;
        }
        psa0 psa0Var = (psa0) obj;
        return this.f27507a.equals(psa0Var.f27507a) && this.b.equals(psa0Var.b) && this.c.equals(psa0Var.c) && this.d.equals(psa0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b((this.b.hashCode() + (this.f27507a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "Error(navigationBarUiModel=" + this.f27507a + ", gameCardEvent=" + this.b + ", headerBackgroundImageUrl=" + this.c + ", errorConfig=" + this.d + Separators.RPAREN;
    }
}
