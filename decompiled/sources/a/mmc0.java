package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mmc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22030a;
    public final boolean b;
    public final boolean c;
    public final gfe d;
    public final gfe e;
    public final gfe f;
    public final String g;
    public final String h;
    public final String i;
    public final qho j;
    public final String k;

    public mmc0(String str, boolean z, boolean z2, gfe gfeVar, gfe gfeVar2, gfe gfeVar3, String str2, String str3, String str4, qho qhoVar, String str5) {
        cs0.x(str, str2, str3, str4);
        this.f22030a = str;
        this.b = z;
        this.c = z2;
        this.d = gfeVar;
        this.e = gfeVar2;
        this.f = gfeVar3;
        this.g = str2;
        this.h = str3;
        this.i = str4;
        this.j = qhoVar;
        this.k = str5;
    }

    public static mmc0 a(mmc0 mmc0Var, gfe gfeVar, gfe gfeVar2, gfe gfeVar3, int i) {
        String str = mmc0Var.f22030a;
        boolean z = mmc0Var.b;
        boolean z2 = mmc0Var.c;
        if ((i & 8) != 0) {
            gfeVar = mmc0Var.d;
        }
        gfe gfeVar4 = gfeVar;
        if ((i & 16) != 0) {
            gfeVar2 = mmc0Var.e;
        }
        gfe gfeVar5 = gfeVar2;
        if ((i & 32) != 0) {
            gfeVar3 = mmc0Var.f;
        }
        String str2 = mmc0Var.g;
        String str3 = mmc0Var.h;
        String str4 = mmc0Var.i;
        qho qhoVar = mmc0Var.j;
        String str5 = mmc0Var.k;
        mmc0Var.getClass();
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        return new mmc0(str, z, z2, gfeVar4, gfeVar5, gfeVar3, str2, str3, str4, qhoVar, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof mmc0) {
            mmc0 mmc0Var = (mmc0) obj;
            if (Intrinsics.d(this.f22030a, mmc0Var.f22030a) && this.b == mmc0Var.b && this.c == mmc0Var.c && this.d.equals(mmc0Var.d) && this.e.equals(mmc0Var.e) && this.f.equals(mmc0Var.f) && Intrinsics.d(this.g, mmc0Var.g) && Intrinsics.d(this.h, mmc0Var.h) && Intrinsics.d(this.i, mmc0Var.i) && this.j == mmc0Var.j && this.k.equals(mmc0Var.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.k.hashCode() + ((this.j.hashCode() + ua80.b(ua80.b(ua80.b((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + brm0.e(brm0.e(this.f22030a.hashCode() * 31, 31, this.b), 31, this.c)) * 31)) * 31)) * 31, 31, this.g), 31, this.h), 31, this.i)) * 31);
    }

    public final String toString() {
        StringBuilder sbU = brm0.u("PromoListWithGamesInternalState(title=", this.f22030a, ", hasBannerSection=", this.b, ", hasGamesSection=");
        sbU.append(this.c);
        sbU.append(", bannerState=");
        sbU.append(this.d);
        sbU.append(", gamesState=");
        sbU.append(this.e);
        sbU.append(", menuState=");
        sbU.append(this.f);
        sbU.append(", gamesHeaderTitle=");
        f140.v(sbU, this.g, ", gamesAllButtonTitle=", this.h, ", menuHeaderTitle=");
        sbU.append(this.i);
        sbU.append(", eventStyledDrawableProvider=");
        sbU.append(this.j);
        sbU.append(", loaltyProgramName=");
        return axq.n(sbU, this.k, Separators.RPAREN);
    }
}
