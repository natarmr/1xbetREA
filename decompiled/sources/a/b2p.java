package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class b2p implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1863a;
    public final /* synthetic */ bzl b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ bdz f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ int h;

    public /* synthetic */ b2p(bzl bzlVar, a4x a4xVar, boolean z, boolean z2, bdz bdzVar, Function1 function1, int i, byte b) {
        this.f1863a = b;
        this.b = bzlVar;
        this.c = a4xVar;
        this.d = z;
        this.e = z2;
        this.f = bdzVar;
        this.g = function1;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1863a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                uc9.t(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                q8a.n(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
