package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class ezv0 implements hzv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ftr f8690a;

    public ezv0(ftr ftrVar) {
        this.f8690a = ftrVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ezv0) && this.f8690a.equals(((ezv0) obj).f8690a);
    }

    public final int hashCode() {
        return this.f8690a.f10128a.hashCode();
    }

    public final String toString() {
        return "Loaded(collection=" + this.f8690a + Separators.RPAREN;
    }
}
