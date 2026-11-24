package a;

import android.app.Dialog;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class ju7 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17138a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public ju7(agk0 agk0Var, vne vneVar, t33 t33Var, pz40 pz40Var, agk0 agk0Var2) {
        this.b = agk0Var;
        this.d = vneVar;
        this.e = t33Var;
        this.f = pz40Var;
        this.c = agk0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00ab  */
    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        androidx.fragment.app.e eVarC;
        Dialog dialog;
        byte b = this.f17138a;
        Object obj2 = this.f;
        Object obj3 = this.d;
        Object obj4 = this.c;
        Object obj5 = this.e;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                Pair pair = (Pair) obj;
                boolean zBooleanValue = ((Boolean) pair.f46059a).booleanValue();
                float fFloatValue = ((Number) pair.b).floatValue();
                agk0 agk0Var = (agk0) obj6;
                float fC = l1e0.c(fFloatValue / agk0Var.l(), 0.0f, 1.0f);
                if (zBooleanValue || fFloatValue == 0.0f || fFloatValue == agk0Var.l()) {
                    Object objF = ((t33) obj5).f(yjeVar, new Float(fC));
                    return objF == wne.f39444a ? objF : Unit.f46060a;
                }
                qjj.W((vne) obj3, null, null, new iu7((t33) obj5, (pz40) obj2, fC, (agk0) obj4, (agk0) obj6, null), 3);
                return Unit.f46060a;
            default:
                hdb0 hdb0Var = (hdb0) obj;
                Fragment fragment = (Fragment) obj6;
                androidx.fragment.app.e eVarC2 = fragment.C();
                eVarC2.getClass();
                roq0 roq0Var = (roq0) obj4;
                d9x.J(eVarC2, roq0Var, (lme0) obj3);
                if (Intrinsics.d(hdb0Var, bdb0.f2391a)) {
                    List listP = fragment.F().c.p();
                    listP.getClass();
                    List listP2 = fragment.C().c.p();
                    listP2.getClass();
                    ArrayList arrayListQ0 = CollectionsKt.q0(listP, listP2);
                    ArrayList<of80> arrayList = new ArrayList();
                    for (Object obj7 : arrayListQ0) {
                        if (obj7 instanceof of80) {
                            arrayList.add(obj7);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        jdk0 jdk0Var = qk4.i2;
                        eVarC = fragment.C();
                        eVarC.getClass();
                        jdk0Var.getClass();
                        if (eVarC.J("AUTH_OFFER_DIALOG_TAG") == null) {
                            new qk4().H0(eVarC, "AUTH_OFFER_DIALOG_TAG");
                        }
                        ((Function0) obj2).invoke();
                    } else {
                        for (of80 of80Var : arrayList) {
                            if (of80Var.N() && (dialog = of80Var.S1) != null && dialog.isShowing()) {
                                ((Function0) obj5).invoke();
                            }
                        }
                        jdk0 jdk0Var2 = qk4.i2;
                        eVarC = fragment.C();
                        eVarC.getClass();
                        jdk0Var2.getClass();
                        if (eVarC.J("AUTH_OFFER_DIALOG_TAG") == null) {
                            new qk4().H0(eVarC, "AUTH_OFFER_DIALOG_TAG");
                        }
                        ((Function0) obj2).invoke();
                    }
                } else if (Intrinsics.d(hdb0Var, cdb0.f4154a)) {
                    gst gstVar = jgv.h2;
                    androidx.fragment.app.e eVarC3 = fragment.C();
                    eVarC3.getClass();
                    gstVar.getClass();
                    if (eVarC3.J("GREETING_KZ_DIALOG_TAG") == null) {
                        new jgv().H0(eVarC3, "GREETING_KZ_DIALOG_TAG");
                    }
                } else if (Intrinsics.d(hdb0Var, edb0.f7608a)) {
                    androidx.fragment.app.e eVarC4 = fragment.C();
                    eVarC4.getClass();
                    uuz uuzVar = fk60.b;
                    roq0.c(roq0Var, eVarC4, 11);
                } else if (Intrinsics.d(hdb0Var, fdb0.f9352a)) {
                    androidx.fragment.app.e eVarC5 = fragment.C();
                    eVarC5.getClass();
                    uuz uuzVar2 = fk60.b;
                    roq0.c(roq0Var, eVarC5, 20);
                } else if (Intrinsics.d(hdb0Var, gdb0.f11097a)) {
                    androidx.fragment.app.e eVarC6 = fragment.C();
                    eVarC6.getClass();
                    zuf0.e2.getClass();
                    String str = zuf0.g2;
                    if (eVarC6.J(str) == null) {
                        new zuf0().H0(eVarC6, str);
                    }
                } else {
                    if (!Intrinsics.d(hdb0Var, ddb0.f5888a)) {
                        t9f.b();
                        return null;
                    }
                    androidx.fragment.app.e eVarC7 = fragment.C();
                    eVarC7.getClass();
                    uuz uuzVar3 = fk60.b;
                    roq0.c(roq0Var, eVarC7, 30);
                }
                return Unit.f46060a;
        }
    }

    public ju7(Fragment fragment, roq0 roq0Var, lme0 lme0Var, Function0 function0, Function0 function1) {
        this.b = fragment;
        this.c = roq0Var;
        this.d = lme0Var;
        this.e = function0;
        this.f = function1;
    }
}
