package org.xplatform.personal.impl.presentation.edit;

import a.au0;
import a.b1j;
import a.bzt;
import a.c8d;
import a.d2c0;
import a.duj;
import a.e2c0;
import a.fnq;
import a.i1w0;
import a.iqi;
import a.jf4;
import a.jiu0;
import a.k2c0;
import a.m2c0;
import a.maz;
import a.mne;
import a.n0o0;
import a.nqs;
import a.oe50;
import a.ol60;
import a.p0w0;
import a.p7m0;
import a.paw;
import a.pru;
import a.q3d;
import a.q7m0;
import a.rou;
import a.sac;
import a.sdj;
import a.vzg0;
import a.w2c0;
import a.w3k;
import a.wne;
import a.xae0;
import a.xzb0;
import a.y7d;
import a.z1x;
import a.zg;
import a.zje;
import java.util.LinkedHashMap;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.StringsKt;
import org.xplatform.personal.impl.presentation.edit.models.ProfileEditUiModelItemClickable;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends w3k {
    public static final sdj v = sdj.UNIVERSAL;
    public final /* synthetic */ xzb0 c;
    public final /* synthetic */ nqs d;
    public final bzt e;
    public final pru f;
    public final rou g;
    public final iqi h;
    public final duj i;
    public final i1w0 j;
    public final mne k;
    public final zg l;
    public final au0 m;
    public final vzg0 n;
    public final n0o0 o;
    public final xae0 p;
    public final ol60 q;
    public final LinkedHashMap r;
    public final p7m0 s;
    public int t;
    public final LinkedHashMap u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(bzt bztVar, pru pruVar, rou rouVar, iqi iqiVar, duj dujVar, i1w0 i1w0Var, mne mneVar, String str, zg zgVar, au0 au0Var, vzg0 vzg0Var, xzb0 xzb0Var, nqs nqsVar) {
        super(vzg0Var, q3d.j(xzb0Var, nqsVar));
        i1w0Var.getClass();
        byte b = 0;
        this.c = xzb0Var;
        this.d = nqsVar;
        this.e = bztVar;
        this.f = pruVar;
        this.g = rouVar;
        this.h = iqiVar;
        this.i = dujVar;
        this.j = i1w0Var;
        this.k = mneVar;
        this.l = zgVar;
        this.m = au0Var;
        this.n = vzg0Var;
        this.o = maz.b(new d2c0(this, b));
        xae0 xae0VarC = vzg0Var.c(ProfileEditViewModel$UiState.Loading.f46787a, "UI_STATE_KEY");
        this.p = xae0VarC;
        this.q = new ol60(3);
        this.r = new LinkedHashMap();
        this.s = q7m0.a(Boolean.FALSE);
        this.u = new LinkedHashMap();
        sac.T(new fnq(xae0VarC, new b(this, null), (byte) 4), jiu0.a(this), new e2c0(this, null, b));
    }

    public static ProfileEditUiModelItemClickable z(ProfileEditViewModel$UiState.Loaded loaded, w2c0 w2c0Var) {
        Object obj = loaded.f46786a.get(w2c0Var);
        if (obj instanceof ProfileEditUiModelItemClickable) {
            return (ProfileEditUiModelItemClickable) obj;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object A(ProfileEditViewModel$UiState.Loaded loaded, zje zjeVar) {
        i iVar;
        if (zjeVar instanceof i) {
            iVar = (i) zjeVar;
            int i = iVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                iVar.k = i - Integer.MIN_VALUE;
            } else {
                iVar = new i(this, zjeVar);
            }
        } else {
            iVar = new i(this, zjeVar);
        }
        Object objA = iVar.i;
        wne wneVar = wne.f39444a;
        int i2 = iVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ = z(loaded, w2c0.k);
            Integer num = profileEditUiModelItemClickableZ != null ? new Integer(profileEditUiModelItemClickableZ.b) : null;
            if (num != null) {
                return num;
            }
            iVar.k = 1;
            objA = this.g.a(false, iVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return new Integer(((m2c0) objA).g);
    }

    public final ProfileEditViewModel$UiState B() {
        return (ProfileEditViewModel$UiState) this.p.f40549a.getValue();
    }

    public final void C() {
        this.t = 0;
        this.n.e("ORIGINAL_UI_STATE_HASH_KEY", null);
        i1w0 i1w0Var = this.j;
        CopyOnWriteArrayList copyOnWriteArrayListQ = b1j.q(i1w0Var);
        ListIterator listIteratorP = b1j.p(copyOnWriteArrayListQ, new c8d(y7d.f42146a, p0w0.f26173a), i1w0Var, copyOnWriteArrayListQ, 0);
        while (true) {
            paw pawVar = (paw) listIteratorP;
            if (!pawVar.hasNext()) {
                return;
            } else {
                i1w0Var.a((oe50) pawVar.next());
            }
        }
    }

    public final void D(k2c0 k2c0Var) {
        this.q.f(k2c0Var);
    }

    public final void E(ProfileEditViewModel$UiState profileEditViewModel$UiState) {
        this.n.e("UI_STATE_KEY", profileEditViewModel$UiState);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object w(ProfileEditViewModel$UiState.Loaded loaded, zje zjeVar) {
        f fVar;
        if (zjeVar instanceof f) {
            fVar = (f) zjeVar;
            int i = fVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                fVar.k = i - Integer.MIN_VALUE;
            } else {
                fVar = new f(this, zjeVar);
            }
        } else {
            fVar = new f(this, zjeVar);
        }
        Object objA = fVar.i;
        wne wneVar = wne.f39444a;
        int i2 = fVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ = z(loaded, w2c0.l);
            Integer num = profileEditUiModelItemClickableZ != null ? new Integer(profileEditUiModelItemClickableZ.b) : null;
            if (num != null) {
                return num;
            }
            fVar.k = 1;
            objA = this.g.a(false, fVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return new Integer(((m2c0) objA).d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object x(ProfileEditViewModel$UiState.Loaded loaded, zje zjeVar) {
        g gVar;
        if (zjeVar instanceof g) {
            gVar = (g) zjeVar;
            int i = gVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                gVar.k = i - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, zjeVar);
            }
        } else {
            gVar = new g(this, zjeVar);
        }
        Object objA = gVar.i;
        wne wneVar = wne.f39444a;
        int i2 = gVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ = z(loaded, w2c0.j);
            Integer num = profileEditUiModelItemClickableZ != null ? new Integer(profileEditUiModelItemClickableZ.b) : null;
            if (num != null) {
                return num;
            }
            gVar.k = 1;
            objA = this.g.a(false, gVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        Integer intOrNull = StringsKt.toIntOrNull(((m2c0) objA).c);
        return new Integer(intOrNull != null ? intOrNull.intValue() : -1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object y(ProfileEditViewModel$UiState.Loaded loaded, zje zjeVar) {
        h hVar;
        if (zjeVar instanceof h) {
            hVar = (h) zjeVar;
            int i = hVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                hVar.k = i - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, zjeVar);
            }
        } else {
            hVar = new h(this, zjeVar);
        }
        Object objA = hVar.i;
        wne wneVar = wne.f39444a;
        int i2 = hVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            ProfileEditUiModelItemClickable profileEditUiModelItemClickableZ = z(loaded, w2c0.n);
            Integer num = profileEditUiModelItemClickableZ != null ? new Integer(profileEditUiModelItemClickableZ.b) : null;
            if (num != null) {
                return num;
            }
            hVar.k = 1;
            objA = this.g.a(false, hVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return new Integer(((m2c0) objA).F);
    }
}
