package a;

import android.content.Context;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;
import org.xplatform.uikit.components.cells.DsMenuCell;
import org.xplatform.uikit.components.cells.menu.DsMenuCompactCell;
import org.xplatform.uikit.components.cells.right.DsCellRightCounter;
import org.xplatform.uikit.components.counter.DsCounter;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class zbm0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44122a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ zbm0(Function1 function1, byte b) {
        this.f44122a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f44122a;
        byte b2 = 13;
        byte b3 = 14;
        h17 h17Var = h17.f12269a;
        byte b4 = 12;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                tdb tdbVar = (tdb) obj;
                tdbVar.getClass();
                function1.invoke(new pbm0(tdbVar));
                return Unit.f46060a;
            case 1:
                int iIntValue = ((Integer) obj).intValue();
                if (iIntValue == 0) {
                    function1.invoke(h17Var);
                } else if (iIntValue == 1) {
                    function1.invoke(j17.f15719a);
                }
                return Unit.f46060a;
            case 2:
                xgl0 xgl0Var = (xgl0) obj;
                xgl0Var.getClass();
                function1.invoke(new a6b(new z030(xgl0Var)));
                return Unit.f46060a;
            case 3:
                wgl0 wgl0Var = (wgl0) obj;
                wgl0Var.getClass();
                if (wgl0Var instanceof vgl0) {
                    function1.invoke(new a6b(new y030(((vgl0) wgl0Var).f37387a)));
                }
                return Unit.f46060a;
            case 4:
                xgl0 xgl0Var2 = (xgl0) obj;
                xgl0Var2.getClass();
                function1.invoke(new a6b(new z030(xgl0Var2)));
                return Unit.f46060a;
            case 5:
                ny20 ny20Var = (ny20) obj;
                ny20Var.getClass();
                if (ny20Var instanceof jy20) {
                    function1.invoke(new a6b(((jy20) ny20Var).f17339a));
                }
                return Unit.f46060a;
            case 6:
                wgl0 wgl0Var2 = (wgl0) obj;
                wgl0Var2.getClass();
                if (wgl0Var2 instanceof vgl0) {
                    function1.invoke(new a6b(new y030(((vgl0) wgl0Var2).f37387a)));
                }
                return Unit.f46060a;
            case 7:
                cp cpVar = (cp) obj;
                cpVar.getClass();
                dyb.O(((iyx) cpVar.u).b, new o7x(function1, cpVar, (byte) 10));
                cpVar.t(new kzi0(cpVar, b4));
                return Unit.f46060a;
            case 8:
                kim kimVar = (kim) obj;
                kimVar.getClass();
                if (kimVar instanceof eim) {
                    function1.invoke(nan0.f23199a);
                } else if ((kimVar instanceof fim) && ((fim) kimVar).f9595a == 1) {
                    function1.invoke(pan0.f26662a);
                }
                return Unit.f46060a;
            case 9:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                function1.invoke(new ian0(bemVar));
                return Unit.f46060a;
            case 10:
                kim kimVar2 = (kim) obj;
                kimVar2.getClass();
                if (kimVar2 instanceof eim) {
                    function1.invoke(bcn0.f2362a);
                } else if (kimVar2 instanceof fim) {
                    if (((fim) kimVar2).f9595a == 12) {
                        function1.invoke(ccn0.f4120a);
                    }
                } else if (kimVar2 instanceof jim) {
                    function1.invoke(new dcn0(((jim) kimVar2).f16582a));
                }
                return Unit.f46060a;
            case 11:
                cp cpVar2 = (cp) obj;
                cpVar2.getClass();
                itx itxVar = (itx) cpVar2.u;
                dyb.O(itxVar.f15371a, new o7x(function1, cpVar2, (byte) 11));
                DsMenuCompactCell dsMenuCompactCell = itxVar.f15371a;
                int iB = m5d.b(R.attr.uikitStaticRed, cpVar2.w);
                DsCounter dsCounter = dsMenuCompactCell.f1.c;
                if (dsCounter != null) {
                    dsCounter.h(Integer.valueOf(iB));
                }
                cpVar2.t(new kzi0(cpVar2, b2));
                return Unit.f46060a;
            case 12:
                cp cpVar3 = (cp) obj;
                cpVar3.getClass();
                kwx kwxVar = (kwx) cpVar3.u;
                DsMenuCell dsMenuCell = kwxVar.f19024a;
                dsMenuCell.getClass();
                dyb.O(dsMenuCell, new o7x(function1, cpVar3, (byte) 12));
                DsCellRightCounter dsCellRightCounter = kwxVar.b;
                Context context = cpVar3.w;
                dsCellRightCounter.setCounterColor(m5d.b(R.attr.uikitStaticWhite, context));
                kwxVar.b.setCounterBackgroundColor(Integer.valueOf(m5d.b(R.attr.uikitStaticRed, context)));
                cpVar3.t(new kzi0(cpVar3, b3));
                return Unit.f46060a;
            case 13:
                Long l = (Long) obj;
                l.getClass();
                return function1.invoke(l);
            case 14:
                if (((Integer) obj).intValue() == 0) {
                    function1.invoke(ivn0.f15454a);
                }
                return Unit.f46060a;
            case 15:
                cp cpVar4 = (cp) obj;
                cpVar4.getClass();
                dyb.O(((lyx) cpVar4.u).c, new o7x(function1, cpVar4, (byte) 13));
                cpVar4.t(new pgj0(cpVar4, cpVar4, b4));
                return Unit.f46060a;
            case 16:
                Integer num = (Integer) obj;
                num.getClass();
                function1.invoke(num);
                return Unit.f46060a;
            case 17:
                bem bemVar2 = (bem) obj;
                bemVar2.getClass();
                wdm wdmVar = bemVar2 instanceof wdm ? (wdm) bemVar2 : null;
                function1.invoke(Long.valueOf(wdmVar != null ? wdmVar.f38979a : 0L));
                return Unit.f46060a;
            case 18:
                function1.invoke(new v6o0(((Long) obj).longValue()));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(new t6o0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 20:
                function1.invoke(new erk0(((Long) obj).longValue()));
                return Unit.f46060a;
            case 21:
                function1.invoke(new rqk0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 22:
                function1.invoke(new erk0(((Long) obj).longValue()));
                return Unit.f46060a;
            case 23:
                function1.invoke(new rqk0(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 24:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new heo0(str));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                cp cpVar5 = (cp) obj;
                cpVar5.getClass();
                DsMenuCell dsMenuCell2 = ((xrx) cpVar5.u).f41391a;
                dsMenuCell2.getClass();
                dyb.O(dsMenuCell2, new o7x(function1, cpVar5, (byte) 14));
                cpVar5.t(new kzi0(cpVar5, (byte) 16));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                int iIntValue2 = ((Integer) obj).intValue();
                if (iIntValue2 == 0) {
                    function1.invoke(h17Var);
                } else if (iIntValue2 == 25) {
                    function1.invoke(j27.f15768a);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                function1.invoke(new yu30(((Integer) obj).intValue()));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                List list = (List) obj;
                list.getClass();
                function1.invoke(list);
                return Unit.f46060a;
            default:
                function1.invoke(new yu30(((Integer) obj).intValue()));
                return Unit.f46060a;
        }
    }
}
