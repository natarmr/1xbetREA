package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xplatform.uikit.components.cells.DsMenuCell;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class rpa0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30877a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ rpa0(Function1 function1, byte b) {
        this.f30877a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30877a;
        byte b2 = 11;
        byte b3 = 5;
        int i = 0;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                long jLongValue = ((Long) obj).longValue();
                xpa0.b.getClass();
                xpa0 xpa0Var = (xpa0) xpa0.c.get(Integer.valueOf((int) jLongValue));
                if (xpa0Var == null) {
                    xpa0Var = xpa0.NONE;
                }
                function1.invoke(new g3f0(xpa0Var));
                return Unit.f46060a;
            case 1:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                if (Intrinsics.d(jtlVar, rk.y)) {
                    function1.invoke(qqa0.f29157a);
                } else if (Intrinsics.d(jtlVar, rk.x)) {
                    function1.invoke(eqa0.f8229a);
                }
                return Unit.f46060a;
            case 2:
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                function1.invoke(hczVar);
                return Unit.f46060a;
            case 3:
                xgl0 xgl0Var = (xgl0) obj;
                xgl0Var.getClass();
                function1.invoke(new vra0(xgl0Var));
                return Unit.f46060a;
            case 4:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 1) {
                    function1.invoke(xra0.f41360a);
                } else if (iIntValue == 2) {
                    function1.invoke(wra0.f39631a);
                }
                return Unit.f46060a;
            case 5:
                function1.invoke(new ura0(((Boolean) obj).booleanValue()));
                return Unit.f46060a;
            case 6:
                wgl0 wgl0Var = (wgl0) obj;
                wgl0Var.getClass();
                if (wgl0Var instanceof vgl0) {
                    function1.invoke(new tra0(((vgl0) wgl0Var).f37387a));
                }
                return Unit.f46060a;
            case 7:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                DsMenuCell dsMenuCell = ((dux) cpVar.u).f6717a;
                dsMenuCell.getClass();
                dyb.O(dsMenuCell, new o7x(function1, cpVar, (byte) 5));
                cpVar.t(new ui80(cpVar, (byte) 9));
                return Unit.f46060a;
            case 8:
                kim kimVar = (kim) obj;
                kimVar.getClass();
                if (kimVar instanceof eim) {
                    function1.invoke(cqa0.f4784a);
                } else if (kimVar instanceof fim) {
                    int i2 = ((fim) kimVar).f9595a;
                    if (i2 == 0) {
                        function1.invoke(gqa0.f11723a);
                    } else if (i2 == 3) {
                        function1.invoke(fqa0.f9965a);
                    } else if (i2 == 4) {
                        function1.invoke(hqa0.f13476a);
                    }
                } else if (kimVar instanceof iim) {
                    function1.invoke(new kqa0(((iim) kimVar).f14835a));
                }
                return Unit.f46060a;
            case 9:
                chq0 chq0Var = (chq0) obj;
                chq0Var.getClass();
                function1.invoke(new iqa0(chq0Var));
                return Unit.f46060a;
            case 10:
                wlm wlmVar = (wlm) obj;
                wlmVar.getClass();
                if (Intrinsics.d(wlmVar, ulm.f35879a)) {
                    function1.invoke(sxa0.f32967a);
                } else {
                    if (!Intrinsics.d(wlmVar, vlm.f37631a)) {
                        t9f.b();
                        return null;
                    }
                    function1.invoke(fya0.f10350a);
                }
                return Unit.f46060a;
            case 11:
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                float fM = f7k.M(-2);
                float fM2 = f7k.M(6);
                function1.invoke(new lxa0(new wkb0(uzb.E0(j6zVar, fM2, fM, fM2, fM, 360))));
                return Unit.f46060a;
            case 12:
                cvl cvlVar = (cvl) obj;
                cvlVar.getClass();
                fxb.D(ivb0.b, new xul(function1, cvlVar, (byte) 1)).a();
                return Unit.f46060a;
            case 13:
                fxb.D(ivb0.b, new i11((byte) 11, ((Long) obj).longValue(), function1)).a();
                return Unit.f46060a;
            case 14:
                jtl jtlVar2 = (jtl) obj;
                jtlVar2.getClass();
                if (Intrinsics.d(jtlVar2, sh00.k)) {
                    function1.invoke(cob0.f4692a);
                }
                return Unit.f46060a;
            case 15:
                function1.invoke(new eu30(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 16:
                nd50 nd50Var = (nd50) obj;
                nd50Var.getClass();
                function1.invoke(new r0c0(nd50Var));
                return Unit.f46060a;
            case 17:
                ((jtl) obj).getClass();
                function1.invoke(i0c0.f13943a);
                return Unit.f46060a;
            case 18:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                ((j2k) cpVar2.u).b.setOnItemClickListener(new ru80(function1, b3));
                cpVar2.t(new ctv(cpVar2, cpVar2, b2));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new l420(str));
                return Unit.f46060a;
            case 20:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new l420(str2));
                return Unit.f46060a;
            case 21:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new g9c0(str3));
                return Unit.f46060a;
            case 22:
                function1.invoke(new tdc0(((Long) obj).longValue()));
                return Unit.f46060a;
            case 23:
                function1.invoke(new rgc0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 24:
                if (((Integer) obj).intValue() == 0) {
                    function1.invoke(qgc0.f28678a);
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                DsMenuCell dsMenuCell2 = ((xtx) cpVar3.u).f41485a;
                dsMenuCell2.getClass();
                dyb.O(dsMenuCell2, new o7x(function1, cpVar3, (byte) 6));
                cpVar3.t(new ui80(cpVar3, (byte) 14));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                String str4 = (String) obj;
                str4.getClass();
                StringBuilder sb = new StringBuilder();
                int length = str4.length();
                while (i < length) {
                    char cCharAt = str4.charAt(i);
                    if (StringsKt.P("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", cCharAt)) {
                        sb.append(cCharAt);
                    }
                    i++;
                }
                function1.invoke(sb.toString());
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                String str5 = (String) obj;
                str5.getClass();
                StringBuilder sb2 = new StringBuilder();
                int length2 = str5.length();
                while (i < length2) {
                    char cCharAt2 = str5.charAt(i);
                    if (StringsKt.P("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", cCharAt2)) {
                        sb2.append(cCharAt2);
                    }
                    i++;
                }
                function1.invoke(sb2.toString());
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                String str6 = (String) obj;
                str6.getClass();
                StringBuilder sb3 = new StringBuilder();
                int length3 = str6.length();
                while (i < length3) {
                    char cCharAt3 = str6.charAt(i);
                    if (StringsKt.P("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789", cCharAt3)) {
                        sb3.append(cCharAt3);
                    }
                    i++;
                }
                function1.invoke(sb3.toString());
                return Unit.f46060a;
            default:
                function1.invoke(new nrd0(((Long) obj).longValue()));
                return Unit.f46060a;
        }
    }
}
