package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class sas {
    public static final ras Companion = new ras();
    public static final a8z[] j = {maz.a(wez.f39042a, new o9s(3)), null, null, null, null, null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f31899a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final Integer h;
    public final jas i;

    public /* synthetic */ sas(int i, List list, String str, String str2, String str3, String str4, String str5, String str6, Integer num, jas jasVar) {
        if ((i & 1) == 0) {
            this.f31899a = null;
        } else {
            this.f31899a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str6;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = jasVar;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sas)) {
            return false;
        }
        sas sasVar = (sas) obj;
        return Intrinsics.d(this.f31899a, sasVar.f31899a) && Intrinsics.d(this.b, sasVar.b) && Intrinsics.d(this.c, sasVar.c) && Intrinsics.d(this.d, sasVar.d) && Intrinsics.d(this.e, sasVar.e) && Intrinsics.d(this.f, sasVar.f) && Intrinsics.d(this.g, sasVar.g) && Intrinsics.d(this.h, sasVar.h) && Intrinsics.d(this.i, sasVar.i);
    }

    public final int hashCode() {
        List list = this.f31899a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.g;
        int iHashCode7 = (iHashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.h;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        jas jasVar = this.i;
        return iHashCode8 + (jasVar != null ? jasVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbO = ua80.o("GameEventResponse(assistantsIds=", ", eventTimeString=", this.b, this.f31899a, ", eventNote=");
        f140.v(sbO, this.c, ", playerId=", this.d, ", pngImageId=");
        f140.v(sbO, this.e, ", svgImageId=", this.f, ", teamId=");
        axq.x(this.h, this.g, ", eventType=", ", kabaddiInfo=", sbO);
        sbO.append(this.i);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
