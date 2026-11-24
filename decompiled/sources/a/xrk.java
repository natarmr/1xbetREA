package a;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class xrk implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41375a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xrk(Object obj, Object obj2, Object obj3, byte b) {
        this.f41375a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41375a;
        pcy pcyVar = e7z.u1;
        jm40 jm40Var = jm40.b;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                fet fetVar = (fet) obj;
                int iIntValue = ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj5;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = o7k0.n(jm40Var, 56.0f);
                    Object objP = fetVar.P();
                    cl5 cl5Var = ukd.f35823a;
                    if (objP == cl5Var) {
                        objP = dw9.j(fetVar);
                    }
                    gy40 gy40Var = (gy40) objP;
                    boolean zG = fetVar.g(function0);
                    Object objP2 = fetVar.P();
                    if (zG || objP2 == cl5Var) {
                        objP2 = new lfk(function0, (byte) 2);
                        fetVar.o0(objP2);
                    }
                    mm40 mm40VarE0 = o2e.e0(y860.W(mm40VarN, gy40Var, null, false, null, (Function0) objP2, 28), "ICON_ARROW");
                    l7m0 l7m0Var = (l7m0) obj4;
                    l7m0 l7m0Var2 = (l7m0) obj3;
                    tj30 tj30VarC = zq8.c(gqw0.e, false);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarE0);
                    mkd.c0.getClass();
                    fetVar.i0();
                    if (fetVar.S) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, tj30VarC, gqw0.x);
                    jpm0.o(fetVar, bh90VarM, gqw0.w);
                    jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                    jpm0.n(fetVar);
                    jpm0.o(fetVar, mm40VarC0, gqw0.v);
                    dww.c(a8k0.F(R.drawable.ic_glyph_arrow_left, 0, fetVar), null, s5x0.J(i120.Q(o7k0.n(lgb.J(jm40Var, vgg0.f37379a), 36.0f), ((y3d) l7m0Var2.getValue()).f41946a, jd8.n), 6.0f), ((y3d) l7m0Var.getValue()).f41946a, fetVar, 56, 0);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            case 1:
                fet fetVar2 = (fet) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (fetVar2.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    zsm0.e(null, (tim) ((vim) obj5), (u3n) obj4, (Function1) obj3, fetVar2, 0);
                } else {
                    fetVar2.X();
                }
                return Unit.f46060a;
            case 2:
                p650 p650Var = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var.getClass();
                List<jge> list = p650Var.h;
                String str = (String) obj5;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                boolean z = false;
                for (jge cgeVar : list) {
                    if (f140.w(cgeVar, str) && (cgeVar instanceof cge)) {
                        da8 da8Var = (da8) ((ha8) obj4);
                        rh10 rh10Var = (rh10) da8Var.b;
                        zh10 zh10Var = rh10Var.b;
                        zh10 zh10VarA = zh10.a(zh10Var, yh10.a(zh10Var.b, (wi10) obj3));
                        rh10Var.getClass();
                        cgeVar = new cge(da8.b(da8Var, new rh10(false, zh10VarA)));
                        z = true;
                    }
                    arrayList.add(cgeVar);
                }
                return z ? p650.a(p650Var, null, arrayList, null, false, 262015) : p650Var;
            case 3:
                p650 p650Var2 = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var2.getClass();
                List<jge> list2 = p650Var2.h;
                String str2 = (String) obj5;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                boolean z2 = false;
                for (jge cgeVar2 : list2) {
                    if (f140.w(cgeVar2, str2) && (cgeVar2 instanceof cge)) {
                        da8 da8Var2 = (da8) ((ha8) obj4);
                        rh10 rh10Var2 = (rh10) da8Var2.b;
                        zh10 zh10Var2 = rh10Var2.b;
                        yh10 yh10Var = zh10Var2.b;
                        ri10 ri10Var = (ri10) obj3;
                        cgeVar2 = new cge(da8.b(da8Var2, rh10.a(rh10Var2, false, zh10.a(zh10Var2, yh10.a(yh10Var, wi10.a(yh10Var.c, ri10Var.f30517a, ri10Var.b, ri10Var.c, ri10Var.e))), 1)));
                        z2 = true;
                    }
                    arrayList2.add(cgeVar2);
                    p650Var2 = p650Var2;
                }
                p650 p650Var3 = p650Var2;
                return z2 ? p650.a(p650Var3, null, arrayList2, null, false, 262015) : p650Var3;
            case 4:
                p650 p650Var4 = (p650) obj2;
                ((oyg0) obj).getClass();
                p650Var4.getClass();
                List<jge> list3 = p650Var4.h;
                String str3 = (String) obj5;
                ArrayList arrayList3 = new ArrayList(r3d.q(list3, 10));
                boolean z3 = false;
                for (jge zfeVar : list3) {
                    if (f140.w(zfeVar, str3) && (zfeVar instanceof zfe)) {
                        zfeVar = new zfe(new da8(((ha8) obj4).a(), ((t2j) ((w2j) obj3)).f33217a, false));
                        z3 = true;
                    }
                    arrayList3.add(zfeVar);
                }
                return z3 ? p650.a(p650Var4, null, arrayList3, null, false, 262015) : p650Var4;
            default:
                fet fetVar3 = (fet) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (fetVar3.U(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    mm40 mm40VarO = kbc.O(jm40Var, new bkh((oms0) obj5, (byte) 6));
                    ugd ugdVar = (ugd) obj4;
                    axq0 axq0Var = (axq0) obj3;
                    tj30 tj30VarC2 = zq8.c(gqw0.f11754a, false);
                    int iX = e3c.x(fetVar3);
                    bh90 bh90VarM2 = fetVar3.m();
                    mm40 mm40VarC1 = kbc.c0(fetVar3, mm40VarO);
                    mkd.c0.getClass();
                    fetVar3.i0();
                    if (fetVar3.S) {
                        fetVar3.l(pcyVar);
                    } else {
                        fetVar3.r0();
                    }
                    jpm0.o(fetVar3, tj30VarC2, gqw0.x);
                    jpm0.o(fetVar3, bh90VarM2, gqw0.w);
                    shd shdVar = gqw0.y;
                    if (fetVar3.S || !Intrinsics.d(fetVar3.P(), Integer.valueOf(iX))) {
                        rw2.t(iX, fetVar3, iX, shdVar);
                    }
                    jpm0.o(fetVar3, mm40VarC1, gqw0.v);
                    ugdVar.F(axq0Var, fetVar3, 6);
                    fetVar3.r(true);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
        }
    }
}
