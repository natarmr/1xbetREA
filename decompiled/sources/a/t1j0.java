package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/t1j0;", "La/yx5;", "<init>", "()V", "a/zie0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class t1j0 extends yx5 {
    public rqj0 K1;
    public ii L1;
    public gl5 M1;
    public ux00 N1;
    public nwd O1;
    public wdk0 P1;
    public fiu0 Q1;
    public final kiu0 R1;
    public final s0r S1;
    public qgd U1;
    public xi70 V1;
    public zav W1;
    public final n0o0 X1;
    public static final /* synthetic */ iiy[] Z1 = {new j0d0(t1j0.class, "binding", "getBinding()Lorg/xplatform/settings/impl/databinding/FragmentSettingsBinding;", 0)};
    public static final zie0 Y1 = new zie0();

    public t1j0() {
        super(R.layout.fragment_settings);
        r1j0 r1j0Var = new r1j0(this, (byte) 7);
        a8z a8zVarA = maz.a(wez.b, new l9i0(new l9i0(this, (byte) 10), (byte) 11));
        this.R1 = agc.G(this, sre0.f32672a.b(org.xplatform.settings.impl.presentation.a.class), new s9i0(a8zVarA, (byte) 8), new s9i0(a8zVarA, (byte) 9), r1j0Var);
        this.S1 = ltt0.o(this, s1j0.f31459a);
        this.X1 = maz.b(new r1j0(this, (byte) 8));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        int i;
        H0().c.setItemAnimator(null);
        H0().c.setAdapter((dzi0) this.X1.getValue());
        byte b = 2;
        H0().c.m(new qkv(b));
        byte b2 = 0;
        knm0.i(H0().c, false);
        ccq0.V(this, "REQUEST_OPEN_SITE_DIALOG_KEY", new r1j0(this, (byte) 9));
        sj3.s0(this, "DEV_PASS_REQUEST_KEY", new q1j0(this, b2));
        byte b3 = 1;
        ccq0.V(this, "REQUEST_SHOW_PAYOUT_ERROR_DIALOG_KEY", new r1j0(this, b3));
        ccq0.V(this, "REQUEST_SHOW_PHONE_BINDING_DIALOG_KEY", new r1j0(this, b));
        byte b4 = 3;
        ccq0.T(this, "REQUEST_SHOW_PHONE_BINDING_DIALOG_KEY", new r1j0(this, b4));
        ccq0.T(this, "REQUEST_DELETE_ACCOUNT", new r1j0(this, (byte) 4));
        ccq0.V(this, "REQUEST_SHOW_BONUSES", new r1j0(this, (byte) 5));
        ccq0.T(this, "REQUEST_SHOW_BONUSES", new r1j0(this, (byte) 6));
        if (this.M1 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new r1j0(this, b2), new q1j0(this, b3));
        C().u0("REQUEST_QUICKBET_KEY", this, new p1j0(this, b3));
        n0().r().u0("REQUEST_SHOW_LOGOUT_DIALOG", this, new p1j0(this, b4));
        Bundle bundle2 = this.g;
        if (bundle2 != null) {
            i = bundle2.getInt("KEY_SETTINGS_EVENT", 0);
        } else {
            d6j0 d6j0Var = d6j0.f5551a;
            i = 0;
        }
        Bundle bundle3 = this.g;
        if (bundle3 != null) {
            bundle3.clear();
        }
        org.xplatform.settings.impl.presentation.a aVarI0 = I0();
        d6j0 d6j0Var2 = (d6j0) d6j0.g.get(i);
        d6j0Var2.getClass();
        int iOrdinal = d6j0Var2.ordinal();
        if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                org.xplatform.settings.impl.presentation.a.D(aVarI0);
                return;
            } else if (iOrdinal == 3) {
                aVarI0.E(false);
                return;
            } else {
                if (iOrdinal != 4) {
                    return;
                }
                aVarI0.F();
                return;
            }
        }
        aVarI0.d.s();
        aVarI0.A.e("language");
        i1w0 i1w0Var = aVarI0.k;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        jgc jgcVar = jgc.INSTANCE;
        kej0 kej0Var = new kej0(aVarI0, (byte) 8);
        jgcVar.getClass();
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, new c1w0(jgcVar, new onu0(jgcVar, kej0Var, (byte) 11))), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(j0j0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            j0j0 j0j0Var = (j0j0) (ze3Var instanceof j0j0 ? ze3Var : null);
            if (j0j0Var != null) {
                uti utiVarA = j0j0Var.a(a4n0.f(this), t1j0.class.getSimpleName());
                this.K1 = utiVarA.f36255a;
                this.L1 = utiVarA.b;
                this.M1 = new gl5((byte) 17);
                this.N1 = new ux00();
                this.O1 = utiVarA.c;
                this.P1 = utiVarA.d;
                this.Q1 = utiVarA.a();
                this.U1 = utiVarA.i;
                this.V1 = utiVarA.Z.f();
                zav zavVarF = ((vqc) utiVarA.v0.f25390a).f();
                x1x.x(zavVarF);
                this.W1 = zavVarF;
                return;
            }
        }
        jf4.n(b1j.i(j0j0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = I0().W0;
        yje yjeVar = null;
        bai0 bai0Var = new bai0(this, yjeVar, (byte) 10);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r7i0(ol60Var, clzVarW, bai0Var, (yje) null), 3);
        RecyclerView recyclerView = H0().c;
        org.xplatform.settings.impl.presentation.a aVarI0 = I0();
        fnq fnqVar = new fnq(new omi0(aVarI0.X0, aVarI0, (byte) 1), new xej0(aVarI0, yjeVar, (byte) 0));
        lkz lkzVar2 = lkz.f20223a;
        qkb0 qkb0Var = new qkb0((Object) this, (Object) recyclerView, yjeVar, (byte) 17);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new r7i0(fnqVar, clzVarW2, qkb0Var, (yje) null), 3);
    }

    public final ii G0() {
        ii iiVar = this.L1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final s4r H0() {
        Object objN = this.S1.n(Z1[0], this);
        objN.getClass();
        return (s4r) objN;
    }

    public final org.xplatform.settings.impl.presentation.a I0() {
        return (org.xplatform.settings.impl.presentation.a) this.R1.getValue();
    }

    public final void J0(String str, String str2) {
        ii iiVarG0 = G0();
        String strH = H(R.string.ok_new);
        strH.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) str, (CharSequence) str2, (CharSequence) strH, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVarG0.d(dialogFields, eVarC);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        byte b = 2;
        n0().r().u0("SETTINGS_QR_SCANNER_REQUEST_KEY", this, new p1j0(this, b));
        n0().r().u0("OTP_CONFIRMATION_RESULT_KEY", this, new p1j0(this, (byte) 0));
        vdb.j0(this, "REQUEST_CONFIRMATION_NEW_PLACE_KEY", new q1j0(this, b));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        n0().r().g("SETTINGS_QR_SCANNER_REQUEST_KEY");
        this.j1 = true;
    }
}
