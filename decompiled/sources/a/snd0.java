package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.text.InputFilter;
import android.view.LayoutInflater;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTextFieldBasic;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/snd0;", "La/stl;", "La/mhn0;", "<init>", "()V", "a/rl70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class snd0 extends stl<mhn0> {
    public final yzn0 g2 = new yzn0("BALANCE_TYPE_BUNDLE_KEY");
    public final yzn0 h2 = new yzn0("QUICK_BET_EDITOR_ITEM_KEY");
    public final n0o0 i2;
    public final n0o0 j2;
    public fiu0 k2;
    public wdk0 l2;
    public final kiu0 m2;
    public static final /* synthetic */ iiy[] o2 = {new ez40(snd0.class, "balanceScreenTypeBundle", "getBalanceScreenTypeBundle()Lorg/xplatform/balance/model/BalanceScreenType;", 0), new ez40(snd0.class, "quickBetItemBundle", "getQuickBetItemBundle()Lorg/xplatform/make_bet_settings/impl/presentation/adapter/quickbets/model/SettingsMakeBetQuickBetsEditorItem;", 0)};
    public static final rl70 n2 = new rl70();

    public snd0() {
        final byte b = 0;
        this.i2 = maz.b(new Function0(this) { // from class: a.rnd0
            public final /* synthetic */ snd0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                snd0 snd0Var = this.b;
                switch (b2) {
                    case 0:
                        rl70 rl70Var = snd0.n2;
                        return mhn0.a(LayoutInflater.from(snd0Var.D()));
                    case 1:
                        rl70 rl70Var2 = snd0.n2;
                        return new da0(new v6d0(snd0Var, (byte) 9));
                    default:
                        fiu0 fiu0Var = snd0Var.k2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        });
        final byte b2 = 1;
        this.j2 = maz.b(new Function0(this) { // from class: a.rnd0
            public final /* synthetic */ snd0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                snd0 snd0Var = this.b;
                switch (b3) {
                    case 0:
                        rl70 rl70Var = snd0.n2;
                        return mhn0.a(LayoutInflater.from(snd0Var.D()));
                    case 1:
                        rl70 rl70Var2 = snd0.n2;
                        return new da0(new v6d0(snd0Var, (byte) 9));
                    default:
                        fiu0 fiu0Var = snd0Var.k2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        });
        final byte b3 = 2;
        Function0 function0 = new Function0(this) { // from class: a.rnd0
            public final /* synthetic */ snd0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b4 = b3;
                snd0 snd0Var = this.b;
                switch (b4) {
                    case 0:
                        rl70 rl70Var = snd0.n2;
                        return mhn0.a(LayoutInflater.from(snd0Var.D()));
                    case 1:
                        rl70 rl70Var2 = snd0.n2;
                        return new da0(new v6d0(snd0Var, (byte) 9));
                    default:
                        fiu0 fiu0Var = snd0Var.k2;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new f1d0(new f1d0(this, (byte) 23), (byte) 24));
        this.m2 = agc.G(this, sre0.f32672a.b(qnd0.class), new ync0(a8zVarA, (byte) 26), new ync0(a8zVarA, (byte) 27), function0);
    }

    @Override // a.stl
    public final void S0() {
        String string = G().getString(R.string.bet_settings_quick_bet_bottom_sheet_title);
        string.getClass();
        I0(new kp8(string, R.style.TextStyle_Title_Bold_M));
        qnd0 qnd0Var = (qnd0) this.m2.getValue();
        sac.V(jiu0.a(qnd0Var), new ond0(qnd0Var, (byte) 0), null, qnd0Var.i.f22085a, new pnd0(qnd0Var, (h4j0) this.h2.n(this, o2[1]), null, (byte) 0), 10);
        Q0().c.setFilters(new InputFilter[]{new tjj(13, 2)});
        DsPresetTextFieldBasic dsPresetTextFieldBasic = Q0().c;
        da0 da0Var = (da0) this.j2.getValue();
        da0Var.getClass();
        dsPresetTextFieldBasic.b.a(da0Var);
        Q0().d.setOnClickListener(new l910(this, (byte) 26));
        Q0().e.setSpace(G().getDimensionPixelOffset(R.dimen.space_16));
        Q0().b.setSpace(G().getDimensionPixelOffset(R.dimen.space_16));
        BottomSheetBehavior bottomSheetBehavior = this.c2;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.K = true;
        }
    }

    @Override // a.stl
    public final void U0() throws Exception {
        kiu0 kiu0Var = this.m2;
        p7m0 p7m0Var = ((qnd0) kiu0Var.getValue()).m;
        jjc0 jjc0Var = new jjc0(2, this, snd0.class, "updateUiState", "updateUiState(Lorg/xplatform/make_bet_settings/impl/presentation/model/EditSumBottomSheetScreenState;)V", 4, (byte) 11);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fxc0(p7m0Var, clzVarW, jjc0Var, (yje) null), 3);
        ol60 ol60Var = ((qnd0) kiu0Var.getValue()).n;
        jjc0 jjc0Var2 = new jjc0(2, this, snd0.class, "handleActions", "handleActions(Lorg/xplatform/make_bet_settings/impl/presentation/model/EditSumBottomSheetAction;)V", 4, (byte) 12);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new fxc0(ol60Var, clzVarW2, jjc0Var2, (yje) null), 3);
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
                i7i i7iVarA = p2j0Var.a(a4n0.f(this), (bm5) this.g2.n(this, o2[0]));
                this.k2 = i7iVarA.x();
                this.l2 = (wdk0) i7iVarA.z;
                return;
            }
        }
        jf4.n(b1j.i(p2j0.class, "Cannot create dependency "));
    }

    @Override // a.stl
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final mhn0 Q0() {
        Object value = this.i2.getValue();
        value.getClass();
        return (mhn0) value;
    }

    @Override // a.stl, a.sik, androidx.fragment.app.Fragment
    public final void Z() {
        DsPresetTextFieldBasic dsPresetTextFieldBasic = Q0().c;
        da0 da0Var = (da0) this.j2.getValue();
        da0Var.getClass();
        dsPresetTextFieldBasic.b.c(da0Var);
        super.Z();
    }
}
