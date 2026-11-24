package a;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ok7 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f25393a;
    public final /* synthetic */ w2d b;

    public /* synthetic */ ok7(w2d w2dVar, byte b) {
        this.f25393a = b;
        this.b = w2dVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f25393a;
        w2d w2dVar = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(1.0f - w2dVar.f38442a.a());
            case 1:
                return Boolean.valueOf(w2dVar.f38442a.a() >= 1.0f);
            case 2:
                return Float.valueOf(1.0f - w2dVar.f38442a.a());
            case 3:
                x2d x2dVar = w2dVar.f38442a;
                return Boolean.valueOf(!(x2dVar.d.l() == x2dVar.f.l()));
            case 4:
                x2d x2dVar2 = w2dVar.f38442a;
                return Boolean.valueOf(!(x2dVar2.d.l() == x2dVar2.f.l()));
            case 5:
                return Float.valueOf(1.0f - w2dVar.f38442a.a());
            case 6:
                return Float.valueOf(l1e0.c((w2dVar.f38442a.a() - 0.5f) / 0.5f, 0.0f, 1.0f));
            case 7:
                return Float.valueOf(l1e0.c(w2dVar.f38442a.a(), 0.0f, 1.0f));
            case 8:
                return Float.valueOf(1.0f - w2dVar.f38442a.a());
            default:
                return Float.valueOf(1.0f - w2dVar.f38442a.a());
        }
    }
}
