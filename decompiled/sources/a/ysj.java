package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.text.InputFilter;
import android.view.LayoutInflater;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/ysj;", "La/stl;", "La/mhn0;", "<init>", "()V", "a/qud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ysj extends stl<mhn0> {
    public final yzn0 g2 = new yzn0("BALANCE_TYPE_BUNDLE_KEY");
    public final n0o0 h2;
    public final n0o0 i2;
    public fiu0 j2;
    public wdk0 k2;
    public final kiu0 l2;
    public static final /* synthetic */ iiy[] n2 = {new ez40(ysj.class, "balanceScreenTypeBundle", "getBalanceScreenTypeBundle()Lorg/xplatform/balance/model/BalanceScreenType;", 0)};
    public static final qud m2 = new qud();

    public ysj() {
        final byte b = 0;
        this.h2 = maz.b(new Function0(this) { // from class: a.vsj
            public final /* synthetic */ ysj b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                ysj ysjVar = this.b;
                switch (b2) {
                    case 0:
                        qud qudVar = ysj.m2;
                        return mhn0.a(LayoutInflater.from(ysjVar.D()));
                    case 1:
                        qud qudVar2 = ysj.m2;
                        return new da0(new e3j(ysjVar, (byte) 9));
                    default:
                        fiu0 fiu0Var = ysjVar.j2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        });
        final byte b2 = 1;
        this.i2 = maz.b(new Function0(this) { // from class: a.vsj
            public final /* synthetic */ ysj b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                ysj ysjVar = this.b;
                switch (b3) {
                    case 0:
                        qud qudVar = ysj.m2;
                        return mhn0.a(LayoutInflater.from(ysjVar.D()));
                    case 1:
                        qud qudVar2 = ysj.m2;
                        return new da0(new e3j(ysjVar, (byte) 9));
                    default:
                        fiu0 fiu0Var = ysjVar.j2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        });
        final byte b3 = 2;
        Function0 function0 = new Function0(this) { // from class: a.vsj
            public final /* synthetic */ ysj b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                ysj ysjVar = this.b;
                switch (b4) {
                    case 0:
                        qud qudVar = ysj.m2;
                        return mhn0.a(LayoutInflater.from(ysjVar.D()));
                    case 1:
                        qud qudVar2 = ysj.m2;
                        return new da0(new e3j(ysjVar, (byte) 9));
                    default:
                        fiu0 fiu0Var = ysjVar.j2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new q7g(new q7g(this, (byte) 23), (byte) 24));
        this.l2 = agc.G(this, sre0.f32672a.b(btj.class), new r7g(a8zVarA, (byte) 26), new r7g(a8zVarA, (byte) 27), function0);
    }

    @Override // a.stl
    public final void S0() {
        String string = G().getString(R.string.bet_settings_default_bet_sum_container_title);
        string.getClass();
        I0(new kp8(string, R.style.TextStyle_Title_Bold_M));
        Q0().c.setFilters(new InputFilter[]{new tjj(13, 2)});
        DsPresetTextFieldBasic dsPresetTextFieldBasic = Q0().c;
        da0 da0Var = (da0) this.i2.getValue();
        da0Var.getClass();
        dsPresetTextFieldBasic.b.a(da0Var);
        Q0().d.setOnClickListener(new q10(this, (byte) 14));
        Q0().e.setSpace(G().getDimensionPixelOffset(R.dimen.space_16));
        Q0().b.setSpace(G().getDimensionPixelOffset(R.dimen.space_16));
    }

    @Override // a.stl
    public final void U0() throws Exception {
        kiu0 kiu0Var = this.l2;
        p7m0 p7m0Var = ((btj) kiu0Var.getValue()).k;
        int i = 4;
        Class<ysj> cls = ysj.class;
        d7e d7eVar = new d7e(2, this, cls, "updateUiState", "updateUiState(Lorg/xplatform/make_bet_settings/impl/presentation/model/EditSumBottomSheetScreenState;)V", i, (byte) 26);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new xsj(p7m0Var, clzVarW, d7eVar, (yje) null), 3);
        ol60 ol60Var = ((btj) kiu0Var.getValue()).l;
        d7e d7eVar2 = new d7e(2, this, cls, "handleActions", "handleActions(Lorg/xplatform/make_bet_settings/impl/presentation/model/EditSumBottomSheetAction;)V", i, (byte) 27);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new xsj((gmq) ol60Var, clzVarW2, d7eVar2, (yje) null, (byte) 0), 3);
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(p2j0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            p2j0 p2j0Var = (p2j0) (ze3Var instanceof p2j0 ? ze3Var : null);
            if (p2j0Var != null) {
                i7i i7iVarA = p2j0Var.a(a4n0.f(this), (bm5) this.g2.n(this, n2[0]));
                this.j2 = i7iVarA.x();
                this.k2 = (wdk0) i7iVarA.z;
                return;
            }
        }
        jf4.n(b1j.i(p2j0.class, "Cannot create dependency "));
    }

    @Override // a.stl
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final mhn0 Q0() {
        Object value = this.h2.getValue();
        value.getClass();
        return (mhn0) value;
    }

    @Override // a.stl, a.sik, androidx.fragment.app.Fragment
    public final void Z() {
        DsPresetTextFieldBasic dsPresetTextFieldBasic = Q0().c;
        da0 da0Var = (da0) this.i2.getValue();
        da0Var.getClass();
        dsPresetTextFieldBasic.b.c(da0Var);
        super.Z();
    }
}
