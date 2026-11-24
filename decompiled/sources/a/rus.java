package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.xplatform.cyber.cyberstatistic.api.navigation.CyberGameStatisticScreenParams;
import org.xplatform.cyber.cyberstatistic.impl.navigation.CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;

/* JADX INFO: loaded from: classes4.dex */
public final class rus extends x2t0 {
    public final /* synthetic */ byte h = 0;
    public final oeg0 i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rus(iqt iqtVar, lbu lbuVar, vpu vpuVar, yk50 yk50Var, h3c h3cVar, oeg0 oeg0Var) {
        super(new sqs((byte) 7));
        oeg0Var.getClass();
        this.j = iqtVar;
        this.k = lbuVar;
        this.l = vpuVar;
        this.m = yk50Var;
        this.n = h3cVar;
        this.i = oeg0Var;
    }

    @Override // a.j3t0
    public final /* bridge */ /* synthetic */ Object a(Object obj, bnn0 bnn0Var) {
        switch (this.h) {
            case 0:
                return j((nus) obj, bnn0Var);
            default:
                return k((jll0) obj, bnn0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object i(zje zjeVar) {
        ous ousVar;
        m9s m9sVar;
        if (zjeVar instanceof ous) {
            ousVar = (ous) zjeVar;
            int i = ousVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ousVar.l = i - Integer.MIN_VALUE;
            } else {
                ousVar = new ous(this, zjeVar);
            }
        } else {
            ousVar = new ous(this, zjeVar);
        }
        ous ousVar2 = ousVar;
        Object obj = ousVar2.j;
        wne wneVar = wne.f39444a;
        int i2 = ousVar2.l;
        if (i2 == 0) {
            z1x.P(obj);
            m9s m9sVar2 = ((xus) d()).e;
            if (m9sVar2 == null) {
                return Unit.f46060a;
            }
            h3c h3cVar = (h3c) this.n;
            long j = m9sVar2.o;
            long j2 = m9sVar2.p;
            ousVar2.i = m9sVar2;
            ousVar2.l = 1;
            Object objA = h3cVar.a(j, j2, ousVar2);
            if (objA == wneVar) {
                return wneVar;
            }
            m9sVar = m9sVar2;
            obj = objA;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            m9sVar = ousVar2.i;
            z1x.P(obj);
        }
        String str = (String) obj;
        Long l = (Long) CollectionsKt.firstOrNull(m9sVar.c);
        long jLongValue = l != null ? l.longValue() : 0L;
        Long l2 = (Long) CollectionsKt.firstOrNull(m9sVar.d);
        long jLongValue2 = l2 != null ? l2.longValue() : 0L;
        List list = ((xus) d()).d.f25977a;
        List list2 = ((xus) d()).d.b;
        boolean z = ((xus) d()).d.c;
        g(new tus(((xus) d()).c, jLongValue, jLongValue2, m9sVar.f21426a, m9sVar.b, m9sVar.o, m9sVar.p, m9sVar.A, str, m9sVar.G, m9sVar.f, list, list2, z, m9sVar.x, m9sVar.u.length() > 0));
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (i(r3) == r4) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011f, code lost:
    
        if (r0 == r4) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object j(a.nus r19, a.zje r20) {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.rus.j(a.nus, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object k(jll0 jll0Var, zje zjeVar) {
        lll0 lll0Var;
        Object next;
        Pair pair;
        Object obj;
        long j;
        Map map;
        Object value;
        mll0 mll0Var;
        Object value2;
        mll0 mll0Var2;
        jll0 jll0Var2 = jll0Var;
        if (zjeVar instanceof lll0) {
            lll0Var = (lll0) zjeVar;
            int i = lll0Var.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                lll0Var.l = i - Integer.MIN_VALUE;
            } else {
                lll0Var = new lll0(this, zjeVar);
            }
        } else {
            lll0Var = new lll0(this, zjeVar);
        }
        Object obj2 = lll0Var.j;
        wne wneVar = wne.f39444a;
        int i2 = lll0Var.l;
        if (i2 == 0) {
            z1x.P(obj2);
            lll0Var.i = jll0Var2;
            lll0Var.l = 1;
            if (x2t0.f(this, jll0Var2, lll0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jll0Var2 = lll0Var.i;
            z1x.P(obj2);
        }
        if (Intrinsics.d(jll0Var2, dll0.f6288a)) {
            e();
        } else {
            boolean z = jll0Var2 instanceof ell0;
            ocj ocjVar = this.b;
            if (z) {
                ocjVar.getClass();
                p7m0 p7m0Var = ocjVar.f25029a;
                do {
                    value2 = p7m0Var.getValue();
                    mll0Var2 = (mll0) value2;
                    mll0Var2.getClass();
                } while (!p7m0Var.m(value2, mll0.a(mll0Var2, null, ((ell0) jll0Var2).f8005a, 3)));
            } else if (jll0Var2 instanceof fll0) {
                ocjVar.getClass();
                p7m0 p7m0Var2 = ocjVar.f25029a;
                do {
                    value = p7m0Var2.getValue();
                    mll0Var = (mll0) value;
                    mll0Var.getClass();
                } while (!p7m0Var2.m(value, mll0.a(mll0Var, ((fll0) jll0Var2).f9744a, null, 5)));
            } else {
                if (jll0Var2 instanceof gll0) {
                    return Unit.f46060a;
                }
                if (!(jll0Var2 instanceof hll0)) {
                    t9f.b();
                    return null;
                }
                long j2 = ((hll0) jll0Var2).f13268a;
                Iterator it = ((mll0) d()).b.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((d2w) next).b() != j2);
                final d2w d2wVar = (d2w) next;
                if (d2wVar == null) {
                    jf4.n("Game not found");
                    return null;
                }
                ((je) this.n).h(d2wVar.d(), d2wVar.g(), d2wVar.a(), ((mll0) d()).c);
                ((bn6) this.m).e(d2wVar.d(), d2wVar.g(), d2wVar.a(), true, false, ((mll0) d()).c, null, null);
                pv00 pv00Var = (pv00) this.l;
                List list = ((mll0) d()).f21996a;
                List list2 = wcm0.f38932a;
                List listSplit$default = StringsKt__StringsKt.split$default(d2wVar.c(), new String[]{Separators.COLON}, false, 2, 2, null);
                ArrayList arrayList = new ArrayList(r3d.q(listSplit$default, 10));
                Iterator it2 = listSplit$default.iterator();
                while (it2.hasNext()) {
                    arrayList.add(StringsKt.u0((String) it2.next()).toString());
                }
                boolean z2 = d2wVar instanceof u1w;
                if (z2) {
                    u1w u1wVar = (u1w) d2wVar;
                    pair = new Pair(wcm0.a(u1wVar.o), wcm0.a(u1wVar.p));
                } else if (d2wVar instanceof x1w) {
                    x1w x1wVar = (x1w) d2wVar;
                    pair = new Pair(wcm0.a(x1wVar.n), wcm0.a(x1wVar.o));
                } else if (d2wVar instanceof c2w) {
                    c2w c2wVar = (c2w) d2wVar;
                    pair = new Pair(wcm0.a(c2wVar.o), wcm0.a(c2wVar.p));
                } else {
                    y6p0 y6p0Var = y6p0.e;
                    pair = new Pair(y6p0Var, y6p0Var);
                }
                String strF = d2wVar.f();
                long jD = d2wVar.d();
                boolean z3 = d2wVar instanceof y1w;
                if (z3) {
                    obj = null;
                    j = ((y1w) d2wVar).l;
                } else {
                    obj = null;
                    if (d2wVar instanceof z1w) {
                        j = 0;
                    } else if (z2) {
                        j = ((u1w) d2wVar).l;
                    } else if (d2wVar instanceof x1w) {
                        j = ((x1w) d2wVar).l;
                    } else {
                        if (!(d2wVar instanceof c2w)) {
                            t9f.b();
                            return null;
                        }
                        j = ((c2w) d2wVar).l;
                    }
                }
                long j3 = j;
                String strC = d2wVar.c();
                String str = (String) CollectionsKt.firstOrNull(arrayList);
                String str2 = str == null ? "0" : str;
                String str3 = (String) CollectionsKt.f0(arrayList);
                String str4 = str3 == null ? "0" : str3;
                y6p0 y6p0Var2 = (y6p0) pair.f46059a;
                y6p0 y6p0Var3 = (y6p0) pair.b;
                String strH = d2wVar.h();
                int iA = d2wVar.a();
                if (z3) {
                    map = ((y1w) d2wVar).i;
                } else if (d2wVar instanceof z1w) {
                    map = lun.f20680a;
                    map.getClass();
                } else if (z2) {
                    map = ((u1w) d2wVar).i;
                } else if (d2wVar instanceof x1w) {
                    map = ((x1w) d2wVar).i;
                } else {
                    if (!(d2wVar instanceof c2w)) {
                        t9f.b();
                        return obj;
                    }
                    map = ((c2w) d2wVar).i;
                }
                String str5 = (String) map.get(w1w.b);
                if (str5 == null) {
                    str5 = "";
                }
                final byte b = 0;
                String strD = k7x.D(iA, strH, str5, list, false);
                String str6 = (String) CollectionsKt.firstOrNull(arrayList);
                String str7 = str6 == null ? "0" : str6;
                String str8 = (String) CollectionsKt.f0(arrayList);
                pv00Var.n(new vcm0(strF, jD, "", j3, strC, str2, str4, y6p0Var2, y6p0Var3, 0, 0, true, strD, true, false, str7, str8 == null ? "0" : str8));
                if (d2wVar.f().length() == 0) {
                    g(new nll0());
                } else {
                    boolean zContains = gql0.b().contains(Long.valueOf(d2wVar.g()));
                    oeg0 oeg0Var = this.i;
                    if (zContains) {
                        oeg0Var.c().d(new Function1(this) { // from class: a.kll0
                            public final /* synthetic */ rus b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                byte b2 = b;
                                d2w d2wVar2 = d2wVar;
                                rus rusVar = this.b;
                                k0w0 k0w0Var = (k0w0) obj3;
                                switch (b2) {
                                    case 0:
                                        k0w0Var.getClass();
                                        gr00 gr00Var = (gr00) rusVar.k;
                                        CyberGameStatisticScreenParams cyberGameStatisticScreenParams = new CyberGameStatisticScreenParams(d2wVar2.f(), 0, d2wVar2.a(), d2wVar2.g());
                                        gr00Var.getClass();
                                        k0w0Var.h(new CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1(cyberGameStatisticScreenParams, gr00Var));
                                        break;
                                    default:
                                        k0w0Var.getClass();
                                        yfm0 yfm0Var = (yfm0) rusVar.j;
                                        zfm0 zfm0Var = (zfm0) yfm0Var;
                                        k0w0Var.h(zfm0Var.a(d2wVar2.d(), d2wVar2.f()));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    } else {
                        final byte b2 = 1;
                        oeg0Var.c().d(new Function1(this) { // from class: a.kll0
                            public final /* synthetic */ rus b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                byte b3 = b2;
                                d2w d2wVar2 = d2wVar;
                                rus rusVar = this.b;
                                k0w0 k0w0Var = (k0w0) obj3;
                                switch (b3) {
                                    case 0:
                                        k0w0Var.getClass();
                                        gr00 gr00Var = (gr00) rusVar.k;
                                        CyberGameStatisticScreenParams cyberGameStatisticScreenParams = new CyberGameStatisticScreenParams(d2wVar2.f(), 0, d2wVar2.a(), d2wVar2.g());
                                        gr00Var.getClass();
                                        k0w0Var.h(new CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1(cyberGameStatisticScreenParams, gr00Var));
                                        break;
                                    default:
                                        k0w0Var.getClass();
                                        yfm0 yfm0Var = (yfm0) rusVar.j;
                                        zfm0 zfm0Var = (zfm0) yfm0Var;
                                        k0w0Var.h(zfm0Var.a(d2wVar2.d(), d2wVar2.f()));
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                    }
                }
            }
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(zje zjeVar) {
        qus qusVar;
        Object value;
        xus xusVar;
        if (zjeVar instanceof qus) {
            qusVar = (qus) zjeVar;
            int i = qusVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qusVar.k = i - Integer.MIN_VALUE;
            } else {
                qusVar = new qus(this, zjeVar);
            }
        } else {
            qusVar = new qus(this, zjeVar);
        }
        Object obj = qusVar.i;
        wne wneVar = wne.f39444a;
        int i2 = qusVar.k;
        if (i2 == 0) {
            z1x.P(obj);
            vpu vpuVar = (vpu) this.l;
            qusVar.k = 1;
            if (vpuVar.b(false, qusVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        ocj ocjVar = this.b;
        ocjVar.getClass();
        p7m0 p7m0Var = ocjVar.f25029a;
        do {
            value = p7m0Var.getValue();
            xusVar = (xus) value;
            xusVar.getClass();
        } while (!p7m0Var.m(value, xus.a(xusVar, 0, null, null, 119)));
        g(vus.f38065a);
        return Unit.f46060a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rus(oeg0 oeg0Var, yfm0 yfm0Var, gr00 gr00Var, pv00 pv00Var, bn6 bn6Var, je jeVar, luu luuVar) {
        super(new rlg(luuVar, (byte) 1));
        oeg0Var.getClass();
        this.i = oeg0Var;
        this.j = yfm0Var;
        this.k = gr00Var;
        this.l = pv00Var;
        this.m = bn6Var;
        this.n = jeVar;
    }
}
