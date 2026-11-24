package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class tam implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f33619a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ tam(int i, long j, Function0 function0, int i2) {
        this.b = i;
        this.c = j;
        this.d = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f33619a;
        int i = this.b;
        long j = this.c;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ((Integer) obj2).intValue();
                kbc.C((a4x) obj3, j, (fet) obj, x8x.L(i | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL = x8x.L(1);
                z5n.a(this.b, this.c, (Function0) obj3, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                w9x.n(j, (ugd) obj3, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ tam(long j, ugd ugdVar, int i) {
        this.c = j;
        this.d = ugdVar;
        this.b = i;
    }

    public /* synthetic */ tam(a4x a4xVar, long j, int i) {
        this.d = a4xVar;
        this.c = j;
        this.b = i;
    }
}
