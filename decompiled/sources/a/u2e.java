package a;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class u2e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f34940a;
    public final Object b;
    public final c3e c;
    public final c3e d;
    public final b3e e;
    public final c3e f;
    public final c3e g;
    public final b3e h;

    public u2e(Object obj) {
        this.f34940a = obj;
        new LinkedHashMap();
        this.b = obj;
        this.c = new c3e(obj, -2, this);
        this.d = new c3e(obj, 0, this);
        this.e = new b3e(obj, 0, this);
        this.f = new c3e(obj, -1, this);
        this.g = new c3e(obj, 1, this);
        this.h = new b3e(obj, 1, this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u2e) {
            return Intrinsics.d(this.b, ((u2e) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
