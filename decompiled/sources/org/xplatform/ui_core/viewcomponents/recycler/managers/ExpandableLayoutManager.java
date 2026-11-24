package org.xplatform.ui_core.viewcomponents.recycler.managers;

import a.ago;
import a.maz;
import a.n0o0;
import a.the0;
import a.wmo;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import org.xplatform.ui_core.viewcomponents.recycler.managers.ExpandableLayoutManager;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lorg/xplatform/ui_core/viewcomponents/recycler/managers/ExpandableLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "a/wmo", "ui_core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ExpandableLayoutManager extends LinearLayoutManager {
    public final n0o0 g1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        context.getClass();
        this.g1 = maz.b(new ago((byte) 17));
    }

    @Override // androidx.recyclerview.widget.b
    public final void R0(RecyclerView recyclerView, the0 the0Var, int i) {
        Context context = recyclerView.getContext();
        context.getClass();
        wmo wmoVar = new wmo(this, context);
        wmoVar.f32207a = i;
        S0(wmoVar);
    }

    @Override // androidx.recyclerview.widget.b
    public final void m0(final RecyclerView recyclerView, final int i, final int i2) {
        if (i == 0) {
            return;
        }
        ((Handler) this.g1.getValue()).postDelayed(new Runnable() { // from class: a.vmo
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                int i4 = i3 - 1;
                ExpandableLayoutManager expandableLayoutManager = this.f37681a;
                View viewD = expandableLayoutManager.D(i4);
                if (viewD == null) {
                    return;
                }
                int height = viewD.getHeight() + viewD.getTop();
                expandableLayoutManager.w = true;
                int i5 = i2 + i3;
                while (true) {
                    RecyclerView recyclerView2 = recyclerView;
                    if (i3 >= i5) {
                        if (height > expandableLayoutManager.o) {
                            recyclerView2.B0(i4);
                            return;
                        }
                        return;
                    } else {
                        View viewH = expandableLayoutManager.H(i3);
                        if (viewH == null) {
                            recyclerView2.B0(i4);
                            return;
                        } else {
                            height += viewH.getHeight();
                            i3++;
                        }
                    }
                }
            }
        }, 120L);
    }
}
