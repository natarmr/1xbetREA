package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes4.dex */
public final class snh implements unh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0x f32494a;

    public final boolean equals(Object obj) {
        if (obj instanceof snh) {
            return this.f32494a.equals(((snh) obj).f32494a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f32494a.hashCode();
    }

    public final String toString() {
        return "Image(value=" + this.f32494a + Separators.RPAREN;
    }
}
