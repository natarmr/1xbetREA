package a;

import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class wod0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39491a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ epd0 c;

    public /* synthetic */ wod0(epd0 epd0Var, Function1 function1) {
        this.f39491a = (byte) 13;
        this.c = epd0Var;
        this.b = function1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f39491a;
        epd0 epd0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new xnd0(epd0Var.d));
                break;
            case 1:
                function1.invoke(new und0(epd0Var.b));
                break;
            case 2:
                function1.invoke(new und0(epd0Var.b));
                break;
            case 3:
                function1.invoke(new wnd0(epd0Var.c));
                break;
            case 4:
                function1.invoke(new wnd0(epd0Var.c));
                break;
            case 5:
                function1.invoke(new xnd0(epd0Var.d));
                break;
            case 6:
                function1.invoke(new xnd0(epd0Var.d));
                break;
            case 7:
                String str = epd0Var.f;
                function1.invoke(str != null ? new vnd0(str) : null);
                break;
            case 8:
                String str2 = epd0Var.f;
                function1.invoke(str2 != null ? new vnd0(str2) : null);
                break;
            case 9:
                String str3 = epd0Var.f;
                function1.invoke(str3 != null ? new vnd0(str3) : null);
                break;
            case 10:
                function1.invoke(new und0(epd0Var.b));
                break;
            case 11:
                function1.invoke(new wnd0(epd0Var.c));
                break;
            case 12:
                function1.invoke(new xnd0(epd0Var.d));
                break;
            case 13:
                String str4 = epd0Var.f;
                if (str4 != null) {
                    function1.invoke(new vnd0(str4));
                }
                break;
            case 14:
                function1.invoke(new und0(epd0Var.b));
                break;
            case 15:
                function1.invoke(new wnd0(epd0Var.c));
                break;
            case 16:
                function1.invoke(new und0(epd0Var.b));
                break;
            case 17:
                function1.invoke(new xnd0(epd0Var.d));
                break;
            case 18:
                function1.invoke(new und0(epd0Var.b));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                function1.invoke(new wnd0(epd0Var.c));
                break;
            case 20:
                function1.invoke(new wnd0(epd0Var.c));
                break;
            default:
                function1.invoke(new xnd0(epd0Var.d));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ wod0(byte b, epd0 epd0Var, Function1 function1) {
        this.f39491a = b;
        this.b = function1;
        this.c = epd0Var;
    }
}
