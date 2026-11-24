package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.View;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/bbk;", "La/yx5;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bbk extends yx5 {
    public static final /* synthetic */ iiy[] O1 = {new j0d0(bbk.class, "binding", "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentConfirmDepositLimitLockScreenBinding;", 0)};
    public jfi K1;
    public ii L1;
    public final kiu0 M1;
    public final s0r N1;

    public bbk() {
        super(R.layout.fragment_confirm_deposit_limit_lock_screen);
        vak vakVar = new vak(this, (byte) 0);
        a8z a8zVarA = maz.a(wez.b, new v9k(new v9k(this, (byte) 2), (byte) 3));
        this.M1 = agc.G(this, sre0.f32672a.b(jbk.class), new b9k(a8zVarA, (byte) 4), new b9k(a8zVarA, (byte) 5), vakVar);
        this.N1 = ltt0.o(this, yak.f42303a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 0;
        Object objN = this.N1.n(O1[0], this);
        objN.getClass();
        gzq gzqVar = (gzq) objN;
        gzqVar.d.setOnClickListener(new View.OnClickListener(this) { // from class: a.wak
            public final /* synthetic */ bbk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b2 = b;
                bbk bbkVar = this.b;
                switch (b2) {
                    case 0:
                        iiy[] iiyVarArr = bbk.O1;
                        bbkVar.G0().w();
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = bbk.O1;
                        bbkVar.G0().x(pmz.APPROVE);
                        break;
                    default:
                        iiy[] iiyVarArr3 = bbk.O1;
                        bbkVar.G0().x(pmz.REJECT);
                        break;
                }
            }
        });
        final byte b2 = 1;
        gzqVar.c.setOnClickListener(new View.OnClickListener(this) { // from class: a.wak
            public final /* synthetic */ bbk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                bbk bbkVar = this.b;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = bbk.O1;
                        bbkVar.G0().w();
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = bbk.O1;
                        bbkVar.G0().x(pmz.APPROVE);
                        break;
                    default:
                        iiy[] iiyVarArr3 = bbk.O1;
                        bbkVar.G0().x(pmz.REJECT);
                        break;
                }
            }
        });
        final byte b3 = 2;
        gzqVar.b.setOnClickListener(new View.OnClickListener(this) { // from class: a.wak
            public final /* synthetic */ bbk b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b4 = b3;
                bbk bbkVar = this.b;
                switch (b4) {
                    case 0:
                        iiy[] iiyVarArr = bbk.O1;
                        bbkVar.G0().w();
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = bbk.O1;
                        bbkVar.G0().x(pmz.APPROVE);
                        break;
                    default:
                        iiy[] iiyVarArr3 = bbk.O1;
                        bbkVar.G0().x(pmz.REJECT);
                        break;
                }
            }
        });
        ccq0.V(this, "ERROR_DIALOG_REQUEST_KEY", new vak(this, (byte) 1));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(dbk.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            dbk dbkVar = (dbk) (ze3Var instanceof dbk ? ze3Var : null);
            if (dbkVar != null) {
                xio xioVar = dbkVar.f5809a;
                czz czzVar = dbkVar.b;
                ctf0 ctf0Var = dbkVar.c;
                duj dujVar = dbkVar.d;
                btt0 btt0Var = dbkVar.e;
                gii0 gii0Var = dbkVar.g;
                ii iiVar = dbkVar.f;
                dzz dzzVar = dbkVar.h;
                knf0 knf0Var = dbkVar.i;
                iiVar.getClass();
                xioVar.getClass();
                czzVar.getClass();
                ctf0Var.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                dzzVar.getClass();
                knf0Var.getClass();
                g45 g45Var = new g45();
                g45Var.f10647a = ctf0Var;
                g45Var.b = gii0Var;
                g45Var.c = dzzVar;
                g45Var.d = xioVar;
                g45Var.e = czzVar;
                g45Var.f = btt0Var;
                g45Var.g = knf0Var;
                g45Var.h = dujVar;
                g45Var.i = n0k0.a(new yei(g45Var, (byte) 11));
                this.K1 = (jfi) ((n5d0) g45Var.i).get();
                this.L1 = iiVar;
                return;
            }
        }
        jf4.n(b1j.i(dbk.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        ol60 ol60Var = G0().g;
        yje yjeVar = null;
        e9g e9gVar = new e9g(this, yjeVar, (byte) 25);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new xsj((gmq) ol60Var, clzVarW, e9gVar, (yje) null, (byte) 0), 3);
        xae0 xae0VarN = vtb.N(G0().f);
        hij hijVar = new hij(this, yjeVar, (byte) 3);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new xsj(xae0VarN, clzVarW2, hijVar, (yje) null, (byte) 0), 3);
    }

    public final jbk G0() {
        return (jbk) this.M1.getValue();
    }
}
