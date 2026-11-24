package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/uvz;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class uvz extends yx5 {
    public static final /* synthetic */ iiy[] P1 = {new j0d0(uvz.class, "binding", "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentLimitsBinding;", 0)};
    public oji K1;
    public ii L1;
    public final kiu0 M1;
    public final s0r N1;
    public final n0o0 O1;

    public uvz() {
        super(R.layout.fragment_limits);
        final byte b = 0;
        Function0 function0 = new Function0(this) { // from class: a.rvz
            public final /* synthetic */ uvz b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b2 = b;
                uvz uvzVar = this.b;
                switch (b2) {
                    case 0:
                        iiy[] iiyVarArr = uvz.P1;
                        i1w0 i1w0VarF = a4n0.f(uvzVar);
                        oji ojiVar = uvzVar.K1;
                        if (ojiVar != null) {
                            return new ry3(i1w0VarF, ojiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        iiy[] iiyVarArr2 = uvz.P1;
                        svz svzVar = new svz(1, uvzVar.H0(), g500.class, "onLimitClicked", "onLimitClicked(Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;)V", 0, (byte) 0);
                        ezz ezzVar = new ezz();
                        gbn gbnVar = new gbn(new hvy((byte) 24), new tvx(3, (byte) 7), new z8z((byte) 18), gvy.f);
                        dp dpVar = ezzVar.d;
                        dpVar.b(gbnVar);
                        dpVar.b(new gbn(new hvy((byte) 20), new tvx(3, (byte) 6), new ebz(svzVar, (byte) 16), gvy.e));
                        dpVar.b(new gbn(new hvy((byte) 25), new tvx(3, (byte) 8), new z8z((byte) 19), gvy.g));
                        dpVar.b(new gbn(new gm10((byte) 4), new tvx(3, (byte) 18), new p610((byte) 19), gvy.t));
                        dpVar.b(new gbn(new gm10((byte) 20), new tvx(3, (byte) 19), new p610((byte) 20), gvy.u));
                        return ezzVar;
                }
            }
        };
        a8z a8zVarA = maz.a(wez.b, new aaw(new aaw(this, (byte) 28), (byte) 29));
        this.M1 = agc.G(this, sre0.f32672a.b(g500.class), new qwv(a8zVarA, (byte) 22), new qwv(a8zVarA, (byte) 23), function0);
        this.N1 = ltt0.o(this, tvz.f34625a);
        final byte b2 = 1;
        this.O1 = maz.b(new Function0(this) { // from class: a.rvz
            public final /* synthetic */ uvz b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                byte b3 = b2;
                uvz uvzVar = this.b;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = uvz.P1;
                        i1w0 i1w0VarF = a4n0.f(uvzVar);
                        oji ojiVar = uvzVar.K1;
                        if (ojiVar != null) {
                            return new ry3(i1w0VarF, ojiVar);
                        }
                        Intrinsics.h("viewModelFactory");
                        throw null;
                    default:
                        iiy[] iiyVarArr2 = uvz.P1;
                        svz svzVar = new svz(1, uvzVar.H0(), g500.class, "onLimitClicked", "onLimitClicked(Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;)V", 0, (byte) 0);
                        ezz ezzVar = new ezz();
                        gbn gbnVar = new gbn(new hvy((byte) 24), new tvx(3, (byte) 7), new z8z((byte) 18), gvy.f);
                        dp dpVar = ezzVar.d;
                        dpVar.b(gbnVar);
                        dpVar.b(new gbn(new hvy((byte) 20), new tvx(3, (byte) 6), new ebz(svzVar, (byte) 16), gvy.e));
                        dpVar.b(new gbn(new hvy((byte) 25), new tvx(3, (byte) 8), new z8z((byte) 19), gvy.g));
                        dpVar.b(new gbn(new gm10((byte) 4), new tvx(3, (byte) 18), new p610((byte) 19), gvy.t));
                        dpVar.b(new gbn(new gm10((byte) 20), new tvx(3, (byte) 19), new p610((byte) 20), gvy.u));
                        return ezzVar;
                }
            }
        });
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        G0().d.setAdapter((ezz) this.O1.getValue());
        G0().d.m(new kq8(G().getDimensionPixelSize(R.dimen.space_16), (byte) 0));
        G0().e.setNavigationOnClickListener(new q10(this, (byte) 29));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(vvz.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            vvz vvzVar = (vvz) (ze3Var instanceof vvz ? ze3Var : null);
            if (vvzVar != null) {
                xio xioVar = vvzVar.f38125a;
                czz czzVar = vvzVar.b;
                iw20 iw20Var = vvzVar.c;
                m1e m1eVar = vvzVar.d;
                sa10 sa10Var = vvzVar.e;
                vd1 vd1Var = vvzVar.f;
                duj dujVar = vvzVar.g;
                ii iiVar = vvzVar.k;
                dzz dzzVar = vvzVar.h;
                btt0 btt0Var = vvzVar.i;
                ctf0 ctf0Var = vvzVar.j;
                wsf0 wsf0Var = vvzVar.l;
                gii0 gii0Var = vvzVar.m;
                knf0 knf0Var = vvzVar.n;
                iiVar.getClass();
                xioVar.getClass();
                czzVar.getClass();
                m1eVar.getClass();
                dzzVar.getClass();
                btt0Var.getClass();
                ctf0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                this.K1 = (oji) ((n5d0) new nc0(iw20Var, wsf0Var, iiVar, xioVar, czzVar, m1eVar, sa10Var, vd1Var, dujVar, dzzVar, btt0Var, ctf0Var, gii0Var, knf0Var).n).get();
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(vvz.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().l;
        Class<uvz> cls = uvz.class;
        pfl pflVar = new pfl(2, this, cls, "handleLimits", "handleLimits(Ljava/util/List;)V", 4, (byte) 26);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new c6y(p7m0Var, clzVarW, pflVar, (yje) null), 3);
        p7m0 p7m0Var2 = H0().m;
        int i = 4;
        pfl pflVar2 = new pfl(2, this, cls, "handleErrorState", "handleErrorState(Lorg/xplatform/responsible_game/impl/presentation/limits/limits/LimitsViewModel$ErrorState;)V", i, (byte) 27);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new c6y((gmq) p7m0Var2, clzVarW2, pflVar2, (yje) null, (byte) 0), 3);
        p7m0 p7m0Var3 = H0().n;
        pfl pflVar3 = new pfl(2, this, cls, "showProgress", "showProgress(Z)V", i, (byte) 28);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new c6y((gmq) p7m0Var3, clzVarW3, pflVar3, (yje) null, (char) 0), 3);
        ol60 ol60Var = H0().o;
        cin cinVar = new cin(this, null, (byte) 26);
        clz clzVarW4 = aac.W(this);
        qjj.W(x0x.Q(clzVarW4.x()), null, null, new c6y(ol60Var, clzVarW4, cinVar, (yje) null), 3);
    }

    public final y0r G0() {
        Object objN = this.N1.n(P1[0], this);
        objN.getClass();
        return (y0r) objN;
    }

    public final g500 H0() {
        return (g500) this.M1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        G0().d.setAdapter(null);
        super.Z();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        super.e0();
        g500 g500VarH0 = H0();
        bby bbyVar = g500VarH0.r;
        if (bbyVar == null || !bbyVar.isActive()) {
            g500VarH0.y();
        }
    }
}
