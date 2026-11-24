package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class hu7 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f13665a = 0;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ agk0 c;
    public final /* synthetic */ agk0 d;

    public /* synthetic */ hu7(pz40 pz40Var, agk0 agk0Var, agk0 agk0Var2) {
        this.b = pz40Var;
        this.c = agk0Var;
        this.d = agk0Var2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f13665a;
        float fL = 0.0f;
        agk0 agk0Var = this.d;
        agk0 agk0Var2 = this.c;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                t33 t33Var = (t33) obj;
                if (((Number) ((hgk0) t33Var.e).getValue()).floatValue() == ((Number) t33Var.d()).floatValue()) {
                    dah0 dah0Var = (dah0) pz40Var.getValue();
                    if (dah0Var == null) {
                        fL = agk0Var.l();
                    } else if (!(dah0Var instanceof x9h0)) {
                        if (!(dah0Var instanceof aah0)) {
                            t9f.b();
                            return null;
                        }
                        fL = agk0Var.l();
                    }
                    agk0Var2.m(fL);
                }
                return Unit.f46060a;
            default:
                j6z j6zVar = (j6z) obj;
                j6zVar.getClass();
                agk0Var2.m((int) (j6zVar.g() & 4294967295L));
                if (((asr0) pz40Var.getValue()).f1404a.equals(grq0.f11794a)) {
                    zcl zclVar = qmk.f28987a;
                } else {
                    fL = (int) (j6zVar.g() & 4294967295L);
                }
                agk0Var.m(fL);
                return Unit.f46060a;
        }
    }

    public /* synthetic */ hu7(agk0 agk0Var, pz40 pz40Var, agk0 agk0Var2) {
        this.c = agk0Var;
        this.b = pz40Var;
        this.d = agk0Var2;
    }
}
