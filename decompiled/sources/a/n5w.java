package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class n5w extends rer implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22965a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n5w(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.f22965a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Set setA;
        byte b = 0;
        switch (this.f22965a) {
            case 0:
                Throwable th = (Throwable) obj;
                th.getClass();
                ((q5w) this.receiver).w(th);
                return Unit.f46060a;
            case 1:
                Throwable th2 = (Throwable) obj;
                th2.getClass();
                ((q5w) this.receiver).w(th2);
                return Unit.f46060a;
            case 2:
                Throwable th3 = (Throwable) obj;
                th3.getClass();
                ((q5w) this.receiver).w(th3);
                return Unit.f46060a;
            case 3:
                Throwable th4 = (Throwable) obj;
                th4.getClass();
                ((q5w) this.receiver).w(th4);
                return Unit.f46060a;
            case 4:
                Throwable th5 = (Throwable) obj;
                th5.getClass();
                q5w q5wVar = (q5w) this.receiver;
                q5wVar.w.b(th5, new l5w(q5wVar, b));
                return Unit.f46060a;
            case 5:
                Throwable th6 = (Throwable) obj;
                th6.getClass();
                ((q5w) this.receiver).w(th6);
                return Unit.f46060a;
            case 6:
                Throwable th7 = (Throwable) obj;
                th7.getClass();
                ((q5w) this.receiver).w(th7);
                return Unit.f46060a;
            case 7:
                y7w y7wVar = (y7w) obj;
                y7wVar.getClass();
                r7w r7wVar = (r7w) this.receiver;
                bst bstVar = r7w.q2;
                r7wVar.getClass();
                phf0 phf0Var = r7wVar.o2;
                if (y7wVar.equals(x7w.f40434a)) {
                    vcc.f0(i120.V(new Pair("RESULT_HIDE_BET_HISTORY_CLICK", Boolean.TRUE)), r7wVar, phf0Var.n(r7wVar, r7w.r2[3]));
                } else if (y7wVar instanceof v7w) {
                    vcc.f0(i120.V(new Pair("RESULT_BET_HISTORY_CLICK", ((v7w) y7wVar).f36950a)), r7wVar, phf0Var.n(r7wVar, r7w.r2[3]));
                } else {
                    y7wVar.equals(w7w.f38693a);
                }
                r7wVar.y0();
                return Unit.f46060a;
            case 8:
                u7w u7wVar = (u7w) obj;
                u7wVar.getClass();
                ((k3t0) this.receiver).x(u7wVar);
                return Unit.f46060a;
            case 9:
                Throwable th8 = (Throwable) obj;
                th8.getClass();
                ((naw) this.receiver).y(th8);
                return Unit.f46060a;
            case 10:
                Throwable th9 = (Throwable) obj;
                th9.getClass();
                ((naw) this.receiver).y(th9);
                return Unit.f46060a;
            case 11:
                Throwable th10 = (Throwable) obj;
                th10.getClass();
                ((naw) this.receiver).y(th10);
                return Unit.f46060a;
            case 12:
                Throwable th11 = (Throwable) obj;
                th11.getClass();
                ((duj) this.receiver).a(th11);
                return Unit.f46060a;
            case 13:
                kew kewVar = (kew) obj;
                kewVar.getClass();
                cdw cdwVar = (cdw) this.receiver;
                rqt rqtVar = cdw.R1;
                if (kewVar instanceof jew) {
                    jew jewVar = (jew) kewVar;
                    m0k0 m0k0Var = jewVar.f16396a;
                    m97 m97Var = jewVar.b;
                    mq2 mq2Var = jewVar.c;
                    e720 e720Var = cdwVar.M1;
                    if (e720Var == null) {
                        Intrinsics.h("makeBetBottomSheetProvider");
                        throw null;
                    }
                    androidx.fragment.app.e eVarC = cdwVar.C();
                    eVarC.getClass();
                    e720Var.b(eVarC, m97Var, m0k0Var, mq2Var);
                } else if (kewVar instanceof hew) {
                    vq vqVar = cdwVar.N1;
                    if (vqVar == null) {
                        Intrinsics.h("addEventToCouponDelegate");
                        throw null;
                    }
                    hew hewVar = (hew) kewVar;
                    vqVar.a(cdwVar, hewVar.f12944a, null, null, null, ctc.b, true, new mq2(), hewVar.b, hewVar.c);
                } else {
                    cdwVar.getClass();
                    if (!kewVar.equals(iew.f14657a)) {
                        t9f.b();
                        return null;
                    }
                    vq vqVar2 = cdwVar.N1;
                    if (vqVar2 == null) {
                        Intrinsics.h("addEventToCouponDelegate");
                        throw null;
                    }
                    vqVar2.b(cdwVar, null, null);
                }
                cdwVar.G0().x(dcw.f5865a);
                return Unit.f46060a;
            case 14:
                Throwable th12 = (Throwable) obj;
                th12.getClass();
                ((duj) this.receiver).a(th12);
                return Unit.f46060a;
            case 15:
                Throwable th13 = (Throwable) obj;
                th13.getClass();
                ((duj) this.receiver).a(th13);
                return Unit.f46060a;
            case 16:
                Throwable th14 = (Throwable) obj;
                th14.getClass();
                ((duj) this.receiver).a(th14);
                return Unit.f46060a;
            case 17:
                Throwable th15 = (Throwable) obj;
                th15.getClass();
                ((duj) this.receiver).a(th15);
                return Unit.f46060a;
            case 18:
                rjw rjwVar = (rjw) obj;
                rjwVar.getClass();
                oiw oiwVar = (oiw) this.receiver;
                ujd ujdVar = oiwVar.L1;
                if (ujdVar == null) {
                    Intrinsics.h("composeGameCardFragmentDelegate");
                    throw null;
                }
                ujdVar.b(oiwVar, rjwVar.f30618a);
                ((k3t0) oiwVar.N1.getValue()).x(agw.f846a);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                xhw xhwVar = (xhw) obj;
                xhwVar.getClass();
                ((k3t0) this.receiver).x(xhwVar);
                return Unit.f46060a;
            case 20:
                ujw ujwVar = (ujw) obj;
                ujwVar.getClass();
                piw piwVar = (piw) this.receiver;
                sqt sqtVar = piw.Y1;
                piwVar.getClass();
                if (ujwVar instanceof qjw) {
                    ujd ujdVar2 = piwVar.L1;
                    if (ujdVar2 == null) {
                        Intrinsics.h("composeGameCardFragmentDelegate");
                        throw null;
                    }
                    ujdVar2.b(piwVar, ((qjw) ujwVar).f28860a);
                } else if (ujwVar instanceof tjw) {
                    androidx.fragment.app.e eVarC2 = piwVar.C();
                    eVarC2.getClass();
                    if (!tdc.T(eVarC2)) {
                        if (piwVar.O1 == null) {
                            Intrinsics.h("tipsDialogFeature");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC3 = piwVar.C();
                        eVarC3.getClass();
                        uuz uuzVar = fk60.b;
                        ki60.q2.getClass();
                        if (eVarC3.J("OnboardingBottomSheetContainerFragment") == null) {
                            ki60 ki60Var = new ki60();
                            iiy[] iiyVarArr = ki60.r2;
                            ki60Var.n2.I(ki60Var, iiyVarArr[1], 7);
                            ki60Var.o2.x(ki60Var, iiyVarArr[2], "");
                            sj3.E0(ki60Var, eVarC3, "OnboardingBottomSheetContainerFragment");
                        }
                    }
                } else {
                    if (!(ujwVar instanceof sjw)) {
                        t9f.b();
                        return null;
                    }
                    wdk0 wdk0Var = piwVar.N1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, ((sjw) ujwVar).f32321a, piwVar, null, null, false, null, 1020);
                }
                piwVar.H0().x(bgw.f2577a);
                return Unit.f46060a;
            case 21:
                rmw rmwVar = (rmw) obj;
                rmwVar.getClass();
                ((k3t0) this.receiver).x(rmwVar);
                return Unit.f46060a;
            case 22:
                xnw xnwVar = (xnw) obj;
                xnwVar.getClass();
                ((k3t0) this.receiver).x(xnwVar);
                return Unit.f46060a;
            case 23:
                aqw aqwVar = (aqw) obj;
                aqwVar.getClass();
                ((k3t0) this.receiver).x(aqwVar);
                return Unit.f46060a;
            case 24:
                aqw aqwVar2 = (aqw) obj;
                aqwVar2.getClass();
                ((k3t0) this.receiver).x(aqwVar2);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                aqw aqwVar3 = (aqw) obj;
                aqwVar3.getClass();
                ((k3t0) this.receiver).x(aqwVar3);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                yqw yqwVar = (yqw) obj;
                yqwVar.getClass();
                ((k3t0) this.receiver).x(yqwVar);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                tbx tbxVar = (tbx) obj;
                tbxVar.getClass();
                ((k3t0) this.receiver).x(tbxVar);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                Set set = (Set) obj;
                set.getClass();
                mox moxVar = (mox) this.receiver;
                ReentrantLock reentrantLock = moxVar.d;
                reentrantLock.lock();
                try {
                    List<he60> listL0 = CollectionsKt.L0(moxVar.c.values());
                    reentrantLock.unlock();
                    for (he60 he60Var : listL0) {
                        he60Var.getClass();
                        int[] iArr = he60Var.b;
                        int length = iArr.length;
                        if (length == 0) {
                            setA = xun.f41520a;
                        } else if (length != 1) {
                            yni0 yni0Var = new yni0();
                            int length2 = iArr.length;
                            int i = 0;
                            int i2 = 0;
                            while (i < length2) {
                                int i3 = i2 + 1;
                                if (set.contains(Integer.valueOf(iArr[i]))) {
                                    yni0Var.add(he60Var.c[i2]);
                                }
                                i++;
                                i2 = i3;
                            }
                            setA = cui0.a(yni0Var);
                        } else {
                            setA = set.contains(Integer.valueOf(iArr[0])) ? he60Var.d : xun.f41520a;
                        }
                        if (!setA.isEmpty()) {
                            he60Var.f12906a.a(setA);
                        }
                    }
                    return Unit.f46060a;
                } catch (Throwable th16) {
                    reentrantLock.unlock();
                    throw th16;
                }
            default:
                xzx xzxVar = (xzx) obj;
                xzxVar.getClass();
                ((k3t0) this.receiver).x(xzxVar);
                return Unit.f46060a;
        }
    }
}
