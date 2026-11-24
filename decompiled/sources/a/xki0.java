package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/xki0;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class xki0 extends yx5 {
    public static final /* synthetic */ iiy[] P1 = {new j0d0(xki0.class, "binding", "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentLimitsSessionTimeBinding;", 0)};
    public nti K1;
    public ii L1;
    public final kiu0 M1;
    public final a8z N1;
    public final s0r O1;

    public xki0() {
        super(R.layout.fragment_limits_session_time);
        tki0 tki0Var = new tki0(this, (byte) 0);
        l9i0 l9i0Var = new l9i0(this, (byte) 6);
        wez wezVar = wez.b;
        a8z a8zVarA = maz.a(wezVar, new l9i0(l9i0Var, (byte) 7));
        this.M1 = agc.G(this, sre0.f32672a.b(imi0.class), new s9i0(a8zVarA, (byte) 4), new s9i0(a8zVarA, (byte) 5), tki0Var);
        this.N1 = maz.a(wezVar, new tki0(this, (byte) 1));
        this.O1 = ltt0.o(this, vki0.f37575a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        G0().g.setNavigationOnClickListener(new View.OnClickListener(this) { // from class: a.ski0
            public final /* synthetic */ xki0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                xki0 xki0Var = this.b;
                switch (b2) {
                    case 0:
                        iiy[] iiyVarArr = xki0.P1;
                        xki0Var.H0().y(cmi0.f4606a);
                        break;
                    default:
                        iiy[] iiyVarArr2 = xki0.P1;
                        i1w0 i1w0Var = xki0Var.H0().b;
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
        ccq0.V(this, "SET_LIMIT_REQUEST_KEY", new tki0(this, (byte) 2));
        final byte b2 = 0;
        wn8 wn8Var = new wn8(epv0.U(R.drawable.divider_drawable, o0()), (byte) 0);
        G0().f.setAdapter((lki0) this.N1.getValue());
        G0().f.m(wn8Var);
        G0().b.setOnClickListener(new View.OnClickListener(this) { // from class: a.ski0
            public final /* synthetic */ xki0 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                xki0 xki0Var = this.b;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = xki0.P1;
                        xki0Var.H0().y(cmi0.f4606a);
                        break;
                    default:
                        iiy[] iiyVarArr2 = xki0.P1;
                        i1w0 i1w0Var = xki0Var.H0().b;
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(yki0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            yki0 yki0Var = (yki0) (ze3Var instanceof yki0 ? ze3Var : null);
            if (yki0Var != null) {
                ctf0 ctf0Var = yki0Var.f42790a;
                sa10 sa10Var = yki0Var.b;
                xio xioVar = yki0Var.c;
                czz czzVar = yki0Var.d;
                dzz dzzVar = yki0Var.e;
                ii iiVar = yki0Var.g;
                btt0 btt0Var = yki0Var.f;
                gii0 gii0Var = yki0Var.h;
                knf0 knf0Var = yki0Var.i;
                iiVar.getClass();
                ctf0Var.getClass();
                xioVar.getClass();
                czzVar.getClass();
                dzzVar.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                knf0Var.getClass();
                g45 g45Var = new g45();
                g45Var.f10647a = gii0Var;
                g45Var.b = dzzVar;
                g45Var.c = xioVar;
                g45Var.d = czzVar;
                g45Var.e = btt0Var;
                g45Var.f = knf0Var;
                g45Var.g = ctf0Var;
                g45Var.h = sa10Var;
                g45Var.i = n0k0.a(new fri(g45Var, (byte) 28));
                this.K1 = (nti) ((n5d0) g45Var.i).get();
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(yki0.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = H0().l;
        yje yjeVar = null;
        wki0 wki0Var = new wki0(this, yjeVar, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new r7i0(p7m0Var, clzVarW, wki0Var, (yje) null), 3);
        p7m0 p7m0Var2 = H0().m;
        wki0 wki0Var2 = new wki0(this, yjeVar, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new r7i0(p7m0Var2, clzVarW2, wki0Var2, (yje) null, (byte) 0), 3);
        ol60 ol60Var = H0().n;
        wki0 wki0Var3 = new wki0(this, yjeVar, (byte) 2);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new r7i0((gmq) ol60Var, clzVarW3, wki0Var3, (yje) null, (char) 0), 3);
    }

    public final c1r G0() {
        Object objN = this.O1.n(P1[0], this);
        objN.getClass();
        return (c1r) objN;
    }

    public final imi0 H0() {
        return (imi0) this.M1.getValue();
    }
}
