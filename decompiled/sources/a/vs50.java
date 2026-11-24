package a;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final class vs50 implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function0 f37933a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ kwj c;
    public final /* synthetic */ int d;

    public vs50(Function0 function0, Function1 function1, kwj kwjVar, int i) {
        this.f37933a = function0;
        this.b = function1;
        this.c = kwjVar;
        this.d = i;
    }

    @Override // a.kmq
    public final Object a(Object obj, yje yjeVar) {
        if (((nlx) obj) instanceof nel) {
            this.f37933a.invoke();
        } else {
            int iK = this.c.k();
            int i = this.d;
            this.b.invoke(new Integer(i == 0 ? 0 : ((iK % i) + i) % i));
        }
        return Unit.f46060a;
    }
}
