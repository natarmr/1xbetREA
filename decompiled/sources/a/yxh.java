package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yxh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43421a;
    public final /* synthetic */ long b;
    public final /* synthetic */ fqj0 c;

    public /* synthetic */ yxh(long j, fqj0 fqj0Var, int i, byte b) {
        this.f43421a = b;
        this.b = j;
        this.c = fqj0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43421a;
        fqj0 fqj0Var = this.c;
        long j = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ulb.x(j, fqj0Var, fetVar, x8x.L(1));
                break;
            case 1:
                pzw.r(j, fqj0Var, fetVar, x8x.L(1));
                break;
            case 2:
                g8x.o(j, fqj0Var, fetVar, x8x.L(1));
                break;
            case 3:
                m8x.D(j, fqj0Var, fetVar, x8x.L(1));
                break;
            case 4:
                x8x.i(j, fqj0Var, fetVar, x8x.L(1));
                break;
            case 5:
                piz.y(j, fqj0Var, fetVar, x8x.L(1));
                break;
            case 6:
                zdx.q(j, fqj0Var, fetVar, x8x.L(1));
                break;
            case 7:
                uc9.I(j, fqj0Var, fetVar, x8x.L(1));
                break;
            case 8:
                knm0.b(j, fqj0Var, fetVar, x8x.L(1));
                break;
            default:
                gnm0.c(j, fqj0Var, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
