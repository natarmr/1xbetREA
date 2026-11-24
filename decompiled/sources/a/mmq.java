package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class mmq implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f22053a;
    public final /* synthetic */ gzb0 b;

    public /* synthetic */ mmq(gzb0 gzb0Var, byte b) {
        this.f22053a = b;
        this.b = gzb0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        switch (this.f22053a) {
            case 0:
                this.b.setValue(obj);
                break;
            case 1:
                this.b.setValue(obj);
                break;
            case 2:
                this.b.setValue(obj);
                break;
            default:
                this.b.setValue(obj);
                break;
        }
        return Unit.f46060a;
    }
}
