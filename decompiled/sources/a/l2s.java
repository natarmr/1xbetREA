package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class l2s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19327a;
    public final /* synthetic */ o2s b;

    public /* synthetic */ l2s(o2s o2sVar, byte b) {
        this.f19327a = b;
        this.b = o2sVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float fL;
        float f;
        byte b = this.f19327a;
        o2s o2sVar = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                o2sVar.h.setValue(bool);
                return Unit.f46060a;
            case 1:
                t33 t33Var = (t33) obj;
                if (((Number) ((hgk0) t33Var.e).getValue()).floatValue() == ((Number) t33Var.d()).floatValue()) {
                    agk0 agk0Var = o2sVar.e;
                    float f2 = o2sVar.j;
                    agk0 agk0Var2 = o2sVar.i;
                    eah0 eah0Var = (eah0) o2sVar.f.getValue();
                    if (eah0Var == null) {
                        fL = agk0Var2.l();
                    } else {
                        if (eah0Var instanceof y9h0) {
                            f = 0.0f;
                        } else {
                            if (!(eah0Var instanceof bah0)) {
                                t9f.b();
                                return null;
                            }
                            fL = agk0Var2.l();
                        }
                        agk0Var.m(f);
                    }
                    f = fL - f2;
                    agk0Var.m(f);
                }
                return Unit.f46060a;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                o2sVar.g.setValue(bool2);
                return Unit.f46060a;
        }
    }
}
