package a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class n35 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22833a;
    public final int b;
    public final List c;
    public final List d;

    public n35(int i, int i2, List list, List list2) {
        this.f22833a = i;
        this.b = i2;
        if (list == null) {
            hny.u("Null audioProfiles");
            throw null;
        }
        this.c = list;
        if (list2 != null) {
            this.d = list2;
        } else {
            hny.u("Null videoProfiles");
            throw null;
        }
    }

    public static n35 a(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        return new n35(i, i2, Collections.unmodifiableList(new ArrayList(arrayList)), Collections.unmodifiableList(new ArrayList(arrayList2)));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof n35) {
            n35 n35Var = (n35) obj;
            if (this.f22833a == n35Var.f22833a && this.b == n35Var.b && this.c.equals(n35Var.c) && this.d.equals(n35Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.f22833a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableEncoderProfilesProxy{defaultDurationSeconds=");
        sb.append(this.f22833a);
        sb.append(", recommendedFileFormat=");
        sb.append(this.b);
        sb.append(", audioProfiles=");
        sb.append(this.c);
        sb.append(", videoProfiles=");
        return dw9.r(sb, this.d, "}");
    }
}
