package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hp0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13418a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ n0x d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Function0 f;

    public /* synthetic */ hp0(mm40 mm40Var, String str, n0x n0xVar, boolean z, Function0 function0, int i, byte b) {
        this.f13418a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = n0xVar;
        this.e = z;
        this.f = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13418a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                nia0.G(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                xia0.A(this.b, this.c, this.d, this.e, this.f, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }
}
