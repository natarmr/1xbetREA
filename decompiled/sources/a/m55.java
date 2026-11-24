package a;

import android.util.Size;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class m55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f21204a;
    public final LinkedHashMap b;
    public final Size c;
    public final LinkedHashMap d;
    public final Size e;
    public final LinkedHashMap f;
    public final LinkedHashMap g;
    public final LinkedHashMap h;
    public final LinkedHashMap i;

    public m55(Size size, LinkedHashMap linkedHashMap, Size size2, LinkedHashMap linkedHashMap2, Size size3, LinkedHashMap linkedHashMap3, LinkedHashMap linkedHashMap4, LinkedHashMap linkedHashMap5, LinkedHashMap linkedHashMap6) {
        if (size == null) {
            hny.u("Null analysisSize");
            throw null;
        }
        this.f21204a = size;
        this.b = linkedHashMap;
        if (size2 == null) {
            hny.u("Null previewSize");
            throw null;
        }
        this.c = size2;
        this.d = linkedHashMap2;
        this.e = size3;
        this.f = linkedHashMap3;
        this.g = linkedHashMap4;
        this.h = linkedHashMap5;
        this.i = linkedHashMap6;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m55)) {
            return false;
        }
        m55 m55Var = (m55) obj;
        return this.f21204a.equals(m55Var.f21204a) && this.b.equals(m55Var.b) && this.c.equals(m55Var.c) && this.d.equals(m55Var.d) && this.e.equals(m55Var.e) && this.f.equals(m55Var.f) && this.g.equals(m55Var.g) && this.h.equals(m55Var.h) && this.i.equals(m55Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() ^ ((((((((((((((((this.f21204a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode()) * 1000003) ^ this.h.hashCode()) * 1000003);
    }

    public final String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f21204a + ", s720pSizeMap=" + this.b + ", previewSize=" + this.c + ", s1440pSizeMap=" + this.d + ", recordSize=" + this.e + ", maximumSizeMap=" + this.f + ", maximum4x3SizeMap=" + this.g + ", maximum16x9SizeMap=" + this.h + ", ultraMaximumSizeMap=" + this.i + "}";
    }
}
