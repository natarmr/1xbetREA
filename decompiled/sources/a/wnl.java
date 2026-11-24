package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class wnl implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f39455a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ b0i d;
    public final /* synthetic */ hh80 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ int h;

    public /* synthetic */ wnl(mm40 mm40Var, List list, b0i b0iVar, hh80 hh80Var, Function1 function1, Function2 function2, int i, byte b) {
        this.f39455a = b;
        this.b = mm40Var;
        this.c = list;
        this.d = b0iVar;
        this.e = hh80Var;
        this.f = function1;
        this.g = function2;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f39455a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                wvb.l(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                wvb.n(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
