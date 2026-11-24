package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class tmh implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f34194a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ smh c;

    public /* synthetic */ tmh(Function1 function1, smh smhVar, byte b) {
        this.f34194a = b;
        this.b = function1;
        this.c = smhVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f34194a;
        smh smhVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(smhVar);
                break;
            case 1:
                function1.invoke(smhVar);
                break;
            default:
                function1.invoke(smhVar);
                break;
        }
        return Unit.f46060a;
    }
}
