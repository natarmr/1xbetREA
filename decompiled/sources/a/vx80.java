package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class vx80 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38189a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ lh80 c;
    public final /* synthetic */ int d;

    public /* synthetic */ vx80(mm40 mm40Var, lh80 lh80Var, int i, byte b) {
        this.f38189a = b;
        switch (b) {
            case 1:
                vcg0 vcg0Var = vcg0.f37186a;
                break;
        }
        this.b = mm40Var;
        this.c = lh80Var;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38189a;
        int i = this.d;
        lh80 lh80Var = this.c;
        mm40 mm40Var = this.b;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                bdx.I(mm40Var, lh80Var, (fet) obj, x8x.L(i | 1));
                break;
            default:
                vcg0 vcg0Var = vcg0.f37186a;
                ((Integer) obj2).getClass();
                p7x.i(mm40Var, lh80Var, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
