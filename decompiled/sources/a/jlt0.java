package a;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class jlt0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16735a;
    public final ArrayList b;

    public jlt0(String str, ArrayList arrayList) {
        str.getClass();
        this.f16735a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jlt0)) {
            return false;
        }
        jlt0 jlt0Var = (jlt0) obj;
        return Intrinsics.d(this.f16735a, jlt0Var.f16735a) && this.b.equals(jlt0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16735a.hashCode() * 31);
    }

    public final String toString() {
        return "UpdateNewParticipantsEvent(dialogId=" + this.f16735a + ", userModelList=" + this.b + Separators.RPAREN;
    }
}
