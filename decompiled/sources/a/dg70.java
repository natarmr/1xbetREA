package a;

import android.os.Build;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputFilter;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.core.presentation.views.OneXGamesInputEditText;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/dg70;", "La/yx5;", "<init>", "()V", "a/xuz", "core"}, k = 1, mv = {2, 4, 0}, xi = 48)
public class dg70 extends yx5 {
    public final i9o0 K1;
    public w6i L1;
    public final s0r M1;
    public final kiu0 N1;
    public iha O1;
    public boolean P1;
    public static final /* synthetic */ iiy[] R1 = {new j0d0(dg70.class, "binding", "getBinding()Lorg/xplatform/core/databinding/FragmentGamesBetBinding;", 0)};
    public static final xuz Q1 = new xuz();

    public dg70() {
        super(R.layout.fragment_games_bet);
        this.K1 = i9o0.f14396a;
        this.M1 = ltt0.o(this, bg70.f2542a);
        zf70 zf70Var = new zf70(this, (byte) 1);
        a8z a8zVarA = maz.a(wez.b, new ej50(new ej50(this, (byte) 28), (byte) 29));
        this.N1 = agc.G(this, sre0.f32672a.b(eh70.class), new co60(a8zVarA, (byte) 24), new co60(a8zVarA, (byte) 25), zf70Var);
    }

    public static void H0(dg70 dg70Var) {
        dg70Var.P1 = true;
        j120.Y(dg70Var);
        dg70Var.I0().i.requestFocus();
        dg70Var.I0().f.clearFocus();
    }

    @Override // a.yx5
    public final void C0() {
        h5t h5tVar;
        Fragment fragment = this.y;
        Fragment fragment2 = fragment != null ? fragment.y : null;
        bn70 bn70Var = fragment2 instanceof bn70 ? (bn70) fragment2 : null;
        if (bn70Var == null || (h5tVar = bn70Var.L1) == null) {
            return;
        }
        h5tVar.k(this);
    }

    public final void G0(sf70 sf70Var) {
        String simpleName = sf70Var.getClass().getSimpleName();
        if (C().J(simpleName) != null) {
            return;
        }
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        zb5 zb5Var = new zb5(eVarC);
        zb5Var.o(R.id.flButtonContainer, sf70Var, simpleName);
        zb5Var.f();
    }

    public final h0r I0() {
        Object objN = this.M1.n(R1[0], this);
        objN.getClass();
        return (h0r) objN;
    }

