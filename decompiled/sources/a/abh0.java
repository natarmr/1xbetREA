package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.uikit.components.buttons.DsButton;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class abh0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f580a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ abh0(Function1 function1, kd30 kd30Var) {
        this.f580a = (byte) 24;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f580a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new yyt0(((Long) obj).longValue()));
                return Unit.f46060a;
            case 1:
                function1.invoke(new seh0(((Long) obj).longValue()));
                return Unit.f46060a;
            case 2:
                ((jly) obj).getClass();
                function1.invoke(hkh0.f13209a);
                return Unit.f46060a;
            case 3:
                ((jtl) obj).getClass();
                function1.invoke(jkh0.f16668a);
                return Unit.f46060a;
            case 4:
                int iIntValue = ((Integer) obj).intValue();
                lme0 lme0Var = xph0.Q1;
                function1.invoke(new rph0(iIntValue));
                return Unit.f46060a;
            case 5:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                if (Intrinsics.d(jtlVar, rk.k)) {
                    function1.invoke(bec.f2442a);
                }
                return Unit.f46060a;
            case 6:
                ((Integer) obj).intValue();
                function1.invoke(hec.f12916a);
                return Unit.f46060a;
            case 7:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new gec(str));
                return Unit.f46060a;
            case 8:
                jtl jtlVar2 = (jtl) obj;
                jtlVar2.getClass();
                if (Intrinsics.d(jtlVar2, o7i0.f24788a)) {
                    function1.invoke(k7i0.f17822a);
                } else if (Intrinsics.d(jtlVar2, n7i0.f23043a)) {
                    function1.invoke(j7i0.f16042a);
                }
                return Unit.f46060a;
            case 9:
                ((jtl) obj).getClass();
                function1.invoke(j8i0.f16086a);
                return Unit.f46060a;
            case 10:
                ((jtl) obj).getClass();
                function1.invoke(ali0.f1069a);
                return Unit.f46060a;
            case 11:
                ne60 ne60Var = (ne60) obj;
                if (function1 != null) {
                    function1.invoke(new avi0(ne60Var.f23370a));
                }
                return Unit.f46060a;
            case 12:
                ((Integer) obj).intValue();
                function1.invoke(a0j0.f27a);
                return Unit.f46060a;
            case 13:
                DsButton dsButton = (DsButton) obj;
                dsButton.getClass();
                dyb.O(dsButton, new abh0(function1, (byte) 14));
                return Unit.f46060a;
            case 14:
                ((View) obj).getClass();
                function1.invoke(Boolean.TRUE);
                return Unit.f46060a;
            case 15:
                a8q0 a8q0Var = (a8q0) obj;
                a8q0Var.getClass();
                function1.invoke(new u420(a8q0Var));
                return Unit.f46060a;
            case 16:
                a8q0 a8q0Var2 = (a8q0) obj;
                a8q0Var2.getClass();
                function1.invoke(new u420(a8q0Var2));
                return Unit.f46060a;
            case 17:
                ynd0 ynd0Var = (ynd0) obj;
                ynd0Var.getClass();
                function1.invoke(new d520(ynd0Var));
                return Unit.f46060a;
            case 18:
                yi5 yi5Var = (yi5) obj;
                yi5Var.getClass();
                function1.invoke(new t1k0(yi5Var));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                ctp0 ctp0Var = (ctp0) obj;
                ctp0Var.getClass();
                function1.invoke(new u4k0(ctp0Var));
                return Unit.f46060a;
            case 20:
                kim kimVar = (kim) obj;
                kimVar.getClass();
                if (kimVar instanceof iim) {
                    function1.invoke(new m62(((iim) kimVar).f14835a));
                } else if (kimVar.equals(eim.f7867a)) {
                    function1.invoke(e62.f7260a);
                } else if (kimVar.equals(gim.f11355a)) {
                    function1.invoke(k62.f17746a);
                } else if (kimVar instanceof fim) {
                    int i = ((fim) kimVar).f9595a;
                    if (i == 1) {
                        function1.invoke(h62.f12509a);
                    } else if (i == 2) {
                        function1.invoke(o62.f24712a);
                    }
                }
                return Unit.f46060a;
            case 21:
                jtl jtlVar3 = (jtl) obj;
                jtlVar3.getClass();
                function1.invoke(new f62(jtlVar3));
                return Unit.f46060a;
            case 22:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    String str2 = ((w5q0) x5q0Var).f38596a;
                    StringBuilder sb = new StringBuilder();
                    int length = str2.length();
                    for (int i2 = 0; i2 < length; i2++) {
                        char cCharAt = str2.charAt(i2);
                        if (Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    function1.invoke(new nck0(sb.toString()));
                }
                return Unit.f46060a;
            case 23:
                rfk0 rfk0Var = (rfk0) function1.invoke((wfk0) obj);
                synchronized (xfk0.c) {
                    xfk0.d = xfk0.d.g(rfk0Var.g());
                }
                return rfk0Var;
            case 24:
                ghk0 ghk0Var = (ghk0) obj;
                ghk0Var.getClass();
                String strA = i7t0.a(ghk0Var.e);
                String strA2 = i7t0.a(ghk0Var.f);
                int i3 = ghk0Var.f11305a;
                String str3 = ghk0Var.b;
                String str4 = ghk0Var.c;
                String str5 = ghk0Var.d;
                String str6 = ghk0Var.g;
                String str7 = ghk0Var.h;
                str3.getClass();
                str4.getClass();
                str5.getClass();
                str6.getClass();
                str7.getClass();
                function1.invoke(new ghk0(i3, str3, str4, str5, strA, strA2, str6, str7));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                ((mvl) obj).getClass();
                function1.invoke(new blk0(uzb0.f36529a));
                function1.invoke(alk0.f1073a);
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((mvl) obj).getClass();
                function1.invoke(new blk0(uzb0.f36529a));
                function1.invoke(alk0.f1073a);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((mvl) obj).getClass();
                function1.invoke(new blk0(uzb0.b));
                function1.invoke(alk0.f1073a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((mvl) obj).getClass();
                function1.invoke(new blk0(uzb0.b));
                function1.invoke(alk0.f1073a);
                return Unit.f46060a;
            default:
                ((mvl) obj).getClass();
                function1.invoke(new blk0(uzb0.c));
                function1.invoke(alk0.f1073a);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ abh0(Function1 function1, byte b) {
        this.f580a = b;
        this.b = function1;
    }
}
