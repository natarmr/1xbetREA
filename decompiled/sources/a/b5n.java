package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
public final class b5n extends guy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2010a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ v3e c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5n(pz40 pz40Var, v3e v3eVar, byte b) {
        super(0);
        this.f2010a = b;
        this.b = pz40Var;
        this.c = v3eVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f2010a;
        v3e v3eVar = this.c;
        pz40 pz40Var = this.b;
        switch (b) {
            case 0:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                v3eVar.d = true;
                break;
            case 1:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                v3eVar.d = true;
                break;
            case 2:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                v3eVar.d = true;
                break;
            default:
                pz40Var.setValue(Boolean.valueOf(!((Boolean) pz40Var.getValue()).booleanValue()));
                v3eVar.d = true;
                break;
        }
        return Unit.f46060a;
    }
}
