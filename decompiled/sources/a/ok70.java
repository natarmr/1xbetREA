package a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/ok70;", "La/yx5;", "<init>", "()V", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class ok70 extends yx5 {
    public static final /* synthetic */ iiy[] O1 = {new j0d0(ok70.class, "binding", "getBinding()Lorg/xplatform/core/databinding/FragmentGamesGameEndedBinding;", 0)};
    public final i9o0 K1;
    public v6i L1;
    public final kiu0 M1;
    public final s0r N1;

    public ok70() {
        super(R.layout.fragment_games_game_ended);
        this.K1 = i9o0.f14396a;
        lk70 lk70Var = new lk70(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new gg70(new gg70(this, (byte) 12), (byte) 13));
        this.M1 = agc.G(this, sre0.f32672a.b(yk70.class), new ph70(a8zVarA, (byte) 8), new ph70(a8zVarA, (byte) 9), lk70Var);
        this.N1 = ltt0.o(this, mk70.f21932a);
    }

    @Override // a.yx5
    public final void C0() {
        h5t h5tVar;
        Fragment fragment = this.y;
        bn70 bn70Var = fragment instanceof bn70 ? (bn70) fragment : null;
        if (bn70Var == null || (h5tVar = bn70Var.L1) == null) {
            return;
        }
        h5tVar.o(this);
    }

    public final k0r G0() {
        Object objN = this.N1.n(O1[0], this);
        objN.getClass();
        return (k0r) objN;
    }

    public final yk70 H0() {
        return (yk70) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        final byte b = 1;
        ccq0.V(this, "NOT_ENOUGH_FUNDS", new lk70(this, b));
        final byte b2 = 0;
        dyb.c0(G0().e, new Function1(this) { // from class: a.kk70
            public final /* synthetic */ ok70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                ok70 ok70Var = this.b;
                View view2 = (View) obj;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = ok70.O1;
                        view2.getClass();
                        yk70 yk70VarH0 = ok70Var.H0();
                        if (yk70VarH0.u.a()) {
                            yk70VarH0.y(new pk70(false));
                            yk70VarH0.f.a(true);
                            sac.V(jiu0.a(yk70VarH0), new gk70(1, yk70VarH0, yk70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, yk70VarH0.e.b, new uk70(yk70VarH0, null, (byte) 1), 10);
                        }
                        break;
                    default:
                        iiy[] iiyVarArr2 = ok70.O1;
                        view2.getClass();
                        yk70 yk70VarH1 = ok70Var.H0();
                        if (yk70VarH1.u.a()) {
                            yk70VarH1.y(new pk70(false));
                            if (yk70VarH1.h.a()) {
                                yk70VarH1.m.a();
                            }
                            sac.V(jiu0.a(yk70VarH1), tk70.f34081a, null, yk70VarH1.e.f22085a, new uk70(yk70VarH1, null, (byte) 0), 10);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.c0(G0().b, new Function1(this) { // from class: a.kk70
            public final /* synthetic */ ok70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                ok70 ok70Var = this.b;
                View view2 = (View) obj;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = ok70.O1;
                        view2.getClass();
                        yk70 yk70VarH0 = ok70Var.H0();
                        if (yk70VarH0.u.a()) {
                            yk70VarH0.y(new pk70(false));
                            yk70VarH0.f.a(true);
                            sac.V(jiu0.a(yk70VarH0), new gk70(1, yk70VarH0, yk70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, yk70VarH0.e.b, new uk70(yk70VarH0, null, (byte) 1), 10);
                        }
                        break;
                    default:
                        iiy[] iiyVarArr2 = ok70.O1;
                        view2.getClass();
                        yk70 yk70VarH1 = ok70Var.H0();
                        if (yk70VarH1.u.a()) {
                            yk70VarH1.y(new pk70(false));
                            if (yk70VarH1.h.a()) {
                                yk70VarH1.m.a();
                            }
                            sac.V(jiu0.a(yk70VarH1), tk70.f34081a, null, yk70VarH1.e.f22085a, new uk70(yk70VarH1, null, (byte) 0), 10);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        p7m0 p7m0Var = H0().x;
        nk70 nk70Var = new nk70(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new az60(p7m0Var, clzVarW, nk70Var, (yje) null), 3);
        p7m0 p7m0Var2 = H0().y;
        nk70 nk70Var2 = new nk70(this, null, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new az60(p7m0Var2, clzVarW2, nk70Var2, (yje) null, (byte) 0), 3);
        yk70 yk70VarH0 = H0();
        yk70VarH0.y(new qk70(yk70VarH0.v.f));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
