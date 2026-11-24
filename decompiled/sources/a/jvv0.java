package a;

import androidx.fragment.app.Fragment;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class jvv0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p7m0 f17222a;
    public gsv0 b;
    public final gmq c;

    public jvv0() {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        p7m0 p7m0VarA = q7m0.a(new gvv0(lunVar, lunVar, null));
        this.f17222a = p7m0VarA;
        this.c = i120.W(new h2c(p7m0VarA, (byte) 26));
    }

    public final void a(lwv0 lwv0Var, Fragment fragment) {
        p7m0 p7m0Var;
        Object value;
        Map mapK;
        Map mapK2;
        fragment.getClass();
        kvv0 kvv0VarV = ltt0.v(fragment);
        if (kvv0VarV.u("XBottomSheetOwnerHolder.dropOwner") == null) {
            kvv0VarV.s("XBottomSheetOwnerHolder.dropOwner", new gg60(this, kvv0VarV, (byte) 1));
        }
        fvv0 fvv0Var = new fvv0(fragment, fragment.g());
        do {
            p7m0Var = this.f17222a;
            value = p7m0Var.getValue();
            gvv0 gvv0Var = (gvv0) value;
            mapK = xp20.k(gvv0Var.f11994a, new Pair(lwv0Var, kvv0VarV));
            mapK2 = xp20.k(gvv0Var.b, new Pair(kvv0VarV, fvv0Var));
            mapK.getClass();
            mapK2.getClass();
        } while (!p7m0Var.m(value, new gvv0(mapK, mapK2, kvv0VarV)));
    }
}
