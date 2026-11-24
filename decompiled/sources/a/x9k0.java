package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class x9k0 implements cd40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f40513a;

    public x9k0(ArrayList arrayList) {
        this.f40513a = arrayList;
        boolean z = false;
        if (!arrayList.isEmpty()) {
            long j = ((w9k0) arrayList.get(0)).b;
            for (int i = 1; i < arrayList.size(); i++) {
                if (((w9k0) arrayList.get(i)).f38784a < j) {
                    z = true;
                    break;
                }
                j = ((w9k0) arrayList.get(i)).b;
            }
        }
        x0x.A(!z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || x9k0.class != obj.getClass()) {
            return false;
        }
        return this.f40513a.equals(((x9k0) obj).f40513a);
    }

    public final int hashCode() {
        return this.f40513a.hashCode();
    }

    public final String toString() {
        return "SlowMotion: segments=" + this.f40513a;
    }
}
