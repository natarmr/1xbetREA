package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/xph0;", "La/yx5;", "<init>", "()V", "a/lme0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xph0 extends yx5 {
    public final hnm0 K1;
    public final yzn0 L1;
    public fiu0 M1;
    public hfk0 N1;
    public final a8z O1;
    public final s0r P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(xph0.class, "selectedTabBundle", "getSelectedTabBundle()Lorg/xplatform/security/api/navigation/SecurityGiftsScreenParams;", 0), new j0d0(xph0.class, "binding", "getBinding()Lorg/xplatform/security/impl/databinding/SecurityGiftsContainerFragemntBinding;", 0)};
    public static final lme0 Q1 = new lme0((byte) 15);

    public xph0() {
        super(R.layout.security_gifts_container_fragemnt);
        this.K1 = hnm0.f13359a;
        this.L1 = new yzn0("SELECTED_TAB_BUNDLE");
        this.O1 = xbc.b0(this, sre0.f32672a.b(goh0.class), new tph0(this, (byte) 0));
        this.P1 = ltt0.o(this, wph0.f39546a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        iiy[] iiyVarArr = R1;
        iiy iiyVar = iiyVarArr[1];
        s0r s0rVar = this.P1;
        Object objN = s0rVar.n(iiyVar, this);
        objN.getClass();
        ((mqh0) objN).b.b(new tph0(this, (byte) 1));
        Object objN2 = s0rVar.n(iiyVarArr[1], this);
        objN2.getClass();
        pkd.i(((mqh0) objN2).c, null, new ugd(34154869, true, new uph0(this, (byte) 0)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(doh0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            doh0 doh0Var = (doh0) (ze3Var instanceof doh0 ? ze3Var : null);
            if (doh0Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                nqh0 nqh0Var = (nqh0) this.L1.n(this, R1[0]);
                i1w0VarF.getClass();
                iw20 iw20Var = doh0Var.f6416a;
                cad cadVar = doh0Var.b;
                ctf0 ctf0Var = doh0Var.c;
                hfk0 hfk0Var = doh0Var.d;
                ctf0Var.getClass();
                this.M1 = new fiu0(Collections.singletonMap(goh0.class, (fri) new uii(cadVar, iw20Var, i1w0VarF, ctf0Var, hfk0Var, nqh0Var).f));
                this.N1 = hfk0Var;
                return;
            }
        }
        jf4.n(b1j.i(doh0.class, "Cannot create dependency "));
    }

    public final void G0(mm40 mm40Var, oqh0 oqh0Var, fet fetVar, int i) {
        int i2;
        oqh0 oqh0Var2;
        fet fetVar2;
        androidx.fragment.app.e eVar;
        fetVar.g0(-1542370020);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= fetVar.e(oqh0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= fetVar.i(this) ? 256 : 128;
        }
        if (fetVar.U(i2 & 1, (i2 & 147) != 146)) {
            View view = (View) fetVar.k(dy2.f);
            boolean zG = fetVar.g(view);
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (zG || objP == cl5Var) {
                objP = androidx.fragment.app.e.K(view);
                fetVar.o0(objP);
            }
            androidx.fragment.app.e eVar2 = (androidx.fragment.app.e) objP;
            eVar2.getClass();
            Object objP2 = fetVar.P();
            if (objP2 == cl5Var) {
                objP2 = vph0.f37806a;
                fetVar.o0(objP2);
            }
            y860.f((xdr) ((jhy) objP2), mm40Var, null, fetVar, ((i2 << 3) & 112) | 6, 4);
            fetVar2 = fetVar;
            boolean zI = fetVar2.i(eVar2) | ((i2 & 112) == 32) | fetVar2.i(this);
            Object objP3 = fetVar2.P();
            if (zI || objP3 == cl5Var) {
                eVar = eVar2;
                qkb0 qkb0Var = new qkb0(eVar, oqh0Var, this, null, (byte) 12);
                fetVar2.o0(qkb0Var);
                objP3 = qkb0Var;
            } else {
                eVar = eVar2;
            }
            oqh0Var2 = oqh0Var;
            m0x0.v(eVar, oqh0Var2, (Function2) objP3, fetVar2);
        } else {
            oqh0Var2 = oqh0Var;
            fetVar2 = fetVar;
            fetVar2.X();
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new wbg0((Object) this, mm40Var, (Object) oqh0Var2, i, (byte) 6);
        }
    }

    public final void H0(int i, fet fetVar, mm40 mm40Var, l7m0 l7m0Var, Function1 function1) {
        xph0 xph0Var;
        mm40 mm40Var2;
        fet fetVar2 = fetVar;
        fetVar2.g0(1917389756);
        int i2 = i | 6 | (fetVar2.g(l7m0Var) ? 32 : 16) | (fetVar2.i(function1) ? 256 : 128) | (fetVar2.i(this) ? 2048 : 1024);
        if (fetVar2.U(i2 & 1, (i2 & 1171) != 1170)) {
            n0q n0qVar = o7k0.c;
            zfn zfnVar = zaq0.b;
            long background = ((ThemeColors) fetVar2.k(zfnVar)).getBackground();
            ljc ljcVar = jd8.n;
            mm40 mm40VarE0 = o2e.e0(i120.Q(n0qVar, background, ljcVar), "SECURITY_SETTINGS_SCREEN_LAZY_COLUMN");
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar2, 0);
            int iHashCode = Long.hashCode(fetVar2.T);
            bh90 bh90VarM = fetVar2.m();
            mm40 mm40VarC0 = kbc.c0(fetVar2, mm40VarE0);
            mkd.c0.getClass();
            fetVar2.i0();
            boolean z = fetVar2.S;
            pcy pcyVar = e7z.u1;
            if (z) {
                fetVar2.l(pcyVar);
            } else {
                fetVar2.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar2, x5dVarA, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar2, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar2, numValueOf, shdVar3);
            jpm0.n(fetVar2);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar2, mm40VarC0, shdVar4);
            long backgroundContent = ((ThemeColors) fetVar2.k(zfnVar)).getBackgroundContent();
            jm40 jm40Var = jm40.b;
            mm40 mm40VarD = o7k0.d(i120.Q(jm40Var, backgroundContent, ljcVar), 1.0f);
            tj30 tj30VarC = zq8.c(gqw0.f11754a, false);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarD);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(pcyVar);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, tj30VarC, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            jpm0.o(fetVar, mm40VarC1, shdVar4);
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarK = s5x0.K(jm40Var, qmk.a(fetVar).d, 8.0f);
            a4x a4xVar = ((zph0) l7m0Var.getValue()).b;
            dxh0 dxh0Var = ((zph0) l7m0Var.getValue()).f44760a;
            boolean z2 = (i2 & 112) == 32;
            Object objP = fetVar.P();
            cl5 cl5Var = ukd.f35823a;
            if (z2 || objP == cl5Var) {
                objP = new f7f0(l7m0Var, (byte) 7);
                fetVar.o0(objP);
            }
            Function0 function0 = (Function0) objP;
            boolean z3 = (i2 & 896) == 256;
            Object objP2 = fetVar.P();
            if (z3 || objP2 == cl5Var) {
                objP2 = new abh0(function1, (byte) 4);
                fetVar.o0(objP2);
            }
            ibc.n(mm40VarK, a4xVar, gxh0.f12078a, dxh0Var, false, function0, (Function1) objP2, fetVar, 384, 16);
            fetVar2 = fetVar;
            fetVar2.r(true);
            mbc.o(zfi0.f44303a, o7k0.d(jm40Var, 1.0f), false, fetVar2, 54, 4);
            xph0Var = this;
            xph0Var.G0(n0qVar, ((zph0) l7m0Var.getValue()).c, fetVar2, ((i2 >> 3) & 896) | 6);
            fetVar2.r(true);
            mm40Var2 = jm40Var;
        } else {
            xph0Var = this;
            fetVar2.X();
            mm40Var2 = mm40Var;
        }
        yfe0 yfe0VarU = fetVar2.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new dfc0((Fragment) xph0Var, mm40Var2, (Object) l7m0Var, function1, i, (byte) 12);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        Fragment fragmentI = C().I(R.id.fragmentContainer);
        if (fragmentI != null) {
            androidx.fragment.app.e eVarC = C();
            eVarC.getClass();
            zb5 zb5Var = new zb5(eVarC);
            zb5Var.n(fragmentI);
            zb5Var.g(true, true);
        }
        super.Z();
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
