package org.xplatform.popular_classic.impl.presentation.popular_classic_screen.adapters.special_events;

import a.sj3;
import android.content.Context;
import android.javax.sip.message.Response;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/popular_classic/impl/presentation/popular_classic_screen/adapters/special_events/SpecialEventLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class SpecialEventLinearLayoutManager extends LinearLayoutManager {
    public final boolean g1;

    public SpecialEventLinearLayoutManager(Context context) {
        super(context, 0, false);
        this.g1 = context.getResources().getBoolean(R.bool.isTablet);
    }

    @Override // androidx.recyclerview.widget.b
    public final void b0(View view) {
        int iMin;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.getClass();
        if (S() <= 1) {
            iMin = -1;
        } else {
            int i = this.n;
            iMin = this.g1 ? Math.min((int) (((double) i) * 0.9d), sj3.X(Response.BAD_REQUEST)) : (int) (((double) i) * 0.9d);
        }
        layoutParams.width = iMin;
        super.b0(view);
    }
}
