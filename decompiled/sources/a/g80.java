package a;

import android.content.ComponentCallbacks2;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/g80;", "La/bn70;", "<init>", "()V", "african_roulette"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class g80 extends bn70 {
    public static final /* synthetic */ int X1 = 0;
    public i6i U1;
    public final kiu0 V1;
    public final n0o0 W1;

    public g80() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.e80
            public final /* synthetic */ g80 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                g80 g80Var = this.b;
                switch (b2) {
                    case 0:
                        int i = g80.X1;
                        i1w0 i1w0VarF = a4n0.f(g80Var);
                        i6i i6iVar = g80Var.U1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int i2 = g80.X1;
                        ComponentCallbacks2 application = g80Var.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(g80Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(g80Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC != null) {
                            return new k6i(new qek0(), new sek(), g8iVarC);
                        }
                        hny.u("null cannot be cast to non-null type org.xplatform.core.di.GamesCoreDependencies");
                        return null;
                }
            }
        };
        final byte b2 = 1;
        a8z a8zVarA = maz.a(wez.b, new f80(new uzv0(this, (byte) 1), (byte) 0));
        this.V1 = agc.G(this, sre0.f32672a.b(to70.class), new k8(a8zVarA, (byte) 20), new k8(a8zVarA, (byte) 21), function0);
        this.W1 = maz.b(new Function0(this) { // from class: a.e80
            public final /* synthetic */ g80 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                g80 g80Var = this.b;
                switch (b3) {
                    case 0:
                        int i = g80.X1;
                        i1w0 i1w0VarF = a4n0.f(g80Var);
                        i6i i6iVar = g80Var.U1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int i2 = g80.X1;
                        ComponentCallbacks2 application = g80Var.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(g80Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(g80Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC != null) {
                            return new k6i(new qek0(), new sek(), g8iVarC);
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
        k6i k6iVar = (k6i) n0o0Var.getValue();
        this.N1 = k6iVar.f17771a.j();
        this.U1 = (i6i) k6iVar.b0.get();
        this.L1 = new db(((k6i) n0o0Var.getValue()).d);
    }

    @Override // a.bn70
    public final Fragment M0() {
        n80.U1.getClass();
        return new n80();
    }

    @Override // a.bn70
    public final void N0(AppCompatImageView appCompatImageView) {
        List list = u0d.f34849a;
        u0d.j(L0().b, "/static/img/android/games/background/africanroulete/new_back.webp", 0, 0, null, null, null, 510);
    }

    @Override // a.bn70
    public final to70 Q0() {
        return (to70) this.V1.getValue();
    }
}
