package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferTimeFilterUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class wks0 implements p6t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferTimeFilterUiModel f39323a;
    public final boolean b;
    public final int c;

    public wks0(TransferTimeFilterUiModel transferTimeFilterUiModel, boolean z, int i) {
        transferTimeFilterUiModel.getClass();
        this.f39323a = transferTimeFilterUiModel;
        this.b = z;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wks0)) {
            return false;
        }
        wks0 wks0Var = (wks0) obj;
        return Intrinsics.d(this.f39323a, wks0Var.f39323a) && this.b == wks0Var.b && this.c == wks0Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + brm0.e(this.f39323a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransfersTimeFiltersSettingCellUiModel(timeFilter=");
        sb.append(this.f39323a);
        sb.append(", selected=");
        sb.append(this.b);
        sb.append(", titleRes=");
        return rz4.j(this.c, Separators.RPAREN, sb);
    }
}
