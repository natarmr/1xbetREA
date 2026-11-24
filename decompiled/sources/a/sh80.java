package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class sh80 extends wh80 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp00 f32201a;
    public final dp00 b;

    public sh80(dp00 dp00Var, dp00 dp00Var2) {
        this.f32201a = dp00Var;
        this.b = dp00Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh80)) {
            return false;
        }
        sh80 sh80Var = (sh80) obj;
        return this.f32201a.equals(sh80Var.f32201a) && Intrinsics.d(this.b, sh80Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.f32201a.hashCode() * 31;
        dp00 dp00Var = this.b;
        return iHashCode + (dp00Var == null ? 0 : dp00Var.hashCode());
    }

    public final String toString() {
        String str = "PageEvent.LoadStateUpdate (\n                    |   sourceLoadStates: " + this.f32201a + "\n                    ";
        dp00 dp00Var = this.b;
        if (dp00Var != null) {
            str = str + "|   mediatorLoadStates: " + dp00Var + '\n';
        }
        return ntm0.d(str.concat("|)"));
    }
}
