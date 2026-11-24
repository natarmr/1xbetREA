package a;

import android.util.Range;
import android.util.Size;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class l15 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wln0 f19232a;
    public final int b;
    public final Size c;
    public final agn d;
    public final List e;
    public final drd f;
    public final int g;
    public final Range h;
    public final boolean i;
    public final int j;

    public l15(wln0 wln0Var, int i, Size size, agn agnVar, List list, drd drdVar, int i2, Range range, boolean z, int i3) {
        this.f19232a = wln0Var;
        this.b = i;
        if (size == null) {
            hny.u("Null size");
            throw null;
        }
        this.c = size;
        if (agnVar == null) {
            hny.u("Null dynamicRange");
            throw null;
        }
        this.d = agnVar;
        if (list == null) {
            hny.u("Null captureTypes");
            throw null;
        }
        this.e = list;
        this.f = drdVar;
        this.g = i2;
        if (range == null) {
            hny.u("Null targetFrameRate");
            throw null;
        }
        this.h = range;
        this.i = z;
        this.j = i3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l15)) {
            return false;
        }
        l15 l15Var = (l15) obj;
        if (!this.f19232a.equals(l15Var.f19232a) || this.b != l15Var.b || !this.c.equals(l15Var.c) || !this.d.equals(l15Var.d) || !this.e.equals(l15Var.e)) {
            return false;
        }
        drd drdVar = l15Var.f;
        drd drdVar2 = this.f;
        if (drdVar2 == null) {
            if (drdVar != null) {
                return false;
            }
        } else if (!drdVar2.equals(drdVar)) {
            return false;
        }
        return this.g == l15Var.g && this.h.equals(l15Var.h) && this.i == l15Var.i && this.j == l15Var.j;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.f19232a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003;
        drd drdVar = this.f;
        return this.j ^ ((((((((iHashCode ^ (drdVar == null ? 0 : drdVar.hashCode())) * 1000003) ^ this.g) * 1000003) ^ this.h.hashCode()) * 1000003) ^ (this.i ? 1231 : 1237)) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AttachedSurfaceInfo{surfaceConfig=");
        sb.append(this.f19232a);
        sb.append(", imageFormat=");
        sb.append(this.b);
        sb.append(", size=");
        sb.append(this.c);
        sb.append(", dynamicRange=");
        sb.append(this.d);
        sb.append(", captureTypes=");
        sb.append(this.e);
        sb.append(", implementationOptions=");
        sb.append(this.f);
        sb.append(", sessionType=");
        sb.append(this.g);
        sb.append(", targetFrameRate=");
        sb.append(this.h);
        sb.append(", strictFrameRateRequired=");
        sb.append(this.i);
        sb.append(", customMaxFrameRate=");
        return rz4.j(this.j, "}", sb);
    }
}
