package a;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.ui_core.viewcomponents.views.search.SearchMaterialViewNew;

/* JADX INFO: loaded from: classes.dex */
public final class jw20 implements zf60, n1x, lfn0, lry {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17232a;
    public final Object b;

    public jw20(gii0 gii0Var, byte b) {
        this.f17232a = b;
        gii0Var.getClass();
        switch (b) {
            case 15:
                this.b = new rta0(gii0Var, (byte) 8);
                break;
            case 16:
                this.b = new rta0(gii0Var, (byte) 11);
                break;
            case 20:
                this.b = new rta0(gii0Var, (byte) 14);
                break;
            case 21:
                this.b = new rta0(gii0Var, (byte) 18);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                this.b = maz.b(new rta0(gii0Var, (byte) 24));
                break;
            default:
                this.b = new tpv(gii0Var, (byte) 28);
                break;
        }
    }

    @Override // a.lry
    public void c(g950 g950Var, Object obj) {
        mae0 mae0Var = (mae0) this.b;
        String strB = g950Var.b();
        if ("k".equals(strB)) {
            if (obj instanceof Integer) {
                bry.b.getClass();
                bry bryVar = (bry) bry.c.get((Integer) obj);
                if (bryVar == null) {
                    bryVar = bry.UNKNOWN;
                }
                mae0Var.g = bryVar;
                return;
            }
            return;
        }
        if ("mv".equals(strB)) {
            if (obj instanceof int[]) {
                mae0Var.f21454a = (int[]) obj;
            }
        } else {
            if ("xs".equals(strB)) {
                if (obj instanceof String) {
                    String str = (String) obj;
                    if (str.isEmpty()) {
                        return;
                    }
                    mae0Var.b = str;
                    return;
                }
                return;
            }
            if (!"xi".equals(strB)) {
                "pn".equals(strB);
            } else if (obj instanceof Integer) {
                mae0Var.c = ((Integer) obj).intValue();
            }
        }
    }

