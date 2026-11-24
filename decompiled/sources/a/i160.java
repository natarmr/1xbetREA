package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i160 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13982a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ i160(Function1 function1, byte b) {
        this.f13982a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f13982a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                thm thmVar = (thm) obj;
                thmVar.getClass();
                if (thmVar instanceof ihm) {
                    function1.invoke(cy50.f5156a);
                } else if (thmVar instanceof lhm) {
                    function1.invoke(ey50.f8611a);
                }
                return Unit.f46060a;
            case 1:
                throw rw2.g(obj);
            case 2:
                if (((Integer) obj).intValue() == 0) {
                    function1.invoke(ot60.f25815a);
                }
                return Unit.f46060a;
            case 3:
                cvl cvlVar = (cvl) obj;
                cvlVar.getClass();
                function1.invoke(new txq0(new xv60(cvlVar.f5035a)));
                return Unit.f46060a;
            case 4:
                m9n m9nVar = (m9n) obj;
                m9nVar.getClass();
                if (!(m9nVar instanceof k9n)) {
                    if (!(m9nVar instanceof l9n)) {
                        t9f.b();
                        return null;
                    }
                    l9n l9nVar = (l9n) m9nVar;
                    j9n j9nVar = l9nVar.c;
                    if (j9nVar instanceof g9n) {
                        function1.invoke(new kw60(!((g9n) j9nVar).b, l9nVar.f19662a));
                    }
                }
                return Unit.f46060a;
            case 5:
                jtl jtlVar = (jtl) obj;
                jtlVar.getClass();
                if (Intrinsics.d(jtlVar, sh00.i)) {
                    function1.invoke(hy60.f13847a);
                } else if (Intrinsics.d(jtlVar, sh00.j)) {
                    function1.invoke(fy60.f10346a);
                }
                return Unit.f46060a;
            case 6:
                function1.invoke(new jy60(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 7:
                urs ursVar = (urs) obj;
                ursVar.getClass();
                function1.invoke(new ky60(ursVar));
                return Unit.f46060a;
            case 8:
                m4s m4sVar = (m4s) obj;
                m4sVar.getClass();
                function1.invoke(new iy60(m4sVar));
                return Unit.f46060a;
            case 9:
                function1.invoke(Integer.valueOf((int) ((Long) obj).longValue()));
                return Unit.f46060a;
            case 10:
                function1.invoke(new ap60((int) ((Long) obj).longValue()));
                return Unit.f46060a;
            case 11:
                m9n m9nVar2 = (m9n) obj;
                m9nVar2.getClass();
                if (!(m9nVar2 instanceof k9n)) {
                    if (!(m9nVar2 instanceof l9n)) {
                        t9f.b();
                        return null;
                    }
                    function1.invoke(new ep60(((l9n) m9nVar2).f19662a));
                }
                return Unit.f46060a;
            case 12:
                ((Integer) obj).intValue();
                function1.invoke(qp60.f29101a);
                return Unit.f46060a;
            case 13:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new rp60(str));
                return Unit.f46060a;
            case 14:
                function1.invoke(new y770(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 15:
                function1.invoke(new as70(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 16:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    function1.invoke(new zr70(((w5q0) x5q0Var).f38596a));
                }
                return Unit.f46060a;
            case 17:
                ((pq70) obj).getClass();
                function1.invoke(jq70.f16937a);
                return Unit.f46060a;
            case 18:
                function1.invoke(new z900(((Integer) obj).intValue()));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                View view = (View) obj;
                view.getClass();
                if (function1 != null) {
                    function1.invoke(view);
                }
                return Unit.f46060a;
            case 20:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new g780(str2));
                return Unit.f46060a;
            case 21:
                ((x5q0) obj).getClass();
                function1.invoke(j780.f16029a);
                return Unit.f46060a;
            case 22:
                x5q0 x5q0Var2 = (x5q0) obj;
                x5q0Var2.getClass();
                if (x5q0Var2 instanceof w5q0) {
                    String str3 = ((w5q0) x5q0Var2).f38596a;
                    str3.getClass();
                    function1.invoke(new f780(str3));
                }
                return Unit.f46060a;
            case 23:
                ((jtl) obj).getClass();
                function1.invoke(n780.f23030a);
                return Unit.f46060a;
            case 24:
                function1.invoke(new zb80(((Boolean) obj).booleanValue()));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                function1.invoke(new wb80(bemVar));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                nd50 nd50Var = (nd50) obj;
                nd50Var.getClass();
                if (Intrinsics.d(nd50Var, jd50.f16315a)) {
                    function1.invoke(mn80.f22076a);
                } else if (Intrinsics.d(nd50Var, md50.f21581a)) {
                    function1.invoke(pn80.f27275a);
                }
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj).getClass();
                function1.invoke(jr80.f16992a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                function1.invoke(new br80(((Long) obj).longValue()));
                return Unit.f46060a;
            default:
                st0 st0Var = (st0) obj;
                st0Var.getClass();
                long j = st0Var.f32750a;
                mtr mtrVar = st0Var.d;
                function1.invoke(new cr80(mtrVar != null ? mtrVar.b : false, j));
                return Unit.f46060a;
        }
    }
}
