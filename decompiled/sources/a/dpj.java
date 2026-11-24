package a;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class dpj extends upj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final upj f6469a;
    public final String b;
    public final String c;

    public dpj(upj upjVar, String str, String str2) {
        upjVar.getClass();
        this.f6469a = upjVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpj)) {
            return false;
        }
        dpj dpjVar = (dpj) obj;
        return Intrinsics.d(this.f6469a, dpjVar.f6469a) && this.b.equals(dpjVar.b) && this.c.equals(dpjVar.c);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ua80.b(ua80.b(this.f6469a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TelegramBot(deeplinkAction=");
        sb.append(this.f6469a);
        sb.append(", botId=");
        sb.append(this.b);
        sb.append(", tbToken=");
        return axq.n(sb, this.c, ", hasBackStack=false)");
    }
}
