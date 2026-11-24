package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class d3m implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5409a;
    public final /* synthetic */ a4x b;
    public final /* synthetic */ int c;

    public /* synthetic */ d3m(a4x a4xVar, int i, byte b) {
        this.f5409a = b;
        this.b = a4xVar;
        this.c = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.f5409a;
        jm40 jm40Var = jm40.b;
        int i = this.c;
        a4x a4xVar = this.b;
        fet fetVar = (fet) obj;
        ((Integer) obj2).getClass();
        switch (b) {
            case 0:
                ieb.f(a4xVar, fetVar, x8x.L(i | 1));
                break;
            case 1:
                xkb.m(x8x.L(i | 1), fetVar, a4xVar, jm40Var);
                break;
            default:
                aad.z(x8x.L(i | 1), fetVar, a4xVar, jm40Var);
                break;
        }
        return Unit.f46060a;
    }
}
