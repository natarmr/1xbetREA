package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class t1g implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33166a;
    public final /* synthetic */ w1g b;
    public final /* synthetic */ int c;

    public /* synthetic */ t1g(w1g w1gVar, int i, byte b) {
        this.f33166a = b;
        this.b = w1gVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33166a;
        int i = this.c;
        w1g w1gVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                o2e.s(w1gVar, fetVar, x8x.L(i | 1));
                break;
            default:
                o2e.z(w1gVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
