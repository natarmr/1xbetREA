package a;

import android.content.ComponentCallbacks2;
import android.view.View;
import android.widget.TextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.check_box.DsCheckbox;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"La/mce0;", "La/by5;", "La/u3r;", "La/vbr;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mce0 extends by5<u3r> implements vbr {
    public static final /* synthetic */ iiy[] e2 = {new j0d0(mce0.class, "binding", "getBinding()Lorg/xplatform/responsible_game_impl/databinding/FragmentRealityLimitLockBinding;", 0)};
    public final nae0 b2 = ltt0.p(this, kce0.f18054a);
    public eri c2;
    public final kiu0 d2;

    public mce0() {
        p7d0 p7d0Var = new p7d0(this, (byte) 26);
        a8z a8zVarA = maz.a(wez.b, new lce0(new f1d0(this, (byte) 29), (byte) 0));
        this.d2 = agc.G(this, sre0.f32672a.b(hde0.class), new wbe0(a8zVarA, (byte) 2), new wbe0(a8zVarA, (byte) 3), p7d0Var);
    }

    @Override // a.by5
    public final void K0() throws Exception {
        final byte b = 0;
        dyb.O(I0().c, new Function1(this) { // from class: a.jce0
            public final /* synthetic */ mce0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                byte b3 = 19;
                yje yjeVar = null;
                mce0 mce0Var = this.b;
                View view = (View) obj;
                switch (b2) {
                    case 0:
                        iiy[] iiyVarArr = mce0.e2;
                        view.getClass();
                        hde0 hde0VarS0 = mce0Var.S0();
                        boolean zIsChecked = mce0Var.I0().e.isChecked();
                        sac.V(jiu0.a(hde0VarS0), new ede0(hde0VarS0, (byte) 0), new rd7((Object) hde0VarS0, zIsChecked, (byte) 15), null, new a220(hde0VarS0, zIsChecked, yjeVar, b3), 12);
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = mce0.e2;
                        view.getClass();
                        hde0 hde0VarS1 = mce0Var.S0();
                        sac.V(jiu0.a(hde0VarS1), new ede0(hde0VarS1, (byte) 3), new fde0(hde0VarS1, (byte) 2), null, new fj3(hde0VarS1, mce0Var.I0().e.isChecked(), yjeVar, b3), 12);
                        break;
                    case 2:
                        iiy[] iiyVarArr3 = mce0.e2;
                        view.getClass();
                        hde0 hde0VarS2 = mce0Var.S0();
                        sac.V(jiu0.a(hde0VarS2), new ede0(hde0VarS2, (byte) 2), new fde0(hde0VarS2, (byte) 1), null, new gde0(hde0VarS2, null, (byte) 1), 12);
                        break;
                    default:
                        iiy[] iiyVarArr4 = mce0.e2;
                        view.getClass();
                        DsCheckbox dsCheckbox = mce0Var.I0().e;
                        dsCheckbox.setChecked(!dsCheckbox.isChecked());
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.O(I0().d, new Function1(this) { // from class: a.jce0
            public final /* synthetic */ mce0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                byte b4 = 19;
                yje yjeVar = null;
                mce0 mce0Var = this.b;
                View view = (View) obj;
                switch (b3) {
                    case 0:
                        iiy[] iiyVarArr = mce0.e2;
                        view.getClass();
                        hde0 hde0VarS0 = mce0Var.S0();
                        boolean zIsChecked = mce0Var.I0().e.isChecked();
                        sac.V(jiu0.a(hde0VarS0), new ede0(hde0VarS0, (byte) 0), new rd7((Object) hde0VarS0, zIsChecked, (byte) 15), null, new a220(hde0VarS0, zIsChecked, yjeVar, b4), 12);
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = mce0.e2;
                        view.getClass();
                        hde0 hde0VarS1 = mce0Var.S0();
                        sac.V(jiu0.a(hde0VarS1), new ede0(hde0VarS1, (byte) 3), new fde0(hde0VarS1, (byte) 2), null, new fj3(hde0VarS1, mce0Var.I0().e.isChecked(), yjeVar, b4), 12);
                        break;
                    case 2:
                        iiy[] iiyVarArr3 = mce0.e2;
                        view.getClass();
                        hde0 hde0VarS2 = mce0Var.S0();
                        sac.V(jiu0.a(hde0VarS2), new ede0(hde0VarS2, (byte) 2), new fde0(hde0VarS2, (byte) 1), null, new gde0(hde0VarS2, null, (byte) 1), 12);
                        break;
                    default:
                        iiy[] iiyVarArr4 = mce0.e2;
                        view.getClass();
                        DsCheckbox dsCheckbox = mce0Var.I0().e;
                        dsCheckbox.setChecked(!dsCheckbox.isChecked());
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b3 = 2;
        dyb.O(I0().f, new Function1(this) { // from class: a.jce0
            public final /* synthetic */ mce0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                byte b5 = 19;
                yje yjeVar = null;
                mce0 mce0Var = this.b;
                View view = (View) obj;
                switch (b4) {
                    case 0:
                        iiy[] iiyVarArr = mce0.e2;
                        view.getClass();
                        hde0 hde0VarS0 = mce0Var.S0();
                        boolean zIsChecked = mce0Var.I0().e.isChecked();
                        sac.V(jiu0.a(hde0VarS0), new ede0(hde0VarS0, (byte) 0), new rd7((Object) hde0VarS0, zIsChecked, (byte) 15), null, new a220(hde0VarS0, zIsChecked, yjeVar, b5), 12);
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = mce0.e2;
                        view.getClass();
                        hde0 hde0VarS1 = mce0Var.S0();
                        sac.V(jiu0.a(hde0VarS1), new ede0(hde0VarS1, (byte) 3), new fde0(hde0VarS1, (byte) 2), null, new fj3(hde0VarS1, mce0Var.I0().e.isChecked(), yjeVar, b5), 12);
                        break;
                    case 2:
                        iiy[] iiyVarArr3 = mce0.e2;
                        view.getClass();
                        hde0 hde0VarS2 = mce0Var.S0();
                        sac.V(jiu0.a(hde0VarS2), new ede0(hde0VarS2, (byte) 2), new fde0(hde0VarS2, (byte) 1), null, new gde0(hde0VarS2, null, (byte) 1), 12);
                        break;
                    default:
                        iiy[] iiyVarArr4 = mce0.e2;
                        view.getClass();
                        DsCheckbox dsCheckbox = mce0Var.I0().e;
                        dsCheckbox.setChecked(!dsCheckbox.isChecked());
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b4 = 3;
        dyb.O(I0().i, new Function1(this) { // from class: a.jce0
            public final /* synthetic */ mce0 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b4;
                byte b6 = 19;
                yje yjeVar = null;
                mce0 mce0Var = this.b;
                View view = (View) obj;
                switch (b5) {
                    case 0:
                        iiy[] iiyVarArr = mce0.e2;
                        view.getClass();
                        hde0 hde0VarS0 = mce0Var.S0();
                        boolean zIsChecked = mce0Var.I0().e.isChecked();
                        sac.V(jiu0.a(hde0VarS0), new ede0(hde0VarS0, (byte) 0), new rd7((Object) hde0VarS0, zIsChecked, (byte) 15), null, new a220(hde0VarS0, zIsChecked, yjeVar, b6), 12);
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = mce0.e2;
                        view.getClass();
                        hde0 hde0VarS1 = mce0Var.S0();
                        sac.V(jiu0.a(hde0VarS1), new ede0(hde0VarS1, (byte) 3), new fde0(hde0VarS1, (byte) 2), null, new fj3(hde0VarS1, mce0Var.I0().e.isChecked(), yjeVar, b6), 12);
                        break;
                    case 2:
                        iiy[] iiyVarArr3 = mce0.e2;
                        view.getClass();
                        hde0 hde0VarS2 = mce0Var.S0();
                        sac.V(jiu0.a(hde0VarS2), new ede0(hde0VarS2, (byte) 2), new fde0(hde0VarS2, (byte) 1), null, new gde0(hde0VarS2, null, (byte) 1), 12);
                        break;
                    default:
                        iiy[] iiyVarArr4 = mce0.e2;
                        view.getClass();
                        DsCheckbox dsCheckbox = mce0Var.I0().e;
                        dsCheckbox.setChecked(!dsCheckbox.isChecked());
                        break;
                }
                return Unit.f46060a;
            }
        });
        ol60 ol60Var = S0().i;
        yje yjeVar = null;
        d7a0 d7a0Var = new d7a0(this, yjeVar, (byte) 20);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new g4e0(ol60Var, clzVarW, d7a0Var, (yje) null), 3);
        p7m0 p7m0Var = S0().h;
        jjc0 jjc0Var = new jjc0(2, I0().h, TextView.class, "setText", "setText(Ljava/lang/CharSequence;)V", 4, (byte) 18);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new g4e0(p7m0Var, clzVarW2, jjc0Var, (yje) null, 0), 3);
        p7m0 p7m0Var2 = S0().j;
        coc0 coc0Var = new coc0(this, yjeVar, (byte) 11);
        clz clzVarW3 = aac.W(this);
        qjj.W(x0x.Q(clzVarW3.x()), null, null, new g4e0(p7m0Var2, clzVarW3, coc0Var, (yje) null), 3);
    }

    @Override // a.by5
    public final void L0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(nce0.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            nce0 nce0Var = (nce0) (ze3Var instanceof nce0 ? ze3Var : null);
            if (nce0Var != null) {
                duj dujVar = nce0Var.f23289a;
                btt0 btt0Var = nce0Var.b;
                dzz dzzVar = nce0Var.c;
                xio xioVar = nce0Var.d;
                czz czzVar = nce0Var.e;
                gii0 gii0Var = nce0Var.f;
                ctf0 ctf0Var = nce0Var.g;
                knf0 knf0Var = nce0Var.h;
                pv00 pv00Var = nce0Var.i;
                btt0Var.getClass();
                dzzVar.getClass();
                czzVar.getClass();
                xioVar.getClass();
                gii0Var.getClass();
                ctf0Var.getClass();
                knf0Var.getClass();
                ru ruVar = new ru();
                ruVar.f31100a = gii0Var;
                ruVar.c = dzzVar;
                ruVar.d = xioVar;
                ruVar.f = czzVar;
                ruVar.g = btt0Var;
                ruVar.h = knf0Var;
                ruVar.i = pv00Var;
                ruVar.e = ctf0Var;
                ruVar.b = dujVar;
                ruVar.j = n0k0.a(new ppi(ruVar, (byte) 21));
                this.c2 = (eri) ((n5d0) ruVar.j).get();
                return;
            }
        }
        jf4.n(b1j.i(nce0.class, "Cannot create dependency "));
    }

    @Override // a.by5
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public final u3r I0() {
        Object objN = this.b2.n(e2[0], this);
        objN.getClass();
        return (u3r) objN;
    }

    public final hde0 S0() {
        return (hde0) this.d2.getValue();
    }

    @Override // a.vbr
    public final void onClose() {
        hde0 hde0VarS0 = S0();
        sac.V(jiu0.a(hde0VarS0), new ede0(hde0VarS0, (byte) 1), new fde0(hde0VarS0, (byte) 0), null, new gde0(hde0VarS0, null, (byte) 0), 12);
    }
}
