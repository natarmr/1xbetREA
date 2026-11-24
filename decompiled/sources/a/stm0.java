package a;

/* JADX INFO: loaded from: classes3.dex */
public final class stm0 extends sub {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f32779a;
    public final /* synthetic */ CharSequence b;

    public stm0(CharSequence charSequence) {
        this.b = charSequence;
    }

    @Override // a.sub
    public final char a() {
        int i = this.f32779a;
        this.f32779a = i + 1;
        return this.b.charAt(i);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f32779a < this.b.length();
    }
}
