package a;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class lgy implements ypy {
    public static final zpy c = new zpy(sre0.f32672a.b(lgy.class));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20028a;
    public final ArrayList b = new ArrayList();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!lgy.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        obj.getClass();
        lgy lgyVar = (lgy) obj;
        return this.f20028a == lgyVar.f20028a && this.b.equals(lgyVar.b);
    }

    @Override // a.ypy
    public final zpy getType() {
        return c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.f20028a) * 31);
    }
}
