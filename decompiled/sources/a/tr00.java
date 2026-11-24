package a;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes.dex */
public abstract class tr00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zfn f34401a = new zfn(new x800((byte) 21), (byte) 0);

    public static kg60 a(fet fetVar) {
        kg60 kg60Var = (kg60) fetVar.k(f34401a);
        Object obj = null;
        if (kg60Var == null) {
            fetVar.e0(1208426157);
            View view = (View) fetVar.k(dy2.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    kg60Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                kg60 kg60Var2 = tag instanceof kg60 ? (kg60) tag : null;
                if (kg60Var2 != null) {
                    kg60Var = kg60Var2;
                    break;
                }
                Object objV = k7n0.v(view);
                view = objV instanceof View ? (View) objV : null;
            }
        } else {
            fetVar.e0(1208423708);
        }
        fetVar.r(false);
        if (kg60Var != null) {
            fetVar.e0(1208423789);
            fetVar.r(false);
            return kg60Var;
        }
        fetVar.e0(1208428160);
        for (Context baseContext = (Context) fetVar.k(dy2.b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof kg60) {
                obj = baseContext;
                break;
            }
        }
        kg60 kg60Var3 = (kg60) obj;
        fetVar.r(false);
        return kg60Var3;
    }
}
