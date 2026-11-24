package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class n1n implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22759a = 0;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ j1n d;
    public final /* synthetic */ j1n e;
    public final /* synthetic */ int f;

    public /* synthetic */ n1n(mm40 mm40Var, j1n j1nVar, j1n j1nVar2, String str, int i) {
        x0m x0mVar = x0m.f40076a;
        this.b = mm40Var;
        this.d = j1nVar;
        this.e = j1nVar2;
        this.c = str;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f22759a;
        int i = this.f;
        switch (b) {
            case 0:
                x0m x0mVar = x0m.f40076a;
                ((Integer) obj2).getClass();
                aac.B(x8x.L(i | 1), this.d, this.e, (fet) obj, this.b, this.c);
                break;
            default:
                ((Integer) obj2).getClass();
                aac.H(x8x.L(i | 1), this.d, this.e, (fet) obj, this.b, this.c);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ n1n(mm40 mm40Var, String str, j1n j1nVar, j1n j1nVar2, int i) {
        this.b = mm40Var;
        this.c = str;
        this.d = j1nVar;
        this.e = j1nVar2;
        this.f = i;
    }
}
