package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class q82 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28278a = 0;
    public final /* synthetic */ f3d b;
    public final /* synthetic */ float c;

    public /* synthetic */ q82(float f, f3d f3dVar) {
        this.c = f;
        this.b = f3dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f28278a;
        float f = this.c;
        f3d f3dVar = this.b;
        switch (b) {
            case 0:
                qek0 qek0Var = y82.V1;
                return new yjt(new k82((1.0f - f3dVar.d()) * f, (byte) 0));
            default:
                float fC = l1e0.c(f3dVar.d() * 4.0f, 0.0f, 1.0f);
                float fC2 = l1e0.c((f3dVar.d() - 0.25f) / 0.75f, 0.0f, 1.0f);
                return new nn8(fC, fC2, fC2 > 0.0f ? fC2 : 1.0f - fC, fC2 > 0.0f ? (1.0f - fC2) * f : 0.0f);
        }
    }

    public /* synthetic */ q82(f3d f3dVar, float f) {
        this.b = f3dVar;
        this.c = f;
    }
}
