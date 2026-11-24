package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class uso implements qmf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gnf0 f36222a;
    public final long b;

    public uso(gnf0 gnf0Var, long j) {
        gnf0Var.getClass();
        this.f36222a = gnf0Var;
        this.b = j;
    }

    @Override // a.kft0
    public final Object H(sgy sgyVar) {
        sgyVar.getClass();
        return null;
    }

    @Override // a.qmf0
    public final int L() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof uso) {
            uso usoVar = (uso) obj;
            return Intrinsics.d(this.f36222a, usoVar.f36222a) && this.b == usoVar.b;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + rw2.b(brm0.e(this.f36222a.hashCode() * 31, 31, false), 31, this.b);
    }

    @Override // a.qmf0
    public final boolean k() {
        return false;
    }

    public final String toString() {
        return "ExtensionRequestFailure(requestMetadata=" + this.f36222a + ", wasImageCaptured=false, frameNumber=" + ((Object) f7r.a(this.b)) + ", reason=0)";
    }
}
