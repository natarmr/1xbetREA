package a;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class mjj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ljj f21897a;
    public final List b;

    public mjj(ljj ljjVar, List list) {
        ljjVar.getClass();
        list.getClass();
        this.f21897a = ljjVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjj)) {
            return false;
        }
        mjj mjjVar = (mjj) obj;
        return this.f21897a == mjjVar.f21897a && Intrinsics.d(this.b, mjjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f21897a.hashCode() * 31);
    }

    public final String toString() {
        return "DebugConsoleStateModel(state=" + this.f21897a + ", textData=" + this.b + Separators.RPAREN;
    }
}
