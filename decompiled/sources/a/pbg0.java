package a;

import java.net.SocketTimeoutException;
import java.net.UnknownHostException;

/* JADX INFO: loaded from: classes5.dex */
public final class pbg0 extends w46 {
    public final yfu b;
    public final mne c;
    public final i1w0 d;
    public final j1q0 e;
    public final duj f;
    public final sa10 g;
    public final ol60 h;

    public pbg0(yfu yfuVar, mne mneVar, i1w0 i1w0Var, j1q0 j1q0Var, duj dujVar, sa10 sa10Var) {
        j1q0Var.getClass();
        this.b = yfuVar;
        this.c = mneVar;
        this.d = i1w0Var;
        this.e = j1q0Var;
        this.f = dujVar;
        this.g = sa10Var;
        this.h = new ol60(3);
        bvc bvcVarA = jiu0.a(this);
        dvj dvjVar = mneVar.b;
        yje yjeVar = null;
        byte b = 29;
        sac.i0(bvcVarA, "RewardSystemPresenter.getSessionId", 5, 2L, q3d.j(SocketTimeoutException.class, UnknownHostException.class, oqt0.class), null, new coc0(this, yjeVar, b), null, dvjVar, new eme0(this, (byte) 19), null, 592);
        sac.V(jiu0.a(this), new aif0(1, this, pbg0.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 17), null, mneVar.f22085a, new d7a0(this, yjeVar, b), 10);
    }
}
