package a;

import android.content.ComponentCallbacks2;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/min;", "La/bn70;", "<init>", "()V", "eastern_nights"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class min extends bn70 {
    public static final /* synthetic */ int X1 = 0;
    public i6i U1;
    public final kiu0 V1;
    public final n0o0 W1;

    public min() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.lin
            public final /* synthetic */ min b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                min minVar = this.b;
                switch (b2) {
                    case 0:
                        int i = min.X1;
                        i1w0 i1w0VarF = a4n0.f(minVar);
                        i6i i6iVar = minVar.U1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int i2 = min.X1;
                        ComponentCallbacks2 application = minVar.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(minVar, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(minVar, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC != null) {
                            a4n0.f(minVar).getClass();
                            return new xfi(new sek(), new sek(), g8iVarC);
                        }
                        hny.u("null cannot be cast to non-null type org.xplatform.core.di.GamesCoreDependencies");
                        return null;
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new jfl(new jfl(this, (byte) 5), (byte) 6));
        this.V1 = agc.G(this, sre0.f32672a.b(to70.class), new b9k(a8zVarA, (byte) 24), new b9k(a8zVarA, (byte) 25), function0);
        final byte b2 = 1;
        this.W1 = maz.b(new Function0(this) { // from class: a.lin
            public final /* synthetic */ min b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                min minVar = this.b;
                switch (b3) {
                    case 0:
                        int i = min.X1;
                        i1w0 i1w0VarF = a4n0.f(minVar);
                        i6i i6iVar = minVar.U1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int i2 = min.X1;
                        ComponentCallbacks2 application = minVar.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(minVar, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(minVar, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC != null) {
                            a4n0.f(minVar).getClass();
                            return new xfi(new sek(), new sek(), g8iVarC);
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
        xfi xfiVar = (xfi) n0o0Var.getValue();
        this.N1 = xfiVar.f40791a.j();
        this.U1 = (i6i) xfiVar.b0.get();
        this.L1 = new r8i(((xfi) n0o0Var.getValue()).d);
    }

    @Override // a.bn70
    public final Fragment M0() {
        return new whn();
    }

    @Override // a.bn70
    public final to70 Q0() {
        return (to70) this.V1.getValue();
    }

    @Override // a.bn70
    public final void N0(AppCompatImageView appCompatImageView) {
    }
}
