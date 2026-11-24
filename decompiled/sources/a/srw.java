package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class srw {
    public static final rrw Companion = new rrw();
    public static final a8z[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f32699a;
    public final List b;
    public final Integer c;

    static {
        wez wezVar = wez.f39042a;
        d = new a8z[]{maz.a(wezVar, new kdw((byte) 13)), maz.a(wezVar, new kdw((byte) 14)), null};
    }

    public /* synthetic */ srw(int i, Integer num, List list, List list2) {
        if ((i & 1) == 0) {
            this.f32699a = null;
        } else {
            this.f32699a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof srw)) {
            return false;
        }
        srw srwVar = (srw) obj;
        return Intrinsics.d(this.f32699a, srwVar.f32699a) && Intrinsics.d(this.b, srwVar.b) && Intrinsics.d(this.c, srwVar.c);
    }

    public final int hashCode() {
        List list = this.f32699a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        Integer num = this.c;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return dw9.q(w6x.t("HorsesRunnersResponse(horses=", ", horsesParamsResponse=", this.f32699a, ", sportId=", this.b), this.c, Separators.RPAREN);
    }
}
