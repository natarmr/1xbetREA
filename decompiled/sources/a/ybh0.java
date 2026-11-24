package a;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes6.dex */
public final class ybh0 extends xhe0 {
    public final xxx u;
    public final /* synthetic */ e1a0 v;

    /* JADX WARN: Illegal instructions before constructor call */
    public ybh0(e1a0 e1a0Var, ViewGroup viewGroup) {
        xbh0 xbh0Var = xbh0.f40599a;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        layoutInflaterFrom.getClass();
        xxx xxxVar = (xxx) ((yfu0) xbh0Var.F(layoutInflaterFrom, viewGroup, Boolean.FALSE));
        this.v = e1a0Var;
        ConstraintLayout constraintLayout = xxxVar.f41679a;
        super(constraintLayout);
        this.u = xxxVar;
        dyb.c0(constraintLayout, new dff0(this, e1a0Var, (byte) 23));
        r6x r6xVar = (r6x) e1a0Var.e;
        if (r6xVar instanceof o6x) {
            xxxVar.b.setBackgroundTintList(ColorStateList.valueOf(((o6x) r6xVar).f24759a));
        }
    }
}
