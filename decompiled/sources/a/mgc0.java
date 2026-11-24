package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mgc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f21735a;
    public final boolean b;

    public mgc0(List list, boolean z) {
        list.getClass();
        this.f21735a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mgc0)) {
            return false;
        }
        mgc0 mgc0Var = (mgc0) obj;
        return Intrinsics.d(this.f21735a, mgc0Var.f21735a) && this.b == mgc0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.f21735a.hashCode() * 31);
    }

    public final String toString() {
        return "PromoCodesModel(promoCodes=" + this.f21735a + ", showValue=" + this.b + Separators.RPAREN;
    }
}
