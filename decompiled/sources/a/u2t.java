package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@ahi0
public final class u2t<T> {
    public static final t2t Companion = new t2t();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f34962a;
    public final l5t b;
    public final Boolean c;
    public final Object d;

    static {
        zna0 zna0Var = new zna0("org.xplatform.onexuser.domain.entity.onexgame.GamesBaseResponse", null, 4);
        zna0Var.j("Error", true);
        zna0Var.j("ErrorCode", true);
        zna0Var.j("Success", true);
        zna0Var.j("Value", true);
    }

    public /* synthetic */ u2t(int i, String str, l5t l5tVar, Boolean bool, Object obj) {
        if ((i & 1) == 0) {
            this.f34962a = null;
        } else {
            this.f34962a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l5tVar;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = obj;
        }
    }

    public final Object a() {
        String str = this.f34962a;
        if (str == null) {
            str = "";
        }
        if (str.length() <= 0) {
            if (Intrinsics.d(this.c, Boolean.TRUE)) {
                Object obj = this.d;
                if (obj != null) {
                    return obj;
                }
                jf4.k(null);
                return null;
            }
        }
        l5t l5tVar = this.b;
        if (l5tVar == null) {
            l5tVar = l5t.b;
        }
        throw new qct(str, l5tVar);
    }
}
