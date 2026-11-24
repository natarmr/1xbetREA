package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class xg10 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f40820a;
    public final /* synthetic */ l7m0 b;
    public final /* synthetic */ int c;

    public /* synthetic */ xg10(l7m0 l7m0Var, int i, byte b) {
        this.f40820a = b;
        this.b = l7m0Var;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f40820a;
        int i = this.c;
        l7m0 l7m0Var = this.b;
        fet fetVar = (fet) obj;
        Integer num = (Integer) obj2;
        switch (b) {
            case 0:
                num.getClass();
                m0x0.j(l7m0Var, fetVar, x8x.L(i | 1));
                break;
            default:
                num.intValue();
                gnm0.b(l7m0Var, fetVar, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
