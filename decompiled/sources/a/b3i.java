package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b3i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f1906a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ u3i c;
    public final /* synthetic */ u3i d;
    public final /* synthetic */ u3i e;
    public final /* synthetic */ String f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ int h;

    public /* synthetic */ b3i(mm40 mm40Var, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, String str, Function1 function1, int i, byte b) {
        this.f1906a = b;
        this.b = mm40Var;
        this.c = u3iVar;
        this.d = u3iVar2;
        this.e = u3iVar3;
        this.f = str;
        this.g = function1;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f1906a;
        int i = this.h;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                ibc.h(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                vbc.p(this.b, this.c, this.d, this.e, this.f, this.g, (fet) obj, x8x.L(i | 1));
                break;
        }
        return Unit.f46060a;
    }
}
