package a;

/* JADX INFO: loaded from: classes.dex */
public final class n4a implements zpq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n4a f22890a = new n4a();
    public static Boolean b;

    @Override // a.zpq
    public final void c(boolean z) {
        b = Boolean.valueOf(z);
    }

    @Override // a.zpq
    public final boolean d() {
        Boolean bool = b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw cs0.g("canFocus is read before it is written");
    }
}
