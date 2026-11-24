package a;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class nok0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final eyg0 f23871a;
    public final iok0 b;
    public final mne c;

    public nok0(eyg0 eyg0Var, iok0 iok0Var, mne mneVar) {
        iok0Var.getClass();
        this.f23871a = eyg0Var;
        this.b = iok0Var;
        this.c = mneVar;
    }

    public final List a() {
        Object g0g0Var;
        String str = "";
        iok0 iok0Var = this.b;
        q7d0 q7d0Var = iok0Var.f15121a;
        try {
            e0g0 e0g0Var = j0g0.b;
            String string = q7d0Var.a().getString("SPECIAL_EVENT_INFO_PREF_KEY_V4", "");
            if (string != null) {
                str = string;
            }
            g0g0Var = str.length() > 0 ? (List) iok0Var.b.b(new zw3(lok0.Companion.serializer(), (byte) 0), str) : iun.f15405a;
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) != null) {
            q7d0Var.h("SPECIAL_EVENT_INFO_PREF_KEY_V4");
            g0g0Var = iun.f15405a;
        }
        return (List) g0g0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        if (r11 == r8) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(boolean r12, a.zje r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.nok0.b(boolean, a.zje):java.lang.Object");
    }
}
