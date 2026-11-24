package a;

import android.content.ComponentCallbacks2;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/ayk0;", "La/bn70;", "<init>", "()V", "spin_and_win"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ayk0 extends bn70 {
    public static final /* synthetic */ int X1 = 0;
    public i6i U1;
    public final kiu0 V1;
    public final n0o0 W1;

    public ayk0() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.zxk0
            public final /* synthetic */ ayk0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                ayk0 ayk0Var = this.b;
                switch (b2) {
                    case 0:
                        int i = ayk0.X1;
                        i1w0 i1w0VarF = a4n0.f(ayk0Var);
                        i6i i6iVar = ayk0Var.U1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int i2 = ayk0.X1;
                        ComponentCallbacks2 application = ayk0Var.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(ayk0Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(ayk0Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC != null) {
                            return new kui(new gne0((byte) 25), new sek(), g8iVarC);
                        }
                        hny.u("null cannot be cast to non-null type org.xplatform.core.di.GamesCoreDependencies");
                        return null;
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new l9i0(new l9i0(this, (byte) 27), (byte) 28));
        this.V1 = agc.G(this, sre0.f32672a.b(to70.class), new s9i0(a8zVarA, (byte) 24), new s9i0(a8zVarA, (byte) 25), function0);
        final byte b2 = 1;
        this.W1 = maz.b(new Function0(this) { // from class: a.zxk0
            public final /* synthetic */ ayk0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                ayk0 ayk0Var = this.b;
                switch (b3) {
                    case 0:
                        int i = ayk0.X1;
                        i1w0 i1w0VarF = a4n0.f(ayk0Var);
                        i6i i6iVar = ayk0Var.U1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int i2 = ayk0.X1;
                        ComponentCallbacks2 application = ayk0Var.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(ayk0Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(ayk0Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC != null) {
                            return new kui(new gne0((byte) 25), new sek(), g8iVarC);
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
        kui kuiVar = (kui) n0o0Var.getValue();
        this.N1 = kuiVar.f18911a.j();
        this.U1 = (i6i) kuiVar.b0.get();
        this.L1 = new db(((kui) n0o0Var.getValue()).d);
    }

    @Override // a.bn70
    public final Fragment M0() {
        return new hyk0();
    }

    @Override // a.bn70
    public final void N0(AppCompatImageView appCompatImageView) {
        List list = u0d.f34849a;
        u0d.j(L0().b, "/static/img/android/games/background/spinandwin/background.png", 0, 0, null, null, null, 510);
    }

    @Override // a.bn70
    public final to70 Q0() {
        return (to70) this.V1.getValue();
    }
}
