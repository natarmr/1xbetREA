package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.feed.notifictation.data.NotificationInfoUiModel;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vwj implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38153a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ p6t0 c;

    public /* synthetic */ vwj(Function1 function1, p6t0 p6t0Var, byte b) {
        this.f38153a = b;
        this.b = function1;
        this.c = p6t0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f38153a;
        p6t0 p6t0Var = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new khw(((nuj) p6t0Var).f24150a));
                break;
            case 1:
                akw akwVar = (akw) p6t0Var;
                function1.invoke(new shw(akwVar.c, akwVar.b));
                break;
            case 2:
                String str = ((gc6) p6t0Var).c;
                str.getClass();
                function1.invoke(new h1l(str));
                break;
            case 3:
                NotificationInfoUiModel notificationInfoUiModel = ((b760) p6t0Var).f2089a;
                function1.invoke(new ums(notificationInfoUiModel, !notificationInfoUiModel.c));
                break;
            case 4:
                function1.invoke(new ocw(((idw) p6t0Var).b));
                break;
            case 5:
                String str2 = ((gc6) p6t0Var).c;
                str2.getClass();
                function1.invoke(new jy00(str2));
                break;
            case 6:
                zog zogVar = (zog) p6t0Var;
                function1.invoke(new q110(zogVar.c, zogVar.d));
                break;
            case 7:
                String str3 = ((gc6) p6t0Var).c;
                str3.getClass();
                function1.invoke(new p110(str3));
                break;
            case 8:
                zog zogVar2 = (zog) p6t0Var;
                function1.invoke(new awd0(zogVar2.c, zogVar2.d));
                break;
            case 9:
                zog zogVar3 = (zog) p6t0Var;
                function1.invoke(new jyt0(zogVar3.c, zogVar3.d));
                break;
            case 10:
                function1.invoke(new ynu0(((hqu0) p6t0Var).b));
                break;
            case 11:
                function1.invoke(new zou0(((qpu0) p6t0Var).f29138a));
                break;
            case 12:
                function1.invoke(new bpu0(((vpu0) p6t0Var).b));
                break;
            default:
                function1.invoke(new rqu0(((tru0) p6t0Var).b));
                break;
        }
        return Unit.f46060a;
    }
}
