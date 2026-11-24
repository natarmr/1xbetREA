package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class bn60 implements dn60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pbv f2868a;
    public final String b;
    public final int c;

    public bn60(pbv pbvVar, String str, int i) {
        this.f2868a = pbvVar;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bn60)) {
            return false;
        }
        bn60 bn60Var = (bn60) obj;
        return Intrinsics.d(this.f2868a, bn60Var.f2868a) && Intrinsics.d(this.b, bn60Var.b) && this.c == bn60Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.f2868a.hashCode() * 31;
        String str = this.b;
        return Integer.hashCode(this.c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnGameClicked(game=");
        sb.append(this.f2868a);
        sb.append(", loadedImageUrl=");
        sb.append(this.b);
        sb.append(", checkedChipCategoryId=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
