package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class u82 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35215a;
    public final /* synthetic */ f3d b;

    public /* synthetic */ u82(f3d f3dVar, byte b) {
        this.f35215a = b;
        this.b = f3dVar;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        switch (this.f35215a) {
            case 0:
                this.b.f = ((Boolean) obj).booleanValue();
                break;
            default:
                this.b.f = ((Boolean) obj).booleanValue();
                break;
        }
        return Unit.f46060a;
    }
}
