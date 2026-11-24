package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class w07 {
    public static final v07 Companion = new v07();
    public static final a8z[] f = {null, null, null, null, maz.a(wez.f39042a, new t07(0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f38336a;
    public final Boolean b;
    public final String c;
    public final Integer d;
    public final List e;

    public /* synthetic */ w07(int i, Boolean bool, Integer num, Integer num2, String str, List list) {
        if ((i & 1) == 0) {
            this.f38336a = null;
        } else {
            this.f38336a = num;
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list;
        }
    }
}
