package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class rur implements tur {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31139a;
    public final String b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;

    public rur(long j, String str, String str2, boolean z, boolean z2, String str3, boolean z3) {
        str.getClass();
        str3.getClass();
        this.f31139a = j;
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = z2;
        this.f = str3;
        this.g = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rur)) {
            return false;
        }
        rur rurVar = (rur) obj;
        return this.f31139a == rurVar.f31139a && Intrinsics.d(this.b, rurVar.b) && this.c.equals(rurVar.c) && this.d == rurVar.d && this.e == rurVar.e && Intrinsics.d(this.f, rurVar.f) && this.g == rurVar.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + ua80.b(brm0.e(twn.a(R.drawable.ic_away, brm0.e(ua80.b(ua80.b(Long.hashCode(this.f31139a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.e), 31, this.f);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f31139a, "TeamSecond(id=", ", name=", this.b);
        w6x.z(", imageUrl=", this.c, ", hostGuest=", sbO, this.d);
        dw9.v(R.drawable.ic_away, ", hostGuestIconDrawableRes=", ", redCardVisible=", sbO, this.e);
        w6x.z(", redCardValue=", this.f, ", imageVisible=", sbO, this.g);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
