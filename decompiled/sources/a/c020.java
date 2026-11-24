package a;

import android.content.ComponentCallbacks2;
import android.content.res.ColorStateList;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/c020;", "La/yx5;", "<init>", "()V", "a/wsz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c020 extends yx5 {
    public final hnm0 K1;
    public final n0o0 L1;
    public final n0o0 M1;
    public fiu0 N1;
    public poq0 O1;
    public wdk0 P1;
    public ii Q1;
    public final kiu0 R1;
    public final s0r S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(c020.class, "binding", "getBinding()Lorg/xplatform/settings/impl/databinding/FragmentOfficeNewFaceliftBinding;", 0)};
    public static final wsz U1 = new wsz();

    public c020() {
        super(R.layout.fragment_office_new_facelift);
        this.K1 = hnm0.f13359a;
        this.L1 = maz.b(new a020(this, (byte) 1));
        this.M1 = maz.b(new a020(this, (byte) 2));
        a020 a020Var = new a020(this, (byte) 3);
        a8z a8zVarA = maz.a(wez.b, new pv10(new pv10(this, (byte) 4), (byte) 5));
        this.R1 = agc.G(this, sre0.f32672a.b(l020.class), new j210(a8zVarA, (byte) 24), new j210(a8zVarA, (byte) 25), a020Var);
        this.S1 = ltt0.o(this, b020.f1749a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        int i;
        l020 l020VarI0 = I0();
        sac.V(jiu0.a(l020VarI0), new h020(l020VarI0, (byte) 0), null, l020VarI0.h.f22085a, new i020(l020VarI0, null, (byte) 0), 10);
        if (C().I(H0().c.getId()) == null) {
            Bundle bundle2 = this.g;
            if (bundle2 != null) {
                i = bundle2.getInt("SETTINGS_EVENT_KEY", 0);
            } else {
                d6j0 d6j0Var = d6j0.f5551a;
                i = 0;
            }
            androidx.fragment.app.e eVarC = C();
            eVarC.getClass();
            zb5 zb5Var = new zb5(eVarC);
            zb5Var.p = true;
            int id = H0().c.getId();
            zie0 zie0Var = t1j0.Y1;
            d6j0 d6j0Var2 = (d6j0) d6j0.g.get(i);
            zie0Var.getClass();
            d6j0Var2.getClass();
            t1j0 t1j0Var = new t1j0();
            t1j0Var.s0(i120.V(new Pair("KEY_SETTINGS_EVENT", Integer.valueOf(d6j0Var2.ordinal()))));
            zb5Var.k(id, t1j0Var, null, 1);
            zb5Var.f();
        }
        mc50.a(H0().b, new a020(this, (byte) 0));
        ccq0.V(this, "REQUEST_APP_INFO_DIALOG_KEY", new a020(this, (byte) 4));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(sz10.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            sz10 sz10Var = (sz10) (ze3Var instanceof sz10 ? ze3Var : null);
            if (sz10Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = sz10Var.d;
                poq0 poq0Var = sz10Var.f33049a;
                m1e m1eVar = sz10Var.b;
                jh70 jh70Var = sz10Var.c;
                duj dujVar = sz10Var.e;
                gst0 gst0Var = sz10Var.f;
                btt0 btt0Var = sz10Var.g;
                pru pruVar = sz10Var.h;
                q7d0 q7d0Var = sz10Var.i;
                e1u e1uVar = sz10Var.j;
                wdk0 wdk0Var = sz10Var.k;
                v1j0 v1j0Var = sz10Var.l;
                qho qhoVar = sz10Var.m;
                d1p d1pVar = sz10Var.n;
                kt2 kt2Var = sz10Var.o;
                s31 s31Var = sz10Var.p;
                ieu ieuVar = sz10Var.q;
                dzt dztVar = sz10Var.r;
                ctf0 ctf0Var = sz10Var.s;
                ii iiVar = sz10Var.t;
                peg0 peg0Var = sz10Var.u;
                d1pVar.getClass();
                m1eVar.getClass();
                gst0Var.getClass();
                btt0Var.getClass();
                q7d0Var.getClass();
                wdk0Var.getClass();
                v1j0Var.getClass();
                kt2Var.getClass();
                ctf0Var.getClass();
                iiVar.getClass();
                this.N1 = new fiu0(Collections.singletonMap(l020.class, (gji) new f6i(cadVar, d1pVar, poq0Var, jh70Var, dujVar, gst0Var, pruVar, q7d0Var, i1w0VarF, e1uVar, wdk0Var, v1j0Var, qhoVar, kt2Var, s31Var, ieuVar, dztVar, ctf0Var, iiVar, peg0Var).u));
                this.O1 = poq0Var;
                this.P1 = wdk0Var;
                this.Q1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(sz10.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        a1t a1tVar = new a1t(I0().s, (byte) 25);
        dm10 dm10Var = new dm10(2, this, c020.class, "handleUiState", "handleUiState(Lorg/xplatform/settings/impl/presentation/models/MainSettingsUiState;)V", 4, (byte) 23);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new cm10(a1tVar, clzVarW, dm10Var, (yje) null), 3);
        p7m0 p7m0Var = I0().t;
        dm10 dm10Var2 = new dm10(2, this, c020.class, "handleEvent", "handleEvent(Lorg/xplatform/settings/impl/presentation/models/MainSettingsEvent;)V", 4, (byte) 24);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new cm10((gmq) p7m0Var, clzVarW2, dm10Var2, (yje) null, (short) 0), 3);
    }

    public final void G0(Integer num) {
        ArrayList<hc50> arrayListE;
        H0().b.c.b();
        n0o0 n0o0Var = this.M1;
        if (num != null) {
            hc50 hc50Var = (hc50) n0o0Var.getValue();
            hc50 hc50Var2 = (hc50) this.L1.getValue();
            int iIntValue = num.intValue();
            String str = hc50Var2.f12804a;
            ybg0 ybg0Var = hc50Var2.b;
            Function0 function0 = hc50Var2.d;
            boolean z = hc50Var2.e;
            boolean z2 = hc50Var2.f;
            vf5 vf5Var = hc50Var2.g;
            Integer num2 = hc50Var2.h;
            r0m r0mVar = hc50Var2.i;
            i8m0 i8m0Var = hc50Var2.j;
            boolean z3 = hc50Var2.k;
            str.getClass();
            ybg0Var.getClass();
            function0.getClass();
            arrayListE = q3d.e(hc50Var, new hc50(str, ybg0Var, iIntValue, function0, z, z2, vf5Var, num2, r0mVar, i8m0Var, z3));
        } else {
            arrayListE = q3d.e((hc50) n0o0Var.getValue());
        }
        H0().b.setNavigationBarButtons(arrayListE);
        H0().b.setNavigationBarButtonsColorStateList(ColorStateList.valueOf(m5d.b(R.attr.uikitSecondary, o0())));
    }

    public final g2r H0() {
        Object objN = this.S1.n(V1[0], this);
        objN.getClass();
        return (g2r) objN;
    }

    public final l020 I0() {
        return (l020) this.R1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        l020 l020VarI0 = I0();
        p7m0 p7m0Var = l020VarI0.t;
        if (l020VarI0.c.f27342a.d().r(fk60.OFFICE)) {
            p7m0Var.getClass();
            p7m0Var.o(null, xz10.f41733a);
            return;
        }
        phf0 phf0Var = l020VarI0.f;
        if (((rrc) ((e1u) phf0Var.c).b).H() <= 27) {
            q7d0 q7d0Var = ((y6j0) ((peg0) phf0Var.f26994a).b).f42100a;
            q7d0Var.getClass();
            long jCurrentTimeMillis = q7d0Var.a().getLong("SETTINGS_UPDATE_OS_SNACK_DATE", 0L);
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            if (jCurrentTimeMillis > System.currentTimeMillis() || !((pru) phf0Var.b).a().q0) {
                return;
            }
            p7m0Var.getClass();
            p7m0Var.o(null, yz10.f43495a);
            y6j0 y6j0Var = (y6j0) l020VarI0.e.f6468a;
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(jCurrentTimeMillis2);
            calendar.add(6, 1);
            y6j0Var.f42100a.f("SETTINGS_UPDATE_OS_SNACK_DATE", calendar.getTimeInMillis());
        }
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
