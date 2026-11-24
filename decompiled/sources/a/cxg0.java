package a;

import android.gov.nist.core.Separators;
import android.text.BidiFormatter;
import android.text.TextDirectionHeuristics;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Arrays;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import org.xbet.client1.R;
import org.xplatform.bethistory.sale.presentation.SaleDataModel;
import org.xplatform.ui_core.resources.UiText;

/* JADX INFO: loaded from: classes3.dex */
public final class cxg0 extends w46 {
    public final qoj0 A;
    public final cu b;
    public final z220 c;
    public final wwv d;
    public final b4j e;
    public final sa10 f;
    public final mne g;
    public final i1w0 h;
    public final duj i;
    public final ctf0 j;
    public final nj7 k;
    public final n3w l;
    public final boolean m;
    public final long n;
    public final sff0 o;
    public final boolean p;
    public boolean q;
    public SaleDataModel r;
    public int s;
    public int t;
    public int u;
    public double v;
    public boolean w;
    public boolean x;
    public final p7m0 y;
    public final p7m0 z;

    /* JADX WARN: Code duplicated, block: B:13:0x008b  */
    public cxg0(pru pruVar, cu cuVar, z220 z220Var, wwv wwvVar, m1e m1eVar, b4j b4jVar, sa10 sa10Var, mne mneVar, i1w0 i1w0Var, duj dujVar, ctf0 ctf0Var, nj7 nj7Var, n3w n3wVar, boolean z, long j) {
        UiText byString;
        m1eVar.getClass();
        ctf0Var.getClass();
        this.b = cuVar;
        this.c = z220Var;
        this.d = wwvVar;
        this.e = b4jVar;
        this.f = sa10Var;
        this.g = mneVar;
        this.h = i1w0Var;
        this.i = dujVar;
        this.j = ctf0Var;
        this.k = nj7Var;
        this.l = n3wVar;
        this.m = z;
        this.n = j;
        sff0 sff0VarA = pruVar.a();
        this.o = sff0VarA;
        this.p = sff0VarA.f32117a.f12063a.o;
        this.r = SaleDataModel.m;
        this.s = 100;
        byte b = 1;
        this.w = true;
        s77 s77Var = n3wVar.c;
        String str = n3wVar.f22868a;
        int iOrdinal = s77Var.ordinal();
        if (iOrdinal == 1) {
            byString = new UiText.ByString("");
        } else if (iOrdinal == 2) {
            byString = new UiText.ByRes(R.string.history_coupon_number_with_dot, str.length() == 0 ? n3wVar.b : str);
        } else if (iOrdinal != 6) {
            byString = new UiText.ByRes(R.string.history_coupon_number_with_dot, str);
        } else {
            byString = new UiText.ByString("");
        }
        boolean z2 = n3wVar.t;
        rdj rdjVar = rdj.f30294a;
        String strG = rdj.g(new znq0(n3wVar.j), efj.UNIVERSAL, Boolean.valueOf(ctf0Var.h()), false, 56);
        String str2 = n3wVar.m1;
        pn40 pn40Var = pn40.f27267a;
        double d = n3wVar.n1;
        this.y = q7m0.a(new m9h0(jug0.k, new msv(z, z2, strG, str2, byString, pn40.d(d <= 0.0d ? n3wVar.o : d, n3wVar.g, p3u0.c), n3wVar.f), 0, 0, 0, false, false, false, false, false, "", m2a.i, 0));
        this.z = q7m0.a(pwg0.f27710a);
        this.A = ckb.F();
        x();
        yje yjeVar = null;
        slb.U(new fnq(new dnq(m1eVar.b(), new jgb0((Object) this, yjeVar, (byte) 9), (byte) 1), new swg0(this, yjeVar, b), (byte) 4), d5c.S(jiu0.a(this), mneVar.f22085a));
    }

