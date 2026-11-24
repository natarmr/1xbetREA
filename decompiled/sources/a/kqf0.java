package a;

import android.content.ComponentCallbacks2;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/kqf0;", "La/bn70;", "<init>", "()V", "resident"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class kqf0 extends bn70 {
    public static final /* synthetic */ int X1 = 0;
    public i6i U1;
    public final kiu0 V1;
    public final n0o0 W1;

    public kqf0() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.jqf0
            public final /* synthetic */ kqf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                kqf0 kqf0Var = this.b;
                switch (b2) {
                    case 0:
                        int i = kqf0.X1;
                        i1w0 i1w0VarF = a4n0.f(kqf0Var);
                        i6i i6iVar = kqf0Var.U1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int i2 = kqf0.X1;
                        ComponentCallbacks2 application = kqf0Var.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(kqf0Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(kqf0Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC != null) {
                            return new wri(new zie0(), new sek(), g8iVarC);
                        }
                        hny.u("null cannot be cast to non-null type org.xplatform.core.di.GamesCoreDependencies");
                        return null;
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new lce0(new lce0(this, (byte) 19), (byte) 20));
        this.V1 = agc.G(this, sre0.f32672a.b(to70.class), new wbe0(a8zVarA, (byte) 20), new wbe0(a8zVarA, (byte) 21), function0);
        final byte b2 = 1;
        this.W1 = maz.b(new Function0(this) { // from class: a.jqf0
            public final /* synthetic */ kqf0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                kqf0 kqf0Var = this.b;
                switch (b3) {
                    case 0:
                        int i = kqf0.X1;
                        i1w0 i1w0VarF = a4n0.f(kqf0Var);
                        i6i i6iVar = kqf0Var.U1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int i2 = kqf0.X1;
                        ComponentCallbacks2 application = kqf0Var.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(kqf0Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(kqf0Var, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC != null) {
                            return new wri(new zie0(), new sek(), g8iVarC);
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
        wri wriVar = (wri) n0o0Var.getValue();
        this.N1 = wriVar.f39644a.j();
        this.U1 = (i6i) wriVar.b0.get();
        this.L1 = new r8i(((wri) n0o0Var.getValue()).d);
    }

    @Override // a.bn70
    public final Fragment M0() {
        return new vof0();
    }

    @Override // a.bn70
    public final to70 Q0() {
        return (to70) this.V1.getValue();
    }

    @Override // a.bn70
    public final void N0(AppCompatImageView appCompatImageView) {
    }
}
