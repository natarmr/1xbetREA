package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class yjf implements nkf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ox f42736a;
    public final int b;

    public yjf(ox oxVar, int i) {
        this.f42736a = oxVar;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yjf)) {
            return false;
        }
        yjf yjfVar = (yjf) obj;
        return this.f42736a.equals(yjfVar.f42736a) && this.b == yjfVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.f42736a.hashCode() * 31);
    }

    public final String toString() {
        return "OnAdditionalInfoClick(action=" + this.f42736a + ", screenWidth=" + this.b + Separators.RPAREN;
    }
}
