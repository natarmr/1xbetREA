package a;

import kotlin.Unit;

/* JADX INFO: loaded from: classes3.dex */
public final class nw7 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f24221a;
    public final /* synthetic */ vne b;
    public final /* synthetic */ t33 c;
    public final /* synthetic */ pz40 d;

    public /* synthetic */ nw7(vne vneVar, t33 t33Var, pz40 pz40Var, byte b) {
        this.f24221a = b;
        this.b = vneVar;
        this.c = t33Var;
        this.d = pz40Var;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        byte b = this.f24221a;
        t33 t33Var = this.c;
        vne vneVar = this.b;
        pz40 pz40Var = this.d;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                bby bbyVar = (bby) pz40Var.getValue();
                if (bbyVar != null) {
                    bbyVar.cancel(null);
                }
                if (zBooleanValue) {
                    pz40Var.setValue(qjj.W(vneVar, null, null, new qw7(t33Var, null, (byte) 0), 3));
                }
                break;
            case 1:
                boolean zBooleanValue2 = ((Boolean) obj).booleanValue();
                bby bbyVar2 = (bby) pz40Var.getValue();
                if (bbyVar2 != null) {
                    bbyVar2.cancel(null);
                }
                if (zBooleanValue2) {
                    pz40Var.setValue(qjj.W(vneVar, null, null, new qw7(t33Var, null, (byte) 1), 3));
                }
                break;
            default:
                boolean zBooleanValue3 = ((Boolean) obj).booleanValue();
                bby bbyVar3 = (bby) pz40Var.getValue();
                if (bbyVar3 != null) {
                    bbyVar3.cancel(null);
                }
                if (zBooleanValue3) {
                    pz40Var.setValue(qjj.W(vneVar, null, null, new atj(t33Var, null, (byte) 27), 3));
                }
                break;
        }
        return Unit.f46060a;
    }
}
