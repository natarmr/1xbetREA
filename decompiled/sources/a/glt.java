package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes.dex */
public final class glt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11511a;
    public final String b;

    public glt(int i, String str) {
        this.f11511a = i;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glt)) {
            return false;
        }
        glt gltVar = (glt) obj;
        return this.f11511a == gltVar.f11511a && this.b.equals(gltVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.f11511a) * 31);
    }

    public final String toString() {
        return defpackage.c.b(this.f11511a, "GeoRegionCity(id=", ", name=", this.b, Separators.RPAREN);
    }
}
