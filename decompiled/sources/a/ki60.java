package a;

import android.content.DialogInterface;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/ki60;", "La/iw5;", "<init>", "()V", "a/htz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ki60 extends iw5 {
    public final a8z k2 = maz.a(wez.b, new hi60(this, 0));
    public final a8z l2 = xbc.a0(this, sre0.f32672a.b(oi60.class), null, new hi60(this, 1), 14);
    public final cgx0 m2 = new cgx0("BUNDLE_FROM_ONBOARD_SECTION", false);
    public final zz2 n2 = new zz2("BUNDLE_ONBOARD_SECTION_ID", -1);
    public final phf0 o2 = new phf0("BUNDLE_OPENED_SCREEN_NAME");
    public Function0 p2;
    public static final /* synthetic */ iiy[] r2 = {new ez40(ki60.class, "fromOnboardScreen", "getFromOnboardScreen()Z", 0), new ez40(ki60.class, "onboardSectionId", "getOnboardSectionId()I", 0), new ez40(ki60.class, "openedScreenName", "getOpenedScreenName()Ljava/lang/String;", 0)};
    public static final htz q2 = new htz();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) throws Exception {
        fetVar.e0(2080843221);
        gmq gmqVarC = ((i3t0) P0()).C();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        yje yjeVar = null;
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            objP = new j940((Object) this, yjeVar, (byte) 24);
            fetVar.o0(objP);
        }
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new ji60((i89) gmqVarC, clzVarW, (Function2) objP, null, (byte) 0), 3);
        pz40 pz40VarY = ((i3t0) P0()).y(fetVar);
        int i = ((vi60) pz40VarY.getValue()).e;
        boolean zG = fetVar.g(pz40VarY);
        Object objP2 = fetVar.P();
        byte b = 14;
        if (zG || objP2 == obj) {
            objP2 = new rip(pz40VarY, b);
            fetVar.o0(objP2);
        }
        byte b2 = 2;
        Object objB = zk80.b(i, (Function0) objP2, fetVar, 0, 2);
        boolean zI2 = fetVar.i(this) | fetVar.g(objB);
        Object objP3 = fetVar.P();
        if (zI2 || objP3 == obj) {
            objP3 = new a540(this, objB, b);
            fetVar.o0(objP3);
        }
        Object obj2 = (Function0) objP3;
        boolean zI3 = fetVar.i(this) | fetVar.g(obj2);
        Object objP4 = fetVar.P();
        if (zI3 || objP4 == obj) {
            objP4 = new a540((Object) this, obj2, (byte) 15);
            fetVar.o0(objP4);
        }
        Function0 function0 = (Function0) objP4;
        boolean zI4 = fetVar.i(this);
        Object objP5 = fetVar.P();
        if (zI4 || objP5 == obj) {
            objP5 = new hi60(this, b2);
            fetVar.o0(objP5);
        }
        v3c.A(function0, (Function0) objP5, null, fetVar, 0, 4);
        bw5 bw5Var = new bw5(cw5.a(iw5.O0(1, fetVar), false, false, false, null, 0L, 59), u1c.M(-1579027450, new ngz(pz40VarY, objB, (byte) 23), fetVar), (ugd) null, u1c.M(-1635892796, new eyn(pz40VarY, objB, this, (byte) 26), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    public final k3t0 P0() {
        return (k3t0) this.l2.getValue();
    }

    @Override // a.iw5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        L0().N(3);
        L0().K = true;
    }

    @Override // a.sik, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        Function0 function0 = this.p2;
        if (function0 != null) {
            function0.invoke();
        }
    }
}
