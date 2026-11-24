package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class vv2 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f38078a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ ugd f;
    public final /* synthetic */ ugd g;
    public final /* synthetic */ int h;

    public /* synthetic */ vv2(mm40 mm40Var, long j, long j2, Object obj, ugd ugdVar, ugd ugdVar2, int i, byte b) {
        this.f38078a = b;
        this.b = mm40Var;
        this.c = j;
        this.d = j2;
        this.e = obj;
        this.f = ugdVar;
        this.g = ugdVar2;
        this.h = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f38078a;
        int i = this.h;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                mm40 mm40Var = this.b;
                long j = this.c;
                long j2 = this.d;
                kc5.J(mm40Var, j, j2, (vhv0) obj3, this.f, this.g, (fet) obj, iL);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                mm40 mm40Var2 = this.b;
                long j3 = this.c;
                long j4 = this.d;
                j47.H(mm40Var2, j3, j4, (vhv0) obj3, this.f, this.g, (fet) obj, iL2);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL3 = x8x.L(i | 1);
                mm40 mm40Var3 = this.b;
                long j5 = this.c;
                long j6 = this.d;
                r8x.b(mm40Var3, j5, j6, (Function0) obj3, this.f, this.g, (fet) obj, iL3);
                break;
        }
        return Unit.f46060a;
    }
}
