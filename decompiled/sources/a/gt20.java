package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class gt20 {
    public static final ft20 Companion = new ft20();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Float f11860a;
    public final String b;
    public final Long c;

    public /* synthetic */ gt20(int i, Float f, String str, Long l) {
        if ((i & 1) == 0) {
            this.f11860a = null;
        } else {
            this.f11860a = f;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
    }
}
