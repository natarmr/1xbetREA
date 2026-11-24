package a;

import android.content.Intent;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.client1.features.appactivity.IntentForwardingActivity;
import org.xplatform.cyber.game.core.presentation.action.CyberActionDialogParams;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampResultsParams;
import org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams;

/* JADX INFO: loaded from: classes3.dex */
public final class cr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4819a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;
    public Object p;
    public Object q;
    public Object r;

    public cr(jyz jyzVar, iw20 iw20Var, cad cadVar, us00 us00Var, i1w0 i1w0Var, sa10 sa10Var, ii iiVar, m1e m1eVar, duj dujVar, btt0 btt0Var, ctf0 ctf0Var, gii0 gii0Var, knf0 knf0Var) {
        this.f4819a = (byte) 7;
        this.c = iw20Var;
        this.d = sa10Var;
        this.e = jyzVar;
        this.f = gii0Var;
        this.g = btt0Var;
        this.h = knf0Var;
        this.i = us00Var;
        this.j = i1w0Var;
        this.k = m1eVar;
        this.l = ctf0Var;
        this.m = cadVar;
        this.n = dujVar;
        byte b = 11;
        this.o = mbl.b(new rii(this, 3, b));
        this.p = mbl.b(new rii(this, 2, b));
        this.b = mbl.b(new rii(this, 1, b));
        this.q = mbl.b(new rii(this, 4, b));
        this.r = new rii(this, 0, b);
    }

    public static void g(cr crVar, String str, int i, Set set, Function0 function0) {
        bmh bmhVar = new bmh((byte) 20);
        hie0 hie0Var = new hie0();
        bby bbyVar = (bby) crVar.p;
        if (bbyVar == null || !bbyVar.isActive()) {
            crVar.p = sac.V((sje) crVar.o, new x2i((byte) 4), null, null, new r4j(hie0Var, crVar, set, str, i, function0, bmhVar, null), 14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009f, code lost:
    
        if (r12.l(r13, r0) == r1) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(a.lvj0 r13, a.zje r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof a.zq
            if (r0 == 0) goto L13
            r0 = r14
            a.zq r0 = (a.zq) r0
            int r1 = r0.m
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.m = r1
            goto L18
        L13:
            a.zq r0 = new a.zq
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.k
            a.wne r1 = a.wne.f39444a
            int r2 = r0.m
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L41
            if (r2 == r5) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2f
            a.z1x.P(r14)
            goto La2
        L2f:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r12)
            return r6
        L35:
            a.qu6 r13 = r0.j
            a.z1x.P(r14)
            goto L87
        L3b:
            a.lvj0 r13 = r0.i
            a.z1x.P(r14)
            goto L55
        L41:
            a.z1x.P(r14)
            java.lang.Object r14 = r12.c
            a.znt r14 = (a.znt) r14
            r0.i = r13
            r0.m = r5
            a.chf0 r14 = r14.f44690a
            java.io.Serializable r14 = r14.p(r0)
            if (r14 != r1) goto L55
            goto La1
        L55:
            java.lang.Iterable r14 = (java.lang.Iterable) r14
            java.util.Iterator r14 = r14.iterator()
        L5b:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto L71
            java.lang.Object r2 = r14.next()
            r5 = r2
            a.qu6 r5 = (a.qu6) r5
            long r7 = r5.x
            r9 = 707(0x2c3, double:3.493E-321)
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r5 != 0) goto L5b
            goto L72
        L71:
            r2 = r6
        L72:
            r14 = r2
            a.qu6 r14 = (a.qu6) r14
            if (r14 == 0) goto La2
            r0.i = r6
            r0.j = r14
            r0.m = r4
            java.lang.Object r13 = r12.d(r13, r0)
            if (r13 != r1) goto L84
            goto La1
        L84:
            r11 = r14
            r14 = r13
            r13 = r11
        L87:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto La2
            java.lang.Object r12 = r12.q
            a.zri r12 = (a.zri) r12
            long r13 = r13.f29333a
            r0.i = r6
            r0.j = r6
            r0.m = r3
            java.lang.Object r12 = r12.l(r13, r0)
            if (r12 != r1) goto La2
        La1:
            return r1
        La2:
            kotlin.Unit r12 = kotlin.Unit.f46060a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cr.a(a.lvj0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0211  */
    /* JADX WARN: Code duplicated, block: B:39:0x023c  */
    /* JADX WARN: Code duplicated, block: B:42:0x026a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0286  */
    /* JADX WARN: Code duplicated, block: B:49:0x0288  */
    /* JADX WARN: Code duplicated, block: B:53:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:57:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:60:0x031c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0350  */
    /* JADX WARN: Code duplicated, block: B:67:0x0365  */
    /* JADX WARN: Code duplicated, block: B:69:0x0368  */
    /* JADX WARN: Code duplicated, block: B:79:0x03ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x03d9  */
    /* JADX WARN: Code duplicated, block: B:85:0x0415  */
    /* JADX WARN: Code duplicated, block: B:86:0x0417  */
    /* JADX WARN: Code duplicated, block: B:8:0x0028  */
    /* JADX WARN: Code duplicated, block: B:90:0x047d  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0398, code lost:
    
        if (r4.k(r7, r2, r12) == r13) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x03d5, code lost:
    
        if (r4.g(r2, r12) == r13) goto L52;
     */
    /* JADX WARN: Type inference failed for: r1v17, types: [a.gwe, a.q4f] */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(a.m0k0 r35, a.zxj0 r36, a.gwe r37, a.hrs r38, a.zje r39) {
        /*
            Method dump skipped, instruction units count: 1214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.cr.b(a.m0k0, a.zxj0, a.gwe, a.hrs, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(lvj0 lvj0Var, zje zjeVar) {
        br brVar;
        if (zjeVar instanceof br) {
            brVar = (br) zjeVar;
            int i = brVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                brVar.l = i - Integer.MIN_VALUE;
            } else {
                brVar = new br(this, zjeVar);
            }
        } else {
            brVar = new br(this, zjeVar);
        }
        Object objB = brVar.j;
        wne wneVar = wne.f39444a;
        int i2 = brVar.l;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objB);
            rpt rptVar = (rpt) this.p;
            brVar.i = lvj0Var;
            brVar.l = 1;
            objB = ((zfo) rptVar.f30901a).b(brVar);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lvj0Var = brVar.i;
            z1x.P(objB);
        }
        for (Object obj2 : (Iterable) objB) {
            if (((ueo) obj2).f35538a == lvj0Var.j) {
                obj = obj2;
                break;
            }
        }
        ueo ueoVar = (ueo) obj;
        return Boolean.valueOf(ueoVar != null && ueoVar.d == 2 && ((pru) this.b).a().I1 == oxk0.DEFAULT_OPTIONBET);
    }

    public z220 e() {
        zn00 zn00Var = new zn00((gii0) this.g, (byte) 20);
        r7e0 r7e0Var = (r7e0) this.h;
        knf0 knf0Var = (knf0) this.i;
        mne mneVarH = ((psc) ((cad) this.d).b).h();
        x1x.x(mneVarH);
        return new z220(zn00Var, r7e0Var, knf0Var, mneVarH);
    }

    public void f(String str, sba0 sba0Var, Long l, sr00 sr00Var) throws Throwable {
        h760 h760Var = (h760) this.d;
        us00 us00Var = (us00) this.c;
        if ((sba0Var == null ? -1 : p4j.f26356a[sba0Var.ordinal()]) == 1) {
            Intent intentPutExtra = new Intent(us00Var, (Class<?>) IntentForwardingActivity.class).putExtra("OPEN_SCREEN", "AGGREGATOR_PROVIDER_GAMES").setFlags(335544320).putExtra("PARTITION_ID", 1L).putExtra("PARAM_TYPE", "provider").putExtra("PARAM_ID", l != null ? l.longValue() : 0L);
            intentPutExtra.getClass();
            intentPutExtra.putExtra("LOCAL_NOTIFICATION_TYPE", sr00Var);
            t760 t760VarA = h760Var.a();
            gle0 gle0Var = k9h0.f17916a;
            String string = us00Var.getString(R.string.app_name);
            string.getClass();
            t760.a(t760VarA, intentPutExtra, string, str, 1073741824, null, null, "AGGREGATOR_PROVIDER_GAMES", 0, null, 944);
            return;
        }
        Intent intentPutExtra2 = new Intent(us00Var, (Class<?>) IntentForwardingActivity.class).putExtra("OPEN_SCREEN", "DAILY_TASKS");
        intentPutExtra2.getClass();
        intentPutExtra2.putExtra("LOCAL_NOTIFICATION_TYPE", sr00Var);
        t760 t760VarA2 = h760Var.a();
        String string2 = us00Var.getString(R.string.app_name);
        string2.getClass();
        gle0 gle0Var2 = k9h0.f17916a;
        t760.a(t760VarA2, intentPutExtra2, string2, str, 67108864, null, null, "DAILY_TASKS", 0, null, 944);
    }

    public pzu h() {
        return new pzu((btt0) this.m, (hqr0) this.n, (csr0) this.j, new epi0((gii0) this.k, (byte) 20), (knf0) this.l, (tgk) this.o);
    }

    public fiu0 i() {
        switch (this.f4819a) {
            case 12:
                iyk iykVar = new iyk(2);
                iykVar.b(t4e0.class, (gji) this.p);
                iykVar.b(x8e0.class, (gji) this.q);
                return new fiu0(iykVar.a());
            default:
                iyk iykVar2 = new iyk(2);
                iykVar2.b(k4s0.class, (msi) this.q);
                iykVar2.b(n6s0.class, (msi) this.r);
                return new fiu0(iykVar2.a());
        }
    }

    public fuj0 j() {
        return new fuj0(new trm0((gii0) this.e, (byte) 13), (btt0) this.f);
    }

    public cr(us00 us00Var, h760 h760Var, nr nrVar, cu cuVar, oeg0 oeg0Var, peg0 peg0Var, pru pruVar, jvq jvqVar, wdk0 wdk0Var, b4j b4jVar, iqt iqtVar, je jeVar, mne mneVar) {
        this.f4819a = (byte) 19;
        h760Var.getClass();
        oeg0Var.getClass();
        wdk0Var.getClass();
        this.c = us00Var;
        this.d = h760Var;
        this.e = nrVar;
        this.f = cuVar;
        this.g = oeg0Var;
        this.h = peg0Var;
        this.b = pruVar;
        this.i = jvqVar;
        this.j = wdk0Var;
        this.k = b4jVar;
        this.l = iqtVar;
        this.m = jeVar;
        this.n = mneVar;
        this.o = d5c.a(mneVar.b);
    }

    public cr(gtz gtzVar, iw20 iw20Var, cad cadVar, us00 us00Var, i1w0 i1w0Var, sa10 sa10Var, ii iiVar, m1e m1eVar, duj dujVar, btt0 btt0Var, ctf0 ctf0Var, gii0 gii0Var, knf0 knf0Var) {
        this.f4819a = (byte) 5;
        this.c = iw20Var;
        this.d = sa10Var;
        this.e = gtzVar;
        this.f = gii0Var;
        this.g = knf0Var;
        this.h = btt0Var;
        this.i = us00Var;
        this.j = i1w0Var;
        this.k = m1eVar;
        this.l = ctf0Var;
        this.m = cadVar;
        this.n = dujVar;
        byte b = 7;
        this.o = mbl.b(new rii(this, 3, b));
        this.p = mbl.b(new rii(this, 2, b));
        this.b = mbl.b(new rii(this, 1, b));
        this.q = mbl.b(new rii(this, 4, b));
        this.r = new rii(this, 0, b);
    }

    public cr(znt zntVar, h9c h9cVar, e8u e8uVar, ik9 ik9Var, j9c j9cVar, chf0 chf0Var, o4a o4aVar, vn7 vn7Var, ppt pptVar, vit0 vit0Var, fht0 fht0Var, phf0 phf0Var, jtt jttVar, rpt rptVar, pru pruVar, zri zriVar, r9u r9uVar) {
        this.f4819a = (byte) 0;
        r9uVar.getClass();
        this.c = zntVar;
        this.d = h9cVar;
        this.e = e8uVar;
        this.f = ik9Var;
        this.g = j9cVar;
        this.h = chf0Var;
        this.i = o4aVar;
        this.j = vn7Var;
        this.k = pptVar;
        this.l = vit0Var;
        this.m = fht0Var;
        this.n = phf0Var;
        this.o = jttVar;
        this.p = rptVar;
        this.b = pruVar;
        this.q = zriVar;
        this.r = r9uVar;
    }

    public cr(wsz wszVar, iw20 iw20Var, cad cadVar, i1w0 i1w0Var, ocl oclVar, m1e m1eVar, duj dujVar, btt0 btt0Var, ctf0 ctf0Var, gii0 gii0Var, wgu wguVar, kuy kuyVar, e400 e400Var) {
        this.f4819a = (byte) 8;
        this.c = wszVar;
        this.d = gii0Var;
        this.e = btt0Var;
        this.f = e400Var;
        this.g = cadVar;
        this.h = kuyVar;
        this.i = wguVar;
        this.j = i1w0Var;
        this.k = m1eVar;
        this.l = ctf0Var;
        this.m = dujVar;
        this.n = iw20Var;
        this.o = oclVar;
        byte b = 15;
        this.p = mbl.b(new rii(this, 3, b));
        this.b = mbl.b(new rii(this, 2, b));
        this.q = mbl.b(new rii(this, 1, b));
        this.r = n0k0.a(new rii(this, 0, b));
    }

    public cr(htz htzVar, iw20 iw20Var, cad cadVar, i1w0 i1w0Var, ocl oclVar, m1e m1eVar, duj dujVar, btt0 btt0Var, kwz kwzVar, njo njoVar, ctf0 ctf0Var, gii0 gii0Var, wgu wguVar) {
        this.f4819a = (byte) 6;
        this.c = htzVar;
        this.d = gii0Var;
        this.e = kwzVar;
        this.f = njoVar;
        this.g = btt0Var;
        this.h = ctf0Var;
        this.i = wguVar;
        this.j = i1w0Var;
        this.k = m1eVar;
        this.l = cadVar;
        this.m = dujVar;
        this.n = iw20Var;
        this.o = oclVar;
        byte b = 10;
        this.p = mbl.b(new rii(this, 3, b));
        this.b = mbl.b(new rii(this, 2, b));
        this.q = mbl.b(new rii(this, 1, b));
        this.r = n0k0.a(new rii(this, 0, b));
    }

    public cr(cad cadVar, ehf0 ehf0Var, wsf0 wsf0Var, Long l, String str, s91 s91Var, pru pruVar, oeg0 oeg0Var, ctf0 ctf0Var, qu quVar, zr1 zr1Var, r2v r2vVar, ytt yttVar, bzt bztVar, ii iiVar) {
        this.f4819a = (byte) 16;
        this.c = ehf0Var;
        this.d = wsf0Var;
        this.e = cadVar;
        this.f = s91Var;
        this.b = pruVar;
        this.g = oeg0Var;
        this.h = ctf0Var;
        this.i = quVar;
        this.j = zr1Var;
        this.k = r2vVar;
        this.l = yttVar;
        this.m = bztVar;
        this.n = l;
        this.o = str;
        this.p = iiVar;
        byte b = 14;
        this.q = new msi(this, 0, b);
        this.r = new msi(this, 1, b);
    }

    public cr(cad cadVar, pmi0 pmi0Var, r9u r9uVar, i1w0 i1w0Var, gii0 gii0Var, duj dujVar, ctf0 ctf0Var, String str, jd30 jd30Var, m1e m1eVar, uyu uyuVar, Long l, knf0 knf0Var, ocl oclVar, qzt qztVar, wyu wyuVar) {
        this.f4819a = (byte) 10;
        this.c = gii0Var;
        this.d = jd30Var;
        this.e = knf0Var;
        this.f = cadVar;
        this.g = oclVar;
        this.h = m1eVar;
        this.i = str;
        this.j = l;
        this.k = uyuVar;
        this.l = dujVar;
        this.m = pmi0Var;
        this.n = qztVar;
        this.o = ctf0Var;
        this.p = wyuVar;
        this.b = i1w0Var;
        this.r = r9uVar;
        this.q = n0k0.a(new rki(this, (byte) 9));
    }

    public cr(cad cadVar, pmi0 pmi0Var, i1w0 i1w0Var, gii0 gii0Var, pru pruVar, ctf0 ctf0Var, duj dujVar, r9u r9uVar, String str, zb30 zb30Var, m1e m1eVar, uyu uyuVar, ocl oclVar, Long l, knf0 knf0Var, wyu wyuVar) {
        this.f4819a = (byte) 11;
        this.c = gii0Var;
        this.d = zb30Var;
        this.e = knf0Var;
        this.f = oclVar;
        this.g = m1eVar;
        this.h = str;
        this.i = l;
        this.j = uyuVar;
        this.k = dujVar;
        this.l = cadVar;
        this.m = pmi0Var;
        this.b = pruVar;
        this.n = ctf0Var;
        this.o = wyuVar;
        this.p = i1w0Var;
        this.r = r9uVar;
        this.q = n0k0.a(new rki(this, (byte) 10));
    }

    public cr(epi0 epi0Var, pp90 pp90Var, sue sueVar, i1w0 i1w0Var, o2n0 o2n0Var, mne mneVar, ctf0 ctf0Var, n660 n660Var, bzt bztVar, gqc gqcVar, ljt0 ljt0Var, j1q0 j1q0Var, ntu ntuVar, rl70 rl70Var, rjo rjoVar, bot botVar, bbw0 bbw0Var) {
        this.f4819a = (byte) 15;
        this.c = o2n0Var;
        this.d = ctf0Var;
        this.e = i1w0Var;
        this.f = n660Var;
        this.g = bztVar;
        this.h = gqcVar;
        this.i = ljt0Var;
        this.j = epi0Var;
        this.k = j1q0Var;
        this.l = pp90Var;
        this.m = ntuVar;
        this.n = botVar;
        this.o = rjoVar;
        this.p = bbw0Var;
        this.b = sueVar;
        this.q = mneVar;
        this.r = n0k0.a(new rti(this, (byte) 21));
    }

    public cr(cad cadVar, onv onvVar, gle0 gle0Var, ii iiVar, duj dujVar, ctf0 ctf0Var, ort ortVar, cyh cyhVar, z4w0 z4w0Var, rou rouVar, pru pruVar, b4j b4jVar, oeg0 oeg0Var, b3c0 b3c0Var, m1e m1eVar, x20 x20Var, bzt bztVar, wdk0 wdk0Var) {
        this.f4819a = (byte) 1;
        this.c = oeg0Var;
        this.d = dujVar;
        this.e = gle0Var;
        this.f = cadVar;
        this.g = ctf0Var;
        this.h = m1eVar;
        this.i = ortVar;
        this.j = cyhVar;
        this.k = z4w0Var;
        this.l = rouVar;
        this.b = pruVar;
        this.m = onvVar;
        this.n = b3c0Var;
        this.o = b4jVar;
        this.p = x20Var;
        this.q = bztVar;
        this.r = new pai(this, (byte) 8);
    }

    public cr(cad cadVar, pyg pygVar, roi0 roi0Var, rrc rrcVar, epi0 epi0Var, i1w0 i1w0Var, ctf0 ctf0Var, UniversalChampResultsParams universalChampResultsParams, g2v g2vVar, m1e m1eVar, wdk0 wdk0Var, pmi pmiVar, wiu wiuVar, pru pruVar, knf0 knf0Var, gii0 gii0Var) {
        this.f4819a = (byte) 17;
        this.c = universalChampResultsParams;
        this.d = cadVar;
        this.e = g2vVar;
        this.f = wiuVar;
        this.g = ctf0Var;
        this.h = pygVar;
        this.i = roi0Var;
        this.j = i1w0Var;
        this.k = rrcVar;
        this.l = m1eVar;
        this.m = pmiVar;
        this.n = gii0Var;
        this.o = knf0Var;
        this.p = epi0Var;
        this.b = pruVar;
        byte b = 16;
        this.q = mbl.b(new msi(this, 1, b));
        this.r = new msi(this, 0, b);
    }

    public cr(cad cadVar, pmi0 pmi0Var, nh70 nh70Var, r9u r9uVar, i1w0 i1w0Var, String str, Long l, pru pruVar, duj dujVar, ctf0 ctf0Var, uyu uyuVar, m1e m1eVar, ntu ntuVar, knf0 knf0Var, gii0 gii0Var, ocl oclVar, wyu wyuVar) {
        this.f4819a = (byte) 14;
        this.c = ntuVar;
        this.d = gii0Var;
        this.e = knf0Var;
        this.f = m1eVar;
        this.g = dujVar;
        this.h = l;
        this.i = str;
        this.j = uyuVar;
        this.k = cadVar;
        this.l = ctf0Var;
        this.m = oclVar;
        this.n = i1w0Var;
        this.o = pmi0Var;
        this.b = pruVar;
        this.p = wyuVar;
        this.r = r9uVar;
        this.q = new rti(this, (byte) 14);
    }

    public cr(cad cadVar, wsf0 wsf0Var, i1w0 i1w0Var, duj dujVar, ntu ntuVar, btt0 btt0Var, knf0 knf0Var, gii0 gii0Var, a6u a6uVar, m1e m1eVar, ctf0 ctf0Var, ii iiVar, wdk0 wdk0Var, v88 v88Var, j1q0 j1q0Var, ocl oclVar, vby vbyVar, fd10 fd10Var) {
        this.f4819a = (byte) 9;
        this.c = m1eVar;
        this.d = btt0Var;
        this.e = knf0Var;
        this.f = vbyVar;
        this.g = gii0Var;
        this.h = cadVar;
        this.i = a6uVar;
        this.j = ntuVar;
        this.k = wsf0Var;
        this.l = j1q0Var;
        this.m = v88Var;
        this.n = i1w0Var;
        this.o = oclVar;
        this.p = ctf0Var;
        this.b = dujVar;
        this.q = fd10Var;
        this.r = new tii(this, (byte) 28);
    }

    public cr(cad cadVar, pmi0 pmi0Var, lme0 lme0Var, String str, Long l, i1w0 i1w0Var, duj dujVar, gii0 gii0Var, m1e m1eVar, wyu wyuVar, pru pruVar, knf0 knf0Var, ctf0 ctf0Var, uyu uyuVar, ocl oclVar, qzt qztVar, r9u r9uVar) {
        this.f4819a = (byte) 3;
        this.c = ctf0Var;
        this.d = qztVar;
        this.e = pmi0Var;
        this.f = gii0Var;
        this.g = knf0Var;
        this.h = cadVar;
        this.i = wyuVar;
        this.j = str;
        this.k = l;
        this.l = i1w0Var;
        this.m = dujVar;
        this.n = m1eVar;
        this.o = oclVar;
        this.p = uyuVar;
        this.b = pruVar;
        this.r = r9uVar;
        this.q = new yei(this, (byte) 1);
    }

    public cr(clc clcVar, cad cadVar, xhi xhiVar, a1d a1dVar, iip iipVar, rrc rrcVar, ogh oghVar, CyberActionDialogParams cyberActionDialogParams, oeg0 oeg0Var, atz atzVar, uf3 uf3Var, duj dujVar, wsz wszVar, lbu lbuVar, wdk0 wdk0Var, je jeVar, ih5 ih5Var, kys0 kys0Var) {
        this.f4819a = (byte) 2;
        this.c = cyberActionDialogParams;
        this.d = oeg0Var;
        this.e = atzVar;
        this.f = uf3Var;
        this.g = xhiVar;
        this.h = dujVar;
        this.i = clcVar;
        this.j = lbuVar;
        this.k = a1dVar;
        this.l = iipVar;
        this.m = rrcVar;
        this.n = oghVar;
        this.o = cadVar;
        this.p = ih5Var;
        this.b = jeVar;
        this.q = kys0Var;
        this.r = new uci(this, (byte) 21);
    }

    public cr(cad cadVar, wsf0 wsf0Var, d1p d1pVar, i1w0 i1w0Var, xrs xrsVar, ii iiVar, btt0 btt0Var, eqx eqxVar, duj dujVar, v88 v88Var, gii0 gii0Var, cyh cyhVar, z4w0 z4w0Var, ort ortVar, gst0 gst0Var, ctf0 ctf0Var, ih5 ih5Var) {
        this.f4819a = (byte) 18;
        this.c = i1w0Var;
        this.d = xrsVar;
        this.e = gii0Var;
        this.f = btt0Var;
        this.g = wsf0Var;
        this.h = v88Var;
        this.i = cyhVar;
        this.j = z4w0Var;
        this.k = cadVar;
        this.l = ortVar;
        this.m = dujVar;
        this.n = gst0Var;
        this.o = eqxVar;
        this.p = ctf0Var;
        this.b = ih5Var;
        this.q = d1pVar;
        this.r = n0k0.a(new yxi(this, (byte) 26));
    }

    public cr(cad cadVar, pmi0 pmi0Var, ugf0 ugf0Var, i1w0 i1w0Var, gii0 gii0Var, duj dujVar, r9u r9uVar, pru pruVar, m1e m1eVar, r7e0 r7e0Var, wyu wyuVar, knf0 knf0Var, ctf0 ctf0Var, RatingStatisticScreenParams ratingStatisticScreenParams, ocl oclVar) {
        this.f4819a = (byte) 12;
        this.c = ratingStatisticScreenParams;
        this.d = cadVar;
        this.e = m1eVar;
        this.f = i1w0Var;
        this.g = gii0Var;
        this.h = r7e0Var;
        this.i = knf0Var;
        this.j = dujVar;
        this.k = oclVar;
        this.l = ctf0Var;
        this.b = pruVar;
        this.m = pmi0Var;
        this.n = ugf0Var;
        this.o = wyuVar;
        this.r = r9uVar;
        byte b = 25;
        this.p = new gji(this, 0, b);
        this.q = new gji(this, 1, b);
    }

    public cr(wsf0 wsf0Var, cad cadVar, gle0 gle0Var, sa10 sa10Var, m1e m1eVar, duj dujVar, pru pruVar, i1w0 i1w0Var, ii iiVar, ctf0 ctf0Var, csr0 csr0Var, hqr0 hqr0Var, knf0 knf0Var, gii0 gii0Var, btt0 btt0Var, tgk tgkVar, r9u r9uVar) {
        this.f4819a = (byte) 4;
        this.c = i1w0Var;
        this.d = dujVar;
        this.e = gle0Var;
        this.f = ctf0Var;
        this.g = sa10Var;
        this.h = m1eVar;
        this.i = cadVar;
        this.b = pruVar;
        this.j = csr0Var;
        this.k = gii0Var;
        this.l = knf0Var;
        this.m = btt0Var;
        this.n = hqr0Var;
        this.o = tgkVar;
        this.p = wsf0Var;
        this.r = r9uVar;
        this.q = new tii(this, (byte) 11);
    }

    public cr(cad cadVar, pp90 pp90Var, lef0 lef0Var, ctf0 ctf0Var, ntu ntuVar, duj dujVar, rjo rjoVar, s31 s31Var, cyh cyhVar, z4w0 z4w0Var, rpt rptVar, czt cztVar, wdk0 wdk0Var, rl70 rl70Var, es esVar, s64 s64Var, mi70 mi70Var, zn00 zn00Var) {
        this.f4819a = (byte) 13;
        this.c = lef0Var;
        this.d = rptVar;
        this.e = esVar;
        this.f = ntuVar;
        this.g = pp90Var;
        this.h = rjoVar;
        this.i = s31Var;
        this.j = cyhVar;
        this.k = z4w0Var;
        this.l = cadVar;
        this.m = dujVar;
        this.n = mi70Var;
        this.o = zn00Var;
        this.p = ctf0Var;
        this.b = s64Var;
        this.q = cztVar;
        this.r = n0k0.a(new fri(this, (byte) 14));
    }
}
