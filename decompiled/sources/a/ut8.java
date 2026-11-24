package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class ut8 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f36245a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ mdm c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ byte g;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ut8(mm40 mm40Var, mdm mdmVar, boolean z, Function0 function0, int i, int i2, byte b) {
        this.f36245a = b;
        this.b = mm40Var;
        this.c = mdmVar;
        this.d = z;
        this.e = function0;
        this.f = i;
        this.g = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f36245a) {
            case 0:
                ((Integer) obj2).getClass();
                vbw0.j(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1), this.g);
                break;
            default:
                ((Integer) obj2).getClass();
                jcb.l(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(this.f | 1), this.g);
                break;
        }
        return Unit.f46060a;
    }
}
