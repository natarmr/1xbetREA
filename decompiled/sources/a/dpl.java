package a;

import android.content.Context;
import android.content.res.TypedArray;
import android.gov.nist.core.Separators;
import android.graphics.drawable.Drawable;
import android.javax.sip.message.Response;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.eastern_nights.presentation.views.EasternNightsCellGameView;
import org.xplatform.pin_code.impl.presentation.views.enteringpincode.EnteringPinCode;
import org.xplatform.pin_code.impl.presentation.views.enteringpincode.PicCodeEditField;
import org.xplatform.pin_code.impl.presentation.views.enteringpincode.PinCodeSymbolButton;
import org.xplatform.uikit.components.buttons.DsButton;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;
import org.xplatform.uikit.components.chips.DsChip;
import org.xplatform.uikit.components.lottie_empty.DsLottieEmpty;
import org.xplatform.uikit.components.navigation_bar.DsNavigationBar;
import org.xplatform.uikit.components.search_field.DsSearchField;
import org.xplatform.uikit.components.text_field.DsTextField;
import org.xplatform.uikit.components.toolbar.base.DsNavigationBarBasic;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class dpl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f6473a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dpl(byte b, Object obj, Function1 function1) {
        this.f6473a = b;
        this.c = function1;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x027b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0280  */
    /* JADX WARN: Code duplicated, block: B:104:0x0284  */
    /* JADX WARN: Code duplicated, block: B:105:0x0287  */
    /* JADX WARN: Code duplicated, block: B:108:0x0292  */
    /* JADX WARN: Code duplicated, block: B:110:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:113:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:114:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:116:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:121:0x02db  */
    /* JADX WARN: Code duplicated, block: B:124:0x02fb  */
    /* JADX WARN: Code duplicated, block: B:125:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:128:0x0311  */
    /* JADX WARN: Code duplicated, block: B:129:0x0314  */
    /* JADX WARN: Code duplicated, block: B:79:0x0223  */
    /* JADX WARN: Code duplicated, block: B:81:0x0229  */
    /* JADX WARN: Code duplicated, block: B:86:0x0253 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:94:0x0268  */
    /* JADX WARN: Code duplicated, block: B:98:0x0275  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        k5i k5iVar;
        bby bbyVar;
        ArrayList arrayList;
        boolean z;
        String strA;
        String str;
        int iOrdinal;
        cue aueVar;
        cue bueVar;
        int i;
        double d;
        j0d j0dVar;
        long j;
        String string;
        String strL;
        String str2;
        String strA2;
        String strA3;
        double d2;
        byte b = this.f6473a;
        byte b2 = 24;
        byte b3 = 19;
        byte b4 = 22;
        byte b5 = 20;
        byte b6 = 10;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                a4x a4xVar = ((qpl) obj3).f29124a;
                hczVar.f(a4xVar.size(), null, new bzh(a4xVar, (byte) 15), new ugd(802480018, true, new vb(a4xVar, (Function1) obj2, (byte) 29)));
                return Unit.f46060a;
            case 1:
                List list = (List) obj3;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                hczVar2.f(list.size(), null, new bzh(list, (byte) 17), new ugd(2039820996, true, new iql((byte) 0, (mm40) obj2, list)));
                return Unit.f46060a;
            case 2:
                hcz hczVar3 = (hcz) obj;
                hczVar3.getClass();
                a4x a4xVar2 = ((zul) obj3).f45015a;
                hczVar3.f(a4xVar2.size(), null, new bzh(a4xVar2, (byte) 28), new ugd(802480018, true, new yul(a4xVar2, (Function1) obj2, (byte) 0)));
                return Unit.f46060a;
            case 3:
                cvl cvlVar = (cvl) obj3;
                pz40 pz40Var = (pz40) obj2;
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                cbi0.d(abi0Var, ((Boolean) pz40Var.getValue()).booleanValue());
                cbi0.b(abi0Var, ((Boolean) pz40Var.getValue()).booleanValue() ? cvlVar.b : new m0x(cvlVar.c.intValue(), null, 6));
                return Unit.f46060a;
            case 4:
                oyl oylVar = (oyl) obj3;
                ((View) obj).getClass();
                yz3 yz3Var = (yz3) oylVar.e;
                int iD = ((myl) ((xhe0) obj2)).d();
                if (iD >= 0 && iD < yz3Var.f.size()) {
                    List list2 = yz3Var.f;
                    list2.getClass();
                    ArrayList arrayList2 = new ArrayList(list2);
                    Object obj4 = arrayList2.get(iD);
                    obj4.getClass();
                    twl twlVar = (twl) obj4;
                    int iOrdinal2 = oylVar.h.ordinal();
                    if (iOrdinal2 == 0) {
                        int i2 = oylVar.i >= arrayList2.size() ? -1 : oylVar.i;
                        if (iD != i2) {
                            if (i2 != -1) {
                                Object obj5 = arrayList2.get(i2);
                                obj5.getClass();
                                arrayList2.set(i2, twl.e((twl) obj5, false));
                            }
                            arrayList2.set(iD, twl.e(twlVar, true));
                            oylVar.i = iD;
                            Object obj6 = arrayList2.get(iD);
                            obj6.getClass();
                            ((twl) obj6).g.invoke(Boolean.TRUE);
                        }
                    } else if (iOrdinal2 == 1) {
                        Object obj7 = arrayList2.get(iD);
                        obj7.getClass();
                        twl twlVar2 = (twl) obj7;
                        twl twlVarE = twl.e(twlVar2, !twlVar2.e);
                        arrayList2.set(iD, twlVarE);
                        twlVarE.g.invoke(Boolean.valueOf(twlVarE.e));
                    } else {
                        if (iOrdinal2 != 2) {
                            t9f.b();
                            return null;
                        }
                        Function2 function2 = oylVar.g;
                        if (function2 != null) {
                            function2.invoke(ibc.t0(twlVar), Integer.valueOf(iD));
                        }
                    }
                    Function2 function3 = oylVar.g;
                    if (function3 != null) {
                        function3.invoke(ibc.t0(twlVar), Integer.valueOf(iD));
                    }
                    oylVar.G(arrayList2);
                    edl edlVar = oylVar.f;
                    if (edlVar != null) {
                        edlVar.invoke(Integer.valueOf(iD));
                    }
                }
                return Unit.f46060a;
            case 5:
                grq grqVar = (grq) obj3;
                DsChip dsChip = (DsChip) obj;
                dsChip.getClass();
                Context context = dsChip.getContext();
                context.getClass();
                grqVar.getClass();
                Drawable drawable = context.getDrawable(R.drawable.ic_glyph_language_seconary);
                Context context2 = dsChip.getContext();
                context2.getClass();
                dsChip.setActionIcon(context2.getDrawable(R.drawable.ic_glyph_cancel));
                dsChip.f(grqVar.c, drawable, null);
                dsChip.setText(grqVar.b);
                dsChip.setIconTint(null);
                dsChip.setCount(null);
                dsChip.setValueText(null);
                dyb.O(dsChip, new cjl((Function0) obj2, (byte) 9));
                return Unit.f46060a;
            case 6:
                x3m x3mVar = (x3m) obj3;
                agk0 agk0Var = (agk0) obj2;
                float f = (int) (((qkx) obj).f28908a & 4294967295L);
                if (agk0Var.l() != f) {
                    agk0Var.m(f);
                }
                x3mVar.c.m(f);
                return Unit.f46060a;
            case 7:
                hcz hczVar4 = (hcz) obj;
                hczVar4.getClass();
                List list3 = (List) ((pz40) obj3).getValue();
                hczVar4.f(list3.size(), new ctl(new f4m(b6), list3, b6), new v2m(list3, (byte) 4), new ugd(2039820996, true, new c9m(list3, (ugd) obj2, (byte) 0)));
                return Unit.f46060a;
            case 8:
                jbm jbmVar = (jbm) obj3;
                hcz hczVar5 = (hcz) obj;
                hczVar5.getClass();
                a4x a4xVar3 = jbmVar.b;
                hczVar5.f(a4xVar3.size(), null, new ctl((Object) new xjl((byte) 25), (Object) a4xVar3, (byte) 11), new ugd(802480018, true, new c8(a4xVar3, (Function2) obj2, jbmVar, b5)));
                return Unit.f46060a;
            case 9:
                hcz hczVar6 = (hcz) obj;
                hczVar6.getClass();
                a4x a4xVar4 = ((nbm) ((pbm) obj3)).f23248a;
                hczVar6.f(a4xVar4.size(), new ctl((Object) new xjl((byte) 28), (Object) a4xVar4, (byte) 14), new wl0(a4xVar4, (byte) 29), new ugd(802480018, true, new ws1(a4xVar4, (Function1) obj2, (byte) 13)));
                return Unit.f46060a;
            case 10:
                return DsLottieEmpty.c((DsLottieEmpty) obj3, (Context) obj2, (TypedArray) obj);
            case 11:
                int i3 = DsLottieEmpty.t;
                ((View) obj).getClass();
                ((View.OnClickListener) obj3).onClick((DsButton) obj2);
                return Unit.f46060a;
            case 12:
                DsMenuCompactCell dsMenuCompactCell = (DsMenuCompactCell) obj;
                dsMenuCompactCell.getClass();
                dsMenuCompactCell.setOnClickListener(new wg(obj2, obj3, (byte) 16));
                return Unit.f46060a;
            case 13:
                DsMenuCompactCell dsMenuCompactCell2 = (DsMenuCompactCell) obj;
                dsMenuCompactCell2.getClass();
                dsMenuCompactCell2.setOnClickListener(new wg(obj2, obj3, (byte) 17));
                return Unit.f46060a;
            case 14:
                Boolean bool = (Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                int i4 = DsNavigationBar.l;
                ((DsNavigationBar) obj3).f(zBooleanValue);
                ((Function1) obj2).invoke(bool);
                return Unit.f46060a;
            case 15:
                DsNavigationBar dsNavigationBar = (DsNavigationBar) obj3;
                Function0 function0 = (Function0) obj2;
                int i5 = DsNavigationBar.l;
                ((View) obj).getClass();
                wf40 wf40Var = dsNavigationBar.d;
                if (wf40Var.k.getVisibility() == 0) {
                    DsSearchField dsSearchField = wf40Var.k;
                    dsSearchField.getEditText().clearFocus();
                    TextInputEditText editText = dsSearchField.getEditText();
                    editText.getClass();
                    editText.setText("");
                    dsSearchField.setVisibility(8);
                    dsSearchField.c();
                    View view = wf40Var.g;
                    boolean z2 = view != null;
                    if (view != null) {
                        view.setVisibility(z2 ? 0 : 8);
                    }
                    int iOrdinal3 = wf40Var.b.ordinal();
                    if (iOrdinal3 == 0) {
                        wf40Var.h.setVisibility(z2 ? 8 : 0);
                    } else if (iOrdinal3 == 1) {
                        wf40Var.i.setVisibility(z2 ? 8 : 0);
                    } else {
                        if (iOrdinal3 != 2) {
                            t9f.b();
                            return null;
                        }
                        wf40Var.j.setVisibility(z2 ? 8 : 0);
                    }
                    dsNavigationBar.c.a();
                    dsNavigationBar.k.invoke();
                    wf40Var.setOnSearchViewExpandedStateChangedListener(new k0l(1, dsNavigationBar, DsNavigationBar.class, "onSearchViewExpandedStateChanged", "onSearchViewExpandedStateChanged(Z)V", 0, (byte) 22));
                } else {
                    function0.invoke();
                }
                return Unit.f46060a;
            case 16:
                vc50 vc50Var = (vc50) obj3;
                Function1 function1 = (Function1) obj2;
                DsNavigationBarBasic dsNavigationBarBasic = (DsNavigationBarBasic) obj;
                dsNavigationBarBasic.getClass();
                vc50Var.getClass();
                boolean z3 = vc50Var instanceof tc50;
                if (!z3) {
                    if (vc50Var instanceof uc50) {
                        k5iVar = k5i.b;
                    } else {
                        t9f.b();
                    }
                    return null;
                }
                k5iVar = k5i.c;
                dsNavigationBarBasic.setBasicNavigationBarStyle(k5iVar);
                dsNavigationBarBasic.setTitle(vc50Var.getTitle());
                dsNavigationBarBasic.setNavigationBarButtons(vc50Var.a());
                dsNavigationBarBasic.setTitleIconVisible(vc50Var.c());
                boolean zB = vc50Var.b();
                s96 s96Var = dsNavigationBarBasic.b;
                if (s96Var != null) {
                    s96Var.a(zB);
                }
                for (ec50 ec50Var : vc50Var.d()) {
                    if (Intrinsics.d(ec50Var, bc50.f2337a)) {
                        s96 s96Var2 = dsNavigationBarBasic.b;
                        if (s96Var2 != null) {
                            s96Var2.e();
                        }
                    } else if (Intrinsics.d(ec50Var, cc50.f4092a)) {
                        ypm ypmVar = ypm.c;
                        s96 s96Var3 = dsNavigationBarBasic.b;
                        if (s96Var3 != null) {
                            s96Var3.g(ypmVar);
                        }
                    } else {
                        if (!Intrinsics.d(ec50Var, dc50.f5835a)) {
                            t9f.b();
                            return null;
                        }
                        ypm ypmVar2 = ypm.b;
                        s96 s96Var4 = dsNavigationBarBasic.b;
                        if (s96Var4 != null) {
                            s96Var4.g(ypmVar2);
                        }
                    }
                }
                if (z3) {
                    dsNavigationBarBasic.setSubTitle(((tc50) vc50Var).e);
                } else if (!(vc50Var instanceof uc50)) {
                    t9f.b();
                    return null;
                }
                dsNavigationBarBasic.b(new p3l(function1, (byte) 24));
                dsNavigationBarBasic.setOnTitlesClickListener(new p3l(function1, (byte) 25));
                return Unit.f46060a;
            case 17:
                Function1 function4 = (Function1) obj2;
                lla llaVar = (lla) obj3;
                u3i u3iVar = (u3i) obj;
                u3iVar.getClass();
                if (u3iVar instanceof s3i) {
                    function4.invoke(new xdm(llaVar.a(), false, (s3i) u3iVar));
                } else if (u3iVar instanceof v3i) {
                    function4.invoke(new ydm(llaVar.a(), false, (v3i) u3iVar));
                } else if (u3iVar instanceof x3i) {
                    function4.invoke(new zdm(llaVar.a(), false, (x3i) u3iVar));
                } else if (u3iVar instanceof z3i) {
                    function4.invoke(new aem(llaVar.a(), false, (z3i) u3iVar));
                }
                return Unit.f46060a;
            case 18:
                final ipm ipmVar = (ipm) obj2;
                pi9 pi9Var = (pi9) obj;
                pi9Var.getClass();
                pi9Var.f27033a.d();
                float fW0 = pi9Var.w0(((zcl) obj3).f44172a);
                zcl zclVar = qmk.f28987a;
                final float density = pi9Var.getDensity() * 1.0f;
                final float f2 = density / 2.0f;
                final long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fW0)) << 32) | (((long) Float.floatToRawIntBits(fW0)) & 4294967295L);
                float f3 = fW0 - f2;
                float f4 = f3 >= 0.0f ? f3 : 0.0f;
                final long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f4)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
                return pi9Var.a(new Function1() { // from class: a.fpm
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj8) {
                        fhl fhlVar = (fhl) obj8;
                        fhlVar.getClass();
                        ipm ipmVar2 = ipmVar;
                        if (ipmVar2 instanceof hpm) {
                            fhl.o0(fhlVar, ((hpm) ipmVar2).b, 0L, 0L, jFloatToRawIntBits, null, 246);
                        }
                        long jA = ipmVar2.a();
                        float f5 = f2;
                        long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(f5)) << 32) | (((long) Float.floatToRawIntBits(f5)) & 4294967295L);
                        float fIntBitsToFloat = Float.intBitsToFloat((int) (fhlVar.d() >> 32));
                        float f6 = density;
                        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fhlVar.d() & 4294967295L)) - f6;
                        long jFloatToRawIntBits4 = Float.floatToRawIntBits(fIntBitsToFloat - f6);
                        fhl.o0(fhlVar, jA, jFloatToRawIntBits3, (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (jFloatToRawIntBits4 << 32), jFloatToRawIntBits2, new vtm0(f6, 0.0f, 0, 0, null, 30), 224);
                        return Unit.f46060a;
                    }
                });
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                omv omvVar = (omv) obj3;
                pz40 pz40Var2 = (pz40) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                boolean z4 = fFloatValue <= 0.0f || fFloatValue >= 100.0f;
                if (z4 && !((Boolean) pz40Var2.getValue()).booleanValue()) {
                    ckb.a0(omvVar, 0);
                }
                pz40Var2.setValue(Boolean.valueOf(z4));
                return Unit.f46060a;
            case 20:
                d280 d280Var = (d280) obj3;
                pz40 pz40Var3 = (pz40) obj2;
                abi0 abi0Var2 = (abi0) obj;
                abi0Var2.getClass();
                cbi0.d(abi0Var2, ((Boolean) pz40Var3.getValue()).booleanValue());
                cbi0.b(abi0Var2, ((Boolean) pz40Var3.getValue()).booleanValue() ? new n0x(((c280) d280Var).f3613a) : new m0x(((c280) d280Var).b, null, 6));
                return Unit.f46060a;
            case 21:
                Function1 function5 = (Function1) obj2;
                Boolean bool2 = (Boolean) obj;
                ckb.a0((omv) obj3, bool2.booleanValue() ? (byte) 21 : (byte) 22);
                function5.invoke(bool2);
                return Unit.f46060a;
            case 22:
                l7m0 l7m0Var = (l7m0) obj2;
                ou90 ou90Var = (ou90) obj;
                ou90Var.getClass();
                ou90Var.m((pu90) obj3, (int) (((ikx) l7m0Var.getValue()).f14950a >> 32), (int) (((ikx) l7m0Var.getValue()).f14950a & 4294967295L), 0.0f);
                return Unit.f46060a;
            case 23:
                Function0 function6 = (Function0) obj2;
                int i6 = DsTextField.m1;
                ((View) obj).getClass();
                if (((z4i) obj3).getVisibility() == 0 && function6 != null) {
                    function6.invoke();
                }
                return Unit.f46060a;
            case 24:
                ArrayList arrayList3 = (ArrayList) obj2;
                ou90 ou90Var2 = (ou90) obj;
                ou90Var2.getClass();
                int i7 = 0;
                for (Object obj8 : (List) obj3) {
                    int i8 = i7 + 1;
                    if (i7 < 0) {
                        q3d.p();
                        throw null;
                    }
                    ou90.v(ou90Var2, (pu90) obj8, ((ikx) arrayList3.get(i7)).f14950a);
                    i7 = i8;
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                l7m0 l7m0Var2 = (l7m0) obj3;
                hcz hczVar7 = (hcz) obj;
                nek nekVar = vbn.n2;
                hczVar7.getClass();
                a4x a4xVar5 = ((zbn) l7m0Var2.getValue()).b;
                hczVar7.f(a4xVar5.size(), new ctl(new f4m(b5), a4xVar5, b3), new ubn(a4xVar5, (byte) 0), new ugd(2039820996, true, new c8((List) a4xVar5, obj2, (Object) l7m0Var2, (byte) 23)));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                uzq uzqVar = (uzq) obj3;
                int iIntValue = ((Integer) obj).intValue();
                iiy[] iiyVarArr = whn.O1;
                uzqVar.c.setVisibility(8);
                EasternNightsCellGameView easternNightsCellGameView = uzqVar.b;
                easternNightsCellGameView.v(false);
                easternNightsCellGameView.s.setEnabled(false);
                kin kinVarH0 = ((whn) obj2).H0();
                if (kinVarH0.d.a() && ((bbyVar = kinVarH0.u) == null || !bbyVar.isActive())) {
                    kinVarH0.u = sac.V(jiu0.a(kinVarH0), new hin(1, kinVarH0, kin.class, "handleGameError", "handleGameError(Ljava/lang/Throwable;)V", 0, (byte) 1), null, kinVarH0.f.b, new gc1((Object) kinVarH0, iIntValue, (yje) null, (byte) 5), 10);
                }
                return Boolean.TRUE;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                bmn bmnVar = (bmn) obj3;
                hcz hczVar8 = (hcz) obj;
                hczVar8.getClass();
                a4x a4xVar6 = bmnVar.f2843a;
                hczVar8.f(a4xVar6.size(), new ctl(new f4m(b4), a4xVar6, b5), new v2m(a4xVar6, (byte) 19), new ugd(2039820996, true, new c8(a4xVar6, (Function1) obj2, bmnVar, b2)));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                d2j d2jVar = (d2j) obj3;
                inn innVar = (inn) obj2;
                amn amnVar = (amn) obj;
                amnVar.getClass();
                ctf0 ctf0Var = d2jVar.b;
                int i9 = innVar.d;
                xte xteVar = innVar.e;
                rse rseVar = innVar.f;
                boolean zBooleanValue2 = ((Boolean) ((fee) d2jVar.e.getValue()).c()).booleanValue();
                ctf0Var.getClass();
                if (amnVar.equals(yln.f42852a)) {
                    return emn.f8055a;
                }
                if (amnVar instanceof zln) {
                    return fmn.f9792a;
                }
                if (amnVar instanceof wln) {
                    xuz xuzVar = pb10.c;
                    pb10 pb10Var = pb10.f;
                    xuzVar.getClass();
                    return new cmn(new mdm(xuz.a(pb10Var, i9), null, null, 0, 0, R.string.empty_edit_coupon_description, 0, 0, 0L, 0L, 734));
                }
                if (amnVar instanceof xln) {
                    xuz xuzVar2 = pb10.c;
                    pb10 pb10Var2 = pb10.g;
                    xuzVar2.getClass();
                    return new dmn(new mdm(xuz.a(pb10Var2, i9), null, null, 0, 0, R.string.data_retrieval_error, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE));
                }
                if (!(amnVar instanceof vln)) {
                    t9f.b();
                    return null;
                }
                List list4 = ((vln) amnVar).f37633a;
                ArrayList arrayList4 = new ArrayList(r3d.q(list4, 10));
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    pln plnVar = (pln) it.next();
                    plnVar.getClass();
                    long j2 = plnVar.c;
                    rdj rdjVar = rdj.f30294a;
                    lsm0 lsm0Var = ctf0Var.b;
                    boolean zH = ctf0Var.h();
                    rse rseVar2 = rseVar;
                    long j3 = plnVar.p;
                    String str3 = plnVar.r;
                    String str4 = plnVar.q;
                    boolean z5 = plnVar.o;
                    Iterator it2 = it;
                    boolean z6 = plnVar.x;
                    boolean z7 = plnVar.h;
                    gho ghoVar = plnVar.A;
                    String strL2 = plnVar.i;
                    String strG = rdj.g(new znq0(j3), efj.UNIVERSAL, Boolean.valueOf(zH), false, 56);
                    String str5 = plnVar.w;
                    String str6 = plnVar.u;
                    String strE = vcc.E(str5, str6, ctf0Var);
                    String str7 = plnVar.k;
                    boolean z8 = plnVar.z;
                    if (z8) {
                        arrayList = arrayList4;
                        z = z8;
                        strA = lsm0Var.a(R.string.completed, Arrays.copyOf(new Object[0], 0));
                    } else {
                        arrayList = arrayList4;
                        z = z8;
                        if (z7) {
                            strA = lsm0Var.a(R.string.locked_coupon, Arrays.copyOf(new Object[0], 0));
                        } else if (z6) {
                            strA = lsm0Var.a(R.string.only_for_single_coupon_type_allowed, Arrays.copyOf(new Object[0], 0));
                        } else {
                            strA = z5 ? lsm0Var.a(R.string.dependent_coupon, Arrays.copyOf(new Object[0], 0)) : lsm0Var.a(R.string.empty_str, Arrays.copyOf(new Object[0], 0));
                        }
                    }
                    String str8 = strA;
                    int i10 = z ? R.attr.uikitSecondary : R.attr.uikitStaticRed;
                    String strO = xbc.O(str4, str3, "", zBooleanValue2, "");
                    String strE2 = vcc.E(str5, str6, ctf0Var);
                    xte xteVar2 = xte.COEF_WITH_BIG_ACCENT_TEAM;
                    boolean z9 = xteVar == xteVar2;
                    String str9 = (xteVar == xte.COMPACT_ACCENT_MARKET || xteVar == xte.BIG_TEAM_LOGO_ACCENT_TEAM) && plnVar.g ? "Live, " : null;
                    if (str9 == null) {
                        str9 = "";
                    }
                    boolean z10 = zBooleanValue2;
                    String strConcat = Separators.SP.concat(strE2);
                    if (!z9) {
                        strConcat = null;
                    }
                    if (strConcat == null) {
                        strConcat = "";
                    }
                    String strL3 = kng0.l(str9, strG, strConcat);
                    String str10 = plnVar.y;
                    boolean z11 = plnVar.g;
                    int iOrdinal4 = xteVar.ordinal();
                    String str11 = iOrdinal4 != 0 ? iOrdinal4 != 4 ? strE : strL2 : "";
                    int iOrdinal5 = xteVar.ordinal();
                    if (iOrdinal5 != 3) {
                        if (iOrdinal5 == 4) {
                            str = strE;
                        }
                        String str12 = plnVar.n;
                        iOrdinal = xteVar.ordinal();
                        if (iOrdinal != 3 || iOrdinal == 4) {
                            if (str4.length() > 0 || str3.length() <= 0) {
                                aueVar = new aue(str4);
                            } else {
                                bueVar = new bue(str4, str3, vcc.Q(xteVar, vcc.U(plnVar.s)), vcc.Q(xteVar, vcc.U(plnVar.t)));
                            }
                            if (!z || z7) {
                                i = R.style.Widget_DSMarket_Coupon_Blocked;
                            } else if (z6) {
                                i = R.style.Widget_DSMarket_Coupon_Unavailable;
                            } else {
                                i = z5 ? R.style.Widget_DSMarket_Coupon_Dependent : R.style.Widget_DSMarket_Coupon_Default;
                            }
                            int i11 = i;
                            d = plnVar.m;
                            if (d == 0.0d) {
                                j0dVar = j0d.f15678a;
                            } else {
                                d2 = plnVar.l;
                                if (d2 == d) {
                                    j0dVar = j0d.f15678a;
                                } else if (d > d2) {
                                    j0dVar = j0d.c;
                                } else {
                                    j0dVar = j0d.b;
                                }
                            }
                            j0d j0dVar2 = j0dVar;
                            j = plnVar.j;
                            if (j != 0) {
                                bzu bzuVarD = rz4.d("static", "svg", "sports_v2");
                                rz4.s(j, ".svg", bzuVarD);
                                string = ((StringBuilder) bzuVarD.b).toString();
                            } else {
                                string = "";
                            }
                            String strA4 = lsm0Var.a(R.string.seka_state_live, Arrays.copyOf(new Object[0], 0));
                            if (ghoVar != gho.b) {
                                str2 = "";
                            } else {
                                if (xteVar != xteVar2 || xteVar == xte.BIG_TEAM_LOGO_ACCENT_TEAM) {
                                    strL = kng0.l(lsm0Var.a(R.string.auto_sub_bet_protect_label, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)));
                                } else {
                                    strL = lsm0Var.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0));
                                }
                                str2 = strL;
                            }
                            if (ghoVar != gho.c) {
                                strA2 = "";
                            } else {
                                strA2 = lsm0Var.a(R.string.option_bet_label, Arrays.copyOf(new Object[0], 0));
                            }
                            if (ghoVar != gho.d) {
                                strA3 = "";
                            } else {
                                strA3 = lsm0Var.a(R.string.each_way, Arrays.copyOf(new Object[0], 0));
                            }
                            ArrayList arrayList5 = arrayList;
                            arrayList5.add(new qln(j2, xteVar, rseVar2, new fue(str7, str8, i10, strO, strL3, str10, z11, str11, str, str12, wse.f39686a, bueVar, i11, j0dVar2, string, strA4, str2, strA2, strA3), z10));
                            it = it2;
                            arrayList4 = arrayList5;
                            rseVar = rseVar2;
                            zBooleanValue2 = z10;
                        } else {
                            aueVar = zte.f44954a;
                        }
                        bueVar = aueVar;
                        if (z) {
                            i = R.style.Widget_DSMarket_Coupon_Blocked;
                        } else {
                            i = R.style.Widget_DSMarket_Coupon_Blocked;
                        }
                        int i12 = i;
                        d = plnVar.m;
                        if (d == 0.0d) {
                            j0dVar = j0d.f15678a;
                        } else {
                            d2 = plnVar.l;
                            if (d2 == d) {
                                j0dVar = j0d.f15678a;
                            } else if (d > d2) {
                                j0dVar = j0d.c;
                            } else {
                                j0dVar = j0d.b;
                            }
                        }
                        j0d j0dVar3 = j0dVar;
                        j = plnVar.j;
                        if (j != 0) {
                            bzu bzuVarD2 = rz4.d("static", "svg", "sports_v2");
                            rz4.s(j, ".svg", bzuVarD2);
                            string = ((StringBuilder) bzuVarD2.b).toString();
                        } else {
                            string = "";
                        }
                        String strA5 = lsm0Var.a(R.string.seka_state_live, Arrays.copyOf(new Object[0], 0));
                        if (ghoVar != gho.b) {
                            str2 = "";
                        } else {
                            if (xteVar != xteVar2) {
                                strL = kng0.l(lsm0Var.a(R.string.auto_sub_bet_protect_label, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)));
                            } else {
                                strL = kng0.l(lsm0Var.a(R.string.auto_sub_bet_protect_label, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)));
                            }
                            str2 = strL;
                        }
                        if (ghoVar != gho.c) {
                            strA2 = "";
                        } else {
                            strA2 = lsm0Var.a(R.string.option_bet_label, Arrays.copyOf(new Object[0], 0));
                        }
                        if (ghoVar != gho.d) {
                            strA3 = "";
                        } else {
                            strA3 = lsm0Var.a(R.string.each_way, Arrays.copyOf(new Object[0], 0));
                        }
                        ArrayList arrayList6 = arrayList;
                        arrayList6.add(new qln(j2, xteVar, rseVar2, new fue(str7, str8, i10, strO, strL3, str10, z11, str11, str, str12, wse.f39686a, bueVar, i12, j0dVar3, string, strA5, str2, strA2, strA3), z10));
                        it = it2;
                        arrayList4 = arrayList6;
                        rseVar = rseVar2;
                        zBooleanValue2 = z10;
                    } else {
                        strL2 = kng0.l(strE, ", ", strL2);
                    }
                    str = strL2;
                    String str13 = plnVar.n;
                    iOrdinal = xteVar.ordinal();
                    if (iOrdinal != 3) {
                        if (str4.length() > 0) {
                        }
                        aueVar = new aue(str4);
                        bueVar = aueVar;
                    } else {
                        if (str4.length() > 0) {
                        }
                        aueVar = new aue(str4);
                        bueVar = aueVar;
                    }
                    if (z) {
                        i = R.style.Widget_DSMarket_Coupon_Blocked;
                    } else {
                        i = R.style.Widget_DSMarket_Coupon_Blocked;
                    }
                    int i13 = i;
                    d = plnVar.m;
                    if (d == 0.0d) {
                        j0dVar = j0d.f15678a;
                    } else {
                        d2 = plnVar.l;
                        if (d2 == d) {
                            j0dVar = j0d.f15678a;
                        } else if (d > d2) {
                            j0dVar = j0d.c;
                        } else {
                            j0dVar = j0d.b;
                        }
                    }
                    j0d j0dVar4 = j0dVar;
                    j = plnVar.j;
                    if (j != 0) {
                        bzu bzuVarD3 = rz4.d("static", "svg", "sports_v2");
                        rz4.s(j, ".svg", bzuVarD3);
                        string = ((StringBuilder) bzuVarD3.b).toString();
                    } else {
                        string = "";
                    }
                    String strA6 = lsm0Var.a(R.string.seka_state_live, Arrays.copyOf(new Object[0], 0));
                    if (ghoVar != gho.b) {
                        str2 = "";
                    } else {
                        if (xteVar != xteVar2) {
                            strL = kng0.l(lsm0Var.a(R.string.auto_sub_bet_protect_label, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)));
                        } else {
                            strL = kng0.l(lsm0Var.a(R.string.auto_sub_bet_protect_label, Arrays.copyOf(new Object[0], 0)), Separators.SP, lsm0Var.a(R.string.auto_sub_label, Arrays.copyOf(new Object[0], 0)));
                        }
                        str2 = strL;
                    }
                    if (ghoVar != gho.c) {
                        strA2 = "";
                    } else {
                        strA2 = lsm0Var.a(R.string.option_bet_label, Arrays.copyOf(new Object[0], 0));
                    }
                    if (ghoVar != gho.d) {
                        strA3 = "";
                    } else {
                        strA3 = lsm0Var.a(R.string.each_way, Arrays.copyOf(new Object[0], 0));
                    }
                    ArrayList arrayList7 = arrayList;
                    arrayList7.add(new qln(j2, xteVar, rseVar2, new fue(str7, str8, i10, strO, strL3, str10, z11, str11, str, str13, wse.f39686a, bueVar, i13, j0dVar4, string, strA6, str2, strA2, strA3), z10));
                    it = it2;
                    arrayList4 = arrayList7;
                    rseVar = rseVar2;
                    zBooleanValue2 = z10;
                }
                return new bmn(dyb.o0(arrayList4));
            default:
                int i14 = EnteringPinCode.u;
                ((View) obj).getClass();
                ((PicCodeEditField) ((EnteringPinCode) obj3).q.d).b(String.valueOf(((PinCodeSymbolButton) obj2).getNumberValue()));
                return Unit.f46060a;
        }
    }

    public /* synthetic */ dpl(Object obj, Object obj2, byte b) {
        this.f6473a = b;
        this.b = obj;
        this.c = obj2;
    }
}
