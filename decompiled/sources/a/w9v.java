package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class w9v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38799a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public w9v(String str, String str2, String str3, boolean z, String str4) {
        str4.getClass();
        this.f38799a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w9v)) {
            return false;
        }
        w9v w9vVar = (w9v) obj;
        return this.f38799a.equals(w9vVar.f38799a) && this.b.equals(w9vVar.b) && this.c.equals(w9vVar.c) && Intrinsics.d(this.d, w9vVar.d) && this.e == w9vVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ua80.b(twn.a(5, ua80.b(ua80.b(ua80.b(twn.a(5, Integer.hashCode(4) * 31, 31), 31, this.f38799a), 31, this.b), 31, this.c), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("GoldRushFinishFieldUiModel(goldRow=4, goldColumn=5, goldImage=", this.f38799a, ", goldImageFill=", this.b, ", coinsImage=");
        f140.v(sbN, this.c, ", coinsColumn=5, winText=", this.d, ", gameIsNotFinished=");
        return rw2.p(sbN, this.e, Separators.RPAREN);
    }
}
