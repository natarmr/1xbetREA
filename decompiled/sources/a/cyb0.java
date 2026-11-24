package a;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class cyb0 extends xhe0 {
    public final View u;
    public final /* synthetic */ byte v;
    public final yfu0 w;

    /* JADX WARN: Illegal instructions before constructor call */
    public cyb0(dyb0 dyb0Var, ttx ttxVar) {
        this.v = (byte) 0;
        ConstraintLayout constraintLayout = ttxVar.b;
        constraintLayout.getClass();
        this(constraintLayout);
        this.w = ttxVar;
        dyb.b0(this.u, ymx.INTERVAL_500, new zga0((Object) this, (Object) dyb0Var, (byte) 22));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public cyb0(dtx dtxVar) {
        this(dtxVar.b);
        this.v = (byte) 1;
        this.w = dtxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyb0(View view) {
        super(view);
        view.getClass();
        this.u = view;
    }
}
