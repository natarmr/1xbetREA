package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class awg0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1572a;

    public /* synthetic */ awg0(byte b) {
        this.f1572a = b;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        y3d y3dVar;
        smk0 smk0Var = null;
        smk0Var = null;
        int i = 0;
        switch (this.f1572a) {
            case 0:
                fee feeVar = (fee) obj;
                feeVar.getClass();
                return (List) feeVar.c();
            case 1:
                fee feeVar2 = (fee) obj;
                feeVar2.getClass();
                return (ql5) feeVar2.c();
            case 2:
                fee feeVar3 = (fee) obj;
                feeVar3.getClass();
                return (List) feeVar3.c();
            case 3:
                fee feeVar4 = (fee) obj;
                feeVar4.getClass();
                pn40 pn40Var = pn40.f27267a;
                return pn40.c(((Number) feeVar4.c()).doubleValue(), p3u0.c);
            case 4:
                fee feeVar5 = (fee) obj;
                feeVar5.getClass();
                pn40 pn40Var2 = pn40.f27267a;
                return pn40.c(((Number) feeVar5.c()).doubleValue(), p3u0.c);
            case 5:
                ((Throwable) obj).getClass();
                return Unit.f46060a;
            case 6:
                return new czg0((Map) obj);
            case 7:
                List list = (List) obj;
                list.getClass();
                return new rz40((jiy) CollectionsKt.U(list), (byte) 0);
            case 8:
                List list2 = (List) obj;
                list2.getClass();
                return new rz40((jiy) CollectionsKt.U(list2), (byte) 1);
            case 9:
                return obj;
            case 10:
                obj.getClass();
                List list3 = (List) obj;
                Object obj2 = list3.get(0);
                Function1 function1 = z0h0.h.b;
                Boolean bool = Boolean.FALSE;
                smk0 smk0Var2 = (Intrinsics.d(obj2, bool) || obj2 == null) ? null : (smk0) function1.invoke(obj2);
                Object obj3 = list3.get(1);
                smk0 smk0Var3 = (Intrinsics.d(obj3, bool) || obj3 == null) ? null : (smk0) function1.invoke(obj3);
                Object obj4 = list3.get(2);
                smk0 smk0Var4 = (Intrinsics.d(obj4, bool) || obj4 == null) ? null : (smk0) function1.invoke(obj4);
                Object obj5 = list3.get(3);
                if (!Intrinsics.d(obj5, bool) && obj5 != null) {
                    smk0Var = (smk0) function1.invoke(obj5);
                }
                return new f9q0(smk0Var2, smk0Var3, smk0Var4, smk0Var);
            case 11:
                obj.getClass();
                List list4 = (List) obj;
                Object obj6 = list4.get(1);
                List list5 = (Intrinsics.d(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) z0h0.f43566a.b.invoke(obj6);
                Object obj7 = list4.get(0);
                String str = obj7 != null ? (String) obj7 : null;
                str.getClass();
                return new j83(list5, str);
            case 12:
                obj.getClass();
                return new k5q0(((Integer) obj).intValue());
            case 13:
                obj.getClass();
                List list6 = (List) obj;
                return new f8q0(((Number) list6.get(0)).floatValue(), ((Number) list6.get(1)).floatValue());
            case 14:
                obj.getClass();
                List list7 = (List) obj;
                Object obj8 = list7.get(0);
                eaq0[] eaq0VarArr = daq0.b;
                Function1 function2 = z0h0.v.b;
                Boolean bool2 = Boolean.FALSE;
                Intrinsics.d(obj8, bool2);
                daq0 daq0Var = obj8 != null ? (daq0) function2.invoke(obj8) : null;
                daq0Var.getClass();
                long j = daq0Var.f5764a;
                Object obj9 = list7.get(1);
                Intrinsics.d(obj9, bool2);
                daq0 daq0Var2 = obj9 != null ? (daq0) function2.invoke(obj9) : null;
                daq0Var2.getClass();
                return new g8q0(j, daq0Var2.f5764a);
            case 15:
                obj.getClass();
                return new psq(((Integer) obj).intValue());
            case 16:
                obj.getClass();
                return new j56(((Float) obj).floatValue());
            case 17:
                obj.getClass();
                List list8 = (List) obj;
                Object obj10 = list8.get(0);
                Integer num = obj10 != null ? (Integer) obj10 : null;
                num.getClass();
                int iIntValue = num.intValue();
                Object obj11 = list8.get(1);
                Integer num2 = obj11 != null ? (Integer) obj11 : null;
                num2.getClass();
                return new o9q0(s7n0.e(iIntValue, num2.intValue()));
            case 18:
                obj.getClass();
                List list9 = (List) obj;
                Object obj12 = list9.get(0);
                int i2 = y3d.h;
                Boolean bool3 = Boolean.FALSE;
                Intrinsics.d(obj12, bool3);
                if (obj12 != null) {
                    y3dVar = Intrinsics.d(obj12, Boolean.FALSE) ? new y3d(y3d.g) : new y3d(fbc.d(((Integer) obj12).intValue()));
                } else {
                    y3dVar = null;
                }
                y3dVar.getClass();
                long j2 = y3dVar.f41946a;
                Object obj13 = list9.get(1);
                y0h0 y0h0Var = z0h0.x;
                Intrinsics.d(obj13, bool3);
                ne60 ne60Var = obj13 != null ? (ne60) y0h0Var.b.invoke(obj13) : null;
                ne60Var.getClass();
                long j3 = ne60Var.f23370a;
                Object obj14 = list9.get(2);
                Float f = obj14 != null ? (Float) obj14 : null;
                f.getClass();
                return new ljj0(f.floatValue(), j2, j3);
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                obj.getClass();
                return new f2q0(((Integer) obj).intValue());
            case 20:
                obj.getClass();
                List list10 = (List) obj;
                Object obj15 = list10.get(0);
                String str2 = obj15 != null ? (String) obj15 : null;
                str2.getClass();
                Object obj16 = list10.get(1);
                return new jb00(str2, (Intrinsics.d(obj16, Boolean.FALSE) || obj16 == null) ? null : (f9q0) z0h0.i.b.invoke(obj16), null);
            case 21:
                obj.getClass();
                return new n5q0(((Integer) obj).intValue());
            case 22:
                obj.getClass();
                return new fuw(((Integer) obj).intValue());
            case 23:
                obj.getClass();
                List list11 = (List) obj;
                ArrayList arrayList = new ArrayList(list11.size());
                int size = list11.size();
                while (i < size) {
                    Object obj17 = list11.get(i);
                    i83 i83Var = (Intrinsics.d(obj17, Boolean.FALSE) || obj17 == null) ? null : (i83) z0h0.b.b.invoke(obj17);
                    i83Var.getClass();
                    arrayList.add(i83Var);
                    i++;
                }
                return arrayList;
            case 24:
                obj.getClass();
                return new lsq(((Integer) obj).intValue());
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                obj.getClass();
                return new msq(((Integer) obj).intValue());
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                Boolean bool4 = Boolean.FALSE;
                if (Intrinsics.d(obj, bool4)) {
                    return new daq0(daq0.c);
                }
                obj.getClass();
                List list12 = (List) obj;
                Object obj18 = list12.get(0);
                Float f2 = obj18 != null ? (Float) obj18 : null;
                f2.getClass();
                float fFloatValue = f2.floatValue();
                Object obj19 = list12.get(1);
                y0h0 y0h0Var2 = z0h0.w;
                Intrinsics.d(obj19, bool4);
                eaq0 eaq0Var = obj19 != null ? (eaq0) y0h0Var2.b.invoke(obj19) : null;
                eaq0Var.getClass();
                return new daq0(idm0.v(fFloatValue, eaq0Var.f7481a));
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                if (Intrinsics.d(obj, 0)) {
                    return new eaq0(8589934592L);
                }
                return Intrinsics.d(obj, 1) ? new eaq0(4294967296L) : new eaq0(0L);
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                if (Intrinsics.d(obj, Boolean.FALSE)) {
                    return new ne60(9205357640488583168L);
                }
                obj.getClass();
                List list13 = (List) obj;
                Object obj20 = list13.get(0);
                Float f3 = obj20 != null ? (Float) obj20 : null;
                f3.getClass();
                float fFloatValue2 = f3.floatValue();
                Object obj21 = list13.get(1);
                Float f4 = obj21 != null ? (Float) obj21 : null;
                f4.getClass();
                return new ne60((((long) Float.floatToRawIntBits(f4.floatValue())) & 4294967295L) | (((long) Float.floatToRawIntBits(fFloatValue2)) << 32));
            default:
                obj.getClass();
                List list14 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list14.size());
                int size2 = list14.size();
                while (i < size2) {
                    Object obj22 = list14.get(i);
                    qs00 qs00Var = (Intrinsics.d(obj22, Boolean.FALSE) || obj22 == null) ? null : (qs00) z0h0.z.b.invoke(obj22);
                    qs00Var.getClass();
                    arrayList2.add(qs00Var);
                    i++;
                }
                return new rs00(arrayList2);
        }
    }
}
