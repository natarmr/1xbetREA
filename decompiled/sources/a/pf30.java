package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
public final class pf30 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f26881a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ l7m0 c;

    public /* synthetic */ pf30(pz40 pz40Var, l7m0 l7m0Var, byte b) {
        this.f26881a = b;
        this.b = pz40Var;
        this.c = l7m0Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f26881a;
        l7m0 l7m0Var = this.c;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                if (!((Boolean) pz40Var.getValue()).booleanValue() && ((Boolean) l7m0Var.getValue()).booleanValue()) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                if (!((Boolean) pz40Var.getValue()).booleanValue() && ((Boolean) l7m0Var.getValue()).booleanValue()) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                break;
            case 2:
                if (!((Boolean) pz40Var.getValue()).booleanValue() && ((Boolean) l7m0Var.getValue()).booleanValue()) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                break;
            default:
                if (!((Boolean) pz40Var.getValue()).booleanValue() && ((Boolean) l7m0Var.getValue()).booleanValue()) {
                    pz40Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return Unit.f46060a;
    }
}
