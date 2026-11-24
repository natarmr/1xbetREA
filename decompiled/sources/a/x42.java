package a;

import android.gov.nist.core.Separators;
import android.os.Parcelable;
import org.xplatform.bet_history.history.presentation.dialog.history_data_filter.model.HistoryDateFilterTypeModel;

/* JADX INFO: loaded from: classes3.dex */
public final class x42 implements b52 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x42)) {
            return false;
        }
        Parcelable.Creator<HistoryDateFilterTypeModel> creator = HistoryDateFilterTypeModel.CREATOR;
        return true;
    }

    public final int hashCode() {
        return HistoryDateFilterTypeModel.d.hashCode();
    }

    public final String toString() {
        return "RequestHistoryByEmail(historyDateFilterTypeModel=" + HistoryDateFilterTypeModel.d + Separators.RPAREN;
    }
}
