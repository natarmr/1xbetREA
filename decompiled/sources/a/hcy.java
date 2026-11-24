package a;

import java.util.Date;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class hcy implements dwn {
    public static final fcy f;
    public static final fcy g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f12843a;
    public final HashMap b;
    public final ecy c;
    public boolean d;
    public static final ecy e = new ecy((byte) 0);
    public static final gcy h = new gcy();

    /* JADX WARN: Type inference failed for: r0v1, types: [a.fcy] */
    /* JADX WARN: Type inference failed for: r0v2, types: [a.fcy] */
    static {
        final byte b = 0;
        f = new c3u0() { // from class: a.fcy
            @Override // a.cwn
            public final void a(Object obj, Object obj2) {
                switch (b) {
                    case 0:
                        ((d3u0) obj2).b((String) obj);
                        break;
                    default:
                        ((d3u0) obj2).g(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final byte b2 = 1;
        g = new c3u0() { // from class: a.fcy
            @Override // a.cwn
            public final void a(Object obj, Object obj2) {
                switch (b2) {
                    case 0:
                        ((d3u0) obj2).b((String) obj);
                        break;
                    default:
                        ((d3u0) obj2).g(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public hcy() {
        HashMap map = new HashMap();
        this.f12843a = map;
        HashMap map2 = new HashMap();
        this.b = map2;
        this.c = e;
        this.d = false;
        map2.put(String.class, f);
        map.remove(String.class);
        map2.put(Boolean.class, g);
        map.remove(Boolean.class);
        map2.put(Date.class, h);
        map.remove(Date.class);
    }

    public final dwn a(Class cls, s960 s960Var) {
        this.f12843a.put(cls, s960Var);
        this.b.remove(cls);
        return this;
    }
}
