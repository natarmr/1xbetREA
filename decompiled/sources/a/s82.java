package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class s82 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f31782a;
    public final /* synthetic */ f3d b;

    public /* synthetic */ s82(f3d f3dVar, byte b) {
        this.f31782a = b;
        this.b = f3dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f31782a;
        f3d f3dVar = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(f3dVar.f8856a.l() == 0.0f);
            case 1:
                return f3dVar.d() > 0.5f ? vxl.f38204a : vxl.c;
            case 2:
                return Float.valueOf(f3dVar.d());
            case 3:
                return Float.valueOf(f3dVar.d());
            case 4:
                return Float.valueOf(f3dVar.f8856a.l() / f3dVar.d.l());
            case 5:
                return new c3d(f3dVar, (byte) 0);
            case 6:
                return new e3d(f3dVar);
            default:
                return Boolean.valueOf(f3dVar.f8856a.l() == 0.0f);
        }
    }
}
