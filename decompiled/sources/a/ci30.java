package a;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes.dex */
public final class ci30 extends LinearLayoutManager {
    public final /* synthetic */ int g1;
    public final /* synthetic */ com.google.android.material.datepicker.e h1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci30(com.google.android.material.datepicker.e eVar, Context context, int i, int i2) {
        super(context, i, false);
        this.h1 = eVar;
        this.g1 = i2;
    }

    @Override // androidx.recyclerview.widget.b
    public final void R0(RecyclerView recyclerView, the0 the0Var, int i) {
        jva jvaVar = new jva(recyclerView.getContext(), (byte) 1);
        jvaVar.f32207a = i;
        S0(jvaVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void U0(the0 the0Var, int[] iArr) {
        com.google.android.material.datepicker.e eVar = this.h1;
        RecyclerView recyclerView = eVar.O1;
        if (this.g1 == 0) {
            iArr[0] = recyclerView.getWidth();
            iArr[1] = eVar.O1.getWidth();
        } else {
            iArr[0] = recyclerView.getHeight();
            iArr[1] = eVar.O1.getHeight();
        }
    }
}
