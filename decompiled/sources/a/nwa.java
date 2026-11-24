package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class nwa implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24225a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ n0x c;

    public /* synthetic */ nwa(mm40 mm40Var, n0x n0xVar, int i, byte b) {
        this.f24225a = b;
        this.b = mm40Var;
        this.c = n0xVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f24225a;
        n0x n0xVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                oja0.O(mm40Var, n0xVar, fetVar, x8x.L(1));
                break;
            case 1:
                ro4.B(mm40Var, n0xVar, fetVar, x8x.L(1));
                break;
            default:
                tke.B(mm40Var, n0xVar, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
