package a;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d1i0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5310a;

    public /* synthetic */ d1i0(byte b) {
        this.f5310a = b;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f5310a) {
            case 0:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 1:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 2:
                ((Integer) obj2).getClass();
                cwr0.t(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 3:
                ((Integer) obj2).getClass();
                f1t0.z(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case 4:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case 5:
                b1j.z((String) obj2, (Throwable) obj);
                return Unit.f46060a;
            case 6:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = iun.f15405a;
                }
                return CollectionsKt.q0(collection, list);
            case 7:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case 8:
                Float f = (Float) obj;
                ((Float) obj2).getClass();
                return f;
            case 9:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 10:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 11:
                return (ucg0) obj;
            case 12:
                return (String) obj;
            case 13:
                return (Unit) obj;
            case 14:
                List list4 = (List) obj;
                List list5 = (List) obj2;
                if (list4 == null) {
                    return list5;
                }
                ArrayList arrayList2 = new ArrayList(list4);
                arrayList2.addAll(list5);
                return arrayList2;
            case 15:
                return (yjj0) obj;
            case 16:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 17:
                return (oie) obj;
            case 18:
                return (jy2) obj;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                return (ez2) obj;
            case 20:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).getClass();
                return bool;
            case 21:
                if (obj != null || obj2 != null) {
                    hny.b();
                }
                return null;
            case 22:
                return obj == null ? obj2 : obj;
            case 23:
                tai0 tai0Var = (tai0) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                nai0 nai0Var = ((tai0) obj).d;
                zai0 zai0Var = xai0.u;
                Object objG = nai0Var.f23193a.g(zai0Var);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = tai0Var.d.f23193a.g(zai0Var);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
            case 24:
                sgy sgyVar = (sgy) obj;
                List list6 = (List) obj2;
                sgyVar.getClass();
                list6.getClass();
                ArrayList arrayListE0 = n6x.e0(qhi0.f28741a, list6, true);
                arrayListE0.getClass();
                return n6x.J(sgyVar, arrayListE0, new awj(list6, (byte) 3));
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                sgy sgyVar2 = (sgy) obj;
                List list7 = (List) obj2;
                sgyVar2.getClass();
                list7.getClass();
                ArrayList arrayListE1 = n6x.e0(qhi0.f28741a, list7, true);
                arrayListE1.getClass();
                jiy jiyVarJ = n6x.J(sgyVar2, arrayListE1, new awj(list7, (byte) 4));
                if (jiyVarJ != null) {
                    return mrv.j0(jiyVarJ);
                }
                return null;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ((Integer) obj2).getClass();
                i4w0.x(x8x.L(1), (fet) obj);
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Throwable) obj).getClass();
                ((String) obj2).getClass();
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                return Unit.f46060a;
            default:
                LayoutInflater layoutInflater = (LayoutInflater) obj;
                ViewGroup viewGroup = (ViewGroup) obj2;
                layoutInflater.getClass();
                viewGroup.getClass();
                return djj0.a(layoutInflater, viewGroup);
        }
    }

    public /* synthetic */ d1i0(int i, byte b) {
        this.f5310a = b;
    }
}
