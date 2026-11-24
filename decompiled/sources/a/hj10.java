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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/hj10;", "La/bn70;", "<init>", "()V", "lucky_card"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hj10 extends bn70 {
    public static final /* synthetic */ int X1 = 0;
    public i6i U1;
    public final kiu0 V1;
    public final n0o0 W1;

    public hj10() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.gj10
            public final /* synthetic */ hj10 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                hj10 hj10Var = this.b;
                switch (b2) {
                    case 0:
                        int i = hj10.X1;
                        i1w0 i1w0VarF = a4n0.f(hj10Var);
                        i6i i6iVar = hj10Var.U1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int i2 = hj10.X1;
                        ComponentCallbacks2 application = hj10Var.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(hj10Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(hj10Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC != null) {
                            return new lki(new evz(), new sek(), g8iVarC);
                        }
                        hny.u("null cannot be cast to non-null type org.xplatform.core.di.GamesCoreDependencies");
                        return null;
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new be00(new be00(this, (byte) 14), (byte) 15));
        this.V1 = agc.G(this, sre0.f32672a.b(to70.class), new j210(a8zVarA, (byte) 6), new j210(a8zVarA, (byte) 7), function0);
        final byte b2 = 1;
        this.W1 = maz.b(new Function0(this) { // from class: a.gj10
            public final /* synthetic */ hj10 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                hj10 hj10Var = this.b;
                switch (b3) {
                    case 0:
                        int i = hj10.X1;
                        i1w0 i1w0VarF = a4n0.f(hj10Var);
                        i6i i6iVar = hj10Var.U1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int i2 = hj10.X1;
                        ComponentCallbacks2 application = hj10Var.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(hj10Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(hj10Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC != null) {
                            return new lki(new evz(), new sek(), g8iVarC);
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
        lki lkiVar = (lki) n0o0Var.getValue();
        this.N1 = lkiVar.f20204a.j();
        this.U1 = (i6i) lkiVar.b0.get();
        this.L1 = new r8i(((lki) n0o0Var.getValue()).d);
    }

    @Override // a.bn70
    public final Fragment M0() {
        return new lj10();
    }

    @Override // a.bn70
    public final void N0(AppCompatImageView appCompatImageView) {
        List list = u0d.f34849a;
        u0d.j(L0().b, "/static/img/android/games/background/luckycard/background.webp", 0, 0, null, null, null, 510);
    }

    @Override // a.bn70
    public final to70 Q0() {
        return (to70) this.V1.getValue();
    }
}
