package a;

/* JADX INFO: loaded from: classes2.dex */
public final class r9z extends ng80 {
    public static final /* synthetic */ iiy[] n = {new j0d0(r9z.class, "binaryClasses", "getBinaryClasses$org_jetbrains_kotlin_descriptors_jvm()Ljava/util/Map;", 0)};
    public final wqe0 h;
    public final f7u i;
    public final cu00 j;
    public final lfy k;
    public final xt00 l;
    public final g93 m;

    /* JADX WARN: Illegal instructions before constructor call */
    public r9z(f7u f7uVar, wqe0 wqe0Var) {
        v7i v7iVar = (v7i) f7uVar.b;
        super((zm40) v7iVar.j, wqe0Var.f39587a);
        this.h = wqe0Var;
        f7u f7uVarG = f7k.G(f7uVar, this, null, 6);
        this.i = f7uVarG;
        ((lwf) ((jfk) v7iVar.f).c().c).getClass();
        vd40 vd40Var = vd40.g;
        v7i v7iVar2 = (v7i) f7uVarG.b;
        eu00 eu00Var = (eu00) v7iVar2.i;
        this.j = new cu00(eu00Var, new q9z(this, (byte) 0));
        this.k = new lfy(f7uVarG, wqe0Var, this);
        q9z q9zVar = new q9z(this, (byte) 1);
        iun iunVar = iun.f15405a;
        if (iunVar == null) {
            eu00.a(27);
            throw null;
        }
        this.l = new xt00(eu00Var, q9zVar, iunVar);
        this.m = ((cgx0) v7iVar2.b).b ? ujn.c : r8x.W(f7uVarG, wqe0Var);
    }

    @Override // a.ng80, a.yjj, a.xjj
    public final gmk0 b() {
        return new jru((Object) this, (byte) 25);
    }

    @Override // a.p4, a.e83
    public final g93 getAnnotations() {
        return this.m;
    }

    @Override // a.ng80, a.wjj, a.p4
    public final String toString() {
        return "Lazy Java package fragment: " + this.f + " of module " + ((zm40) ((v7i) this.i.b).j);
    }

    @Override // a.mg80
    public final cr30 y() {
        return this.k;
    }
}
