package a;

import android.content.ComponentCallbacks2;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Collections;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/aj90;", "La/yx5;", "<init>", "()V", "a/fl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class aj90 extends yx5 {
    public final hnm0 K1;
    public fiu0 L1;
    public ii M1;
    public jh70 N1;
    public String O1;
    public final kiu0 P1;
    public final s0r Q1;
    public final a8z R1;
    public static final /* synthetic */ iiy[] U1 = {new j0d0(aj90.class, "binding", "getBinding()Lorg/xplatform/personal/impl/databinding/FragmentPersonalDataBinding;", 0)};
    public static final fl70 S1 = new fl70();

    public aj90() {
        super(R.layout.fragment_personal_data);
        this.K1 = hnm0.f13359a;
        this.O1 = "";
        wi90 wi90Var = new wi90(this, (byte) 1);
        wz80 wz80Var = new wz80(this, (byte) 8);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new wz80(wz80Var, (byte) 9));
        this.P1 = agc.G(this, sre0.f32672a.b(kk90.class), new a190(a8zVarA, (byte) 8), new a190(a8zVarA, (byte) 9), wi90Var);
        this.Q1 = ltt0.o(this, xi90.f40934a);
        this.R1 = maz.a(wezVar, new wi90(this, (byte) 2));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().c.setTitle(H(R.string.personal_data));
        G0().c.b(new wi90(this, (byte) 0));
        G0().e.setLayoutManager(new LinearLayoutManager(D()));
        RecyclerView recyclerView = G0().e;
        Resources resources = o0().getResources();
        int i = R.dimen.space_12;
        recyclerView.m(new kq8(resources.getDimensionPixelSize(R.dimen.space_12), (byte) 0));
        Resources resources2 = o0().getResources();
        if (o0().getResources().getBoolean(R.bool.isTablet)) {
            i = R.dimen.space_36;
        }
        int dimensionPixelSize = resources2.getDimensionPixelSize(i);
        G0().e.m(new yrh(dimensionPixelSize, dimensionPixelSize, (byte) 2));
        knm0.i(G0().e, false);
        ccq0.V(this, "REQUEST_BIND_PHONE_DIALOG_KEY", new cz60(0, H0(), kk90.class, "onBindPhoneDialogBindClicked", "onBindPhoneDialogBindClicked()V", 0, (byte) 18));
        ccq0.T(this, "REQUEST_BIND_PHONE_DIALOG_KEY", new cz60(0, H0(), kk90.class, "onBindPhoneDialogCloseClicked", "onBindPhoneDialogCloseClicked()V", 0, (byte) 19));
        ccq0.V(this, "REQUEST_ACTIVATION_EMAIL_DIALOG_KEY", new cz60(0, H0(), kk90.class, "onEmailActionClicked", "onEmailActionClicked()V", 0, (byte) 20));
        ccq0.V(this, "REQUEST_ACTIVATION_PHONE_DIALOG_KEY", new cz60(0, H0(), kk90.class, "onPhoneActivationDialogClosed", "onPhoneActivationDialogClosed()V", 0, (byte) 21));
        ccq0.V(this, "REQUEST_CHANGE_EMAIL_DIALOG_KEY", new cz60(0, H0(), kk90.class, "onChangeEmailDialogOkClicked", "onChangeEmailDialogOkClicked()V", 0, (byte) 22));
        ccq0.T(this, "REQUEST_CHANGE_EMAIL_DIALOG_KEY", new cz60(0, H0(), kk90.class, "onChangeEmailDialogCancelClicked", "onChangeEmailDialogCancelClicked()V", 0, (byte) 23));
        int i2 = 1;
        C().u0("SELECT_PHONE_ACTION_DIALOG_KEY", this, new gne(new yi90(i2, H0(), kk90.class, "onPhoneActionDialogClosed", "onPhoneActionDialogClosed(Z)V", 0, (byte) 0), (byte) 5));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(bj90.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            bj90 bj90Var = (bj90) (ze3Var instanceof bj90 ? ze3Var : null);
            if (bj90Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                String simpleName = aj90.class.getSimpleName();
                String str = this.O1;
                i1w0VarF.getClass();
                str.getClass();
                zx10 zx10Var = bj90Var.f2696a;
                ilp0 ilp0Var = bj90Var.b;
                ii iiVar = bj90Var.m;
                m1e m1eVar = bj90Var.c;
                gle0 gle0Var = bj90Var.d;
                qgd qgdVar = bj90Var.e;
                zg zgVar = bj90Var.f;
                zg zgVar2 = bj90Var.h;
                duj dujVar = bj90Var.i;
                kt2 kt2Var = bj90Var.j;
                sa10 sa10Var = bj90Var.k;
                pru pruVar = bj90Var.l;
                cad cadVar = bj90Var.n;
                ctf0 ctf0Var = bj90Var.o;
                fsd fsdVar = bj90Var.p;
                b3c0 b3c0Var = bj90Var.q;
                kl5 kl5Var = bj90Var.g;
                d1p d1pVar = bj90Var.r;
                kpt kptVar = bj90Var.s;
                jh70 jh70Var = bj90Var.t;
                sek sekVar = bj90Var.u;
                mi70 mi70Var = bj90Var.v;
                zn00 zn00Var = bj90Var.w;
                yfu yfuVar = bj90Var.x;
                d1pVar.getClass();
                iiVar.getClass();
                m1eVar.getClass();
                kt2Var.getClass();
                ctf0Var.getClass();
                fsdVar.getClass();
                b3c0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(kk90.class, (eni) new t7i(ilp0Var, zx10Var, cadVar, d1pVar, gle0Var, iiVar, kl5Var, m1eVar, qgdVar, zgVar, zgVar2, dujVar, kt2Var, sa10Var, pruVar, ctf0Var, fsdVar, b3c0Var, i1w0VarF, kptVar, jh70Var, sekVar, mi70Var, zn00Var, simpleName, str, yfuVar).y));
                this.M1 = iiVar;
                this.N1 = jh70Var;
                return;
            }
        }
        jf4.n(b1j.i(bj90.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().B;
        hi70 hi70Var = new hi70(2, new zi90((ProgressBar) G0().d.c, phu0.class, "isVisible", "isVisible(Landroid/view/View;)Z", 1, (byte) 0), rhy.class, "set", "set(Ljava/lang/Object;)V", 4, (byte) 15);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new w090((gmq) p7m0Var, clzVarW, hi70Var, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var2 = H0().C;
        Class<aj90> cls = aj90.class;
        hi70 hi70Var2 = new hi70(2, this, cls, "handleLottieState", "handleLottieState(Lorg/xplatform/personal/impl/presentation/personal/PersonalDataViewModel$LottieState;)V", 4, (byte) 16);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new w090((gmq) p7m0Var2, clzVarW2, hi70Var2, (yje) null, (char) 0), 3);
        qoj0 qoj0Var = H0().D;
        int i = 4;
        int i2 = 2;
        hi70 hi70Var3 = new hi70(i2, this, cls, "handleContentFlow", "handleContentFlow(Ljava/util/List;)V", i, (byte) 17);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new w090(qoj0Var, clzVarW3, hi70Var3, (yje) null, 0), 3);
        ol60 ol60Var = H0().E;
        hi70 hi70Var4 = new hi70(i2, this, cls, "handleAction", "handleAction(Lorg/xplatform/personal/impl/presentation/personal/PersonalDataViewModel$Action;)V", i, (byte) 18);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new w090((gmq) ol60Var, clzVarW4, hi70Var4, (yje) null, (short) 0), 3);
    }

    public final t2r G0() {
        Object objN = this.Q1.n(U1[0], this);
        objN.getClass();
        return (t2r) objN;
    }

    public final kk90 H0() {
        return (kk90) this.P1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        c4m0 c4m0Var = H0().G;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        kk90 kk90VarH0 = H0();
        kk90VarH0.G = sac.T(new fnq(kk90VarH0.j.b(), new ck90(kk90VarH0, null, (byte) 1), (byte) 4), jiu0.a(kk90VarH0), hk90.h);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
