package a;

import android.gov.nist.core.Separators;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes2.dex */
public final class a8c0 implements b8c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f420a;
    public final Date b;
    public final String c;
    public final bi90 d;

    public a8c0(String str, Date date, String str2, bi90 bi90Var) {
        str.getClass();
        str2.getClass();
        this.f420a = str;
        this.b = date;
        this.c = str2;
        this.d = bi90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a8c0)) {
            return false;
        }
        a8c0 a8c0Var = (a8c0) obj;
        return Intrinsics.d(this.f420a, a8c0Var.f420a) && this.b.equals(a8c0Var.b) && Intrinsics.d(this.c, a8c0Var.c) && this.d.equals(a8c0Var.d);
    }

    public final int hashCode() {
        return Integer.hashCode(R.drawable.ic_glyph_money) + ((this.d.hashCode() + ua80.b(brm0.i(this.b, ua80.b(-749194074, 31, this.f420a), 31), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Timer(id=CASHBACK, title=");
        sb.append(this.f420a);
        sb.append(", endDate=");
        sb.append(this.b);
        sb.append(", daysLabel=");
        sb.append(this.c);
        sb.append(", displayMeasureTimerTypes=");
        sb.append(this.d);
        sb.append(", icon=");
        return rz4.j(R.drawable.ic_glyph_money, Separators.RPAREN, sb);
    }
}
