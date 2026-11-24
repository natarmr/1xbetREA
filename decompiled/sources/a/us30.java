package a;

import android.content.ComponentCallbacks2;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/us30;", "La/kjc0;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class us30 extends kjc0 {
    public static final /* synthetic */ int U1 = 0;
    public dki Q1;
    public final kiu0 R1;
    public final n0o0 S1;

    public us30() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.ts30
            public final /* synthetic */ us30 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                us30 us30Var = this.b;
                switch (b2) {
                    case 0:
                        int i = us30.U1;
                        i1w0 i1w0VarF = a4n0.f(us30Var);
                        dki dkiVar = us30Var.Q1;
                        if (dkiVar != null) {
                            return new ry3(i1w0VarF, dkiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int i2 = us30.U1;
                        ComponentCallbacks2 application = us30Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(pr30.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof pr30)) {
                                ze3Var = null;
                            }
                            pr30 pr30Var = (pr30) ze3Var;
                            if (pr30Var != null) {
                                ComponentCallbacks2 application2 = us30Var.n0().getApplication();
                                if (!(application2 instanceof vmv)) {
                                    e9d0.v(us30Var, "Can not find dependencies provider for ");
                                    return null;
                                }
                                ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application2);
                                if (applicationLoader.c() == null) {
                                    e9d0.v(us30Var, "Can not find dependencies provider for ");
                                    return null;
                                }
                                g8i g8iVarC = applicationLoader.c();
                                if (g8iVarC == null) {
                                    hny.u("null cannot be cast to non-null type org.xplatform.bonus_games.impl.core.di.PromoGamesDependencies");
                                    return null;
                                }
                                a4n0.f(us30Var).getClass();
                                wsf0 wsf0Var = pr30Var.d;
                                snc0 snc0Var = pr30Var.f27446a;
                                dnc0 dnc0Var = pr30Var.b;
                                rkc0 rkc0Var = pr30Var.c;
                                tnc0 tnc0Var = pr30Var.e;
                                fhj fhjVar = pr30Var.f;
                                snc0Var.getClass();
                                dnc0Var.getClass();
                                rkc0Var.getClass();
                                tnc0Var.getClass();
                                return new nli(new evz(), g8iVarC, wsf0Var, rkc0Var, tnc0Var, fhjVar);
                            }
                        }
                        jf4.n(b1j.i(pr30.class, "Cannot create dependency "));
                        return null;
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new pv10(new pv10(this, (byte) 23), (byte) 24));
        this.R1 = agc.G(this, sre0.f32672a.b(gkc0.class), new y620(a8zVarA, (byte) 14), new y620(a8zVarA, (byte) 15), function0);
        final byte b2 = 1;
        this.S1 = maz.b(new Function0(this) { // from class: a.ts30
            public final /* synthetic */ us30 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                us30 us30Var = this.b;
                switch (b3) {
                    case 0:
                        int i = us30.U1;
                        i1w0 i1w0VarF = a4n0.f(us30Var);
                        dki dkiVar = us30Var.Q1;
                        if (dkiVar != null) {
                            return new ry3(i1w0VarF, dkiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        int i2 = us30.U1;
                        ComponentCallbacks2 application = us30Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(pr30.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof pr30)) {
                                ze3Var = null;
                            }
                            pr30 pr30Var = (pr30) ze3Var;
                            if (pr30Var != null) {
                                ComponentCallbacks2 application2 = us30Var.n0().getApplication();
                                if (!(application2 instanceof vmv)) {
                                    e9d0.v(us30Var, "Can not find dependencies provider for ");
                                    return null;
                                }
                                ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application2);
                                if (applicationLoader.c() == null) {
                                    e9d0.v(us30Var, "Can not find dependencies provider for ");
                                    return null;
                                }
                                g8i g8iVarC = applicationLoader.c();
                                if (g8iVarC == null) {
                                    hny.u("null cannot be cast to non-null type org.xplatform.bonus_games.impl.core.di.PromoGamesDependencies");
                                    return null;
                                }
                                a4n0.f(us30Var).getClass();
                                wsf0 wsf0Var = pr30Var.d;
                                snc0 snc0Var = pr30Var.f27446a;
                                dnc0 dnc0Var = pr30Var.b;
                                rkc0 rkc0Var = pr30Var.c;
                                tnc0 tnc0Var = pr30Var.e;
                                fhj fhjVar = pr30Var.f;
                                snc0Var.getClass();
                                dnc0Var.getClass();
                                rkc0Var.getClass();
                                tnc0Var.getClass();
                                return new nli(new evz(), g8iVarC, wsf0Var, rkc0Var, tnc0Var, fhjVar);
                            }
                        }
                        jf4.n(b1j.i(pr30.class, "Cannot create dependency "));
                        return null;
                }
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        n0o0 n0o0Var = this.S1;
        nli nliVar = (nli) n0o0Var.getValue();
        this.N1 = nliVar.f23729a.j();
        this.Q1 = (dki) nliVar.g.get();
        this.M1 = new kki(((nli) n0o0Var.getValue()).f);
    }

    @Override // a.kjc0
    public final Fragment J0() {
        return new sr30();
    }

    @Override // a.kjc0
    public final gkc0 K0() {
        return (gkc0) this.R1.getValue();
    }
}
