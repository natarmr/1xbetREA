package a;

/* JADX INFO: loaded from: classes.dex */
public final class w3e implements x3e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f38497a;
    public String b;
    public String c;
    public float d;
    public float e;

    @Override // a.x3e
    public final float value() {
        float f = this.d;
        if (f >= this.e) {
            this.f38497a = true;
        }
        if (this.f38497a) {
            return f;
        }
        float f2 = f + 1.0f;
        this.d = f2;
        return f2;
    }
}
