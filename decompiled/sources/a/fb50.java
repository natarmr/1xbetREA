package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class fb50 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f9240a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ fb50(byte b, int i, boolean z) {
        this.f9240a = b;
        this.b = z;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f9240a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                gfx.h(x8x.L(this.c | 1), fetVar, this.b);
                break;
            case 1:
                gfx.h(x8x.L(this.c | 1), fetVar, this.b);
                break;
            default:
                gnm0.d(x8x.L(this.c | 1), fetVar, this.b);
                break;
        }
        return Unit.f46060a;
    }
}
