package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes2.dex */
public final class bp40 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2963a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ bp40(Function1 function1, int i, byte b) {
        this.f2963a = b;
        this.b = function1;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2963a;
        int i = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new ro40(i));
                break;
            case 1:
                function1.invoke(Integer.valueOf(i));
                break;
            case 2:
                function1.invoke(Integer.valueOf(i));
                break;
            case 3:
                function1.invoke(new o8i0(i));
                break;
            case 4:
                function1.invoke(new eli0(i));
                break;
            case 5:
                function1.invoke(new tjq0(i));
                break;
            default:
                function1.invoke(Integer.valueOf(i));
                break;
        }
        return Unit.f46060a;
    }
}
