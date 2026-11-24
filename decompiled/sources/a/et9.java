package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class et9 {
    public static final dt9 Companion = new dt9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f8366a;
    public final String b;
    public final String c;

    public /* synthetic */ et9(int i, Integer num, String str, String str2) {
        if ((i & 1) == 0) {
            this.f8366a = null;
        } else {
            this.f8366a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }
}
