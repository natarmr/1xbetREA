package a;

import android.gov.nist.core.Separators;
import org.xplatform.feed.topgamesbystat.presentation.params.TopGamesByStatBottomSheetScreenParams;

/* JADX INFO: loaded from: classes4.dex */
public final class elb0 implements flb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TopGamesByStatBottomSheetScreenParams f7988a;

    public final boolean equals(Object obj) {
        if (obj instanceof elb0) {
            return this.f7988a.equals(((elb0) obj).f7988a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f7988a.hashCode();
    }

    public final String toString() {
        return "ShowTopGamesByStatBottomSheet(params=" + this.f7988a + Separators.RPAREN;
    }
}
