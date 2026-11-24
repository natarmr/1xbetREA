package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class itv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f15370a;
    public final boolean b;
    public final String c;
    public final int d;
    public final String e;
    public final hye f;

    public itv(boolean z, boolean z2, String str, int i, String str2, hye hyeVar) {
        str.getClass();
        str2.getClass();
        this.f15370a = z;
        this.b = z2;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = hyeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof itv)) {
            return false;
        }
        itv itvVar = (itv) obj;
        return this.f15370a == itvVar.f15370a && this.b == itvVar.b && Intrinsics.d(this.c, itvVar.c) && this.d == itvVar.d && Intrinsics.d(this.e, itvVar.e) && this.f == itvVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(twn.a(this.d, ua80.b(brm0.e(Boolean.hashCode(this.f15370a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("HeadlineUiModel(isHeadlineVisible=", ", isLive=", ", sportIconUrl=", this.f15370a, this.b);
        twn.w(this.d, this.c, ", sportImagePlaceholder=", ", dateTimeLabel=", sbQ);
        sbQ.append(this.e);
        sbQ.append(", couponInteractionButtonState=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
