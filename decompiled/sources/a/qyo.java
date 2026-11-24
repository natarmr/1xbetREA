package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qyo implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f29543a;
    public final /* synthetic */ Function1 b;

    public /* synthetic */ qyo(Function1 function1, byte b) {
        this.f29543a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f29543a;
        w8q w8qVar = w8q.f38735a;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                x5q0 x5q0Var = (x5q0) obj;
                x5q0Var.getClass();
                if (x5q0Var instanceof w5q0) {
                    function1.invoke(new rxo(((w5q0) x5q0Var).f38596a));
                }
                return Unit.f46060a;
            case 1:
                x5q0 x5q0Var2 = (x5q0) obj;
                x5q0Var2.getClass();
                if (x5q0Var2 instanceof w5q0) {
                    function1.invoke(new txo(((w5q0) x5q0Var2).f38596a));
                }
                return Unit.f46060a;
            case 2:
                ((jtl) obj).getClass();
                function1.invoke(qxo.f29494a);
                return Unit.f46060a;
            case 3:
                ra0 ra0Var = (ra0) obj;
                ra0Var.getClass();
                function1.invoke(new ha0(ra0Var));
                return Unit.f46060a;
            case 4:
                st0 st0Var = (st0) obj;
                st0Var.getClass();
                function1.invoke(new la0(st0Var.f32750a));
                return Unit.f46060a;
            case 5:
                st0 st0Var2 = (st0) obj;
                st0Var2.getClass();
                function1.invoke(new ia0(st0Var2));
                return Unit.f46060a;
            case 6:
                ((Integer) obj).intValue();
                function1.invoke(w3p.f38512a);
                return Unit.f46060a;
            case 7:
                String str = (String) obj;
                str.getClass();
                function1.invoke(new u3p(str));
                return Unit.f46060a;
            case 8:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                function1.invoke(new p3p(bemVar));
                return Unit.f46060a;
            case 9:
                m9n m9nVar = (m9n) obj;
                m9nVar.getClass();
                if (m9nVar instanceof k9n) {
                    function1.invoke(new k2t());
                } else {
                    if (!(m9nVar instanceof l9n)) {
                        t9f.b();
                        return null;
                    }
                    l9n l9nVar = (l9n) m9nVar;
                    long j = l9nVar.f19662a;
                    j9n j9nVar = l9nVar.c;
                    if (j9nVar instanceof g9n) {
                        function1.invoke(new j2t(new zm60(-1, j, !((g9n) j9nVar).b)));
                    } else if (j9nVar instanceof i9n) {
                        function1.invoke(new e2t(j));
                    }
                }
                return Unit.f46060a;
            case 10:
                m9n m9nVar2 = (m9n) obj;
                m9nVar2.getClass();
                if (m9nVar2 instanceof k9n) {
                    function1.invoke(new k2t());
                } else {
                    if (!(m9nVar2 instanceof l9n)) {
                        t9f.b();
                        return null;
                    }
                    l9n l9nVar2 = (l9n) m9nVar2;
                    long j2 = l9nVar2.f19662a;
                    j9n j9nVar2 = l9nVar2.c;
                    if (j9nVar2 instanceof g9n) {
                        function1.invoke(new j2t(new zm60(-1, j2, !((g9n) j9nVar2).b)));
                    } else if (j9nVar2 instanceof i9n) {
                        function1.invoke(new e2t(j2));
                    }
                }
                return Unit.f46060a;
            case 11:
                String str2 = (String) obj;
                str2.getClass();
                function1.invoke(new chp(str2));
                return Unit.f46060a;
            case 12:
                String str3 = (String) obj;
                str3.getClass();
                function1.invoke(new iim(str3));
                return Unit.f46060a;
            case 13:
                function1.invoke(new him(((Boolean) obj).booleanValue()));
                return Unit.f46060a;
            case 14:
                function1.invoke(new fim(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 15:
                function1.invoke(new fim(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 16:
                String str4 = (String) obj;
                str4.getClass();
                function1.invoke(new iim(str4));
                return Unit.f46060a;
            case 17:
                function1.invoke(new him(((Boolean) obj).booleanValue()));
                return Unit.f46060a;
            case 18:
                function1.invoke(new fim(((Integer) obj).intValue()));
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                String str5 = (String) obj;
                str5.getClass();
                function1.invoke(new iim(str5));
                return Unit.f46060a;
            case 20:
                function1.invoke(new him(((Boolean) obj).booleanValue()));
                return Unit.f46060a;
            case 21:
                function1.invoke(new fim(((Integer) obj).intValue()));
                return Unit.f46060a;
            case 22:
                String str6 = (String) obj;
                str6.getClass();
                function1.invoke(new iim(str6));
                return Unit.f46060a;
            case 23:
                function1.invoke(new him(((Boolean) obj).booleanValue()));
                return Unit.f46060a;
            case 24:
                bem bemVar2 = (bem) obj;
                bemVar2.getClass();
                function1.invoke(new evp(bemVar2));
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                function1.invoke(new jvp(((Long) obj).longValue()));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                String str7 = (String) obj;
                str7.getClass();
                function1.invoke(new ivp(str7));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ((Integer) obj).intValue();
                function1.invoke(d4q.f5467a);
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ((Integer) obj).intValue();
                function1.invoke(w8qVar);
                return Unit.f46060a;
            default:
                ((Integer) obj).intValue();
                function1.invoke(w8qVar);
                return Unit.f46060a;
        }
    }
}
