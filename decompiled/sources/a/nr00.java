package a;

import android.content.res.Configuration;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class nr00 implements h910, zf60, iwk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f23980a;

    public nr00(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 8:
                this.f23980a = new tpv(gii0Var, (byte) 19);
                break;
            case 15:
                this.f23980a = new tpv(gii0Var, (byte) 24);
                break;
            case 17:
                this.f23980a = new tpv(gii0Var, (byte) 27);
                break;
            case 18:
                this.f23980a = new rta0(gii0Var, (byte) 3);
                break;
            default:
                this.f23980a = new tpv(gii0Var, (byte) 13);
                break;
        }
    }

    @Override // a.iwk
    public void a() {
        kzj kzjVar = (kzj) this.f23980a;
        if (kzjVar.isActive()) {
            kzjVar.cancel(null);
        }
    }

    @Override // a.h910
    public void b(int i) {
        r810 r810Var = (r810) this.f23980a;
        iiy[] iiyVarArr = r810.P1;
        e910 e910VarI0 = r810Var.I0();
        sac.V(jiu0.a(e910VarI0), new s810(e910VarI0, (byte) 0), null, e910VarI0.f.b, new fj3(e910VarI0, i, (yje) null), 10);
    }

    @Override // a.iwk
    public jzj c() {
        return (kzj) this.f23980a;
    }

    @Override // a.h910
    public void d() {
        r810 r810Var = (r810) this.f23980a;
        iiy[] iiyVarArr = r810.P1;
        e910 e910VarI0 = r810Var.I0();
        if (e910VarI0.j) {
            return;
        }
        e910VarI0.j = true;
        gx90 gx90Var = ((i910) ((dgu) e910VarI0.c.f40284a).b).f14367a;
        e910VarI0.i.d(false);
        e910VarI0.w(new a16(new le8(gx90Var.c, gx90Var.d, gx90Var.b)));
    }

    public kr30 e(o1x o1xVar, jr30 jr30Var, f7k0 f7k0Var, j1h0 j1h0Var) {
        boolean zQ;
        int iAbs;
        vi9 vi9Var = o1xVar.l;
        asb0 asb0Var = o1xVar.t;
        if (vi9Var.f37467a) {
            jbe0 jbe0VarD = ((gbe0) this.f23980a).d();
            kr30 kr30VarA = jbe0VarD != null ? jbe0VarD.a(jr30Var) : null;
            if (kr30VarA != null) {
                dyw dywVar = kr30VarA.f18747a;
                b78 b78Var = dywVar instanceof b78 ? (b78) dywVar : null;
                if (b78Var == null) {
                    zQ = true;
                } else {
                    Bitmap.Config config = b78Var.f2092a.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    zQ = chf0.Q(o1xVar, config);
                }
                if (zQ) {
                    String str = (String) jr30Var.b.get("coil#size");
                    if (str == null) {
                        Object obj = kr30VarA.b.get("coil#is_sampled");
                        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                        if ((bool != null ? bool.booleanValue() : false) || (!Intrinsics.d(f7k0Var, f7k0.c) && asb0Var != asb0.b)) {
                            int iJ = dywVar.j();
                            int iF = dywVar.f();
                            f7k0 f7k0Var2 = dywVar instanceof b78 ? (f7k0) qbc.P(o1xVar, q1x.b) : f7k0.c;
                            umk umkVar = f7k0Var.f9062a;
                            int i = umkVar instanceof rmk ? ((rmk) umkVar).f30747a : Integer.MAX_VALUE;
                            umk umkVar2 = f7k0Var2.f9062a;
                            int iMin = Math.min(i, umkVar2 instanceof rmk ? ((rmk) umkVar2).f30747a : Integer.MAX_VALUE);
                            umk umkVar3 = f7k0Var.b;
                            int i2 = umkVar3 instanceof rmk ? ((rmk) umkVar3).f30747a : Integer.MAX_VALUE;
                            umk umkVar4 = f7k0Var2.b;
                            int iMin2 = Math.min(i2, umkVar4 instanceof rmk ? ((rmk) umkVar4).f30747a : Integer.MAX_VALUE);
                            double d = ((double) iMin) / ((double) iJ);
                            double d2 = ((double) iMin2) / ((double) iF);
                            int iOrdinal = ((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? j1h0.b : j1h0Var).ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal != 1) {
                                    t9f.b();
                                    return null;
                                }
                                if (d < d2) {
                                    iAbs = Math.abs(iMin - iJ);
                                } else {
                                    iAbs = Math.abs(iMin2 - iF);
                                    d = d2;
                                }
                            } else if (d > d2) {
                                iAbs = Math.abs(iMin - iJ);
                            } else {
                                iAbs = Math.abs(iMin2 - iF);
                                d = d2;
                            }
                            if (iAbs > 1) {
                                int iOrdinal2 = asb0Var.ordinal();
                                if (iOrdinal2 != 0) {
                                    if (iOrdinal2 != 1) {
                                        t9f.b();
                                        return null;
                                    }
                                    if (d <= 1.0d) {
                                    }
                                } else if (d == 1.0d) {
                                }
                            }
                        }
                        return kr30VarA;
                    }
                    if (str.equals(f7k0Var.toString())) {
                        return kr30VarA;
                    }
                }
            }
        }
        return null;
    }

    public ivn f() {
        return new ivn(((ru) this.f23980a).x());
    }

    public rrc g() {
        r9u r9uVar = (r9u) ((z8i) ((ru) this.f23980a).f31100a).I;
        x1x.y(r9uVar);
        return new rrc(new r46(r9uVar, (byte) 2), (byte) 29);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object h(long j, zje zjeVar, String str) {
        oda0 oda0Var;
        if (zjeVar instanceof oda0) {
            oda0Var = (oda0) zjeVar;
            int i = oda0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                oda0Var.k = i - Integer.MIN_VALUE;
            } else {
                oda0Var = new oda0(this, zjeVar);
            }
        } else {
            oda0Var = new oda0(this, zjeVar);
        }
        oda0 oda0Var2 = oda0Var;
        Object objA = oda0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = oda0Var2.k;
        if (i2 == 0) {
            z1x.P(objA);
            ada0 ada0Var = (ada0) ((tpv) this.f23980a).invoke();
            oda0Var2.k = 1;
            objA = ada0Var.a(j, str, 100, oda0Var2);
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

    /* JADX WARN: Code duplicated, block: B:32:0x00ae  */
    public jr30 i(o1x o1xVar, Object obj, a780 a780Var, gqw0 gqw0Var) {
        String str;
        String strP;
        vi9 vi9Var = o1xVar.l;
        Map map = o1xVar.f;
        if (vi9Var != vi9.e) {
            String str2 = o1xVar.e;
            if (str2 != null) {
                return new jr30(str2, map);
            }
            List list = ((gbe0) this.f23980a).d.c;
            int size = list.size();
            int i = 0;
            while (true) {
                if (i < size) {
                    Pair pair = (Pair) list.get(i);
                    o13 o13Var = (o13) pair.f46059a;
                    if (((sgy) pair.b).r(obj)) {
                        o13Var.getClass();
                        switch (o13Var.f24458a) {
                            case 0:
                                aot0 aot0Var = (aot0) obj;
                                if (!Intrinsics.d(aot0Var.c, "android.resource")) {
                                    str = null;
                                } else {
                                    Configuration configuration = a780Var.f354a.getResources().getConfiguration();
                                    Bitmap.Config[] configArr = lut0.f20691a;
                                    str = aot0Var + Separators.COLON + (configuration.uiMode & 48);
                                }
                                break;
                            case 1:
                                aot0 aot0Var2 = (aot0) obj;
                                String str3 = aot0Var2.c;
                                if (!(str3 == null || str3.equals("file")) || aot0Var2.e == null) {
                                    str = null;
                                } else {
                                    Bitmap.Config[] configArr2 = lut0.f20691a;
                                    if ((Intrinsics.d(aot0Var2.c, "file") && Intrinsics.d(CollectionsKt.firstOrNull(dqm0.q(aot0Var2)), "android_asset")) || !((Boolean) qbc.Q(a780Var, q1x.c)).booleanValue() || (strP = dqm0.p(aot0Var2)) == null) {
                                        str = null;
                                    } else {
                                        yzp yzpVar = a780Var.f;
                                        String str4 = y190.b;
                                        str = aot0Var2 + "-" + ((Long) yzpVar.r(rl70.b(strP)).g);
                                    }
                                }
                                break;
                            default:
                                str = ((aot0) obj).f1219a;
                                break;
                        }
                        if (str != null) {
                        }
                    }
                    i++;
                } else {
                    str = null;
                }
            }
            if (str != null) {
                if (((List) qbc.P(o1xVar, q1x.f27974a)).isEmpty()) {
                    return new jr30(str, map);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("coil#size", a780Var.b.toString());
                return new jr30(str, linkedHashMap);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x001f  */
    public void j(xhe0 xhe0Var, eld0 eld0Var, eld0 eld0Var2) {
        boolean zG;
        RecyclerView recyclerView = (RecyclerView) this.f23980a;
        xhe0Var.q(false);
        kvj kvjVar = (kvj) recyclerView.p1;
        if (eld0Var != null) {
            kvjVar.getClass();
            int i = eld0Var.b;
            int i2 = eld0Var2.b;
            if (i == i2 && eld0Var.c == eld0Var2.c) {
                kvjVar.l(xhe0Var);
                xhe0Var.f40887a.setAlpha(0.0f);
                kvjVar.i.add(xhe0Var);
                zG = true;
            } else {
                zG = kvjVar.g(xhe0Var, i, eld0Var.c, i2, eld0Var2.c);
            }
        } else {
            kvjVar.l(xhe0Var);
            xhe0Var.f40887a.setAlpha(0.0f);
            kvjVar.i.add(xhe0Var);
            zG = true;
        }
        if (zG) {
            recyclerView.l0();
        }
    }

    public void k(xhe0 xhe0Var, eld0 eld0Var, eld0 eld0Var2) {
        boolean zG;
        RecyclerView recyclerView = (RecyclerView) this.f23980a;
        recyclerView.c.p(xhe0Var);
        recyclerView.l(xhe0Var);
        xhe0Var.q(false);
        kvj kvjVar = (kvj) recyclerView.p1;
        kvjVar.getClass();
        int i = eld0Var.b;
        int i2 = eld0Var.c;
        View view = xhe0Var.f40887a;
        int left = eld0Var2 == null ? view.getLeft() : eld0Var2.b;
        int top = eld0Var2 == null ? view.getTop() : eld0Var2.c;
        if (xhe0Var.k() || (i == left && i2 == top)) {
            kvjVar.l(xhe0Var);
            kvjVar.h.add(xhe0Var);
            zG = true;
        } else {
            view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
            zG = kvjVar.g(xhe0Var, i, i2, left, top);
        }
        if (zG) {
            recyclerView.l0();
        }
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        uiv0 uiv0Var = xiv0Var.f40966a;
        int i = uiv0Var.i(2).d;
        int i2 = uiv0Var.i(8).d;
        b630 b630Var = (b630) this.f23980a;
        View viewQ0 = b630Var.q0();
        viewQ0.setPadding(viewQ0.getPaddingLeft(), uiv0Var.i(1).b, viewQ0.getPaddingRight(), viewQ0.getPaddingBottom());
        sj3.L0(b630Var.q0(), 0, 0, 0, Math.max(i, i2), 7);
        return xiv0Var;
    }

    public nr00(eb50 eb50Var) {
        eb50Var.getClass();
        this.f23980a = eb50Var;
    }

    public nr00(knf0 knf0Var) {
        knf0Var.getClass();
        this.f23980a = knf0Var;
    }

    public nr00(byte[] bArr) {
        bArr.getClass();
        this.f23980a = bArr;
    }

    public nr00(vdd0 vdd0Var) {
        vdd0Var.getClass();
        this.f23980a = vdd0Var;
    }

    public nr00(xv20 xv20Var) {
        xv20Var.getClass();
        this.f23980a = xv20Var;
    }

    public nr00(lgc0 lgc0Var) {
        lgc0Var.getClass();
        this.f23980a = new clc((Object) lgc0Var, (byte) 23);
    }

    public /* synthetic */ nr00(Object obj) {
        this.f23980a = obj;
    }

    public nr00(cad cadVar, vue0 vue0Var) {
        vue0Var.getClass();
        this.f23980a = new vqc((Object) vue0Var, (byte) 19);
    }

    public nr00(btt0 btt0Var, gii0 gii0Var, ivp0 ivp0Var) {
        btt0Var.getClass();
        gii0Var.getClass();
        ivp0Var.getClass();
        this.f23980a = new es(btt0Var, gii0Var, ivp0Var);
    }

    public nr00(ony onyVar) {
        onyVar.getClass();
        this.f23980a = onyVar;
    }

    public nr00(r2e0 r2e0Var) {
        iw20 iw20Var = r2e0Var.f29729a;
        epi0 epi0Var = r2e0Var.b;
        us00 us00Var = r2e0Var.c;
        vwb0 vwb0Var = r2e0Var.d;
        q7d0 q7d0Var = r2e0Var.e;
        vwb0Var.getClass();
        q7d0Var.getClass();
        this.f23980a = new kki(iw20Var, epi0Var, us00Var, vwb0Var, q7d0Var);
    }

    public nr00(z300 z300Var) {
        btt0 btt0Var = z300Var.f43696a;
        h840 h840Var = (h840) z300Var.c;
        gii0 gii0Var = z300Var.b;
        mne mneVar = (mne) z300Var.d;
        knf0 knf0Var = (knf0) z300Var.e;
        r9u r9uVar = (r9u) z300Var.f;
        btt0Var.getClass();
        h840Var.getClass();
        gii0Var.getClass();
        knf0Var.getClass();
        r9uVar.getClass();
        this.f23980a = new kki(btt0Var, h840Var, gii0Var, mneVar, knf0Var);
    }

    public nr00(r9u r9uVar, ctf0 ctf0Var, nw20 nw20Var, i1k0 i1k0Var, pru pruVar, gst0 gst0Var, gii0 gii0Var, mne mneVar, knf0 knf0Var, btt0 btt0Var, scc0 scc0Var) {
        r9uVar.getClass();
        ctf0Var.getClass();
        gst0Var.getClass();
        gii0Var.getClass();
        knf0Var.getClass();
        btt0Var.getClass();
        this.f23980a = new pmi(ctf0Var, nw20Var, i1k0Var, pruVar);
    }

    public nr00(gbe0 gbe0Var, chf0 chf0Var) {
        this.f23980a = gbe0Var;
    }

    public nr00(iip iipVar, bwl bwlVar, a1d a1dVar, clc clcVar, itr itrVar, lsn lsnVar, yqc yqcVar, ugf0 ugf0Var, cad cadVar, sue sueVar, z8i z8iVar, x0u x0uVar, kuy kuyVar) {
        iipVar.getClass();
        itrVar.getClass();
        sueVar.getClass();
        kuyVar.getClass();
        ru ruVar = new ru();
        ruVar.f31100a = z8iVar;
        ruVar.b = bwlVar;
        ruVar.c = iipVar;
        ruVar.d = a1dVar;
        ruVar.e = cadVar;
        ruVar.f = lsnVar;
        ruVar.g = sueVar;
        ruVar.h = clcVar;
        ruVar.i = yqcVar;
        ruVar.j = kuyVar;
        this.f23980a = ruVar;
    }
}
