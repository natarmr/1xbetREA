package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.coupon.impl.coupon.presentation.common.LinearLayoutManagerWrapper;
import org.xplatform.uikit.components.account_selection.DsAccountSelection;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/axe;", "La/yx5;", "<init>", "()V", "a/kud", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class axe extends yx5 {
    public final hnm0 K1;
    public final s0r L1;
    public final phf0 M1;
    public final cgx0 N1;
    public final kiu0 O1;
    public fiu0 P1;
    public ii Q1;
    public ynb R1;
    public poq0 S1;
    public wdk0 U1;
    public final boolean V1;
    public final n0o0 W1;
    public vyx X1;
    public Integer Y1;
    public Integer Z1;
    public qse a2;
    public final a8z b2;
    public ComposeView c2;
    public final n0o0 d2;
    public static final /* synthetic */ iiy[] f2 = {new j0d0(axe.class, "viewBinding", "getViewBinding()Lorg/xplatform/coupon/impl/databinding/FragmentCouponBinding;", 0), new ez40(axe.class, "couponId", "getCouponId()Ljava/lang/String;", 0), new ez40(axe.class, "afterBet", "getAfterBet()Z", 0)};
    public static final kud e2 = new kud();

    public axe() {
        super(R.layout.fragment_coupon);
        this.K1 = hnm0.f13359a;
        this.L1 = ltt0.o(this, zwe.f45102a);
        this.M1 = new phf0("COUPON_ID_KEY");
        this.N1 = new cgx0("AFTER_BET");
        twe tweVar = new twe(this, (byte) 7);
        aqe aqeVar = new aqe(this, (byte) 3);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new aqe(aqeVar, (byte) 4));
        this.O1 = agc.G(this, sre0.f32672a.b(r7f.class), new cce(a8zVarA, (byte) 6), new cce(a8zVarA, (byte) 7), tweVar);
        this.V1 = true;
        this.W1 = maz.b(new twe(this, (byte) 8));
        this.b2 = maz.a(wezVar, new twe(this, (byte) 9));
        this.d2 = maz.b(new twe(this, (byte) 10));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        View viewQ0 = q0();
        byte b = 10;
        yqc yqcVar = new yqc(this, b);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(viewQ0, yqcVar);
        FrameLayout frameLayout = L0().i;
        BottomSheetBehavior bottomSheetBehaviorE = BottomSheetBehavior.E(frameLayout);
        bottomSheetBehaviorE.N(3);
        bottomSheetBehaviorE.y((po8) this.d2.getValue());
        byte b2 = 0;
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        L0().d.setClipChildren(false);
        L0().d.setClipToPadding(false);
        if (!this.h1) {
            this.h1 = true;
            if (N() && !O()) {
                this.w.e.invalidateOptionsMenu();
            }
        }
        View currentFocus = n0().getCurrentFocus();
        if (currentFocus != null) {
            Context contextO0 = o0();
            t32 t32Var = new t32((byte) 28);
            new Handler(Looper.getMainLooper()).postDelayed(new b1(contextO0, currentFocus.getWindowToken(), t32Var, (byte) 2), 0L);
        }
        RecyclerView recyclerView = L0().q;
        recyclerView.setMotionEventSplittingEnabled(false);
        Context context = recyclerView.getContext();
        context.getClass();
        recyclerView.setLayoutManager(new LinearLayoutManagerWrapper(context));
        Context context2 = recyclerView.getContext();
        context2.getClass();
        this.a2 = new qse(false, false, context2);
        recyclerView.setAdapter((tre) this.b2.getValue());
        recyclerView.m(new vwk(recyclerView.getResources().getDimensionPixelSize(R.dimen.space_16)));
        qse qseVar = this.a2;
        if (qseVar != null) {
            recyclerView.m(qseVar);
        }
        recyclerView.o(new aie0(new bod0((byte) 24), new cnc(recyclerView, (byte) 17), b2));
        dyb.O(L0().c.getAuthorizationButton(), new uwe(this, (byte) 8));
        dyb.O(L0().c.getRegistrationButton(), new uwe(this, (byte) 9));
        dyb.O(L0().n, new uwe(this, b));
        dyb.O(L0().f, new uwe(this, (byte) 11));
        dyb.O(L0().g, new uwe(this, (byte) 12));
        dyb.O(L0().k, new uwe(this, (byte) 13));
        dyb.O(L0().r, new uwe(this, (byte) 14));
        DsAccountSelection.v(L0().b, new twe(this, (byte) 15), 1);
        DsAccountSelection dsAccountSelection = L0().b;
        ymx ymxVar = ymx.INTERVAL_1000;
        dsAccountSelection.y(ymxVar, true, new twe(this, b2));
        L0().b.A(ymxVar, new twe(this, (byte) 4));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(bxe.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            bxe bxeVar = (bxe) (ze3Var instanceof bxe ? ze3Var : null);
            if (bxeVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                iiy[] iiyVarArr = f2;
                String strN = this.M1.n(this, iiyVarArr[1]);
                Boolean boolN = this.N1.n(this, iiyVarArr[2]);
                i1w0VarF.getClass();
                strN.getClass();
                cad cadVar = bxeVar.f3372a;
                gii0 gii0Var = bxeVar.b;
                duj dujVar = bxeVar.c;
                m1e m1eVar = bxeVar.d;
                zfo zfoVar = bxeVar.e;
                gst0 gst0Var = bxeVar.f;
                ii iiVar = bxeVar.J;
                ocl oclVar = bxeVar.g;
                ctf0 ctf0Var = bxeVar.h;
                knf0 knf0Var = bxeVar.i;
                uf3 uf3Var = bxeVar.j;
                qu quVar = bxeVar.k;
                ag3 ag3Var = bxeVar.l;
                v88 v88Var = bxeVar.m;
                ouu ouuVar = bxeVar.n;
                wsf0 wsf0Var = bxeVar.K;
                kt2 kt2Var = bxeVar.o;
                onv onvVar = bxeVar.p;
                vwb0 vwb0Var = bxeVar.q;
                us3 us3Var = bxeVar.r;
                edo edoVar = bxeVar.s;
                ulk ulkVar = bxeVar.t;
                pru pruVar = bxeVar.u;
                wyu wyuVar = bxeVar.v;
                std stdVar = bxeVar.w;
                qv2 qv2Var = bxeVar.x;
                eke0 eke0Var = bxeVar.y;
                poq0 poq0Var = bxeVar.z;
                o2j0 o2j0Var = bxeVar.A;
                bzu bzuVar = bxeVar.B;
                vqc vqcVar = bxeVar.C;
                x20 x20Var = bxeVar.D;
                s64 s64Var = bxeVar.E;
                cmt cmtVar = bxeVar.F;
                l7k l7kVar = bxeVar.G;
                cyu cyuVar = bxeVar.H;
                x20 x20Var2 = bxeVar.I;
                lye lyeVar = bxeVar.L;
                m0f m0fVar = bxeVar.M;
                ave aveVar = bxeVar.N;
                q7d0 q7d0Var = bxeVar.O;
                rrc rrcVar = bxeVar.P;
                wdk0 wdk0Var = bxeVar.Q;
                vby vbyVar = bxeVar.R;
                j1q0 j1q0Var = bxeVar.S;
                r9u r9uVar = bxeVar.T;
                b3u b3uVar = bxeVar.U;
                etj etjVar = bxeVar.V;
                h3c h3cVar = bxeVar.W;
                b3c0 b3c0Var = bxeVar.X;
                peg0 peg0Var = bxeVar.Y;
                dmt dmtVar = bxeVar.Z;
                mii0 mii0Var = bxeVar.a0;
                o2j0Var.getClass();
                iiVar.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                zfoVar.getClass();
                gst0Var.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                us3Var.getClass();
                edoVar.getClass();
                kt2Var.getClass();
                vwb0Var.getClass();
                wyuVar.getClass();
                lyeVar.getClass();
                m0fVar.getClass();
                aveVar.getClass();
                q7d0Var.getClass();
                wdk0Var.getClass();
                vbyVar.getClass();
                j1q0Var.getClass();
                r9uVar.getClass();
                etjVar.getClass();
                b3c0Var.getClass();
                this.P1 = new fiu0(Collections.singletonMap(r7f.class, (uci) new jdi(cadVar, o2j0Var, bzuVar, vqcVar, wsf0Var, peg0Var, iiVar, i1w0VarF, strN, boolN, gii0Var, dujVar, m1eVar, zfoVar, gst0Var, oclVar, ctf0Var, knf0Var, uf3Var, quVar, ag3Var, us3Var, edoVar, ulkVar, v88Var, ouuVar, kt2Var, onvVar, vwb0Var, pruVar, stdVar, qv2Var, eke0Var, poq0Var, x20Var, s64Var, cmtVar, l7kVar, cyuVar, x20Var2, lyeVar, m0fVar, aveVar, q7d0Var, rrcVar, wdk0Var, vbyVar, j1q0Var, r9uVar, b3uVar, etjVar, h3cVar, b3c0Var, dmtVar, mii0Var).a0));
                this.Q1 = iiVar;
                ynb ynbVarI = ((yzn0) peg0Var.b).i();
                x1x.x(ynbVarI);
                this.R1 = ynbVarI;
                this.S1 = poq0Var;
                this.U1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(bxe.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = M0().e2;
        yje yjeVar = null;
        wib wibVar = new wib(this, yjeVar, (byte) 11);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new zpe(ol60Var, clzVarW, wibVar, (yje) null), 3);
        xae0 xae0VarN = vtb.N(M0().W1);
        ywe yweVar = new ywe(this, yjeVar, (byte) 0);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new zpe(xae0VarN, clzVarW2, yweVar, (yje) null), 3);
        xae0 xae0VarN2 = vtb.N(M0().X1);
        ywe yweVar2 = new ywe(this, yjeVar, (byte) 1);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new zpe(xae0VarN2, clzVarW3, yweVar2, (yje) null, (byte) 0), 3);
        xae0 xae0VarN3 = vtb.N(M0().Y1);
        ywe yweVar3 = new ywe(this, yjeVar, (byte) 2);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new zpe(xae0VarN3, clzVarW4, yweVar3, (yje) null, (char) 0), 3);
        xae0 xae0VarN4 = vtb.N(M0().Z1);
        ywe yweVar4 = new ywe(this, yjeVar, (byte) 3);
        clz clzVarW5 = aac.W(this);
        qjj.W(x0x.Q(clzVarW5.x()), null, null, new zpe(xae0VarN4, clzVarW5, yweVar4, (yje) null, 0), 3);
        r7f r7fVarM0 = M0();
        c00 c00Var = new c00(vtb.N(r7fVarM0.a2), r7fVarM0, (byte) 28);
        ywe yweVar5 = new ywe(this, yjeVar, (byte) 4);
        clz clzVarW6 = aac.W(this);
        qjj.W(x0x.Q(clzVarW6.x()), null, null, new zpe(c00Var, clzVarW6, yweVar5, (yje) null), 3);
        ol60 ol60Var2 = M0().b2;
        ywe yweVar6 = new ywe(this, yjeVar, (byte) 5);
        clz clzVarW7 = aac.W(this);
        qjj.W(x0x.Q(clzVarW7.x()), null, null, new zpe(ol60Var2, clzVarW7, yweVar6, (yje) null), 3);
        ol60 ol60Var3 = M0().d2;
        ywe yweVar7 = new ywe(this, yjeVar, (byte) 6);
        clz clzVarW8 = aac.W(this);
        qjj.W(x0x.Q(clzVarW8.x()), null, null, new zpe(ol60Var3, clzVarW8, yweVar7, (yje) null, (byte) 0), 3);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0016  */
    public final boolean G0() {
        boolean z;
        BottomSheetBehavior bottomSheetBehaviorE = BottomSheetBehavior.E(L0().i);
        int i = bottomSheetBehaviorE.P;
        if (i != 4) {
            z = (i == 1 || i == 2) ? false : true;
        }
        if (z) {
            bottomSheetBehaviorE.N(4);
        }
        return z;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void H0(boolean z, boolean z2) {
        oiz oizVar = L0().l.b;
        if (!z2 && !z) {
            oizVar.setVisibility(8);
            return;
        }
        ComposeView composeView = new ComposeView(o0(), null, 6);
        composeView.setViewCompositionStrategy(qek0.h);
        gwq0 gwq0Var = new gwq0();
        gwq0Var.f12039a = 8388627;
        composeView.setLayoutParams(gwq0Var);
        this.c2 = composeView;
        oizVar.setCustomView(composeView);
    }

    public final void I0() {
        BottomSheetBehavior.E(L0().i).N(3);
        kse kseVarK0 = K0();
        if (kseVarK0 != null) {
            kseVarK0.c(1.0f);
        }
    }

    public final ii J0() {
        ii iiVar = this.Q1;
        if (iiVar != null) {
            return iiVar;
        }
        Intrinsics.h("actionDialogManager");
        throw null;
    }

    public final kse K0() {
        if (D() == null) {
            return null;
        }
        i0h0 i0h0VarJ = C().J("MakeBetFragment");
        if (i0h0VarJ instanceof kse) {
            return (kse) i0h0VarJ;
        }
        return null;
    }

    public final pzq L0() {
        Object objN = this.L1.n(f2[0], this);
        objN.getClass();
        return (pzq) objN;
    }

    public final r7f M0() {
        return (r7f) this.O1.getValue();
    }

    public final void N0(List list) {
        G0();
        if (C().c.p().size() <= 1) {
            kwd kwdVar = n4f.k2;
            String strH = H(R.string.bet_type);
            strH.getClass();
            androidx.fragment.app.e eVarC = C();
            eVarC.getClass();
            kwdVar.getClass();
            kwd.g(strH, list, "COUPON_TYPE_REQUEST_KEY", eVarC);
        }
    }

    public final void O0() {
        ii iiVarJ0 = J0();
        String strH = H(R.string.clear_coupon);
        String strH2 = H(R.string.coupon_edit_confirm_delete_all_message);
        String strH3 = H(R.string.cancel);
        String strH4 = H(R.string.ok_new);
        strH4.getClass();
        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH4, strH3, (String) null, "COUPON_DELETE_ALL_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVarJ0.d(dialogFields, eVarC);
    }

    public final void P0() {
        r7f r7fVarM0 = M0();
        i8i.D("action", "download", r7fVarM0.I0.f29324a, "coupon_action_call");
        r7fVarM0.K0.a(di.b);
        if (C().J(yl00.class.getSimpleName()) == null) {
            htz htzVar = yl00.n2;
            String strN = this.M1.n(this, f2[1]);
            htzVar.getClass();
            strN.getClass();
            yl00 yl00Var = new yl00();
            iiy[] iiyVarArr = yl00.o2;
            yl00Var.j2.x(yl00Var, iiyVarArr[0], "LOAD_COUPON_REQUEST_KEY");
            yl00Var.k2.x(yl00Var, iiyVarArr[1], strN);
            androidx.fragment.app.e eVarC = C();
            eVarC.getClass();
            sj3.D0(yl00Var, eVarC);
        }
    }

    public final void Q0(int i) {
        BottomSheetBehavior bottomSheetBehaviorE = BottomSheetBehavior.E(L0().i);
        if (i > 0) {
            Integer num = this.Z1;
            if (num != null && num.intValue() == i) {
                return;
            }
            int dimensionPixelSize = G().getDimensionPixelSize(R.dimen.space_24) + i;
            bottomSheetBehaviorE.M(i);
            this.Z1 = Integer.valueOf(i);
            L0().q.setPadding(L0().q.getPaddingLeft(), L0().q.getPaddingTop(), L0().q.getPaddingRight(), dimensionPixelSize);
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void W(Bundle bundle) {
        super.W(bundle);
        sj3.r0(this, "COUPON_TYPE_REQUEST_KEY", new uwe(this, (byte) 0));
        byte b = 2;
        sj3.r0(this, "COUPON_CHANGE_BLOCK_REQUEST_KEY", new uwe(this, b));
        byte b2 = 3;
        sj3.r0(this, "COUPON_ACTION_REQUEST_KEY", new uwe(this, b2));
        sj3.r0(this, "CHANGE_SYSTEM_REQUEST_KEY", new uwe(this, (byte) 4));
        byte b3 = 5;
        sj3.r0(this, "COUPON_BET_AMOUNT_REQUEST_KEY", new uwe(this, b3));
        ccq0.V(this, "COUPON_REPLACE_AFTER_LOAD_REQUEST_KEY", new pw4(0, this, axe.class, "showLoadCoupon", "showLoadCoupon()V", 0, (byte) 27));
        ccq0.V(this, "COUPON_REPLACE_AFTER_GENERATE_REQUEST_KEY", new pw4(0, M0(), r7f.class, "showGenerateCoupon", "showGenerateCoupon()V", 0, (byte) 28));
        byte b4 = 1;
        ccq0.T(this, "COUPON_REPLACE_WITH_DEEP_LINK_REQUEST_KEY", new twe(this, b4));
        ccq0.V(this, "COUPON_REPLACE_WITH_DEEP_LINK_REQUEST_KEY", new twe(this, b));
        ccq0.V(this, "COUPON_DELETE_ALL_REQUEST_KEY", new twe(this, b2));
        ccq0.T(this, "COUPON_DELETE_ALL_REQUEST_KEY", new twe(this, b3));
        ccq0.V(this, "COUPON_NOT_ENOUGH_BLOCKS_FOR_CONDITION_BET_REQUEST_KEY", new twe(this, (byte) 6));
        sj3.s0(this, "LOAD_COUPON_REQUEST_KEY", new uwe(this, b4));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        super.Z();
        vyx vyxVar = this.X1;
        if (vyxVar != null) {
            vyxVar.i(null);
        }
        this.X1 = null;
        L0().q.setAdapter(null);
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.j1 = true;
        if (this.X1 != null) {
            L0().q.onTouchEvent(MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0));
        }
        r7f r7fVarM0 = M0();
        r7fVarM0.w1 = false;
        r7fVarM0.x1 = false;
        v3c.N(r7fVarM0.F1);
        v3c.N(r7fVarM0.G1);
        v3c.N(r7fVarM0.P1);
        v3c.N(r7fVarM0.Q1);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        rrm rrmVar;
        super.e0();
        wdk0 wdk0Var = this.U1;
        yje yjeVar = null;
        if (wdk0Var == null) {
            Intrinsics.h("snackbarManager");
            throw null;
        }
        LinkedHashMap linkedHashMap = wdk0Var.d;
        if (!StringsKt.W("SnackBarToCoupon")) {
            WeakReference weakReference = (WeakReference) linkedHashMap.get("SnackBarToCoupon");
            if (weakReference != null && (rrmVar = (rrm) weakReference.get()) != null) {
                rrmVar.a(3);
            }
            linkedHashMap.remove("SnackBarToCoupon");
        }
        r7f r7fVarM0 = M0();
        r7fVarM0.y1 = true;
        r7fVarM0.z1 = true;
        sac.V(jiu0.a(r7fVarM0), c5f.f3769a, null, r7fVarM0.Y0.b, new d5f(r7fVarM0, yjeVar, (byte) 0), 10);
        if (r7fVarM0.S0.f27342a.d().r(fk60.PROMO_COUPONE)) {
            r7fVarM0.R(b4f.f1955a);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void f0(Bundle bundle) {
        Integer num = this.Y1;
        if (num != null) {
            bundle.putInt("BOTTOM_SHEET_STATE_BUNDLE_KEY", num.intValue());
        }
        Integer num2 = this.Z1;
        if (num2 != null) {
            bundle.putInt("BOTTOM_SHEET_PEEK_HEIGHT_BUNDLE_KEY", num2.intValue());
        }
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        r7f r7fVarM0 = M0();
        yje yjeVar = null;
        byte b = 8;
        byte b2 = 4;
        fnq fnqVar = new fnq(r7fVarM0.q.a(), new yg1(r7fVarM0, yjeVar, b), b2);
        g7f g7fVar = g7f.h;
        bvc bvcVarA = jiu0.a(r7fVarM0);
        mne mneVar = r7fVarM0.Y0;
        r7fVarM0.H1 = sac.T(fnqVar, d5c.S(bvcVarA, mneVar.b), g7fVar);
        byte b3 = 6;
        r7fVarM0.J1 = sac.T(new fnq(r7fVarM0.Z0.b(), new u88(r7fVarM0, yjeVar, b3), b2), jiu0.a(r7fVarM0), f7f.h);
        sac.V(jiu0.a(r7fVarM0), new x6f(1, r7fVarM0, r7f.class, "showLoginOrIgnore", "showLoginOrIgnore(Ljava/lang/Throwable;)V", 0, (byte) 4), null, mneVar.b, new fj3(r7fVarM0, yjeVar, b3), 10);
        r7fVarM0.K1 = sac.T(new fnq(r7fVarM0.r.b(), new fob(r7fVarM0, yjeVar, (byte) 20), b2), jiu0.a(r7fVarM0), e7f.h);
        r7fVarM0.L1 = sac.T(new fnq(((ave) r7fVarM0.s.f17117a.c).q, new d5f(r7fVarM0, yjeVar, b), b2), jiu0.a(r7fVarM0), d7f.h);
    }

    @Override // androidx.fragment.app.Fragment
    public final void h0() {
        this.Y1 = Integer.valueOf(BottomSheetBehavior.E(L0().i).P);
        this.Z1 = null;
        this.j1 = true;
        r7f r7fVarM0 = M0();
        c4m0 c4m0Var = r7fVarM0.H1;
        if (c4m0Var != null) {
            v3c.N(c4m0Var);
        }
        c4m0 c4m0Var2 = r7fVarM0.I1;
        if (c4m0Var2 != null) {
            v3c.N(c4m0Var2);
        }
        c4m0 c4m0Var3 = r7fVarM0.J1;
        if (c4m0Var3 != null) {
            v3c.N(c4m0Var3);
        }
        c4m0 c4m0Var4 = r7fVarM0.K1;
        if (c4m0Var4 != null) {
            v3c.N(c4m0Var4);
        }
        c4m0 c4m0Var5 = r7fVarM0.L1;
        if (c4m0Var5 != null) {
            v3c.N(c4m0Var5);
        }
        bby bbyVar = r7fVarM0.N1;
        if (bbyVar != null) {
            v3c.N(bbyVar);
        }
        v3c.N(r7fVarM0.S1);
        v3c.N(r7fVarM0.O1);
        r7fVarM0.B1 = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void j0(Bundle bundle) {
        Float fValueOf;
        if (bundle != null) {
            int i = bundle.getInt("BOTTOM_SHEET_STATE_BUNDLE_KEY");
            if (i != 3) {
                fValueOf = i != 4 ? null : Float.valueOf(0.0f);
            } else {
                fValueOf = Float.valueOf(1.0f);
            }
            if (fValueOf != null) {
                float fFloatValue = fValueOf.floatValue();
                kse kseVarK0 = K0();
                if (kseVarK0 != null) {
                    kseVarK0.c(fFloatValue);
                }
            }
        }
        if (bundle != null) {
            int i2 = bundle.getInt("BOTTOM_SHEET_PEEK_HEIGHT_BUNDLE_KEY");
            BottomSheetBehavior.E(L0().i).M(i2);
            this.Z1 = Integer.valueOf(i2);
        }
        this.j1 = true;
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getV1() {
        return this.V1;
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }
}
