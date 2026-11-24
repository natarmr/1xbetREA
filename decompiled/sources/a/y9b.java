package a;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes6.dex */
public final class y9b extends RecyclerView {
    public static final /* synthetic */ int q2 = 0;
    public int m2;
    public int n2;
    public boolean o2;
    public boolean p2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9b(Context context) {
        super(context);
        context.getClass();
        this.o2 = true;
        this.p2 = true;
        setHasFixedSize(false);
        setNestedScrollingEnabled(false);
        setItemViewCacheSize(25);
        setOverScrollMode(2);
    }

    public final int getScrolledX() {
        return this.m2;
    }

    public final int getScrolledY() {
        return this.n2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void k0(int i, int i2) {
        this.m2 += i;
        this.n2 += i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void o(lhe0 lhe0Var) {
        lhe0Var.getClass();
        if ((lhe0Var instanceof vlw) && this.o2) {
            this.o2 = false;
            super.o(lhe0Var);
        } else if (!(lhe0Var instanceof mcu0) || !this.p2) {
            super.o(lhe0Var);
        } else {
            this.p2 = false;
            super.o(lhe0Var);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void u0(lhe0 lhe0Var) {
        lhe0Var.getClass();
        if ((lhe0Var instanceof vlw) && !this.o2) {
            this.o2 = true;
            super.u0(lhe0Var);
        } else if (!(lhe0Var instanceof mcu0) || this.p2) {
            super.u0(lhe0Var);
        } else {
            this.p2 = true;
            super.u0(lhe0Var);
        }
    }
}
