package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kss0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f18832a;
    public final /* synthetic */ float b;

    public /* synthetic */ kss0(float f, byte b) {
        this.f18832a = b;
        this.b = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f18832a;
        float f = this.b;
        switch (b) {
            case 0:
                z3e z3eVar = (z3e) obj;
                z3eVar.getClass();
                z3eVar.c(new u2e("CONTENT_ID"), new kss0(f, (byte) 1));
                break;
            default:
                t2e t2eVar = (t2e) obj;
                t2eVar.getClass();
                t2eVar.c(new wmk(new ycl(56.0f - f), null));
                t2eVar.d(ouu0.c);
                break;
        }
        return Unit.f46060a;
    }
}
