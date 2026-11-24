package a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.bet_history.sale.presentation.model.SaleScreenModel;

/* JADX INFO: loaded from: classes3.dex */
public final class dxg0 extends i3t0 {
    public static final /* synthetic */ int F = 0;
    public final ot A;
    public final m1e B;
    public final duj C;
    public final i1w0 D;
    public c4m0 E;
    public final SaleScreenModel o;
    public final mne p;
    public final ctf0 q;
    public final pru r;
    public final nrt s;
    public final x1u t;
    public final b8u u;
    public final z7u v;
    public final nj7 w;
    public final jru x;
    public final jw20 y;
    public final ilt0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dxg0(SaleScreenModel saleScreenModel, vzg0 vzg0Var, mne mneVar, ctf0 ctf0Var, ocl oclVar, pru pruVar, ryu ryuVar, nrt nrtVar, luu luuVar, x1u x1uVar, b8u b8uVar, z7u z7uVar, nj7 nj7Var, jru jruVar, jw20 jw20Var, ilt0 ilt0Var, ot otVar, m1e m1eVar, duj dujVar, i1w0 i1w0Var) {
        super(vzg0Var, new enm((Object) pruVar, (Object) ryuVar, (Object) saleScreenModel, (Object) luuVar, (byte) 29), cvm0.p(mneVar.c, mneVar.f22085a), new gpb0(ctf0Var, oclVar, (byte) 6));
        ctf0Var.getClass();
        m1eVar.getClass();
        this.o = saleScreenModel;
        this.p = mneVar;
        this.q = ctf0Var;
        this.r = pruVar;
        this.s = nrtVar;
        this.t = x1uVar;
        this.u = b8uVar;
        this.v = z7uVar;
        this.w = nj7Var;
        this.x = jruVar;
        this.y = jw20Var;
        this.z = ilt0Var;
        this.A = otVar;
        this.B = m1eVar;
        this.C = dujVar;
        this.D = i1w0Var;
    }

