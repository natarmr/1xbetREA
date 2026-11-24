package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class oza implements qza {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f26095a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;

    public oza(String str, int i, String str2, String str3, int i2) {
        str.getClass();
        str3.getClass();
        this.f26095a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oza)) {
            return false;
        }
        oza ozaVar = (oza) obj;
        return Intrinsics.d(this.f26095a, ozaVar.f26095a) && this.b.equals(ozaVar.b) && this.c == ozaVar.c && this.d == ozaVar.d && Intrinsics.d(this.e, ozaVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + twn.a(this.d, twn.a(this.c, ua80.b(this.f26095a.hashCode() * 31, 31, this.b), 31), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("Progress(currentProgressText=", this.f26095a, ", maxProgressText=", this.b, ", currentProgress=");
        axq.r(this.c, this.d, ", maxProgress=", ", label=", sbN);
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
