package a;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class tc9 implements t83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ary f33709a;
    public final swq b;
    public final Map c;
    public final a8z d;

    public tc9(ary aryVar, swq swqVar, Map map) {
        aryVar.getClass();
        swqVar.getClass();
        map.getClass();
        this.f33709a = aryVar;
        this.b = swqVar;
        this.c = map;
        this.d = maz.a(wez.f39042a, new h79(this, (byte) 4));
    }

    @Override // a.t83
    public final gmk0 b() {
        return gmk0.x0;
    }

    @Override // a.t83
    public final Map c() {
        return this.c;
    }

    @Override // a.t83
    public final swq d() {
        return this.b;
    }

    @Override // a.t83
    public final wsy getType() {
        Object value = this.d.getValue();
        value.getClass();
        return (wsy) value;
    }
}
