package a;

import android.graphics.Rect;
import android.javax.sip.message.Response;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.huawei.hms.api.ConnectionResult;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreenModel;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$AggregatorMainScreen;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$BrandGamesFragmentScreen;
import org.xplatform.aggregator.impl.core.navigation.AggregatorScreens$PartTypeOneScreen;

/* JADX INFO: loaded from: classes2.dex */
public class peg0 implements mx30, zf60, ns2, t29, xro {
    public static peg0 c;
    public static final RootTelemetryConfiguration d = new RootTelemetryConfiguration(0, 0, 0, false, false);
    public static final peg0 e;
    public static final xit f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26851a;
    public Object b;

    static {
        byte b = 1;
        e = new peg0(new float[]{0.8951f, -0.7502f, 0.0389f, 0.2664f, 1.7135f, -0.0685f, -0.1614f, 0.0367f, 1.0296f}, b);
        f = new xit(b);
    }

    public peg0(byte b) {
        z440 z440Var;
        this.f26851a = b;
        switch (b) {
            case 14:
                this.b = new ConcurrentHashMap();
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                this.b = wy40.l();
                break;
            default:
                c5d0 c5d0Var = c5d0.c;
                try {
                    z440Var = (z440) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    z440Var = f;
                }
                z440[] z440VarArr = {xit.b, z440Var};
                co20 co20Var = new co20();
                co20Var.f4682a = z440VarArr;
                Charset charset = fmx.f9806a;
                this.b = co20Var;
                break;
        }
    }

    public static synchronized peg0 m() {
        peg0 peg0Var;
        peg0Var = c;
        if (peg0Var == null) {
            peg0Var = new peg0((byte) 0, false);
            c = peg0Var;
        }
        return peg0Var;
    }

    public static AggregatorScreens$PartTypeOneScreen n(peg0 peg0Var, String str, long j, hm1 hm1Var, int i) {
        hm1 hm1Var2;
        if ((i & 8) != 0) {
            iun iunVar = iun.f15405a;
            hm1Var2 = new hm1(iunVar, iunVar);
        } else {
            hm1Var2 = hm1Var;
        }
        peg0Var.getClass();
        str.getClass();
        return new AggregatorScreens$PartTypeOneScreen(new AggregatorScreenModel(str, "", j, hm1Var2, null, -1L, -1L, null, false, Response.BAD_REQUEST));
    }

