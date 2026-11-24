package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vdp implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f37243a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ d280 c;
    public final /* synthetic */ String d;

    public /* synthetic */ vdp(mm40 mm40Var, d280 d280Var, String str, int i, byte b) {
        this.f37243a = b;
        this.b = mm40Var;
        this.c = d280Var;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f37243a;
        String str = this.d;
        d280 d280Var = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                gkb.w(x8x.L(1), fetVar, mm40Var, d280Var, str);
                break;
            default:
                ibm0.b(x8x.L(1), fetVar, mm40Var, d280Var, str);
                break;
        }
        return Unit.f46060a;
    }
}
