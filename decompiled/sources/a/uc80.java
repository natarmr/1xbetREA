package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class uc80 implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35417a;
    public final /* synthetic */ mdm b;

    public /* synthetic */ uc80(mdm mdmVar, byte b) {
        this.f35417a = b;
        this.b = mdmVar;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        switch (this.f35417a) {
            case 0:
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((ir8) obj).getClass();
                if (fetVar.U(iIntValue & 1, (iIntValue & 17) != 16)) {
                    n0q n0qVar = o7k0.c;
                    ch80 ch80VarG = knm0.g(s5x0.u(xfn.a(fetVar).c, 0.0f, xfn.a(fetVar).c, 0.0f, 10), fetVar);
                    nw3 nw3Var = uc9.e;
                    mdm mdmVar = this.b;
                    boolean zG = fetVar.g(mdmVar);
                    Object objP = fetVar.P();
                    if (zG || objP == ukd.f35823a) {
                        objP = new cd60((Object) mdmVar, (byte) 26);
                        fetVar.o0(objP);
                    }
                    b8k0.e(n0qVar, null, ch80VarG, nw3Var, null, null, false, null, (Function1) objP, fetVar, 24576, 490);
                } else {
                    fetVar.X();
                }
                break;
            default:
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((g9z) obj).getClass();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    jcb.l(null, this.b, true, null, fetVar2, 384, 9);
                } else {
                    fetVar2.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
