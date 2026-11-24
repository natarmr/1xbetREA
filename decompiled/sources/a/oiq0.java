package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.limits_africa.api.domain.LimitGroupEnum;

/* JADX INFO: loaded from: classes2.dex */
public final class oiq0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LimitGroupEnum f25324a;
    public final trz b;
    public final long c;
    public final String d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final qrz i;
    public final List j;
    public final boolean k;

    public oiq0(LimitGroupEnum limitGroupEnum, trz trzVar, long j, String str, long j2, boolean z, boolean z2, boolean z3, qrz qrzVar, List list, boolean z4) {
        list.getClass();
        this.f25324a = limitGroupEnum;
        this.b = trzVar;
        this.c = j;
        this.d = str;
        this.e = j2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = qrzVar;
        this.j = list;
        this.k = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oiq0)) {
            return false;
        }
        oiq0 oiq0Var = (oiq0) obj;
        return this.f25324a == oiq0Var.f25324a && this.b.equals(oiq0Var.b) && this.c == oiq0Var.c && this.d.equals(oiq0Var.d) && this.e == oiq0Var.e && this.f == oiq0Var.f && this.g == oiq0Var.g && this.h == oiq0Var.h && this.i == oiq0Var.i && Intrinsics.d(this.j, oiq0Var.j) && this.k == oiq0Var.k;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.k) + dw9.a((this.i.hashCode() + brm0.e(brm0.e(brm0.e(rw2.b(ua80.b(rw2.b((this.b.hashCode() + (this.f25324a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h)) * 31, 31, this.j);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TimeLimitModel(limitGroup=");
        sb.append(this.f25324a);
        sb.append(", limitType=");
        sb.append(this.b);
        sb.append(", endsAt=");
        kng0.z(sb, this.c, ", endsAtView=", this.d);
        kng0.A(sb, ", limitValue=", this.e, ", freeValue=");
        ua80.u(", changeAvailable=", ", deleteAvailable=", sb, this.f, this.g);
        sb.append(this.h);
        sb.append(", limitState=");
        sb.append(this.i);
        sb.append(", availableValueModels=");
        sb.append(this.j);
        sb.append(", setWithoutValue=");
        sb.append(this.k);
        sb.append(Separators.RPAREN);
        return sb.toString();
    }
}
