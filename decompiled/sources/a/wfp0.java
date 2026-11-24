package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class wfp0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f39083a;
    public final int b;
    public final List c;

    public wfp0(String str, List list, int i) {
        list.getClass();
        this.f39083a = str;
        this.b = i;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfp0)) {
            return false;
        }
        wfp0 wfp0Var = (wfp0) obj;
        return this.f39083a.equals(wfp0Var.f39083a) && this.b == wfp0Var.b && Intrinsics.d(this.c, wfp0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + twn.a(this.b, this.f39083a.hashCode() * 31, 31);
    }

    public final String toString() {
        return dw9.r(kng0.p(this.b, "TeamModel(fullName=", this.f39083a, ", countryId=", ", opps="), this.c, Separators.RPAREN);
    }
}
