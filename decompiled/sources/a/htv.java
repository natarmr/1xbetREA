package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class htv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13653a;
    public final boolean b;
    public final String c;
    public final int d;
    public final String e;
    public final jye f;

    public htv(boolean z, boolean z2, String str, int i, String str2, jye jyeVar) {
        str.getClass();
        str2.getClass();
        jyeVar.getClass();
        this.f13653a = z;
        this.b = z2;
        this.c = str;
        this.d = i;
        this.e = str2;
        this.f = jyeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof htv)) {
            return false;
        }
        htv htvVar = (htv) obj;
        return this.f13653a == htvVar.f13653a && this.b == htvVar.b && Intrinsics.d(this.c, htvVar.c) && this.d == htvVar.d && Intrinsics.d(this.e, htvVar.e) && this.f == htvVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(twn.a(this.d, ua80.b(brm0.e(Boolean.hashCode(this.f13653a) * 31, 31, this.b), 31, this.c), 31), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("HeadlineStateModel(isHeadlineVisible=", ", isLive=", ", sportIconUrl=", this.f13653a, this.b);
        twn.w(this.d, this.c, ", sportImagePlaceholder=", ", dateTimeLabel=", sbQ);
        sbQ.append(this.e);
        sbQ.append(", couponInteractionButtonStateModel=");
        sbQ.append(this.f);
        sbQ.append(Separators.RPAREN);
        return sbQ.toString();
    }
}
