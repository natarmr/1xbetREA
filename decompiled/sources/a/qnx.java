package a;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qnx implements uj30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29049a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Map c;
    public final /* synthetic */ Function1 d;

    public qnx(int i, int i2, Map map, Function1 function1) {
        this.f29049a = i;
        this.b = i2;
        this.c = map;
        this.d = function1;
    }

    @Override // a.uj30
    public final Map a() {
        return this.c;
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
        return this.f29049a;
    }

    @Override // a.uj30
    public final void b() {
    }
}
