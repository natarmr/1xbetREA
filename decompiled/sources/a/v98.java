package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class v98 {
    public static final u98 Companion = new u98();
    public static final a8z[] c = {maz.a(wez.f39042a, new os7(25)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f37022a;
    public final Integer b;

    public /* synthetic */ v98(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.f37022a = null;
        } else {
            this.f37022a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v98)) {
            return false;
        }
        v98 v98Var = (v98) obj;
        return Intrinsics.d(this.f37022a, v98Var.f37022a) && Intrinsics.d(this.b, v98Var.b);
    }

    public final int hashCode() {
        List list = this.f37022a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Integer num = this.b;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        return "BlockStageResponse(items=" + this.f37022a + ", crmParticipantCurrentStage=" + this.b + Separators.RPAREN;
    }
}
