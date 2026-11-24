package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class a800 implements uqa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f400a;
    public final ArrayList b;
    public final boolean c;
    public final jmo d;
    public final boolean e;

    public a800(ArrayList arrayList, ArrayList arrayList2, boolean z, jmo jmoVar, boolean z2) {
        this.f400a = arrayList;
        this.b = arrayList2;
        this.c = z;
        this.d = jmoVar;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a800)) {
            return false;
        }
        a800 a800Var = (a800) obj;
        return this.f400a.equals(a800Var.f400a) && this.b.equals(a800Var.b) && this.c == a800Var.c && this.d.equals(a800Var.d) && this.e == a800Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + brm0.e(twn.g(this.b, this.f400a.hashCode() * 31, 31), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LineStatisticUiModel(meetingInfoList=");
        sb.append(this.f400a);
        sb.append(", headerList=");
        sb.append(this.b);
        sb.append(", expanded=");
        sb.append(this.c);
        sb.append(", btnUiModel=");
        sb.append(this.d);
        sb.append(", rtlSupport=");
        return rw2.p(sb, this.e, Separators.RPAREN);
    }
}
