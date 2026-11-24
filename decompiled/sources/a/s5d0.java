package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class s5d0 implements l3q, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f31650a;
    public final String b;
    public final String c;
    public final String d;
    public final gz8 e;
    public final List f;
    public final String g;
    public final int h;
    public final String i;

    public s5d0(String str, String str2, String str3, String str4, gz8 gz8Var, List list, String str5, int i, String str6) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        list.getClass();
        this.f31650a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = gz8Var;
        this.f = list;
        this.g = str5;
        this.h = i;
        this.i = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s5d0)) {
            return false;
        }
        s5d0 s5d0Var = (s5d0) obj;
        return Intrinsics.d(this.f31650a, s5d0Var.f31650a) && Intrinsics.d(this.b, s5d0Var.b) && Intrinsics.d(this.c, s5d0Var.c) && Intrinsics.d(this.d, s5d0Var.d) && this.e == s5d0Var.e && Intrinsics.d(this.f, s5d0Var.f) && this.g.equals(s5d0Var.g) && this.h == s5d0Var.h && Intrinsics.d(this.i, s5d0Var.i);
    }

    @Override // a.l3q
    public final String getId() {
        return this.f31650a;
    }

    @Override // a.l3q
    public final String getName() {
        return this.b;
    }

    public final int hashCode() {
        int iA = twn.a(this.h, ua80.b(dw9.a((this.e.hashCode() + ua80.b(ua80.b(ua80.b(this.f31650a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d)) * 31, 31, this.f), 31, this.g), 31);
        String str = this.i;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbN = b1j.n("ProviderModel(id=", this.f31650a, ", name=", this.b, ", imageSrc=");
        f140.v(sbN, this.c, ", providerName=", this.d, ", brandType=");
        sbN.append(this.e);
        sbN.append(", partitions=");
        sbN.append(this.f);
        sbN.append(", description=");
        twn.w(this.h, this.g, ", gamesCount=", ", imgBanner=", sbN);
        return axq.n(sbN, this.i, Separators.RPAREN);
    }
}
