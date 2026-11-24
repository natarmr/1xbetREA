package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class vqk0 implements ork0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bqv f37859a;

    public vqk0(bqv bqvVar) {
        bqvVar.getClass();
        this.f37859a = bqvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vqk0) && this.f37859a == ((vqk0) obj).f37859a;
    }

    public final int hashCode() {
        return this.f37859a.hashCode();
    }

    public final String toString() {
        return "OnHeaderBtnClick(contentType=" + this.f37859a + Separators.RPAREN;
    }
}
