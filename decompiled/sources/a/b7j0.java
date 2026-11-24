package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class b7j0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2113a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ xcz c;
    public final /* synthetic */ Function1 d;

    public /* synthetic */ b7j0(a4x a4xVar, xcz xczVar, Function1 function1, int i, byte b) {
        this.f2113a = b;
        this.b = a4xVar;
        this.c = xczVar;
        this.d = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f2113a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                w9x.u(this.b, this.c, this.d, fetVar, x8x.L(385));
                break;
            default:
                gnm0.e(this.b, this.c, this.d, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
