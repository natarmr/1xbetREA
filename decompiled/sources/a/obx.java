package a;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class obx implements a8z, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f25000a;

    public obx(Object obj) {
        this.f25000a = obj;
    }

    @Override // a.a8z
    public final Object getValue() {
        return this.f25000a;
    }

    public final String toString() {
        return String.valueOf(this.f25000a);
    }
}
