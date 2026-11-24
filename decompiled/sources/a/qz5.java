package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class qz5 implements pz5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29564a;
    public cmy c = null;
    public float d = -1.0f;
    public cmy b = f(0.0f);

    public qz5(List list) {
        this.f29564a = list;
    }

    @Override // a.pz5
    public final boolean a(float f) {
        cmy cmyVar = this.c;
        cmy cmyVar2 = this.b;
        if (cmyVar == cmyVar2 && this.d == f) {
            return true;
        }
        this.c = cmyVar2;
        this.d = f;
        return false;
    }

    @Override // a.pz5
    public final cmy b() {
        return this.b;
    }

    @Override // a.pz5
    public final boolean c(float f) {
        cmy cmyVar = this.b;
        if (f >= cmyVar.b() && f < cmyVar.a()) {
            return !this.b.c();
        }
        this.b = f(f);
        return true;
    }

    @Override // a.pz5
    public final float d() {
        return ((cmy) this.f29564a.get(0)).b();
    }

    @Override // a.pz5
    public final float e() {
        List list = this.f29564a;
        return ((cmy) list.get(list.size() - 1)).a();
    }

    public final cmy f(float f) {
        List list = this.f29564a;
        cmy cmyVar = (cmy) list.get(list.size() - 1);
        if (f >= cmyVar.b()) {
            return cmyVar;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            cmy cmyVar2 = (cmy) list.get(size);
            if (this.b != cmyVar2 && f >= cmyVar2.b() && f < cmyVar2.a()) {
                return cmyVar2;
            }
        }
        return (cmy) list.get(0);
    }

    @Override // a.pz5
    public final boolean isEmpty() {
        return false;
    }
}
