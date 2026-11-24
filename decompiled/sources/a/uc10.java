package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/uc10;", "La/yx5;", "<init>", "()V", "a/wsz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uc10 extends yx5 {
    public fiu0 K1;
    public ii L1;
    public wdk0 M1;
    public vby N1;
    public final s0r O1;
    public final yzn0 P1;
    public final a8z Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(uc10.class, "viewBinding", "getViewBinding()Lorg/xplatform/lotto/impl/databinding/LottoFragmentBinding;", 0), new ez40(uc10.class, "navigationSource", "getNavigationSource()Lorg/xplatform/lotto/api/navigation/LottoNavigationSource;", 0)};
    public static final wsz R1 = new wsz();

    public uc10() {
        super(R.layout.lotto_fragment);
        this.O1 = ltt0.o(this, tc10.f33697a);
        this.P1 = new yzn0("NAVIGATION_SOURCE_KEY");
        this.Q1 = xbc.b0(this, sre0.f32672a.b(be10.class), new sc10(this, (byte) 0));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        ccq0.V(this, "ERROR_DIALOG_KEY", new sc10(this, (byte) 1));
        Object objN = this.O1.n(S1[0], this);
        objN.getClass();
        h97.t(((vc10) objN).b, new owp0(this), new ugd(336871591, true, new g2z(this, (byte) 21)));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(wc10.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            wc10 wc10Var = (wc10) (ze3Var instanceof wc10 ? ze3Var : null);
            if (wc10Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                fd10 fd10Var = (fd10) this.P1.n(this, S1[1]);
                i1w0VarF.getClass();
                cad cadVar = wc10Var.f38904a;
                duj dujVar = wc10Var.c;
                ntu ntuVar = wc10Var.d;
                wsf0 wsf0Var = wc10Var.b;
                btt0 btt0Var = wc10Var.e;
                knf0 knf0Var = wc10Var.f;
                gii0 gii0Var = wc10Var.g;
                fsd fsdVar = wc10Var.h;
                a6u a6uVar = wc10Var.i;
                m1e m1eVar = wc10Var.j;
                ctf0 ctf0Var = wc10Var.k;
                b3c0 b3c0Var = wc10Var.l;
                ii iiVar = wc10Var.m;
                wdk0 wdk0Var = wc10Var.n;
                v88 v88Var = wc10Var.o;
                j1q0 j1q0Var = wc10Var.p;
                ocl oclVar = wc10Var.q;
                vby vbyVar = wc10Var.r;
                btt0Var.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                fsdVar.getClass();
                m1eVar.getClass();
                ctf0Var.getClass();
                b3c0Var.getClass();
                iiVar.getClass();
                wdk0Var.getClass();
                j1q0Var.getClass();
                vbyVar.getClass();
                this.K1 = new fiu0(Collections.singletonMap(be10.class, (tii) new cr(cadVar, wsf0Var, i1w0VarF, dujVar, ntuVar, btt0Var, knf0Var, gii0Var, a6uVar, m1eVar, ctf0Var, iiVar, wdk0Var, v88Var, j1q0Var, oclVar, vbyVar, fd10Var).r));
                this.L1 = iiVar;
                this.M1 = wdk0Var;
                this.N1 = vbyVar;
                return;
            }
        }
        jf4.n(b1j.i(wc10.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        k3t0 k3t0VarG0 = G0();
        svz svzVar = new svz(1, this, uc10.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/lotto/impl/presentation/models/LottoSideEffect;)V", 0, (byte) 26);
        lkz lkzVar = lkz.f20223a;
        gmq gmqVarC = ((i3t0) k3t0VarG0).C();
        lkz lkzVar2 = lkz.f20223a;
        e000 e000Var = new e000(2, svzVar, knx.class, "suspendConversion0", "suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, (byte) 6);
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zd00((i89) gmqVarC, clzVarW, e000Var, (yje) null, 0), 3);
    }

    public final k3t0 G0() {
        return (k3t0) this.Q1.getValue();
    }

    public final void H0(sd10 sd10Var) {
        if (sd10Var instanceof rd10) {
            String str = ((rd10) sd10Var).f30269a;
            wdk0 wdk0Var = this.M1;
            if (wdk0Var == null) {
                Intrinsics.h("snackbarManager");
                throw null;
            }
            wdk0.k(wdk0Var, new xdk0(rek0.b, str, null, null, null, null, 124), this, null, null, false, null, 1020);
        } else if (sd10Var instanceof qd10) {
            qd10 qd10Var = (qd10) sd10Var;
            String str2 = qd10Var.f28512a;
            String str3 = qd10Var.b;
            ii iiVar = this.L1;
            if (iiVar == null) {
                Intrinsics.h("actionDialogManager");
                throw null;
            }
            String strH = H(R.string.ok_new);
            strH.getClass();
            DialogFields dialogFields = new DialogFields((CharSequence) str2, (CharSequence) str3, (CharSequence) strH, (String) null, (String) null, "ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
            androidx.fragment.app.e eVarC = C();
            eVarC.getClass();
            iiVar.d(dialogFields, eVarC);
        }
        G0().x(dc10.f5829a);
    }
}
