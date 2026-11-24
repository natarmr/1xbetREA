package a;

import android.content.Context;
import android.content.res.ColorStateList;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.statistic.stage.impl.champ_statistic_tour_net.presentation.adapter.LinearLayoutManagerWithAccurateOffset;
import org.xplatform.statistic.tennis.impl.summary.domain.models.TennisSummaryFilterModel;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;

/* JADX INFO: loaded from: classes4.dex */
public final class ssl0 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssl0(pun0 pun0Var, String str, yje yjeVar) {
        super(2, yjeVar);
        this.i = (byte) 10;
        this.k = pun0Var;
        this.j = str;
    }

    private final Object l(Object obj) {
        dpq0 dpq0Var = (dpq0) this.k;
        rpq0 rpq0Var = (rpq0) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (Intrinsics.d(rpq0Var, ppq0.f27383a)) {
            m6m0 m6m0Var = dpq0.R1;
            z5r z5rVarG0 = dpq0Var.G0();
            x0x.s(z5rVarG0.f43832a);
            z5rVarG0.c.setVisibility(0);
            z5rVarG0.b.setVisibility(8);
            z5rVarG0.e.setVisibility(8);
        } else if (rpq0Var instanceof qpq0) {
            qpq0 qpq0Var = (qpq0) rpq0Var;
            m6m0 m6m0Var2 = dpq0.R1;
            dpq0Var.G0().c.setVisibility(8);
            dpq0Var.G0().b.setVisibility(8);
            x0x.O(dpq0Var.G0().f43832a);
            dpq0Var.G0().e.setVisibility(0);
            spm0 spm0Var = dpq0Var.P1;
            if (spm0Var != null) {
                mpq0 mpq0Var = qpq0Var.f29132a;
                spm0Var.q(mpq0Var.c, mpq0Var.b, mpq0Var.f22190a, new w8b(new h9b(""), null, null, 30));
            }
        } else if (rpq0Var instanceof opq0) {
            opq0 opq0Var = (opq0) rpq0Var;
            m6m0 m6m0Var3 = dpq0.R1;
            z5r z5rVarG1 = dpq0Var.G0();
            ConstraintLayout constraintLayout = z5rVarG1.f43832a;
            DSLottieEmptyContainer dSLottieEmptyContainer = z5rVarG1.b;
            x0x.O(constraintLayout);
            z5rVarG1.c.setVisibility(8);
            boolean z = opq0Var.b;
            jkm jkmVar = opq0Var.f25656a;
            if (z) {
                int i = DSLottieEmptyContainer.d;
                dSLottieEmptyContainer.b(jkmVar, 10000L, new bmh((byte) 12));
            } else {
                dSLottieEmptyContainer.a(jkmVar);
            }
            dSLottieEmptyContainer.setVisibility(0);
            z5rVarG1.e.setVisibility(8);
        } else {
            if (!Intrinsics.d(rpq0Var, npq0.f23926a)) {
                t9f.b();
                return null;
            }
            m6m0 m6m0Var4 = dpq0.R1;
            dpq0Var.G0().c.setVisibility(8);
            dpq0Var.G0().b.setVisibility(8);
            dpq0Var.G0().e.setVisibility(8);
        }
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new ssl0(this.j, obj2, yjeVar, (byte) 0);
            case 1:
                ssl0 ssl0Var = new ssl0(obj2, yjeVar, (byte) 1);
                ssl0Var.j = obj;
                return ssl0Var;
            case 2:
                ssl0 ssl0Var2 = new ssl0(obj2, yjeVar, (byte) 2);
                ssl0Var2.j = obj;
                return ssl0Var2;
            case 3:
                ssl0 ssl0Var3 = new ssl0(obj2, yjeVar, (byte) 3);
                ssl0Var3.j = obj;
                return ssl0Var3;
            case 4:
                ssl0 ssl0Var4 = new ssl0(obj2, yjeVar, (byte) 4);
                ssl0Var4.j = obj;
                return ssl0Var4;
            case 5:
                ssl0 ssl0Var5 = new ssl0(obj2, yjeVar, (byte) 5);
                ssl0Var5.j = obj;
                return ssl0Var5;
            case 6:
                return new ssl0(yjeVar, this.j, obj2, (byte) 6);
            case 7:
                return new ssl0(yjeVar, this.j, obj2, (byte) 7);
            case 8:
                ssl0 ssl0Var6 = new ssl0(obj2, yjeVar, (byte) 8);
                ssl0Var6.j = obj;
                return ssl0Var6;
            case 9:
                ssl0 ssl0Var7 = new ssl0(obj2, yjeVar, (byte) 9);
                ssl0Var7.j = obj;
                return ssl0Var7;
            case 10:
                return new ssl0((pun0) obj2, (String) this.j, yjeVar);
            case 11:
                ssl0 ssl0Var8 = new ssl0(obj2, yjeVar, (byte) 11);
                ssl0Var8.j = obj;
                return ssl0Var8;
            case 12:
                ssl0 ssl0Var9 = new ssl0(obj2, yjeVar, (byte) 12);
                ssl0Var9.j = obj;
                return ssl0Var9;
            case 13:
                ssl0 ssl0Var10 = new ssl0(obj2, yjeVar, (byte) 13);
                ssl0Var10.j = obj;
                return ssl0Var10;
            case 14:
                ssl0 ssl0Var11 = new ssl0(obj2, yjeVar, (byte) 14);
                ssl0Var11.j = obj;
                return ssl0Var11;
            case 15:
                ssl0 ssl0Var12 = new ssl0(obj2, yjeVar, (byte) 15);
                ssl0Var12.j = obj;
                return ssl0Var12;
            case 16:
                ssl0 ssl0Var13 = new ssl0(obj2, yjeVar, (byte) 16);
                ssl0Var13.j = obj;
                return ssl0Var13;
            case 17:
                ssl0 ssl0Var14 = new ssl0(obj2, yjeVar, (byte) 17);
                ssl0Var14.j = obj;
                return ssl0Var14;
            case 18:
                return new ssl0(this.j, obj2, yjeVar, (byte) 18);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new ssl0(this.j, obj2, yjeVar, (byte) 19);
            case 20:
                ssl0 ssl0Var15 = new ssl0(obj2, yjeVar, (byte) 20);
                ssl0Var15.j = obj;
                return ssl0Var15;
            case 21:
                return new ssl0(this.j, obj2, yjeVar, (byte) 21);
            case 22:
                return new ssl0(this.j, obj2, yjeVar, (byte) 22);
            case 23:
                return new ssl0(this.j, obj2, yjeVar, (byte) 23);
            case 24:
                ssl0 ssl0Var16 = new ssl0(obj2, yjeVar, (byte) 24);
                ssl0Var16.j = obj;
                return ssl0Var16;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ssl0 ssl0Var17 = new ssl0(obj2, yjeVar, (byte) 25);
                ssl0Var17.j = obj;
                return ssl0Var17;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return new ssl0(this.j, obj2, yjeVar, (byte) 26);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ssl0 ssl0Var18 = new ssl0(obj2, yjeVar, (byte) 27);
                ssl0Var18.j = obj;
                return ssl0Var18;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ssl0 ssl0Var19 = new ssl0(obj2, yjeVar, (byte) 28);
                ssl0Var19.j = obj;
                return ssl0Var19;
            default:
                ssl0 ssl0Var20 = new ssl0(obj2, yjeVar, (byte) 29);
                ssl0Var20.j = obj;
                return ssl0Var20;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((ssl0) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((ssl0) create((sxl0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((ssl0) create((w2m0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((ssl0) create((q1m0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((ssl0) create((q1m0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((ssl0) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((ssl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((ssl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((ssl0) create((uaq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((ssl0) create((bin0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((ssl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((ssl0) create((jsn0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((ssl0) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((ssl0) create((sw00) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((ssl0) create((e9p0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((ssl0) create((njp0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((ssl0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((ssl0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((ssl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((ssl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((ssl0) create((TennisSummaryFilterModel) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((ssl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((ssl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((ssl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((ssl0) create((hkq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((ssl0) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((ssl0) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((ssl0) create((uoq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((ssl0) create((rpq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((ssl0) create((xqq0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:286:0x06f8  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Window window;
        Window window2;
        Window window3;
        tyj tyjVar;
        Object objQ0;
        int iIntValue;
        i7m0 i7m0Var;
        Object[] objArr;
        int i;
        int i2;
        boolean z;
        Integer num;
        Integer num2;
        List listL0;
        Object value3;
        Object value4;
        Object value5;
        pym0 euq0Var;
        Fragment fragment;
        View viewJ;
        View decorView;
        fk60 fk60Var;
        int iIntValue2 = 3;
        int i3 = 4;
        char c = 4;
        char c2 = 4;
        byte b = 1;
        byte b2 = 0;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                int length = ((String) this.j).length();
                vsl0 vsl0Var = (vsl0) this.k;
                ocj ocjVar = vsl0Var.i;
                if (length > 0) {
                    int i4 = vsl0.F;
                    p7m0 p7m0Var = ocjVar.f25029a;
                    do {
                        value2 = p7m0Var.getValue();
                        value2.getClass();
                    } while (!p7m0Var.m(value2, lsl0.a((lsl0) value2, null, null, false, false, false, false, false, null, null, 8183)));
                } else if (!((lsl0) vsl0Var.D()).d) {
                    p7m0 p7m0Var2 = ocjVar.f25029a;
                    do {
                        value = p7m0Var2.getValue();
                        value.getClass();
                    } while (!p7m0Var2.m(value, lsl0.a((lsl0) value, null, null, false, true, false, true, false, null, null, 7927)));
                }
                return Unit.f46060a;
            case 1:
                ovl0 ovl0Var = (ovl0) this.k;
                sxl0 sxl0Var = (sxl0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                if (sxl0Var == null) {
                    t9f.b();
                    return null;
                }
                new a1x(ovl0Var.o0(), sxl0Var.f32983a).show();
                ovl0Var.G0().x(bvl0.f3283a);
                return Unit.f46060a;
            case 2:
                x1m0 x1m0Var = x1m0.f40129a;
                ryl0 ryl0Var = (ryl0) this.k;
                w2m0 w2m0Var = (w2m0) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                if (w2m0Var != null) {
                    if (w2m0Var instanceof v2m0) {
                        zie0 zie0Var = ryl0.U1;
                        ryl0Var.G0().x(b2m0.f1859a);
                        ryl0Var.G0().x(x1m0Var);
                    } else if (w2m0Var instanceof u2m0) {
                        int i5 = bhv.k2;
                        androidx.fragment.app.e eVarC = ryl0Var.C();
                        eVarC.getClass();
                        if (eVarC.J("select_group_dialog_request_key") == null) {
                            new bhv().H0(eVarC, "select_group_dialog_request_key");
                        }
                        ryl0Var.G0().x(x1m0Var);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 3:
                syl0 syl0Var = (syl0) this.k;
                q1m0 q1m0Var = (q1m0) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                vhh0 vhh0Var = q1m0Var.b().c;
                if (vhh0Var instanceof lhh0) {
                    eke0 eke0Var = syl0.f2;
                    syl0Var.N0(false);
                    syl0Var.J0();
                } else if (vhh0Var instanceof mhh0) {
                    eke0 eke0Var2 = syl0.f2;
                    syl0Var.N0(false);
                    syl0Var.I0();
                } else if (vhh0Var instanceof shh0) {
                    eke0 eke0Var3 = syl0.f2;
                    syl0Var.N0(true);
                } else if (vhh0Var instanceof rhh0) {
                    eke0 eke0Var4 = syl0.f2;
                    syl0Var.L0();
                    syl0Var.N0(true);
                }
                eke0 eke0Var5 = syl0.f2;
                if (q1m0Var instanceof o1m0) {
                    syl0Var.M0(true);
                } else if (q1m0Var instanceof p1m0) {
                    zfb zfbVar = syl0Var.W1;
                    if (zfbVar == null) {
                        syl0Var.M0(false);
                        List list = ((p1m0) q1m0Var).b;
                        syl0Var.G0().c.setVisibility(8);
                        syl0Var.G0().g.setLayoutManager(new LinearLayoutManagerWithAccurateOffset(syl0Var.o0()));
                        syl0Var.W1 = new zfb(list, syl0Var.V1, new kyl0(syl0Var, c), new myl0(syl0Var, (byte) 2), new kyl0(syl0Var, b), new d930((byte) 1), true);
                        syl0Var.G0().g.setAdapter(syl0Var.W1);
                        syl0Var.G0().g.setHasFixedSize(true);
                        syl0Var.G0().g.setOnFlingListener(new fgb(syl0Var, b));
                        RecyclerView recyclerView = syl0Var.G0().g;
                        zfb zfbVar2 = syl0Var.W1;
                        if (zfbVar2 != null) {
                            recyclerView.m(new twk(zfbVar2));
                        }
                    } else {
                        List list2 = ((p1m0) q1m0Var).b;
                        list2.getClass();
                        zfbVar.k = list2;
                    }
                    xhh0 xhh0Var = ((p1m0) q1m0Var).c;
                    jk3 jk3Var = syl0Var.Z1;
                    if (jk3Var != null) {
                        ((TextView) jk3Var.f).setText(xhh0Var.f40892a);
                        boolean z2 = xhh0Var.d;
                        int i6 = R.attr.uikitSecondary40;
                        int i7 = z2 ? R.attr.uikitPrimary : R.attr.uikitSecondary40;
                        if (xhh0Var.e) {
                            i6 = R.attr.uikitPrimary;
                        }
                        ((ImageView) jk3Var.d).setImageTintList(ColorStateList.valueOf(m5d.b(i7, syl0Var.o0())));
                        ((ImageView) jk3Var.c).setImageTintList(ColorStateList.valueOf(m5d.b(i6, syl0Var.o0())));
                    }
                    zfb zfbVar3 = syl0Var.W1;
                    if (zfbVar3 != null) {
                        zfbVar3.A(xhh0Var.b, xhh0Var.c);
                    }
                } else if (!(q1m0Var instanceof n1m0)) {
                    if (!(q1m0Var instanceof m1m0)) {
                        t9f.b();
                        return null;
                    }
                    if (syl0Var.W1 == null) {
                        jkm jkmVar = ((m1m0) q1m0Var).b;
                        syl0Var.K0(false);
                        c5r c5rVarG0 = syl0Var.G0();
                        c5rVarG0.g.setVisibility(8);
                        DSLottieEmptyContainer dSLottieEmptyContainer = c5rVarG0.c;
                        dSLottieEmptyContainer.a(jkmVar);
                        dSLottieEmptyContainer.setVisibility(0);
                    }
                } else if (syl0Var.W1 == null) {
                    jkm jkmVar2 = ((n1m0) q1m0Var).b;
                    syl0Var.K0(false);
                    c5r c5rVarG1 = syl0Var.G0();
                    c5rVarG1.g.setVisibility(8);
                    DSLottieEmptyContainer dSLottieEmptyContainer2 = c5rVarG1.c;
                    int i8 = DSLottieEmptyContainer.d;
                    dSLottieEmptyContainer2.b(jkmVar2, 10000L, new bmh((byte) 12));
                    dSLottieEmptyContainer2.setVisibility(0);
                }
                syl0Var.Q1 = g7x.Y(q1m0Var.b().c);
                return Unit.f46060a;
            case 4:
                t0m0 t0m0Var = (t0m0) this.k;
                yzn0 yzn0Var = t0m0Var.O1;
                q1m0 q1m0Var2 = (q1m0) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                vhh0 vhh0Var2 = q1m0Var2.b().c;
                if (vhh0Var2 instanceof lhh0) {
                    gne0 gne0Var = t0m0.Z1;
                    yzn0Var.u(t0m0Var, t0m0.a2[4], q0m0.d);
                    kxq kxqVarB = t0m0Var.B();
                    if (kxqVarB != null && (window3 = kxqVarB.getWindow()) != null) {
                        Context contextO0 = t0m0Var.o0();
                        TypedValue typedValue = j5d.f15927a;
                        ofm0.A(window3, contextO0, R.color.static_transparent, j5d.a(t0m0Var.o0(), R.attr.uikitBackground, true), false, !qem0.r(t0m0Var.B()));
                    }
                } else if (vhh0Var2 instanceof mhh0) {
                    gne0 gne0Var2 = t0m0.Z1;
                    yzn0Var.u(t0m0Var, t0m0.a2[4], q0m0.c);
                    kxq kxqVarB2 = t0m0Var.B();
                    if (kxqVarB2 != null && (window2 = kxqVarB2.getWindow()) != null) {
                        Context contextO1 = t0m0Var.o0();
                        TypedValue typedValue2 = j5d.f15927a;
                        ofm0.A(window2, contextO1, j5d.a(t0m0Var.o0(), R.attr.uikitBackground, true), j5d.a(t0m0Var.o0(), R.attr.uikitBackground, true), !qem0.r(t0m0Var.B()), !qem0.r(t0m0Var.B()));
                    }
                } else if (vhh0Var2 instanceof rhh0) {
                    gne0 gne0Var3 = t0m0.Z1;
                    yzn0Var.u(t0m0Var, t0m0.a2[4], q0m0.b);
                    kxq kxqVarB3 = t0m0Var.B();
                    if (kxqVarB3 != null && (window = kxqVarB3.getWindow()) != null) {
                        Context contextO2 = t0m0Var.o0();
                        TypedValue typedValue3 = j5d.f15927a;
                        ofm0.A(window, contextO2, R.color.static_transparent, j5d.a(t0m0Var.o0(), R.attr.uikitBackground, true), !qem0.r(t0m0Var.B()), !qem0.r(t0m0Var.B()));
                    }
                }
                t0m0Var.Q1 = g7x.Y(q1m0Var2.b().c);
                return Unit.f46060a;
            case 5:
                String str = (String) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                w3m0 w3m0Var = (w3m0) this.k;
                int i9 = w3m0.N;
                Iterable<j1m0> iterable = ((l1m0) w3m0Var.D()).c;
                if (iterable == null) {
                    iterable = iun.f15405a;
                }
                iterable.getClass();
                str.getClass();
                if (str.length() == 0) {
                    tyjVar = new tyj(iun.f15405a);
                } else {
                    ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
                    for (j1m0 j1m0Var : iterable) {
                        if (j1m0Var != null) {
                            if (j1m0Var instanceof i1m0) {
                                objQ0 = b5x.J(((i1m0) j1m0Var).f14006a.b);
                            } else if (j1m0Var instanceof g1m0) {
                                g1m0 g1m0Var = (g1m0) j1m0Var;
                                objQ0 = CollectionsKt.q0(b5x.J(g1m0Var.f10520a.b), b5x.J(g1m0Var.b.b));
                            } else if (j1m0Var instanceof h1m0) {
                                objQ0 = iun.f15405a;
                            }
                            arrayList.add(objQ0);
                        }
                        t9f.b();
                        return null;
                    }
                    ArrayList arrayListR = r3d.r(arrayList);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : arrayListR) {
                        lk50 lk50Var = (lk50) obj2;
                        if (b5x.a0(lk50Var.b, str) || b5x.a0(lk50Var.c, str)) {
                            arrayList2.add(obj2);
                        }
                    }
                    tyjVar = new tyj(arrayList2);
                }
                w3m0Var.M = tyjVar;
                xhh0 xhh0VarC = tyjVar.c(w3m0Var.s);
                p7m0 p7m0Var3 = w3m0Var.i.f25029a;
                while (true) {
                    Object value6 = p7m0Var3.getValue();
                    value6.getClass();
                    w3m0Var.f.getClass();
                    xhh0 xhh0Var2 = xhh0VarC;
                    if (p7m0Var3.m(value6, l1m0.a((l1m0) value6, false, false, null, null, xhh0VarC, null, null, 223))) {
                        return Unit.f46060a;
                    }
                    xhh0VarC = xhh0Var2;
                }
                break;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                if (!((Set) this.j).isEmpty()) {
                    zii0 zii0Var = new zii0((Set) this.j, true);
                    xii0 xii0Var = ((wii0) zii0Var.e.getValue()).c() ? (xii0) zii0Var.f.getValue() : null;
                    if (xii0Var != null) {
                        int i10 = xii0Var.g.c;
                        Integer numValueOf = i10 != -1 ? Integer.valueOf(i10) : null;
                        if (numValueOf != null) {
                            iIntValue = numValueOf.intValue();
                        } else {
                            iIntValue = 1;
                        }
                    } else {
                        iIntValue = 1;
                    }
                    synchronized (((i7m0) this.k).d) {
                        i7m0Var = (i7m0) this.k;
                        if (i7m0Var.i != iIntValue) {
                            i7m0Var.i = iIntValue;
                        } else {
                            b = 0;
                        }
                        break;
                    }
                    if (b != 0) {
                        i7m0Var.f();
                    }
                }
                return Unit.f46060a;
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                i7m0 i7m0Var2 = (i7m0) this.j;
                long j = ((lie0) this.k).f20100a;
                pot0 pot0Var = i7m0Var2.e;
                if (pot0Var == null) {
                    i7m0Var2.c(new c44("Camera is not active.", (byte) 1));
                } else {
                    synchronized (i7m0Var2.d) {
                        objArr = j == i7m0Var2.g;
                    }
                    if (objArr != false) {
                        synchronized (i7m0Var2.d) {
                            i = i7m0Var2.h;
                            i2 = i7m0Var2.i;
                            z = i7m0Var2.j;
                            num = i7m0Var2.k;
                            num2 = i7m0Var2.l;
                        }
                        int iD = i7m0Var2.d(i, z, num);
                        if (num2 != null) {
                            iIntValue2 = num2.intValue();
                        } else if (i2 == 1 || i2 != 3) {
                            iIntValue2 = 4;
                        }
                        Pair pair = new Pair(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(b34.j0(i7m0Var2.f14299a.b, iD)));
                        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
                        c1a c1aVar = i7m0Var2.f14299a.b;
                        c1aVar.getClass();
                        if (b34.h0(c1aVar).contains(Integer.valueOf(iIntValue2))) {
                            i3 = iIntValue2;
                        } else if (!b34.h0(c1aVar).contains(4)) {
                            i3 = b34.h0(c1aVar).contains(1) ? 1 : 0;
                        }
                        Pair pair2 = new Pair(key, Integer.valueOf(i3));
                        CaptureRequest.Key key2 = CaptureRequest.CONTROL_AWB_MODE;
                        c1a c1aVar2 = i7m0Var2.f14299a.b;
                        c1aVar2.getClass();
                        CameraCharacteristics.Key key3 = CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES;
                        key3.getClass();
                        Object obj3 = {0};
                        ow9 ow9Var = (ow9) c1aVar2;
                        Object objC = ow9Var.c(key3);
                        if (objC != null) {
                            obj3 = objC;
                        }
                        if (!new px3((int[]) obj3, (byte) 0).contains(1)) {
                            key3.getClass();
                            Object obj4 = {0};
                            Object objC2 = ow9Var.c(key3);
                            if (objC2 != null) {
                                obj4 = objC2;
                            }
                            if (!new px3((int[]) obj4, (byte) 0).contains(1)) {
                                b = 0;
                            }
                        }
                        try {
                            jzj jzjVarH = pot0Var.h(xp20.f(pair, pair2, new Pair(key2, Integer.valueOf(b))), oot0.b, not0.b);
                            synchronized (i7m0Var2.d) {
                                listL0 = CollectionsKt.L0(i7m0Var2.f);
                            }
                            jzjVarH.invokeOnCompletion(new u5l0((Object) listL0, (Object) i7m0Var2, (byte) 18));
                        } catch (Exception e) {
                            i7m0Var2.c(e);
                        }
                    }
                }
                return Unit.f46060a;
            case 8:
                uaq0 uaq0Var = (uaq0) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                ybm0 ybm0Var = (ybm0) this.k;
                nc5 nc5VarS = ybm0Var.x.s(ybm0Var.q, ybm0Var.r, uaq0Var, 0L);
                p7m0 p7m0Var4 = ybm0Var.i.f25029a;
                do {
                    value3 = p7m0Var4.getValue();
                    value3.getClass();
                } while (!p7m0Var4.m(value3, dcm0.a((dcm0) value3, false, false, null, nc5VarS, null, 191)));
                return Unit.f46060a;
            case 9:
                whn0 whn0Var = (whn0) this.k;
                bin0 bin0Var = (bin0) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                if (bin0Var instanceof ain0) {
                    ain0 ain0Var = (ain0) bin0Var;
                    s2m0 s2m0Var = whn0.Y1;
                    whn0Var.H0().e.setVisibility(0);
                    whn0Var.H0().b.setVisibility(8);
                    whn0Var.H0().e.d(ain0Var.f932a, ain0Var.b);
                } else if (bin0Var instanceof zhn0) {
                    ra10 ra10Var = ((zhn0) bin0Var).f44403a;
                    s2m0 s2m0Var2 = whn0.Y1;
                    whn0Var.H0().b.v(ra10Var);
                    whn0Var.H0().b.setVisibility(0);
                    whn0Var.H0().e.setVisibility(8);
                } else if (!Intrinsics.d(bin0Var, yhn0.f42645a)) {
                    t9f.b();
                    return null;
                }
                s2m0 s2m0Var3 = whn0.Y1;
                fin0 fin0VarJ0 = whn0Var.J0();
                fin0VarJ0.x(new cin0(fin0VarJ0, null == true ? 1 : 0, b2));
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                ((pun0) this.k).w.f(new jun0((String) this.j));
                return Unit.f46060a;
            case 11:
                jsn0 jsn0Var = (jsn0) this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                ((zyn0) this.k).h0.n(jsn0Var);
                return Unit.f46060a;
            case 12:
                sw00 sw00Var = (sw00) this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                if (sw00Var.b != sw00Var.f32897a) {
                    ((fho0) this.k).x0.y();
                }
                return Unit.f46060a;
            case 13:
                rio0 rio0Var = (rio0) this.k;
                sw00 sw00Var2 = (sw00) this.j;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                boolean z3 = sw00Var2.b;
                boolean z4 = sw00Var2.f32897a;
                if (z3 != z4) {
                    rio0Var.D0.y();
                }
                boolean z5 = sw00Var2.b;
                if (!z5 && z4) {
                    rio0Var.O0 = true;
                    bby bbyVar = rio0Var.R0;
                    if (bbyVar != null) {
                        bbyVar.cancel(null);
                    }
                    rio0Var.R0 = null;
                    rio0Var.G(10L);
                } else if (z5 && !z4) {
                    rio0Var.O0 = false;
                    bby bbyVar2 = rio0Var.R0;
                    if (bbyVar2 != null) {
                        bbyVar2.cancel(null);
                    }
                    rio0Var.R0 = null;
                }
                return Unit.f46060a;
            case 14:
                e9p0 e9p0Var = (e9p0) this.j;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                wbp0 wbp0Var = (wbp0) this.k;
                int i11 = wbp0.L;
                p7m0 p7m0Var5 = wbp0Var.i.f25029a;
                do {
                    value4 = p7m0Var5.getValue();
                    value4.getClass();
                } while (!p7m0Var5.m(value4, mbp0.a((mbp0) value4, false, null, null, null, e9p0Var, null, null, null, 31743)));
                return Unit.f46060a;
            case 15:
                a8z a8zVar = ((xip0) this.k).l2;
                njp0 njp0Var = (njp0) this.j;
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                if (njp0Var instanceof ljp0) {
                    g9m0 g9m0Var = xip0.n2;
                    ((uip0) a8zVar.getValue()).f = ((ljp0) njp0Var).f20164a;
                    ((uip0) a8zVar.getValue()).g();
                }
                return Unit.f46060a;
            case 16:
                Throwable th = (Throwable) this.j;
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                ((ykp0) this.k).s.b(th, new zgp0((byte) 3));
                return Unit.f46060a;
            case 17:
                Throwable th2 = (Throwable) this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                ((qnp0) this.k).r.b(th2, new zgp0((byte) 7));
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                ((urp0) this.j).t.f((lrp0) this.k);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                cgk0 cgk0Var = (cgk0) this.k;
                if (cgk0Var.l() >= ((ftp0) this.j).d) {
                    cgk0Var.m(0);
                }
                return Unit.f46060a;
            case 20:
                TennisSummaryFilterModel tennisSummaryFilterModel = (TennisSummaryFilterModel) this.j;
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                nzp0 nzp0Var = (nzp0) this.k;
                int i12 = nzp0.z;
                p7m0 p7m0Var6 = nzp0Var.i.f25029a;
                do {
                    value5 = p7m0Var6.getValue();
                    value5.getClass();
                } while (!p7m0Var6.m(value5, fzp0.a((fzp0) value5, false, false, false, null, false, tennisSummaryFilterModel, 63)));
                nzp0Var.M();
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                hcp0 hcp0Var = ((x1q0) this.j).i;
                bvq0 bvq0Var = (bvq0) this.k;
                if (bvq0Var instanceof uuq0) {
                    euq0Var = new auq0(((uuq0) bvq0Var).f36314a);
                } else if (bvq0Var instanceof vuq0) {
                    euq0Var = new buq0(((vuq0) bvq0Var).f38062a);
                } else if (bvq0Var instanceof yuq0) {
                    euq0Var = new luq0(((yuq0) bvq0Var).f43281a);
                } else if (bvq0Var instanceof zuq0) {
                    euq0Var = new quq0(((zuq0) bvq0Var).f45020a);
                } else if (bvq0Var instanceof avq0) {
                    euq0Var = new tuq0(((avq0) bvq0Var).f1539a);
                } else {
                    if (!(bvq0Var instanceof wuq0)) {
                        t9f.b();
                        return null;
                    }
                    euq0Var = new euq0(((wuq0) bvq0Var).f39802a);
                }
                hcp0Var.r(euq0Var);
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                ((rbq0) this.j).d.f((uaq0) this.k);
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                p7m0 p7m0Var7 = ((oeq0) this.j).s;
                heq0 heq0Var = (heq0) this.k;
                p7m0Var7.getClass();
                p7m0Var7.o(null, heq0Var);
                return Unit.f46060a;
            case 24:
                akq0 akq0Var = (akq0) this.k;
                hkq0 hkq0Var = (hkq0) this.j;
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                if (hkq0Var != null) {
                    if (hkq0Var instanceof ekq0) {
                        s9m0 s9m0Var = akq0.P1;
                        ii iiVar = akq0Var.L1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = akq0Var.H(R.string.warning);
                        String strH2 = akq0Var.H(R.string.change_the_limit_question);
                        String strH3 = akq0Var.H(R.string.confirm);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, akq0Var.H(R.string.cancel), (String) null, "REQUEST_CONFIRMATION_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488);
                        androidx.fragment.app.e eVarC2 = akq0Var.C();
                        eVarC2.getClass();
                        iiVar.d(dialogFields, eVarC2);
                    } else if (hkq0Var instanceof fkq0) {
                        String str2 = ((fkq0) hkq0Var).f9706a;
                        s9m0 s9m0Var2 = akq0.P1;
                        ii iiVar2 = akq0Var.L1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH4 = akq0Var.H(R.string.attention);
                        String strH5 = akq0Var.H(R.string.ok_new);
                        strH5.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) str2, (CharSequence) strH5, (String) null, (String) null, "REQUEST_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC3 = akq0Var.C();
                        eVarC3.getClass();
                        iiVar2.d(dialogFields2, eVarC3);
                    } else if (hkq0Var instanceof gkq0) {
                        String str3 = ((gkq0) hkq0Var).f11457a;
                        s9m0 s9m0Var3 = akq0.P1;
                        ii iiVar3 = akq0Var.L1;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH6 = akq0Var.H(R.string.attention);
                        String strH7 = akq0Var.H(R.string.ok_new);
                        strH7.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH6, (CharSequence) str3, (CharSequence) strH7, (String) null, (String) null, "REQUEST_RESPONSE_ERROR_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                        androidx.fragment.app.e eVarC4 = akq0Var.C();
                        eVarC4.getClass();
                        iiVar3.d(dialogFields3, eVarC4);
                    } else if (hkq0Var instanceof dkq0) {
                        s9m0 s9m0Var4 = akq0.P1;
                        akq0Var.F().t0(i120.U(), "SEND_RESULT_REQUEST_KEY");
                        akq0Var.G0().x(ujq0.f35795a);
                    }
                    akq0Var.G0().x(ojq0.f25372a);
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                Throwable th3 = (Throwable) this.j;
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                ((lkq0) this.k).q.b(th3, new shq0(c2));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                ((wmq0) this.j).h.f((umq0) this.k);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                uoq0 uoq0Var = (uoq0) this.j;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                if (!Intrinsics.d(uoq0Var, soq0.f32557a)) {
                    if (!(uoq0Var instanceof toq0)) {
                        t9f.b();
                        return null;
                    }
                    noq0 noq0Var = (noq0) this.k;
                    toq0 toq0Var = (toq0) uoq0Var;
                    List list3 = toq0Var.f34298a;
                    String str4 = toq0Var.b;
                    y2m0 y2m0Var = noq0.m2;
                    if (list3.isEmpty() || (fragment = noq0Var.y) == null || (viewJ = fragment.J()) == null || viewJ.getVisibility() != 0) {
                        noq0Var.y0();
                    } else {
                        xoq0 xoq0VarY0 = noq0Var.Y0();
                        if (!xoq0VarY0.K.m() && !xoq0VarY0.L.f() && (fk60Var = xoq0VarY0.j0) != null) {
                            xoq0VarY0.O.c(fk60Var, true);
                            xoq0VarY0.P.f(fk60Var);
                        }
                        noq0Var.L0().b.setText(str4);
                        noq0Var.L0().f.setVisibility(list3.size() > 1 ? 0 : 8);
                        noq0Var.T0().G(list3);
                        b = noq0Var.V0() != list3.size() - 1 ? (byte) 0 : (byte) 1;
                        qjk qjkVarL0 = noq0Var.L0();
                        qjkVarL0.c.setVisibility(b == 0 ? 0 : 8);
                        qjkVarL0.d.setVisibility(b == 0 ? 0 : 8);
                        qjkVarL0.b.setVisibility(b != 0 ? 0 : 8);
                        Window window4 = noq0Var.D0().getWindow();
                        if (window4 != null && (decorView = window4.getDecorView()) != null) {
                            decorView.setVisibility(0);
                        }
                        noq0Var.J0();
                    }
                }
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return l(obj);
            default:
                xqq0 xqq0Var = (xqq0) this.j;
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                sqq0 sqq0Var = (sqq0) this.k;
                g9m0 g9m0Var2 = sqq0.S1;
                sqq0Var.G0().c.setVisibility(xqq0Var instanceof vqq0 ? 0 : 8);
                boolean z6 = xqq0Var instanceof wqq0;
                sqq0Var.G0().e.setVisibility(z6 ? 0 : 8);
                boolean z7 = xqq0Var instanceof uqq0;
                sqq0Var.G0().b.setVisibility(z7 ? 0 : 8);
                if (z6) {
                    arq0 arq0Var = ((wqq0) xqq0Var).f39604a;
                    ((pqq0) sqq0Var.R1.getValue()).q(arq0Var.c, arq0Var.b, arq0Var.f1359a, new w8b(new h9b(""), null, null, 30));
                } else if (z7) {
                    uqq0 uqq0Var = (uqq0) xqq0Var;
                    jkm jkmVar3 = uqq0Var.f36130a;
                    if (uqq0Var.b) {
                        DSLottieEmptyContainer dSLottieEmptyContainer3 = sqq0Var.G0().b;
                        int i13 = DSLottieEmptyContainer.d;
                        dSLottieEmptyContainer3.b(jkmVar3, 10000L, new bmh((byte) 12));
                    } else {
                        sqq0Var.G0().b.a(jkmVar3);
                    }
                } else if (Intrinsics.d(xqq0Var, vqq0.f37866a)) {
                    x0x.s(sqq0Var.G0().c);
                }
                return Unit.f46060a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ssl0(yje yjeVar, Object obj, Object obj2, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ssl0(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ssl0(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }
}
