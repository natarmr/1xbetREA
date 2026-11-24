package a;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class smn0 {
    public static final rmn0 Companion = new rmn0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f32456a;
    public final Integer b;
    public final Integer c;
    public final String d;

    public /* synthetic */ smn0(int i, Integer num, Integer num2, String str, String str2) {
        if ((i & 1) == 0) {
            this.f32456a = null;
        } else {
            this.f32456a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
    }
}
