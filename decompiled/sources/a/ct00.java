package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ct00;", "La/iw5;", "<init>", "()V", "a/atz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ct00 extends iw5 {
    public final a8z k2;
    public final kiu0 l2;
    public final yzn0 m2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(ct00.class, "params", "getParams()Lorg/xplatform/personal/api/presentation/model/location_params/LocationChoiceScreenParams;", 0)};
    public static final atz n2 = new atz();
    public static final String p2 = ct00.class.getName();

    public ct00() {
        zs00 zs00Var = new zs00(this, (byte) 0);
        wez wezVar = wez.b;
        this.k2 = maz.a(wezVar, zs00Var);
        be00 be00Var = new be00(new zs00(this, (byte) 1), (byte) 5);
        a8z a8zVarA = maz.a(wezVar, new be00(new be00(this, (byte) 6), (byte) 7));
        this.l2 = agc.G(this, sre0.f32672a.b(nt00.class), new qwv(a8zVarA, (byte) 28), new qwv(a8zVarA, (byte) 29), be00Var);
        this.m2 = new yzn0("PARAMS_KEY");
    }

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        fetVar.e0(-1972643165);
        nt00 nt00VarQ0 = Q0();
        boolean zI = fetVar.i(nt00VarQ0);
        Object objP = fetVar.P();
        cl5 cl5Var = ukd.f35823a;
        if (zI || objP == cl5Var) {
            o0t o0tVar = new o0t(0, nt00VarQ0, nt00.class, "onStartActions", "onStartActions()V", 0, (byte) 13);
            fetVar.o0(o0tVar);
            objP = o0tVar;
        }
        Function0 function0 = (Function0) ((jhy) objP);
        nt00 nt00VarQ1 = Q0();
        boolean zI2 = fetVar.i(nt00VarQ1);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == cl5Var) {
            objP2 = new o0t(0, nt00VarQ1, nt00.class, "onStopActions", "onStopActions()V", 0, (byte) 14);
            fetVar.o0(objP2);
        }
        v3c.A(function0, (Function0) ((jhy) objP2), null, fetVar, 0, 4);
        ugd ugdVar = null;
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(1975026196, new ngz(this, Q0().i, (byte) 5), fetVar), ugdVar, u1c.M(1120486738, new ngz(ydx.E(Q0().g, new kt00(lak0.c, true), null, fetVar, 48, 2), this, (byte) 6), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    @Override // a.iw5
    public final void N0() throws Exception {
        ol60 ol60Var = Q0().h;
        kaw kawVar = new kaw(this, null, (byte) 26);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zd00(ol60Var, clzVarW, kawVar, (yje) null, (byte) 0), 3);
    }

    public final ft00 P0() {
        return (ft00) this.m2.n(this, o2[0]);
    }

    public final nt00 Q0() {
        return (nt00) this.l2.getValue();
    }
}
