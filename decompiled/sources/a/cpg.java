package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cpg implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4744a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ cpg(byte b, boolean z) {
        this.f4744a = b;
        this.b = z;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        long jE;
        byte b = this.f4744a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        jr8 jr8Var = jr8.f16991a;
        boolean z = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                a4x a4xVar = (a4x) obj3;
                ((x8z) obj).getClass();
                a4xVar.getClass();
                if (((p6t0) a4xVar.get(iIntValue)) instanceof kxs) {
                    jE = (z && p7x.D(a4xVar, z)) ? q8x.e(1) : q8x.e(2);
                } else {
                    jE = (z && (((p6t0) a4xVar.get(iIntValue)) instanceof uxx)) ? q8x.e(1) : q8x.e(2);
                }
                return new pgv(jE);
            case 1:
                fet fetVar = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    mm40 mm40VarA = jr8Var.a(jm40Var);
                    boolean zH = fetVar.h(z);
                    Object objP = fetVar.P();
                    if (zH || objP == cl5Var) {
                        objP = new jno((byte) 4, z);
                        fetVar.o0(objP);
                    }
                    zq8.a(0, fetVar, rq8.L(mm40VarA, (Function1) objP));
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                fet fetVar2 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((u63) obj).getClass();
                if (fetVar2.U(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    mm40 mm40VarA2 = jr8Var.a(jm40Var);
                    boolean zH2 = fetVar2.h(z);
                    Object objP2 = fetVar2.P();
                    if (zH2 || objP2 == cl5Var) {
                        objP2 = new jno((byte) 3, z);
                        fetVar2.o0(objP2);
                    }
                    zq8.a(0, fetVar2, rq8.L(mm40VarA2, (Function1) objP2));
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
        }
    }
}
