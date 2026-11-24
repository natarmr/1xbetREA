package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/gup0;", "La/iw5;", "<init>", "()V", "a/m6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class gup0 extends iw5 {
    public final khf0 k2 = new khf0("BUNDLE_KEY_BOTTOM_SHEET_PARAMS");
    public final a8z l2 = maz.a(wez.b, new eup0(this, (byte) 2));
    public final a8z m2 = xbc.a0(this, sre0.f32672a.b(xup0.class), null, new eup0(this, (byte) 3), 14);
    public static final /* synthetic */ iiy[] o2 = {new ez40(gup0.class, "params", "getParams()Lorg/xplatform/mailing/api/presentation/models/TelegramBonusCodeParams;", 0)};
    public static final m6m0 n2 = new m6m0((byte) 16);

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        clz clzVar;
        fetVar.e0(2084339315);
        pz40 pz40VarY = ((i3t0) P0()).y(fetVar);
        k3t0 k3t0VarP0 = P0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            objP = new nop0(this, (byte) 5);
            fetVar.o0(objP);
        }
        clz clzVar2 = (clz) fetVar.k(or00.f25714a);
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
        boolean zI2 = fetVar.i(k3t0VarP0) | fetVar.i(clzVar2) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            clzVar = clzVar2;
            Object kc70Var = new kc70(k3t0VarP0, clzVar, pz40VarF, null, (byte) 21);
            fetVar.o0(kc70Var);
            objP2 = kc70Var;
        } else {
            clzVar = clzVar2;
        }
        m0x0.t(fetVar, clzVar, (Function2) objP2);
        boolean zI3 = fetVar.i(this);
        Object objP3 = fetVar.P();
        if (zI3 || objP3 == obj) {
            objP3 = new eup0(this, (byte) 0);
            fetVar.o0(objP3);
        }
        Function0 function0 = (Function0) objP3;
        boolean zI4 = fetVar.i(this);
        Object objP4 = fetVar.P();
        if (zI4 || objP4 == obj) {
            objP4 = new eup0(this, (byte) 1);
            fetVar.o0(objP4);
        }
        v3c.z(function0, (Function0) objP4, null, fetVar, 0, 4);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(-852544414, new tft(pz40VarY, (byte) 24), fetVar), u1c.M(-468011478, new nhl0(pz40VarY, this, (byte) 19), fetVar), u1c.M(1474617956, new tft(pz40VarY, (byte) 25), fetVar), 2);
        fetVar.r(false);
        return bw5Var;
    }

    public final k3t0 P0() {
        return (k3t0) this.m2.getValue();
    }
}
