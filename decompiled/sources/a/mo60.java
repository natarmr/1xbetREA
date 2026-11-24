package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class mo60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22120a;
    public final a570 b;
    public final String c;
    public final String d;
    public final String e;
    public final boolean f;

    public mo60(String str, a570 a570Var, String str2, String str3, String str4, boolean z) {
        str.getClass();
        a570Var.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        this.f22120a = str;
        this.b = a570Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mo60)) {
            return false;
        }
        mo60 mo60Var = (mo60) obj;
        return Intrinsics.d(this.f22120a, mo60Var.f22120a) && Intrinsics.d(this.b, mo60Var.b) && Intrinsics.d(this.c, mo60Var.c) && Intrinsics.d(this.d, mo60Var.d) && Intrinsics.d(this.e, mo60Var.e) && this.f == mo60Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ua80.b(ua80.b(ua80.b((this.b.hashCode() + (this.f22120a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OneXGameWithCategoryUiModel(categoryId=");
        sb.append(this.f22120a);
        sb.append(", gameType=");
        sb.append(this.b);
        sb.append(", gameName=");
        f140.v(sb, this.c, ", squarePicture=", this.d, ", rectanglePicture=");
        return defpackage.c.c(this.e, ", underMaintenance=", Separators.RPAREN, sb, this.f);
    }
}
