package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class u5e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f35090a;
    public final String b;

    public u5e0(List list, String str) {
        list.getClass();
        str.getClass();
        this.f35090a = list;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u5e0)) {
            return false;
        }
        u5e0 u5e0Var = (u5e0) obj;
        return Intrinsics.d(this.f35090a, u5e0Var.f35090a) && Intrinsics.d(this.b, u5e0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f35090a.hashCode() * 31);
    }

    public final String toString() {
        return "OpenInfoBottomSheet(markerList=" + this.f35090a + ", dialogTitle=" + this.b + Separators.RPAREN;
    }
}
