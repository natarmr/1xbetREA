package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class gdz extends wjj {
    public static final /* synthetic */ iiy[] i = {new j0d0(gdz.class, "fragments", "getFragments()Ljava/util/List;", 0), new j0d0(gdz.class, "empty", "getEmpty()Z", 0)};
    public final zm40 d;
    public final swq e;
    public final cu00 f;
    public final cu00 g;
    public final mdz h;

    /* JADX WARN: Illegal instructions before constructor call */
    public gdz(zm40 zm40Var, swq swqVar, eu00 eu00Var) {
        eu00Var.getClass();
        f93 f93Var = ujn.c;
        twq twqVar = swqVar.f32934a;
        super(f93Var, twqVar.c() ? twq.e : twqVar.g());
        this.d = zm40Var;
        this.e = swqVar;
        this.f = new cu00(eu00Var, new fdz(this, (byte) 0));
        this.g = new cu00(eu00Var, new fdz(this, (byte) 1));
        this.h = new mdz(eu00Var, new fdz(this, (byte) 2));
    }

    public final boolean equals(Object obj) {
        gdz gdzVar = obj instanceof gdz ? (gdz) obj : null;
        return gdzVar != null && Intrinsics.d(this.e, gdzVar.e) && Intrinsics.d(this.d, gdzVar.d);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }

    @Override // a.vjj
    public final Object i0(zjj zjjVar, Object obj) {
        return zjjVar.u(this, obj);
    }

    @Override // a.vjj
    public final vjj j() {
        swq swqVar = this.e;
        if (swqVar.f32934a.c()) {
            return null;
        }
        return this.d.c0(swqVar.b());
    }
}
