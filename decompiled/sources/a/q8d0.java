package a;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q8d0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28294a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ long e;
    public final /* synthetic */ yjj0 f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ xdr k;

    public /* synthetic */ q8d0(mm40 mm40Var, float f, float f2, long j, yjj0 yjj0Var, List list, boolean z, Function2 function2, xdr xdrVar, int i) {
        this.b = mm40Var;
        this.c = f;
        this.d = f2;
        this.e = j;
        this.f = yjj0Var;
        this.i = list;
        this.g = z;
        this.j = function2;
        this.k = xdrVar;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f28294a;
        int i = this.h;
        Object obj3 = this.j;
        Object obj4 = this.i;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                ((v8d0) obj4).b((d9d0) obj3, this.g, this.b, this.c, this.f, this.e, this.d, (ugd) this.k, (fet) obj, iL);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                bdx.C(this.b, this.c, this.d, this.e, this.f, (List) obj4, this.g, (Function2) obj3, this.k, (fet) obj, iL2);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ q8d0(v8d0 v8d0Var, d9d0 d9d0Var, boolean z, mm40 mm40Var, float f, yjj0 yjj0Var, long j, float f2, ugd ugdVar, int i) {
        this.i = v8d0Var;
        this.j = d9d0Var;
        this.g = z;
        this.b = mm40Var;
        this.c = f;
        this.f = yjj0Var;
        this.e = j;
        this.d = f2;
        this.k = ugdVar;
        this.h = i;
    }
}
