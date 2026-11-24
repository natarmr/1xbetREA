package a;

/* JADX INFO: loaded from: classes.dex */
public final class bh90 extends eh90 implements xld {
    public static final bh90 g = new bh90(oqs0.e, 0);

    @Override // a.eh90, a.h3, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof androidx.compose.runtime.d) {
            return super.containsKey((androidx.compose.runtime.d) obj);
        }
        return false;
    }

    @Override // a.h3, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof f3u0) {
            return super.containsValue((f3u0) obj);
        }
        return false;
    }

    @Override // a.eh90
    public final hh90 f() {
        ah90 ah90Var = new ah90(this);
        ah90Var.g = this;
        return ah90Var;
    }

    @Override // a.eh90
    public final hh90 g() {
        ah90 ah90Var = new ah90(this);
        ah90Var.g = this;
        return ah90Var;
    }

    @Override // a.eh90, a.h3, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof androidx.compose.runtime.d) {
            return (f3u0) super.get((androidx.compose.runtime.d) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof androidx.compose.runtime.d) ? obj2 : (f3u0) super.getOrDefault((androidx.compose.runtime.d) obj, (f3u0) obj2);
    }

    public final bh90 j(androidx.compose.runtime.d dVar, f3u0 f3u0Var) {
        s88 s88VarU = this.d.u(dVar, dVar.hashCode(), 0, f3u0Var);
        return s88VarU == null ? this : new bh90((oqs0) s88VarU.c, this.e + (s88VarU.b ? 1 : 0));
    }
}
