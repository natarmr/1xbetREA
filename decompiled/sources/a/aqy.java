package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class aqy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fqy f1318a;
    public String b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aqy)) {
            return false;
        }
        aqy aqyVar = (aqy) obj;
        return this.f1318a.equals(aqyVar.f1318a) && Intrinsics.d(this.b, aqyVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.f1318a.hashCode() * 31;
        String str = this.b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KmFlexibleTypeUpperBound(type=");
        sb.append(this.f1318a);
        sb.append(", typeFlexibilityId=");
        return axq.m(sb, this.b, ')');
    }
}
