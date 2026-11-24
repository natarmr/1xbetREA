package a;

import android.gov.nist.core.Separators;
import org.xplatform.feed.topgamesbystat.presentation.params.TopGamesByStatBottomSheetScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class dkp implements ekp {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopGamesByStatBottomSheetScreenParams f6243a;

    public dkp(TopGamesByStatBottomSheetScreenParams topGamesByStatBottomSheetScreenParams) {
        this.f6243a = topGamesByStatBottomSheetScreenParams;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dkp) && this.f6243a.equals(((dkp) obj).f6243a);
    }

    public final int hashCode() {
        return this.f6243a.hashCode();
    }

    public final String toString() {
        return "ShowTopGamesByStatBottomSheet(params=" + this.f6243a + Separators.RPAREN;
    }
}
