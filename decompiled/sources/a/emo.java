package a;

/* JADX INFO: loaded from: classes.dex */
public final class emo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ccs0 f8057a;
    public final int[] b;

    public emo(ccs0 ccs0Var, int... iArr) {
        if (iArr.length == 0) {
            f1t0.R("ETSDefinition", "Empty tracks are not allowed", new IllegalArgumentException());
        }
        this.f8057a = ccs0Var;
        this.b = iArr;
    }
}
