package a;

import android.gov.nist.core.Separators;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class ktj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f18869a;
    public final UUID b;

    public ktj0(Object obj) {
        UUID uuidRandomUUID = UUID.randomUUID();
        uuidRandomUUID.getClass();
        this.f18869a = obj;
        this.b = uuidRandomUUID;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ktj0)) {
            return false;
        }
        ktj0 ktj0Var = (ktj0) obj;
        return Intrinsics.d(this.f18869a, ktj0Var.f18869a) && this.b.equals(ktj0Var.b);
    }

    public final int hashCode() {
        Object obj = this.f18869a;
        return this.b.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        return "Unique(effect=" + this.f18869a + ", uuid=" + this.b + Separators.RPAREN;
    }
}
