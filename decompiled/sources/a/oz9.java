package a;

import android.content.Context;
import android.view.OrientationEventListener;

/* JADX INFO: loaded from: classes3.dex */
public final class oz9 extends OrientationEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ qz9 f26094a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oz9(qz9 qz9Var, Context context) {
        super(context);
        this.f26094a = qz9Var;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        if (i != -1) {
            kl5 kl5Var = qz9.t2;
            qz9 qz9Var = this.f26094a;
            d4a d4aVarS0 = qz9Var.S0();
            float rotation = qz9Var.I0().k.getRotation();
            sac.V(jiu0.a(d4aVarS0), new d69((byte) 6), null, d4aVarS0.b.b, new c4a(i, d4aVarS0, rotation, null), 10);
        }
    }
}
