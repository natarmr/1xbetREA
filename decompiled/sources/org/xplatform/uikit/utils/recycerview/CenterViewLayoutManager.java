package org.xplatform.uikit.utils.recycerview;

import a.hhe0;
import a.msj;
import a.the0;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.b;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lorg/xplatform/uikit/utils/recycerview/CenterViewLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "uikit"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class CenterViewLayoutManager extends LinearLayoutManager {
    public final List g1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CenterViewLayoutManager(Context context, List list) {
        super(context, 0, false);
        context.getClass();
        list.getClass();
        this.g1 = list;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.b
    public final void s0(msj msjVar, the0 the0Var) {
        List list;
        if (msjVar == null || S() == 0) {
            return;
        }
        if (the0Var == null || the0Var.b() != 0) {
            if (the0Var == null || !the0Var.g) {
                if (S() == 1 && ((list = this.g1) == null || !list.isEmpty())) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((Class) it.next()).isInstance(msjVar.e(0))) {
                            C(msjVar);
                            View viewE = msjVar.e(0);
                            viewE.getClass();
                            l(viewE);
                            b0(viewE);
                            int iP = b.P(viewE);
                            int iO = b.O(viewE);
                            int i = (this.n - iP) / 2;
                            int i2 = (this.o - iO) / 2;
                            Rect rect = ((hhe0) viewE.getLayoutParams()).b;
                            viewE.layout(i + rect.left, i2 + rect.top, (iP + i) - rect.right, (iO + i2) - rect.bottom);
                            return;
                        }
                    }
                }
                super.s0(msjVar, the0Var);
            }
        }
    }
}
