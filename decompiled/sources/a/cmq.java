package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class cmq implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f4619a;
    public final /* synthetic */ y9q0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ ugd d;

    public cmq(long j, y9q0 y9q0Var, float f, ugd ugdVar) {
        this.f4619a = j;
        this.b = y9q0Var;
        this.c = f;
        this.d = ugdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        fet fetVar = (fet) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (fetVar.U(iIntValue & 1, (iIntValue & 3) != 2)) {
            q8x.o(this.f4619a, this.b, u1c.M(-1767363041, new qp8(this.c, this.d, (byte) 1), fetVar), fetVar, 384);
        } else {
            fetVar.X();
        }
        return Unit.f46060a;
    }
}
