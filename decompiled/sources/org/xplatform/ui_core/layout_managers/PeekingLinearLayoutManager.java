package org.xplatform.ui_core.layout_managers;

import a.sj3;
import android.javax.sip.message.Response;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/ui_core/layout_managers/PeekingLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PeekingLinearLayoutManager extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.b
    public final void b0(View view) {
        int i = this.p;
        if (i == 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.getClass();
            layoutParams.width = Math.min((int) (((double) this.n) * 0.9d), sj3.X(Response.BAD_REQUEST));
        } else if (i == 1) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            layoutParams2.getClass();
            int iS = S();
            int i2 = this.o;
            if (iS <= 0) {
                layoutParams2.height = i2 - (sj3.X(0) + (getPaddingEnd() + getPaddingStart()));
            } else {
                layoutParams2.height = (int) (((double) (i2 - (sj3.X(0) + (getPaddingEnd() + getPaddingStart())))) * 0.9d);
            }
        }
        super.b0(view);
    }
}
