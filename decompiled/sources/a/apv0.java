package a;

import java.util.HashSet;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class apv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f1271a;
    public final zov0 b;
    public final HashSet c;
    public final maj d;
    public final maj e;
    public final int f;
    public final int g;
    public final o4e h;
    public final long i;
    public final yov0 j;
    public final long k;
    public final int l;
    public final String m;

    public apv0(UUID uuid, zov0 zov0Var, HashSet hashSet, maj majVar, maj majVar2, int i, int i2, o4e o4eVar, long j, yov0 yov0Var, long j2, int i3, String str) {
        uuid.getClass();
        majVar.getClass();
        majVar2.getClass();
        this.f1271a = uuid;
        this.b = zov0Var;
        this.c = hashSet;
        this.d = majVar;
        this.e = majVar2;
        this.f = i;
        this.g = i2;
        this.h = o4eVar;
        this.i = j;
        this.j = yov0Var;
        this.k = j2;
        this.l = i3;
        this.m = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !apv0.class.equals(obj.getClass())) {
            return false;
        }
        apv0 apv0Var = (apv0) obj;
        if (this.f == apv0Var.f && this.g == apv0Var.g && Intrinsics.d(this.f1271a, apv0Var.f1271a) && this.b == apv0Var.b && Intrinsics.d(this.d, apv0Var.d) && this.h.equals(apv0Var.h) && this.i == apv0Var.i && Intrinsics.d(this.j, apv0Var.j) && this.k == apv0Var.k && this.l == apv0Var.l && Intrinsics.d(this.m, apv0Var.m) && this.c.equals(apv0Var.c)) {
            return Intrinsics.d(this.e, apv0Var.e);
        }
        return false;
    }

    public final int hashCode() {
        int iB = rw2.b((this.h.hashCode() + ((((((this.e.hashCode() + ((this.c.hashCode() + ((this.d.hashCode() + ((this.b.hashCode() + (this.f1271a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31) + this.f) * 31) + this.g) * 31)) * 31, 31, this.i);
        yov0 yov0Var = this.j;
        int iA = twn.a(this.l, rw2.b((iB + (yov0Var != null ? yov0Var.hashCode() : 0)) * 31, 31, this.k), 31);
        String str = this.m;
        return iA + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WorkInfo{id='");
        sb.append(this.f1271a);
        sb.append("', state=");
        sb.append(this.b);
        sb.append(", outputData=");
        sb.append(this.d);
        sb.append(", tags=");
        sb.append(this.c);
        sb.append(", progress=");
        sb.append(this.e);
        sb.append(", runAttemptCount=");
        sb.append(this.f);
        sb.append(", generation=");
        sb.append(this.g);
        sb.append(", constraints=");
        sb.append(this.h);
        sb.append(", initialDelayMillis=");
        sb.append(this.i);
        sb.append(", periodicityInfo=");
        sb.append(this.j);
        kng0.A(sb, ", nextScheduleTimeMillis=", this.k, "}, stopReason=");
        sb.append(this.l);
        sb.append(", workerClassName=");
        sb.append(this.m);
        return sb.toString();
    }
}
