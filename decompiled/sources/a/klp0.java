package a;

import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xplatform.uikit.compose.color.StaticColors;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class klp0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18503a;
    public final /* synthetic */ llp0 b;

    public /* synthetic */ klp0(llp0 llp0Var) {
        this.f18503a = (byte) 1;
        this.b = llp0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f18503a;
        llp0 llp0Var = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                afn0.g(llp0Var, (fet) obj, x8x.L(1));
                return Unit.f46060a;
            case 1:
                shd shdVar = gqw0.v;
                shd shdVar2 = gqw0.y;
                shd shdVar3 = gqw0.w;
                shd shdVar4 = gqw0.x;
                a4x a4xVar = llp0Var.b;
                fet fetVar = (fet) obj;
                int iIntValue = ((Integer) obj2).intValue();
                yx7 yx7Var = gqw0.j;
                boolean z = false;
                if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                    jm40 jm40Var = jm40.b;
                    mm40 mm40VarD = o7k0.d(jm40Var, 1.0f);
                    zcl zclVar = qmk.f28987a;
                    mm40 mm40VarN = s5x0.N(mm40VarD, 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    thg0 thg0VarA = shg0.a(uc9.f35418a, yx7Var, fetVar, 0);
                    int iHashCode = Long.hashCode(fetVar.T);
                    bh90 bh90VarM = fetVar.m();
                    mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarN);
                    mkd.c0.getClass();
                    fetVar.i0();
                    boolean z2 = fetVar.S;
                    pcy pcyVar = e7z.u1;
                    if (z2) {
                        fetVar.l(pcyVar);
                    } else {
                        fetVar.r0();
                    }
                    jpm0.o(fetVar, thg0VarA, shdVar4);
                    jpm0.o(fetVar, bh90VarM, shdVar3);
                    vqd.u(iHashCode, fetVar, shdVar2, fetVar);
                    Iterator itO = h97.o(fetVar, mm40VarC0, shdVar, -1877660139, a4xVar);
                    int i = 0;
                    while (itO.hasNext()) {
                        Object next = itO.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            q3d.p();
                            throw null;
                        }
                        xem0 xem0Var = (xem0) next;
                        zcl zclVar2 = qmk.f28987a;
                        mm40 mm40VarE = o7k0.e(jm40Var, 24.0f);
                        shd shdVar5 = shdVar2;
                        long j = xem0Var.e;
                        float f = xem0Var.d;
                        zcl zclVar3 = qmk.d;
                        ugg0 ugg0Var = vgg0.f37379a;
                        mm40 mm40VarH = dw9.h(1.0f, i120.Q(mm40VarE, j, new ugg0(zclVar3, zclVar3, zclVar3, zclVar3)), true);
                        thg0 thg0VarA2 = shg0.a(uc9.e, yx7Var, fetVar, 6);
                        int i3 = i;
                        int iHashCode2 = Long.hashCode(fetVar.T);
                        bh90 bh90VarM2 = fetVar.m();
                        mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarH);
                        mkd.c0.getClass();
                        fetVar.i0();
                        if (fetVar.S) {
                            fetVar.l(pcyVar);
                        } else {
                            fetVar.r0();
                        }
                        jpm0.o(fetVar, thg0VarA2, shdVar4);
                        jpm0.o(fetVar, bh90VarM2, shdVar3);
                        vqd.u(iHashCode2, fetVar, shdVar5, fetVar);
                        jpm0.o(fetVar, mm40VarC1, shdVar);
                        pm80 pm80VarF = a8k0.F(xem0Var.f40750a, 0, fetVar);
                        mm40 mm40VarN2 = o7k0.n(jm40Var, 16.0f);
                        yx7 yx7Var2 = gqw0.k;
                        pcy pcyVar2 = pcyVar;
                        yx7 yx7Var3 = yx7Var;
                        a4x a4xVar2 = a4xVar;
                        shd shdVar6 = shdVar;
                        shd shdVar7 = shdVar3;
                        shd shdVar8 = shdVar4;
                        jm40 jm40Var2 = jm40Var;
                        j0x.b(pm80VarF, null, epv0.N(mm40VarN2.e(new ecu0(yx7Var2)), f), null, null, 0.0f, null, fetVar, 56, 120);
                        if (xem0Var.c) {
                            fetVar.e0(-1999238529);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (objP == cl5Var) {
                                objP = androidx.compose.runtime.e.e(new daq0(qmk.r));
                                fetVar.o0(objP);
                            }
                            pz40 pz40Var = (pz40) objP;
                            qxw.o(fetVar, o7k0.s(jm40Var2, 4.0f));
                            String strValueOf = String.valueOf(xem0Var.b);
                            mm40 mm40VarN3 = epv0.N(new ecu0(yx7Var2), f);
                            long jM123getWhite0d7_KjU = StaticColors.INSTANCE.m123getWhite0d7_KjU();
                            long j2 = ((daq0) pz40Var.getValue()).f5764a;
                            Object objP2 = fetVar.P();
                            if (objP2 == cl5Var) {
                                objP2 = new dbo0(pz40Var, (byte) 3);
                                fetVar.o0(objP2);
                            }
                            fet fetVar2 = fetVar;
                            v8q0.a(strValueOf, mm40VarN3, jM123getWhite0d7_KjU, null, j2, null, null, null, 0L, null, 0L, 2, false, 1, 0, (Function1) objP2, new y9q0(0L, qmk.r, null, j1t0.f15753a, 0L, null, 0, 0, qmk.F, 16646109), fetVar2, 0, 1597824, 45032);
                            fetVar = fetVar2;
                            fetVar.r(false);
                        } else {
                            fetVar.e0(-1998207376);
                            fetVar.r(false);
                        }
                        fetVar.r(true);
                        if (i3 != q3d.i(a4xVar2)) {
                            fetVar.e0(1133863807);
                            qxw.o(fetVar, o7k0.s(jm40Var2, 6.0f));
                            fetVar.r(false);
                        } else {
                            fetVar.e0(1133937804);
                            fetVar.r(false);
                        }
                        a4xVar = a4xVar2;
                        yx7Var = yx7Var3;
                        shdVar2 = shdVar5;
                        jm40Var = jm40Var2;
                        z = false;
                        i = i2;
                        shdVar = shdVar6;
                        shdVar3 = shdVar7;
                        pcyVar = pcyVar2;
                        shdVar4 = shdVar8;
                    }
                    fetVar.r(z);
                    fetVar.r(true);
                } else {
                    fetVar.X();
                }
                return Unit.f46060a;
            default:
                ((Integer) obj2).getClass();
                afn0.g(llp0Var, (fet) obj, x8x.L(1));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ klp0(llp0 llp0Var, int i, byte b) {
        this.f18503a = b;
        this.b = llp0Var;
    }
}
