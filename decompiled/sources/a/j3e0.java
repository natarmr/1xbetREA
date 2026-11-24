package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class j3e0 implements s3e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15828a;

    public j3e0(String str) {
        this.f15828a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j3e0) && this.f15828a.equals(((j3e0) obj).f15828a);
    }

    public final int hashCode() {
        return this.f15828a.hashCode();
    }

    public final String toString() {
        return kng0.l("DataCell(value=", this.f15828a, Separators.RPAREN);
    }
}
