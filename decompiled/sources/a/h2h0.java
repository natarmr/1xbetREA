package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class h2h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12334a;
    public final ArrayList b;
    public final y1h0 c;
    public final ArrayList d;

    public h2h0(ArrayList arrayList, ArrayList arrayList2, y1h0 y1h0Var, ArrayList arrayList3) {
        this.f12334a = arrayList;
        this.b = arrayList2;
        this.c = y1h0Var;
        this.d = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h2h0.class != obj.getClass()) {
            return false;
        }
        h2h0 h2h0Var = (h2h0) obj;
        return this.f12334a.equals(h2h0Var.f12334a) && this.b.equals(h2h0Var.b) && Intrinsics.d(this.c, h2h0Var.c) && this.d.equals(h2h0Var.d);
    }

    public final int hashCode() {
        return (this.d.hashCode() * 31) + (this.c.hashCode() * 31) + (this.b.hashCode() * 31) + (this.f12334a.hashCode() * 31);
    }

    public final String toString() {
        return "SceneState(entries=" + this.f12334a + ", overlayScenes=" + this.b + ", currentScene=" + this.c + ", previousScenes=" + this.d + Separators.RPAREN;
    }
}
