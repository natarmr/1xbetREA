package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gcd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11054a;
    public final /* synthetic */ fak0 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ gcd(byte b, fak0 fak0Var, Function1 function1) {
        this.f11054a = b;
        this.b = fak0Var;
        this.c = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f11054a;
        Function1 function1 = this.c;
        fak0 fak0Var = this.b;
        byte b2 = 1;
        fet fetVar = (fet) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (b) {
            case 0:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    vsm0.g(s5x0.N(jm40.b, 12.0f, 0.0f, 6.0f, 0.0f, 10), fak0Var, function1, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    mm40 mm40VarD = o7k0.d(jm40.b, 1.0f);
                    zcl zclVar2 = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarD, 8.0f, 0.0f, 8.0f, 8.0f, 2);
                    wul wulVar = new wul(lul.e, oe9.c, new ue9(fak0Var.p), true, false, false);
                    boolean zG = fetVar.g(function1) | fetVar.g(fak0Var);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new ecd((byte) 2, fak0Var, function1);
                        fetVar.o0(objP);
                    }
                    qzb.n(mm40VarN, wulVar, (Function0) objP, fetVar, 0, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 2:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    obc.d(bmd.n.a(k6z.f17794a), u1c.M(-1462592056, new gcd(b2, fak0Var, function1), fetVar), fetVar, 56);
                } else {
                    fetVar.X();
                }
                break;
            case 3:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar3 = qmk.f28987a;
                    vsm0.g(s5x0.N(jm40.b, 12.0f, 0.0f, 6.0f, 0.0f, 10), fak0Var, function1, fetVar, 0);
                } else {
                    fetVar.X();
                }
                break;
            case 4:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rsm0.k(fak0Var.c, fak0Var.h, function1, fetVar);
                } else {
                    fetVar.X();
                }
                break;
            default:
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    rsm0.k(fak0Var.c, fak0Var.i, function1, fetVar);
                } else {
                    fetVar.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
