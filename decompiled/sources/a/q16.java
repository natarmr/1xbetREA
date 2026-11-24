package a;

import a.kuw;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class q16<T, Z extends kuw> {
    public static final p16 Companion = new p16();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f27936a;
    public final boolean b;
    public final kuw c;
    public final Object d;

    static {
        zna0 zna0Var = new zna0("org.xplatform.onexcore.data.model.BaseResponse", null, 4);
        zna0Var.j("Error", true);
        zna0Var.j("Success", true);
        zna0Var.j("ErrorCode", true);
        zna0Var.j("Value", true);
    }

    public /* synthetic */ q16(int i, String str, boolean z, kuw kuwVar, Object obj) {
        this.f27936a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = kuwVar;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = obj;
        }
    }

    public final Object a() throws zhi0 {
        String str = this.f27936a;
        if (str != null && str.length() > 0) {
            throw new zhi0(str, this.c, (Integer) null, 12);
        }
        Object obj = this.d;
        if (obj == null) {
            jf4.k(null);
            return null;
        }
        if (this.b) {
            return obj;
        }
        jf4.k(null);
        return null;
    }
}
