package a;

import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class jz6 implements kmq, fer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17394a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jz6(Object obj, byte b) {
        this.f17394a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x02bc  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        Object objA;
        Object value;
        Object value2;
        byte b = this.f17394a;
        boolean z = false;
        yje yjeVar2 = null;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                b07 b07Var = (b07) obj2;
                List list = b07.w;
                b07Var.A();
                sac.V(jiu0.a(b07Var), new ur6(1, b07Var, b07.class, "handleShopLoadError", "handleShopLoadError(Ljava/lang/Throwable;)V", 0, (byte) 13), null, null, new ex1((Object) b07Var, obj, yjeVar2, (byte) 12), 14);
                return Unit.f46060a;
            case 1:
                ((v7c) obj2).P.f(new g7c((String) obj));
                return Unit.f46060a;
            case 2:
                ((g1e) obj2).C.f(new d0e((String) obj));
                return Unit.f46060a;
            case 3:
                List list2 = (List) obj;
                uhs uhsVar = (uhs) obj2;
                int i = uhs.J;
                uhsVar.H(new lo1(list2, ((CharSequence) ((p7m0) uhsVar.D).getValue()).length() == 0, (byte) 1));
                return Unit.f46060a;
            case 4:
                List list3 = (List) obj;
                qi00 qi00Var = (qi00) obj2;
                int i2 = qi00.I;
                qi00Var.H(new lo1(list3, ((nj00) qi00Var.D()).h.length() == 0, (byte) 2));
                return Unit.f46060a;
            case 5:
                i16 i16Var = (i16) obj;
                e910 e910Var = (e910) obj2;
                qoj0 qoj0Var = e910Var.l;
                if (i16Var == null) {
                    objA = Unit.f46060a;
                } else if (i16Var instanceof f16) {
                    objA = e910Var.x(yjeVar);
                    if (objA != wne.f39444a) {
                        objA = Unit.f46060a;
                    }
                } else if (i16Var instanceof w06) {
                    objA = qoj0Var.a(new u810(((w06) i16Var).f38335a && !e910Var.j), yjeVar);
                    wne wneVar = wne.f39444a;
                    if (objA != wneVar) {
                        objA = Unit.f46060a;
                    }
                    if (objA != wneVar) {
                        objA = Unit.f46060a;
                    }
                } else if (i16Var instanceof v06) {
                    if (e910Var.j) {
                        i1w0 i1w0Var = e910Var.h;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            } else {
                                objA = Unit.f46060a;
                            }
                        }
                    } else {
                        objA = qoj0Var.a(v810.f36959a, yjeVar);
                        if (objA != wne.f39444a) {
                            objA = Unit.f46060a;
                        }
                    }
                    if (objA != wne.f39444a) {
                        objA = Unit.f46060a;
                    }
                } else if (i16Var instanceof g16) {
                    e910Var.j = true;
                    p7m0 p7m0Var = e910Var.k;
                    p7m0Var.getClass();
                    p7m0Var.o(null, z810.f43945a);
                    e910Var.i.d(false);
                    objA = qoj0Var.a(new u810(false), yjeVar);
                    wne wneVar2 = wne.f39444a;
                    if (objA != wneVar2) {
                        objA = Unit.f46060a;
                    }
                    if (objA != wneVar2) {
                        objA = Unit.f46060a;
                    }
                } else {
                    objA = Unit.f46060a;
                }
                return objA == wne.f39444a ? objA : Unit.f46060a;
            case 6:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((ebo0) obj2).f7529a.o(null, bool);
                return Unit.f46060a;
            case 7:
                i16 i16Var2 = (i16) obj;
                ns30 ns30Var = (ns30) obj2;
                p7m0 p7m0Var2 = ns30Var.q;
                if (i16Var2 != null) {
                    if (i16Var2 instanceof f16) {
                        ns30Var.m = true;
                        do {
                            value2 = p7m0Var2.getValue();
                        } while (!p7m0Var2.m(value2, ks30.a((ks30) value2, false, ns30Var.m, 1)));
                    } else if (i16Var2 instanceof w06) {
                        boolean z2 = ((w06) i16Var2).f38335a;
                        if (z2 && ns30Var.l == null) {
                            ns30Var.y();
                        }
                        if (z2) {
                            ns30Var.x();
                        }
                    } else if (i16Var2 instanceof g16) {
                        ns30Var.m = false;
                        ns30Var.l = null;
                        bby bbyVar = ns30Var.r;
                        if (bbyVar != null) {
                            bbyVar.cancel(null);
                        }
                        do {
                            value = p7m0Var2.getValue();
                            ((ks30) value).getClass();
                        } while (!p7m0Var2.m(value, new ks30(false, false)));
                        ns30Var.z(cs30.f4870a);
                        ns30Var.k.d(false);
                        if (ns30Var.i.c()) {
                            ns30Var.x();
                            ns30Var.y();
                        }
                    }
                }
                return Unit.f46060a;
            case 8:
                Object objM = ((yyj0) obj2).b.m(yjeVar, (fl80) obj);
                return objM == wne.f39444a ? objM : Unit.f46060a;
            case 9:
                i16 i16Var3 = (i16) obj;
                p7m0 p7m0Var3 = ((nkc0) obj2).b;
                if (i16Var3 != null) {
                    if (i16Var3 instanceof z06) {
                        boolean z3 = ((z06) i16Var3).f43550a;
                        if (p7m0Var3.getValue() instanceof lkc0) {
                            p7m0Var3.o(null, new lkc0(z3));
                        }
                    } else if (i16Var3 instanceof e16) {
                        boolean z4 = ((e16) i16Var3).f7023a.e > 0;
                        if (p7m0Var3.getValue() instanceof lkc0) {
                            p7m0Var3.o(null, new lkc0(z4));
                        }
                    } else if (i16Var3 instanceof a16) {
                        kkc0 kkc0Var = new kkc0(((a16) i16Var3).f55a.b);
                        p7m0Var3.getClass();
                        p7m0Var3.o(null, kkc0Var);
                    } else if (i16Var3 instanceof g16) {
                        lkc0 lkc0Var = new lkc0(false);
                        p7m0Var3.getClass();
                        p7m0Var3.o(null, lkc0Var);
                    }
                }
                return Unit.f46060a;
            case 10:
                i16 i16Var4 = (i16) obj;
                clc0 clc0Var = (clc0) obj2;
                if (i16Var4 != null) {
                    if (i16Var4 instanceof f16) {
                        clc0Var.m = true;
                        boolean z5 = ((f16) i16Var4).f8750a;
                        clc0Var.n = z5;
                        if (!clc0Var.l) {
                            clc0Var.z(z5, false);
                        }
                    } else if ((i16Var4 instanceof x06) || (i16Var4 instanceof y06)) {
                        clc0Var.z(true, true);
                    } else if (i16Var4 instanceof a16) {
                        clc0Var.m = false;
                        clc0Var.z(true, true);
                    } else if (i16Var4 instanceof w06) {
                        boolean z6 = ((w06) i16Var4).f38335a;
                        clc0Var.o = z6;
                        if (z6 && !clc0Var.m && !clc0Var.k.f34357a.b.b) {
                            z = true;
                        }
                        clc0Var.z(true, z);
                        if (z6) {
                            sac.V(jiu0.a(clc0Var), new ljc0((byte) 4), null, null, new vkc0(clc0Var, null, (byte) 2), 14);
                        }
                    } else if (i16Var4 instanceof g16) {
                        clc0Var.m = false;
                        clc0Var.n = false;
                        clc0Var.z(true, clc0Var.o);
                    }
                }
                return Unit.f46060a;
            case 11:
                ((AtomicReference) obj2).set((dji0) obj);
                Unit unit = Unit.f46060a;
                wne wneVar3 = wne.f39444a;
                return unit;
            default:
                i16 i16Var5 = (i16) obj;
                cqs0 cqs0Var = (cqs0) obj2;
                p7m0 p7m0Var4 = cqs0Var.l;
                if (i16Var5 != null) {
                    if (i16Var5 instanceof f16) {
                        p7m0Var4.getClass();
                        p7m0Var4.o(null, yps0.f43047a);
                    } else if (i16Var5 instanceof w06) {
                        twn.A(((w06) i16Var5).f38335a, cqs0Var.m, null);
                    } else {
                        boolean z7 = i16Var5 instanceof x06;
                        wps0 wps0Var = wps0.f39556a;
                        if (z7) {
                            p7m0Var4.getClass();
                            p7m0Var4.o(null, wps0Var);
                        } else if (i16Var5 instanceof g16) {
                            p7m0Var4.getClass();
                            p7m0Var4.o(null, wps0Var);
                            cqs0Var.k.d(false);
                            qps0 qps0Var = (qps0) ((h0q0) cqs0Var.j.b).f12247a;
                            qps0Var.getClass();
                            qps0Var.f29136a = new qx90(0, 0, 0, 0L);
                        }
                    }
                }
                return Unit.f46060a;
        }
    }

    @Override // a.fer
    public final wdr b() {
        byte b = this.f17394a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new xo(2, (b07) obj, b07.class, "handleBalances", "handleBalances(Lorg/xplatform/bonus_games/impl/core/presentation/balance/BalanceItemUiModel;)V", 4);
            case 1:
                return new xo(2, (v7c) obj, v7c.class, "onReceivedSmsCode", "onReceivedSmsCode(Ljava/lang/String;)V", 4);
            case 2:
                return new xo(2, (g1e) obj, g1e.class, "onReceivedSmsCode", "onReceivedSmsCode(Ljava/lang/String;)V", 4);
            case 3:
                return new xo(2, (uhs) obj, uhs.class, "onDataLoaded", "onDataLoaded(Ljava/util/List;)V", 4);
            case 4:
                return new xo(2, (qi00) obj, qi00.class, "onDataLoaded", "onDataLoaded(Ljava/util/List;)V", 4);
            case 5:
                return new rer(2, (e910) obj, e910.class, "handleCommand", "handleCommand(Lorg/xplatform/bonus_games/impl/core/domain/models/BasePromoGameCommand;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            case 6:
                return new xo(2, (ebo0) obj, ebo0.class, "setContentScrollable", "setContentScrollable(Z)V", 4);
            case 7:
                return new xo(2, (ns30) obj, ns30.class, "handleCommand", "handleCommand(Lorg/xplatform/bonus_games/impl/core/domain/models/BasePromoGameCommand;)V", 4);
            case 8:
                return new rer(2, (yyj0) obj, yyj0.class, "send", "send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            case 9:
                return new xo(2, (nkc0) obj, nkc0.class, "handleCommand", "handleCommand(Lorg/xplatform/bonus_games/impl/core/domain/models/BasePromoGameCommand;)V", 4);
            case 10:
                return new xo(2, (clc0) obj, clc0.class, "handleCommand", "handleCommand(Lorg/xplatform/bonus_games/impl/core/domain/models/BasePromoGameCommand;)V", 4);
            case 11:
                return new xo(2, (AtomicReference) obj, AtomicReference.class, "set", "set(Ljava/lang/Object;)V", 4);
            default:
                return new xo(2, (cqs0) obj, cqs0.class, "handleCommand", "handleCommand(Lorg/xplatform/bonus_games/impl/core/domain/models/BasePromoGameCommand;)V", 4);
        }
    }

    public final boolean equals(Object obj) {
        switch (this.f17394a) {
            case 0:
                if ((obj instanceof kmq) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
            case 1:
                if ((obj instanceof kmq) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
            case 2:
                if ((obj instanceof kmq) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
            case 3:
                if ((obj instanceof kmq) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
            case 4:
                if ((obj instanceof kmq) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
            case 5:
                if ((obj instanceof kmq) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
            case 6:
                if ((obj instanceof kmq) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
            case 7:
                if ((obj instanceof kmq) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
            case 8:
                if ((obj instanceof kmq) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
            case 9:
                if ((obj instanceof kmq) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
            case 10:
                if ((obj instanceof kmq) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
            case 11:
                if ((obj instanceof kmq) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
            default:
                if ((obj instanceof kmq) && (obj instanceof fer)) {
                    return b().equals(((fer) obj).b());
                }
                return false;
        }
    }

    public final int hashCode() {
        switch (this.f17394a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
        }
        return b().hashCode();
    }
}
