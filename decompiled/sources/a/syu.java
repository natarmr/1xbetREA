package a;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class syu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r200 f33040a;

    public syu(r200 r200Var) {
        this.f33040a = r200Var;
    }

    public final Double a(wrz wrzVar) {
        return (Double) ((ConcurrentHashMap) this.f33040a.b.b).get(wrzVar);
    }
}
