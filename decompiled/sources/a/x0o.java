package a;

/* JADX INFO: loaded from: classes5.dex */
public final class x0o implements jiy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x0o f40079a = new x0o();
    public static final wgi0 b = x2x.F("ErrorCodeInfo", new ugi0[0]);

    @Override // a.jiy
    public final Object deserialize(rkj rkjVar) {
        Integer num;
        i2o i2oVar = null;
        icy icyVar = rkjVar instanceof icy ? (icy) rkjVar : null;
        if (icyVar == null) {
            return null;
        }
        mcy mcyVarG = icyVar.g();
        try {
            vby vbyVarD = icyVar.d();
            vbyVarD.getClass();
            num = (Integer) vbyVarD.a(mrv.j0(okx.f25427a), mcyVarG);
        } catch (Exception unused) {
            num = null;
        }
        try {
            vby vbyVarD2 = icyVar.d();
            vbyVarD2.getClass();
            i2oVar = (i2o) vbyVarD2.a(mrv.j0(i2o.Companion.serializer()), mcyVarG);
        } catch (Exception unused2) {
        }
        return new w0o(num, i2oVar);
    }

    @Override // a.jiy
    public final ugi0 getDescriptor() {
        return b;
    }

    @Override // a.jiy
    public final void serialize(bwn bwnVar, Object obj) {
        w0o w0oVar = (w0o) obj;
        if (w0oVar == null) {
            bwnVar.q();
        } else {
            Integer num = w0oVar.f38359a;
            bwnVar.B(num != null ? num.intValue() : 0);
        }
    }
}
