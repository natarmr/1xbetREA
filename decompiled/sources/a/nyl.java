package a;

import android.view.View;
import org.xbet.client1.R;
import org.xplatform.uikit.components.shimmer.DsShimmerView;

/* JADX INFO: loaded from: classes6.dex */
public final class nyl extends xhe0 {
    public final DsShimmerView u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nyl(View view) {
        super(view);
        view.getClass();
        View viewFindViewById = view.findViewById(R.id.chipShimmer);
        viewFindViewById.getClass();
        this.u = (DsShimmerView) viewFindViewById;
    }
}
