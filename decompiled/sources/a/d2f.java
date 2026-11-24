package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"La/d2f;", "La/yx5;", "<init>", "()V", "a/std", "La/p2f;", "uiState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class d2f extends yx5 {
    public fiu0 K1;
    public final a8z L1;
    public final s0r M1;
    public final zz2 N1;
    public static final /* synthetic */ iiy[] P1 = {new j0d0(d2f.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0), new ez40(d2f.class, "tabNumber", "getTabNumber()I", 0)};
    public static final std O1 = new std();

    public d2f() {
        super(R.layout.compose_fragment);
        this.L1 = xbc.b0(this, sre0.f32672a.b(a3f.class), new jwd(this, (byte) 14));
        this.M1 = ltt0.o(this, c2f.f3620a);
        this.N1 = new zz2("COUPON_TAB_NUMBER", -1);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        iiy[] iiyVarArr = P1;
        final byte b = 1;
        iiy iiyVar = iiyVarArr[1];
        zz2 zz2Var = this.N1;
        int iIntValue = zz2Var.n(this, iiyVar).intValue();
        if (iIntValue >= 0 && iIntValue < 2) {
            ((k3t0) this.L1.getValue()).x(new x1f(zz2Var.n(this, iiyVarArr[1]).intValue()));
        }
        vcc.g0(this, "BARCODE_SCANNER_REQUEST_KEY", new Function2(this) { // from class: a.b2f
            public final /* synthetic */ d2f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String string;
                byte b2 = b;
                a8z a8zVar = this.b.L1;
                switch (b2) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        std stdVar = d2f.O1;
                        if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                            p2f p2fVar = (p2f) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue();
                            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                            boolean zI = fetVar.i(k3t0Var);
                            Object objP = fetVar.P();
                            if (zI || objP == ukd.f35823a) {
                                z6e z6eVar = new z6e(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 25);
                                fetVar.o0(z6eVar);
                                objP = z6eVar;
                            }
                            p8a.n(null, p2fVar, (Function1) ((jhy) objP), fetVar, 0);
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        Bundle bundle2 = (Bundle) obj2;
                        std stdVar2 = d2f.O1;
                        ((String) obj).getClass();
                        bundle2.getClass();
                        if (bundle2.containsKey("BARCODE_SCANNER_BUNDLE_KEY") && (string = bundle2.getString("BARCODE_SCANNER_BUNDLE_KEY")) != null) {
                            ((k3t0) a8zVar.getValue()).x(new v1f(string));
                            ((k3t0) a8zVar.getValue()).x(r1f.f29677a);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 0;
        Object objN = this.M1.n(iiyVarArr[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(1269535322, true, new Function2(this) { // from class: a.b2f
            public final /* synthetic */ d2f b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                String string;
                byte b3 = b2;
                a8z a8zVar = this.b.L1;
                switch (b3) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue2 = ((Integer) obj2).intValue();
                        std stdVar = d2f.O1;
                        if (fetVar.U(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                            p2f p2fVar = (p2f) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue();
                            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                            boolean zI = fetVar.i(k3t0Var);
                            Object objP = fetVar.P();
                            if (zI || objP == ukd.f35823a) {
                                z6e z6eVar = new z6e(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 25);
                                fetVar.o0(z6eVar);
                                objP = z6eVar;
                            }
                            p8a.n(null, p2fVar, (Function1) ((jhy) objP), fetVar, 0);
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        Bundle bundle2 = (Bundle) obj2;
                        std stdVar2 = d2f.O1;
                        ((String) obj).getClass();
                        bundle2.getClass();
                        if (bundle2.containsKey("BARCODE_SCANNER_BUNDLE_KEY") && (string = bundle2.getString("BARCODE_SCANNER_BUNDLE_KEY")) != null) {
                            ((k3t0) a8zVar.getValue()).x(new v1f(string));
                            ((k3t0) a8zVar.getValue()).x(r1f.f29677a);
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(e2f.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            e2f e2fVar = (e2f) (ze3Var instanceof e2f ? ze3Var : null);
            if (e2fVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                iw20 iw20Var = e2fVar.c;
                zfo zfoVar = e2fVar.f7081a;
                edo edoVar = e2fVar.b;
                fvt0 fvt0Var = e2fVar.d;
                tnm0 tnm0Var = e2fVar.e;
                m0w m0wVar = e2fVar.f;
                wsf0 wsf0Var = e2fVar.g;
                r9u r9uVar = e2fVar.p;
                fme fmeVar = e2fVar.o;
                kuy kuyVar = e2fVar.n;
                cad cadVar = e2fVar.h;
                knf0 knf0Var = e2fVar.i;
                btt0 btt0Var = e2fVar.j;
                gii0 gii0Var = e2fVar.k;
                duj dujVar = e2fVar.l;
                kj5 kj5Var = e2fVar.m;
                iip iipVar = e2fVar.q;
                j1q0 j1q0Var = e2fVar.r;
                ctf0 ctf0Var = e2fVar.s;
                iipVar.getClass();
                r9uVar.getClass();
                fmeVar.getClass();
                kuyVar.getClass();
                zfoVar.getClass();
                edoVar.getClass();
                tnm0Var.getClass();
                m0wVar.getClass();
                knf0Var.getClass();
                btt0Var.getClass();
                gii0Var.getClass();
                j1q0Var.getClass();
                ctf0Var.getClass();
                this.K1 = new fiu0(Collections.singletonMap(a3f.class, (uci) new f6i(cadVar, fvt0Var, iw20Var, kj5Var, wsf0Var, iipVar, r9uVar, fmeVar, kuyVar, zfoVar, edoVar, tnm0Var, m0wVar, i1w0VarF, knf0Var, btt0Var, gii0Var, dujVar, j1q0Var, ctf0Var).d));
                return;
            }
        }
        jf4.n(b1j.i(e2f.class, "Cannot create dependency "));
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        vcc.C(this, "BARCODE_SCANNER_REQUEST_KEY");
        super.Z();
    }
}
