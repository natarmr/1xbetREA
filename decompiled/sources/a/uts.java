package a;

/* JADX INFO: loaded from: classes4.dex */
@ahi0
public final class uts {
    public static final tts Companion = new tts();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f36269a;
    public final Boolean b;
    public final String c;

    public /* synthetic */ uts(int i, Boolean bool, Long l, String str) {
        if ((i & 1) == 0) {
            this.f36269a = null;
        } else {
            this.f36269a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str;
        }
    }
}