    public static SaleDataModel D(SaleDataModel saleDataModel) {
        return new SaleDataModel(Math.floor(saleDataModel.f46415a), Math.floor(saleDataModel.b), Math.floor(saleDataModel.c), Math.floor(saleDataModel.d), Math.floor(saleDataModel.e), Math.floor(saleDataModel.f), Math.floor(saleDataModel.g), Math.floor(saleDataModel.h), Math.floor(saleDataModel.i), Math.floor(saleDataModel.j), Math.floor(saleDataModel.k), Math.floor(saleDataModel.l));
    }

    public final void A(int i, int i2, dvh0 dvh0Var) {
        int i3 = i2 - i;
        int iB = si30.b(i3 * 0.1f);
        if (iB != 0) {
            kie0 kie0Var = new kie0();
            kie0Var.f18333a = i;
            qjj.W(jiu0.a(this), null, null, new twg0(i3 / iB, this, kie0Var, iB, dvh0Var, i2, null), 3);
        }
    }

    public final void B() {
        if (((m9h0) this.y.getValue()).l instanceof bje) {
            return;
        }
        i1w0 i1w0Var = this.h;
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

    public final void C(double d, String str, boolean z) {
        qjj.W(jiu0.a(this), null, null, new swg0(this, null, (byte) 3), 3);
        nj7 nj7Var = this.k;
        b4j b4jVar = nj7Var.f23620a;
        a1w a1wVar = a1w.m;
        r6w r6wVar = r6w.j;
        b4j.h(b4jVar, a1wVar, r6wVar);
        nj7Var.b.e(r6wVar.a());
        boolean z2 = this.m;
        qoj0 qoj0Var = this.A;
        if (z2) {
            qoj0Var.g(new nwg0(str));
        } else {
            pn40 pn40Var = pn40.f27267a;
            String strUnicodeWrap = BidiFormatter.getInstance().unicodeWrap(pn40.d(d, this.l.g, p3u0.c), TextDirectionHeuristics.LTR);
            ctf0 ctf0Var = this.j;
            qoj0Var.g(new mwg0(ctf0Var.b.a(R.string.bet_sell_successfully, Arrays.copyOf(new Object[0], 0)), kng0.l(ctf0Var.b.a(R.string.amount_will_be_credited, Arrays.copyOf(new Object[0], 0)), Separators.SP, strUnicodeWrap), str, z));
        }
        i1w0 i1w0Var = this.h;
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

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0065, code lost:
    
        if (a.qcc.O(1000, r15) == r1) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(java.lang.String r6, double r7, double r9, double r11, long r13, a.zje r15) {
        /*
            r5 = this;
            boolean r0 = r15 instanceof a.vwg0
            if (r0 == 0) goto L14
            r0 = r15
            a.vwg0 r0 = (a.vwg0) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.o = r1
        L12:
            r15 = r0
            goto L1a
        L14:
            a.vwg0 r0 = new a.vwg0
            r0.<init>(r5, r15)
            goto L12
        L1a:
            java.lang.Object r0 = r15.m
            a.wne r1 = a.wne.f39444a
            int r2 = r15.o
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L33
            if (r2 != r3) goto L2c
            a.z1x.P(r0)
            goto L68
        L2c:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r5)
            r5 = 0
            return r5
        L33:
            long r13 = r15.l
            double r11 = r15.k
            double r9 = r15.j
            double r7 = r15.i
            a.z1x.P(r0)
            goto L55
        L3f:
            a.z1x.P(r0)
            r15.i = r7
            r15.j = r9
            r15.k = r11
            r15.l = r13
            r15.o = r4
            a.z220 r5 = r5.c
            java.lang.Object r5 = r5.D(r6, r7, r9, r11, r13, r15)
            if (r5 != r1) goto L55
            goto L67
        L55:
            r15.i = r7
            r15.j = r9
            r15.k = r11
            r15.l = r13
            r15.o = r3
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r5 = a.qcc.O(r5, r15)
            if (r5 != r1) goto L68
        L67:
            return r1
        L68:
            kotlin.Unit r5 = kotlin.Unit.f46060a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cxg0.E(java.lang.String, double, double, double, long, a.zje):java.lang.Object");
    }

    public final void F(boolean z) {
        p7m0 p7m0Var;
        Object value;
        hje hjeVar = z ? bje.f2702a : m2a.i;
        do {
            p7m0Var = this.y;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, m9h0.a((m9h0) value, null, 0, 0, 0, false, false, false, false, false, null, hjeVar, 0, 6143)));
    }

    public final void w(int i) {
        cxg0 cxg0Var = this;
        int i2 = i;
        cxg0Var.t = i2;
        pn40 pn40Var = pn40.f27267a;
        double dQ = pn40.q((cxg0Var.r.k / 100.0d) * ((double) i2));
        SaleDataModel saleDataModel = cxg0Var.r;
        double d = dQ < saleDataModel.i ? 0.0d : dQ;
        int i3 = d == 0.0d ? 100 : 100 - i2;
        cxg0Var.s = i3;
        double d2 = saleDataModel.c;
        double d3 = saleDataModel.d;
        SaleDataModel saleDataModelA = SaleDataModel.a(saleDataModel, 0.0d, 0.0d, 0.0d, pn40.n((((d2 - d3) / 100.0d) * ((double) i3)) + d3, 6), 0.0d, d, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
        cxg0Var.r = saleDataModelA;
        if (cxg0Var.p) {
            saleDataModelA = D(saleDataModelA);
        }
        SaleDataModel saleDataModel2 = saleDataModelA;
        while (true) {
            p7m0 p7m0Var = cxg0Var.y;
            Object value = p7m0Var.getValue();
            SaleDataModel saleDataModel3 = saleDataModel2;
            if (p7m0Var.m(value, m9h0.a((m9h0) value, cxg0Var.z(saleDataModel2), i2, 0, 0, false, false, false, false, false, null, null, 0, 8186))) {
                A(((m9h0) p7m0Var.getValue()).d, this.s, dvh0.b);
                return;
            } else {
                cxg0Var = this;
                i2 = i;
                saleDataModel2 = saleDataModel3;
            }
        }
    }

    public final void x() {
        n3w n3wVar = this.l;
        s77 s77Var = n3wVar.c;
        if (s77Var == s77.TOTO || s77Var == s77.JACKPOT || n3wVar.l != e4f.c) {
            return;
        }
        F(true);
        byte b = 0;
        sac.V(jiu0.a(this), new gwg0(this, b), null, this.g.f22085a, new swg0(this, null, b), 10);
    }

    public final void y(Throwable th) {
        p7m0 p7m0Var;
        Object value;
        if (!jcb.d0(th) && this.w) {
            this.i.b(th, new cwg0(this, (byte) 0));
        } else {
            do {
                p7m0Var = this.y;
                value = p7m0Var.getValue();
            } while (!p7m0Var.m(value, m9h0.a((m9h0) value, null, 0, 0, 0, false, false, false, false, false, null, new wie(sa10.b(this.f, pb10.g, R.string.data_retrieval_error, 0, null, 28)), 0, 6143)));
        }
    }

    public final jug0 z(SaleDataModel saleDataModel) {
        double d = saleDataModel.g;
        String str = this.l.g;
        boolean z = this.m && d > 0.0d;
        pn40 pn40Var = pn40.f27267a;
        double d2 = saleDataModel.h;
        p3u0 p3u0Var = p3u0.c;
        return new jug0(z, pn40.d(d2, str, p3u0Var), pn40.d(saleDataModel.f, str, p3u0Var), pn40.d(d, str, p3u0Var), pn40.d(saleDataModel.l, str, p3u0Var), pn40.d(saleDataModel.j, str, p3u0Var), pn40.d(saleDataModel.k, str, p3u0Var), pn40.d(saleDataModel.e, str, p3u0Var), pn40.d(saleDataModel.d, str, p3u0Var), pn40.d(saleDataModel.c, str, p3u0Var));
    }
}
