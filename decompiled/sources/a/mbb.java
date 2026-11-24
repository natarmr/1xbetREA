package a;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class mbb extends hvv {
    public float o0;
    public final HashMap p0;
    public final HashMap q0;
    public final HashMap r0;
    public HashMap s0;
    public HashMap t0;
    public d7m0 u0;

    public mbb(f7m0 f7m0Var, int i) {
        super(f7m0Var, i);
        this.o0 = 0.5f;
        this.p0 = new HashMap();
        this.q0 = new HashMap();
        this.r0 = new HashMap();
        this.u0 = d7m0.f5600a;
    }

    public final float t(String str) {
        HashMap map = this.t0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.t0.get(str)).floatValue();
    }

    public final float u(String str) {
        HashMap map = this.r0;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }

    public final float v(String str) {
        HashMap map = this.s0;
        if (map == null || !map.containsKey(str)) {
            return 0.0f;
        }
        return ((Float) this.s0.get(str)).floatValue();
    }

    public final float w(String str) {
        HashMap map = this.q0;
        if (map.containsKey(str)) {
            return ((Float) map.get(str)).floatValue();
        }
        return 0.0f;
    }
}
