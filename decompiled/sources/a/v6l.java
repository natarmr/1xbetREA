package a;

import android.view.View;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class v6l implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w6l f36883a;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;

    public v6l(w6l w6lVar, long j, boolean z) {
        this.f36883a = w6lVar;
        this.b = j;
        this.c = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.getClass();
        view.removeOnLayoutChangeListener(this);
        w6l w6lVar = this.f36883a;
        clz clzVarL = s7n0.l(w6lVar);
        if (clzVarL != null) {
            tkz tkzVarQ = x0x.Q(clzVarL.x());
            c4m0 c4m0Var = w6lVar.c;
            yje yjeVar = null;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            w6lVar.c = sac.T(new dnq(new fnq(sac.L(4, TimeUnit.SECONDS.toMillis(this.b), 0L), new bk5(w6lVar, this.c, null), (byte) 4), new ko0((Object) w6lVar, yjeVar, (byte) 13), (byte) 0), d5c.S(tkzVarQ, tvk.f34603a), new f1e(2, yjeVar, (byte) 17));
        }
    }
}
