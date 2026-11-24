package a;

import android.view.View;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IndexedValue;
import kotlin.jvm.internal.Intrinsics;
import org.xplatform.secret.impl.KeysImpl;

/* JADX INFO: loaded from: classes3.dex */
public final class u8u implements zf60, n1x, e5n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f35249a;
    public Object b;
    public Object c;

    public u8u(gii0 gii0Var, byte b) {
        this.f35249a = b;
        gii0Var.getClass();
        switch (b) {
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                this.c = gii0Var;
                this.b = new y2x(this, (byte) 22);
                break;
            default:
                this.c = gii0Var;
                this.b = new bdv(this, (byte) 6);
                break;
        }
    }

    public static gx10 a(vh0 vh0Var) {
        return new gx10(iz30.A, vh0.a(vh0Var));
    }

    public static LinkedHashMap n(int i, int i2, List list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<hf6> arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((hf6) obj).e) {
                arrayList.add(obj);
            }
        }
        for (hf6 hf6Var : arrayList) {
            int i3 = hf6Var.f12958a;
            List list2 = hf6Var.c;
            Integer numValueOf = Integer.valueOf(i3);
            int i4 = hf6Var.f12958a;
            linkedHashMap.put(numValueOf, Integer.valueOf(i4 == i ? list2.size() - 1 : i4 == i2 ? list2.size() + 1 : list2.size()));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x0108  */
    public Object b(String str, zje zjeVar) {
        cnw cnwVar;
        String str2;
        hmw hmwVar;
        List<i040> list;
        bnw bnwVar;
        knf0 knf0Var = (knf0) this.b;
        if (zjeVar instanceof cnw) {
            cnwVar = (cnw) zjeVar;
            int i = cnwVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                cnwVar.k = i - Integer.MIN_VALUE;
            } else {
                cnwVar = new cnw(this, zjeVar);
            }
        } else {
            cnwVar = new cnw(this, zjeVar);
        }
        Object objA = cnwVar.i;
        wne wneVar = wne.f39444a;
        int i2 = cnwVar.k;
        List list2 = null;
        if (i2 == 0) {
            z1x.P(objA);
            edu eduVar = (edu) this.c;
            LinkedHashMap linkedHashMapO = ofm0.o(knf0Var.b(), str, knf0Var.c());
            cnwVar.k = 1;
            objA = ((smw) ((bdv) eduVar.b).invoke()).a(linkedHashMapO, "application/vnd.xenvelop+json", cnwVar);
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
        fnw fnwVar = (fnw) ((dx5) objA).a();
        List list3 = fnwVar.b;
        lmw lmwVar = list3 != null ? (lmw) CollectionsKt.firstOrNull(list3) : null;
        if (lmwVar == null || (str2 = lmwVar.f20317a) == null) {
            jf4.k(null);
            return null;
        }
        String str3 = lmwVar.b;
        String str4 = str3 == null ? "" : str3;
        gmw gmwVar = fnwVar.c;
        String str5 = gmwVar != null ? gmwVar.b : null;
        String str6 = str5 == null ? "" : str5;
        String str7 = gmwVar != null ? gmwVar.c : null;
        String str8 = str7 == null ? "" : str7;
        if (gmwVar != null && (list = gmwVar.d) != null) {
            ArrayList arrayList = new ArrayList();
            for (i040 i040Var : list) {
                i040Var.getClass();
                Integer num = i040Var.f13933a;
                String str9 = i040Var.b;
                if (num == null && str9 == null) {
                    bnwVar = null;
                } else {
                    int iIntValue = num != null ? num.intValue() : 0;
                    if (str9 == null) {
                        str9 = "";
                    }
                    bnwVar = new bnw(iIntValue, str9);
                }
                if (bnwVar != null) {
                    arrayList.add(bnwVar);
                }
            }
            list2 = arrayList;
        }
        if (list2 == null) {
            list2 = iun.f15405a;
        }
        List list4 = list2;
        String str10 = lmwVar.c;
        switch (str10 != null ? str10 : "") {
            case "1":
                hmwVar = hmw.b;
                break;
            case "2":
                hmwVar = hmw.f13324a;
                break;
            case "3":
                hmwVar = hmw.c;
                break;
            default:
                hmwVar = hmw.d;
                break;
        }
        return new dmw(str2, str4, str6, str8, hmwVar, list4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(zje zjeVar) {
        rmy rmyVar;
        if (zjeVar instanceof rmy) {
            rmyVar = (rmy) zjeVar;
            int i = rmyVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                rmyVar.k = i - Integer.MIN_VALUE;
            } else {
                rmyVar = new rmy(this, zjeVar);
            }
        } else {
            rmyVar = new rmy(this, zjeVar);
        }
        Object objV = rmyVar.i;
        wne wneVar = wne.f39444a;
        int i2 = rmyVar.k;
        if (i2 == 0) {
            z1x.P(objV);
            mmy mmyVar = (mmy) this.b;
            rmyVar.k = 1;
            objV = ((KeysImpl) mmyVar).V(rmyVar);
            if (objV == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objV);
        }
        return ((ihk0) objV).c.f36304a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(zje zjeVar) {
        smy smyVar;
        if (zjeVar instanceof smy) {
            smyVar = (smy) zjeVar;
            int i = smyVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                smyVar.k = i - Integer.MIN_VALUE;
            } else {
                smyVar = new smy(this, zjeVar);
            }
        } else {
            smyVar = new smy(this, zjeVar);
        }
        Object objV = smyVar.i;
        wne wneVar = wne.f39444a;
        int i2 = smyVar.k;
        if (i2 == 0) {
            z1x.P(objV);
            mmy mmyVar = (mmy) this.b;
            smyVar.k = 1;
            objV = ((KeysImpl) mmyVar).V(smyVar);
            if (objV == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objV);
        }
        return ((ihk0) objV).c.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(boolean z, zje zjeVar) {
        tmy tmyVar;
        z8w0 z8w0Var;
        if (zjeVar instanceof tmy) {
            tmyVar = (tmy) zjeVar;
            int i = tmyVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                tmyVar.m = i - Integer.MIN_VALUE;
            } else {
                tmyVar = new tmy(this, zjeVar);
            }
        } else {
            tmyVar = new tmy(this, zjeVar);
        }
        Object obj = tmyVar.k;
        wne wneVar = wne.f39444a;
        int i2 = tmyVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            z8w0 z8w0Var2 = (z8w0) this.c;
            mmy mmyVar = (mmy) this.b;
            lmy lmyVar = !z ? lmy.f20319a : lmy.b;
            tmyVar.j = z8w0Var2;
            tmyVar.i = z;
            tmyVar.m = 1;
            Object objU = ((KeysImpl) mmyVar).u(lmyVar, tmyVar);
            if (objU != wneVar) {
                obj = objU;
                z8w0Var = z8w0Var2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = tmyVar.i;
        z8w0Var = tmyVar.j;
        z1x.P(obj);
        tmyVar.j = null;
        tmyVar.i = z;
        tmyVar.m = 2;
        Object objD = z8w0Var.d(tmyVar, (String) obj, false);
        return objD == wneVar ? wneVar : objD;
    }

    @Override // a.e5n0
    public void f(d5n0 d5n0Var) {
        ry40 ry40Var = (ry40) this.b;
        ry40Var.a();
        xy40 xy40Var = (xy40) d5n0Var.b;
        Object[] objArr = xy40Var.b;
        long[] jArr = xy40Var.c;
        int i = xy40Var.e;
        while (i != Integer.MAX_VALUE) {
            int i2 = (int) ((jArr[i] >> 31) & 2147483647L);
            Object obj = objArr[i];
            Object objB = ((gbz) this.c).b(obj);
            int iD = ry40Var.d(objB);
            int i3 = iD >= 0 ? ry40Var.c[iD] : 0;
            if (i3 == 7) {
                d5n0Var.remove(obj);
            } else {
                ry40Var.g(i3 + 1, objB);
            }
            i = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(boolean z, zje zjeVar) {
        umy umyVar;
        z8w0 z8w0Var;
        if (zjeVar instanceof umy) {
            umyVar = (umy) zjeVar;
            int i = umyVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                umyVar.m = i - Integer.MIN_VALUE;
            } else {
                umyVar = new umy(this, zjeVar);
            }
        } else {
            umyVar = new umy(this, zjeVar);
        }
        Object obj = umyVar.k;
        wne wneVar = wne.f39444a;
        int i2 = umyVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            z8w0 z8w0Var2 = (z8w0) this.c;
            mmy mmyVar = (mmy) this.b;
            lmy lmyVar = !z ? lmy.f20319a : lmy.b;
            umyVar.j = z8w0Var2;
            umyVar.i = z;
            umyVar.m = 1;
            Object objV = ((KeysImpl) mmyVar).v(lmyVar, umyVar);
            if (objV != wneVar) {
                obj = objV;
                z8w0Var = z8w0Var2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = umyVar.i;
        z8w0Var = umyVar.j;
        z1x.P(obj);
        umyVar.j = null;
        umyVar.i = z;
        umyVar.m = 2;
        Object objD = z8w0Var.d(umyVar, (String) obj, false);
        return objD == wneVar ? wneVar : objD;
    }

    @Override // a.n1x
    public void h(o1x o1xVar, hhn0 hhn0Var) {
        Object g0g0Var;
        o1xVar.getClass();
        t90 t90Var = (t90) this.c;
        try {
            e0g0 e0g0Var = j0g0.b;
            g0g0Var = c3x.F(hhn0Var.f13073a);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (g0g0Var instanceof g0g0) {
            g0g0Var = null;
        }
        t90Var.invoke(g0g0Var);
    }

    @Override // a.e5n0
    public boolean h0(Object obj, Object obj2) {
        gbz gbzVar = (gbz) this.c;
        return Intrinsics.d(gbzVar.b(obj), gbzVar.b(obj2));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(boolean z, zje zjeVar) {
        vmy vmyVar;
        z8w0 z8w0Var;
        if (zjeVar instanceof vmy) {
            vmyVar = (vmy) zjeVar;
            int i = vmyVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                vmyVar.m = i - Integer.MIN_VALUE;
            } else {
                vmyVar = new vmy(this, zjeVar);
            }
        } else {
            vmyVar = new vmy(this, zjeVar);
        }
        Object obj = vmyVar.k;
        wne wneVar = wne.f39444a;
        int i2 = vmyVar.m;
        if (i2 == 0) {
            z1x.P(obj);
            z8w0 z8w0Var2 = (z8w0) this.c;
            mmy mmyVar = (mmy) this.b;
            lmy lmyVar = !z ? lmy.f20319a : lmy.b;
            vmyVar.j = z8w0Var2;
            vmyVar.i = z;
            vmyVar.m = 1;
            Object objW = ((KeysImpl) mmyVar).w(lmyVar, vmyVar);
            if (objW != wneVar) {
                obj = objW;
                z8w0Var = z8w0Var2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z = vmyVar.i;
        z8w0Var = vmyVar.j;
        z1x.P(obj);
        vmyVar.j = null;
        vmyVar.i = z;
        vmyVar.m = 2;
        Object objD = z8w0Var.d(vmyVar, (String) obj, false);
        return objD == wneVar ? wneVar : objD;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(zje zjeVar) {
        wmy wmyVar;
        if (zjeVar instanceof wmy) {
            wmyVar = (wmy) zjeVar;
            int i = wmyVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                wmyVar.k = i - Integer.MIN_VALUE;
            } else {
                wmyVar = new wmy(this, zjeVar);
            }
        } else {
            wmyVar = new wmy(this, zjeVar);
        }
        Object objV = wmyVar.i;
        wne wneVar = wne.f39444a;
        int i2 = wmyVar.k;
        if (i2 == 0) {
            z1x.P(objV);
            mmy mmyVar = (mmy) this.b;
            wmyVar.k = 1;
            objV = ((KeysImpl) mmyVar).V(wmyVar);
            if (objV == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objV);
        }
        return ((ihk0) objV).b.c;
    }

    @Override // a.n1x
    public void k(o1x o1xVar, r1o r1oVar) {
        o1xVar.getClass();
        ((t90) this.b).invoke(r1oVar.c);
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        view.getClass();
        boolean zU = xiv0Var.f40966a.u(8);
        hie0 hie0Var = (hie0) this.c;
        if (hie0Var.f13108a && !zU) {
            g8v g8vVar = (g8v) this.b;
            rqt rqtVar = g8v.P1;
            g8vVar.I0().x(x7v.f40433a);
        }
        hie0Var.f13108a = zU;
        return xiv0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object m(zje zjeVar) {
        xmy xmyVar;
        if (zjeVar instanceof xmy) {
            xmyVar = (xmy) zjeVar;
            int i = xmyVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                xmyVar.k = i - Integer.MIN_VALUE;
            } else {
                xmyVar = new xmy(this, zjeVar);
            }
        } else {
            xmyVar = new xmy(this, zjeVar);
        }
        Object objV = xmyVar.i;
        wne wneVar = wne.f39444a;
        int i2 = xmyVar.k;
        if (i2 == 0) {
            z1x.P(objV);
            mmy mmyVar = (mmy) this.b;
            xmyVar.k = 1;
            objV = ((KeysImpl) mmyVar).V(xmyVar);
            if (objV == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objV);
        }
        return ((ihk0) objV).b.f32570a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object o(zje zjeVar) {
        ymy ymyVar;
        z8w0 z8w0Var;
        if (zjeVar instanceof ymy) {
            ymyVar = (ymy) zjeVar;
            int i = ymyVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                ymyVar.l = i - Integer.MIN_VALUE;
            } else {
                ymyVar = new ymy(this, zjeVar);
            }
        } else {
            ymyVar = new ymy(this, zjeVar);
        }
        Object obj = ymyVar.j;
        wne wneVar = wne.f39444a;
        int i2 = ymyVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            z8w0 z8w0Var2 = (z8w0) this.c;
            mmy mmyVar = (mmy) this.b;
            ymyVar.i = z8w0Var2;
            ymyVar.l = 1;
            Object objG = ((KeysImpl) mmyVar).G(ymyVar);
            if (objG != wneVar) {
                obj = objG;
                z8w0Var = z8w0Var2;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z8w0Var = ymyVar.i;
        z1x.P(obj);
        ymyVar.i = null;
        ymyVar.l = 2;
        Object objD = z8w0Var.d(ymyVar, (String) obj, false);
        return objD == wneVar ? wneVar : objD;
    }

    public tj30 p() {
        return (tj30) ((hgk0) ((pz40) this.b)).getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(zje zjeVar) {
        zmy zmyVar;
        if (zjeVar instanceof zmy) {
            zmyVar = (zmy) zjeVar;
            int i = zmyVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                zmyVar.k = i - Integer.MIN_VALUE;
            } else {
                zmyVar = new zmy(this, zjeVar);
            }
        } else {
            zmyVar = new zmy(this, zjeVar);
        }
        Object objV = zmyVar.i;
        wne wneVar = wne.f39444a;
        int i2 = zmyVar.k;
        if (i2 == 0) {
            z1x.P(objV);
            mmy mmyVar = (mmy) this.b;
            zmyVar.k = 1;
            objV = ((KeysImpl) mmyVar).V(zmyVar);
            if (objV == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objV);
        }
        return ((ihk0) objV).f14785a.f28616a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object r(zje zjeVar) {
        any anyVar;
        if (zjeVar instanceof any) {
            anyVar = (any) zjeVar;
            int i = anyVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                anyVar.k = i - Integer.MIN_VALUE;
            } else {
                anyVar = new any(this, zjeVar);
            }
        } else {
            anyVar = new any(this, zjeVar);
        }
        Object objV = anyVar.i;
        wne wneVar = wne.f39444a;
        int i2 = anyVar.k;
        if (i2 == 0) {
            z1x.P(objV);
            mmy mmyVar = (mmy) this.b;
            anyVar.k = 1;
            objV = ((KeysImpl) mmyVar).V(anyVar);
            if (objV == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objV);
        }
        return ((ihk0) objV).f14785a.b;
    }

    public ewt s() {
        t730 t730VarN = ufx.N(((pru) this.b).a().h1);
        aw20 aw20VarD = art.d(t730VarN);
        pyu pyuVar = (pyu) ((yfu) this.c).f42558a;
        return new ewt(new zj2(((v230) pyuVar.f27815a).b, pyuVar, aw20VarD, (byte) 15), t730VarN, (byte) 10);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:12|13|74|22|23|78|24|25|76|26|(1:29)|69) */
    /* JADX WARN: Code duplicated, block: B:29:0x009a  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00aa, code lost:
    
        r16 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ac, code lost:
    
        r9 = r10;
        r8 = r12;
        r12 = r14;
        r11 = r2;
        r2 = r4;
        r4 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b4, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b5, code lost:
    
        r16 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d4, code lost:
    
        if ((r0 instanceof a.zhi0) != false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d6, code lost:
    
        r13 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00db, code lost:
    
        if (r13.f != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e2, code lost:
    
        r13 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e4, code lost:
    
        r13 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ea, code lost:
    
        if (a.hic.C(r0) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ed, code lost:
    
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ef, code lost:
    
        if (r2 > 3) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f4, code lost:
    
        java.lang.System.out.println((java.lang.Object) a.b1j.g(r2, "error (", "): ", r0));
        r1.m = r12;
        r1.n = r11;
        r1.i = r9;
        r1.j = r8;
        r1.k = r4;
        r1.l = r2;
        r1.q = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0115, code lost:
    
        if (a.qcc.O(3000, r1) == r3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0118, code lost:
    
        r1 = a.j0g0.b;
        r0 = new a.g0g0(r0);
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x0115 -> B:13:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(long r18, int r20, java.lang.Integer r21, a.zje r22) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.u8u.t(long, int, java.lang.Integer, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object u(long j, zje zjeVar, Long l) {
        y2v y2vVar;
        edu eduVar;
        if (zjeVar instanceof y2v) {
            y2vVar = (y2v) zjeVar;
            int i = y2vVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                y2vVar.n = i - Integer.MIN_VALUE;
            } else {
                y2vVar = new y2v(this, zjeVar);
            }
        } else {
            y2vVar = new y2v(this, zjeVar);
        }
        y2v y2vVar2 = y2vVar;
        Object obj = y2vVar2.l;
        wne wneVar = wne.f39444a;
        int i2 = y2vVar2.n;
        if (i2 == 0) {
            z1x.P(obj);
            edu eduVar2 = (edu) this.b;
            pmi pmiVar = (pmi) this.c;
            y2vVar2.j = l;
            y2vVar2.k = eduVar2;
            y2vVar2.i = j;
            y2vVar2.n = 1;
            Serializable serializableX = pmiVar.x(y2vVar2);
            if (serializableX != wneVar) {
                eduVar = eduVar2;
                obj = serializableX;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j = y2vVar2.i;
        edu eduVar3 = y2vVar2.k;
        l = y2vVar2.j;
        z1x.P(obj);
        eduVar = eduVar3;
        Long l2 = l;
        int iIntValue = ((Number) obj).intValue();
        k9s0[] k9s0VarArr = k9s0.f17930a;
        y2vVar2.j = null;
        y2vVar2.k = null;
        y2vVar2.i = j;
        y2vVar2.n = 2;
        Object objL = eduVar.l(j, l2, iIntValue, 8, 0, y2vVar2);
        return objL == wneVar ? wneVar : objL;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x01de  */
    /* JADX WARN: Code duplicated, block: B:112:0x0203  */
    /* JADX WARN: Code duplicated, block: B:115:0x0213  */
    /* JADX WARN: Code duplicated, block: B:121:0x0226  */
    /* JADX WARN: Code duplicated, block: B:122:0x0229  */
    /* JADX WARN: Code duplicated, block: B:127:0x0247 A[LOOP:4: B:125:0x0241->B:127:0x0247, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:130:0x0268  */
    /* JADX WARN: Code duplicated, block: B:134:0x027d A[LOOP:5: B:132:0x0272->B:134:0x027d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:142:0x02ac  */
    /* JADX WARN: Code duplicated, block: B:165:0x0321  */
    /* JADX WARN: Code duplicated, block: B:166:0x0326  */
    /* JADX WARN: Code duplicated, block: B:171:0x01ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:176:? A[LOOP:1: B:104:0x01d8->B:176:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:180:0x0221 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:184:0x0290 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0087  */
    /* JADX WARN: Code duplicated, block: B:57:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:80:0x0167  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public Object v(zje zjeVar) {
        t8u t8uVar;
        vh0 vh0Var;
        heu heuVar;
        List list;
        List list2;
        ArrayList<qkt> arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        Iterator it;
        int iA;
        LinkedHashMap linkedHashMap;
        Iterator it2;
        iil iilVar;
        Iterator it3;
        Object next;
        p52 p52Var;
        boolean z;
        qkt qktVar;
        Iterator it4;
        dvu dvuVar;
        hnu hnuVar;
        y4v y4vVar;
        jru jruVar;
        grx grxVar;
        sff0 sff0Var;
        boolean z2 = false;
        Object obj = null;
        switch (this.f35249a) {
            case 0:
                if (zjeVar instanceof t8u) {
                    t8uVar = (t8u) zjeVar;
                    int i = t8uVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        t8uVar.k = i - Integer.MIN_VALUE;
                    } else {
                        t8uVar = new t8u(this, zjeVar);
                    }
                } else {
                    t8uVar = new t8u(this, zjeVar);
                }
                Object objE = t8uVar.i;
                Object obj2 = wne.f39444a;
                int i2 = t8uVar.k;
                if (i2 == 0) {
                    z1x.P(objE);
                    lhf0 lhf0Var = (lhf0) this.c;
                    boolean zA = ((j1q0) this.b).f15748a.a();
                    t8uVar.k = 1;
                    objE = lhf0Var.e(zA, t8uVar);
                    if (objE == obj2) {
                        return obj2;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(objE);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : (Iterable) objE) {
                    if (((vh0) obj3).d.length() == 0) {
                        arrayList4.add(obj3);
                    }
                }
                for (Object obj4 : arrayList4) {
                    if (((vh0) obj4).f37408a == 175) {
                        obj = obj4;
                        vh0Var = (vh0) obj;
                        if (vh0Var != null) {
                            return a(vh0Var);
                        }
                        iun iunVar = iun.f15405a;
                        return a(new vh0(0L, "", "", "", 0, 0L, 0L, 0L, false, false, "", iunVar, iunVar, false));
                    }
                }
                vh0Var = (vh0) obj;
                if (vh0Var != null) {
                    return a(vh0Var);
                }
                iun iunVar2 = iun.f15405a;
                return a(new vh0(0L, "", "", "", 0, 0L, 0L, 0L, false, false, "", iunVar2, iunVar2, false));
            case 4:
                if (zjeVar instanceof heu) {
                    heuVar = (heu) zjeVar;
                    int i3 = heuVar.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        heuVar.l = i3 - Integer.MIN_VALUE;
                    } else {
                        heuVar = new heu(this, zjeVar);
                    }
                } else {
                    heuVar = new heu(this, zjeVar);
                }
                Object objD = heuVar.j;
                wne wneVar = wne.f39444a;
                int i4 = heuVar.l;
                if (i4 == 0) {
                    z1x.P(objD);
                    bot botVar = (bot) this.c;
                    heuVar.l = 1;
                    objD = botVar.f2951a.d(heuVar);
                    if (objD != wneVar) {
                    }
                    return wneVar;
                }
                if (i4 == 1) {
                    z1x.P(objD);
                } else {
                    if (i4 != 2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = heuVar.i;
                    z1x.P(objD);
                }
                list2 = (List) objD;
                arrayList = new ArrayList();
                for (Object obj5 : list) {
                    qktVar = (qkt) obj5;
                    if (list2 != null || !list2.isEmpty()) {
                        it4 = list2.iterator();
                        while (it4.hasNext()) {
                            if (qktVar.f28902a == ((p52) it4.next()).f26383a) {
                                arrayList.add(obj5);
                            }
                            break;
                        }
                    }
                }
                arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                for (qkt qktVar2 : arrayList) {
                    it3 = list2.iterator();
                    do {
                        if (it3.hasNext()) {
                            next = it3.next();
                        } else {
                            next = null;
                        }
                        p52Var = (p52) next;
                        if (p52Var != null) {
                            z = p52Var.e;
                        } else {
                            z = false;
                        }
                        arrayList2.add(qkt.a(qktVar2, null, z, 191));
                    } while (qktVar2.f28902a != ((p52) next).f26383a);
                    p52Var = (p52) next;
                    if (p52Var != null) {
                        z = p52Var.e;
                    } else {
                        z = false;
                    }
                    arrayList2.add(qkt.a(qktVar2, null, z, 191));
                }
                arrayList3 = new ArrayList(r3d.q(list2, 10));
                it = list2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(new Integer(((p52) it.next()).f26383a));
                }
                rx3 rx3VarS0 = CollectionsKt.S0(arrayList3);
                iA = wp20.a(r3d.q(rx3VarS0, 10));
                if (iA < 16) {
                    iA = 16;
                }
                linkedHashMap = new LinkedHashMap(iA);
                it2 = rx3VarS0.iterator();
                while (true) {
                    iilVar = (iil) it2;
                    if (iilVar.b.hasNext()) {
                        return CollectionsKt.A0(arrayList2, new b0c(linkedHashMap, (byte) 4));
                    }
                    IndexedValue indexedValue = (IndexedValue) iilVar.next();
                    linkedHashMap.put(indexedValue.b, new Integer(indexedValue.f46061a));
                }
                List list3 = (List) objD;
                kpt kptVar = (kpt) this.b;
                heuVar.i = list3;
                heuVar.l = 2;
                Object objB = kptVar.f18690a.b(heuVar);
                if (objB != wneVar) {
                    objD = objB;
                    list = list3;
                    list2 = (List) objD;
                    arrayList = new ArrayList();
                    while (r0.hasNext()) {
                        qktVar = (qkt) obj5;
                        if (list2 != null) {
                        }
                        it4 = list2.iterator();
                        while (it4.hasNext()) {
                            if (qktVar.f28902a == ((p52) it4.next()).f26383a) {
                                arrayList.add(obj5);
                            }
                            break;
                        }
                    }
                    arrayList2 = new ArrayList(r3d.q(arrayList, 10));
                    while (r2.hasNext()) {
                        it3 = list2.iterator();
                        do {
                            if (it3.hasNext()) {
                                next = it3.next();
                            } else {
                                next = null;
                            }
                            p52Var = (p52) next;
                            if (p52Var != null) {
                                z = p52Var.e;
                            } else {
                                z = false;
                            }
                            arrayList2.add(qkt.a(qktVar2, null, z, 191));
                        } while (qktVar2.f28902a != ((p52) next).f26383a);
                        p52Var = (p52) next;
                        if (p52Var != null) {
                            z = p52Var.e;
                        } else {
                            z = false;
                        }
                        arrayList2.add(qkt.a(qktVar2, null, z, 191));
                    }
                    arrayList3 = new ArrayList(r3d.q(list2, 10));
                    it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new Integer(((p52) it.next()).f26383a));
                    }
                    rx3 rx3VarS1 = CollectionsKt.S0(arrayList3);
                    iA = wp20.a(r3d.q(rx3VarS1, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iA);
                    it2 = rx3VarS1.iterator();
                    while (true) {
                        iilVar = (iil) it2;
                        if (iilVar.b.hasNext()) {
                            return CollectionsKt.A0(arrayList2, new b0c(linkedHashMap, (byte) 4));
                        }
                        IndexedValue indexedValue2 = (IndexedValue) iilVar.next();
                        linkedHashMap.put(indexedValue2.b, new Integer(indexedValue2.f46061a));
                    }
                }
                return wneVar;
            case 6:
                vff0 vff0Var = (vff0) this.c;
                j1q0 j1q0Var = (j1q0) this.b;
                return qjj.d0(vff0Var.f37328a.b, new w7f0(vff0Var, j1q0Var.b(), j1q0Var.f15748a.q(), (yje) null), zjeVar);
            case 12:
                if (zjeVar instanceof dvu) {
                    dvuVar = (dvu) zjeVar;
                    int i5 = dvuVar.l;
                    if ((i5 & Integer.MIN_VALUE) != 0) {
                        dvuVar.l = i5 - Integer.MIN_VALUE;
                    } else {
                        dvuVar = new dvu(this, zjeVar);
                    }
                } else {
                    dvuVar = new dvu(this, zjeVar);
                }
                Object obj6 = dvuVar.j;
                wne wneVar2 = wne.f39444a;
                int i6 = dvuVar.l;
                if (i6 == 0) {
                    z1x.P(obj6);
                    hnu hnuVar2 = (hnu) this.b;
                    pmi pmiVar = (pmi) this.c;
                    dvuVar.i = hnuVar2;
                    dvuVar.l = 1;
                    Serializable serializableX = pmiVar.x(dvuVar);
                    if (serializableX != wneVar2) {
                        obj6 = serializableX;
                        hnuVar = hnuVar2;
                    }
                    return wneVar2;
                }
                if (i6 != 1) {
                    if (i6 == 2) {
                        z1x.P(obj6);
                        return obj6;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hnuVar = dvuVar.i;
                z1x.P(obj6);
                int iIntValue = ((Number) obj6).intValue();
                dvuVar.i = null;
                dvuVar.l = 2;
                Serializable serializableC = hnuVar.c(iIntValue, dvuVar);
                if (serializableC != wneVar2) {
                    return serializableC;
                }
                return wneVar2;
            case 18:
                if (zjeVar instanceof y4v) {
                    y4vVar = (y4v) zjeVar;
                    int i7 = y4vVar.l;
                    if ((i7 & Integer.MIN_VALUE) != 0) {
                        y4vVar.l = i7 - Integer.MIN_VALUE;
                    } else {
                        y4vVar = new y4v(this, zjeVar);
                    }
                } else {
                    y4vVar = new y4v(this, zjeVar);
                }
                Object obj7 = y4vVar.j;
                wne wneVar3 = wne.f39444a;
                int i8 = y4vVar.l;
                if (i8 == 0) {
                    z1x.P(obj7);
                    jru jruVar2 = (jru) this.c;
                    pmi pmiVar2 = (pmi) this.b;
                    y4vVar.i = jruVar2;
                    y4vVar.l = 1;
                    Serializable serializableX2 = pmiVar2.x(y4vVar);
                    if (serializableX2 != wneVar3) {
                        obj7 = serializableX2;
                        jruVar = jruVar2;
                    }
                    return wneVar3;
                }
                if (i8 != 1) {
                    if (i8 == 2) {
                        z1x.P(obj7);
                        return obj7;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jruVar = y4vVar.i;
                z1x.P(obj7);
                int iIntValue2 = ((Number) obj7).intValue();
                y4vVar.i = null;
                y4vVar.l = 2;
                Serializable serializableG = ((fht0) jruVar.b).g(iIntValue2, y4vVar);
                if (serializableG != wneVar3) {
                    return serializableG;
                }
                return wneVar3;
            default:
                if (zjeVar instanceof grx) {
                    grxVar = (grx) zjeVar;
                    int i9 = grxVar.l;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        grxVar.l = i9 - Integer.MIN_VALUE;
                    } else {
                        grxVar = new grx(this, zjeVar);
                    }
                } else {
                    grxVar = new grx(this, zjeVar);
                }
                Object obj8 = grxVar.j;
                wne wneVar4 = wne.f39444a;
                int i10 = grxVar.l;
                if (i10 == 0) {
                    z1x.P(obj8);
                    sff0 sff0VarA = ((pru) this.c).a();
                    rou rouVar = (rou) this.b;
                    grxVar.i = sff0VarA;
                    grxVar.l = 1;
                    Object objA = rouVar.a(false, grxVar);
                    if (objA == wneVar4) {
                        return wneVar4;
                    }
                    obj8 = objA;
                    sff0Var = sff0VarA;
                } else {
                    if (i10 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sff0Var = grxVar.i;
                    z1x.P(obj8);
                }
                boolean z3 = ((m2c0) obj8).e0 != cau0.h;
                if (sff0Var.r0 && sff0Var.v0 && z3) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public Object w(boolean z, long j, long j2, jvn jvnVar, zje zjeVar) {
        gwu gwuVar;
        y3v y3vVar;
        long j3;
        boolean z2;
        long j4;
        jvn jvnVar2;
        if (zjeVar instanceof gwu) {
            gwuVar = (gwu) zjeVar;
            int i = gwuVar.p;
            if ((i & Integer.MIN_VALUE) != 0) {
                gwuVar.p = i - Integer.MIN_VALUE;
            } else {
                gwuVar = new gwu(this, zjeVar);
            }
        } else {
            gwuVar = new gwu(this, zjeVar);
        }
        gwu gwuVar2 = gwuVar;
        Object obj = gwuVar2.n;
        wne wneVar = wne.f39444a;
        int i2 = gwuVar2.p;
        if (i2 == 0) {
            z1x.P(obj);
            y3vVar = (y3v) this.c;
            x0u x0uVar = (x0u) this.b;
            gwuVar2.l = jvnVar;
            gwuVar2.m = y3vVar;
            gwuVar2.i = z;
            gwuVar2.j = j;
            j3 = j2;
            gwuVar2.k = j3;
            gwuVar2.p = 1;
            Object objC = x0uVar.c(gwuVar2);
            if (objC != wneVar) {
                z2 = z;
                j4 = j;
                jvnVar2 = jvnVar;
                obj = objC;
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        long j5 = gwuVar2.k;
        long j6 = gwuVar2.j;
        boolean z3 = gwuVar2.i;
        y3vVar = gwuVar2.m;
        jvnVar2 = gwuVar2.l;
        z1x.P(obj);
        j3 = j5;
        j4 = j6;
        z2 = z3;
        int iIntValue = ((Number) obj).intValue();
        gwuVar2.l = null;
        gwuVar2.m = null;
        gwuVar2.i = z2;
        gwuVar2.j = j4;
        gwuVar2.k = j3;
        gwuVar2.p = 2;
        Serializable serializableJ = y3vVar.j(iIntValue, j3, j4, z2, jvnVar2, gwuVar2);
        return serializableJ == wneVar ? wneVar : serializableJ;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object x(zje zjeVar) {
        bny bnyVar;
        z8w0 z8w0Var;
        String str;
        if (zjeVar instanceof bny) {
            bnyVar = (bny) zjeVar;
            int i = bnyVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                bnyVar.l = i - Integer.MIN_VALUE;
            } else {
                bnyVar = new bny(this, zjeVar);
            }
        } else {
            bnyVar = new bny(this, zjeVar);
        }
        Object obj = bnyVar.j;
        wne wneVar = wne.f39444a;
        int i2 = bnyVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            z8w0Var = (z8w0) this.c;
            str = "azR2TJfl8hKeh6BxIURORQ==";
        } else {
            if (i2 != 1) {
                if (i2 == 2) {
                    z1x.P(obj);
                    return obj;
                }
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z8w0Var = bnyVar.i;
            z1x.P(obj);
            str = (String) obj;
        }
        bnyVar.i = null;
        bnyVar.l = 2;
        Object objD = z8w0Var.d(bnyVar, str, false);
        return objD == wneVar ? wneVar : objD;
    }

    public /* synthetic */ u8u(Object obj, Object obj2, byte b) {
        this.f35249a = b;
        this.c = obj;
        this.b = obj2;
    }

    public u8u(jr0 jr0Var, j1q0 j1q0Var) {
        this.f35249a = (byte) 1;
        j1q0Var.getClass();
        this.c = jr0Var;
        this.b = j1q0Var;
    }

    public u8u(nwd nwdVar, vff0 vff0Var, j1q0 j1q0Var) {
        this.f35249a = (byte) 6;
        vff0Var.getClass();
        j1q0Var.getClass();
        this.c = vff0Var;
        this.b = j1q0Var;
    }

    public /* synthetic */ u8u() {
        this.f35249a = (byte) 29;
    }

    public u8u(j9s0 j9s0Var, gst0 gst0Var) {
        this.f35249a = (byte) 16;
        j9s0Var.getClass();
        gst0Var.getClass();
        this.c = j9s0Var;
        this.b = gst0Var;
    }

    public u8u(hnu hnuVar, m1e m1eVar) {
        this.f35249a = (byte) 9;
        m1eVar.getClass();
        this.c = hnuVar;
        this.b = m1eVar;
    }

    public u8u(lhf0 lhf0Var, j1q0 j1q0Var) {
        this.f35249a = (byte) 0;
        j1q0Var.getClass();
        this.c = lhf0Var;
        this.b = j1q0Var;
    }

    public u8u(a6u a6uVar, uzc uzcVar) {
        this.f35249a = (byte) 5;
        uzcVar.getClass();
        this.c = a6uVar;
        this.b = uzcVar;
    }

    public u8u(edu eduVar, knf0 knf0Var) {
        this.f35249a = (byte) 21;
        knf0Var.getClass();
        this.c = eduVar;
        this.b = knf0Var;
    }

    public u8u(yfu yfuVar, art artVar, pru pruVar) {
        this.f35249a = (byte) 7;
        this.c = yfuVar;
        this.b = pruVar;
    }

    public u8u(e7z e7zVar, tj30 tj30Var) {
        this.f35249a = (byte) 23;
        this.c = e7zVar;
        this.b = androidx.compose.runtime.e.e(tj30Var);
    }

    public u8u(gbz gbzVar) {
        this.f35249a = (byte) 28;
        this.c = gbzVar;
        ry40 ry40Var = v960.f37020a;
        this.b = new ry40();
    }
}
