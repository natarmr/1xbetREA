package a;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class ip9 {
    public static final hp9 Companion = new hp9();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f15151a;
    public final String b;

    public /* synthetic */ ip9(int i, Integer num, String str) {
        if ((i & 1) == 0) {
            this.f15151a = null;
        } else {
            this.f15151a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
    }
}
