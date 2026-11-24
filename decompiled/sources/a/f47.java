package a;

import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.bet_history.bet_sale.presentation.BetSaleScreen;
import org.xplatform.bet_history.core.presentation.BetHistoryScreenModel;
import org.xplatform.bet_history.edit_coupon.presentation.EditCouponFragmentScreen;
import org.xplatform.bet_history.transation_history.presentation.TransactionHistoryScreen;
import org.xplatform.bethistory.history_info.presentation.HistoryInfoScreen;
import org.xplatform.bethistory.sale.presentation.SaleScreen;
import org.xplatform.core.navigation.dialog.DialogScreen;
import org.xplatform.lotto.impl.navigation.LottoScreenFactoryImpl$getLottoScreen$1;
import org.xplatform.toto_jackpot.impl.navigation.TotoJackpotScreens$TotoJackpotDsFragmentScreen;

/* JADX INFO: loaded from: classes3.dex */
public final class f47 extends x2t0 {
    public static final /* synthetic */ int t = 0;
    public final /* synthetic */ byte h = 0;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public final Object p;
    public final Object q;
    public final Object r;
    public final Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f47(uf3 uf3Var, hs60 hs60Var, p4u p4uVar, xcc xccVar, ls lsVar, oeg0 oeg0Var, z4u z4uVar, dcu dcuVar, gw60 gw60Var, gg5 gg5Var, uxs0 uxs0Var, lbu lbuVar) {
        super(new th50((byte) 26));
        oeg0Var.getClass();
        this.i = uf3Var;
        this.j = hs60Var;
        this.k = p4uVar;
        this.l = xccVar;
        this.m = lsVar;
        this.n = oeg0Var;
        this.o = z4uVar;
        this.p = dcuVar;
        this.q = gw60Var;
        this.r = gg5Var;
        this.s = uxs0Var;
    }

