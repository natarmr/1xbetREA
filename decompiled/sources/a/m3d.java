package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class m3d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21109a;
    public final int b;

    public m3d(int i, int i2) {
        this.f21109a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3d)) {
            return false;
        }
        m3d m3dVar = (m3d) obj;
        return this.f21109a == m3dVar.f21109a && this.b == m3dVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.f21109a) * 31);
    }

    public final String toString() {
        return ohs0.m("CollectionInfo(rowCount=", this.f21109a, ", columnCount=", Separators.RPAREN, this.b);
    }
}
