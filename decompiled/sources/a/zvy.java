package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class zvy implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f45080a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ ilp c;

    public /* synthetic */ zvy(Function1 function1, ilp ilpVar, byte b) {
        this.f45080a = b;
        this.b = function1;
        this.c = ilpVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        byte b = this.f45080a;
        ilp ilpVar = this.c;
        Function1 function1 = this.b;
        switch (b) {
            case 0:
                function1.invoke(new bmp(ilpVar.f14991a));
                break;
            case 1:
                function1.invoke(new hmp(ilpVar.f14991a));
                break;
            case 2:
                function1.invoke(new bmp(ilpVar.f14991a));
                break;
            case 3:
                function1.invoke(new hmp(ilpVar.f14991a));
                break;
            case 4:
                function1.invoke(new bmp(ilpVar.f14991a));
                break;
            case 5:
                function1.invoke(new hmp(ilpVar.f14991a));
                break;
            case 6:
                function1.invoke(new emp(ilpVar.f14991a));
                break;
            case 7:
                function1.invoke(new bmp(ilpVar.f14991a));
                break;
            case 8:
                function1.invoke(new hmp(ilpVar.f14991a));
                break;
            default:
                function1.invoke(new ylp(new npn(ilpVar.f14991a, ilpVar.c, Long.valueOf(ilpVar.e), ilpVar.d), !ilpVar.m.f6295a));
                break;
        }
        return Unit.f46060a;
    }
}
