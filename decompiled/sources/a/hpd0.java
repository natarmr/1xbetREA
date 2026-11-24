package a;

import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class hpd0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f13437a;
    public final Set b;
    public final Set c;

    public hpd0(boolean z, HashSet hashSet, HashSet hashSet2) {
        this.f13437a = z;
        this.b = hashSet == null ? Collections.EMPTY_SET : new HashSet(hashSet);
        this.c = hashSet2 == null ? Collections.EMPTY_SET : new HashSet(hashSet2);
    }

    public final boolean a(Class cls, boolean z) {
        if (this.b.contains(cls)) {
            return true;
        }
        return !this.c.contains(cls) && this.f13437a && z;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hpd0)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        hpd0 hpd0Var = (hpd0) obj;
        return this.f13437a == hpd0Var.f13437a && Objects.equals(this.b, hpd0Var.b) && Objects.equals(this.c, hpd0Var.c);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.f13437a), this.b, this.c);
    }

    public final String toString() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f13437a + ", forceEnabledQuirks=" + this.b + ", forceDisabledQuirks=" + this.c + '}';
    }
}
