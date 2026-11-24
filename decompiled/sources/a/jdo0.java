package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jdo0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16339a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ mm40 c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public final /* synthetic */ float f;
    public final /* synthetic */ float g;
    public final /* synthetic */ rah0 h;
    public final /* synthetic */ ugd i;
    public final /* synthetic */ ugd j;
    public final /* synthetic */ ugd k;
    public final /* synthetic */ int l;

    public /* synthetic */ jdo0(int i, mm40 mm40Var, long j, long j2, float f, float f2, rah0 rah0Var, ugd ugdVar, ugd ugdVar2, ugd ugdVar3, int i2) {
        this.b = i;
        this.c = mm40Var;
        this.d = j;
        this.e = j2;
        this.f = f;
        this.g = f2;
        this.h = rah0Var;
        this.i = ugdVar;
        this.j = ugdVar2;
        this.k = ugdVar3;
        this.l = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16339a;
        int i = this.l;
        switch (b) {
            case 0:
                ((Integer) obj2).getClass();
                int iL = x8x.L(i | 1);
                hxm0.b(this.f, this.g, this.b, iL, this.d, this.e, this.i, this.j, this.k, (fet) obj, this.c, this.h);
                break;
            default:
                ((Integer) obj2).getClass();
                int iL2 = x8x.L(i | 1);
                hxm0.d(this.f, this.g, this.b, iL2, this.d, this.e, this.i, this.j, this.k, (fet) obj, this.c, this.h);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ jdo0(int i, mm40 mm40Var, rah0 rah0Var, long j, long j2, float f, ugd ugdVar, ugd ugdVar2, float f2, ugd ugdVar3, int i2) {
        this.b = i;
        this.c = mm40Var;
        this.h = rah0Var;
        this.d = j;
        this.e = j2;
        this.f = f;
        this.i = ugdVar;
        this.j = ugdVar2;
        this.g = f2;
        this.k = ugdVar3;
        this.l = i2;
    }
}
