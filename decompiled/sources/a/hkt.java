package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.location.Geocoder;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Looper;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/hkt;", "La/yx5;", "<init>", "()V", "a/pek", "blocking"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hkt extends yx5 {
    public fiu0 K1;
    public ii L1;
    public final kiu0 M1;
    public final s0r N1;
    public final yzn0 O1;
    public final cgx0 P1;
    public long Q1;
    public Geocoder R1;
    public LocationManager S1;
    public final n0o0 U1;
    public final n0o0 V1;
    public final ywq W1;
    public final ywq X1;
    public CancellationSignal Y1;
    public static final /* synthetic */ iiy[] a2 = {new j0d0(hkt.class, "viewBinding", "getViewBinding()Lorg/xplatform/blocking/databinding/GeoblockingLayoutBinding;", 0), new ez40(hkt.class, "currentState", "getCurrentState()Lorg/xplatform/onexuser/data/user/model/GeoState;", 0), new ez40(hkt.class, "needGeo", "getNeedGeo()Z", 0)};
    public static final pek Z1 = new pek();

    public hkt() {
        super(R.layout.geoblocking_layout);
        dkt dktVar = new dkt(this, (byte) 3);
        a8z a8zVarA = maz.a(wez.b, new t7t(new t7t(this, (byte) 4), (byte) 5));
        this.M1 = agc.G(this, sre0.f32672a.b(mkt.class), new r6p(a8zVarA, (byte) 20), new r6p(a8zVarA, (byte) 21), dktVar);
        this.N1 = ltt0.o(this, gkt.f11460a);
        this.O1 = new yzn0("BUNDLE_STATE");
        this.P1 = new cgx0("BUNDLE_NEED_GEO");
        this.Q1 = -1L;
        this.U1 = maz.b(new dkt(this, (byte) 4));
        this.V1 = maz.b(new dkt(this, (byte) 5));
        final byte b = 1;
        this.W1 = m0(new wn(this) { // from class: a.bkt
            public final /* synthetic */ hkt b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0046  */
            @Override // a.wn
            public final void a(Object obj) {
                byte b2 = b;
                hkt hktVar = this.b;
                switch (b2) {
                    case 0:
                        pek pekVar = hkt.Z1;
                        if (jiq0.j0(hktVar.o0(), "android.permission.ACCESS_FINE_LOCATION") == 0 && jiq0.j0(hktVar.o0(), "android.permission.ACCESS_COARSE_LOCATION") == 0 && hkt.J0(hktVar.D())) {
                            hktVar.G0();
                        } else {
                            hktVar.H0().b.setVisibility(0);
                        }
                        break;
                    default:
                        Map map = (Map) obj;
                        pek pekVar2 = hkt.Z1;
                        map.getClass();
                        if (!map.isEmpty()) {
                            if (!map.isEmpty()) {
                                Iterator it = map.entrySet().iterator();
                                while (it.hasNext()) {
                                    if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    }
                                }
                                if (hkt.J0(hktVar.D())) {
                                    hktVar.G0();
                                }
                            } else if (hkt.J0(hktVar.D())) {
                                hktVar.G0();
                            }
                        }
                        hktVar.K0();
                        break;
                }
            }
        }, new xn((byte) 2));
        final byte b2 = 0;
        this.X1 = m0(new wn(this) { // from class: a.bkt
            public final /* synthetic */ hkt b;

            {
                this.b = this;
            }

            /* JADX WARN: Code duplicated, block: B:17:0x0046  */
            @Override // a.wn
            public final void a(Object obj) {
                byte b3 = b2;
                hkt hktVar = this.b;
                switch (b3) {
                    case 0:
                        pek pekVar = hkt.Z1;
                        if (jiq0.j0(hktVar.o0(), "android.permission.ACCESS_FINE_LOCATION") == 0 && jiq0.j0(hktVar.o0(), "android.permission.ACCESS_COARSE_LOCATION") == 0 && hkt.J0(hktVar.D())) {
                            hktVar.G0();
                        } else {
                            hktVar.H0().b.setVisibility(0);
                        }
                        break;
                    default:
                        Map map = (Map) obj;
                        pek pekVar2 = hkt.Z1;
                        map.getClass();
                        if (!map.isEmpty()) {
                            if (!map.isEmpty()) {
                                Iterator it = map.entrySet().iterator();
                                while (it.hasNext()) {
                                    if (!((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                                    }
                                }
                                if (hkt.J0(hktVar.D())) {
                                    hktVar.G0();
                                }
                            } else if (hkt.J0(hktVar.D())) {
                                hktVar.G0();
                            }
                        }
                        hktVar.K0();
                        break;
                }
            }
        }, new xn((byte) 4));
    }

    public static boolean J0(Context context) {
        if (context == null) {
            return false;
        }
        Object systemService = context.getSystemService("location");
        systemService.getClass();
        LocationManager locationManager = (LocationManager) systemService;
        return locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps");
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(akt.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            akt aktVar = (akt) (ze3Var instanceof akt ? ze3Var : null);
            if (aktVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                xak xakVar = aktVar.f1038a;
                a6u a6uVar = aktVar.b;
                wyu wyuVar = aktVar.c;
                y3v y3vVar = aktVar.d;
                ii iiVar = aktVar.f;
                evz evzVar = aktVar.e;
                mne mneVar = aktVar.g;
                s64 s64Var = aktVar.h;
                wgu wguVar = aktVar.i;
                dpc dpcVar = aktVar.j;
                ani0 ani0Var = aktVar.k;
                duj dujVar = aktVar.l;
                iiVar.getClass();
                wyuVar.getClass();
                wguVar.getClass();
                this.K1 = new fiu0(Collections.singletonMap(mkt.class, (ugi) new qv2(iiVar, xakVar, a6uVar, wyuVar, y3vVar, i1w0VarF, evzVar, mneVar, s64Var, wguVar, dpcVar, ani0Var, dujVar).n));
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(akt.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = I0().m;
        j0s j0sVar = new j0s(this, null, (byte) 13);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fns(p7m0Var, clzVarW, j0sVar, (yje) null), 3);
    }

    public final void G0() {
        if (jiq0.j0(o0(), "android.permission.ACCESS_FINE_LOCATION") != 0 || jiq0.j0(o0(), "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            this.W1.a(new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"});
            return;
        }
        if (!J0(D())) {
            K0();
            return;
        }
        rl70 rl70Var = j3c0.f2;
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        rl70Var.getClass();
        new j3c0().H0(eVarC, j3c0.h2);
        mkt mktVarI0 = I0();
        bby bbyVar = mktVarI0.n;
        yje yjeVar = null;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        mktVarI0.n = null;
        mktVarI0.n = sac.f0(jiu0.a(mktVarI0), 1L, TimeUnit.MINUTES, mktVarI0.g.b, lkt.f20217a, new gkr(mktVarI0, yjeVar, (byte) 9), 32);
        boolean zIsProviderEnabled = false;
        if (Build.VERSION.SDK_INT < 30) {
            LocationManager locationManager = this.S1;
            if (locationManager == null) {
                Intrinsics.h("locationManager");
                throw null;
            }
            Context contextD = D();
            if (contextD != null) {
                Object systemService = contextD.getSystemService("location");
                systemService.getClass();
                zIsProviderEnabled = ((LocationManager) systemService).isProviderEnabled("network");
            }
            locationManager.requestSingleUpdate(zIsProviderEnabled ? "network" : "passive", (LocationListener) this.V1.getValue(), Looper.getMainLooper());
            return;
        }
        if (this.Y1 != null) {
            return;
        }
        this.Y1 = new CancellationSignal();
        LocationManager locationManager2 = this.S1;
        if (locationManager2 == null) {
            Intrinsics.h("locationManager");
            throw null;
        }
        Context contextD2 = D();
        if (contextD2 != null) {
            Object systemService2 = contextD2.getSystemService("location");
            systemService2.getClass();
            zIsProviderEnabled = ((LocationManager) systemService2).isProviderEnabled("network");
        }
        locationManager2.getCurrentLocation(zIsProviderEnabled ? "network" : "passive", this.Y1, n0().getMainExecutor(), (Consumer) this.U1.getValue());
    }

    public final tlt H0() {
        Object objN = this.N1.n(a2[0], this);
        objN.getClass();
        return (tlt) objN;
    }

    public final mkt I0() {
        return (mkt) this.M1.getValue();
    }

    public final void K0() {
        ii iiVar = this.L1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        String strH = H(R.string.attention);
        String strH2 = H(R.string.geo_settings_message);
        String strH3 = H(R.string.open_settings);
        strH3.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, H(R.string.cancel), (String) null, "LOCATION_SETTINGS_RESULT", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }

    public final void L0() {
        H0().b.setVisibility(0);
        androidx.fragment.app.e eVarC = C();
        j3c0.f2.getClass();
        Fragment fragmentJ = eVarC.J(j3c0.h2);
        j3c0 j3c0Var = fragmentJ instanceof j3c0 ? (j3c0) fragmentJ : null;
        if (j3c0Var != null) {
            j3c0Var.x0();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.W1.b();
        this.X1.b();
        CancellationSignal cancellationSignal = this.Y1;
        if (cancellationSignal != null) {
            cancellationSignal.cancel();
        }
        this.Y1 = null;
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) {
        Window window;
        view.getClass();
        super.i0(view, bundle);
        kxq kxqVarB = B();
        final byte b = 0;
        if (kxqVarB != null && (window = kxqVarB.getWindow()) != null) {
            bcm0.x(window, false);
        }
        yhb yhbVar = new yhb(view);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(view, yhbVar);
        iiy[] iiyVarArr = a2;
        final byte b2 = 1;
        int iOrdinal = ((rlt) this.O1.n(this, iiyVarArr[1])).ordinal();
        final byte b3 = 2;
        if (iOrdinal == 0) {
            H0().f.setText(R.string.geo_blocking_text);
            H0().b.setVisibility(8);
            H0().d.setVisibility(8);
            H0().e.setVisibility(8);
        } else if (iOrdinal == 1) {
            iiy iiyVar = iiyVarArr[2];
            cgx0 cgx0Var = this.P1;
            if (cgx0Var.n(this, iiyVar).booleanValue()) {
                Context contextD = D();
                if (contextD != null) {
                    Object systemService = contextD.getSystemService("location");
                    systemService.getClass();
                    this.S1 = (LocationManager) systemService;
                }
                G0();
            }
            H0().f.setText(R.string.geo_blocking_text);
            H0().b.setVisibility(!cgx0Var.n(this, iiyVarArr[2]).booleanValue() ? 0 : 8);
            H0().d.setVisibility(8);
            H0().e.setVisibility(8);
        } else if (iOrdinal != 2) {
            t9f.b();
            return;
        }
        dyb.O(H0().d, new Function1(this) { // from class: a.fkt
            public final /* synthetic */ hkt b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b;
                hkt hktVar = this.b;
                View view2 = (View) obj;
                switch (b4) {
                    case 0:
                        pek pekVar = hkt.Z1;
                        view2.getClass();
                        hktVar.w0(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    case 1:
                        pek pekVar2 = hkt.Z1;
                        view2.getClass();
                        mkt mktVarI0 = hktVar.I0();
                        sac.V(jiu0.a(mktVarI0), new ikt(mktVarI0, (byte) 1), null, mktVarI0.g.b, new fhq(mktVarI0, null, (byte) 7), 10);
                        break;
                    default:
                        pek pekVar3 = hkt.Z1;
                        view2.getClass();
                        mkt mktVarI1 = hktVar.I0();
                        i8i.D("screen", "login_restrict_country", (kt2) mktVarI1.d.b, "login_page_call");
                        s64 s64Var = mktVarI1.h;
                        y1p y1pVar = y1p.MAIN;
                        s64Var.c("login_restrict_country");
                        ((zte0) mktVarI1.j.f6458a.b).f44955a.set(true);
                        mktVarI1.k.d(false);
                        mktVarI1.f.d(new vls((byte) 24));
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.O(H0().e, new Function1(this) { // from class: a.fkt
            public final /* synthetic */ hkt b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b2;
                hkt hktVar = this.b;
                View view2 = (View) obj;
                switch (b4) {
                    case 0:
                        pek pekVar = hkt.Z1;
                        view2.getClass();
                        hktVar.w0(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    case 1:
                        pek pekVar2 = hkt.Z1;
                        view2.getClass();
                        mkt mktVarI0 = hktVar.I0();
                        sac.V(jiu0.a(mktVarI0), new ikt(mktVarI0, (byte) 1), null, mktVarI0.g.b, new fhq(mktVarI0, null, (byte) 7), 10);
                        break;
                    default:
                        pek pekVar3 = hkt.Z1;
                        view2.getClass();
                        mkt mktVarI1 = hktVar.I0();
                        i8i.D("screen", "login_restrict_country", (kt2) mktVarI1.d.b, "login_page_call");
                        s64 s64Var = mktVarI1.h;
                        y1p y1pVar = y1p.MAIN;
                        s64Var.c("login_restrict_country");
                        ((zte0) mktVarI1.j.f6458a.b).f44955a.set(true);
                        mktVarI1.k.d(false);
                        mktVarI1.f.d(new vls((byte) 24));
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.O(H0().b, new Function1(this) { // from class: a.fkt
            public final /* synthetic */ hkt b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                hkt hktVar = this.b;
                View view2 = (View) obj;
                switch (b4) {
                    case 0:
                        pek pekVar = hkt.Z1;
                        view2.getClass();
                        hktVar.w0(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                        break;
                    case 1:
                        pek pekVar2 = hkt.Z1;
                        view2.getClass();
                        mkt mktVarI0 = hktVar.I0();
                        sac.V(jiu0.a(mktVarI0), new ikt(mktVarI0, (byte) 1), null, mktVarI0.g.b, new fhq(mktVarI0, null, (byte) 7), 10);
                        break;
                    default:
                        pek pekVar3 = hkt.Z1;
                        view2.getClass();
                        mkt mktVarI1 = hktVar.I0();
                        i8i.D("screen", "login_restrict_country", (kt2) mktVarI1.d.b, "login_page_call");
                        s64 s64Var = mktVarI1.h;
                        y1p y1pVar = y1p.MAIN;
                        s64Var.c("login_restrict_country");
                        ((zte0) mktVarI1.j.f6458a.b).f44955a.set(true);
                        mktVarI1.k.d(false);
                        mktVarI1.f.d(new vls((byte) 24));
                        break;
                }
                return Unit.f46060a;
            }
        });
        qcc.X(this, new dkt(this, (byte) 2));
        ccq0.V(this, "LOCATION_SETTINGS_RESULT", new dkt(this, (byte) 0));
        ccq0.T(this, "LOCATION_SETTINGS_RESULT", new dkt(this, (byte) 1));
    }
}
