package org.xplatform.personal.impl.presentation.edit;

import a.a0c0;
import a.a8z;
import a.aac;
import a.agc;
import a.b0c0;
import a.b3r;
import a.bdx;
import a.c0c0;
import a.ccq0;
import a.clz;
import a.cz60;
import a.e2c0;
import a.e9b0;
import a.f8b0;
import a.f9o0;
import a.fl70;
import a.g0c0;
import a.g8b0;
import a.gl5;
import a.gmq;
import a.ha30;
import a.hnm0;
import a.hxm0;
import a.ii;
import a.iiy;
import a.j0d0;
import a.j5d;
import a.j9o0;
import a.jh70;
import a.jnm0;
import a.kiu0;
import a.lkz;
import a.ltt0;
import a.maz;
import a.mpi;
import a.n0o0;
import a.ol60;
import a.p6b0;
import a.qcc;
import a.qjj;
import a.qmk0;
import a.rmk0;
import a.s0r;
import a.s6n0;
import a.sa10;
import a.sj3;
import a.sre0;
import a.tre0;
import a.uvw;
import a.vtb;
import a.vvw;
import a.vzb0;
import a.wdk0;
import a.wez;
import a.wyb0;
import a.x0x;
import a.x6b0;
import a.xae0;
import a.y3b0;
import a.yje;
import a.yx5;
import a.zzb0;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lorg/xplatform/personal/impl/presentation/edit/a;", "La/yx5;", "<init>", "()V", "a/fl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class a extends yx5 {
    public final f9o0 K1;
    public final hnm0 L1;
    public sa10 M1;
    public gl5 N1;
    public ii O1;
    public jh70 P1;
    public wdk0 Q1;
    public final n0o0 R1;
    public final kiu0 S1;
    public final s0r U1;
    public y3b0 V1;
    public final a8z W1;
    public static final /* synthetic */ iiy[] Y1 = {new j0d0(a.class, "binding", "getBinding()Lorg/xplatform/personal/impl/databinding/FragmentProfileEditRecyclerBinding;", 0)};
    public static final fl70 X1 = new fl70();

    public a() {
        super(R.layout.fragment_profile_edit_recycler);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.L1 = hnm0.f13359a;
        this.R1 = maz.b(new zzb0(this, (byte) 0));
        zzb0 zzb0Var = new zzb0(this, (byte) 1);
        c0c0 c0c0Var = new c0c0(this, (byte) 0);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new g8b0(c0c0Var, (byte) 5));
        tre0 tre0Var = sre0.f32672a;
        this.S1 = agc.G(this, tre0Var.b(n.class), new x6b0(a8zVarA, (byte) 6), new x6b0(a8zVarA, (byte) 7), zzb0Var);
        a8z a8zVarA2 = maz.a(wezVar, new g8b0(new c0c0(this, (byte) 1), (byte) 6));
        agc.G(this, tre0Var.b(g0c0.class), new x6b0(a8zVarA2, (byte) 8), new x6b0(a8zVarA2, (byte) 9), new ha30(this, a8zVarA2, (byte) 24));
        this.U1 = ltt0.o(this, a0c0.f20a);
        this.W1 = maz.a(wezVar, new zzb0(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) throws Exception {
        G0().d.b(new zzb0(this, (byte) 4));
        Class<n> cls = n.class;
        qcc.X(this, new cz60(0, H0(), n.class, "onBackPressed", "onBackPressed()V", 0, (byte) 29));
        G0().f.setAnimation(null);
        bdx.j0(G0().f);
        byte b = 3;
        vvw.o(G0().f, false, 3);
        G0().f.setAdapter((vzb0) this.W1.getValue());
        int dimensionPixelSize = G().getDimensionPixelSize(R.dimen.space_4);
        int dimensionPixelSize2 = G().getDimensionPixelSize(R.dimen.space_12);
        int dimensionPixelSize3 = G().getDimensionPixelSize(R.dimen.space_16);
        int dimensionPixelSize4 = G().getDimensionPixelSize(R.dimen.space_24);
        int dimensionPixelSize5 = G().getDimensionPixelSize(R.dimen.space_32);
        int dimensionPixelSize6 = G().getDimensionPixelSize(R.dimen.space_40);
        float dimensionPixelSize7 = G().getDimensionPixelSize(R.dimen.corner_radius_16);
        TypedValue typedValue = j5d.f15927a;
        y3b0 y3b0Var = new y3b0(j5d.a(o0(), R.attr.uikitBackgroundContent, false), dimensionPixelSize7, dimensionPixelSize3, dimensionPixelSize3, dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize3, new wyb0((byte) 1), new wyb0((byte) 2));
        G0().f.m(y3b0Var);
        this.V1 = y3b0Var;
        G0().f.m(new qmk0(dimensionPixelSize6, dimensionPixelSize5, dimensionPixelSize4, dimensionPixelSize5, 0, 1, new wyb0((byte) 3), rmk0.d, 272));
        if (this.N1 == null) {
            Intrinsics.h("captchaDialogDelegate");
            throw null;
        }
        gl5.k(this, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", new cz60(0, H0(), n.class, "onCaptchaCancelled", "onCaptchaCancelled()V", 0, (byte) 28), new e9b0(1, H0(), cls, "onCaptchaConfirmed", "onCaptchaConfirmed(Lorg/xplatform/captcha/api/domain/model/UserActionCaptcha;)V", 0, (byte) 17));
        DsBottomBar.u(G0().b, new zzb0(this, b));
        uvw.R(G0().b, this, G0().f);
    }

    @Override // a.yx5
    public final void C0() {
        mpi mpiVar = (mpi) this.R1.getValue();
        this.M1 = mpiVar.w;
        this.N1 = mpiVar.u;
        this.O1 = mpiVar.v;
        this.P1 = mpiVar.x;
        this.Q1 = mpiVar.y;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        n nVarH0 = H0();
        s6n0 s6n0Var = new s6n0(nVarH0.p, new e2c0(nVarH0, null, (byte) 1));
        Class<a> cls = a.class;
        p6b0 p6b0Var = new p6b0(2, this, cls, "handleUiState", "handleUiState(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiState;)V", 4, (byte) 19);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new f8b0(s6n0Var, clzVarW, p6b0Var, (yje) null), 3);
        ol60 ol60Var = H0().q;
        int i = 4;
        int i2 = 2;
        p6b0 p6b0Var2 = new p6b0(i2, this, cls, "handleUiAction", "handleUiAction(Lorg/xplatform/personal/impl/presentation/edit/ProfileEditViewModel$UiAction;)V", i, (byte) 20);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new f8b0((gmq) ol60Var, clzVarW2, p6b0Var2, (yje) null, (char) 0), 3);
        ol60 ol60Var2 = H0().c.d;
        p6b0 p6b0Var3 = new p6b0(i2, this, cls, "handleOnClickedUiAction", "handleOnClickedUiAction(Lorg/xplatform/personal/impl/presentation/edit/delegates/click/OnClickUiAction;)V", i, (byte) 21);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new f8b0(ol60Var2, clzVarW3, p6b0Var3, (yje) null, 0), 3);
        ol60 ol60Var3 = (ol60) H0().d.g;
        p6b0 p6b0Var4 = new p6b0(i2, this, cls, "showCaptcha", "showCaptcha(Lorg/xplatform/captcha/api/domain/model/CaptchaResult$UserActionRequired;)V", i, (byte) 22);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new f8b0((gmq) ol60Var3, clzVarW4, p6b0Var4, (yje) null, (short) 0), 3);
        xae0 xae0VarN = vtb.N(H0().s);
        p6b0 p6b0Var5 = new p6b0(i2, this, cls, "handleButtonSaveState", "handleButtonSaveState(Z)V", i, (byte) 23);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new f8b0(xae0VarN, clzVarW5, p6b0Var5, (yje) null), 3);
    }

    public final b3r G0() {
        Object objN = this.U1.n(Y1[0], this);
        objN.getClass();
        return (b3r) objN;
    }

    public final n H0() {
        return (n) this.S1.getValue();
    }

    public final void I0(boolean z) {
        G0().e.setVisibility(z ? 0 : 8);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        Class<n> cls = n.class;
        ccq0.V(this, "REQUEST_CHANGES_LOST_DIALOG_KEY", new b0c0(0, H0(), n.class, "onExitClicked", "onExitClicked()V", 0, (byte) 0));
        int i = 0;
        ccq0.V(this, "REQUEST_CHANGES_SUCCESS_DIALOG_KEY", new b0c0(0, H0(), n.class, "onExitClicked", "onExitClicked()V", 0, (byte) 1));
        int i2 = 1;
        sj3.s0(this, "COUNTRIES_DIALOG_KEY", new e9b0(i2, H0(), cls, "onCountrySelected", "onCountrySelected(Lorg/xplatform/onexuser/domain/entity/geo/GeoCountry;)V", i, (byte) 18));
        sj3.s0(this, "LOCATION_CHOICE_ITEM_KEY", new e9b0(i2, H0(), cls, "onLocationSelected", "onLocationSelected(Lorg/xplatform/onexuser/domain/registration/RegistrationChoice;)V", i, (byte) 19));
        sj3.t0(this, "DOCUMENT_CHOICE_ITEM_KEY", new e9b0(i2, H0(), cls, "onDocumentSelected", "onDocumentSelected(Lorg/xplatform/personal/impl/presentation/documentchoice/models/PersonalDocumentUiModel;)V", i, (byte) 20));
    }

    @Override // androidx.fragment.app.Fragment
    public final void Y() {
        this.V1 = null;
        this.j1 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        View view = this.l1;
        if (view != null) {
            hxm0.m(view);
        }
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        View view = this.l1;
        if (view != null) {
            hxm0.n(view);
        }
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.L1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