    public final void M() {
        i1w0 i1w0Var = this.D;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final double N(double d) {
        return ((svg0) D()).m ? Math.floor(d) : d;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object O(zje zjeVar) {
        wwg0 wwg0Var;
        if (zjeVar instanceof wwg0) {
            wwg0Var = (wwg0) zjeVar;
            int i = wwg0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wwg0Var.k = i - Integer.MIN_VALUE;
            } else {
                wwg0Var = new wwg0(this, zjeVar);
            }
        } else {
            wwg0Var = new wwg0(this, zjeVar);
        }
        Object objA = wwg0Var.i;
        Object obj = wne.f39444a;
        int i2 = wwg0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            long j = this.o.c;
            wwg0Var.k = 1;
            objA = nrt.a(this.s, j, wwg0Var);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        H(new f87((ql5) objA, (byte) 5));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object P(zje zjeVar) {
        zwg0 zwg0Var;
        if (zjeVar instanceof zwg0) {
            zwg0Var = (zwg0) zjeVar;
            int i = zwg0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zwg0Var.k = i - Integer.MIN_VALUE;
            } else {
                zwg0Var = new zwg0(this, zjeVar);
            }
        } else {
            zwg0Var = new zwg0(this, zjeVar);
        }
        Object objA = zwg0Var.i;
        Object obj = wne.f39444a;
        int i2 = zwg0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            a5w a5wVar = ((svg0) D()).r;
            List listC = a5wVar != null ? kotlin.collections.a.c(a5wVar) : iun.f15405a;
            zwg0Var.k = 1;
            objA = this.v.a(listC, zwg0Var);
            if (objA == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        H(new kv80((List) objA, (byte) 10));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Q(zje zjeVar) {
        axg0 axg0Var;
        if (zjeVar instanceof axg0) {
            axg0Var = (axg0) zjeVar;
            int i = axg0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                axg0Var.k = i - Integer.MIN_VALUE;
            } else {
                axg0Var = new axg0(this, zjeVar);
            }
        } else {
            axg0Var = new axg0(this, zjeVar);
        }
        Object objB = axg0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = axg0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            axg0Var.k = 1;
            objB = ((zfo) this.u.f2175a).b(axg0Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        H(new kv80((List) objB, (byte) 11));
        return Unit.f46060a;
    }

    public final void R() {
        sac.i0(jiu0.a(this), dxg0.class.getSimpleName().concat(".setInitialData"), 3, 0L, kotlin.collections.a.c(zhi0.class), null, new z8b0(this, null, (byte) 11), null, this.p.b, new dwg0(this, (byte) 2), null, 596);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object S(zje zjeVar) {
        bxg0 bxg0Var;
        wvg0 wvg0Var;
        if (zjeVar instanceof bxg0) {
            bxg0Var = (bxg0) zjeVar;
            int i = bxg0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                bxg0Var.k = i - Integer.MIN_VALUE;
            } else {
                bxg0Var = new bxg0(this, zjeVar);
            }
        } else {
            bxg0Var = new bxg0(this, zjeVar);
        }
        bxg0 bxg0Var2 = bxg0Var;
        Object objU = bxg0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = bxg0Var2.k;
        SaleScreenModel saleScreenModel = this.o;
        boolean z = true;
        if (i2 == 0) {
            z1x.P(objU);
            a5w a5wVar = ((svg0) D()).r;
            if (a5wVar != null && a5wVar.b() == i0w.b) {
                long j = saleScreenModel.c;
                String str = saleScreenModel.f46405a;
                long jA = this.t.a();
                bxg0Var2.k = 1;
                objU = ((ouu) this.x.b).u(j, jA, bxg0Var2, str);
                if (objU == wneVar) {
                    return wneVar;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objU);
        final ytg0 ytg0Var = (ytg0) objU;
        boolean z2 = this.r.a().f32117a.f12063a.n;
        double d = ytg0Var.c;
        double d2 = ytg0Var.f;
        double dQ = ytg0Var.d;
        if (d != 0.0d && z2) {
            z = false;
        }
        boolean z3 = saleScreenModel.b;
        if (z3 && z) {
            wvg0Var = wvg0.d;
        } else {
            wvg0Var = z3 ? wvg0.c : wvg0.f39835a;
        }
        final wvg0 wvg0Var2 = wvg0Var;
        double d3 = z3 ? d2 : dQ;
        double d4 = ytg0Var.f43216a;
        final double d5 = d4 - ((ytg0Var.e * d4) / dQ);
        final double dN = N(d3);
        final double dN2 = N(d2);
        if (saleScreenModel.b) {
            pn40 pn40Var = pn40.f27267a;
            dQ = pn40.q(d2);
        }
        final double d6 = dQ;
        H(new Function2() { // from class: a.ewg0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                oyg0 oyg0Var = (oyg0) obj;
                svg0 svg0Var = (svg0) obj2;
                oyg0Var.getClass();
                svg0Var.getClass();
                ytg0 ytg0Var2 = ytg0Var;
                double d7 = d6;
                double d8 = d5;
                ytg0 ytg0VarA = ytg0.a(ytg0Var2, d7, 0.0d, d8, 7927);
                q7x.F(oyg0Var, Double.valueOf(d8), "KEY_MAX_BET_VALUE");
                ytg0 ytg0Var3 = ytg0Var;
                double d9 = ytg0Var3.h;
                q7x.F(oyg0Var, Double.valueOf(d9), "KEY_MIN_BET_VALUE");
                double d10 = ytg0Var3.f;
                q7x.F(oyg0Var, Double.valueOf(d10), "KEY_AUTO_SALE_MIN_VALUE");
                double d11 = ytg0Var3.g;
                q7x.F(oyg0Var, Double.valueOf(d11), "KEY_AUTO_SALE_MAX_VALUE");
                double d12 = dN;
                q7x.F(oyg0Var, Double.valueOf(d12), "KEY_PAYMENT_VALUE");
                double d13 = dN2;
                q7x.F(oyg0Var, Double.valueOf(d13), "KEY_AUTO_SALE_VALUE");
                return svg0.a(svg0Var, 0.0f, 0.0f, 0.0f, d8, d9, 0.0d, d12, d13, d10, d11, false, false, wtg0.f39739a, wvg0Var2, ytg0VarA, null, null, null, 8272903);
            }
        });
        return Unit.f46060a;
    }

    public final void T() {
        ytg0 ytg0Var = ((svg0) D()).q;
        double d = ytg0Var != null ? ytg0Var.e : 0.0d;
        ytg0 ytg0Var2 = ((svg0) D()).q;
        double d2 = ytg0Var2 != null ? ytg0Var2.d : 0.0d;
        pn40 pn40Var = pn40.f27267a;
        double dQ = pn40.q((((svg0) D()).d / 100.0d) * ((double) ((svg0) D()).f32864a));
        double d3 = dQ >= ((svg0) D()).e ? dQ : 0.0d;
        if (d3 >= ((svg0) D()).e) {
            d2 = ((d2 - d) * ((double) (((svg0) D()).b / 100.0f))) + d;
        }
        H(new iwg0(N(d3), N(d2), (byte) 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r6v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // a.i3t0, a.k3t0
    public final void x(Object obj) {
        a1w a1wVar;
        Object value;
        String strD;
        String strB0;
        ovg0 ovg0Var;
        ttg0 ttg0Var = (ttg0) obj;
        ttg0Var.getClass();
        super.x(ttg0Var);
        if (ttg0Var.equals(ktg0.f18864a)) {
            M();
            return;
        }
        if (ttg0Var.equals(ltg0.f20628a)) {
            R();
            return;
        }
        boolean zEquals = ttg0Var.equals(ptg0.f27563a);
        byte b = 10;
        nj7 nj7Var = this.w;
        SaleScreenModel saleScreenModel = this.o;
        ?? r6 = 0;
        if (zEquals) {
            r6w r6wVar = r6w.k;
            a5w a5wVar = ((svg0) D()).r;
            if (a5wVar != null) {
                HistoryTypeModel historyTypeModel = saleScreenModel.e;
                historyTypeModel.getClass();
                strD = (historyTypeModel == HistoryTypeModel.EVENTS || historyTypeModel == HistoryTypeModel.UNSETTLED) ? a5wVar.d() : "";
            } else {
                strD = null;
            }
            if (strD == null) {
                strD = "";
            }
            a5w a5wVar2 = ((svg0) D()).r;
            if (a5wVar2 != null) {
                HistoryTypeModel historyTypeModel2 = saleScreenModel.e;
                historyTypeModel2.getClass();
                if ((a5wVar2 instanceof kzv) && (historyTypeModel2 == HistoryTypeModel.EVENTS || historyTypeModel2 == HistoryTypeModel.UNSETTLED)) {
                    List list = ((kzv) a5wVar2).Y;
                    ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(Long.valueOf(((z0w) it.next()).G));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (((Number) obj2).longValue() != 0) {
                            arrayList2.add(obj2);
                        }
                    }
                    strB0 = CollectionsKt.b0(arrayList2, null, null, null, null, 63);
                } else {
                    strB0 = "";
                }
            } else {
                strB0 = null;
            }
            if (strB0 == null) {
                strB0 = "";
            }
            nj7Var.a(r6wVar, strD, strB0);
            if (saleScreenModel.b) {
                double d = ((svg0) D()).f;
                ql5 ql5Var = ((svg0) D()).s;
                String str = ql5Var != null ? ql5Var.f : null;
                ovg0Var = new ovg0(d, str == null ? "" : str, ((svg0) D()).g, ((svg0) D()).h, true);
            } else {
                double d2 = ((svg0) D()).f;
                ql5 ql5Var2 = ((svg0) D()).s;
                r6 = ql5Var2 != null ? ql5Var2.f : 0;
                ovg0Var = new ovg0(d2, r6 == 0 ? "" : r6, ((svg0) D()).g, -1.0d, false);
            }
            G(ovg0Var);
            return;
        }
        boolean zEquals2 = ttg0Var.equals(qtg0.f29298a);
        mne mneVar = this.p;
        if (zEquals2) {
            boolean z = saleScreenModel.b;
            kt2 kt2Var = nj7Var.f23620a.f1961a;
            kt2Var.c((z ? a1w.p : a1w.o).a());
            if (z && ((svg0) D()).c > 0.0f) {
                a1wVar = a1w.s;
            } else if (z) {
                a1wVar = a1w.t;
            } else {
                a1wVar = ((svg0) D()).f32864a > 0.0f ? a1w.q : a1w.r;
            }
            kt2Var.c(a1wVar.a());
            a1w a1wVar2 = (!z || ((svg0) D()).b >= 100.0f) ? z ? a1w.v : null : a1w.u;
            if (a1wVar2 != null) {
                kt2Var.c(a1wVar2.a());
            }
            p7m0 p7m0Var = this.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
                this.f.getClass();
            } while (!p7m0Var.m(value, svg0.a((svg0) value, 0.0f, 0.0f, 0.0f, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, 0.0d, true, false, null, null, null, null, null, null, 8386559)));
            sac.i0(jiu0.a(this), dxg0.class.getSimpleName().concat(".onSaleConfirmed"), 3, 0L, q3d.j(oqt0.class, lai0.class), null, new zye0((Object) this, (yje) r6, (byte) 16), null, mneVar.b, new dwg0(this, (byte) 0), null, 596);
            return;
        }
        if (ttg0Var.equals(mtg0.f22369a)) {
            E();
            return;
        }
        byte b2 = 1;
        if (ttg0Var.equals(rtg0.f31077a)) {
            this.D.d(new dwg0(this, b2));
            return;
        }
        if (ttg0Var.equals(ntg0.f24099a)) {
            v3c.N(this.E);
            return;
        }
        byte b3 = 3;
        if (ttg0Var.equals(otg0.f25829a)) {
            v3c.N(this.E);
            this.E = sac.T(new fnq(i120.W(new dnq(this.B.b(), new jgb0(this, (yje) r6, b), (byte) 1)), new yng0(this, r6, b3), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a), ywg0.h);
            return;
        }
        if (!(ttg0Var instanceof stg0)) {
            t9f.b();
            return;
        }
        stg0 stg0Var = (stg0) ttg0Var;
        float f = stg0Var.f32771a;
        int iOrdinal = stg0Var.b.ordinal();
        byte b4 = 2;
        if (iOrdinal == 0) {
            float fFloor = (float) Math.floor(f);
            H(new so10(fFloor, fFloor > 0.0f ? 100.0f - fFloor : 100.0f, b4));
            T();
            return;
        }
        if (iOrdinal == 1) {
            float fFloor2 = (float) Math.floor(f);
            H(new so10(100.0f - fFloor2, fFloor2, b3));
            T();
            return;
        }
        if (iOrdinal != 2) {
            t9f.b();
            return;
        }
        final float fFloor3 = (float) Math.floor(f);
        ytg0 ytg0Var = ((svg0) D()).q;
        double d3 = ytg0Var != null ? ytg0Var.g : 0.0d;
        ytg0 ytg0Var2 = ((svg0) D()).q;
        double d4 = ytg0Var2 != null ? ytg0Var2.f : 0.0d;
        ytg0 ytg0Var3 = ((svg0) D()).q;
        double d5 = ytg0Var3 != null ? ytg0Var3.h : 0.0d;
        ytg0 ytg0Var4 = ((svg0) D()).q;
        double d6 = ytg0Var4 != null ? ytg0Var4.f43216a : 0.0d;
        double d7 = (((d3 - d4) / 100.0d) * ((double) fFloor3)) + d4;
        double d8 = (d5 * d7) / d6;
        pn40 pn40Var = pn40.f27267a;
        double dQ = pn40.q(d8);
        double dQ2 = pn40.q(d7);
        double d9 = (((dQ2 - dQ) * ((double) ((svg0) D()).b)) / 100.0d) + dQ;
        double dQ3 = pn40.q(d7);
        final double dN = N(d9);
        final double dN2 = N(dQ3);
        ytg0 ytg0Var5 = ((svg0) D()).q;
        final ytg0 ytg0VarA = ytg0Var5 != null ? ytg0.a(ytg0Var5, dQ2, dQ, d6 - ((d8 * d6) / d7), 7911) : null;
        H(new Function2() { // from class: a.hwg0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj3, Object obj4) {
                oyg0 oyg0Var = (oyg0) obj3;
                svg0 svg0Var = (svg0) obj4;
                oyg0Var.getClass();
                svg0Var.getClass();
                float f2 = fFloor3;
                q7x.F(oyg0Var, Float.valueOf(f2), "KEY_AUTO_SALE_PROGRESS");
                double d10 = dN;
                q7x.F(oyg0Var, Double.valueOf(d10), "KEY_PAYMENT_VALUE");
                double d11 = dN2;
                q7x.F(oyg0Var, Double.valueOf(d11), "KEY_AUTO_SALE_VALUE");
                return svg0.a(svg0Var, 0.0f, 0.0f, f2, 0.0d, 0.0d, 0.0d, d10, d11, 0.0d, 0.0d, false, false, null, null, ytg0VarA, null, null, null, 8322875);
            }
        });
    }
}
