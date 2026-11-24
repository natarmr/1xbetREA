package a;

/* JADX INFO: loaded from: classes.dex */
public final class qdx extends e810 {
    @Override // a.pj30
    public final int D(int i) {
        u8u u8uVarU = this.u.u.u();
        tj30 tj30VarP = u8uVarU.p();
        e7z e7zVar = (e7z) u8uVarU.c;
        return tj30VarP.a((s460) e7zVar.h1.e, e7zVar.m(), i);
    }

    @Override // a.pj30
    public final int L(int i) {
        u8u u8uVarU = this.u.u.u();
        tj30 tj30VarP = u8uVarU.p();
        e7z e7zVar = (e7z) u8uVarU.c;
        return tj30VarP.d((s460) e7zVar.h1.e, e7zVar.m(), i);
    }

    @Override // a.pj30
    public final int P(int i) {
        u8u u8uVarU = this.u.u.u();
        tj30 tj30VarP = u8uVarU.p();
        e7z e7zVar = (e7z) u8uVarU.c;
        return tj30VarP.e((s460) e7zVar.h1.e, e7zVar.m(), i);
    }

    @Override // a.pj30
    public final pu90 S(long j) {
        u0(j);
        s460 s460Var = this.u;
        xz40 xz40VarA = s460Var.u.A();
        Object[] objArr = xz40VarA.f41739a;
        int i = xz40VarA.c;
        for (int i2 = 0; i2 < i; i2++) {
            i810 i810Var = ((e7z) objArr[i2]).i1.q;
            i810Var.getClass();
            i810Var.j = c7z.c;
        }
        e7z e7zVar = s460Var.u;
        Y0(e7zVar.x.b(this, e7zVar.m(), j));
        return this;
    }

    @Override // a.e810
    public final void V0() {
        i810 i810Var = this.u.u.i1.q;
        i810Var.getClass();
        i810Var.I0();
    }

    @Override // a.pj30
    public final int b(int i) {
        u8u u8uVarU = this.u.u.u();
        tj30 tj30VarP = u8uVarU.p();
        e7z e7zVar = (e7z) u8uVarU.c;
        return tj30VarP.c((s460) e7zVar.h1.e, e7zVar.m(), i);
    }

    @Override // a.c810
    public final int y0(w12 w12Var) {
        i810 i810Var = this.u.u.i1.q;
        i810Var.getClass();
        f7z f7zVar = i810Var.s;
        if (!i810Var.k) {
            i7z i7zVar = i810Var.f;
            if (i7zVar.d == a7z.b) {
                f7zVar.f = true;
                if (f7zVar.b) {
                    i7zVar.f = true;
                    i7zVar.g = true;
                }
            } else {
                f7zVar.g = true;
            }
        }
        qdx qdxVar = i810Var.H().E1;
        Boolean boolValueOf = qdxVar != null ? Boolean.valueOf(qdxVar.o) : null;
        qdx qdxVar2 = i810Var.H().E1;
        if (qdxVar2 != null) {
            qdxVar2.o = true;
        }
        i810Var.y();
        qdx qdxVar3 = i810Var.H().E1;
        if (qdxVar3 != null) {
            qdxVar3.o = boolValueOf != null ? boolValueOf.booleanValue() : false;
        }
        Integer num = (Integer) f7zVar.i.get(w12Var);
        int iIntValue = num != null ? num.intValue() : Integer.MIN_VALUE;
        this.z.g(iIntValue, w12Var);
        return iIntValue;
    }
}
