package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vzf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f38295a;
    public final boolean b;

    public vzf(zzf zzfVar) {
        zzfVar.getClass();
        Long l = zzfVar.f45251a;
        long jLongValue = l != null ? l.longValue() : 0L;
        Boolean bool = zzfVar.b;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : false;
        this.f38295a = jLongValue;
        this.b = zBooleanValue;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vzf)) {
            return false;
        }
        vzf vzfVar = (vzf) obj;
        return this.f38295a == vzfVar.f38295a && this.b == vzfVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Long.hashCode(this.f38295a) * 31);
    }

    public final String toString() {
        StringBuilder sbR = kng0.r(this.f38295a, "CutCurrency(currencyId=", ", top=", this.b);
        sbR.append(Separators.RPAREN);
        return sbR.toString();
    }
}
