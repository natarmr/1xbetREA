package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.text.TextWatcher;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/hnc0;", "La/yx5;", "<init>", "()V", "a/xi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class hnc0 extends yx5 {
    public final i9o0 K1;
    public fiu0 L1;
    public wdk0 M1;
    public lgn0 N1;
    public final s0r O1;
    public final n0o0 P1;
    public final kiu0 Q1;
    public static final /* synthetic */ iiy[] S1 = {new j0d0(hnc0.class, "binding", "getBinding()Lorg/xplatform/toto_bet/impl/databinding/FragmentPromoBetDsTotoBetBinding;", 0)};
    public static final xi70 R1 = new xi70();

    public hnc0() {
        super(R.layout.fragment_promo_bet_ds_toto_bet);
        this.K1 = i9o0.f14396a;
        this.O1 = ltt0.o(this, fnc0.f9829a);
        final byte b = 0;
        this.P1 = maz.b(new Function0(this) { // from class: a.enc0
            public final /* synthetic */ hnc0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                hnc0 hnc0Var = this.b;
                switch (b2) {
                    case 0:
                        xi70 xi70Var = hnc0.R1;
                        return new jt6(hnc0Var, (byte) 15);
                    default:
                        fiu0 fiu0Var = hnc0Var.L1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        });
        final byte b2 = 1;
        Function0 function0 = new Function0(this) { // from class: a.enc0
            public final /* synthetic */ hnc0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                hnc0 hnc0Var = this.b;
                switch (b3) {
                    case 0:
                        xi70 xi70Var = hnc0.R1;
                        return new jt6(hnc0Var, (byte) 15);
                    default:
                        fiu0 fiu0Var = hnc0Var.L1;
                        if (fiu0Var != null) {
                            return fiu0Var;
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new g8b0(new g8b0(this, (byte) 25), (byte) 26));
        this.Q1 = agc.G(this, sre0.f32672a.b(qnc0.class), new x6b0(a8zVarA, (byte) 28), new x6b0(a8zVarA, (byte) 29), function0);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().e.a((TextWatcher) this.P1.getValue());
        dyb.O(G0().c, new ppb0(this, (byte) 22));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(kkr0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            kkr0 kkr0Var = (kkr0) (ze3Var instanceof kkr0 ? ze3Var : null);
            if (kkr0Var != null) {
                o9i o9iVarA = kkr0Var.a(a4n0.f(this));
                this.L1 = o9iVarA.e();
                this.M1 = (wdk0) o9iVarA.B;
                this.N1 = (lgn0) o9iVarA.m;
                return;
            }
        }
        jf4.n(b1j.i(kkr0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        kiu0 kiu0Var = this.Q1;
        p7m0 p7m0Var = ((qnc0) kiu0Var.getValue()).j;
        yje yjeVar = null;
        gnc0 gnc0Var = new gnc0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new p8c0(p7m0Var, clzVarW, gnc0Var, (yje) null), 3);
        gmq gmqVarS = sj3.S(((qnc0) kiu0Var.getValue()).i, 100L);
        gnc0 gnc0Var2 = new gnc0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new p8c0(gmqVarS, clzVarW2, gnc0Var2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var2 = ((qnc0) kiu0Var.getValue()).k;
        gnc0 gnc0Var3 = new gnc0(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new p8c0((gmq) p7m0Var2, clzVarW3, gnc0Var3, (yje) null, (char) 0), 3);
    }

    public final c3r G0() {
        Object objN = this.O1.n(S1[0], this);
        objN.getClass();
        return (c3r) objN;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().e.c((TextWatcher) this.P1.getValue());
        super.Z();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
