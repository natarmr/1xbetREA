package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.security.api.presentation.models.TokenRestoreData;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/nd;", "La/yx5;", "<init>", "()V", "a/jdk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class nd extends yx5 {
    public yfi K1;
    public ii L1;
    public final kiu0 M1;
    public final s0r N1;
    public final khf0 O1;
    public final cu P1;
    public final yzn0 Q1;
    public final n0o0 R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(nd.class, "viewBinding", "getViewBinding()Lorg/xplatform/security/impl/databinding/FragmentAccountChoiceBinding;", 0), new ez40(nd.class, "tokenRestoreData", "getTokenRestoreData()Lorg/xplatform/security/api/presentation/models/TokenRestoreData;", 0), new ez40(nd.class, "accounts", "getAccounts()[J", 0), new ez40(nd.class, "navigation", "getNavigation()Lorg/xplatform/onexuser/presentation/NavigationEnum;", 0)};
    public static final jdk0 S1 = new jdk0();

    public nd() {
        super(R.layout.fragment_account_choice);
        ld ldVar = new ld(this, (byte) 3);
        a8z a8zVarA = maz.a(wez.b, new o5(new o5(this, (byte) 15), (byte) 16));
        this.M1 = agc.G(this, sre0.f32672a.b(qd.class), new k8(a8zVarA, (byte) 8), new k8(a8zVarA, (byte) 9), ldVar);
        this.N1 = ltt0.o(this, md.f21571a);
        this.O1 = new khf0("TOKEN");
        this.P1 = new cu("ACCOUNTS");
        this.Q1 = new yzn0("NAVIGATION");
        this.R1 = maz.b(new ld(this, (byte) 4));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().d.setLayoutManager(new LinearLayoutManager(G0().d.getContext()));
        G0().d.setAdapter((kd) this.R1.getValue());
        RecyclerView recyclerView = G0().d;
        TypedValue typedValue = j5d.f15927a;
        recyclerView.m(new lrh0(G().getDimensionPixelSize(R.dimen.corner_radius_16), j5d.a(o0(), R.attr.uikitBackgroundContent, false), G().getDimensionPixelSize(R.dimen.space_4), 0));
        qcc.X(this, new ld(this, (byte) 0));
        G0().c.b(new ld(this, (byte) 1));
        DsBottomBar.u(G0().b, new ld(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(ntn.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            ntn ntnVar = (ntn) (ze3Var instanceof ntn ? ze3Var : null);
            if (ntnVar != null) {
                iiy[] iiyVarArr = U1;
                otn otnVar = new otn((TokenRestoreData) this.O1.n(this, iiyVarArr[1]), tx3.f0(this.P1.n(this, iiyVarArr[2])));
                cad cadVar = ntnVar.f24109a;
                lef0 lef0Var = ntnVar.b;
                qgd qgdVar = ntnVar.c;
                onv onvVar = ntnVar.d;
                ii iiVar = ntnVar.g;
                d190 d190Var = ntnVar.e;
                gii0 gii0Var = ntnVar.f;
                ctf0 ctf0Var = ntnVar.h;
                m1e m1eVar = ntnVar.i;
                zn00 zn00Var = ntnVar.j;
                iiVar.getClass();
                d190Var.getClass();
                gii0Var.getClass();
                ctf0Var.getClass();
                m1eVar.getClass();
                this.K1 = (yfi) ((n5d0) new rrd(onvVar, lef0Var, cadVar, iiVar, otnVar, qgdVar, ctf0Var, m1eVar, zn00Var).i).get();
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(ntn.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.M1;
        p7m0 p7m0Var = ((qd) kiu0Var.getValue()).i;
        yje yjeVar = null;
        byte b = 1;
        pa paVar = new pa(this, yjeVar, b);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new m1(p7m0Var, clzVarW, paVar, (yje) null), 3);
        p7m0 p7m0Var2 = ((qd) kiu0Var.getValue()).j;
        qa qaVar = new qa(this, yjeVar, b);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new m1(p7m0Var2, clzVarW2, qaVar, (yje) null), 3);
    }

    public final gxq G0() {
        Object objN = this.N1.n(U1[0], this);
        objN.getClass();
        return (gxq) objN;
    }

    public final void H0() {
        ii iiVar = this.L1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        String strH = H(R.string.warning);
        String strH2 = H(R.string.close_the_activation_process_new);
        String strH3 = H(R.string.interrupt);
        strH3.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, H(R.string.cancel), (String) null, "REQUEST_BACK_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_BACK_DIALOG_KEY", new ld(this, (byte) 5));
    }
}
