package a;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.coupon.impl.core.presentation.base.view.CouponCardBlock;
import org.xplatform.coupon.impl.coupon.presentation.common.LinearLayoutManagerWrapper;
import org.xplatform.ui_core.viewcomponents.views.BetInputView;
import org.xplatform.uikit.components.phone_text_field.DsPhoneTextField;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yw9 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43360a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yw9(Object obj, Object obj2, byte b) {
        this.f43360a = b;
        this.b = obj;
        this.c = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:80:0x01ed  */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List listQ0;
        p9k0 p9k0VarG;
        byte b = this.f43360a;
        byte b2 = 2;
        x960 x960Var = null;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((CameraManager) obj2).unregisterAvailabilityCallback((pw9) obj);
                return Unit.f46060a;
            case 1:
                cpv0 cpv0Var = (cpv0) obj2;
                WorkDatabase workDatabase = cpv0Var.c;
                workDatabase.getClass();
                workDatabase.p(new fy2(cpv0Var, (UUID) obj, (byte) 21));
                m2h0.b(cpv0Var.b, workDatabase, cpv0Var.e);
                return Unit.f46060a;
            case 2:
                ((Function1) obj2).invoke(dja.BROADCASTING_VIDEO);
                return Unit.f46060a;
            case 3:
                ((Function1) obj2).invoke(dja.BROADCASTING_ZONE);
                return Unit.f46060a;
            case 4:
                iun iunVar = iun.f15405a;
                ysa ysaVar = new ysa(new zpv(false, false));
                boolean zL = ((svu) obj2).l();
                String str = (String) ((vzg0) obj).a("SEARCH_QUERY_KEY");
                if (str == null) {
                    str = "";
                }
                return new gsa(null, hm5.f13289a, true, false, iunVar, 0, 0, ysaVar, zL, false, false, str);
            case 5:
                ((Function1) ((pz40) obj2).getValue()).invoke(((axa) obj).f1614a);
                return Unit.f46060a;
            case 6:
                ((Function1) obj2).invoke(new jjb(((akb) obj).f1014a));
                return Unit.f46060a;
            case 7:
                ((Function1) obj2).invoke(new jjb(((ikb) obj).f14917a));
                return Unit.f46060a;
            case 8:
                ((Function1) obj2).invoke(new hkb0(((pjb) obj).f27081a));
                return Unit.f46060a;
            case 9:
                rqb rqbVar = (rqb) obj2;
                bj5 bj5Var = rqb.U1;
                j120.Y(rqbVar);
                DsPhoneTextField dsPhoneTextField = ((azq) obj).g;
                dsPhoneTextField.clearFocus();
                hrb hrbVarH0 = rqbVar.H0();
                String strValueOf = String.valueOf(dsPhoneTextField.getCode());
                String str2 = ((frb) hrbVarH0.x.getValue()).d;
                if (!StringsKt.W(str2)) {
                    if (hrbVarH0.E) {
                        sac.R(jiu0.a(hrbVarH0), new zhb(1, hrbVarH0, hrb.class, "handleError", "handleError(Ljava/lang/Throwable;)V", 0, (byte) 8), null, hrbVarH0.c.b, new xb2((Object) str2, (Object) hrbVarH0, (Object) strValueOf, (yje) null, (byte) 10));
                    } else {
                        hrbVarH0.z.f(zqb.f44800a);
                    }
                }
                return Unit.f46060a;
            case 10:
                yk5 yk5Var = zsb.n2;
                ((zsb) obj2).P0().x(new ssb(((fnb0) obj).f9827a));
                return Unit.f46060a;
            case 11:
                kl5 kl5Var = l5c.W1;
                v7c v7cVarI0 = ((l5c) obj2).I0();
                j6c j6cVar = j6c.f15977a;
                v7cVarI0.H(vm4.RESEND_CODE, q64.RESEND_CODE);
                if (j7c.b[0] == 1) {
                    v7cVarI0.c.d(new f6c(v7cVarI0, b2));
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 12:
                z9c z9cVar = (z9c) obj2;
                z9cVar.postDelayed(new fy2(z9cVar, (cym0) obj, (byte) 24), 300L);
                return Unit.f46060a;
            case 13:
                return new jic(((oif0) obj).u(), ((ntt) obj2).a());
            case 14:
                ao4 ao4Var = ((fq8) obj).f9960a;
                ((Function1) obj2).invoke(new g74(ao4Var.f1183a, ao4Var.c));
                return Unit.f46060a;
            case 15:
                ((uzc) obj2).f36530a.a().unregisterOnSharedPreferenceChangeListener((qzc) obj);
                return Unit.f46060a;
            case 16:
                return Boolean.valueOf(((Boolean) ((Function0) obj2).invoke()).booleanValue() && ((e2d) obj).f7077a.f26070a != 0.0f);
            case 17:
                return kotlin.collections.a.c(new Pair((nqp) obj2, (sgy) obj));
            case 18:
                fet fetVar = ((rld) obj2).f30691a;
                q9k0 q9k0Var = fetVar.c;
                p9k0 p9k0VarG2 = q9k0Var.g();
                int i = 0;
                while (true) {
                    try {
                        if (i < q9k0Var.b) {
                            if (p9k0VarG2.l(i)) {
                                Object objN = p9k0VarG2.n(i);
                                if (objN != obj) {
                                    jet jetVar = objN instanceof jet ? (jet) objN : null;
                                    if ((jetVar != null ? jetVar.f16392a : null) == obj) {
                                    }
                                }
                                x960 x960Var2 = new x960(i, null);
                                p9k0VarG2.c();
                                x960Var = x960Var2;
                                if (x960Var != null) {
                                    int i2 = x960Var.f40495a;
                                    Integer num = x960Var.b;
                                    p9k0VarG = q9k0Var.g();
                                    try {
                                        ArrayList arrayListI0 = aac.i0(p9k0VarG, i2, num);
                                        p9k0VarG.c();
                                        listQ0 = CollectionsKt.q0(arrayListI0, fetVar.I());
                                    } catch (Throwable th) {
                                        p9k0VarG.c();
                                        throw th;
                                    }
                                } else {
                                    listQ0 = iun.f15405a;
                                }
                                return new ikd(listQ0, fetVar.C);
                            }
                            int[] iArr = p9k0VarG2.b;
                            int i3 = i + 1;
                            int iD = (i3 < p9k0VarG2.c ? iArr[(i3 * 5) + 4] : p9k0VarG2.e) - s9k0.d(iArr, i);
                            int i4 = 0;
                            while (true) {
                                if (i4 >= iD) {
                                    i = i3;
                                } else {
                                    Object objH = p9k0VarG2.h(i, i4);
                                    if (objH != obj) {
                                        jet jetVar2 = objH instanceof jet ? (jet) objH : null;
                                        if ((jetVar2 != null ? jetVar2.f16392a : null) != obj) {
                                            i4++;
                                        }
                                    }
                                    x960Var = new x960(i, Integer.valueOf(i4));
                                }
                            }
                        }
                        p9k0VarG2.c();
                        if (x960Var != null) {
                            int i5 = x960Var.f40495a;
                            Integer num2 = x960Var.b;
                            p9k0VarG = q9k0Var.g();
                            ArrayList arrayListI1 = aac.i0(p9k0VarG, i5, num2);
                            p9k0VarG.c();
                            listQ0 = CollectionsKt.q0(arrayListI1, fetVar.I());
                        } else {
                            listQ0 = iun.f15405a;
                        }
                        return new ikd(listQ0, fetVar.C);
                    } catch (Throwable th2) {
                        p9k0VarG2.c();
                        throw th2;
                    }
                }
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (ksd) ((vby) obj2).b(ksd.Companion.serializer(), (String) obj);
            case 20:
                fee.h.getClass();
                return new fee((Function1) obj, obj2);
            case 21:
                CouponCardBlock couponCardBlock = ((rcu0) ((cp) obj2).u).b;
                Context context = couponCardBlock.getContext();
                context.getClass();
                couponCardBlock.setLayoutManager(new LinearLayoutManagerWrapper(context));
                couponCardBlock.setAdapter((ase) ((a8z) obj).getValue());
                ((RecyclerView) couponCardBlock.q.g).setItemAnimator(null);
                return Unit.f46060a;
            case 22:
                ((rcu0) ((cp) obj2).u).b.removeCallbacks((zre) obj);
                return Unit.f46060a;
            case 23:
                kud kudVar = axe.e2;
                ((axe) obj2).N0((List) obj);
                return Unit.f46060a;
            case 24:
                axe axeVar = (axe) obj2;
                String str3 = (String) obj;
                kud kudVar2 = axe.e2;
                wdk0 wdk0Var = axeVar.U1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                String strH = axeVar.H(R.string.coupon_save_copyed);
                strH.getClass();
                j120.M(axeVar, wdk0Var, "", str3, strH, null, Integer.valueOf(R.drawable.data_copy_icon), null, 80);
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                List list = ((pwq0) obj).f;
                kud kudVar3 = axe.e2;
                ((axe) obj2).N0(list);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                axe axeVar2 = (axe) obj2;
                k3f k3fVar = (k3f) ((c4f) obj);
                boolean z = k3fVar.f17614a;
                boolean z2 = k3fVar.b;
                boolean z3 = k3fVar.c;
                boolean z4 = k3fVar.d;
                kud kudVar4 = axe.e2;
                if (axeVar2.C().J(rre.class.getSimpleName()) == null) {
                    rre.m2.getClass();
                    rre rreVar = new rre();
                    iiy[] iiyVarArr = rre.n2;
                    rreVar.g2.x(rreVar, iiyVarArr[0], "COUPON_ACTION_REQUEST_KEY");
                    rreVar.h2.v(rreVar, iiyVarArr[1], z);
                    rreVar.i2.v(rreVar, iiyVarArr[2], z2);
                    rreVar.j2.v(rreVar, iiyVarArr[3], z3);
                    rreVar.k2.v(rreVar, iiyVarArr[4], z4);
                    androidx.fragment.app.e eVarC = axeVar2.C();
                    eVarC.getClass();
                    sj3.D0(rreVar, eVarC);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                rye ryeVar = (rye) obj2;
                BetInputView betInputView = (BetInputView) obj;
                kwd kwdVar = rye.S1;
                ryeVar.G0().e.clearFocus();
                betInputView.clearFocus();
                j120.X(betInputView);
                ryeVar.H0().D(false);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                usd usdVar = gze.S1;
                ((BetInputView) obj2).u();
                ((gze) obj).I0().a0();
                return Unit.f46060a;
            default:
                ((Function1) obj2).invoke(((mie0) obj).f21842a);
                return Unit.f46060a;
        }
    }
}
