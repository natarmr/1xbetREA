package a;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class mq90 implements nq90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f22213a;
    public final String b;

    /* JADX WARN: Multi-variable type inference failed */
    public mq90(int i, String str) {
        str.getClass();
        this.f22213a = i;
        this.b = str;
    }

    @Override // a.nq90
    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq90)) {
            return false;
        }
        mq90 mq90Var = (mq90) obj;
        return this.f22213a == mq90Var.f22213a && Intrinsics.d(this.b, mq90Var.b);
    }

    @Override // a.nq90
    public final int getId() {
        return this.f22213a ? 1 : 0;
    }

    @Override // a.nq90
    public final String getTitle() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + brm0.e(Integer.hashCode(this.f22213a ? 1 : 0) * 31, 31, false);
    }

    public final String toString() {
        boolean z = this.f22213a;
        return defpackage.c.b(z ? 1 : 0, "ResidentStatus(id=", ", isRecommend=false, title=", this.b, Separators.RPAREN);
    }
}
