package a;

import android.content.ClipData;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContentInfo;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.onexdatabase.OnexDatabase;
import org.xplatform.uikit.components.chips.DsChip;

/* JADX INFO: loaded from: classes3.dex */
public final class yqc implements j5a, qee, zf60, zp2, giu0, hbj, n1x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43069a;
    public Object b;

    public yqc(us00 us00Var, vby vbyVar, cad cadVar, oeg0 oeg0Var, ap80 ap80Var, edo edoVar, r9u r9uVar, zfo zfoVar, b3c0 b3c0Var, btt0 btt0Var, gst0 gst0Var, gii0 gii0Var, ouu ouuVar, ii iiVar, knf0 knf0Var, phj phjVar, sue sueVar, vqc vqcVar, wdk0 wdk0Var, j1q0 j1q0Var, pru pruVar) {
        this.f43069a = (byte) 21;
        vbyVar.getClass();
        oeg0Var.getClass();
        edoVar.getClass();
        r9uVar.getClass();
        zfoVar.getClass();
        b3c0Var.getClass();
        btt0Var.getClass();
        gst0Var.getClass();
        gii0Var.getClass();
        iiVar.getClass();
        knf0Var.getClass();
        phjVar.getClass();
        sueVar.getClass();
        wdk0Var.getClass();
        j1q0Var.getClass();
        this.b = new nc0(cadVar, sueVar, vqcVar, iiVar, oeg0Var, edoVar, zfoVar, gst0Var, gii0Var, ouuVar, knf0Var, phjVar, wdk0Var, j1q0Var);
    }

    public static Map j(mb5 mb5Var) {
        if (Intrinsics.d(mb5Var, mb5.e)) {
            lun lunVar = lun.f20680a;
            lunVar.getClass();
            return lunVar;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = mb5Var.b;
        String str2 = mb5Var.f21491a;
        String str3 = mb5Var.d;
        String str4 = mb5Var.c;
        if (str.length() > 0) {
            linkedHashMap.put("s1", mb5Var.b);
        }
        if (str4.length() > 0) {
            linkedHashMap.put("s2", str4);
        }
        if (str3.length() > 0) {
            linkedHashMap.put("s3", str3);
        }
        if (str2.length() > 0) {
            linkedHashMap.put("extid", str2);
        }
        return xp20.n(linkedHashMap);
    }

    public void A(int i, Object obj, q2h0 q2h0Var) {
        syc sycVar = (syc) this.b;
        sycVar.B(i, 3);
        q2h0Var.g((a4) obj, sycVar.f33018a);
        sycVar.B(i, 4);
    }

    @Override // a.qee
    public int a() {
        return ((ContentInfo) this.b).getFlags();
    }

    @Override // a.qee
    public int b() {
        return ((ContentInfo) this.b).getSource();
    }

    @Override // a.giu0
    public diu0 c(Object obj) {
        c7i c7iVar = (c7i) this.b;
        qdi qdiVar = (qdi) c7iVar.c;
        v88 v88VarU0 = qdiVar.f28534a.u0();
        wsf0 wsf0VarF0 = qdiVar.f28534a.f0();
        mne mneVarV1 = qdiVar.f28534a.v1();
        fpi0 fpi0Var = (fpi0) qdiVar.l.get();
        fq fqVar = (fq) qdiVar.w.get();
        r8i r8iVar = (r8i) c7iVar.d;
        return new wm70((i1w0) obj, v88VarU0, wsf0VarF0, mneVarV1, fpi0Var, fqVar, (dqx) ((n5d0) r8iVar.g).get(), (itt) qdiVar.t.get(), (qni0) qdiVar.h0.get(), (l1u) ((n5d0) r8iVar.l).get(), (lg60) qdiVar.i0.get(), (qa60) qdiVar.E.get(), (ppb) ((n5d0) r8iVar.m).get(), (i5m0) qdiVar.j0.get(), (lzt) qdiVar.e.get(), (xcc) qdiVar.T.get(), (ztt) qdiVar.j.get(), (d3c) qdiVar.d.get(), (xyb) qdiVar.g.get(), (oqt) qdiVar.o.get(), (y5s) qdiVar.S.get(), (t0u) qdiVar.W.get());
    }

    @Override // a.hbj
    public jbj d() {
        return new yuj((edu) this.b);
    }

    @Override // a.qee
    public ContentInfo e() {
        return (ContentInfo) this.b;
    }

    @Override // a.qee
    public ClipData f() {
        return ((ContentInfo) this.b).getClip();
    }

    @Override // a.j5a
    public void g(Typeface typeface) {
        f2d f2dVar = (f2d) this.b;
        if (f2dVar.z(typeface)) {
            f2dVar.l(false);
        }
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        DsChip dsChip = (DsChip) this.b;
        dyw dywVar = hhn0Var.f13073a;
        Resources resources = dsChip.getContext().getResources();
        resources.getClass();
        c3x.q(dywVar, resources).setTintList(null);
        dsChip.setIconTint(null);
    }

    @Override // a.zp2
    public void i(Bundle bundle) {
        ((wp2) ((vp2) this.b)).a("clx", "_ae", bundle);
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        int iIntValue;
        view.getClass();
        axe axeVar = (axe) this.b;
        View viewQ0 = axeVar.q0();
        int iO = knm0.o(axeVar.K1, xiv0Var);
        uiv0 uiv0Var = xiv0Var.f40966a;
        if (!uiv0Var.u(8) || axeVar.C().J("MakeBetFragment") == null) {
            iIntValue = ((Number) axeVar.W1.getValue()).intValue() + uiv0Var.i(2).d;
        } else {
            List listP = axeVar.C().c.p();
            listP.getClass();
            if (!listP.isEmpty()) {
                Iterator it = listP.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Fragment fragment = (Fragment) it.next();
                        if ((fragment instanceof sik) && ((sik) fragment).S()) {
                            iIntValue = ((Number) axeVar.W1.getValue()).intValue() + uiv0Var.i(2).d;
                        }
                    }
                }
            }
            iIntValue = uiv0Var.i(8).d;
        }
        jmu0.l(iO, iIntValue, 5, viewQ0);
        return xiv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(String str, mb5 mb5Var, zje zjeVar) {
        rwf rwfVar;
        if (zjeVar instanceof rwf) {
            rwfVar = (rwf) zjeVar;
            int i = rwfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                rwfVar.k = i - Integer.MIN_VALUE;
            } else {
                rwfVar = new rwf(this, zjeVar);
            }
        } else {
            rwfVar = new rwf(this, zjeVar);
        }
        Object objA = rwfVar.i;
        wne wneVar = wne.f39444a;
        int i2 = rwfVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            prc prcVar = (prc) this.b;
            Map<String, String> mapJ = j(mb5Var);
            rwfVar.k = 1;
            objA = ((pwf) ((qwf) prcVar.b).invoke()).a(str, mapJ, rwfVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        String str2 = ((lb5) objA).f19739a;
        return str2 == null ? "" : str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object n(String str, mb5 mb5Var, zje zjeVar) {
        swf swfVar;
        if (zjeVar instanceof swf) {
            swfVar = (swf) zjeVar;
            int i = swfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                swfVar.k = i - Integer.MIN_VALUE;
            } else {
                swfVar = new swf(this, zjeVar);
            }
        } else {
            swfVar = new swf(this, zjeVar);
        }
        Object objB = swfVar.i;
        wne wneVar = wne.f39444a;
        int i2 = swfVar.k;
        if (i2 == 0) {
            z1x.P(objB);
            prc prcVar = (prc) this.b;
            Map<String, String> mapJ = j(mb5Var);
            swfVar.k = 1;
            objB = ((pwf) ((qwf) prcVar.b).invoke()).b(str, mapJ, swfVar);
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
        String str2 = ((lb5) objB).f19739a;
        return str2 == null ? "" : str2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(String str, String str2, zje zjeVar) {
        twf twfVar;
        if (zjeVar instanceof twf) {
            twfVar = (twf) zjeVar;
            int i = twfVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                twfVar.k = i - Integer.MIN_VALUE;
            } else {
                twfVar = new twf(this, zjeVar);
            }
        } else {
            twfVar = new twf(this, zjeVar);
        }
        Object objC = twfVar.i;
        wne wneVar = wne.f39444a;
        int i2 = twfVar.k;
        if (i2 == 0) {
            z1x.P(objC);
            prc prcVar = (prc) this.b;
            twfVar.k = 1;
            objC = ((pwf) ((qwf) prcVar.b).invoke()).c(str, str2, twfVar);
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
        String str3 = ((lb5) objC).f19739a;
        return str3 == null ? "" : str3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(long j, zje zjeVar) {
        wuf wufVar;
        if (zjeVar instanceof wuf) {
            wufVar = (wuf) zjeVar;
            int i = wufVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wufVar.k = i - Integer.MIN_VALUE;
            } else {
                wufVar = new wuf(this, zjeVar);
            }
        } else {
            wufVar = new wuf(this, zjeVar);
        }
        Object objW0 = wufVar.i;
        wne wneVar = wne.f39444a;
        int i2 = wufVar.k;
        yje yjeVar = null;
        if (i2 == 0) {
            z1x.P(objW0);
            ruf rufVar = (ruf) this.b;
            wufVar.k = 1;
            objW0 = sj3.w0(wufVar, rufVar.f31125a, new hu6(j, yjeVar, (byte) 4), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        return new Double(((tuf) objW0).i);
    }

    public oeu q() {
        return new oeu(new reu(new cih((q7d0) this.b, (byte) 2), (byte) 28));
    }

    public b8u r() {
        return new b8u(new pyu((cuw) this.b));
    }

    public xfu s() {
        return new xfu(new reu(new cih((q7d0) this.b, (byte) 2), (byte) 28));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object t(ql5 ql5Var, zje zjeVar) {
        d4k d4kVar;
        if (zjeVar instanceof d4k) {
            d4kVar = (d4k) zjeVar;
            int i = d4kVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                d4kVar.l = i - Integer.MIN_VALUE;
            } else {
                d4kVar = new d4k(this, zjeVar);
            }
        } else {
            d4kVar = new d4k(this, zjeVar);
        }
        Object obj = d4kVar.j;
        Object obj2 = wne.f39444a;
        int i2 = d4kVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            long j = ql5Var.f28916a;
            d4kVar.i = ql5Var;
            d4kVar.l = 1;
            if (y(j, d4kVar) == obj2) {
                return obj2;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            ql5Var = d4kVar.i;
            z1x.P(obj);
        }
        a1d a1dVar = new a1d((Object) ((g45) ((wsf0) this.b).b).e(), (byte) 14);
        long j2 = ql5Var.f28916a;
        tg5 tg5Var = (tg5) ((rrd) a1dVar.b).b;
        tg5Var.f33892a.remove(Long.valueOf(j2));
        tg5Var.b();
        tg5Var.c = System.currentTimeMillis();
        return Unit.f46060a;
    }

    public String toString() {
        switch (this.f43069a) {
            case 9:
                return "ContentInfoCompat{" + ((ContentInfo) this.b) + "}";
            default:
                return super.toString();
        }
    }

    public Object u(zje zjeVar) {
        Object objA = ((fnd0) ((o470) this.b).f24619a).a(zjeVar);
        wne wneVar = wne.f39444a;
        if (objA != wneVar) {
            objA = Unit.f46060a;
        }
        return objA == wneVar ? objA : Unit.f46060a;
    }

    public void v() {
        switch (this.f43069a) {
            case 3:
                ovo0 ovo0Var = (ovo0) ((dgu) this.b).b;
                ovo0Var.b = null;
                ovo0Var.c.o(null, Boolean.FALSE);
                break;
            default:
                ((btr) this.b).c.b.n(null);
                break;
        }
    }

    public void w(y9s y9sVar) {
        j8r0 j8r0Var = (j8r0) ((w5z) this.b).c;
        j8r0Var.getClass();
        ir30 ir30Var = (ir30) j8r0Var.f16100a.get(y9sVar);
        if (ir30Var != null) {
            ir30Var.a();
        }
    }

    public void x() {
        synchronized (((jrs0) this.b).h) {
            try {
                jrs0 jrs0Var = (jrs0) this.b;
                if (jrs0Var.f17020a) {
                    ((Handler) jrs0Var.d).obtainMessage(R.id.zxing_preview_failed).sendToTarget();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object y(long j, zje zjeVar) {
        e4k e4kVar;
        wsf0 wsf0Var = (wsf0) this.b;
        g45 g45Var = (g45) wsf0Var.b;
        if (zjeVar instanceof e4k) {
            e4kVar = (e4k) zjeVar;
            int i = e4kVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                e4kVar.k = i - Integer.MIN_VALUE;
            } else {
                e4kVar = new e4k(this, zjeVar);
            }
        } else {
            e4kVar = new e4k(this, zjeVar);
        }
        Object objA = e4kVar.i;
        Object obj = wne.f39444a;
        int i2 = e4kVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            if (xru.a(g45Var.F()) == j) {
                nou nouVarE = g45Var.E();
                e4kVar.k = 1;
                objA = nouVarE.a(tl5.c, e4kVar);
                if (objA == obj) {
                    return obj;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        long j2 = ((ql5) objA).f28916a;
        ((g45) wsf0Var.b).o0();
        jyg0.a(wsf0Var.q(), j2);
        return Unit.f46060a;
    }

    public rkt0 z() {
        return new rkt0(new cad((bad) this.b), (byte) 0);
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
    }

    public yqc(rrc rrcVar) {
        this.f43069a = (byte) 12;
        this.b = ((OnexDatabase) rrcVar.b).l();
    }

    public yqc(btr btrVar) {
        this.f43069a = (byte) 4;
        btrVar.getClass();
        this.b = btrVar;
    }

    public yqc(d49 d49Var) {
        this.f43069a = (byte) 7;
        d49Var.getClass();
        this.b = d49Var;
    }

    public yqc(gii0 gii0Var) {
        this.f43069a = (byte) 28;
        gii0Var.getClass();
        this.b = new sza(gii0Var, (byte) 27);
    }

    public /* synthetic */ yqc(Object obj, byte b) {
        this.f43069a = b;
        this.b = obj;
    }

    public yqc(syc sycVar) {
        this.f43069a = (byte) 5;
        Charset charset = fmx.f9806a;
        this.b = sycVar;
        sycVar.f33018a = this;
    }

    public yqc(byte b) {
        this.f43069a = b;
        switch (b) {
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                this.b = new edu();
                break;
        }
    }

    public yqc(ContentInfo contentInfo) {
        this.f43069a = (byte) 9;
        contentInfo.getClass();
        this.b = kn4.k(contentInfo);
    }
}
