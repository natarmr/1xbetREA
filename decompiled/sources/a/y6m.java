package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class y6m implements b7m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f42105a;
    public final String b;

    public y6m(String str, String str2) {
        u6m u6mVar = u6m.f35142a;
        str2.getClass();
        this.f42105a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y6m)) {
            return false;
        }
        y6m y6mVar = (y6m) obj;
        if (!this.f42105a.equals(y6mVar.f42105a)) {
            return false;
        }
        u6m u6mVar = u6m.f35142a;
        return Intrinsics.d(this.b, y6mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((u6m.f35142a.hashCode() + (this.f42105a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        u6m u6mVar = u6m.f35142a;
        StringBuilder sb = new StringBuilder("Ban(heroIconUrl=");
        sb.append(this.f42105a);
        sb.append(", placeholderIcon=");
        sb.append(u6mVar);
        sb.append(", numberItem=");
        return axq.n(sb, this.b, Separators.RPAREN);
    }
}
