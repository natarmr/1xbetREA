package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final class g8w implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f10884a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ e8w c;

    public /* synthetic */ g8w(Function1 function1, e8w e8wVar, byte b) {
        this.f10884a = b;
        this.b = function1;
        this.c = e8wVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f10884a;
        e8w e8wVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new t7w(e8wVar.d));
                break;
            default:
                function1.invoke(new t7w(e8wVar.d));
                break;
        }
        return Unit.f46060a;
    }
}
