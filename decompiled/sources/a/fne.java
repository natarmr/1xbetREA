package a;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.MatchResult;

/* JADX INFO: loaded from: classes2.dex */
public final class fne extends guy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9832a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fne(Object obj, Object obj2, byte b) {
        super(1);
        this.f9832a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f9832a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                Throwable th = (Throwable) obj;
                tu9 tu9Var = (tu9) obj2;
                if (th == null) {
                    tu9Var.b(((kzj) obj3).B());
                } else if (th instanceof CancellationException) {
                    tu9Var.c();
                } else {
                    tu9Var.d(th);
                }
                return Unit.f46060a;
            case 1:
                j jVar = (j) obj;
                jVar.getClass();
                return ((d0x) obj2).e(jVar, (String) obj3);
            case 2:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                return (CharSequence) ((Function2) ((dw00) obj2).h.getValue()).invoke(matchResult, ((pls0) obj3).next());
            default:
                ((ou90) obj).g((pu90) obj2, 0, 0, ((b3w0) obj3).o);
                return Unit.f46060a;
        }
    }
}
