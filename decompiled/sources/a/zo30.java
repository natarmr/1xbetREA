package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zo30 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44699a;
    public final /* synthetic */ clp b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;

    public /* synthetic */ zo30(clp clpVar, boolean z, boolean z2, Function1 function1, int i, byte b) {
        this.f44699a = b;
        this.b = clpVar;
        this.c = z;
        this.d = z2;
        this.e = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f44699a) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                b34.O(this.b, this.c, this.d, this.e, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(1);
                uc9.N(this.b, this.c, this.d, this.e, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(1);
                ny9.I(this.b, this.c, this.d, this.e, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }
}
