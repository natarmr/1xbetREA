package a;

import android.content.res.Resources;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class gtf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f11878a;
    public final Resources.Theme b;

    public gtf0(Resources resources, Resources.Theme theme) {
        this.f11878a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && gtf0.class == obj.getClass()) {
            gtf0 gtf0Var = (gtf0) obj;
            if (this.f11878a.equals(gtf0Var.f11878a) && Objects.equals(this.b, gtf0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.f11878a, this.b);
    }
}
