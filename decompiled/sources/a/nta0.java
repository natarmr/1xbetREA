package a;

import android.content.DialogInterface;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/nta0;", "La/iw5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nta0 extends iw5 {
    public static final /* synthetic */ int m2 = 0;
    public final a8z k2 = maz.a(wez.b, new mta0(this, (byte) 0));
    public final a8z l2 = xbc.b0(this, sre0.f32672a.b(ota0.class), new mta0(this, (byte) 1));

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1101791007);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), (xdr) null, (ugd) null, u1c.M(1272658384, new ri1(((i3t0) ((k3t0) this.l2.getValue())).y(fetVar), this, (byte) 11), fetVar), 14);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.sik, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        ((k3t0) this.l2.getValue()).x(dqa0.f6505a);
    }
}
