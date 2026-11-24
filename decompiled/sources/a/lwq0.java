package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class lwq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w3t f20777a;

    public lwq0(w3t w3tVar) {
        this.f20777a = w3tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lwq0) && this.f20777a.equals(((lwq0) obj).f20777a);
    }

    public final int hashCode() {
        return this.f20777a.hashCode();
    }

    public final String toString() {
        return "ToolbarMapperState(sourceScreen=" + this.f20777a + Separators.RPAREN;
    }
}
