package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class eus0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8439a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eus0(Object obj, int i, byte b) {
        this.f8439a = b;
        this.c = obj;
        this.b = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f8439a;
        int i = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                hew0.F((fus0) obj3, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).intValue();
                iym0.l((rdv0) obj3, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
