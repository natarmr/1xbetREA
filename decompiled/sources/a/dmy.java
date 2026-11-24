package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class dmy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f6340a;
    public final Object b;
    public final ghn c;

    public dmy(float f, Object obj, ghn ghnVar) {
        this.f6340a = f;
        this.b = obj;
        this.c = ghnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmy)) {
            return false;
        }
        dmy dmyVar = (dmy) obj;
        return Float.compare(this.f6340a, dmyVar.f6340a) == 0 && Intrinsics.d(this.b, dmyVar.b) && Intrinsics.d(this.c, dmyVar.c);
    }

    public final int hashCode() {
        int iHashCode = Float.hashCode(this.f6340a) * 31;
        Object obj = this.b;
        return this.c.hashCode() + ((iHashCode + (obj == null ? 0 : obj.hashCode())) * 31);
    }

    public final String toString() {
        return "Keyframe(fraction=" + this.f6340a + ", value=" + this.b + ", interpolator=" + this.c + Separators.RPAREN;
    }
}
