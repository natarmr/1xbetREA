package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class hr50 implements kr50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f13514a;
    public final int b;
    public final ArrayList c;

    public hr50(int i, ArrayList arrayList, ArrayList arrayList2) {
        this.f13514a = arrayList;
        this.b = i;
        this.c = arrayList2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr50)) {
            return false;
        }
        hr50 hr50Var = (hr50) obj;
        return this.f13514a.equals(hr50Var.f13514a) && this.b == hr50Var.b && this.c.equals(hr50Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f13514a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Content(topBanners=");
        sb.append(this.f13514a);
        sb.append(", topBannersCategoryId=");
        sb.append(this.b);
        sb.append(", categories=");
        return rz4.n(sb, this.c, Separators.RPAREN);
    }
}
