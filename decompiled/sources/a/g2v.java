package a;

import android.javax.sip.message.Response;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;
import org.xplatform.cyber.section.api.domain.entity.CyberGamesPage;

/* JADX INFO: loaded from: classes5.dex */
public final class g2v implements cfr, zf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10580a;

    public g2v(gii0 gii0Var, cad cadVar, knf0 knf0Var, r9u r9uVar, byte b) {
        gii0Var.getClass();
        knf0Var.getClass();
        r9uVar.getClass();
        switch (b) {
            case 23:
                this.f10580a = new nr((Object) cadVar, (Object) gii0Var, (Object) knf0Var, (byte) 14);
                break;
            default:
                this.f10580a = new nhf0(cadVar, knf0Var, gii0Var);
                break;
        }
    }

    public static mdm b(g2v g2vVar, pb10 pb10Var, pdm pdmVar, ldm ldmVar, int i, int i2, int i3, int i4, int i5, long j, long j2, int i6) {
        pdm pdmVar2 = (i6 & 2) != 0 ? pdm.f26814a : pdmVar;
        ldm ldmVar2 = (i6 & 4) != 0 ? ldm.f19857a : ldmVar;
        int i7 = (i6 & 8) != 0 ? R.drawable.ic_glyph_circle_favourite : i;
        int i8 = i6 & 16;
        int i9 = R.string.empty_str;
        int i10 = i8 != 0 ? R.string.empty_str : i2;
        int i11 = (i6 & 32) != 0 ? R.string.empty_str : i3;
        int i12 = (i6 & 64) != 0 ? R.string.empty_str : i4;
        if ((i6 & 128) == 0) {
            i9 = i5;
        }
        long j3 = (i6 & 256) != 0 ? 0L : j;
        long j4 = (i6 & 512) == 0 ? j2 : 0L;
        g2vVar.getClass();
        pb10Var.getClass();
        xuz xuzVar = pb10.c;
        int i13 = ((bzt) g2vVar.f10580a).f3488a.a().r;
        xuzVar.getClass();
        return new mdm(xuz.a(pb10Var, i13), pdmVar2, ldmVar2, i7, i10, i11, i12, i9, j3, j4);
    }

    public static mdm c(g2v g2vVar, nkm nkmVar) {
        ldm ldmVar = ldm.f19857a;
        g2vVar.getClass();
        if (nkmVar instanceof lkm) {
            return b(g2vVar, pb10.g, null, ldmVar, 0, 0, R.string.currently_no_events, 0, R.string.refresh_data, 10000L, 0L, 602);
        }
        if (nkmVar instanceof mkm) {
            return b(g2vVar, pb10.g, null, ldmVar, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, 602);
        }
        t9f.b();
        return null;
    }

    public static jkm d(g2v g2vVar, pb10 pb10Var, okm okmVar, ikm ikmVar, int i, int i2, Function0 function0, int i3) {
        if ((i3 & 2) != 0) {
            okmVar = okm.f25411a;
        }
        okm okmVar2 = okmVar;
        if ((i3 & 4) != 0) {
            ikmVar = ikm.f14933a;
        }
        ikm ikmVar2 = ikmVar;
        int i4 = (i3 & 8) != 0 ? R.drawable.ic_glyph_circle_favourite : R.drawable.ic_glyph_circle_technical_works;
        int i5 = (i3 & 32) != 0 ? R.string.empty_str : i;
        int i6 = (i3 & 128) != 0 ? R.string.empty_str : i2;
        if ((i3 & 256) != 0) {
            function0 = null;
        }
        g2vVar.getClass();
        pb10Var.getClass();
        xuz xuzVar = pb10.c;
        int i7 = ((bzt) g2vVar.f10580a).f3488a.a().r;
        xuzVar.getClass();
        return new jkm(okmVar2, ikmVar2, xuz.a(pb10Var, i7), i4, i5, i6, function0);
    }

    public static jkm e(g2v g2vVar, mkm mkmVar, Function0 function0) {
        ikm ikmVar = ikm.f14933a;
        return d(g2vVar, pb10.g, okm.f25411a, ikmVar, R.string.data_retrieval_error, R.string.try_again_text, function0, 88);
    }

    public String a(Object obj) {
        StringWriter stringWriter = new StringWriter();
        try {
            hcy hcyVar = (hcy) this.f10580a;
            xdy xdyVar = new xdy(stringWriter, hcyVar.f12843a, hcyVar.b, hcyVar.c, hcyVar.d);
            xdyVar.h(obj);
            xdyVar.j();
            xdyVar.b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(zje zjeVar) {
        rqx rqxVar;
        if (zjeVar instanceof rqx) {
            rqxVar = (rqx) zjeVar;
            int i = rqxVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                rqxVar.k = i - Integer.MIN_VALUE;
            } else {
                rqxVar = new rqx(this, zjeVar);
            }
        } else {
            rqxVar = new rqx(this, zjeVar);
        }
        Object objB = rqxVar.i;
        Object obj = wne.f39444a;
        int i2 = rqxVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            ahu ahuVar = (ahu) this.f10580a;
            bm5 bm5Var = bm5.m;
            rqxVar.k = 1;
            objB = ahuVar.b(bm5Var, rqxVar);
            if (objB == obj) {
                return obj;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        return Boolean.valueOf(((ql5) objB).i.d());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:69|24|(1:27)) */
    /* JADX WARN: Code duplicated, block: B:27:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:33:0x00d5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00de  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:45:0x0104  */
    /* JADX WARN: Code duplicated, block: B:47:0x010c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:51:0x0119  */
    /* JADX WARN: Code duplicated, block: B:52:0x011b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0120  */
    /* JADX WARN: Code duplicated, block: B:60:0x013e  */
    /* JADX WARN: Code duplicated, block: B:61:0x0144  */
    /* JADX WARN: Code duplicated, block: B:62:0x0146  */
    /* JADX WARN: Code duplicated, block: B:63:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0150  */
    /* JADX WARN: Code duplicated, block: B:66:0x0156  */
    /* JADX WARN: Code duplicated, block: B:69:0x00a5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00ce, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00ff, code lost:
    
        if (a.qcc.P(r11, r4) == r3) goto L57;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d7 -> B:23:0x00a3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x0146 -> B:59:0x013b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.util.List r20, a.zje r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 343
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g2v.g(java.util.List, a.zje):java.lang.Object");
    }

    public void h() {
        ony onyVar = (ony) this.f10580a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("requestUrl", ncy.c("chls.pro/ssl"));
        linkedHashMap.put("response", ncy.b(Integer.valueOf(Response.OK)));
        linkedHashMap.put("responseTime", ncy.b(0));
        ((rny) onyVar).a("", new tny("request", xp20.n(linkedHashMap)));
    }

    public boolean i(bm5 bm5Var) {
        bm5Var.getClass();
        return ((pv00) this.f10580a).j(bm5Var) != null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(CyberGamesPage.Virtual virtual, int i, zje zjeVar) {
        d6v d6vVar;
        if (zjeVar instanceof d6v) {
            d6vVar = (d6v) zjeVar;
            int i2 = d6vVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d6vVar.k = i2 - Integer.MIN_VALUE;
            } else {
                d6vVar = new d6v(this, zjeVar);
            }
        } else {
            d6vVar = new d6v(this, zjeVar);
        }
        Object obj = d6vVar.i;
        wne wneVar = wne.f39444a;
        int i3 = d6vVar.k;
        if (i3 != 0) {
            if (i3 == 1) {
                z1x.P(obj);
                return ((j0g0) obj).f15681a;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        nru0 nru0Var = (nru0) this.f10580a;
        d6vVar.k = 1;
        Serializable serializableA = nru0Var.a(i, d6vVar, virtual);
        return serializableA == wneVar ? wneVar : serializableA;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object k(long j, zje zjeVar) {
        t2v t2vVar;
        if (zjeVar instanceof t2v) {
            t2vVar = (t2v) zjeVar;
            int i = t2vVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                t2vVar.k = i - Integer.MIN_VALUE;
            } else {
                t2vVar = new t2v(this, zjeVar);
            }
        } else {
            t2vVar = new t2v(this, zjeVar);
        }
        Object obj = t2vVar.i;
        wne wneVar = wne.f39444a;
        int i2 = t2vVar.k;
        if (i2 != 0) {
            if (i2 == 1) {
                z1x.P(obj);
                return ((j0g0) obj).f15681a;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        afm0 afm0Var = (afm0) this.f10580a;
        t2vVar.k = 1;
        Object objK = afm0Var.k(j, t2vVar);
        return objK == wneVar ? wneVar : objK;
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        uiv0 uiv0Var = xiv0Var.f40966a;
        int i = uiv0Var.u(8) ? uiv0Var.i(8).d : uiv0Var.i(2).d;
        View viewQ0 = ((c720) this.f10580a).q0();
        viewQ0.setPadding(viewQ0.getPaddingLeft(), viewQ0.getPaddingTop(), viewQ0.getPaddingRight(), i);
        return xiv0Var;
    }

    public void m() {
        mzw mzwVar = (mzw) this.f10580a;
        synchronized (mzwVar.s) {
            try {
                Integer num = (Integer) mzwVar.s.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != mzwVar.I()) {
                    mzwVar.L();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.cfr
    public void onFailure(Throwable th) {
        Object obj;
        rrd rrdVar = (rrd) this.f10580a;
        wss wssVar = new wss(rrdVar, (byte) 4);
        byte b = 2;
        if (ofm0.v()) {
            wssVar.run();
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            z1x.y("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(new qaq0(wssVar, countDownLatch, b)));
            try {
                if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Timeout to wait main thread execution");
                }
            } catch (InterruptedException e) {
                throw new ss3(e);
            }
        }
        j4a j4aVar = (j4a) rrdVar.e;
        if (j4aVar != null) {
            j4aVar.getClass();
            z1a z1aVar = j4aVar.n;
            z1aVar.getClass();
            w3d.y(z1aVar.n, new d38(rrdVar, (byte) 24));
            j4a j4aVar2 = (j4a) rrdVar.e;
            j4aVar2.getClass();
            synchronized (j4aVar2.b) {
                try {
                    j4aVar2.e.removeCallbacksAndMessages("retry_token");
                    int iE = hne.E(j4aVar2.p);
                    if (iE == 0) {
                        j4aVar2.p = 5;
                        obj = m3x.c;
                    } else {
                        if (iE == 1) {
                            throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                        }
                        if (iE == 2 || iE == 3) {
                            j4aVar2.p = 5;
                            j4a.a(j4aVar2.r);
                            j4aVar2.q = y0x0.I(new gne(j4aVar2, (byte) 21));
                        }
                        obj = j4aVar2.q;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            obj = m3x.c;
        }
        obj.getClass();
        synchronized (rrdVar.b) {
            rrdVar.c = null;
            rrdVar.d = obj;
            ((HashMap) rrdVar.h).clear();
            ((HashSet) rrdVar.i).clear();
        }
        rrdVar.u(null, null);
    }

    @Override // a.cfr
    public void onSuccess(Object obj) {
    }

    public g2v(ost0 ost0Var) {
        ost0Var.getClass();
        this.f10580a = ost0Var;
    }

    public g2v(klv0 klv0Var) {
        klv0Var.getClass();
        this.f10580a = klv0Var;
    }

    public g2v(n8v n8vVar) {
        n8vVar.getClass();
        this.f10580a = n8vVar;
    }

    public g2v(b3c0 b3c0Var) {
        b3c0Var.getClass();
        this.f10580a = b3c0Var;
    }

    public g2v(gii0 gii0Var) {
        gii0Var.getClass();
        this.f10580a = new tpv(gii0Var, (byte) 3);
    }

    public g2v(ony onyVar) {
        onyVar.getClass();
        this.f10580a = onyVar;
    }

    public g2v(y1f0 y1f0Var) {
        y1f0Var.getClass();
        this.f10580a = y1f0Var;
    }

    public /* synthetic */ g2v(Object obj) {
        this.f10580a = obj;
    }

    public g2v(byte b) {
        switch (b) {
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                this.f10580a = roj0.b(0, 0, null, 7);
                break;
            default:
                this.f10580a = new short[13];
                break;
        }
    }
}
