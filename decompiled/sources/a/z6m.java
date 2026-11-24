package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z6m implements b7m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f43876a;
    public final String b;

    public z6m(String str, String str2) {
        u6m u6mVar = u6m.f35142a;
        str2.getClass();
        this.f43876a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6m)) {
            return false;
        }
        z6m z6mVar = (z6m) obj;
        if (!this.f43876a.equals(z6mVar.f43876a)) {
            return false;
        }
        u6m u6mVar = u6m.f35142a;
        return Intrinsics.d(this.b, z6mVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + ((u6m.f35142a.hashCode() + (this.f43876a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        u6m u6mVar = u6m.f35142a;
        StringBuilder sb = new StringBuilder("Pick(heroIconUrl=");
        sb.append(this.f43876a);
        sb.append(", placeholderIcon=");
        sb.append(u6mVar);
        sb.append(", numberItem=");
        return axq.n(sb, this.b, Separators.RPAREN);
    }
}
