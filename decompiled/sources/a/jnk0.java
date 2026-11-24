package a;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@ahi0
public final class jnk0<T> {
    public static final ink0 Companion = new ink0();
    public static final a8z[] c = {maz.a(wez.f39042a, new pdk0((byte) 9)), null};
    public static final zna0 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f16818a;
    public final List b;

    static {
        zna0 zna0Var = new zna0("androidx.savedstate.serialization.serializers.SparseArraySerializer.SparseArraySurrogate", null, 2);
        zna0Var.j("keys", false);
        zna0Var.j("values", false);
        d = zna0Var;
    }

    public /* synthetic */ jnk0(int i, List list, List list2) {
        if (3 != (i & 3)) {
            m2x.I(i, 3, d);
            throw null;
        }
        this.f16818a = list;
        this.b = list2;
    }

    public jnk0(ArrayList arrayList, ArrayList arrayList2) {
        this.f16818a = arrayList;
        this.b = arrayList2;
    }
}
