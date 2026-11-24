package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class nzl implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24379a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ long c;

    public /* synthetic */ nzl(byte b, long j, Function1 function1) {
        this.f24379a = b;
        this.b = function1;
        this.c = j;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f24379a;
        long j = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                ((wgl0) obj).getClass();
                function1.invoke(new hzl(j));
                break;
            case 1:
                ox oxVar = (ox) obj;
                oxVar.getClass();
                function1.invoke(new o110(oxVar, (int) (j >> 32)));
                break;
            case 2:
                ox oxVar2 = (ox) obj;
                oxVar2.getClass();
                function1.invoke(new zvd0(oxVar2, (int) (j >> 32)));
                break;
            default:
                ox oxVar3 = (ox) obj;
                oxVar3.getClass();
                function1.invoke(new iyt0(oxVar3, (int) (j >> 32)));
                break;
        }
        return Unit.f46060a;
    }
}
