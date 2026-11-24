package a;

import android.gov.nist.core.Separators;

/* JADX INFO: loaded from: classes6.dex */
public final class sly {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f32421a;
    public final float b;
    public final float c;

    public sly(float f, float f2, boolean z) {
        this.f32421a = z;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sly)) {
            return false;
        }
        sly slyVar = (sly) obj;
        return this.f32421a == slyVar.f32421a && Float.compare(this.b, slyVar.b) == 0 && Float.compare(this.c, slyVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + defpackage.c.a(Boolean.hashCode(this.f32421a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyboardLiftState(isVisible=");
        sb.append(this.f32421a);
        sb.append(", heightPx=");
        sb.append(this.b);
        sb.append(", targetHeightPx=");
        return kng0.o(sb, this.c, Separators.RPAREN);
    }
}
