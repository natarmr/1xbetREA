package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes5.dex */
public interface vrc0 extends Serializable {
    String A();

    long B();

    String C();

    default vrc0 g0(String str) {
        if (this instanceof urc0) {
            return urc0.a((urc0) this, str, null, 4031);
        }
        if (this instanceof trc0) {
            return trc0.a((trc0) this, str, null, null, 4031);
        }
        t9f.b();
        return null;
    }

    long getId();

    String getName();

    xg8 getType();

    int h0();

    int m0();

    String t0();
}
