package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class ocn {
    public static final hcn Companion = new hcn();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f25034a;
    public final Double b;
    public final Double c;
    public final Boolean d;
    public final String e;
    public final ncn f;
    public final Boolean g;
    public final kcn h;

    public /* synthetic */ ocn(int i, Long l, Double d, Double d2, Boolean bool, String str, ncn ncnVar, Boolean bool2, kcn kcnVar) {
        if ((i & 1) == 0) {
            this.f25034a = null;
        } else {
            this.f25034a = l;
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
            this.f = ncnVar;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = bool2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = kcnVar;
        }
    }
}
