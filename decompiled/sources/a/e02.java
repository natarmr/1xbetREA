package a;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes2.dex */
@ahi0
public final class e02 {
    public static final d02 Companion = new d02();
    public static final a8z[] f = {maz.a(wez.f39042a, new c51(27)), null, null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f6969a;
    public final String b;
    public final String c;
    public final int d;
    public final String e;

    public /* synthetic */ e02(int i, List list, String str, String str2, int i2, String str3) {
        if ((i & 1) == 0) {
            this.f6969a = null;
        } else {
            this.f6969a = list;
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
        if ((i & 8) == 0) {
            this.d = 0;
        } else {
            this.d = i2;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public final void a() throws lx50, cii0 {
        b02 b02Var;
        Long l;
        int i = this.d;
        if (i == -7) {
            List list = this.f6969a;
            long jLongValue = (list == null || (b02Var = (b02) CollectionsKt.firstOrNull(list)) == null || (l = b02Var.e) == null) ? 0L : l.longValue();
            String str = this.c;
            throw new lx50(jLongValue, str != null ? str : "");
        }
        if (i != 0) {
            String str2 = this.e;
            throw new cii0(i, str2 != null ? str2 : "");
        }
    }
}
