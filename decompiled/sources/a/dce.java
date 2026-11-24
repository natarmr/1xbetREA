package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;
import org.xplatform.rules.impl.util.ContactsWebView;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/dce;", "La/yx5;", "<init>", "()V", "a/kwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class dce extends yx5 {
    public final hnm0 K1;
    public fiu0 L1;
    public wdk0 M1;
    public final kiu0 N1;
    public final s0r O1;
    public final cgx0 P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(dce.class, "binding", "getBinding()Lorg/xplatform/rules/impl/databinding/FragmentContactsBinding;", 0), new ez40(dce.class, "showNavBarArg", "getShowNavBarArg()Z", 0)};
    public static final kwd Q1 = new kwd();

    public dce() {
        super(R.layout.fragment_contacts);
        this.K1 = hnm0.f13359a;
        zbe zbeVar = new zbe(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new svc(new svc(this, (byte) 24), (byte) 25));
        this.N1 = agc.G(this, sre0.f32672a.b(pce.class), new cce(a8zVarA, (byte) 0), new cce(a8zVarA, (byte) 1), zbeVar);
        this.O1 = ltt0.o(this, ace.f623a);
        this.P1 = new cgx0("SHOW_NAV_BAR");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        DsNavigationBarBasic dsNavigationBarBasic = G0().d;
        dsNavigationBarBasic.setTitle(dsNavigationBarBasic.getResources().getString(R.string.info_contact));
        dsNavigationBarBasic.b(new zbe(this, (byte) 2));
        ContactsWebView contactsWebView = G0().c;
        knm0.h(contactsWebView, this.P1.n(this, R1[1]).booleanValue());
        contactsWebView.setOnHyperlinkClick(new ejd(this, (byte) 12));
        contactsWebView.setOnHyperlinkOpenFailed(new zbe(this, (byte) 0));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ece.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ece eceVar = (ece) (ze3Var instanceof ece ? ze3Var : null);
            if (eceVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                duj dujVar = eceVar.f7563a;
                m1e m1eVar = eceVar.c;
                gg5 gg5Var = eceVar.b;
                cad cadVar = eceVar.d;
                sa10 sa10Var = eceVar.e;
                gii0 gii0Var = eceVar.f;
                ntu ntuVar = eceVar.g;
                knf0 knf0Var = eceVar.h;
                x0u x0uVar = eceVar.i;
                b3c0 b3c0Var = eceVar.k;
                iqt iqtVar = eceVar.j;
                wdk0 wdk0Var = eceVar.l;
                m1eVar.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                b3c0Var.getClass();
                wdk0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(pce.class, (uci) new qv2(cadVar, dujVar, m1eVar, gg5Var, i1w0VarF, sa10Var, gii0Var, ntuVar, knf0Var, x0uVar, b3c0Var, iqtVar, wdk0Var).n));
                this.M1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(ece.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.N1;
        i89 i89Var = new i89(((pce) kiu0Var.getValue()).k, (byte) 10);
        yje yjeVar = null;
        bce bceVar = new bce(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new cxd(i89Var, clzVarW, bceVar, (yje) null), 3);
        itb itbVarV = xkb.V(((pce) kiu0Var.getValue()).l);
        bce bceVar2 = new bce(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new cxd(itbVarV, clzVarW2, bceVar2, (yje) null), 3);
    }

    public final lzq G0() {
        Object objN = this.O1.n(R1[0], this);
        objN.getClass();
        return (lzq) objN;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0 */
    public final boolean getO1() {
        return this.P1.n(this, R1[1]).booleanValue();
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
