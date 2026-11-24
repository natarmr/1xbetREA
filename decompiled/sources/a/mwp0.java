package a;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class mwp0 implements ea3 {
    public static final mwp0 b = new mwp0(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f22517a;

    public /* synthetic */ mwp0(String str) {
        this.f22517a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mwp0) {
            return l8x.Z(this.f22517a, ((mwp0) obj).f22517a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f22517a});
    }
}
