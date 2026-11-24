package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class faa0 {
    public static final u9a0 Companion = new u9a0();
    public static final a8z[] i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9199a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final String f;
    public final List g;
    public final List h;

    static {
        wez wezVar = wez.f39042a;
        i = new a8z[]{null, null, null, null, null, null, maz.a(wezVar, new wm90((byte) 28)), maz.a(wezVar, new wm90((byte) 29))};
    }

    public /* synthetic */ faa0(int i2, String str, String str2, String str3, Integer num, Integer num2, String str4, List list, List list2) {
        if ((i2 & 1) == 0) {
            this.f9199a = null;
        } else {
            this.f9199a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = str4;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = list2;
        }
    }
}
