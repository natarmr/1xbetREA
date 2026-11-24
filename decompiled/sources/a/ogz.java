package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class ogz implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25239a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ sgz c;

    public /* synthetic */ ogz(Function1 function1, sgz sgzVar, byte b) {
        this.f25239a = b;
        this.b = function1;
        this.c = sgzVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f25239a;
        sgz sgzVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(sgzVar.f32184a);
                break;
            default:
                function1.invoke(sgzVar.f32184a);
                break;
        }
        return Unit.f46060a;
    }
}
