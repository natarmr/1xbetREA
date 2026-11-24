package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/c9k;", "La/yx5;", "<init>", "()V", "a/nwd", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c9k extends yx5 {
    public hfi K1;
    public ii L1;
    public final kiu0 M1;
    public final a8z N1;
    public final zz2 O1;
    public final s0r P1;
    public static final /* synthetic */ iiy[] R1 = {new ez40(c9k.class, "limitType", "getLimitType()I", 0), new j0d0(c9k.class, "binding", "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentLimitsDepositRsBinding;", 0)};
    public static final nwd Q1 = new nwd();

    public c9k() {
        super(R.layout.fragment_limits_deposit_rs);
        x8k x8kVar = new x8k(this, (byte) 0);
        q7g q7gVar = new q7g(this, (byte) 28);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new q7g(q7gVar, (byte) 29));
        this.M1 = agc.G(this, sre0.f32672a.b(p9k.class), new b9k(a8zVarA, (byte) 0), new b9k(a8zVarA, (byte) 1), x8kVar);
        this.N1 = maz.a(wezVar, new x8k(this, (byte) 1));
        this.O1 = new zz2("LIMIT_TYPE");
        this.P1 = ltt0.o(this, z8k.f43970a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        G0().g.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: a.y8k
            public final /* synthetic */ c9k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                c9k c9kVar = this.b;
                switch (b2) {
                    case 0:
                        nwd nwdVar = c9k.Q1;
                        c9kVar.H0().y(j9k.f16143a);
                        break;
                    default:
                        nwd nwdVar2 = c9k.Q1;
                        c9kVar.H0().x();
                        break;
                }
            }
        });
        ccq0.V(this, "SET_LIMIT_REQUEST_KEY", new x8k(this, (byte) 2));
        ccq0.V(this, "LIMIT_ACCEPTED_REQUEST_KEY", new x8k(this, (byte) 3));
        final byte b2 = 0;
        wn8 wn8Var = new wn8(epv0.U(R.drawable.divider_drawable, o0()), (byte) 0);
        G0().f.setAdapter((w8k) this.N1.getValue());
        G0().f.m(wn8Var);
        G0().b.setOnClickListener(new View.OnClickListener(this) { // from class: a.y8k
            public final /* synthetic */ c9k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                c9k c9kVar = this.b;
                switch (b3) {
                    case 0:
                        nwd nwdVar = c9k.Q1;
                        c9kVar.H0().y(j9k.f16143a);
                        break;
                    default:
                        nwd nwdVar2 = c9k.Q1;
                        c9kVar.H0().x();
                        break;
                }
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(d9k.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            d9k d9kVar = (d9k) (ze3Var instanceof d9k ? ze3Var : null);
            if (d9kVar != null) {
                Integer numN = this.O1.n(this, R1[0]);
                ctf0 ctf0Var = d9kVar.f5704a;
                sa10 sa10Var = d9kVar.b;
                wsf0 wsf0Var = d9kVar.c;
                xio xioVar = d9kVar.d;
                czz czzVar = d9kVar.e;
                ii iiVar = d9kVar.f;
                dzz dzzVar = d9kVar.g;
                knf0 knf0Var = d9kVar.h;
                btt0 btt0Var = d9kVar.i;
                gii0 gii0Var = d9kVar.j;
                iiVar.getClass();
                ctf0Var.getClass();
                xioVar.getClass();
                czzVar.getClass();
                dzzVar.getClass();
                knf0Var.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                this.K1 = (hfi) ((n5d0) new o3c(wsf0Var, iiVar, ctf0Var, sa10Var, xioVar, czzVar, dzzVar, knf0Var, btt0Var, gii0Var, numN).k).get();
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(d9k.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().o;
        a9k a9kVar = new a9k(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new xsj(p7m0Var, clzVarW, a9kVar, (yje) null), 3);
        p7m0 p7m0Var2 = H0().p;
        a9k a9kVar2 = new a9k(this, null, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new xsj((gmq) p7m0Var2, clzVarW2, a9kVar2, (yje) null, (byte) 0), 3);
        ol60 ol60Var = H0().q;
        a9k a9kVar3 = new a9k(this, null, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new xsj((gmq) ol60Var, clzVarW3, a9kVar3, (yje) null, (char) 0), 3);
    }

    public final a1r G0() {
        Object objN = this.P1.n(R1[1], this);
        objN.getClass();
        return (a1r) objN;
    }

    public final p9k H0() {
        return (p9k) this.M1.getValue();
    }
}
