package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class xxh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41658a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ fqj0 c;
    public final /* synthetic */ byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xxh(mm40 mm40Var, fqj0 fqj0Var, int i, byte b) {
        this.f41658a = b;
        this.b = mm40Var;
        this.c = fqj0Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41658a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ulb.c(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 1:
                p7x.h(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 2:
                piz.a(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            case 3:
                hp4.l(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
            default:
                gnm0.a(this.b, this.c, fetVar, x8x.L(this.d | 1));
                break;
        }
        return Unit.f46060a;
    }
}
