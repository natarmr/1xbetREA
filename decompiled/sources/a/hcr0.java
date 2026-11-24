package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class hcr0 implements kcr0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kbr0 f12839a;
    public final mdm b;
    public final boolean c;

    public hcr0(kbr0 kbr0Var, mdm mdmVar, boolean z) {
        this.f12839a = kbr0Var;
        this.b = mdmVar;
        this.c = z;
    }

    @Override // a.kcr0
    public final boolean a() {
        return this.c;
    }

    @Override // a.kcr0
    public final kbr0 b() {
        return this.f12839a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hcr0)) {
            return false;
        }
        hcr0 hcr0Var = (hcr0) obj;
        return this.f12839a.equals(hcr0Var.f12839a) && this.b.equals(hcr0Var.b) && this.c == hcr0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + f140.d(this.b, this.f12839a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Error(headerUiState=");
        sb.append(this.f12839a);
        sb.append(", lottieConfig=");
        sb.append(this.b);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.c, Separators.RPAREN);
    }
}
