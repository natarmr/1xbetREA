package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class awm0 {
    public static final zvm0 Companion = new zvm0();
    public static final a8z[] i = {null, null, null, null, null, null, maz.a(wez.f39042a, new x9m0(18)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f1582a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final Integer e;
    public final Boolean f;
    public final List g;
    public final Boolean h;

    public /* synthetic */ awm0(int i2, String str, Long l, Long l2, Long l3, Integer num, Boolean bool, List list, Boolean bool2) {
        if ((i2 & 1) == 0) {
            this.f1582a = null;
        } else {
            this.f1582a = str;
        }
        if ((i2 & 2) == 0) {
            this.b = null;
        } else {
            this.b = l;
        }
        if ((i2 & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i2 & 8) == 0) {
            this.d = null;
        } else {
            this.d = l3;
        }
        if ((i2 & 16) == 0) {
            this.e = null;
        } else {
            this.e = num;
        }
        if ((i2 & 32) == 0) {
            this.f = null;
        } else {
            this.f = bool;
        }
        if ((i2 & 64) == 0) {
            this.g = null;
        } else {
            this.g = list;
        }
        if ((i2 & 128) == 0) {
            this.h = null;
        } else {
            this.h = bool2;
        }
    }
}
