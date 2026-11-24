package a;

import android.content.ComponentCallbacks2;
import android.os.Bundle;
import java.util.Collections;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"La/f0a0;", "La/yx5;", "<init>", "()V", "a/xi70", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class f0a0 extends yx5 {
    public fiu0 K1;
    public final phf0 L1;
    public final boolean M1;
    public final s0r N1;
    public final a8z O1;
    public static final /* synthetic */ iiy[] Q1 = {new ez40(f0a0.class, "playerId", "getPlayerId()Ljava/lang/String;", 0), new j0d0(f0a0.class, "binding", "getBinding()Lorg/xplatform/uikit/databinding/ComposeFragmentBinding;", 0)};
    public static final xi70 P1 = new xi70();

    public f0a0() {
        super(R.layout.compose_fragment);
        this.L1 = new phf0("PLAYER_ID");
        this.M1 = true;
        this.N1 = ltt0.o(this, e0a0.f6979a);
        this.O1 = xbc.b0(this, sre0.f32672a.b(r0a0.class), new pl70(this, (byte) 26));
    }

    @Override // a.yx5
    public final void B0(Bundle bundle) {
        Object objN = this.N1.n(Q1[1], this);
        objN.getClass();
        b1j.t(((aid) objN).f919a, new ugd(442674896, true, new cz90(this, (byte) 1)));
    }

    @Override // a.yx5
    public final void C0() {
        LinkedHashMap linkedHashMap = tz90.f34795a;
        iiy[] iiyVarArr = Q1;
        iiy iiyVar = iiyVarArr[0];
        phf0 phf0Var = this.L1;
        String strN = phf0Var.n(this, iiyVar);
        cb50 cb50VarV = efx.v(this);
        strN.getClass();
        cb50VarV.getClass();
        String strConcat = strN.concat(cb50VarV.f4046a);
        String strN2 = phf0Var.n(this, iiyVarArr[0]);
        i1w0 i1w0VarF = a4n0.f(this);
        strN2.getClass();
        i1w0VarF.getClass();
        LinkedHashMap linkedHashMap2 = tz90.f34795a;
        boi boiVar = (boi) linkedHashMap2.get(strConcat);
        if (boiVar == null) {
            ComponentCallbacks2 application = n0().getApplication();
            application.getClass();
            af3 af3Var = application instanceof af3 ? (af3) application : null;
            if (af3Var != null) {
                o5d0 o5d0Var = (o5d0) af3Var.d().get(sz90.class);
                ze3 ze3Var = o5d0Var != null ? (ze3) o5d0Var.get() : null;
                sz90 sz90Var = (sz90) (ze3Var instanceof sz90 ? ze3Var : null);
                if (sz90Var != null) {
                    cad cadVar = sz90Var.f33061a;
                    duj dujVar = sz90Var.b;
                    ctf0 ctf0Var = sz90Var.c;
                    gii0 gii0Var = sz90Var.d;
                    m1e m1eVar = sz90Var.e;
                    knf0 knf0Var = sz90Var.f;
                    ocl oclVar = sz90Var.g;
                    ctf0Var.getClass();
                    gii0Var.getClass();
                    m1eVar.getClass();
                    knf0Var.getClass();
                    boi boiVar2 = new boi(cadVar, gii0Var, dujVar, oclVar, m1eVar, i1w0VarF, ctf0Var, strN2, knf0Var);
                    linkedHashMap2.put(strConcat, boiVar2);
                    boiVar = boiVar2;
                }
            }
            jf4.n(b1j.i(sz90.class, "Cannot create dependency "));
            return;
        }
        this.K1 = new fiu0(Collections.singletonMap(r0a0.class, boiVar.k));
    }

    @Override // a.yx5
    /* JADX INFO: renamed from: x0, reason: from getter */
    public final boolean getM1() {
        return this.M1;
    }
}
