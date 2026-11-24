package a;

import android.javax.sip.message.Request;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class d4w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d4w f5476a;
    public static final d4w b;
    public static final d4w c;
    public static final d4w d;
    public static final d4w e;
    public static final d4w f;
    public static final d4w g;
    public static final d4w h;
    public static final d4w i;
    public static final d4w j;
    public static final d4w k;
    public static final /* synthetic */ d4w[] l;

    static {
        d4w d4wVar = new d4w("COPY", 0);
        f5476a = d4wVar;
        d4w d4wVar2 = new d4w("SHARE", 1);
        b = d4wVar2;
        d4w d4wVar3 = new d4w("PRINT", 2);
        c = d4wVar3;
        d4w d4wVar4 = new d4w("EDIT", 3);
        d = d4wVar4;
        d4w d4wVar5 = new d4w("AUTOSALE", 4);
        e = d4wVar5;
        d4w d4wVar6 = new d4w("SALE", 5);
        f = d4wVar6;
        d4w d4wVar7 = new d4w("POWERBET", 6);
        g = d4wVar7;
        d4w d4wVar8 = new d4w("HIDE", 7);
        h = d4wVar8;
        d4w d4wVar9 = new d4w(Request.CANCEL, 8);
        i = d4wVar9;
        d4w d4wVar10 = new d4w("TRANSACTION", 9);
        j = d4wVar10;
        d4w d4wVar11 = new d4w("DUPLICATE_COUPON", 10);
        k = d4wVar11;
        l = new d4w[]{d4wVar, d4wVar2, d4wVar3, d4wVar4, d4wVar5, d4wVar6, d4wVar7, d4wVar8, d4wVar9, d4wVar10, d4wVar11};
    }

    public static d4w valueOf(String str) {
        return (d4w) Enum.valueOf(d4w.class, str);
    }

    public static d4w[] values() {
        return (d4w[]) l.clone();
    }
}
