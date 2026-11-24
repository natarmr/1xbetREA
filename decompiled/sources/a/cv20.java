package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class cv20 {
    public static final vu20 Companion = new vu20();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f5013a;
    public final Double b;
    public final Double c;
    public final Boolean d;
    public final String e;
    public final bv20 f;
    public final Long g;
    public final Boolean h;
    public final yu20 i;

    public /* synthetic */ cv20(int i, Long l, Double d, Double d2, Boolean bool, String str, bv20 bv20Var, Long l2, Boolean bool2, yu20 yu20Var) {
        if ((i & 1) == 0) {
            this.f5013a = null;
        } else {
            this.f5013a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = d;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = d2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = bv20Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = yu20Var;
        }
    }
}
