package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xplatform.uikit.components.cells.DsSettingsCell;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class coo0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4712a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ coo0(Function1 function1, byte b) {
        this.f4712a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2;
        byte b = this.f4712a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                dfm0 dfm0Var = (dfm0) obj;
                dfm0Var.getClass();
                if (dfm0Var instanceof gqw) {
                    function1.invoke(new wpw((gqw) dfm0Var));
                }
                return Unit.f46060a;
            case 1:
                n6n n6nVar = (n6n) obj;
                n6nVar.getClass();
                if (n6nVar instanceof k6n) {
                    obj2 = eyo0.f8636a;
                } else if (n6nVar instanceof m6n) {
                    obj2 = gyo0.f12140a;
                } else {
                    if (!(n6nVar instanceof l6n)) {
                        t9f.b();
                        return null;
                    }
                    obj2 = fyo0.f10369a;
                }
                function1.invoke(obj2);
                return Unit.f46060a;
            case 2:
                function1.invoke(new hyo0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 3:
                function1.invoke(new u3p0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 4:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                wdm wdmVar = bemVar instanceof wdm ? (wdm) bemVar : null;
                function1.invoke(Long.valueOf(wdmVar != null ? wdmVar.f38979a : 0L));
                return Unit.f46060a;
            case 5:
                function1.invoke(new lap0(((Long) obj).longValue()));
                return Unit.f46060a;
            case 6:
                function1.invoke(new jap0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 7:
                function1.invoke(new i8p0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 8:
                function1.invoke(new z7p0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 9:
                function1.invoke(new h8p0(((Long) obj).longValue()));
                return Unit.f46060a;
            case 10:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new l8p0(str));
                return Unit.f46060a;
            case 11:
                function1.invoke(new f8p0(((Long) obj).longValue()));
                return Unit.f46060a;
            case 12:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new ekp0(str2));
                return Unit.f46060a;
            case 13:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new ekp0(str3));
                return Unit.f46060a;
            case 14:
                function1.invoke(new dkp0(((Long) obj).longValue()));
                return Unit.f46060a;
            case 15:
                d9a0 d9a0Var = (d9a0) obj;
                d9a0Var.getClass();
                function1.invoke(new mn6(d9a0Var));
                return Unit.f46060a;
            case 16:
                d9a0 d9a0Var2 = (d9a0) obj;
                d9a0Var2.getClass();
                function1.invoke(new mn6(d9a0Var2));
                return Unit.f46060a;
            case 17:
                function1.invoke(new hrk0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 18:
                function1.invoke(new hrk0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                if (((Integer) obj).intValue() == 1) {
                    dyb.Q(new g4p0(function1, (byte) 23));
                }
                return Unit.f46060a;
            case 20:
                if (((Integer) obj).intValue() == 0) {
                    dyb.Q(new g4p0(function1, (byte) 29));
                }
                return Unit.f46060a;
            case 21:
                if (((Integer) obj).intValue() == 0) {
                    fxb.D(ivb0.b, new o0q0(function1, (byte) 3)).a();
                }
                return Unit.f46060a;
            case 22:
                function1.invoke(new d3q0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 23:
                ((jtl) obj).getClass();
                function1.invoke(pjq0.f27102a);
                return Unit.f46060a;
            case 24:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                DsSettingsCell dsSettingsCell = ((oyx) cpVar.u).f26079a;
                dsSettingsCell.getClass();
                dyb.O(dsSettingsCell, new o7x(function1, cpVar, (byte) 15));
                cpVar.t(new kzi0(cpVar, (byte) 19));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                tf50 tf50Var = (tf50) obj;
                tf50Var.getClass();
                function1.invoke(new ois(tf50Var));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                bem bemVar2 = (bem) obj;
                bemVar2.getClass();
                function1.invoke(new o4r0(bemVar2));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                bem bemVar3 = (bem) obj;
                bemVar3.getClass();
                function1.invoke(new o4r0(bemVar3));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                kim kimVar = (kim) obj;
                kimVar.getClass();
                if (kimVar.equals(eim.f7867a)) {
                    function1.invoke(d6r0.f5565a);
                } else if (kimVar instanceof iim) {
                    function1.invoke(new g6r0(((iim) kimVar).f14835a));
                } else if (kimVar instanceof jim) {
                    function1.invoke(new l6r0(((jim) kimVar).f16582a == 0));
                } else if (kimVar instanceof fim) {
                    int i = ((fim) kimVar).f9595a;
                    if (i == 1) {
                        function1.invoke(k6r0.f17785a);
                    } else if (i == 2) {
                        function1.invoke(j6r0.f16002a);
                    }
                } else if (kimVar instanceof gim) {
                    function1.invoke(f6r0.f9027a);
                }
                return Unit.f46060a;
            default:
                m9r0 m9r0Var = (m9r0) obj;
                m9r0Var.getClass();
                function1.invoke(m9r0Var);
                return Unit.f46060a;
        }
    }
}
