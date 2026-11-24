package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j6b implements xdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15976a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ j6b(byte b, long j, Function1 function1) {
        this.f15976a = b;
        this.b = j;
        this.c = function1;
    }

    @Override // a.xdr
    public final Object F(Object obj, Object obj2, Object obj3) {
        ugg0 ugg0Var;
        byte b = this.f15976a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        Function1 function1 = this.c;
        long j = this.b;
        switch (b) {
            case 0:
                i8b i8bVar = (i8b) obj;
                fet fetVar = (fet) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                i8bVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(i8bVar) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 19) != 18)) {
                    if (i8bVar.c) {
                        zcl zclVar = qmk.i;
                        zcl zclVar2 = qmk.f28987a;
                        ugg0Var = new ugg0(zclVar, zclVar, zclVar2, zclVar2);
                    } else {
                        zcl zclVar3 = qmk.i;
                        ugg0 ugg0Var2 = vgg0.f37379a;
                        ugg0Var = new ugg0(zclVar3, zclVar3, zclVar3, zclVar3);
                    }
                    mm40 mm40VarD = o7k0.d(s5x0.L(i120.Q(lgb.J(jm40Var, ugg0Var), j, jd8.n), 0.0f, 6.0f, 1), 1.0f);
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new ag0(function1, (byte) 19);
                        fetVar.o0(objP);
                    }
                    lvm0.b(mm40VarD, i8bVar, (Function2) objP, ntr.c, ntr.d, fetVar, ((iIntValue << 3) & 112) | 27648);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                i8b i8bVar2 = (i8b) obj;
                fet fetVar2 = (fet) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                i8bVar2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= fetVar2.g(i8bVar2) ? 4 : 2;
                }
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    mm40 mm40VarQ = i120.Q(jm40Var, j, jd8.n);
                    zcl zclVar4 = qmk.f28987a;
                    mm40 mm40VarD2 = o7k0.d(s5x0.K(mm40VarQ, 8.0f, 4.0f), 1.0f);
                    boolean zG2 = fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new ag0(function1, (byte) 20);
                        fetVar2.o0(objP2);
                    }
                    lvm0.b(mm40VarD2, i8bVar2, (Function2) objP2, mrv.c, mrv.d, fetVar2, ((iIntValue2 << 3) & 112) | 27648);
                } else {
                    fetVar2.X();
                }
                break;
            default:
                y8m y8mVar = (y8m) obj;
                fet fetVar3 = (fet) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                y8mVar.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= fetVar3.g(y8mVar) ? 4 : 2;
                }
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    b9m.a(this.b, y8mVar, this.c, fetVar3, (iIntValue3 << 3) & 112);
                } else {
                    fetVar3.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
