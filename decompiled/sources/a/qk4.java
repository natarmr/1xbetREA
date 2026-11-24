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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/qk4;", "La/nw5;", "La/rk4;", "<init>", "()V", "a/jdk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qk4 extends nw5<rk4> {
    public fiu0 e2;
    public wdk0 f2;
    public final nae0 g2 = ltt0.p(this, mk4.f21925a);
    public final kiu0 h2;
    public static final /* synthetic */ iiy[] j2 = {new j0d0(qk4.class, "binding", "getBinding()Lorg/xplatform/popular/impl/databinding/AuthOfferDialogBinding;", 0)};
    public static final jdk0 i2 = new jdk0();

    public qk4() {
        a13 a13Var = new a13(this, (byte) 27);
        a8z a8zVarA = maz.a(wez.b, new f80(new f80(this, (byte) 27), (byte) 29));
        this.h2 = agc.G(this, sre0.f32672a.b(il4.class), new t51(a8zVarA, (byte) 19), new t51(a8zVarA, (byte) 21), a13Var);
    }

    @Override // a.sik
    public final int B0() {
        return R.style.ThemeOverlay_AppTheme_BottomSheetDialog;
    }

    @Override // a.nw5
    public final int I0() {
        return R.attr.uikitBackgroundContent;
    }

    @Override // a.nw5
    public final void O0() {
        final byte b = 0;
        dyb.O(L0().e, new Function1(this) { // from class: a.kk4
            public final /* synthetic */ qk4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                xk4 xk4Var = xk4.f41013a;
                qk4 qk4Var = this.b;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        jdk0 jdk0Var = qk4.i2;
                        view.getClass();
                        il4 il4VarU0 = qk4Var.U0();
                        il4VarU0.b.a("reg_page_call", wp20.b(new Pair("screen", "popup_enter_anonim")));
                        sac.V(jiu0.a(il4VarU0), new b33(il4VarU0, (byte) 18), null, il4VarU0.e.c, new wa(il4VarU0, null, (byte) 13), 10);
                        break;
                    case 1:
                        jdk0 jdk0Var2 = qk4.i2;
                        view.getClass();
                        il4 il4VarU1 = qk4Var.U0();
                        il4VarU1.b.c("popup_enter_close_button");
                        il4VarU1.f.f15516a.a(xun.f41520a, 3134L);
                        p7m0 p7m0Var = il4VarU1.h;
                        p7m0Var.getClass();
                        p7m0Var.o(null, xk4Var);
                        break;
                    default:
                        jdk0 jdk0Var3 = qk4.i2;
                        view.getClass();
                        il4 il4VarU2 = qk4Var.U0();
                        i8i.D("screen", "popup_enter_anonim", il4VarU2.b, "login_page_call");
                        i1w0 i1w0Var = il4VarU2.c;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (!pawVar.hasNext()) {
                                p7m0 p7m0Var2 = il4VarU2.h;
                                p7m0Var2.getClass();
                                p7m0Var2.o(null, xk4Var);
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
        dyb.O(L0().b, new Function1(this) { // from class: a.kk4
            public final /* synthetic */ qk4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                xk4 xk4Var = xk4.f41013a;
                qk4 qk4Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        jdk0 jdk0Var = qk4.i2;
                        view.getClass();
                        il4 il4VarU0 = qk4Var.U0();
                        il4VarU0.b.a("reg_page_call", wp20.b(new Pair("screen", "popup_enter_anonim")));
                        sac.V(jiu0.a(il4VarU0), new b33(il4VarU0, (byte) 18), null, il4VarU0.e.c, new wa(il4VarU0, null, (byte) 13), 10);
                        break;
                    case 1:
                        jdk0 jdk0Var2 = qk4.i2;
                        view.getClass();
                        il4 il4VarU1 = qk4Var.U0();
                        il4VarU1.b.c("popup_enter_close_button");
                        il4VarU1.f.f15516a.a(xun.f41520a, 3134L);
                        p7m0 p7m0Var = il4VarU1.h;
                        p7m0Var.getClass();
                        p7m0Var.o(null, xk4Var);
                        break;
                    default:
                        jdk0 jdk0Var3 = qk4.i2;
                        view.getClass();
                        il4 il4VarU2 = qk4Var.U0();
                        i8i.D("screen", "popup_enter_anonim", il4VarU2.b, "login_page_call");
                        i1w0 i1w0Var = il4VarU2.c;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (!pawVar.hasNext()) {
                                p7m0 p7m0Var2 = il4VarU2.h;
                                p7m0Var2.getClass();
                                p7m0Var2.o(null, xk4Var);
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
        dyb.O(L0().d, new Function1(this) { // from class: a.kk4
            public final /* synthetic */ qk4 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                xk4 xk4Var = xk4.f41013a;
                qk4 qk4Var = this.b;
                View view = (View) obj;
                switch (b4) {
                    case 0:
                        jdk0 jdk0Var = qk4.i2;
                        view.getClass();
                        il4 il4VarU0 = qk4Var.U0();
                        il4VarU0.b.a("reg_page_call", wp20.b(new Pair("screen", "popup_enter_anonim")));
                        sac.V(jiu0.a(il4VarU0), new b33(il4VarU0, (byte) 18), null, il4VarU0.e.c, new wa(il4VarU0, null, (byte) 13), 10);
                        break;
                    case 1:
                        jdk0 jdk0Var2 = qk4.i2;
                        view.getClass();
                        il4 il4VarU1 = qk4Var.U0();
                        il4VarU1.b.c("popup_enter_close_button");
                        il4VarU1.f.f15516a.a(xun.f41520a, 3134L);
                        p7m0 p7m0Var = il4VarU1.h;
                        p7m0Var.getClass();
                        p7m0Var.o(null, xk4Var);
                        break;
                    default:
                        jdk0 jdk0Var3 = qk4.i2;
                        view.getClass();
                        il4 il4VarU2 = qk4Var.U0();
                        i8i.D("screen", "popup_enter_anonim", il4VarU2.b, "login_page_call");
                        i1w0 i1w0Var = il4VarU2.c;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = rz4.p(wez.b, rz4.g(copyOnWriteArrayListQ, new c8d(y7d.f42146a, n0w0.f22721a)), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (!pawVar.hasNext()) {
                                p7m0 p7m0Var2 = il4VarU2.h;
                                p7m0Var2.getClass();
                                p7m0Var2.o(null, xk4Var);
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

    @Override // a.nw5
    public final void P0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(tk4.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            tk4 tk4Var = (tk4) (ze3Var instanceof tk4 ? ze3Var : null);
            if (tk4Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                wyu wyuVar = tk4Var.b;
                duj dujVar = tk4Var.c;
                kt2 kt2Var = tk4Var.d;
                cad cadVar = tk4Var.f34076a;
                pru pruVar = tk4Var.e;
                d1p d1pVar = tk4Var.g;
                wdk0 wdk0Var = tk4Var.f;
                v6j0 v6j0Var = tk4Var.h;
                yk50 yk50Var = tk4Var.i;
                gst0 gst0Var = tk4Var.j;
                d1pVar.getClass();
                wyuVar.getClass();
                kt2Var.getClass();
                wdk0Var.getClass();
                v6j0Var.getClass();
                gst0Var.getClass();
                ru ruVar = new ru();
                ruVar.f31100a = v6j0Var;
                ruVar.c = yk50Var;
                ruVar.d = kt2Var;
                ruVar.e = i1w0VarF;
                ruVar.b = dujVar;
                ruVar.f = cadVar;
                ruVar.g = d1pVar;
                ruVar.h = gst0Var;
                ruVar.i = pruVar;
                ruVar.j = new n8i(ruVar, (byte) 7);
                this.e2 = new fiu0(Collections.singletonMap(il4.class, (n8i) ruVar.j));
                this.f2 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(tk4.class, "Cannot create dependency "));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.authOfferDialog;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final rk4 L0() {
        Object objN = this.g2.n(j2[0], this);
        objN.getClass();
        return (rk4) objN;
    }

    public final il4 U0() {
        return (il4) this.h2.getValue();
    }

    @Override // a.sik, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        BottomSheetBehavior bottomSheetBehaviorM0 = M0();
        if (bottomSheetBehaviorM0 != null) {
            bottomSheetBehaviorM0.K = true;
        }
        J0();
    }

    @Override // a.nw5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        lr lrVar = new lr(U0().g, (byte) 23);
        ok4 ok4Var = new ok4(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new ac4(lrVar, clzVarW, ok4Var, (yje) null), 3);
        p7m0 p7m0Var = U0().h;
        ok4 ok4Var2 = new ok4(this, null, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new ac4(p7m0Var, clzVarW2, ok4Var2, (yje) null), 3);
    }

    @Override // a.sik, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        il4 il4VarU0 = U0();
        il4VarU0.b.c("popup_enter_miss_click");
        il4VarU0.f.f15516a.a(xun.f41520a, 3133L);
    }
}
