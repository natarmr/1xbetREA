package a;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final class iyj0 extends v2 {
    public final fhy b;
    public final List c;
    public final boolean d;
    public final a8z e;
    public final kiy f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final sgy j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyj0(fhy fhyVar, List list, boolean z, a8z a8zVar, kiy kiyVar, boolean z2, boolean z3, boolean z4, sgy sgyVar, Function0 function0) {
        super(function0);
        fhyVar.getClass();
        list.getClass();
        a8zVar.getClass();
        this.b = fhyVar;
        this.c = list;
        this.d = z;
        this.e = a8zVar;
        this.f = kiyVar;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = sgyVar;
    }

    @Override // a.v2
    public final v2 A(boolean z) {
        return new iyj0(this.b, this.c, this.d && !z, this.e, this.f, z, this.h, this.i, this.j, null);
    }

    @Override // a.v2
    public final v2 B(boolean z) {
        fhy fhyVar = this.b;
        boolean z2 = fhyVar instanceof sgy;
        fhy fhyVarB = fhyVar;
        if (z2) {
            sgy sgyVar = (sgy) fhyVar;
            if (z) {
                fhyVarB = sre0.f32672a.b(azw.H(sgyVar));
            } else {
                Class clsI = azw.I(sgyVar);
                fhyVarB = sgyVar;
                if (clsI != null) {
                    fhyVarB = sre0.f32672a.b(clsI);
                }
            }
        }
        return new iyj0(fhyVarB, this.c, z, this.e, this.f, false, this.h, this.i, this.j, null);
    }

    @Override // a.v2
    public final v2 C() {
        return null;
    }

    @Override // a.kiy
    public final List M() {
        return this.c;
    }

    @Override // a.v2
    public final kiy c() {
        return this.f;
    }

    @Override // a.v2
    public final a8z f() {
        return this.e;
    }

    @Override // a.kiy
    public final boolean h() {
        return this.d;
    }

    @Override // a.v2
    public final sgy j() {
        return this.j;
    }

    @Override // a.v2
    public final boolean n() {
        return this.g;
    }

    @Override // a.kiy
    public final fhy o() {
        return this.b;
    }

    @Override // a.v2
    public final boolean p() {
        return this.h;
    }

    @Override // a.v2
    public final boolean q() {
        return false;
    }

    @Override // a.v2
    public final boolean u() {
        return this.i;
    }

    @Override // a.v2
    public final v2 z() {
        return null;
    }
}
