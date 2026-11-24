package a;

import android.graphics.Rect;
import android.util.Size;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class l45 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f19388a;
    public final int b;
    public final int c;
    public final Rect d;
    public final Size e;
    public final int f;
    public final boolean g;

    public l45(UUID uuid, int i, int i2, Rect rect, Size size, int i3, boolean z) {
        if (uuid == null) {
            hny.u("Null getUuid");
            throw null;
        }
        this.f19388a = uuid;
        this.b = i;
        this.c = i2;
        this.d = rect;
        if (size == null) {
            hny.u("Null getSize");
            throw null;
        }
        this.e = size;
        this.f = i3;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l45)) {
            return false;
        }
        l45 l45Var = (l45) obj;
        return this.f19388a.equals(l45Var.f19388a) && this.b == l45Var.b && this.c == l45Var.c && this.d.equals(l45Var.d) && this.e.equals(l45Var.e) && this.f == l45Var.f && this.g == l45Var.g;
    }

    public final int hashCode() {
        return (((this.g ? 1231 : 1237) ^ ((((((((((((this.f19388a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f) * 1000003)) * 1000003) ^ 1237;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OutConfig{getUuid=");
        sb.append(this.f19388a);
        sb.append(", getTargets=");
        sb.append(this.b);
        sb.append(", getFormat=");
        sb.append(this.c);
        sb.append(", getCropRect=");
        sb.append(this.d);
        sb.append(", getSize=");
        sb.append(this.e);
        sb.append(", getRotationDegrees=");
        sb.append(this.f);
        sb.append(", isMirroring=");
        return rw2.p(sb, this.g, ", shouldRespectInputCropRect=false}");
    }
}
