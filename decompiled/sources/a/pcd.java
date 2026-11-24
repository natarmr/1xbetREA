package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class pcd implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26754a;
    public final /* synthetic */ p3w b;
    public final /* synthetic */ int c;

    public /* synthetic */ pcd(p3w p3wVar, int i, byte b) {
        this.f26754a = b;
        this.b = p3wVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f26754a;
        int i = this.c;
        p3w p3wVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                sj3.x(p3wVar, fetVar, x8x.L(i | 1));
                break;
            default:
                ghm0.b(p3wVar, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
