package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class qcb0 {
    public static final pcb0 Companion = new pcb0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f28477a;
    public final Float b;
    public final Float c;
    public final Integer d;
    public final String e;

    public /* synthetic */ qcb0(int i, String str, Float f, Float f2, Integer num, String str2) {
        if ((i & 1) == 0) {
            this.f28477a = null;
        } else {
            this.f28477a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = f;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = f2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qcb0)) {
            return false;
        }
        qcb0 qcb0Var = (qcb0) obj;
        return Intrinsics.d(this.f28477a, qcb0Var.f28477a) && Intrinsics.d(this.b, qcb0Var.b) && Intrinsics.d(this.c, qcb0Var.c) && Intrinsics.d(this.d, qcb0Var.d) && Intrinsics.d(this.e, qcb0Var.e);
    }

    public final int hashCode() {
        String str = this.f28477a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Float f = this.b;
        int iHashCode2 = (iHashCode + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.c;
        int iHashCode3 = (iHashCode2 + (f2 == null ? 0 : f2.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode4 = (iHashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PopularHeroesHeroResponse(name=");
        sb.append(this.f28477a);
        sb.append(", winRate=");
        sb.append(this.b);
        sb.append(", pickRate=");
        sb.append(this.c);
        sb.append(", matches=");
        sb.append(this.d);
        sb.append(", image=");
        return axq.n(sb, this.e, Separators.RPAREN);
    }
}
