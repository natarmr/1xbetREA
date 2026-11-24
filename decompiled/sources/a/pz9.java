package a;

import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class pz9 implements ee60, fer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f27833a;

    public pz9(Function1 function1) {
        this.f27833a = function1;
    }

    @Override // a.ee60
    public final /* synthetic */ void a(Object obj) {
        this.f27833a.invoke(obj);
    }

    @Override // a.fer
    public final wdr b() {
        return this.f27833a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ee60) || !(obj instanceof fer)) {
            return false;
        }
        return this.f27833a.equals(((fer) obj).b());
    }

    public final int hashCode() {
        return this.f27833a.hashCode();
    }
}
