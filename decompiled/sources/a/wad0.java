package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes3.dex */
public final class wad0 implements pdd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final frj f38820a;

    public wad0(frj frjVar) {
        frjVar.getClass();
        this.f38820a = frjVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wad0) && this.f38820a == ((wad0) obj).f38820a;
    }

    public final int hashCode() {
        return this.f38820a.hashCode();
    }

    public final String toString() {
        return "Favorites(type=" + this.f38820a + Separators.RPAREN;
    }
}
