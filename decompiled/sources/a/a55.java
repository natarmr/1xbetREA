package a;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class a55 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hzj f252a;
    public final List b;
    public final int c;
    public final int d;
    public final agn e;

    public a55(hzj hzjVar, List list, int i, int i2, agn agnVar) {
        this.f252a = hzjVar;
        this.b = list;
        this.c = i;
        this.d = i2;
        this.e = agnVar;
    }

    public static gr00 a(hzj hzjVar) {
        gr00 gr00Var = new gr00();
        if (hzjVar == null) {
            hny.u("Null surface");
            return null;
        }
        gr00Var.f11760a = hzjVar;
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            hny.u("Null sharedSurfaces");
            return null;
        }
        gr00Var.b = list;
        gr00Var.c = -1;
        gr00Var.d = -1;
        gr00Var.e = agn.d;
        return gr00Var;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a55)) {
            return false;
        }
        a55 a55Var = (a55) obj;
        return this.f252a.equals(a55Var.f252a) && this.b.equals(a55Var.b) && this.c == a55Var.c && this.d == a55Var.d && this.e.equals(a55Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() ^ ((((((((this.f252a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * (-721379959)) ^ this.c) * 1000003) ^ this.d) * 1000003);
    }

    public final String toString() {
        return "OutputConfig{surface=" + this.f252a + ", sharedSurfaces=" + this.b + ", physicalCameraId=null, mirrorMode=" + this.c + ", surfaceGroupId=" + this.d + ", dynamicRange=" + this.e + "}";
    }
}
