package a;

import java.util.Date;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Unit;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes3.dex */
public final class vae {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vby f37081a;
    public final epi0 b;
    public final k050 c = new k050();
    public final k050 d = new k050();
    public final k050 e = new k050();
    public final qoj0 f = fxb.b();
    public final qoj0 g = fxb.b();
    public final qoj0 h = fxb.b();
    public final qoj0 i = fxb.b();
    public final qoj0 j = fxb.b();
    public final qoj0 k = fxb.b();
    public final qoj0 l = fxb.b();
    public final qoj0 m = fxb.b();
    public final qoj0 n = fxb.b();
    public final qoj0 o = fxb.b();
    public final qoj0 p = fxb.b();
    public final sje q;
    public final p7m0 r;
    public final AtomicInteger s;
    public aa40 t;
    public final k050 u;

    public vae(vby vbyVar, mne mneVar, epi0 epi0Var) {
        this.f37081a = vbyVar;
        this.b = epi0Var;
        dvj dvjVar = mneVar.b;
        kin0 kin0VarE = qem0.e();
        dvjVar.getClass();
        this.q = d5c.a(kotlin.coroutines.e.c(dvjVar, kin0VarE));
        this.r = q7m0.a(Boolean.FALSE);
        this.s = new AtomicInteger(0);
        this.u = new k050();
    }

