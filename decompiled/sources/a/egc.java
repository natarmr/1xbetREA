package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class egc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7757a;
    public final String b;
    public final String c;
    public final a4x d;
    public final String e;

    public egc(String str, String str2, String str3, a4x a4xVar, String str4) {
        a4xVar.getClass();
        this.f7757a = str;
        this.b = str2;
        this.c = str3;
        this.d = a4xVar;
        this.e = str4;
    }

    public static egc a(egc egcVar, String str, String str2, String str3, a4x a4xVar, String str4, int i) {
        if ((i & 1) != 0) {
            str = egcVar.f7757a;
        }
        String str5 = str;
        if ((i & 2) != 0) {
            str2 = egcVar.b;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = egcVar.c;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            a4xVar = egcVar.d;
        }
        a4x a4xVar2 = a4xVar;
        if ((i & 16) != 0) {
            str4 = egcVar.e;
        }
        egcVar.getClass();
        str5.getClass();
        str6.getClass();
        a4xVar2.getClass();
        return new egc(str5, str6, str7, a4xVar2, str4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof egc)) {
            return false;
        }
        egc egcVar = (egc) obj;
        return this.f7757a.equals(egcVar.f7757a) && this.b.equals(egcVar.b) && this.c.equals(egcVar.c) && Intrinsics.d(this.d, egcVar.d) && this.e.equals(egcVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cs0.b(this.d, ua80.b(ua80.b(this.f7757a.hashCode() * 31, 31, this.b), 31, this.c), 31);
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ChooseLanguageBottomSheetUiModel(title=", this.f7757a, ", searchHint=", this.b, ", searchQuery=");
        cs0.B(sbN, this.c, ", languages=", this.d, ", currentCodeIso=");
        return axq.n(sbN, this.e, Separators.RPAREN);
    }
}
