package a;

import android.content.ComponentCallbacks2;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/jgv;", "La/nw5;", "La/kgv;", "<init>", "()V", "a/gst", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class jgv extends nw5<kgv> {
    public fiu0 e2;
    public final kiu0 f2;
    public final nae0 g2;
    public static final /* synthetic */ iiy[] i2 = {new j0d0(jgv.class, "binding", "getBinding()Lorg/xplatform/popular/impl/databinding/GreetingKzDialogBinding;", 0)};
    public static final gst h2 = new gst();

    public jgv() {
        bdv bdvVar = new bdv(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new t7t(new t7t(this, (byte) 9), (byte) 11));
        this.f2 = agc.G(this, sre0.f32672a.b(mgv.class), new r6p(a8zVarA, (byte) 23), new r6p(a8zVarA, (byte) 25), bdvVar);
        this.g2 = ltt0.p(this, fgv.f9512a);
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
    public final void P0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(bgv.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            bgv bgvVar = (bgv) (ze3Var instanceof bgv ? ze3Var : null);
            if (bgvVar != null) {
                wyu wyuVar = bgvVar.f2576a;
                wyuVar.getClass();
                yzn0 yzn0Var = new yzn0();
                yzn0Var.f43523a = wyuVar;
                yzn0Var.b = new ugi(yzn0Var, (byte) 24);
                this.e2 = new fiu0(Collections.singletonMap(mgv.class, (ugi) yzn0Var.b));
                return;
            }
        }
        jf4.n(b1j.i(bgv.class, "Cannot create dependency "));
    }

    @Override // a.nw5
    public final int Q0() {
        return R.id.greetingKzDialog;
    }

    @Override // a.nw5
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public final kgv L0() {
        Object objN = this.g2.n(i2[0], this);
        objN.getClass();
        return (kgv) objN;
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
        final byte b = 0;
        dyb.O(L0().c, new Function1(this) { // from class: a.dgv
            public final /* synthetic */ jgv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                jgv jgvVar = this.b;
                View view2 = (View) obj;
                switch (b2) {
                    case 0:
                        gst gstVar = jgv.h2;
                        view2.getClass();
                        jgvVar.x0();
                        break;
                    default:
                        gst gstVar2 = jgv.h2;
                        view2.getClass();
                        j120.c0(jgvVar.o0(), "open/promo?id=1599");
                        jgvVar.x0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.O(L0().d, new Function1(this) { // from class: a.dgv
            public final /* synthetic */ jgv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                jgv jgvVar = this.b;
                View view2 = (View) obj;
                switch (b3) {
                    case 0:
                        gst gstVar = jgv.h2;
                        view2.getClass();
                        jgvVar.x0();
                        break;
                    default:
                        gst gstVar2 = jgv.h2;
                        view2.getClass();
                        j120.c0(jgvVar.o0(), "open/promo?id=1599");
                        jgvVar.x0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        p7m0 p7m0Var = ((mgv) this.f2.getValue()).b;
        pfl pflVar = new pfl(2, this, jgv.class, "handleUrlState", "handleUrlState(Ljava/lang/String;)V", 4, (byte) 21);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new hgv(p7m0Var, clzVarW, pflVar, (yje) null), 3);
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        vcc.f0(i120.U(), this, "GREETING_KZ_DIALOG_TAG");
    }
}
