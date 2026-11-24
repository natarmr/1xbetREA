package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class rll implements tll {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f30702a;
    public final a4x b;

    public rll(i4 i4Var, String str) {
        str.getClass();
        i4Var.getClass();
        this.f30702a = str;
        this.b = i4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rll)) {
            return false;
        }
        rll rllVar = (rll) obj;
        return Intrinsics.d(this.f30702a, rllVar.f30702a) && Intrinsics.d(this.b, rllVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f30702a.hashCode() * 31);
    }

    public final String toString() {
        return f140.m("Data(title=", this.f30702a, ", missionItems=", this.b, Separators.RPAREN);
    }
}
