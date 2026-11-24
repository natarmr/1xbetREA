package a;

import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Collections;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/pk4;", "La/qw5;", "La/w3b0;", "<init>", "()V", "a/hfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pk4 extends qw5<w3b0> {
    public final kiu0 b2;
    public fiu0 c2;
    public wdk0 d2;
    public final nae0 e2;
    public static final /* synthetic */ iiy[] g2 = {new j0d0(pk4.class, "binding", "getBinding()Lorg/xplatform/popular_classic/impl/databinding/PopularClassicAuthOfferDialogBinding;", 0)};
    public static final hfk0 f2 = new hfk0((byte) 26);

    public pk4() {
        a13 a13Var = new a13(this, (byte) 26);
        a8z a8zVarA = maz.a(wez.b, new f80(new f80(this, (byte) 26), (byte) 28));
        this.b2 = agc.G(this, sre0.f32672a.b(hl4.class), new t51(a8zVarA, (byte) 18), new t51(a8zVarA, (byte) 20), a13Var);
        this.e2 = ltt0.p(this, lk4.f20180a);
    }

    @Override // a.sik
    public final int B0() {
        return R.style.ThemeOverlay_AppTheme_BottomSheetDialog;
    }

    @Override // a.qw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.qw5
    public final void M0() {
        final byte b = 0;
        dyb.O(J0().e, new Function1(this) { // from class: a.jk4
            public final /* synthetic */ pk4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                wk4 wk4Var = wk4.f39291a;
                pk4 pk4Var = this.b;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        hfk0 hfk0Var = pk4.f2;
                        view.getClass();
                        hl4 hl4VarR0 = pk4Var.R0();
                        hl4VarR0.b.a("reg_page_call", wp20.b(new Pair("screen", "popup_enter_anonim")));
                        sac.V(jiu0.a(hl4VarR0), new b33(hl4VarR0, (byte) 17), null, hl4VarR0.e.c, new wa(hl4VarR0, null, (byte) 12), 10);
                        break;
                    case 1:
                        hfk0 hfk0Var2 = pk4.f2;
                        view.getClass();
                        hl4 hl4VarR1 = pk4Var.R0();
                        hl4VarR1.b.c("popup_enter_close_button");
                        hl4VarR1.f.f15516a.a(xun.f41520a, 3134L);
                        p7m0 p7m0Var = hl4VarR1.h;
                        p7m0Var.getClass();
                        p7m0Var.o(null, wk4Var);
                        break;
                    default:
                        hfk0 hfk0Var3 = pk4.f2;
                        view.getClass();
                        hl4 hl4VarR2 = pk4Var.R0();
                        i8i.D("screen", "popup_enter_anonim", hl4VarR2.b, "login_page_call");
                        i1w0 i1w0Var = hl4VarR2.c;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (!pawVar.hasNext()) {
                                p7m0 p7m0Var2 = hl4VarR2.h;
                                p7m0Var2.getClass();
                                p7m0Var2.o(null, wk4Var);
                            } else {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.O(J0().b, new Function1(this) { // from class: a.jk4
            public final /* synthetic */ pk4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                wk4 wk4Var = wk4.f39291a;
                pk4 pk4Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        hfk0 hfk0Var = pk4.f2;
                        view.getClass();
                        hl4 hl4VarR0 = pk4Var.R0();
                        hl4VarR0.b.a("reg_page_call", wp20.b(new Pair("screen", "popup_enter_anonim")));
                        sac.V(jiu0.a(hl4VarR0), new b33(hl4VarR0, (byte) 17), null, hl4VarR0.e.c, new wa(hl4VarR0, null, (byte) 12), 10);
                        break;
                    case 1:
                        hfk0 hfk0Var2 = pk4.f2;
                        view.getClass();
                        hl4 hl4VarR1 = pk4Var.R0();
                        hl4VarR1.b.c("popup_enter_close_button");
                        hl4VarR1.f.f15516a.a(xun.f41520a, 3134L);
                        p7m0 p7m0Var = hl4VarR1.h;
                        p7m0Var.getClass();
                        p7m0Var.o(null, wk4Var);
                        break;
                    default:
                        hfk0 hfk0Var3 = pk4.f2;
                        view.getClass();
                        hl4 hl4VarR2 = pk4Var.R0();
                        i8i.D("screen", "popup_enter_anonim", hl4VarR2.b, "login_page_call");
                        i1w0 i1w0Var = hl4VarR2.c;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (!pawVar.hasNext()) {
                                p7m0 p7m0Var2 = hl4VarR2.h;
                                p7m0Var2.getClass();
                                p7m0Var2.o(null, wk4Var);
                            } else {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b3 = 2;
        dyb.O(J0().d, new Function1(this) { // from class: a.jk4
            public final /* synthetic */ pk4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                wk4 wk4Var = wk4.f39291a;
                pk4 pk4Var = this.b;
                View view = (View) obj;
                switch (b4) {
                    case 0:
                        hfk0 hfk0Var = pk4.f2;
                        view.getClass();
                        hl4 hl4VarR0 = pk4Var.R0();
                        hl4VarR0.b.a("reg_page_call", wp20.b(new Pair("screen", "popup_enter_anonim")));
                        sac.V(jiu0.a(hl4VarR0), new b33(hl4VarR0, (byte) 17), null, hl4VarR0.e.c, new wa(hl4VarR0, null, (byte) 12), 10);
                        break;
                    case 1:
                        hfk0 hfk0Var2 = pk4.f2;
                        view.getClass();
                        hl4 hl4VarR1 = pk4Var.R0();
                        hl4VarR1.b.c("popup_enter_close_button");
                        hl4VarR1.f.f15516a.a(xun.f41520a, 3134L);
                        p7m0 p7m0Var = hl4VarR1.h;
                        p7m0Var.getClass();
                        p7m0Var.o(null, wk4Var);
                        break;
                    default:
                        hfk0 hfk0Var3 = pk4.f2;
                        view.getClass();
                        hl4 hl4VarR2 = pk4Var.R0();
                        i8i.D("screen", "popup_enter_anonim", hl4VarR2.b, "login_page_call");
                        i1w0 i1w0Var = hl4VarR2.c;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (!pawVar.hasNext()) {
                                p7m0 p7m0Var2 = hl4VarR2.h;
                                p7m0Var2.getClass();
                                p7m0Var2.o(null, wk4Var);
                            } else {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.qw5
    public final void N0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(sk4.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            sk4 sk4Var = (sk4) (ze3Var instanceof sk4 ? ze3Var : null);
            if (sk4Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                uyu uyuVar = sk4Var.b;
                wyu wyuVar = sk4Var.c;
                duj dujVar = sk4Var.d;
                kt2 kt2Var = sk4Var.e;
                cad cadVar = sk4Var.f32329a;
                pru pruVar = sk4Var.f;
                d1p d1pVar = sk4Var.h;
                wdk0 wdk0Var = sk4Var.g;
                d1pVar.getClass();
                wyuVar.getClass();
                kt2Var.getClass();
                wdk0Var.getClass();
                g45 g45Var = new g45();
                g45Var.f10647a = wyuVar;
                g45Var.b = uyuVar;
                g45Var.c = kt2Var;
                g45Var.d = i1w0VarF;
                g45Var.e = dujVar;
                g45Var.f = cadVar;
                g45Var.g = d1pVar;
                g45Var.h = pruVar;
                g45Var.i = new n8i(g45Var, (byte) 6);
                this.c2 = new fiu0(Collections.singletonMap(hl4.class, (n8i) g45Var.i));
                this.d2 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(sk4.class, "Cannot create dependency "));
    }

    @Override // a.qw5
    public final int O0() {
        return R.id.authOfferDialog;
    }

    @Override // a.qw5
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final w3b0 J0() {
        Object objN = this.e2.n(g2[0], this);
        objN.getClass();
        return (w3b0) objN;
    }

    public final hl4 R0() {
        return (hl4) this.b2.getValue();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        BottomSheetBehavior bottomSheetBehaviorK0 = K0();
        if (bottomSheetBehaviorK0 != null) {
            bottomSheetBehaviorK0.K = true;
        }
        BottomSheetBehavior bottomSheetBehaviorK1 = K0();
        if (bottomSheetBehaviorK1 != null) {
            bottomSheetBehaviorK1.N(3);
        }
    }

    @Override // a.qw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        p7m0 p7m0Var = R0().g;
        nk4 nk4Var = new nk4(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new ac4(p7m0Var, clzVarW, nk4Var, (yje) null), 3);
        p7m0 p7m0Var2 = R0().h;
        nk4 nk4Var2 = new nk4(this, null, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new ac4((gmq) p7m0Var2, clzVarW2, nk4Var2, (yje) null, (byte) 0), 3);
    }

    @Override // a.sik, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        hl4 hl4VarR0 = R0();
        hl4VarR0.b.c("popup_enter_miss_click");
        hl4VarR0.f.f15516a.a(xun.f41520a, 3133L);
    }
}
