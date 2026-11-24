package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ysm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43174a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ w1n c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ysm(mm40 mm40Var, w1n w1nVar, int i, int i2, byte b) {
        this.f43174a = b;
        this.b = mm40Var;
        this.c = w1nVar;
        this.d = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43174a;
        boolean z = this.d;
        w1n w1nVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                rcb.O(mm40Var, w1nVar, fetVar, x8x.L(1), z ? 1 : 0);
                break;
            default:
                vdb.N(mm40Var, w1nVar, fetVar, x8x.L(1), z ? 1 : 0);
                break;
        }
        return Unit.f46060a;
    }
}
