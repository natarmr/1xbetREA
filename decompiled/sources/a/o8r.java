package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class o8r {
    public static final n8r Companion = new n8r();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l8r f24844a;
    public final l8r b;

    public /* synthetic */ o8r(int i, l8r l8rVar, l8r l8rVar2) {
        if ((i & 1) == 0) {
            this.f24844a = null;
        } else {
            this.f24844a = l8rVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l8rVar2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o8r)) {
            return false;
        }
        o8r o8rVar = (o8r) obj;
        return Intrinsics.d(this.f24844a, o8rVar.f24844a) && Intrinsics.d(this.b, o8rVar.b);
    }

    public final int hashCode() {
        l8r l8rVar = this.f24844a;
        int iHashCode = (l8rVar == null ? 0 : l8rVar.hashCode()) * 31;
        l8r l8rVar2 = this.b;
        return iHashCode + (l8rVar2 != null ? l8rVar2.hashCode() : 0);
    }

    public final String toString() {
        return "FreeValueConfigurationMoneyResponse(min=" + this.f24844a + ", max=" + this.b + Separators.RPAREN;
    }
}
