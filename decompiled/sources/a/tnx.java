package a;

import android.os.Bundle;
import com.vk.dto.common.id.UserId;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public final class tnx extends p4 {
    public final wa3 c;

    public tnx(vkr0 vkr0Var, wa3 wa3Var) {
        super((Object) vkr0Var, (byte) 3);
        this.c = wa3Var;
    }

    public final Object n1(td9 td9Var, int i) {
        try {
            return this.c.q0(td9Var);
        } catch (yut0 e) {
            int i2 = e.b;
            if (i2 == 4 || i2 == 5 || i2 == 3610) {
                if (i < 1) {
                    Bundle bundle = e.d;
                    String string = bundle != null ? bundle.getString("access_token", null) : null;
                    String strM = w7n0.m((List) ((vkr0) this.b).m().c.getValue());
                    ((vkr0) this.b).m().getClass();
                    boolean zD = Intrinsics.d(string, strM);
                    if (string != null && !zD) {
                        return n1(td9Var, i + 1);
                    }
                }
                o1(e);
                synchronized (tnx.class) {
                    o1(e);
                }
            }
            throw e;
        }
    }

    public final void o1(yut0 yut0Var) throws yut0 {
        Object next;
        String str;
        Bundle bundle;
        Iterator it = ((Iterable) ((vkr0) this.b).m().c.getValue()).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            } else {
                next = it.next();
                str = ((xut0) next).f41528a;
                bundle = yut0Var.d;
            }
        } while (!Intrinsics.d(str, bundle != null ? bundle.getString("access_token", null) : null));
        xut0 xut0Var = (xut0) next;
        UserId userId = xut0Var != null ? xut0Var.e : null;
        if (userId == null || userId.f46053a == 0) {
            throw yut0Var;
        }
    }

    @Override // a.p4
    public final Object q0(td9 td9Var) {
        return n1(td9Var, 0);
    }
}
