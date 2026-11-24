package a;

import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@ahi0
public final class elv0 {
    public static final dlv0 Companion = new dlv0();
    public static final a8z[] h = {null, null, null, null, null, null, maz.a(wez.f39042a, new y9v0((byte) 8))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8020a;
    public final String b;
    public final String c;
    public final Integer d;
    public final Integer e;
    public final Long f;
    public final List g;

    public /* synthetic */ elv0(int i, String str, String str2, String str3, Integer num, Integer num2, Long l, List list) {
        if ((i & 1) == 0) {
            this.f8020a = null;
        } else {
            this.f8020a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = num;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = num2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = l;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
    }
}
