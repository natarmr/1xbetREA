package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class erm implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8289a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Function1 c;

    public /* synthetic */ erm(Function1 function1, Function1 function2, byte b) {
        this.f8289a = b;
        this.b = function1;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f8289a;
        Function1 function1 = this.c;
        Function1 function2 = this.b;
        switch (b) {
            case 0:
                Float f = (Float) obj;
                f.floatValue();
                function2.invoke(f);
                function1.invoke(f);
                break;
            case 1:
                function2.invoke(obj);
                function1.invoke(obj);
                break;
            default:
                function2.invoke(obj);
                function1.invoke(obj);
                break;
        }
        return Unit.f46060a;
    }
}
