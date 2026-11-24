package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gfy implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f11227a;
    public final int b;
    public final int c;

    static {
        new gfy(vd40.g.f7073a);
        new gfy(vd40.h.f7073a);
    }

    public gfy(int i, int i2, int i3) {
        this.f11227a = i;
        this.b = i2;
        this.c = i3;
        if (i < 0) {
            jf4.o("Major version should be not less than 0");
            throw null;
        }
        if (i2 < 0) {
            jf4.o("Minor version should be not less than 0");
            throw null;
        }
        if (i3 >= 0) {
            return;
        }
        jf4.o("Patch version should be not less than 0");
        throw null;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(gfy gfyVar) {
        gfyVar.getClass();
        int iE = Intrinsics.e(this.f11227a, gfyVar.f11227a);
        if (iE != 0) {
            return iE;
        }
        int iE2 = Intrinsics.e(this.b, gfyVar.b);
        return iE2 != 0 ? iE2 : Intrinsics.e(this.c, gfyVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!gfy.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        gfy gfyVar = (gfy) obj;
        return this.f11227a == gfyVar.f11227a && this.b == gfyVar.b && this.c == gfyVar.c;
    }

    public final int hashCode() {
        return (((this.f11227a * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11227a);
        sb.append('.');
        sb.append(this.b);
        sb.append('.');
        sb.append(this.c);
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public gfy(int[] iArr) {
        this(iArr[0], iArr[1], iArr[2]);
        iArr.getClass();
    }
}
