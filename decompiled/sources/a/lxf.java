package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class lxf implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f20813a;
    public final /* synthetic */ jkm b;
    public final /* synthetic */ mm40 c;

    public /* synthetic */ lxf(jkm jkmVar, mm40 mm40Var, int i, byte b) {
        this.f20813a = b;
        this.b = jkmVar;
        this.c = mm40Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f20813a;
        mm40 mm40Var = this.c;
        jkm jkmVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                zgc.n(jkmVar, mm40Var, fetVar, x8x.L(1));
                break;
            default:
                cy2.g(jkmVar, mm40Var, fetVar, x8x.L(1));
                break;
        }
        return Unit.f46060a;
    }
}
