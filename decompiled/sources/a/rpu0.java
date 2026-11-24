package a;

import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class rpu0 implements zdr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30902a = 1;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ l7m0 g;

    public /* synthetic */ rpu0(qdz qdzVar, d930 d930Var, Function1 function1, Function1 function2, l7m0 l7m0Var, pz40 pz40Var) {
        this.d = qdzVar;
        this.e = d930Var;
        this.c = function1;
        this.f = function2;
        this.b = l7m0Var;
        this.g = pz40Var;
    }

    @Override // a.zdr
    public final Object O(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        fet fetVar;
        int i;
        byte b = this.f30902a;
        l7m0 l7m0Var = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        Object obj8 = this.d;
        l7m0 l7m0Var2 = this.b;
        switch (b) {
            case 0:
                qdz qdzVar = (qdz) obj8;
                d930 d930Var = (d930) obj7;
                Function1 function1 = (Function1) obj6;
                pz40 pz40Var = (pz40) l7m0Var;
                fet fetVar2 = (fet) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                ((hh80) obj).getClass();
                ((l7m0) obj2).getClass();
                ((l7m0) obj3).getClass();
                if (fetVar2.U(iIntValue & 1, (iIntValue & 1025) != 1024)) {
                    ipu0 ipu0Var = (ipu0) l7m0Var2.getValue();
                    if (ipu0Var != null) {
                        boolean z = ipu0Var instanceof gpu0;
                        Function1 function2 = this.c;
                        cl5 cl5Var = ukd.f35823a;
                        if (z) {
                            fetVar2.e0(-1342285080);
                            Object objP = fetVar2.P();
                            if (objP == cl5Var) {
                                objP = jgk0.b(new jxr0(pz40Var, (byte) 7));
                                fetVar2.o0(objP);
                            }
                            l7m0 l7m0Var3 = (l7m0) objP;
                            Object objP2 = fetVar2.P();
                            if (objP2 == cl5Var) {
                                objP2 = jgk0.b(new jxr0(pz40Var, (byte) 8));
                                fetVar2.o0(objP2);
                            }
                            p8a.K(l7m0Var3, (l7m0) objP2, ddz.a(0, 0, fetVar2, 0, 3), qdzVar, d930Var, function2, function1, fetVar2, 438);
                            fetVar2.r(false);
                        } else {
                            fetVar = fetVar2;
                            if (ipu0Var instanceof hpu0) {
                                fetVar.e0(-1341465905);
                                n0q n0qVar = o7k0.c;
                                tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
                                int iHashCode = Long.hashCode(fetVar.T);
                                bh90 bh90VarM = fetVar.m();
                                mm40 mm40VarC0 = kbc.c0(fetVar, n0qVar);
                                mkd.c0.getClass();
                                fetVar.i0();
                                if (fetVar.S) {
                                    fetVar.l(e7z.u1);
                                } else {
                                    fetVar.r0();
                                }
                                jpm0.o(fetVar, tj30VarC, gqw0.x);
                                jpm0.o(fetVar, bh90VarM, gqw0.w);
                                jpm0.o(fetVar, Integer.valueOf(iHashCode), gqw0.y);
                                jpm0.n(fetVar);
                                jpm0.o(fetVar, mm40VarC0, gqw0.v);
                                mm40 mm40VarB = jr8.f16991a.b(jm40.b, gqw0.e);
                                mdm mdmVar = ((hpu0) ipu0Var).f13460a;
                                boolean zG = fetVar.g(function2);
                                Object objP3 = fetVar.P();
                                if (zG || objP3 == cl5Var) {
                                    objP3 = new zbt0(function2, (byte) 23);
                                    fetVar.o0(objP3);
                                }
                                jcb.l(mm40VarB, mdmVar, false, (Function0) objP3, fetVar, 0, 4);
                                fetVar.r(true);
                                fetVar.r(false);
                            }
                        }
                    } else {
                        fetVar = fetVar2;
                    }
                    throw b1j.f(787981184, fetVar, false);
                }
                fetVar2.X();
                return Unit.f46060a;
            default:
                xk80 xk80Var = (xk80) obj8;
                l7m0 l7m0Var4 = (l7m0) obj7;
                l7m0 l7m0Var5 = (l7m0) obj6;
                l7m0 l7m0Var6 = (l7m0) obj;
                ycl yclVar = (ycl) obj3;
                fet fetVar3 = (fet) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                l7m0Var6.getClass();
                ((l7m0) obj2).getClass();
                if ((iIntValue2 & 6) == 0) {
                    i = (fetVar3.g(l7m0Var6) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 384) == 0) {
                    i |= fetVar3.d(yclVar.f42389a) ? 256 : 128;
                }
                if (fetVar3.U(i & 1, (i & 1155) != 1154)) {
                    fg10 fg10Var = (fg10) CollectionsKt.W(xk80Var.k(), ((mh10) l7m0Var2.getValue()).d);
                    String str = null;
                    if (fg10Var != null) {
                        twa twaVar = fg10Var.f9470a;
                        if (twaVar instanceof rwa) {
                            str = ((rwa) twaVar).b;
                        }
                    }
                    if (str == null) {
                        str = "";
                    }
                    s0x.j(null, l7m0Var6, ((ycl) l7m0Var4.getValue()).f42389a, ((ycl) l7m0Var5.getValue()).f42389a, yclVar.f42389a, ((mh10) l7m0Var2.getValue()).f21768a, str, this.c, u1c.M(1379952871, new eyn(l7m0Var, xk80Var, l7m0Var2, (byte) 19), fetVar3), fetVar3, ((i << 3) & 112) | 100663296 | (57344 & (i << 6)));
                    m0x0.j(l7m0Var6, fetVar3, i & 14);
                } else {
                    fetVar3.X();
                }
                return Unit.f46060a;
        }
    }

    public /* synthetic */ rpu0(l7m0 l7m0Var, bwj bwjVar, l7m0 l7m0Var2, l7m0 l7m0Var3, Function1 function1, l7m0 l7m0Var4) {
        this.b = l7m0Var;
        this.d = bwjVar;
        this.e = l7m0Var2;
        this.f = l7m0Var3;
        this.c = function1;
        this.g = l7m0Var4;
    }
}
