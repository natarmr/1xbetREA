package a;

import android.text.TextUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public final class lcx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rcf0 f19821a;
    public final rcf0 b;
    public final UUID c;

    public lcx0(rcf0 rcf0Var, rcf0 rcf0Var2, UUID uuid) {
        this.f19821a = rcf0Var;
        this.b = rcf0Var2;
        this.c = uuid;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lcx0)) {
            return false;
        }
        lcx0 lcx0Var = (lcx0) obj;
        return this.f19821a.equals(lcx0Var.f19821a) && this.b.equals(lcx0Var.b) && this.c.equals(lcx0Var.c);
    }

    public final int hashCode() {
        return (this.c.hashCode() ^ ((((this.f19821a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003)) * 1000003;
    }

    public final String toString() {
        return TextUtils.join(" -> ", this.f19821a);
    }
}
