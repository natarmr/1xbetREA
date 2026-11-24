package a;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class z7m0 implements Map.Entry, nhy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f43925a;
    public Object b;
    public final /* synthetic */ a8m0 c;

    public z7m0(a8m0 a8m0Var) {
        this.c = a8m0Var;
        Map.Entry entry = a8m0Var.d;
        entry.getClass();
        this.f43925a = entry.getKey();
        Map.Entry entry2 = a8m0Var.d;
        entry2.getClass();
        this.b = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f43925a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a8m0 a8m0Var = this.c;
        ngk0 ngk0Var = a8m0Var.f433a;
        if (ngk0Var.c().d != a8m0Var.c) {
            jf4.e();
            return null;
        }
        Object obj2 = this.b;
        ngk0Var.put(this.f43925a, obj);
        this.b = obj;
        return obj2;
    }
}
