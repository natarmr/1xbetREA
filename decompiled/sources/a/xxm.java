package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class xxm implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f41665a;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ c280 d;

    public /* synthetic */ xxm(mm40 mm40Var, String str, c280 c280Var, int i, byte b) {
        this.f41665a = b;
        this.b = mm40Var;
        this.c = str;
        this.d = c280Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f41665a;
        c280 c280Var = this.d;
        String str = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                jcb.x(x8x.L(1), fetVar, mm40Var, c280Var, str);
                break;
            case 1:
                vdb.M(x8x.L(1), fetVar, mm40Var, c280Var, str);
                break;
            default:
                feb.A(x8x.L(1), fetVar, mm40Var, c280Var, str);
                break;
        }
        return Unit.f46060a;
    }
}
