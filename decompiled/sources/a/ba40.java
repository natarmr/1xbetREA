package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ba40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2241a;
    public final n0x b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final a4x h;
    public final a4x i;

    public ba40(String str, n0x n0xVar, String str2, String str3, String str4, String str5, String str6, a4x a4xVar, a4x a4xVar2) {
        str2.getClass();
        str4.getClass();
        str6.getClass();
        a4xVar.getClass();
        a4xVar2.getClass();
        this.f2241a = str;
        this.b = n0xVar;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
        this.g = str6;
        this.h = a4xVar;
        this.i = a4xVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba40)) {
            return false;
        }
        ba40 ba40Var = (ba40) obj;
        return this.f2241a.equals(ba40Var.f2241a) && this.b.equals(ba40Var.b) && Intrinsics.d(this.c, ba40Var.c) && this.d.equals(ba40Var.d) && Intrinsics.d(this.e, ba40Var.e) && this.f.equals(ba40Var.f) && Intrinsics.d(this.g, ba40Var.g) && Intrinsics.d(this.h, ba40Var.h) && Intrinsics.d(this.i, ba40Var.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + cs0.b(this.h, ua80.b(ua80.b(ua80.b(ua80.b(ua80.b(f140.f(this.b, this.f2241a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetaCharacterCardCharacterUiModel(name=");
        sb.append(this.f2241a);
        sb.append(", image=");
        sb.append(this.b);
        sb.append(", ratingTitle=");
        f140.v(sb, this.c, ", ratingValue=", this.d, ", winrateTitle=");
        f140.v(sb, this.e, ", winrateValue=", this.f, ", skillsTitle=");
        cs0.B(sb, this.g, ", skills=", this.h, ", events=");
        return cs0.n(sb, this.i, Separators.RPAREN);
    }
}
