package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class st0 implements pe0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f32750a;
    public final String b;
    public final String c;
    public final mtr d;
    public final o0x e;
    public final o0x f;
    public final Integer g;
    public final nur h;

    public st0(long j, String str, String str2, mtr mtrVar, o0x o0xVar, o0x o0xVar2, Integer num, nur nurVar) {
        str.getClass();
        str2.getClass();
        nurVar.getClass();
        this.f32750a = j;
        this.b = str;
        this.c = str2;
        this.d = mtrVar;
        this.e = o0xVar;
        this.f = o0xVar2;
        this.g = num;
        this.h = nurVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof st0)) {
            return false;
        }
        st0 st0Var = (st0) obj;
        return this.f32750a == st0Var.f32750a && Intrinsics.d(this.b, st0Var.b) && Intrinsics.d(this.c, st0Var.c) && Intrinsics.d(this.d, st0Var.d) && this.e.equals(st0Var.e) && this.f.equals(st0Var.f) && Intrinsics.d(this.g, st0Var.g) && Intrinsics.d(this.h, st0Var.h);
    }

    public final int hashCode() {
        int iB = ua80.b(ua80.b(Long.hashCode(this.f32750a) * 31, 31, this.b), 31, this.c);
        mtr mtrVar = this.d;
        int iD = w6x.d(this.f, w6x.d(this.e, (iB + (mtrVar == null ? 0 : mtrVar.hashCode())) * 31, 31), 31);
        Integer num = this.g;
        return this.h.hashCode() + ((iD + (num != null ? num.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sbO = axq.o(this.f32750a, "AggregatorGameCardUiModel(id=", ", title=", this.b);
        sbO.append(", subtitle=");
        sbO.append(this.c);
        sbO.append(", favoriteModel=");
        sbO.append(this.d);
        sbO.append(", imageLink=");
        sbO.append(this.e);
        sbO.append(", placeholderLink=");
        sbO.append(this.f);
        sbO.append(", gamesCategoryId=");
        sbO.append(this.g);
        sbO.append(", gameCardTagType=");
        sbO.append(this.h);
        sbO.append(Separators.RPAREN);
        return sbO.toString();
    }
}
