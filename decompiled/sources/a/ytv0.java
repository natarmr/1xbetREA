package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
public final class ytv0 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43240a;
    public final /* synthetic */ buv0 b;

    public /* synthetic */ ytv0(buv0 buv0Var, byte b) {
        this.f43240a = b;
        this.b = buv0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f43240a;
        buv0 buv0Var = this.b;
        switch (b) {
            case 0:
                if (((Boolean) obj).booleanValue()) {
                    buv0Var.c();
                }
                break;
            default:
                if (((Boolean) obj).booleanValue()) {
                    buv0Var.c();
                }
                break;
        }
        return Unit.f46060a;
    }
}
