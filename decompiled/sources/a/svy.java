package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class svy implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f32893a;
    public final /* synthetic */ slp b;
    public final /* synthetic */ Function1 c;
    public final /* synthetic */ boolean d;

    public /* synthetic */ svy(slp slpVar, Function1 function1, boolean z, byte b) {
        this.f32893a = b;
        this.b = slpVar;
        this.c = function1;
        this.d = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hcz hczVar = (hcz) obj;
        switch (this.f32893a) {
            case 0:
                hczVar.getClass();
                slp slpVar = this.b;
                a4x a4xVar = slpVar.b;
                hczVar.f(a4xVar.size(), new dwy(new pua((byte) 17), a4xVar, (byte) 0), new far(a4xVar, (byte) 26), new ugd(2039820996, true, new ewy(a4xVar, slpVar, this.c, this.d, (byte) 0)));
                break;
            case 1:
                hczVar.getClass();
                slp slpVar2 = this.b;
                a4x a4xVar2 = slpVar2.b;
                hczVar.f(a4xVar2.size(), new dwy(new pua((byte) 17), a4xVar2, (byte) 1), new ap30(a4xVar2, (byte) 0), new ugd(2039820996, true, new ewy(a4xVar2, slpVar2, this.c, this.d, (byte) 1)));
                break;
            case 2:
                hczVar.getClass();
                slp slpVar3 = this.b;
                a4x a4xVar3 = slpVar3.b;
                hczVar.f(a4xVar3.size(), new dwy(new pua((byte) 17), a4xVar3, (byte) 3), new ap30(a4xVar3, (byte) 6), new ugd(2039820996, true, new ewy(a4xVar3, slpVar3, this.c, this.d, (byte) 2)));
                break;
            default:
                hczVar.getClass();
                slp slpVar4 = this.b;
                a4x a4xVar4 = slpVar4.b;
                hczVar.f(a4xVar4.size(), new dwy(new pua((byte) 17), a4xVar4, (byte) 4), new y9k0(a4xVar4, (byte) 0), new ugd(2039820996, true, new ewy(a4xVar4, slpVar4, this.c, this.d, (byte) 3)));
                break;
        }
        return Unit.f46060a;
    }
}
