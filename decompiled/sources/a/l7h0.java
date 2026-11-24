package a;

import android.content.ComponentCallbacks2;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/l7h0;", "La/bn70;", "<init>", "()V", "scratch_card"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class l7h0 extends bn70 {
    public static final /* synthetic */ int X1 = 0;
    public i6i U1;
    public final kiu0 V1;
    public final n0o0 W1;

    public l7h0() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.k7h0
            public final /* synthetic */ l7h0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                l7h0 l7h0Var = this.b;
                switch (b2) {
                    case 0:
                        int i = l7h0.X1;
                        i1w0 i1w0VarF = a4n0.f(l7h0Var);
                        i6i i6iVar = l7h0Var.U1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int i2 = l7h0.X1;
                        ComponentCallbacks2 application = l7h0Var.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(l7h0Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(l7h0Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC != null) {
                            return new qsi(new eke0(), new sek(), g8iVarC);
                        }
                        hny.u("null cannot be cast to non-null type org.xplatform.core.di.GamesCoreDependencies");
                        return null;
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new yxf0(new yxf0(this, (byte) 16), (byte) 17));
        this.V1 = agc.G(this, sre0.f32672a.b(to70.class), new fxf0(a8zVarA, (byte) 18), new fxf0(a8zVarA, (byte) 19), function0);
        final byte b2 = 1;
        this.W1 = maz.b(new Function0(this) { // from class: a.k7h0
            public final /* synthetic */ l7h0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                l7h0 l7h0Var = this.b;
                switch (b3) {
                    case 0:
                        int i = l7h0.X1;
                        i1w0 i1w0VarF = a4n0.f(l7h0Var);
                        i6i i6iVar = l7h0Var.U1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int i2 = l7h0.X1;
                        ComponentCallbacks2 application = l7h0Var.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(l7h0Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(l7h0Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC != null) {
                            return new qsi(new eke0(), new sek(), g8iVarC);
                        }
                        hny.u("null cannot be cast to non-null type org.xplatform.core.di.GamesCoreDependencies");
                        return null;
                }
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        n0o0 n0o0Var = this.W1;
        qsi qsiVar = (qsi) n0o0Var.getValue();
        this.N1 = qsiVar.f29259a.j();
        this.U1 = (i6i) qsiVar.b0.get();
        this.L1 = new r8i(((qsi) n0o0Var.getValue()).d);
    }

    @Override // a.bn70
    public final Fragment M0() {
        return new l6h0();
    }

    @Override // a.bn70
    public final to70 Q0() {
        return (to70) this.V1.getValue();
    }

    @Override // a.bn70
    public final void N0(AppCompatImageView appCompatImageView) {
    }
}
