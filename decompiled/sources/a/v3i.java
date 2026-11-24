package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class v3i extends u3i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f2i f36733a;

    public v3i(f2i f2iVar) {
        this.f36733a = f2iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3i) && this.f36733a.equals(((v3i) obj).f36733a);
    }

    public final int hashCode() {
        return this.f36733a.hashCode();
    }

    public final String toString() {
        return "Available(model=" + this.f36733a + Separators.RPAREN;
    }
}
