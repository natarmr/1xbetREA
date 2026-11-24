package a;

import android.gov.nist.core.Separators;
import org.xplatform.cyber.section.impl.transfers.presentation.dialogs.timefilter.model.TransfersTimeFilterBottomParams;

/* JADX INFO: loaded from: classes4.dex */
public final class nks0 implements oks0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransfersTimeFilterBottomParams f23696a;

    public nks0(TransfersTimeFilterBottomParams transfersTimeFilterBottomParams) {
        this.f23696a = transfersTimeFilterBottomParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nks0) && this.f23696a.equals(((nks0) obj).f23696a);
    }

    public final int hashCode() {
        return this.f23696a.hashCode();
    }

    public final String toString() {
        return "ShowTimeFilterDialog(params=" + this.f23696a + Separators.RPAREN;
    }
}
