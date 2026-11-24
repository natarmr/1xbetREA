package a;

import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class jpr implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f16915a;
    public final /* synthetic */ px7 b;

    public /* synthetic */ jpr(px7 px7Var, byte b) {
        this.f16915a = b;
        this.b = px7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f16915a;
        px7 px7Var = this.b;
        switch (b) {
            case 0:
                boolean z = px7Var instanceof ox7;
                return qnr.a((qnr) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, z, false, z, false, false, null, false, false, false, false, false, false, z || (px7Var instanceof mx7) || (px7Var instanceof kx7), false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, null, false, -537526273, 524287);
            case 1:
                boolean z2 = px7Var instanceof ox7;
                return z2s.a((z2s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, false, false, false, z2, false, z2, false, false, null, z2 || (px7Var instanceof mx7) || (px7Var instanceof kx7), false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, null, null, false, null, -34209793, 65535);
            case 2:
                boolean z3 = px7Var instanceof ox7;
                return r7s.a((r7s) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, false, false, false, z3, false, z3, false, false, null, null, false, false, false, false, false, false, null, z3 || (px7Var instanceof mx7) || (px7Var instanceof kx7), false, false, null, null, false, false, null, null, null, null, null, null, null, null, null, false, -1310721, 1048574);
            default:
                boolean z4 = px7Var instanceof ox7;
                return njs.a((njs) obj2, 0L, null, null, false, 0L, 0L, null, null, null, null, null, null, null, null, false, false, false, z4, false, z4, false, false, null, false, false, false, z4 || (px7Var instanceof mx7) || (px7Var instanceof kx7), false, false, false, null, null, null, null, null, null, null, null, null, null, 2144862207, 65535);
        }
    }
}
