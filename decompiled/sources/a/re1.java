package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class re1 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f30313a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ re1(Function1 function1, int i, byte b) {
        this.f30313a = b;
        this.b = function1;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f30313a;
        int i = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new ad1(i));
                break;
            case 1:
                function1.invoke(Integer.valueOf(i));
                break;
            case 2:
                function1.invoke(Integer.valueOf(i));
                break;
            case 3:
                function1.invoke(Integer.valueOf(i));
                break;
            case 4:
                function1.invoke(Integer.valueOf(i));
                break;
            case 5:
                function1.invoke(Integer.valueOf(i));
                break;
            case 6:
                function1.invoke(Integer.valueOf(i));
                break;
            case 7:
                function1.invoke(Integer.valueOf(i));
                break;
            case 8:
                function1.invoke(Integer.valueOf(i));
                break;
            case 9:
                function1.invoke(Integer.valueOf(i));
                break;
            case 10:
                function1.invoke(Integer.valueOf(i));
                break;
            case 11:
                function1.invoke(Integer.valueOf(i));
                break;
            case 12:
                function1.invoke(Integer.valueOf(i));
                break;
            case 13:
                function1.invoke(Integer.valueOf(i));
                break;
            case 14:
                function1.invoke(Integer.valueOf(i));
                break;
            case 15:
                function1.invoke(Integer.valueOf(i));
                break;
            case 16:
                function1.invoke(Integer.valueOf(i + 1));
                break;
            default:
                function1.invoke(Integer.valueOf(i + 1));
                break;
        }
        return Unit.f46060a;
    }
}
