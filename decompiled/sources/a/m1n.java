package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class m1n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f21016a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ i1n d;
    public final /* synthetic */ i1n e;
    public final /* synthetic */ int f;

    public /* synthetic */ m1n(mm40 mm40Var, i1n i1nVar, i1n i1nVar2, String str, int i) {
        x0m x0mVar = x0m.f40076a;
        this.b = mm40Var;
        this.d = i1nVar;
        this.e = i1nVar2;
        this.c = str;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f21016a;
        int i = this.f;
        switch (b) {
            case 0:
                x0m x0mVar = x0m.f40076a;
                ((Integer) obj2).getClass();
                d5c.w(x8x.L(i | 1), this.d, this.e, (fet) obj, this.b, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                d5c.y(x8x.L(i | 1), this.d, this.e, (fet) obj, this.b, this.c);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ m1n(mm40 mm40Var, String str, i1n i1nVar, i1n i1nVar2, int i) {
        this.b = mm40Var;
        this.c = str;
        this.d = i1nVar;
        this.e = i1nVar2;
        this.f = i;
    }
}
