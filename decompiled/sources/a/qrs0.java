package a;

/* JADX INFO: loaded from: classes.dex */
public final class qrs0 implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jiy f29226a;
    public final jiy b;
    public final jiy c;
    public final wgi0 d;

    public qrs0(jiy jiyVar, jiy jiyVar2, jiy jiyVar3) {
        jiyVar.getClass();
        jiyVar2.getClass();
        jiyVar3.getClass();
        this.f29226a = jiyVar;
        this.b = jiyVar2;
        this.c = jiyVar3;
        this.d = x2x.E("kotlin.Triple", new ugi0[0], new lcr0(this, (byte) 21));
    }

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        wgi0 wgi0Var = this.d;
        bld bldVarA = rkjVar.a(wgi0Var);
        Object obj = epv0.o;
        Object objM = obj;
        Object objM2 = objM;
        Object objM3 = objM2;
        while (true) {
            int iF = bldVarA.f(wgi0Var);
            if (iF == -1) {
                bldVarA.c(wgi0Var);
                if (objM == obj) {
                    v4i0.n("Element 'first' is missing");
                    return null;
                }
                if (objM2 == obj) {
                    v4i0.n("Element 'second' is missing");
                    return null;
                }
                if (objM3 != obj) {
                    return new prs0(objM, objM2, objM3);
                }
                v4i0.n("Element 'third' is missing");
                return null;
            }
            if (iF == 0) {
                objM = bldVarA.m(wgi0Var, 0, this.f29226a, null);
            } else if (iF == 1) {
                objM2 = bldVarA.m(wgi0Var, 1, this.b, null);
            } else {
                if (iF != 2) {
                    v4i0.n(twn.m(iF, "Unexpected index "));
                    return null;
                }
                objM3 = bldVarA.m(wgi0Var, 2, this.c, null);
            }
        }
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return this.d;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        prs0 prs0Var = (prs0) obj;
        prs0Var.getClass();
        wgi0 wgi0Var = this.d;
        cld cldVarA = bwnVar.a(wgi0Var);
        cldVarA.m(wgi0Var, 0, this.f29226a, prs0Var.f27482a);
        cldVarA.m(wgi0Var, 1, this.b, prs0Var.b);
        cldVarA.m(wgi0Var, 2, this.c, prs0Var.c);
        cldVarA.c(wgi0Var);
    }
}
