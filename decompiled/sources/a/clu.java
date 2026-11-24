package a;

import java.util.Arrays;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class clu implements kmq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f4577a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public clu(ol60 ol60Var, kmq kmqVar) {
        this.f4577a = (byte) 24;
        this.c = ol60Var;
        this.b = kmqVar;
    }

    private final Object d(yje yjeVar, Object obj) {
        Object objA;
        if (!zvw.X(yjeVar.getContext())) {
            return Unit.f46060a;
        }
        ol60 ol60Var = (ol60) this.c;
        n0o0 n0o0Var = ol60Var.e;
        kmq kmqVar = (kmq) this.b;
        LinkedBlockingDeque linkedBlockingDeque = ol60Var.d;
        if (ml60.f21973a[ol60Var.b.ordinal()] != 1) {
            linkedBlockingDeque.remove(obj);
            objA = kmqVar.a(obj, yjeVar);
            if (objA != wne.f39444a) {
                objA = Unit.f46060a;
            }
        } else if (((LinkedBlockingDeque) n0o0Var.getValue()).contains(obj)) {
            ((LinkedBlockingDeque) n0o0Var.getValue()).remove(obj);
            objA = Unit.f46060a;
        } else {
            linkedBlockingDeque.remove(obj);
            objA = kmqVar.a(obj, yjeVar);
            if (objA != wne.f39444a) {
                objA = Unit.f46060a;
            }
        }
        return objA == wne.f39444a ? objA : Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private final Object e(yje yjeVar, Object obj) {
        y570 y570Var;
        if (yjeVar instanceof y570) {
            y570Var = (y570) yjeVar;
            int i = y570Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                y570Var.j = i - Integer.MIN_VALUE;
            } else {
                y570Var = new y570(this, yjeVar);
            }
        } else {
            y570Var = new y570(this, yjeVar);
        }
        Object obj2 = y570Var.i;
        wne wneVar = wne.f39444a;
        int i2 = y570Var.j;
        if (i2 == 0) {
            z1x.P(obj2);
            kmq kmqVar = (kmq) this.b;
            gz60 gz60Var = (gz60) obj;
            ctf0 ctf0Var = ((g670) this.c).s;
            gz60Var.getClass();
            ctf0Var.getClass();
            boolean z = (!gz60Var.d || gz60Var.b || gz60Var.c) ? false : true;
            String str = gz60Var.f12166a;
            lc00 lc00VarB = kotlin.collections.a.b();
            lsm0 lsm0Var = ctf0Var.b;
            lc00VarB.add(new oao0("ALL_GAMES_TAB_BAR_ITEM", lsm0Var.a(R.string.all_games, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_games, null, false, null));
            if (gz60Var.e) {
                lc00VarB.add(new oao0("PROMO_TAB_BAR_ITEM", lsm0Var.a(R.string.bonuses, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_promo_games, null, false, null));
            }
            if (gz60Var.f) {
                lc00VarB.add(new oao0("CASH_BACK_TAB_BAR_ITEM", lsm0Var.a(R.string.cashback, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_cashback, null, false, null));
            }
            if (gz60Var.g) {
                lc00VarB.add(new oao0("FAVORITES_TAB_BAR_ITEM", lsm0Var.a(R.string.favorites_name, Arrays.copyOf(new Object[0], 0)), R.drawable.ic_glyph_favourite_active, null, false, null));
            }
            hz60 hz60Var = new hz60(new lao0(kotlin.collections.a.a(lc00VarB), gz60Var.h), z, str);
            y570Var.j = 1;
            if (kmqVar.a(hz60Var, y570Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object f(yje yjeVar, Object obj) {
        jf70 jf70Var;
        if (yjeVar instanceof jf70) {
            jf70Var = (jf70) yjeVar;
            int i = jf70Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                jf70Var.j = i - Integer.MIN_VALUE;
            } else {
                jf70Var = new jf70(this, yjeVar);
            }
        } else {
            jf70Var = new jf70(this, yjeVar);
        }
        Object obj2 = jf70Var.i;
        wne wneVar = wne.f39444a;
        int i2 = jf70Var.j;
        if (i2 == 0) {
            z1x.P(obj2);
            kmq kmqVar = (kmq) this.b;
            zy5 zy5Var = (zy5) obj;
            if (((qf70) this.c).H || (zy5Var instanceof mle)) {
                jf70Var.j = 1;
                if (kmqVar.a(obj, jf70Var) == wneVar) {
                    return wneVar;
                }
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object h(yje yjeVar, Object obj) {
        qo70 qo70Var;
        if (yjeVar instanceof qo70) {
            qo70Var = (qo70) yjeVar;
            int i = qo70Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                qo70Var.j = i - Integer.MIN_VALUE;
            } else {
                qo70Var = new qo70(this, yjeVar);
            }
        } else {
            qo70Var = new qo70(this, yjeVar);
        }
        Object obj2 = qo70Var.i;
        wne wneVar = wne.f39444a;
        int i2 = qo70Var.j;
        if (i2 == 0) {
            z1x.P(obj2);
            kmq kmqVar = (kmq) this.b;
            zy5 zy5Var = (zy5) obj;
            if ((zy5Var instanceof iy5) || (zy5Var instanceof ly5) || ((Boolean) ((to70) this.c).V.getValue()).booleanValue()) {
                qo70Var.j = 1;
                if (kmqVar.a(obj, qo70Var) == wneVar) {
                    return wneVar;
                }
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    private final Object j(yje yjeVar, Object obj) {
        rp70 rp70Var;
        if (yjeVar instanceof rp70) {
            rp70Var = (rp70) yjeVar;
            int i = rp70Var.j;
            if ((i & Integer.MIN_VALUE) != 0) {
                rp70Var.j = i - Integer.MIN_VALUE;
            } else {
                rp70Var = new rp70(this, yjeVar);
            }
        } else {
            rp70Var = new rp70(this, yjeVar);
        }
        Object obj2 = rp70Var.i;
        wne wneVar = wne.f39444a;
        int i2 = rp70Var.j;
        if (i2 == 0) {
            z1x.P(obj2);
            kmq kmqVar = (kmq) this.b;
            zy5 zy5Var = (zy5) obj;
            if ((zy5Var instanceof mle) || (zy5Var instanceof iy5) || (zy5Var instanceof ple) || (zy5Var instanceof hle) || ((sp70) this.c).N) {
                rp70Var.j = 1;
                if (kmqVar.a(obj, rp70Var) == wneVar) {
                    return wneVar;
                }
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj2);
        }
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:187:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:198:0x0407  */
    /* JADX WARN: Code duplicated, block: B:201:0x0432  */
    /* JADX WARN: Code duplicated, block: B:213:0x047f  */
    /* JADX WARN: Code duplicated, block: B:266:0x0589  */
    /* JADX WARN: Code duplicated, block: B:330:0x0679  */
    /* JADX WARN: Code duplicated, block: B:350:0x06e1  */
    /* JADX WARN: Code duplicated, block: B:376:0x0754 A[PHI: r1 r4 r11 r15
  0x0754: PHI (r1v52 a.mrh0) = (r1v51 a.mrh0), (r1v51 a.mrh0), (r1v53 a.mrh0) binds: [B:359:0x070f, B:361:0x0723, B:375:0x0752] A[DONT_GENERATE, DONT_INLINE]
  0x0754: PHI (r4v17 a.kmq) = (r4v16 a.kmq), (r4v16 a.kmq), (r4v18 a.kmq) binds: [B:359:0x070f, B:361:0x0723, B:375:0x0752] A[DONT_GENERATE, DONT_INLINE]
  0x0754: PHI (r11v4 boolean) = (r11v14 boolean), (r11v15 boolean), (r11v6 boolean) binds: [B:359:0x070f, B:361:0x0723, B:375:0x0752] A[DONT_GENERATE, DONT_INLINE]
  0x0754: PHI (r15v1 byte) = (r15v5 byte), (r15v0 byte), (r15v2 byte) binds: [B:359:0x070f, B:361:0x0723, B:375:0x0752] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:378:0x0758 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:382:0x075f  */
    /* JADX WARN: Code duplicated, block: B:439:0x0833  */
    /* JADX WARN: Code duplicated, block: B:455:0x08ce  */
    /* JADX WARN: Code duplicated, block: B:485:0x0964  */
    /* JADX WARN: Code duplicated, block: B:503:0x09de  */
    /* JADX WARN: Code duplicated, block: B:514:0x0a11  */
    /* JADX WARN: Code duplicated, block: B:530:0x0a61  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v7, types: [a.jsn0, a.kmq] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:175:0x0370 -> B:176:0x0371). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:201:0x0432 -> B:202:0x0433). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // a.kmq
    public final java.lang.Object a(java.lang.Object r30, a.yje r31) {
        /*
            Method dump skipped, instruction units count: 2816
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.clu.a(java.lang.Object, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
    
        if (r6.j() == r15) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        r6 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c5, code lost:
    
        if (r6 == r15) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00da, code lost:
    
        if (r7.j() == r15) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00eb, code lost:
    
        if (r6.i(r13, r2) == r15) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(kotlin.Pair r14, a.yje r15) {
        /*
            Method dump skipped, instruction units count: 303
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.clu.b(kotlin.Pair, a.yje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object c(boolean z, yje yjeVar) {
        ts10 ts10Var;
        if (yjeVar instanceof ts10) {
            ts10Var = (ts10) yjeVar;
            int i = ts10Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                ts10Var.k = i - Integer.MIN_VALUE;
            } else {
                ts10Var = new ts10(this, yjeVar);
            }
        } else {
            ts10Var = new ts10(this, yjeVar);
        }
        Object obj = ts10Var.i;
        wne wneVar = wne.f39444a;
        int i2 = ts10Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            if (z) {
                xcz xczVar = (xcz) this.b;
                ts10Var.k = 1;
                v0h0 v0h0Var = xcz.y;
                if (xczVar.l(0, 0, ts10Var) == wneVar) {
                    return wneVar;
                }
            }
            return Unit.f46060a;
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(obj);
        ((Function1) this.c).invoke(crk0.f4849a);
        return Unit.f46060a;
    }

    public /* synthetic */ clu(Object obj, Object obj2, byte b) {
        this.f4577a = b;
        this.b = obj;
        this.c = obj2;
    }
}
