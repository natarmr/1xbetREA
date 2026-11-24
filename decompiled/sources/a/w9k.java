package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/w9k;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class w9k extends yx5 {
    public static final /* synthetic */ iiy[] P1 = {new j0d0(w9k.class, "binding", "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentLimitsDepositRsBinding;", 0)};
    public ifi K1;
    public ii L1;
    public final kiu0 M1;
    public final a8z N1;
    public final s0r O1;

    public w9k() {
        super(R.layout.fragment_limits_deposit_rs);
        r9k r9kVar = new r9k(this, (byte) 0);
        v9k v9kVar = new v9k(this, (byte) 0);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new v9k(v9kVar, (byte) 1));
        this.M1 = agc.G(this, sre0.f32672a.b(iak.class), new b9k(a8zVarA, (byte) 2), new b9k(a8zVarA, (byte) 3), r9kVar);
        this.N1 = maz.a(wezVar, new r9k(this, (byte) 1));
        this.O1 = ltt0.o(this, t9k.f33567a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        G0().g.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: a.s9k
            public final /* synthetic */ w9k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                w9k w9kVar = this.b;
                switch (b2) {
                    case 0:
                        iiy[] iiyVarArr = w9k.P1;
                        w9kVar.H0().x(cak.f4015a);
                        break;
                    default:
                        iiy[] iiyVarArr2 = w9k.P1;
                        i1w0 i1w0Var = w9kVar.H0().b;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
                        break;
                }
            }
        });
        ccq0.V(this, "SET_LIMIT_REQUEST_KEY", new r9k(this, (byte) 2));
        final byte b2 = 0;
        wn8 wn8Var = new wn8(epv0.U(R.drawable.divider_drawable, o0()), (byte) 0);
        G0().f.setAdapter((q9k) this.N1.getValue());
        G0().f.m(wn8Var);
        G0().b.setOnClickListener(new View.OnClickListener(this) { // from class: a.s9k
            public final /* synthetic */ w9k b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                w9k w9kVar = this.b;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = w9k.P1;
                        w9kVar.H0().x(cak.f4015a);
                        break;
                    default:
                        iiy[] iiyVarArr2 = w9k.P1;
                        i1w0 i1w0Var = w9kVar.H0().b;
                        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
                        while (true) {
                            paw pawVar = (paw) listIteratorP;
                            if (pawVar.hasNext()) {
                                i1w0Var.a((oe50) pawVar.next());
                            }
                            break;
                        }
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(x9k.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            x9k x9kVar = (x9k) (ze3Var instanceof x9k ? ze3Var : null);
            if (x9kVar != null) {
                ctf0 ctf0Var = x9kVar.f40512a;
                sa10 sa10Var = x9kVar.b;
                xio xioVar = x9kVar.c;
                czz czzVar = x9kVar.d;
                ii iiVar = x9kVar.e;
                dzz dzzVar = x9kVar.f;
                knf0 knf0Var = x9kVar.g;
                wsf0 wsf0Var = x9kVar.i;
                btt0 btt0Var = x9kVar.h;
                gii0 gii0Var = x9kVar.j;
                iiVar.getClass();
                ctf0Var.getClass();
                xioVar.getClass();
                czzVar.getClass();
                dzzVar.getClass();
                knf0Var.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                ru ruVar = new ru();
                ruVar.f31100a = gii0Var;
                ruVar.b = dzzVar;
                ruVar.c = xioVar;
                ruVar.d = czzVar;
                ruVar.f = btt0Var;
                ruVar.g = knf0Var;
                ruVar.h = wsf0Var;
                ruVar.e = ctf0Var;
                ruVar.i = sa10Var;
                ruVar.j = n0k0.a(new yei(ruVar, (byte) 10));
                this.K1 = (ifi) ((n5d0) ruVar.j).get();
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(x9k.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().n;
        yje yjeVar = null;
        u9k u9kVar = new u9k(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new xsj(p7m0Var, clzVarW, u9kVar, (yje) null), 3);
        p7m0 p7m0Var2 = H0().o;
        u9k u9kVar2 = new u9k(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new xsj((gmq) p7m0Var2, clzVarW2, u9kVar2, (yje) null, (byte) 0), 3);
        ol60 ol60Var = H0().p;
        u9k u9kVar3 = new u9k(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new xsj((gmq) ol60Var, clzVarW3, u9kVar3, (yje) null, (char) 0), 3);
    }

    public final a1r G0() {
        Object objN = this.O1.n(P1[0], this);
        objN.getClass();
        return (a1r) objN;
    }

    public final iak H0() {
        return (iak) this.M1.getValue();
    }
}
