package a;

import android.gov.nist.core.Separators;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import org.xbet.client1.R;
import org.xplatform.onexdatabase.OnexDatabase;

/* JADX INFO: loaded from: classes5.dex */
public final class svu implements cfr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f32888a;

    public svu(gii0 gii0Var, byte b) {
        gii0Var.getClass();
        switch (b) {
            case 23:
                this.f32888a = new tpv(gii0Var, (byte) 9);
                break;
            case 24:
                this.f32888a = new tpv(gii0Var, (byte) 11);
                break;
            case AvailableCode.ERROR_ON_ACTIVITY_RESULT /* 25 */:
            case AvailableCode.ERROR_NO_ACTIVITY /* 26 */:
            default:
                this.f32888a = new tpv(gii0Var, (byte) 6);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                this.f32888a = new tpv(gii0Var, (byte) 12);
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                this.f32888a = new tpv(gii0Var, (byte) 15);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable a(int i, zje zjeVar) {
        qxy qxyVar;
        if (zjeVar instanceof qxy) {
            qxyVar = (qxy) zjeVar;
            int i2 = qxyVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qxyVar.k = i2 - Integer.MIN_VALUE;
            } else {
                qxyVar = new qxy(this, zjeVar);
            }
        } else {
            qxyVar = new qxy(this, zjeVar);
        }
        Object objW0 = qxyVar.i;
        wne wneVar = wne.f39444a;
        int i3 = qxyVar.k;
        yje yjeVar = null;
        if (i3 == 0) {
            z1x.P(objW0);
            jxy jxyVar = (jxy) this.f32888a;
            qxyVar.k = 1;
            objW0 = sj3.w0(qxyVar, jxyVar.f17333a, new ixy(i, yjeVar, (byte) 0), true, false);
            if (objW0 == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objW0);
        }
        Iterable<hxy> iterable = (Iterable) objW0;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (hxy hxyVar : iterable) {
            arrayList.add(new pxy(hxyVar.b, hxyVar.f13835a, hxyVar.c));
        }
        return arrayList;
    }

    public Object b(int i, zje zjeVar) {
        return sj3.w0(zjeVar, ((jxy) this.f32888a).f17333a, new ixy(i, null, (byte) 1), true, false);
    }

    public Object c(List list, zje zjeVar) {
        jxy jxyVar = (jxy) this.f32888a;
        jxyVar.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append("delete from last_action where id in (");
        tnq0.h(list.size(), sb);
        sb.append(Separators.RPAREN);
        Object objW0 = sj3.w0(zjeVar, jxyVar.f17333a, new iu6(sb.toString(), list, null, (byte) 1), false, true);
        wne wneVar = wne.f39444a;
        if (objW0 != wneVar) {
            objW0 = Unit.f46060a;
        }
        return objW0 == wneVar ? objW0 : Unit.f46060a;
    }

    public Object d(int i, zje zjeVar) {
        Object objW0 = sj3.w0(zjeVar, ((jxy) this.f32888a).f17333a, new lqe(i, null, (byte) 1), false, true);
        wne wneVar = wne.f39444a;
        if (objW0 != wneVar) {
            objW0 = Unit.f46060a;
        }
        return objW0 == wneVar ? objW0 : Unit.f46060a;
    }

    public ewt e(int i) {
        return new ewt(wwb.C(((jxy) this.f32888a).f17333a, new String[]{"last_action"}, new ixy(i, null, (byte) 2)), this, (byte) 19);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(zje zjeVar) {
        oew oewVar;
        if (zjeVar instanceof oew) {
            oewVar = (oew) zjeVar;
            int i = oewVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                oewVar.k = i - Integer.MIN_VALUE;
            } else {
                oewVar = new oew(this, zjeVar);
            }
        } else {
            oewVar = new oew(this, zjeVar);
        }
        Object objA = oewVar.i;
        wne wneVar = wne.f39444a;
        int i2 = oewVar.k;
        if (i2 == 0) {
            z1x.P(objA);
            ucw ucwVar = (ucw) ((tpv) this.f32888a).invoke();
            oewVar.k = 1;
            objA = ucwVar.a(oewVar);
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
        return ((dx5) objA).a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(int i, zje zjeVar, String str) {
        e310 e310Var;
        if (zjeVar instanceof e310) {
            e310Var = (e310) zjeVar;
            int i2 = e310Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                e310Var.k = i2 - Integer.MIN_VALUE;
            } else {
                e310Var = new e310(this, zjeVar);
            }
        } else {
            e310Var = new e310(this, zjeVar);
        }
        Object objA = e310Var.i;
        wne wneVar = wne.f39444a;
        int i3 = e310Var.k;
        if (i3 == 0) {
            z1x.P(objA);
            zy00 zy00Var = (zy00) ((tpv) this.f32888a).invoke();
            e310Var.k = 1;
            objA = zy00Var.a(i, str, e310Var);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        return ((dx5) objA).a();
    }

    public i89 h() {
        return new i89(((l3z) this.f32888a).b.f11945a, (byte) 22);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable i(long j, zje zjeVar) {
        d3v d3vVar;
        if (zjeVar instanceof d3v) {
            d3vVar = (d3v) zjeVar;
            int i = d3vVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                d3vVar.k = i - Integer.MIN_VALUE;
            } else {
                d3vVar = new d3v(this, zjeVar);
            }
        } else {
            d3vVar = new d3v(this, zjeVar);
        }
        Object objU = d3vVar.i;
        wne wneVar = wne.f39444a;
        int i2 = d3vVar.k;
        if (i2 == 0) {
            z1x.P(objU);
            fuj0 fuj0Var = (fuj0) this.f32888a;
            d3vVar.k = 1;
            objU = fuj0Var.u(j, d3vVar);
            if (objU == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objU);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : (Iterable) objU) {
            ijs0 ijs0Var = (ijs0) obj;
            if (ijs0Var.f14891a.getTime() != 0 && ijs0Var.b.f27106a.length() != 0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable j(zje zjeVar) {
        dxu dxuVar;
        Object next;
        z220 z220Var = (z220) this.f32888a;
        if (zjeVar instanceof dxu) {
            dxuVar = (dxu) zjeVar;
            int i = dxuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                dxuVar.k = i - Integer.MIN_VALUE;
            } else {
                dxuVar = new dxu(this, zjeVar);
            }
        } else {
            dxuVar = new dxu(this, zjeVar);
        }
        Object objL = dxuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = dxuVar.k;
        if (i2 == 0) {
            z1x.P(objL);
            dxuVar.k = 1;
            objL = z220Var.l(dxuVar);
            if (objL == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objL);
        }
        List list = (List) objL;
        List<epn0> list2 = (List) ((yvn0) z220Var.d).d.getValue();
        ArrayList arrayList = new ArrayList(r3d.q(list2, 10));
        for (epn0 epn0Var : list2) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                epn0 epn0Var2 = (epn0) next;
                if (epn0Var2.f8198a == epn0Var.f8198a && epn0Var2.e == epn0Var.e) {
                    break;
                }
            }
            arrayList.add(epn0.a(epn0Var, next != null));
        }
        return arrayList;
    }

    public void k(String str, boolean z, boolean z2, boolean z3, boolean z4) {
        str.getClass();
        ((r7v) this.f32888a).e(z ? "promo" : "standart", str, z2, z3, z4);
    }

    public boolean l() {
        return ((bb6) this.f32888a).f2293a.getResources().getBoolean(R.bool.isTablet);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object m(int i, int i2, long j, zje zjeVar, Date date) {
        s2v s2vVar;
        if (zjeVar instanceof s2v) {
            s2vVar = (s2v) zjeVar;
            int i3 = s2vVar.k;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                s2vVar.k = i3 - Integer.MIN_VALUE;
            } else {
                s2vVar = new s2v(this, zjeVar);
            }
        } else {
            s2vVar = new s2v(this, zjeVar);
        }
        s2v s2vVar2 = s2vVar;
        Object obj = s2vVar2.i;
        wne wneVar = wne.f39444a;
        int i4 = s2vVar2.k;
        if (i4 != 0) {
            if (i4 == 1) {
                z1x.P(obj);
                return ((j0g0) obj).f15681a;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        y3v y3vVar = (y3v) this.f32888a;
        s2vVar2.k = 1;
        Object objG = y3vVar.g(i, i2, j, s2vVar2, date);
        return objG == wneVar ? wneVar : objG;
    }

    public Object n(boolean z, yz5 yz5Var, fw00 fw00Var) {
        tpv tpvVar = (tpv) this.f32888a;
        if (z) {
            if (yz5Var != null) {
                if (yz5Var instanceof h7a) {
                    return ((ew00) tpvVar.invoke()).a("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjIzNzg1NDU3NTM0MSIsInVzZXJuYW1lIjoidXNlcmFuc2VydmljZSIsInRva2VuIjoieHU4bTY1TTZlMVpEZzhGUEUxM1JTNDFsMXNSOCJ9.-fv4_Ogs4NQcEz29Y4QVdFAJcGokc3N30i0FmpEW0fI", (h7a) yz5Var, fw00Var);
                }
                if (yz5Var instanceof o6a) {
                    return ((ew00) tpvVar.invoke()).f("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjIzNzg1NDU3NTM0MSIsInVzZXJuYW1lIjoidXNlcmFuc2VydmljZSIsInRva2VuIjoieHU4bTY1TTZlMVpEZzhGUEUxM1JTNDFsMXNSOCJ9.-fv4_Ogs4NQcEz29Y4QVdFAJcGokc3N30i0FmpEW0fI", (o6a) yz5Var, fw00Var);
                }
                if (yz5Var instanceof lhk0) {
                    return ((ew00) tpvVar.invoke()).h("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjIzNzg1NDU3NTM0MSIsInVzZXJuYW1lIjoidXNlcmFuc2VydmljZSIsInRva2VuIjoieHU4bTY1TTZlMVpEZzhGUEUxM1JTNDFsMXNSOCJ9.-fv4_Ogs4NQcEz29Y4QVdFAJcGokc3N30i0FmpEW0fI", (lhk0) yz5Var, fw00Var);
                }
                if (yz5Var instanceof iw00) {
                    return ((ew00) tpvVar.invoke()).d("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjIzNzg1NDU3NTM0MSIsInVzZXJuYW1lIjoidXNlcmFuc2VydmljZSIsInRva2VuIjoieHU4bTY1TTZlMVpEZzhGUEUxM1JTNDFsMXNSOCJ9.-fv4_Ogs4NQcEz29Y4QVdFAJcGokc3N30i0FmpEW0fI", (iw00) yz5Var, fw00Var);
                }
                if (yz5Var instanceof t6a) {
                    return ((ew00) tpvVar.invoke()).k("eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpZCI6IjIzNzg1NDU3NTM0MSIsInVzZXJuYW1lIjoidXNlcmFuc2VydmljZSIsInRva2VuIjoieHU4bTY1TTZlMVpEZzhGUEUxM1JTNDFsMXNSOCJ9.-fv4_Ogs4NQcEz29Y4QVdFAJcGokc3N30i0FmpEW0fI", (t6a) yz5Var, fw00Var);
                }
            }
            t9f.b();
            return null;
        }
        if (yz5Var != null) {
            if (yz5Var instanceof h7a) {
                return ((ew00) tpvVar.invoke()).j("5.0", (h7a) yz5Var, fw00Var);
            }
            if (yz5Var instanceof o6a) {
                return ((ew00) tpvVar.invoke()).i("5.0", (o6a) yz5Var, fw00Var);
            }
            if (yz5Var instanceof lhk0) {
                return ((ew00) tpvVar.invoke()).c("5.0", (lhk0) yz5Var, fw00Var);
            }
            if (yz5Var instanceof iw00) {
                return ((ew00) tpvVar.invoke()).e("5.0", (iw00) yz5Var, fw00Var);
            }
            if (yz5Var instanceof t6a) {
                return ((ew00) tpvVar.invoke()).g("5.0", (t6a) yz5Var, fw00Var);
            }
        }
        t9f.b();
        return null;
    }

    public void o(tw9 tw9Var) {
        if (tw9Var.b) {
            return;
        }
        ucs0 ucs0Var = (ucs0) this.f32888a;
        synchronized (((ArrayList) ucs0Var.e)) {
            ((ArrayList) ucs0Var.e).remove(tw9Var);
        }
    }

    @Override // a.cfr
    public void onFailure(Throwable th) throws Exception {
        ((b1x) this.f32888a).close();
    }

    @Override // a.cfr
    public void onSuccess(Object obj) {
    }

    public svu(kz90 kz90Var) {
        kz90Var.getClass();
        this.f32888a = kz90Var;
    }

    public /* synthetic */ svu(Object obj) {
        this.f32888a = obj;
    }

    public svu(wxs0 wxs0Var, d4c d4cVar) {
        d4cVar.getClass();
        this.f32888a = d4cVar;
    }

    public svu(l3z l3zVar) {
        l3zVar.getClass();
        this.f32888a = l3zVar;
    }

    public svu(rrc rrcVar) {
        this.f32888a = ((OnexDatabase) rrcVar.b).o();
    }

    public svu(y1f0 y1f0Var) {
        y1f0Var.getClass();
        this.f32888a = y1f0Var;
    }

    public svu(xpy xpyVar) {
        this.f32888a = new ArrayList(1);
    }
}
