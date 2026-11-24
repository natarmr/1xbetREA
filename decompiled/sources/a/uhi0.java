package a;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class uhi0 implements Serializable {
    public static final thi0 Companion = new thi0();
    public static final a8z[] h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35681a;
    public final String b;
    public final Integer c;
    public final List d;
    public final String e;
    public final Map f;
    public final w0o g;

    static {
        wez wezVar = wez.f39042a;
        h = new a8z[]{null, null, null, maz.a(wezVar, new gei0((byte) 4)), null, maz.a(wezVar, new gei0((byte) 5)), null};
    }

    public /* synthetic */ uhi0(int i, String str, String str2, Integer num, List list, String str3, Map map, w0o w0oVar) {
        if ((i & 1) == 0) {
            this.f35681a = null;
        } else {
            this.f35681a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = map;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = w0oVar;
        }
    }
}
