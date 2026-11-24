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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/igv;", "La/qw5;", "La/m7b0;", "<init>", "()V", "a/bst", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class igv extends qw5<m7b0> {
    public fiu0 b2;
    public final kiu0 c2;
    public final nae0 d2;
    public static final /* synthetic */ iiy[] f2 = {new j0d0(igv.class, "binding", "getBinding()Lorg/xplatform/popular_classic/impl/databinding/PopularClassicGreetingKzDialogBinding;", 0)};
    public static final bst e2 = new bst();

    public igv() {
        bdv bdvVar = new bdv(this, (byte) 2);
        a8z a8zVarA = maz.a(wez.b, new t7t(new t7t(this, (byte) 8), (byte) 10));
        this.c2 = agc.G(this, sre0.f32672a.b(lgv.class), new r6p(a8zVarA, (byte) 22), new r6p(a8zVarA, (byte) 24), bdvVar);
        this.d2 = ltt0.p(this, egv.f7780a);
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
    public final void N0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(agv.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            agv agvVar = (agv) (ze3Var instanceof agv ? ze3Var : null);
            if (agvVar != null) {
                wyu wyuVar = agvVar.f844a;
                wyuVar.getClass();
                this.b2 = new fiu0(Collections.singletonMap(lgv.class, (ugi) new ehf0(wyuVar).c));
                return;
            }
        }
        jf4.n(b1j.i(agv.class, "Cannot create dependency "));
    }

    @Override // a.qw5
    public final int O0() {
        return R.id.greetingKzDialog;
    }

    @Override // a.qw5
    /* JADX INFO: renamed from: Q0, reason: merged with bridge method [inline-methods] */
    public final m7b0 J0() {
        Object objN = this.d2.n(f2[0], this);
        objN.getClass();
        return (m7b0) objN;
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
        final byte b = 0;
        dyb.O(J0().c, new Function1(this) { // from class: a.cgv
            public final /* synthetic */ igv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                igv igvVar = this.b;
                View view2 = (View) obj;
                switch (b2) {
                    case 0:
                        bst bstVar = igv.e2;
                        view2.getClass();
                        igvVar.x0();
                        break;
                    default:
                        bst bstVar2 = igv.e2;
                        view2.getClass();
                        j120.c0(igvVar.o0(), "open/promo?id=1599");
                        igvVar.x0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.O(J0().d, new Function1(this) { // from class: a.cgv
            public final /* synthetic */ igv b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                igv igvVar = this.b;
                View view2 = (View) obj;
                switch (b3) {
                    case 0:
                        bst bstVar = igv.e2;
                        view2.getClass();
                        igvVar.x0();
                        break;
                    default:
                        bst bstVar2 = igv.e2;
                        view2.getClass();
                        j120.c0(igvVar.o0(), "open/promo?id=1599");
                        igvVar.x0();
                        break;
                }
                return Unit.f46060a;
            }
        });
        p7m0 p7m0Var = ((lgv) this.c2.getValue()).b;
        pfl pflVar = new pfl(2, this, igv.class, "handleUrlState", "handleUrlState(Ljava/lang/String;)V", 4, (byte) 20);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new fns(p7m0Var, clzVarW, pflVar, (yje) null, 0), 3);
    }

    @Override // a.sik, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        vcc.f0(i120.U(), this, "GREETING_KZ_DIALOG_TAG");
    }
}
