package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class j6m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15995a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    public /* synthetic */ j6m(mm40 mm40Var, long j, String str, a4x a4xVar, boolean z, Function1 function1, int i) {
        this.b = mm40Var;
        this.c = j;
        this.g = str;
        this.h = a4xVar;
        this.d = z;
        this.e = function1;
        this.f = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15995a;
        int i = this.f;
        Object obj3 = this.h;
        Object obj4 = this.g;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                mm40 mm40Var = this.b;
                slb.m(mm40Var, (d8n) obj4, this.d, this.c, this.e, (Function1) obj3, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                mm40 mm40Var2 = this.b;
                long j = this.c;
                ieb.q(mm40Var2, j, (String) obj4, (a4x) obj3, this.d, this.e, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ j6m(mm40 mm40Var, d8n d8nVar, boolean z, long j, Function1 function1, Function1 function2, int i) {
        this.b = mm40Var;
        this.g = d8nVar;
        this.d = z;
        this.c = j;
        this.e = function1;
        this.h = function2;
        this.f = i;
    }
}
