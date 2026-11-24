package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class vif {
    public static final uif Companion = new uif();
    public static final a8z[] g = {null, null, null, null, null, maz.a(wez.f39042a, new x5f(21))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f37475a;
    public final Integer b;
    public final String c;
    public final String d;
    public final String e;
    public final List f;

    public /* synthetic */ vif(int i, Integer num, Integer num2, String str, String str2, String str3, List list) {
        if ((i & 1) == 0) {
            this.f37475a = null;
        } else {
            this.f37475a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vif)) {
            return false;
        }
        vif vifVar = (vif) obj;
        return Intrinsics.d(this.f37475a, vifVar.f37475a) && Intrinsics.d(this.b, vifVar.b) && Intrinsics.d(this.c, vifVar.c) && Intrinsics.d(this.d, vifVar.d) && Intrinsics.d(this.e, vifVar.e) && Intrinsics.d(this.f, vifVar.f);
    }

    public final int hashCode() {
        Integer num = this.f37475a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.f;
        return iHashCode5 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbQ = hne.q("Cs2CompositionLineupResponse(id=", this.f37475a, ", feedId=", this.b, ", teamName=");
        f140.v(sbQ, this.c, ", teamImage=", this.d, ", teamImageS3=");
        return rw2.m(this.e, ", players=", Separators.RPAREN, sbQ, this.f);
    }
}