    @Override // a.j3t0
    public final /* bridge */ /* synthetic */ Object a(Object obj, bnn0 bnn0Var) {
        switch (this.h) {
            case 0:
                return i((u0k) obj, bnn0Var);
            default:
                return j((aw60) obj, bnn0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object i(u0k u0kVar, zje zjeVar) {
        e47 e47Var;
        ouu ouuVar = (ouu) this.k;
        i1w0 i1w0Var = (i1w0) this.i;
        if (zjeVar instanceof e47) {
            e47Var = (e47) zjeVar;
            int i = e47Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                e47Var.l = i - Integer.MIN_VALUE;
            } else {
                e47Var = new e47(this, zjeVar);
            }
        } else {
            e47Var = new e47(this, zjeVar);
        }
        Object obj = e47Var.j;
        wne wneVar = wne.f39444a;
        int i2 = e47Var.l;
        final byte b = 1;
        if (i2 == 0) {
            z1x.P(obj);
            e47Var.i = u0kVar;
            e47Var.l = 1;
            if (x2t0.f(this, u0kVar, e47Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            u0kVar = e47Var.i;
            z1x.P(obj);
        }
        final byte b2 = 0;
        if (Intrinsics.d(u0kVar, c0k.f3528a)) {
            CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
            ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
            while (true) {
                paw pawVar = (paw) listIteratorP;
                if (!pawVar.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar.next());
            }
        } else if (u0kVar instanceof l0k) {
            ((v88) this.j).a(i1w0Var, true, ((l0k) u0kVar).f19207a);
        } else if (Intrinsics.d(u0kVar, h0k.f12239a)) {
            CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var);
            ListIterator listIteratorP2 = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0Var, copyOnWriteArrayListQ2, 0);
            while (true) {
                paw pawVar2 = (paw) listIteratorP2;
                if (!pawVar2.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar2.next());
            }
        } else if (Intrinsics.d(u0kVar, n0k.f22701a)) {
            CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var);
            ListIterator listIteratorP3 = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, o0w0.f24450a)), i1w0Var, copyOnWriteArrayListQ3, 0);
            while (true) {
                paw pawVar3 = (paw) listIteratorP3;
                if (!pawVar3.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar3.next());
            }
        } else if (u0kVar instanceof q0k) {
            BetHistoryScreenModel betHistoryScreenModel = ((q0k) u0kVar).f27903a;
            CopyOnWriteArrayList copyOnWriteArrayListQ4 = b1j.q(i1w0Var);
            FragmentScreen betSaleScreen = new BetSaleScreen(betHistoryScreenModel);
            if (betSaleScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) betSaleScreen)));
            } else {
                copyOnWriteArrayListQ4.add(new c8d(y7d.f42146a, new w0w0(betSaleScreen)));
            }
            ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ4, 0);
            while (true) {
                paw pawVar4 = (paw) listIteratorO;
                if (!pawVar4.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar4.next());
            }
        } else if (Intrinsics.d(u0kVar, e0k.f6993a)) {
            ouuVar.p(new ab50(0), new Function1(this) { // from class: a.c47
                public final /* synthetic */ f47 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    byte b3 = b2;
                    f47 f47Var = this.b;
                    switch (b3) {
                        case 0:
                            i1w0 i1w0Var2 = (i1w0) obj2;
                            CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var2);
                            FragmentScreen fragmentScreenJ = jh70.j((jh70) f47Var.m, false);
                            if (fragmentScreenJ instanceof DialogScreen) {
                                copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenJ)));
                            } else {
                                copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenJ)));
                            }
                            ListIterator listIteratorO2 = b1j.o(i1w0Var2, copyOnWriteArrayListQ5, 0);
                            while (true) {
                                paw pawVar5 = (paw) listIteratorO2;
                                if (pawVar5.hasNext()) {
                                    i1w0Var2.a((oe50) pawVar5.next());
                                }
                                break;
                            }
                            break;
                        case 1:
                            k0w0 k0w0Var = (k0w0) obj2;
                            k0w0Var.getClass();
                            c8d c8dVar = (c8d) k0w0Var.h(((org.xplatform.toto_bet.core.navigation.a) f47Var.o).a()).f14945a;
                            bjk bjkVar = cfx0.o;
                            c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                            break;
                        case 2:
                            k0w0 k0w0Var2 = (k0w0) obj2;
                            k0w0Var2.getClass();
                            ((s2m0) f47Var.p).getClass();
                            c8d c8dVar2 = (c8d) k0w0Var2.h(new TotoJackpotScreens$TotoJackpotDsFragmentScreen()).f14945a;
                            bjk bjkVar2 = cfx0.o;
                            c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                            break;
                        default:
                            k0w0 k0w0Var3 = (k0w0) obj2;
                            k0w0Var3.getClass();
                            ((evz) f47Var.r).getClass();
                            c8d c8dVar3 = (c8d) k0w0Var3.h(new LottoScreenFactoryImpl$getLottoScreen$1(fd10.c)).f14945a;
                            bjk bjkVar3 = cfx0.o;
                            c8dVar3.f3908a = new v7d(true, bjkVar3, bjkVar3);
                            break;
                    }
                    return Unit.f46060a;
                }
            });
        } else if (u0kVar instanceof i0k) {
            int i3 = d47.f5442a[((i0k) u0kVar).f13951a.ordinal()];
            if (i3 == 1) {
                i1w0Var.d(new Function1(this) { // from class: a.c47
                    public final /* synthetic */ f47 b;

                    {
                        this.b = this;
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        byte b3 = b;
                        f47 f47Var = this.b;
                        switch (b3) {
                            case 0:
                                i1w0 i1w0Var2 = (i1w0) obj2;
                                CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var2);
                                FragmentScreen fragmentScreenJ = jh70.j((jh70) f47Var.m, false);
                                if (fragmentScreenJ instanceof DialogScreen) {
                                    copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenJ)));
                                } else {
                                    copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenJ)));
                                }
                                ListIterator listIteratorO2 = b1j.o(i1w0Var2, copyOnWriteArrayListQ5, 0);
                                while (true) {
                                    paw pawVar5 = (paw) listIteratorO2;
                                    if (pawVar5.hasNext()) {
                                        i1w0Var2.a((oe50) pawVar5.next());
                                    }
                                    break;
                                }
                                break;
                            case 1:
                                k0w0 k0w0Var = (k0w0) obj2;
                                k0w0Var.getClass();
                                c8d c8dVar = (c8d) k0w0Var.h(((org.xplatform.toto_bet.core.navigation.a) f47Var.o).a()).f14945a;
                                bjk bjkVar = cfx0.o;
                                c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                                break;
                            case 2:
                                k0w0 k0w0Var2 = (k0w0) obj2;
                                k0w0Var2.getClass();
                                ((s2m0) f47Var.p).getClass();
                                c8d c8dVar2 = (c8d) k0w0Var2.h(new TotoJackpotScreens$TotoJackpotDsFragmentScreen()).f14945a;
                                bjk bjkVar2 = cfx0.o;
                                c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                                break;
                            default:
                                k0w0 k0w0Var3 = (k0w0) obj2;
                                k0w0Var3.getClass();
                                ((evz) f47Var.r).getClass();
                                c8d c8dVar3 = (c8d) k0w0Var3.h(new LottoScreenFactoryImpl$getLottoScreen$1(fd10.c)).f14945a;
                                bjk bjkVar3 = cfx0.o;
                                c8dVar3.f3908a = new v7d(true, bjkVar3, bjkVar3);
                                break;
                        }
                        return Unit.f46060a;
                    }
                });
            } else {
                final byte b3 = 2;
                if (i3 == 2) {
                    i1w0Var.d(new Function1(this) { // from class: a.c47
                        public final /* synthetic */ f47 b;

                        {
                            this.b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            byte b4 = b3;
                            f47 f47Var = this.b;
                            switch (b4) {
                                case 0:
                                    i1w0 i1w0Var2 = (i1w0) obj2;
                                    CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var2);
                                    FragmentScreen fragmentScreenJ = jh70.j((jh70) f47Var.m, false);
                                    if (fragmentScreenJ instanceof DialogScreen) {
                                        copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenJ)));
                                    } else {
                                        copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenJ)));
                                    }
                                    ListIterator listIteratorO2 = b1j.o(i1w0Var2, copyOnWriteArrayListQ5, 0);
                                    while (true) {
                                        paw pawVar5 = (paw) listIteratorO2;
                                        if (pawVar5.hasNext()) {
                                            i1w0Var2.a((oe50) pawVar5.next());
                                        }
                                        break;
                                    }
                                    break;
                                case 1:
                                    k0w0 k0w0Var = (k0w0) obj2;
                                    k0w0Var.getClass();
                                    c8d c8dVar = (c8d) k0w0Var.h(((org.xplatform.toto_bet.core.navigation.a) f47Var.o).a()).f14945a;
                                    bjk bjkVar = cfx0.o;
                                    c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                                    break;
                                case 2:
                                    k0w0 k0w0Var2 = (k0w0) obj2;
                                    k0w0Var2.getClass();
                                    ((s2m0) f47Var.p).getClass();
                                    c8d c8dVar2 = (c8d) k0w0Var2.h(new TotoJackpotScreens$TotoJackpotDsFragmentScreen()).f14945a;
                                    bjk bjkVar2 = cfx0.o;
                                    c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                                    break;
                                default:
                                    k0w0 k0w0Var3 = (k0w0) obj2;
                                    k0w0Var3.getClass();
                                    ((evz) f47Var.r).getClass();
                                    c8d c8dVar3 = (c8d) k0w0Var3.h(new LottoScreenFactoryImpl$getLottoScreen$1(fd10.c)).f14945a;
                                    bjk bjkVar3 = cfx0.o;
                                    c8dVar3.f3908a = new v7d(true, bjkVar3, bjkVar3);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                } else {
                    final byte b4 = 3;
                    if (i3 == 3 && ((pru) this.l).a().D1) {
                        i1w0Var.d(new Function1(this) { // from class: a.c47
                            public final /* synthetic */ f47 b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                byte b5 = b4;
                                f47 f47Var = this.b;
                                switch (b5) {
                                    case 0:
                                        i1w0 i1w0Var2 = (i1w0) obj2;
                                        CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var2);
                                        FragmentScreen fragmentScreenJ = jh70.j((jh70) f47Var.m, false);
                                        if (fragmentScreenJ instanceof DialogScreen) {
                                            copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenJ)));
                                        } else {
                                            copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenJ)));
                                        }
                                        ListIterator listIteratorO2 = b1j.o(i1w0Var2, copyOnWriteArrayListQ5, 0);
                                        while (true) {
                                            paw pawVar5 = (paw) listIteratorO2;
                                            if (pawVar5.hasNext()) {
                                                i1w0Var2.a((oe50) pawVar5.next());
                                            }
                                            break;
                                        }
                                        break;
                                    case 1:
                                        k0w0 k0w0Var = (k0w0) obj2;
                                        k0w0Var.getClass();
                                        c8d c8dVar = (c8d) k0w0Var.h(((org.xplatform.toto_bet.core.navigation.a) f47Var.o).a()).f14945a;
                                        bjk bjkVar = cfx0.o;
                                        c8dVar.f3908a = new v7d(true, bjkVar, bjkVar);
                                        break;
                                    case 2:
                                        k0w0 k0w0Var2 = (k0w0) obj2;
                                        k0w0Var2.getClass();
                                        ((s2m0) f47Var.p).getClass();
                                        c8d c8dVar2 = (c8d) k0w0Var2.h(new TotoJackpotScreens$TotoJackpotDsFragmentScreen()).f14945a;
                                        bjk bjkVar2 = cfx0.o;
                                        c8dVar2.f3908a = new v7d(true, bjkVar2, bjkVar2);
                                        break;
                                    default:
                                        k0w0 k0w0Var3 = (k0w0) obj2;
                                        k0w0Var3.getClass();
                                        ((evz) f47Var.r).getClass();
                                        c8d c8dVar3 = (c8d) k0w0Var3.h(new LottoScreenFactoryImpl$getLottoScreen$1(fd10.c)).f14945a;
                                        bjk bjkVar3 = cfx0.o;
                                        c8dVar3.f3908a = new v7d(true, bjkVar3, bjkVar3);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    } else if (i3 == 4) {
                        CopyOnWriteArrayList copyOnWriteArrayListQ5 = b1j.q(i1w0Var);
                        FragmentScreen fragmentScreenQ = ((peg0) this.q).q(new hr1(0L, 3));
                        if (fragmentScreenQ instanceof DialogScreen) {
                            copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenQ)));
                        } else {
                            copyOnWriteArrayListQ5.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenQ)));
                        }
                        ListIterator listIteratorO2 = b1j.o(i1w0Var, copyOnWriteArrayListQ5, 0);
                        while (true) {
                            paw pawVar5 = (paw) listIteratorO2;
                            if (!pawVar5.hasNext()) {
                                break;
                            }
                            i1w0Var.a((oe50) pawVar5.next());
                        }
                    } else {
                        ouuVar.q(new bb50(true), true);
                    }
                }
            }
        } else if (u0kVar instanceof j0k) {
            j0k j0kVar = (j0k) u0kVar;
            FragmentScreen fragmentScreenH = ((y3v) this.n).h(j0kVar.f15686a, j0kVar.b);
            i1w0Var.getClass();
            k0w0 k0w0Var = new k0w0(i1w0Var);
            k0w0Var.c(null);
            k0w0Var.h(fragmentScreenH);
            ListIterator listIteratorO3 = b1j.o(i1w0Var, k0w0Var.f17489a, 0);
            while (true) {
                paw pawVar6 = (paw) listIteratorO3;
                if (!pawVar6.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar6.next());
            }
        } else if (u0kVar instanceof g0k) {
            g0k g0kVar = (g0k) u0kVar;
            n3w n3wVar = g0kVar.f10463a;
            long j = g0kVar.b;
            sys0 sys0Var = g0kVar.c;
            k0w0 k0w0VarI = cs0.i(i1w0Var, i1w0Var);
            k0w0VarI.h(new HistoryInfoScreen(n3wVar, false, j, false, sys0Var));
            ListIterator listIteratorO4 = b1j.o(i1w0Var, k0w0VarI.f17489a, 0);
            while (true) {
                paw pawVar7 = (paw) listIteratorO4;
                if (!pawVar7.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar7.next());
            }
        } else if (u0kVar instanceof f0k) {
            f0k f0kVar = (f0k) u0kVar;
            i1w0Var.d(new qo5(f0kVar.f8721a, f0kVar.b, (byte) 22));
        } else if (u0kVar instanceof d0k) {
            CopyOnWriteArrayList copyOnWriteArrayListQ6 = b1j.q(i1w0Var);
            FragmentScreen editCouponFragmentScreen = new EditCouponFragmentScreen(((d0k) u0kVar).f5271a);
            if (editCouponFragmentScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ6.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) editCouponFragmentScreen)));
            } else {
                copyOnWriteArrayListQ6.add(new c8d(y7d.f42146a, new w0w0(editCouponFragmentScreen)));
            }
            ListIterator listIteratorO5 = b1j.o(i1w0Var, copyOnWriteArrayListQ6, 0);
            while (true) {
                paw pawVar8 = (paw) listIteratorO5;
                if (!pawVar8.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar8.next());
            }
        } else if (u0kVar instanceof a0k) {
            i1w0Var.d(new os5((a0k) u0kVar, (byte) 17));
        } else if (u0kVar instanceof b0k) {
            b0k b0kVar = (b0k) u0kVar;
            k0w0 k0w0VarI2 = cs0.i(i1w0Var, i1w0Var);
            k0w0VarI2.h(new SaleScreen(b0kVar.f1768a, true, b0kVar.b, b0kVar.c));
            ListIterator listIteratorO6 = b1j.o(i1w0Var, k0w0VarI2.f17489a, 0);
            while (true) {
                paw pawVar9 = (paw) listIteratorO6;
                if (!pawVar9.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar9.next());
            }
        } else if (u0kVar instanceof o0k) {
            i1w0Var.d(new os5((o0k) u0kVar, (byte) 18));
        } else if (u0kVar instanceof p0k) {
            p0k p0kVar = (p0k) u0kVar;
            k0w0 k0w0VarI3 = cs0.i(i1w0Var, i1w0Var);
            k0w0VarI3.h(new SaleScreen(p0kVar.f26155a, false, p0kVar.b, false));
            ListIterator listIteratorO7 = b1j.o(i1w0Var, k0w0VarI3.f17489a, 0);
            while (true) {
                paw pawVar10 = (paw) listIteratorO7;
                if (!pawVar10.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar10.next());
            }
        } else if (u0kVar instanceof r0k) {
            i1w0Var.d(new qo5(this, (r0k) u0kVar, (byte) 23));
        } else if (u0kVar instanceof s0k) {
            s0k s0kVar = (s0k) u0kVar;
            String str = s0kVar.f31412a;
            String strValueOf = String.valueOf(s0kVar.b);
            CopyOnWriteArrayList copyOnWriteArrayListQ7 = b1j.q(i1w0Var);
            FragmentScreen transactionHistoryScreen = new TransactionHistoryScreen(str, strValueOf);
            if (transactionHistoryScreen instanceof DialogScreen) {
                copyOnWriteArrayListQ7.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) transactionHistoryScreen)));
            } else {
                copyOnWriteArrayListQ7.add(new c8d(y7d.f42146a, new w0w0(transactionHistoryScreen)));
            }
            ListIterator listIteratorO8 = b1j.o(i1w0Var, copyOnWriteArrayListQ7, 0);
            while (true) {
                paw pawVar11 = (paw) listIteratorO8;
                if (!pawVar11.hasNext()) {
                    break;
                }
                i1w0Var.a((oe50) pawVar11.next());
            }
        } else if (u0kVar instanceof t0k) {
            i1w0Var.d(new os5(((t0k) u0kVar).f33123a, (byte) 19));
        } else if (Intrinsics.d(u0kVar, k0k.f17471a)) {
            ((qe50) ouuVar.b).a(new xa50(), false);
        } else if (u0kVar instanceof m0k) {
            m0k m0kVar = (m0k) u0kVar;
            i1w0Var.d(new mz0((Object) this, (Object) m0kVar.f20958a, m0kVar.b, (byte) 6));
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b8, code lost:
    
        if (r0 == r6) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(a.aw60 r19, a.zje r20) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f47.j(a.aw60, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0098  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b3, code lost:
    
        if (kotlin.Unit.f46060a == r6) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(a.z470 r14, java.lang.String r15, a.zje r16) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f47.k(a.z470, java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0091  */
    /* JADX WARN: Code duplicated, block: B:42:0x0093 A[Catch: all -> 0x0059, TryCatch #2 {all -> 0x0059, blocks: (B:23:0x0055, B:39:0x008d, B:51:0x00a4, B:54:0x00b9, B:55:0x00be, B:56:0x00bf, B:42:0x0093, B:45:0x0099), top: B:78:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0097  */
    /* JADX WARN: Code duplicated, block: B:45:0x0099 A[Catch: all -> 0x0059, TryCatch #2 {all -> 0x0059, blocks: (B:23:0x0055, B:39:0x008d, B:51:0x00a4, B:54:0x00b9, B:55:0x00be, B:56:0x00bf, B:42:0x0093, B:45:0x0099), top: B:78:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x009d  */
    /* JADX WARN: Code duplicated, block: B:48:0x009f  */
    /* JADX WARN: Code duplicated, block: B:50:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4 A[Catch: all -> 0x0059, TryCatch #2 {all -> 0x0059, blocks: (B:23:0x0055, B:39:0x008d, B:51:0x00a4, B:54:0x00b9, B:55:0x00be, B:56:0x00bf, B:42:0x0093, B:45:0x0099), top: B:78:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:53:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b9 A[Catch: all -> 0x0059, TryCatch #2 {all -> 0x0059, blocks: (B:23:0x0055, B:39:0x008d, B:51:0x00a4, B:54:0x00b9, B:55:0x00be, B:56:0x00bf, B:42:0x0093, B:45:0x0099), top: B:78:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00bf A[Catch: all -> 0x0059, TRY_LEAVE, TryCatch #2 {all -> 0x0059, blocks: (B:23:0x0055, B:39:0x008d, B:51:0x00a4, B:54:0x00b9, B:55:0x00be, B:56:0x00bf, B:42:0x0093, B:45:0x0099), top: B:78:0x0055 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cf, code lost:
    
        if (m(r14, r3) == r4) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00fb, code lost:
    
        if (r0 == r4) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object l(a.mz60 r18, int r19, int r20, java.lang.String r21, a.zje r22) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.f47.l(a.mz60, int, int, java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(mz60 mz60Var, zje zjeVar) {
        um60 um60Var;
        if (zjeVar instanceof um60) {
            um60Var = (um60) zjeVar;
            int i = um60Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                um60Var.l = i - Integer.MIN_VALUE;
            } else {
                um60Var = new um60(this, zjeVar);
            }
        } else {
            um60Var = new um60(this, zjeVar);
        }
        Object objA = um60Var.j;
        wne wneVar = wne.f39444a;
        int i2 = um60Var.l;
        if (i2 == 0) {
            z1x.P(objA);
            z4u z4uVar = (z4u) this.o;
            long jD = x1x.D(mz60Var.b);
            um60Var.i = mz60Var;
            um60Var.l = 1;
            objA = z4uVar.a(jD, um60Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            mz60Var = um60Var.i;
            z1x.P(objA);
        }
        boolean zBooleanValue = ((Boolean) objA).booleanValue();
        FragmentScreen fragmentScreenM0 = jtv.M0(6, x1x.D(mz60Var.b), null);
        if (fragmentScreenM0 == null) {
            return Unit.f46060a;
        }
        ((oeg0) this.n).c().d(new qm60(fragmentScreenM0, zBooleanValue, (byte) 0));
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f47(i1w0 i1w0Var, v88 v88Var, ouu ouuVar, pru pruVar, jh70 jh70Var, y3v y3vVar, org.xplatform.toto_bet.core.navigation.a aVar, s2m0 s2m0Var, peg0 peg0Var, evz evzVar, r9u r9uVar) {
        super(new t07((byte) 4));
        r9uVar.getClass();
        this.i = i1w0Var;
        this.j = v88Var;
        this.k = ouuVar;
        this.l = pruVar;
        this.m = jh70Var;
        this.n = y3vVar;
        this.o = aVar;
        this.p = s2m0Var;
        this.q = peg0Var;
        this.r = evzVar;
        this.s = r9uVar;
    }
}
