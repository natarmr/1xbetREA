package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class geg {
    public static final feg Companion = new feg();
    public static final a8z[] c = {null, maz.a(wez.f39042a, new jcg(9))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f11155a;
    public final List b;

    public /* synthetic */ geg(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f11155a = null;
        } else {
            this.f11155a = num;
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
        if (!(obj instanceof geg)) {
            return false;
        }
        geg gegVar = (geg) obj;
        return Intrinsics.d(this.f11155a, gegVar.f11155a) && Intrinsics.d(this.b, gegVar.b);
    }

    public final int hashCode() {
        Integer num = this.f11155a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return kng0.h(this.f11155a, "CyberChampSyntheticResultsResponse(count=", ", champGameResults=", Separators.RPAREN, this.b);
    }
}