    public final void a() {
        aa40 aa40Var = this.t;
        if (aa40Var != null) {
            aa40Var.a(true);
        }
        this.t = null;
        this.r.o(null, Boolean.FALSE);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(zje zjeVar) {
        iae iaeVar;
        if (zjeVar instanceof iae) {
            iaeVar = (iae) zjeVar;
            int i = iaeVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                iaeVar.k = i - Integer.MIN_VALUE;
            } else {
                iaeVar = new iae(this, zjeVar);
            }
        } else {
            iaeVar = new iae(this, zjeVar);
        }
        Object objC = iaeVar.i;
        wne wneVar = wne.f39444a;
        int i2 = iaeVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objC);
            Integer num = new Integer(this.s.getAndIncrement());
            g4v0 g4v0Var = new g4v0("GetChat", num, oun.INSTANCE);
            aa40 aa40VarG = g();
            jiy jiyVarSerializer = r4v0.Companion.serializer(z46.Companion.serializer(q5x.Q(aa40VarG.f.b, cyb.class)));
            int iIntValue = num.intValue();
            hae haeVar = new hae(aa40VarG, g4v0Var, yjeVar, (byte) 0);
            iaeVar.k = 1;
            objC = aa40VarG.c(iIntValue, haeVar, jiyVarSerializer, iaeVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        z46 z46Var = (z46) ((r4v0) objC).f29857a;
        Object obj = z46Var != null ? z46Var.f43753a : null;
        if (!(obj instanceof cyb)) {
            obj = null;
        }
        cyb cybVar = (cyb) obj;
        if (cybVar != null) {
            return cybVar;
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(int i, int i2, int i3, zje zjeVar) {
        jae jaeVar;
        if (zjeVar instanceof jae) {
            jaeVar = (jae) zjeVar;
            int i4 = jaeVar.k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                jaeVar.k = i4 - Integer.MIN_VALUE;
            } else {
                jaeVar = new jae(this, zjeVar);
            }
        } else {
            jaeVar = new jae(this, zjeVar);
        }
        Object objC = jaeVar.i;
        wne wneVar = wne.f39444a;
        int i5 = jaeVar.k;
        byte b = 1;
        yje yjeVar = null;
        if (i5 == 0) {
            z1x.P(objC);
            Integer num = new Integer(this.s.getAndIncrement());
            bzu bzuVar = new bzu((byte) 19);
            cww.F(bzuVar, "offsetId", new Integer(i));
            cww.F(bzuVar, "addOffset", new Integer(i2));
            cww.F(bzuVar, "limit", new Integer(i3));
            g4v0 g4v0Var = new g4v0("GetChatHistory", num, bzuVar.a());
            aa40 aa40VarG = g();
            jiy jiyVarSerializer = r4v0.Companion.serializer(z46.Companion.serializer(q5x.Q(aa40VarG.f.b, p840.class)));
            int iIntValue = num.intValue();
            hae haeVar = new hae(aa40VarG, g4v0Var, yjeVar, b);
            jaeVar.k = 1;
            objC = aa40VarG.c(iIntValue, haeVar, jiyVarSerializer, jaeVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i5 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        z46 z46Var = (z46) ((r4v0) objC).f29857a;
        Object obj = z46Var != null ? z46Var.f43753a : null;
        if (!(obj instanceof p840)) {
            obj = null;
        }
        p840 p840Var = (p840) obj;
        if (p840Var != null) {
            return p840Var;
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(zje zjeVar) {
        kae kaeVar;
        if (zjeVar instanceof kae) {
            kaeVar = (kae) zjeVar;
            int i = kaeVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kaeVar.k = i - Integer.MIN_VALUE;
            } else {
                kaeVar = new kae(this, zjeVar);
            }
        } else {
            kaeVar = new kae(this, zjeVar);
        }
        Object objC = kaeVar.i;
        wne wneVar = wne.f39444a;
        int i2 = kaeVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objC);
            Integer num = new Integer(this.s.getAndIncrement());
            g4v0 g4v0Var = new g4v0("GetConfig", num, oun.INSTANCE);
            aa40 aa40VarG = g();
            jiy jiyVarSerializer = r4v0.Companion.serializer(z46.Companion.serializer(q5x.Q(aa40VarG.f.b, f14.class)));
            int iIntValue = num.intValue();
            hae haeVar = new hae(aa40VarG, g4v0Var, yjeVar, (byte) 2);
            kaeVar.k = 1;
            objC = aa40VarG.c(iIntValue, haeVar, jiyVarSerializer, kaeVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        z46 z46Var = (z46) ((r4v0) objC).f29857a;
        Object obj = z46Var != null ? z46Var.f43753a : null;
        if (!(obj instanceof f14)) {
            obj = null;
        }
        f14 f14Var = (f14) obj;
        if (f14Var != null) {
            return f14Var;
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, zje zjeVar) {
        lae laeVar;
        if (zjeVar instanceof lae) {
            laeVar = (lae) zjeVar;
            int i = laeVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                laeVar.k = i - Integer.MIN_VALUE;
            } else {
                laeVar = new lae(this, zjeVar);
            }
        } else {
            laeVar = new lae(this, zjeVar);
        }
        Object objC = laeVar.i;
        wne wneVar = wne.f39444a;
        int i2 = laeVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objC);
            Integer num = new Integer(this.s.getAndIncrement());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            jdy jdyVarC = ncy.c(str);
            jdyVarC.getClass();
            g4v0 g4v0Var = new g4v0("GetDownloadMediaLink", num, new edy(linkedHashMap));
            aa40 aa40VarG = g();
            jiy jiyVarSerializer = r4v0.Companion.serializer(z46.Companion.serializer(q5x.Q(aa40VarG.f.b, mcl.class)));
            int iIntValue = num.intValue();
            hae haeVar = new hae(aa40VarG, g4v0Var, yjeVar, (byte) 3);
            laeVar.k = 1;
            objC = aa40VarG.c(iIntValue, haeVar, jiyVarSerializer, laeVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        z46 z46Var = (z46) ((r4v0) objC).f29857a;
        Object obj = z46Var != null ? z46Var.f43753a : null;
        if (!(obj instanceof mcl)) {
            obj = null;
        }
        mcl mclVar = (mcl) obj;
        if (mclVar != null) {
            return mclVar;
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(String str, w1x w1xVar, zje zjeVar) {
        mae maeVar;
        if (zjeVar instanceof mae) {
            maeVar = (mae) zjeVar;
            int i = maeVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                maeVar.k = i - Integer.MIN_VALUE;
            } else {
                maeVar = new mae(this, zjeVar);
            }
        } else {
            maeVar = new mae(this, zjeVar);
        }
        Object objC = maeVar.i;
        wne wneVar = wne.f39444a;
        int i2 = maeVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objC);
            Integer num = new Integer(this.s.getAndIncrement());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            jdy jdyVarC = ncy.c(str);
            jdyVarC.getClass();
            jdy jdyVarC2 = ncy.c(w1xVar.f38422a);
            jdyVarC2.getClass();
            g4v0 g4v0Var = new g4v0("GetDownloadMediaLink", num, new edy(linkedHashMap));
            aa40 aa40VarG = g();
            jiy jiyVarSerializer = r4v0.Companion.serializer(z46.Companion.serializer(q5x.Q(aa40VarG.f.b, mcl.class)));
            int iIntValue = num.intValue();
            hae haeVar = new hae(aa40VarG, g4v0Var, yjeVar, (byte) 4);
            maeVar.k = 1;
            objC = aa40VarG.c(iIntValue, haeVar, jiyVarSerializer, maeVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        z46 z46Var = (z46) ((r4v0) objC).f29857a;
        Object obj = z46Var != null ? z46Var.f43753a : null;
        if (!(obj instanceof mcl)) {
            obj = null;
        }
        mcl mclVar = (mcl) obj;
        if (mclVar != null) {
            return mclVar;
        }
        jf4.k(null);
        return null;
    }

    public final aa40 g() {
        aa40 aa40Var = this.t;
        if (aa40Var != null) {
            return aa40Var;
        }
        ohq.l("WebSocket connection is not stated. Start WebSocket connection before request");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(long j, zje zjeVar, String str) {
        nae naeVar;
        if (zjeVar instanceof nae) {
            naeVar = (nae) zjeVar;
            int i = naeVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                naeVar.k = i - Integer.MIN_VALUE;
            } else {
                naeVar = new nae(this, zjeVar);
            }
        } else {
            naeVar = new nae(this, zjeVar);
        }
        Object objC = naeVar.i;
        wne wneVar = wne.f39444a;
        int i2 = naeVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objC);
            Integer num = new Integer(this.s.getAndIncrement());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            jdy jdyVarC = ncy.c(str);
            jdyVarC.getClass();
            jdy jdyVarB = ncy.b(new Long(j));
            jdyVarB.getClass();
            g4v0 g4v0Var = new g4v0("GetUploadMediaLink", num, new edy(linkedHashMap));
            aa40 aa40VarG = g();
            jiy jiyVarSerializer = r4v0.Companion.serializer(z46.Companion.serializer(q5x.Q(aa40VarG.f.b, mcl.class)));
            int iIntValue = num.intValue();
            hae haeVar = new hae(aa40VarG, g4v0Var, yjeVar, (byte) 5);
            naeVar.k = 1;
            objC = aa40VarG.c(iIntValue, haeVar, jiyVarSerializer, naeVar);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        z46 z46Var = (z46) ((r4v0) objC).f29857a;
        Object obj = z46Var != null ? z46Var.f43753a : null;
        if (!(obj instanceof mcl)) {
            obj = null;
        }
        mcl mclVar = (mcl) obj;
        if (mclVar != null) {
            return mclVar;
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(zje zjeVar) {
        oae oaeVar;
        if (zjeVar instanceof oae) {
            oaeVar = (oae) zjeVar;
            int i = oaeVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                oaeVar.k = i - Integer.MIN_VALUE;
            } else {
                oaeVar = new oae(this, zjeVar);
            }
        } else {
            oaeVar = new oae(this, zjeVar);
        }
        Object obj = oaeVar.i;
        wne wneVar = wne.f39444a;
        int i2 = oaeVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            Integer num = new Integer(this.s.getAndIncrement());
            g4v0 g4v0Var = new g4v0("InvokeOperator", num, oun.INSTANCE);
            aa40 aa40VarG = g();
            jiy jiyVarSerializer = r4v0.Companion.serializer(z46.Companion.serializer(mcy.Companion.serializer()));
            int iIntValue = num.intValue();
            hae haeVar = new hae(aa40VarG, g4v0Var, yjeVar, (byte) 6);
            oaeVar.k = 1;
            if (aa40VarG.c(iIntValue, haeVar, jiyVarSerializer, oaeVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(lvu0 lvu0Var, zje zjeVar) {
        pae paeVar;
        lvu0 lvu0Var2;
        k050 k050Var;
        if (zjeVar instanceof pae) {
            paeVar = (pae) zjeVar;
            int i = paeVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                paeVar.m = i - Integer.MIN_VALUE;
            } else {
                paeVar = new pae(this, zjeVar);
            }
        } else {
            paeVar = new pae(this, zjeVar);
        }
        Object obj = paeVar.k;
        wne wneVar = wne.f39444a;
        int i2 = paeVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            paeVar.i = lvu0Var;
            k050 k050Var2 = this.u;
            paeVar.j = k050Var2;
            paeVar.m = 1;
            if (k050Var2.d(paeVar) == wneVar) {
                return wneVar;
            }
            lvu0Var2 = lvu0Var;
            k050Var = k050Var2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            k050Var = paeVar.j;
            lvu0 lvu0Var3 = paeVar.i;
            z1x.P(obj);
            lvu0Var2 = lvu0Var3;
        }
        try {
            a();
            aa40 aa40Var = new aa40(lvu0Var2, (OkHttpClient) ((ws3) this.b.b).invoke(), new jwd(this, (byte) 5), new ejd(this, (byte) 11), new cnc(this, (byte) 14), this.f37081a);
            aa40Var.h = true;
            try {
                ((guc) aa40Var.m.getValue()).a();
            } catch (Exception e) {
                ejd ejdVar = aa40Var.d;
                if (ejdVar != null) {
                    ejdVar.invoke(e);
                }
            }
            this.t = aa40Var;
            k050Var.c(null);
            return Unit.f46060a;
        } catch (Throwable th) {
            k050Var.c(null);
            throw th;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:105:0x0205  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:66:0x013b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0238, code lost:
    
        if (r6.m.a(r7, r0) == r1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0263, code lost:
    
        if (r6.l.a(r7, r0) == r1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x028e, code lost:
    
        if (r6.n.a(r7, r0) == r1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x02ba, code lost:
    
        if (r6.k.a(r7, r0) == r1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x016f, code lost:
    
        if (r6.o.a(r7, r0) == r1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x019b, code lost:
    
        if (r6.j.a(r7, r0) == r1) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c7, code lost:
    
        if (r6.i.a(r7, r0) == r1) goto L141;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(java.lang.String r7, org.json.JSONObject r8, a.zje r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.vae.k(java.lang.String, org.json.JSONObject, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object l(dfi0 dfi0Var, zje zjeVar) {
        tae taeVar;
        Date date;
        if (zjeVar instanceof tae) {
            taeVar = (tae) zjeVar;
            int i = taeVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                taeVar.l = i - Integer.MIN_VALUE;
            } else {
                taeVar = new tae(this, zjeVar);
            }
        } else {
            taeVar = new tae(this, zjeVar);
        }
        Object obj = taeVar.j;
        wne wneVar = wne.f39444a;
        int i2 = taeVar.l;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(obj);
            Date date2 = new Date();
            Integer num = new Integer(this.s.getAndIncrement());
            g4v0 g4v0Var = new g4v0("SendMessage", num, dfi0Var);
            aa40 aa40VarG = g();
            jiy jiyVarSerializer = r4v0.Companion.serializer(z46.Companion.serializer(q5x.Q(aa40VarG.f.b, n640.class)));
            int iIntValue = num.intValue();
            hae haeVar = new hae(aa40VarG, g4v0Var, yjeVar, (byte) 7);
            taeVar.i = date2;
            taeVar.l = 1;
            Object objC = aa40VarG.c(iIntValue, haeVar, jiyVarSerializer, taeVar);
            if (objC == wneVar) {
                return wneVar;
            }
            obj = objC;
            date = date2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            date = taeVar.i;
            z1x.P(obj);
        }
        z46 z46Var = (z46) ((r4v0) obj).f29857a;
        Object obj2 = z46Var != null ? z46Var.f43753a : null;
        if (!(obj2 instanceof n640)) {
            obj2 = null;
        }
        n640 n640Var = (n640) obj2;
        if (n640Var != null) {
            return new n640(n640Var.f22978a, n640Var.b, n640Var.c, n640Var.d, n640Var.e, n640Var.f, n640Var.g, n640Var.h, n640Var.i, n640Var.j, new Long(date.getTime() / 1000));
        }
        jf4.k(null);
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m(int i, zje zjeVar, String str, boolean z) {
        uae uaeVar;
        if (zjeVar instanceof uae) {
            uaeVar = (uae) zjeVar;
            int i2 = uaeVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uaeVar.k = i2 - Integer.MIN_VALUE;
            } else {
                uaeVar = new uae(this, zjeVar);
            }
        } else {
            uaeVar = new uae(this, zjeVar);
        }
        Object obj = uaeVar.i;
        wne wneVar = wne.f39444a;
        int i3 = uaeVar.k;
        yje yjeVar = null;
        if (i3 == 0) {
            z1x.P(obj);
            Integer num = new Integer(this.s.getAndIncrement());
            bzu bzuVar = new bzu((byte) 19);
            cww.G(bzuVar, "dialogId", str);
            cww.F(bzuVar, "rate", new Integer(i));
            cww.E(bzuVar, "resolved", Boolean.valueOf(z));
            g4v0 g4v0Var = new g4v0("SetFeedback", num, bzuVar.a());
            aa40 aa40VarG = g();
            jiy jiyVarSerializer = r4v0.Companion.serializer(z46.Companion.serializer(mcy.Companion.serializer()));
            int iIntValue = num.intValue();
            hae haeVar = new hae(aa40VarG, g4v0Var, yjeVar, (byte) 8);
            uaeVar.k = 1;
            if (aa40VarG.c(iIntValue, haeVar, jiyVarSerializer, uaeVar) == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }
}
