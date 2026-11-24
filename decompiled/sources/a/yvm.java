package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class yvm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43327a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ a4x c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;

    public /* synthetic */ yvm(mm40 mm40Var, a4x a4xVar, boolean z, int i, byte b) {
        this.f43327a = b;
        this.b = mm40Var;
        this.c = a4xVar;
        this.d = z;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f43327a;
        int i = this.e;
        boolean z = this.d;
        a4x a4xVar = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ozb.o(x8x.L(i | 1), fetVar, a4xVar, mm40Var, z);
                break;
            case 1:
                uzb.m(x8x.L(i | 1), fetVar, a4xVar, mm40Var, z);
                break;
            case 2:
                vzb.d(x8x.L(i | 1), fetVar, a4xVar, mm40Var, z);
                break;
            case 3:
                wzb.m(x8x.L(i | 1), fetVar, a4xVar, mm40Var, z);
                break;
            default:
                hmw0.C(x8x.L(i | 1), fetVar, a4xVar, mm40Var, z);
                break;
        }
        return Unit.f46060a;
    }
}
