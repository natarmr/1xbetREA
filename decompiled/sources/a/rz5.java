package a;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rz5 implements pz5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final cmy f31341a;
    public float b = -1.0f;

    public rz5(List list) {
        this.f31341a = (cmy) list.get(0);
    }

    @Override // a.pz5
    public final boolean a(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // a.pz5
    public final cmy b() {
        return this.f31341a;
    }

    @Override // a.pz5
    public final boolean c(float f) {
        return !this.f31341a.c();
    }

    @Override // a.pz5
    public final float d() {
        return this.f31341a.b();
    }

    @Override // a.pz5
    public final float e() {
        return this.f31341a.a();
    }

    @Override // a.pz5
    public final boolean isEmpty() {
        return false;
    }
}
