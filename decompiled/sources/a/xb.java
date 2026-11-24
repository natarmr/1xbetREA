package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import com.huawei.hms.api.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xb implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40576a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ cp c;

    public /* synthetic */ xb(Function1 function1, cp cpVar, byte b) {
        this.f40576a = b;
        this.b = function1;
        this.c = cpVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f40576a;
        cp cpVar = this.c;
        Function1 function1 = this.b;
        View view = (View) obj;
        switch (b) {
            case 0:
                axq.w(view, cpVar, function1);
                break;
            case 1:
                axq.w(view, cpVar, function1);
                break;
            case 2:
                axq.w(view, cpVar, function1);
                break;
            case 3:
                axq.w(view, cpVar, function1);
                break;
            case 4:
                axq.w(view, cpVar, function1);
                break;
            case 5:
                axq.w(view, cpVar, function1);
                break;
            case 6:
                axq.w(view, cpVar, function1);
                break;
            case 7:
                axq.w(view, cpVar, function1);
                break;
            case 8:
                axq.w(view, cpVar, function1);
                break;
            case 9:
                view.getClass();
                function1.invoke(Integer.valueOf(cpVar.c()));
                break;
            case 10:
                axq.w(view, cpVar, function1);
                break;
            case 11:
                axq.w(view, cpVar, function1);
                break;
            case 12:
                axq.w(view, cpVar, function1);
                break;
            case 13:
                axq.w(view, cpVar, function1);
                break;
            case 14:
                axq.w(view, cpVar, function1);
                break;
            case 15:
                axq.w(view, cpVar, function1);
                break;
            case 16:
                axq.w(view, cpVar, function1);
                break;
            case 17:
                axq.w(view, cpVar, function1);
                break;
            case 18:
                view.getClass();
                function1.invoke(Long.valueOf(((jse) cpVar.u()).f17047a));
                break;
            case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                view.getClass();
                function1.invoke(Long.valueOf(((vte) cpVar.u()).f38002a));
                break;
            case 20:
                view.getClass();
                function1.invoke(Long.valueOf(((vte) cpVar.u()).f38002a));
                break;
            case 21:
                axq.w(view, cpVar, function1);
                break;
            case 22:
                axq.w(view, cpVar, function1);
                break;
            case 23:
                axq.w(view, cpVar, function1);
                break;
            case 24:
                axq.w(view, cpVar, function1);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
                axq.w(view, cpVar, function1);
                break;
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
                axq.w(view, cpVar, function1);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                axq.w(view, cpVar, function1);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                axq.w(view, cpVar, function1);
                break;
            default:
                axq.w(view, cpVar, function1);
                break;
        }
        return Unit.f46060a;
    }
}
