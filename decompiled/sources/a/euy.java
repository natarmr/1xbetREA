package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class euy implements s1q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8444a;
    public final int b;
    public final String c;
    public final uwx d;

    public euy(String str, int i, String str2, uwx uwxVar) {
        str.getClass();
        this.f8444a = str;
        this.b = i;
        this.c = str2;
        this.d = uwxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof euy)) {
            return false;
        }
        euy euyVar = (euy) obj;
        return Intrinsics.d(this.f8444a, euyVar.f8444a) && this.b == euyVar.b && this.c.equals(euyVar.c) && this.d == euyVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(twn.a(this.b, this.f8444a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbP = kng0.p(this.b, "LabelUiModel(label=", this.f8444a, ", colorAttrResId=", ", title=");
        sbP.append(this.c);
        sbP.append(", itemPosition=");
        sbP.append(this.d);
        sbP.append(Separators.RPAREN);
        return sbP.toString();
    }
}
