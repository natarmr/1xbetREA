package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class cf0 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bkl f4236a;

    public cf0(bkl bklVar) {
        this.f4236a = bklVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cf0) && this.f4236a.equals(((cf0) obj).f4236a);
    }

    public final int hashCode() {
        return this.f4236a.hashCode();
    }

    public final String toString() {
        return "OnPartitionClick(model=" + this.f4236a + Separators.RPAREN;
    }
}
