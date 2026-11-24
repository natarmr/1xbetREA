package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.framework.common.BundleUtil;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i3b implements y2b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eao f14090a;
    public final a4x b;
    public final long c;
    public final String d;

    public i3b(eao eaoVar, i4 i4Var, long j) {
        i4Var.getClass();
        this.f14090a = eaoVar;
        this.b = i4Var;
        this.c = j;
        long j2 = eaoVar.h;
        long j3 = eaoVar.e;
        int i = eaoVar.f7476a;
        double d = eaoVar.c;
        StringBuilder sbQ = kng0.q(j, "acc_", BundleUtil.UNDERLINE_TAG);
        sbQ.append(j2);
        kng0.A(sbQ, BundleUtil.UNDERLINE_TAG, j3, BundleUtil.UNDERLINE_TAG);
        sbQ.append(i);
        sbQ.append(BundleUtil.UNDERLINE_TAG);
        sbQ.append(d);
        this.d = sbQ.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3b)) {
            return false;
        }
        i3b i3bVar = (i3b) obj;
        return this.f14090a.equals(i3bVar.f14090a) && Intrinsics.d(this.b, i3bVar.b) && this.c == i3bVar.c;
    }

    @Override // a.y2b
    public final String getKey() {
        return this.d;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + cs0.b(this.b, this.f14090a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CategoryAccuracyUiModel(eventBet=");
        sb.append(this.f14090a);
        sb.append(", betChoiceButtonList=");
        sb.append(this.b);
        sb.append(", subGameId=");
        return brm0.k(this.c, Separators.RPAREN, sb);
    }
}
