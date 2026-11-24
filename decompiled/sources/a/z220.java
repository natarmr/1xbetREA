package a;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.core.graphics.drawable.IconCompat;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import java.io.Serializable;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import org.xplatform.client1.providers.PopularScreen;
import org.xplatform.coupon.impl.coupon.presentation.CouponScreen;
import org.xplatform.favorites.impl.di.FavoritesScreen;
import org.xplatform.popular.impl.navigation.PopularScreenFactoryImpl$getScreen$1;
import org.xplatform.referral.api.domain.model.ReferralNetworkInfo;
import org.xplatform.referral.api.domain.model.ReferralUser;

/* JADX INFO: loaded from: classes6.dex */
public final class z220 implements lfn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f43651a;
    public final Object b;
    public final Object c;
    public final Object d;
    public Object e;

    /* JADX WARN: Multi-variable type inference failed */
    public z220(g760 g760Var) {
        Notification.Builder builder;
        int i;
        ArrayList arrayList;
        int i2;
        this.f43651a = (byte) 5;
        this.e = new Bundle();
        this.d = g760Var;
        Context context = g760Var.f10801a;
        ArrayList arrayList2 = g760Var.t;
        ArrayList arrayList3 = g760Var.c;
        ArrayList arrayList4 = g760Var.d;
        this.b = context;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = ga3.e(context, g760Var.q);
            this.c = builder;
        } else {
            builder = new Notification.Builder(context);
            this.c = builder;
        }
        Notification notification = g760Var.s;
        Context context2 = null;
        builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(g760Var.e).setContentText(g760Var.f).setContentInfo(null).setContentIntent(g760Var.g).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(null, (notification.flags & 128) != 0).setNumber(g760Var.i).setProgress(0, 0, false);
        IconCompat iconCompat = g760Var.h;
        builder.setLargeIcon(iconCompat == null ? null : bww.X(iconCompat, context));
        builder.setSubText(null).setUsesChronometer(false).setPriority(g760Var.j);
        for (c760 c760Var : g760Var.b) {
            IconCompat iconCompatB = c760Var.b;
            if (iconCompatB == null && (i2 = c760Var.d) != 0) {
                iconCompatB = IconCompat.b(i2);
                c760Var.b = iconCompatB;
            }
            Bundle bundle = c760Var.f3847a;
            Notification.Action.Builder builder2 = new Notification.Action.Builder(iconCompatB != null ? bww.X(iconCompatB, context2) : context2, c760Var.e, c760Var.f);
            Bundle bundle2 = new Bundle(bundle);
            bundle2.putBoolean("android.support.allowGeneratedReplies", true);
            builder2.setAllowGeneratedReplies(true);
            bundle2.putInt("android.support.action.semanticAction", 0);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 28) {
                ia3.E(builder2);
            }
            if (i3 >= 29) {
                sf3.z(builder2);
            }
            if (i3 >= 31) {
                gy2.j(builder2);
            }
            if (i3 >= 37) {
                qx2.a(builder2);
                qx2.c(builder2);
            }
            bundle2.putBoolean("android.support.action.showsUserInterface", c760Var.c);
            builder2.addExtras(bundle2);
            ((Notification.Builder) this.c).addAction(builder2.build());
            context2 = null;
        }
        Bundle bundle3 = g760Var.n;
        if (bundle3 != null) {
            ((Bundle) this.e).putAll(bundle3);
        }
        ((Notification.Builder) this.c).setShowWhen(g760Var.k);
        ((Notification.Builder) this.c).setLocalOnly(g760Var.m);
        ((Notification.Builder) this.c).setGroup(null);
        ((Notification.Builder) this.c).setSortKey(null);
        ((Notification.Builder) this.c).setGroupSummary(false);
        ((Notification.Builder) this.c).setCategory(null);
        ((Notification.Builder) this.c).setColor(g760Var.o);
        ((Notification.Builder) this.c).setVisibility(g760Var.p);
        ((Notification.Builder) this.c).setPublicVersion(null);
        ((Notification.Builder) this.c).setSound(notification.sound, notification.audioAttributes);
        if (Build.VERSION.SDK_INT < 28) {
            if (arrayList3 == null) {
                arrayList = null;
            } else {
                arrayList = new ArrayList(arrayList3.size());
                Iterator it = arrayList3.iterator();
                if (it.hasNext()) {
                    throw rw2.h(it);
                }
            }
            if (arrayList != null) {
                if (arrayList2 == null) {
                    arrayList2 = arrayList;
                } else {
                    lx3 lx3Var = new lx3(arrayList2.size() + arrayList.size());
                    lx3Var.addAll(arrayList);
                    lx3Var.addAll(arrayList2);
                    arrayList2 = new ArrayList(lx3Var);
                }
            }
        }
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                ((Notification.Builder) this.c).addPerson((String) it2.next());
            }
        }
        if (arrayList4.size() > 0) {
            Bundle bundle4 = g760Var.n;
            if (bundle4 == null) {
                bundle4 = new Bundle();
                g760Var.n = bundle4;
            }
            Bundle bundle5 = bundle4.getBundle("android.car.EXTENSIONS");
            bundle5 = bundle5 == null ? new Bundle() : bundle5;
            Bundle bundle6 = new Bundle(bundle5);
            Bundle bundle7 = new Bundle();
            for (int i4 = 0; i4 < arrayList4.size(); i4++) {
                String string = Integer.toString(i4);
                c760 c760Var2 = (c760) arrayList4.get(i4);
                Bundle bundle8 = new Bundle();
                IconCompat iconCompatB2 = c760Var2.b;
                if (iconCompatB2 == null && (i = c760Var2.d) != 0) {
                    iconCompatB2 = IconCompat.b(i);
                    c760Var2.b = iconCompatB2;
                }
                Bundle bundle9 = c760Var2.f3847a;
                bundle8.putInt("icon", iconCompatB2 != null ? iconCompatB2.c() : 0);
                bundle8.putCharSequence("title", c760Var2.e);
                bundle8.putParcelable("actionIntent", c760Var2.f);
                Bundle bundle10 = new Bundle(bundle9);
                bundle10.putBoolean("android.support.allowGeneratedReplies", true);
                bundle8.putBundle("extras", bundle10);
                bundle8.putParcelableArray("remoteInputs", null);
                bundle8.putBoolean("showsUserInterface", c760Var2.c);
                bundle8.putInt("semanticAction", 0);
                bundle7.putBundle(string, bundle8);
            }
            bundle5.putBundle("invisible_actions", bundle7);
            bundle6.putBundle("invisible_actions", bundle7);
            Bundle bundle11 = g760Var.n;
            if (bundle11 == null) {
                bundle11 = new Bundle();
                g760Var.n = bundle11;
            }
            bundle11.putBundle("android.car.EXTENSIONS", bundle5);
            ((Bundle) this.e).putBundle("android.car.EXTENSIONS", bundle6);
        }
        ((Notification.Builder) this.c).setExtras(g760Var.n);
        ((Notification.Builder) this.c).setRemoteInputHistory(null);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 26) {
            ga3.v((Notification.Builder) this.c);
            ga3.C((Notification.Builder) this.c);
            ga3.D((Notification.Builder) this.c);
            ga3.E((Notification.Builder) this.c);
            ga3.y((Notification.Builder) this.c);
            if (!TextUtils.isEmpty(g760Var.q)) {
                ((Notification.Builder) this.c).setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
            }
        }
        if (i5 >= 28) {
            Iterator it3 = arrayList3.iterator();
            if (it3.hasNext()) {
                throw rw2.h(it3);
            }
        }
        if (i5 >= 29) {
            sf3.w((Notification.Builder) this.c, g760Var.r);
            sf3.y((Notification.Builder) this.c);
        }
        if (i5 >= 36) {
            g7.f((Notification.Builder) this.c);
        }
    }

    public static void c(Throwable th) throws Throwable {
        Throwable afd0Var;
        zhi0 zhi0Var = th instanceof zhi0 ? (zhi0) th : null;
        kuw kuwVar = zhi0Var != null ? zhi0Var.c : null;
        if (kuwVar == i2o.AllowItBefore) {
            throw new zed0();
        }
        if (kuwVar == i2o.AuthWrongSecretQuestion) {
            String message = th.getMessage();
            afd0Var = new bfd0(message != null ? message : "");
        } else {
            if (kuwVar != i2o.TokenExpiredError) {
                throw th;
            }
            String message2 = th.getMessage();
            afd0Var = new afd0(message2 != null ? message2 : "");
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:9:0x0028  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0096, code lost:
    
        if (((a.urt) r5).f36180a.i(r2, r3) == r9) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object A(int r20, a.zje r21) throws a.zhi0 {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z220.A(int, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        if (r0 == r3) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(long r17, long r19, a.zje r21) {
        /*
            r16 = this;
            r0 = r16
            r1 = r21
            boolean r2 = r1 instanceof a.tdi0
            if (r2 == 0) goto L17
            r2 = r1
            a.tdi0 r2 = (a.tdi0) r2
            int r3 = r2.m
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.m = r3
            goto L1c
        L17:
            a.tdi0 r2 = new a.tdi0
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.k
            a.wne r3 = a.wne.f39444a
            int r4 = r2.m
            r5 = 2
            r6 = 1
            if (r4 == 0) goto L3e
            if (r4 == r6) goto L35
            if (r4 != r5) goto L2e
            a.z1x.P(r1)
            goto L96
        L2e:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r0)
            r0 = 0
            return r0
        L35:
            long r6 = r2.j
            long r8 = r2.i
            a.z1x.P(r1)
            r10 = r6
            goto L5a
        L3e:
            a.z1x.P(r1)
            java.lang.Object r1 = r0.d
            a.khf0 r1 = (a.khf0) r1
            a.bm5 r4 = a.bm5.c
            r7 = r17
            r2.i = r7
            r9 = r19
            r2.j = r9
            r2.m = r6
            java.io.Serializable r1 = a.khf0.G(r1, r4, r2)
            if (r1 != r3) goto L58
            goto L95
        L58:
            r10 = r9
            r8 = r7
        L5a:
            a.ql5 r1 = (a.ql5) r1
            java.lang.Object r4 = r0.e
            a.trm0 r4 = (a.trm0) r4
            a.bm5 r6 = a.bm5.c
            r4.l(r6, r1)
            java.lang.Object r4 = r0.b
            r7 = r4
            a.rrd r7 = (a.rrd) r7
            long r12 = r1.f28916a
            java.lang.Object r0 = r0.c
            a.uzc r0 = (a.uzc) r0
            a.jvn r0 = r0.b()
            int r14 = r0.getId()
            r2.i = r8
            r2.j = r10
            r2.m = r5
            java.lang.Object r0 = r7.b
            a.mne r0 = (a.mne) r0
            a.dvj r0 = r0.b
            a.k6w r6 = new a.k6w
            r15 = 0
            r6.<init>(r7, r8, r10, r12, r14, r15)
            java.lang.Object r0 = a.qjj.d0(r0, r6, r2)
            if (r0 != r3) goto L91
            goto L93
        L91:
            kotlin.Unit r0 = kotlin.Unit.f46060a
        L93:
            if (r0 != r3) goto L96
        L95:
            return r3
        L96:
            kotlin.Unit r0 = kotlin.Unit.f46060a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z220.B(long, long, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object C(ql5 ql5Var, zje zjeVar) {
        y220 y220Var;
        wsf0 wsf0Var = (wsf0) this.b;
        if (zjeVar instanceof y220) {
            y220Var = (y220) zjeVar;
            int i = y220Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                y220Var.k = i - Integer.MIN_VALUE;
            } else {
                y220Var = new y220(this, zjeVar);
            }
        } else {
            y220Var = new y220(this, zjeVar);
        }
        Object obj = y220Var.i;
        wne wneVar = wne.f39444a;
        int i2 = y220Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            Iterator it = q3d.j(bm5.j, bm5.f2822a, bm5.f, bm5.c, bm5.g, bm5.i).iterator();
            while (it.hasNext()) {
                wsf0Var.b().a((bm5) it.next(), ql5Var);
            }
            jyg0.a(wsf0Var.q(), ql5Var.f28916a);
            ((g45) wsf0Var.b).b().b(ql5Var);
            ((vwb0) ((svu) ((nr00) ((eyg0) this.c).b).f23980a).f32888a).e("favorites_list_changed", true);
            yqc yqcVarC = ((rmd0) this.d).c();
            y220Var.k = 1;
            if (yqcVarC.u(y220Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        ((qgd) ((roi0) this.e).f30839a).x().E();
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object D(String str, double d, double d2, double d3, long j, zje zjeVar) {
        hug0 hug0Var;
        double d4;
        String str2;
        double d5;
        double d6;
        double d7;
        ql5 ql5Var;
        double d8;
        ytg0 ytg0Var;
        long j2 = j;
        if (zjeVar instanceof hug0) {
            hug0Var = (hug0) zjeVar;
            int i = hug0Var.q;
            if ((i & Integer.MIN_VALUE) != 0) {
                hug0Var.q = i - Integer.MIN_VALUE;
            } else {
                hug0Var = new hug0(this, zjeVar);
            }
        } else {
            hug0Var = new hug0(this, zjeVar);
        }
        Object objA = hug0Var.o;
        wne wneVar = wne.f39444a;
        int i2 = hug0Var.q;
        if (i2 == 0) {
            d4 = 0.0d;
            z1x.P(objA);
            nrt nrtVar = (nrt) this.c;
            str2 = str;
            hug0Var.i = str2;
            d5 = d;
            hug0Var.k = d5;
            d6 = d2;
            hug0Var.l = d6;
            d7 = d3;
            hug0Var.m = d7;
            hug0Var.n = j2;
            hug0Var.q = 1;
            objA = nrt.a(nrtVar, j2, hug0Var);
            if (objA != wneVar) {
            }
            return wneVar;
        }
        if (i2 == 1) {
            j2 = hug0Var.n;
            double d9 = hug0Var.m;
            double d10 = hug0Var.l;
            d4 = 0.0d;
            d5 = hug0Var.k;
            str2 = hug0Var.i;
            z1x.P(objA);
            d7 = d9;
            d6 = d10;
        } else {
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            d8 = hug0Var.m;
            ql5Var = hug0Var.j;
            z1x.P(objA);
            d4 = 0.0d;
        }
        ytg0Var = (ytg0) objA;
        if (d8 <= d4) {
            ((ilt0) this.d).a(ytg0Var.b, ql5Var.f28916a);
            ((ot) this.e).a(bm5.c, ql5.a(ql5Var, ytg0Var.b, null, 0, 8189));
        }
        return ytg0Var;
        String str3 = str2;
        ql5 ql5Var2 = (ql5) objA;
        kd30 kd30Var = (kd30) this.b;
        long j3 = ql5Var2.f28916a;
        hug0Var.i = null;
        hug0Var.j = ql5Var2;
        hug0Var.k = d5;
        hug0Var.l = d6;
        hug0Var.m = d7;
        hug0Var.n = j2;
        hug0Var.q = 2;
        mii0 mii0Var = (mii0) kd30Var.f18086a;
        long j4 = ((gst0) kd30Var.b).f11847a.a().f18785a;
        String strA = ((btt0) mii0Var.e).a();
        knf0 knf0Var = (knf0) mii0Var.d;
        double d11 = d7;
        Object objD0 = qjj.d0(((mne) mii0Var.b).b, new b2b(d11 > d4, mii0Var, strA, new c0f(str3, knf0Var.c(), knf0Var.c(), d6, d5, null, d11, j4, j3, knf0Var.a()), (yje) null), hug0Var);
        if (objD0 != wneVar) {
            ql5Var = ql5Var2;
            objA = objD0;
            d8 = d11;
            ytg0Var = (ytg0) objA;
            if (d8 <= d4) {
                ((ilt0) this.d).a(ytg0Var.b, ql5Var.f28916a);
                ((ot) this.e).a(bm5.c, ql5.a(ql5Var, ytg0Var.b, null, 0, 8189));
            }
            return ytg0Var;
        }
        return wneVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(3:70|24|(1:27)) */
    /* JADX WARN: Code duplicated, block: B:27:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00f9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:36:0x0102  */
    /* JADX WARN: Code duplicated, block: B:38:0x0107  */
    /* JADX WARN: Code duplicated, block: B:39:0x0109  */
    /* JADX WARN: Code duplicated, block: B:42:0x010e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0129  */
    /* JADX WARN: Code duplicated, block: B:48:0x0131  */
    /* JADX WARN: Code duplicated, block: B:50:0x0137  */
    /* JADX WARN: Code duplicated, block: B:52:0x013e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0140  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163  */
    /* JADX WARN: Code duplicated, block: B:62:0x016b  */
    /* JADX WARN: Code duplicated, block: B:63:0x016d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0175 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x0177  */
    /* JADX WARN: Code duplicated, block: B:67:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x00a0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f2, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0123, code lost:
    
        if (a.qcc.P(r10, r4) == r3) goto L58;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00fb -> B:23:0x009e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x016d -> B:60:0x0160). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object E(int r21, a.zje r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z220.E(int, a.zje):java.lang.Object");
    }

    public void F(List list, j1i0 j1i0Var, ms2 ms2Var, Integer num) {
        String str = j1i0Var.f15736a;
        list.getClass();
        ms2Var.getClass();
        String strV = ms2Var instanceof ds2 ? g1x.v((ds2) ms2Var) : kpb.v0(ms2Var);
        ((b4j) this.d).r(strV, list, str, num);
        ((je) this.e).q(strV, list, str, num);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object G(double d, zje zjeVar) {
        loe0 loe0Var;
        if (zjeVar instanceof loe0) {
            loe0Var = (loe0) zjeVar;
            int i = loe0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                loe0Var.k = i - Integer.MIN_VALUE;
            } else {
                loe0Var = new loe0(this, zjeVar);
            }
        } else {
            loe0Var = new loe0(this, zjeVar);
        }
        Object obj = loe0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = loe0Var.k;
        if (i2 == 0) {
            z1x.P(obj);
            jw20 jw20Var = (jw20) this.c;
            String strA = ((btt0) this.e).a();
            loe0Var.k = 1;
            if (((boe0) ((rta0) jw20Var.b).invoke()).d(strA, new tu40(d), loe0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public boolean H(xj xjVar, MenuItem menuItem) {
        return ((ActionMode.Callback) this.b).onActionItemClicked(i(xjVar), new sz30((Context) this.c, (ojn0) menuItem));
    }

    public boolean I(xj xjVar, ox30 ox30Var) {
        ActionMode.Callback callback = (ActionMode.Callback) this.b;
        pin0 pin0VarI = i(xjVar);
        nuj0 nuj0Var = (nuj0) this.e;
        Menu k340Var = (Menu) nuj0Var.get(ox30Var);
        if (k340Var == null) {
            k340Var = new k340((Context) this.c, ox30Var);
            nuj0Var.put(ox30Var, k340Var);
        }
        return callback.onCreateActionMode(pin0VarI, k340Var);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object J(zje zjeVar) {
        qsh0 qsh0Var;
        if (zjeVar instanceof qsh0) {
            qsh0Var = (qsh0) zjeVar;
            int i = qsh0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                qsh0Var.k = i - Integer.MIN_VALUE;
            } else {
                qsh0Var = new qsh0(this, zjeVar);
            }
        } else {
            qsh0Var = new qsh0(this, zjeVar);
        }
        qsh0 qsh0Var2 = qsh0Var;
        Object objD = qsh0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = qsh0Var2.k;
        if (i2 == 0) {
            z1x.P(objD);
            msh0 msh0Var = (msh0) this.c;
            String strA = ((btt0) this.e).a();
            String strA2 = ((knf0) this.d).a();
            fof0 fof0Var = new fof0();
            qsh0Var2.k = 1;
            objD = msh0Var.a().d(strA, strA2, 1, fof0Var, qsh0Var2);
            if (objD == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objD);
        }
        q16 q16Var = (q16) objD;
        return Boolean.valueOf(q16Var.b ? true : ((Boolean) q16Var.a()).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object K(String str, zje zjeVar) {
        rsh0 rsh0Var;
        if (zjeVar instanceof rsh0) {
            rsh0Var = (rsh0) zjeVar;
            int i = rsh0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                rsh0Var.k = i - Integer.MIN_VALUE;
            } else {
                rsh0Var = new rsh0(this, zjeVar);
            }
        } else {
            rsh0Var = new rsh0(this, zjeVar);
        }
        rsh0 rsh0Var2 = rsh0Var;
        Object objA = rsh0Var2.i;
        wne wneVar = wne.f39444a;
        int i2 = rsh0Var2.k;
        if (i2 == 0) {
            z1x.P(objA);
            msh0 msh0Var = (msh0) this.c;
            String strA = ((btt0) this.e).a();
            String strA2 = ((knf0) this.d).a();
            iof0 iof0Var = new iof0(str);
            rsh0Var2.k = 1;
            objA = msh0Var.a().a(strA, strA2, 1, iof0Var, rsh0Var2);
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
        q16 q16Var = (q16) objA;
        return Boolean.valueOf(q16Var.b ? true : ((Boolean) q16Var.a()).booleanValue());
    }

    public void L(ArrayList arrayList) {
        yvn0 yvn0Var = (yvn0) this.d;
        yvn0Var.getClass();
        yvn0Var.f43330a.g("KEY_SAVED_SWIPE_X_CHAMPS", yvn0Var.b.d(new zw3(epn0.Companion.serializer(), (byte) 0), arrayList));
    }

    public void M(ArrayList arrayList) {
        yvn0 yvn0Var = (yvn0) this.d;
        yvn0Var.getClass();
        yvn0Var.f43330a.g("KEY_SAVED_SWIPE_X_SPORTS", yvn0Var.b.d(new zw3(hpn0.Companion.serializer(), (byte) 0), arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object N(String str, String str2, zje zjeVar) throws zhi0, fpd0 {
        lid0 lid0Var;
        if (zjeVar instanceof lid0) {
            lid0Var = (lid0) zjeVar;
            int i = lid0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                lid0Var.k = i - Integer.MIN_VALUE;
            } else {
                lid0Var = new lid0(this, zjeVar);
            }
        } else {
            lid0Var = new lid0(this, zjeVar);
        }
        Object objA = lid0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = lid0Var.k;
        if (i2 == 0) {
            z1x.P(objA);
            if (str2.length() == 0) {
                throw new fpd0("");
            }
            gkd0 gkd0Var = (gkd0) ((a8z) this.e).getValue();
            eyc eycVar = new eyc(str, str2, ((knf0) this.d).c());
            lid0Var.k = 1;
            objA = gkd0Var.a(eycVar, lid0Var);
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
        ((q16) objA).a();
        return Unit.f46060a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object O(int i, zje zjeVar, ynb0 ynb0Var) throws Throwable {
        mid0 mid0Var;
        Integer num;
        if (zjeVar instanceof mid0) {
            mid0Var = (mid0) zjeVar;
            int i2 = mid0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mid0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                mid0Var = new mid0(this, zjeVar);
            }
        } else {
            mid0Var = new mid0(this, zjeVar);
        }
        Object objB = mid0Var.i;
        wne wneVar = wne.f39444a;
        int i3 = mid0Var.k;
        try {
            if (i3 == 0) {
                z1x.P(objB);
                e0g0 e0g0Var = j0g0.b;
                gkd0 gkd0Var = (gkd0) ((a8z) this.e).getValue();
                String strA = ((btt0) this.b).a();
                lzn0 lzn0Var = new lzn0(new izn0(i), ynb0Var.f42933a, ynb0Var.b);
                mid0Var.k = 1;
                objB = gkd0Var.b(strA, lzn0Var, mid0Var);
                if (objB == wneVar) {
                    return wneVar;
                }
            } else {
                if (i3 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objB);
            }
            o3u0 o3u0Var = (o3u0) ((q16) objB).a();
            String str = o3u0Var.e;
            String str2 = (str == null && (str = o3u0Var.b) == null) ? "" : str;
            ywp0 ywp0Var = o3u0Var.c;
            String str3 = ywp0Var != null ? ywp0Var.b : null;
            String str4 = str3 == null ? "" : str3;
            String str5 = ywp0Var != null ? ywp0Var.f43382a : null;
            String str6 = str5 == null ? "" : str5;
            List list = o3u0Var.d;
            int iIntValue = (list == null || (num = (Integer) CollectionsKt.W(0, list)) == null) ? -1 : num.intValue();
            String str7 = o3u0Var.f24603a;
            boolean z = str7 != null;
            String str8 = str7 == null ? "" : str7;
            Iterable<String> iterable = o3u0Var.f;
            if (iterable == null) {
                iterable = iun.f15405a;
            }
            ArrayList arrayList = new ArrayList();
            for (String str9 : iterable) {
                obk0.b.getClass();
                obk0 obk0VarB = zie0.b(str9);
                if (obk0VarB != null) {
                    arrayList.add(obk0VarB);
                }
            }
            boolean zIsEmpty = arrayList.isEmpty();
            List listC = arrayList;
            if (zIsEmpty) {
                listC = kotlin.collections.a.c(obk0.SMS);
            }
            return new hkd0(str4, str6, iIntValue, z, str8, listC, str2);
        } catch (Throwable th) {
            e0g0 e0g0Var2 = j0g0.b;
            g0g0 g0g0Var = new g0g0(th);
            Throwable thA = j0g0.a(g0g0Var);
            if (thA == null) {
                z1x.P(g0g0Var);
                return g0g0Var;
            }
            c(thA);
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object P(zje zjeVar) {
        moe0 moe0Var;
        if (zjeVar instanceof moe0) {
            moe0Var = (moe0) zjeVar;
            int i = moe0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                moe0Var.k = i - Integer.MIN_VALUE;
            } else {
                moe0Var = new moe0(this, zjeVar);
            }
        } else {
            moe0Var = new moe0(this, zjeVar);
        }
        Object objC = moe0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = moe0Var.k;
        if (i2 == 0) {
            z1x.P(objC);
            jw20 jw20Var = (jw20) this.c;
            String strA = ((btt0) this.e).a();
            moe0Var.k = 1;
            objC = ((boe0) ((rta0) jw20Var.b).invoke()).c(strA, moe0Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        String str = ((eto0) ((dx5) objC).a()).f8385a;
        return str == null ? "" : str;
    }

    public void a(List list) {
        list.getClass();
        yvn0 yvn0Var = (yvn0) this.d;
        yvn0Var.getClass();
        yvn0Var.d.o(null, list);
    }

    public void b(List list) {
        list.getClass();
        yvn0 yvn0Var = (yvn0) this.d;
        yvn0Var.getClass();
        yvn0Var.c.o(null, list);
    }

    @Override // a.lfn0
    public void d(byte[] bArr, int i, int i2, kfn0 kfn0Var, rbe rbeVar) {
        ctf ctfVar;
        int i3;
        int i4;
        int iZ;
        int i5;
        int i6;
        int iC;
        bl90 bl90Var = (bl90) this.d;
        int[] iArr = bl90Var.b;
        fq80 fq80Var = bl90Var.f2784a;
        fq80 fq80Var2 = (fq80) this.c;
        fq80 fq80Var3 = (fq80) this.b;
        fq80Var3.K(bArr, i + i2);
        fq80Var3.M(i);
        Inflater inflater = (Inflater) this.e;
        if (inflater == null) {
            inflater = new Inflater();
            this.e = inflater;
        }
        String str = vtt0.f38024a;
        if (fq80Var3.a() > 0 && fq80Var3.j() == 120 && vtt0.G(fq80Var3, fq80Var2, inflater)) {
            fq80Var3.K(fq80Var2.f9961a, fq80Var2.c);
        }
        int i7 = 0;
        bl90Var.d = 0;
        bl90Var.e = 0;
        bl90Var.f = 0;
        bl90Var.g = 0;
        bl90Var.h = 0;
        bl90Var.i = 0;
        fq80Var.J(0);
        bl90Var.c = false;
        ArrayList arrayList = new ArrayList();
        while (fq80Var3.a() >= 3) {
            int i8 = fq80Var3.c;
            int iZ2 = fq80Var3.z();
            int iG = fq80Var3.G();
            int i9 = fq80Var3.b + iG;
            if (i9 > i8) {
                fq80Var3.M(i8);
                i3 = i7;
                ctfVar = null;
            } else {
                char c = 128;
                if (iZ2 != 128) {
                    switch (iZ2) {
                        case 20:
                            if (iG % 5 == 2) {
                                fq80Var3.N(2);
                                Arrays.fill(iArr, i7);
                                int i10 = iG / 5;
                                int i11 = i7;
                                while (i11 < i10) {
                                    int iZ3 = fq80Var3.z();
                                    char c2 = c;
                                    double dZ = fq80Var3.z();
                                    double dZ2 = fq80Var3.z() - 128;
                                    double dZ3 = fq80Var3.z() - 128;
                                    iArr[iZ3] = vtt0.i((int) ((dZ3 * 1.772d) + dZ), 0, 255) | (fq80Var3.z() << 24) | (vtt0.i((int) ((1.402d * dZ2) + dZ), 0, 255) << 16) | (vtt0.i((int) ((dZ - (0.34414d * dZ3)) - (dZ2 * 0.71414d)), 0, 255) << 8);
                                    i11++;
                                    c = c2;
                                    bl90Var = bl90Var;
                                }
                                bl90Var.c = true;
                            }
                            break;
                        case 21:
                            if (iG >= 4) {
                                fq80Var3.N(3);
                                int i12 = iG - 4;
                                if (((128 & fq80Var3.z()) != 0 ? 1 : i7) == 0) {
                                    i5 = fq80Var.b;
                                    i6 = fq80Var.c;
                                    if (i5 < i6 && i12 > 0) {
                                        int iMin = Math.min(i12, i6 - i5);
                                        fq80Var3.k(fq80Var.f9961a, i5, iMin);
                                        fq80Var.M(i5 + iMin);
                                    }
                                } else if (i12 >= 7 && (iC = fq80Var3.C()) >= 4) {
                                    bl90Var.h = fq80Var3.G();
                                    bl90Var.i = fq80Var3.G();
                                    fq80Var.J(iC - 4);
                                    i12 = iG - 11;
                                    i5 = fq80Var.b;
                                    i6 = fq80Var.c;
                                    if (i5 < i6) {
                                        int iMin2 = Math.min(i12, i6 - i5);
                                        fq80Var3.k(fq80Var.f9961a, i5, iMin2);
                                        fq80Var.M(i5 + iMin2);
                                    }
                                }
                            }
                            break;
                        case 22:
                            if (iG >= 19) {
                                bl90Var.d = fq80Var3.G();
                                bl90Var.e = fq80Var3.G();
                                fq80Var3.N(11);
                                bl90Var.f = fq80Var3.G();
                                bl90Var.g = fq80Var3.G();
                            }
                            break;
                    }
                    ctfVar = null;
                    i3 = 0;
                } else {
                    if (bl90Var.d == 0 || bl90Var.e == 0 || bl90Var.h == 0 || bl90Var.i == 0 || (i4 = fq80Var.c) == 0 || fq80Var.b != i4 || !bl90Var.c) {
                        ctfVar = null;
                    } else {
                        fq80Var.M(0);
                        int i13 = bl90Var.h * bl90Var.i;
                        int[] iArr2 = new int[i13];
                        int i14 = 0;
                        while (i14 < i13) {
                            int iZ4 = fq80Var.z();
                            if (iZ4 != 0) {
                                iZ = i14 + 1;
                                iArr2[i14] = iArr[iZ4];
                            } else {
                                int iZ5 = fq80Var.z();
                                if (iZ5 != 0) {
                                    iZ = ((iZ5 & 64) == 0 ? iZ5 & 63 : ((iZ5 & 63) << 8) | fq80Var.z()) + i14;
                                    Arrays.fill(iArr2, i14, iZ, (iZ5 & 128) == 0 ? iArr[0] : iArr[fq80Var.z()]);
                                }
                            }
                            i14 = iZ;
                        }
                        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr2, bl90Var.h, bl90Var.i, Bitmap.Config.ARGB_8888);
                        float f = bl90Var.f;
                        float f2 = bl90Var.d;
                        float f3 = f / f2;
                        float f4 = bl90Var.g;
                        float f5 = bl90Var.e;
                        ctfVar = new ctf(null, null, null, bitmapCreateBitmap, f4 / f5, 0, 0, f3, 0, Integer.MIN_VALUE, -3.4028235E38f, bl90Var.h / f2, bl90Var.i / f5, false, -16777216, Integer.MIN_VALUE, 0.0f, 0);
                    }
                    i3 = 0;
                    bl90Var.d = 0;
                    bl90Var.e = 0;
                    bl90Var.f = 0;
                    bl90Var.g = 0;
                    bl90Var.h = 0;
                    bl90Var.i = 0;
                    fq80Var.J(0);
                    bl90Var.c = false;
                }
                fq80Var3.M(i9);
            }
            if (ctfVar != null) {
                arrayList.add(ctfVar);
            }
            i7 = i3;
        }
        rbeVar.accept(new ftf(-9223372036854775807L, -9223372036854775807L, arrayList));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(String str, String str2, String str3, String str4, zje zjeVar) throws Throwable {
        kid0 kid0Var;
        Object g0g0Var;
        if (zjeVar instanceof kid0) {
            kid0Var = (kid0) zjeVar;
            int i = kid0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                kid0Var.k = i - Integer.MIN_VALUE;
            } else {
                kid0Var = new kid0(this, zjeVar);
            }
        } else {
            kid0Var = new kid0(this, zjeVar);
        }
        Object objC = kid0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = kid0Var.k;
        try {
            if (i2 == 0) {
                z1x.P(objC);
                e0g0 e0g0Var = j0g0.b;
                y4c y4cVar = new y4c(new v4c(str4, str3), new un4(str, str2));
                gkd0 gkd0Var = (gkd0) ((a8z) this.e).getValue();
                kid0Var.k = 1;
                objC = gkd0Var.c(y4cVar, kid0Var);
                if (objC == wneVar) {
                    return wneVar;
                }
            } else {
                if (i2 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(objC);
            }
            g0g0Var = (o3u0) ((q16) objC).a();
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            z1x.P(g0g0Var);
            return Unit.f46060a;
        }
        c(thA);
        throw null;
    }

    public FragmentScreen g(cb50 cb50Var) {
        cb50Var.getClass();
        if (cb50Var instanceof bb50) {
            kd30 kd30Var = (kd30) this.c;
            if (((pru) kd30Var.b).a().g.l == rhb0.POPULAR_CLASSIC) {
                return new PopularScreen(new peb0(kd30Var));
            }
            Object obj = kd30Var.f18086a;
            return new PopularScreen(new yr80(new PopularScreenFactoryImpl$getScreen$1(), (byte) 26));
        }
        r040 r040Var = null;
        Object obj2 = null;
        if (cb50Var instanceof ya50) {
            lk5 lk5Var = (lk5) this.d;
            int i = ((ya50) cb50Var).b;
            r9u r9uVar = lk5Var.b;
            ygp ygpVar = ygp.o;
            j1q0 j1q0Var = r9uVar.f30104a;
            j1q0Var.getClass();
            boolean zD = j1q0Var.f15748a.d(ygpVar);
            vcp vcpVar = lk5Var.f20182a.a().g.B;
            for (Object obj3 : tcp.k) {
                if (((tcp) obj3).f33727a == i) {
                    obj2 = obj3;
                    break;
                }
            }
            return new FavoritesScreen(zD, vcpVar, (tcp) obj2);
        }
        if (cb50Var instanceof xa50) {
            xa50 xa50Var = (xa50) cb50Var;
            String str = xa50Var.b;
            boolean z = xa50Var.c;
            str.getClass();
            return new CouponScreen(str, z);
        }
        if (cb50Var instanceof za50) {
            za50 za50Var = (za50) cb50Var;
            return ((xr) this.b).r(new p57(za50Var.b, za50Var.c, za50Var.d), sys0.f33037a);
        }
        if (!(cb50Var instanceof ab50)) {
            t9f.b();
            return null;
        }
        zx10 zx10Var = (zx10) this.e;
        xuz xuzVar = r040.b;
        byte b = ((ab50) cb50Var).b;
        xuzVar.getClass();
        for (r040 r040Var2 : r040.values()) {
            if (r040Var2.f29611a == b) {
                r040Var = r040Var2;
                break;
            }
        }
        if (r040Var == null) {
            r040Var = r040.TOP;
        }
        return zx10.k(zx10Var, r040Var, false, 6);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(int i, zje zjeVar) {
        joe0 joe0Var;
        if (zjeVar instanceof joe0) {
            joe0Var = (joe0) zjeVar;
            int i2 = joe0Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                joe0Var.k = i2 - Integer.MIN_VALUE;
            } else {
                joe0Var = new joe0(this, zjeVar);
            }
        } else {
            joe0Var = new joe0(this, zjeVar);
        }
        Object obj = joe0Var.i;
        wne wneVar = wne.f39444a;
        int i3 = joe0Var.k;
        if (i3 == 0) {
            z1x.P(obj);
            jw20 jw20Var = (jw20) this.c;
            String strA = ((btt0) this.e).a();
            joe0Var.k = 1;
            if (((boe0) ((rta0) jw20Var.b).invoke()).b(strA, new r5k(i), joe0Var) == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(obj);
        }
        return Unit.f46060a;
    }

    public pin0 i(xj xjVar) {
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            pin0 pin0Var = (pin0) arrayList.get(i);
            if (pin0Var != null && pin0Var.b == xjVar) {
                return pin0Var;
            }
        }
        pin0 pin0Var2 = new pin0((Context) this.c, xjVar);
        arrayList.add(pin0Var2);
        return pin0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object j(int i, zje zjeVar) {
        bc40 bc40Var;
        Object g0g0Var;
        if (zjeVar instanceof bc40) {
            bc40Var = (bc40) zjeVar;
            int i2 = bc40Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bc40Var.k = i2 - Integer.MIN_VALUE;
            } else {
                bc40Var = new bc40(this, zjeVar);
            }
        } else {
            bc40Var = new bc40(this, zjeVar);
        }
        Object objE = bc40Var.i;
        Object obj = wne.f39444a;
        int i3 = bc40Var.k;
        try {
            if (i3 == 0) {
                z1x.P(objE);
                e0g0 e0g0Var = j0g0.b;
                g0g0Var = ((vb40) this.c).a();
                if (g0g0Var == null) {
                    bc40Var.k = 1;
                    objE = E(i, bc40Var);
                    if (objE == obj) {
                        return obj;
                    }
                }
                e0g0 e0g0Var2 = j0g0.b;
                if (j0g0.a(g0g0Var) == null) {
                    return g0g0Var;
                }
                return iun.f15405a;
            }
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objE);
            g0g0Var = (List) objE;
            e0g0 e0g0Var3 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var4 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        if (j0g0.a(g0g0Var) == null) {
            return g0g0Var;
        }
        return iun.f15405a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v0, types: [a.yje] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    public Object k(int i, zje zjeVar, String str, boolean z) {
        zgm0 zgm0Var;
        String str2;
        List list;
        Object next;
        ygm0 ygm0Var = (ygm0) this.d;
        if (zjeVar instanceof zgm0) {
            zgm0Var = (zgm0) zjeVar;
            int i2 = zgm0Var.l;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zgm0Var.l = i2 - Integer.MIN_VALUE;
            } else {
                zgm0Var = new zgm0(this, zjeVar);
            }
        } else {
            zgm0Var = new zgm0(this, zjeVar);
        }
        Object objD0 = zgm0Var.j;
        wne wneVar = wne.f39444a;
        int i3 = zgm0Var.l;
        ?? r9 = 0;
        r9 = 0;
        r9 = 0;
        if (i3 == 0) {
            z1x.P(objD0);
            kgb kgbVar = ygm0Var.f42593a;
            if (kgbVar != null && !z) {
                return kgbVar;
            }
            zgm0Var.i = str;
            zgm0Var.l = 1;
            objD0 = qjj.d0(((mne) this.b).b, new gc1((Object) str, (Object) this, i, (yje) r9, (byte) 22), zgm0Var);
            if (objD0 == wneVar) {
                return wneVar;
            }
            str2 = str;
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = zgm0Var.i;
            z1x.P(objD0);
        }
        kgb kgbVar2 = (kgb) objD0;
        ygm0Var.getClass();
        kgbVar2.getClass();
        ygm0Var.f42593a = kgbVar2;
        if (str2.length() == 0 && ygm0Var.b.length() == 0) {
            deb debVar = kgbVar2.c;
            if (debVar != null && (list = debVar.b) != null) {
                Iterator it = list.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((ytk) next).c);
                ytk ytkVar = (ytk) next;
                if (ytkVar != null) {
                    r9 = ytkVar.b;
                }
            }
            if (r9 == 0) {
                r9 = "";
            }
            ygm0Var.b = r9;
        }
        return kgbVar2;
    }

    public Object l(zje zjeVar) {
        return qjj.d0(((mne) this.e).b, new zwn0(this, null, (byte) 0), zjeVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:38|100|39|110|40|41|106|42|43|104|44|(1:47)|33|91) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:(3:(1:(2:14|93)(2:15|16))(2:17|113)|67|(14:38|100|39|110|40|41|106|42|43|104|44|(1:47)|33|91)(1:(2:97|98)(1:99)))(4:18|108|19|20)|102|48|49) */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x023f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0241  */
    /* JADX WARN: Code duplicated, block: B:68:0x0253  */
    /* JADX WARN: Code duplicated, block: B:70:0x025c  */
    /* JADX WARN: Code duplicated, block: B:71:0x025e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0263  */
    /* JADX WARN: Code duplicated, block: B:76:0x028e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0291  */
    /* JADX WARN: Code duplicated, block: B:79:0x029f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:81:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:83:0x02be  */
    /* JADX WARN: Code duplicated, block: B:85:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:86:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:92:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x030a  */
    /* JADX WARN: Code duplicated, block: B:95:0x031a  */
    /* JADX WARN: Code duplicated, block: B:96:0x032a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x032c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0334  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0188, code lost:
    
        if (r0 == r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0204, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0205, code lost:
    
        r1 = r5;
        r5 = r0;
        r0 = r1;
        r22 = r16;
        r16 = r2;
        r1 = r8;
        r9 = r3;
        r3 = r11;
        r11 = r4;
        r4 = r22;
        r8 = r7;
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0216, code lost:
    
        r1 = r5;
        r5 = r0;
        r0 = r1;
        r16 = r2;
        r1 = r7;
        r7 = r19;
        r8 = r3;
        r3 = r13;
        r13 = r10;
        r10 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0224, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0226, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0227, code lost:
    
        r20 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x022b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x022c, code lost:
    
        r19 = r7;
        r3 = r8;
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0232, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0233, code lost:
    
        r19 = r7;
        r3 = r8;
        r7 = r20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x02fa -> B:93:0x0303). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(int r27, int r28, int r29, java.lang.String r30, int r31, boolean r32, boolean r33, a.zje r34) {
        /*
            Method dump skipped, instruction units count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z220.m(int, int, int, java.lang.String, int, boolean, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:38|100|39|110|40|41|106|42|43|104|44|(1:47)|33|91) */
    /* JADX WARN: Can't wrap try/catch for region: R(4:(3:(1:(2:14|93)(2:15|16))(2:17|113)|67|(14:38|100|39|110|40|41|106|42|43|104|44|(1:47)|33|91)(1:(2:97|98)(1:99)))(4:18|108|19|20)|102|48|49) */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:47:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x023f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x0241  */
    /* JADX WARN: Code duplicated, block: B:68:0x0253  */
    /* JADX WARN: Code duplicated, block: B:70:0x025c  */
    /* JADX WARN: Code duplicated, block: B:71:0x025e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0263  */
    /* JADX WARN: Code duplicated, block: B:76:0x028e  */
    /* JADX WARN: Code duplicated, block: B:77:0x0291  */
    /* JADX WARN: Code duplicated, block: B:79:0x029f  */
    /* JADX WARN: Code duplicated, block: B:7:0x0025  */
    /* JADX WARN: Code duplicated, block: B:81:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:83:0x02be  */
    /* JADX WARN: Code duplicated, block: B:85:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:86:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:89:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:92:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:94:0x030a  */
    /* JADX WARN: Code duplicated, block: B:95:0x031a  */
    /* JADX WARN: Code duplicated, block: B:96:0x032a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x032c  */
    /* JADX WARN: Code duplicated, block: B:99:0x0334  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0188, code lost:
    
        if (r0 == r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0204, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0205, code lost:
    
        r1 = r5;
        r5 = r0;
        r0 = r1;
        r22 = r16;
        r16 = r2;
        r1 = r8;
        r9 = r3;
        r3 = r11;
        r11 = r4;
        r4 = r22;
        r8 = r7;
        r7 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0216, code lost:
    
        r1 = r5;
        r5 = r0;
        r0 = r1;
        r16 = r2;
        r1 = r7;
        r7 = r19;
        r8 = r3;
        r3 = r13;
        r13 = r10;
        r10 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0224, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0226, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0227, code lost:
    
        r20 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x022b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x022c, code lost:
    
        r19 = r7;
        r3 = r8;
        r7 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0232, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0233, code lost:
    
        r19 = r7;
        r3 = r8;
        r7 = r20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x02fa -> B:93:0x0303). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object n(int r27, int r28, int r29, java.lang.String r30, int r31, boolean r32, boolean r33, a.zje r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z220.n(int, int, int, java.lang.String, int, boolean, boolean, a.zje):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:90|25|(3:84|27|(1:93))|82|32|33|34|88|35|(1:38)|74) */
    /* JADX WARN: Can't wrap try/catch for region: R(3:84|27|(1:93)) */
    /* JADX WARN: Code duplicated, block: B:38:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x0126  */
    /* JADX WARN: Code duplicated, block: B:53:0x0132  */
    /* JADX WARN: Code duplicated, block: B:55:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x0139  */
    /* JADX WARN: Code duplicated, block: B:59:0x013f  */
    /* JADX WARN: Code duplicated, block: B:63:0x015b  */
    /* JADX WARN: Code duplicated, block: B:64:0x0163  */
    /* JADX WARN: Code duplicated, block: B:66:0x016a  */
    /* JADX WARN: Code duplicated, block: B:68:0x016f  */
    /* JADX WARN: Code duplicated, block: B:69:0x0171  */
    /* JADX WARN: Code duplicated, block: B:72:0x0177  */
    /* JADX WARN: Code duplicated, block: B:75:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x019a  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:84:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:90:0x00af A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00c6, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c7, code lost:
    
        r6 = r4;
        r4 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0109, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x010b, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010c, code lost:
    
        r18 = r2;
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0110, code lost:
    
        r4 = r0;
        r6 = r17;
        r2 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0116, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0117, code lost:
    
        r17 = r4;
        r4 = r0;
        r6 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0154, code lost:
    
        if (a.qcc.P(r13, r8) == r7) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x018c, code lost:
    
        if (a.qcc.P(r13, r8) == r7) goto L74;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x0154 -> B:17:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x015b -> B:62:0x0157). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:73:0x018c -> B:17:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x018f -> B:24:0x00ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object o(org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams r23, a.zje r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z220.o(org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(zje zjeVar) {
        nsh0 nsh0Var;
        if (zjeVar instanceof nsh0) {
            nsh0Var = (nsh0) zjeVar;
            int i = nsh0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                nsh0Var.k = i - Integer.MIN_VALUE;
            } else {
                nsh0Var = new nsh0(this, zjeVar);
            }
        } else {
            nsh0Var = new nsh0(this, zjeVar);
        }
        Object objB = nsh0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = nsh0Var.k;
        if (i2 == 0) {
            z1x.P(objB);
            msh0 msh0Var = (msh0) this.c;
            String strA = ((btt0) this.e).a();
            String strA2 = ((knf0) this.d).a();
            nsh0Var.k = 1;
            objB = msh0Var.a().b(strA, strA2, new rx5(), nsh0Var);
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
        String str = ((pzc0) ((q16) objB).a()).b;
        return str == null ? "" : str;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:96|26|27|88|28|92|29|30|90|31|(2:33|79)(1:34)) */
    /* JADX WARN: Can't wrap try/catch for region: R(8:0|2|(2:4|(1:6)(1:7))(1:7)|8|(1:(3:(1:(1:13)(2:14|15))(2:16|17)|66|(11:96|26|27|88|28|92|29|30|90|31|(2:33|79)(1:34))(2:83|(2:85|86)(1:87)))(4:18|94|19|20))(2:24|(11:96|26|27|88|28|92|29|30|90|31|(2:33|79)(1:34))(2:83|(2:85|86)(1:87)))|98|35|36) */
    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0123  */
    /* JADX WARN: Code duplicated, block: B:34:0x0126  */
    /* JADX WARN: Code duplicated, block: B:52:0x0168 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:53:0x016a  */
    /* JADX WARN: Code duplicated, block: B:56:0x0176  */
    /* JADX WARN: Code duplicated, block: B:58:0x017e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0181  */
    /* JADX WARN: Code duplicated, block: B:62:0x0186  */
    /* JADX WARN: Code duplicated, block: B:65:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:67:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:77:0x01da  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x0201  */
    /* JADX WARN: Code duplicated, block: B:82:0x0209  */
    /* JADX WARN: Code duplicated, block: B:83:0x0210  */
    /* JADX WARN: Code duplicated, block: B:85:0x0214  */
    /* JADX WARN: Code duplicated, block: B:87:0x021a  */
    /* JADX WARN: Code duplicated, block: B:96:0x00ec A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x013b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x013c, code lost:
    
        r6 = r0;
        r0 = r5;
        r5 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0144, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0146, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0147, code lost:
    
        r18 = 1;
        r16 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x014b, code lost:
    
        r6 = r0;
        r8 = r16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x014f, code lost:
    
        r13 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0152, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0153, code lost:
    
        r18 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0157, code lost:
    
        r6 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x015a, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x015b, code lost:
    
        r17 = r6;
        r18 = 1;
     */
    /* JADX WARN: Path cross not found for [B:52:0x0168, B:69:0x01c4], limit reached: 101 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0091 -> B:66:0x01ad). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object q(org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams r22, int r23, int r24, int r25, a.j6i0 r26, a.zje r27) {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z220.q(org.xplatform.statistic.rating.api.di.RatingStatisticScreenParams, int, int, int, a.j6i0, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object r(int i, int i2, zje zjeVar) {
        koe0 koe0Var;
        cge0 cge0Var;
        if (zjeVar instanceof koe0) {
            koe0Var = (koe0) zjeVar;
            int i3 = koe0Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                koe0Var.l = i3 - Integer.MIN_VALUE;
            } else {
                koe0Var = new koe0(this, zjeVar);
            }
        } else {
            koe0Var = new koe0(this, zjeVar);
        }
        Object obj = koe0Var.j;
        wne wneVar = wne.f39444a;
        int i4 = koe0Var.l;
        if (i4 == 0) {
            z1x.P(obj);
            cge0 cge0Var2 = (cge0) this.d;
            jw20 jw20Var = (jw20) this.c;
            String strA = ((btt0) this.e).a();
            koe0Var.i = cge0Var2;
            koe0Var.l = 1;
            Object objA = ((boe0) ((rta0) jw20Var.b).invoke()).a(strA, new Integer(i), new Integer(i2), koe0Var);
            if (objA == wneVar) {
                return wneVar;
            }
            obj = objA;
            cge0Var = cge0Var2;
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cge0Var = koe0Var.i;
            z1x.P(obj);
        }
        nne0 nne0Var = (nne0) ((dx5) obj).a();
        cge0Var.getClass();
        Double d = nne0Var.f23817a;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d2 = nne0Var.b;
        double dDoubleValue2 = d2 != null ? d2.doubleValue() : 0.0d;
        Double d3 = nne0Var.c;
        double dDoubleValue3 = d3 != null ? d3.doubleValue() : 0.0d;
        String str = nne0Var.d;
        String str2 = str == null ? "" : str;
        List<cpe0> list = nne0Var.e;
        if (list == null) {
            jf4.k(null);
            return null;
        }
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (cpe0 cpe0Var : list) {
            String str3 = cpe0Var.f4741a;
            String str4 = str3 == null ? "" : str3;
            String str5 = cpe0Var.b;
            String str6 = str5 == null ? "" : str5;
            String str7 = cpe0Var.c;
            String str8 = str7 == null ? "" : str7;
            Double d4 = cpe0Var.d;
            double dDoubleValue4 = d4 != null ? d4.doubleValue() : 0.0d;
            Integer num = cpe0Var.e;
            int iIntValue = num != null ? num.intValue() : 0;
            Integer num2 = cpe0Var.f;
            arrayList.add(new ReferralUser(str4, str6, str8, dDoubleValue4, iIntValue, num2 != null && num2.intValue() == 1));
        }
        return new ReferralNetworkInfo(dDoubleValue, dDoubleValue2, dDoubleValue3, str2, arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public Object s(boolean z, zje zjeVar) {
        osh0 osh0Var;
        Object value;
        urh0 urh0Var;
        Boolean bool;
        urh0 urh0Var2;
        Boolean bool2;
        urh0 urh0Var3;
        Boolean bool3;
        urh0 urh0Var4;
        Boolean bool4;
        urh0 urh0Var5;
        Boolean bool5;
        urh0 urh0Var6;
        Boolean bool6;
        knf0 knf0Var = (knf0) this.d;
        esh0 esh0Var = (esh0) this.b;
        if (zjeVar instanceof osh0) {
            osh0Var = (osh0) zjeVar;
            int i = osh0Var.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                osh0Var.k = i - Integer.MIN_VALUE;
            } else {
                osh0Var = new osh0(this, zjeVar);
            }
        } else {
            osh0Var = new osh0(this, zjeVar);
        }
        Object objC = osh0Var.i;
        wne wneVar = wne.f39444a;
        int i2 = osh0Var.k;
        if (i2 == 0) {
            z1x.P(objC);
            wrh0 wrh0Var = esh0Var.d;
            if (!z && wrh0Var != null) {
                return wrh0Var;
            }
            msh0 msh0Var = (msh0) this.c;
            String strA = ((btt0) this.e).a();
            String strA2 = knf0Var.a();
            String strC = knf0Var.c();
            osh0Var.k = 1;
            objC = msh0Var.a().c(strA, strA2, strC, osh0Var);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objC);
        }
        vrh0 vrh0Var = (vrh0) ((q16) objC).a();
        Integer num = vrh0Var.b;
        int iIntValue = num != null ? num.intValue() : 0;
        Integer num2 = vrh0Var.c;
        int iIntValue2 = num2 != null ? num2.intValue() : 0;
        Integer num3 = vrh0Var.f;
        int iIntValue3 = num3 != null ? num3.intValue() : 0;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        rrh0 rrh0Var = vrh0Var.h;
        if (rrh0Var != null && (urh0Var6 = rrh0Var.f30984a) != null && (bool6 = urh0Var6.b) != null) {
        }
        if (rrh0Var != null && (urh0Var5 = rrh0Var.b) != null && (bool5 = urh0Var5.b) != null) {
        }
        if (rrh0Var != null && (urh0Var4 = rrh0Var.c) != null && (bool4 = urh0Var4.b) != null) {
        }
        if (rrh0Var != null && (urh0Var3 = rrh0Var.d) != null && (bool3 = urh0Var3.b) != null) {
        }
        if (rrh0Var != null && (urh0Var2 = rrh0Var.e) != null && (bool2 = urh0Var2.b) != null) {
        }
        if (rrh0Var != null && (urh0Var = rrh0Var.f) != null && (bool = urh0Var.b) != null) {
        }
        Map mapN = xp20.n(linkedHashMap);
        Boolean bool7 = vrh0Var.i;
        boolean zBooleanValue = bool7 != null ? bool7.booleanValue() : false;
        String str = vrh0Var.l;
        if (str == null) {
            str = "";
        }
        wrh0 wrh0Var2 = new wrh0(iIntValue, iIntValue2, iIntValue3, mapN, zBooleanValue, str);
        mrh0.f22272a.getClass();
        mrh0 mrh0VarI = cge0.i(iIntValue3);
        esh0Var.getClass();
        esh0Var.b = mrh0VarI;
        p7m0 p7m0Var = esh0Var.c;
        do {
            value = p7m0Var.getValue();
        } while (!p7m0Var.m(value, mrh0VarI));
        esh0Var.d = wrh0Var2;
        return wrh0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Enum t(boolean z, zje zjeVar) {
        psh0 psh0Var;
        cge0 cge0Var;
        cge0 cge0Var2;
        if (zjeVar instanceof psh0) {
            psh0Var = (psh0) zjeVar;
            int i = psh0Var.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                psh0Var.m = i - Integer.MIN_VALUE;
            } else {
                psh0Var = new psh0(this, zjeVar);
            }
        } else {
            psh0Var = new psh0(this, zjeVar);
        }
        Object objS = psh0Var.k;
        wne wneVar = wne.f39444a;
        int i2 = psh0Var.m;
        if (i2 != 0) {
            if (i2 == 1) {
                cge0Var2 = psh0Var.i;
                z1x.P(objS);
                int i3 = ((wrh0) objS).c;
                cge0Var2.getClass();
                return cge0.i(i3);
            }
            if (i2 != 2) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            cge0Var = psh0Var.j;
            z1x.P(objS);
            int i4 = ((wrh0) objS).c;
            cge0Var.getClass();
            return cge0.i(i4);
        }
        z1x.P(objS);
        if (z) {
            cge0 cge0Var3 = mrh0.f22272a;
            psh0Var.i = cge0Var3;
            psh0Var.m = 1;
            objS = s(true, psh0Var);
            if (objS != wneVar) {
                cge0Var2 = cge0Var3;
                int i5 = ((wrh0) objS).c;
                cge0Var2.getClass();
                return cge0.i(i5);
            }
        } else {
            mrh0 mrh0Var = ((esh0) this.b).b;
            if (mrh0Var != mrh0.b) {
                return mrh0Var;
            }
            cge0 cge0Var4 = mrh0.f22272a;
            psh0Var.i = null;
            psh0Var.j = cge0Var4;
            psh0Var.m = 2;
            objS = s(false, psh0Var);
            if (objS != wneVar) {
                cge0Var = cge0Var4;
                int i6 = ((wrh0) objS).c;
                cge0Var.getClass();
                return cge0.i(i6);
            }
        }
        return wneVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:94|33|92|34|35|36|(1:39)|73) */
    /* JADX WARN: Code duplicated, block: B:39:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:48:0x0109 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x010b A[Catch: all -> 0x004c, TryCatch #3 {all -> 0x004c, blocks: (B:14:0x0042, B:41:0x00f5, B:46:0x0103, B:49:0x010b, B:50:0x0114, B:54:0x011e, B:56:0x0122, B:61:0x0142, B:63:0x014d, B:65:0x0154, B:69:0x015e, B:71:0x0162, B:75:0x0180, B:77:0x018b, B:79:0x0193, B:80:0x019a, B:81:0x019b, B:21:0x0065, B:30:0x00a2), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0114 A[Catch: all -> 0x004c, TryCatch #3 {all -> 0x004c, blocks: (B:14:0x0042, B:41:0x00f5, B:46:0x0103, B:49:0x010b, B:50:0x0114, B:54:0x011e, B:56:0x0122, B:61:0x0142, B:63:0x014d, B:65:0x0154, B:69:0x015e, B:71:0x0162, B:75:0x0180, B:77:0x018b, B:79:0x0193, B:80:0x019a, B:81:0x019b, B:21:0x0065, B:30:0x00a2), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:52:0x011b  */
    /* JADX WARN: Code duplicated, block: B:53:0x011d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0122 A[Catch: all -> 0x004c, TryCatch #3 {all -> 0x004c, blocks: (B:14:0x0042, B:41:0x00f5, B:46:0x0103, B:49:0x010b, B:50:0x0114, B:54:0x011e, B:56:0x0122, B:61:0x0142, B:63:0x014d, B:65:0x0154, B:69:0x015e, B:71:0x0162, B:75:0x0180, B:77:0x018b, B:79:0x0193, B:80:0x019a, B:81:0x019b, B:21:0x0065, B:30:0x00a2), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:58:0x013d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0142 A[Catch: all -> 0x004c, TryCatch #3 {all -> 0x004c, blocks: (B:14:0x0042, B:41:0x00f5, B:46:0x0103, B:49:0x010b, B:50:0x0114, B:54:0x011e, B:56:0x0122, B:61:0x0142, B:63:0x014d, B:65:0x0154, B:69:0x015e, B:71:0x0162, B:75:0x0180, B:77:0x018b, B:79:0x0193, B:80:0x019a, B:81:0x019b, B:21:0x0065, B:30:0x00a2), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:63:0x014d A[Catch: all -> 0x004c, TryCatch #3 {all -> 0x004c, blocks: (B:14:0x0042, B:41:0x00f5, B:46:0x0103, B:49:0x010b, B:50:0x0114, B:54:0x011e, B:56:0x0122, B:61:0x0142, B:63:0x014d, B:65:0x0154, B:69:0x015e, B:71:0x0162, B:75:0x0180, B:77:0x018b, B:79:0x0193, B:80:0x019a, B:81:0x019b, B:21:0x0065, B:30:0x00a2), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0154 A[Catch: all -> 0x004c, TryCatch #3 {all -> 0x004c, blocks: (B:14:0x0042, B:41:0x00f5, B:46:0x0103, B:49:0x010b, B:50:0x0114, B:54:0x011e, B:56:0x0122, B:61:0x0142, B:63:0x014d, B:65:0x0154, B:69:0x015e, B:71:0x0162, B:75:0x0180, B:77:0x018b, B:79:0x0193, B:80:0x019a, B:81:0x019b, B:21:0x0065, B:30:0x00a2), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:67:0x015b  */
    /* JADX WARN: Code duplicated, block: B:68:0x015d  */
    /* JADX WARN: Code duplicated, block: B:71:0x0162 A[Catch: all -> 0x004c, TryCatch #3 {all -> 0x004c, blocks: (B:14:0x0042, B:41:0x00f5, B:46:0x0103, B:49:0x010b, B:50:0x0114, B:54:0x011e, B:56:0x0122, B:61:0x0142, B:63:0x014d, B:65:0x0154, B:69:0x015e, B:71:0x0162, B:75:0x0180, B:77:0x018b, B:79:0x0193, B:80:0x019a, B:81:0x019b, B:21:0x0065, B:30:0x00a2), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:75:0x0180 A[Catch: all -> 0x004c, TryCatch #3 {all -> 0x004c, blocks: (B:14:0x0042, B:41:0x00f5, B:46:0x0103, B:49:0x010b, B:50:0x0114, B:54:0x011e, B:56:0x0122, B:61:0x0142, B:63:0x014d, B:65:0x0154, B:69:0x015e, B:71:0x0162, B:75:0x0180, B:77:0x018b, B:79:0x0193, B:80:0x019a, B:81:0x019b, B:21:0x0065, B:30:0x00a2), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0188  */
    /* JADX WARN: Code duplicated, block: B:77:0x018b A[Catch: all -> 0x004c, TryCatch #3 {all -> 0x004c, blocks: (B:14:0x0042, B:41:0x00f5, B:46:0x0103, B:49:0x010b, B:50:0x0114, B:54:0x011e, B:56:0x0122, B:61:0x0142, B:63:0x014d, B:65:0x0154, B:69:0x015e, B:71:0x0162, B:75:0x0180, B:77:0x018b, B:79:0x0193, B:80:0x019a, B:81:0x019b, B:21:0x0065, B:30:0x00a2), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0191 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x0193 A[Catch: all -> 0x004c, TryCatch #3 {all -> 0x004c, blocks: (B:14:0x0042, B:41:0x00f5, B:46:0x0103, B:49:0x010b, B:50:0x0114, B:54:0x011e, B:56:0x0122, B:61:0x0142, B:63:0x014d, B:65:0x0154, B:69:0x015e, B:71:0x0162, B:75:0x0180, B:77:0x018b, B:79:0x0193, B:80:0x019a, B:81:0x019b, B:21:0x0065, B:30:0x00a2), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x019b A[Catch: all -> 0x004c, TRY_LEAVE, TryCatch #3 {all -> 0x004c, blocks: (B:14:0x0042, B:41:0x00f5, B:46:0x0103, B:49:0x010b, B:50:0x0114, B:54:0x011e, B:56:0x0122, B:61:0x0142, B:63:0x014d, B:65:0x0154, B:69:0x015e, B:71:0x0162, B:75:0x0180, B:77:0x018b, B:79:0x0193, B:80:0x019a, B:81:0x019b, B:21:0x0065, B:30:0x00a2), top: B:98:0x002a }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:94:0x00b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f9, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
    
        r18 = r9;
        r9 = r0;
        r0 = r18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0100, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x010b -> B:32:0x00b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x018b -> B:74:0x017e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object u(a.zje r22) {
        /*
            Method dump skipped, instruction units count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z220.u(a.zje):java.lang.Object");
    }

    public Object v(zje zjeVar) {
        return qjj.d0(((mne) this.e).b, new zwn0(this, null, (byte) 1), zjeVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:(1:(4:(1:(2:14|78)(2:15|16))(1:17)|79|80|(1:29)(1:(2:97|98)(1:99)))(4:18|102|19|20))(1:23)|100|32|(7:35|(2:36|(6:38|39|104|40|(4:45|(1:47)(1:50)|51|(2:109|53)(1:112))|54)(2:108|57))|58|(1:60)(1:61)|62|63|33)|107|64) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:38|39|104|40|(4:45|(1:47)(1:50)|51|(2:109|53)(1:112))|54) */
    /* JADX WARN: Code duplicated, block: B:29:0x010a A[Catch: all -> 0x00a3, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x00a3, blocks: (B:29:0x010a, B:19:0x009d), top: B:102:0x009d }] */
    /* JADX WARN: Code duplicated, block: B:67:0x01ca A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:69:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01df  */
    /* JADX WARN: Code duplicated, block: B:75:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0209  */
    /* JADX WARN: Code duplicated, block: B:83:0x0213  */
    /* JADX WARN: Code duplicated, block: B:85:0x021a  */
    /* JADX WARN: Code duplicated, block: B:87:0x021f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0221  */
    /* JADX WARN: Code duplicated, block: B:91:0x0226  */
    /* JADX WARN: Code duplicated, block: B:94:0x0245  */
    /* JADX WARN: Code duplicated, block: B:95:0x024c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0252 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0254  */
    /* JADX WARN: Code duplicated, block: B:99:0x025a  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00f6, code lost:
    
        if (r5 == r4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0134, code lost:
    
        if (r0 == r4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x018d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x018e, code lost:
    
        r2 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a0, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0200, code lost:
    
        if (a.qcc.P(r6, r3) == r4) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0242, code lost:
    
        if (a.qcc.P(r6, r3) == r4) goto L93;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x01cc -> B:28:0x0108). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x0200 -> B:78:0x0203). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:92:0x0242 -> B:78:0x0203). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:95:0x024c -> B:79:0x0204). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable w(a.zje r24, java.lang.String r25, java.util.List r26) {
        /*
            Method dump skipped, instruction units count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z220.w(a.zje, java.lang.String, java.util.List):java.io.Serializable");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:69|24|(1:27)|60) */
    /* JADX WARN: Code duplicated, block: B:27:0x013c  */
    /* JADX WARN: Code duplicated, block: B:35:0x015c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x015e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0167  */
    /* JADX WARN: Code duplicated, block: B:39:0x016e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0170  */
    /* JADX WARN: Code duplicated, block: B:43:0x0175  */
    /* JADX WARN: Code duplicated, block: B:48:0x0198  */
    /* JADX WARN: Code duplicated, block: B:49:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:50:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:54:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:62:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:65:0x01e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:69:0x0111 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x014e, code lost:
    
        r17 = r8;
        r8 = r0;
        r0 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0154, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x015e -> B:23:0x010f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x01e1 -> B:47:0x0195). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(java.util.Set r20, a.jvn r21, int r22, java.lang.String r23, a.zje r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.z220.x(java.util.Set, a.jvn, int, java.lang.String, a.zje):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Serializable y(long j, m97 m97Var, boolean z, double d, int i, zfa0 zfa0Var, gwe gweVar, int i2, zje zjeVar) throws zhi0, UnknownHostException {
        qa20 qa20Var;
        long j2;
        if (zjeVar instanceof qa20) {
            qa20Var = (qa20) zjeVar;
            int i3 = qa20Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qa20Var.l = i3 - Integer.MIN_VALUE;
            } else {
                qa20Var = new qa20(this, zjeVar);
            }
        } else {
            qa20Var = new qa20(this, zjeVar);
        }
        Object objB = qa20Var.j;
        wne wneVar = wne.f39444a;
        int i4 = qa20Var.l;
        if (i4 == 0) {
            z1x.P(objB);
            g320 g320Var = (g320) this.b;
            long jA = ((x1u) this.c).a();
            pn40 pn40Var = pn40.f27267a;
            String strC = pn40.c(d, p3u0.c);
            List listC = kotlin.collections.a.c(xia0.d0(m97.a(m97Var, null, false, 0L, 0.0d, null, null, null, zfa0Var, 0.0d, null, 62914559), gweVar.f12022a));
            q4f q4fVar = q4f.c;
            int iA = q4fVar.a();
            iun iunVar = iun.f15405a;
            j2 = j;
            ouj0 ouj0Var = new ouj0(jA, j2, strC, false, listC, iA, i, false, iunVar, iunVar, 0L, i2, false, z, null, null, null, "", q4fVar, false, true, null, null, 0.0d, null);
            byte b = ((pru) this.e).a().I1.f26017a;
            qa20Var.i = j2;
            qa20Var.l = 1;
            objB = g320Var.b(ouj0Var, 0L, b, qa20Var);
            if (objB == wneVar) {
                return wneVar;
            }
        } else {
            if (i4 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = qa20Var.i;
            z1x.P(objB);
            j2 = j3;
        }
        pa20 pa20Var = (pa20) objB;
        pa20Var.getClass();
        if (pa20Var instanceof na20) {
            na20 na20Var = (na20) pa20Var;
            String str = na20Var.c;
            i2o i2oVar = na20Var.b;
            if (ai7.f910a[i2oVar.ordinal()] == 1) {
                throw new UnknownHostException(str);
            }
            throw new zhi0(str, i2oVar, (Integer) null, 12);
        }
        if (!(pa20Var instanceof oa20)) {
            t9f.b();
            return null;
        }
        oa20 oa20Var = (oa20) pa20Var;
        double d2 = oa20Var.b;
        hg7 hg7Var = hg7.f13004a;
        String str2 = oa20Var.f24910a;
        double d3 = oa20Var.f;
        String str3 = oa20Var.g;
        double d4 = oa20Var.j;
        q4f q4fVar2 = oa20Var.k;
        ru6 ru6Var = (ru6) CollectionsKt.firstOrNull(oa20Var.l);
        zh7 zh7Var = new zh7(d2, str2, d3, str3, d4, q4fVar2, ru6Var != null ? ru6Var.l : null);
        ((ilt0) this.d).a(d2, j2);
        return zh7Var;
    }

    public Object z(int i, long j, bnn0 bnn0Var, String str) {
        sff0 sff0VarA = ((pru) this.e).a();
        j910 j910Var = (j910) this.b;
        return ((dn0) j910Var.b).r(j, str, i, ((ntu) this.c).a(), ((iqt) this.d).f15225a.a(), ((j1q0) j910Var.c).f15748a.a(), sff0VarA.b.N, bnn0Var);
    }

    public z220(wsf0 wsf0Var, eyg0 eyg0Var, rmd0 rmd0Var, roi0 roi0Var) {
        this.f43651a = (byte) 0;
        rmd0Var.getClass();
        this.b = wsf0Var;
        this.c = eyg0Var;
        this.d = rmd0Var;
        this.e = roi0Var;
    }

    public z220(mne mneVar, g090 g090Var, ygm0 ygm0Var, knf0 knf0Var) {
        this.f43651a = (byte) 26;
        ygm0Var.getClass();
        knf0Var.getClass();
        this.b = mneVar;
        this.c = g090Var;
        this.d = ygm0Var;
        this.e = knf0Var;
    }

    public z220(mne mneVar, knf0 knf0Var, nv20 nv20Var, x2c0 x2c0Var) {
        this.f43651a = (byte) 10;
        knf0Var.getClass();
        x2c0Var.getClass();
        this.b = mneVar;
        this.c = knf0Var;
        this.d = nv20Var;
        this.e = x2c0Var;
    }

    public z220(nw20 nw20Var, ugf0 ugf0Var, knf0 knf0Var, vby vbyVar) {
        this.f43651a = (byte) 24;
        knf0Var.getClass();
        vbyVar.getClass();
        this.b = nw20Var;
        this.c = ugf0Var;
        this.d = knf0Var;
        this.e = vbyVar;
    }

    public z220(ioe0 ioe0Var, jw20 jw20Var, cge0 cge0Var, btt0 btt0Var) {
        this.f43651a = (byte) 15;
        ioe0Var.getClass();
        btt0Var.getClass();
        this.b = ioe0Var;
        this.c = jw20Var;
        this.d = cge0Var;
        this.e = btt0Var;
    }

    public z220(trm0 trm0Var, mne mneVar, knf0 knf0Var, kuy kuyVar) {
        this.f43651a = (byte) 29;
        knf0Var.getClass();
        kuyVar.getClass();
        this.b = trm0Var;
        this.c = mneVar;
        this.d = knf0Var;
        this.e = kuyVar;
    }

    public z220(mne mneVar, g090 g090Var, eja0 eja0Var, knf0 knf0Var) {
        this.f43651a = (byte) 9;
        eja0Var.getClass();
        knf0Var.getClass();
        this.b = mneVar;
        this.c = g090Var;
        this.d = eja0Var;
        this.e = knf0Var;
    }

    public z220(xr xrVar, kd30 kd30Var, kud kudVar, lk5 lk5Var, zx10 zx10Var) {
        this.f43651a = (byte) 4;
        this.b = xrVar;
        this.c = kd30Var;
        this.d = lk5Var;
        this.e = zx10Var;
    }

    public z220(pyu pyuVar, vb40 vb40Var, sjh sjhVar, knf0 knf0Var) {
        this.f43651a = (byte) 2;
        vb40Var.getClass();
        knf0Var.getClass();
        this.b = pyuVar;
        this.c = vb40Var;
        this.d = sjhVar;
        this.e = knf0Var;
    }

    public z220(kd30 kd30Var, k7g0 k7g0Var, knf0 knf0Var, mne mneVar) {
        this.f43651a = (byte) 17;
        k7g0Var.getClass();
        knf0Var.getClass();
        this.b = kd30Var;
        this.c = k7g0Var;
        this.d = knf0Var;
        this.e = mneVar;
    }

    public z220(esh0 esh0Var, msh0 msh0Var, knf0 knf0Var, btt0 btt0Var) {
        this.f43651a = (byte) 21;
        esh0Var.getClass();
        knf0Var.getClass();
        btt0Var.getClass();
        this.b = esh0Var;
        this.c = msh0Var;
        this.d = knf0Var;
        this.e = btt0Var;
    }

    public z220(zn00 zn00Var, r7e0 r7e0Var, knf0 knf0Var, mne mneVar) {
        this.f43651a = (byte) 14;
        r7e0Var.getClass();
        knf0Var.getClass();
        this.b = zn00Var;
        this.c = r7e0Var;
        this.d = knf0Var;
        this.e = mneVar;
    }

    public z220(knf0 knf0Var, gii0 gii0Var, btt0 btt0Var) {
        this.f43651a = (byte) 13;
        btt0Var.getClass();
        gii0Var.getClass();
        knf0Var.getClass();
        this.b = btt0Var;
        this.c = gii0Var;
        this.d = knf0Var;
        this.e = maz.a(wez.b, new p7d0(this, (byte) 4));
    }

    public z220(vne vneVar, e3j e3jVar, zuh zuhVar, b1f b1fVar) {
        this.f43651a = (byte) 23;
        this.b = vneVar;
        this.c = b1fVar;
        this.d = vtb.d(Integer.MAX_VALUE, null, null, 6);
        this.e = new ok50((byte) 11);
        bby bbyVar = (bby) vneVar.getCoroutineContext().get(gqw0.o1);
        if (bbyVar != null) {
            bbyVar.invokeOnCompletion(new nej0((Object) e3jVar, (Object) this, (Object) zuhVar, (byte) 4));
        }
    }

    public z220(afm0 afm0Var, knf0 knf0Var, yvn0 yvn0Var, mne mneVar) {
        this.f43651a = (byte) 28;
        knf0Var.getClass();
        yvn0Var.getClass();
        this.b = afm0Var;
        this.c = knf0Var;
        this.d = yvn0Var;
        this.e = mneVar;
    }

    public /* synthetic */ z220(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f43651a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public z220(jbj jbjVar, mbj mbjVar, lq80 lq80Var) {
        this.f43651a = (byte) 7;
        this.b = jbjVar;
        this.c = mbjVar;
        this.d = lq80Var;
    }

    public z220(byte b) {
        this.f43651a = b;
        switch (b) {
            case 8:
                this.b = new fq80();
                this.c = new fq80();
                this.d = new bl90();
                break;
            default:
                this.b = new ArrayList();
                this.c = new ArrayList();
                this.d = new ArrayList();
                this.e = yxk.p;
                break;
        }
    }

    public z220(Context context, ActionMode.Callback callback) {
        this.f43651a = (byte) 27;
        this.c = context;
        this.b = callback;
        this.d = new ArrayList();
        this.e = new nuj0(0);
    }

    public z220(dcs0 dcs0Var, boolean[] zArr) {
        this.f43651a = (byte) 12;
        this.b = dcs0Var;
        this.c = zArr;
        int i = dcs0Var.f5860a;
        this.d = new boolean[i];
        this.e = new boolean[i];
    }
}
