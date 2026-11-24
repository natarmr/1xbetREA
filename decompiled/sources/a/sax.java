package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final class sax extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sax(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                sax saxVar = new sax(2, yjeVar, (byte) 0);
                saxVar.j = obj;
                return saxVar;
            case 1:
                sax saxVar2 = new sax(2, yjeVar, (byte) 1);
                saxVar2.j = obj;
                return saxVar2;
            case 2:
                sax saxVar3 = new sax(2, yjeVar, (byte) 2);
                saxVar3.j = obj;
                return saxVar3;
            case 3:
                sax saxVar4 = new sax(2, yjeVar, (byte) 3);
                saxVar4.j = obj;
                return saxVar4;
            case 4:
                sax saxVar5 = new sax(2, yjeVar, (byte) 4);
                saxVar5.j = obj;
                return saxVar5;
            case 5:
                sax saxVar6 = new sax(2, yjeVar, (byte) 5);
                saxVar6.j = obj;
                return saxVar6;
            case 6:
                sax saxVar7 = new sax(2, yjeVar, (byte) 6);
                saxVar7.j = obj;
                return saxVar7;
            case 7:
                sax saxVar8 = new sax(2, yjeVar, (byte) 7);
                saxVar8.j = obj;
                return saxVar8;
            case 8:
                sax saxVar9 = new sax(2, yjeVar, (byte) 8);
                saxVar9.j = obj;
                return saxVar9;
            case 9:
                sax saxVar10 = new sax(2, yjeVar, (byte) 9);
                saxVar10.j = obj;
                return saxVar10;
            case 10:
                sax saxVar11 = new sax(2, yjeVar, (byte) 10);
                saxVar11.j = obj;
                return saxVar11;
            case 11:
                sax saxVar12 = new sax(2, yjeVar, (byte) 11);
                saxVar12.j = obj;
                return saxVar12;
            case 12:
                sax saxVar13 = new sax(2, yjeVar, (byte) 12);
                saxVar13.j = obj;
                return saxVar13;
            case 13:
                sax saxVar14 = new sax(2, yjeVar, (byte) 13);
                saxVar14.j = obj;
                return saxVar14;
            case 14:
                sax saxVar15 = new sax(2, yjeVar, (byte) 14);
                saxVar15.j = obj;
                return saxVar15;
            case 15:
                sax saxVar16 = new sax(2, yjeVar, (byte) 15);
                saxVar16.j = obj;
                return saxVar16;
            case 16:
                sax saxVar17 = new sax(2, yjeVar, (byte) 16);
                saxVar17.j = obj;
                return saxVar17;
            case 17:
                sax saxVar18 = new sax(2, yjeVar, (byte) 17);
                saxVar18.j = obj;
                return saxVar18;
            case 18:
                sax saxVar19 = new sax(2, yjeVar, (byte) 18);
                saxVar19.j = obj;
                return saxVar19;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                sax saxVar20 = new sax(2, yjeVar, (byte) 19);
                saxVar20.j = obj;
                return saxVar20;
            case 20:
                sax saxVar21 = new sax(2, yjeVar, (byte) 20);
                saxVar21.j = obj;
                return saxVar21;
            case 21:
                sax saxVar22 = new sax(2, yjeVar, (byte) 21);
                saxVar22.j = obj;
                return saxVar22;
            case 22:
                sax saxVar23 = new sax(2, yjeVar, (byte) 22);
                saxVar23.j = obj;
                return saxVar23;
            case 23:
                sax saxVar24 = new sax(2, yjeVar, (byte) 23);
                saxVar24.j = obj;
                return saxVar24;
            case 24:
                sax saxVar25 = new sax(2, yjeVar, (byte) 24);
                saxVar25.j = obj;
                return saxVar25;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sax saxVar26 = new sax(2, yjeVar, (byte) 25);
                saxVar26.j = obj;
                return saxVar26;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                sax saxVar27 = new sax(2, yjeVar, (byte) 26);
                saxVar27.j = obj;
                return saxVar27;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                sax saxVar28 = new sax(2, yjeVar, (byte) 27);
                saxVar28.j = obj;
                return saxVar28;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                sax saxVar29 = new sax(2, yjeVar, (byte) 28);
                saxVar29.j = obj;
                return saxVar29;
            default:
                sax saxVar30 = new sax(2, yjeVar, (byte) 29);
                saxVar30.j = obj;
                return saxVar30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((sax) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                return ((sax) create((o9c) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((sax) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((sax) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((sax) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        byte b = this.i;
        Object obj2 = this.j;
        switch (b) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 4:
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 5:
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 6:
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ0 = ((qpg0) obj2).Z0("delete from last_action");
                try {
                    xpg0VarZ0.W0();
                    return Unit.f46060a;
                } finally {
                    xpg0VarZ0.close();
                }
            case 7:
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                return Boolean.valueOf(!((o9c) obj2).getBanned());
            case 8:
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 9:
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 10:
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 12:
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 13:
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 14:
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 15:
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 16:
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 17:
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 18:
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 20:
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 21:
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 23:
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case 24:
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                ((Throwable) obj2).printStackTrace();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ1 = ((qpg0) obj2).Z0("SELECT * FROM market_filter ORDER BY pinned_position");
                try {
                    int iP = x0x.P(xpg0VarZ1, ParameterNames.ID);
                    int iP2 = x0x.P(xpg0VarZ1, ParameterNames.HIDDEN);
                    int iP3 = x0x.P(xpg0VarZ1, "pinned_position");
                    ArrayList arrayList = new ArrayList();
                    while (xpg0VarZ1.W0()) {
                        arrayList.add(new ut20((int) xpg0VarZ1.getLong(iP3), xpg0VarZ1.getLong(iP), ((int) xpg0VarZ1.getLong(iP2)) != 0));
                    }
                    xpg0VarZ1.close();
                    return arrayList;
                } catch (Throwable th) {
                    xpg0VarZ1.close();
                    throw th;
                }
            default:
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ2 = ((qpg0) obj2).Z0("DELETE FROM market_filter");
                try {
                    xpg0VarZ2.W0();
                    return Unit.f46060a;
                } finally {
                    xpg0VarZ2.close();
                }
        }
    }
}
