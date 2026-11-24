package a;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class f4u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f8932a;
    public final Object b;

    public f4u(qfb0 qfb0Var) {
        this.f8932a = (byte) 25;
        qfb0Var.getClass();
        this.b = qfb0Var;
    }

    public gmq a(n0w n0wVar) {
        b6t b6tVar = (b6t) this.b;
        int iOrdinal = n0wVar.ordinal();
        if (iOrdinal == 0) {
            return b6tVar.b.f36841a.z();
        }
        if (iOrdinal == 1) {
            return new i89(b6tVar.c.f33385a, (byte) 22);
        }
        t9f.b();
        return null;
    }

    public xv10 b() {
        return (xv10) ((fsd) this.b).f10058a.d.getValue();
    }

    public j6d0 c() {
        e6d0 e6d0VarH0 = ((m6d0) this.b).f21264a.f19502a.f8413a.H0();
        e6d0VarH0.getClass();
        return new j6d0(e6d0VarH0.f7278a, e6d0VarH0.b == t6d0.c ? u6d0.b : u6d0.f35133a, e6d0VarH0.c, e6d0VarH0.d, e6d0VarH0.e, e6d0VarH0.f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable d(zje zjeVar) {
        ugu uguVar;
        LinkedHashSet linkedHashSet;
        if (zjeVar instanceof ugu) {
            uguVar = (ugu) zjeVar;
            int i = uguVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                uguVar.l = i - Integer.MIN_VALUE;
            } else {
                uguVar = new ugu(this, zjeVar);
            }
        } else {
            uguVar = new ugu(this, zjeVar);
        }
        Object obj = uguVar.j;
        wne wneVar = wne.f39444a;
        int i2 = uguVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            u8u u8uVar = (u8u) this.b;
            uguVar.i = linkedHashSet2;
            uguVar.l = 1;
            Object objV = u8uVar.v(uguVar);
            if (objV == wneVar) {
                return wneVar;
            }
            obj = objV;
            linkedHashSet = linkedHashSet2;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            linkedHashSet = uguVar.i;
            z1x.P(obj);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
            muy muyVar = (muy) obj2;
            if (linkedHashSet.add(muyVar.c) && !muyVar.f22433a.isEmpty()) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(zje zjeVar) {
        ziu ziuVar;
        if (zjeVar instanceof ziu) {
            ziuVar = (ziu) zjeVar;
            int i = ziuVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ziuVar.k = i - Integer.MIN_VALUE;
            } else {
                ziuVar = new ziu(this, zjeVar);
            }
        } else {
            ziuVar = new ziu(this, zjeVar);
        }
        Object objQ = ziuVar.i;
        wne wneVar = wne.f39444a;
        int i2 = ziuVar.k;
        if (i2 == 0) {
            z1x.P(objQ);
            ywu ywuVar = (ywu) this.b;
            ziuVar.k = 1;
            objQ = ywuVar.q(ziuVar);
            if (objQ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objQ);
        }
        return CollectionsKt.b0((Iterable) objQ, Separators.SP, null, null, null, 62);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0059  */
    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    public Object f(long j, zje zjeVar) {
        t9u t9uVar;
        xdu xduVar;
        byte b = this.f8932a;
        Object obj = this.b;
        switch (b) {
            case 9:
                if (zjeVar instanceof t9u) {
                    t9uVar = (t9u) zjeVar;
                    int i = t9uVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        t9uVar.k = i - Integer.MIN_VALUE;
                    } else {
                        t9uVar = new t9u(this, zjeVar);
                    }
                } else {
                    t9uVar = new t9u(this, zjeVar);
                }
                Object obj2 = t9uVar.i;
                wne wneVar = wne.f39444a;
                int i2 = t9uVar.k;
                if (i2 == 0) {
                    z1x.P(obj2);
                    t9uVar.k = 1;
                    Serializable serializableF = ((wti) obj).f(j, t9uVar);
                    return serializableF == wneVar ? wneVar : serializableF;
                }
                if (i2 == 1) {
                    z1x.P(obj2);
                    return ((j0g0) obj2).f15681a;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (zjeVar instanceof xdu) {
                    xduVar = (xdu) zjeVar;
                    int i3 = xduVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        xduVar.k = i3 - Integer.MIN_VALUE;
                    } else {
                        xduVar = new xdu(this, zjeVar);
                    }
                } else {
                    xduVar = new xdu(this, zjeVar);
                }
                Object obj3 = xduVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = xduVar.k;
                if (i4 == 0) {
                    z1x.P(obj3);
                    xduVar.k = 1;
                    Serializable serializableD = ((edu) obj).d(j, xduVar);
                    return serializableD == wneVar2 ? wneVar2 : serializableD;
                }
                if (i4 == 1) {
                    z1x.P(obj3);
                    return ((j0g0) obj3).f15681a;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    public /* synthetic */ f4u(Object obj, byte b) {
        this.f8932a = b;
        this.b = obj;
    }

    public f4u(fsd fsdVar) {
        this.f8932a = (byte) 19;
        fsdVar.getClass();
        this.b = fsdVar;
    }

    public f4u(edo edoVar) {
        this.f8932a = (byte) 5;
        edoVar.getClass();
        this.b = edoVar;
    }

    public f4u(goo gooVar) {
        this.f8932a = (byte) 7;
        gooVar.getClass();
        this.b = gooVar;
    }

    public f4u(ros rosVar) {
        this.f8932a = (byte) 10;
        rosVar.getClass();
        this.b = rosVar;
    }

    public f4u(pew pewVar) {
        this.f8932a = (byte) 12;
        pewVar.getClass();
        this.b = pewVar;
    }

    public f4u(m6d0 m6d0Var) {
        this.f8932a = (byte) 27;
        m6d0Var.getClass();
        this.b = m6d0Var;
    }
}
