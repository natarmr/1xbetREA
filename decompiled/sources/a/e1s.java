package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes5.dex */
public final class e1s implements v1s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dja f7051a;

    public e1s(dja djaVar) {
        this.f7051a = djaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e1s) && this.f7051a == ((e1s) obj).f7051a;
    }

    public final int hashCode() {
        return this.f7051a.hashCode();
    }

    public final String toString() {
        return "BroadcastSelect(infoGameType=" + this.f7051a + Separators.RPAREN;
    }
}
