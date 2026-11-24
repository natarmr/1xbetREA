package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jt0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f17076a;
    public final /* synthetic */ pz40 b;
    public final /* synthetic */ cgk0 c;

    public /* synthetic */ jt0(cgk0 cgk0Var, pz40 pz40Var) {
        this.f17076a = (byte) 0;
        this.c = cgk0Var;
        this.b = pz40Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f17076a;
        cgk0 cgk0Var = this.c;
        pz40 pz40Var = this.b;
        abi0 abi0Var = (abi0) obj;
        abi0Var.getClass();
        switch (b) {
            case 0:
                int iL = cgk0Var.l();
                zai0 zai0Var = lt0.b;
                iiy iiyVar = lt0.f20606a[0];
                Integer numValueOf = Integer.valueOf(iL);
                zai0Var.getClass();
                abi0Var.b(zai0Var, numValueOf);
                zai0 zai0Var2 = cbi0.m;
                Boolean bool = (Boolean) pz40Var.getValue();
                bool.getClass();
                abi0Var.b(zai0Var2, bool);
                break;
            case 1:
                Boolean bool2 = (Boolean) pz40Var.getValue();
                bool2.booleanValue();
                zai0 zai0Var3 = etl.c;
                iiy iiyVar2 = etl.f8381a[1];
                zai0Var3.getClass();
                abi0Var.b(zai0Var3, bool2);
                etl.g(abi0Var, cgk0Var.l());
                break;
            case 2:
                Boolean bool3 = (Boolean) pz40Var.getValue();
                bool3.booleanValue();
                zai0 zai0Var4 = etl.c;
                iiy iiyVar3 = etl.f8381a[1];
                zai0Var4.getClass();
                abi0Var.b(zai0Var4, bool3);
                etl.g(abi0Var, cgk0Var.l());
                break;
            default:
                Boolean bool4 = (Boolean) pz40Var.getValue();
                bool4.booleanValue();
                zai0 zai0Var5 = etl.c;
                iiy iiyVar4 = etl.f8381a[1];
                zai0Var5.getClass();
                abi0Var.b(zai0Var5, bool4);
                etl.g(abi0Var, cgk0Var.l());
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ jt0(pz40 pz40Var, cgk0 cgk0Var, byte b) {
        this.f17076a = b;
        this.b = pz40Var;
        this.c = cgk0Var;
    }
}
