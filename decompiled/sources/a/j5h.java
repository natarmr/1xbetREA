package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j5h implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15933a;
    public final /* synthetic */ l5h b;

    public /* synthetic */ j5h(l5h l5hVar, int i, byte b) {
        this.f15933a = b;
        this.b = l5hVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15933a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                knx.u(this.b, fetVar, x8x.L(1));
                break;
            default:
                knx.D(this.b, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
