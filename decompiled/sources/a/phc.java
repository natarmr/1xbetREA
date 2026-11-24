package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class phc implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26989a = 1;
    public final /* synthetic */ xhc b;
    public final /* synthetic */ wpq c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ phc(xhc xhcVar, wpq wpqVar, Function1 function1) {
        this.b = xhcVar;
        this.c = wpqVar;
        this.d = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f26989a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        Function1 function1 = this.d;
        wpq wpqVar = this.c;
        xhc xhcVar = this.b;
        switch (b) {
            case 0:
                hh80 hh80Var = (hh80) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                hh80Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(hh80Var) ? 4 : 2;
                }
                if (fetVar.U(1 & iIntValue, (iIntValue & 19) != 18)) {
                    if (xhcVar.f) {
                        fetVar.e0(1058063578);
                        i120.A(0, fetVar);
                    } else {
                        fetVar.e0(-1559759760);
                    }
                    fetVar.r(false);
                    mm40 mm40VarN = s5x0.N(s5x0.I(jm40Var, hh80Var), xfn.a(fetVar).d, 0.0f, xfn.a(fetVar).d, 0.0f, 10);
                    boolean zG = fetVar.g(xhcVar) | fetVar.g(function1) | fetVar.i(wpqVar);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new sw8((Object) xhcVar, (Object) function1, (Object) wpqVar, (byte) 7);
                        fetVar.o0(objP);
                    }
                    b8k0.e(mm40VarN, null, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 510);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar2.U(1 & iIntValue2, (iIntValue2 & 17) != 16)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarK = s5x0.K(mm40VarD, 16.0f, 8.0f);
                    wul wulVar = new wul(lul.e, oe9.f25112a, new ue9(xsm0.s(R.string.save_changes, fetVar2)), xhcVar.e, false, false);
                    boolean zI = fetVar2.i(wpqVar) | fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zI || objP2 == cl5Var) {
                        objP2 = new qhc(wpqVar, function1, (byte) 0);
                        fetVar2.o0(objP2);
                    }
                    qzb.n(mm40VarK, wulVar, (Function0) objP2, fetVar2, 0, 0);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ phc(xhc xhcVar, Function1 function1, wpq wpqVar) {
        this.b = xhcVar;
        this.d = function1;
        this.c = wpqVar;
    }
}
