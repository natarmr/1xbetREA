package a;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.WindowMetrics;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/al10;", "La/bn70;", "<init>", "()V", "lucky_wheel"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class al10 extends bn70 {
    public static final int[] Z1 = {R.id.game_holder_toolbar, R.id.onex_holder_game_container, R.id.onex_holder_end_game_container};
    public final e9o0 U1;
    public final inm0 V1;
    public i6i W1;
    public final kiu0 X1;
    public final n0o0 Y1;

    public al10() {
        bp3 bp3Var = bp3.b;
        this.U1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitStaticBlack, bp3Var, bp3Var);
        this.V1 = inm0.f15081a;
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.zk10
            public final /* synthetic */ al10 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                al10 al10Var = this.b;
                switch (b2) {
                    case 0:
                        int[] iArr = al10.Z1;
                        i1w0 i1w0VarF = a4n0.f(al10Var);
                        i6i i6iVar = al10Var.W1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int[] iArr2 = al10.Z1;
                        ComponentCallbacks2 application = al10Var.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(al10Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(al10Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC == null) {
                            hny.u("null cannot be cast to non-null type org.xplatform.core.di.dependencies.LuckyWheelDependencies");
                            return null;
                        }
                        atz atzVar = new atz();
                        i1w0 i1w0VarF2 = a4n0.f(al10Var);
                        i1w0VarF2.getClass();
                        return new pki(atzVar, new sek(), g8iVarC, i1w0VarF2);
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new be00(new be00(this, (byte) 18), (byte) 19));
        this.X1 = agc.G(this, sre0.f32672a.b(to70.class), new j210(a8zVarA, (byte) 10), new j210(a8zVarA, (byte) 11), function0);
        final byte b2 = 1;
        this.Y1 = maz.b(new Function0(this) { // from class: a.zk10
            public final /* synthetic */ al10 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                al10 al10Var = this.b;
                switch (b3) {
                    case 0:
                        int[] iArr = al10.Z1;
                        i1w0 i1w0VarF = a4n0.f(al10Var);
                        i6i i6iVar = al10Var.W1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int[] iArr2 = al10.Z1;
                        ComponentCallbacks2 application = al10Var.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(al10Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(al10Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC == null) {
                            hny.u("null cannot be cast to non-null type org.xplatform.core.di.dependencies.LuckyWheelDependencies");
                            return null;
                        }
                        atz atzVar = new atz();
                        i1w0 i1w0VarF2 = a4n0.f(al10Var);
                        i1w0VarF2.getClass();
                        return new pki(atzVar, new sek(), g8iVarC, i1w0VarF2);
                }
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        n0o0 n0o0Var = this.Y1;
        pki pkiVar = (pki) n0o0Var.getValue();
        this.N1 = pkiVar.f27135a.j();
        this.W1 = (i6i) pkiVar.c0.get();
        this.L1 = new mki(((pki) n0o0Var.getValue()).e);
    }

    @Override // a.bn70
    public final Fragment M0() {
        return new fm10();
    }

    @Override // a.bn70
    public final void O0(AppCompatImageView appCompatImageView, km60 km60Var) {
        int iWidth;
        if (km60Var != null) {
            boolean z = km60Var.f18524a;
            List list = u0d.f34849a;
            String str = z ? "/NewYear" : "";
            Context contextO0 = o0();
            if (Build.VERSION.SDK_INT >= 30) {
                WindowMetrics currentWindowMetrics = ((WindowManager) contextO0.getSystemService(WindowManager.class)).getCurrentWindowMetrics();
                currentWindowMetrics.getClass();
                iWidth = currentWindowMetrics.getBounds().width();
            } else {
                iWidth = contextO0.getResources().getDisplayMetrics().widthPixels;
            }
            u0d.j(appCompatImageView, ua80.i("/static/img/android/games/resforgames/luckywheel", str, iWidth < 1080 ? "/small" : "/large", "/background.webp"), z ? R.drawable.game_lucky_wheel_ny_placeholder : R.drawable.game_lucky_wheel_placeholder, 0, null, null, null, 508);
        }
    }

    @Override // a.bn70
    /* JADX INFO: renamed from: P0, reason: from getter */
    public final e9o0 getU1() {
        return this.U1;
    }

    @Override // a.bn70
    public final to70 Q0() {
        return (to70) this.X1.getValue();
    }

    @Override // a.bn70, a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        hny hnyVar = new hny((byte) 8);
        WeakHashMap weakHashMap = rgu0.f30456a;
        igu0.c(view, hnyVar);
        view.requestApplyInsets();
    }

    @Override // a.bn70, a.yx5
    public final jnm0 y0() {
        return this.V1;
    }

    @Override // a.bn70, a.yx5
    public final j9o0 z0() {
        return this.U1;
    }

    @Override // a.bn70
    public final void H0() {
    }

    @Override // a.bn70
    public final void J0() {
    }

    @Override // a.bn70
    public final void G0(boolean z) {
    }

    @Override // a.bn70
    public final void N0(AppCompatImageView appCompatImageView) {
    }
}
