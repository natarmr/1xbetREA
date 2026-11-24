package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class zaj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f44071a;
    public float b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zaj)) {
            return false;
        }
        zaj zajVar = (zaj) obj;
        return this.f44071a == zajVar.f44071a && Float.compare(this.b, zajVar.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Long.hashCode(this.f44071a) * 31);
    }

    public final String toString() {
        return "DataPointAtTime(time=" + this.f44071a + ", dataPoint=" + this.b + Separators.RPAREN;
    }
}
