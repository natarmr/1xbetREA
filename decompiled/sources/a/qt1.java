package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class qt1 implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29278a;
    public final /* synthetic */ float b;
    public final /* synthetic */ l7m0 c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ qt1(float f, l7m0 l7m0Var, Function1 function1, byte b) {
        this.f29278a = b;
        this.b = f;
        this.c = l7m0Var;
        this.d = function1;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        int i3;
        byte b = this.f29278a;
        cl5 cl5Var = ukd.f35823a;
        jm40 jm40Var = jm40.b;
        Function1 function1 = this.d;
        l7m0 l7m0Var = this.c;
        switch (b) {
            case 0:
                l7m0 l7m0Var2 = (l7m0) obj;
                fet fetVar = (fet) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                l7m0Var2.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= fetVar.g(l7m0Var2) ? 4 : 2;
                }
                if (fetVar.U(iIntValue & 1, (iIntValue & 1027) != 1026)) {
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    fu1 fu1VarE = ((ev1) l7m0Var.getValue()).e();
                    boolean zG = fetVar.g(function1);
                    Object objP = fetVar.P();
                    if (zG || objP == cl5Var) {
                        objP = new si1(function1, (byte) 11);
                        fetVar.o0(objP);
                    }
                    gq80.f(mm40VarD, l7m0Var2, this.b, fu1VarE, (Function0) objP, fetVar, ((iIntValue << 3) & 112) | 6);
                    vbc.f(l7m0Var2, R.attr.uikitBackgroundContent, fetVar, iIntValue & 14);
                } else {
                    fetVar.X();
                }
                break;
            case 1:
                l7m0 l7m0Var3 = (l7m0) obj;
                ycl yclVar = (ycl) obj3;
                fet fetVar2 = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                l7m0Var3.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = iIntValue2 | (fetVar2.g(l7m0Var3) ? 4 : 2);
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 384) == 0) {
                    i |= fetVar2.d(yclVar.f42389a) ? 256 : 128;
                }
                if (fetVar2.U(i & 1, (i & 1155) != 1154)) {
                    mm40 mm40VarD2 = o7k0.d(jm40Var, 1.0f);
                    float f = yclVar.f42389a;
                    fu1 fu1VarE2 = ((ev1) l7m0Var.getValue()).e();
                    boolean zG2 = fetVar2.g(function1);
                    Object objP2 = fetVar2.P();
                    if (zG2 || objP2 == cl5Var) {
                        objP2 = new si1(function1, (byte) 14);
                        fetVar2.o0(objP2);
                    }
                    int i4 = i << 3;
                    xia0.c(mm40VarD2, l7m0Var3, this.b, f, fu1VarE2, (Function0) objP2, fetVar2, (i4 & 112) | 6 | (i4 & 7168));
                    vbc.f(l7m0Var3, R.attr.uikitBackgroundContent, fetVar2, i & 14);
                } else {
                    fetVar2.X();
                }
                break;
            case 2:
                l7m0 l7m0Var4 = (l7m0) obj;
                ycl yclVar2 = (ycl) obj3;
                fet fetVar3 = (fet) obj4;
                int iIntValue3 = ((Integer) obj5).intValue();
                l7m0Var4.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue3 & 6) == 0) {
                    i2 = iIntValue3 | (fetVar3.g(l7m0Var4) ? 4 : 2);
                } else {
                    i2 = iIntValue3;
                }
                if ((iIntValue3 & 384) == 0) {
                    i2 |= fetVar3.d(yclVar2.f42389a) ? 256 : 128;
                }
                if (fetVar3.U(i2 & 1, (i2 & 1155) != 1154)) {
                    mm40 mm40VarD3 = o7k0.d(jm40Var, 1.0f);
                    float f2 = yclVar2.f42389a;
                    fu1 fu1VarE3 = ((ev1) l7m0Var.getValue()).e();
                    boolean zG3 = fetVar3.g(function1);
                    Object objP3 = fetVar3.P();
                    if (zG3 || objP3 == cl5Var) {
                        objP3 = new si1(function1, (byte) 16);
                        fetVar3.o0(objP3);
                    }
                    int i5 = i2 << 3;
                    ro4.i(mm40VarD3, l7m0Var4, this.b, f2, fu1VarE3, (Function0) objP3, fetVar3, (i5 & 112) | 6 | (i5 & 7168));
                    vbc.f(l7m0Var4, R.attr.uikitBackgroundContent, fetVar3, i2 & 14);
                } else {
                    fetVar3.X();
                }
                break;
            default:
                l7m0 l7m0Var5 = (l7m0) obj;
                ycl yclVar3 = (ycl) obj3;
                fet fetVar4 = (fet) obj4;
                int iIntValue4 = ((Integer) obj5).intValue();
                l7m0Var5.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue4 & 6) == 0) {
                    i3 = (fetVar4.g(l7m0Var5) ? 4 : 2) | iIntValue4;
                } else {
                    i3 = iIntValue4;
                }
                if ((iIntValue4 & 384) == 0) {
                    i3 |= fetVar4.d(yclVar3.f42389a) ? 256 : 128;
                }
                if (fetVar4.U(i3 & 1, (i3 & 1155) != 1154)) {
                    mm40 mm40VarD4 = o7k0.d(jm40Var, 1.0f);
                    float f3 = yclVar3.f42389a;
                    fu1 fu1VarE4 = ((ev1) l7m0Var.getValue()).e();
                    boolean zG4 = fetVar4.g(function1);
                    Object objP4 = fetVar4.P();
                    if (zG4 || objP4 == cl5Var) {
                        objP4 = new si1(function1, (byte) 18);
                        fetVar4.o0(objP4);
                    }
                    int i6 = i3 << 3;
                    hu1.a(mm40VarD4, l7m0Var5, this.b, f3, fu1VarE4, (Function0) objP4, fetVar4, (i6 & 112) | 6 | (i6 & 7168));
                    vbc.f(l7m0Var5, R.attr.uikitBackgroundContent, fetVar4, i3 & 14);
                } else {
                    fetVar4.X();
                }
                break;
        }
        return Unit.f46060a;
    }
}
