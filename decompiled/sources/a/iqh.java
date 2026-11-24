package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class iqh implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15210a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ byte d;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ iqh(int i, a4x a4xVar, mm40 mm40Var) {
        this.f15210a = (byte) 2;
        this.b = mm40Var;
        this.c = a4xVar;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15210a;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                obb.h(this.d, x8x.L(1), fetVar, this.c, this.b);
                break;
            case 1:
                v3c.y(this.d, x8x.L(1), fetVar, this.c, this.b);
                break;
            default:
                v2n0.h(x8x.L(this.d | 1), fetVar, this.c, this.b);
                break;
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ iqh(mm40 mm40Var, a4x a4xVar, int i, int i2, byte b) {
        this.f15210a = b;
        this.b = mm40Var;
        this.c = a4xVar;
        this.d = i;
    }
}
