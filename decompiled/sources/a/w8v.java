package a;

import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final class w8v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38744a;
    public final Function1 b;

    public /* synthetic */ w8v(Function1 function1, byte b) {
        this.f38744a = b;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        long j;
        switch (this.f38744a) {
            case 0:
                wfk0 wfk0Var = (wfk0) obj;
                synchronized (xfk0.c) {
                    j = xfk0.e;
                    xfk0.e = 1 + j;
                }
                return new wae0(j, wfk0Var, this.b);
            case 1:
                this.b.invoke(new zgw(((Number) obj).longValue()));
                return Unit.f46060a;
            case 2:
                exf exfVar = (exf) obj;
                exfVar.getClass();
                this.b.invoke(new ygw(exfVar));
                return Unit.f46060a;
            case 3:
                sip sipVar = (sip) obj;
                sipVar.getClass();
                this.b.invoke(new lhw(sipVar));
                return Unit.f46060a;
            case 4:
                Function1 function1 = this.b;
                wsy wsyVar = (wsy) obj;
                wsyVar.getClass();
                return function1.invoke(wsyVar).toString();
            case 5:
                String str = (String) obj;
                str.getClass();
                this.b.invoke(new n740(str));
                return Unit.f46060a;
            case 6:
                return this.b.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
            case 7:
                String str2 = (String) obj;
                str2.getClass();
                this.b.invoke(new s350(str2));
                return Unit.f46060a;
            case 8:
                ((String) obj).getClass();
                this.b.invoke(g350.f10596a);
                return Unit.f46060a;
            case 9:
                this.b.invoke(new i450(((Number) obj).longValue()));
                return Unit.f46060a;
            case 10:
                this.b.invoke(new h450(((Number) obj).longValue()));
                return Unit.f46060a;
            case 11:
                this.b.invoke(new y350(((Number) obj).longValue(), gzr0.b));
                return Unit.f46060a;
            case 12:
                m9n m9nVar = (m9n) obj;
                Function1 function2 = this.b;
                m9nVar.getClass();
                if (m9nVar instanceof k9n) {
                    function2.invoke(new hz50());
                } else {
                    if (!(m9nVar instanceof l9n)) {
                        t9f.b();
                        return null;
                    }
                    l9n l9nVar = (l9n) m9nVar;
                    long j2 = l9nVar.f19662a;
                    j9n j9nVar = l9nVar.c;
                    if (j9nVar instanceof g9n) {
                        function2.invoke(new gz50(new zm60(-1, j2, !((g9n) j9nVar).b)));
                    } else if (j9nVar instanceof i9n) {
                        function2.invoke(new dz50(j2));
                    }
                }
                return Unit.f46060a;
            case 13:
                bem bemVar = (bem) obj;
                bemVar.getClass();
                this.b.invoke(new yy50(bemVar));
                return Unit.f46060a;
            case 14:
                ra0 ra0Var = (ra0) obj;
                ra0Var.getClass();
                this.b.invoke(new yx50(ra0Var));
                return Unit.f46060a;
            case 15:
                st0 st0Var = (st0) obj;
                st0Var.getClass();
                this.b.invoke(new ay50(st0Var.f32750a));
                return Unit.f46060a;
            case 16:
                st0 st0Var2 = (st0) obj;
                st0Var2.getClass();
                this.b.invoke(new zx50(st0Var2.f32750a));
                return Unit.f46060a;
            case 17:
                zia ziaVar = (zia) obj;
                ziaVar.getClass();
                this.b.invoke(new oy50(ziaVar));
                return Unit.f46060a;
            case 18:
                o37 o37Var = (o37) obj;
                Function1 function3 = this.b;
                o37Var.getClass();
                if (o37Var instanceof e27) {
                    String str3 = ((e27) o37Var).f7071a;
                    str3.getClass();
                    function3.invoke(new ui7(str3));
                } else if (o37Var instanceof f27) {
                    String str4 = ((f27) o37Var).f8798a;
                    str4.getClass();
                    function3.invoke(new yi7(str4));
                } else if (o37Var instanceof h27) {
                    String str5 = ((h27) o37Var).f12318a;
                    str5.getClass();
                    function3.invoke(new zi7(str5));
                } else if (o37Var instanceof g27) {
                    String str6 = ((g27) o37Var).f10549a;
                    str6.getClass();
                    function3.invoke(new hj7(str6));
                } else if (o37Var instanceof r27) {
                    function3.invoke(ri7.f30526a);
                } else if (o37Var instanceof t27) {
                    t27 t27Var = (t27) o37Var;
                    function3.invoke(new vi7(t27Var.f33202a, t27Var.b));
                }
                return Unit.f46060a;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                String str7 = (String) obj;
                str7.getClass();
                this.b.invoke(new x900(str7));
                return Unit.f46060a;
            case 20:
                ra0 ra0Var2 = (ra0) obj;
                ra0Var2.getClass();
                this.b.invoke(new bb80(ra0Var2));
                return Unit.f46060a;
            case 21:
                st0 st0Var3 = (st0) obj;
                st0Var3.getClass();
                this.b.invoke(new ob80(st0Var3.f32750a));
                return Unit.f46060a;
            case 22:
                st0 st0Var4 = (st0) obj;
                st0Var4.getClass();
                this.b.invoke(new cb80(st0Var4.f32750a));
                return Unit.f46060a;
            case 23:
                this.b.invoke(new eb80((int) ((Number) obj).longValue()));
                return Unit.f46060a;
            case 24:
                m9n m9nVar2 = (m9n) obj;
                Function1 function4 = this.b;
                m9nVar2.getClass();
                if (m9nVar2 instanceof k9n) {
                    function4.invoke(new sb80());
                } else {
                    if (!(m9nVar2 instanceof l9n)) {
                        t9f.b();
                        return null;
                    }
                    l9n l9nVar2 = (l9n) m9nVar2;
                    j9n j9nVar2 = l9nVar2.c;
                    if (j9nVar2 instanceof g9n) {
                        function4.invoke(new rb80(new zm60(-1, l9nVar2.f19662a, !((g9n) j9nVar2).b)));
                    }
                }
                return Unit.f46060a;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                String str8 = (String) obj;
                str8.getClass();
                this.b.invoke(new jy80(str8));
                return Unit.f46060a;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                ow80 ow80Var = (ow80) obj;
                ow80Var.getClass();
                this.b.invoke(new gy80(ow80Var));
                return Unit.f46060a;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                wy30 wy30Var = (wy30) obj;
                wy30Var.getClass();
                this.b.invoke(new pu30(wy30Var));
                return Unit.f46060a;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                wy30 wy30Var2 = (wy30) obj;
                wy30Var2.getClass();
                this.b.invoke(new pu30(wy30Var2));
                return Unit.f46060a;
            default:
                wgl0 wgl0Var = (wgl0) obj;
                wgl0Var.getClass();
                if (wgl0Var instanceof vgl0) {
                    this.b.invoke(new l6a0(new y030(((vgl0) wgl0Var).f37387a)));
                }
                return Unit.f46060a;
        }
    }
}
