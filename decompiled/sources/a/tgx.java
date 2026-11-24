package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class tgx {
    public static final sgx Companion = new sgx();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new qgx(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33936a;
    public final List b;

    public /* synthetic */ tgx(String str, List list, int i) {
        if ((i & 1) == 0) {
            this.f33936a = null;
        } else {
            this.f33936a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tgx)) {
            return false;
        }
        tgx tgxVar = (tgx) obj;
        return Intrinsics.d(this.f33936a, tgxVar.f33936a) && Intrinsics.d(this.b, tgxVar.b);
    }

    public final int hashCode() {
        String str = this.f33936a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return ohs0.o("InsightResponse(insightText=", this.f33936a, ", groupEvents=", this.b, Separators.RPAREN);
    }
}
