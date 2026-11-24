package a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.view.animation.Animation;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.text.StringsKt;
import org.xplatform.uikit.components.text_field.DsTextField;

/* JADX INFO: loaded from: classes3.dex */
public final class iqi implements zf60 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f15211a;
    public final Object b;
    public final Object c;

    public iqi(gii0 gii0Var, byte b) {
        this.f15211a = b;
        gii0Var.getClass();
        switch (b) {
            case 11:
                this.c = gii0Var;
                this.b = new yip(this, (byte) 4);
                break;
            case 12:
                this.c = gii0Var;
                this.b = new yip(this, (byte) 8);
                break;
            case 13:
            case 14:
            default:
                this.c = gii0Var;
                this.b = new yip(this, (byte) 0);
                break;
            case 15:
                this.c = gii0Var;
                this.b = new yip(this, (byte) 28);
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable a(long j, zje zjeVar) {
        lvt lvtVar;
        if (zjeVar instanceof lvt) {
            lvtVar = (lvt) zjeVar;
            int i = lvtVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                lvtVar.l = i - Integer.MIN_VALUE;
            } else {
                lvtVar = new lvt(this, zjeVar);
            }
        } else {
            lvtVar = new lvt(this, zjeVar);
        }
        Object objI = lvtVar.j;
        wne wneVar = wne.f39444a;
        int i2 = lvtVar.l;
        Object obj = null;
        if (i2 == 0) {
            z1x.P(objI);
            rrd rrdVar = (rrd) this.c;
            tl5 tl5Var = tl5.c;
            lvtVar.i = j;
            lvtVar.l = 1;
            objI = rrdVar.i(tl5Var, lvtVar);
            if (objI == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = lvtVar.i;
            z1x.P(objI);
        }
        for (Object obj2 : (Iterable) objI) {
            if (((ql5) obj2).f28916a == j) {
                obj = obj2;
                break;
            }
        }
        ql5 ql5Var = (ql5) obj;
        if (ql5Var != null) {
            return ql5Var;
        }
        throw new ss3();
    }

    public fuo b(Object... objArr) {
        Constructor constructorA;
        synchronized (((AtomicBoolean) this.b)) {
            try {
                if (!((AtomicBoolean) this.b).get()) {
                    try {
                        constructorA = ((csj) this.c).a();
                    } catch (ClassNotFoundException unused) {
                        ((AtomicBoolean) this.b).set(true);
                        constructorA = null;
                    } catch (Exception e) {
                        throw new RuntimeException("Error instantiating extension", e);
                    }
                }
                constructorA = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (constructorA == null) {
            return null;
        }
        try {
            return (fuo) constructorA.newInstance(objArr);
        } catch (Exception e2) {
            hny.q("Unexpected error creating extractor", e2);
            return null;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:81|24|83|25|26|27|(1:30)|72) */
    /* JADX WARN: Code duplicated, block: B:30:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:33:0x010d A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:31:0x00ff, B:33:0x010d, B:35:0x0113, B:37:0x0117, B:38:0x0119, B:18:0x0095), top: B:79:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0112  */
    /* JADX WARN: Code duplicated, block: B:37:0x0117 A[Catch: all -> 0x009a, TryCatch #0 {all -> 0x009a, blocks: (B:31:0x00ff, B:33:0x010d, B:35:0x0113, B:37:0x0117, B:38:0x0119, B:18:0x0095), top: B:79:0x0095 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:47:0x0129  */
    /* JADX WARN: Code duplicated, block: B:49:0x0132  */
    /* JADX WARN: Code duplicated, block: B:51:0x0139  */
    /* JADX WARN: Code duplicated, block: B:52:0x013b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0140  */
    /* JADX WARN: Code duplicated, block: B:58:0x015c  */
    /* JADX WARN: Code duplicated, block: B:60:0x0162  */
    /* JADX WARN: Code duplicated, block: B:62:0x016d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0174  */
    /* JADX WARN: Code duplicated, block: B:66:0x017b  */
    /* JADX WARN: Code duplicated, block: B:67:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0182  */
    /* JADX WARN: Code duplicated, block: B:73:0x019e  */
    /* JADX WARN: Code duplicated, block: B:74:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x011d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x011f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x019b, code lost:
    
        if (a.qcc.P(r11, r7) == r4) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x015d, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x01a7 -> B:23:0x00bc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object c(a.zje r20, java.lang.String r21, boolean r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 443
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.iqi.c(a.zje, java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object d(int i, zje zjeVar) {
        u4u u4uVar;
        if (zjeVar instanceof u4u) {
            u4uVar = (u4u) zjeVar;
            int i2 = u4uVar.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                u4uVar.l = i2 - Integer.MIN_VALUE;
            } else {
                u4uVar = new u4u(this, zjeVar);
            }
        } else {
            u4uVar = new u4u(this, zjeVar);
        }
        Object objV = u4uVar.j;
        wne wneVar = wne.f39444a;
        int i3 = u4uVar.l;
        if (i3 == 0) {
            z1x.P(objV);
            w5z w5zVar = (w5z) this.c;
            u4uVar.i = this;
            u4uVar.l = 1;
            objV = w5zVar.v(i, u4uVar);
            if (objV == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            this = u4uVar.i;
            z1x.P(objV);
        }
        return new ewt(((t52) ((esg0) this.b).b).f33348a, (List) objV, (byte) 2);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object e(long j, long j2, zje zjeVar) {
        y2u y2uVar;
        if (zjeVar instanceof y2u) {
            y2uVar = (y2u) zjeVar;
            int i = y2uVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                y2uVar.k = i - Integer.MIN_VALUE;
            } else {
                y2uVar = new y2u(this, zjeVar);
            }
        } else {
            y2uVar = new y2u(this, zjeVar);
        }
        y2u y2uVar2 = y2uVar;
        Object objB = y2uVar2.i;
        wne wneVar = wne.f39444a;
        int i2 = y2uVar2.k;
        if (i2 == 0) {
            z1x.P(objB);
            a3u a3uVar = (a3u) this.c;
            y2uVar2.k = 1;
            objB = a3uVar.b(j, j2, y2uVar2);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objB);
        }
        String str = (String) objB;
        String strA = ((ntu) this.b).a();
        return StringsKt.O(str, strA, false) ? str : strA.concat(str);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00db A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc A[PHI: r12
  0x00dc: PHI (r12v1 a.bm5) = (r12v0 a.bm5), (r12v0 a.bm5), (r12v0 a.bm5), (r12v2 a.bm5) binds: [B:21:0x0054, B:36:0x009d, B:43:0x00ad, B:54:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e7 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d3, code lost:
    
        if (r13 == r2) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(a.bm5 r12, a.zje r13) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.iqi.f(a.bm5, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:39:0x008e  */
    /* JADX WARN: Code duplicated, block: B:47:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public Object g(zje zjeVar) {
        wzt wztVar;
        rpt rptVar;
        s8u s8uVar;
        Object g0g0Var;
        vh0 vh0Var;
        Object obj;
        byte b = this.f15211a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = null;
        boolean z = false;
        switch (b) {
            case 22:
                if (zjeVar instanceof wzt) {
                    wztVar = (wzt) zjeVar;
                    int i = wztVar.l;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        wztVar.l = i - Integer.MIN_VALUE;
                    } else {
                        wztVar = new wzt(this, zjeVar);
                    }
                } else {
                    wztVar = new wzt(this, zjeVar);
                }
                Object obj5 = wztVar.j;
                wne wneVar = wne.f39444a;
                int i2 = wztVar.l;
                if (i2 == 0) {
                    z1x.P(obj5);
                    rpt rptVar2 = (rpt) obj3;
                    wztVar.i = rptVar2;
                    wztVar.l = 1;
                    Object objC = ((x0u) obj2).c(wztVar);
                    if (objC != wneVar) {
                        rptVar = rptVar2;
                        obj5 = objC;
                    }
                    return wneVar;
                }
                if (i2 != 1) {
                    if (i2 == 2) {
                        z1x.P(obj5);
                        return obj5;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                rptVar = wztVar.i;
                z1x.P(obj5);
                int iIntValue = ((Number) obj5).intValue();
                wztVar.i = null;
                wztVar.l = 2;
                nr nrVar = (nr) rptVar.f30901a;
                Object objD0 = qjj.d0(((mne) nrVar.b).b, new u52((Object) nrVar, iIntValue, (yje) (z ? 1 : 0), (byte) 11), wztVar);
                if (objD0 != wneVar) {
                    return objD0;
                }
                return wneVar;
            default:
                if (zjeVar instanceof s8u) {
                    s8uVar = (s8u) zjeVar;
                    int i3 = s8uVar.k;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        s8uVar.k = i3 - Integer.MIN_VALUE;
                    } else {
                        s8uVar = new s8u(this, zjeVar);
                    }
                } else {
                    s8uVar = new s8u(this, zjeVar);
                }
                Object obj6 = s8uVar.i;
                wne wneVar2 = wne.f39444a;
                int i4 = s8uVar.k;
                try {
                    if (i4 == 0) {
                        z1x.P(obj6);
                        e0g0 e0g0Var = j0g0.b;
                        boolean zA = ((j1q0) obj2).f15748a.a();
                        s8uVar.k = 1;
                        Serializable serializableE = ((lhf0) obj3).e(zA, s8uVar);
                        obj = serializableE;
                        if (serializableE == wneVar2) {
                            return wneVar2;
                        }
                    } else {
                        if (i4 != 1) {
                            jf4.n("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z1x.P(obj6);
                        obj = obj6;
                    }
                    e0g0 e0g0Var2 = j0g0.b;
                    g0g0Var = (List) obj;
                    break;
                } catch (Throwable th) {
                    e0g0 e0g0Var3 = j0g0.b;
                    g0g0Var = new g0g0(th);
                }
                boolean z2 = g0g0Var instanceof g0g0;
                Object obj7 = g0g0Var;
                if (z2) {
                    obj7 = null;
                }
                Iterable iterable = (List) obj7;
                if (iterable == null) {
                    iterable = iun.f15405a;
                }
                for (Object obj8 : iterable) {
                    if (((vh0) obj8).f37408a == 175) {
                        obj4 = obj8;
                        vh0Var = (vh0) obj4;
                        if (vh0Var == null) {
                            iun iunVar = iun.f15405a;
                            vh0Var = new vh0(0L, "", "", "", 0, 0L, 0L, 0L, false, false, "", iunVar, iunVar, false);
                        }
                        return vh0.a(vh0Var);
                    }
                }
                vh0Var = (vh0) obj4;
                if (vh0Var == null) {
                    iun iunVar2 = iun.f15405a;
                    vh0Var = new vh0(0L, "", "", "", 0, 0L, 0L, 0L, false, false, "", iunVar2, iunVar2, false);
                }
                return vh0.a(vh0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:8:0x0021  */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ea, code lost:
    
        if (r0 == r13) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0111, code lost:
    
        if (r0 == r13) goto L57;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object h(a.zje r17, java.lang.String r18, boolean r19) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.iqi.h(a.zje, java.lang.String, boolean):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object i(hqn hqnVar, ynb0 ynb0Var, zje zjeVar) {
        tqn tqnVar;
        ftb ftbVar;
        if (zjeVar instanceof tqn) {
            tqnVar = (tqn) zjeVar;
            int i = tqnVar.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                tqnVar.n = i - Integer.MIN_VALUE;
            } else {
                tqnVar = new tqn(this, zjeVar);
            }
        } else {
            tqnVar = new tqn(this, zjeVar);
        }
        Object obj = tqnVar.l;
        wne wneVar = wne.f39444a;
        int i2 = tqnVar.n;
        if (i2 == 0) {
            z1x.P(obj);
            ftb ftbVar2 = (ftb) this.c;
            rou rouVar = (rou) this.b;
            tqnVar.i = ftbVar2;
            tqnVar.j = hqnVar;
            tqnVar.k = ynb0Var;
            tqnVar.n = 1;
            Object objA = rouVar.a(false, tqnVar);
            if (objA != wneVar) {
                obj = objA;
                ftbVar = ftbVar2;
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
        ynb0Var = tqnVar.k;
        hqnVar = tqnVar.j;
        ftbVar = tqnVar.i;
        z1x.P(obj);
        tqnVar.i = null;
        tqnVar.j = null;
        tqnVar.k = null;
        tqnVar.n = 2;
        Object objO = ftbVar.f10103a.o(hqnVar, ynb0Var, (m2c0) obj, tqnVar);
        return objO == wneVar ? wneVar : objO;
    }

    public String j() {
        if (((xr) this.b).i() != rl40.GMS) {
            return "";
        }
        us00 us00Var = ((dbv) ((jru) this.c).b).f5821a;
        String string = us00Var.getString(us00Var.getResources().getIdentifier("gcm_defaultSenderId", "string", us00Var.getPackageName()));
        string.getClass();
        return string;
    }

    public boolean k() {
        cit0 cit0VarC = ((j9c) this.b).c();
        boolean z = cit0VarC.H;
        boolean z2 = cit0VarC.I;
        tzf tzfVar = new tzf(z, z2);
        lye lyeVar = (lye) ((khf0) this.c).b;
        tzf tzfVar2 = lyeVar.c;
        lyeVar.getClass();
        lyeVar.c = tzfVar;
        if (tzfVar2 == null) {
            return false;
        }
        return (tzfVar2.f34800a == z && tzfVar2.b == z2) ? false : true;
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        hie0 hie0Var = (hie0) this.b;
        view.getClass();
        uiv0 uiv0Var = xiv0Var.f40966a;
        boolean zU = uiv0Var.u(8);
        int i = uiv0Var.i(8).d;
        org.xplatform.uikit.components.text_field.middle.b bVar = ((DsTextField) this.c).B;
        if (bVar == null) {
            bVar = null;
        }
        if (bVar != null && !zU && hie0Var.f13108a && bVar.hasFocus()) {
            bVar.clearFocus();
        }
        hie0Var.f13108a = zU;
        return xiv0.b;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable m(bm5 bm5Var, zje zjeVar) {
        nvt nvtVar;
        if (zjeVar instanceof nvt) {
            nvtVar = (nvt) zjeVar;
            int i = nvtVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                nvtVar.l = i - Integer.MIN_VALUE;
            } else {
                nvtVar = new nvt(this, zjeVar);
            }
        } else {
            nvtVar = new nvt(this, zjeVar);
        }
        Object objA = nvtVar.j;
        wne wneVar = wne.f39444a;
        int i2 = nvtVar.l;
        if (i2 == 0) {
            z1x.P(objA);
            nvtVar.i = bm5Var;
            nvtVar.l = 1;
            objA = a(((gst0) this.b).f11847a.a().f18785a, nvtVar);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bm5Var = nvtVar.i;
            z1x.P(objA);
        }
        ql5 ql5Var = (ql5) objA;
        ((rrd) this.c).z(bm5Var, ql5Var.f28916a);
        return ql5Var;
    }

    public iqi(nr nrVar, gst0 gst0Var) {
        this.f15211a = (byte) 4;
        gst0Var.getClass();
        this.c = nrVar;
        this.b = gst0Var;
    }

    public iqi(qq3 qq3Var, y5s y5sVar) {
        this.f15211a = (byte) 17;
        qq3Var.getClass();
        y5sVar.getClass();
        this.c = qq3Var;
        this.b = y5sVar;
    }

    public iqi(igl iglVar, y5s y5sVar) {
        this.f15211a = (byte) 26;
        iglVar.getClass();
        y5sVar.getClass();
        this.c = iglVar;
        this.b = y5sVar;
    }

    public iqi(s470 s470Var, rkc0 rkc0Var) {
        this.f15211a = (byte) 19;
        rkc0Var.getClass();
        this.c = s470Var;
        this.b = rkc0Var;
    }

    public iqi(lhf0 lhf0Var, j1q0 j1q0Var) {
        this.f15211a = (byte) 27;
        j1q0Var.getClass();
        this.c = lhf0Var;
        this.b = j1q0Var;
    }

    public iqi(jr0 jr0Var, j1q0 j1q0Var) {
        this.f15211a = (byte) 28;
        j1q0Var.getClass();
        this.c = jr0Var;
        this.b = j1q0Var;
    }

    public iqi(nhf0 nhf0Var, j1q0 j1q0Var) {
        this.f15211a = (byte) 21;
        j1q0Var.getClass();
        this.c = nhf0Var;
        this.b = j1q0Var;
    }

    public /* synthetic */ iqi(Object obj, Object obj2, byte b) {
        this.f15211a = b;
        this.c = obj;
        this.b = obj2;
    }

    public iqi(v6j0 v6j0Var, yk50 yk50Var) {
        this.f15211a = (byte) 18;
        v6j0Var.getClass();
        this.c = v6j0Var;
        this.b = yk50Var;
    }

    public iqi(rrd rrdVar, gst0 gst0Var) {
        this.f15211a = (byte) 20;
        gst0Var.getClass();
        this.c = rrdVar;
        this.b = gst0Var;
    }

    public iqi(hsj hsjVar, knf0 knf0Var) {
        this.f15211a = (byte) 9;
        knf0Var.getClass();
        this.c = hsjVar;
        this.b = knf0Var;
    }

    public iqi(us00 us00Var, cad cadVar, wti wtiVar) {
        this.f15211a = (byte) 5;
        this.c = cadVar;
        this.b = wtiVar;
    }

    public iqi(neq neqVar) {
        this.f15211a = (byte) 13;
        this.c = neqVar;
        this.b = maz.b(new sz2(this, (byte) 9));
    }

    public iqi() {
        this.f15211a = (byte) 8;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        this.c = byteArrayOutputStream;
        this.b = new DataOutputStream(byteArrayOutputStream);
    }

    public iqi(r9u r9uVar) {
        this.f15211a = (byte) 1;
        this.c = r9uVar;
        this.b = n0k0.a(new yxi(this, (byte) 15));
    }

    public iqi(n4u n4uVar) {
        this.f15211a = (byte) 0;
        this.c = n4uVar;
        this.b = n0k0.a(new ppi(this, (byte) 5));
    }

    public iqi(Animation animation) {
        this.f15211a = (byte) 14;
        this.c = animation;
        this.b = null;
    }

    public iqi(Animator animator) {
        this.f15211a = (byte) 14;
        this.c = null;
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.play(animator);
    }

    public iqi(csj csjVar) {
        this.f15211a = (byte) 3;
        this.c = csjVar;
        this.b = new AtomicBoolean(false);
    }
}
