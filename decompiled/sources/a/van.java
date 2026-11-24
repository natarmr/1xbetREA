package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class van implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37098a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ wim c;
    public final /* synthetic */ w2v0 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;

    public /* synthetic */ van(mm40 mm40Var, wim wimVar, w2v0 w2v0Var, Function1 function1, int i, byte b) {
        this.f37098a = b;
        this.b = mm40Var;
        this.c = wimVar;
        this.d = w2v0Var;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37098a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                phu0.u(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                i4w0.z(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                vbw0.z(this.b, this.c, this.d, this.e, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
