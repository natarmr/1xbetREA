package a;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class l0g0 implements xdv {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f19200a;
    public final Integer b;
    public final Long c;
    public final odd d;
    public volatile f7r e;
    public volatile Long f;
    public inf0 g;

    public l0g0(Function1 function1, Integer num, Long l) {
        function1.getClass();
        this.f19200a = function1;
        this.b = num;
        this.c = l;
        this.d = new odd();
    }

    @Override // a.xdv
    public final void b() {
        this.d.N(new k0g0(3, null));
    }

    @Override // a.xdv
    public final void f() {
        this.d.N(new k0g0(3, null));
    }

    @Override // a.xdv
    public final void g() {
        this.d.N(new k0g0(3, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public l0g0(Map map) {
        this(new yzn(map, (byte) 1), null, null);
        map.getClass();
    }
}
