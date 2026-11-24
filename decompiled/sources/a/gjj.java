package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gjj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11399a;
    public final /* synthetic */ long b;
    public final /* synthetic */ pz40 c;
    public final /* synthetic */ pz40 d;

    public /* synthetic */ gjj(long j, pz40 pz40Var, pz40 pz40Var2, byte b) {
        this.f11399a = b;
        this.b = j;
        this.c = pz40Var;
        this.d = pz40Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f11399a;
        pz40 pz40Var = this.d;
        pz40 pz40Var2 = this.c;
        long j = this.b;
        w6k w6kVar = (w6k) obj;
        switch (b) {
            case 0:
                w6kVar.getClass();
                ne60 ne60Var = (ne60) pz40Var2.getValue();
                long jE = ne60Var != null ? ne60Var.f23370a : jjj.e(j, ((qkx) pz40Var.getValue()).f28908a);
                return new ikx((((long) si30.b(Float.intBitsToFloat((int) (jE & 4294967295L)))) & 4294967295L) | (((long) si30.b(Float.intBitsToFloat((int) (jE >> 32)))) << 32));
            default:
                w6kVar.getClass();
                ne60 ne60Var2 = (ne60) pz40Var2.getValue();
                long jX = ne60Var2 != null ? ne60Var2.f23370a : p8a.X(j, ((qkx) pz40Var.getValue()).f28908a);
                return new ikx((((long) si30.b(Float.intBitsToFloat((int) (jX & 4294967295L)))) & 4294967295L) | (((long) si30.b(Float.intBitsToFloat((int) (jX >> 32)))) << 32));
        }
    }
}
