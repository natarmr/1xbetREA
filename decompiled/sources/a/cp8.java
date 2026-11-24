package a;

import android.content.Context;
import android.javax.sip.message.Response;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xbet.client1.R;
import org.xplatform.aggregator.impl.category.data.models.AggregatorSortingOptionModel;
import org.xplatform.aggregator.impl.core.domain.models.AggregatorGameLanguage;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cp8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4732a;

    public /* synthetic */ cp8(byte b) {
        this.f4732a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        AggregatorSortingOptionModel aggregatorSortingOptionModel;
        switch (this.f4732a) {
            case 0:
                abi0 abi0Var = (abi0) obj;
                abi0Var.getClass();
                yai0.j(abi0Var);
                return Unit.f46060a;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Unit.f46060a;
            case 3:
                return Unit.f46060a;
            case 4:
                ((Boolean) obj).getClass();
                return Unit.f46060a;
            case 5:
                return Unit.f46060a;
            case 6:
                ((Integer) obj).getClass();
                return Unit.f46060a;
            case 7:
                zv8 zv8Var = (zv8) obj;
                zv8Var.getClass();
                return zv8Var.getId();
            case 8:
                zv8 zv8Var2 = (zv8) obj;
                zv8Var2.getClass();
                return zv8Var2.getClass();
            case 9:
                xw8 xw8Var = (xw8) obj;
                xw8Var.getClass();
                if (!(xw8Var instanceof vw8)) {
                    return null;
                }
                List<AggregatorGameLanguage> list = ((vw8) xw8Var).f38136a;
                ArrayList arrayList = new ArrayList(r3d.q(list, 10));
                for (AggregatorGameLanguage aggregatorGameLanguage : list) {
                    arrayList.add(new lxl(aggregatorGameLanguage.f46282a, (dyl) new xxl(aggregatorGameLanguage.b), false, uxl.f36445a, (cwl) null, 104));
                }
                return new fyl(dyb.r0(arrayList), tyl.f34760a, syl.b, s5x0.t(0.0f, 0.0f, 3), null, 16);
            case 10:
                ux8 ux8Var = (ux8) obj;
                ux8Var.getClass();
                qx8 qx8Var = ux8Var instanceof qx8 ? (qx8) ux8Var : null;
                if (qx8Var == null || (aggregatorSortingOptionModel = qx8Var.b) == null) {
                    return null;
                }
                String str = aggregatorSortingOptionModel.f46274a;
                pz40 pz40Var = s6t0.f31722a;
                return new rqm((vui0) new tui0(str, new y3d(s6t0.b().f33626a.getTextPrimary())), (pui0) null, (pvi0) new fvi0(new y3d(s6t0.b().f33626a.getSecondary())), d4d.BACKGROUND_CONTENT, (tvi0) null, wui0.f39793a, false, (e900) null, 426);
            case 11:
                gzh gzhVar = (gzh) obj;
                gzhVar.getClass();
                if (gzhVar instanceof ezh) {
                    return Long.valueOf(((ezh) gzhVar).f8671a);
                }
                if (Intrinsics.d(gzhVar, fzh.f10407a)) {
                    return -1;
                }
                t9f.b();
                return null;
            case 12:
                gzh gzhVar2 = (gzh) obj;
                gzhVar2.getClass();
                return sre0.f32672a.b(gzhVar2.getClass());
            case 13:
                kg kgVar = (kg) obj;
                kgVar.getClass();
                return oja0.b0(kgVar);
            case 14:
                vx8 vx8Var = (vx8) obj;
                vx8Var.getClass();
                if (vx8Var.f38188a) {
                    return new gyl(null, null, 3);
                }
                List<gw80> list2 = vx8Var.b;
                ArrayList arrayList2 = new ArrayList(r3d.q(list2, 10));
                for (gw80 gw80Var : list2) {
                    arrayList2.add(by8.a(gw80Var, vx8Var.c, new xxl(gw80Var.b)));
                }
                return new fyl(dyb.o0(arrayList2), null, null, null, null, 30);
            case 15:
                ot0 ot0Var = (ot0) obj;
                ot0Var.getClass();
                int iOrdinal = ot0Var.ordinal();
                if (iOrdinal == 0) {
                    return pt0.f27539a;
                }
                if (iOrdinal == 1) {
                    return pt0.b;
                }
                if (iOrdinal == 2) {
                    return pt0.c;
                }
                if (iOrdinal == 3) {
                    return pt0.d;
                }
                if (iOrdinal == 4) {
                    return pt0.e;
                }
                t9f.b();
                return null;
            case 16:
                int iIntValue = ((Integer) obj).intValue();
                xuz xuzVar = pb10.c;
                pb10 pb10Var = pb10.e;
                xuzVar.getClass();
                return new mdm(xuz.a(pb10Var, iIntValue), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
            case 17:
                int iIntValue2 = ((Integer) obj).intValue();
                xuz xuzVar2 = pb10.c;
                pb10 pb10Var2 = pb10.g;
                xuzVar2.getClass();
                return new mdm(xuz.a(pb10Var2, iIntValue2), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            case 18:
                ob0 ob0Var = (ob0) obj;
                ob0Var.getClass();
                return new jx8(ob0Var);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                vz8 vz8Var = (vz8) obj;
                vz8Var.getClass();
                return Integer.valueOf(vz8Var.f38287a);
            case 20:
                ((vz8) obj).getClass();
                return vz8.class;
            case 21:
                th1 th1Var = (th1) obj;
                th1Var.getClass();
                return aad.d0(th1Var);
            case 22:
                hr10 hr10Var = (hr10) obj;
                hr10Var.getClass();
                return x2x.m0(hr10Var);
            case 23:
                int iIntValue3 = ((Integer) obj).intValue();
                xuz xuzVar3 = pb10.c;
                pb10 pb10Var3 = pb10.e;
                xuzVar3.getClass();
                return new mdm(xuz.a(pb10Var3, iIntValue3), null, null, 0, 0, R.string.nothing_found, 0, 0, 0L, 0L, 990);
            case 24:
                int iIntValue4 = ((Integer) obj).intValue();
                xuz xuzVar4 = pb10.c;
                pb10 pb10Var4 = pb10.g;
                xuzVar4.getClass();
                return new mdm(xuz.a(pb10Var4, iIntValue4), null, null, 0, 0, R.string.data_is_missing, 0, 0, 0L, 0L, 990);
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                int iIntValue5 = ((Integer) obj).intValue();
                xuz xuzVar5 = pb10.c;
                pb10 pb10Var5 = pb10.g;
                xuzVar5.getClass();
                return new mdm(xuz.a(pb10Var5, iIntValue5), null, null, 0, 0, R.string.error_get_data, 0, R.string.try_again_text, 10000L, 0L, Response.SESSION_NOT_ACCEPTABLE);
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                kg kgVar2 = (kg) obj;
                kgVar2.getClass();
                return oja0.b0(kgVar2);
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ob0 ob0Var2 = (ob0) obj;
                ob0Var2.getClass();
                return new o19(ob0Var2);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                bh90 bh90Var = (bh90) obj;
                zfn zfnVar = dy2.b;
                bh90Var.getClass();
                if (((Context) qbc.V(bh90Var, zfnVar)).getPackageManager().hasSystemFeature("android.software.leanback")) {
                    return l39.b;
                }
                j39.f15819a.getClass();
                return i39.c;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return bool;
        }
    }
}