    public static String s(Bundle bundle, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put("name", str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // a.mx30
    public void a(ox30 ox30Var) {
        drm0 drm0Var = ((ActionMenuView) this.b).u;
        if (drm0Var != null) {
            drm0Var.a(ox30Var);
        }
    }

    @Override // a.xro
    public wy40 b() {
        throw null;
    }

    @Override // a.t29
    public void c(i8f i8fVar) {
        this.b = i8fVar;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Registered Firebase Analytics event receiver for breadcrumbs", null);
        }
    }

    @Override // a.ns2
    public void d(Bundle bundle, String str) {
        i8f i8fVar = (i8f) this.b;
        if (i8fVar != null) {
            try {
                String str2 = "$A$:" + s(bundle, str);
                j8f j8fVar = i8fVar.f14335a;
                j8fVar.getClass();
                ((aaf) j8fVar.o.b).b(new h8f(j8fVar, System.currentTimeMillis() - j8fVar.d, str2));
            } catch (JSONException unused) {
                Log.w("FirebaseCrashlytics", "Unable to serialize Firebase Analytics event to breadcrumb.", null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003c A[RETURN] */
    @Override // a.mx30
    public boolean f(ox30 ox30Var, MenuItem menuItem) {
        boolean zOnMenuItemClick;
        bj bjVar = ((ActionMenuView) this.b).z;
        if (bjVar != null) {
            Toolbar toolbar = (Toolbar) ((ani0) bjVar).f1155a;
            Iterator it = ((CopyOnWriteArrayList) toolbar.j1.c).iterator();
            while (it.hasNext()) {
                if (((l1r) it.next()).f19270a.s()) {
                    zOnMenuItemClick = true;
                    if (zOnMenuItemClick) {
                        return true;
                    }
                }
            }
            hwq0 hwq0Var = toolbar.l1;
            zOnMenuItemClick = hwq0Var != null ? hwq0Var.onMenuItemClick(menuItem) : false;
            if (zOnMenuItemClick) {
                return true;
            }
        }
        return false;
    }

    public zkd g(ar20 ar20Var, ArrayList arrayList) {
        ar20Var.getClass();
        if (ar20Var.equals(wb.n) ? true : ar20Var.equals(wb.o)) {
            return new xc00(ar20Var, arrayList);
        }
        ar20 ar20Var2 = wb.p;
        return ar20Var.equals(ar20Var2) ? new id00(ar20Var2, arrayList) : new zkd(ar20Var, arrayList);
    }

    public List h(ar20 ar20Var, int i, int i2) {
        int i3;
        ar20Var.getClass();
        fr20 fr20Var = cy2.j0;
        if (!ar20Var.equals(fr20Var)) {
            return kotlin.collections.a.c(new fiz(ar20Var, i, i2));
        }
        ArrayList arrayList = new ArrayList();
        while (i < i2) {
            CharSequence charSequence = (CharSequence) this.b;
            charSequence.getClass();
            int i4 = i2 - 1;
            if (i > i4) {
                i3 = -1;
                break;
            }
            i3 = i;
            while (charSequence.charAt(i3) != '\n') {
                if (i3 == i4) {
                    i3 = -1;
                    break;
                }
                i3++;
            }
            if (i3 == -1) {
                break;
            }
            if (i3 > i) {
                arrayList.add(new fiz(fr20Var, i, i3));
            }
            int i5 = i3 + 1;
            arrayList.add(new fiz(cy2.M, i3, i5));
            i = i5;
        }
        if (i2 > i) {
            arrayList.add(new fiz(fr20Var, i, i2));
        }
        return arrayList;
    }

    public void i() {
        ((us3) this.b).getClass();
    }

    public AggregatorScreens$BrandGamesFragmentScreen j(long j, String str, List list, String str2, boolean z, boolean z2, vc0 vc0Var, String str3) {
        str.getClass();
        list.getClass();
        gz8 gz8Var = gz8.f12169a;
        return new AggregatorScreens$BrandGamesFragmentScreen(new uc0(0, 0L, j, str, str3, str2, list, z, z2));
    }

    public AggregatorScreens$AggregatorMainScreen k() {
        return new AggregatorScreens$AggregatorMainScreen(new jr1(avc0.f1518a), new AggregatorScreenModel(null, null, 0L, bm1.f2818a, null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        zfb zfbVar;
        RecyclerView recyclerView;
        boolean z = false;
        boolean z2 = true;
        switch (this.f26851a) {
            case 8:
                int iD = xiv0Var.d();
                pd3 pd3Var = (pd3) this.b;
                int iD2 = xiv0Var.d();
                ActionBarContextView actionBarContextView = pd3Var.u;
                if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pd3Var.u.getLayoutParams();
                    if (pd3Var.u.isShown()) {
                        if (pd3Var.B1 == null) {
                            pd3Var.B1 = new Rect();
                            pd3Var.C1 = new Rect();
                        }
                        Rect rect = pd3Var.B1;
                        Rect rect2 = pd3Var.C1;
                        rect.set(xiv0Var.b(), xiv0Var.d(), xiv0Var.c(), xiv0Var.a());
                        pfx pfxVarI = xiv0Var.f40966a.i(2);
                        ViewGroup viewGroup = pd3Var.z;
                        if (Build.VERSION.SDK_INT >= 29) {
                            boolean z3 = cmu0.f4626a;
                            sf3.c(rect, rect2, viewGroup);
                        } else {
                            if (!cmu0.f4626a) {
                                cmu0.f4626a = true;
                                try {
                                    Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                                    cmu0.b = declaredMethod;
                                    if (!declaredMethod.isAccessible()) {
                                        cmu0.b.setAccessible(true);
                                    }
                                } catch (NoSuchMethodException unused) {
                                    Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                                }
                            }
                            Method method = cmu0.b;
                            if (method != null) {
                                try {
                                    method.invoke(viewGroup, rect, rect2);
                                } catch (Exception e2) {
                                    Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e2);
                                }
                            }
                        }
                        pfx pfxVarC = pfx.c(Math.max(0, pfxVarI.f26926a - rect2.left), Math.max(0, pfxVarI.b - rect2.top), Math.max(0, pfxVarI.c - rect2.right), Math.max(0, pfxVarI.d - rect2.bottom));
                        int i = pfxVarC.c;
                        int i2 = marginLayoutParams.leftMargin;
                        int i3 = pfxVarC.f26926a;
                        if (i2 == i3 && marginLayoutParams.rightMargin == i) {
                            z2 = false;
                        } else {
                            marginLayoutParams.leftMargin = i3;
                            marginLayoutParams.rightMargin = i;
                        }
                        ActionBarContextView actionBarContextView2 = pd3Var.u;
                        int i4 = rect.left - i3;
                        int i5 = rect.top;
                        int i6 = rect.right - i;
                        actionBarContextView2.u = i4;
                        actionBarContextView2.v = i5;
                        actionBarContextView2.w = i6;
                        actionBarContextView2.k();
                        if (!pd3Var.g1 && rect.top > 0) {
                            iD2 = 0;
                        }
                        z = z2;
                    }
                    if (z) {
                        pd3Var.u.setLayoutParams(marginLayoutParams);
                    }
                    break;
                }
                return rgu0.j(view, iD != iD2 ? xiv0Var.f(xiv0Var.b(), iD2, xiv0Var.c(), xiv0Var.a()) : xiv0Var);
            default:
                view.getClass();
                uiv0 uiv0Var = xiv0Var.f40966a;
                int i7 = uiv0Var.i(1).b;
                hgb hgbVar = (hgb) this.b;
                kl5 kl5Var = hgb.c2;
                jmu0.l(i7, 0, 13, hgbVar.G0().d);
                int iMax = Math.max((uiv0Var.i(8).d - uiv0Var.i(2).d) - hgbVar.G().getDimensionPixelSize(R.dimen.bottom_navigation_view_height), 0);
                boolean z4 = iMax > 0;
                int dimensionPixelSize = hgbVar.G().getDimensionPixelSize(R.dimen.space_24);
                int dimensionPixelSize2 = hgbVar.G().getDimensionPixelSize(R.dimen.space_40);
                if (!z4) {
                    dimensionPixelSize2 = 0;
                }
                RecyclerView recyclerView2 = hgbVar.G0().f;
                recyclerView2.setPadding(recyclerView2.getPaddingLeft(), recyclerView2.getPaddingTop(), recyclerView2.getPaddingRight(), dimensionPixelSize + iMax + dimensionPixelSize2);
                jk3 jk3Var = hgbVar.X1;
                Boolean boolValueOf = jk3Var != null ? Boolean.valueOf(((FrameLayout) jk3Var.e).getVisibility() == 0) : null;
                int dimensionPixelSize3 = hgbVar.G().getDimensionPixelSize(R.dimen.space_8);
                jk3 jk3Var2 = hgbVar.X1;
                if (jk3Var2 != null) {
                    ((FrameLayout) jk3Var2.e).setVisibility(z4 ? 0 : 8);
                }
                jk3 jk3Var3 = hgbVar.X1;
                if (jk3Var3 != null) {
                    FrameLayout frameLayout = (FrameLayout) jk3Var3.e;
                    frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), iMax + dimensionPixelSize3);
                }
                hgbVar.G0().d.setCursorOnSearchFiledVisible(z4);
                if (!Intrinsics.d(boolValueOf, Boolean.valueOf(z4))) {
                    jgb jgbVarH0 = hgbVar.H0();
                    jgbVarH0.q = z4;
                    p7m0 p7m0Var = jgbVarH0.k;
                    if ((p7m0Var.getValue() instanceof o26) || (p7m0Var.getValue() instanceof n26)) {
                        jgbVarH0.y();
                    }
                }
                if (!z4 && (zfbVar = hgbVar.R1) != null && (recyclerView = zfbVar.l) != null) {
                    recyclerView.addOnLayoutChangeListener(new w23(recyclerView, (byte) 5));
                }
                return xiv0.b;
        }
    }

    public AggregatorScreens$AggregatorMainScreen o() {
        return new AggregatorScreens$AggregatorMainScreen(new hr1(-10L, 2), new AggregatorScreenModel(null, null, 0L, em1.f8026a, null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
    }

    public Object p(bnn0 bnn0Var) {
        Object objB = ((dn0) this.b).b(a7p.f382a, 8201, bnn0Var);
        return objB == wne.f39444a ? objB : Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AggregatorScreens$AggregatorMainScreen q(lr1 lr1Var) {
        boolean z;
        AggregatorScreenModel aggregatorScreenModel;
        lr1Var.getClass();
        if (lr1Var instanceof fr1) {
            fr1 fr1Var = (fr1) lr1Var;
            fs80 fs80Var = fr1Var.c;
            boolean zA = fs80Var.a();
            String str = fs80Var.f10054a;
            if (!zA) {
                ctf0 ctf0Var = (ctf0) ((wsf0) this.b).b;
                long j = fs80Var.b;
                boolean z2 = fs80Var.f;
                List list = fs80Var.d;
                List list2 = fs80Var.c;
                if (j == nw80.f24223a.getId()) {
                    aggregatorScreenModel = new AggregatorScreenModel(ctf0Var.f(R.string.live_casino_title, new Object[0]), ctf0Var.f(R.string.casino_category_folder_and_section_description, new Object[0]), fs80Var.b, new hm1(list2, list), null, 0L, 0L, null, false, 496);
                } else if (j == nw80.b.getId()) {
                    aggregatorScreenModel = new AggregatorScreenModel(ctf0Var.f(R.string.array_slots, new Object[0]), ctf0Var.f(R.string.casino_category_folder_and_section_description, new Object[0]), fs80Var.b, new hm1(list2, list), null, 0L, 0L, null, false, 496);
                } else if (j == nw80.i.getId()) {
                    aggregatorScreenModel = new AggregatorScreenModel(ctf0Var.f(R.string.tv_bet_casino_title, new Object[0]), null, fs80Var.b, new im1(false, z2), null, 0L, 0L, null, false, 498);
                } else {
                    aggregatorScreenModel = str.length() > 0 ? new AggregatorScreenModel(str, null, fs80Var.b, new im1(false, z2), null, 0L, 0L, null, false, 498) : new AggregatorScreenModel(null, null, 0L, null, null, 0L, 0L, null, false, 511);
                }
                if (!aggregatorScreenModel.equals(new AggregatorScreenModel(null, null, 0L, null, null, 0L, 0L, null, false, 511))) {
                    fr1Var = new fr1(null, 0 == true ? 1 : 0, 3);
                }
                return new AggregatorScreens$AggregatorMainScreen(fr1Var, aggregatorScreenModel);
            }
        }
        if (lr1Var instanceof kr1) {
            uc0 uc0Var = ((kr1) lr1Var).c;
            if (uc0Var.f35407a != nw80.t.getId() || uc0Var.c.length() != 0 || uc0Var.b != Long.MIN_VALUE || !uc0Var.g.isEmpty()) {
                kr1 kr1Var = new kr1();
                long j2 = uc0Var.f35407a;
                long j3 = uc0Var.b;
                String str2 = uc0Var.c;
                short s = uc0Var.e;
                List list3 = uc0Var.g;
                String str3 = uc0Var.h;
                if (uc0Var.f) {
                    z = true;
                } else {
                    gz8 gz8Var = gz8.f12169a;
                    gz8 gz8Var2 = gz8.f12169a;
                    z = false;
                }
                boolean z3 = uc0Var.i;
                String str4 = uc0Var.d;
                if (str4 == null) {
                    str4 = "";
                }
                return new AggregatorScreens$AggregatorMainScreen(kr1Var, new AggregatorScreenModel(null, null, 0L, new xl1(s, j2, j3, str2, str4, str3, list3, z, z3), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
            }
        }
        boolean z4 = lr1Var instanceof jr1;
        if (z4) {
            fvc0 fvc0Var = ((jr1) lr1Var).c;
            if (fvc0Var instanceof evc0) {
                evc0 evc0Var = (evc0) fvc0Var;
                return new AggregatorScreens$AggregatorMainScreen(new jr1(), new AggregatorScreenModel(null, null, 0L, new sm1(evc0Var.f8461a), null, 0L, 0L, null, evc0Var.b, 247));
            }
        }
        if (z4 && (((jr1) lr1Var).c instanceof avc0)) {
            return new AggregatorScreens$AggregatorMainScreen(new jr1(), new AggregatorScreenModel(null, null, 0L, bm1.f2818a, null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
        }
        if (lr1Var instanceof hr1) {
            hr1 hr1Var = (hr1) lr1Var;
            long j4 = hr1Var.c;
            s0s s0sVar = s0s.ONE_X_LIVE_AGGREGATOR;
            if (j4 == -1) {
                long j5 = hr1Var.d;
                nw80.t.getId();
                mr1 mr1Var = mr1.f22247a;
                return new AggregatorScreens$AggregatorMainScreen(new hr1(0L, j5), new AggregatorScreenModel(null, null, 0L, new lm1(), null, 0L, 0L, null, false, Response.SERVICE_UNAVAILABLE));
            }
        }
        return new AggregatorScreens$AggregatorMainScreen(lr1Var, new AggregatorScreenModel(null, null, 0L, null, null, 0L, 0L, null, false, 511));
    }

    public String toString() {
        switch (this.f26851a) {
            case 1:
                return "Bradford";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ peg0(Object obj, byte b) {
        this.f26851a = b;
        this.b = obj;
    }

    public peg0(vgf vgfVar) {
        this.f26851a = (byte) 28;
        vgfVar.getClass();
        this.b = vgfVar;
    }

    public peg0(y6j0 y6j0Var) {
        this.f26851a = (byte) 24;
        y6j0Var.getClass();
        this.b = y6j0Var;
    }

    public peg0(vf3 vf3Var) {
        this.f26851a = (byte) 9;
        vf3Var.getClass();
        this.b = vf3Var;
    }

    public peg0(dn0 dn0Var) {
        this.f26851a = (byte) 26;
        dn0Var.getClass();
        this.b = dn0Var;
    }

    public peg0(us3 us3Var) {
        this.f26851a = (byte) 10;
        us3Var.getClass();
        this.b = us3Var;
    }

    public peg0(gl5 gl5Var, us00 us00Var) {
        this.f26851a = (byte) 18;
        this.b = new m73(us00Var);
    }

    public peg0(CharSequence charSequence) {
        this.f26851a = (byte) 3;
        charSequence.getClass();
        this.b = charSequence;
    }

    public peg0(j1q0 j1q0Var, ii iiVar) {
        this.f26851a = (byte) 21;
        j1q0Var.getClass();
        iiVar.getClass();
        yzn0 yzn0Var = new yzn0();
        yzn0Var.f43523a = iiVar;
        yzn0Var.b = mbl.b(new pai(yzn0Var, (byte) 13));
        this.b = yzn0Var;
    }

    public peg0(gii0 gii0Var, byte b) {
        this.f26851a = b;
        gii0Var.getClass();
        switch (b) {
            case 13:
                this.b = new zm(gii0Var, (byte) 13);
                break;
            case 14:
            case 16:
            default:
                this.b = new zm(gii0Var, (byte) 11);
                break;
            case 15:
                this.b = new zm(gii0Var, (byte) 19);
                break;
            case 17:
                this.b = new zm(gii0Var, (byte) 26);
                break;
        }
    }

    public peg0(j1q0 j1q0Var, btt0 btt0Var, knf0 knf0Var, gii0 gii0Var) {
        this.f26851a = (byte) 5;
        j1q0Var.getClass();
        btt0Var.getClass();
        knf0Var.getClass();
        gii0Var.getClass();
        this.b = new xex(btt0Var, gii0Var);
    }

    public peg0(cad cadVar, eg3 eg3Var, us3 us3Var, ntu ntuVar, us00 us00Var, ie5 ie5Var, ie5 ie5Var2) {
        this.f26851a = (byte) 12;
        eg3Var.getClass();
        us3Var.getClass();
        ie5Var.getClass();
        ie5Var2.getClass();
        gr00 gr00Var = new gr00();
        gr00Var.f11760a = us00Var;
        gr00Var.b = eg3Var;
        gr00Var.c = cadVar;
        gr00Var.d = ie5Var2;
        gr00Var.e = ie5Var;
        this.b = gr00Var;
    }

    public /* synthetic */ peg0(byte b, boolean z) {
        this.f26851a = b;
    }
}
