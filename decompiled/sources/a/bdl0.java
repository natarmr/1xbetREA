package a;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.NumberPicker;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.picker.api.presentation.AnalyticsEntryPoint;
import org.xplatform.uikit.components.bottom_bar.DsBottomBar;
import org.xplatform.uikit.components.cells.right.DsCellRightSwitch;
import org.xplatform.uikit.components.dialog.DialogFields;
import org.xplatform.uikit.components.dialog.utils.ActionDialogButtonStyle;
import org.xplatform.uikit.components.lottie_empty.DSLottieEmptyContainer;
import org.xplatform.uikit.components.radio_button.DsRadioButton;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class bdl0 extends xo implements Function2 {
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bdl0(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.h = b;
    }

    private final Object a(Object obj, Object obj2) {
        umq0 umq0Var = (umq0) obj;
        nmq0 nmq0Var = (nmq0) this.f41192a;
        iiy[] iiyVarArr = nmq0.Q1;
        nmq0Var.getClass();
        if (umq0Var != null) {
            if (umq0Var instanceof smq0) {
                String str = ((smq0) umq0Var).f32459a;
                ii iiVar = nmq0Var.L1;
                if (iiVar == null) {
                    Intrinsics.h("actionDialogManager");
                    throw null;
                }
                String strH = nmq0Var.H(R.string.error);
                String strH2 = nmq0Var.H(R.string.ok_new);
                strH2.getClass();
                DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) str, (CharSequence) strH2, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                androidx.fragment.app.e eVarC = nmq0Var.C();
                eVarC.getClass();
                iiVar.d(dialogFields, eVarC);
            } else if (umq0Var instanceof tmq0) {
                wdk0 wdk0Var = nmq0Var.M1;
                if (wdk0Var == null) {
                    Intrinsics.h("snackbarManager");
                    throw null;
                }
                rek0 rek0Var = rek0.b;
                String strH3 = nmq0Var.H(R.string.something_went_wrong);
                strH3.getClass();
                wdk0.k(wdk0Var, new xdk0(rek0Var, strH3, null, null, null, null, 124), nmq0Var, null, null, false, null, 1020);
            }
            return Unit.f46060a;
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:142:0x03db  */
    /* JADX WARN: Code duplicated, block: B:144:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:146:0x03ea  */
    /* JADX WARN: Code duplicated, block: B:150:0x03f7  */
    /* JADX WARN: Code duplicated, block: B:156:0x0410  */
    /* JADX WARN: Code duplicated, block: B:158:0x041a  */
    /* JADX WARN: Code duplicated, block: B:160:0x041f  */
    /* JADX WARN: Code duplicated, block: B:164:0x042c  */
    /* JADX WARN: Code duplicated, block: B:170:0x0445  */
    /* JADX WARN: Code duplicated, block: B:172:0x044f  */
    /* JADX WARN: Code duplicated, block: B:174:0x0454  */
    /* JADX WARN: Code duplicated, block: B:178:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:181:0x04d2  */
    /* JADX WARN: Code duplicated, block: B:184:0x04e5  */
    /* JADX WARN: Code duplicated, block: B:188:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:191:0x0501  */
    /* JADX WARN: Code duplicated, block: B:194:0x0514  */
    /* JADX WARN: Code duplicated, block: B:198:0x0526  */
    /* JADX WARN: Code duplicated, block: B:201:0x0530  */
    /* JADX WARN: Code duplicated, block: B:204:0x0543  */
    /* JADX WARN: Code duplicated, block: B:208:0x0555  */
    /* JADX WARN: Code duplicated, block: B:211:0x055f  */
    /* JADX WARN: Code duplicated, block: B:214:0x0572  */
    /* JADX WARN: Code duplicated, block: B:218:0x0584  */
    /* JADX WARN: Code duplicated, block: B:221:0x058e  */
    /* JADX WARN: Code duplicated, block: B:224:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:228:0x05b3  */
    /* JADX WARN: Code duplicated, block: B:231:0x05bd  */
    /* JADX WARN: Code duplicated, block: B:234:0x05d0  */
    /* JADX WARN: Code duplicated, block: B:238:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:241:0x05ec  */
    /* JADX WARN: Code duplicated, block: B:244:0x05ff  */
    /* JADX WARN: Code duplicated, block: B:248:0x0611  */
    /* JADX WARN: Code duplicated, block: B:251:0x061b  */
    /* JADX WARN: Code duplicated, block: B:254:0x062e  */
    /* JADX WARN: Code duplicated, block: B:258:0x0640  */
    /* JADX WARN: Code duplicated, block: B:261:0x064a  */
    /* JADX WARN: Code duplicated, block: B:264:0x065d  */
    /* JADX WARN: Code duplicated, block: B:476:0x040b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:479:0x0440 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:482:0x04e5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:483:0x04e3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:484:? A[LOOP:4: B:179:0x04cc->B:484:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:485:0x0512 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:486:0x0514 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:487:? A[LOOP:5: B:189:0x04fb->B:487:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:488:0x0543 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:489:0x0541 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:490:? A[LOOP:6: B:199:0x052a->B:490:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:491:0x0572 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:492:0x0570 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:493:? A[LOOP:7: B:209:0x0559->B:493:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:494:0x05a1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:495:0x059f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:496:? A[LOOP:8: B:219:0x0588->B:496:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:497:0x05d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:498:0x05ce A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:499:? A[LOOP:9: B:229:0x05b7->B:499:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:500:0x05ff A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:501:0x05fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:502:? A[LOOP:10: B:239:0x05e6->B:502:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:503:0x062e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:504:0x062c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:505:? A[LOOP:11: B:249:0x0615->B:505:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:506:0x065d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:507:0x065b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:508:? A[LOOP:12: B:259:0x0644->B:508:?, LOOP_END, SYNTHETIC] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        Intent intentAddFlags;
        Object next;
        uaq0 uaq0Var;
        Iterator it;
        Object next2;
        uaq0 uaq0Var2;
        Iterator it2;
        Object next3;
        uaq0 uaq0Var3;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        Iterator it3;
        uaq0 uaq0Var4;
        Iterator it4;
        uaq0 uaq0Var5;
        Iterator it5;
        uaq0 uaq0Var6;
        Iterator it6;
        uaq0 uaq0Var7;
        Iterator it7;
        uaq0 uaq0Var8;
        Iterator it8;
        uaq0 uaq0Var9;
        Iterator it9;
        uaq0 uaq0Var10;
        Iterator it10;
        uaq0 uaq0Var11;
        Iterator it11;
        uaq0 uaq0Var12;
        int iJ0;
        int iJ1;
        int iJ2;
        int iJ3;
        int iJ4;
        int iJ5;
        Object value;
        byte b = this.h;
        byte b2 = 10;
        final byte b3 = 1;
        yje yjeVar = null;
        Object obj3 = this.f41192a;
        switch (b) {
            case 0:
                ycl0 ycl0Var = (ycl0) obj;
                ddl0 ddl0Var = (ddl0) obj3;
                cge0 cge0Var = ddl0.V1;
                ddl0Var.getClass();
                tcl0 tcl0Var = tcl0.f33724a;
                if (!Intrinsics.d(ycl0Var, tcl0Var)) {
                    if (Intrinsics.d(ycl0Var, wcl0.f38930a)) {
                        ii iiVar = ddl0Var.L1;
                        if (iiVar == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH = ddl0Var.H(R.string.caution);
                        String strH2 = ddl0Var.H(R.string.reset_to_default_values);
                        String strH3 = ddl0Var.H(R.string.ok_new);
                        strH3.getClass();
                        DialogFields dialogFields = new DialogFields((CharSequence) strH, (CharSequence) strH2, (CharSequence) strH3, ddl0Var.H(R.string.cancel), (String) null, "REQUEST_RESET_TO_DEFAULT_VALUES_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC = ddl0Var.C();
                        eVarC.getClass();
                        iiVar.d(dialogFields, eVarC);
                    } else if (Intrinsics.d(ycl0Var, vcl0.f37192a)) {
                        ii iiVar2 = ddl0Var.L1;
                        if (iiVar2 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH4 = ddl0Var.H(R.string.caution);
                        String strH5 = ddl0Var.H(R.string.clear_selected_sports);
                        String strH6 = ddl0Var.H(R.string.ok_new);
                        strH6.getClass();
                        DialogFields dialogFields2 = new DialogFields((CharSequence) strH4, (CharSequence) strH5, (CharSequence) strH6, ddl0Var.H(R.string.cancel), (String) null, "REQUEST_CLEAR_SPORT_GAMES_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC2 = ddl0Var.C();
                        eVarC2.getClass();
                        iiVar2.d(dialogFields2, eVarC2);
                    } else if (Intrinsics.d(ycl0Var, xcl0.f40651a)) {
                        ii iiVar3 = ddl0Var.L1;
                        if (iiVar3 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH7 = ddl0Var.H(R.string.caution);
                        String strH8 = ddl0Var.H(R.string.select_one_sport);
                        String strH9 = ddl0Var.H(R.string.ok_new);
                        strH9.getClass();
                        DialogFields dialogFields3 = new DialogFields((CharSequence) strH7, (CharSequence) strH8, (CharSequence) strH9, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1528);
                        androidx.fragment.app.e eVarC3 = ddl0Var.C();
                        eVarC3.getClass();
                        iiVar3.d(dialogFields3, eVarC3);
                    } else {
                        if (!Intrinsics.d(ycl0Var, ucl0.f35436a)) {
                            t9f.b();
                            return null;
                        }
                        ii iiVar4 = ddl0Var.L1;
                        if (iiVar4 == null) {
                            Intrinsics.h("actionDialogManager");
                            throw null;
                        }
                        String strH10 = ddl0Var.H(R.string.caution);
                        String strH11 = ddl0Var.H(R.string.apply_changes);
                        String strH12 = ddl0Var.H(R.string.yes);
                        strH12.getClass();
                        DialogFields dialogFields4 = new DialogFields((CharSequence) strH10, (CharSequence) strH11, (CharSequence) strH12, ddl0Var.H(R.string.no), (String) null, "REQUEST_APPLY_CHANGES_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                        androidx.fragment.app.e eVarC4 = ddl0Var.C();
                        eVarC4.getClass();
                        iiVar4.d(dialogFields4, eVarC4);
                    }
                    ddl0Var.J0().A(tcl0Var);
                }
                return Unit.f46060a;
            case 1:
                kdl0 kdl0Var = (kdl0) obj;
                ddl0 ddl0Var2 = (ddl0) obj3;
                cge0 cge0Var2 = ddl0.V1;
                ddl0Var2.getClass();
                if (kdl0Var != null) {
                    if (kdl0Var instanceof idl0) {
                        a5r a5rVarG0 = ddl0Var2.G0();
                        a5rVarG0.b.setVisibility(8);
                        a5rVarG0.d.setVisibility(8);
                        s96 s96Var = ddl0Var2.G0().e.b;
                        ukm ukmVarB = s96Var != null ? s96Var.b("SEARCH_NAV_ITEM_KEY") : null;
                        if (ukmVarB != null) {
                            ukmVarB.setNavigationBarButtonEnable(false);
                        }
                        a5rVarG0.c.setVisibility(8);
                    } else if (kdl0Var instanceof gdl0) {
                        gdl0 gdl0Var = (gdl0) kdl0Var;
                        rcl0 rcl0Var = (rcl0) ddl0Var2.S1.getValue();
                        List list = gdl0Var.e;
                        boolean z = gdl0Var.c;
                        rcl0Var.A(list);
                        a5r a5rVarG1 = ddl0Var2.G0();
                        ukm ukmVarH0 = ddl0Var2.H0();
                        if (ukmVarH0 != null) {
                            ukmVarH0.setNavigationBarButtonEnable(z);
                        }
                        ukm ukmVarH1 = ddl0Var2.H0();
                        if (ukmVarH1 != null) {
                            ukmVarH1.setNavigationBarButtonAlpha(!z);
                        }
                        DsNavigationBarBasic dsNavigationBarBasic = a5rVarG1.e;
                        DsBottomBar dsBottomBar = a5rVarG1.b;
                        dsNavigationBarBasic.addOnLayoutChangeListener(new w23(ddl0Var2, (byte) 14));
                        dsBottomBar.setFirstButtonEnabled(gdl0Var.f11109a);
                        dsBottomBar.setSecondButtonEnabled(gdl0Var.b);
                        dsBottomBar.setVisibility(0);
                        a5rVarG1.c.setVisibility(8);
                        a5rVarG1.d.setVisibility(0);
                    } else if (kdl0Var instanceof hdl0) {
                        hdl0 hdl0Var = (hdl0) kdl0Var;
                        boolean z2 = hdl0Var.f12875a;
                        a5r a5rVarG2 = ddl0Var2.G0();
                        ukm ukmVarH2 = ddl0Var2.H0();
                        if (ukmVarH2 != null) {
                            ukmVarH2.setNavigationBarButtonEnable(z2);
                        }
                        ukm ukmVarH3 = ddl0Var2.H0();
                        if (ukmVarH3 != null) {
                            ukmVarH3.setNavigationBarButtonAlpha(!z2);
                        }
                        s96 s96Var2 = ddl0Var2.G0().e.b;
                        ukm ukmVarB2 = s96Var2 != null ? s96Var2.b("SEARCH_NAV_ITEM_KEY") : null;
                        if (ukmVarB2 != null) {
                            ukmVarB2.setNavigationBarButtonEnable(false);
                        }
                        DsBottomBar dsBottomBar2 = a5rVarG2.b;
                        DSLottieEmptyContainer dSLottieEmptyContainer = a5rVarG2.c;
                        dsBottomBar2.setVisibility(0);
                        jkm jkmVar = hdl0Var.b;
                        long j = hdl0Var.c;
                        int i10 = DSLottieEmptyContainer.d;
                        dSLottieEmptyContainer.b(jkmVar, j, new bmh((byte) 12));
                        dSLottieEmptyContainer.setVisibility(0);
                        a5rVarG2.d.setVisibility(8);
                    } else if (kdl0Var instanceof jdl0) {
                        jdl0 jdl0Var = (jdl0) kdl0Var;
                        boolean z3 = jdl0Var.f16334a;
                        a5r a5rVarG3 = ddl0Var2.G0();
                        ukm ukmVarH4 = ddl0Var2.H0();
                        if (ukmVarH4 != null) {
                            ukmVarH4.setNavigationBarButtonEnable(z3);
                        }
                        ukm ukmVarH5 = ddl0Var2.H0();
                        if (ukmVarH5 != null) {
                            ukmVarH5.setNavigationBarButtonAlpha(!z3);
                        }
                        s96 s96Var3 = ddl0Var2.G0().e.b;
                        ukm ukmVarB3 = s96Var3 != null ? s96Var3.b("SEARCH_NAV_ITEM_KEY") : null;
                        if (ukmVarB3 != null) {
                            ukmVarB3.setNavigationBarButtonEnable(false);
                        }
                        DsBottomBar dsBottomBar3 = a5rVarG3.b;
                        DSLottieEmptyContainer dSLottieEmptyContainer2 = a5rVarG3.c;
                        dsBottomBar3.setVisibility(0);
                        dSLottieEmptyContainer2.a(jdl0Var.b);
                        dSLottieEmptyContainer2.setVisibility(0);
                        a5rVarG3.d.setVisibility(8);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 2:
                ((wsl0) obj3).A((List) obj);
                return Unit.f46060a;
            case 3:
                ((ktl0) obj3).A((List) obj);
                return Unit.f46060a;
            case 4:
                Throwable th = (Throwable) obj;
                ybm0 ybm0Var = (ybm0) obj3;
                ybm0Var.s.b(th, new o3m0(th, ybm0Var, (byte) 6));
                return Unit.f46060a;
            case 5:
                ((kfo0) obj3).A((List) obj);
                return Unit.f46060a;
            case 6:
                prp0 prp0Var = (prp0) obj;
                zqp0 zqp0Var = (zqp0) obj3;
                y2m0 y2m0Var = zqp0.V1;
                zqp0Var.getClass();
                if (prp0Var != null) {
                    if (prp0Var instanceof orp0) {
                        t5r t5rVarG0 = zqp0Var.G0();
                        vr9 vr9Var = t5rVarG0.f;
                        vr9Var.b.setVisibility(0);
                        x0x.s(vr9Var.b);
                        zqp0Var.G0().b.setVisibility(8);
                        t5rVarG0.e.setVisibility(8);
                        t5rVarG0.c.setVisibility(8);
                    } else if (prp0Var instanceof mrp0) {
                        x0x.O(zqp0Var.G0().f.b);
                        zqp0Var.G0().f.b.setVisibility(8);
                        zqp0Var.G0().b.setVisibility(0);
                        zqp0Var.G0().c.setVisibility(8);
                        zqp0Var.G0().e.setVisibility(0);
                        ((vqp0) zqp0Var.S1.getValue()).A(((mrp0) prp0Var).f22285a);
                    } else if (prp0Var instanceof nrp0) {
                        jkm jkmVar2 = ((nrp0) prp0Var).f24015a;
                        x0x.O(zqp0Var.G0().f.b);
                        zqp0Var.G0().b.setVisibility(8);
                        zqp0Var.G0().f.b.setVisibility(8);
                        DSLottieEmptyContainer dSLottieEmptyContainer3 = zqp0Var.G0().c;
                        int i11 = DSLottieEmptyContainer.d;
                        dSLottieEmptyContainer3.b(jkmVar2, 10000L, new bmh((byte) 12));
                        zqp0Var.G0().c.setVisibility(0);
                        zqp0Var.G0().e.setVisibility(8);
                    }
                    return Unit.f46060a;
                }
                t9f.b();
                return null;
            case 7:
                frp0 frp0Var = (frp0) obj;
                y2m0 y2m0Var2 = zqp0.V1;
                t5r t5rVarG1 = ((zqp0) obj3).G0();
                DsNavigationBarBasic dsNavigationBarBasic2 = t5rVarG1.d;
                DsBottomBar dsBottomBar4 = t5rVarG1.b;
                dsNavigationBarBasic2.setSubTitle(frp0Var.c);
                s96 s96Var4 = dsNavigationBarBasic2.b;
                ukm ukmVarB4 = s96Var4 != null ? s96Var4.b("CLEAR_BUTTON") : null;
                if (ukmVarB4 != null) {
                    if (frp0Var.d) {
                        ukmVarB4.setNavigationBarButtonAlpha(false);
                        ukmVarB4.setNavigationBarButtonClickable(true);
                        ukmVarB4.setNavigationBarButtonEnable(true);
                    } else {
                        ukmVarB4.setNavigationBarButtonAlpha(true);
                        ukmVarB4.setNavigationBarButtonClickable(false);
                        ukmVarB4.setNavigationBarButtonEnable(false);
                    }
                }
                dsBottomBar4.setFirstButtonEnabled(frp0Var.f10030a);
                dsBottomBar4.setSecondButtonEnabled(frp0Var.b);
                return Unit.f46060a;
            case 8:
                lrp0 lrp0Var = (lrp0) obj;
                zqp0 zqp0Var2 = (zqp0) obj3;
                y2m0 y2m0Var3 = zqp0.V1;
                zqp0Var2.getClass();
                if (Intrinsics.d(lrp0Var, irp0.f15271a)) {
                    ii iiVar5 = zqp0Var2.L1;
                    if (iiVar5 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH13 = zqp0Var2.H(R.string.caution);
                    String strH14 = zqp0Var2.H(R.string.reset_to_default_values);
                    String strH15 = zqp0Var2.H(R.string.ok_new);
                    strH15.getClass();
                    DialogFields dialogFields5 = new DialogFields((CharSequence) strH13, (CharSequence) strH14, (CharSequence) strH15, zqp0Var2.H(R.string.cancel), (String) null, "REQUEST_RESET_TO_DEFAULT_VALUES_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC5 = zqp0Var2.C();
                    eVarC5.getClass();
                    iiVar5.d(dialogFields5, eVarC5);
                } else if (Intrinsics.d(lrp0Var, hrp0.f13543a)) {
                    ii iiVar6 = zqp0Var2.L1;
                    if (iiVar6 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH16 = zqp0Var2.H(R.string.caution);
                    String strH17 = zqp0Var2.H(R.string.clear_selected_teams);
                    String strH18 = zqp0Var2.H(R.string.ok_new);
                    strH18.getClass();
                    DialogFields dialogFields6 = new DialogFields((CharSequence) strH16, (CharSequence) strH17, (CharSequence) strH18, zqp0Var2.H(R.string.cancel), (String) null, "REQUEST_CLEAR_TEAMS_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC6 = zqp0Var2.C();
                    eVarC6.getClass();
                    iiVar6.d(dialogFields6, eVarC6);
                } else if (Intrinsics.d(lrp0Var, jrp0.f17015a)) {
                    ii iiVar7 = zqp0Var2.L1;
                    if (iiVar7 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH19 = zqp0Var2.H(R.string.caution);
                    String strH20 = zqp0Var2.H(R.string.need_selected_any_teams);
                    String strH21 = zqp0Var2.H(R.string.ok_new);
                    strH21.getClass();
                    DialogFields dialogFields7 = new DialogFields((CharSequence) strH19, (CharSequence) strH20, (CharSequence) strH21, (String) null, (String) null, (String) null, (String) null, (ActionDialogButtonStyle) null, n12.b, false, 1528);
                    androidx.fragment.app.e eVarC7 = zqp0Var2.C();
                    eVarC7.getClass();
                    iiVar7.d(dialogFields7, eVarC7);
                } else if (Intrinsics.d(lrp0Var, grp0.f11792a)) {
                    ii iiVar8 = zqp0Var2.L1;
                    if (iiVar8 == null) {
                        Intrinsics.h("actionDialogManager");
                        throw null;
                    }
                    String strH22 = zqp0Var2.H(R.string.caution);
                    String strH23 = zqp0Var2.H(R.string.apply_changes);
                    String strH24 = zqp0Var2.H(R.string.yes);
                    strH24.getClass();
                    DialogFields dialogFields8 = new DialogFields((CharSequence) strH22, (CharSequence) strH23, (CharSequence) strH24, zqp0Var2.H(R.string.no), (String) null, "REQUEST_APPLY_CHANGES_DIALOG_KEY", (String) null, (ActionDialogButtonStyle) null, n12.f22727a, false, 1488);
                    androidx.fragment.app.e eVarC8 = zqp0Var2.C();
                    eVarC8.getClass();
                    iiVar8.d(dialogFields8, eVarC8);
                } else {
                    if (!Intrinsics.d(lrp0Var, krp0.f18778a)) {
                        t9f.b();
                        return null;
                    }
                    ((vqp0) zqp0Var2.S1.getValue()).g();
                }
                return Unit.f46060a;
            case 9:
                Throwable th2 = (Throwable) obj;
                x0q0 x0q0Var = (x0q0) obj3;
                x0q0Var.y.b(th2, new a6p0(th2, x0q0Var, b2));
                return Unit.f46060a;
            case 10:
                iiy[] iiyVarArr = p1q0.Q1;
                ((k1q0) ((p1q0) obj3).P1.getValue()).A((List) obj);
                return Unit.f46060a;
            case 11:
                zd9 zd9Var = (zd9) obj;
                p1q0 p1q0Var = (p1q0) obj3;
                iiy[] iiyVarArr2 = p1q0.Q1;
                p1q0Var.getClass();
                vd9 vd9Var = vd9.f37220a;
                if (!Intrinsics.d(zd9Var, vd9Var)) {
                    if (zd9Var instanceof yd9) {
                        String str = ((yd9) zd9Var).f42422a;
                        Context contextO0 = p1q0Var.o0();
                        str.getClass();
                        Toast.makeText(contextO0, str, 1).show();
                    } else if (zd9Var instanceof wd9) {
                        String str2 = ((wd9) zd9Var).f38962a;
                        Context contextO1 = p1q0Var.o0();
                        str2.getClass();
                        Toast.makeText(contextO1, str2, 1).show();
                    } else if (zd9Var instanceof xd9) {
                        rl70 rl70Var = p1q0Var.M1;
                        if (rl70Var == null) {
                            Intrinsics.h("pickerDialogFactory");
                            throw null;
                        }
                        androidx.fragment.app.e eVarC9 = p1q0Var.C();
                        eVarC9.getClass();
                        rl70Var.e(eVarC9, null, AnalyticsEntryPoint.b);
                        p7m0 p7m0Var = p1q0Var.H0().u;
                        p7m0Var.getClass();
                        p7m0Var.o(null, vd9Var);
                    } else if (Intrinsics.d(zd9Var, vd9.b)) {
                        Context contextD = p1q0Var.D();
                        if (contextD != null) {
                            j120.g0(contextD, i120.U());
                        }
                    } else {
                        if (!Intrinsics.d(zd9Var, vd9.c)) {
                            t9f.b();
                            return null;
                        }
                        x1q0 x1q0VarH0 = p1q0Var.H0();
                        kxq kxqVarN0 = p1q0Var.n0();
                        t760 t760VarA = x1q0VarH0.o.a();
                        Intent intentQ = j120.Q(kxqVarN0);
                        if (intentQ != null && (intentAddFlags = intentQ.addFlags(32768)) != null) {
                            gle0 gle0Var = k9h0.f17916a;
                            t760.a(t760VarA, intentAddFlags, "Какой-то случайный заголовок!", "Какое-то случайное сообщение!", 0, null, null, GrsBaseInfo.CountryCodeSource.UNKNOWN, 0, null, 944);
                        }
                    }
                }
                return Unit.f46060a;
            case 12:
                jbq0 jbq0Var = (jbq0) obj;
                gbq0 gbq0Var = (gbq0) obj3;
                s2m0 s2m0Var = gbq0.m2;
                gbq0Var.getClass();
                phf0 phf0Var = gbq0Var.k2;
                hbq0 hbq0Var = hbq0.f12782a;
                if (!Intrinsics.d(jbq0Var, hbq0Var)) {
                    if (!(jbq0Var instanceof ibq0)) {
                        t9f.b();
                        return null;
                    }
                    androidx.fragment.app.e eVarF = gbq0Var.F();
                    iiy[] iiyVarArr3 = gbq0.n2;
                    eVarF.t0(i120.V(new Pair(phf0Var.n(gbq0Var, iiyVarArr3[2]), Integer.valueOf(((ibq0) jbq0Var).f14503a))), phf0Var.n(gbq0Var, iiyVarArr3[2]));
                    ((nbq0) gbq0Var.i2.getValue()).c.o(null, hbq0Var);
                    gbq0Var.x0();
                }
                return Unit.f46060a;
            case 13:
                s2m0 s2m0Var2 = gbq0.m2;
                ((cbq0) ((gbq0) obj3).l2.getValue()).A(((kbq0) obj).f18027a);
                return Unit.f46060a;
            case 14:
                obq0 obq0Var = (obq0) obj;
                final xbq0 xbq0Var = (xbq0) obj3;
                m6m0 m6m0Var = xbq0.O1;
                xbq0Var.getClass();
                List list2 = obq0Var.f24995a;
                boolean z4 = obq0Var.c;
                if (!list2.isEmpty()) {
                    Drawable drawableH0 = xbq0Var.H0();
                    Drawable drawableH1 = xbq0Var.H0();
                    Drawable drawableH2 = xbq0Var.H0();
                    Drawable drawableG0 = xbq0Var.G0();
                    Drawable drawableG1 = xbq0Var.G0();
                    Drawable drawableG2 = xbq0Var.G0();
                    Iterator it12 = list2.iterator();
                    do {
                        if (it12.hasNext()) {
                            next = it12.next();
                            uaq0.f35345a.getClass();
                        } else {
                            next = null;
                        }
                        uaq0Var = (uaq0) next;
                        if (uaq0Var != null) {
                            iJ4 = xbq0Var.J0(uaq0Var, R.attr.uikitBackgroundContent);
                            iJ5 = xbq0Var.J0(uaq0Var, R.attr.uikitBackground);
                            if (drawableH0 != null) {
                                drawableH0.setTint(iJ4);
                            }
                            if (drawableG0 != null) {
                                drawableG0.setTint(iJ5);
                            }
                        }
                        it = list2.iterator();
                        do {
                            if (it.hasNext()) {
                                next2 = it.next();
                                uaq0.f35345a.getClass();
                            } else {
                                next2 = null;
                            }
                            uaq0Var2 = (uaq0) next2;
                            if (uaq0Var2 != null) {
                                iJ2 = xbq0Var.J0(uaq0Var2, R.attr.uikitBackgroundContent);
                                iJ3 = xbq0Var.J0(uaq0Var2, R.attr.uikitBackground);
                                if (drawableH1 != null) {
                                    drawableH1.setTint(iJ2);
                                }
                                if (drawableG1 != null) {
                                    drawableG1.setTint(iJ3);
                                }
                            }
                            it2 = list2.iterator();
                            do {
                                if (it2.hasNext()) {
                                    next3 = it2.next();
                                    uaq0.f35345a.getClass();
                                } else {
                                    next3 = null;
                                }
                                uaq0Var3 = (uaq0) next3;
                                if (uaq0Var3 != null) {
                                    iJ0 = xbq0Var.J0(uaq0Var3, R.attr.uikitBackgroundContent);
                                    iJ1 = xbq0Var.J0(uaq0Var3, R.attr.uikitBackground);
                                    if (drawableH2 != null) {
                                        drawableH2.setTint(iJ0);
                                    }
                                    if (drawableG2 != null) {
                                        drawableG2.setTint(iJ1);
                                    }
                                }
                                xbq0Var.I0().d.setImageDrawable(drawableH0);
                                xbq0Var.I0().b.setImageDrawable(drawableH1);
                                xbq0Var.I0().f.setImageDrawable(drawableH2);
                                xbq0Var.I0().e.setImageDrawable(drawableG0);
                                xbq0Var.I0().c.setImageDrawable(drawableG1);
                                xbq0Var.I0().g.setImageDrawable(drawableG2);
                                uaq0 uaq0Var13 = obq0Var.b;
                                DsRadioButton dsRadioButton = xbq0Var.I0().j;
                                uaq0.f35345a.getClass();
                                dsRadioButton.setChecked(s9m0.j(uaq0Var13));
                                xbq0Var.I0().i.setChecked(s9m0.i(uaq0Var13));
                                xbq0Var.I0().k.setChecked(s9m0.k(uaq0Var13));
                                DsRadioButton dsRadioButton2 = xbq0Var.I0().j;
                                if (list2.isEmpty()) {
                                    i = 8;
                                } else {
                                    it11 = list2.iterator();
                                    while (true) {
                                        if (it11.hasNext()) {
                                            uaq0Var12 = (uaq0) it11.next();
                                            uaq0.f35345a.getClass();
                                            if (s9m0.j(uaq0Var12)) {
                                                i = 0;
                                            }
                                        } else {
                                            i = 8;
                                        }
                                    }
                                }
                                dsRadioButton2.setVisibility(i);
                                DsRadioButton dsRadioButton3 = xbq0Var.I0().i;
                                if (list2.isEmpty()) {
                                    i2 = 8;
                                } else {
                                    it10 = list2.iterator();
                                    while (true) {
                                        if (it10.hasNext()) {
                                            uaq0Var11 = (uaq0) it10.next();
                                            uaq0.f35345a.getClass();
                                            if (s9m0.i(uaq0Var11)) {
                                                i2 = 0;
                                            }
                                        } else {
                                            i2 = 8;
                                        }
                                    }
                                }
                                dsRadioButton3.setVisibility(i2);
                                DsRadioButton dsRadioButton4 = xbq0Var.I0().k;
                                if (list2.isEmpty()) {
                                    i3 = 8;
                                } else {
                                    it9 = list2.iterator();
                                    while (true) {
                                        if (it9.hasNext()) {
                                            uaq0Var10 = (uaq0) it9.next();
                                            uaq0.f35345a.getClass();
                                            if (s9m0.k(uaq0Var10)) {
                                                i3 = 0;
                                            }
                                        } else {
                                            i3 = 8;
                                        }
                                    }
                                }
                                dsRadioButton4.setVisibility(i3);
                                AppCompatImageView appCompatImageView = xbq0Var.I0().d;
                                if (list2.isEmpty()) {
                                    i4 = 8;
                                } else {
                                    it8 = list2.iterator();
                                    while (true) {
                                        if (it8.hasNext()) {
                                            uaq0Var9 = (uaq0) it8.next();
                                            uaq0.f35345a.getClass();
                                            if (s9m0.j(uaq0Var9)) {
                                                i4 = 0;
                                            }
                                        } else {
                                            i4 = 8;
                                        }
                                    }
                                }
                                appCompatImageView.setVisibility(i4);
                                AppCompatImageView appCompatImageView2 = xbq0Var.I0().b;
                                if (list2.isEmpty()) {
                                    i5 = 8;
                                } else {
                                    it7 = list2.iterator();
                                    while (true) {
                                        if (it7.hasNext()) {
                                            uaq0Var8 = (uaq0) it7.next();
                                            uaq0.f35345a.getClass();
                                            if (s9m0.i(uaq0Var8)) {
                                                i5 = 0;
                                            }
                                        } else {
                                            i5 = 8;
                                        }
                                    }
                                }
                                appCompatImageView2.setVisibility(i5);
                                AppCompatImageView appCompatImageView3 = xbq0Var.I0().f;
                                if (list2.isEmpty()) {
                                    i6 = 8;
                                } else {
                                    it6 = list2.iterator();
                                    while (true) {
                                        if (it6.hasNext()) {
                                            uaq0Var7 = (uaq0) it6.next();
                                            uaq0.f35345a.getClass();
                                            if (s9m0.k(uaq0Var7)) {
                                                i6 = 0;
                                            }
                                        } else {
                                            i6 = 8;
                                        }
                                    }
                                }
                                appCompatImageView3.setVisibility(i6);
                                AppCompatImageView appCompatImageView4 = xbq0Var.I0().e;
                                if (list2.isEmpty()) {
                                    i7 = 8;
                                } else {
                                    it5 = list2.iterator();
                                    while (true) {
                                        if (it5.hasNext()) {
                                            uaq0Var6 = (uaq0) it5.next();
                                            uaq0.f35345a.getClass();
                                            if (s9m0.j(uaq0Var6)) {
                                                i7 = 0;
                                            }
                                        } else {
                                            i7 = 8;
                                        }
                                    }
                                }
                                appCompatImageView4.setVisibility(i7);
                                AppCompatImageView appCompatImageView5 = xbq0Var.I0().c;
                                if (list2.isEmpty()) {
                                    i8 = 8;
                                } else {
                                    it4 = list2.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            uaq0Var5 = (uaq0) it4.next();
                                            uaq0.f35345a.getClass();
                                            if (s9m0.i(uaq0Var5)) {
                                                i8 = 0;
                                            }
                                        } else {
                                            i8 = 8;
                                        }
                                    }
                                }
                                appCompatImageView5.setVisibility(i8);
                                AppCompatImageView appCompatImageView6 = xbq0Var.I0().g;
                                if (list2.isEmpty()) {
                                    i9 = 8;
                                } else {
                                    it3 = list2.iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            uaq0Var4 = (uaq0) it3.next();
                                            uaq0.f35345a.getClass();
                                            if (s9m0.k(uaq0Var4)) {
                                                i9 = 0;
                                            }
                                        } else {
                                            i9 = 8;
                                        }
                                    }
                                }
                                appCompatImageView6.setVisibility(i9);
                                String str3 = obq0Var.e;
                                String str4 = obq0Var.f;
                                xbq0Var.I0().o.setText(str3);
                                xbq0Var.I0().m.setText(str4);
                                xbq0Var.I0().l.setChecked(z4);
                                DsCellRightSwitch dsCellRightSwitch = xbq0Var.I0().l;
                                l7p0 l7p0Var = new l7p0(xbq0Var, (byte) 21);
                                ymx ymxVar = ivb0.b;
                                ymxVar.getClass();
                                dsCellRightSwitch.setOnCheckedChangeListener(new ajj(ymxVar, true, l7p0Var));
                                dyb.O(xbq0Var.I0().q, new npt0(xbq0Var.I0().l, b2));
                                dyb.c0(xbq0Var.I0().o, new Function1() { // from class: a.tbq0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        byte b4 = b3;
                                        xbq0 xbq0Var2 = xbq0Var;
                                        View view = (View) obj4;
                                        switch (b4) {
                                            case 0:
                                                m6m0 m6m0Var2 = xbq0.O1;
                                                view.getClass();
                                                if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                                    s2m0 s2m0Var3 = ilq0.l2;
                                                    androidx.fragment.app.e eVarC10 = xbq0Var2.C();
                                                    eVarC10.getClass();
                                                    String strH25 = xbq0Var2.H(R.string.turn_off_theme);
                                                    strH25.getClass();
                                                    s2m0Var3.getClass();
                                                    s2m0.c(eVarC10, "TIME_PICKER_OFF_DIALOG_KEY", strH25);
                                                }
                                                break;
                                            default:
                                                m6m0 m6m0Var3 = xbq0.O1;
                                                view.getClass();
                                                if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                                    s2m0 s2m0Var4 = ilq0.l2;
                                                    androidx.fragment.app.e eVarC11 = xbq0Var2.C();
                                                    eVarC11.getClass();
                                                    String strH26 = xbq0Var2.H(R.string.turn_on_theme);
                                                    strH26.getClass();
                                                    s2m0Var4.getClass();
                                                    s2m0.c(eVarC11, "TIME_PICKER_ON_DIALOG_KEY", strH26);
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                final byte b4 = 0;
                                dyb.c0(xbq0Var.I0().m, new Function1() { // from class: a.tbq0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj4) {
                                        byte b5 = b4;
                                        xbq0 xbq0Var2 = xbq0Var;
                                        View view = (View) obj4;
                                        switch (b5) {
                                            case 0:
                                                m6m0 m6m0Var2 = xbq0.O1;
                                                view.getClass();
                                                if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                                    s2m0 s2m0Var3 = ilq0.l2;
                                                    androidx.fragment.app.e eVarC10 = xbq0Var2.C();
                                                    eVarC10.getClass();
                                                    String strH25 = xbq0Var2.H(R.string.turn_off_theme);
                                                    strH25.getClass();
                                                    s2m0Var3.getClass();
                                                    s2m0.c(eVarC10, "TIME_PICKER_OFF_DIALOG_KEY", strH25);
                                                }
                                                break;
                                            default:
                                                m6m0 m6m0Var3 = xbq0.O1;
                                                view.getClass();
                                                if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                                    s2m0 s2m0Var4 = ilq0.l2;
                                                    androidx.fragment.app.e eVarC11 = xbq0Var2.C();
                                                    eVarC11.getClass();
                                                    String strH26 = xbq0Var2.H(R.string.turn_on_theme);
                                                    strH26.getClass();
                                                    s2m0Var4.getClass();
                                                    s2m0.c(eVarC11, "TIME_PICKER_ON_DIALOG_KEY", strH26);
                                                }
                                                break;
                                        }
                                        return Unit.f46060a;
                                    }
                                });
                                boolean z5 = obq0Var.d;
                                xbq0Var.I0().q.setEnabled(z5);
                                xbq0Var.I0().l.setEnabled(z5);
                                xbq0Var.I0().p.setEnabled(z4);
                                xbq0Var.I0().n.setEnabled(z4);
                            } while (!s9m0.k((uaq0) next3));
                            uaq0Var3 = (uaq0) next3;
                            if (uaq0Var3 != null) {
                                iJ0 = xbq0Var.J0(uaq0Var3, R.attr.uikitBackgroundContent);
                                iJ1 = xbq0Var.J0(uaq0Var3, R.attr.uikitBackground);
                                if (drawableH2 != null) {
                                    drawableH2.setTint(iJ0);
                                }
                                if (drawableG2 != null) {
                                    drawableG2.setTint(iJ1);
                                }
                            }
                            xbq0Var.I0().d.setImageDrawable(drawableH0);
                            xbq0Var.I0().b.setImageDrawable(drawableH1);
                            xbq0Var.I0().f.setImageDrawable(drawableH2);
                            xbq0Var.I0().e.setImageDrawable(drawableG0);
                            xbq0Var.I0().c.setImageDrawable(drawableG1);
                            xbq0Var.I0().g.setImageDrawable(drawableG2);
                            uaq0 uaq0Var14 = obq0Var.b;
                            DsRadioButton dsRadioButton5 = xbq0Var.I0().j;
                            uaq0.f35345a.getClass();
                            dsRadioButton5.setChecked(s9m0.j(uaq0Var14));
                            xbq0Var.I0().i.setChecked(s9m0.i(uaq0Var14));
                            xbq0Var.I0().k.setChecked(s9m0.k(uaq0Var14));
                            DsRadioButton dsRadioButton6 = xbq0Var.I0().j;
                            if (list2.isEmpty()) {
                                i = 8;
                            } else {
                                it11 = list2.iterator();
                                while (true) {
                                    if (it11.hasNext()) {
                                        uaq0Var12 = (uaq0) it11.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.j(uaq0Var12)) {
                                            i = 0;
                                        }
                                    } else {
                                        i = 8;
                                    }
                                }
                            }
                            dsRadioButton6.setVisibility(i);
                            DsRadioButton dsRadioButton7 = xbq0Var.I0().i;
                            if (list2.isEmpty()) {
                                i2 = 8;
                            } else {
                                it10 = list2.iterator();
                                while (true) {
                                    if (it10.hasNext()) {
                                        uaq0Var11 = (uaq0) it10.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.i(uaq0Var11)) {
                                            i2 = 0;
                                        }
                                    } else {
                                        i2 = 8;
                                    }
                                }
                            }
                            dsRadioButton7.setVisibility(i2);
                            DsRadioButton dsRadioButton8 = xbq0Var.I0().k;
                            if (list2.isEmpty()) {
                                i3 = 8;
                            } else {
                                it9 = list2.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        uaq0Var10 = (uaq0) it9.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.k(uaq0Var10)) {
                                            i3 = 0;
                                        }
                                    } else {
                                        i3 = 8;
                                    }
                                }
                            }
                            dsRadioButton8.setVisibility(i3);
                            AppCompatImageView appCompatImageView7 = xbq0Var.I0().d;
                            if (list2.isEmpty()) {
                                i4 = 8;
                            } else {
                                it8 = list2.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        uaq0Var9 = (uaq0) it8.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.j(uaq0Var9)) {
                                            i4 = 0;
                                        }
                                    } else {
                                        i4 = 8;
                                    }
                                }
                            }
                            appCompatImageView7.setVisibility(i4);
                            AppCompatImageView appCompatImageView8 = xbq0Var.I0().b;
                            if (list2.isEmpty()) {
                                i5 = 8;
                            } else {
                                it7 = list2.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        uaq0Var8 = (uaq0) it7.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.i(uaq0Var8)) {
                                            i5 = 0;
                                        }
                                    } else {
                                        i5 = 8;
                                    }
                                }
                            }
                            appCompatImageView8.setVisibility(i5);
                            AppCompatImageView appCompatImageView9 = xbq0Var.I0().f;
                            if (list2.isEmpty()) {
                                i6 = 8;
                            } else {
                                it6 = list2.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        uaq0Var7 = (uaq0) it6.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.k(uaq0Var7)) {
                                            i6 = 0;
                                        }
                                    } else {
                                        i6 = 8;
                                    }
                                }
                            }
                            appCompatImageView9.setVisibility(i6);
                            AppCompatImageView appCompatImageView10 = xbq0Var.I0().e;
                            if (list2.isEmpty()) {
                                i7 = 8;
                            } else {
                                it5 = list2.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        uaq0Var6 = (uaq0) it5.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.j(uaq0Var6)) {
                                            i7 = 0;
                                        }
                                    } else {
                                        i7 = 8;
                                    }
                                }
                            }
                            appCompatImageView10.setVisibility(i7);
                            AppCompatImageView appCompatImageView11 = xbq0Var.I0().c;
                            if (list2.isEmpty()) {
                                i8 = 8;
                            } else {
                                it4 = list2.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        uaq0Var5 = (uaq0) it4.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.i(uaq0Var5)) {
                                            i8 = 0;
                                        }
                                    } else {
                                        i8 = 8;
                                    }
                                }
                            }
                            appCompatImageView11.setVisibility(i8);
                            AppCompatImageView appCompatImageView12 = xbq0Var.I0().g;
                            if (list2.isEmpty()) {
                                i9 = 8;
                            } else {
                                it3 = list2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        uaq0Var4 = (uaq0) it3.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.k(uaq0Var4)) {
                                            i9 = 0;
                                        }
                                    } else {
                                        i9 = 8;
                                    }
                                }
                            }
                            appCompatImageView12.setVisibility(i9);
                            String str5 = obq0Var.e;
                            String str6 = obq0Var.f;
                            xbq0Var.I0().o.setText(str5);
                            xbq0Var.I0().m.setText(str6);
                            xbq0Var.I0().l.setChecked(z4);
                            DsCellRightSwitch dsCellRightSwitch2 = xbq0Var.I0().l;
                            l7p0 l7p0Var2 = new l7p0(xbq0Var, (byte) 21);
                            ymx ymxVar2 = ivb0.b;
                            ymxVar2.getClass();
                            dsCellRightSwitch2.setOnCheckedChangeListener(new ajj(ymxVar2, true, l7p0Var2));
                            dyb.O(xbq0Var.I0().q, new npt0(xbq0Var.I0().l, b2));
                            dyb.c0(xbq0Var.I0().o, new Function1() { // from class: a.tbq0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    byte b5 = b3;
                                    xbq0 xbq0Var2 = xbq0Var;
                                    View view = (View) obj4;
                                    switch (b5) {
                                        case 0:
                                            m6m0 m6m0Var2 = xbq0.O1;
                                            view.getClass();
                                            if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                                s2m0 s2m0Var3 = ilq0.l2;
                                                androidx.fragment.app.e eVarC10 = xbq0Var2.C();
                                                eVarC10.getClass();
                                                String strH25 = xbq0Var2.H(R.string.turn_off_theme);
                                                strH25.getClass();
                                                s2m0Var3.getClass();
                                                s2m0.c(eVarC10, "TIME_PICKER_OFF_DIALOG_KEY", strH25);
                                            }
                                            break;
                                        default:
                                            m6m0 m6m0Var3 = xbq0.O1;
                                            view.getClass();
                                            if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                                s2m0 s2m0Var4 = ilq0.l2;
                                                androidx.fragment.app.e eVarC11 = xbq0Var2.C();
                                                eVarC11.getClass();
                                                String strH26 = xbq0Var2.H(R.string.turn_on_theme);
                                                strH26.getClass();
                                                s2m0Var4.getClass();
                                                s2m0.c(eVarC11, "TIME_PICKER_ON_DIALOG_KEY", strH26);
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            });
                            final byte b5 = 0;
                            dyb.c0(xbq0Var.I0().m, new Function1() { // from class: a.tbq0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    byte b6 = b5;
                                    xbq0 xbq0Var2 = xbq0Var;
                                    View view = (View) obj4;
                                    switch (b6) {
                                        case 0:
                                            m6m0 m6m0Var2 = xbq0.O1;
                                            view.getClass();
                                            if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                                s2m0 s2m0Var3 = ilq0.l2;
                                                androidx.fragment.app.e eVarC10 = xbq0Var2.C();
                                                eVarC10.getClass();
                                                String strH25 = xbq0Var2.H(R.string.turn_off_theme);
                                                strH25.getClass();
                                                s2m0Var3.getClass();
                                                s2m0.c(eVarC10, "TIME_PICKER_OFF_DIALOG_KEY", strH25);
                                            }
                                            break;
                                        default:
                                            m6m0 m6m0Var3 = xbq0.O1;
                                            view.getClass();
                                            if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                                s2m0 s2m0Var4 = ilq0.l2;
                                                androidx.fragment.app.e eVarC11 = xbq0Var2.C();
                                                eVarC11.getClass();
                                                String strH26 = xbq0Var2.H(R.string.turn_on_theme);
                                                strH26.getClass();
                                                s2m0Var4.getClass();
                                                s2m0.c(eVarC11, "TIME_PICKER_ON_DIALOG_KEY", strH26);
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            });
                            boolean z6 = obq0Var.d;
                            xbq0Var.I0().q.setEnabled(z6);
                            xbq0Var.I0().l.setEnabled(z6);
                            xbq0Var.I0().p.setEnabled(z4);
                            xbq0Var.I0().n.setEnabled(z4);
                        } while (!s9m0.i((uaq0) next2));
                        uaq0Var2 = (uaq0) next2;
                        if (uaq0Var2 != null) {
                            iJ2 = xbq0Var.J0(uaq0Var2, R.attr.uikitBackgroundContent);
                            iJ3 = xbq0Var.J0(uaq0Var2, R.attr.uikitBackground);
                            if (drawableH1 != null) {
                                drawableH1.setTint(iJ2);
                            }
                            if (drawableG1 != null) {
                                drawableG1.setTint(iJ3);
                            }
                        }
                        it2 = list2.iterator();
                        do {
                            if (it2.hasNext()) {
                                next3 = it2.next();
                                uaq0.f35345a.getClass();
                            } else {
                                next3 = null;
                            }
                            uaq0Var3 = (uaq0) next3;
                            if (uaq0Var3 != null) {
                                iJ0 = xbq0Var.J0(uaq0Var3, R.attr.uikitBackgroundContent);
                                iJ1 = xbq0Var.J0(uaq0Var3, R.attr.uikitBackground);
                                if (drawableH2 != null) {
                                    drawableH2.setTint(iJ0);
                                }
                                if (drawableG2 != null) {
                                    drawableG2.setTint(iJ1);
                                }
                            }
                            xbq0Var.I0().d.setImageDrawable(drawableH0);
                            xbq0Var.I0().b.setImageDrawable(drawableH1);
                            xbq0Var.I0().f.setImageDrawable(drawableH2);
                            xbq0Var.I0().e.setImageDrawable(drawableG0);
                            xbq0Var.I0().c.setImageDrawable(drawableG1);
                            xbq0Var.I0().g.setImageDrawable(drawableG2);
                            uaq0 uaq0Var15 = obq0Var.b;
                            DsRadioButton dsRadioButton9 = xbq0Var.I0().j;
                            uaq0.f35345a.getClass();
                            dsRadioButton9.setChecked(s9m0.j(uaq0Var15));
                            xbq0Var.I0().i.setChecked(s9m0.i(uaq0Var15));
                            xbq0Var.I0().k.setChecked(s9m0.k(uaq0Var15));
                            DsRadioButton dsRadioButton10 = xbq0Var.I0().j;
                            if (list2.isEmpty()) {
                                i = 8;
                            } else {
                                it11 = list2.iterator();
                                while (true) {
                                    if (it11.hasNext()) {
                                        uaq0Var12 = (uaq0) it11.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.j(uaq0Var12)) {
                                            i = 0;
                                        }
                                    } else {
                                        i = 8;
                                    }
                                }
                            }
                            dsRadioButton10.setVisibility(i);
                            DsRadioButton dsRadioButton11 = xbq0Var.I0().i;
                            if (list2.isEmpty()) {
                                i2 = 8;
                            } else {
                                it10 = list2.iterator();
                                while (true) {
                                    if (it10.hasNext()) {
                                        uaq0Var11 = (uaq0) it10.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.i(uaq0Var11)) {
                                            i2 = 0;
                                        }
                                    } else {
                                        i2 = 8;
                                    }
                                }
                            }
                            dsRadioButton11.setVisibility(i2);
                            DsRadioButton dsRadioButton12 = xbq0Var.I0().k;
                            if (list2.isEmpty()) {
                                i3 = 8;
                            } else {
                                it9 = list2.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        uaq0Var10 = (uaq0) it9.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.k(uaq0Var10)) {
                                            i3 = 0;
                                        }
                                    } else {
                                        i3 = 8;
                                    }
                                }
                            }
                            dsRadioButton12.setVisibility(i3);
                            AppCompatImageView appCompatImageView13 = xbq0Var.I0().d;
                            if (list2.isEmpty()) {
                                i4 = 8;
                            } else {
                                it8 = list2.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        uaq0Var9 = (uaq0) it8.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.j(uaq0Var9)) {
                                            i4 = 0;
                                        }
                                    } else {
                                        i4 = 8;
                                    }
                                }
                            }
                            appCompatImageView13.setVisibility(i4);
                            AppCompatImageView appCompatImageView14 = xbq0Var.I0().b;
                            if (list2.isEmpty()) {
                                i5 = 8;
                            } else {
                                it7 = list2.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        uaq0Var8 = (uaq0) it7.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.i(uaq0Var8)) {
                                            i5 = 0;
                                        }
                                    } else {
                                        i5 = 8;
                                    }
                                }
                            }
                            appCompatImageView14.setVisibility(i5);
                            AppCompatImageView appCompatImageView15 = xbq0Var.I0().f;
                            if (list2.isEmpty()) {
                                i6 = 8;
                            } else {
                                it6 = list2.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        uaq0Var7 = (uaq0) it6.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.k(uaq0Var7)) {
                                            i6 = 0;
                                        }
                                    } else {
                                        i6 = 8;
                                    }
                                }
                            }
                            appCompatImageView15.setVisibility(i6);
                            AppCompatImageView appCompatImageView16 = xbq0Var.I0().e;
                            if (list2.isEmpty()) {
                                i7 = 8;
                            } else {
                                it5 = list2.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        uaq0Var6 = (uaq0) it5.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.j(uaq0Var6)) {
                                            i7 = 0;
                                        }
                                    } else {
                                        i7 = 8;
                                    }
                                }
                            }
                            appCompatImageView16.setVisibility(i7);
                            AppCompatImageView appCompatImageView17 = xbq0Var.I0().c;
                            if (list2.isEmpty()) {
                                i8 = 8;
                            } else {
                                it4 = list2.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        uaq0Var5 = (uaq0) it4.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.i(uaq0Var5)) {
                                            i8 = 0;
                                        }
                                    } else {
                                        i8 = 8;
                                    }
                                }
                            }
                            appCompatImageView17.setVisibility(i8);
                            AppCompatImageView appCompatImageView18 = xbq0Var.I0().g;
                            if (list2.isEmpty()) {
                                i9 = 8;
                            } else {
                                it3 = list2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        uaq0Var4 = (uaq0) it3.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.k(uaq0Var4)) {
                                            i9 = 0;
                                        }
                                    } else {
                                        i9 = 8;
                                    }
                                }
                            }
                            appCompatImageView18.setVisibility(i9);
                            String str7 = obq0Var.e;
                            String str8 = obq0Var.f;
                            xbq0Var.I0().o.setText(str7);
                            xbq0Var.I0().m.setText(str8);
                            xbq0Var.I0().l.setChecked(z4);
                            DsCellRightSwitch dsCellRightSwitch3 = xbq0Var.I0().l;
                            l7p0 l7p0Var3 = new l7p0(xbq0Var, (byte) 21);
                            ymx ymxVar3 = ivb0.b;
                            ymxVar3.getClass();
                            dsCellRightSwitch3.setOnCheckedChangeListener(new ajj(ymxVar3, true, l7p0Var3));
                            dyb.O(xbq0Var.I0().q, new npt0(xbq0Var.I0().l, b2));
                            dyb.c0(xbq0Var.I0().o, new Function1() { // from class: a.tbq0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    byte b6 = b3;
                                    xbq0 xbq0Var2 = xbq0Var;
                                    View view = (View) obj4;
                                    switch (b6) {
                                        case 0:
                                            m6m0 m6m0Var2 = xbq0.O1;
                                            view.getClass();
                                            if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                                s2m0 s2m0Var3 = ilq0.l2;
                                                androidx.fragment.app.e eVarC10 = xbq0Var2.C();
                                                eVarC10.getClass();
                                                String strH25 = xbq0Var2.H(R.string.turn_off_theme);
                                                strH25.getClass();
                                                s2m0Var3.getClass();
                                                s2m0.c(eVarC10, "TIME_PICKER_OFF_DIALOG_KEY", strH25);
                                            }
                                            break;
                                        default:
                                            m6m0 m6m0Var3 = xbq0.O1;
                                            view.getClass();
                                            if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                                s2m0 s2m0Var4 = ilq0.l2;
                                                androidx.fragment.app.e eVarC11 = xbq0Var2.C();
                                                eVarC11.getClass();
                                                String strH26 = xbq0Var2.H(R.string.turn_on_theme);
                                                strH26.getClass();
                                                s2m0Var4.getClass();
                                                s2m0.c(eVarC11, "TIME_PICKER_ON_DIALOG_KEY", strH26);
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            });
                            final byte b6 = 0;
                            dyb.c0(xbq0Var.I0().m, new Function1() { // from class: a.tbq0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    byte b7 = b6;
                                    xbq0 xbq0Var2 = xbq0Var;
                                    View view = (View) obj4;
                                    switch (b7) {
                                        case 0:
                                            m6m0 m6m0Var2 = xbq0.O1;
                                            view.getClass();
                                            if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                                s2m0 s2m0Var3 = ilq0.l2;
                                                androidx.fragment.app.e eVarC10 = xbq0Var2.C();
                                                eVarC10.getClass();
                                                String strH25 = xbq0Var2.H(R.string.turn_off_theme);
                                                strH25.getClass();
                                                s2m0Var3.getClass();
                                                s2m0.c(eVarC10, "TIME_PICKER_OFF_DIALOG_KEY", strH25);
                                            }
                                            break;
                                        default:
                                            m6m0 m6m0Var3 = xbq0.O1;
                                            view.getClass();
                                            if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                                s2m0 s2m0Var4 = ilq0.l2;
                                                androidx.fragment.app.e eVarC11 = xbq0Var2.C();
                                                eVarC11.getClass();
                                                String strH26 = xbq0Var2.H(R.string.turn_on_theme);
                                                strH26.getClass();
                                                s2m0Var4.getClass();
                                                s2m0.c(eVarC11, "TIME_PICKER_ON_DIALOG_KEY", strH26);
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            });
                            boolean z7 = obq0Var.d;
                            xbq0Var.I0().q.setEnabled(z7);
                            xbq0Var.I0().l.setEnabled(z7);
                            xbq0Var.I0().p.setEnabled(z4);
                            xbq0Var.I0().n.setEnabled(z4);
                        } while (!s9m0.k((uaq0) next3));
                        uaq0Var3 = (uaq0) next3;
                        if (uaq0Var3 != null) {
                            iJ0 = xbq0Var.J0(uaq0Var3, R.attr.uikitBackgroundContent);
                            iJ1 = xbq0Var.J0(uaq0Var3, R.attr.uikitBackground);
                            if (drawableH2 != null) {
                                drawableH2.setTint(iJ0);
                            }
                            if (drawableG2 != null) {
                                drawableG2.setTint(iJ1);
                            }
                        }
                        xbq0Var.I0().d.setImageDrawable(drawableH0);
                        xbq0Var.I0().b.setImageDrawable(drawableH1);
                        xbq0Var.I0().f.setImageDrawable(drawableH2);
                        xbq0Var.I0().e.setImageDrawable(drawableG0);
                        xbq0Var.I0().c.setImageDrawable(drawableG1);
                        xbq0Var.I0().g.setImageDrawable(drawableG2);
                        uaq0 uaq0Var16 = obq0Var.b;
                        DsRadioButton dsRadioButton13 = xbq0Var.I0().j;
                        uaq0.f35345a.getClass();
                        dsRadioButton13.setChecked(s9m0.j(uaq0Var16));
                        xbq0Var.I0().i.setChecked(s9m0.i(uaq0Var16));
                        xbq0Var.I0().k.setChecked(s9m0.k(uaq0Var16));
                        DsRadioButton dsRadioButton14 = xbq0Var.I0().j;
                        if (list2.isEmpty()) {
                            i = 8;
                        } else {
                            it11 = list2.iterator();
                            while (true) {
                                if (it11.hasNext()) {
                                    uaq0Var12 = (uaq0) it11.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.j(uaq0Var12)) {
                                        i = 0;
                                    }
                                } else {
                                    i = 8;
                                }
                            }
                        }
                        dsRadioButton14.setVisibility(i);
                        DsRadioButton dsRadioButton15 = xbq0Var.I0().i;
                        if (list2.isEmpty()) {
                            i2 = 8;
                        } else {
                            it10 = list2.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    uaq0Var11 = (uaq0) it10.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.i(uaq0Var11)) {
                                        i2 = 0;
                                    }
                                } else {
                                    i2 = 8;
                                }
                            }
                        }
                        dsRadioButton15.setVisibility(i2);
                        DsRadioButton dsRadioButton16 = xbq0Var.I0().k;
                        if (list2.isEmpty()) {
                            i3 = 8;
                        } else {
                            it9 = list2.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    uaq0Var10 = (uaq0) it9.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.k(uaq0Var10)) {
                                        i3 = 0;
                                    }
                                } else {
                                    i3 = 8;
                                }
                            }
                        }
                        dsRadioButton16.setVisibility(i3);
                        AppCompatImageView appCompatImageView19 = xbq0Var.I0().d;
                        if (list2.isEmpty()) {
                            i4 = 8;
                        } else {
                            it8 = list2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    uaq0Var9 = (uaq0) it8.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.j(uaq0Var9)) {
                                        i4 = 0;
                                    }
                                } else {
                                    i4 = 8;
                                }
                            }
                        }
                        appCompatImageView19.setVisibility(i4);
                        AppCompatImageView appCompatImageView110 = xbq0Var.I0().b;
                        if (list2.isEmpty()) {
                            i5 = 8;
                        } else {
                            it7 = list2.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    uaq0Var8 = (uaq0) it7.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.i(uaq0Var8)) {
                                        i5 = 0;
                                    }
                                } else {
                                    i5 = 8;
                                }
                            }
                        }
                        appCompatImageView110.setVisibility(i5);
                        AppCompatImageView appCompatImageView111 = xbq0Var.I0().f;
                        if (list2.isEmpty()) {
                            i6 = 8;
                        } else {
                            it6 = list2.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    uaq0Var7 = (uaq0) it6.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.k(uaq0Var7)) {
                                        i6 = 0;
                                    }
                                } else {
                                    i6 = 8;
                                }
                            }
                        }
                        appCompatImageView111.setVisibility(i6);
                        AppCompatImageView appCompatImageView112 = xbq0Var.I0().e;
                        if (list2.isEmpty()) {
                            i7 = 8;
                        } else {
                            it5 = list2.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    uaq0Var6 = (uaq0) it5.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.j(uaq0Var6)) {
                                        i7 = 0;
                                    }
                                } else {
                                    i7 = 8;
                                }
                            }
                        }
                        appCompatImageView112.setVisibility(i7);
                        AppCompatImageView appCompatImageView113 = xbq0Var.I0().c;
                        if (list2.isEmpty()) {
                            i8 = 8;
                        } else {
                            it4 = list2.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    uaq0Var5 = (uaq0) it4.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.i(uaq0Var5)) {
                                        i8 = 0;
                                    }
                                } else {
                                    i8 = 8;
                                }
                            }
                        }
                        appCompatImageView113.setVisibility(i8);
                        AppCompatImageView appCompatImageView114 = xbq0Var.I0().g;
                        if (list2.isEmpty()) {
                            i9 = 8;
                        } else {
                            it3 = list2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    uaq0Var4 = (uaq0) it3.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.k(uaq0Var4)) {
                                        i9 = 0;
                                    }
                                } else {
                                    i9 = 8;
                                }
                            }
                        }
                        appCompatImageView114.setVisibility(i9);
                        String str9 = obq0Var.e;
                        String str10 = obq0Var.f;
                        xbq0Var.I0().o.setText(str9);
                        xbq0Var.I0().m.setText(str10);
                        xbq0Var.I0().l.setChecked(z4);
                        DsCellRightSwitch dsCellRightSwitch4 = xbq0Var.I0().l;
                        l7p0 l7p0Var4 = new l7p0(xbq0Var, (byte) 21);
                        ymx ymxVar4 = ivb0.b;
                        ymxVar4.getClass();
                        dsCellRightSwitch4.setOnCheckedChangeListener(new ajj(ymxVar4, true, l7p0Var4));
                        dyb.O(xbq0Var.I0().q, new npt0(xbq0Var.I0().l, b2));
                        dyb.c0(xbq0Var.I0().o, new Function1() { // from class: a.tbq0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                byte b7 = b3;
                                xbq0 xbq0Var2 = xbq0Var;
                                View view = (View) obj4;
                                switch (b7) {
                                    case 0:
                                        m6m0 m6m0Var2 = xbq0.O1;
                                        view.getClass();
                                        if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                            s2m0 s2m0Var3 = ilq0.l2;
                                            androidx.fragment.app.e eVarC10 = xbq0Var2.C();
                                            eVarC10.getClass();
                                            String strH25 = xbq0Var2.H(R.string.turn_off_theme);
                                            strH25.getClass();
                                            s2m0Var3.getClass();
                                            s2m0.c(eVarC10, "TIME_PICKER_OFF_DIALOG_KEY", strH25);
                                        }
                                        break;
                                    default:
                                        m6m0 m6m0Var3 = xbq0.O1;
                                        view.getClass();
                                        if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                            s2m0 s2m0Var4 = ilq0.l2;
                                            androidx.fragment.app.e eVarC11 = xbq0Var2.C();
                                            eVarC11.getClass();
                                            String strH26 = xbq0Var2.H(R.string.turn_on_theme);
                                            strH26.getClass();
                                            s2m0Var4.getClass();
                                            s2m0.c(eVarC11, "TIME_PICKER_ON_DIALOG_KEY", strH26);
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        final byte b7 = 0;
                        dyb.c0(xbq0Var.I0().m, new Function1() { // from class: a.tbq0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                byte b8 = b7;
                                xbq0 xbq0Var2 = xbq0Var;
                                View view = (View) obj4;
                                switch (b8) {
                                    case 0:
                                        m6m0 m6m0Var2 = xbq0.O1;
                                        view.getClass();
                                        if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                            s2m0 s2m0Var3 = ilq0.l2;
                                            androidx.fragment.app.e eVarC10 = xbq0Var2.C();
                                            eVarC10.getClass();
                                            String strH25 = xbq0Var2.H(R.string.turn_off_theme);
                                            strH25.getClass();
                                            s2m0Var3.getClass();
                                            s2m0.c(eVarC10, "TIME_PICKER_OFF_DIALOG_KEY", strH25);
                                        }
                                        break;
                                    default:
                                        m6m0 m6m0Var3 = xbq0.O1;
                                        view.getClass();
                                        if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                            s2m0 s2m0Var4 = ilq0.l2;
                                            androidx.fragment.app.e eVarC11 = xbq0Var2.C();
                                            eVarC11.getClass();
                                            String strH26 = xbq0Var2.H(R.string.turn_on_theme);
                                            strH26.getClass();
                                            s2m0Var4.getClass();
                                            s2m0.c(eVarC11, "TIME_PICKER_ON_DIALOG_KEY", strH26);
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        boolean z8 = obq0Var.d;
                        xbq0Var.I0().q.setEnabled(z8);
                        xbq0Var.I0().l.setEnabled(z8);
                        xbq0Var.I0().p.setEnabled(z4);
                        xbq0Var.I0().n.setEnabled(z4);
                    } while (!s9m0.j((uaq0) next));
                    uaq0Var = (uaq0) next;
                    if (uaq0Var != null) {
                        iJ4 = xbq0Var.J0(uaq0Var, R.attr.uikitBackgroundContent);
                        iJ5 = xbq0Var.J0(uaq0Var, R.attr.uikitBackground);
                        if (drawableH0 != null) {
                            drawableH0.setTint(iJ4);
                        }
                        if (drawableG0 != null) {
                            drawableG0.setTint(iJ5);
                        }
                    }
                    it = list2.iterator();
                    do {
                        if (it.hasNext()) {
                            next2 = it.next();
                            uaq0.f35345a.getClass();
                        } else {
                            next2 = null;
                        }
                        uaq0Var2 = (uaq0) next2;
                        if (uaq0Var2 != null) {
                            iJ2 = xbq0Var.J0(uaq0Var2, R.attr.uikitBackgroundContent);
                            iJ3 = xbq0Var.J0(uaq0Var2, R.attr.uikitBackground);
                            if (drawableH1 != null) {
                                drawableH1.setTint(iJ2);
                            }
                            if (drawableG1 != null) {
                                drawableG1.setTint(iJ3);
                            }
                        }
                        it2 = list2.iterator();
                        do {
                            if (it2.hasNext()) {
                                next3 = it2.next();
                                uaq0.f35345a.getClass();
                            } else {
                                next3 = null;
                            }
                            uaq0Var3 = (uaq0) next3;
                            if (uaq0Var3 != null) {
                                iJ0 = xbq0Var.J0(uaq0Var3, R.attr.uikitBackgroundContent);
                                iJ1 = xbq0Var.J0(uaq0Var3, R.attr.uikitBackground);
                                if (drawableH2 != null) {
                                    drawableH2.setTint(iJ0);
                                }
                                if (drawableG2 != null) {
                                    drawableG2.setTint(iJ1);
                                }
                            }
                            xbq0Var.I0().d.setImageDrawable(drawableH0);
                            xbq0Var.I0().b.setImageDrawable(drawableH1);
                            xbq0Var.I0().f.setImageDrawable(drawableH2);
                            xbq0Var.I0().e.setImageDrawable(drawableG0);
                            xbq0Var.I0().c.setImageDrawable(drawableG1);
                            xbq0Var.I0().g.setImageDrawable(drawableG2);
                            uaq0 uaq0Var17 = obq0Var.b;
                            DsRadioButton dsRadioButton17 = xbq0Var.I0().j;
                            uaq0.f35345a.getClass();
                            dsRadioButton17.setChecked(s9m0.j(uaq0Var17));
                            xbq0Var.I0().i.setChecked(s9m0.i(uaq0Var17));
                            xbq0Var.I0().k.setChecked(s9m0.k(uaq0Var17));
                            DsRadioButton dsRadioButton18 = xbq0Var.I0().j;
                            if (list2.isEmpty()) {
                                i = 8;
                            } else {
                                it11 = list2.iterator();
                                while (true) {
                                    if (it11.hasNext()) {
                                        uaq0Var12 = (uaq0) it11.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.j(uaq0Var12)) {
                                            i = 0;
                                        }
                                    } else {
                                        i = 8;
                                    }
                                }
                            }
                            dsRadioButton18.setVisibility(i);
                            DsRadioButton dsRadioButton19 = xbq0Var.I0().i;
                            if (list2.isEmpty()) {
                                i2 = 8;
                            } else {
                                it10 = list2.iterator();
                                while (true) {
                                    if (it10.hasNext()) {
                                        uaq0Var11 = (uaq0) it10.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.i(uaq0Var11)) {
                                            i2 = 0;
                                        }
                                    } else {
                                        i2 = 8;
                                    }
                                }
                            }
                            dsRadioButton19.setVisibility(i2);
                            DsRadioButton dsRadioButton110 = xbq0Var.I0().k;
                            if (list2.isEmpty()) {
                                i3 = 8;
                            } else {
                                it9 = list2.iterator();
                                while (true) {
                                    if (it9.hasNext()) {
                                        uaq0Var10 = (uaq0) it9.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.k(uaq0Var10)) {
                                            i3 = 0;
                                        }
                                    } else {
                                        i3 = 8;
                                    }
                                }
                            }
                            dsRadioButton110.setVisibility(i3);
                            AppCompatImageView appCompatImageView115 = xbq0Var.I0().d;
                            if (list2.isEmpty()) {
                                i4 = 8;
                            } else {
                                it8 = list2.iterator();
                                while (true) {
                                    if (it8.hasNext()) {
                                        uaq0Var9 = (uaq0) it8.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.j(uaq0Var9)) {
                                            i4 = 0;
                                        }
                                    } else {
                                        i4 = 8;
                                    }
                                }
                            }
                            appCompatImageView115.setVisibility(i4);
                            AppCompatImageView appCompatImageView116 = xbq0Var.I0().b;
                            if (list2.isEmpty()) {
                                i5 = 8;
                            } else {
                                it7 = list2.iterator();
                                while (true) {
                                    if (it7.hasNext()) {
                                        uaq0Var8 = (uaq0) it7.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.i(uaq0Var8)) {
                                            i5 = 0;
                                        }
                                    } else {
                                        i5 = 8;
                                    }
                                }
                            }
                            appCompatImageView116.setVisibility(i5);
                            AppCompatImageView appCompatImageView117 = xbq0Var.I0().f;
                            if (list2.isEmpty()) {
                                i6 = 8;
                            } else {
                                it6 = list2.iterator();
                                while (true) {
                                    if (it6.hasNext()) {
                                        uaq0Var7 = (uaq0) it6.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.k(uaq0Var7)) {
                                            i6 = 0;
                                        }
                                    } else {
                                        i6 = 8;
                                    }
                                }
                            }
                            appCompatImageView117.setVisibility(i6);
                            AppCompatImageView appCompatImageView118 = xbq0Var.I0().e;
                            if (list2.isEmpty()) {
                                i7 = 8;
                            } else {
                                it5 = list2.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        uaq0Var6 = (uaq0) it5.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.j(uaq0Var6)) {
                                            i7 = 0;
                                        }
                                    } else {
                                        i7 = 8;
                                    }
                                }
                            }
                            appCompatImageView118.setVisibility(i7);
                            AppCompatImageView appCompatImageView119 = xbq0Var.I0().c;
                            if (list2.isEmpty()) {
                                i8 = 8;
                            } else {
                                it4 = list2.iterator();
                                while (true) {
                                    if (it4.hasNext()) {
                                        uaq0Var5 = (uaq0) it4.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.i(uaq0Var5)) {
                                            i8 = 0;
                                        }
                                    } else {
                                        i8 = 8;
                                    }
                                }
                            }
                            appCompatImageView119.setVisibility(i8);
                            AppCompatImageView appCompatImageView1110 = xbq0Var.I0().g;
                            if (list2.isEmpty()) {
                                i9 = 8;
                            } else {
                                it3 = list2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        uaq0Var4 = (uaq0) it3.next();
                                        uaq0.f35345a.getClass();
                                        if (s9m0.k(uaq0Var4)) {
                                            i9 = 0;
                                        }
                                    } else {
                                        i9 = 8;
                                    }
                                }
                            }
                            appCompatImageView1110.setVisibility(i9);
                            String str11 = obq0Var.e;
                            String str12 = obq0Var.f;
                            xbq0Var.I0().o.setText(str11);
                            xbq0Var.I0().m.setText(str12);
                            xbq0Var.I0().l.setChecked(z4);
                            DsCellRightSwitch dsCellRightSwitch5 = xbq0Var.I0().l;
                            l7p0 l7p0Var5 = new l7p0(xbq0Var, (byte) 21);
                            ymx ymxVar5 = ivb0.b;
                            ymxVar5.getClass();
                            dsCellRightSwitch5.setOnCheckedChangeListener(new ajj(ymxVar5, true, l7p0Var5));
                            dyb.O(xbq0Var.I0().q, new npt0(xbq0Var.I0().l, b2));
                            dyb.c0(xbq0Var.I0().o, new Function1() { // from class: a.tbq0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    byte b8 = b3;
                                    xbq0 xbq0Var2 = xbq0Var;
                                    View view = (View) obj4;
                                    switch (b8) {
                                        case 0:
                                            m6m0 m6m0Var2 = xbq0.O1;
                                            view.getClass();
                                            if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                                s2m0 s2m0Var3 = ilq0.l2;
                                                androidx.fragment.app.e eVarC10 = xbq0Var2.C();
                                                eVarC10.getClass();
                                                String strH25 = xbq0Var2.H(R.string.turn_off_theme);
                                                strH25.getClass();
                                                s2m0Var3.getClass();
                                                s2m0.c(eVarC10, "TIME_PICKER_OFF_DIALOG_KEY", strH25);
                                            }
                                            break;
                                        default:
                                            m6m0 m6m0Var3 = xbq0.O1;
                                            view.getClass();
                                            if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                                s2m0 s2m0Var4 = ilq0.l2;
                                                androidx.fragment.app.e eVarC11 = xbq0Var2.C();
                                                eVarC11.getClass();
                                                String strH26 = xbq0Var2.H(R.string.turn_on_theme);
                                                strH26.getClass();
                                                s2m0Var4.getClass();
                                                s2m0.c(eVarC11, "TIME_PICKER_ON_DIALOG_KEY", strH26);
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            });
                            final byte b8 = 0;
                            dyb.c0(xbq0Var.I0().m, new Function1() { // from class: a.tbq0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    byte b9 = b8;
                                    xbq0 xbq0Var2 = xbq0Var;
                                    View view = (View) obj4;
                                    switch (b9) {
                                        case 0:
                                            m6m0 m6m0Var2 = xbq0.O1;
                                            view.getClass();
                                            if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                                s2m0 s2m0Var3 = ilq0.l2;
                                                androidx.fragment.app.e eVarC10 = xbq0Var2.C();
                                                eVarC10.getClass();
                                                String strH25 = xbq0Var2.H(R.string.turn_off_theme);
                                                strH25.getClass();
                                                s2m0Var3.getClass();
                                                s2m0.c(eVarC10, "TIME_PICKER_OFF_DIALOG_KEY", strH25);
                                            }
                                            break;
                                        default:
                                            m6m0 m6m0Var3 = xbq0.O1;
                                            view.getClass();
                                            if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                                s2m0 s2m0Var4 = ilq0.l2;
                                                androidx.fragment.app.e eVarC11 = xbq0Var2.C();
                                                eVarC11.getClass();
                                                String strH26 = xbq0Var2.H(R.string.turn_on_theme);
                                                strH26.getClass();
                                                s2m0Var4.getClass();
                                                s2m0.c(eVarC11, "TIME_PICKER_ON_DIALOG_KEY", strH26);
                                            }
                                            break;
                                    }
                                    return Unit.f46060a;
                                }
                            });
                            boolean z9 = obq0Var.d;
                            xbq0Var.I0().q.setEnabled(z9);
                            xbq0Var.I0().l.setEnabled(z9);
                            xbq0Var.I0().p.setEnabled(z4);
                            xbq0Var.I0().n.setEnabled(z4);
                        } while (!s9m0.k((uaq0) next3));
                        uaq0Var3 = (uaq0) next3;
                        if (uaq0Var3 != null) {
                            iJ0 = xbq0Var.J0(uaq0Var3, R.attr.uikitBackgroundContent);
                            iJ1 = xbq0Var.J0(uaq0Var3, R.attr.uikitBackground);
                            if (drawableH2 != null) {
                                drawableH2.setTint(iJ0);
                            }
                            if (drawableG2 != null) {
                                drawableG2.setTint(iJ1);
                            }
                        }
                        xbq0Var.I0().d.setImageDrawable(drawableH0);
                        xbq0Var.I0().b.setImageDrawable(drawableH1);
                        xbq0Var.I0().f.setImageDrawable(drawableH2);
                        xbq0Var.I0().e.setImageDrawable(drawableG0);
                        xbq0Var.I0().c.setImageDrawable(drawableG1);
                        xbq0Var.I0().g.setImageDrawable(drawableG2);
                        uaq0 uaq0Var18 = obq0Var.b;
                        DsRadioButton dsRadioButton111 = xbq0Var.I0().j;
                        uaq0.f35345a.getClass();
                        dsRadioButton111.setChecked(s9m0.j(uaq0Var18));
                        xbq0Var.I0().i.setChecked(s9m0.i(uaq0Var18));
                        xbq0Var.I0().k.setChecked(s9m0.k(uaq0Var18));
                        DsRadioButton dsRadioButton112 = xbq0Var.I0().j;
                        if (list2.isEmpty()) {
                            i = 8;
                        } else {
                            it11 = list2.iterator();
                            while (true) {
                                if (it11.hasNext()) {
                                    uaq0Var12 = (uaq0) it11.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.j(uaq0Var12)) {
                                        i = 0;
                                    }
                                } else {
                                    i = 8;
                                }
                            }
                        }
                        dsRadioButton112.setVisibility(i);
                        DsRadioButton dsRadioButton113 = xbq0Var.I0().i;
                        if (list2.isEmpty()) {
                            i2 = 8;
                        } else {
                            it10 = list2.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    uaq0Var11 = (uaq0) it10.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.i(uaq0Var11)) {
                                        i2 = 0;
                                    }
                                } else {
                                    i2 = 8;
                                }
                            }
                        }
                        dsRadioButton113.setVisibility(i2);
                        DsRadioButton dsRadioButton114 = xbq0Var.I0().k;
                        if (list2.isEmpty()) {
                            i3 = 8;
                        } else {
                            it9 = list2.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    uaq0Var10 = (uaq0) it9.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.k(uaq0Var10)) {
                                        i3 = 0;
                                    }
                                } else {
                                    i3 = 8;
                                }
                            }
                        }
                        dsRadioButton114.setVisibility(i3);
                        AppCompatImageView appCompatImageView1111 = xbq0Var.I0().d;
                        if (list2.isEmpty()) {
                            i4 = 8;
                        } else {
                            it8 = list2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    uaq0Var9 = (uaq0) it8.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.j(uaq0Var9)) {
                                        i4 = 0;
                                    }
                                } else {
                                    i4 = 8;
                                }
                            }
                        }
                        appCompatImageView1111.setVisibility(i4);
                        AppCompatImageView appCompatImageView1112 = xbq0Var.I0().b;
                        if (list2.isEmpty()) {
                            i5 = 8;
                        } else {
                            it7 = list2.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    uaq0Var8 = (uaq0) it7.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.i(uaq0Var8)) {
                                        i5 = 0;
                                    }
                                } else {
                                    i5 = 8;
                                }
                            }
                        }
                        appCompatImageView1112.setVisibility(i5);
                        AppCompatImageView appCompatImageView1113 = xbq0Var.I0().f;
                        if (list2.isEmpty()) {
                            i6 = 8;
                        } else {
                            it6 = list2.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    uaq0Var7 = (uaq0) it6.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.k(uaq0Var7)) {
                                        i6 = 0;
                                    }
                                } else {
                                    i6 = 8;
                                }
                            }
                        }
                        appCompatImageView1113.setVisibility(i6);
                        AppCompatImageView appCompatImageView1114 = xbq0Var.I0().e;
                        if (list2.isEmpty()) {
                            i7 = 8;
                        } else {
                            it5 = list2.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    uaq0Var6 = (uaq0) it5.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.j(uaq0Var6)) {
                                        i7 = 0;
                                    }
                                } else {
                                    i7 = 8;
                                }
                            }
                        }
                        appCompatImageView1114.setVisibility(i7);
                        AppCompatImageView appCompatImageView1115 = xbq0Var.I0().c;
                        if (list2.isEmpty()) {
                            i8 = 8;
                        } else {
                            it4 = list2.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    uaq0Var5 = (uaq0) it4.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.i(uaq0Var5)) {
                                        i8 = 0;
                                    }
                                } else {
                                    i8 = 8;
                                }
                            }
                        }
                        appCompatImageView1115.setVisibility(i8);
                        AppCompatImageView appCompatImageView1116 = xbq0Var.I0().g;
                        if (list2.isEmpty()) {
                            i9 = 8;
                        } else {
                            it3 = list2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    uaq0Var4 = (uaq0) it3.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.k(uaq0Var4)) {
                                        i9 = 0;
                                    }
                                } else {
                                    i9 = 8;
                                }
                            }
                        }
                        appCompatImageView1116.setVisibility(i9);
                        String str13 = obq0Var.e;
                        String str14 = obq0Var.f;
                        xbq0Var.I0().o.setText(str13);
                        xbq0Var.I0().m.setText(str14);
                        xbq0Var.I0().l.setChecked(z4);
                        DsCellRightSwitch dsCellRightSwitch6 = xbq0Var.I0().l;
                        l7p0 l7p0Var6 = new l7p0(xbq0Var, (byte) 21);
                        ymx ymxVar6 = ivb0.b;
                        ymxVar6.getClass();
                        dsCellRightSwitch6.setOnCheckedChangeListener(new ajj(ymxVar6, true, l7p0Var6));
                        dyb.O(xbq0Var.I0().q, new npt0(xbq0Var.I0().l, b2));
                        dyb.c0(xbq0Var.I0().o, new Function1() { // from class: a.tbq0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                byte b9 = b3;
                                xbq0 xbq0Var2 = xbq0Var;
                                View view = (View) obj4;
                                switch (b9) {
                                    case 0:
                                        m6m0 m6m0Var2 = xbq0.O1;
                                        view.getClass();
                                        if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                            s2m0 s2m0Var3 = ilq0.l2;
                                            androidx.fragment.app.e eVarC10 = xbq0Var2.C();
                                            eVarC10.getClass();
                                            String strH25 = xbq0Var2.H(R.string.turn_off_theme);
                                            strH25.getClass();
                                            s2m0Var3.getClass();
                                            s2m0.c(eVarC10, "TIME_PICKER_OFF_DIALOG_KEY", strH25);
                                        }
                                        break;
                                    default:
                                        m6m0 m6m0Var3 = xbq0.O1;
                                        view.getClass();
                                        if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                            s2m0 s2m0Var4 = ilq0.l2;
                                            androidx.fragment.app.e eVarC11 = xbq0Var2.C();
                                            eVarC11.getClass();
                                            String strH26 = xbq0Var2.H(R.string.turn_on_theme);
                                            strH26.getClass();
                                            s2m0Var4.getClass();
                                            s2m0.c(eVarC11, "TIME_PICKER_ON_DIALOG_KEY", strH26);
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        final byte b9 = 0;
                        dyb.c0(xbq0Var.I0().m, new Function1() { // from class: a.tbq0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                byte b10 = b9;
                                xbq0 xbq0Var2 = xbq0Var;
                                View view = (View) obj4;
                                switch (b10) {
                                    case 0:
                                        m6m0 m6m0Var2 = xbq0.O1;
                                        view.getClass();
                                        if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                            s2m0 s2m0Var3 = ilq0.l2;
                                            androidx.fragment.app.e eVarC10 = xbq0Var2.C();
                                            eVarC10.getClass();
                                            String strH25 = xbq0Var2.H(R.string.turn_off_theme);
                                            strH25.getClass();
                                            s2m0Var3.getClass();
                                            s2m0.c(eVarC10, "TIME_PICKER_OFF_DIALOG_KEY", strH25);
                                        }
                                        break;
                                    default:
                                        m6m0 m6m0Var3 = xbq0.O1;
                                        view.getClass();
                                        if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                            s2m0 s2m0Var4 = ilq0.l2;
                                            androidx.fragment.app.e eVarC11 = xbq0Var2.C();
                                            eVarC11.getClass();
                                            String strH26 = xbq0Var2.H(R.string.turn_on_theme);
                                            strH26.getClass();
                                            s2m0Var4.getClass();
                                            s2m0.c(eVarC11, "TIME_PICKER_ON_DIALOG_KEY", strH26);
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        boolean z10 = obq0Var.d;
                        xbq0Var.I0().q.setEnabled(z10);
                        xbq0Var.I0().l.setEnabled(z10);
                        xbq0Var.I0().p.setEnabled(z4);
                        xbq0Var.I0().n.setEnabled(z4);
                    } while (!s9m0.i((uaq0) next2));
                    uaq0Var2 = (uaq0) next2;
                    if (uaq0Var2 != null) {
                        iJ2 = xbq0Var.J0(uaq0Var2, R.attr.uikitBackgroundContent);
                        iJ3 = xbq0Var.J0(uaq0Var2, R.attr.uikitBackground);
                        if (drawableH1 != null) {
                            drawableH1.setTint(iJ2);
                        }
                        if (drawableG1 != null) {
                            drawableG1.setTint(iJ3);
                        }
                    }
                    it2 = list2.iterator();
                    do {
                        if (it2.hasNext()) {
                            next3 = it2.next();
                            uaq0.f35345a.getClass();
                        } else {
                            next3 = null;
                        }
                        uaq0Var3 = (uaq0) next3;
                        if (uaq0Var3 != null) {
                            iJ0 = xbq0Var.J0(uaq0Var3, R.attr.uikitBackgroundContent);
                            iJ1 = xbq0Var.J0(uaq0Var3, R.attr.uikitBackground);
                            if (drawableH2 != null) {
                                drawableH2.setTint(iJ0);
                            }
                            if (drawableG2 != null) {
                                drawableG2.setTint(iJ1);
                            }
                        }
                        xbq0Var.I0().d.setImageDrawable(drawableH0);
                        xbq0Var.I0().b.setImageDrawable(drawableH1);
                        xbq0Var.I0().f.setImageDrawable(drawableH2);
                        xbq0Var.I0().e.setImageDrawable(drawableG0);
                        xbq0Var.I0().c.setImageDrawable(drawableG1);
                        xbq0Var.I0().g.setImageDrawable(drawableG2);
                        uaq0 uaq0Var19 = obq0Var.b;
                        DsRadioButton dsRadioButton115 = xbq0Var.I0().j;
                        uaq0.f35345a.getClass();
                        dsRadioButton115.setChecked(s9m0.j(uaq0Var19));
                        xbq0Var.I0().i.setChecked(s9m0.i(uaq0Var19));
                        xbq0Var.I0().k.setChecked(s9m0.k(uaq0Var19));
                        DsRadioButton dsRadioButton116 = xbq0Var.I0().j;
                        if (list2.isEmpty()) {
                            i = 8;
                        } else {
                            it11 = list2.iterator();
                            while (true) {
                                if (it11.hasNext()) {
                                    uaq0Var12 = (uaq0) it11.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.j(uaq0Var12)) {
                                        i = 0;
                                    }
                                } else {
                                    i = 8;
                                }
                            }
                        }
                        dsRadioButton116.setVisibility(i);
                        DsRadioButton dsRadioButton117 = xbq0Var.I0().i;
                        if (list2.isEmpty()) {
                            i2 = 8;
                        } else {
                            it10 = list2.iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    uaq0Var11 = (uaq0) it10.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.i(uaq0Var11)) {
                                        i2 = 0;
                                    }
                                } else {
                                    i2 = 8;
                                }
                            }
                        }
                        dsRadioButton117.setVisibility(i2);
                        DsRadioButton dsRadioButton118 = xbq0Var.I0().k;
                        if (list2.isEmpty()) {
                            i3 = 8;
                        } else {
                            it9 = list2.iterator();
                            while (true) {
                                if (it9.hasNext()) {
                                    uaq0Var10 = (uaq0) it9.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.k(uaq0Var10)) {
                                        i3 = 0;
                                    }
                                } else {
                                    i3 = 8;
                                }
                            }
                        }
                        dsRadioButton118.setVisibility(i3);
                        AppCompatImageView appCompatImageView1117 = xbq0Var.I0().d;
                        if (list2.isEmpty()) {
                            i4 = 8;
                        } else {
                            it8 = list2.iterator();
                            while (true) {
                                if (it8.hasNext()) {
                                    uaq0Var9 = (uaq0) it8.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.j(uaq0Var9)) {
                                        i4 = 0;
                                    }
                                } else {
                                    i4 = 8;
                                }
                            }
                        }
                        appCompatImageView1117.setVisibility(i4);
                        AppCompatImageView appCompatImageView1118 = xbq0Var.I0().b;
                        if (list2.isEmpty()) {
                            i5 = 8;
                        } else {
                            it7 = list2.iterator();
                            while (true) {
                                if (it7.hasNext()) {
                                    uaq0Var8 = (uaq0) it7.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.i(uaq0Var8)) {
                                        i5 = 0;
                                    }
                                } else {
                                    i5 = 8;
                                }
                            }
                        }
                        appCompatImageView1118.setVisibility(i5);
                        AppCompatImageView appCompatImageView1119 = xbq0Var.I0().f;
                        if (list2.isEmpty()) {
                            i6 = 8;
                        } else {
                            it6 = list2.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    uaq0Var7 = (uaq0) it6.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.k(uaq0Var7)) {
                                        i6 = 0;
                                    }
                                } else {
                                    i6 = 8;
                                }
                            }
                        }
                        appCompatImageView1119.setVisibility(i6);
                        AppCompatImageView appCompatImageView11110 = xbq0Var.I0().e;
                        if (list2.isEmpty()) {
                            i7 = 8;
                        } else {
                            it5 = list2.iterator();
                            while (true) {
                                if (it5.hasNext()) {
                                    uaq0Var6 = (uaq0) it5.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.j(uaq0Var6)) {
                                        i7 = 0;
                                    }
                                } else {
                                    i7 = 8;
                                }
                            }
                        }
                        appCompatImageView11110.setVisibility(i7);
                        AppCompatImageView appCompatImageView11111 = xbq0Var.I0().c;
                        if (list2.isEmpty()) {
                            i8 = 8;
                        } else {
                            it4 = list2.iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    uaq0Var5 = (uaq0) it4.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.i(uaq0Var5)) {
                                        i8 = 0;
                                    }
                                } else {
                                    i8 = 8;
                                }
                            }
                        }
                        appCompatImageView11111.setVisibility(i8);
                        AppCompatImageView appCompatImageView11112 = xbq0Var.I0().g;
                        if (list2.isEmpty()) {
                            i9 = 8;
                        } else {
                            it3 = list2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    uaq0Var4 = (uaq0) it3.next();
                                    uaq0.f35345a.getClass();
                                    if (s9m0.k(uaq0Var4)) {
                                        i9 = 0;
                                    }
                                } else {
                                    i9 = 8;
                                }
                            }
                        }
                        appCompatImageView11112.setVisibility(i9);
                        String str15 = obq0Var.e;
                        String str16 = obq0Var.f;
                        xbq0Var.I0().o.setText(str15);
                        xbq0Var.I0().m.setText(str16);
                        xbq0Var.I0().l.setChecked(z4);
                        DsCellRightSwitch dsCellRightSwitch7 = xbq0Var.I0().l;
                        l7p0 l7p0Var7 = new l7p0(xbq0Var, (byte) 21);
                        ymx ymxVar7 = ivb0.b;
                        ymxVar7.getClass();
                        dsCellRightSwitch7.setOnCheckedChangeListener(new ajj(ymxVar7, true, l7p0Var7));
                        dyb.O(xbq0Var.I0().q, new npt0(xbq0Var.I0().l, b2));
                        dyb.c0(xbq0Var.I0().o, new Function1() { // from class: a.tbq0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                byte b10 = b3;
                                xbq0 xbq0Var2 = xbq0Var;
                                View view = (View) obj4;
                                switch (b10) {
                                    case 0:
                                        m6m0 m6m0Var2 = xbq0.O1;
                                        view.getClass();
                                        if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                            s2m0 s2m0Var3 = ilq0.l2;
                                            androidx.fragment.app.e eVarC10 = xbq0Var2.C();
                                            eVarC10.getClass();
                                            String strH25 = xbq0Var2.H(R.string.turn_off_theme);
                                            strH25.getClass();
                                            s2m0Var3.getClass();
                                            s2m0.c(eVarC10, "TIME_PICKER_OFF_DIALOG_KEY", strH25);
                                        }
                                        break;
                                    default:
                                        m6m0 m6m0Var3 = xbq0.O1;
                                        view.getClass();
                                        if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                            s2m0 s2m0Var4 = ilq0.l2;
                                            androidx.fragment.app.e eVarC11 = xbq0Var2.C();
                                            eVarC11.getClass();
                                            String strH26 = xbq0Var2.H(R.string.turn_on_theme);
                                            strH26.getClass();
                                            s2m0Var4.getClass();
                                            s2m0.c(eVarC11, "TIME_PICKER_ON_DIALOG_KEY", strH26);
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        final byte b10 = 0;
                        dyb.c0(xbq0Var.I0().m, new Function1() { // from class: a.tbq0
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj4) {
                                byte b11 = b10;
                                xbq0 xbq0Var2 = xbq0Var;
                                View view = (View) obj4;
                                switch (b11) {
                                    case 0:
                                        m6m0 m6m0Var2 = xbq0.O1;
                                        view.getClass();
                                        if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                            s2m0 s2m0Var3 = ilq0.l2;
                                            androidx.fragment.app.e eVarC10 = xbq0Var2.C();
                                            eVarC10.getClass();
                                            String strH25 = xbq0Var2.H(R.string.turn_off_theme);
                                            strH25.getClass();
                                            s2m0Var3.getClass();
                                            s2m0.c(eVarC10, "TIME_PICKER_OFF_DIALOG_KEY", strH25);
                                        }
                                        break;
                                    default:
                                        m6m0 m6m0Var3 = xbq0.O1;
                                        view.getClass();
                                        if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                            s2m0 s2m0Var4 = ilq0.l2;
                                            androidx.fragment.app.e eVarC11 = xbq0Var2.C();
                                            eVarC11.getClass();
                                            String strH26 = xbq0Var2.H(R.string.turn_on_theme);
                                            strH26.getClass();
                                            s2m0Var4.getClass();
                                            s2m0.c(eVarC11, "TIME_PICKER_ON_DIALOG_KEY", strH26);
                                        }
                                        break;
                                }
                                return Unit.f46060a;
                            }
                        });
                        boolean z11 = obq0Var.d;
                        xbq0Var.I0().q.setEnabled(z11);
                        xbq0Var.I0().l.setEnabled(z11);
                        xbq0Var.I0().p.setEnabled(z4);
                        xbq0Var.I0().n.setEnabled(z4);
                    } while (!s9m0.k((uaq0) next3));
                    uaq0Var3 = (uaq0) next3;
                    if (uaq0Var3 != null) {
                        iJ0 = xbq0Var.J0(uaq0Var3, R.attr.uikitBackgroundContent);
                        iJ1 = xbq0Var.J0(uaq0Var3, R.attr.uikitBackground);
                        if (drawableH2 != null) {
                            drawableH2.setTint(iJ0);
                        }
                        if (drawableG2 != null) {
                            drawableG2.setTint(iJ1);
                        }
                    }
                    xbq0Var.I0().d.setImageDrawable(drawableH0);
                    xbq0Var.I0().b.setImageDrawable(drawableH1);
                    xbq0Var.I0().f.setImageDrawable(drawableH2);
                    xbq0Var.I0().e.setImageDrawable(drawableG0);
                    xbq0Var.I0().c.setImageDrawable(drawableG1);
                    xbq0Var.I0().g.setImageDrawable(drawableG2);
                    uaq0 uaq0Var110 = obq0Var.b;
                    DsRadioButton dsRadioButton119 = xbq0Var.I0().j;
                    uaq0.f35345a.getClass();
                    dsRadioButton119.setChecked(s9m0.j(uaq0Var110));
                    xbq0Var.I0().i.setChecked(s9m0.i(uaq0Var110));
                    xbq0Var.I0().k.setChecked(s9m0.k(uaq0Var110));
                    DsRadioButton dsRadioButton1110 = xbq0Var.I0().j;
                    if (list2.isEmpty()) {
                        i = 8;
                    } else {
                        it11 = list2.iterator();
                        while (true) {
                            if (it11.hasNext()) {
                                uaq0Var12 = (uaq0) it11.next();
                                uaq0.f35345a.getClass();
                                if (s9m0.j(uaq0Var12)) {
                                    i = 0;
                                }
                            } else {
                                i = 8;
                            }
                        }
                    }
                    dsRadioButton1110.setVisibility(i);
                    DsRadioButton dsRadioButton1111 = xbq0Var.I0().i;
                    if (list2.isEmpty()) {
                        i2 = 8;
                    } else {
                        it10 = list2.iterator();
                        while (true) {
                            if (it10.hasNext()) {
                                uaq0Var11 = (uaq0) it10.next();
                                uaq0.f35345a.getClass();
                                if (s9m0.i(uaq0Var11)) {
                                    i2 = 0;
                                }
                            } else {
                                i2 = 8;
                            }
                        }
                    }
                    dsRadioButton1111.setVisibility(i2);
                    DsRadioButton dsRadioButton1112 = xbq0Var.I0().k;
                    if (list2.isEmpty()) {
                        i3 = 8;
                    } else {
                        it9 = list2.iterator();
                        while (true) {
                            if (it9.hasNext()) {
                                uaq0Var10 = (uaq0) it9.next();
                                uaq0.f35345a.getClass();
                                if (s9m0.k(uaq0Var10)) {
                                    i3 = 0;
                                }
                            } else {
                                i3 = 8;
                            }
                        }
                    }
                    dsRadioButton1112.setVisibility(i3);
                    AppCompatImageView appCompatImageView11113 = xbq0Var.I0().d;
                    if (list2.isEmpty()) {
                        i4 = 8;
                    } else {
                        it8 = list2.iterator();
                        while (true) {
                            if (it8.hasNext()) {
                                uaq0Var9 = (uaq0) it8.next();
                                uaq0.f35345a.getClass();
                                if (s9m0.j(uaq0Var9)) {
                                    i4 = 0;
                                }
                            } else {
                                i4 = 8;
                            }
                        }
                    }
                    appCompatImageView11113.setVisibility(i4);
                    AppCompatImageView appCompatImageView11114 = xbq0Var.I0().b;
                    if (list2.isEmpty()) {
                        i5 = 8;
                    } else {
                        it7 = list2.iterator();
                        while (true) {
                            if (it7.hasNext()) {
                                uaq0Var8 = (uaq0) it7.next();
                                uaq0.f35345a.getClass();
                                if (s9m0.i(uaq0Var8)) {
                                    i5 = 0;
                                }
                            } else {
                                i5 = 8;
                            }
                        }
                    }
                    appCompatImageView11114.setVisibility(i5);
                    AppCompatImageView appCompatImageView11115 = xbq0Var.I0().f;
                    if (list2.isEmpty()) {
                        i6 = 8;
                    } else {
                        it6 = list2.iterator();
                        while (true) {
                            if (it6.hasNext()) {
                                uaq0Var7 = (uaq0) it6.next();
                                uaq0.f35345a.getClass();
                                if (s9m0.k(uaq0Var7)) {
                                    i6 = 0;
                                }
                            } else {
                                i6 = 8;
                            }
                        }
                    }
                    appCompatImageView11115.setVisibility(i6);
                    AppCompatImageView appCompatImageView11116 = xbq0Var.I0().e;
                    if (list2.isEmpty()) {
                        i7 = 8;
                    } else {
                        it5 = list2.iterator();
                        while (true) {
                            if (it5.hasNext()) {
                                uaq0Var6 = (uaq0) it5.next();
                                uaq0.f35345a.getClass();
                                if (s9m0.j(uaq0Var6)) {
                                    i7 = 0;
                                }
                            } else {
                                i7 = 8;
                            }
                        }
                    }
                    appCompatImageView11116.setVisibility(i7);
                    AppCompatImageView appCompatImageView11117 = xbq0Var.I0().c;
                    if (list2.isEmpty()) {
                        i8 = 8;
                    } else {
                        it4 = list2.iterator();
                        while (true) {
                            if (it4.hasNext()) {
                                uaq0Var5 = (uaq0) it4.next();
                                uaq0.f35345a.getClass();
                                if (s9m0.i(uaq0Var5)) {
                                    i8 = 0;
                                }
                            } else {
                                i8 = 8;
                            }
                        }
                    }
                    appCompatImageView11117.setVisibility(i8);
                    AppCompatImageView appCompatImageView11118 = xbq0Var.I0().g;
                    if (list2.isEmpty()) {
                        i9 = 8;
                    } else {
                        it3 = list2.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                uaq0Var4 = (uaq0) it3.next();
                                uaq0.f35345a.getClass();
                                if (s9m0.k(uaq0Var4)) {
                                    i9 = 0;
                                }
                            } else {
                                i9 = 8;
                            }
                        }
                    }
                    appCompatImageView11118.setVisibility(i9);
                    String str17 = obq0Var.e;
                    String str18 = obq0Var.f;
                    xbq0Var.I0().o.setText(str17);
                    xbq0Var.I0().m.setText(str18);
                    xbq0Var.I0().l.setChecked(z4);
                    DsCellRightSwitch dsCellRightSwitch8 = xbq0Var.I0().l;
                    l7p0 l7p0Var8 = new l7p0(xbq0Var, (byte) 21);
                    ymx ymxVar8 = ivb0.b;
                    ymxVar8.getClass();
                    dsCellRightSwitch8.setOnCheckedChangeListener(new ajj(ymxVar8, true, l7p0Var8));
                    dyb.O(xbq0Var.I0().q, new npt0(xbq0Var.I0().l, b2));
                    dyb.c0(xbq0Var.I0().o, new Function1() { // from class: a.tbq0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            byte b11 = b3;
                            xbq0 xbq0Var2 = xbq0Var;
                            View view = (View) obj4;
                            switch (b11) {
                                case 0:
                                    m6m0 m6m0Var2 = xbq0.O1;
                                    view.getClass();
                                    if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                        s2m0 s2m0Var3 = ilq0.l2;
                                        androidx.fragment.app.e eVarC10 = xbq0Var2.C();
                                        eVarC10.getClass();
                                        String strH25 = xbq0Var2.H(R.string.turn_off_theme);
                                        strH25.getClass();
                                        s2m0Var3.getClass();
                                        s2m0.c(eVarC10, "TIME_PICKER_OFF_DIALOG_KEY", strH25);
                                    }
                                    break;
                                default:
                                    m6m0 m6m0Var3 = xbq0.O1;
                                    view.getClass();
                                    if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                        s2m0 s2m0Var4 = ilq0.l2;
                                        androidx.fragment.app.e eVarC11 = xbq0Var2.C();
                                        eVarC11.getClass();
                                        String strH26 = xbq0Var2.H(R.string.turn_on_theme);
                                        strH26.getClass();
                                        s2m0Var4.getClass();
                                        s2m0.c(eVarC11, "TIME_PICKER_ON_DIALOG_KEY", strH26);
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    final byte b11 = 0;
                    dyb.c0(xbq0Var.I0().m, new Function1() { // from class: a.tbq0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj4) {
                            byte b12 = b11;
                            xbq0 xbq0Var2 = xbq0Var;
                            View view = (View) obj4;
                            switch (b12) {
                                case 0:
                                    m6m0 m6m0Var2 = xbq0.O1;
                                    view.getClass();
                                    if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                        s2m0 s2m0Var3 = ilq0.l2;
                                        androidx.fragment.app.e eVarC10 = xbq0Var2.C();
                                        eVarC10.getClass();
                                        String strH25 = xbq0Var2.H(R.string.turn_off_theme);
                                        strH25.getClass();
                                        s2m0Var3.getClass();
                                        s2m0.c(eVarC10, "TIME_PICKER_OFF_DIALOG_KEY", strH25);
                                    }
                                    break;
                                default:
                                    m6m0 m6m0Var3 = xbq0.O1;
                                    view.getClass();
                                    if (xbq0Var2.C().J("TimePickerBottomSheet") == null) {
                                        s2m0 s2m0Var4 = ilq0.l2;
                                        androidx.fragment.app.e eVarC11 = xbq0Var2.C();
                                        eVarC11.getClass();
                                        String strH26 = xbq0Var2.H(R.string.turn_on_theme);
                                        strH26.getClass();
                                        s2m0Var4.getClass();
                                        s2m0.c(eVarC11, "TIME_PICKER_ON_DIALOG_KEY", strH26);
                                    }
                                    break;
                            }
                            return Unit.f46060a;
                        }
                    });
                    boolean z12 = obq0Var.d;
                    xbq0Var.I0().q.setEnabled(z12);
                    xbq0Var.I0().l.setEnabled(z12);
                    xbq0Var.I0().p.setEnabled(z4);
                    xbq0Var.I0().n.setEnabled(z4);
                }
                return Unit.f46060a;
            case 15:
                zy5 zy5Var = (zy5) obj;
                oeq0 oeq0Var = (oeq0) obj3;
                oeq0Var.getClass();
                if (zy5Var != null) {
                    if (zy5Var instanceof ly5) {
                        ly5 ly5Var = (ly5) zy5Var;
                        if (!oeq0Var.p.a()) {
                            boolean z13 = (oeq0Var.n.a() && oeq0Var.o.a()) ? false : true;
                            p7m0 p7m0Var2 = oeq0Var.t;
                            do {
                                value = p7m0Var2.getValue();
                            } while (!p7m0Var2.m(value, ieq0.a((ieq0) value, null, null, 0.0d, null, false, 0.0d, z13, 63)));
                        }
                        oeq0Var.x(new heq0(true));
                        sac.V(jiu0.a(oeq0Var), new w6q0(1, oeq0Var, oeq0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 6), null, oeq0Var.e.f22085a, new neq0(oeq0Var, ly5Var, null), 10);
                    } else if ((zy5Var instanceof yle) || (zy5Var instanceof tle) || (zy5Var instanceof zle) || (zy5Var instanceof xle)) {
                        oeq0Var.x(new heq0(true));
                    }
                }
                return Unit.f46060a;
            case 16:
                zy5 zy5Var2 = (zy5) obj;
                wfq0 wfq0Var = (wfq0) obj3;
                p7m0 p7m0Var3 = wfq0Var.y;
                spx spxVar = wfq0Var.m;
                mne mneVar = wfq0Var.q;
                if (zy5Var2 != null) {
                    if (zy5Var2 instanceof fy5) {
                        wfq0Var.e.a(true);
                        sac.V(jiu0.a(wfq0Var), new w6q0(1, wfq0Var, wfq0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 9), null, mneVar.b, new tfq0(wfq0Var, yjeVar, (byte) 3), 10);
                    } else if (zy5Var2 instanceof yy5) {
                        bby bbyVar = wfq0Var.u;
                        if (bbyVar == null || !bbyVar.isActive()) {
                            wfq0Var.u = sac.V(jiu0.a(wfq0Var), new w6q0(1, wfq0Var, wfq0.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 10), null, mneVar.b, new tfq0(wfq0Var, yjeVar, (byte) 4), 10);
                        }
                    } else if (zy5Var2 instanceof ny5) {
                        bby bbyVar2 = wfq0Var.t;
                        if (bbyVar2 == null || !bbyVar2.isActive()) {
                            wfq0Var.t = sac.i0(jiu0.a(wfq0Var), wfq0.class.getName().concat(".getActiveGame"), 5, 5L, q3d.j(oqt0.class, ff5.class, zhi0.class), null, new tfq0(wfq0Var, yjeVar, b3), null, mneVar.b, new zeq0(wfq0Var, b3), null, 592);
                        }
                    } else if (zy5Var2 instanceof uy5) {
                        wfq0Var.y();
                    } else if ((zy5Var2 instanceof ry5) || (zy5Var2 instanceof ty5)) {
                        wfq0Var.B();
                    } else if (zy5Var2 instanceof ky5) {
                        if (spxVar.a()) {
                            kfq0 kfq0Var = new kfq0(false);
                            p7m0Var3.getClass();
                            p7m0Var3.o(null, kfq0Var);
                        }
                    } else if (zy5Var2 instanceof jy5) {
                        if (spxVar.a()) {
                            kfq0 kfq0Var2 = new kfq0(true);
                            p7m0Var3.getClass();
                            p7m0Var3.o(null, kfq0Var2);
                        }
                    } else if (zy5Var2 instanceof ly5) {
                        p7m0 p7m0Var4 = wfq0Var.z;
                        gfq0 gfq0Var = new gfq0(false);
                        p7m0Var4.getClass();
                        p7m0Var4.o(null, gfq0Var);
                    }
                }
                return Unit.f46060a;
            case 17:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((rhy) obj3).set(bool);
                return Unit.f46060a;
            case 18:
                y860.f0((NumberPicker) obj3, (z860) obj);
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                y860.f0((NumberPicker) obj3, (z860) obj);
                return Unit.f46060a;
            case 20:
                y860.f0((NumberPicker) obj3, (z860) obj);
                return Unit.f46060a;
            case 21:
                ((NumberPicker) obj3).setValue(((Number) obj).intValue());
                return Unit.f46060a;
            case 22:
                ((NumberPicker) obj3).setValue(((Number) obj).intValue());
                return Unit.f46060a;
            case 23:
                ((NumberPicker) obj3).setValue(((Number) obj).intValue());
                return Unit.f46060a;
            case 24:
                clq0 clq0Var = (clq0) obj;
                ilq0 ilq0Var = (ilq0) obj3;
                s2m0 s2m0Var3 = ilq0.l2;
                ilq0Var.getClass();
                phf0 phf0Var2 = ilq0Var.j2;
                if (Intrinsics.d(clq0Var, alq0.f1081a)) {
                    vcc.f0(i120.V(new Pair("BOTTOM_SHEET_RESULT", lw5.b)), ilq0Var, phf0Var2.n(ilq0Var, ilq0.m2[1]));
                    ilq0Var.x0();
                } else if (Intrinsics.d(clq0Var, zkq0.f44546a)) {
                    ilq0Var.x0();
                } else {
                    if (!(clq0Var instanceof blq0)) {
                        t9f.b();
                        return null;
                    }
                    vcc.f0(i120.V(new Pair("BOTTOM_SHEET_RESULT", lw5.f20747a), new Pair("BOTTOM_SHEET_ITEM_INDEX", Integer.valueOf(((blq0) clq0Var).f2807a.ordinal()))), ilq0Var, phf0Var2.n(ilq0Var, ilq0.m2[1]));
                    ilq0Var.x0();
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                nmq0 nmq0Var = (nmq0) obj3;
                iiy[] iiyVarArr4 = nmq0.Q1;
                nmq0Var.getClass();
                int iOrdinal = ((g9i0) obj).ordinal();
                if (iOrdinal == 0) {
                    nmq0Var.I0(nmq0Var.G0().c.b);
                } else if (iOrdinal == 1) {
                    nmq0Var.I0(nmq0Var.G0().g.b);
                } else if (iOrdinal == 2) {
                    nmq0Var.I0(nmq0Var.G0().d.b);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                iiy[] iiyVarArr5 = nmq0.Q1;
                ((FrameLayout) ((nmq0) obj3).G0().e.b).setVisibility(zBooleanValue ? 0 : 8);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return a(obj, obj2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((orq0) obj3).A((List) obj);
                return Unit.f46060a;
            default:
                ((m5r0) obj3).O((Throwable) obj);
                return Unit.f46060a;
        }
    }
}
