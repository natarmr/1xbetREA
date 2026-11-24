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
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/mvr0;", "La/yx5;", "<init>", "()V", "a/g9m0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mvr0 extends yx5 {
    public final e9o0 K1;
    public fiu0 L1;
    public wdk0 M1;
    public ii N1;
    public r9u O1;
    public final a8z P1;
    public final n0o0 Q1;
    public final s0r R1;
    public final v62 S1;
    public final phf0 U1;
    public final zz2 V1;
    public static final /* synthetic */ iiy[] X1 = {new j0d0(mvr0.class, "binding", "getBinding()Lorg/xplatform/toto_bet/impl/databinding/TotoTirageComposeFragmentBinding;", 0), new ez40(mvr0.class, "totoType", "getTotoType()Ljava/lang/String;", 0), new ez40(mvr0.class, "totoTypeId", "getTotoTypeId()I", 0)};
    public static final g9m0 W1 = new g9m0();

    public mvr0() {
        super(R.layout.toto_tirage_compose_fragment);
        bp3 bp3Var = bp3.f2960a;
        this.K1 = new e9o0(R.attr.uikitStaticTransparent, R.attr.uikitBackground, 8);
        this.P1 = xbc.b0(this, sre0.f32672a.b(zvr0.class), new jvr0(this, (byte) 0));
        this.Q1 = maz.b(new jvr0(this, (byte) 1));
        this.R1 = ltt0.o(this, lvr0.f20729a);
        this.S1 = new v62(this, (byte) 27);
        this.U1 = new phf0("TOTO_TYPE");
        this.V1 = new zz2("TOTO_TYPE_ID");
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final byte b = 0;
        Object objN = this.R1.n(X1[0], this);
        objN.getClass();
        final byte b2 = 1;
        pkd.i(((nvr0) objN).f24201a, null, new ugd(46170430, true, new Function2(this) { // from class: a.kvr0
            public final /* synthetic */ mvr0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (b) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        g9m0 g9m0Var = mvr0.W1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            mvr0 mvr0Var = this.b;
                            x4d0.Z(null, mvr0Var.G0(), fetVar, 0);
                            k3t0 k3t0VarG0 = mvr0Var.G0();
                            boolean zI = fetVar.i(mvr0Var);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                mjr0 mjr0Var = new mjr0(1, mvr0Var, mvr0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/toto_bet/tirage/presentation/model/TotoTirageSideEffect;)V", 0, (byte) 17);
                                fetVar.o0(mjr0Var);
                                objP = mjr0Var;
                            }
                            clz clzVar = (clz) fetVar.k(or00.f25714a);
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                kc70 kc70Var = new kc70(k3t0VarG0, clzVar, pz40VarF, null, (byte) 28);
                                fetVar.o0(kc70Var);
                                objP2 = kc70Var;
                            }
                            m0x0.t(fetVar, clzVar, (Function2) objP2);
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        String str = (String) obj;
                        Bundle bundle2 = (Bundle) obj2;
                        g9m0 g9m0Var2 = mvr0.W1;
                        if (h97.B(bundle2, str, "TotoBetTypeBottomSheetKey")) {
                            this.b.G0().x(new hvr0(bundle2.getInt(str)));
                        }
                        break;
                }
                return Unit.f46060a;
            }
        }));
        sj3.A0(this, "TotoBetTypeBottomSheetKey", new Function2(this) { // from class: a.kvr0
            public final /* synthetic */ mvr0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                switch (b2) {
                    case 0:
                        fet fetVar = (fet) obj;
                        int iIntValue = ((Integer) obj2).intValue();
                        g9m0 g9m0Var = mvr0.W1;
                        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
                            mvr0 mvr0Var = this.b;
                            x4d0.Z(null, mvr0Var.G0(), fetVar, 0);
                            k3t0 k3t0VarG0 = mvr0Var.G0();
                            boolean zI = fetVar.i(mvr0Var);
                            Object objP = fetVar.P();
                            cl5 cl5Var = ukd.f35823a;
                            if (zI || objP == cl5Var) {
                                mjr0 mjr0Var = new mjr0(1, mvr0Var, mvr0.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/toto_bet/tirage/presentation/model/TotoTirageSideEffect;)V", 0, (byte) 17);
                                fetVar.o0(mjr0Var);
                                objP = mjr0Var;
                            }
                            clz clzVar = (clz) fetVar.k(or00.f25714a);
                            lkz lkzVar = lkz.f20223a;
                            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
                            boolean zI2 = fetVar.i(k3t0VarG0) | fetVar.i(clzVar) | fetVar.e(3) | fetVar.g(pz40VarF);
                            Object objP2 = fetVar.P();
                            if (zI2 || objP2 == cl5Var) {
                                kc70 kc70Var = new kc70(k3t0VarG0, clzVar, pz40VarF, null, (byte) 28);
                                fetVar.o0(kc70Var);
                                objP2 = kc70Var;
                            }
                            m0x0.t(fetVar, clzVar, (Function2) objP2);
                        } else {
                            fetVar.X();
                        }
                        break;
                    default:
                        String str = (String) obj;
                        Bundle bundle2 = (Bundle) obj2;
                        g9m0 g9m0Var2 = mvr0.W1;
                        if (h97.B(bundle2, str, "TotoBetTypeBottomSheetKey")) {
                            this.b.G0().x(new hvr0(bundle2.getInt(str)));
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        ccq0.V(this, "REQUEST_OPEN_SETTINGS_DIALOG_KEY", new jvr0(this, (byte) 2));
        ccq0.V(this, "REQUEST_OPEN_SETTINGS_DIALOG_KEY", new jvr0(this, (byte) 3));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(glr0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            glr0 glr0Var = (glr0) (ze3Var instanceof glr0 ? ze3Var : null);
            if (glr0Var != null) {
                iiy[] iiyVarArr = X1;
                String strN = this.U1.n(this, iiyVarArr[1]);
                this.V1.n(this, iiyVarArr[2]);
                i1w0 i1w0VarF = a4n0.f(this);
                strN.getClass();
                i1w0VarF.getClass();
                cad cadVar = glr0Var.f11508a;
                gii0 gii0Var = glr0Var.b;
                m1e m1eVar = glr0Var.c;
                sa10 sa10Var = glr0Var.d;
                wsf0 wsf0Var = glr0Var.h;
                gkr0 gkr0Var = glr0Var.f;
                sd80 sd80Var = glr0Var.j;
                ctf0 ctf0Var = glr0Var.i;
                ii iiVar = glr0Var.g;
                btt0 btt0Var = glr0Var.e;
                knf0 knf0Var = glr0Var.k;
                wdk0 wdk0Var = glr0Var.l;
                j1q0 j1q0Var = glr0Var.m;
                afm0 afm0Var = glr0Var.n;
                duj dujVar = glr0Var.o;
                wyu wyuVar = glr0Var.p;
                r9u r9uVar = glr0Var.q;
                iiVar.getClass();
                gii0Var.getClass();
                m1eVar.getClass();
                btt0Var.getClass();
                j1q0Var.getClass();
                gkr0Var.getClass();
                ctf0Var.getClass();
                sd80Var.getClass();
                knf0Var.getClass();
                wdk0Var.getClass();
                wyuVar.getClass();
                r9uVar.getClass();
                this.L1 = new fiu0(Collections.singletonMap(zvr0.class, (yxi) new v7i(cadVar, wsf0Var, iiVar, gii0Var, sa10Var, m1eVar, i1w0VarF, btt0Var, gkr0Var, ctf0Var, sd80Var, knf0Var, wdk0Var, afm0Var, dujVar, wyuVar, r9uVar).o));
                this.M1 = wdk0Var;
                this.N1 = iiVar;
                this.O1 = r9uVar;
                return;
            }
        }
        jf4.n(b1j.i(glr0.class, "Cannot create dependency "));
    }

    public final k3t0 G0() {
        return (k3t0) this.P1.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        this.S1.e();
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void e0() {
        jg60 jg60VarK;
        kxq kxqVarB = B();
        if (kxqVarB != null && (jg60VarK = kxqVarB.k()) != null) {
            jg60VarK.b(this.S1);
        }
        super.e0();
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
