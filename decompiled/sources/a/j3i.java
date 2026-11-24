package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class j3i implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15834a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ b4i c;
    public final /* synthetic */ u3i d;
    public final /* synthetic */ u3i e;
    public final /* synthetic */ u3i f;
    public final /* synthetic */ String g;
    public final /* synthetic */ Function1 h;
    public final /* synthetic */ int i;

    public /* synthetic */ j3i(mm40 mm40Var, b4i b4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, String str, Function1 function1, int i) {
        this.b = mm40Var;
        this.c = b4iVar;
        this.d = u3iVar;
        this.e = u3iVar2;
        this.f = u3iVar3;
        this.g = str;
        this.h = function1;
        this.i = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15834a;
        int i = this.i;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                obc.j(x8x.L(i | 1), this.d, this.e, this.f, this.c, (fet) obj, this.b, this.g, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                qbc.f(x8x.L(i | 1), this.d, this.e, this.f, this.c, (fet) obj, this.b, this.g, this.h);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ j3i(mm40 mm40Var, String str, b4i b4iVar, u3i u3iVar, u3i u3iVar2, u3i u3iVar3, Function1 function1, int i) {
        this.b = mm40Var;
        this.g = str;
        this.c = b4iVar;
        this.d = u3iVar;
        this.e = u3iVar2;
        this.f = u3iVar3;
        this.h = function1;
        this.i = i;
    }
}
