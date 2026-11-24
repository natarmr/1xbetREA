package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class fpw {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9947a;
    public final String b;
    public final boolean c;
    public final a4x d;

    public fpw(a4x a4xVar, String str, String str2, boolean z) {
        a4xVar.getClass();
        this.f9947a = str;
        this.b = str2;
        this.c = z;
        this.d = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpw)) {
            return false;
        }
        fpw fpwVar = (fpw) obj;
        return this.f9947a.equals(fpwVar.f9947a) && this.b.equals(fpwVar.b) && this.c == fpwVar.c && Intrinsics.d(this.d, fpwVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + brm0.e(ua80.b(this.f9947a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("HorseRunnerInfoUiModel(id=", this.f9947a, ", name=", this.b, ", selected=");
        sbN.append(this.c);
        sbN.append(", infoList=");
        sbN.append(this.d);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
