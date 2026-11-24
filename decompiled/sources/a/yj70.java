package a;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/yj70;", "La/yx5;", "<init>", "()V", "domino"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class yj70 extends yx5 {
    public static final /* synthetic */ iiy[] O1 = {new j0d0(yj70.class, "binding", "getBinding()Lorg/xplatform/core/databinding/FragmentGamesGameEndedBinding;", 0)};
    public final i9o0 K1;
    public ofi L1;
    public final kiu0 M1;
    public final s0r N1;

    public yj70() {
        super(R.layout.fragment_games_game_ended);
        this.K1 = i9o0.f14396a;
        vj70 vj70Var = new vj70(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new gg70(new gg70(this, (byte) 10), (byte) 11));
        this.M1 = agc.G(this, sre0.f32672a.b(jk70.class), new ph70(a8zVarA, (byte) 6), new ph70(a8zVarA, (byte) 7), vj70Var);
        this.N1 = ltt0.o(this, wj70.f39248a);
    }

    @Override // a.yx5
    public final void C0() {
        pfi pfiVar;
        Fragment fragment = this.y;
        mzk mzkVar = fragment instanceof mzk ? (mzk) fragment : null;
        if (mzkVar == null || (pfiVar = (pfi) mzkVar.W1.getValue()) == null) {
            return;
        }
        this.L1 = (ofi) pfiVar.w0.get();
    }

    public final k0r G0() {
        Object objN = this.N1.n(O1[0], this);
        objN.getClass();
        return (k0r) objN;
    }

    public final jk70 H0() {
        return (jk70) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        final byte b = 1;
        ccq0.V(this, "NOT_ENOUGH_FUNDS", new vj70(this, (byte) 1));
        final byte b2 = 0;
        dyb.c0(G0().e, new Function1(this) { // from class: a.uj70
            public final /* synthetic */ yj70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                yj70 yj70Var = this.b;
                View view2 = (View) obj;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = yj70.O1;
                        view2.getClass();
                        jk70 jk70VarH0 = yj70Var.H0();
                        if (jk70VarH0.u.a()) {
                            jk70VarH0.y(new zj70(false));
                            jk70VarH0.f.a(true);
                            sac.V(jiu0.a(jk70VarH0), new gk70(1, jk70VarH0, jk70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, jk70VarH0.e.b, new ek70(jk70VarH0, null, (byte) 1), 10);
                        }
                        break;
                    default:
                        iiy[] iiyVarArr2 = yj70.O1;
                        view2.getClass();
                        jk70 jk70VarH1 = yj70Var.H0();
                        if (jk70VarH1.u.a()) {
                            jk70VarH1.y(new zj70(false));
                            if (jk70VarH1.h.a()) {
                                jk70VarH1.m.a();
                            }
                            sac.V(jiu0.a(jk70VarH1), dk70.f6218a, null, jk70VarH1.e.f22085a, new ek70(jk70VarH1, null, (byte) 0), 10);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.c0(G0().b, new Function1(this) { // from class: a.uj70
            public final /* synthetic */ yj70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                yj70 yj70Var = this.b;
                View view2 = (View) obj;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = yj70.O1;
                        view2.getClass();
                        jk70 jk70VarH0 = yj70Var.H0();
                        if (jk70VarH0.u.a()) {
                            jk70VarH0.y(new zj70(false));
                            jk70VarH0.f.a(true);
                            sac.V(jiu0.a(jk70VarH0), new gk70(1, jk70VarH0, jk70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, jk70VarH0.e.b, new ek70(jk70VarH0, null, (byte) 1), 10);
                        }
                        break;
                    default:
                        iiy[] iiyVarArr2 = yj70.O1;
                        view2.getClass();
                        jk70 jk70VarH1 = yj70Var.H0();
                        if (jk70VarH1.u.a()) {
                            jk70VarH1.y(new zj70(false));
                            if (jk70VarH1.h.a()) {
                                jk70VarH1.m.a();
                            }
                            sac.V(jiu0.a(jk70VarH1), dk70.f6218a, null, jk70VarH1.e.f22085a, new ek70(jk70VarH1, null, (byte) 0), 10);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        p7m0 p7m0Var = H0().y;
        xj70 xj70Var = new xj70(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new az60(p7m0Var, clzVarW, xj70Var, (yje) null), 3);
        p7m0 p7m0Var2 = H0().z;
        xj70 xj70Var2 = new xj70(this, null, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new az60(p7m0Var2, clzVarW2, xj70Var2, (yje) null, (byte) 0), 3);
        jk70 jk70VarH0 = H0();
        jk70VarH0.y(new ak70(jk70VarH0.v.f));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
