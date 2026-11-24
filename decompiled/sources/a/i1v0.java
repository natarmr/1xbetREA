package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class i1v0 implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14020a = 1;
    public final /* synthetic */ mm40 b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ String d;

    public /* synthetic */ i1v0(mm40 mm40Var, Integer num, String str, int i) {
        this.b = mm40Var;
        this.c = num;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f14020a;
        String str = this.d;
        Integer num = this.c;
        mm40 mm40Var = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                wpm0.i(x8x.L(1), fetVar, mm40Var, num, str);
                break;
            default:
                dqm0.j(x8x.L(1), fetVar, mm40Var, num, str);
                break;
        }
        return Unit.f46060a;
    }

    public /* synthetic */ i1v0(Integer num, String str, mm40 mm40Var, int i) {
        this.c = num;
        this.d = str;
        this.b = mm40Var;
    }
}
