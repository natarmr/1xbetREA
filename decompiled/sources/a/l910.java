package a;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.media3.ui.PlayerControlView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.bonus_games.impl.lottery.presentation.views.LotteryView;
import org.xplatform.core.presentation.views.OneXGamesInputEditText;
import org.xplatform.lucky_card.presentation.views.LuckyCardChoiceView;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l910 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19630a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l910(Object obj, byte b) {
        this.f19630a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r9v8 */
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
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.f19630a;
        jle jleVar = jle.f16712a;
        byte b2 = 3;
        p0w0 p0w0Var = p0w0.f26173a;
        InputMethodManager inputMethodManager = 0;
        final byte b3 = 0;
        z = false;
        boolean z = false;
        final byte b4 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                final LotteryView lotteryView = (LotteryView) obj;
                if (lotteryView.f == n910.b && lotteryView.b == null) {
                    lotteryView.f = n910.c;
                    view.getClass();
                    sdq0 sdq0Var = (sdq0) view;
                    lotteryView.b = sdq0Var;
                    sdq0Var.setErasable(true);
                    sdq0[] sdq0VarArr = lotteryView.f46440a;
                    ArrayList<sdq0> arrayList = new ArrayList();
                    for (sdq0 sdq0Var2 : sdq0VarArr) {
                        if (sdq0Var2 != lotteryView.b) {
                            arrayList.add(sdq0Var2);
                        }
                    }
                    for (sdq0 sdq0Var3 : arrayList) {
                        if (sdq0Var3 != null) {
                            sdq0Var3.a();
                        }
                    }
                    lotteryView.removeView(view);
                    lotteryView.addView(view);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.play(ObjectAnimator.ofFloat(view, "rotation", view.getRotation(), 0.0f)).with(ObjectAnimator.ofFloat(view, "translationX", view.getTranslationX(), 0.0f)).with(ObjectAnimator.ofFloat(view, "translationY", view.getTranslationY(), 0.0f)).with(ObjectAnimator.ofFloat(view, "scaleX", view.getScaleX(), 1.0f)).with(ObjectAnimator.ofFloat(view, "scaleY", view.getScaleY(), 1.0f));
                    animatorSet.setDuration(600L);
                    animatorSet.setInterpolator(new f0p((byte) 1));
                    animatorSet.addListener(new x73(new Function0() { // from class: a.m910
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b5 = b3;
                            LotteryView lotteryView2 = lotteryView;
                            switch (b5) {
                                case 0:
                                    float[] fArr = LotteryView.j;
                                    lotteryView2.setLayerType(2, null);
                                    break;
                                default:
                                    float[] fArr2 = LotteryView.j;
                                    lotteryView2.setLayerType(0, null);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, new Function0() { // from class: a.m910
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            byte b5 = b4;
                            LotteryView lotteryView2 = lotteryView;
                            switch (b5) {
                                case 0:
                                    float[] fArr = LotteryView.j;
                                    lotteryView2.setLayerType(2, null);
                                    break;
                                default:
                                    float[] fArr2 = LotteryView.j;
                                    lotteryView2.setLayerType(0, null);
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    }, 10));
                    lotteryView.d = animatorSet;
                    animatorSet.start();
                    return;
                }
                return;
            case 1:
                fj10 fj10Var = ((LuckyCardChoiceView) obj).c;
                if (fj10Var != null) {
                    view.getClass();
                    Object tag = view.getTag();
                    tag.getClass();
                    ej10 ej10Var = (ej10) tag;
                    lj10 lj10Var = (lj10) ((yox) fj10Var).f43005a;
                    iiy[] iiyVarArr = lj10.O1;
                    uj10 uj10Var = (uj10) lj10Var.M1.getValue();
                    mne mneVar = uj10Var.c;
                    if (!uj10Var.d.a()) {
                        sac.V(jiu0.a(uj10Var), rj10.f30570a, null, mneVar.f22085a, new slx(uj10Var, inputMethodManager, (byte) 26), 10);
                        return;
                    }
                    bby bbyVar = uj10Var.m;
                    if (bbyVar == null || !bbyVar.isActive()) {
                        uj10Var.m = sac.V(jiu0.a(uj10Var), new pf10(1, uj10Var, uj10.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 5), null, mneVar.b, new fhq(ej10Var, uj10Var, inputMethodManager, (byte) 20), 10);
                        return;
                    }
                    return;
                }
                return;
            case 2:
                ((e730) obj).w();
                return;
            case 3:
                ((f730) obj).w();
                return;
            case 4:
                atz atzVar = s730.Q1;
                dy20 dy20Var = (dy20) ((s730) obj).M1.getValue();
                v3c.N(dy20Var.w);
                v3c.N(dy20Var.x);
                i1w0 i1w0Var = dy20Var.f;
                CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
                ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0Var), i1w0Var, copyOnWriteArrayListQ, 0);
                while (true) {
                    paw pawVar = (paw) listIteratorP;
                    if (!pawVar.hasNext()) {
                        return;
                    } else {
                        i1w0Var.a((oe50) pawVar.next());
                    }
                }
                break;
            case 5:
                ((com.google.android.material.datepicker.f) obj).I0();
                throw null;
            case 6:
                htz htzVar = lo60.U1;
                dyb.P(ymx.INTERVAL_500, new fo60((lo60) obj, b4));
                return;
            case 7:
                evz evzVar = cu60.U1;
                i1w0 i1w0Var2 = ((cu60) obj).H0().b;
                CopyOnWriteArrayList copyOnWriteArrayListQ2 = b1j.q(i1w0Var2);
                ListIterator listIteratorP2 = b1j.p(copyOnWriteArrayListQ2, new c8d(y7d.f42146a, p0w0Var), i1w0Var2, copyOnWriteArrayListQ2, 0);
                while (true) {
                    paw pawVar2 = (paw) listIteratorP2;
                    if (!pawVar2.hasNext()) {
                        return;
                    } else {
                        i1w0Var2.a((oe50) pawVar2.next());
                    }
                }
                break;
            case 8:
                dg70 dg70Var = (dg70) obj;
                xuz xuzVar = dg70.Q1;
                dg70Var.I0().f.requestFocus();
                OneXGamesInputEditText oneXGamesInputEditText = dg70Var.I0().f;
                Editable text = dg70Var.I0().f.getText();
                oneXGamesInputEditText.setSelection(text != null ? text.length() : 0);
                Object systemService = dg70Var.o0().getSystemService("input_method");
                inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : 0;
                if (inputMethodManager != 0) {
                    inputMethodManager.showSoftInput(dg70Var.I0().f, 2);
                    return;
                }
                return;
            case 9:
                mh70 mh70Var = (mh70) obj;
                jh70 jh70Var = mh70.Q1;
                mh70Var.H0().f.requestFocus();
                OneXGamesInputEditText oneXGamesInputEditText2 = mh70Var.H0().f;
                Editable text2 = mh70Var.H0().f.getText();
                oneXGamesInputEditText2.setSelection(text2 != null ? text2.length() : 0);
                Object systemService2 = mh70Var.o0().getSystemService("input_method");
                InputMethodManager inputMethodManager2 = systemService2 instanceof InputMethodManager ? (InputMethodManager) systemService2 : null;
                if (inputMethodManager2 != null) {
                    inputMethodManager2.showSoftInput(mh70Var.H0().f, 1);
                    return;
                }
                return;
            case 10:
                xi70 xi70Var = aj70.P1;
                tj70 tj70VarH0 = ((aj70) obj).H0();
                if (tj70VarH0.h.a() || !tj70VarH0.g.a()) {
                    tj70VarH0.w(jleVar);
                    return;
                }
                return;
            case 11:
                rl70 rl70Var = ul70.Q1;
                nm70 nm70VarH0 = ((ul70) obj).H0();
                if (nm70VarH0.i.a() || !nm70VarH0.g.a()) {
                    nm70VarH0.w(jleVar);
                    return;
                }
                return;
            case 12:
                z880 z880Var = (z880) obj;
                xi70 xi70Var2 = z880.U1;
                j120.Y(z880Var);
                aa80 aa80VarH0 = z880Var.H0();
                sac.V(jiu0.a(aa80VarH0), u980.f35272a, null, aa80VarH0.g.f22085a, new v980(aa80VarH0, null), 10);
                return;
            case 13:
                u190 u190Var = (u190) obj;
                EditText editText = u190Var.f;
                if (editText == null) {
                    return;
                }
                int selectionEnd = editText.getSelectionEnd();
                EditText editText2 = u190Var.f;
                if (editText2 != null && (editText2.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    z = true;
                }
                EditText editText3 = u190Var.f;
                if (z) {
                    editText3.setTransformationMethod(null);
                } else {
                    editText3.setTransformationMethod(PasswordTransformationMethod.getInstance());
                }
                if (selectionEnd >= 0) {
                    u190Var.f.setSelection(selectionEnd);
                }
                u190Var.p();
                return;
            case 14:
                ((gz) obj).invoke();
                return;
            case 15:
                PlayerControlView playerControlView = (PlayerControlView) obj;
                float[] fArr = PlayerControlView.i2;
                playerControlView.o(!playerControlView.R1);
                return;
            case 16:
                PlayerControlView playerControlView2 = ((y0a0) obj).h;
                my90 my90Var = playerControlView2.Q1;
                if (my90Var == null || !((ulo) my90Var).w(29)) {
                    return;
                }
                scs0 scs0VarV = ((ulo) playerControlView2.Q1).v();
                my90 my90Var2 = playerControlView2.Q1;
                String str = vtt0.f38024a;
                nyj nyjVar = (nyj) scs0VarV;
                nyjVar.getClass();
                myj myjVar = new myj(nyjVar);
                myjVar.b(1);
                myjVar.i(1, false);
                ((ulo) my90Var2).R(myjVar.a());
                ((String[]) playerControlView2.m.f)[1] = playerControlView2.getResources().getString(R.string.exo_track_selection_auto);
                playerControlView2.r.dismiss();
                return;
            case 17:
                d1a0 d1a0Var = (d1a0) obj;
                PlayerControlView playerControlView3 = d1a0Var.x;
                int iD = d1a0Var.d();
                float[] fArr2 = PlayerControlView.i2;
                View view2 = playerControlView3.j1;
                if (iD == 0) {
                    b1a0 b1a0Var = playerControlView3.n;
                    view2.getClass();
                    playerControlView3.d(b1a0Var, view2);
                    return;
                } else {
                    if (iD != 1) {
                        playerControlView3.r.dismiss();
                        return;
                    }
                    y0a0 y0a0Var = playerControlView3.p;
                    view2.getClass();
                    playerControlView3.d(y0a0Var, view2);
                    return;
                }
            case 18:
                PlayerControlView playerControlView4 = ((y0a0) obj).h;
                my90 my90Var3 = playerControlView4.Q1;
                if (my90Var3 == null || !((ulo) my90Var3).w(29)) {
                    return;
                }
                scs0 scs0VarV2 = ((ulo) playerControlView4.Q1).v();
                my90 my90Var4 = playerControlView4.Q1;
                nyj nyjVar2 = (nyj) scs0VarV2;
                nyjVar2.getClass();
                myj myjVar2 = new myj(nyjVar2);
                myjVar2.b(3);
                myjVar2.d();
                myjVar2.f();
                myjVar2.h();
                ((ulo) my90Var4).R(myjVar2.a());
                playerControlView4.r.dismiss();
                return;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                n1a0 n1a0Var = (n1a0) obj;
                n1a0Var.g();
                if (view.getId() == R.id.exo_overflow_show) {
                    n1a0Var.r.start();
                    return;
                } else {
                    if (view.getId() == R.id.exo_overflow_hide) {
                        n1a0Var.s.start();
                        return;
                    }
                    return;
                }
            case 20:
                xi70 xi70Var3 = u6b0.e2;
                sbb0 sbb0VarJ0 = ((u6b0) obj).J0();
                int iIndexOf = ((r9b0) sbb0VarJ0.B0.getValue()).b.indexOf(s9b0.ONE_X_GAMES);
                if (iIndexOf != -1) {
                    sbb0VarJ0.G(iIndexOf, "");
                    return;
                }
                return;
            case 21:
                jh70 jh70Var2 = crb0.S1;
                orb0 orb0VarH0 = ((crb0) obj).H0();
                sac.V(jiu0.a(orb0VarH0), new irb0(orb0VarH0, b3), null, orb0VarH0.e.b, new kpb0(orb0VarH0, inputMethodManager, b4), 10);
                return;
            case 22:
                ((b0c0) obj).invoke();
                return;
            case 23:
                ((b0c0) obj).invoke();
                return;
            case 24:
                ((b0c0) obj).invoke();
                return;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                jh70 jh70Var3 = a6d0.f2;
                ((a6d0) obj).y0();
                return;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                rl70 rl70Var2 = snd0.n2;
                qnd0 qnd0Var = (qnd0) ((snd0) obj).m2.getValue();
                sac.V(jiu0.a(qnd0Var), new ond0(qnd0Var, b4), null, qnd0Var.i.f22085a, new ts6(qnd0Var, (yje) inputMethodManager, b2), 10);
                return;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                iiy[] iiyVarArr2 = xbe0.Q1;
                i1w0 i1w0Var3 = ((xbe0) obj).H0().c;
                CopyOnWriteArrayList copyOnWriteArrayListQ3 = b1j.q(i1w0Var3);
                ListIterator listIteratorP3 = b1j.p(copyOnWriteArrayListQ3, new c8d(y7d.f42146a, p0w0Var), i1w0Var3, copyOnWriteArrayListQ3, 0);
                while (true) {
                    paw pawVar3 = (paw) listIteratorP3;
                    if (!pawVar3.hasNext()) {
                        return;
                    } else {
                        i1w0Var3.a((oe50) pawVar3.next());
                    }
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                gne0 gne0Var = jne0.S1;
                pzu pzuVar = ((jne0) obj).H0().g;
                i1w0 i1w0VarC = ((oeg0) pzuVar.f27863a).c();
                k0w0 k0w0VarI = cs0.i(i1w0VarC, i1w0VarC);
                k0w0VarI.c(jh70.i((jh70) pzuVar.e, ((pru) pzuVar.f).a().V0));
                ListIterator listIteratorO = b1j.o(i1w0VarC, k0w0VarI.f17489a, 0);
                while (true) {
                    paw pawVar4 = (paw) listIteratorO;
                    if (!pawVar4.hasNext()) {
                        return;
                    } else {
                        i1w0VarC.a((oe50) pawVar4.next());
                    }
                }
                break;
            default:
                hoe0 hoe0Var = ((doe0) obj).N1;
                if (hoe0Var != null) {
                    hoe0Var.c.B();
                    return;
                } else {
                    Intrinsics.h("viewModel");
                    throw null;
                }
        }
    }
}
