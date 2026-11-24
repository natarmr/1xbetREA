package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class l0i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f19203a;
    public final /* synthetic */ zpl b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ l0i(zpl zplVar, Function2 function2, byte b) {
        this.f19203a = b;
        this.b = zplVar;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        byte b = this.f19203a;
        byte b2 = 2;
        Function2 function2 = this.c;
        zpl zplVar = this.b;
        byte b3 = 1;
        hcz hczVar = (hcz) obj;
        switch (b) {
            case 0:
                hczVar.getClass();
                a4x a4xVar = zplVar.c;
                m7h m7hVar = new m7h((byte) 23);
                m7h m7hVar2 = new m7h((byte) 24);
                hczVar.f(a4xVar.size(), new bzh(xdx.E(a4xVar, m7hVar), (byte) 1), new vtf(m7hVar2, a4xVar, (byte) 11), new ugd(-1311333631, true, new o0i(a4xVar, function2, (byte) 0)));
                break;
            case 1:
                hczVar.getClass();
                a4x a4xVar2 = zplVar.c;
                m7h m7hVar3 = new m7h((byte) 25);
                m7h m7hVar4 = new m7h((byte) 26);
                hczVar.f(a4xVar2.size(), new bzh(xdx.E(a4xVar2, m7hVar3), (byte) 2), new vtf(m7hVar4, a4xVar2, (byte) 12), new ugd(-1311333631, true, new o0i(a4xVar2, function2, b3)));
                break;
            default:
                hczVar.getClass();
                a4x a4xVar3 = zplVar.c;
                hczVar.f(a4xVar3.size(), null, new bzh(a4xVar3, (byte) 4), new ugd(2039820996, true, new o0i(a4xVar3, function2, b2)));
                break;
        }
        return Unit.f46060a;
    }
}
