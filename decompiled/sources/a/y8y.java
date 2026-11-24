package a;

import kotlin.jvm.functions.Function0;
import kotlin.reflect.KTypeProjection;

/* JADX INFO: loaded from: classes2.dex */
public final class y8y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f42218a;
    public final b9y b;

    public /* synthetic */ y8y(b9y b9yVar, byte b) {
        this.f42218a = b;
        this.b = b9yVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f42218a;
        b9y b9yVar = this.b;
        switch (b) {
            case 0:
                sgy sgyVarB = sre0.f32672a.b(a0o.class);
                piy piyVar = KTypeProjection.c;
                v2 v2VarN = x2x.N(b9yVar.c, null, 7);
                piyVar.getClass();
                return x2x.N(sgyVarB, kotlin.collections.a.c(piy.a(v2VarN)), 6);
            default:
                return new z8y(b9yVar);
        }
    }
}
