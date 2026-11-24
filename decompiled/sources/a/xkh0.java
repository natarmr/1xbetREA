package a;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xkh0;", "La/iw5;", "<init>", "()V", "a/gne0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xkh0 extends iw5 {
    public final a8z k2 = xbc.b0(this, sre0.f32672a.b(hlh0.class), new wkh0(this, 2));
    public final a8z l2 = maz.a(wez.b, new wkh0(this, 3));
    public final khf0 m2 = new khf0("SECRET_QUESTION_CHOICE_SCREEN_PARAMS");
    public static final /* synthetic */ iiy[] o2 = {new ez40(xkh0.class, "params", "getParams()Lorg/xplatform/security/impl/presentation/secret_question_choice/params/SecretQuestionChoiceScreenParams;", 0)};
    public static final gne0 n2 = new gne0((byte) 14);
    public static final String p2 = xkh0.class.getName();

    @Override // a.iw5
    public final bw5 J0(fet fetVar) {
        clz clzVar;
        fetVar.e0(1890639992);
        pz40 pz40VarY = ((i3t0) P0()).y(fetVar);
        k3t0 k3t0VarP0 = P0();
        boolean zI = fetVar.i(this);
        Object objP = fetVar.P();
        Object obj = ukd.f35823a;
        if (zI || objP == obj) {
            objP = new gwg0(this, (byte) 12);
            fetVar.o0(objP);
        }
        clz clzVar2 = (clz) fetVar.k(or00.f25714a);
        lkz lkzVar = lkz.f20223a;
        pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) objP, fetVar);
        boolean zI2 = fetVar.i(k3t0VarP0) | fetVar.i(clzVar2) | fetVar.e(3) | fetVar.g(pz40VarF);
        Object objP2 = fetVar.P();
        if (zI2 || objP2 == obj) {
            clzVar = clzVar2;
            Object kc70Var = new kc70(k3t0VarP0, clzVar, pz40VarF, null, (byte) 16);
            fetVar.o0(kc70Var);
            objP2 = kc70Var;
        } else {
            clzVar = clzVar2;
        }
        m0x0.t(fetVar, clzVar, (Function2) objP2);
        boolean zI3 = fetVar.i(this);
        Object objP3 = fetVar.P();
        byte b = 0;
        if (zI3 || objP3 == obj) {
            objP3 = new wkh0(this, b);
            fetVar.o0(objP3);
        }
        Function0 function0 = (Function0) objP3;
        boolean zI4 = fetVar.i(this);
        Object objP4 = fetVar.P();
        byte b2 = 1;
        if (zI4 || objP4 == obj) {
            objP4 = new wkh0(this, b2);
            fetVar.o0(objP4);
        }
        v3c.A(function0, (Function0) objP4, null, fetVar, 0, 4);
        bw5 bw5Var = new bw5(iw5.O0(1, fetVar), u1c.M(363357545, new tft(pz40VarY, (byte) 16), fetVar), (ugd) null, u1c.M(1254432167, new in80(pz40VarY, this, (byte) 20), fetVar), 10);
        fetVar.r(false);
        return bw5Var;
    }

    public final k3t0 P0() {
        return (k3t0) this.k2.getValue();
    }
}
