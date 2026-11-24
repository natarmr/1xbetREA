package a;

import android.gov.nist.core.Separators;
import org.xplatform.cyber.section.impl.transfers.presentation.common.timefilter.TransferTimeFilterUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final class ois0 implements pis0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TransferTimeFilterUiModel f25327a;

    public ois0(TransferTimeFilterUiModel transferTimeFilterUiModel) {
        this.f25327a = transferTimeFilterUiModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ois0) && this.f25327a.equals(((ois0) obj).f25327a);
    }

    public final int hashCode() {
        return this.f25327a.hashCode();
    }

    public final String toString() {
        return "OnTimeFilterSelect(timeFilter=" + this.f25327a + Separators.RPAREN;
    }
}
