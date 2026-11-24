package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class pzn0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f27855a;
    public final /* synthetic */ d9z b;
    public final /* synthetic */ d9z c;
    public final /* synthetic */ vne d;
    public final /* synthetic */ pz40 e;

    public /* synthetic */ pzn0(d9z d9zVar, d9z d9zVar2, vne vneVar, pz40 pz40Var, byte b) {
        this.f27855a = b;
        this.b = d9zVar;
        this.c = d9zVar2;
        this.d = vneVar;
        this.e = pz40Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        switch (this.f27855a) {
            case 0:
                wpm0.b(this.d, this.e, this.b, this.c);
                break;
            case 1:
                dqm0.d(this.d, this.e, this.b, this.c);
                break;
            case 2:
                wpm0.b(this.d, this.e, this.b, this.c);
                break;
            default:
                dqm0.d(this.d, this.e, this.b, this.c);
                break;
        }
        return Unit.f46060a;
    }
}
