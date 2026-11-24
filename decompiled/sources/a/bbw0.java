package a;

import a.m1r;
import a.pps0;
import a.s2m0;
import a.s470;
import a.ufx;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.github.terrakok.cicerone.androidx.FragmentScreen;
import com.github.terrakok.cicerone.androidx.FragmentScreen$Companion$invoke$1;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.material.appbar.AppBarLayout;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.xplatform.bonus_games.impl.core.presentation.games_list.utils.PromoXGamesScreens$LotteryScreen;
import org.xplatform.bonus_games.impl.core.presentation.games_list.utils.PromoXGamesScreens$MemoryScreen;
import org.xplatform.web.impl.di.feature.WebGameScreenFactoryImpl$getWebGameScreen$1;

/* JADX INFO: loaded from: classes2.dex */
public final class bbw0 implements zf60, tdo0, xro {
    public static bbw0 c;
    public static volatile bbw0 e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f2328a;
    public final Object b;
    public static final Object d = new Object();
    public static final vit f = new vit(1);

    public bbw0(byte b) {
        x440 x440Var;
        this.f2328a = b;
        switch (b) {
            case 2:
                try {
                    x440Var = (x440) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    x440Var = f;
                }
                x440[] x440VarArr = {vit.b, x440Var};
                ao20 ao20Var = new ao20();
                ao20Var.f1180a = x440VarArr;
                Charset charset = cmx.f4629a;
                this.b = ao20Var;
                break;
            case 16:
                this.b = wy40.l();
                break;
            default:
                this.b = new ConcurrentHashMap();
                break;
        }
    }

    public static FragmentScreen$Companion$invoke$1 h(long j) {
        return new FragmentScreen$Companion$invoke$1(null, new i44(j), true);
    }

