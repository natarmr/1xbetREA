package a;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class b810 implements uj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2136a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Function1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ c810 f;

    public b810(int i, int i2, Map map, Function1 function1, Function1 function2, c810 c810Var) {
        this.f2136a = i;
        this.b = i2;
        this.c = map;
        this.d = function1;
        this.e = function2;
        this.f = c810Var;
    }

    @Override // a.uj30
    public final Map a() {
        return this.c;
    }

    @Override // a.uj30
    public final void b() {
        this.e.invoke(this.f.p);
    }

    @Override // a.uj30
    public final Function1 e() {
        return this.d;
    }

    @Override // a.uj30
    public final int f() {
        return this.b;
    }

    @Override // a.uj30
    public final int j() {
        return this.f2136a;
    }
}
