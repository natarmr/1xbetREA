package a;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class cec0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4204a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ cec0(pz40 pz40Var, float f, Map map, Function1 function1, float f2) {
        this.e = pz40Var;
        this.b = f;
        this.f = map;
        this.c = function1;
        this.d = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f4204a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        switch (b) {
            case 0:
                kec0 kec0Var = (kec0) obj3;
                hjm hjmVar = (hjm) obj2;
                hcz hczVar = (hcz) obj;
                hczVar.getClass();
                float f = this.b;
                hcz.e(hczVar, null, null, new ugd(933092983, true, new h7m(f, kec0Var, (byte) 2)), 3);
                if (!kec0Var.e.isEmpty()) {
                    hcz.e(hczVar, null, null, new ugd(374345532, true, new dec0(this.d, f, hjmVar, (byte) 0)), 3);
                    a4x a4xVar = kec0Var.e;
                    hczVar.f(a4xVar.size(), new zu90((byte) 18, new t4c0((byte) 14), a4xVar), new d1c0(a4xVar, (byte) 2), new ugd(2039820996, true, new umh(a4xVar, f, this.c, (byte) 1)));
                }
                break;
            default:
                pz40 pz40Var = (pz40) obj3;
                hcz hczVar2 = (hcz) obj;
                hczVar2.getClass();
                a4x a4xVar2 = (a4x) pz40Var.getValue();
                k8e0 k8e0Var = new k8e0((byte) 19);
                hczVar2.f(a4xVar2.size(), new pwe0(k8e0Var, a4xVar2, (byte) 2), new ubn(a4xVar2, (byte) 24), new ugd(2039820996, true, new s3f0(a4xVar2, this.b, (Map) obj2, this.c, this.d, pz40Var)));
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ cec0(kec0 kec0Var, float f, float f2, hjm hjmVar, Function1 function1) {
        this.e = kec0Var;
        this.b = f;
        this.d = f2;
        this.f = hjmVar;
        this.c = function1;
    }
}
