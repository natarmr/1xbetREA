package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class cak0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4016a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cak0(Object obj, float f, float f2, int i, byte b) {
        this.f4016a = b;
        this.d = obj;
        this.b = f;
        this.c = f2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f4016a;
        float f = this.c;
        float f2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                dak0.d((g960) obj3, f2, f, (fet) obj, x8x.L(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                rq8.e((qbp0) obj3, f2, f, (fet) obj, x8x.L(1));
                break;
            default:
                ((Integer) obj2).getClass();
                aad.c((edt0) obj3, f2, f, (fet) obj, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
