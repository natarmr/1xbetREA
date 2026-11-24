package a;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ns30 extends w46 {
    public final j910 b;
    public final onv c;
    public final iw20 d;
    public final sqt e;
    public final mne f;
    public final duj g;
    public final tpx h;
    public final m1e i;
    public final wsf0 j;
    public final ljf0 k;
    public ys30 l;
    public boolean m;
    public final ol60 n = new ol60(3);
    public final p7m0 o = q7m0.a(ds30.f6593a);
    public final p7m0 p = q7m0.a(new js30(iun.f15405a));
    public final p7m0 q = q7m0.a(new ks30(false, true));
    public bby r;

    public ns30(j910 j910Var, onv onvVar, iw20 iw20Var, sqt sqtVar, mne mneVar, duj dujVar, tpx tpxVar, m1e m1eVar, wsf0 wsf0Var, ljf0 ljf0Var) {
        this.b = j910Var;
        this.c = onvVar;
        this.d = iw20Var;
        this.e = sqtVar;
        this.f = mneVar;
        this.g = dujVar;
        this.h = tpxVar;
        this.i = m1eVar;
        this.j = wsf0Var;
        this.k = ljf0Var;
        x();
        y();
        sac.V(jiu0.a(this), new as30(this, (byte) 1), null, null, new w620((Object) this, (yje) null, (byte) 11), 14);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r9.j.m(r11, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(a.ys30 r10, a.zje r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof a.ms30
            if (r0 == 0) goto L13
            r0 = r11
            a.ms30 r0 = (a.ms30) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.ms30 r0 = new a.ms30
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            a.z1x.P(r11)
            goto L88
        L2b:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r9)
            return r3
        L31:
            a.ys30 r10 = r0.i
            a.z1x.P(r11)
            goto L47
        L37:
            a.z1x.P(r11)
            r0.i = r10
            r0.l = r5
            r6 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r11 = a.qcc.O(r6, r0)
            if (r11 != r1) goto L47
            goto L87
        L47:
            r11 = 0
            r9.m = r11
        L4a:
            a.p7m0 r2 = r9.q
            java.lang.Object r6 = r2.getValue()
            r7 = r6
            a.ks30 r7 = (a.ks30) r7
            boolean r8 = r9.m
            a.ks30 r7 = a.ks30.a(r7, r11, r8, r5)
            boolean r2 = r2.m(r6, r7)
            if (r2 == 0) goto L4a
            a.cs30 r2 = a.cs30.f4870a
            r9.z(r2)
            a.ljf0 r2 = r9.k
            r2.d(r11)
            a.a16 r11 = new a.a16
            a.le8 r2 = new a.le8
            int r5 = r10.d
            a.tr30 r6 = r10.e
            int r6 = r6.g
            int r10 = r10.c
            r2.<init>(r5, r6, r10)
            r11.<init>(r2)
            r0.i = r3
            r0.l = r4
            a.wsf0 r9 = r9.j
            java.lang.Object r9 = r9.m(r11, r0)
            if (r9 != r1) goto L88
        L87:
            return r1
        L88:
            kotlin.Unit r9 = kotlin.Unit.f46060a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ns30.A(a.ys30, a.zje):java.lang.Object");
    }

    public final void B(tr30 tr30Var, ht30 ht30Var) {
        p7m0 p7m0Var;
        Object value;
        int i;
        w(b16.f1793a);
        this.m = true;
        do {
            p7m0Var = this.q;
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, ks30.a((ks30) value, false, this.m, 1)));
        List list = tr30Var.h;
        List list2 = tr30Var.b;
        int id = ht30Var.getId();
        switch (ht30Var.ordinal()) {
            case 0:
                i = R.string.football;
                break;
            case 1:
                i = R.string.hockey;
                break;
            case 2:
                i = R.string.basketball;
                break;
            case 3:
                i = R.string.tennis;
                break;
            case 4:
                i = R.string.box;
                break;
            case 5:
                i = R.string.rugby;
                break;
            case 6:
                i = R.string.american_footbol;
                break;
            case 7:
                i = R.string.volleyball;
                break;
            case 8:
                i = R.string.mix;
                break;
            default:
                t9f.b();
                return;
        }
        z(new es30(id, i, list, list2));
    }

    public final void w(i16 i16Var) {
        sac.V(jiu0.a(this), ls30.f20559a, null, this.f.f22085a, new mq10((Object) this, (Object) i16Var, (yje) null, (byte) 23), 10);
    }

    public final void x() {
        Object value;
        p7m0 p7m0Var = this.p;
        if (((js30) p7m0Var.getValue()).f17031a.isEmpty() && this.i.c()) {
            c0o c0oVar = ht30.b;
            ArrayList arrayList = new ArrayList(r3d.q(c0oVar, 10));
            y2 y2Var = new y2(c0oVar, (byte) 0);
            while (y2Var.hasNext()) {
                ht30 ht30Var = (ht30) y2Var.next();
                arrayList.add(new Pair(String.format(Locale.ENGLISH, ohs0.n(ujn.h, "/static/img/android/games/background/1xMemory/types/icon_%d.png"), Arrays.copyOf(new Object[]{Integer.valueOf(ht30Var.getId())}, 1)), ht30Var));
            }
            List listD = kotlin.collections.a.d(arrayList);
            do {
                value = p7m0Var.getValue();
                ((js30) value).getClass();
            } while (!p7m0Var.m(value, new js30(listD)));
        }
    }

    public final void y() {
        if (this.i.c()) {
            sac.V(jiu0.a(this), new as30(this, (byte) 3), new bs30(this, (byte) 1), this.f.b, new mq10((diu0) this, (yje) null, (byte) 24), 8);
        }
    }

    public final void z(fs30 fs30Var) {
        sac.V(jiu0.a(this), new tr20((byte) 21), null, null, new mq10((Object) this, (Object) fs30Var, (yje) null, (byte) 25), 14);
    }
}
