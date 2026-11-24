package a;

import android.app.Dialog;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import org.xbet.client1.R;
import org.xplatform.feature.fin_bet.impl.domain.model.FinBetInfoModel;
import org.xplatform.uikit.components.bottom_sheet.presets.DsPresetTwoButtons;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"La/c720;", "La/stl;", "La/c6q;", "La/i620;", "<init>", "()V", "a/wsz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c720 extends stl<c6q> implements i620 {
    public wdk0 g2;
    public final nae0 h2 = ltt0.p(this, s620.f31681a);
    public final kiu0 i2;
    public final khf0 j2;
    public final yzn0 k2;
    public xze l2;
    public final xp6 m2;
    public wjk n2;
    public fiu0 o2;
    public static final /* synthetic */ iiy[] q2 = {new j0d0(c720.class, "binding", "getBinding()Lorg/xplatform/feature/fin_bet/impl/databinding/FinBetDialogMakeBetBinding;", 0), new ez40(c720.class, "finBetInfoModel", "getFinBetInfoModel()Lorg/xplatform/feature/fin_bet/impl/domain/model/FinBetInfoModel;", 0), new ez40(c720.class, "requestKey", "getRequestKey()Ljava/lang/String;", 0)};
    public static final wsz p2 = new wsz();

    public c720() {
        n620 n620Var = new n620(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new pv10(new pv10(this, (byte) 8), (byte) 10));
        this.i2 = agc.G(this, sre0.f32672a.b(kn20.class), new j210(a8zVarA, (byte) 29), new y620(a8zVarA, (byte) 1), n620Var);
        this.j2 = new khf0("EXTRA_BET_INFO");
        this.k2 = new yzn0("REQUEST_KEY");
        this.m2 = new xp6(this, (byte) 10);
    }

    @Override // a.stl
    public final void R0() {
        Object parent = q0().getParent();
        View view = parent instanceof View ? (View) parent : null;
        if (view != null) {
            g2v g2vVar = new g2v(this);
            WeakHashMap weakHashMap = rgu0.f30456a;
            igu0.c(view, g2vVar);
        }
    }

    @Override // a.stl
    public final void S0() {
        Window window;
        Dialog dialog = this.S1;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.clearFlags(2);
        }
        BottomSheetBehavior bottomSheetBehavior = this.c2;
        final byte b = 1;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.K = true;
            bottomSheetBehavior.N(3);
        }
        final byte b2 = 0;
        Q0().e.setUserInputEnabled(false);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        n6r n6rVarK = K();
        n6rVarK.b();
        glz glzVar = n6rVarK.c;
        glzVar.getClass();
        this.l2 = new xze(eVarC, glzVar, iun.f15405a, b);
        s6q s6qVar = new s6q(o0());
        K0(s6qVar);
        new sbx0((byte) 13).b(Q0().e);
        Q0().e.c(this.m2);
        s6qVar.setInstrumentName(W0().d);
        X0(W0().f);
        s6qVar.setPriceLevelState(W0().k);
        DsPresetTwoButtons dsPresetTwoButtons = new DsPresetTwoButtons(o0(), null, 6);
        dsPresetTwoButtons.setOrientation(1);
        dsPresetTwoButtons.setFirstButtonText(R.string.offer_to_auth_login_button);
        dsPresetTwoButtons.setSecondButtonText(R.string.offer_to_auth_registration_button);
        dsPresetTwoButtons.setFirstButtonStyle(R.style.DSButton_Large_Secondary);
        dsPresetTwoButtons.setSecondButtonStyle(R.style.DSButton_Large_Commerce);
        dsPresetTwoButtons.setFirstButtonClickListener(new View.OnClickListener(this) { // from class: a.o620
            public final /* synthetic */ c720 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                c720 c720Var = this.b;
                switch (b3) {
                    case 0:
                        wsz wszVar = c720.p2;
                        dyb.Q(new n620(c720Var, (byte) 1));
                        break;
                    default:
                        wsz wszVar2 = c720.p2;
                        dyb.Q(new n620(c720Var, (byte) 2));
                        break;
                }
            }
        });
        dsPresetTwoButtons.setSecondButtonClickListener(new View.OnClickListener(this) { // from class: a.o620
            public final /* synthetic */ c720 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                c720 c720Var = this.b;
                switch (b3) {
                    case 0:
                        wsz wszVar = c720.p2;
                        dyb.Q(new n620(c720Var, (byte) 1));
                        break;
                    default:
                        wsz wszVar2 = c720.p2;
                        dyb.Q(new n620(c720Var, (byte) 2));
                        break;
                }
            }
        });
        J0(dsPresetTwoButtons);
    }

    @Override // a.stl
    public final void T0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(r6q.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            r6q r6qVar = (r6q) (ze3Var instanceof r6q ? ze3Var : null);
            if (r6qVar != null) {
                hhi hhiVarA = r6qVar.a(a4n0.f(this), W0(), c720.class.getSimpleName(), ua20.MEDIUM_NO_GAME_INFO);
                this.g2 = hhiVarA.f13064a;
                this.o2 = hhiVarA.c();
                return;
            }
        }
        jf4.n(b1j.i(r6q.class, "Cannot create dependency "));
    }

    @Override // a.stl
    public final void U0() throws Exception {
        kiu0 kiu0Var = this.i2;
        xae0 xae0VarN = vtb.N(((kn20) kiu0Var.getValue()).j);
        int i = 4;
        Class<c720> cls = c720.class;
        dm10 dm10Var = new dm10(2, this, cls, "handleAuthState", "handleAuthState(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/viewmodel/MakeBetViewModel$AuthState;)V", i, (byte) 26);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new v620(xae0VarN, clzVarW, dm10Var, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(((kn20) kiu0Var.getValue()).h);
        dm10 dm10Var2 = new dm10(2, this, cls, "handleCoefState", "handleCoefState(Lorg/xplatform/feature/fin_bet/impl/makebet/presentation/make_bet/viewmodel/MakeBetViewModel$CoefficientState;)V", i, (byte) 27);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new v620(xae0VarN2, clzVarW2, dm10Var2, (yje) null, (byte) 0), 3);
        xae0 xae0VarN3 = vtb.N(((kn20) kiu0Var.getValue()).i);
        dm10 dm10Var3 = new dm10(2, this, cls, "handlePrice", "handlePrice(D)V", i, (byte) 28);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new v620(xae0VarN3, clzVarW3, dm10Var3, (yje) null, (char) 0), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.sik, androidx.fragment.app.Fragment
    public final void V(Context context) {
        super.V(context);
        if (context instanceof wjk) {
            this.n2 = (wjk) context;
        }
        wjk wjkVar = this.n2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
    }

    @Override // a.stl
    /* JADX INFO: renamed from: V0, reason: merged with bridge method [inline-methods] */
    public final c6q Q0() {
        Object objN = this.h2.n(q2[0], this);
        objN.getClass();
        return (c6q) objN;
    }

    public final FinBetInfoModel W0() {
        return (FinBetInfoModel) this.j2.n(this, q2[1]);
    }

    public final void X0(double d) {
        Object next;
        Iterator it = pym0.i(P0().f).iterator();
        ArrayList arrayList = new ArrayList();
        if (it.hasNext()) {
            next = it.next();
            View view = (View) next;
            view.getClass();
            ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
            jhu0 jhu0Var = viewGroup != null ? new jhu0(viewGroup) : null;
            if (jhu0Var == null || !jhu0Var.hasNext()) {
                while (!it.hasNext() && !arrayList.isEmpty()) {
                    it = (Iterator) CollectionsKt.d0(arrayList);
                    w3d.z(arrayList);
                }
            } else {
                arrayList.add(it);
            }
        } else {
            next = null;
        }
        View view2 = (View) next;
        s6q s6qVar = view2 instanceof s6q ? (s6q) view2 : null;
        if (s6qVar != null) {
            pn40 pn40Var = pn40.f27267a;
            s6qVar.setPriceLevel(pn40.j(d, W0().g, false));
        }
    }

    @Override // a.stl, a.sik, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        Q0().e.setAdapter(null);
        this.l2 = null;
        wjk wjkVar = this.n2;
        if (wjkVar != null) {
            wjk.l(wjkVar);
        }
        Q0().e.g(this.m2);
        vcc.f0(i120.V(new Pair("REQUEST_FINISH_MAKE_BET_DIALOG_KEY", Boolean.TRUE)), this, (String) this.k2.n(this, q2[2]));
    }
}
