package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import org.platform.app.ApplicationLoader;
import org.xbet.client1.R;
import org.xplatform.core.navigation.dialog.DialogScreen;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/k6y;", "La/yx5;", "<init>", "()V", "a/sqt", "jackpot"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class k6y extends yx5 {
    public final hnm0 K1;
    public final e9o0 L1;
    public fji M1;
    public ii N1;
    public final kiu0 O1;
    public final s0r P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(k6y.class, "viewBinding", "getViewBinding()Lorg/xplatform/games_section/feature/jackpot/databinding/FragmentOneXGamesJackpotFgBinding;", 0)};
    public static final sqt Q1 = new sqt();

    public k6y() {
        super(R.layout.fragment_one_x_games_jackpot_fg);
        this.K1 = hnm0.f13359a;
        bp3 bp3Var = bp3.b;
        this.L1 = new e9o0(R.attr.uikitStaticBlack, R.attr.uikitStaticBlack, bp3Var, bp3Var);
        g6y g6yVar = new g6y(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new aaw(new aaw(this, (byte) 6), (byte) 7));
        this.O1 = agc.G(this, sre0.f32672a.b(t6y.class), new qwv(a8zVarA, (byte) 18), new qwv(a8zVarA, (byte) 19), g6yVar);
        this.P1 = ltt0.o(this, j6y.f16013a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 0;
        qcc.X(this, new g6y(this, b));
        G0().k.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: a.h6y
            public final /* synthetic */ k6y b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                k6y k6yVar = this.b;
                switch (b2) {
                    case 0:
                        sqt sqtVar = k6y.Q1;
                        k6yVar.H0().w();
                        break;
                    default:
                        sqt sqtVar2 = k6y.Q1;
                        t6y t6yVarH0 = k6yVar.H0();
                        i1w0 i1w0Var = t6yVarH0.g;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        FragmentScreen fragmentScreenD = t6yVarH0.f.d();
                        if (fragmentScreenD instanceof DialogScreen) {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenD)));
                        } else {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenD)));
                        }
                        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                }
            }
        });
        final byte b2 = 1;
        G0().g.setOnClickListener(new View.OnClickListener(this) { // from class: a.h6y
            public final /* synthetic */ k6y b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                k6y k6yVar = this.b;
                switch (b3) {
                    case 0:
                        sqt sqtVar = k6y.Q1;
                        k6yVar.H0().w();
                        break;
                    default:
                        sqt sqtVar2 = k6y.Q1;
                        t6y t6yVarH0 = k6yVar.H0();
                        i1w0 i1w0Var = t6yVarH0.g;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        FragmentScreen fragmentScreenD = t6yVarH0.f.d();
                        if (fragmentScreenD instanceof DialogScreen) {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new e1w0((DialogScreen) fragmentScreenD)));
                        } else {
                            copyOnWriteArrayListQ.add(new c8d(y7d.f42146a, new w0w0(fragmentScreenD)));
                        }
                        ListIterator listIteratorO = b1j.o(i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorO;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                }
            }
        });
        t6y t6yVarH0 = H0();
        slb.U(ulb.L(new fnq(t6yVarH0.d.b(), new u88(t6yVarH0, null, (byte) 23), (byte) 4), t6yVarH0.h.b), jiu0.a(t6yVarH0));
        ccq0.V(this, "CHANGE_BONUS_BALANCE_TO_PRIMARY_KEY", new g6y(this, (byte) 2));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        if (!(application instanceof vmv)) {
            e9d0.v(this, "Can not find dependencies provider for ");
            return;
        }
        ApplicationLoader applicationLoader = (ApplicationLoader) ((vmv) application);
        if (applicationLoader.c() == null) {
            e9d0.v(this, "Can not find dependencies provider for ");
            return;
        }
        g8i g8iVarC = applicationLoader.c();
        if (g8iVarC == null) {
            hny.u("null cannot be cast to non-null type org.xplatform.core.di.dependencies.JackPotDependencies");
            return;
        }
        rqt rqtVar = new rqt();
        i1w0 i1w0VarF = a4n0.f(this);
        i1w0VarF.getClass();
        this.M1 = (fji) ((n5d0) new mii0(rqtVar, g8iVarC, i1w0VarF).d).get();
        this.N1 = g8iVarC.j();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().n;
        yje yjeVar = null;
        i6y i6yVar = new i6y(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new c6y(p7m0Var, clzVarW, i6yVar, (yje) null), 3);
        p7m0 p7m0Var2 = H0().o;
        i6y i6yVar2 = new i6y(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new c6y((gmq) p7m0Var2, clzVarW2, i6yVar2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var3 = H0().p;
        i6y i6yVar3 = new i6y(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new c6y((gmq) p7m0Var3, clzVarW3, i6yVar3, (yje) null, (char) 0), 3);
        ol60 ol60Var = H0().q;
        i6y i6yVar4 = new i6y(this, yjeVar, (byte) 3);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new c6y(ol60Var, clzVarW4, i6yVar4, (yje) null, 0), 3);
    }

    public final j2r G0() {
        Object objN = this.P1.n(R1[0], this);
        objN.getClass();
        return (j2r) objN;
    }

    public final t6y H0() {
        return (t6y) this.O1.getValue();
    }

    public final void I0(boolean z) {
        G0().d.setVisibility(!z ? 0 : 8);
        G0().h.setVisibility(z ? 0 : 8);
        G0().e.setVisibility(z ? 0 : 8);
        G0().b.setVisibility(z ? 0 : 8);
        G0().j.setVisibility(z ? 0 : 8);
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void g0() {
        super.g0();
        t6y t6yVarH0 = H0();
        sac.V(jiu0.a(t6yVarH0), new g1y(1, t6yVarH0.i, duj.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, t6yVarH0.h.b, new s6y(t6yVarH0, null), 10);
    }

    @Override // a.yx5
    public final jnm0 y0() {
        return this.K1;
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.L1;
    }
}