    public final eh70 J0() {
        return (eh70) this.N1.getValue();
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void Z() {
        iha ihaVar = this.O1;
        if (ihaVar != null) {
            View viewFindViewById = ((kxq) ihaVar.c).findViewById(android.R.id.content);
            viewFindViewById.getClass();
            viewFindViewById.getViewTreeObserver().removeOnGlobalLayoutListener((qly) ihaVar.f);
        }
        super.Z();
    }

    @Override // androidx.fragment.app.Fragment
    public final void d0() {
        H0(this);
        this.j1 = true;
    }

    @Override // a.yx5, androidx.fragment.app.Fragment
    public final void i0(View view, Bundle bundle) throws Exception {
        view.getClass();
        super.i0(view, bundle);
        OneXGamesInputEditText oneXGamesInputEditText = I0().f;
        ConstraintLayout constraintLayout = I0().i;
        ck60 ck60Var = new ck60(this, oneXGamesInputEditText, constraintLayout, (byte) 5);
        final byte b = 1;
        if (Build.VERSION.SDK_INT >= 30) {
            zx10 zx10Var = new zx10(ck60Var);
            WeakHashMap weakHashMap = rgu0.f30456a;
            igu0.c(constraintLayout, zx10Var);
        } else {
            kxq kxqVarB = B();
            if (kxqVarB != null) {
                View viewFindViewById = kxqVarB.findViewById(android.R.id.content);
                viewFindViewById.getClass();
                viewFindViewById.post(new oh60(this, ck60Var, b));
            }
        }
        TextView textView = I0().b;
        OneXGamesInputEditText oneXGamesInputEditText2 = I0().f;
        final byte b2 = 2;
        final byte b3 = 0;
        oneXGamesInputEditText2.setFilters(new InputFilter[]{new tjj(13, 2)});
        oneXGamesInputEditText2.setOnFocusChangeListener(new yf70(this, textView, (byte) 0));
        hxm0.y(oneXGamesInputEditText2, new zf70(this, b3));
        I0().g.setOnClickListener(new l910(this, (byte) 8));
        AppCompatButton appCompatButton = I0().p;
        ymx ymxVar = ymx.INTERVAL_100;
        dyb.N(appCompatButton, ymxVar, new Function1(this) { // from class: a.ag70
            public final /* synthetic */ dg70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                dg70 dg70Var = this.b;
                switch (b4) {
                    case 0:
                        xuz xuzVar = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ0 = dg70Var.J0();
                        sac.V(jiu0.a(eh70VarJ0), new cf70(1, eh70VarJ0, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, eh70VarJ0.l.f22085a, new z8t(eh70VarJ0, null, (byte) 5), 10);
                        break;
                    case 1:
                        xuz xuzVar2 = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ1 = dg70Var.J0();
                        sac.V(jiu0.a(eh70VarJ1), new cf70(1, eh70VarJ1, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, eh70VarJ1.l.f22085a, new ts6(eh70VarJ1, (yje) null, (byte) 1), 10);
                        break;
                    case 2:
                        xuz xuzVar3 = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ2 = dg70Var.J0();
                        Double dI = kotlin.text.b.i(String.valueOf(dg70Var.I0().f.getText()));
                        sac.V(jiu0.a(eh70VarJ2), new cf70(1, eh70VarJ2, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, eh70VarJ2.l.f22085a, new xg70(eh70VarJ2, dI != null ? dI.doubleValue() : 0.0d, null, (byte) 0), 10);
                        break;
                    case 3:
                        xuz xuzVar4 = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ3 = dg70Var.J0();
                        Double dI2 = kotlin.text.b.i(String.valueOf(dg70Var.I0().f.getText()));
                        sac.V(jiu0.a(eh70VarJ3), new cf70(1, eh70VarJ3, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, eh70VarJ3.l.f22085a, new ah70(eh70VarJ3, dI2 != null ? dI2.doubleValue() : 0.0d, null, (byte) 0), 10);
                        break;
                    default:
                        Editable editable = (Editable) obj;
                        xuz xuzVar5 = dg70.Q1;
                        editable.getClass();
                        eh70 eh70VarJ4 = dg70Var.J0();
                        String string = editable.toString();
                        string.getClass();
                        sac.V(jiu0.a(eh70VarJ4), new cf70(1, eh70VarJ4, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, eh70VarJ4.l.f22085a, new er60(eh70VarJ4, string, null, (byte) 7), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.N(I0().n, ymxVar, new Function1(this) { // from class: a.ag70
            public final /* synthetic */ dg70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b;
                dg70 dg70Var = this.b;
                switch (b4) {
                    case 0:
                        xuz xuzVar = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ0 = dg70Var.J0();
                        sac.V(jiu0.a(eh70VarJ0), new cf70(1, eh70VarJ0, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, eh70VarJ0.l.f22085a, new z8t(eh70VarJ0, null, (byte) 5), 10);
                        break;
                    case 1:
                        xuz xuzVar2 = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ1 = dg70Var.J0();
                        sac.V(jiu0.a(eh70VarJ1), new cf70(1, eh70VarJ1, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, eh70VarJ1.l.f22085a, new ts6(eh70VarJ1, (yje) null, (byte) 1), 10);
                        break;
                    case 2:
                        xuz xuzVar3 = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ2 = dg70Var.J0();
                        Double dI = kotlin.text.b.i(String.valueOf(dg70Var.I0().f.getText()));
                        sac.V(jiu0.a(eh70VarJ2), new cf70(1, eh70VarJ2, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, eh70VarJ2.l.f22085a, new xg70(eh70VarJ2, dI != null ? dI.doubleValue() : 0.0d, null, (byte) 0), 10);
                        break;
                    case 3:
                        xuz xuzVar4 = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ3 = dg70Var.J0();
                        Double dI2 = kotlin.text.b.i(String.valueOf(dg70Var.I0().f.getText()));
                        sac.V(jiu0.a(eh70VarJ3), new cf70(1, eh70VarJ3, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, eh70VarJ3.l.f22085a, new ah70(eh70VarJ3, dI2 != null ? dI2.doubleValue() : 0.0d, null, (byte) 0), 10);
                        break;
                    default:
                        Editable editable = (Editable) obj;
                        xuz xuzVar5 = dg70.Q1;
                        editable.getClass();
                        eh70 eh70VarJ4 = dg70Var.J0();
                        String string = editable.toString();
                        string.getClass();
                        sac.V(jiu0.a(eh70VarJ4), new cf70(1, eh70VarJ4, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, eh70VarJ4.l.f22085a, new er60(eh70VarJ4, string, null, (byte) 7), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.N(I0().s, ymxVar, new Function1(this) { // from class: a.ag70
            public final /* synthetic */ dg70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b2;
                dg70 dg70Var = this.b;
                switch (b4) {
                    case 0:
                        xuz xuzVar = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ0 = dg70Var.J0();
                        sac.V(jiu0.a(eh70VarJ0), new cf70(1, eh70VarJ0, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, eh70VarJ0.l.f22085a, new z8t(eh70VarJ0, null, (byte) 5), 10);
                        break;
                    case 1:
                        xuz xuzVar2 = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ1 = dg70Var.J0();
                        sac.V(jiu0.a(eh70VarJ1), new cf70(1, eh70VarJ1, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, eh70VarJ1.l.f22085a, new ts6(eh70VarJ1, (yje) null, (byte) 1), 10);
                        break;
                    case 2:
                        xuz xuzVar3 = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ2 = dg70Var.J0();
                        Double dI = kotlin.text.b.i(String.valueOf(dg70Var.I0().f.getText()));
                        sac.V(jiu0.a(eh70VarJ2), new cf70(1, eh70VarJ2, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, eh70VarJ2.l.f22085a, new xg70(eh70VarJ2, dI != null ? dI.doubleValue() : 0.0d, null, (byte) 0), 10);
                        break;
                    case 3:
                        xuz xuzVar4 = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ3 = dg70Var.J0();
                        Double dI2 = kotlin.text.b.i(String.valueOf(dg70Var.I0().f.getText()));
                        sac.V(jiu0.a(eh70VarJ3), new cf70(1, eh70VarJ3, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, eh70VarJ3.l.f22085a, new ah70(eh70VarJ3, dI2 != null ? dI2.doubleValue() : 0.0d, null, (byte) 0), 10);
                        break;
                    default:
                        Editable editable = (Editable) obj;
                        xuz xuzVar5 = dg70.Q1;
                        editable.getClass();
                        eh70 eh70VarJ4 = dg70Var.J0();
                        String string = editable.toString();
                        string.getClass();
                        sac.V(jiu0.a(eh70VarJ4), new cf70(1, eh70VarJ4, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, eh70VarJ4.l.f22085a, new er60(eh70VarJ4, string, null, (byte) 7), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b4 = 3;
        dyb.N(I0().j, ymxVar, new Function1(this) { // from class: a.ag70
            public final /* synthetic */ dg70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b4;
                dg70 dg70Var = this.b;
                switch (b5) {
                    case 0:
                        xuz xuzVar = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ0 = dg70Var.J0();
                        sac.V(jiu0.a(eh70VarJ0), new cf70(1, eh70VarJ0, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, eh70VarJ0.l.f22085a, new z8t(eh70VarJ0, null, (byte) 5), 10);
                        break;
                    case 1:
                        xuz xuzVar2 = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ1 = dg70Var.J0();
                        sac.V(jiu0.a(eh70VarJ1), new cf70(1, eh70VarJ1, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, eh70VarJ1.l.f22085a, new ts6(eh70VarJ1, (yje) null, (byte) 1), 10);
                        break;
                    case 2:
                        xuz xuzVar3 = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ2 = dg70Var.J0();
                        Double dI = kotlin.text.b.i(String.valueOf(dg70Var.I0().f.getText()));
                        sac.V(jiu0.a(eh70VarJ2), new cf70(1, eh70VarJ2, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, eh70VarJ2.l.f22085a, new xg70(eh70VarJ2, dI != null ? dI.doubleValue() : 0.0d, null, (byte) 0), 10);
                        break;
                    case 3:
                        xuz xuzVar4 = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ3 = dg70Var.J0();
                        Double dI2 = kotlin.text.b.i(String.valueOf(dg70Var.I0().f.getText()));
                        sac.V(jiu0.a(eh70VarJ3), new cf70(1, eh70VarJ3, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, eh70VarJ3.l.f22085a, new ah70(eh70VarJ3, dI2 != null ? dI2.doubleValue() : 0.0d, null, (byte) 0), 10);
                        break;
                    default:
                        Editable editable = (Editable) obj;
                        xuz xuzVar5 = dg70.Q1;
                        editable.getClass();
                        eh70 eh70VarJ4 = dg70Var.J0();
                        String string = editable.toString();
                        string.getClass();
                        sac.V(jiu0.a(eh70VarJ4), new cf70(1, eh70VarJ4, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, eh70VarJ4.l.f22085a, new er60(eh70VarJ4, string, null, (byte) 7), 10);
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b5 = 4;
        I0().f.addTextChangedListener(new da0(new fsp0(2, new Function1(this) { // from class: a.ag70
            public final /* synthetic */ dg70 b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b6 = b5;
                dg70 dg70Var = this.b;
                switch (b6) {
                    case 0:
                        xuz xuzVar = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ0 = dg70Var.J0();
                        sac.V(jiu0.a(eh70VarJ0), new cf70(1, eh70VarJ0, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 19), null, eh70VarJ0.l.f22085a, new z8t(eh70VarJ0, null, (byte) 5), 10);
                        break;
                    case 1:
                        xuz xuzVar2 = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ1 = dg70Var.J0();
                        sac.V(jiu0.a(eh70VarJ1), new cf70(1, eh70VarJ1, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 18), null, eh70VarJ1.l.f22085a, new ts6(eh70VarJ1, (yje) null, (byte) 1), 10);
                        break;
                    case 2:
                        xuz xuzVar3 = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ2 = dg70Var.J0();
                        Double dI = kotlin.text.b.i(String.valueOf(dg70Var.I0().f.getText()));
                        sac.V(jiu0.a(eh70VarJ2), new cf70(1, eh70VarJ2, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 14), null, eh70VarJ2.l.f22085a, new xg70(eh70VarJ2, dI != null ? dI.doubleValue() : 0.0d, null, (byte) 0), 10);
                        break;
                    case 3:
                        xuz xuzVar4 = dg70.Q1;
                        ((View) obj).getClass();
                        dg70.H0(dg70Var);
                        eh70 eh70VarJ3 = dg70Var.J0();
                        Double dI2 = kotlin.text.b.i(String.valueOf(dg70Var.I0().f.getText()));
                        sac.V(jiu0.a(eh70VarJ3), new cf70(1, eh70VarJ3, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 15), null, eh70VarJ3.l.f22085a, new ah70(eh70VarJ3, dI2 != null ? dI2.doubleValue() : 0.0d, null, (byte) 0), 10);
                        break;
                    default:
                        Editable editable = (Editable) obj;
                        xuz xuzVar5 = dg70.Q1;
                        editable.getClass();
                        eh70 eh70VarJ4 = dg70Var.J0();
                        String string = editable.toString();
                        string.getClass();
                        sac.V(jiu0.a(eh70VarJ4), new cf70(1, eh70VarJ4, eh70.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 12), null, eh70VarJ4.l.f22085a, new er60(eh70VarJ4, string, null, (byte) 7), 10);
                        break;
                }
                return Unit.f46060a;
            }
        })));
        p7m0 p7m0Var = J0().z;
        yje yjeVar = null;
        cg70 cg70Var = new cg70(this, yjeVar, b3);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new az60(p7m0Var, clzVarW, cg70Var, (yje) null), 3);
        itb itbVarV = xkb.V(J0().A);
        cg70 cg70Var2 = new cg70(this, yjeVar, b);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new az60(itbVarV, clzVarW2, cg70Var2, (yje) null), 3);
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
