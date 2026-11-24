package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class osk implements qsk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f25786a;
    public final int b;
    public final String c;
    public final qt20 d;

    public osk(String str, int i, String str2, qt20 qt20Var) {
        str2.getClass();
        this.f25786a = str;
        this.b = i;
        this.c = str2;
        this.d = qt20Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof osk)) {
            return false;
        }
        osk oskVar = (osk) obj;
        return this.f25786a.equals(oskVar.f25786a) && this.b == oskVar.b && Intrinsics.d(this.c, oskVar.c) && this.d.equals(oskVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(twn.a(this.b, this.f25786a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "HeaderFocus(backgroundImageUrl=", this.f25786a, ", placeholderUrl=", ", name=");
        sbP.append(this.c);
        sbP.append(", marketExpandButtonUiModel=");
        sbP.append(this.d);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
