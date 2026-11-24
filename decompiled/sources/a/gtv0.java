package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gtv0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f11900a;
    public final /* synthetic */ ywv0 b;

    public /* synthetic */ gtv0(ywv0 ywv0Var, byte b) {
        this.f11900a = b;
        this.b = ywv0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f11900a;
        ywv0 ywv0Var = this.b;
        switch (b) {
            case 0:
                ywv0Var.l.a(-((Float) obj).floatValue());
                return Unit.f46060a;
            case 1:
                float fFloatValue = ((Float) obj).floatValue();
                vkr0 vkr0Var = ywv0Var.m;
                hgk0 hgk0Var = (hgk0) ((pz40) ((mkt0) vkr0Var.c).b);
                if (!((Boolean) hgk0Var.getValue()).booleanValue()) {
                    hgk0Var.setValue(Boolean.TRUE);
                }
                hcp0 hcp0Var = (hcp0) vkr0Var.e;
                ((q99) hcp0Var.c).f(new iuv0(fFloatValue));
                return Unit.f46060a;
            case 2:
                bff0 bff0Var = (bff0) obj;
                bff0Var.getClass();
                mkx mkxVarB = bff0Var.b();
                fuj0 fuj0Var = ywv0Var.g;
                int i = mkxVarB.b;
                int iA = mkxVarB.a();
                hgk0 hgk0Var2 = (hgk0) ((pz40) fuj0Var.f10166a);
                zvv0 zvv0Var = (zvv0) hgk0Var2.getValue();
                zvv0 zvv0VarA = zvv0.a(zvv0Var, i, iA, null, null, null, 0, 0.0f, 0, 0.0f, 0.0f, 4092);
                if (!zvv0VarA.equals(zvv0Var)) {
                    hgk0Var2.setValue(zvv0VarA);
                }
                return Unit.f46060a;
            case 3:
                uag0 uag0Var = (uag0) obj;
                uag0Var.getClass();
                uag0Var.H(((Number) ((t33) ywv0Var.m.f).d()).floatValue());
                return Unit.f46060a;
            default:
                ((lwk) obj).getClass();
                return new ty2(ywv0Var, (byte) 29);
        }
    }
}
