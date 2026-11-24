package a;

/* JADX INFO: loaded from: classes.dex */
public final class ah90 extends hh90 {
    public bh90 g;

    @Override // a.hh90, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof androidx.compose.runtime.d) {
            return super.containsKey((androidx.compose.runtime.d) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof f3u0) {
            return super.containsValue((f3u0) obj);
        }
        return false;
    }

    @Override // a.hh90, java.util.AbstractMap, java.util.Map
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

    @Override // a.hh90
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final bh90 f() {
        oqs0 oqs0Var = this.c;
        bh90 bh90Var = this.g;
        if (oqs0Var != bh90Var.d) {
            this.b = new evz();
            bh90Var = new bh90(this.c, this.f);
        }
        this.g = bh90Var;
        return bh90Var;
    }

    @Override // a.hh90, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof androidx.compose.runtime.d) {
            return (f3u0) super.remove((androidx.compose.runtime.d) obj);
        }
        return null;
    }
}
