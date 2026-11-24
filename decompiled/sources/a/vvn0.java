package a;

import android.javax.sip.message.Response;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.swipex.impl.presentation.swipex.cardstack.CardStackLayoutManager;
import org.xplatform.swipex.impl.presentation.swipex.cardstack.SwipexCardsRecyclerView;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/vvn0;", "La/yx5;", "<init>", "()V", "a/j6m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vvn0 extends yx5 {
    public final e9o0 K1;
    public final hnm0 L1;
    public final boolean M1;
    public ii N1;
    public wdk0 O1;
    public final a8z P1;
    public final a8z Q1;
    public final a8z R1;
    public final s0r S1;
    public final a8z U1;
    public final eyg0 V1;
    public static final /* synthetic */ iiy[] X1 = {new j0d0(vvn0.class, "viewBinding", "getViewBinding()Lorg/xplatform/swipex/impl/databinding/SwipexFragmentBinding;", 0)};
    public static final j6m0 W1 = new j6m0((byte) 8);

    public vvn0() {
        super(R.layout.swipex_fragment);
        this.K1 = new e9o0(R.attr.uikitBackground, R.attr.uikitBackgroundContent, 12);
        this.L1 = hnm0.f13359a;
        this.M1 = true;
        qvn0 qvn0Var = new qvn0(this, (byte) 4);
        wez wezVar = wez.b;
        this.P1 = maz.a(wezVar, qvn0Var);
        this.Q1 = maz.a(wezVar, new qvn0(this, (byte) 5));
        this.R1 = xbc.a0(this, sre0.f32672a.b(zyn0.class), null, new qvn0(this, (byte) 6), 14);
        this.S1 = ltt0.o(this, uvn0.f36359a);
        this.U1 = maz.a(wezVar, new a7n0((byte) 21));
        this.V1 = new eyg0(this, (byte) 27);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        View viewQ0 = q0();
        ugf0 ugf0Var = new ugf0(this);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(viewQ0, ugf0Var);
        J0().d.setLayoutManager(new CardStackLayoutManager(this.V1, I0() ? rna.d : rna.c));
        J0().d.setAdapter((ssn0) this.U1.getValue());
        J0().d.setItemAnimator(null);
        final byte b = 0;
        J0().d.setClickable(false);
        jmu0.l(0, (int) (I0() ? 28.0f : 30.0f), 7, J0().f);
        final byte b2 = 1;
        pkd.i(J0().p, null, new ugd(-1811096048, true, new Function2(this) { // from class: a.svn0
            public final /* synthetic */ vvn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b2;
                vvn0 vvn0Var = this.b;
                switch (b3) {
                    case 0:
                        int iIntValue = ((Integer) obj2).intValue();
                        j6m0 j6m0Var = vvn0.W1;
                        ((mxl) obj).getClass();
                        vvn0Var.K0().x(new esn0(iIntValue));
                        break;
                    default:
                        fet fetVar = (fet) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        j6m0 j6m0Var2 = vvn0.W1;
                        if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                            wxn0 wxn0Var = (wxn0) ((i3t0) vvn0Var.K0()).y(fetVar).getValue();
                            k3t0 k3t0VarK0 = vvn0Var.K0();
                            boolean zI = fetVar.i(k3t0VarK0);
                            Object objP = fetVar.P();
                            if (zI || objP == ukd.f35823a) {
                                ndn0 ndn0Var = new ndn0(1, k3t0VarK0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                                fetVar.o0(ndn0Var);
                                objP = ndn0Var;
                            }
                            ihm0.a(wxn0Var, (Function1) ((jhy) objP), fetVar, 0);
                        } else {
                            fetVar.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }));
        J0().h.setSelectionMode(uyl.b);
        J0().h.setOnChipClickListener(new Function2(this) { // from class: a.svn0
            public final /* synthetic */ vvn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b;
                vvn0 vvn0Var = this.b;
                switch (b3) {
                    case 0:
                        int iIntValue = ((Integer) obj2).intValue();
                        j6m0 j6m0Var = vvn0.W1;
                        ((mxl) obj).getClass();
                        vvn0Var.K0().x(new esn0(iIntValue));
                        break;
                    default:
                        fet fetVar = (fet) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        j6m0 j6m0Var2 = vvn0.W1;
                        if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                            wxn0 wxn0Var = (wxn0) ((i3t0) vvn0Var.K0()).y(fetVar).getValue();
                            k3t0 k3t0VarK0 = vvn0Var.K0();
                            boolean zI = fetVar.i(k3t0VarK0);
                            Object objP = fetVar.P();
                            if (zI || objP == ukd.f35823a) {
                                ndn0 ndn0Var = new ndn0(1, k3t0VarK0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                                fetVar.o0(ndn0Var);
                                objP = ndn0Var;
                            }
                            ihm0.a(wxn0Var, (Function1) ((jhy) objP), fetVar, 0);
                        } else {
                            fetVar.X();
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        J0().o.setImageResource(cy7.c() ? R.drawable.gradient_filter_rtl : R.drawable.gradient_filter);
        final byte b3 = 3;
        dyb.O(J0().n, new Function1(this) { // from class: a.rvn0
            public final /* synthetic */ vvn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                trn0 trn0Var = trn0.f34428a;
                vvn0 vvn0Var = this.b;
                View view = (View) obj;
                switch (b4) {
                    case 0:
                        j6m0 j6m0Var = vvn0.W1;
                        view.getClass();
                        SwipexCardsRecyclerView swipexCardsRecyclerView = vvn0Var.J0().d;
                        androidx.recyclerview.widget.b layoutManager = swipexCardsRecyclerView.getLayoutManager();
                        CardStackLayoutManager cardStackLayoutManager = layoutManager instanceof CardStackLayoutManager ? (CardStackLayoutManager) layoutManager : null;
                        if (cardStackLayoutManager != null) {
                            xna xnaVar = cardStackLayoutManager.r;
                            zj zjVar = zj.f44462a;
                            pek pekVar = ven.b;
                            bpn0 bpn0Var = bpn0.f2993a;
                            cardStackLayoutManager.s = new ron0(zj.f44462a, Response.BUSY_EVERYWHERE, bpn0.b, new AccelerateInterpolator());
                            if (!xnaVar.f41165a.a()) {
                                swipexCardsRecyclerView.B0(xnaVar.f + 1);
                            }
                        }
                        break;
                    case 1:
                        j6m0 j6m0Var2 = vvn0.W1;
                        view.getClass();
                        vvn0Var.K0().x(trn0Var);
                        break;
                    case 2:
                        j6m0 j6m0Var3 = vvn0.W1;
                        view.getClass();
                        vvn0Var.K0().x(trn0Var);
                        break;
                    case 3:
                        j6m0 j6m0Var4 = vvn0.W1;
                        view.getClass();
                        vvn0Var.K0().x(new esn0(-1));
                        break;
                    default:
                        j6m0 j6m0Var5 = vvn0.W1;
                        view.getClass();
                        vvn0Var.J0().d.H0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        jmu0.l((int) (I0() ? 0.0f : 18.0f), (int) (I0() ? 8.0f : 16.0f), 5, J0().g);
        DsButton dsButton = J0().j;
        ymx ymxVar = ymx.INTERVAL_1000;
        final byte b4 = 4;
        dyb.N(dsButton, ymxVar, new Function1(this) { // from class: a.rvn0
            public final /* synthetic */ vvn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b4;
                trn0 trn0Var = trn0.f34428a;
                vvn0 vvn0Var = this.b;
                View view = (View) obj;
                switch (b5) {
                    case 0:
                        j6m0 j6m0Var = vvn0.W1;
                        view.getClass();
                        SwipexCardsRecyclerView swipexCardsRecyclerView = vvn0Var.J0().d;
                        androidx.recyclerview.widget.b layoutManager = swipexCardsRecyclerView.getLayoutManager();
                        CardStackLayoutManager cardStackLayoutManager = layoutManager instanceof CardStackLayoutManager ? (CardStackLayoutManager) layoutManager : null;
                        if (cardStackLayoutManager != null) {
                            xna xnaVar = cardStackLayoutManager.r;
                            zj zjVar = zj.f44462a;
                            pek pekVar = ven.b;
                            bpn0 bpn0Var = bpn0.f2993a;
                            cardStackLayoutManager.s = new ron0(zj.f44462a, Response.BUSY_EVERYWHERE, bpn0.b, new AccelerateInterpolator());
                            if (!xnaVar.f41165a.a()) {
                                swipexCardsRecyclerView.B0(xnaVar.f + 1);
                            }
                        }
                        break;
                    case 1:
                        j6m0 j6m0Var2 = vvn0.W1;
                        view.getClass();
                        vvn0Var.K0().x(trn0Var);
                        break;
                    case 2:
                        j6m0 j6m0Var3 = vvn0.W1;
                        view.getClass();
                        vvn0Var.K0().x(trn0Var);
                        break;
                    case 3:
                        j6m0 j6m0Var4 = vvn0.W1;
                        view.getClass();
                        vvn0Var.K0().x(new esn0(-1));
                        break;
                    default:
                        j6m0 j6m0Var5 = vvn0.W1;
                        view.getClass();
                        vvn0Var.J0().d.H0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.N(J0().e, ymx.INTERVAL_500, new Function1(this) { // from class: a.rvn0
            public final /* synthetic */ vvn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b;
                trn0 trn0Var = trn0.f34428a;
                vvn0 vvn0Var = this.b;
                View view = (View) obj;
                switch (b5) {
                    case 0:
                        j6m0 j6m0Var = vvn0.W1;
                        view.getClass();
                        SwipexCardsRecyclerView swipexCardsRecyclerView = vvn0Var.J0().d;
                        androidx.recyclerview.widget.b layoutManager = swipexCardsRecyclerView.getLayoutManager();
                        CardStackLayoutManager cardStackLayoutManager = layoutManager instanceof CardStackLayoutManager ? (CardStackLayoutManager) layoutManager : null;
                        if (cardStackLayoutManager != null) {
                            xna xnaVar = cardStackLayoutManager.r;
                            zj zjVar = zj.f44462a;
                            pek pekVar = ven.b;
                            bpn0 bpn0Var = bpn0.f2993a;
                            cardStackLayoutManager.s = new ron0(zj.f44462a, Response.BUSY_EVERYWHERE, bpn0.b, new AccelerateInterpolator());
                            if (!xnaVar.f41165a.a()) {
                                swipexCardsRecyclerView.B0(xnaVar.f + 1);
                            }
                        }
                        break;
                    case 1:
                        j6m0 j6m0Var2 = vvn0.W1;
                        view.getClass();
                        vvn0Var.K0().x(trn0Var);
                        break;
                    case 2:
                        j6m0 j6m0Var3 = vvn0.W1;
                        view.getClass();
                        vvn0Var.K0().x(trn0Var);
                        break;
                    case 3:
                        j6m0 j6m0Var4 = vvn0.W1;
                        view.getClass();
                        vvn0Var.K0().x(new esn0(-1));
                        break;
                    default:
                        j6m0 j6m0Var5 = vvn0.W1;
                        view.getClass();
                        vvn0Var.J0().d.H0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.N(J0().c, ymxVar, new Function1(this) { // from class: a.rvn0
            public final /* synthetic */ vvn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b2;
                trn0 trn0Var = trn0.f34428a;
                vvn0 vvn0Var = this.b;
                View view = (View) obj;
                switch (b5) {
                    case 0:
                        j6m0 j6m0Var = vvn0.W1;
                        view.getClass();
                        SwipexCardsRecyclerView swipexCardsRecyclerView = vvn0Var.J0().d;
                        androidx.recyclerview.widget.b layoutManager = swipexCardsRecyclerView.getLayoutManager();
                        CardStackLayoutManager cardStackLayoutManager = layoutManager instanceof CardStackLayoutManager ? (CardStackLayoutManager) layoutManager : null;
                        if (cardStackLayoutManager != null) {
                            xna xnaVar = cardStackLayoutManager.r;
                            zj zjVar = zj.f44462a;
                            pek pekVar = ven.b;
                            bpn0 bpn0Var = bpn0.f2993a;
                            cardStackLayoutManager.s = new ron0(zj.f44462a, Response.BUSY_EVERYWHERE, bpn0.b, new AccelerateInterpolator());
                            if (!xnaVar.f41165a.a()) {
                                swipexCardsRecyclerView.B0(xnaVar.f + 1);
                            }
                        }
                        break;
                    case 1:
                        j6m0 j6m0Var2 = vvn0.W1;
                        view.getClass();
                        vvn0Var.K0().x(trn0Var);
                        break;
                    case 2:
                        j6m0 j6m0Var3 = vvn0.W1;
                        view.getClass();
                        vvn0Var.K0().x(trn0Var);
                        break;
                    case 3:
                        j6m0 j6m0Var4 = vvn0.W1;
                        view.getClass();
                        vvn0Var.K0().x(new esn0(-1));
                        break;
                    default:
                        j6m0 j6m0Var5 = vvn0.W1;
                        view.getClass();
                        vvn0Var.J0().d.H0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b5 = 2;
        dyb.N(J0().i, ymxVar, new Function1(this) { // from class: a.rvn0
            public final /* synthetic */ vvn0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b6 = b5;
                trn0 trn0Var = trn0.f34428a;
                vvn0 vvn0Var = this.b;
                View view = (View) obj;
                switch (b6) {
                    case 0:
                        j6m0 j6m0Var = vvn0.W1;
                        view.getClass();
                        SwipexCardsRecyclerView swipexCardsRecyclerView = vvn0Var.J0().d;
                        androidx.recyclerview.widget.b layoutManager = swipexCardsRecyclerView.getLayoutManager();
                        CardStackLayoutManager cardStackLayoutManager = layoutManager instanceof CardStackLayoutManager ? (CardStackLayoutManager) layoutManager : null;
                        if (cardStackLayoutManager != null) {
                            xna xnaVar = cardStackLayoutManager.r;
                            zj zjVar = zj.f44462a;
                            pek pekVar = ven.b;
                            bpn0 bpn0Var = bpn0.f2993a;
                            cardStackLayoutManager.s = new ron0(zj.f44462a, Response.BUSY_EVERYWHERE, bpn0.b, new AccelerateInterpolator());
                            if (!xnaVar.f41165a.a()) {
                                swipexCardsRecyclerView.B0(xnaVar.f + 1);
                            }
                        }
                        break;
                    case 1:
                        j6m0 j6m0Var2 = vvn0.W1;
                        view.getClass();
                        vvn0Var.K0().x(trn0Var);
                        break;
                    case 2:
                        j6m0 j6m0Var3 = vvn0.W1;
                        view.getClass();
                        vvn0Var.K0().x(trn0Var);
                        break;
                    case 3:
                        j6m0 j6m0Var4 = vvn0.W1;
                        view.getClass();
                        vvn0Var.K0().x(new esn0(-1));
                        break;
                    default:
                        j6m0 j6m0Var5 = vvn0.W1;
                        view.getClass();
                        vvn0Var.J0().d.H0();
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        yvi yviVar = (yvi) this.Q1.getValue();
        this.N1 = yviVar.f43320a;
        this.O1 = yviVar.b;
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarW = K0().w();
        yje yjeVar = null;
        tvn0 tvn0Var = new tvn0(this, yjeVar, (byte) 1);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new agn0(gmqVarW, clzVarW, tvn0Var, (yje) null), 3);
        gmq gmqVarC = ((i3t0) K0()).C();
        tvn0 tvn0Var2 = new tvn0(this, yjeVar, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new agn0((i89) gmqVarC, clzVarW2, tvn0Var2, (yje) null), 3);
    }

    public final void G0() {
        DsButton dsButton = J0().e;
        DsButton dsButton2 = J0().j;
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        dsButton.getLocationOnScreen(iArr);
        dsButton2.getLocationOnScreen(iArr2);
        int width = (int) (((iArr2[0] - iArr[0]) - dsButton.getWidth()) * 0.6f);
        J0().c.setMaxWidth(width);
        List listJ = q3d.j(Float.valueOf(o0().getResources().getDimension(R.dimen.text_14)), Float.valueOf(o0().getResources().getDimension(R.dimen.text_12)), Float.valueOf(o0().getResources().getDimension(R.dimen.text_10)));
        TextPaint paint = J0().c.getPaint();
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            float fFloatValue = ((Number) it.next()).floatValue();
            paint.setTextSize(fFloatValue);
            if (paint.measureText(J0().c.getText().toString()) <= width) {
                J0().c.setTextSize(0, fFloatValue);
                return;
            }
        }
        J0().c.setTextSize(0, ((Number) CollectionsKt.d0(listJ)).floatValue());
    }

    public final CardStackLayoutManager H0() {
        androidx.recyclerview.widget.b layoutManager = J0().d.getLayoutManager();
        layoutManager.getClass();
        return (CardStackLayoutManager) layoutManager;
    }

    public final boolean I0() {
        return ((Boolean) this.P1.getValue()).booleanValue();
    }

    public final wvn0 J0() {
        Object objN = this.S1.n(X1[0], this);
        objN.getClass();
        return (wvn0) objN;
    }

    public final k3t0 K0() {
        return (k3t0) this.R1.getValue();
    }

    public final void L0(boolean z) {
        ii iiVar = this.N1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        String strH = H(R.string.attention);
        String strH2 = H(R.string.swipe_x_doesnt_have_events);
        String strH3 = H(R.string.go_to_filter_screen);
        strH3.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, z ? H(R.string.later) : null, (String) null, "CHANGE_FILTERS_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        ccq0.V(this, "REQUEST_TOP_UP", new qvn0(this, (byte) 0));
        ccq0.T(this, "REQUEST_TOP_UP", new qvn0(this, (byte) 1));
        ccq0.V(this, "CHANGE_FILTERS_KEY", new qvn0(this, (byte) 2));
        ccq0.T(this, "CHANGE_FILTERS_KEY", new qvn0(this, (byte) 3));
        C().u0("REQUEST_CONFIRM_BET", this, new b0l0(this, (byte) 12));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.M1;
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
