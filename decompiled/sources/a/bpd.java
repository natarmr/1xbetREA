package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class bpd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2976a;
    public final List b;
    public final List c;
    public final String d;
    public final List e;
    public final List f;
    public final String g;
    public final boolean h;

    public bpd(String str, List list, List list2, String str2, List list3, List list4, String str3, boolean z) {
        list.getClass();
        list2.getClass();
        str2.getClass();
        list3.getClass();
        list4.getClass();
        str3.getClass();
        this.f2976a = str;
        this.b = list;
        this.c = list2;
        this.d = str2;
        this.e = list3;
        this.f = list4;
        this.g = str3;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bpd)) {
            return false;
        }
        bpd bpdVar = (bpd) obj;
        return this.f2976a.equals(bpdVar.f2976a) && Intrinsics.d(this.b, bpdVar.b) && Intrinsics.d(this.c, bpdVar.c) && Intrinsics.d(this.d, bpdVar.d) && Intrinsics.d(this.e, bpdVar.e) && Intrinsics.d(this.f, bpdVar.f) && Intrinsics.d(this.g, bpdVar.g) && this.h == bpdVar.h;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.h) + ua80.b(dw9.a(dw9.a(ua80.b(dw9.a(dw9.a(this.f2976a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sbF = defpackage.c.f("CompressedCardPeriodModel(timePeriodName=", this.f2976a, ", teamOneIds=", this.b, ", teamTwoIds=");
        h97.y(", teamOneName=", this.d, ", teamOneImageUrls=", sbF, this.c);
        b1j.y(", teamTwoImageUrls=", ", teamTwoName=", sbF, this.e, this.f);
        return defpackage.c.c(this.g, ", hostsVsGuests=", Separators.RPAREN, sbF, this.h);
    }
}
