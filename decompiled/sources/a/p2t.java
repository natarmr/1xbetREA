package a;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class p2t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q7d0 f26269a;
    public final vby b;

    public p2t(vby vbyVar, q7d0 q7d0Var) {
        this.f26269a = q7d0Var;
        this.b = vbyVar;
    }

    public final List a() {
        String string = this.f26269a.a().getString("GAME_ACTIONS_KEY", "");
        String str = string != null ? string : "";
        if (str.length() == 0) {
            return null;
        }
        try {
            return (List) this.b.b(new zw3(rq60.Companion.serializer(), (byte) 0), str);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public final void b(List list) {
        list.getClass();
        this.f26269a.g("GAME_ACTIONS_KEY", this.b.d(new zw3(rq60.Companion.serializer(), (byte) 0), list));
    }
}
