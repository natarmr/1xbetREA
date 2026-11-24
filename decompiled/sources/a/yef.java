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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/yef;", "La/bn70;", "<init>", "()V", "crystal"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class yef extends bn70 {
    public static final /* synthetic */ int X1 = 0;
    public i6i U1;
    public final kiu0 V1;
    public final a8z W1;

    public yef() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.xef
            public final /* synthetic */ yef b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                yef yefVar = this.b;
                switch (b2) {
                    case 0:
                        int i = yef.X1;
                        i1w0 i1w0VarF = a4n0.f(yefVar);
                        i6i i6iVar = yefVar.U1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int i2 = yef.X1;
                        ComponentCallbacks2 application = yefVar.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(yefVar, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(yefVar, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC != null) {
                            a4n0.f(yefVar).getClass();
                            return new qdi(new sek(), g8iVarC);
                        }
                        hny.u("null cannot be cast to non-null type org.xplatform.core.di.GamesCoreDependencies");
                        return null;
                }
            }
        };
        aqe aqeVar = new aqe(this, (byte) 16);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new aqe(aqeVar, (byte) 17));
        this.V1 = agc.G(this, sre0.f32672a.b(to70.class), new cce(a8zVarA, (byte) 16), new cce(a8zVarA, (byte) 17), function0);
        final byte b2 = 1;
        this.W1 = maz.a(wezVar, new Function0(this) { // from class: a.xef
            public final /* synthetic */ yef b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                yef yefVar = this.b;
                switch (b3) {
                    case 0:
                        int i = yef.X1;
                        i1w0 i1w0VarF = a4n0.f(yefVar);
                        i6i i6iVar = yefVar.U1;
                        if (i6iVar != null) {
                            return new ry3(i1w0VarF, i6iVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int i2 = yef.X1;
                        ComponentCallbacks2 application = yefVar.n0().getApplication();
                        if (!(application instanceof vmv)) {
                            e9d0.v(yefVar, "Can not find dependencies provider for ");
                            return null;
                        }
                        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
                        if (applicationLoader.c() == null) {
                            e9d0.v(yefVar, "Can not find dependencies provider for ");
                            return null;
                        }
                        g8i g8iVarC = applicationLoader.c();
                        if (g8iVarC != null) {
                            a4n0.f(yefVar).getClass();
                            return new qdi(new sek(), g8iVarC);
                        }
                        hny.u("null cannot be cast to non-null type org.xplatform.core.di.GamesCoreDependencies");
                        return null;
                }
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        a8z a8zVar = this.W1;
        qdi qdiVar = (qdi) a8zVar.getValue();
        this.N1 = qdiVar.f28534a.j();
        this.U1 = (i6i) qdiVar.a0.get();
        this.L1 = new r8i(((qdi) a8zVar.getValue()).c);
    }

    @Override // a.bn70
    public final Fragment M0() {
        cff.P1.getClass();
        return new cff();
    }

    @Override // a.bn70
    public final void N0(AppCompatImageView appCompatImageView) {
        List list = u0d.f34849a;
        u0d.j(L0().b, "/static/img/android/games/background/crystal/background_new.webp", 0, 0, null, null, null, 510);
    }

    @Override // a.bn70
    public final to70 Q0() {
        return (to70) this.V1.getValue();
    }
}
