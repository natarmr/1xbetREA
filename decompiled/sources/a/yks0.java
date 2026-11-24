package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferTimeFilterUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class yks0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferTimeFilterUiModel.CustomTime f42805a;
    public final int b;
    public final String c;
    public final wui0 d;

    public yks0(TransferTimeFilterUiModel.CustomTime customTime, int i, String str, wui0 wui0Var) {
        str.getClass();
        this.f42805a = customTime;
        this.b = i;
        this.c = str;
        this.d = wui0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yks0)) {
            return false;
        }
        yks0 yks0Var = (yks0) obj;
        return this.f42805a.equals(yks0Var.f42805a) && this.b == yks0Var.b && Intrinsics.d(this.c, yks0Var.c) && this.d == yks0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ua80.b(twn.a(this.b, this.f42805a.hashCode() * 31, 31), 31, this.c);
    }

    public final String toString() {
        return "TransfersTimePeriodSettingCellUiModel(timeFilter=" + this.f42805a + ", titleLeftRes=" + this.b + ", label=" + this.c + ", position=" + this.d + Separators.RPAREN;
    }
}
