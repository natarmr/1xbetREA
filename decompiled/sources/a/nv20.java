package a;

import android.graphics.Rect;
import android.util.Rational;
import android.view.View;
import androidx.camera.view.PreviewView;
import com.huawei.hms.api.ConnectionResult;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class nv20 implements nub0, zf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f24171a;

    public nv20(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 9:
                this.f24171a = new tpv(gii0Var, (byte) 26);
                break;
            case 10:
                this.f24171a = new rta0(gii0Var, (byte) 2);
                break;
            case 13:
                this.f24171a = new rta0(gii0Var, (byte) 6);
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                this.f24171a = new rta0(gii0Var, (byte) 12);
                break;
            case 21:
                this.f24171a = new rta0(gii0Var, (byte) 20);
                break;
            default:
                this.f24171a = new tpv(gii0Var, (byte) 23);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(TreeMap treeMap, zje zjeVar) {
        jef0 jef0Var;
        if (zjeVar instanceof jef0) {
            jef0Var = (jef0) zjeVar;
            int i = jef0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                jef0Var.k = i - Integer.MIN_VALUE;
            } else {
                jef0Var = new jef0(this, zjeVar);
            }
        } else {
            jef0Var = new jef0(this, zjeVar);
        }
        Object objA = jef0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = jef0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            cdf0 cdf0Var = (cdf0) ((rta0) this.f24171a).invoke();
            jef0Var.k = 1;
            objA = cdf0Var.a(treeMap, jef0Var);
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
        return ((dx5) objA).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(jo20 jo20Var, zje zjeVar) {
        kef0 kef0Var;
        if (zjeVar instanceof kef0) {
            kef0Var = (kef0) zjeVar;
            int i = kef0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kef0Var.k = i - Integer.MIN_VALUE;
            } else {
                kef0Var = new kef0(this, zjeVar);
            }
        } else {
            kef0Var = new kef0(this, zjeVar);
        }
        Object objB = kef0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = kef0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            cdf0 cdf0Var = (cdf0) ((rta0) this.f24171a).invoke();
            kef0Var.k = 1;
            objB = cdf0Var.b(jo20Var, kef0Var);
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
        return ((dx5) objB).a();
    }

    public Object c(npn npnVar, zje zjeVar) {
        Long l = (Long) npnVar.d;
        long j = npnVar.f23922a;
        Object objD = ((khf0) this.f24171a).D(l != null ? new qgb(j, l.longValue()) : new rgb(j), zjeVar);
        return objD == wne.f39444a ? objD : Unit.f46060a;
    }

    @Override // a.nub0
    public void d(pmn0 pmn0Var) {
        dvb0 wmn0Var;
        if (!ofm0.v()) {
            jiq0.o0(((PreviewView) this.f24171a).getContext()).execute(new oh60(this, pmn0Var, (byte) 8));
            return;
        }
        l8x.U("PreviewView", "Surface requested by Preview.");
        s0a s0aVar = pmn0Var.d;
        ((PreviewView) this.f24171a).i = s0aVar.h();
        evb0 evb0Var = ((PreviewView) this.f24171a).h;
        Rect rectG = s0aVar.h().g();
        evb0Var.getClass();
        new Rational(rectG.width(), rectG.height());
        synchronized (evb0Var) {
            evb0Var.b = rectG;
        }
        pmn0Var.b(jiq0.o0(((PreviewView) this.f24171a).getContext()), new hi(this, s0aVar, pmn0Var, (byte) 11));
        PreviewView previewView = (PreviewView) this.f24171a;
        dvb0 dvb0Var = previewView.b;
        avb0 avb0Var = previewView.f45339a;
        if (!(dvb0Var instanceof wmn0) || PreviewView.b(pmn0Var, avb0Var)) {
            PreviewView previewView2 = (PreviewView) this.f24171a;
            boolean zB = PreviewView.b(pmn0Var, previewView2.f45339a);
            PreviewView previewView3 = (PreviewView) this.f24171a;
            n8z n8zVar = previewView3.d;
            if (zB) {
                raq0 raq0Var = new raq0(previewView3, n8zVar);
                raq0Var.i = false;
                raq0Var.k = new AtomicReference();
                wmn0Var = raq0Var;
            } else {
                wmn0Var = new wmn0(previewView3, n8zVar);
            }
            previewView2.b = wmn0Var;
        }
        n0a n0aVarH = s0aVar.h();
        PreviewView previewView4 = (PreviewView) this.f24171a;
        zub0 zub0Var = new zub0(n0aVarH, previewView4.f, previewView4.b);
        ((PreviewView) this.f24171a).g.set(zub0Var);
        s0aVar.b().b(jiq0.o0(((PreviewView) this.f24171a).getContext()), zub0Var);
        ((PreviewView) this.f24171a).b.e(pmn0Var, new hi(this, zub0Var, s0aVar, (byte) 12));
        PreviewView previewView5 = (PreviewView) this.f24171a;
        if (previewView5.indexOfChild(previewView5.c) == -1) {
            PreviewView previewView6 = (PreviewView) this.f24171a;
            previewView6.addView(previewView6.c);
        }
    }

    public Object e(String str, String str2, bnn0 bnn0Var) throws zhi0, fpd0 {
        Object objN = ((z220) this.f24171a).N(str, str2, bnn0Var);
        return objN == wne.f39444a ? objN : Unit.f46060a;
    }

    public void f(swp0 swp0Var) {
        swp0Var.getClass();
        at4 at4Var = (at4) ((dpi0) this.f24171a).f6468a;
        at4Var.getClass();
        at4Var.f1417a = swp0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(String str, String str2, String str3, zje zjeVar) {
        ls70 ls70Var;
        if (zjeVar instanceof ls70) {
            ls70Var = (ls70) zjeVar;
            int i = ls70Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ls70Var.k = i - Integer.MIN_VALUE;
            } else {
                ls70Var = new ls70(this, zjeVar);
            }
        } else {
            ls70Var = new ls70(this, zjeVar);
        }
        Object objB = ls70Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ls70Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            ds70 ds70Var = (ds70) ((tpv) this.f24171a).invoke();
            ls70Var.k = 1;
            objB = ds70Var.b(str, str2, str3, ls70Var);
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
        return (jpx) objB;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(String str, int i, String str2, String str3, String str4, zje zjeVar) {
        ms70 ms70Var;
        if (zjeVar instanceof ms70) {
            ms70Var = (ms70) zjeVar;
            int i2 = ms70Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ms70Var.k = i2 - Integer.MIN_VALUE;
            } else {
                ms70Var = new ms70(this, zjeVar);
            }
        } else {
            ms70Var = new ms70(this, zjeVar);
        }
        Object objA = ms70Var.i;
        wne wneVar = wne.f39444a;
        int i3 = ms70Var.k;
        if (i3 == 0) {
            z1x.P(objA);
            jte0 jte0Var = new jte0(i, str, str2, str3, str4);
            ds70 ds70Var = (ds70) ((tpv) this.f24171a).invoke();
            ms70Var.k = 1;
            objA = ds70Var.a(jte0Var, ms70Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return (mte0) objA;
    }

    public void i(String str) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f24171a;
        String lowerCase = "Cache-Control".toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        linkedHashMap.put(lowerCase, q3d.l(str));
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        View viewQ0 = ((o2e0) this.f24171a).q0();
        viewQ0.setPadding(viewQ0.getPaddingLeft(), 0, viewQ0.getPaddingRight(), 0);
        return xiv0.b;
    }

    public nv20(ql qlVar) {
        qlVar.getClass();
        this.f24171a = qlVar;
    }

    public nv20(l77 l77Var) {
        l77Var.getClass();
        this.f24171a = l77Var;
    }

    public nv20(ju9 ju9Var) {
        ju9Var.getClass();
        this.f24171a = ju9Var;
    }

    public nv20(rrc rrcVar) {
        this.f24171a = maz.b(new dio(rrcVar, (byte) 2));
    }

    public nv20(r9u r9uVar) {
        r9uVar.getClass();
        this.f24171a = new r46(r9uVar, (char) 0);
    }

    public nv20(ctf0 ctf0Var) {
        ctf0Var.getClass();
        this.f24171a = ctf0Var;
    }

    public nv20(u5g0 u5g0Var) {
        u5g0Var.getClass();
        this.f24171a = u5g0Var;
    }

    public nv20(vdd0 vdd0Var) {
        vdd0Var.getClass();
        this.f24171a = new lrc((Object) vdd0Var, (byte) 17);
    }

    public /* synthetic */ nv20(Object obj) {
        this.f24171a = obj;
    }

    public nv20(tj60 tj60Var) {
        tj60Var.getClass();
        this.f24171a = tj60Var;
    }

    public nv20(ntu ntuVar, rou rouVar, ieu ieuVar, rqc rqcVar, iqt iqtVar, bzt bztVar, knf0 knf0Var, mne mneVar, emg0 emg0Var, ljf0 ljf0Var, wsf0 wsf0Var, rl70 rl70Var, x0u x0uVar, ocl oclVar, o0u o0uVar, vby vbyVar, r9u r9uVar) {
        knf0Var.getClass();
        emg0Var.getClass();
        vbyVar.getClass();
        r9uVar.getClass();
        this.f24171a = new h6i(wsf0Var, ntuVar, r9uVar, rouVar, rqcVar, iqtVar, bztVar, knf0Var, mneVar, emg0Var, ljf0Var, rl70Var, x0uVar, oclVar, o0uVar, vbyVar);
    }

    public nv20(al50 al50Var) {
        Map map = al50Var.f1052a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), CollectionsKt.N0((Collection) entry.getValue()));
        }
        this.f24171a = linkedHashMap;
    }
}