    public static bbw0 m() {
        if (e == null) {
            synchronized (d) {
                try {
                    if (e == null) {
                        e = new bbw0((byte) 1);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        bbw0 bbw0Var = e;
        s0x.H(bbw0Var);
        return bbw0Var;
    }

    public static FragmentScreen n(long j, final String str) {
        if (j == s470.ONE_X_CHEST.a()) {
            return new FragmentScreen(str) { // from class: org.xplatform.bonus_games.impl.core.presentation.games_list.utils.PromoXGamesScreens$PromoChestsScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f46435a;

                {
                    str.getClass();
                    this.f46435a = str;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    s2m0 s2m0Var = pps0.V1;
                    s470 s470Var = s470.ONE_X_CHEST;
                    s2m0Var.getClass();
                    this.f46435a.getClass();
                    pps0 pps0Var = new pps0();
                    long jA = s470Var.a();
                    pps0Var.R1.j(pps0Var, pps0.W1[0], jA);
                    return pps0Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45456a() {
                    return ufx.C(this);
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        if (j == s470.ONE_X_SAFE.a()) {
            return new FragmentScreen(str) { // from class: org.xplatform.bonus_games.impl.core.presentation.games_list.utils.PromoXGamesScreens$PromoSafesScreen

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final String f46436a;

                {
                    str.getClass();
                    this.f46436a = str;
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                public final Fragment a(m1r m1rVar) {
                    m1rVar.getClass();
                    s2m0 s2m0Var = pps0.V1;
                    s470 s470Var = s470.ONE_X_SAFE;
                    s2m0Var.getClass();
                    this.f46436a.getClass();
                    pps0 pps0Var = new pps0();
                    long jA = s470Var.a();
                    pps0Var.R1.j(pps0Var, pps0.W1[0], jA);
                    return pps0Var;
                }

                @Override // a.m7h0
                /* JADX INFO: renamed from: b */
                public final String getF45456a() {
                    return ufx.C(this);
                }

                @Override // com.github.terrakok.cicerone.androidx.FragmentScreen
                /* JADX INFO: renamed from: g */
                public final /* bridge */ boolean getB() {
                    return true;
                }
            };
        }
        if (j == s470.ONE_X_LOTTERY.a()) {
            return new PromoXGamesScreens$LotteryScreen();
        }
        if (j == s470.ONE_X_MEMORY.a()) {
            return new PromoXGamesScreens$MemoryScreen();
        }
        return null;
    }

    public static synchronized bbw0 t(Context context) {
        bbw0 bbw0Var;
        Context applicationContext = context.getApplicationContext();
        synchronized (bbw0.class) {
            bbw0Var = c;
            if (bbw0Var == null) {
                bbw0Var = new bbw0(applicationContext);
                c = bbw0Var;
            }
        }
        return bbw0Var;
        return bbw0Var;
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return v(context, context.getClass().getName(), intent, serviceConnection, i, null);
    }

    @Override // a.xro
    public wy40 b() {
        throw null;
    }

    public hx9 c() {
        return new hx9(b780.j((wy40) this.b), (byte) 20);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object d(String str, int i, int i2, int i3, String str2, zje zjeVar) {
        ul5 ul5Var;
        if (zjeVar instanceof ul5) {
            ul5Var = (ul5) zjeVar;
            int i4 = ul5Var.k;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ul5Var.k = i4 - Integer.MIN_VALUE;
            } else {
                ul5Var = new ul5(this, zjeVar);
            }
        } else {
            ul5Var = new ul5(this, zjeVar);
        }
        ul5 ul5Var2 = ul5Var;
        Object objA = ul5Var2.i;
        wne wneVar = wne.f39444a;
        int i5 = ul5Var2.k;
        if (i5 == 0) {
            z1x.P(objA);
            sl5 sl5Var = (sl5) ((gii0) this.b).b(sre0.f32672a.b(sl5.class));
            ul5Var2.k = 1;
            objA = sl5Var.a(str, str2, i, i2, i3, ul5Var2);
            if (objA == wneVar) {
                return wneVar;
            }
        } else {
            if (i5 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objA);
        }
        Iterable iterable = (List) ((q16) objA).d;
        if (iterable == null) {
            iterable = iun.f15405a;
        }
        return CollectionsKt.A0(iterable, new s7f((byte) 26));
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x002d  */
    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x003f  */
    public FragmentScreen f(long j, a570 a570Var, String str, boolean z) {
        long jD;
        FragmentScreen fragmentScreenN;
        FragmentScreen webGameScreenFactoryImpl$getWebGameScreen$1;
        str.getClass();
        if (a570Var == null) {
            if (a570Var != null) {
                jD = x1x.D(a570Var);
            } else {
                jD = j;
            }
            fragmentScreenN = n(jD, str);
            if (fragmentScreenN == null) {
                csr csrVar = csr.e;
                csrVar.getClass();
                webGameScreenFactoryImpl$getWebGameScreen$1 = new WebGameScreenFactoryImpl$getWebGameScreen$1(jD, csrVar, z);
            } else {
                webGameScreenFactoryImpl$getWebGameScreen$1 = fragmentScreenN;
            }
        } else if (a570Var instanceof z470) {
            long jD2 = x1x.D(a570Var);
            csr csrVar2 = csr.e;
            csrVar2.getClass();
            webGameScreenFactoryImpl$getWebGameScreen$1 = new WebGameScreenFactoryImpl$getWebGameScreen$1(jD2, csrVar2, z);
        } else if (a570Var instanceof w470) {
            webGameScreenFactoryImpl$getWebGameScreen$1 = n(x1x.D(a570Var), str);
        } else {
            if (a570Var != null) {
                jD = x1x.D(a570Var);
            } else {
                jD = j;
            }
            fragmentScreenN = n(jD, str);
            if (fragmentScreenN == null) {
                csr csrVar3 = csr.e;
                csrVar3.getClass();
                webGameScreenFactoryImpl$getWebGameScreen$1 = new WebGameScreenFactoryImpl$getWebGameScreen$1(jD, csrVar3, z);
            } else {
                webGameScreenFactoryImpl$getWebGameScreen$1 = fragmentScreenN;
            }
        }
        if (webGameScreenFactoryImpl$getWebGameScreen$1 != null) {
            return webGameScreenFactoryImpl$getWebGameScreen$1;
        }
        if (a570Var != null) {
            j = x1x.D(a570Var);
        }
        FragmentScreen fragmentScreenN2 = n(j, str);
        if (fragmentScreenN2 != null) {
            return fragmentScreenN2;
        }
        csr csrVar4 = csr.e;
        csrVar4.getClass();
        return new WebGameScreenFactoryImpl$getWebGameScreen$1(j, csrVar4, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(long j, zje zjeVar, String str, boolean z) {
        cf8 cf8Var;
        Object next;
        Object objN;
        if (zjeVar instanceof cf8) {
            cf8Var = (cf8) zjeVar;
            int i = cf8Var.n;
            if ((i & Integer.MIN_VALUE) != 0) {
                cf8Var.n = i - Integer.MIN_VALUE;
            } else {
                cf8Var = new cf8(this, zjeVar);
            }
        } else {
            cf8Var = new cf8(this, zjeVar);
        }
        Object objO = cf8Var.l;
        wne wneVar = wne.f39444a;
        int i2 = cf8Var.n;
        if (i2 == 0) {
            z1x.P(objO);
            kki kkiVar = (kki) this.b;
            cf8Var.j = str;
            cf8Var.i = j;
            cf8Var.k = z;
            cf8Var.n = 1;
            objO = kkiVar.o(cf8Var);
            if (objO == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = cf8Var.k;
            j = cf8Var.i;
            str = cf8Var.j;
            z1x.P(objO);
        }
        Iterator it = ((Iterable) objO).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((pe8) next).f26839a != j);
        pe8 pe8Var = (pe8) next;
        if (pe8Var != null) {
            t470 t470Var = a570.Companion;
            boolean z2 = pe8Var.h;
            t470Var.getClass();
            a570 a570VarA = t470.a(z2, j);
            if (a570VarA instanceof z470) {
                csr csrVar = csr.e;
                csrVar.getClass();
                objN = new WebGameScreenFactoryImpl$getWebGameScreen$1(j, csrVar, z);
            } else {
                if (!(a570VarA instanceof w470)) {
                    t9f.b();
                    return null;
                }
                objN = n(x1x.D(a570VarA), str);
            }
            if (objN != null) {
                return objN;
            }
        }
        FragmentScreen fragmentScreenN = n(j, str);
        if (fragmentScreenN != null) {
            return fragmentScreenN;
        }
        csr csrVar2 = csr.e;
        csrVar2.getClass();
        return new WebGameScreenFactoryImpl$getWebGameScreen$1(j, csrVar2, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
    
        if (r6 == r10) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006e, code lost:
    
        if (r6 == r10) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(a.sip r7, org.xplatform.cyber.section.api.domain.entity.CyberGamesPage r8, a.jo20 r9, a.zje r10) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            a.sza r0 = (a.sza) r0
            boolean r1 = r10 instanceof a.mmb
            if (r1 == 0) goto L17
            r1 = r10
            a.mmb r1 = (a.mmb) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.k = r2
            goto L1c
        L17:
            a.mmb r1 = new a.mmb
            r1.<init>(r6, r10)
        L1c:
            java.lang.Object r6 = r1.i
            a.wne r10 = a.wne.f39444a
            int r2 = r1.k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            a.z1x.P(r6)
            goto L57
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L35:
            a.z1x.P(r6)
            goto L71
        L39:
            a.z1x.P(r6)
            int r6 = r7.ordinal()
            if (r6 == 0) goto L5e
            if (r6 != r5) goto L5a
            java.lang.Object r6 = r0.invoke()
            a.bog r6 = (a.bog) r6
            java.lang.String r7 = org.xplatform.cyber.section.api.domain.entity.d.b(r8)
            r1.k = r4
            java.lang.Object r6 = r6.b(r7, r9, r1)
            if (r6 != r10) goto L57
            goto L70
        L57:
            a.dx5 r6 = (a.dx5) r6
            goto L73
        L5a:
            a.t9f.b()
            return r3
        L5e:
            java.lang.Object r6 = r0.invoke()
            a.bog r6 = (a.bog) r6
            java.lang.String r7 = org.xplatform.cyber.section.api.domain.entity.d.b(r8)
            r1.k = r5
            java.lang.Object r6 = r6.g(r7, r9, r1)
            if (r6 != r10) goto L71
        L70:
            return r10
        L71:
            a.dx5 r6 = (a.dx5) r6
        L73:
            java.lang.Object r6 = r6.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bbw0.i(a.sip, org.xplatform.cyber.section.api.domain.entity.CyberGamesPage, a.jo20, a.zje):java.lang.Object");
    }

    @Override // a.tdo0
    public void j(FrameLayout frameLayout) {
        Function1 function1;
        gd5 gd5Var = (gd5) this.b;
        gd5Var.d(frameLayout);
        Object tag = frameLayout.getTag();
        String str = tag instanceof String ? (String) tag : null;
        if (str == null || (function1 = gd5Var.b) == null) {
            return;
        }
        function1.invoke(str);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
    
        if (r6 == r9) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0066, code lost:
    
        if (r6 == r9) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object k(a.sip r7, a.jo20 r8, a.zje r9) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.b
            a.sza r0 = (a.sza) r0
            boolean r1 = r9 instanceof a.zbb
            if (r1 == 0) goto L17
            r1 = r9
            a.zbb r1 = (a.zbb) r1
            int r2 = r1.k
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.k = r2
            goto L1c
        L17:
            a.zbb r1 = new a.zbb
            r1.<init>(r6, r9)
        L1c:
            java.lang.Object r6 = r1.i
            a.wne r9 = a.wne.f39444a
            int r2 = r1.k
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L39
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2f
            a.z1x.P(r6)
            goto L53
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a.jf4.n(r6)
            return r3
        L35:
            a.z1x.P(r6)
            goto L69
        L39:
            a.z1x.P(r6)
            int r6 = r7.ordinal()
            if (r6 == 0) goto L5a
            if (r6 != r5) goto L56
            java.lang.Object r6 = r0.invoke()
            a.bog r6 = (a.bog) r6
            r1.k = r4
            java.lang.Object r6 = r6.h(r8, r1)
            if (r6 != r9) goto L53
            goto L68
        L53:
            a.dx5 r6 = (a.dx5) r6
            goto L6b
        L56:
            a.t9f.b()
            return r3
        L5a:
            java.lang.Object r6 = r0.invoke()
            a.bog r6 = (a.bog) r6
            r1.k = r5
            java.lang.Object r6 = r6.a(r8, r1)
            if (r6 != r9) goto L69
        L68:
            return r9
        L69:
            a.dx5 r6 = (a.dx5) r6
        L6b:
            java.lang.Object r6 = r6.a()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: a.bbw0.k(a.sip, a.jo20, a.zje):java.lang.Object");
    }

    @Override // a.zf60
    public xiv0 l(View view, xiv0 xiv0Var) {
        byte b = this.f2328a;
        Object obj = this.b;
        switch (b) {
            case 5:
                AppBarLayout appBarLayout = (AppBarLayout) obj;
                xiv0 xiv0Var2 = appBarLayout.getFitsSystemWindows() ? xiv0Var : null;
                if (!Objects.equals(appBarLayout.g, xiv0Var2)) {
                    appBarLayout.g = xiv0Var2;
                    appBarLayout.setWillNotDraw(!(appBarLayout.x != null && appBarLayout.getTopInset() > 0));
                    appBarLayout.requestLayout();
                }
                return xiv0Var;
            default:
                view.getClass();
                uiv0 uiv0Var = xiv0Var.f40966a;
                int i = uiv0Var.u(8) ? uiv0Var.i(8).d : uiv0Var.i(2).d;
                View viewQ0 = ((tn3) obj).q0();
                viewQ0.setPadding(viewQ0.getPaddingLeft(), viewQ0.getPaddingTop(), viewQ0.getPaddingRight(), i);
                return xiv0.b;
        }
    }

    public void o(drd drdVar) {
        drdVar.getClass();
        for (u15 u15Var : drdVar.c()) {
            u15Var.getClass();
            ((wy40) this.b).x(u15Var, drdVar.g(u15Var), drdVar.d(u15Var));
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object p(long j, zje zjeVar, List list) {
        l3c l3cVar;
        if (zjeVar instanceof l3c) {
            l3cVar = (l3c) zjeVar;
            int i = l3cVar.k;
            if ((i & Integer.MIN_VALUE) != 0) {
                l3cVar.k = i - Integer.MIN_VALUE;
            } else {
                l3cVar = new l3c(this, zjeVar);
            }
        } else {
            l3cVar = new l3c(this, zjeVar);
        }
        Object objC = l3cVar.i;
        wne wneVar = wne.f39444a;
        int i2 = l3cVar.k;
        if (i2 == 0) {
            z1x.P(objC);
            if (!list.contains(new Long(j))) {
                sjl0 sjl0Var = (sjl0) this.b;
                l3cVar.k = 1;
                objC = sjl0Var.c(j, l3cVar);
                if (objC == wneVar) {
                    return wneVar;
                }
            }
            return Boolean.valueOf(z);
        }
        if (i2 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objC);
        boolean z = ((ril0) objC).e;
        return Boolean.valueOf(z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object q(String str, zje zjeVar) {
        n8c n8cVar;
        if (zjeVar instanceof n8c) {
            n8cVar = (n8c) zjeVar;
            int i = n8cVar.l;
            if ((i & Integer.MIN_VALUE) != 0) {
                n8cVar.l = i - Integer.MIN_VALUE;
            } else {
                n8cVar = new n8c(this, zjeVar);
            }
        } else {
            n8cVar = new n8c(this, zjeVar);
        }
        Object objX = n8cVar.j;
        wne wneVar = wne.f39444a;
        int i2 = n8cVar.l;
        if (i2 == 0) {
            z1x.P(objX);
            u8u u8uVar = (u8u) this.b;
            n8cVar.i = str;
            n8cVar.l = 1;
            objX = u8uVar.x(n8cVar);
            if (objX == wneVar) {
                return wneVar;
            }
        } else {
            if (i2 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = n8cVar.i;
            z1x.P(objX);
        }
        return Boolean.valueOf(Intrinsics.d(objX, str));
    }

    public ArrayList r(uaq0 uaq0Var) {
        jm6 jm6Var = (jm6) this.b;
        List<im6> list = jm6.c;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        for (im6 im6Var : list) {
            boolean zO = StringsKt.O(jm6Var.f16750a.a(), "ru", false);
            im6Var.getClass();
            String str = zO ? "/ru/" : "/en/";
            uaq0.f35345a.getClass();
            String str2 = "1_l";
            if (!s9m0.j(uaq0Var)) {
                if (s9m0.i(uaq0Var)) {
                    str2 = "1_d";
                } else if (s9m0.k(uaq0Var)) {
                    str2 = "1_n";
                }
            }
            arrayList.add(new hm6(im6Var, ua80.i("static/img/android/onboarding/bet_builder", str, str2, ".png")));
        }
        return arrayList;
    }

    public void s(Context context, ServiceConnection serviceConnection) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        if ((serviceConnection instanceof t4x0) || !concurrentHashMap.containsKey(serviceConnection)) {
            try {
                context.unbindService(serviceConnection);
            } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
            }
        } else {
            try {
                try {
                    context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
                }
            } finally {
                concurrentHashMap.remove(serviceConnection);
            }
        }
    }

    public synchronized void u() {
        xqm0 xqm0Var = (xqm0) this.b;
        ReentrantLock reentrantLock = xqm0Var.f41329a;
        reentrantLock.lock();
        try {
            xqm0Var.b.edit().clear().apply();
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000b  */
    public boolean v(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        boolean z;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        ComponentName component = intent.getComponent();
        if (component == null) {
            z = false;
        } else {
            try {
                if ((grv0.a(context).a(0, component.getPackageName()).flags & 2097152) != 0) {
                    z = true;
                } else {
                    z = false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (z) {
            Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
            return false;
        }
        if (serviceConnection instanceof t4x0) {
            if (executor == null) {
                executor = null;
            }
            return (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
        }
        if (executor == null) {
            executor = null;
        }
        try {
            boolean zBindService = (Build.VERSION.SDK_INT < 29 || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
            if (zBindService) {
                return zBindService;
            }
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            return false;
        } catch (Throwable th) {
            concurrentHashMap.remove(serviceConnection, serviceConnection);
            throw th;
        }
    }

    public /* synthetic */ bbw0(Object obj, byte b) {
        this.f2328a = b;
        this.b = obj;
    }

    public bbw0(Context context) {
        String strE;
        this.f2328a = (byte) 0;
        xqm0 xqm0VarA = xqm0.a(context);
        this.b = xqm0VarA;
        xqm0VarA.b();
        String strE2 = xqm0VarA.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strE2) || (strE = xqm0VarA.e(xqm0.f("googleSignInOptions", strE2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.m(strE);
        } catch (JSONException unused) {
        }
    }

    public bbw0(ulk ulkVar) {
        this.f2328a = (byte) 24;
        ulkVar.getClass();
        this.b = ulkVar;
    }

    public bbw0(sjl0 sjl0Var) {
        this.f2328a = (byte) 20;
        sjl0Var.getClass();
        this.b = sjl0Var;
    }

    public bbw0(qp qpVar) {
        this.f2328a = (byte) 3;
        qpVar.getClass();
        this.b = qpVar;
    }

    public bbw0(ht2 ht2Var) {
        this.f2328a = (byte) 4;
        ht2Var.getClass();
        this.b = ht2Var;
    }

    public bbw0(gii0 gii0Var, byte b) {
        this.f2328a = b;
        gii0Var.getClass();
        switch (b) {
            case 13:
                this.b = new zm(gii0Var, (byte) 20);
                break;
            case 17:
                this.b = new sza(gii0Var, (byte) 1);
                break;
            case 18:
                this.b = new sza(gii0Var, (byte) 5);
                break;
            default:
                this.b = gii0Var;
                break;
        }
    }

    public bbw0(epi0 epi0Var) {
        this.f2328a = (byte) 10;
        this.b = new clc((Object) epi0Var, (byte) 20);
    }

    public bbw0(kki kkiVar, uxs0 uxs0Var) {
        this.f2328a = (byte) 14;
        this.b = kkiVar;
    }
}
