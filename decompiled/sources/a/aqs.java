package a;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class aqs {
    public static final nps Companion = new nps();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f1311a;
    public final vps b;
    public final vps c;
    public final Long d;
    public final sps e;

    public /* synthetic */ aqs(int i, Integer num, vps vpsVar, vps vpsVar2, Long l, sps spsVar) {
        if ((i & 1) == 0) {
            this.f1311a = null;
        } else {
            this.f1311a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = vpsVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = vpsVar2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = spsVar;
        }
    }
}
