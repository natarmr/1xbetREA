package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class hll implements jll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f13267a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final oll f;
    public final Date g;
    public final String h;
    public final String i;
    public final String j;
    public final String k;
    public final String l;

    public hll(long j, String str, String str2, String str3, String str4, oll ollVar, Date date, String str5, String str6, String str7, String str8, String str9) {
        str4.getClass();
        date.getClass();
        str5.getClass();
        this.f13267a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = ollVar;
        this.g = date;
        this.h = str5;
        this.i = str6;
        this.j = str7;
        this.k = str8;
        this.l = str9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hll)) {
            return false;
        }
        hll hllVar = (hll) obj;
        return this.f13267a == hllVar.f13267a && Intrinsics.d(this.b, hllVar.b) && Intrinsics.d(this.c, hllVar.c) && Intrinsics.d(this.d, hllVar.d) && Intrinsics.d(this.e, hllVar.e) && this.f.equals(hllVar.f) && Intrinsics.d(this.g, hllVar.g) && Intrinsics.d(this.h, hllVar.h) && Intrinsics.d(this.i, hllVar.i) && Intrinsics.d(this.j, hllVar.j) && Intrinsics.d(this.k, hllVar.k) && this.l.equals(hllVar.l);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.f13267a) * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int iB = ua80.b(brm0.i(this.g, (this.f.hashCode() + ua80.b((iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.e)) * 31, 31), 31, this.h);
        String str4 = this.i;
        int iHashCode4 = (iB + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.j;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.k;
        return Integer.hashCode(R.drawable.aggregator_daily_missions_image_placeholder) + ua80.b((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31, 31, this.l);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f13267a, "Data(id=", ", amountText=", this.b);
        f140.v(sbO, ", wagerText=", this.c, ", statusText=", this.d);
        sbO.append(", descriptionText=");
        sbO.append(this.e);
        sbO.append(", status=");
        sbO.append(this.f);
        sbO.append(", date=");
        sbO.append(this.g);
        sbO.append(", btnMoreText=");
        sbO.append(this.h);
        f140.v(sbO, ", btnActionText=", this.i, ", chipDateText=", this.j);
        f140.v(sbO, ", chipStatusText=", this.k, ", backgroundImageUrl=", this.l);
        return vqd.p(sbO, ", backgroundPlaceholderImageResId=", R.drawable.aggregator_daily_missions_image_placeholder, Separators.RPAREN);
    }
}
