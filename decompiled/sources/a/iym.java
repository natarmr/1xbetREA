package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class iym implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15595a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ c280 d;
    public final /* synthetic */ int e;

    public /* synthetic */ iym(mm40 mm40Var, c280 c280Var, String str, int i) {
        this.f15595a = (byte) 4;
        this.b = mm40Var;
        this.d = c280Var;
        this.c = str;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f15595a;
        int i = this.e;
        String str = this.c;
        c280 c280Var = this.d;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ahb.t(x8x.L(i | 1), fetVar, mm40Var, c280Var, str);
                break;
            case 1:
                ahb.m(x8x.L(i | 1), fetVar, mm40Var, c280Var, str);
                break;
            case 2:
                ckb.A(x8x.L(i | 1), fetVar, mm40Var, c280Var, str);
                break;
            case 3:
                gkb.x(x8x.L(i | 1), fetVar, mm40Var, c280Var, str);
                break;
            default:
                vdx.l(x8x.L(i | 1), fetVar, mm40Var, c280Var, str);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ iym(mm40 mm40Var, String str, c280 c280Var, int i, byte b) {
        this.f15595a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = c280Var;
        this.e = i;
    }
}
