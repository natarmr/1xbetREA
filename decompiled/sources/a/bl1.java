package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bl1 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2774a;
    public final /* synthetic */ cl1 b;
    public final /* synthetic */ l7m0 c;

    public /* synthetic */ bl1(cl1 cl1Var, l7m0 l7m0Var, byte b) {
        this.f2774a = b;
        this.b = cl1Var;
        this.c = l7m0Var;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        byte b = this.f2774a;
        l7m0 l7m0Var = this.c;
        cl1 cl1Var = this.b;
        switch (b) {
            case 0:
                y5d y5dVar = (y5d) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                gfk0 gfk0Var = cl1.o2;
                y5dVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(y5dVar) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    xcz xczVarA = ddz.a(0, 0, fetVar, 0, 3);
                    mm40 mm40VarV = cjx.V(jm40.b, a8k0.G(xczVarA, fetVar), null);
                    boolean zI = ((iIntValue & 14) == 4) | fetVar.i(cl1Var) | fetVar.g(l7m0Var);
                    Object objP = fetVar.P();
                    if (zI || objP == ukd.f35823a) {
                        objP = new on((Object) l7m0Var, (Object) y5dVar, (Object) cl1Var, (byte) 7);
                        fetVar.o0(objP);
                    }
                    b8k0.e(mm40VarV, xczVarA, null, null, null, null, false, null, (Function1) objP, fetVar, 0, 508);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                gfk0 gfk0Var2 = cl1.o2;
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    zcl zclVar = qmk.f28987a;
                    kkb.m(s5x0.N(jm40.b, 0.0f, 8.0f, 0.0f, 0.0f, 13), w6x.q(cl1Var.H(R.string.you_participating_tournament), "\n ", ((el1) l7m0Var.getValue()).f7977a), null, 0, 0L, 0L, fetVar2, 0, 60);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
