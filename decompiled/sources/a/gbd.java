package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.xplatform.bet_history.history.domain.model.HistoryMenuItem;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gbd implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11012a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ p3w c;

    public /* synthetic */ gbd(Function1 function1, p3w p3wVar, byte b) {
        this.f11012a = b;
        this.b = function1;
        this.c = p3wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f11012a;
        p3w p3wVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                String str = p3wVar.b;
                str.getClass();
                function1.invoke(new e27(str));
                break;
            case 1:
                String str2 = p3wVar.b;
                str2.getClass();
                function1.invoke(new e27(str2));
                break;
            case 2:
                function1.invoke(new h27(p3wVar.b, !p3wVar.j));
                break;
            case 3:
                String str3 = p3wVar.b;
                str3.getClass();
                function1.invoke(new f27(str3));
                break;
            case 4:
                String str4 = p3wVar.b;
                str4.getClass();
                function1.invoke(new e27(str4));
                break;
            case 5:
                String str5 = p3wVar.b;
                str5.getClass();
                function1.invoke(new g27(str5));
                break;
            case 6:
                function1.invoke(new t27(HistoryMenuItem.c, p3wVar.b));
                break;
            case 7:
                String str6 = p3wVar.b;
                str6.getClass();
                function1.invoke(new f27(str6));
                break;
            default:
                function1.invoke(new h27(p3wVar.b, !p3wVar.j));
                break;
        }
        return Unit.f46060a;
    }
}
