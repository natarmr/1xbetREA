package a;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.yandex.authsdk.internal.ChromeTabLoginActivity;
import java.io.File;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;
import org.xplatform.cyber.calendar.api.CyberCalendarParams;
import org.xplatform.cyber.calendar.impl.presentation.common.model.CyberCalendarPeriodUiModel;
import org.xplatform.cyber.calendar.impl.presentation.container.monthpicker.numberpicker.CyberCalendarMonthPicker;
import org.xplatform.cyber.game.counterstrike.impl.presentation.game_log.bomb.Cs2GameLogBombTimerView;
import org.xplatform.security.api.presentation.models.ConfirmationNewPlaceResultType;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes3.dex */
public final class fob extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fob(Object obj, Object obj2, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = obj;
        this.k = obj2;
    }

    private final Object G(Object obj) {
        h8g h8gVar = (h8g) this.k;
        ml9 ml9Var = (ml9) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (Intrinsics.d(ml9Var, kl9.f18475a)) {
            kud kudVar = h8g.l2;
            pb10 pb10VarK = ((CyberCalendarParams) h8gVar.i2.n(h8gVar, h8g.m2[0])).d ? pb10.q : ozb.K(-1L);
            DSLottieEmptyContainer dSLottieEmptyContainer = h8gVar.V0().d;
            g2v g2vVar = h8gVar.h2;
            if (g2vVar == null) {
                Intrinsics.h("lottieEmptyConfigurator");
                throw null;
            }
            dSLottieEmptyContainer.a(g2v.d(g2vVar, pb10VarK, null, null, 0, 0, null, 510));
            h8gVar.V0().d.setVisibility(0);
            h8gVar.V0().e.setVisibility(4);
        } else {
            if (!(ml9Var instanceof ll9)) {
                t9f.b();
                return null;
            }
            h8gVar.V0().d.setVisibility(8);
            CyberCalendarMonthPicker cyberCalendarMonthPicker = h8gVar.V0().e;
            cyberCalendarMonthPicker.setMinValue(0);
            jl9 jl9Var = ((ll9) ml9Var).f20236a;
            List list = jl9Var.b;
            cyberCalendarMonthPicker.setMaxValue(list.size() - 1);
            cyberCalendarMonthPicker.setDisplayedValues((String[]) list.toArray(new String[0]));
            cyberCalendarMonthPicker.setWrapSelectorWheel(false);
            cyberCalendarMonthPicker.setValue(jl9Var.f16704a);
            cyberCalendarMonthPicker.setVisibility(0);
            cyberCalendarMonthPicker.i();
        }
        return Unit.f46060a;
    }

    private final Object l(Object obj) {
        Object value;
        en7 en7Var = (en7) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        r7f r7fVar = (r7f) this.k;
        o4a o4aVar = r7fVar.B;
        o4aVar.getClass();
        en7Var.getClass();
        g45 g45Var = o4aVar.f24624a;
        q4f q4fVar = ((ave) g45Var.c).f1521a;
        en7 en7Var2 = ((lye) g45Var.f10647a).k;
        if ((q4fVar == q4f.e || q4fVar == q4f.g) && en7Var.e && !Intrinsics.d(en7Var2, en7Var)) {
            r7fVar.o1.a(kit0.f18353a);
            r7fVar.h0(false, false, new x5f((byte) 7));
        }
        ert ertVar = r7fVar.D;
        ertVar.getClass();
        lye lyeVar = (lye) ertVar.f8297a.f10647a;
        lyeVar.getClass();
        lyeVar.k = en7Var;
        p7m0 p7m0Var = r7fVar.X1;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, pwq0.a((pwq0) value, false, null, null, false, false, false, false, 0, r7fVar.K(), false, 6143)));
        return Unit.f46060a;
    }

    private final Object m(Object obj) {
        lbf lbfVar = (lbf) this.k;
        ol60 ol60Var = lbfVar.r;
        fbf fbfVar = (fbf) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        r9u0 r9u0Var = fbfVar.f9254a;
        String str = fbfVar.b;
        String str2 = fbfVar.c;
        r9u0 r9u0Var2 = r9u0.f30105a;
        yaf yafVar = yaf.f42293a;
        if (r9u0Var == r9u0Var2 && Intrinsics.d(lbfVar.i.f26653a, str)) {
            lbfVar.y(false);
            ol60Var.f(yafVar);
            ol60Var.f(new raf(R.string.passwords_not_be_same));
        } else if (r9u0Var != r9u0Var2 || Intrinsics.d(str, str2) || str2.length() <= 0) {
            waf wafVar = waf.f38822a;
            if (r9u0Var == r9u0Var2 && Intrinsics.d(str, str2)) {
                lbfVar.y(true);
                ol60Var.f(wafVar);
            } else if (r9u0Var == r9u0.b) {
                lbfVar.y(false);
                ol60Var.f(yafVar);
                ol60Var.f(new raf(R.string.password_requirements_not_satisfied));
            } else {
                lbfVar.y(false);
                ol60Var.f(wafVar);
            }
        } else {
            lbfVar.y(false);
            ol60Var.f(xaf.f40550a);
            ol60Var.f(new saf());
        }
        return Unit.f46060a;
    }

    private final Object o(Object obj) {
        cff cffVar = (cff) this.k;
        uff uffVar = (uff) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (uffVar != null) {
            if (uffVar instanceof tff) {
                tff tffVar = (tff) uffVar;
                lgf lgfVar = tffVar.f33861a;
                String str = tffVar.b;
                qud qudVar = cff.P1;
                cffVar.G0().c.setVisibility(0);
                cffVar.G0().c.setCurrencySymbol(str);
                cffVar.G0().b.a(lgfVar.e.f18288a);
            } else if (uffVar instanceof sff) {
                qud qudVar2 = cff.P1;
                cffVar.G0().c.setFinalSum(((sff) uffVar).f32116a);
            } else if (uffVar instanceof qff) {
                qud qudVar3 = cff.P1;
                cffVar.G0().d.setVisibility(0);
                cffVar.G0().c.b();
            } else if (uffVar instanceof rff) {
                rff rffVar = (rff) uffVar;
                khf khfVar = rffVar.f30385a.e;
                boolean z = rffVar.b;
                qud qudVar4 = cff.P1;
                cffVar.G0().b.b(khfVar.f18288a, z);
                Iterator it = khfVar.f18288a.iterator();
                while (it.hasNext()) {
                    cffVar.G0().c.a(((dhf) it.next()).b);
                }
            } else if (uffVar instanceof pff) {
                qud qudVar5 = cff.P1;
                cffVar.G0().d.setVisibility(0);
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    private final Object r(Object obj) {
        Throwable th = (Throwable) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        ((Cs2GameLogBombTimerView) this.k).getBinding().f36210a.setVisibility(8);
        th.printStackTrace();
        return Unit.f46060a;
    }

    private final Object s(Object obj) {
        boolean z;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        vne vneVar = (vne) this.j;
        fwf fwfVar = (fwf) this.k;
        bby bbyVar = (bby) fwfVar.b.getAndSet(null);
        AtomicReference atomicReference = fwfVar.b;
        c4m0 c4m0VarW = qjj.W(vneVar, null, null, new fr9(bbyVar, fwfVar, null, (byte) 12), 3);
        while (!atomicReference.compareAndSet(null, c4m0VarW)) {
            if (atomicReference.get() != null) {
                z = false;
                return Boolean.valueOf(z);
            }
        }
        z = true;
        return Boolean.valueOf(z);
    }

    private final Object t(Object obj) {
        Object value;
        jlr jlrVar = (jlr) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        if (jlrVar != null) {
            j3g j3gVar = (j3g) this.k;
            int i = j3g.r;
            p7m0 p7m0Var = j3gVar.i.f25029a;
            do {
                value = p7m0Var.getValue();
                value.getClass();
            } while (!p7m0Var.m(value, g3g.a((g3g) value, jlrVar, false, false, 14)));
        }
        return Unit.f46060a;
    }

    private final Object x(Object obj) {
        x9g x9gVar = (x9g) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        t7g t7gVar = (t7g) this.k;
        boolean z = x9gVar instanceof u9g;
        t7gVar.d.setVisibility(z ? 0 : 8);
        t7gVar.c.setVisibility(z ? 8 : 0);
        return Unit.f46060a;
    }

    private final Object y(Object obj) {
        c5g c5gVar = (c5g) this.j;
        wne wneVar = wne.f39444a;
        z1x.P(obj);
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        int i = c5gVar.f3770a;
        int i2 = c5gVar.b;
        calendar.set(i, i2, c5gVar.c);
        CyberCalendarPeriodUiModel cyberCalendarPeriodUiModelQ = fre0.Q(calendar);
        h6g h6gVar = (h6g) this.k;
        c5g c5gVar2 = h6gVar.p;
        yje yjeVar = null;
        if (c5gVar2 == null || c5gVar2.f3770a != c5gVar.f3770a || c5gVar2.b != i2) {
            p7m0 p7m0Var = h6gVar.o;
            p7m0Var.getClass();
            p7m0Var.o(null, nch.f23293a);
        }
        h6gVar.p = c5gVar;
        bby bbyVar = h6gVar.r;
        if (bbyVar != null) {
            bbyVar.cancel(null);
        }
        h6gVar.r = sac.V(jiu0.a(h6gVar), new d6g(h6gVar, (byte) 2), null, h6gVar.j.f22085a, new xb2((Object) h6gVar, (Object) c5gVar, (Object) cyberCalendarPeriodUiModelQ, yjeVar, (byte) 12), 10);
        h6gVar.b.e("selected_time_key", new Long(cyberCalendarPeriodUiModelQ.f46479a));
        p7m0 p7m0Var2 = h6gVar.n;
        p7m0Var2.getClass();
        p7m0Var2.o(null, cyberCalendarPeriodUiModelQ);
        return Unit.f46060a;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                return new fob((gob) this.j, (ql5) obj2, yjeVar, (byte) 0);
            case 1:
                fob fobVar = new fob((job) obj2, yjeVar, (byte) 1);
                fobVar.j = obj;
                return fobVar;
            case 2:
                fob fobVar2 = new fob((xpb) obj2, yjeVar, (byte) 2);
                fobVar2.j = obj;
                return fobVar2;
            case 3:
                fob fobVar3 = new fob((eqb) obj2, yjeVar, (byte) 3);
                fobVar3.j = obj;
                return fobVar3;
            case 4:
                fob fobVar4 = new fob((hrb) obj2, yjeVar, (byte) 4);
                fobVar4.j = obj;
                return fobVar4;
            case 5:
                return new fob((hrb) this.j, (Throwable) obj2, yjeVar, (byte) 5);
            case 6:
                return new fob((hrb) this.j, (String) obj2, yjeVar, (byte) 6);
            case 7:
                fob fobVar5 = new fob((yxb) obj2, yjeVar, (byte) 7);
                fobVar5.j = obj;
                return fobVar5;
            case 8:
                fob fobVar6 = new fob((v7c) obj2, yjeVar, (byte) 8);
                fobVar6.j = obj;
                return fobVar6;
            case 9:
                fob fobVar7 = new fob((ChromeTabLoginActivity) obj2, yjeVar, (byte) 9);
                fobVar7.j = obj;
                return fobVar7;
            case 10:
                return new fob((s1q0) this.j, (wtc) obj2, yjeVar, (byte) 10);
            case 11:
                fob fobVar8 = new fob((svd) obj2, yjeVar, (byte) 11);
                fobVar8.j = obj;
                return fobVar8;
            case 12:
                fob fobVar9 = new fob((kyd) obj2, yjeVar, (byte) 12);
                fobVar9.j = obj;
                return fobVar9;
            case 13:
                fob fobVar10 = new fob((kzd) obj2, yjeVar, (byte) 13);
                fobVar10.j = obj;
                return fobVar10;
            case 14:
                fob fobVar11 = new fob((uzd) obj2, yjeVar, (byte) 14);
                fobVar11.j = obj;
                return fobVar11;
            case 15:
                fob fobVar12 = new fob((i5e) obj2, yjeVar, (byte) 15);
                fobVar12.j = obj;
                return fobVar12;
            case 16:
                return new fob((jzp) this.j, (fae) obj2, yjeVar, (byte) 16);
            case 17:
                fob fobVar13 = new fob((bqe) obj2, yjeVar, (byte) 17);
                fobVar13.j = obj;
                return fobVar13;
            case 18:
                fob fobVar14 = new fob((gze) obj2, yjeVar, (byte) 18);
                fobVar14.j = ((j40) obj).f15860a;
                return fobVar14;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return new fob((r7f) this.j, (c4f) obj2, yjeVar, (byte) 19);
            case 20:
                fob fobVar15 = new fob((r7f) obj2, yjeVar, (byte) 20);
                fobVar15.j = obj;
                return fobVar15;
            case 21:
                fob fobVar16 = new fob((lbf) obj2, yjeVar, (byte) 21);
                fobVar16.j = obj;
                return fobVar16;
            case 22:
                fob fobVar17 = new fob((cff) obj2, yjeVar, (byte) 22);
                fobVar17.j = obj;
                return fobVar17;
            case 23:
                fob fobVar18 = new fob((Cs2GameLogBombTimerView) obj2, yjeVar, (byte) 23);
                fobVar18.j = obj;
                return fobVar18;
            case 24:
                fob fobVar19 = new fob((fwf) obj2, yjeVar, (byte) 24);
                fobVar19.j = obj;
                return fobVar19;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                fob fobVar20 = new fob((j3g) obj2, yjeVar, (byte) 25);
                fobVar20.j = obj;
                return fobVar20;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                fob fobVar21 = new fob((t7g) obj2, yjeVar, (byte) 26);
                fobVar21.j = obj;
                return fobVar21;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                fob fobVar22 = new fob((h6g) obj2, yjeVar, (byte) 27);
                fobVar22.j = obj;
                return fobVar22;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                fob fobVar23 = new fob((h8g) obj2, yjeVar, (byte) 28);
                fobVar23.j = obj;
                return fobVar23;
            default:
                fob fobVar24 = new fob((b9g) obj2, yjeVar, (byte) 29);
                fobVar24.j = obj;
                return fobVar24;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((fob) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((fob) create((List) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((fob) create((zpb) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((fob) create((ypb) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((fob) create((e7a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((fob) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((fob) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((fob) create((kxb) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((fob) create((r6c) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((fob) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((fob) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((fob) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((fob) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((fob) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((fob) create((q0e) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((fob) create((s5e) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((fob) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((fob) create((gqe) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                String str = ((j40) obj).f15860a;
                fob fobVar = new fob((gze) this.k, (yje) obj2, (byte) 18);
                fobVar.j = str;
                return fobVar.invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((fob) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((fob) create((en7) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((fob) create((fbf) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((fob) create((uff) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((fob) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((fob) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((fob) create((jlr) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((fob) create((x9g) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((fob) create((c5g) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((fob) create((ml9) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((fob) create((y8g) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:355:0x0b1f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        Object value;
        Object value2;
        Object value3;
        Object value4;
        i7c i7cVar;
        SpannableStringBuilder spannableStringBuilder;
        Object value5;
        int i;
        String str;
        Object[] objArr;
        List list;
        CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel;
        List list2;
        CyberCalendarPeriodUiModel cyberCalendarPeriodUiModel2;
        nl9 nl9Var;
        ArrayList arrayList;
        byte b = this.i;
        Object obj2 = this.k;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                gob gobVar = (gob) this.j;
                v88.b(gobVar.k, gobVar.q, ((ql5) obj2).f28916a, 2);
                return Unit.f46060a;
            case 1:
                List list3 = (List) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                yk5 yk5Var = job.o2;
                ((oue) ((job) obj2).n2.getValue()).f = list3;
                return Unit.f46060a;
            case 2:
                xpb xpbVar = (xpb) obj2;
                zpb zpbVar = (zpb) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                switch (zpbVar.ordinal()) {
                    case 0:
                        gl5 gl5Var = xpb.S1;
                        xpbVar.G0().e.f(false);
                        xpbVar.G0().e.setErrorText(null);
                        break;
                    case 1:
                        gl5 gl5Var2 = xpb.S1;
                        xpbVar.I0(false);
                        break;
                    case 2:
                        gl5 gl5Var3 = xpb.S1;
                        xpbVar.I0(true);
                        break;
                    case 3:
                        gl5 gl5Var4 = xpb.S1;
                        xpbVar.G0().e.f(true);
                        xpbVar.G0().e.setErrorText(xpbVar.o0().getString(R.string.login_input_error));
                        break;
                    case 4:
                        gl5 gl5Var5 = xpb.S1;
                        xpbVar.G0().e.f(true);
                        xpbVar.G0().e.setErrorText(xpbVar.o0().getString(R.string.login_input_size_more_then_need_error));
                        break;
                    case 5:
                        gl5 gl5Var6 = xpb.S1;
                        xpbVar.G0().e.f(true);
                        xpbVar.G0().e.setErrorText(xpbVar.o0().getString(R.string.login_input_size_less_then_need_error));
                        break;
                    case 6:
                        gl5 gl5Var7 = xpb.S1;
                        xpbVar.G0().e.f(true);
                        xpbVar.G0().e.setErrorText(xpbVar.o0().getString(R.string.login_input_special_symbols_error));
                        break;
                    case 7:
                        gl5 gl5Var8 = xpb.S1;
                        xpbVar.G0().e.f(true);
                        xpbVar.G0().e.setErrorText(xpbVar.o0().getString(R.string.login_input_starts_with_num_error));
                        break;
                    default:
                        t9f.b();
                        return null;
                }
                return Unit.f46060a;
            case 3:
                ypb ypbVar = (ypb) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                boolean z = ypbVar.f43024a;
                String str2 = ypbVar.c;
                eqb eqbVar = (eqb) obj2;
                p7m0 p7m0Var = eqbVar.p;
                if (z) {
                    eqbVar.z(p7m0Var, eqbVar.z ? zpb.c : zpb.b);
                } else {
                    eqbVar.z(p7m0Var, zpb.d);
                    zg zgVar = eqbVar.n;
                    zgVar.getClass();
                    i8i.D("error_code", str2, zgVar.f44322a, "acc_change_log_error");
                    au0 au0Var = eqbVar.o;
                    au0Var.getClass();
                    b1j.v(str2, au0Var.f1455a, 11362L);
                }
                return Unit.f46060a;
            case 4:
                hrb hrbVar = (hrb) obj2;
                e7a e7aVar = (e7a) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                if (e7aVar instanceof d7a) {
                    p7m0 p7m0Var2 = hrbVar.x;
                    do {
                        value = p7m0Var2.getValue();
                    } while (!p7m0Var2.m(value, frb.a((frb) value, null, true, false, null, null, 29)));
                    hrbVar.z.f(new arb((d7a) e7aVar));
                }
                return Unit.f46060a;
            case 5:
                Throwable th = (Throwable) obj2;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                hrb hrbVar2 = (hrb) this.j;
                p7m0 p7m0Var3 = hrbVar2.x;
                duj dujVar = hrbVar2.l;
                ol60 ol60Var = hrbVar2.z;
                do {
                    value2 = p7m0Var3.getValue();
                } while (!p7m0Var3.m(value2, frb.a((frb) value2, null, false, false, null, null, 29)));
                byte b2 = 20;
                if (th == null) {
                    dujVar.b(th, new bna(hrbVar2, b2));
                } else if ((th instanceof SocketTimeoutException) || (th instanceof UnknownHostException)) {
                    ol60Var.f(crb.f4837a);
                } else if (th instanceof p4c) {
                    ol60Var.f(new brb(hrbVar2.r.f(R.string.error_phone, new Object[0])));
                } else if (th instanceof orv0) {
                    ol60Var.f(drb.f6551a);
                } else if (th instanceof zhi0) {
                    int errorCode = ((zhi0) th).c.getErrorCode();
                    hrbVar2.h.d(ym4.CHANGE_PHONE_NUMBER, errorCode);
                    hrbVar2.i.c(errorCode, "change");
                    dujVar.b(th, new bna(hrbVar2, b2));
                } else {
                    dujVar.b(th, new bna(hrbVar2, b2));
                }
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                ((hrb) this.j).z.f(new brb((String) obj2));
                return Unit.f46060a;
            case 7:
                kxb kxbVar = (kxb) this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                ((yxb) obj2).r.f17297a = kxbVar.b.size();
                return Unit.f46060a;
            case 8:
                v7c v7cVar = (v7c) obj2;
                p7m0 p7m0Var4 = v7cVar.Q;
                r6c r6cVar = (r6c) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                boolean zD = Intrinsics.d(r6cVar, p6c.f26447a);
                s6c s6cVar = s6c.f31696a;
                if (zD) {
                    do {
                        value5 = p7m0Var4.getValue();
                    } while (!p7m0Var4.m(value5, i7c.a((i7c) value5, null, v7cVar.B(), null, s6cVar, false, false, false, 15679)));
                } else if (r6cVar instanceof q6c) {
                    do {
                        value4 = p7m0Var4.getValue();
                        i7cVar = (i7c) value4;
                        long j = ((q6c) r6cVar).f28192a;
                        ctf0 ctf0Var = v7cVar.f;
                        ctf0Var.getClass();
                        String str3 = String.format(Locale.ENGLISH, "%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j / 60), Long.valueOf(j % 60)}, 2));
                        String strF = ctf0Var.f(R.string.restore_password_confirm_timer_v2, str3);
                        spannableStringBuilder = new SpannableStringBuilder(strF);
                        int iV = StringsKt.V(strF, str3, 0, false, 6);
                        if (iV != -1) {
                            spannableStringBuilder.setSpan(new StyleSpan(1), iV, str3.length() + iV, 33);
                        }
                    } while (!p7m0Var4.m(value4, i7c.a(i7cVar, null, v7cVar.B(), null, new t6c(spannableStringBuilder), false, false, false, 15679)));
                } else {
                    if (!(r6cVar instanceof o6c)) {
                        t9f.b();
                        return null;
                    }
                    do {
                        value3 = p7m0Var4.getValue();
                    } while (!p7m0Var4.m(value3, i7c.a((i7c) value3, null, v7cVar.B(), null, s6cVar, false, false, false, 15679)));
                }
                return Unit.f46060a;
            case 9:
                ChromeTabLoginActivity chromeTabLoginActivity = (ChromeTabLoginActivity) obj2;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                if (d5c.R((vne) this.j) && chromeTabLoginActivity.f44297a.i.compareTo(lkz.e) >= 0) {
                    chromeTabLoginActivity.setResult(0);
                    chromeTabLoginActivity.finish();
                }
                return Unit.f46060a;
            case 10:
                wtc wtcVar = (wtc) obj2;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                s1q0 s1q0Var = (s1q0) this.j;
                if (!(s1q0Var instanceof psq0)) {
                    return Unit.f46060a;
                }
                psq0 psq0Var = (psq0) s1q0Var;
                ctf0 ctf0Var2 = wtcVar.b;
                if (psq0Var instanceof xrq0) {
                    i = R.string.test_apps_flyer_key;
                } else if (psq0Var instanceof jsq0) {
                    i = R.string.test_referral_link;
                } else {
                    if (!(psq0Var instanceof zrq0)) {
                        return Unit.f46060a;
                    }
                    i = R.string.test_certificate_serial_number;
                }
                wtcVar.e.f(new utc(psq0Var.getTitle(), wtcVar.b.f(R.string.test_copied, ctf0Var2.f(i, new Object[0]))));
                return Unit.f46060a;
            case 11:
                String str4 = (String) this.j;
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                if (str4.length() > 0) {
                    ((svd) obj2).z.f(new uud(str4));
                }
                return Unit.f46060a;
            case 12:
                String str5 = (String) this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                if (str5.length() > 0) {
                    ((kyd) obj2).D.f(new jxd(str5));
                }
                return Unit.f46060a;
            case 13:
                Throwable th2 = (Throwable) this.j;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                ((kzd) obj2).x(th2);
                return Unit.f46060a;
            case 14:
                Integer numValueOf = Integer.valueOf(R.style.DSButton_Large_Secondary);
                Integer numValueOf2 = Integer.valueOf(R.style.DSButton_Large_Primary);
                uzd uzdVar = (uzd) obj2;
                q0e q0eVar = (q0e) this.j;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                if (q0eVar instanceof l0e) {
                    String str6 = ((l0e) q0eVar).f19196a;
                    qud qudVar = uzd.S1;
                    xdk0 xdk0Var = new xdk0(rek0.b, str6, null, null, null, null, 124);
                    wdk0 wdk0Var = uzdVar.N1;
                    if (wdk0Var == null) {
                        Intrinsics.h("snackbarManager");
                        throw null;
                    }
                    wdk0.k(wdk0Var, xdk0Var, uzdVar, null, null, false, null, 1020);
                } else if (q0eVar instanceof n0e) {
                    qud qudVar2 = uzd.S1;
                    ii iiVarG0 = uzdVar.G0();
                    String strH = uzdVar.H(R.string.caution);
                    String strH2 = uzdVar.H(R.string.operation_rejected);
                    String strH3 = uzdVar.H(R.string.ok_new);
                    strH3.getClass();
                    DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, (String) null, (String) null, "REJECT_OPERATION_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC = uzdVar.C();
                    eVarC.getClass();
                    iiVarG0.d(dialogFields, eVarC);
                } else if (q0eVar instanceof k0e) {
                    String str7 = ((k0e) q0eVar).f17461a;
                    qud qudVar3 = uzd.S1;
                    ii iiVarG1 = uzdVar.G0();
                    String strH4 = uzdVar.H(R.string.error);
                    String strH5 = uzdVar.H(R.string.ok_new);
                    strH5.getClass();
                    DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) str7, (CharSequence) strH5, uzdVar.H(R.string.get_code_use_another_method), (String) null, "LIMIT_OPERATION_ERROR_KEY", (String) null, new ActionDialogButtonStyle(numValueOf2, numValueOf, null), n12.b, false, 1360);
                    androidx.fragment.app.e eVarC2 = uzdVar.C();
                    eVarC2.getClass();
                    iiVarG1.d(dialogFields2, eVarC2);
                } else if (q0eVar instanceof c0e) {
                    qud qudVar4 = uzd.S1;
                    uzdVar.L0(new ConfirmationNewPlaceResultType.Success(uzdVar.I0().getC()));
                    uzdVar.J0().B();
                } else if (q0eVar instanceof g0e) {
                    d7a d7aVar = ((g0e) q0eVar).f10454a;
                    qud qudVar5 = uzd.S1;
                    if (uzdVar.L1 == null) {
                        Intrinsics.h("captchaDialogDelegate");
                        throw null;
                    }
                    String strH6 = uzdVar.H(R.string.confirm_new_place);
                    strH6.getClass();
                    gl5.q(uzdVar, "REQUEST_CAPTCHA_CODE_DIALOG_KEY", d7aVar, strH6);
                } else if (q0eVar instanceof i0e) {
                    i0e i0eVar = (i0e) q0eVar;
                    String strH7 = i0eVar.f13945a;
                    String strH8 = i0eVar.b;
                    qud qudVar6 = uzd.S1;
                    ii iiVarG2 = uzdVar.G0();
                    if (strH7.length() == 0) {
                        strH7 = uzdVar.H(R.string.caution);
                        strH7.getClass();
                    }
                    String str8 = strH7;
                    if (strH8.length() == 0) {
                        strH8 = uzdVar.H(R.string.error_something_went_wrong);
                        strH8.getClass();
                    }
                    String strH9 = uzdVar.H(R.string.ok_new);
                    strH9.getClass();
                    DialogFields dialogFields3 = new DialogFields((CharSequence) str8, (CharSequence) strH8, (CharSequence) strH9, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC3 = uzdVar.C();
                    eVarC3.getClass();
                    iiVarG2.d(dialogFields3, eVarC3);
                } else if (q0eVar instanceof b0e) {
                    qud qudVar7 = uzd.S1;
                    uzdVar.L0(ConfirmationNewPlaceResultType.Error.f46936a);
                    uzdVar.J0().B();
                } else if (q0eVar instanceof o0e) {
                    qud qudVar8 = uzd.S1;
                    ii iiVarG3 = uzdVar.G0();
                    String strH10 = uzdVar.H(R.string.error);
                    String strH11 = uzdVar.H(R.string.request_error);
                    String strH12 = uzdVar.H(R.string.ok_new);
                    strH12.getClass();
                    DialogFields dialogFields4 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, (String) null, (String) null, "REQUEST_REQUEST_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1496);
                    androidx.fragment.app.e eVarC4 = uzdVar.C();
                    eVarC4.getClass();
                    iiVarG3.d(dialogFields4, eVarC4);
                } else if (q0eVar instanceof d0e) {
                    qud qudVar9 = uzd.S1;
                    uzdVar.H0().f.setText(((d0e) q0eVar).f5263a);
                } else if (q0eVar instanceof h0e) {
                    String str9 = ((h0e) q0eVar).f12230a;
                    qud qudVar10 = uzd.S1;
                    DsTextField dsTextField = uzdVar.H0().f;
                    dsTextField.f(!(str9 == null || str9.length() == 0));
                    dsTextField.setErrorText(str9);
                } else if (q0eVar instanceof p0e) {
                    String str10 = ((p0e) q0eVar).f26146a;
                    qud qudVar11 = uzd.S1;
                    ii iiVarG4 = uzdVar.G0();
                    String strH13 = uzdVar.H(R.string.error);
                    String strH14 = uzdVar.H(R.string.ok_new);
                    strH14.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH13, (CharSequence) str10, (CharSequence) strH14, (String) null, (String) null, "TOKEN_EXPIRED_ERROR_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1496);
                    androidx.fragment.app.e eVarC5 = uzdVar.C();
                    eVarC5.getClass();
                    iiVarG4.d(dialogFields5, eVarC5);
                } else if (Intrinsics.d(q0eVar, e0e.f6985a)) {
                    qud qudVar12 = uzd.S1;
                    uzdVar.K0();
                } else if (Intrinsics.d(q0eVar, j0e.f15679a)) {
                    qud qudVar13 = uzd.S1;
                    ii iiVarG5 = uzdVar.G0();
                    String strH15 = uzdVar.H(R.string.caution);
                    String strH16 = uzdVar.H(R.string.close_the_activation_process_new);
                    String strH17 = uzdVar.H(R.string.interrupt);
                    strH17.getClass();
                    DialogFields dialogFields6 = new DialogFields((CharSequence) strH15, (CharSequence) strH16, (CharSequence) strH17, uzdVar.H(R.string.cancel), (String) null, "INTERRUPT_DIALOG_REQUEST_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC6 = uzdVar.C();
                    eVarC6.getClass();
                    iiVarG5.d(dialogFields6, eVarC6);
                } else if (q0eVar instanceof m0e) {
                    String str11 = ((m0e) q0eVar).f20950a;
                    qud qudVar14 = uzd.S1;
                    ii iiVarG6 = uzdVar.G0();
                    String strH18 = uzdVar.H(R.string.error);
                    String strH19 = uzdVar.H(R.string.ok_new);
                    strH19.getClass();
                    DialogFields dialogFields7 = new DialogFields((CharSequence) strH18, (CharSequence) str11, (CharSequence) strH19, uzdVar.H(R.string.get_code_use_another_method), (String) null, "NO_AUTHENTICATOR_KEY", (String) null, new ActionDialogButtonStyle(numValueOf2, numValueOf, null), n12.b, false, 1360);
                    androidx.fragment.app.e eVarC7 = uzdVar.C();
                    eVarC7.getClass();
                    iiVarG6.d(dialogFields7, eVarC7);
                } else {
                    if (!(q0eVar instanceof f0e)) {
                        t9f.b();
                        return null;
                    }
                    String str12 = ((f0e) q0eVar).f8712a;
                    qud qudVar15 = uzd.S1;
                    ii iiVarG7 = uzdVar.G0();
                    String strH20 = uzdVar.H(R.string.error);
                    String strH21 = uzdVar.H(R.string.ok_new);
                    strH21.getClass();
                    DialogFields dialogFields8 = new DialogFields((CharSequence) strH20, (CharSequence) str12, (CharSequence) strH21, uzdVar.H(R.string.get_code_use_another_method), (String) null, "AUTHENTICATOR_BLOCKED_KEY", (String) null, new ActionDialogButtonStyle(numValueOf2, numValueOf, null), n12.b, false, 1360);
                    androidx.fragment.app.e eVarC8 = uzdVar.C();
                    eVarC8.getClass();
                    iiVarG7.d(dialogFields8, eVarC8);
                }
                return Unit.f46060a;
            case 15:
                rek0 rek0Var = rek0.b;
                i5e i5eVar = (i5e) obj2;
                a8z a8zVar = i5eVar.k2;
                es esVar = i5eVar.l2;
                s5e s5eVar = (s5e) this.j;
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                if (s5eVar != null) {
                    if (s5eVar instanceof q5e) {
                        kud kudVar = i5e.q2;
                        ii iiVarU0 = i5eVar.U0();
                        String strH22 = i5eVar.H(R.string.caution);
                        String strH23 = i5eVar.H(R.string.camera_permission_message_data);
                        String strH24 = i5eVar.H(R.string.permission_allow);
                        strH24.getClass();
                        iiVarU0.d(new DialogFields((CharSequence) strH22, (CharSequence) strH23, (CharSequence) strH24, i5eVar.H(R.string.cancel), (String) null, "VERIFICATION_PERMISSION", (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1488), i5eVar.F());
                    } else if (s5eVar instanceof k5e) {
                        String str13 = ((k5e) s5eVar).f17716a;
                        kud kudVar2 = i5e.q2;
                        Bundle bundle = i5eVar.g;
                        if (bundle != null) {
                            bundle.putString("FILE_PATH_BUNDLE_NAME", str13);
                        } else {
                            i5eVar.s0(i120.V(new Pair("FILE_PATH_BUNDLE_NAME", str13)));
                        }
                        Uri uriC = FileProvider.c(i5eVar.o0(), new File(str13), "org.xbet.client1.provider");
                        ywq ywqVar = i5eVar.j2;
                        uriC.getClass();
                        ywqVar.a(v3a.c(uriC));
                    } else if (s5eVar instanceof m5e) {
                        List list4 = ((m5e) s5eVar).f21215a;
                        kud kudVar3 = i5e.q2;
                        try {
                            esVar.D(i5eVar, i5e.r2[0], list4);
                            ywq ywqVar2 = i5eVar.o2;
                            zn znVar = zn.f44648a;
                            yn ynVar = yn.f42914a;
                            int i2 = Build.VERSION.SDK_INT;
                            int pickImagesMaxLimit = (i2 < 33 && (i2 < 30 || SdkExtensions.getExtensionVersion(30) < 2)) ? Integer.MAX_VALUE : MediaStore.getPickImagesMaxLimit();
                            lwf lwfVar = lwf.b;
                            kn90 kn90Var = new kn90();
                            kn90Var.f18574a = ynVar;
                            if (i2 >= 33 || (i2 >= 30 && SdkExtensions.getExtensionVersion(30) >= 2)) {
                                MediaStore.getPickImagesMaxLimit();
                            }
                            kn90Var.f18574a = znVar;
                            kn90Var.b = pickImagesMaxLimit;
                            kn90Var.c = lwfVar;
                            ywqVar2.a(kn90Var);
                        } catch (ActivityNotFoundException unused) {
                            wdk0 wdk0Var2 = i5eVar.g2;
                            if (wdk0Var2 == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            String strH25 = i5eVar.H(R.string.intent_app_not_installed);
                            strH25.getClass();
                            wdk0.k(wdk0Var2, new xdk0(rek0Var, strH25, null, null, null, null, 124), i5eVar, null, null, false, null, 1020);
                        }
                        break;
                    } else if (s5eVar instanceof l5e) {
                        List list5 = ((l5e) s5eVar).f19450a;
                        kud kudVar4 = i5e.q2;
                        try {
                            esVar.D(i5eVar, i5e.r2[0], list5);
                            i5eVar.p2.a(list5.toArray(new String[0]));
                        } catch (ActivityNotFoundException unused2) {
                            wdk0 wdk0Var3 = i5eVar.g2;
                            if (wdk0Var3 == null) {
                                Intrinsics.h("snackbarManager");
                                throw null;
                            }
                            String strH26 = i5eVar.H(R.string.intent_app_not_installed);
                            strH26.getClass();
                            wdk0.k(wdk0Var3, new xdk0(rek0Var, strH26, null, null, null, null, 124), i5eVar, null, null, false, null, 1020);
                        }
                        break;
                    } else if (s5eVar instanceof n5e) {
                        List list6 = ((n5e) s5eVar).f22940a;
                        kud kudVar5 = i5e.q2;
                        esVar.D(i5eVar, i5e.r2[0], list6);
                        qog0 qog0Var = i5eVar.n2;
                        if (qog0Var != null) {
                            rg90 rg90Var = (rg90) a8zVar.getValue();
                            rg90Var.getClass();
                            qog0Var.f29072a.remove(rg90Var);
                        }
                        qog0 qog0VarD = m7x.P(i5eVar, "android.permission.CAMERA", new String[0]).d();
                        rg90 rg90Var2 = (rg90) a8zVar.getValue();
                        rg90Var2.getClass();
                        qog0VarD.f29072a.add(rg90Var2);
                        qog0VarD.a();
                        i5eVar.n2 = qog0VarD;
                    } else if (s5eVar instanceof o5e) {
                        vcc.f0(i120.V(new Pair("FILE_DIALOG_RESULT_RESULT_KEY", ((o5e) s5eVar).f24683a)), i5eVar, "FILE_DIALOG_RESULT_REQUEST_KEY");
                        i5eVar.x0();
                    } else if (s5eVar instanceof r5e) {
                        a2c a2cVar = ((r5e) s5eVar).f29880a;
                        kud kudVar6 = i5e.q2;
                        if (Intrinsics.d(a2cVar, w1c.f38392a)) {
                            ii iiVarU1 = i5eVar.U0();
                            String strH27 = i5eVar.H(R.string.error);
                            String strH28 = i5eVar.H(R.string.something_went_wrong);
                            String strH29 = i5eVar.H(R.string.ok_new);
                            strH29.getClass();
                            iiVarU1.d(new DialogFields((CharSequence) strH27, (CharSequence) strH28, (CharSequence) strH29, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528), i5eVar.F());
                        } else if (a2cVar instanceof y1c) {
                            String strN = ahb.N(i5eVar.o0(), ((y1c) a2cVar).f41848a);
                            ii iiVarU2 = i5eVar.U0();
                            String strH30 = i5eVar.H(R.string.error);
                            String strH31 = i5eVar.H(R.string.file_size_exceeds_limit);
                            strH31.getClass();
                            String str14 = String.format(strH31, Arrays.copyOf(new Object[]{strN}, 1));
                            String strH32 = i5eVar.H(R.string.ok_new);
                            strH32.getClass();
                            iiVarU2.d(new DialogFields((CharSequence) strH30, (CharSequence) str14, (CharSequence) strH32, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528), i5eVar.F());
                        } else if (a2cVar instanceof z1c) {
                            ii iiVarU3 = i5eVar.U0();
                            String strH33 = i5eVar.H(R.string.error);
                            String strH34 = i5eVar.H(R.string.unsupported_file_type);
                            String strH35 = i5eVar.H(R.string.ok_new);
                            strH35.getClass();
                            iiVarU3.d(new DialogFields((CharSequence) strH33, (CharSequence) strH34, (CharSequence) strH35, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528), i5eVar.F());
                        } else if (!Intrinsics.d(a2cVar, x1c.f40116a)) {
                            t9f.b();
                            return null;
                        }
                        i5eVar.x0();
                    } else if (s5eVar instanceof p5e) {
                        wdk0 wdk0Var4 = i5eVar.g2;
                        if (wdk0Var4 == null) {
                            Intrinsics.h("snackbarManager");
                            throw null;
                        }
                        String strH36 = i5eVar.H(R.string.bottom_file_access_denied);
                        strH36.getClass();
                        wdk0.k(wdk0Var4, new xdk0(rek0Var, strH36, null, null, null, null, 124), i5eVar, null, null, false, null, 1020);
                    } else if (s5eVar instanceof j5e) {
                        kxq kxqVarN0 = i5eVar.n0();
                        Intent intentJ = hne.j("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intentJ.setData(Uri.fromParts("package", kxqVarN0.getPackageName(), null));
                        kxqVarN0.startActivityForResult(intentJ, 555);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 16:
                fae faeVar = (fae) obj2;
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                jzp jzpVar = (jzp) this.j;
                yos0 yos0Var = jzpVar.e;
                if (yos0Var instanceof wos0) {
                    faeVar.B.f(new h6e(((wos0) yos0Var).b, jzpVar.d));
                } else if ((yos0Var instanceof uos0) || (yos0Var instanceof sos0)) {
                    qos0 qos0Var = jzpVar.f17427a;
                    oos0 oos0Var = qos0Var instanceof oos0 ? (oos0) qos0Var : null;
                    if (oos0Var == null || (str = oos0Var.f25608a) == null) {
                        return Unit.f46060a;
                    }
                    faeVar.x(new pcl(jzpVar.b, str, jzpVar.c));
                }
                return Unit.f46060a;
            case 17:
                bqe bqeVar = (bqe) obj2;
                yzn0 yzn0Var = bqeVar.n2;
                gqe gqeVar = (gqe) this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                if (gqeVar != null) {
                    if (gqeVar instanceof eqe) {
                        qkt qktVar = ((eqe) gqeVar).f8234a;
                        kwd kwdVar = bqe.o2;
                        iiy[] iiyVarArr = bqe.p2;
                        vcc.f0(i120.V(new Pair(((dqe) yzn0Var.n(bqeVar, iiyVarArr[0])).f6510a, qktVar)), bqeVar, ((dqe) yzn0Var.n(bqeVar, iiyVarArr[0])).f6510a);
                        bqeVar.y0();
                    } else if (gqeVar instanceof fqe) {
                        kwd kwdVar2 = bqe.o2;
                        wdk0 wdk0Var5 = ((hdi) bqeVar.k2.getValue()).d;
                        rek0 rek0Var2 = rek0.b;
                        String strH37 = bqeVar.H(R.string.error);
                        strH37.getClass();
                        wdk0.k(wdk0Var5, new xdk0(rek0Var2, strH37, null, null, null, null, 124), bqeVar, null, null, false, null, 1020);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 18:
                String str15 = (String) this.j;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                gze gzeVar = (gze) obj2;
                ArrayList arrayList2 = new ArrayList();
                bnk0 bnk0Var = new bnk0();
                pzw.E(bnk0Var, ohs0.n(gzeVar.H(R.string.available_prepayment), Separators.SP), 0, 0, 0, 0, 62);
                pzw.E(bnk0Var, str15, 0, 0, 1, 0, 46);
                arrayList2.addAll(bnk0Var.f2888a);
                usd usdVar = gze.S1;
                TextView textView = gzeVar.G0().l;
                Context contextO0 = gzeVar.o0();
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                ArrayList arrayList3 = new ArrayList(r3d.q(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(spannableStringBuilder2.append((CharSequence) ((zmk0) it.next()).a(contextO0)));
                }
                SpannableString spannableStringValueOf = SpannableString.valueOf(spannableStringBuilder2);
                spannableStringValueOf.getClass();
                textView.setText(spannableStringValueOf);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                ((r7f) this.j).d2.f((c4f) obj2);
                return Unit.f46060a;
            case 20:
                return l(obj);
            case 21:
                return m(obj);
            case 22:
                return o(obj);
            case 23:
                return r(obj);
            case 24:
                return s(obj);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return t(obj);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return x(obj);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return y(obj);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return G(obj);
            default:
                b9g b9gVar = (b9g) obj2;
                y8g y8gVar = (y8g) this.j;
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                if (y8gVar != null) {
                    boolean z2 = y8gVar instanceof w8g;
                    if (z2) {
                        qud qudVar16 = b9g.R1;
                        if (b9gVar.H0() != yag.b) {
                            objArr = true;
                        } else {
                            y8g y8gVar2 = b9gVar.Q1;
                            w8g w8gVar = y8gVar2 instanceof w8g ? (w8g) y8gVar2 : null;
                            w8g w8gVar2 = z2 ? (w8g) y8gVar : null;
                            long j2 = 0;
                            long j3 = ((w8gVar == null || (list2 = w8gVar.f38720a) == null || (cyberCalendarPeriodUiModel2 = (CyberCalendarPeriodUiModel) CollectionsKt.firstOrNull(list2)) == null) ? 0L : cyberCalendarPeriodUiModel2.f46479a) / 10000;
                            if (w8gVar2 != null && (list = w8gVar2.f38720a) != null && (cyberCalendarPeriodUiModel = (CyberCalendarPeriodUiModel) CollectionsKt.firstOrNull(list)) != null) {
                                j2 = cyberCalendarPeriodUiModel.f46479a;
                            }
                            if (j2 / 10000 != j3) {
                                objArr = true;
                            } else {
                                objArr = false;
                            }
                        }
                        nl9 nl9Var2 = b9gVar.P1;
                        ArrayList arrayList4 = nl9Var2 != null ? (ArrayList) nl9Var2.n : null;
                        w8g w8gVar3 = (w8g) y8gVar;
                        int i3 = w8gVar3.b;
                        List list7 = w8gVar3.f38720a;
                        if ((!Intrinsics.d(arrayList4, list7) && !list7.isEmpty() && objArr != false) || ((nl9Var = b9gVar.P1) != null && (arrayList = (ArrayList) nl9Var.n) != null && arrayList.isEmpty() && !list7.isEmpty())) {
                            if (b9gVar.G0().c.getAdapter() == null) {
                                b9gVar.G0().c.setAdapter(b9gVar.P1);
                            }
                            nl9 nl9Var3 = b9gVar.P1;
                            if (nl9Var3 != null) {
                                nl9Var3.H(list7);
                            }
                        }
                        if (b9gVar.G0().c.getCurrentItem() != i3) {
                            b9gVar.G0().c.e(i3, false);
                        }
                        b9gVar.G0().b.setVisibility(8);
                    } else if (y8gVar instanceof x8g) {
                        qud qudVar17 = b9g.R1;
                        b9gVar.G0().b.setVisibility(0);
                        b9gVar.G0().c.setVisibility(8);
                        b9gVar.G0().b.a(((x8g) y8gVar).f40460a);
                    }
                    b9gVar.Q1 = y8gVar;
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fob(Object obj, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.k = obj;
    }
}
