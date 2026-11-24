package a;

import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Build;
import android.util.Log;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class st20 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public /* synthetic */ Object j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ st20(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                st20 st20Var = new st20(2, yjeVar, (byte) 0);
                st20Var.j = obj;
                return st20Var;
            case 1:
                st20 st20Var2 = new st20(2, yjeVar, (byte) 1);
                st20Var2.j = obj;
                return st20Var2;
            case 2:
                st20 st20Var3 = new st20(2, yjeVar, (byte) 2);
                st20Var3.j = obj;
                return st20Var3;
            case 3:
                st20 st20Var4 = new st20(2, yjeVar, (byte) 3);
                st20Var4.j = obj;
                return st20Var4;
            case 4:
                st20 st20Var5 = new st20(2, yjeVar, (byte) 4);
                st20Var5.j = obj;
                return st20Var5;
            case 5:
                st20 st20Var6 = new st20(2, yjeVar, (byte) 5);
                st20Var6.j = obj;
                return st20Var6;
            case 6:
                st20 st20Var7 = new st20(2, yjeVar, (byte) 6);
                st20Var7.j = obj;
                return st20Var7;
            case 7:
                st20 st20Var8 = new st20(2, yjeVar, (byte) 7);
                st20Var8.j = ((j0g0) obj).f15681a;
                return st20Var8;
            case 8:
                st20 st20Var9 = new st20(2, yjeVar, (byte) 8);
                st20Var9.j = obj;
                return st20Var9;
            case 9:
                st20 st20Var10 = new st20(2, yjeVar, (byte) 9);
                st20Var10.j = obj;
                return st20Var10;
            case 10:
                st20 st20Var11 = new st20(2, yjeVar, (byte) 10);
                st20Var11.j = obj;
                return st20Var11;
            case 11:
                st20 st20Var12 = new st20(2, yjeVar, (byte) 11);
                st20Var12.j = obj;
                return st20Var12;
            case 12:
                st20 st20Var13 = new st20(2, yjeVar, (byte) 12);
                st20Var13.j = obj;
                return st20Var13;
            case 13:
                st20 st20Var14 = new st20(2, yjeVar, (byte) 13);
                st20Var14.j = obj;
                return st20Var14;
            case 14:
                st20 st20Var15 = new st20(2, yjeVar, (byte) 14);
                st20Var15.j = obj;
                return st20Var15;
            case 15:
                st20 st20Var16 = new st20(2, yjeVar, (byte) 15);
                st20Var16.j = obj;
                return st20Var16;
            case 16:
                st20 st20Var17 = new st20(2, yjeVar, (byte) 16);
                st20Var17.j = obj;
                return st20Var17;
            case 17:
                st20 st20Var18 = new st20(2, yjeVar, (byte) 17);
                st20Var18.j = obj;
                return st20Var18;
            case 18:
                st20 st20Var19 = new st20(2, yjeVar, (byte) 18);
                st20Var19.j = obj;
                return st20Var19;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                st20 st20Var20 = new st20(2, yjeVar, (byte) 19);
                st20Var20.j = obj;
                return st20Var20;
            case 20:
                st20 st20Var21 = new st20(2, yjeVar, (byte) 20);
                st20Var21.j = obj;
                return st20Var21;
            case 21:
                st20 st20Var22 = new st20(2, yjeVar, (byte) 21);
                st20Var22.j = obj;
                return st20Var22;
            case 22:
                st20 st20Var23 = new st20(2, yjeVar, (byte) 22);
                st20Var23.j = obj;
                return st20Var23;
            case 23:
                st20 st20Var24 = new st20(2, yjeVar, (byte) 23);
                st20Var24.j = obj;
                return st20Var24;
            case 24:
                st20 st20Var25 = new st20(2, yjeVar, (byte) 24);
                st20Var25.j = obj;
                return st20Var25;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                st20 st20Var26 = new st20(2, yjeVar, (byte) 25);
                st20Var26.j = obj;
                return st20Var26;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                st20 st20Var27 = new st20(2, yjeVar, (byte) 26);
                st20Var27.j = obj;
                return st20Var27;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                st20 st20Var28 = new st20(2, yjeVar, (byte) 27);
                st20Var28.j = obj;
                return st20Var28;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                st20 st20Var29 = new st20(2, yjeVar, (byte) 28);
                st20Var29.j = obj;
                return st20Var29;
            default:
                st20 st20Var30 = new st20(2, yjeVar, (byte) 29);
                st20Var30.j = obj;
                return st20Var30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((st20) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((st20) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((st20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((st20) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                return ((st20) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                return ((st20) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((st20) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 7:
                j0g0 j0g0Var = (j0g0) obj;
                Object obj3 = j0g0Var.f15681a;
                return ((st20) create(j0g0Var, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 8:
                return ((st20) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 9:
                return ((st20) create((Pair) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 10:
                return ((st20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 11:
                return ((st20) create((wh80) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 12:
                return ((st20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 13:
                return ((st20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 14:
                return ((st20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 15:
                return ((st20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 16:
                return ((st20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 17:
                return ((st20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 18:
                return ((st20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return ((st20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 20:
                return ((st20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 21:
                return ((st20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 22:
                return ((st20) create((dge0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 23:
                return ((st20) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 24:
                return ((st20) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                return ((st20) create((qpg0) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                return ((st20) create((String) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                return ((st20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return ((st20) create((p2a) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((st20) create((Throwable) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) throws Exception {
        long j;
        switch (this.i) {
            case 0:
                qpg0 qpg0Var = (qpg0) this.j;
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ0 = qpg0Var.Z0("SELECT * FROM market_filter WHERE pinned_position != 0 ORDER BY pinned_position");
                try {
                    int iP = x0x.P(xpg0VarZ0, ParameterNames.ID);
                    int iP2 = x0x.P(xpg0VarZ0, ParameterNames.HIDDEN);
                    int iP3 = x0x.P(xpg0VarZ0, "pinned_position");
                    ArrayList arrayList = new ArrayList();
                    while (xpg0VarZ0.W0()) {
                        arrayList.add(new ut20((int) xpg0VarZ0.getLong(iP3), xpg0VarZ0.getLong(iP), ((int) xpg0VarZ0.getLong(iP2)) != 0));
                    }
                    xpg0VarZ0.close();
                    return arrayList;
                } catch (Throwable th) {
                    xpg0VarZ0.close();
                    throw th;
                }
            case 1:
                qpg0 qpg0Var2 = (qpg0) this.j;
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ1 = qpg0Var2.Z0("DELETE FROM market_filter WHERE hidden = 1");
                try {
                    xpg0VarZ1.W0();
                    return Unit.f46060a;
                } finally {
                    xpg0VarZ1.close();
                }
            case 2:
                Throwable th2 = (Throwable) this.j;
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                th2.printStackTrace();
                return Unit.f46060a;
            case 3:
                qpg0 qpg0Var3 = (qpg0) this.j;
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ2 = qpg0Var3.Z0("DELETE from news_catalog_banners");
                try {
                    xpg0VarZ2.W0();
                    return Unit.f46060a;
                } finally {
                    xpg0VarZ2.close();
                }
            case 4:
                qpg0 qpg0Var4 = (qpg0) this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ3 = qpg0Var4.Z0("SELECT `id` from news_catalog_banners");
                try {
                    ArrayList arrayList2 = new ArrayList();
                    while (xpg0VarZ3.W0()) {
                        arrayList2.add(new Integer((int) xpg0VarZ3.getLong(0)));
                    }
                    xpg0VarZ3.close();
                    return arrayList2;
                } catch (Throwable th3) {
                    xpg0VarZ3.close();
                    throw th3;
                }
            case 5:
                qpg0 qpg0Var5 = (qpg0) this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ4 = qpg0Var5.Z0("DELETE from news_catalog_banners");
                try {
                    xpg0VarZ4.W0();
                    return Unit.f46060a;
                } finally {
                    xpg0VarZ4.close();
                }
            case 6:
                qpg0 qpg0Var6 = (qpg0) this.j;
                wne wneVar7 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ5 = qpg0Var6.Z0("SELECT `id` from news_catalog_cms_banners");
                try {
                    ArrayList arrayList3 = new ArrayList();
                    while (xpg0VarZ5.W0()) {
                        arrayList3.add(new Integer((int) xpg0VarZ5.getLong(0)));
                    }
                    xpg0VarZ5.close();
                    return arrayList3;
                } catch (Throwable th4) {
                    xpg0VarZ5.close();
                    throw th4;
                }
            case 7:
                Object obj2 = this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                iun iunVar = iun.f15405a;
                lun lunVar = lun.f20680a;
                lunVar.getClass();
                wcs0 wcs0Var = new wcs0(iunVar, lunVar);
                e0g0 e0g0Var = j0g0.b;
                return obj2 instanceof g0g0 ? wcs0Var : obj2;
            case 8:
                Pair pair = (Pair) this.j;
                wne wneVar9 = wne.f39444a;
                z1x.P(obj);
                pat patVar = (pat) pair.f46059a;
                pat patVar2 = (pat) pair.b;
                patVar.getClass();
                patVar2.getClass();
                if ((patVar instanceof oat) || (patVar2 instanceof oat)) {
                    throw new sq60();
                }
                if ((patVar instanceof mat) || (patVar2 instanceof mat)) {
                    throw new vub0();
                }
                if ((patVar instanceof lat) || (patVar2 instanceof lat)) {
                    throw new bun();
                }
                return Unit.f46060a;
            case 9:
                Pair pair2 = (Pair) this.j;
                wne wneVar10 = wne.f39444a;
                z1x.P(obj);
                pat patVar3 = (pat) pair2.f46059a;
                pat patVar4 = (pat) pair2.b;
                patVar3.getClass();
                patVar4.getClass();
                if ((patVar3 instanceof oat) || (patVar4 instanceof oat)) {
                    throw new sq60();
                }
                if ((patVar3 instanceof mat) || (patVar4 instanceof mat)) {
                    throw new vub0();
                }
                if ((patVar3 instanceof lat) || (patVar4 instanceof lat)) {
                    throw new bun();
                }
                return Unit.f46060a;
            case 10:
                Throwable th5 = (Throwable) this.j;
                wne wneVar11 = wne.f39444a;
                z1x.P(obj);
                th5.printStackTrace();
                return Unit.f46060a;
            case 11:
                wne wneVar12 = wne.f39444a;
                z1x.P(obj);
                wh80 wh80Var = (wh80) this.j;
                if (Build.ID != null && Log.isLoggable("Paging", 2)) {
                    Log.v("Paging", "Sent " + wh80Var, null);
                }
                return Unit.f46060a;
            case 12:
                Throwable th6 = (Throwable) this.j;
                wne wneVar13 = wne.f39444a;
                z1x.P(obj);
                th6.printStackTrace();
                return Unit.f46060a;
            case 13:
                Throwable th7 = (Throwable) this.j;
                wne wneVar14 = wne.f39444a;
                z1x.P(obj);
                th7.printStackTrace();
                return Unit.f46060a;
            case 14:
                Throwable th8 = (Throwable) this.j;
                wne wneVar15 = wne.f39444a;
                z1x.P(obj);
                th8.printStackTrace();
                return Unit.f46060a;
            case 15:
                Throwable th9 = (Throwable) this.j;
                wne wneVar16 = wne.f39444a;
                z1x.P(obj);
                th9.printStackTrace();
                return Unit.f46060a;
            case 16:
                Throwable th10 = (Throwable) this.j;
                wne wneVar17 = wne.f39444a;
                z1x.P(obj);
                th10.printStackTrace();
                return Unit.f46060a;
            case 17:
                Throwable th11 = (Throwable) this.j;
                wne wneVar18 = wne.f39444a;
                z1x.P(obj);
                th11.printStackTrace();
                return Unit.f46060a;
            case 18:
                Throwable th12 = (Throwable) this.j;
                wne wneVar19 = wne.f39444a;
                z1x.P(obj);
                th12.printStackTrace();
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                Throwable th13 = (Throwable) this.j;
                wne wneVar20 = wne.f39444a;
                z1x.P(obj);
                th13.printStackTrace();
                return Unit.f46060a;
            case 20:
                Throwable th14 = (Throwable) this.j;
                wne wneVar21 = wne.f39444a;
                z1x.P(obj);
                th14.printStackTrace();
                return Unit.f46060a;
            case 21:
                Throwable th15 = (Throwable) this.j;
                wne wneVar22 = wne.f39444a;
                z1x.P(obj);
                th15.printStackTrace();
                return Unit.f46060a;
            case 22:
                wne wneVar23 = wne.f39444a;
                z1x.P(obj);
                return Boolean.valueOf(((dge0) this.j) == dge0.f6038a);
            case 23:
                qpg0 qpg0Var7 = (qpg0) this.j;
                wne wneVar24 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ6 = qpg0Var7.Z0("SELECT count(*) from registration");
                try {
                    if (xpg0VarZ6.W0()) {
                        j = xpg0VarZ6.getLong(0);
                        break;
                    } else {
                        j = 0;
                    }
                    return new Long(j);
                } finally {
                    xpg0VarZ6.close();
                }
            case 24:
                qpg0 qpg0Var8 = (qpg0) this.j;
                wne wneVar25 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ7 = qpg0Var8.Z0("DELETE FROM registration");
                try {
                    xpg0VarZ7.W0();
                    return Unit.f46060a;
                } finally {
                    xpg0VarZ7.close();
                }
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                qpg0 qpg0Var9 = (qpg0) this.j;
                wne wneVar26 = wne.f39444a;
                z1x.P(obj);
                xpg0 xpg0VarZ8 = qpg0Var9.Z0("SELECT * FROM registration");
                try {
                    int iP4 = x0x.P(xpg0VarZ8, ParameterNames.ID);
                    int iP5 = x0x.P(xpg0VarZ8, "registration_type_id");
                    int iP6 = x0x.P(xpg0VarZ8, "field_name");
                    int iP7 = x0x.P(xpg0VarZ8, "is_required");
                    int iP8 = x0x.P(xpg0VarZ8, "is_hidden");
                    int iP9 = x0x.P(xpg0VarZ8, "min_age");
                    ArrayList arrayList4 = new ArrayList();
                    while (xpg0VarZ8.W0()) {
                        arrayList4.add(new fze0(xpg0VarZ8.getLong(iP4), (int) xpg0VarZ8.getLong(iP5), xpg0VarZ8.J0(iP6), ((int) xpg0VarZ8.getLong(iP7)) != 0, ((int) xpg0VarZ8.getLong(iP8)) != 0, xpg0VarZ8.isNull(iP9) ? null : xpg0VarZ8.J0(iP9)));
                        break;
                    }
                    return arrayList4;
                } finally {
                    xpg0VarZ8.close();
                }
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                wne wneVar27 = wne.f39444a;
                z1x.P(obj);
                f140.r("Error failed to fetch the remote configs: ", (String) this.j, "FirebaseSessions");
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                Throwable th16 = (Throwable) this.j;
                wne wneVar28 = wne.f39444a;
                z1x.P(obj);
                th16.printStackTrace();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wne wneVar29 = wne.f39444a;
                z1x.P(obj);
                return Boolean.valueOf(!Intrinsics.d((p2a) this.j, y2a.f41894a));
            default:
                Throwable th17 = (Throwable) this.j;
                wne wneVar30 = wne.f39444a;
                z1x.P(obj);
                th17.printStackTrace();
                return Unit.f46060a;
        }
    }
}
