package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class fuh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10162a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final a4x f;

    public fuh(String str, String str2, String str3, String str4, String str5, a4x a4xVar) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        a4xVar.getClass();
        this.f10162a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = a4xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fuh)) {
            return false;
        }
        fuh fuhVar = (fuh) obj;
        return Intrinsics.d(this.f10162a, fuhVar.f10162a) && Intrinsics.d(this.b, fuhVar.b) && Intrinsics.d(this.c, fuhVar.c) && this.d.equals(fuhVar.d) && this.e.equals(fuhVar.e) && Intrinsics.d(this.f, fuhVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ua80.b(ua80.b(ua80.b(ua80.b(this.f10162a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("CyclingCardResultUiModel(date=", this.f10162a, ", result=", this.b, ", status=");
        f140.v(sbN, this.c, ", time=", this.d, ", title=");
        sbN.append(this.e);
        sbN.append(", veloJerseys=");
        sbN.append(this.f);
        sbN.append(Separators.RPAREN);
        return sbN.toString();
    }
}
