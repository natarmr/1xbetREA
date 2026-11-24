package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.ui_core.resources.UiText;

/* JADX INFO: loaded from: classes3.dex */
public final class msv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22341a;
    public final boolean b;
    public final String c;
    public final String d;
    public final UiText e;
    public final String f;
    public final String g;

    public msv(boolean z, boolean z2, String str, String str2, UiText uiText, String str3, String str4) {
        brm0.B(str, str2, str4);
        this.f22341a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
        this.e = uiText;
        this.f = str3;
        this.g = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof msv)) {
            return false;
        }
        msv msvVar = (msv) obj;
        return this.f22341a == msvVar.f22341a && this.b == msvVar.b && Intrinsics.d(this.c, msvVar.c) && Intrinsics.d(this.d, msvVar.d) && this.e.equals(msvVar.e) && this.f.equals(msvVar.f) && Intrinsics.d(this.g, msvVar.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + ua80.b((this.e.hashCode() + ua80.b(ua80.b(brm0.e(Boolean.hashCode(this.f22341a) * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f);
    }

    public final String toString() {
        StringBuilder sbQ = f140.q("HeaderUiModel(autoSale=", ", isLive=", ", description=", this.f22341a, this.b);
        f140.v(sbQ, this.c, ", couponTypeName=", this.d, ", number=");
        sbQ.append(this.e);
        sbQ.append(", betValue=");
        sbQ.append(this.f);
        sbQ.append(", betCoefficient=");
        return axq.n(sbQ, this.g, Separators.RPAREN);
    }
}
