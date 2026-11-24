package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class njw implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f23655a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;

    public /* synthetic */ njw(float f, int i, byte b) {
        this.f23655a = b;
        this.b = f;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f23655a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                n4c.F(this.b, fetVar, x8x.L(this.c | 1));
                break;
            default:
                n4c.t(this.b, fetVar, x8x.L(this.c | 1));
                break;
        }
        return Unit.f46060a;
    }
}
