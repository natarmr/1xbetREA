package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ran implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30144a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ int c;

    public /* synthetic */ ran(Function2 function2, int i, byte b) {
        this.f30144a = b;
        this.b = function2;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f30144a;
        int i = this.c;
        Function2 function2 = this.b;
        switch (b) {
            case 0:
                i8z i8zVar = (i8z) obj;
                i8zVar.getClass();
                function2.invoke(i8zVar, Integer.valueOf(i));
                break;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                function2.invoke(Integer.valueOf(i), bool);
                break;
        }
        return Unit.f46060a;
    }
}
