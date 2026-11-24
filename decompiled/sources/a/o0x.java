package a;

/* JADX INFO: loaded from: classes6.dex */
public interface o0x {
    default Object a() {
        if (this instanceof l0x) {
            return ((l0x) this).f19222a;
        }
        if (this instanceof m0x) {
            return Integer.valueOf(((m0x) this).f20977a);
        }
        if (this instanceof n0x) {
            return ((n0x) this).f22722a;
        }
        t9f.b();
        return null;
    }

    Integer b();

    default boolean c() {
        if (this instanceof m0x) {
            return false;
        }
        if (this instanceof n0x) {
            return ((n0x) this).f22722a.length() == 0;
        }
        if (this instanceof l0x) {
            return ((l0x) this).f19222a == null;
        }
        t9f.b();
        return false;
    }

    bzw d();
}
