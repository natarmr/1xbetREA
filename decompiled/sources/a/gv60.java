package a;

import android.hardware.camera2.CaptureRequest;
import android.javax.sip.message.Response;
import android.util.Log;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.statistic.team.impl.team_statistic.domain.models.TypeParam;

/* JADX INFO: loaded from: classes5.dex */
public final class gv60 extends bnn0 implements Function1 {
    public final /* synthetic */ byte i;
    public boolean j;
    public Object k;
    public final /* synthetic */ Object l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv60(xot0 xot0Var, List list, yje yjeVar) {
        super(1, yjeVar);
        this.i = (byte) 23;
        oot0 oot0Var = oot0.f25610a;
        this.k = xot0Var;
        this.l = list;
    }

    @Override // a.zw5
    public final yje create(yje yjeVar) {
        byte b = this.i;
        Object obj = this.l;
        switch (b) {
            case 0:
                return new gv60(obj, yjeVar, (byte) 0);
            case 1:
                return new gv60((d04) this.k, (fl80) obj, yjeVar, (byte) 1);
            case 2:
                return new gv60(obj, yjeVar, (byte) 2);
            case 3:
                return new gv60((ata0) this.k, (ArrayList) obj, yjeVar, (byte) 3);
            case 4:
                return new gv60((ata0) this.k, (l9s) obj, yjeVar, (byte) 4);
            case 5:
                return new gv60((tjb0) this.k, (rbb) obj, yjeVar, (byte) 5);
            case 6:
                return new gv60((hef0) this.k, (List) obj, yjeVar, (byte) 6);
            case 7:
                return new gv60((khf0) this.k, (sgb) obj, yjeVar, (byte) 7);
            case 8:
                return new gv60((phf0) this.k, (tnp0) obj, yjeVar, (byte) 8);
            case 9:
                return new gv60((o7g0) this.k, (dyl0) obj, yjeVar, (byte) 9);
            case 10:
                return new gv60((String) this.k, (sih0) obj, yjeVar, (byte) 10);
            case 11:
                return new gv60((qmh0) this.k, (String) obj, yjeVar, (byte) 11);
            case 12:
                return new gv60(obj, yjeVar, (byte) 12);
            case 13:
                return new gv60((ngj0) this.k, (String) obj, yjeVar, (byte) 13);
            case 14:
                return new gv60((f0m0) this.k, (dyl0) obj, yjeVar, (byte) 14);
            case 15:
                return new gv60((w3m0) this.k, (mk50) obj, yjeVar, (byte) 15);
            case 16:
                return new gv60((ren0) this.k, (nmp0) obj, yjeVar, (byte) 16);
            case 17:
                return new gv60(obj, yjeVar, (byte) 17);
            case 18:
                return new gv60(obj, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new gv60(obj, yjeVar, (byte) 19);
            case 20:
                return new gv60(obj, yjeVar, (byte) 20);
            case 21:
                return new gv60((edr0) this.k, (String) obj, yjeVar, (byte) 21);
            case 22:
                return new gv60((xgt0) this.k, (agt0) obj, yjeVar, (byte) 22);
            case 23:
                xot0 xot0Var = (xot0) this.k;
                oot0 oot0Var = oot0.f25610a;
                return new gv60(xot0Var, (List) obj, yjeVar);
            default:
                return new gv60((glt0) this.k, (lxv0) obj, yjeVar, (byte) 24);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        yje yjeVar = (yje) obj;
        switch (this.i) {
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
            case 12:
                break;
            case 13:
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                break;
            case 20:
                break;
            case 21:
                break;
            case 22:
                break;
            case 23:
                break;
        }
        return ((gv60) create(yjeVar)).invokeSuspend(Unit.f46060a);
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objA;
        kg kgVar;
        Object objInvoke;
        qz80 qz80Var;
        Object objK;
        Object value;
        Object objA2;
        Object value2;
        Object value3;
        Object objE;
        Set set;
        Object value4;
        Object value5;
        Object objT;
        fho0 fho0Var;
        Object objT2;
        rio0 rio0Var;
        Object objD0;
        rtp0 rtp0Var;
        Object objT3;
        xtq0 xtq0Var;
        byte b = 10;
        byte b2 = 11;
        byte b3 = 5;
        byte b4 = 0;
        bbw0 bbw0Var = null;
        boolean z = false;
        boolean z2 = false;
        switch (this.i) {
            case 0:
                hv60 hv60Var = (hv60) this.l;
                wsf0 wsf0Var = hv60Var.t;
                wne wneVar = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    kg kgVarB = hv60Var.G.b();
                    khf0 khf0VarG = ((g45) wsf0Var.b).G();
                    bm5 bm5Var = bm5.d;
                    this.k = kgVarB;
                    this.j = true;
                    objA = khf0VarG.A(bm5Var, tl5.c, this);
                    if (objA == wneVar) {
                        return wneVar;
                    }
                    kgVar = kgVarB;
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kgVar = (kg) this.k;
                    z1x.P(obj);
                    objA = obj;
                }
                ql5 ql5Var = (ql5) objA;
                wsf0Var.s().l(bm5.d, ql5Var);
                String strA = ql5Var.j;
                if (kgVar == kg.SECONDARY) {
                    strA = hv60Var.O.b.a(R.string.all_balances, Arrays.copyOf(new Object[0], 0));
                } else if (strA.length() <= 0) {
                    strA = ql5Var.k;
                }
                hv60Var.H(new fv60(strA, ql5Var, b4));
                return Unit.f46060a;
            case 1:
                fl80 fl80Var = (fl80) this.l;
                d04 d04Var = (d04) this.k;
                wne wneVar2 = wne.f39444a;
                boolean z4 = this.j;
                if (!z4) {
                    z1x.P(obj);
                    w6t0 w6t0Var = fl80Var.b;
                    w6t0 w6t0Var2 = d04Var.c;
                    d04Var.c = w6t0Var;
                    if (w6t0Var2 instanceof ml80) {
                        ml80 ml80Var = (ml80) w6t0Var2;
                        if (ml80Var.f21977a) {
                            w6t0Var.a();
                        }
                        if (ml80Var.b) {
                            w6t0Var.p();
                        }
                    }
                    gmq gmqVar = fl80Var.f9726a;
                    r980 r980Var = new r980(d04Var, fl80Var, (byte) 3);
                    this.j = true;
                    if (gmqVar.c(r980Var, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z4) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z5 = this.j;
                if (!z5) {
                    z1x.P(obj);
                    qz80 qz80Var2 = (qz80) this.l;
                    if (qz80Var2.f == null) {
                        xg0 xg0Var = qz80Var2.f29569a;
                        this.k = qz80Var2;
                        this.j = true;
                        objInvoke = xg0Var.invoke(this);
                        if (objInvoke == wneVar3) {
                            return wneVar3;
                        }
                        qz80Var = qz80Var2;
                    }
                    return Unit.f46060a;
                }
                if (!z5) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qz80Var = (qz80) this.k;
                z1x.P(obj);
                objInvoke = obj;
                qz80Var.f = (qpg0) objInvoke;
                if (((qz80) this.l).g) {
                    qpg0 qpg0Var = ((qz80) this.l).f;
                    if (qpg0Var == null) {
                        Intrinsics.h("connection");
                        throw null;
                    }
                    qpg0Var.close();
                    m2x.J(21, "Connection pool is closed");
                    throw null;
                }
                return Unit.f46060a;
            case 3:
                ata0 ata0Var = (ata0) this.k;
                wne wneVar4 = wne.f39444a;
                boolean z6 = this.j;
                if (!z6) {
                    z1x.P(obj);
                    n4u n4uVar = ata0Var.H;
                    ArrayList arrayList = (ArrayList) this.l;
                    this.j = true;
                    objK = ((kd30) n4uVar.b).K(arrayList, this);
                    if (objK == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z6) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                    objK = obj;
                }
                List list = (List) objK;
                int i = ata0.S;
                p7m0 p7m0Var = ata0Var.i.f25029a;
                do {
                    value = p7m0Var.getValue();
                    value.getClass();
                } while (!p7m0Var.m(value, nsa0.a((nsa0) value, null, null, new in00(list), false, null, false, null, 1007)));
                return Unit.f46060a;
            case 4:
                l9s l9sVar = (l9s) this.l;
                ata0 ata0Var2 = (ata0) this.k;
                wne wneVar5 = wne.f39444a;
                boolean z7 = this.j;
                try {
                    if (!z7) {
                        z1x.P(obj);
                        boolean zJ = ata0Var2.C.j();
                        njt0 njt0Var = ata0Var2.I;
                        long jC = l9sVar.C();
                        long jA = l9sVar.a();
                        boolean zE = l9sVar.e();
                        boolean z8 = l9sVar.H() && !zJ;
                        this.j = true;
                        objA2 = njt0Var.a(jC, jA, this, zE, z8, false);
                        if (objA2 == wneVar5) {
                            return wneVar5;
                        }
                    } else {
                        if (!z7) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj);
                        objA2 = obj;
                    }
                    sjt0 sjt0Var = (sjt0) objA2;
                    if ((sjt0Var instanceof ojt0) && ((ojt0) sjt0Var).f25377a) {
                        ata0Var2.G(new jsa0(ata0Var2.D.b.a(R.string.favorites_subscribe_snackbar, Arrays.copyOf(new Object[0], 0))));
                    }
                    break;
                } catch (Throwable th) {
                    ata0Var2.K.f(th, new tsa0(ata0Var2, b3));
                }
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                boolean z9 = this.j;
                if (!z9) {
                    z1x.P(obj);
                    tjb0 tjb0Var = (tjb0) this.k;
                    rbb rbbVar = (rbb) this.l;
                    this.j = true;
                    int i2 = tjb0.A;
                    if (tjb0Var.p(rbbVar, this) == wneVar6) {
                        return wneVar6;
                    }
                } else {
                    if (!z9) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 6:
                List list2 = (List) this.l;
                hef0 hef0Var = (hef0) this.k;
                wne wneVar7 = wne.f39444a;
                boolean z10 = this.j;
                if (!z10) {
                    z1x.P(obj);
                    hjd hjdVar = hef0Var.p;
                    did didVar = new did(list2);
                    this.j = true;
                    hjdVar.getClass();
                    if (hjdVar.a(didVar, this) == wneVar7) {
                        return wneVar7;
                    }
                } else {
                    if (!z10) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i3 = hef0.C;
                p7m0 p7m0Var2 = hef0Var.i.f25029a;
                do {
                    value2 = p7m0Var2.getValue();
                    value2.getClass();
                } while (!p7m0Var2.m(value2, aef0.a((aef0) value2, list2, false, null, 2040)));
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                boolean z11 = this.j;
                if (z11) {
                    if (z11) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                m0o0 m0o0Var = (m0o0) ((khf0) this.k).b;
                long jB = ((sgb) this.l).b();
                this.j = true;
                Object objA3 = m0o0Var.b.a(jB, this, false);
                return objA3 == wneVar8 ? wneVar8 : objA3;
            case 8:
                wne wneVar9 = wne.f39444a;
                boolean z12 = this.j;
                if (z12) {
                    if (z12) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                m0o0 m0o0Var2 = (m0o0) ((phf0) this.k).b;
                tnp0 tnp0Var = (tnp0) this.l;
                this.j = true;
                Object objC = m0o0Var2.b.c(tnp0Var.a(), false, tnp0Var, this);
                return objC == wneVar9 ? wneVar9 : objC;
            case 9:
                wne wneVar10 = wne.f39444a;
                boolean z13 = this.j;
                if (!z13) {
                    z1x.P(obj);
                    o7g0 o7g0Var = (o7g0) this.k;
                    kki kkiVar = o7g0Var.o;
                    otc otcVarW = ieb.W((dyl0) this.l, o7g0Var.q, o7g0Var.p);
                    this.j = true;
                    if (kkiVar.s(otcVarW, this) == wneVar10) {
                        return wneVar10;
                    }
                } else {
                    if (!z13) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 10:
                String str = (String) this.k;
                wne wneVar11 = wne.f39444a;
                boolean z14 = this.j;
                if (!z14) {
                    z1x.P(obj);
                    if (str.length() > 0) {
                        this.j = true;
                        if (qcc.O(500L, this) == wneVar11) {
                            return wneVar11;
                        }
                    }
                    return Unit.f46060a;
                }
                if (!z14) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                ywu ywuVar = ((sih0) this.l).F;
                ywuVar.getClass();
                yo4 yo4Var = (yo4) ywuVar.b;
                wgh0 wgh0Var = wgh0.MY_AGGREGATOR;
                yo4Var.n("top_champ_main", str);
                ((zr1) ywuVar.c).r("top_champ_main", str);
                return Unit.f46060a;
            case 11:
                qmh0 qmh0Var = (qmh0) this.k;
                wne wneVar12 = wne.f39444a;
                boolean z15 = this.j;
                if (!z15) {
                    z1x.P(obj);
                    dpi0 dpi0Var = qmh0Var.q;
                    int i4 = ((mmh0) qmh0Var.D()).d;
                    String str2 = (String) this.l;
                    String str3 = ((mmh0) qmh0Var.D()).f;
                    this.j = true;
                    if (((n660) dpi0Var.f6468a).I(i4, this, str2, str3) == wneVar12) {
                        return wneVar12;
                    }
                } else {
                    if (!z15) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i5 = qmh0.y;
                p7m0 p7m0Var3 = qmh0Var.i.f25029a;
                do {
                    value3 = p7m0Var3.getValue();
                    value3.getClass();
                    qmh0Var.f.getClass();
                } while (!p7m0Var3.m(value3, mmh0.a((mmh0) value3, null, null, false, 0, null, null, null, false, null, 507)));
                qmh0Var.s.f29324a.c("acc_security_set_question");
                qmh0Var.t.f31684a.a(xun.f41520a, 3248L);
                i1w0 i1w0Var = qmh0Var.o;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return Unit.f46060a;
                    }
                    i1w0Var.a((oe50) pawVar.next());
                }
                break;
            case 12:
                p1i0 p1i0Var = (p1i0) this.l;
                wne wneVar13 = wne.f39444a;
                boolean z16 = this.j;
                if (!z16) {
                    z1x.P(obj);
                    Set set2 = ((tec) p1i0Var.D()).f;
                    lbu lbuVar = p1i0Var.r;
                    this.k = set2;
                    this.j = true;
                    objE = lbuVar.e(this);
                    if (objE == wneVar13) {
                        return wneVar13;
                    }
                    set = set2;
                } else {
                    if (!z16) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    set = (Set) this.k;
                    z1x.P(obj);
                    objE = obj;
                }
                boolean zD = Intrinsics.d(set, (Set) objE);
                int i6 = p1i0.A;
                if (zD) {
                    i1w0 i1w0Var2 = p1i0Var.v;
                    CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                    ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var2, copyOnWriteArrayListQ2, 0);
                    while (true) {
                        paw pawVar2 = (paw) listIteratorP2;
                        if (pawVar2.hasNext()) {
                            i1w0Var2.a((oe50) pawVar2.next());
                        }
                    }
                } else {
                    p1i0Var.G(rec.f30328a);
                }
                return Unit.f46060a;
            case 13:
                ngj0 ngj0Var = (ngj0) this.k;
                ocj ocjVar = ngj0Var.i;
                wne wneVar14 = wne.f39444a;
                boolean z17 = this.j;
                if (!z17) {
                    z1x.P(obj);
                    int i7 = ngj0.Y0;
                    p7m0 p7m0Var4 = ocjVar.f25029a;
                    do {
                        value4 = p7m0Var4.getValue();
                        value4.getClass();
                    } while (!p7m0Var4.m(value4, pfj0.a((pfj0) value4, true, false, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, 0, -2, 1048575)));
                    im4 im4Var = ngj0Var.M0;
                    tl4 tl4Var = new tl4(new ru4((String) this.l));
                    this.j = true;
                    im4Var.getClass();
                    if (im4Var.a(tl4Var, this) == wneVar14) {
                        return wneVar14;
                    }
                } else {
                    if (!z17) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                int i8 = ngj0.Y0;
                p7m0 p7m0Var5 = ocjVar.f25029a;
                do {
                    value5 = p7m0Var5.getValue();
                    value5.getClass();
                } while (!p7m0Var5.m(value5, pfj0.a((pfj0) value5, false, false, null, null, null, null, null, null, null, false, false, null, null, false, false, false, false, false, false, false, false, null, false, false, false, false, 0, false, false, 0, -2, 1048575)));
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                boolean z18 = this.j;
                if (!z18) {
                    z1x.P(obj);
                    f0m0 f0m0Var = (f0m0) this.k;
                    kki kkiVar2 = f0m0Var.p;
                    otc otcVarW2 = ieb.W((dyl0) this.l, f0m0Var.q, f0m0Var.o);
                    this.j = true;
                    if (kkiVar2.s(otcVarW2, this) == wneVar15) {
                        return wneVar15;
                    }
                } else {
                    if (!z18) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                boolean z19 = this.j;
                if (!z19) {
                    z1x.P(obj);
                    w3m0 w3m0Var = (w3m0) this.k;
                    kki kkiVar3 = w3m0Var.B;
                    otc otcVarT = jeb.T((mk50) this.l, w3m0Var.p);
                    this.j = true;
                    if (kkiVar3.s(otcVarT, this) == wneVar16) {
                        return wneVar16;
                    }
                } else {
                    if (!z19) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                boolean z20 = this.j;
                if (!z20) {
                    z1x.P(obj);
                    hcp0 hcp0Var = ((ren0) this.k).r;
                    nmp0 nmp0Var = (nmp0) this.l;
                    long j = nmp0Var.f23784a;
                    boolean z21 = nmp0Var.e;
                    long j2 = nmp0Var.c;
                    this.j = true;
                    if (hcp0Var.p(j, z21, j2, 0L, this) == wneVar17) {
                        return wneVar17;
                    }
                } else {
                    if (!z20) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                boolean z22 = this.j;
                if (!z22) {
                    z1x.P(obj);
                    fho0 fho0Var2 = (fho0) this.l;
                    cyu cyuVar = fho0Var2.z0;
                    this.k = fho0Var2;
                    this.j = true;
                    objT = cyuVar.t(this);
                    if (objT == wneVar18) {
                        return wneVar18;
                    }
                    fho0Var = fho0Var2;
                } else {
                    if (!z22) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fho0Var = (fho0) this.k;
                    z1x.P(obj);
                    objT = obj;
                }
                i1w0 i1w0Var3 = fho0Var.y;
                int iOrdinal = ((a1p0) objT).ordinal();
                if (iOrdinal == 0) {
                    i1w0Var3.d(new vfo0(fho0Var, b));
                } else if (iOrdinal == 1) {
                    i1w0Var3.d(new vfo0(fho0Var, b2));
                } else {
                    if (iOrdinal != 2) {
                        t9f.b();
                        return null;
                    }
                    ouu ouuVar = fho0Var.W;
                    tcp tcpVar = tcp.GAMES;
                    ouuVar.q(new ya50(5), true);
                }
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                boolean z23 = this.j;
                if (!z23) {
                    z1x.P(obj);
                    rio0 rio0Var2 = (rio0) this.l;
                    cyu cyuVar2 = rio0Var2.I0;
                    this.k = rio0Var2;
                    this.j = true;
                    objT2 = cyuVar2.t(this);
                    if (objT2 == wneVar19) {
                        return wneVar19;
                    }
                    rio0Var = rio0Var2;
                } else {
                    if (!z23) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rio0Var = (rio0) this.k;
                    z1x.P(obj);
                    objT2 = obj;
                }
                i1w0 i1w0Var4 = rio0Var.z;
                int iOrdinal2 = ((a1p0) objT2).ordinal();
                if (iOrdinal2 == 0) {
                    i1w0Var4.d(new lho0(rio0Var, (byte) 13));
                } else if (iOrdinal2 == 1) {
                    i1w0Var4.d(new lho0(rio0Var, (byte) 14));
                } else {
                    if (iOrdinal2 != 2) {
                        t9f.b();
                        return null;
                    }
                    ouu ouuVar2 = rio0Var.e0;
                    tcp tcpVar2 = tcp.GAMES;
                    ouuVar2.q(new ya50(5), true);
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                boolean z24 = this.j;
                if (!z24) {
                    z1x.P(obj);
                    rtp0 rtp0Var2 = (rtp0) this.l;
                    lyu lyuVar = rtp0Var2.w;
                    TypeParam typeParam = rtp0Var2.D;
                    this.k = rtp0Var2;
                    this.j = true;
                    fmp0 fmp0Var = lyuVar.f20879a;
                    objD0 = qjj.d0(fmp0Var.b.b, new dmp0(typeParam, fmp0Var, null), this);
                    if (objD0 == wneVar20) {
                        return wneVar20;
                    }
                    rtp0Var = rtp0Var2;
                } else {
                    if (!z24) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    rtp0Var = (rtp0) this.k;
                    z1x.P(obj);
                    objD0 = obj;
                }
                List list3 = (List) objD0;
                int i9 = rtp0.N;
                rtp0Var.getClass();
                p7m0 p7m0Var6 = rtp0Var.i.f25029a;
                while (true) {
                    Object value6 = p7m0Var6.getValue();
                    value6.getClass();
                    rtp0Var.f.getClass();
                    List list4 = list3;
                    if (p7m0Var6.m(value6, gsp0.a((gsp0) value6, null, null, null, list3, false, false, list3.isEmpty(), false, 135))) {
                        return Unit.f46060a;
                    }
                    list3 = list4;
                }
                break;
            case 20:
                wne wneVar21 = wne.f39444a;
                boolean z25 = this.j;
                if (!z25) {
                    z1x.P(obj);
                    xtq0 xtq0Var2 = (xtq0) this.l;
                    cyu cyuVar3 = xtq0Var2.y0;
                    this.k = xtq0Var2;
                    this.j = true;
                    objT3 = cyuVar3.t(this);
                    if (objT3 == wneVar21) {
                        return wneVar21;
                    }
                    xtq0Var = xtq0Var2;
                } else {
                    if (!z25) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    xtq0Var = (xtq0) this.k;
                    z1x.P(obj);
                    objT3 = obj;
                }
                i1w0 i1w0Var5 = xtq0Var.y;
                int iOrdinal3 = ((a1p0) objT3).ordinal();
                if (iOrdinal3 == 0) {
                    i1w0Var5.d(new zsq0(xtq0Var, b));
                } else if (iOrdinal3 == 1) {
                    i1w0Var5.d(new zsq0(xtq0Var, b2));
                } else {
                    if (iOrdinal3 != 2) {
                        t9f.b();
                        return null;
                    }
                    ouu ouuVar3 = xtq0Var.Y;
                    tcp tcpVar3 = tcp.GAMES;
                    ouuVar3.q(new ya50(5), true);
                }
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                boolean z26 = this.j;
                if (!z26) {
                    z1x.P(obj);
                    uen uenVar = wen.b;
                    long jV0 = ibc.v0(Response.OK, bfn.MILLISECONDS);
                    this.j = true;
                    if (qcc.P(jV0, this) == wneVar22) {
                        return wneVar22;
                    }
                } else {
                    if (!z26) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                ((edr0) this.k).s.h((String) this.l);
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                boolean z27 = this.j;
                if (!z27) {
                    z1x.P(obj);
                    xgt0 xgt0Var = (xgt0) this.k;
                    kki kkiVar4 = xgt0Var.s;
                    yft0 yft0Var = (yft0) ((agt0) this.l);
                    long j3 = xgt0Var.u;
                    yft0Var.getClass();
                    uft0 uft0Var = yft0Var.b;
                    otc otcVar = new otc(uft0Var.b, uft0Var.f35591a, uft0Var.c, uft0Var.f.b(), "", uft0Var.d, uft0Var.e, "", j3);
                    this.j = true;
                    if (kkiVar4.s(otcVar, this) == wneVar23) {
                        return wneVar23;
                    }
                } else {
                    if (!z27) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 23:
                xot0 xot0Var = (xot0) this.k;
                LinkedHashMap linkedHashMap = xot0Var.k;
                List list5 = (List) this.l;
                oot0 oot0Var = oot0.b;
                wne wneVar24 = wne.f39444a;
                boolean z28 = this.j;
                if (z28) {
                    if (z28) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                if (l8x.f0("CXCP")) {
                    Log.d("CXCP", "UseCaseCameraRequestControlImpl#removeParametersAsync: [" + oot0Var + "] keys = " + list5);
                }
                Object obj2 = linkedHashMap.get(oot0Var);
                Object obj3 = obj2;
                if (obj2 == null) {
                    rot0 rot0Var = new rot0(bbw0Var, (LinkedHashMap) (z2 ? 1 : 0), (onf0) (z ? 1 : 0), 15);
                    linkedHashMap.put(oot0Var, rot0Var);
                    obj3 = rot0Var;
                }
                rot0 rot0Var2 = (rot0) obj3;
                bbw0 bbw0Var2 = new bbw0((byte) 16);
                bbw0Var2.o((wy40) rot0Var2.f30856a.b);
                list5.getClass();
                Iterator it = list5.iterator();
                while (it.hasNext()) {
                    ((wy40) bbw0Var2.b).z(s5x0.C((CaptureRequest.Key) it.next()));
                }
                linkedHashMap.put(oot0Var, new rot0(bbw0Var2, xp20.p(rot0Var2.b), CollectionsKt.O0(rot0Var2.c), rot0Var2.d));
                rot0 rot0VarO = xot0.o(xot0Var.k);
                this.j = true;
                Object objR = xot0Var.r(rot0VarO, null, this);
                return objR == wneVar24 ? wneVar24 : objR;
            default:
                wne wneVar25 = wne.f39444a;
                boolean z29 = this.j;
                if (z29) {
                    if (z29) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                glt0 glt0Var = (glt0) this.k;
                t33 t33Var = (t33) glt0Var.c;
                Float f = new Float(((fht0) glt0Var.b).a((lxv0) this.l));
                nul0 nul0Var = vwv0.f38173a;
                this.j = true;
                Object objA4 = t33.a(t33Var, f, nul0Var, null, null, this, 12);
                return objA4 == wneVar25 ? wneVar25 : objA4;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv60(Object obj, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.l = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gv60(Object obj, Object obj2, yje yjeVar, byte b) {
        super(1, yjeVar);
        this.i = b;
        this.k = obj;
        this.l = obj2;
    }
}