    @Override // a.lfn0
    public void d(byte[] bArr, int i, int i2, kfn0 kfn0Var, rbe rbeVar) {
        ctf ctfVarA;
        fq80 fq80Var = (fq80) this.b;
        fq80Var.K(bArr, i2 + i);
        fq80Var.M(i);
        ArrayList arrayList = new ArrayList();
        while (fq80Var.a() > 0) {
            x0x.z("Incomplete Mp4Webvtt Top Level box header found.", fq80Var.a() >= 8);
            int iM = fq80Var.m();
            if (fq80Var.m() == 1987343459) {
                int i3 = iM - 8;
                CharSequence charSequenceF = null;
                btf btfVarA = null;
                while (i3 > 0) {
                    x0x.z("Incomplete vtt cue box header found.", i3 >= 8);
                    int iM2 = fq80Var.m();
                    int iM3 = fq80Var.m();
                    int i4 = iM2 - 8;
                    byte[] bArr2 = fq80Var.f9961a;
                    int i5 = fq80Var.b;
                    String str = vtt0.f38024a;
                    String str2 = new String(bArr2, i5, i4, StandardCharsets.UTF_8);
                    fq80Var.N(i4);
                    i3 = (i3 - 8) - i4;
                    if (iM3 == 1937011815) {
                        s5v0 s5v0Var = new s5v0();
                        t5v0.e(str2, s5v0Var);
                        btfVarA = s5v0Var.a();
                    } else if (iM3 == 1885436268) {
                        charSequenceF = t5v0.f(Collections.EMPTY_LIST, null, str2.trim());
                    }
                }
                if (charSequenceF == null) {
                    charSequenceF = "";
                }
                if (btfVarA != null) {
                    btfVarA.f3180a = charSequenceF;
                    btfVarA.b = null;
                    ctfVarA = btfVarA.a();
                } else {
                    Pattern pattern = t5v0.f33388a;
                    s5v0 s5v0Var2 = new s5v0();
                    s5v0Var2.c = charSequenceF;
                    ctfVarA = s5v0Var2.a().a();
                }
                arrayList.add(ctfVarA);
            } else {
                fq80Var.N(iM - 8);
            }
        }
        rbeVar.accept(new ftf(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    public iw20 e() {
        return new iw20(((xcz) this.b).j());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(String str, zje zjeVar) {
        ibg0 ibg0Var;
        if (zjeVar instanceof ibg0) {
            ibg0Var = (ibg0) zjeVar;
            int i = ibg0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ibg0Var.k = i - Integer.MIN_VALUE;
            } else {
                ibg0Var = new ibg0(this, zjeVar);
            }
        } else {
            ibg0Var = new ibg0(this, zjeVar);
        }
        Object objA = ibg0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ibg0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            kbg0 kbg0Var = (kbg0) ((n0o0) this.b).getValue();
            ibg0Var.k = 1;
            objA = kbg0Var.a(str, "application/vnd.xenvelop+json", ibg0Var);
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
        String str2 = ((hbg0) ((dx5) objA).a()).f12768a;
        if (str2 != null) {
            return str2;
        }
        jf4.k(null);
        return null;
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        dyw dywVar = hhn0Var.f13073a;
        Resources resources = ((ImageView) this.b).getContext().getResources();
        resources.getClass();
        c3x.q(dywVar, resources);
    }

    @Override // a.lry
    public lry i(qlc qlcVar, g950 g950Var) {
        return null;
    }

    @Override // a.lry
    public mry j(g950 g950Var) {
        String strB = g950Var.b();
        if ("d1".equals(strB)) {
            return new kae0(this, (byte) 0);
        }
        if ("d2".equals(strB)) {
            return new kae0(this, (byte) 1);
        }
        return null;
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        SearchMaterialViewNew searchMaterialViewNew = (SearchMaterialViewNew) this.b;
        if (searchMaterialViewNew != null && searchMaterialViewNew.hasFocus() && !xiv0Var.f40966a.u(8)) {
            searchMaterialViewNew.clearFocus();
        }
        return xiv0.b;
    }

    public Object m(long j, String str, double d, double d2, double d3, long j2, zje zjeVar) {
        nr nrVar = (nr) this.b;
        String strA = ((btt0) nrVar.d).a();
        knf0 knf0Var = (knf0) nrVar.c;
        return nrVar.z(strA, new d0f(str, knf0Var.c(), knf0Var.c(), d2, d, null, d3, j, j2, knf0Var.a()), d3 > 0.0d, zjeVar);
    }

    public void o(int i) {
        RecyclerView recyclerView = (RecyclerView) this.b;
        View childAt = recyclerView.getChildAt(i);
        if (childAt != null) {
            recyclerView.w(childAt);
            childAt.clearAnimation();
        }
        recyclerView.removeViewAt(i);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(zje zjeVar) {
        u1d0 u1d0Var;
        if (zjeVar instanceof u1d0) {
            u1d0Var = (u1d0) zjeVar;
            int i = u1d0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                u1d0Var.k = i - Integer.MIN_VALUE;
            } else {
                u1d0Var = new u1d0(this, zjeVar);
            }
        } else {
            u1d0Var = new u1d0(this, zjeVar);
        }
        Object objB = u1d0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = u1d0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            c2d0 c2d0Var = (c2d0) ((rta0) this.b).invoke();
            u1d0Var.k = 1;
            objB = c2d0Var.b(u1d0Var);
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

    /* JADX WARN: Code duplicated, block: B:48:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r19v0, types: [a.jw20] */
    /* JADX WARN: Type inference failed for: r4v1, types: [short] */
    /* JADX WARN: Type inference failed for: r4v2, types: [int, short] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    public Object q(int i, long j, zje zjeVar) {
        v1d0 v1d0Var;
        long j2;
        ?? r4;
        Object l1d0Var;
        b2d0 b2d0Var;
        ?? r0;
        long j3;
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        Long l;
        long jLongValue;
        Long l2;
        if (zjeVar instanceof v1d0) {
            v1d0Var = (v1d0) zjeVar;
            int i2 = v1d0Var.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                v1d0Var.n = i2 - Integer.MIN_VALUE;
            } else {
                v1d0Var = new v1d0(this, zjeVar);
            }
        } else {
            v1d0Var = new v1d0(this, zjeVar);
        }
        Object objA = v1d0Var.l;
        wne wneVar = wne.f39444a;
        int i3 = v1d0Var.n;
        if (i3 == 0) {
            z1x.P(objA);
            c2d0 c2d0Var = (c2d0) ((rta0) this.b).invoke();
            v1d0Var.i = j;
            ?? r5 = i;
            v1d0Var.j = r5;
            v1d0Var.n = 1;
            objA = c2d0Var.a(v1d0Var);
            if (objA != wneVar) {
                j2 = j;
                r4 = r5;
            }
            return wneVar;
        }
        if (i3 == 1) {
            short s = v1d0Var.j;
            j2 = v1d0Var.i;
            z1x.P(objA);
            r4 = s;
        } else {
            if (i3 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            short s2 = v1d0Var.j;
            j3 = v1d0Var.i;
            b2d0Var = v1d0Var.k;
            z1x.P(objA);
            r0 = s2;
        }
        hxv hxvVar = (hxv) objA;
        hxvVar.getClass();
        bool = hxvVar.f13830a;
        b2d0Var.getClass();
        bool2 = b2d0Var.b;
        List list = b2d0Var.c;
        bool3 = Boolean.TRUE;
        if (Intrinsics.d(bool2, bool3)) {
            l = b2d0Var.f;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 0;
            }
            l2 = b2d0Var.g;
            if (j3 <= (l2 != null ? l2.longValue() : 0L) && jLongValue <= j3 && (list == null || list.isEmpty() || list.contains(Integer.valueOf((int) r0)))) {
                return new m1d0(System.currentTimeMillis(), b2d0Var.d, b2d0Var.e, Intrinsics.d(bool, bool3));
            }
        }
        List list2 = hxvVar.b;
        return (Intrinsics.d(bool, bool3) || !(list2 == null || list2.isEmpty() || list2.contains(Integer.valueOf((int) r0)))) ? new l1d0(System.currentTimeMillis()) : new m1d0(System.currentTimeMillis(), null, null, true);
        b2d0 b2d0Var2 = (b2d0) ((dx5) objA).a();
        Boolean bool4 = b2d0Var2.f1847a;
        List list3 = b2d0Var2.c;
        if (Intrinsics.d(bool4, Boolean.TRUE) && (list3 == null || list3.isEmpty() || list3.contains(Integer.valueOf((int) r4)))) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            Long l3 = b2d0Var2.d;
            long jLongValue2 = l3 != null ? l3.longValue() : 0L;
            Long l4 = b2d0Var2.e;
            l1d0Var = new n1d0(jCurrentTimeMillis, jLongValue2, l4 != null ? l4.longValue() : 0L);
        } else {
            l1d0Var = new l1d0(System.currentTimeMillis());
        }
        Object obj = l1d0Var instanceof n1d0 ? l1d0Var : null;
        if (obj != null) {
            return obj;
        }
        v1d0Var.k = b2d0Var2;
        v1d0Var.i = j2;
        v1d0Var.j = r4;
        v1d0Var.n = 2;
        Object objP = p(v1d0Var);
        if (objP != wneVar) {
            b2d0Var = b2d0Var2;
            objA = objP;
            r0 = r4;
            j3 = j2;
            hxv hxvVar2 = (hxv) objA;
            hxvVar2.getClass();
            bool = hxvVar2.f13830a;
            b2d0Var.getClass();
            bool2 = b2d0Var.b;
            List list4 = b2d0Var.c;
            bool3 = Boolean.TRUE;
            if (Intrinsics.d(bool2, bool3)) {
                l = b2d0Var.f;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                l2 = b2d0Var.g;
                if (j3 <= (l2 != null ? l2.longValue() : 0L)) {
                    return new m1d0(System.currentTimeMillis(), b2d0Var.d, b2d0Var.e, Intrinsics.d(bool, bool3));
                }
            }
            List list5 = hxvVar2.b;
            if (Intrinsics.d(bool, bool3)) {
            }
        }
        return wneVar;
    }

    public void r(Fragment fragment, ctf0 ctf0Var, j2g0 j2g0Var) {
        rek0 rek0Var = rek0.b;
        fragment.getClass();
        ctf0Var.getClass();
        boolean z = j2g0Var instanceof h2g0;
        Object obj = this.b;
        if (z) {
            wdk0.k((wdk0) obj, new xdk0(rek0Var, ctf0Var.b.a(((h2g0) j2g0Var).f12332a, Arrays.copyOf(new Object[0], 0)), null, null, null, null, 124), fragment, null, null, false, null, 1020);
        } else if (j2g0Var instanceof i2g0) {
            wdk0.k((wdk0) obj, new xdk0(rek0Var, ctf0Var.b.a(R.string.statistics_dont_found_for_event, Arrays.copyOf(new Object[0], 0)), null, null, null, null, 124), fragment, null, null, false, null, 1020);
        } else {
            t9f.b();
        }
    }

    public String toString() {
        switch (this.f17232a) {
            case 8:
                StringBuilder sb = new StringBuilder("OkHttpExecutorConfig(host='");
                wut0 wut0Var = (wut0) this.b;
                sb.append((String) wut0Var.n.invoke());
                sb.append("', accessToken='");
                a8z a8zVar = wut0Var.i;
                sb.append(w7n0.m((List) a8zVar.getValue()));
                sb.append("', secret='");
                List list = (List) a8zVar.getValue();
                list.getClass();
                xut0 xut0Var = (xut0) CollectionsKt.firstOrNull(list);
                sb.append(xut0Var != null ? xut0Var.b : null);
                sb.append("', logFilterCredentials=");
                return brm0.o(sb, wut0Var.k, ')');
            default:
                return super.toString();
        }
    }

    @Override // a.lry
    public void a() {
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
    }

    @Override // a.lry
    public void n(g950 g950Var, tlc tlcVar) {
    }

    public jw20(vff0 vff0Var) {
        this.f17232a = (byte) 29;
        vff0Var.getClass();
        this.b = vff0Var;
    }

    public jw20(j400 j400Var) {
        this.f17232a = (byte) 11;
        j400Var.getClass();
        this.b = j400Var;
    }

    public /* synthetic */ jw20(Object obj, byte b) {
        this.f17232a = b;
        this.b = obj;
    }

    public jw20(xuz xuzVar, mne mneVar, rrc rrcVar) {
        this.f17232a = (byte) 1;
        this.b = new kki(mneVar, rrcVar);
    }

    public jw20(wdk0 wdk0Var) {
        this.f17232a = (byte) 26;
        wdk0Var.getClass();
        this.b = wdk0Var;
    }

    public jw20(bad badVar) {
        this.f17232a = (byte) 13;
        badVar.getClass();
        this.b = new yqc(badVar, (byte) 18);
    }

    public jw20(jld0 jld0Var) {
        this.f17232a = (byte) 17;
        this.b = jld0Var.a();
    }

    public jw20(oeg0 oeg0Var, uf3 uf3Var, sxs0 sxs0Var, pru pruVar, pbt pbtVar, j1q0 j1q0Var, mne mneVar, kt2 kt2Var, p4u p4uVar, xcc xccVar, ls lsVar, z4u z4uVar, gst0 gst0Var, ntu ntuVar, fvt0 fvt0Var, oct octVar, wdk0 wdk0Var, khf0 khf0Var, cdu cduVar, jdu jduVar, d1p d1pVar, iqt iqtVar, lbu lbuVar) {
        this.f17232a = (byte) 9;
        oeg0Var.getClass();
        pbtVar.getClass();
        j1q0Var.getClass();
        kt2Var.getClass();
        gst0Var.getClass();
        wdk0Var.getClass();
        d1pVar.getClass();
        this.b = new nc0(d1pVar, sxs0Var, oeg0Var, uf3Var, pbtVar, kt2Var, p4uVar, xccVar, lsVar, z4uVar, gst0Var, ntuVar, khf0Var, jduVar, lbuVar);
    }

    public jw20(wut0 wut0Var) {
        this.f17232a = (byte) 8;
        this.b = wut0Var;
        if (wut0Var.f39807a != null) {
            return;
        }
        jf4.o("context is null");
        throw null;
    }

    public jw20(byte b) {
        this.f17232a = b;
        switch (b) {
            case 6:
                this.b = roj0.b(1, 0, null, 6);
                break;
            default:
                this.b = new fq80();
                break;
        }
    }

    public jw20(tr20 tr20Var, tr20 tr20Var2, ImageView imageView) {
        this.f17232a = (byte) 3;
        this.b = imageView;
    }

    @Override // a.lry
    public void b(g950 g950Var, qlc qlcVar, g950 g950Var2) {
    }
}
