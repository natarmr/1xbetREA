package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class iqy {
    public static final iqy c = new iqy(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kqy f15233a;
    public final fqy b;

    public iqy(kqy kqyVar, fqy fqyVar) {
        this.f15233a = kqyVar;
        this.b = fqyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iqy)) {
            return false;
        }
        iqy iqyVar = (iqy) obj;
        return this.f15233a == iqyVar.f15233a && Intrinsics.d(this.b, iqyVar.b);
    }

    public final int hashCode() {
        kqy kqyVar = this.f15233a;
        int iHashCode = (kqyVar == null ? 0 : kqyVar.hashCode()) * 31;
        fqy fqyVar = this.b;
        return iHashCode + (fqyVar != null ? fqyVar.hashCode() : 0);
    }

    public final String toString() {
        return "KmTypeProjection(variance=" + this.f15233a + ", type=" + this.b + ')';
    }
}
