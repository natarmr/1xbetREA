package a;

import android.content.Context;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.impl.WorkDatabase_Impl;
import com.huawei.hms.adapter.internal.AvailableCode;
import java.io.File;
import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xbet.client1.R;

/* JADX INFO: loaded from: classes3.dex */
public final class ieu implements r4x, hih0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f14653a;
    public Object b;
    public Object c;

    public ieu(byte b) {
        this.f14653a = b;
        switch (b) {
            case 23:
                lxs0 lxs0Var = hp4.j;
                Float fValueOf = Float.valueOf(0.0f);
                this.c = new l73(lxs0Var, fValueOf, (t73) lxs0Var.f20832a.invoke(fValueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                break;
            case 24:
                this.b = new ConcurrentHashMap();
                break;
            default:
                this.b = new Object();
                this.c = new ArrayList();
                break;
        }
    }

    public static Object n(ieu ieuVar, boolean z, bnn0 bnn0Var) {
        bm5 bm5Var = bm5.f2822a;
        return z ? ((iqi) ieuVar.c).f(bm5Var, bnn0Var) : ((ahu) ieuVar.b).b(bm5Var, bnn0Var);
    }

    @Override // a.r4x
    public void G(int i, hzj hzjVar, b0a b0aVar) {
        hzjVar.getClass();
        synchronized (this.b) {
            ((ArrayList) this.c).add(new s4x(i, hzjVar, b0aVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public Object a(long j, long j2, are areVar, boolean z, List list, zje zjeVar) {
        d3z d3zVar;
        if (zjeVar instanceof d3z) {
            d3zVar = (d3z) zjeVar;
            int i = d3zVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                d3zVar.k = i - Integer.MIN_VALUE;
            } else {
                d3zVar = new d3z(this, zjeVar);
            }
        } else {
            d3zVar = new d3z(this, zjeVar);
        }
        Object objJ = d3zVar.i;
        wne wneVar = wne.f39444a;
        int i2 = d3zVar.k;
        if (i2 == 0) {
            z1x.P(objJ);
            f3z f3zVar = new f3z(j, j2, null, areVar, this, list, z);
            d3zVar.k = 1;
            objJ = d5c.J(d3zVar, f3zVar);
            if (objJ == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objJ);
        }
        return ((j0g0) objJ).f15681a;
    }

    public long b() {
        es00 es00Var = (es00) this.c;
        Long l = es00Var.c;
        if (l != null) {
            return l.longValue();
        }
        Long l2 = (Long) CollectionsKt.f0(es00Var.b.d());
        if (l2 != null) {
            return l2.longValue();
        }
        return 0L;
    }

    public View c(RecyclerView recyclerView, int i) {
        String strJ;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        u710 u710Var = (u710) this.c;
        d6e d6eVar = (d6e) this.b;
        long jC = i != -1 ? d6eVar.C(i) : -1L;
        View view = (View) u710Var.b(jC);
        if (view != null) {
            return view;
        }
        View viewInflate = LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.viewholder_header_messages_date, (ViewGroup) recyclerView, false);
        TextView textView = (TextView) yum0.f(viewInflate, R.id.txtDate);
        if (textView == null) {
            hny.u("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(R.id.txtDate)));
            return null;
        }
        lrv lrvVar = new lrv(new bdu0((FrameLayout) viewInflate, textView, (byte) 9));
        long jC2 = d6eVar.C(i);
        TextView textView2 = lrvVar.u.c;
        Context context = textView2.getContext();
        context.getClass();
        if (DateUtils.isToday(jC2)) {
            strJ = context.getString(R.string.today);
            strJ.getClass();
        } else if (DateUtils.isToday(86400000 + jC2)) {
            strJ = context.getString(R.string.yesterday);
            strJ.getClass();
        } else {
            rdj rdjVar = rdj.f30294a;
            ynq0 ynq0Var = new ynq0(jC2);
            krv krvVar = krv.f18786a;
            Locale locale = Locale.getDefault();
            locale.getClass();
            Locale localeM = rdj.m(locale);
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTime(new Date(jC2));
            calendar.getClass();
            strJ = rdj.j(aoq0.a(ynq0Var, ((sdj) krvVar.invoke(calendar, calendar2)).f32037a, localeM), localeM);
        }
        textView2.setText(strJ);
        View view2 = lrvVar.f40887a;
        if (view2.getLayoutParams() == null) {
            view2.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        }
        if (htz.d(recyclerView) == 1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824);
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 0);
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824);
        }
        view2.measure(ViewGroup.getChildMeasureSpec(iMakeMeasureSpec, recyclerView.getPaddingRight() + recyclerView.getPaddingLeft(), view2.getLayoutParams().width), ViewGroup.getChildMeasureSpec(iMakeMeasureSpec2, recyclerView.getPaddingBottom() + recyclerView.getPaddingTop(), view2.getLayoutParams().height));
        view2.layout(0, 0, view2.getMeasuredWidth(), view2.getMeasuredHeight());
        u710Var.f(view2, jC);
        return view2;
    }

    public p6d d(long j, mp0 mp0Var) {
        jut jutVar = (jut) this.b;
        jr0 jr0Var = jutVar.f17175a;
        byte b = 1;
        gmq gmqVarL = ulb.L(new dnq(uvw.Q(new gr0(new vsg0(new br0(jr0Var, j, jutVar.b.f15748a.a(), null, (byte) 1)), j, jr0Var), true), new hr0(j, null), b), jr0Var.d.b);
        jr0 jr0Var2 = ((xoc) this.c).f41210a;
        return new p6d(gmqVarL, ulb.L(new vsg0(new cr0(jr0Var2, j, null, (byte) 1)), jr0Var2.d.b), new opu(j, mp0Var, (yje) null), b);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable e(zje zjeVar) {
        kmu kmuVar;
        String str;
        if (zjeVar instanceof kmu) {
            kmuVar = (kmu) zjeVar;
            int i = kmuVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                kmuVar.l = i - Integer.MIN_VALUE;
            } else {
                kmuVar = new kmu(this, zjeVar);
            }
        } else {
            kmuVar = new kmu(this, zjeVar);
        }
        Object obj = kmuVar.j;
        wne wneVar = wne.f39444a;
        int i2 = kmuVar.l;
        if (i2 == 0) {
            z1x.P(obj);
            String strA = ((ntu) this.b).a();
            cdu cduVar = (cdu) this.c;
            kmuVar.i = strA;
            kmuVar.l = 1;
            Serializable serializableC = cdu.c(cduVar, 0, strA, kmuVar, 8);
            if (serializableC == wneVar) {
                return wneVar;
            }
            obj = serializableC;
            str = strA;
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = kmuVar.i;
            z1x.P(obj);
        }
        Iterable iterable = (Iterable) obj;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(new mz60((pbv) it.next(), str));
        }
        return arrayList;
    }

    public Object f(long j, zje zjeVar) {
        return qjj.d0(((mne) this.b).b, new ey((Object) this, j, (yje) null, (byte) 25), zjeVar);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public Object g(long j, Long l, Long l2, String str, boolean z, Integer num, zje zjeVar) {
        z2v z2vVar;
        nhf0 nhf0Var;
        Long l3;
        String str2;
        boolean z2;
        long j2;
        Integer num2;
        Long l4;
        Serializable serializableT;
        long j3 = j;
        if (zjeVar instanceof z2v) {
            z2vVar = (z2v) zjeVar;
            int i = z2vVar.r;
            if ((i & Integer.MIN_VALUE) != 0) {
                z2vVar.r = i - Integer.MIN_VALUE;
            } else {
                z2vVar = new z2v(this, zjeVar);
            }
        } else {
            z2vVar = new z2v(this, zjeVar);
        }
        Object obj = z2vVar.p;
        wne wneVar = wne.f39444a;
        int i2 = z2vVar.r;
        if (i2 == 0) {
            z1x.P(obj);
            nhf0Var = (nhf0) this.b;
            if (j3 == 0) {
                ahu ahuVar = (ahu) this.c;
                z2vVar.j = l;
                l3 = l2;
                z2vVar.k = l3;
                str2 = str;
                z2vVar.l = str2;
                z2vVar.m = num;
                z2vVar.n = nhf0Var;
                z2vVar.i = j3;
                z2 = z;
                z2vVar.o = z2;
                z2vVar.r = 1;
                Serializable serializableB = ahuVar.b(bm5.f2822a, z2vVar);
                if (serializableB != wneVar) {
                    num2 = num;
                    l4 = l;
                    obj = serializableB;
                }
            } else {
                l3 = l2;
                str2 = str;
                z2 = z;
                j2 = j3;
                num2 = num;
                l4 = l;
                z2vVar.j = null;
                z2vVar.k = null;
                z2vVar.l = null;
                z2vVar.m = null;
                z2vVar.n = null;
                z2vVar.i = j3;
                z2vVar.o = z2;
                z2vVar.r = 2;
                Long l5 = l3;
                String str3 = str2;
                Long l6 = l4;
                boolean z3 = z2;
                long j4 = j2;
                serializableT = nhf0Var.t(j4, l6, l5, str3, z3, num2, z2vVar);
                if (serializableT != wneVar) {
                    return serializableT;
                }
            }
            return wneVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                z1x.P(obj);
                return obj;
            }
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        boolean z4 = z2vVar.o;
        j3 = z2vVar.i;
        nhf0Var = z2vVar.n;
        num2 = z2vVar.m;
        String str4 = z2vVar.l;
        Long l7 = z2vVar.k;
        l4 = z2vVar.j;
        z1x.P(obj);
        str2 = str4;
        l3 = l7;
        z2 = z4;
        j2 = ((ql5) obj).f28916a;
        z2vVar.j = null;
        z2vVar.k = null;
        z2vVar.l = null;
        z2vVar.m = null;
        z2vVar.n = null;
        z2vVar.i = j3;
        z2vVar.o = z2;
        z2vVar.r = 2;
        Long l8 = l3;
        String str5 = str2;
        Long l9 = l4;
        boolean z5 = z2;
        long j5 = j2;
        serializableT = nhf0Var.t(j5, l9, l8, str5, z5, num2, z2vVar);
        if (serializableT != wneVar) {
            return wneVar;
        }
        return serializableT;
    }

    @Override // a.r4x
    public void h() {
        synchronized (this.b) {
            try {
                for (s4x s4xVar : (ArrayList) this.c) {
                    s4xVar.c.d(s4xVar.f31629a, null);
                    s4xVar.b.a();
                }
                ((ArrayList) this.c).clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object i(yje yjeVar) {
        j1q0 j1q0Var = (j1q0) this.c;
        return ((pmi) this.b).r(j1q0Var.f15748a.c(), j1q0Var.j(), yjeVar);
    }

    @Override // a.r4x
    public void j(hzj hzjVar) {
        synchronized (this.b) {
            for (s4x s4xVar : (ArrayList) this.c) {
                s4xVar.getClass();
                if (Intrinsics.d(s4xVar.b, hzjVar)) {
                    hzjVar.a();
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0078  */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    public Object k(zje zjeVar) {
        lou louVar;
        kqx kqxVar;
        sff0 sff0Var;
        switch (this.f14653a) {
            case 5:
                if (zjeVar instanceof lou) {
                    louVar = (lou) zjeVar;
                    int i = louVar.k;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        louVar.k = i - Integer.MIN_VALUE;
                    } else {
                        louVar = new lou(this, zjeVar);
                    }
                } else {
                    louVar = new lou(this, zjeVar);
                }
                Object objA = louVar.i;
                Object obj = wne.f39444a;
                int i2 = louVar.k;
                if (i2 == 0) {
                    z1x.P(objA);
                    nou nouVar = (nou) this.b;
                    louVar.k = 1;
                    objA = nouVar.a(tl5.c, louVar);
                    if (objA == obj) {
                        return obj;
                    }
                } else {
                    if (i2 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(objA);
                }
                String str = ((ql5) objA).f;
                pl5 pl5Var = (pl5) CollectionsKt.d0(((rkc0) this.c).b.d.d());
                pn40 pn40Var = pn40.f27267a;
                return pn40.d(pl5Var != null ? pl5Var.d : 0.0d, str, p3u0.c);
            default:
                if (zjeVar instanceof kqx) {
                    kqxVar = (kqx) zjeVar;
                    int i3 = kqxVar.l;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        kqxVar.l = i3 - Integer.MIN_VALUE;
                    } else {
                        kqxVar = new kqx(this, zjeVar);
                    }
                } else {
                    kqxVar = new kqx(this, zjeVar);
                }
                Object obj2 = kqxVar.j;
                wne wneVar = wne.f39444a;
                int i4 = kqxVar.l;
                if (i4 == 0) {
                    z1x.P(obj2);
                    sff0 sff0VarA = ((pru) this.b).a();
                    rou rouVar = (rou) this.c;
                    kqxVar.i = sff0VarA;
                    kqxVar.l = 1;
                    Object objA2 = rouVar.a(false, kqxVar);
                    if (objA2 == wneVar) {
                        return wneVar;
                    }
                    obj2 = objA2;
                    sff0Var = sff0VarA;
                } else {
                    if (i4 != 1) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sff0Var = kqxVar.i;
                    z1x.P(obj2);
                }
                return Boolean.valueOf(sff0Var.s0 && ((m2c0) obj2).e0 != cau0.h);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object l(sh60 sh60Var, zje zjeVar) {
        hgu hguVar;
        Date date;
        long j;
        Object g0g0Var;
        Long lT0;
        if (zjeVar instanceof hgu) {
            hguVar = (hgu) zjeVar;
            int i = hguVar.m;
            if ((i & Integer.MIN_VALUE) != 0) {
                hguVar.m = i - Integer.MIN_VALUE;
            } else {
                hguVar = new hgu(this, zjeVar);
            }
        } else {
            hguVar = new hgu(this, zjeVar);
        }
        Object objA = hguVar.k;
        wne wneVar = wne.f39444a;
        int i2 = hguVar.m;
        long jE = 0;
        boolean z = false;
        if (i2 == 0) {
            z1x.P(objA);
            sh60Var.getClass();
            dfj dfjVar = dfj.UNIQUE_4;
            TimeZone timeZone = TimeZone.getTimeZone("UTC");
            timeZone.getClass();
            Locale locale = Locale.ENGLISH;
            locale.getClass();
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale);
                simpleDateFormat.setTimeZone(timeZone);
                date = simpleDateFormat.parse("2026-10-31T21:01:00Z");
                Objects.requireNonNull(date);
            } catch (ParseException e) {
                e.printStackTrace();
                date = null;
            }
            long time = date != null ? date.getTime() : 0L;
            try {
                e0g0 e0g0Var = j0g0.b;
                rou rouVar = (rou) this.c;
                hguVar.i = sh60Var;
                hguVar.j = time;
                hguVar.m = 1;
                objA = rouVar.a(false, hguVar);
                if (objA == wneVar) {
                    return wneVar;
                }
                j = time;
            } catch (Throwable th) {
                th = th;
                j = time;
                e0g0 e0g0Var2 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j = hguVar.j;
            sh60Var = hguVar.i;
            try {
                z1x.P(objA);
            } catch (Throwable th2) {
                th = th2;
                e0g0 e0g0Var3 = j0g0.b;
                g0g0Var = new g0g0(th);
            }
        }
        g0g0Var = (m2c0) objA;
        e0g0 e0g0Var4 = j0g0.b;
        m2c0 m2c0Var = (m2c0) (g0g0Var instanceof g0g0 ? null : g0g0Var);
        if (m2c0Var != null && (lT0 = StringsKt.t0(m2c0Var.j)) != null) {
            long jLongValue = lT0.longValue();
            uen uenVar = wen.b;
            jE = wen.e(ibc.w0(jLongValue, bfn.SECONDS));
        }
        ggu gguVar = (ggu) this.b;
        sh60Var.getClass();
        tj60 tj60Var = (tj60) gguVar.f11269a.f24171a;
        tj60Var.getClass();
        q7d0 q7d0Var = tj60Var.f34036a;
        String str = "KEY_ONBOARDING_COMPLETED_" + sh60Var.name();
        q7d0Var.getClass();
        if (!q7d0Var.a().getBoolean(str, false) && j < jE) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Object m(String str, File file, zje zjeVar) {
        pzu pzuVar = (pzu) this.b;
        return qjj.d0(((mne) pzuVar.e).b, new fs(((uzc) this.c).b().getId(), str, pzuVar, file, (yje) null), zjeVar);
    }

    public boolean o() {
        return !(((Number) ((hgk0) ((l73) this.c).b).getValue()).floatValue() == 0.0f);
    }

    @Override // a.hih0
    public void onQueryTextChange(String str) {
        str.getClass();
        ((du20) this.b).invoke(Boolean.valueOf(str.length() == 0));
        e730 e730Var = (e730) this.c;
        e3c.n(e730Var.v);
        e730Var.v = sac.V(jiu0.a(e730Var), c730.f3843a, null, e730Var.o.f22085a, new mq10((Object) e730Var, (Object) str, (yje) null, (byte) 17), 10);
    }

    @Override // a.hih0
    public void onQueryTextSubmit(String str) {
        str.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0116  */
    /* JADX WARN: Code duplicated, block: B:39:0x0117  */
    /* JADX WARN: Code duplicated, block: B:42:0x0124  */
    /* JADX WARN: Code duplicated, block: B:43:0x0126 A[Catch: m07 -> 0x013d, TryCatch #3 {m07 -> 0x013d, blocks: (B:36:0x00f2, B:40:0x0119, B:53:0x0138, B:59:0x014b, B:56:0x0141, B:57:0x0146, B:58:0x0147, B:43:0x0126, B:46:0x012c), top: B:81:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x012a  */
    /* JADX WARN: Code duplicated, block: B:46:0x012c A[Catch: m07 -> 0x013d, TryCatch #3 {m07 -> 0x013d, blocks: (B:36:0x00f2, B:40:0x0119, B:53:0x0138, B:59:0x014b, B:56:0x0141, B:57:0x0146, B:58:0x0147, B:43:0x0126, B:46:0x012c), top: B:81:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0130  */
    /* JADX WARN: Code duplicated, block: B:49:0x0132  */
    /* JADX WARN: Code duplicated, block: B:51:0x0135  */
    /* JADX WARN: Code duplicated, block: B:53:0x0138 A[Catch: m07 -> 0x013d, TryCatch #3 {m07 -> 0x013d, blocks: (B:36:0x00f2, B:40:0x0119, B:53:0x0138, B:59:0x014b, B:56:0x0141, B:57:0x0146, B:58:0x0147, B:43:0x0126, B:46:0x012c), top: B:81:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x0141 A[Catch: m07 -> 0x013d, TryCatch #3 {m07 -> 0x013d, blocks: (B:36:0x00f2, B:40:0x0119, B:53:0x0138, B:59:0x014b, B:56:0x0141, B:57:0x0146, B:58:0x0147, B:43:0x0126, B:46:0x012c), top: B:81:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0147 A[Catch: m07 -> 0x013d, TryCatch #3 {m07 -> 0x013d, blocks: (B:36:0x00f2, B:40:0x0119, B:53:0x0138, B:59:0x014b, B:56:0x0141, B:57:0x0146, B:58:0x0147, B:43:0x0126, B:46:0x012c), top: B:81:0x00f2 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001f  */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01a8, code lost:
    
        if (r0 == r9) goto L72;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r18v0, types: [a.ieu] */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r22v0, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [byte] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v29, types: [byte] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(a.ouj0 r19, long r20, int r22, a.zje r23) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ieu.p(a.ouj0, long, int, a.zje):java.lang.Object");
    }

    public void q() {
        c4m0 c4m0Var = (c4m0) this.b;
        if (c4m0Var != null) {
            c4m0Var.cancel(null);
        }
        this.c = new l73(hp4.j, Float.valueOf(0.0f), null, 60);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0085, code lost:
    
        if (r6 == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(long r7, a.zje r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof a.fs00
            if (r0 == 0) goto L13
            r0 = r9
            a.fs00 r0 = (a.fs00) r0
            int r1 = r0.l
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.l = r1
            goto L18
        L13:
            a.fs00 r0 = new a.fs00
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.j
            a.wne r1 = a.wne.f39444a
            int r2 = r0.l
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L37
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            a.z1x.P(r9)
            goto L88
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            r6 = 0
            return r6
        L31:
            long r7 = r0.i
            a.z1x.P(r9)
            goto L55
        L37:
            a.z1x.P(r9)
            java.lang.Object r9 = r6.b
            a.zn00 r9 = (a.zn00) r9
            r0.i = r7
            r0.l = r4
            java.lang.Object r9 = r9.b
            a.rcz r9 = (a.rcz) r9
            java.lang.Object r9 = r9.invoke()
            a.gs00 r9 = (a.gs00) r9
            java.lang.String r2 = "application/vnd.xenvelop+json"
            java.lang.Object r9 = r9.a(r7, r2, r0)
            if (r9 != r1) goto L55
            goto L87
        L55:
            a.htt0 r9 = (a.htt0) r9
            java.lang.Double r9 = r9.f13651a
            if (r9 == 0) goto L60
            double r4 = r9.doubleValue()
            goto L62
        L60:
            r4 = 0
        L62:
            long r4 = (long) r4
            java.lang.Object r6 = r6.c
            a.es00 r6 = (a.es00) r6
            r0.i = r7
            r0.l = r3
            r6.getClass()
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r4)
            r6.c = r7
            a.qoj0 r6 = r6.b
            java.lang.Long r7 = new java.lang.Long
            r7.<init>(r4)
            java.lang.Object r6 = r6.a(r7, r0)
            if (r6 != r1) goto L83
            goto L85
        L83:
            kotlin.Unit r6 = kotlin.Unit.f46060a
        L85:
            if (r6 != r1) goto L88
        L87:
            return r1
        L88:
            kotlin.Unit r6 = kotlin.Unit.f46060a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.ieu.r(long, a.zje):java.lang.Object");
    }

    public void s(float f, w6k w6kVar, vne vneVar) {
        if (f <= w6kVar.w0(1.0f)) {
            return;
        }
        rfk0 rfk0VarJ = vdx.J();
        yje yjeVar = null;
        Function1 function1E = rfk0VarJ != null ? rfk0VarJ.e() : null;
        rfk0 rfk0VarW = vdx.W(rfk0VarJ);
        try {
            float fFloatValue = ((Number) ((hgk0) ((l73) this.c).b).getValue()).floatValue();
            c4m0 c4m0Var = (c4m0) this.b;
            if (c4m0Var != null) {
                c4m0Var.cancel(null);
            }
            l73 l73Var = (l73) this.c;
            if (l73Var.f) {
                this.c = x4d0.a0(l73Var, fFloatValue - f, 0.0f, 30);
            } else {
                this.c = new l73(hp4.j, Float.valueOf(-f), null, 60);
            }
            this.b = qjj.W(vneVar, null, null, new slx(this, yjeVar, (byte) 9), 3);
        } finally {
            vdx.Y(rfk0VarJ, rfk0VarW, function1E);
        }
    }

    public ieu(gii0 gii0Var, byte b) {
        this.f14653a = b;
        gii0Var.getClass();
        switch (b) {
            case 21:
                this.b = gii0Var;
                this.c = new y2x(this, (byte) 14);
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                this.b = gii0Var;
                this.c = new rx00(this, (byte) 6);
                break;
            default:
                this.b = gii0Var;
                this.c = new bdv(this, (byte) 21);
                break;
        }
    }

    public ieu(bzu bzuVar, k7u k7uVar) {
        this.f14653a = (byte) 12;
        k7uVar.getClass();
        this.b = bzuVar;
        this.c = k7uVar;
    }

    public ieu(zn00 zn00Var, es00 es00Var) {
        this.f14653a = (byte) 26;
        es00Var.getClass();
        this.b = zn00Var;
        this.c = es00Var;
    }

    public ieu(mne mneVar, sjl0 sjl0Var) {
        this.f14653a = (byte) 9;
        sjl0Var.getClass();
        this.b = mneVar;
        this.c = sjl0Var;
    }

    public ieu(pmi pmiVar, j1q0 j1q0Var) {
        this.f14653a = (byte) 0;
        j1q0Var.getClass();
        this.b = pmiVar;
        this.c = j1q0Var;
    }

    public ieu(nou nouVar, rkc0 rkc0Var) {
        this.f14653a = (byte) 5;
        rkc0Var.getClass();
        this.b = nouVar;
        this.c = rkc0Var;
    }

    public ieu(d6e d6eVar, htz htzVar) {
        this.f14653a = (byte) 16;
        this.b = d6eVar;
        this.c = new u710((Object) null);
    }

    public ieu(w5z w5zVar, ony onyVar) {
        this.f14653a = (byte) 28;
        onyVar.getClass();
        this.b = w5zVar;
        this.c = onyVar;
    }

    public ieu(bl6 bl6Var, gst0 gst0Var) {
        this.f14653a = (byte) 22;
        bl6Var.getClass();
        gst0Var.getClass();
        this.b = bl6Var;
        this.c = gst0Var;
    }

    public ieu(WorkDatabase_Impl workDatabase_Impl) {
        this.f14653a = (byte) 19;
        this.b = workDatabase_Impl;
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        setNewSetFromMap.getClass();
        this.c = setNewSetFromMap;
    }

    public /* synthetic */ ieu(Object obj, Object obj2, byte b) {
        this.f14653a = b;
        this.b = obj;
        this.c = obj2;
    }

    public ieu(ArrayList arrayList, ArrayList arrayList2) {
        this.f14653a = (byte) 15;
        int size = arrayList.size();
        this.b = new int[size];
        this.c = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.b)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.c)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    public ieu(int i, int i2) {
        this.f14653a = (byte) 15;
        this.b = new int[]{i, i2};
        this.c = new float[]{0.0f, 1.0f};
    }

    public ieu(int i, int i2, int i3) {
        this.f14653a = (byte) 15;
        this.b = new int[]{i, i2, i3};
        this.c = new float[]{0.0f, 0.5f, 1.0f};
    }
}
