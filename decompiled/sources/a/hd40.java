package a;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class hd40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nw20 f12853a;
    public final cu b;
    public final HashMap c;

    public hd40(Context context, cu cuVar) {
        nw20 nw20Var = new nw20(context);
        this.c = new HashMap();
        this.f12853a = nw20Var;
        this.b = cuVar;
    }

    public final synchronized los0 a(String str) {
        if (this.c.containsKey(str)) {
            return (los0) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryB = this.f12853a.b(str);
        if (cctBackendFactoryB == null) {
            return null;
        }
        cu cuVar = this.b;
        los0 los0VarCreate = cctBackendFactoryB.create(new i35((Context) cuVar.b, (quc) cuVar.c, (quc) cuVar.d, str));
        this.c.put(str, los0VarCreate);
        return los0VarCreate;
    }
}
