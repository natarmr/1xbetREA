package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/b84;", "La/yx5;", "<init>", "()V", "a/gfk0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b84 extends yx5 {
    public final cgx0 K1;
    public fiu0 L1;
    public wdk0 M1;
    public final s0r N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(b84.class, "showNavigationBarBundle", "getShowNavigationBarBundle()Z", 0), new j0d0(b84.class, "binding", "getBinding()Lorg/xplatform/auth_history/impl/databinding/FragmentAuthHistoryComposeBinding;", 0)};
    public static final gfk0 P1 = new gfk0((byte) 25);

    public b84() {
        super(R.layout.fragment_auth_history_compose);
        this.K1 = new cgx0("SHOW_NAVIGATION_BAR_BUNDLE", true);
        this.N1 = ltt0.o(this, a84.f406a);
        this.O1 = xbc.b0(this, sre0.f32672a.b(l94.class), new a13(this, (byte) 22));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        Object objN = this.N1.n(Q1[1], this);
        objN.getClass();
        pkd.i(((dyq) objN).f6906a, new shd((byte) 15), new ugd(-820744538, true, new fa2((Object) this, (byte) 9)));
        final byte b2 = 0;
        sj3.s0(this, "REQUEST_EXIT_ALL_SESSIONS_DIALOG_KEY", new Function1(this) { // from class: a.z74
            public final /* synthetic */ b84 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                b84 b84Var = this.b;
                switch (b3) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        gfk0 gfk0Var = b84.P1;
                        if (zBooleanValue) {
                            b84Var.G0().x(y64.f42078a);
                        }
                        break;
                    default:
                        String str = (String) obj;
                        gfk0 gfk0Var2 = b84.P1;
                        str.getClass();
                        b84Var.G0().x(new z64(str));
                        break;
                }
                return Unit.f46060a;
            }
        });
        sj3.s0(this, "REQUEST_EXIT_SESSION_DIALOG_KEY", new Function1(this) { // from class: a.z74
            public final /* synthetic */ b84 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b;
                b84 b84Var = this.b;
                switch (b3) {
                    case 0:
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        gfk0 gfk0Var = b84.P1;
                        if (zBooleanValue) {
                            b84Var.G0().x(y64.f42078a);
                        }
                        break;
                    default:
                        String str = (String) obj;
                        gfk0 gfk0Var2 = b84.P1;
                        str.getClass();
                        b84Var.G0().x(new z64(str));
                        break;
                }
                return Unit.f46060a;
            }
        });
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(n74.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            n74 n74Var = (n74) (ze3Var instanceof n74 ? ze3Var : null);
            if (n74Var != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = n74Var.f23023a;
                lef0 lef0Var = n74Var.b;
                m1e m1eVar = n74Var.c;
                kt2 kt2Var = n74Var.f;
                duj dujVar = n74Var.g;
                g2v g2vVar = n74Var.h;
                ii iiVar = n74Var.j;
                ctf0 ctf0Var = n74Var.i;
                btt0 btt0Var = n74Var.k;
                esh0 esh0Var = n74Var.d;
                knf0 knf0Var = n74Var.e;
                gii0 gii0Var = n74Var.l;
                wdk0 wdk0Var = n74Var.m;
                d1p d1pVar = n74Var.n;
                d1pVar.getClass();
                iiVar.getClass();
                m1eVar.getClass();
                kt2Var.getClass();
                ctf0Var.getClass();
                btt0Var.getClass();
                esh0Var.getClass();
                knf0Var.getClass();
                gii0Var.getClass();
                wdk0Var.getClass();
                this.L1 = new fiu0(Collections.singletonMap(l94.class, (n8i) new qv2(cadVar, lef0Var, d1pVar, i1w0VarF, iiVar, m1eVar, kt2Var, dujVar, g2vVar, ctf0Var, btt0Var, knf0Var, gii0Var, wdk0Var).n));
                this.M1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(n74.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.O1.getValue();
    }
}
