package a;

import android.javax.sip.message.Response;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.domino.presentation.views.DominoHandView;
import org.xplatform.domino.presentation.views.DominoTableView;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"La/szk;", "La/yx5;", "<init>", "()V", "domino"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class szk extends yx5 {
    public static final /* synthetic */ iiy[] Q1 = {new j0d0(szk.class, "viewBinding", "getViewBinding()Lorg/xplatform/domino/databinding/FragmentDominoBinding;", 0)};
    public final i9o0 K1;
    public fiu0 L1;
    public ii M1;
    public final kiu0 N1;
    public final s0r O1;
    public n0l P1;

    public szk() {
        super(R.layout.fragment_domino);
        this.K1 = i9o0.f14396a;
        ucj ucjVar = new ucj(this, (byte) 15);
        a8z a8zVarA = maz.a(wez.b, new v9k(new v9k(this, (byte) 26), (byte) 27));
        this.N1 = agc.G(this, sre0.f32672a.b(l0l.class), new b9k(a8zVarA, (byte) 16), new b9k(a8zVarA, (byte) 17), ucjVar);
        this.O1 = ltt0.o(this, rzk.f31365a);
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        final szq szqVarI0 = I0();
        e0f e0fVar = szqVarI0.b;
        ((DominoHandView) e0fVar.n).setTable((DominoTableView) e0fVar.k);
        DominoHandView dominoHandView = (DominoHandView) e0fVar.h;
        DominoTableView dominoTableView = (DominoTableView) e0fVar.k;
        dominoHandView.setTable(dominoTableView);
        final byte b = 0;
        dominoTableView.setPutOnTableListener(new Function1(this) { // from class: a.nzk
            public final /* synthetic */ szk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                szk szkVar = this.b;
                switch (b2) {
                    case 0:
                        Pair pair = (Pair) obj;
                        iiy[] iiyVarArr = szk.Q1;
                        pair.getClass();
                        l0l l0lVarJ0 = szkVar.J0();
                        qb8 qb8Var = (qb8) pair.f46059a;
                        nbe nbeVar = (nbe) pair.b;
                        bby bbyVar = l0lVarJ0.r;
                        if (bbyVar == null || !bbyVar.isActive()) {
                            l0lVarJ0.r = sac.V(jiu0.a(l0lVarJ0), new k0l(1, l0lVarJ0, l0l.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, l0lVarJ0.c.b, new atj(l0lVarJ0, qb8Var, nbeVar, null, (byte) 1), 10);
                        }
                        return Unit.f46060a;
                    case 1:
                        iiy[] iiyVarArr2 = szk.Q1;
                        ((View) obj).getClass();
                        l0l l0lVarJ1 = szkVar.J0();
                        bby bbyVar2 = l0lVarJ1.r;
                        if (bbyVar2 == null || !bbyVar2.isActive()) {
                            l0lVarJ1.r = sac.V(jiu0.a(l0lVarJ1), new k0l(1, l0lVarJ1, l0l.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, l0lVarJ1.c.b, new g0l(l0lVarJ1, null, (byte) 2), 10);
                        }
                        return Unit.f46060a;
                    case 2:
                        iiy[] iiyVarArr3 = szk.Q1;
                        ((View) obj).getClass();
                        if (szkVar.N()) {
                            ii iiVar = szkVar.M1;
                            if (iiVar == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string = szkVar.o0().getString(R.string.are_you_sure);
                            String string2 = szkVar.o0().getString(R.string.durak_concede_message);
                            String string3 = szkVar.o0().getString(R.string.concede);
                            string3.getClass();
                            DialogFields dialogFields = new DialogFields((CharSequence) string, (CharSequence) string2, (CharSequence) string3, szkVar.o0().getString(R.string.cancel), (String) null, "REQUEST_CONCEDE", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                            androidx.fragment.app.e eVarC = szkVar.C();
                            eVarC.getClass();
                            iiVar.d(dialogFields, eVarC);
                        }
                        return Unit.f46060a;
                    default:
                        iiy[] iiyVarArr4 = szk.Q1;
                        ((View) obj).getClass();
                        l0l l0lVarJ2 = szkVar.J0();
                        bby bbyVar3 = l0lVarJ2.r;
                        if (bbyVar3 == null || !bbyVar3.isActive()) {
                            l0lVarJ2.r = sac.V(jiu0.a(l0lVarJ2), new k0l(1, l0lVarJ2, l0l.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, l0lVarJ2.c.b, new g0l(l0lVarJ2, null, (byte) 1), 10);
                        }
                        return Unit.f46060a;
                }
            }
        });
        DominoHandView dominoHandView2 = (DominoHandView) e0fVar.n;
        dominoHandView2.setBonesOverflowListener(new Function1() { // from class: a.pzk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b2 = b;
                szq szqVar = szqVarI0;
                switch (b2) {
                    case 0:
                        e0f e0fVar2 = szqVar.b;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        iiy[] iiyVarArr = szk.Q1;
                        int i = zBooleanValue ? 0 : 8;
                        ((ImageView) e0fVar2.g).setVisibility(i);
                        ((ImageView) e0fVar2.i).setVisibility(i);
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = szk.Q1;
                        ((View) obj).getClass();
                        DominoHandView dominoHandView3 = (DominoHandView) szqVar.b.n;
                        int i2 = dominoHandView3.h;
                        if (dominoHandView3.l) {
                            dominoHandView3.o = dominoHandView3.j + i2 + dominoHandView3.o;
                            dominoHandView3.a(Response.OK, true);
                            dominoHandView3.l = dominoHandView3.o < i2;
                        }
                        break;
                    default:
                        iiy[] iiyVarArr3 = szk.Q1;
                        ((View) obj).getClass();
                        DominoHandView dominoHandView4 = (DominoHandView) szqVar.b.n;
                        byte b3 = dominoHandView4.j;
                        int i3 = dominoHandView4.h;
                        if (dominoHandView4.m) {
                            int i4 = b3 + i3;
                            dominoHandView4.o -= i4;
                            dominoHandView4.a(Response.OK, true);
                            dominoHandView4.m = (-dominoHandView4.o) < ((dominoHandView4.e.size() * i4) - dominoHandView4.getMeasuredWidth()) + i3;
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b2 = 1;
        dyb.N((Button) e0fVar.l, ymx.INTERVAL_2000, new Function1(this) { // from class: a.nzk
            public final /* synthetic */ szk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b3 = b2;
                szk szkVar = this.b;
                switch (b3) {
                    case 0:
                        Pair pair = (Pair) obj;
                        iiy[] iiyVarArr = szk.Q1;
                        pair.getClass();
                        l0l l0lVarJ0 = szkVar.J0();
                        qb8 qb8Var = (qb8) pair.f46059a;
                        nbe nbeVar = (nbe) pair.b;
                        bby bbyVar = l0lVarJ0.r;
                        if (bbyVar == null || !bbyVar.isActive()) {
                            l0lVarJ0.r = sac.V(jiu0.a(l0lVarJ0), new k0l(1, l0lVarJ0, l0l.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, l0lVarJ0.c.b, new atj(l0lVarJ0, qb8Var, nbeVar, null, (byte) 1), 10);
                        }
                        return Unit.f46060a;
                    case 1:
                        iiy[] iiyVarArr2 = szk.Q1;
                        ((View) obj).getClass();
                        l0l l0lVarJ1 = szkVar.J0();
                        bby bbyVar2 = l0lVarJ1.r;
                        if (bbyVar2 == null || !bbyVar2.isActive()) {
                            l0lVarJ1.r = sac.V(jiu0.a(l0lVarJ1), new k0l(1, l0lVarJ1, l0l.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, l0lVarJ1.c.b, new g0l(l0lVarJ1, null, (byte) 2), 10);
                        }
                        return Unit.f46060a;
                    case 2:
                        iiy[] iiyVarArr3 = szk.Q1;
                        ((View) obj).getClass();
                        if (szkVar.N()) {
                            ii iiVar = szkVar.M1;
                            if (iiVar == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string = szkVar.o0().getString(R.string.are_you_sure);
                            String string2 = szkVar.o0().getString(R.string.durak_concede_message);
                            String string3 = szkVar.o0().getString(R.string.concede);
                            string3.getClass();
                            DialogFields dialogFields = new DialogFields((CharSequence) string, (CharSequence) string2, (CharSequence) string3, szkVar.o0().getString(R.string.cancel), (String) null, "REQUEST_CONCEDE", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                            androidx.fragment.app.e eVarC = szkVar.C();
                            eVarC.getClass();
                            iiVar.d(dialogFields, eVarC);
                        }
                        return Unit.f46060a;
                    default:
                        iiy[] iiyVarArr4 = szk.Q1;
                        ((View) obj).getClass();
                        l0l l0lVarJ2 = szkVar.J0();
                        bby bbyVar3 = l0lVarJ2.r;
                        if (bbyVar3 == null || !bbyVar3.isActive()) {
                            l0lVarJ2.r = sac.V(jiu0.a(l0lVarJ2), new k0l(1, l0lVarJ2, l0l.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, l0lVarJ2.c.b, new g0l(l0lVarJ2, null, (byte) 1), 10);
                        }
                        return Unit.f46060a;
                }
            }
        });
        final byte b3 = 2;
        dyb.O((Button) e0fVar.f, new Function1(this) { // from class: a.nzk
            public final /* synthetic */ szk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                szk szkVar = this.b;
                switch (b4) {
                    case 0:
                        Pair pair = (Pair) obj;
                        iiy[] iiyVarArr = szk.Q1;
                        pair.getClass();
                        l0l l0lVarJ0 = szkVar.J0();
                        qb8 qb8Var = (qb8) pair.f46059a;
                        nbe nbeVar = (nbe) pair.b;
                        bby bbyVar = l0lVarJ0.r;
                        if (bbyVar == null || !bbyVar.isActive()) {
                            l0lVarJ0.r = sac.V(jiu0.a(l0lVarJ0), new k0l(1, l0lVarJ0, l0l.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, l0lVarJ0.c.b, new atj(l0lVarJ0, qb8Var, nbeVar, null, (byte) 1), 10);
                        }
                        return Unit.f46060a;
                    case 1:
                        iiy[] iiyVarArr2 = szk.Q1;
                        ((View) obj).getClass();
                        l0l l0lVarJ1 = szkVar.J0();
                        bby bbyVar2 = l0lVarJ1.r;
                        if (bbyVar2 == null || !bbyVar2.isActive()) {
                            l0lVarJ1.r = sac.V(jiu0.a(l0lVarJ1), new k0l(1, l0lVarJ1, l0l.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, l0lVarJ1.c.b, new g0l(l0lVarJ1, null, (byte) 2), 10);
                        }
                        return Unit.f46060a;
                    case 2:
                        iiy[] iiyVarArr3 = szk.Q1;
                        ((View) obj).getClass();
                        if (szkVar.N()) {
                            ii iiVar = szkVar.M1;
                            if (iiVar == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string = szkVar.o0().getString(R.string.are_you_sure);
                            String string2 = szkVar.o0().getString(R.string.durak_concede_message);
                            String string3 = szkVar.o0().getString(R.string.concede);
                            string3.getClass();
                            DialogFields dialogFields = new DialogFields((CharSequence) string, (CharSequence) string2, (CharSequence) string3, szkVar.o0().getString(R.string.cancel), (String) null, "REQUEST_CONCEDE", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                            androidx.fragment.app.e eVarC = szkVar.C();
                            eVarC.getClass();
                            iiVar.d(dialogFields, eVarC);
                        }
                        return Unit.f46060a;
                    default:
                        iiy[] iiyVarArr4 = szk.Q1;
                        ((View) obj).getClass();
                        l0l l0lVarJ2 = szkVar.J0();
                        bby bbyVar3 = l0lVarJ2.r;
                        if (bbyVar3 == null || !bbyVar3.isActive()) {
                            l0lVarJ2.r = sac.V(jiu0.a(l0lVarJ2), new k0l(1, l0lVarJ2, l0l.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, l0lVarJ2.c.b, new g0l(l0lVarJ2, null, (byte) 1), 10);
                        }
                        return Unit.f46060a;
                }
            }
        });
        ccq0.V(this, "REQUEST_CONCEDE", new lrk(szqVarI0, this, (byte) 4));
        dyb.O((ImageView) e0fVar.g, new Function1() { // from class: a.pzk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b2;
                szq szqVar = szqVarI0;
                switch (b4) {
                    case 0:
                        e0f e0fVar2 = szqVar.b;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        iiy[] iiyVarArr = szk.Q1;
                        int i = zBooleanValue ? 0 : 8;
                        ((ImageView) e0fVar2.g).setVisibility(i);
                        ((ImageView) e0fVar2.i).setVisibility(i);
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = szk.Q1;
                        ((View) obj).getClass();
                        DominoHandView dominoHandView3 = (DominoHandView) szqVar.b.n;
                        int i2 = dominoHandView3.h;
                        if (dominoHandView3.l) {
                            dominoHandView3.o = dominoHandView3.j + i2 + dominoHandView3.o;
                            dominoHandView3.a(Response.OK, true);
                            dominoHandView3.l = dominoHandView3.o < i2;
                        }
                        break;
                    default:
                        iiy[] iiyVarArr3 = szk.Q1;
                        ((View) obj).getClass();
                        DominoHandView dominoHandView4 = (DominoHandView) szqVar.b.n;
                        byte b5 = dominoHandView4.j;
                        int i3 = dominoHandView4.h;
                        if (dominoHandView4.m) {
                            int i4 = b5 + i3;
                            dominoHandView4.o -= i4;
                            dominoHandView4.a(Response.OK, true);
                            dominoHandView4.m = (-dominoHandView4.o) < ((dominoHandView4.e.size() * i4) - dominoHandView4.getMeasuredWidth()) + i3;
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        dyb.O((ImageView) e0fVar.i, new Function1() { // from class: a.pzk
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b4 = b3;
                szq szqVar = szqVarI0;
                switch (b4) {
                    case 0:
                        e0f e0fVar2 = szqVar.b;
                        boolean zBooleanValue = ((Boolean) obj).booleanValue();
                        iiy[] iiyVarArr = szk.Q1;
                        int i = zBooleanValue ? 0 : 8;
                        ((ImageView) e0fVar2.g).setVisibility(i);
                        ((ImageView) e0fVar2.i).setVisibility(i);
                        break;
                    case 1:
                        iiy[] iiyVarArr2 = szk.Q1;
                        ((View) obj).getClass();
                        DominoHandView dominoHandView3 = (DominoHandView) szqVar.b.n;
                        int i2 = dominoHandView3.h;
                        if (dominoHandView3.l) {
                            dominoHandView3.o = dominoHandView3.j + i2 + dominoHandView3.o;
                            dominoHandView3.a(Response.OK, true);
                            dominoHandView3.l = dominoHandView3.o < i2;
                        }
                        break;
                    default:
                        iiy[] iiyVarArr3 = szk.Q1;
                        ((View) obj).getClass();
                        DominoHandView dominoHandView4 = (DominoHandView) szqVar.b.n;
                        byte b5 = dominoHandView4.j;
                        int i3 = dominoHandView4.h;
                        if (dominoHandView4.m) {
                            int i4 = b5 + i3;
                            dominoHandView4.o -= i4;
                            dominoHandView4.a(Response.OK, true);
                            dominoHandView4.m = (-dominoHandView4.o) < ((dominoHandView4.e.size() * i4) - dominoHandView4.getMeasuredWidth()) + i3;
                        }
                        break;
                }
                return Unit.f46060a;
            }
        });
        final byte b4 = 3;
        dyb.O((Button) e0fVar.j, new Function1(this) { // from class: a.nzk
            public final /* synthetic */ szk b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                byte b5 = b4;
                szk szkVar = this.b;
                switch (b5) {
                    case 0:
                        Pair pair = (Pair) obj;
                        iiy[] iiyVarArr = szk.Q1;
                        pair.getClass();
                        l0l l0lVarJ0 = szkVar.J0();
                        qb8 qb8Var = (qb8) pair.f46059a;
                        nbe nbeVar = (nbe) pair.b;
                        bby bbyVar = l0lVarJ0.r;
                        if (bbyVar == null || !bbyVar.isActive()) {
                            l0lVarJ0.r = sac.V(jiu0.a(l0lVarJ0), new k0l(1, l0lVarJ0, l0l.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 0), null, l0lVarJ0.c.b, new atj(l0lVarJ0, qb8Var, nbeVar, null, (byte) 1), 10);
                        }
                        return Unit.f46060a;
                    case 1:
                        iiy[] iiyVarArr2 = szk.Q1;
                        ((View) obj).getClass();
                        l0l l0lVarJ1 = szkVar.J0();
                        bby bbyVar2 = l0lVarJ1.r;
                        if (bbyVar2 == null || !bbyVar2.isActive()) {
                            l0lVarJ1.r = sac.V(jiu0.a(l0lVarJ1), new k0l(1, l0lVarJ1, l0l.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 4), null, l0lVarJ1.c.b, new g0l(l0lVarJ1, null, (byte) 2), 10);
                        }
                        return Unit.f46060a;
                    case 2:
                        iiy[] iiyVarArr3 = szk.Q1;
                        ((View) obj).getClass();
                        if (szkVar.N()) {
                            ii iiVar = szkVar.M1;
                            if (iiVar == null) {
                                Intrinsics.h("actionDialogManager");
                                throw null;
                            }
                            String string = szkVar.o0().getString(R.string.are_you_sure);
                            String string2 = szkVar.o0().getString(R.string.durak_concede_message);
                            String string3 = szkVar.o0().getString(R.string.concede);
                            string3.getClass();
                            DialogFields dialogFields = new DialogFields((CharSequence) string, (CharSequence) string2, (CharSequence) string3, szkVar.o0().getString(R.string.cancel), (String) null, "REQUEST_CONCEDE", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                            androidx.fragment.app.e eVarC = szkVar.C();
                            eVarC.getClass();
                            iiVar.d(dialogFields, eVarC);
                        }
                        return Unit.f46060a;
                    default:
                        iiy[] iiyVarArr4 = szk.Q1;
                        ((View) obj).getClass();
                        l0l l0lVarJ2 = szkVar.J0();
                        bby bbyVar3 = l0lVarJ2.r;
                        if (bbyVar3 == null || !bbyVar3.isActive()) {
                            l0lVarJ2.r = sac.V(jiu0.a(l0lVarJ2), new k0l(1, l0lVarJ2, l0l.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 3), null, l0lVarJ2.c.b, new g0l(l0lVarJ2, null, (byte) 1), 10);
                        }
                        return Unit.f46060a;
                }
            }
        });
        dominoHandView2.addOnLayoutChangeListener(new w23(new ngh(szqVarI0, this, (byte) 19), (byte) 0));
    }

    @Override // a.yx5
    public final void C0() {
        pfi pfiVar;
        Fragment fragment = this.y;
        mzk mzkVar = fragment instanceof mzk ? (mzk) fragment : null;
        if (mzkVar == null || (pfiVar = (pfi) mzkVar.W1.getValue()) == null) {
            return;
        }
        this.L1 = new fiu0(Collections.singletonMap(l0l.class, pfiVar.r0));
        this.M1 = pfiVar.f26907a.j();
    }

    @Override // a.yx5
    public final void D0() throws Exception {
        p7m0 p7m0Var = J0().s;
        qzk qzkVar = new qzk(this, null, (byte) 0);
        lkz lkzVar = lkz.f20223a;
        clz clzVarW = aac.W(this);
        qjj.W(x0x.Q(clzVarW.x()), null, null, new xsj(p7m0Var, clzVarW, qzkVar, (yje) null), 3);
        p7m0 p7m0Var2 = J0().t;
        qzk qzkVar2 = new qzk(this, null, (byte) 1);
        clz clzVarW2 = aac.W(this);
        qjj.W(x0x.Q(clzVarW2.x()), null, null, new xsj((gmq) p7m0Var2, clzVarW2, qzkVar2, (yje) null, (byte) 0), 3);
    }

    public final void G0(n0l n0lVar) {
        List list = n0lVar.l;
        if (list == null || list.isEmpty()) {
            e0f e0fVar = I0().b;
            TextView textView = e0fVar.b;
            DominoHandView dominoHandView = (DominoHandView) e0fVar.n;
            ArrayList<qb8> arrayList = dominoHandView.e;
            if (arrayList.size() != 0) {
                qb8 qb8Var = null;
                qb8 qb8Var2 = null;
                for (qb8 qb8Var3 : arrayList) {
                    boolean z = qb8Var3.d;
                    if (z && qb8Var == null) {
                        qb8Var = qb8Var3;
                    }
                    if (!z && qb8Var2 == null) {
                        qb8Var2 = qb8Var3;
                    }
                    if (qb8Var != null && z && qb8Var3.p > qb8Var.p) {
                        qb8Var = qb8Var3;
                    }
                    if (qb8Var2 != null && !z && qb8Var3.p + qb8Var3.q > qb8Var2.p + qb8Var2.q) {
                        qb8Var2 = qb8Var3;
                    }
                }
                if (qb8Var != null) {
                    qb8Var.s = true;
                } else if (qb8Var2 != null) {
                    qb8Var2.s = true;
                }
                dominoHandView.r = 1;
                dominoHandView.invalidate();
            }
            textView.setVisibility(0);
            textView.setText(R.string.domino_your_turn);
            ((Button) e0fVar.j).setVisibility(8);
            ((LinearLayout) e0fVar.m).setVisibility(0);
            ((Button) e0fVar.l).setEnabled(false);
        }
    }

    public final void H0(boolean z) {
        ((LinearLayout) I0().b.m).setEnabled(z);
        ((Button) I0().b.j).setEnabled(z);
        ((DominoHandView) I0().b.n).n = z;
    }

    public final szq I0() {
        Object objN = this.O1.n(Q1[0], this);
        objN.getClass();
        return (szq) objN;
    }

    public final l0l J0() {
        return (l0l) this.N1.getValue();
    }

    public final void K0(boolean z) {
        I0().c.setVisibility(!z ? 0 : 8);
        ((FrameLayout) I0().b.e).setVisibility(z ? 0 : 4);
    }

    public final void L0(n0l n0lVar) {
        e0f e0fVar = I0().b;
        e0fVar.c.setText(I(R.string.domino_market_v2, Integer.valueOf(n0lVar.r)));
        Button button = (Button) e0fVar.j;
        TextView textView = e0fVar.b;
        Button button2 = (Button) e0fVar.l;
        LinearLayout linearLayout = (LinearLayout) e0fVar.m;
        DominoHandView dominoHandView = (DominoHandView) e0fVar.n;
        DominoTableView dominoTableView = dominoHandView.k;
        if (dominoTableView == null) {
            Intrinsics.h("tableView");
            throw null;
        }
        int headValue = dominoTableView.getHeadValue();
        DominoTableView dominoTableView2 = dominoHandView.k;
        if (dominoTableView2 == null) {
            Intrinsics.h("tableView");
            throw null;
        }
        int tailValue = dominoTableView2.getTailValue();
        dominoHandView.r = 0;
        for (qb8 qb8Var : dominoHandView.e) {
            boolean zB = qb8Var.b(headValue, tailValue);
            qb8Var.s = zB;
            dominoHandView.r += zB ? 1 : 0;
        }
        dominoHandView.invalidate();
        if (dominoHandView.r == 0) {
            linearLayout.setVisibility(0);
            button2.setEnabled(true);
            textView.setVisibility(0);
            textView.setText(R.string.domino_have_not_avaible_bones);
        } else {
            e0fVar.c.setOnClickListener(null);
            linearLayout.setVisibility(0);
            button2.setEnabled(false);
            textView.setVisibility(8);
        }
        button.setVisibility(8);
        if (n0lVar.r == 0) {
            linearLayout.setVisibility(0);
            button2.setEnabled(false);
            if (dominoHandView.r == 0) {
                button.setVisibility(0);
            }
        }
        if (n0lVar.e != lnm0.b || n0lVar.t) {
            if (n0lVar.f == 1) {
                new Handler().postDelayed(new a4e((DominoHandView) I0().b.h, n0lVar.n), 1000L);
            }
            button.setVisibility(8);
            linearLayout.setVisibility(0);
            button2.setEnabled(false);
            textView.setVisibility(8);
            J0().z(new ozk(this, n0lVar, (byte) 0));
        }
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: z0 */
    public final j9o0 getK1() {
        return this.K1;
    }
}
