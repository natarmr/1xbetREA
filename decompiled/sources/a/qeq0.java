package a;

import android.content.ComponentCallbacks2;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/qeq0;", "La/bn70;", "<init>", "()V", "a/g9m0", "tile_matching"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qeq0 extends bn70 {
    public final r34 U1 = new r34("TileMatching.GAME_TYPE_EXTRA");
    public i6i V1;
    public final kiu0 W1;
    public final n0o0 X1;
    public static final /* synthetic */ iiy[] Z1 = {new ez40(qeq0.class, "gameTypeExtra", "getGameTypeExtra()J", 0)};
    public static final g9m0 Y1 = new g9m0();

    public qeq0() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.peq0
            public final /* synthetic */ qeq0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                qeq0 qeq0Var = this.b;
                switch (b2) {
                    case 0:
                        g9m0 g9m0Var = qeq0.Y1;
                        i1w0 i1w0VarF = a4n0.f(qeq0Var);
                        i6i i6iVar = qeq0Var.V1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        g9m0 g9m0Var2 = qeq0.Y1;
                        ComponentCallbacks2 application = qeq0Var.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(qeq0Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(qeq0Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC == null) {
                            hny.u("null cannot be cast to non-null type org.xplatform.core.di.GamesCoreDependencies");
                            return null;
                        }
                        s2m0 s2m0Var = new s2m0();
                        r470 r470Var = s470.Companion;
                        long jLongValue = qeq0Var.U1.n(qeq0Var, qeq0.Z1[0]).longValue();
                        r470Var.getClass();
                        return new gxi(s2m0Var, new sek(), g8iVarC, r470.a(jLongValue));
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new mfo0(new mfo0(this, (byte) 21), (byte) 22));
        this.W1 = agc.G(this, sre0.f32672a.b(to70.class), new r5p0(a8zVarA, (byte) 14), new r5p0(a8zVarA, (byte) 15), function0);
        final byte b2 = 1;
        this.X1 = maz.b(new Function0(this) { // from class: a.peq0
            public final /* synthetic */ qeq0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                qeq0 qeq0Var = this.b;
                switch (b3) {
                    case 0:
                        g9m0 g9m0Var = qeq0.Y1;
                        i1w0 i1w0VarF = a4n0.f(qeq0Var);
                        i6i i6iVar = qeq0Var.V1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        g9m0 g9m0Var2 = qeq0.Y1;
                        ComponentCallbacks2 application = qeq0Var.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(qeq0Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(qeq0Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC == null) {
                            hny.u("null cannot be cast to non-null type org.xplatform.core.di.GamesCoreDependencies");
                            return null;
                        }
                        s2m0 s2m0Var = new s2m0();
                        r470 r470Var = s470.Companion;
                        long jLongValue = qeq0Var.U1.n(qeq0Var, qeq0.Z1[0]).longValue();
                        r470Var.getClass();
                        return new gxi(s2m0Var, new sek(), g8iVarC, r470.a(jLongValue));
                }
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        n0o0 n0o0Var = this.X1;
        gxi gxiVar = (gxi) n0o0Var.getValue();
        this.N1 = gxiVar.f12079a.j();
        this.V1 = (i6i) gxiVar.c0.get();
        this.L1 = new dxi(((gxi) n0o0Var.getValue()).e);
    }

    @Override // a.bn70
    public final void H0() {
        I0(R.id.onex_holder_end_game_container, new geq0());
    }

    @Override // a.bn70
    public final Fragment M0() {
        weq0.Q1.getClass();
        return new weq0();
    }

    @Override // a.bn70
    public final to70 Q0() {
        return (to70) this.W1.getValue();
    }

    @Override // a.bn70
    public final void N0(AppCompatImageView appCompatImageView) {
    }
}
