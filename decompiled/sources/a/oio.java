package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@ahi0
public final class oio {
    public static final nio Companion = new nio();
    public static final a8z[] e = {maz.a(wez.f39042a, new ago(13)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f25322a;
    public final String b;
    public final Integer c;
    public final Integer d;

    public /* synthetic */ oio(int i, Integer num, Integer num2, String str, List list) {
        if ((i & 1) == 0) {
            this.f25322a = null;
        } else {
            this.f25322a = list;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
    }
}
