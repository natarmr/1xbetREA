package a;

import android.content.ComponentCallbacks2;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.platform.app.ApplicationLoader;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/pps0;", "La/kjc0;", "<init>", "()V", "a/s2m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class pps0 extends kjc0 {
    public dki Q1;
    public final r34 R1 = new r34("Promo.Treasure.GAME_TYPE_EXTRA");
    public final kiu0 S1;
    public final n0o0 U1;
    public static final /* synthetic */ iiy[] W1 = {new ez40(pps0.class, "gameType", "getGameType()J", 0)};
    public static final s2m0 V1 = new s2m0();

    public pps0() {
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.ops0
            public final /* synthetic */ pps0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                pps0 pps0Var = this.b;
                switch (b2) {
                    case 0:
                        s2m0 s2m0Var = pps0.V1;
                        i1w0 i1w0VarF = a4n0.f(pps0Var);
                        dki dkiVar = pps0Var.Q1;
                        if (dkiVar != null) {
                            return new ry3(i1w0VarF, dkiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        s2m0 s2m0Var2 = pps0.V1;
                        ComponentCallbacks2 application = pps0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(lps0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof lps0)) {
                                ze3Var = null;
                            }
                            lps0 lps0Var = (lps0) ze3Var;
                            if (lps0Var != null) {
                                ComponentCallbacks2 application2 = pps0Var.n0().getApplication();
                                if (!(application2 instanceof vmv)) {
                                    e9d0.v(pps0Var, "Can not find dependencies provider for ");
                                    return null;
                                }
                                ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application2);
                                if (applicationLoader.c() == null) {
                                    e9d0.v(pps0Var, "Can not find dependencies provider for ");
                                    return null;
                                }
                                g8i g8iVarC = applicationLoader.c();
                                if (g8iVarC == null) {
                                    hny.u("null cannot be cast to non-null type org.xplatform.bonus_games.impl.core.di.PromoGamesDependencies");
                                    return null;
                                }
                                i1w0 i1w0VarF2 = a4n0.f(pps0Var);
                                r470 r470Var = s470.Companion;
                                long jLongValue = pps0Var.R1.n(pps0Var, pps0.W1[0]).longValue();
                                r470Var.getClass();
                                s470 s470VarA = r470.a(jLongValue);
                                i1w0VarF2.getClass();
                                snc0 snc0Var = lps0Var.f20456a;
                                wsf0 wsf0Var = lps0Var.c;
                                dnc0 dnc0Var = lps0Var.b;
                                rkc0 rkc0Var = lps0Var.d;
                                tnc0 tnc0Var = lps0Var.e;
                                fhj fhjVar = lps0Var.f;
                                snc0Var.getClass();
                                dnc0Var.getClass();
                                rkc0Var.getClass();
                                tnc0Var.getClass();
                                return new iyi(new y2m0((byte) 29), g8iVarC, wsf0Var, s470VarA, rkc0Var, tnc0Var, fhjVar);
                            }
                        }
                        jf4.n(b1j.i(lps0.class, "Cannot create dependency "));
                        return null;
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new moq0(new moq0(this, (byte) 28), (byte) 29));
        this.S1 = agc.G(this, sre0.f32672a.b(gkc0.class), new p7r0(a8zVarA, (byte) 22), new p7r0(a8zVarA, (byte) 23), function0);
        final byte b2 = 1;
        this.U1 = maz.b(new Function0(this) { // from class: a.ops0
            public final /* synthetic */ pps0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                pps0 pps0Var = this.b;
                switch (b3) {
                    case 0:
                        s2m0 s2m0Var = pps0.V1;
                        i1w0 i1w0VarF = a4n0.f(pps0Var);
                        dki dkiVar = pps0Var.Q1;
                        if (dkiVar != null) {
                            return new ry3(i1w0VarF, dkiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        s2m0 s2m0Var2 = pps0.V1;
                        ComponentCallbacks2 application = pps0Var.n0().getApplication();
                        application.getClass();
                        af3 af3Var = application instanceof af3 ? (af3) application : null;
                        if (af3Var != null) {
                            o5d0 o5d0Var = (o5d0) af3Var.d().get(lps0.class);
                            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                            if (!(ze3Var instanceof lps0)) {
                                ze3Var = null;
                            }
                            lps0 lps0Var = (lps0) ze3Var;
                            if (lps0Var != null) {
                                ComponentCallbacks2 application2 = pps0Var.n0().getApplication();
                                if (!(application2 instanceof vmv)) {
                                    e9d0.v(pps0Var, "Can not find dependencies provider for ");
                                    return null;
                                }
                                ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application2);
                                if (applicationLoader.c() == null) {
                                    e9d0.v(pps0Var, "Can not find dependencies provider for ");
                                    return null;
                                }
                                g8i g8iVarC = applicationLoader.c();
                                if (g8iVarC == null) {
                                    hny.u("null cannot be cast to non-null type org.xplatform.bonus_games.impl.core.di.PromoGamesDependencies");
                                    return null;
                                }
                                i1w0 i1w0VarF2 = a4n0.f(pps0Var);
                                r470 r470Var = s470.Companion;
                                long jLongValue = pps0Var.R1.n(pps0Var, pps0.W1[0]).longValue();
                                r470Var.getClass();
                                s470 s470VarA = r470.a(jLongValue);
                                i1w0VarF2.getClass();
                                snc0 snc0Var = lps0Var.f20456a;
                                wsf0 wsf0Var = lps0Var.c;
                                dnc0 dnc0Var = lps0Var.b;
                                rkc0 rkc0Var = lps0Var.d;
                                tnc0 tnc0Var = lps0Var.e;
                                fhj fhjVar = lps0Var.f;
                                snc0Var.getClass();
                                dnc0Var.getClass();
                                rkc0Var.getClass();
                                tnc0Var.getClass();
                                return new iyi(new y2m0((byte) 29), g8iVarC, wsf0Var, s470VarA, rkc0Var, tnc0Var, fhjVar);
                            }
                        }
                        jf4.n(b1j.i(lps0.class, "Cannot create dependency "));
                        return null;
                }
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        n0o0 n0o0Var = this.U1;
        iyi iyiVar = (iyi) n0o0Var.getValue();
        this.N1 = iyiVar.f15590a.j();
        this.Q1 = (dki) iyiVar.h.get();
        this.M1 = new kki(((iyi) n0o0Var.getValue()).g);
    }

    @Override // a.kjc0
    public final Fragment J0() {
        return new nps0();
    }

    @Override // a.kjc0
    public final gkc0 K0() {
        return (gkc0) this.S1.getValue();
    }
}
