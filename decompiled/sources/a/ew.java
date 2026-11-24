package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"La/ew;", "La/yx5;", "<init>", "()V", "La/ow;", "uiState", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ew extends yx5 {
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(ew.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public final f9o0 K1;
    public rl70 L1;
    public fiu0 M1;
    public wdk0 N1;
    public final a8z O1;
    public final s0r P1;

    public ew() {
        super(R.layout.compose_fragment);
        this.K1 = new f9o0(R.attr.uikitBackgroundContent);
        this.O1 = xbc.b0(this, sre0.f32672a.b(ww.class), new nc(this, (byte) 6));
        this.P1 = ltt0.o(this, dw.f6770a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 1;
        sj3.A0(this, "KEY_PICKER_MODEL_REQUEST", new Function2(this) { // from class: a.cw
            public final /* synthetic */ ew b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b2 = b;
                ew ewVar = this.b;
                switch (b2) {
                    case 0:
                        a8z a8zVar = ewVar.O1;
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        iiy[] iiyVarArr = ew.Q1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            ow owVar = (ow) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue();
                            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                            boolean zI = fetVar.i(k3t0Var);
                            Object objP = fetVar.P();
                            if (zI || objP == ukd.f35823a) {
                                t0 t0Var = new t0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                                fetVar.o0(t0Var);
                                objP = t0Var;
                            }
                            i4w0.a(owVar, (Function1) ((jhy) objP), fetVar, 0);
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        Bundle bundle2 = (Bundle) obj2;
                        iiy[] iiyVarArr2 = ew.Q1;
                        ((String) obj).getClass();
                        bundle2.getClass();
                        ((k3t0) ewVar.O1.getValue()).x(new sv(bundle2.getInt("KEY_PICKER_MODEL_REQUEST")));
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 0;
        Object objN = this.P1.n(Q1[0], this);
        objN.getClass();
        b1j.t(((aid) objN).b, new ugd(-382061507, true, new Function2(this) { // from class: a.cw
            public final /* synthetic */ ew b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                byte b3 = b2;
                ew ewVar = this.b;
                switch (b3) {
                    case 0:
                        a8z a8zVar = ewVar.O1;
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        iiy[] iiyVarArr = ew.Q1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            ow owVar = (ow) ((i3t0) ((k3t0) a8zVar.getValue())).y(fetVar).getValue();
                            k3t0 k3t0Var = (k3t0) a8zVar.getValue();
                            boolean zI = fetVar.i(k3t0Var);
                            Object objP = fetVar.P();
                            if (zI || objP == ukd.f35823a) {
                                t0 t0Var = new t0(1, k3t0Var, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 23);
                                fetVar.o0(t0Var);
                                objP = t0Var;
                            }
                            i4w0.a(owVar, (Function1) ((jhy) objP), fetVar, 0);
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        Bundle bundle2 = (Bundle) obj2;
                        iiy[] iiyVarArr2 = ew.Q1;
                        ((String) obj).getClass();
                        bundle2.getClass();
                        ((k3t0) ewVar.O1.getValue()).x(new sv(bundle2.getInt("KEY_PICKER_MODEL_REQUEST")));
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
            o5d0 o5d0Var = (o5d0) af3Var.d().get(fw.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            fw fwVar = (fw) (ze3Var instanceof fw ? ze3Var : null);
            if (fwVar != null) {
                i1w0 i1w0VarF = a4n0.f(this);
                i1w0VarF.getClass();
                cad cadVar = fwVar.f10237a;
                btt0 btt0Var = fwVar.b;
                zg zgVar = fwVar.c;
                rou rouVar = fwVar.d;
                nr nrVar = fwVar.e;
                wsf0 wsf0Var = fwVar.g;
                wdk0 wdk0Var = fwVar.f;
                ctf0 ctf0Var = fwVar.h;
                rl70 rl70Var = fwVar.i;
                pp90 pp90Var = fwVar.j;
                d1p d1pVar = fwVar.k;
                pp90Var.getClass();
                d1pVar.getClass();
                btt0Var.getClass();
                wdk0Var.getClass();
                ctf0Var.getClass();
                ru ruVar = new ru();
                ruVar.f31100a = zgVar;
                ruVar.b = cadVar;
                ruVar.g = rouVar;
                ruVar.c = nrVar;
                ruVar.d = wsf0Var;
                ruVar.e = ctf0Var;
                ruVar.f = pp90Var;
                ruVar.h = d1pVar;
                ruVar.i = i1w0VarF;
                ruVar.j = new t5i(ruVar, (byte) 6);
                this.L1 = rl70Var;
                this.M1 = new fiu0(Collections.singletonMap(ww.class, (t5i) ruVar.j));
                this.N1 = wdk0Var;
                return;
            }
        }
        jf4.n(b1j.i(fw.class, "Cannot create dependency "));
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        gmq gmqVarC = ((i3t0) ((k3t0) this.O1.getValue())).C();
        qa qaVar = new qa(this, null, (byte) 5);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new m1((i89) gmqVarC, clzVarW, qaVar, (yje) null), 3);
    }

    @Override // a.yx5
    public final j9o0 z0() {
        return this.K1;
    }
}
