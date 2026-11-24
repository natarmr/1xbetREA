package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class ivr implements lvr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15458a;
    public final boolean b;

    public ivr(String str, boolean z) {
        this.f15458a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ivr)) {
            return false;
        }
        ivr ivrVar = (ivr) obj;
        return this.f15458a.equals(ivrVar.f15458a) && this.b == ivrVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f15458a.hashCode() * 31);
    }

    public final String toString() {
        return ua80.j("InfoText(status=", this.f15458a, ", statusVisible=", this.b, Separators.RPAREN);
    }
}
