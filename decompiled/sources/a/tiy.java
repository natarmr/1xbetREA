package a;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class tiy implements kiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kiy f34028a;

    public tiy(kiy kiyVar) {
        kiyVar.getClass();
        this.f34028a = kiyVar;
    }

    @Override // a.kiy
    public final List M() {
        return this.f34028a.M();
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        tiy tiyVar = obj instanceof tiy ? (tiy) obj : null;
        kiy kiyVar = tiyVar != null ? tiyVar.f34028a : null;
        kiy kiyVar2 = this.f34028a;
        if (!Intrinsics.d(kiyVar2, kiyVar)) {
            return false;
        }
        fhy fhyVarO = kiyVar2.o();
        if (fhyVarO instanceof sgy) {
            kiy kiyVar3 = obj instanceof kiy ? (kiy) obj : null;
            fhy fhyVarO2 = kiyVar3 != null ? kiyVar3.o() : null;
            if (fhyVarO2 != null && (fhyVarO2 instanceof sgy)) {
                return azw.G((sgy) fhyVarO).equals(azw.G((sgy) fhyVarO2));
            }
        }
        return false;
    }

    @Override // a.pgy
    public final List getAnnotations() {
        return this.f34028a.getAnnotations();
    }

    @Override // a.kiy
    public final boolean h() {
        return this.f34028a.h();
    }

    public final int hashCode() {
        return this.f34028a.hashCode();
    }

    @Override // a.kiy
    public final fhy o() {
        return this.f34028a.o();
    }

    public final String toString() {
        return "KTypeWrapper: " + this.f34028a;
    }
}
