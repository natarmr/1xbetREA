package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes.dex */
public final class tdz implements uaz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mez f33794a;

    public tdz(mez mezVar) {
        this.f33794a = mezVar;
    }

    @Override // a.uaz
    public final boolean a() {
        return !this.f33794a.i().m.isEmpty();
    }

    @Override // a.uaz
    public final int b() {
        return this.f33794a.i().l;
    }

    @Override // a.uaz
    public final int c() {
        int i;
        mez mezVar = this.f33794a;
        int size = 0;
        if (mezVar.i().m.isEmpty()) {
            return 0;
        }
        fez fezVarI = mezVar.i();
        fez fezVar = gez.f11179a;
        ma80 ma80Var = fezVarI.u;
        ma80 ma80Var2 = ma80.f21447a;
        long j = fezVarI.n;
        int i2 = (int) (ma80Var == ma80Var2 ? j & 4294967295L : j >> 32);
        fez fezVarI2 = mezVar.i();
        List list = fezVarI2.m;
        if (!list.isEmpty()) {
            int size2 = list.size();
            int i3 = 0;
            while (size < size2) {
                hez hezVar = (hez) list.get(size);
                i3 += (int) (fezVarI2.u == ma80.f21447a ? hezVar.v & 4294967295L : hezVar.v >> 32);
                size++;
            }
            size = (i3 / list.size()) + fezVarI2.s;
        }
        if (size != 0 && (i = i2 / size) >= 1) {
            return i;
        }
        return 1;
    }

    @Override // a.uaz
    public final int d() {
        return this.f33794a.g();
    }

    @Override // a.uaz
    public final int e() {
        return ((hez) CollectionsKt.d0(this.f33794a.i().m)).f12949a;
    }
}
