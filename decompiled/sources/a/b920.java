package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.util.TypedValue;
import androidx.compose.ui.platform.ComposeView;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.compose.color.StaticColors;
import org.xplatform.uikit.compose.color.ThemeColors;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"La/b920;", "La/yx5;", "La/kse;", "<init>", "()V", "a/htz", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class b920 extends yx5 implements kse {
    public final s0r K1;
    public fiu0 L1;
    public ii M1;
    public lgn0 N1;
    public iw20 O1;
    public ynb P1;
    public wdk0 Q1;
    public final a8z R1;
    public final boolean S1;
    public static final /* synthetic */ iiy[] V1 = {new j0d0(b920.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final htz U1 = new htz();

    public b920() {
        super(R.layout.compose_fragment);
        this.K1 = ltt0.o(this, a920.f456a);
        this.R1 = xbc.b0(this, sre0.f32672a.b(on20.class), new w820(this, (byte) 0));
        this.S1 = true;
    }

    public static String I0(String str, en7 en7Var) {
        return String.format(Locale.ENGLISH, "%s %d/", Arrays.copyOf(new Object[]{str, en7Var != null ? Integer.valueOf(en7Var.c) : null}, 2)) + (en7Var != null ? Integer.valueOf(en7Var.f8078a) : null);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        n0().getWindow().setSoftInputMode(16);
        Object objN = this.K1.n(V1[0], this);
        objN.getClass();
        ComposeView composeView = ((aid) objN).f919a;
        TypedValue typedValue = j5d.f15927a;
        composeView.setBackgroundColor(j5d.a(o0(), R.attr.uikitStaticTransparent, false));
        pkd.i(composeView, null, new ugd(-558860448, true, new y820(this)));
        ccq0.V(this, "REQUEST_ADVANCE_KEY", new w820(this, (byte) 3));
        ccq0.T(this, "REQUEST_ADVANCE_KEY", new w820(this, (byte) 4));
        ccq0.V(this, "REQUEST_BET_EXISTS_DIALOG_KEY", new w820(this, (byte) 5));
        ccq0.T(this, "REQUEST_BET_EXISTS_DIALOG_KEY", new w820(this, (byte) 6));
        ccq0.V(this, "REQUEST_INSUFFICIENT_FOUNDS_DIALOG_KEY", new w820(this, (byte) 7));
        sj3.t0(this, "REQUEST_SELECT_PROMO_CODE", new x820(this, (byte) 1));
        ccq0.V(this, "REQUEST_KEY_CHANGE_TYPE_TO_SYSTEM", new w820(this, (byte) 8));
        ccq0.T(this, "REQUEST_KEY_CHANGE_TYPE_TO_SYSTEM", new w820(this, (byte) 9));
        C().u0("CHANGE_SYSTEM_REQUEST_KEY", this, new viq(this, (byte) 18));
    }

    @Override // a.yx5
    public final void C0() {
        ComponentCallbacks2 application = n0().getApplication();
        application.getClass();
        af3 af3Var = application instanceof af3 ? (af3) application : null;
        if (af3Var != null) {
            o5d0 o5d0Var = (o5d0) af3Var.d().get(sye.class);
            ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
            sye syeVar = (sye) (ze3Var instanceof sye ? ze3Var : null);
            if (syeVar != null) {
                mdi mdiVarA = syeVar.a(a4n0.f(this), false);
                this.L1 = mdiVarA.t();
                this.M1 = (ii) mdiVarA.Y;
                this.N1 = (lgn0) mdiVarA.Z;
                this.O1 = ((clc) ((nr00) mdiVarA.c0).f23980a).f();
                ynb ynbVarI = ((yzn0) ((peg0) mdiVarA.a0).b).i();
                x1x.x(ynbVarI);
                this.P1 = ynbVarI;
                this.Q1 = (wdk0) mdiVarA.b0;
                return;
            }
        }
        jf4.n(b1j.i(sye.class, "Cannot create dependency "));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void G0(final int i, fet fetVar, final mm40 mm40Var) {
        int i2;
        Function2 function2;
        yfe0 yfe0VarU;
        long separator;
        fetVar.g0(1657971303);
        if ((i & 6) == 0) {
            i2 = (fetVar.g(mm40Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i & 48;
        kel kelVar = kel.f18158a;
        if (i3 == 0) {
            i2 |= fetVar.g(kelVar) ? 32 : 16;
        }
        final byte b = 0;
        final byte b2 = 1;
        if (fetVar.U(i2 & 1, (i2 & 19) != 18)) {
            if (!kelVar.equals(jel.f16379a)) {
                if (kelVar.equals(kelVar)) {
                    fetVar.e0(-122436496);
                    separator = ((ThemeColors) fetVar.k(zaq0.b)).getSeparator();
                    fetVar.r(false);
                } else {
                    if (!kelVar.equals(iel.f14638a)) {
                        throw b1j.f(-122440783, fetVar, false);
                    }
                    fetVar.e0(499481461);
                    fetVar.r(false);
                    yfe0VarU = fetVar.u();
                    if (yfe0VarU == null) {
                        return;
                    } else {
                        function2 = new Function2(this) { // from class: a.z820
                            public final /* synthetic */ b920 b;

                            {
                                this.b = this;
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                byte b3 = b;
                                int i4 = i;
                                mm40 mm40Var2 = mm40Var;
                                b920 b920Var = this.b;
                                fet fetVar2 = (fet) obj;
                                ((Integer) obj2).getClass();
                                htz htzVar = b920.U1;
                                switch (b3) {
                                    case 0:
                                        b920Var.G0(x8x.L(i4 | 1), fetVar2, mm40Var2);
                                        break;
                                    default:
                                        b920Var.G0(x8x.L(i4 | 1), fetVar2, mm40Var2);
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        };
                    }
                }
                yfe0VarU.d = function2;
            }
            fetVar.e0(-122438514);
            separator = ((StaticColors) fetVar.k(m8m0.f21378a)).m129getWhite400d7_KjU();
            fetVar.r(false);
            mm40 mm40VarA0 = wha0.a0(cjx.V(mm40Var, x0x.a0(fetVar), null), wha0.T(fetVar), false, 14);
            zcl zclVar = qmk.f28987a;
            zq8.a(0, fetVar, i120.Q(o7k0.e(o7k0.s(s5x0.N(mm40VarA0, 0.0f, 8.0f, 0.0f, 0.0f, 13), 36.0f), 4.0f), separator, vgg0.f37379a));
        } else {
            fetVar.X();
        }
        yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            function2 = new Function2(this) { // from class: a.z820
                public final /* synthetic */ b920 b;

                {
                    this.b = this;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    byte b3 = b2;
                    int i4 = i;
                    mm40 mm40Var2 = mm40Var;
                    b920 b920Var = this.b;
                    fet fetVar2 = (fet) obj;
                    ((Integer) obj2).getClass();
                    htz htzVar = b920.U1;
                    switch (b3) {
                        case 0:
                            b920Var.G0(x8x.L(i4 | 1), fetVar2, mm40Var2);
                            break;
                        default:
                            b920Var.G0(x8x.L(i4 | 1), fetVar2, mm40Var2);
                            break;
                    }
                    return Unit.f46060a;
                }
            };
            yfe0VarU.d = function2;
        }
    }

    public final void H0(int i, fet fetVar) {
        Object obj;
        jm40 jm40Var;
        fetVar.g0(-2005429483);
        int i2 = i | (fetVar.i(this) ? 4 : 2);
        if (fetVar.U(i2 & 1, (i2 & 3) != 2)) {
            k3t0 k3t0VarJ0 = J0();
            boolean zI = fetVar.i(this);
            Object objP = fetVar.P();
            Object obj2 = ukd.f35823a;
            if (zI || objP == obj2) {
                Object yw10Var = new yw10(1, this, b920.class, "handleSideEffect", "handleSideEffect(Lorg/xplatform/coupon/impl/make_bet/presentation/ui_state/MakeBetSideEffect;)V", 0, (byte) 13);
                fetVar.o0(yw10Var);
                objP = yw10Var;
            }
            lkz lkzVar = lkz.f20223a;
            pz40 pz40VarF = androidx.compose.runtime.e.f((Function1) ((jhy) objP), fetVar);
            boolean zI2 = fetVar.i(k3t0VarJ0) | fetVar.i(this) | fetVar.e(3) | fetVar.g(pz40VarF);
            Object objP2 = fetVar.P();
            if (zI2 || objP2 == obj2) {
                Object p000Var = new p000(k3t0VarJ0, this, pz40VarF, null, (byte) 7);
                fetVar.o0(p000Var);
                objP2 = p000Var;
            }
            m0x0.t(fetVar, obj, (Function2) objP2);
            long jM121getTransparent0d7_KjU = ((StaticColors) fetVar.k(m8m0.f21378a)).m121getTransparent0d7_KjU();
            ljc ljcVar = jd8.n;
            jm40 jm40Var2 = jm40.b;
            mm40 mm40VarD = o7k0.d(o7k0.w(i120.Q(jm40Var2, jM121getTransparent0d7_KjU, ljcVar), null, false, 3), 1.0f);
            androidx.compose.runtime.d dVar = zaq0.b;
            long backgroundContent = ((ThemeColors) fetVar.k(dVar)).getBackgroundContent();
            zcl zclVar = qmk.f28987a;
            mm40 mm40VarQ = i120.Q(mm40VarD, backgroundContent, vgg0.c(16.0f, 16.0f, 0.0f, 0.0f, 12));
            tj30 tj30VarC = zq8.c(gqw0.e, false);
            int iHashCode = Long.hashCode(fetVar.T);
            bh90 bh90VarM = fetVar.m();
            mm40 mm40VarC0 = kbc.c0(fetVar, mm40VarQ);
            mkd.c0.getClass();
            fetVar.i0();
            boolean z = fetVar.S;
            Function0 function0 = e7z.u1;
            if (z) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            shd shdVar = gqw0.x;
            jpm0.o(fetVar, tj30VarC, shdVar);
            shd shdVar2 = gqw0.w;
            jpm0.o(fetVar, bh90VarM, shdVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            shd shdVar3 = gqw0.y;
            jpm0.o(fetVar, numValueOf, shdVar3);
            jpm0.n(fetVar);
            shd shdVar4 = gqw0.v;
            jpm0.o(fetVar, mm40VarC0, shdVar4);
            pz40 pz40VarY = ((i3t0) obj.J0()).y(fetVar);
            zbr zbrVar = ((d820) pz40VarY.getValue()).d;
            ug20 ug20Var = ((d820) pz40VarY.getValue()).f5623a;
            mm40 mm40VarU = o7k0.u(jm40Var2, 0.0f, 512.0f, 1);
            zcl zclVar2 = qmk.i;
            mm40 mm40VarE = mm40VarU.e(new dyj0(new ugg0(zclVar2, zclVar2, zclVar2, zclVar2), new kjj0(32.0f, 52, ((ThemeColors) fetVar.k(dVar)).getShadowSoft(), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(-4.0f)) & 4294967295L))));
            x5d x5dVarA = w5d.a(uc9.c, gqw0.m, fetVar, 0);
            int iHashCode2 = Long.hashCode(fetVar.T);
            bh90 bh90VarM2 = fetVar.m();
            mm40 mm40VarC1 = kbc.c0(fetVar, mm40VarE);
            fetVar.i0();
            if (fetVar.S) {
                fetVar.l(function0);
            } else {
                fetVar.r0();
            }
            jpm0.o(fetVar, x5dVarA, shdVar);
            jpm0.o(fetVar, bh90VarM2, shdVar2);
            vqd.u(iHashCode2, fetVar, shdVar3, fetVar);
            x7z x7zVarI = ohs0.i(fetVar, mm40VarC1, shdVar4, 1.0f, false);
            Object objJ0 = obj.J0();
            boolean zI3 = fetVar.i(objJ0);
            Object objP3 = fetVar.P();
            if (zI3 || objP3 == obj2) {
                objP3 = new yw10(1, objJ0, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 14);
                fetVar.o0(objP3);
            }
            Function1 function1 = (Function1) ((jhy) objP3);
            boolean zI4 = fetVar.i(obj);
            Object objP4 = fetVar.P();
            if (zI4 || objP4 == obj2) {
                objP4 = new x820(this, (byte) 0);
                fetVar.o0(objP4);
            }
            b8k0.g(x7zVarI, pz40VarY, function1, (Function1) objP4, fetVar, 0, 0);
            ug20 ug20Var2 = ug20.c;
            if (ug20Var != ug20Var2 || zbrVar == null) {
                jm40Var = jm40Var2;
                fetVar.e0(74402857);
                fetVar.r(false);
            } else {
                fetVar.e0(74074195);
                jm40Var = jm40Var2;
                mm40 mm40VarN = epv0.N(o7k0.d(jm40Var, 1.0f), zbrVar.j);
                Object objJ1 = obj.J0();
                boolean zI5 = fetVar.i(objJ1);
                Object objP5 = fetVar.P();
                if (zI5 || objP5 == obj2) {
                    objP5 = new yw10(1, objJ1, k3t0.class, "onAction", "onAction(Ljava/lang/Object;)V", 0, (byte) 15);
                    fetVar.o0(objP5);
                }
                oja0.i(mm40VarN, zbrVar, (Function1) ((jhy) objP5), fetVar, 0, 0);
                fetVar.r(false);
            }
            fetVar.r(true);
            if (ug20Var != ug20Var2) {
                fetVar.e0(-1152172928);
                obj.G0(((i2 << 6) & 896) | 48, fetVar, jr8.f16991a.b(jm40Var, gqw0.b));
                fetVar.r(false);
            } else {
                fetVar.e0(-1152000909);
                fetVar.r(false);
            }
            fetVar.r(true);
            boolean zI6 = fetVar.i(obj);
            Object objP6 = fetVar.P();
            if (zI6 || objP6 == obj2) {
                objP6 = new w820(obj, (byte) 1);
                fetVar.o0(objP6);
            }
            Function0 function2 = (Function0) objP6;
            boolean zI7 = fetVar.i(obj);
            Object objP7 = fetVar.P();
            if (zI7 || objP7 == obj2) {
                objP7 = new w820(obj, (byte) 2);
                fetVar.o0(objP7);
            }
            v3c.A(function2, (Function0) objP7, null, fetVar, 0, 4);
        } else {
            obj = this;
            fetVar.X();
        }
        yfe0 yfe0VarU = fetVar.u();
        if (yfe0VarU != null) {
            yfe0VarU.d = new y820(obj, i);
        }
    }

    public final k3t0 J0() {
        return (k3t0) this.R1.getValue();
    }

    public final void K0(String str, String str2, String str3) {
        ii iiVar = this.M1;
        if (iiVar == null) {
            Intrinsics.h("actionDialogManager");
            throw null;
        }
        DialogFields dialogFields = new DialogFields((CharSequence) H(R.string.error), (CharSequence) str, (CharSequence) str3, H(R.string.cancel), (String) null, str2, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
        androidx.fragment.app.e eVarC = C();
        eVarC.getClass();
        iiVar.d(dialogFields, eVarC);
    }

    @Override // a.kse
    public final void c(float f) {
        J0().x(new c420(f));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getO1() {
        return this.S1;
    }
}
