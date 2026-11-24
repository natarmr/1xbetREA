package a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.util.SparseArray;
import androidx.fragment.app.Fragment;
import androidx.work.impl.WorkDatabase;
import com.google.firebase.components.ComponentRegistrar;
import com.huawei.hms.api.ConnectionResult;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.WebSocket;
import org.xbet.client1.R;
import org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$authenticatorScreen$1;
import org.xplatform.authenticator.impl.navigation.AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1;
import org.xplatform.bet_history.history.domain.model.HistoryTypeModel;
import org.xplatform.popular.settings.impl.navigation.PopularSettingsScreenFactoryImpl$getScreen$1;
import org.xplatform.rules.api.presentation.models.RuleData;
import org.xplatform.rules.impl.navigation.RulesScreenFactoryImpl$getRulesFragmentOldScreen$1;
import org.xplatform.security.impl.navigation.BindPhoneNumberScreen;
import org.xplatform.security.impl.navigation.ChangePhoneNumberScreen;
import org.xplatform.settings.impl.navigation.SettingsScreenFactoryImpl$getScreen$1;
import org.xplatform.verification.status.impl.navigation.VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen;

/* JADX INFO: loaded from: classes2.dex */
public final class qgd implements dgd, lfn0 {
    public static final ogd i = new ogd(0);
    public static final byte[] j = {0, 7, 8, 15};
    public static final byte[] k = {0, 119, -120, -1};
    public static final byte[] l = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f28679a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public qgd(ArrayList arrayList, ArrayList arrayList2, kj5 kj5Var) {
        byte b = 0;
        this.f28679a = (byte) 0;
        o6t0 o6t0Var = o6t0.f24755a;
        this.b = new HashMap();
        this.c = new HashMap();
        this.d = new HashMap();
        this.e = new HashSet();
        this.g = new AtomicReference();
        nao naoVar = new nao();
        this.f = naoVar;
        this.h = kj5Var;
        ArrayList<pfd> arrayList3 = new ArrayList();
        arrayList3.add(pfd.c(naoVar, nao.class, v6n0.class, r7d0.class));
        arrayList3.add(pfd.c(this, qgd.class, new Class[0]));
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            pfd pfdVar = (pfd) it.next();
            if (pfdVar != null) {
                arrayList3.add(pfdVar);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList4.add(it2.next());
        }
        ArrayList arrayList5 = new ArrayList();
        synchronized (this) {
            Iterator it3 = arrayList4.iterator();
            while (it3.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((p5d0) it3.next()).get();
                    if (componentRegistrar != null) {
                        arrayList3.addAll(((kj5) this.h).m(componentRegistrar));
                        it3.remove();
                    }
                } catch (cox e) {
                    it3.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e);
                }
            }
            Iterator it4 = arrayList3.iterator();
            while (it4.hasNext()) {
                for (Object obj : ((pfd) it4.next()).b.toArray()) {
                    if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                        if (((HashSet) this.e).contains(obj.toString())) {
                            it4.remove();
                            break;
                        }
                        ((HashSet) this.e).add(obj.toString());
                    }
                }
            }
            if (((HashMap) this.b).isEmpty()) {
                bkb.I(arrayList3);
            } else {
                ArrayList arrayList6 = new ArrayList(((HashMap) this.b).keySet());
                arrayList6.addAll(arrayList3);
                bkb.I(arrayList6);
            }
            for (pfd pfdVar2 : arrayList3) {
                ((HashMap) this.b).put(pfdVar2, new b8z(new pgd(this, pfdVar2, b)));
            }
            arrayList5.addAll(U(arrayList3));
            arrayList5.addAll(V());
            T();
        }
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            ((Runnable) it5.next()).run();
        }
        Boolean bool = (Boolean) ((AtomicReference) this.g).get();
        if (bool != null) {
            t((HashMap) this.b, bool.booleanValue());
        }
    }

    public static a1g K(qgd qgdVar, long j2, List list, int i2) {
        List list2 = (i2 & 4) != 0 ? iun.f15405a : list;
        byte b = 1;
        byte b2 = 0;
        boolean z = (i2 & 8) == 0;
        list2.getClass();
        ali aliVar = (ali) qgdVar.b;
        iqi iqiVar = (iqi) aliVar.f1068a;
        s9m0 s9m0Var = uaq0.f35345a;
        wyu wyuVar = (wyu) aliVar.d;
        boolean z2 = !h97.A(wyuVar, s9m0Var);
        jr0 jr0Var = (jr0) iqiVar.c;
        uzb0 uzb0Var = uzb0.f36529a;
        yje yjeVar = null;
        utb utbVarC = aoq.c(new dnq(uvw.Q(new p6d(((wti) aliVar.b).j(j2, r7x.B(uzb0Var), "", z ? 60 : Integer.MAX_VALUE, "", ((pru) aliVar.c).a().b.f13233a.k, !s9m0.j(wyuVar.a()), false, false), ulb.L(new ar0(new vsg0(new br0(jr0Var, j2, ((j1q0) iqiVar.b).f15748a.a(), null, (byte) 0)), j2, z2), jr0Var.d.b), new wvt(j2, null), b2), true), new yau(j2, (yje) null), b), new gxt((yje) null, qgdVar, list2, j2));
        jr0 jr0Var2 = (jr0) ((n4u) qgdVar.c).b;
        gmq gmqVarL = ulb.L(new vsg0(new cr0(jr0Var2, j2, yjeVar, (byte) 0)), jr0Var2.d.b);
        jr0 jr0Var3 = ((xoc) qgdVar.d).f41210a;
        return dub.f0(utbVarC, gmqVarL, ulb.L(new vsg0(new cr0(jr0Var3, j2, yjeVar, (byte) 1)), jr0Var3.d.b), new vau(j2, qgdVar, null));
    }

    public static Object N(dqk0 dqk0Var) {
        if (dqk0Var != null) {
            if (dqk0Var instanceof bqk0) {
                return null;
            }
            if (dqk0Var instanceof cqk0) {
                return ((cqk0) dqk0Var).f4798a;
            }
        }
        t9f.b();
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:115:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:119:0x0203 A[LOOP:3: B:87:0x0156->B:119:0x0203, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:133:0x01ff A[SYNTHETIC] */
    public static void P(byte[] bArr, int[] iArr, int i2, int i3, int i4, Paint paint, Canvas canvas) {
        byte[] bArr2;
        char c;
        char c2;
        int iG;
        int iG2;
        boolean z;
        int iG3;
        int iG4;
        int iG5;
        int i5;
        int i6;
        boolean z2;
        int iG6;
        q8b q8bVar = new q8b(bArr, bArr.length);
        int i7 = i3;
        int i8 = i4;
        byte[] bArrK = null;
        byte[] bArrK2 = null;
        byte[] bArrK3 = null;
        while (q8bVar.b() != 0) {
            int i9 = 8;
            int iG7 = q8bVar.g(8);
            if (iG7 != 240) {
                int i10 = 3;
                int i11 = 2;
                int i12 = 4;
                switch (iG7) {
                    case 16:
                        if (i2 == 3) {
                            bArr2 = bArrK == null ? k : bArrK;
                        } else if (i2 == 2) {
                            bArr2 = bArrK3 == null ? j : bArrK3;
                        } else {
                            bArr2 = null;
                        }
                        boolean z3 = false;
                        while (true) {
                            int iG8 = q8bVar.g(2);
                            if (iG8 != 0) {
                                iG = iG8;
                                iG2 = 1;
                            } else {
                                if (q8bVar.f()) {
                                    int iG9 = q8bVar.g(3) + 3;
                                    iG = q8bVar.g(2);
                                    iG2 = iG9;
                                } else {
                                    if (q8bVar.f()) {
                                        iG2 = 1;
                                        c = '\b';
                                        c2 = 4;
                                    } else {
                                        int iG10 = q8bVar.g(2);
                                        if (iG10 == 0) {
                                            c = '\b';
                                            c2 = 4;
                                            z3 = true;
                                        } else if (iG10 == 1) {
                                            c = '\b';
                                            c2 = 4;
                                            iG2 = 2;
                                        } else if (iG10 == 2) {
                                            c = '\b';
                                            c2 = 4;
                                            iG2 = q8bVar.g(4) + 12;
                                            iG = q8bVar.g(2);
                                            z3 = z3;
                                        } else if (iG10 != 3) {
                                            z3 = z3;
                                            c = '\b';
                                            c2 = 4;
                                        } else {
                                            c = '\b';
                                            int iG11 = q8bVar.g(8) + 29;
                                            iG = q8bVar.g(2);
                                            z3 = z3;
                                            iG2 = iG11;
                                            c2 = 4;
                                        }
                                        iG = 0;
                                        iG2 = 0;
                                    }
                                    iG = 0;
                                }
                                if (iG2 == 0 && paint != null) {
                                    if (bArr2 != 0) {
                                        iG = bArr2[iG];
                                    }
                                    paint.setColor(iArr[iG]);
                                    canvas.drawRect(i7, i8, i7 + iG2, i8 + 1, paint);
                                }
                                i7 += iG2;
                                if (z3) {
                                    q8bVar.c();
                                } else {
                                    paint = paint;
                                    z3 = z3;
                                }
                            }
                            c = '\b';
                            c2 = 4;
                            if (iG2 == 0) {
                            }
                            i7 += iG2;
                            if (z3) {
                                q8bVar.c();
                            } else {
                                paint = paint;
                                z3 = z3;
                            }
                            break;
                        }
                        break;
                    case 17:
                        byte[] bArr3 = i2 == 3 ? bArrK2 == null ? l : bArrK2 : null;
                        boolean z4 = false;
                        while (true) {
                            int iG12 = q8bVar.g(i12);
                            if (iG12 != 0) {
                                z = z4;
                                iG5 = iG12;
                                iG3 = 1;
                            } else if (q8bVar.f()) {
                                if (q8bVar.f()) {
                                    int iG13 = q8bVar.g(i11);
                                    if (iG13 == 0) {
                                        z = z4;
                                        iG3 = 1;
                                    } else if (iG13 != 1) {
                                        if (iG13 == i11) {
                                            iG3 = q8bVar.g(i12) + 9;
                                            iG4 = q8bVar.g(i12);
                                        } else if (iG13 != i10) {
                                            z = z4;
                                            iG3 = 0;
                                        } else {
                                            iG3 = q8bVar.g(i9) + 25;
                                            iG4 = q8bVar.g(i12);
                                        }
                                        iG5 = iG4;
                                    } else {
                                        z = z4;
                                        iG3 = i11;
                                    }
                                    iG5 = 0;
                                } else {
                                    iG3 = q8bVar.g(i11) + 4;
                                    iG5 = q8bVar.g(i12);
                                }
                                z = z4;
                            } else {
                                int iG14 = q8bVar.g(i10);
                                if (iG14 != 0) {
                                    iG3 = iG14 + 2;
                                    z = z4;
                                } else {
                                    z = true;
                                    iG3 = 0;
                                }
                                iG5 = 0;
                            }
                            if (iG3 == 0 || paint == 0) {
                                i5 = i10;
                                i6 = i11;
                            } else {
                                if (bArr3 != 0) {
                                    iG5 = bArr3[iG5];
                                }
                                paint.setColor(iArr[iG5]);
                                i5 = i10;
                                i6 = 2;
                                canvas.drawRect(i7, i8, i7 + iG3, i8 + 1, paint);
                            }
                            i7 += iG3;
                            if (z) {
                                q8bVar.c();
                            } else {
                                z4 = z;
                                i10 = i5;
                                i11 = i6;
                                i12 = 4;
                                i9 = 8;
                            }
                            break;
                        }
                        break;
                    case 18:
                        boolean z5 = false;
                        while (true) {
                            int iG15 = q8bVar.g(8);
                            if (iG15 != 0) {
                                z2 = z5;
                                iG6 = 1;
                            } else if (q8bVar.f()) {
                                z2 = z5;
                                iG6 = q8bVar.g(7);
                                iG15 = q8bVar.g(8);
                            } else {
                                int iG16 = q8bVar.g(7);
                                if (iG16 != 0) {
                                    z2 = z5;
                                    iG6 = iG16;
                                    iG15 = 0;
                                } else {
                                    z2 = true;
                                    iG15 = 0;
                                    iG6 = 0;
                                }
                            }
                            if (iG6 != 0 && paint != 0) {
                                paint.setColor(iArr[iG15]);
                                canvas.drawRect(i7, i8, i7 + iG6, i8 + 1, paint);
                            }
                            i7 += iG6;
                            if (!z2) {
                                z5 = z2;
                            }
                            break;
                        }
                        break;
                    default:
                        switch (iG7) {
                            case 32:
                                bArrK3 = k(4, 4, q8bVar);
                                break;
                            case 33:
                                bArrK = k(4, 8, q8bVar);
                                break;
                            case 34:
                                bArrK2 = k(16, 8, q8bVar);
                                break;
                        }
                        break;
                }
            } else {
                i8 += 2;
                i7 = i3;
            }
        }
    }

    public static ffn Q(q8b q8bVar, int i2) {
        int[] iArr;
        int iG;
        int i3;
        int iG2;
        int iG3;
        int iG4;
        int i4 = 8;
        int iG5 = q8bVar.g(8);
        q8bVar.o(8);
        int i5 = 2;
        int i6 = i2 - 2;
        int i7 = 0;
        int[] iArr2 = {0, -1, -16777216, -8421505};
        int[] iArrU = u();
        int[] iArrV = v();
        while (i6 > 0) {
            int iG6 = q8bVar.g(i4);
            int iG7 = q8bVar.g(i4);
            if ((iG7 & 128) != 0) {
                iArr = iArr2;
            } else {
                iArr = (iG7 & 64) != 0 ? iArrU : iArrV;
            }
            if ((iG7 & 1) != 0) {
                iG3 = q8bVar.g(i4);
                iG4 = q8bVar.g(i4);
                iG = q8bVar.g(i4);
                iG2 = q8bVar.g(i4);
                i3 = i6 - 6;
            } else {
                int iG8 = q8bVar.g(6) << i5;
                int iG9 = q8bVar.g(4) << 4;
                iG = q8bVar.g(4) << 4;
                i3 = i6 - 4;
                iG2 = q8bVar.g(i5) << 6;
                iG3 = iG8;
                iG4 = iG9;
            }
            if (iG3 == 0) {
                iG4 = i7;
                iG = iG4;
                iG2 = 255;
            }
            double d = iG3;
            double d2 = iG4 - 128;
            double d3 = iG - 128;
            iArr[iG6] = y((byte) (255 - (iG2 & 255)), vtt0.i((int) ((1.402d * d2) + d), 0, 255), vtt0.i((int) ((d - (0.34414d * d3)) - (d2 * 0.71414d)), 0, 255), vtt0.i((int) ((d3 * 1.772d) + d), 0, 255));
            i6 = i3;
            i7 = 0;
            iG5 = iG5;
            iArrV = iArrV;
            i4 = 8;
            i5 = 2;
        }
        return new ffn(iG5, iArr2, iArrU, iArrV);
    }

    public static gfn R(q8b q8bVar) {
        byte[] bArr;
        int iG = q8bVar.g(16);
        q8bVar.o(4);
        int iG2 = q8bVar.g(2);
        boolean zF = q8bVar.f();
        q8bVar.o(1);
        byte[] bArr2 = vtt0.b;
        if (iG2 != 1) {
            if (iG2 == 0) {
                int iG3 = q8bVar.g(16);
                int iG4 = q8bVar.g(16);
                if (iG3 > 0) {
                    bArr2 = new byte[iG3];
                    q8bVar.j(bArr2, iG3);
                }
                if (iG4 > 0) {
                    bArr = new byte[iG4];
                    q8bVar.j(bArr, iG4);
                }
            }
            return new gfn(iG, zF, bArr2, bArr);
        }
        q8bVar.o(q8bVar.g(8) * 16);
        bArr = bArr2;
        return new gfn(iG, zF, bArr2, bArr);
    }

    public static RulesScreenFactoryImpl$getRulesFragmentOldScreen$1 W(qgd qgdVar, String str, int i2) {
        lun lunVar = lun.f20680a;
        lunVar.getClass();
        qgdVar.getClass();
        return new RulesScreenFactoryImpl$getRulesFragmentOldScreen$1(new RuleData(str, 8, lunVar, ""), i2, true);
    }

    public static final ArrayList a0(a4d0 a4d0Var, qgd qgdVar) {
        List list = a4d0Var.d;
        list.getClass();
        a4d0 a4d0VarC0 = m8x.c0(a4d0Var, (roi0) ((g45) qgdVar.b).d);
        Iterable iterableA0 = a4d0VarC0 != null ? a0(a4d0VarC0, qgdVar) : null;
        if (iterableA0 == null) {
            iterableA0 = iun.f15405a;
        }
        return CollectionsKt.q0(list, iterableA0);
    }

    public static ays0 c0(List list, g93 g93Var) {
        ays0 ays0VarB;
        ArrayList arrayList = new ArrayList(r3d.q(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((uyj) it.next()).getClass();
            if (g93Var.isEmpty()) {
                ays0.b.getClass();
                ays0VarB = ays0.c;
            } else {
                fck0 fck0Var = ays0.b;
                List listC = kotlin.collections.a.c(new j93(g93Var));
                fck0Var.getClass();
                ays0VarB = fck0.b(listC);
            }
            arrayList.add(ays0VarB);
        }
        ArrayList arrayListR = r3d.r(arrayList);
        ays0.b.getClass();
        return fck0.b(arrayListR);
    }

    public static final wm40 e0(qgd qgdVar, a4d0 a4d0Var, int i2) {
        g45 g45Var = (g45) qgdVar.b;
        qlc qlcVarK = ydx.K((h950) g45Var.b, i2);
        ArrayList arrayListU = pgi0.u(pgi0.p(lgi0.e(new mys0(qgdVar, (byte) 2), a4d0Var), pnk0.f));
        int iF = pgi0.f(lgi0.e(nys0.b, qlcVarK));
        while (arrayListU.size() < iF) {
            arrayListU.add(0);
        }
        return ((n660) ((f6i) g45Var.f10647a).n).m(qlcVarK, arrayListU);
    }

    public static byte[] k(int i2, int i3, q8b q8bVar) {
        byte[] bArr = new byte[i2];
        for (int i4 = 0; i4 < i2; i4++) {
            bArr[i4] = (byte) q8bVar.g(i3);
        }
        return bArr;
    }

    public static kzj0 s(kzj0 kzj0Var, wsy wsyVar) {
        ary aryVarQ = vsm0.q(kzj0Var);
        g93 annotations = kzj0Var.getAnnotations();
        wsy wsyVarV = bfb.V(kzj0Var);
        List listQ = bfb.Q(kzj0Var);
        List listP = CollectionsKt.P(1, bfb.W(kzj0Var));
        ArrayList arrayList = new ArrayList(r3d.q(listP, 10));
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            arrayList.add(((pzs0) it.next()).b());
        }
        return bfb.N(aryVarQ, annotations, wsyVarV, listQ, arrayList, wsyVar, true).k0(kzj0Var.U());
    }

    public static int[] u() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i2 = 1; i2 < 16; i2++) {
            if (i2 < 8) {
                iArr[i2] = y(255, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i2] = y(255, (i2 & 1) != 0 ? 127 : 0, (i2 & 2) != 0 ? 127 : 0, (i2 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    public static int[] v() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            if (i2 < 8) {
                iArr[i2] = y(63, (i2 & 1) != 0 ? 255 : 0, (i2 & 2) != 0 ? 255 : 0, (i2 & 4) == 0 ? 0 : 255);
            } else {
                int i3 = i2 & 136;
                if (i3 == 0) {
                    iArr[i2] = y(255, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 8) {
                    iArr[i2] = y(127, ((i2 & 1) != 0 ? 85 : 0) + ((i2 & 16) != 0 ? 170 : 0), ((i2 & 2) != 0 ? 85 : 0) + ((i2 & 32) != 0 ? 170 : 0), ((i2 & 4) == 0 ? 0 : 85) + ((i2 & 64) == 0 ? 0 : 170));
                } else if (i3 == 128) {
                    iArr[i2] = y(255, ((i2 & 1) != 0 ? 43 : 0) + 127 + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + 127 + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + 127 + ((i2 & 64) == 0 ? 0 : 85));
                } else if (i3 == 136) {
                    iArr[i2] = y(255, ((i2 & 1) != 0 ? 43 : 0) + ((i2 & 16) != 0 ? 85 : 0), ((i2 & 2) != 0 ? 43 : 0) + ((i2 & 32) != 0 ? 85 : 0), ((i2 & 4) == 0 ? 0 : 43) + ((i2 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    public static int y(int i2, int i3, int i4, int i5) {
        return (i2 << 24) | (i3 << 16) | (i4 << 8) | i5;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public Object A(long j2, zje zjeVar, boolean z) {
        we1 we1Var;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof we1) {
            we1Var = (we1) zjeVar;
            int i2 = we1Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                we1Var.k = i2 - Integer.MIN_VALUE;
            } else {
                we1Var = new we1(this, zjeVar);
            }
        } else {
            we1Var = new we1(this, zjeVar);
        }
        we1 we1Var2 = we1Var;
        Object objM = we1Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = we1Var2.k;
        if (i3 == 0) {
            z1x.P(objM);
            xex xexVar = (xex) this.e;
            String strA = ((btt0) this.f).a();
            int iB = knf0Var.b();
            we1Var2.k = 1;
            objM = ((bx0) ((nc) xexVar.b).invoke()).m(strA, j2, 22, String.valueOf(iB), z, "application/vnd.xenvelop+json", new fk9(false), we1Var2);
            if (objM == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objM);
        }
        Integer num = ((woe) ((dx5) objM).a()).f39492a;
        return new toe(num != null ? num.intValue() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object B(zje zjeVar) {
        j0v j0vVar;
        int iIntValue;
        if (zjeVar instanceof j0v) {
            j0vVar = (j0v) zjeVar;
            int i2 = j0vVar.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j0vVar.k = i2 - Integer.MIN_VALUE;
            } else {
                j0vVar = new j0v(this, zjeVar);
            }
        } else {
            j0vVar = new j0v(this, zjeVar);
        }
        Object objA = j0vVar.i;
        wne wneVar = wne.f39444a;
        int i3 = j0vVar.k;
        if (i3 == 0) {
            z1x.P(objA);
            iIntValue = 0;
            if (((gst0) this.e).a()) {
                b3c0 b3c0Var = (b3c0) this.d;
                j0vVar.k = 1;
                objA = b3c0Var.a(false, j0vVar);
                if (objA == wneVar) {
                    return wneVar;
                }
            }
            return new Integer(iIntValue);
        }
        if (i3 != 1) {
            jf4.n("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        z1x.P(objA);
        Integer intOrNull = StringsKt.toIntOrNull(((m2c0) objA).c);
        iIntValue = intOrNull != null ? intOrNull.intValue() : 225;
        return new Integer(iIntValue);
    }

    public long C() {
        return ((Number) vtb.N(((dkj) this.d).f6232a.l.f30868a).f40549a.getValue()).longValue() - ((viu) this.e).a();
    }

    public hv10 D() {
        kxq kxqVar;
        List listP;
        Object next;
        WeakReference weakReference = ((jvq) this.b).b;
        if (weakReference != null && (kxqVar = (kxq) weakReference.get()) != null && (listP = kxqVar.r().c.p()) != null) {
            Iterator it = listP.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!(((Fragment) next) instanceof hv10));
            Fragment fragment = (Fragment) next;
            if (fragment != null && (fragment instanceof hv10)) {
                return (hv10) fragment;
            }
        }
        return null;
    }

    public List E() {
        return CollectionsKt.L0(((Map) this.h).values());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public Serializable F(int i2, int i3, String str, boolean z, int i4, int i5, zje zjeVar) {
        af1 af1Var;
        String str2;
        boolean z2;
        Object objC;
        String str3;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof af1) {
            af1Var = (af1) zjeVar;
            int i6 = af1Var.m;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                af1Var.m = i6 - Integer.MIN_VALUE;
            } else {
                af1Var = new af1(this, zjeVar);
            }
        } else {
            af1Var = new af1(this, zjeVar);
        }
        af1 af1Var2 = af1Var;
        Object obj = af1Var2.k;
        wne wneVar = wne.f39444a;
        int i7 = af1Var2.m;
        if (i7 == 0) {
            z1x.P(obj);
            he1 he1Var = (he1) this.b;
            String strA = ((kuy) this.h).a();
            knf0Var.getClass();
            str2 = str;
            af1Var2.i = str2;
            z2 = z;
            af1Var2.j = z2;
            af1Var2.m = 1;
            objC = he1Var.c(i2, "", i3, strA, 22, 1, i5, i4, af1Var2);
            if (objC == wneVar) {
                return wneVar;
            }
        } else {
            if (i7 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            boolean z3 = af1Var2.j;
            String str4 = af1Var2.i;
            z1x.P(obj);
            z2 = z3;
            str2 = str4;
            objC = obj;
        }
        Iterable<oc1> iterable = (Iterable) objC;
        ArrayList arrayList = new ArrayList(r3d.q(iterable, 10));
        for (oc1 oc1Var : iterable) {
            oc1Var.getClass();
            str2.getClass();
            Long l2 = oc1Var.f25006a;
            long jLongValue = l2 != null ? l2.longValue() : 0L;
            String str5 = oc1Var.b;
            String str6 = "";
            if (str5 == null) {
                str5 = "";
            }
            if (!z2 ? (str3 = oc1Var.c) != null : (str3 = oc1Var.d) != null) {
                str6 = str3;
            }
            arrayList.add(new lc1(jLongValue, str5, str2.concat(str6)));
        }
        return arrayList;
    }

    public hnu G() {
        return new hnu(new dpi0((xxn0) this.h));
    }

    public void H() {
        ndk0 ndk0Var;
        ndk0 ndk0Var2;
        hv10 hv10VarD = D();
        if (hv10VarD == null || (ndk0Var = hv10VarD.N1) == null || !ndk0Var.a() || (ndk0Var2 = hv10VarD.N1) == null) {
            return;
        }
        ndk0Var2.dismiss();
    }

    public utb I(boolean z, boolean z2, boolean z3) {
        if (z) {
            ((yqc) this.h).w(y9s.b);
        }
        yje yjeVar = null;
        return aoq.c(new vsg0(new ys8((Object) this, z, yjeVar, (byte) 10)), new b9u((byte) 6, yjeVar, this, z2, z3));
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0188  */
    /* JADX WARN: Code duplicated, block: B:51:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:53:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r13v0, types: [a.rf9, java.lang.Long] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x01bd -> B:52:0x01c0). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public java.lang.Object J(boolean r20, java.lang.Long r21, a.zje r22) {
        /*
            Method dump skipped, instruction units count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a.qgd.J(boolean, java.lang.Long, a.zje):java.lang.Object");
    }

    public hzs0 M(int i2) {
        hzs0 hzs0Var = (hzs0) ((Map) this.h).get(Integer.valueOf(i2));
        if (hzs0Var != null) {
            return hzs0Var;
        }
        qgd qgdVar = (qgd) this.c;
        if (qgdVar != null) {
            return qgdVar.M(i2);
        }
        return null;
    }

    public void O() throws uoo {
        ft4 ft4Var = ((suk) this.g).f32825a.f;
        CopyOnWriteArrayList<WebSocket> copyOnWriteArrayList = ft4Var.g;
        if (copyOnWriteArrayList.isEmpty()) {
            ft4Var.c.a();
        } else {
            for (WebSocket webSocket : copyOnWriteArrayList) {
                webSocket.getClass();
                ft4Var.a(webSocket);
                webSocket.f(1000, "Disconnected");
            }
            copyOnWriteArrayList.clear();
        }
        uoo uooVar = new uoo("");
        i2o.Companion.getClass();
        uooVar.c = h2o.a(0);
        throw uooVar;
    }

    public PopularSettingsScreenFactoryImpl$getScreen$1 S() {
        return new PopularSettingsScreenFactoryImpl$getScreen$1();
    }

    public void T() {
        HashMap map = (HashMap) this.c;
        HashMap map2 = (HashMap) this.d;
        for (pfd pfdVar : ((HashMap) this.b).keySet()) {
            for (c7k c7kVar : pfdVar.c) {
                boolean z = c7kVar.b == 2;
                jkd0 jkd0Var = c7kVar.f3867a;
                if (z && !map2.containsKey(jkd0Var)) {
                    Set set = Collections.EMPTY_SET;
                    sdz sdzVar = new sdz();
                    sdzVar.b = null;
                    sdzVar.f32054a = Collections.newSetFromMap(new ConcurrentHashMap());
                    sdzVar.f32054a.addAll(set);
                    map2.put(jkd0Var, sdzVar);
                } else if (map.containsKey(jkd0Var)) {
                    continue;
                } else {
                    byte b = c7kVar.b;
                    if (b == 1) {
                        throw new e7k("Unsatisfied dependency for component " + pfdVar + ": " + jkd0Var);
                    }
                    if (b != 2) {
                        map.put(jkd0Var, new y680(y680.c, y680.d));
                    }
                }
            }
        }
    }

    public ArrayList U(ArrayList arrayList) {
        HashMap map = (HashMap) this.c;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pfd pfdVar = (pfd) it.next();
            if (!pfdVar.e) {
                p5d0 p5d0Var = (p5d0) ((HashMap) this.b).get(pfdVar);
                for (jkd0 jkd0Var : pfdVar.b) {
                    if (map.containsKey(jkd0Var)) {
                        arrayList2.add(new fy2((y680) ((p5d0) map.get(jkd0Var)), p5d0Var, (byte) 28));
                    } else {
                        map.put(jkd0Var, p5d0Var);
                    }
                }
            }
        }
        return arrayList2;
    }

    public ArrayList V() {
        HashMap map = (HashMap) this.d;
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        for (Map.Entry entry : ((HashMap) this.b).entrySet()) {
            pfd pfdVar = (pfd) entry.getKey();
            if (pfdVar.e) {
                p5d0 p5d0Var = (p5d0) entry.getValue();
                for (jkd0 jkd0Var : pfdVar.b) {
                    if (!map2.containsKey(jkd0Var)) {
                        map2.put(jkd0Var, new HashSet());
                    }
                    ((Set) map2.get(jkd0Var)).add(p5d0Var);
                }
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (map.containsKey(entry2.getKey())) {
                sdz sdzVar = (sdz) map.get(entry2.getKey());
                Iterator it = ((Set) entry2.getValue()).iterator();
                while (it.hasNext()) {
                    arrayList.add(new fy2(sdzVar, (p5d0) it.next(), (byte) 29));
                }
            } else {
                jkd0 jkd0Var2 = (jkd0) entry2.getKey();
                Set set = (Set) ((Collection) entry2.getValue());
                sdz sdzVar2 = new sdz();
                sdzVar2.b = null;
                sdzVar2.f32054a = Collections.newSetFromMap(new ConcurrentHashMap());
                sdzVar2.f32054a.addAll(set);
                map.put(jkd0Var2, sdzVar2);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object X(long j2, int i2, nnm0 nnm0Var, zje zjeVar) throws Throwable {
        bf1 bf1Var;
        Object g0g0Var;
        if (zjeVar instanceof bf1) {
            bf1Var = (bf1) zjeVar;
            int i3 = bf1Var.l;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                bf1Var.l = i3 - Integer.MIN_VALUE;
            } else {
                bf1Var = new bf1(this, zjeVar);
            }
        } else {
            bf1Var = new bf1(this, zjeVar);
        }
        Object objE = bf1Var.j;
        wne wneVar = wne.f39444a;
        int i4 = bf1Var.l;
        try {
            if (i4 == 0) {
                z1x.P(objE);
                e0g0 e0g0Var = j0g0.b;
                he1 he1Var = (he1) this.b;
                String strA = ((btt0) this.f).a();
                bf1Var.i = i2;
                bf1Var.l = 1;
                wd1 wd1Var = (wd1) he1Var.f12898a.getValue();
                Integer intOrNull = StringsKt.toIntOrNull(nnm0Var.f23831a);
                objE = wd1Var.e(strA, "application/vnd.xenvelop+json", new cti0(i2, intOrNull != null ? intOrNull.intValue() : 0, j2), bf1Var);
                if (objE == wneVar) {
                    return wneVar;
                }
            } else {
                if (i4 != 1) {
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = bf1Var.i;
                z1x.P(objE);
            }
            g0g0Var = o2e.g0((k65) objE);
            e0g0 e0g0Var2 = j0g0.b;
        } catch (Throwable th) {
            e0g0 e0g0Var3 = j0g0.b;
            g0g0Var = new g0g0(th);
        }
        Throwable thA = j0g0.a(g0g0Var);
        if (thA == null) {
            z1x.P(g0g0Var);
            return g0g0Var;
        }
        if (!(thA instanceof zhi0)) {
            throw thA;
        }
        String message = thA.getMessage();
        if (message == null) {
            message = "";
        }
        throw new d01(new e01(i2, ((zhi0) thA).c.getErrorCode(), message));
    }

    public void Y(kxq kxqVar, String str, Function0 function0) {
        str.getClass();
        hv10 hv10VarD = D();
        if (hv10VarD != null) {
            wdk0 wdk0Var = hv10VarD.S1;
            if (wdk0Var == null) {
                Intrinsics.h("snackbarManager");
                throw null;
            }
            rek0 rek0Var = rek0.b;
            String strH = hv10VarD.H(R.string.a_btn_enter);
            strH.getClass();
            hv10VarD.N1 = wdk0.k(wdk0Var, new xdk0(rek0Var, str, null, new hdk0(strH, function0), jtv.x, null, 100), hv10VarD, null, null, false, null, 1020);
        }
    }

    /* JADX WARN: Code duplicated, block: B:104:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:106:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:108:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:110:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:111:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:116:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:121:0x0307  */
    /* JADX WARN: Code duplicated, block: B:126:0x031f  */
    /* JADX WARN: Code duplicated, block: B:133:0x033c  */
    /* JADX WARN: Code duplicated, block: B:134:0x0341  */
    /* JADX WARN: Code duplicated, block: B:137:0x034d  */
    /* JADX WARN: Code duplicated, block: B:153:0x0391  */
    /* JADX WARN: Code duplicated, block: B:155:0x0394  */
    /* JADX WARN: Code duplicated, block: B:156:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:158:0x03b2  */
    /* JADX WARN: Code duplicated, block: B:160:0x03b9 A[PHI: r4
  0x03b9: PHI (r4v6 a.kzj0) = (r4v5 a.kzj0), (r4v17 a.kzj0) binds: [B:159:0x03b7, B:154:0x0392] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:161:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:165:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:166:0x03cf  */
    /* JADX WARN: Code duplicated, block: B:168:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:169:0x03db  */
    /* JADX WARN: Code duplicated, block: B:177:0x020b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:178:0x01b5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0126  */
    /* JADX WARN: Code duplicated, block: B:46:0x013f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0171  */
    /* JADX WARN: Code duplicated, block: B:51:0x0179  */
    /* JADX WARN: Code duplicated, block: B:53:0x0190 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0192  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:57:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:59:0x01b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x01b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:69:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:73:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:76:0x01df  */
    /* JADX WARN: Code duplicated, block: B:78:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01f7  */
    public kzj0 Z(a4d0 a4d0Var, boolean z) {
        iys0 iys0VarD;
        foc focVarE0;
        Object next;
        int i2;
        ays0 ays0VarC0;
        ArrayList arrayList;
        int i3;
        List listL0;
        boolean zBooleanValue;
        boolean z2;
        kzj0 kzj0VarG0;
        kzj0 kzj0VarE;
        int size;
        kzj0 kzj0VarG1;
        foc focVarN;
        wer werVarS;
        pzs0 pzs0Var;
        wsy wsyVarB;
        foc focVarN2;
        swq swqVarG;
        int size2;
        int i4;
        a4d0 a4d0VarC;
        kzj0 kzj0VarL;
        int i5;
        y3d0 y3d0Var;
        hzs0 hzs0Var;
        x3d0 x3d0Var;
        int iOrdinal;
        t3u0 t3u0Var;
        int i6;
        a4d0 a4d0VarC2;
        pzs0 q4m0Var;
        pzs0 q4m0Var2;
        g45 g45Var = (g45) this.b;
        roi0 roi0Var = (roi0) g45Var.d;
        vjj vjjVar = (vjj) g45Var.c;
        f6i f6iVar = (f6i) g45Var.f10647a;
        a4d0Var.getClass();
        if (a4d0Var.r()) {
            if (ydx.K((h950) g45Var.b, a4d0Var.i).c) {
                ((ujn) ((f6i) g45Var.f10647a).i).getClass();
            }
        } else if ((a4d0Var.c & 128) == 128) {
            if (ydx.K((h950) g45Var.b, a4d0Var.l).c) {
                ((ujn) ((f6i) g45Var.f10647a).i).getClass();
            }
        }
        byte b = 0;
        if (!a4d0Var.r()) {
            int i7 = a4d0Var.c;
            if ((i7 & 32) == 32) {
                focVarE0 = M(a4d0Var.j);
                if (focVarE0 == null) {
                    f2o f2oVar = f2o.f8821a;
                    iys0VarD = f2o.d(c2o.o, String.valueOf(a4d0Var.j), (String) this.e);
                }
            } else if ((i7 & 64) == 64) {
                String string = ((h950) g45Var.b).getString(a4d0Var.k);
                Iterator it = E().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.d(((hzs0) next).getName().b(), string));
                hzs0 hzs0Var2 = (hzs0) next;
                if (hzs0Var2 == null) {
                    f2o f2oVar2 = f2o.f8821a;
                    iys0VarD = f2o.d(c2o.p, string, vjjVar.toString());
                } else {
                    focVarE0 = hzs0Var2;
                }
            } else if ((i7 & 128) == 128) {
                focVarE0 = (foc) ((xg) this.g).invoke(Integer.valueOf(a4d0Var.l));
                if (focVarE0 == null) {
                    focVarE0 = e0(this, a4d0Var, a4d0Var.l);
                }
            } else {
                f2o f2oVar3 = f2o.f8821a;
                iys0VarD = f2o.d(c2o.r, new String[0]);
            }
            i2 = 1;
            if (f2o.f(iys0VarD.n())) {
                f2o f2oVar4 = f2o.f8821a;
                return f2o.e(c2o.w, iun.f15405a, iys0VarD, (String[]) Arrays.copyOf(new String[]{iys0VarD.toString()}, 1));
            }
            vek vekVar = new vek((eu00) f6iVar.e, new ywm0(this, a4d0Var, (byte) 23));
            ays0VarC0 = c0((List) f6iVar.t, vekVar);
            ArrayList arrayListA0 = a0(a4d0Var, this);
            arrayList = new ArrayList(r3d.q(arrayListA0, 10));
            i3 = 0;
            for (Object obj : arrayListA0) {
                i5 = i3 + 1;
                if (i3 >= 0) {
                    q3d.p();
                    throw null;
                }
                y3d0Var = (y3d0) obj;
                List parameters = iys0VarD.getParameters();
                parameters.getClass();
                hzs0Var = (hzs0) CollectionsKt.W(i3, parameters);
                x3d0Var = y3d0Var.c;
                if (x3d0Var == x3d0.STAR) {
                    x3d0Var.getClass();
                    iOrdinal = x3d0Var.ordinal();
                    if (iOrdinal != 0) {
                        t3u0Var = t3u0.d;
                    } else if (iOrdinal != i2) {
                        t3u0Var = t3u0.e;
                    } else {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                t9f.b();
                                return null;
                            }
                            e9d0.i(x3d0Var, "Only IN, OUT and INV are supported. Actual argument: ");
                            return null;
                        }
                        t3u0Var = t3u0.c;
                    }
                    i6 = y3d0Var.b;
                    if ((i6 & 2) == 2) {
                        a4d0VarC2 = y3d0Var.d;
                    } else if ((i6 & 4) == 4) {
                        a4d0VarC2 = roi0Var.c(y3d0Var.e);
                    } else {
                        a4d0VarC2 = null;
                    }
                    if (a4d0VarC2 == null) {
                        q4m0Var2 = new q4m0(f2o.c(c2o.B, y3d0Var.toString()));
                    } else {
                        q4m0Var = new q4m0(d0(a4d0VarC2), t3u0Var);
                        q4m0Var2 = q4m0Var;
                    }
                } else if (hzs0Var == null) {
                    q4m0Var2 = new p4m0(((ym40) f6iVar.f).c());
                } else {
                    q4m0Var = new q4m0(hzs0Var);
                    q4m0Var2 = q4m0Var;
                }
                arrayList.add(q4m0Var2);
                i3 = i5;
                i2 = 1;
            }
            Object obj2 = null;
            listL0 = CollectionsKt.L0(arrayList);
            foc focVarN3 = iys0VarD.n();
            if (z || !(focVarN3 instanceof tfk)) {
                zBooleanValue = njq.f23648a.e(a4d0Var.q).booleanValue();
                z2 = a4d0Var.e;
                if (zBooleanValue) {
                    size = iys0VarD.getParameters().size() - listL0.size();
                    if (size == 0) {
                        kzj0VarG1 = ucx.g0(ays0VarC0, iys0VarD, listL0, z2);
                        focVarN = kzj0VarG1.S().n();
                        if (focVarN == null && (focVarN instanceof wm40) && ary.K(focVarN)) {
                            int i8 = rek.f30339a;
                            twq twqVarF = oek.f(focVarN);
                            twqVarF.getClass();
                            werVarS = bfb.S(twqVarF);
                        } else {
                            werVarS = null;
                        }
                        if (Intrinsics.d(werVarS, ser.d) || (pzs0Var = (pzs0) CollectionsKt.f0(bfb.W(kzj0VarG1))) == null || (wsyVarB = pzs0Var.b()) == null) {
                            kzj0VarE = null;
                        } else {
                            focVarN2 = wsyVarB.S().n();
                            if (focVarN2 != null) {
                                swqVarG = rek.g(focVarN2);
                            } else {
                                swqVarG = null;
                            }
                            if (wsyVarB.J().size() == 1 || !(Intrinsics.d(swqVarG, j4m0.g) || Intrinsics.d(swqVarG, oys0.f26073a))) {
                                kzj0VarE = kzj0VarG1;
                            } else {
                                wsy wsyVarB2 = ((pzs0) CollectionsKt.v0(wsyVarB.J())).b();
                                wsyVarB2.getClass();
                                kp9 kp9Var = vjjVar instanceof kp9 ? (kp9) vjjVar : null;
                                kzj0VarE = Intrinsics.d(kp9Var != null ? rek.c(kp9Var) : null, zmn0.f44634a) ? s(kzj0VarG1, wsyVarB2) : s(kzj0VarG1, wsyVarB2);
                            }
                        }
                    } else if (size != 1 && (size2 = listL0.size() - 1) >= 0) {
                        iys0 iys0VarH = iys0VarD.c().w(size2).h();
                        iys0VarH.getClass();
                        kzj0VarE = ucx.g0(ays0VarC0, iys0VarH, listL0, z2);
                    } else {
                        kzj0VarE = null;
                    }
                    if (kzj0VarE == null) {
                        f2o f2oVar5 = f2o.f8821a;
                        kzj0VarG0 = f2o.e(c2o.q, listL0, iys0VarD, new String[0]);
                    } else {
                        kzj0VarG0 = kzj0VarE;
                    }
                } else {
                    kzj0VarG0 = ucx.g0(ays0VarC0, iys0VarD, listL0, z2);
                    if (njq.b.e(a4d0Var.q).booleanValue()) {
                        kzj0VarE = kud.e(kzj0VarG0, true);
                        if (kzj0VarE == null) {
                            e9d0.y(kzj0VarG0, "null DefinitelyNotNullType for '");
                            return null;
                        }
                        kzj0VarG0 = kzj0VarE;
                    }
                }
            } else {
                tfk tfkVar = (tfk) focVarN3;
                listL0.getClass();
                wxs0 wxs0Var = new wxs0(b);
                List parameters2 = tfkVar.i.getParameters();
                ArrayList arrayList2 = new ArrayList(r3d.q(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((hzs0) it2.next()).o1());
                }
                h0q0 h0q0Var = new h0q0(obj2, tfkVar, listL0, xp20.m(CollectionsKt.T0(arrayList2, listL0)));
                ays0.b.getClass();
                ays0 ays0Var = ays0.c;
                ays0Var.getClass();
                kzj0 kzj0VarE2 = wxs0Var.e(h0q0Var, ays0Var, false, 0, true);
                List list = (List) f6iVar.t;
                ArrayList arrayListO0 = CollectionsKt.o0(vekVar, kzj0VarE2.getAnnotations());
                kzj0VarG0 = kzj0VarE2.k0(e0t0.e(kzj0VarE2) || a4d0Var.e).m0(c0(list, arrayListO0.isEmpty() ? ujn.c : new i93(arrayListO0, (byte) 0)));
            }
            i4 = a4d0Var.c;
            if ((i4 & 1024) == 1024) {
                a4d0VarC = a4d0Var.o;
            } else if ((i4 & 2048) == 2048) {
                a4d0VarC = roi0Var.c(a4d0Var.p);
            } else {
                a4d0VarC = null;
            }
            return (a4d0VarC != null || (kzj0VarL = q7x.L(kzj0VarG0, Z(a4d0VarC, false))) == null) ? kzj0VarG0 : kzj0VarL;
        }
        focVarE0 = (foc) ((xg) this.f).invoke(Integer.valueOf(a4d0Var.i));
        if (focVarE0 == null) {
            focVarE0 = e0(this, a4d0Var, a4d0Var.i);
        }
        iys0VarD = focVarE0.h();
        iys0VarD.getClass();
        i2 = 1;
        if (f2o.f(iys0VarD.n())) {
            f2o f2oVar6 = f2o.f8821a;
            return f2o.e(c2o.w, iun.f15405a, iys0VarD, (String[]) Arrays.copyOf(new String[]{iys0VarD.toString()}, 1));
        }
        vek vekVar2 = new vek((eu00) f6iVar.e, new ywm0(this, a4d0Var, (byte) 23));
        ays0VarC0 = c0((List) f6iVar.t, vekVar2);
        ArrayList arrayListA1 = a0(a4d0Var, this);
        arrayList = new ArrayList(r3d.q(arrayListA1, 10));
        i3 = 0;
        while (r11.hasNext()) {
            i5 = i3 + 1;
            if (i3 >= 0) {
                q3d.p();
                throw null;
            }
            y3d0Var = (y3d0) obj;
            List parameters3 = iys0VarD.getParameters();
            parameters3.getClass();
            hzs0Var = (hzs0) CollectionsKt.W(i3, parameters3);
            x3d0Var = y3d0Var.c;
            if (x3d0Var == x3d0.STAR) {
                x3d0Var.getClass();
                iOrdinal = x3d0Var.ordinal();
                if (iOrdinal != 0) {
                    t3u0Var = t3u0.d;
                } else if (iOrdinal != i2) {
                    t3u0Var = t3u0.e;
                } else {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            t9f.b();
                            return null;
                        }
                        e9d0.i(x3d0Var, "Only IN, OUT and INV are supported. Actual argument: ");
                        return null;
                    }
                    t3u0Var = t3u0.c;
                }
                i6 = y3d0Var.b;
                if ((i6 & 2) == 2) {
                    a4d0VarC2 = y3d0Var.d;
                } else if ((i6 & 4) == 4) {
                    a4d0VarC2 = roi0Var.c(y3d0Var.e);
                } else {
                    a4d0VarC2 = null;
                }
                if (a4d0VarC2 == null) {
                    q4m0Var2 = new q4m0(f2o.c(c2o.B, y3d0Var.toString()));
                } else {
                    q4m0Var = new q4m0(d0(a4d0VarC2), t3u0Var);
                    q4m0Var2 = q4m0Var;
                }
            } else if (hzs0Var == null) {
                q4m0Var2 = new p4m0(((ym40) f6iVar.f).c());
            } else {
                q4m0Var = new q4m0(hzs0Var);
                q4m0Var2 = q4m0Var;
            }
            arrayList.add(q4m0Var2);
            i3 = i5;
            i2 = 1;
        }
        Object obj3 = null;
        listL0 = CollectionsKt.L0(arrayList);
        foc focVarN4 = iys0VarD.n();
        if (z) {
            zBooleanValue = njq.f23648a.e(a4d0Var.q).booleanValue();
            z2 = a4d0Var.e;
            if (zBooleanValue) {
                size = iys0VarD.getParameters().size() - listL0.size();
                if (size == 0) {
                    kzj0VarG1 = ucx.g0(ays0VarC0, iys0VarD, listL0, z2);
                    focVarN = kzj0VarG1.S().n();
                    if (focVarN == null) {
                        werVarS = null;
                    } else {
                        werVarS = null;
                    }
                    if (Intrinsics.d(werVarS, ser.d)) {
                        kzj0VarE = null;
                    } else {
                        focVarN2 = wsyVarB.S().n();
                        if (focVarN2 != null) {
                            swqVarG = rek.g(focVarN2);
                        } else {
                            swqVarG = null;
                        }
                        if (wsyVarB.J().size() == 1) {
                            kzj0VarE = kzj0VarG1;
                        } else {
                            kzj0VarE = kzj0VarG1;
                        }
                    }
                } else if (size != 1) {
                    kzj0VarE = null;
                } else {
                    iys0 iys0VarH2 = iys0VarD.c().w(size2).h();
                    iys0VarH2.getClass();
                    kzj0VarE = ucx.g0(ays0VarC0, iys0VarH2, listL0, z2);
                }
                if (kzj0VarE == null) {
                    f2o f2oVar7 = f2o.f8821a;
                    kzj0VarG0 = f2o.e(c2o.q, listL0, iys0VarD, new String[0]);
                } else {
                    kzj0VarG0 = kzj0VarE;
                }
            } else {
                kzj0VarG0 = ucx.g0(ays0VarC0, iys0VarD, listL0, z2);
                if (njq.b.e(a4d0Var.q).booleanValue()) {
                    kzj0VarE = kud.e(kzj0VarG0, true);
                    if (kzj0VarE == null) {
                        e9d0.y(kzj0VarG0, "null DefinitelyNotNullType for '");
                        return null;
                    }
                    kzj0VarG0 = kzj0VarE;
                }
            }
        } else {
            zBooleanValue = njq.f23648a.e(a4d0Var.q).booleanValue();
            z2 = a4d0Var.e;
            if (zBooleanValue) {
                size = iys0VarD.getParameters().size() - listL0.size();
                if (size == 0) {
                    kzj0VarG1 = ucx.g0(ays0VarC0, iys0VarD, listL0, z2);
                    focVarN = kzj0VarG1.S().n();
                    if (focVarN == null) {
                        werVarS = null;
                    } else {
                        werVarS = null;
                    }
                    if (Intrinsics.d(werVarS, ser.d)) {
                        kzj0VarE = null;
                    } else {
                        focVarN2 = wsyVarB.S().n();
                        if (focVarN2 != null) {
                            swqVarG = rek.g(focVarN2);
                        } else {
                            swqVarG = null;
                        }
                        if (wsyVarB.J().size() == 1) {
                            kzj0VarE = kzj0VarG1;
                        } else {
                            kzj0VarE = kzj0VarG1;
                        }
                    }
                } else if (size != 1) {
                    kzj0VarE = null;
                } else {
                    iys0 iys0VarH3 = iys0VarD.c().w(size2).h();
                    iys0VarH3.getClass();
                    kzj0VarE = ucx.g0(ays0VarC0, iys0VarH3, listL0, z2);
                }
                if (kzj0VarE == null) {
                    f2o f2oVar8 = f2o.f8821a;
                    kzj0VarG0 = f2o.e(c2o.q, listL0, iys0VarD, new String[0]);
                } else {
                    kzj0VarG0 = kzj0VarE;
                }
            } else {
                kzj0VarG0 = ucx.g0(ays0VarC0, iys0VarD, listL0, z2);
                if (njq.b.e(a4d0Var.q).booleanValue()) {
                    kzj0VarE = kud.e(kzj0VarG0, true);
                    if (kzj0VarE == null) {
                        e9d0.y(kzj0VarG0, "null DefinitelyNotNullType for '");
                        return null;
                    }
                    kzj0VarG0 = kzj0VarE;
                }
            }
        }
        i4 = a4d0Var.c;
        if ((i4 & 1024) == 1024) {
            a4d0VarC = a4d0Var.o;
        } else if ((i4 & 2048) == 2048) {
            a4d0VarC = roi0Var.c(a4d0Var.p);
        } else {
            a4d0VarC = null;
        }
        if (a4d0VarC != null) {
        }
    }

    public AuthenticatorScreenFactoryImpl$registrationOnboardingScreen$1 b() {
        return rek0.l(((lp4) this.c).m());
    }

    public void b0(Set set) {
        fuj0 fuj0Var = (fuj0) this.h;
        long j2 = ((ktk0) ((jtk0) ((dpi0) ((hnu) this.g).f13365a).f6468a).f17105a.getValue()).b;
        if (j2 == -321 || set.contains(Long.valueOf(j2))) {
            fuj0Var.z(j2);
        } else {
            fuj0Var.z(-321L);
        }
    }

    public AuthenticatorScreenFactoryImpl$authenticatorScreen$1 c() {
        return rek0.b(((lp4) this.c).m(), mq4.f22204a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:12:0x0078  */
    @Override // a.lfn0
    public void d(byte[] bArr, int i2, int i3, kfn0 kfn0Var, rbe rbeVar) {
        ftf ftfVar;
        ifn ifnVar;
        SparseArray sparseArray;
        int i4;
        Paint paint;
        int i5;
        ifn ifnVar2;
        int i6;
        int iG;
        int i7;
        int i8;
        qgd qgdVar = this;
        Paint paint2 = (Paint) qgdVar.c;
        q8b q8bVar = new q8b(bArr, i2 + i3);
        q8bVar.m(i2);
        Canvas canvas = (Canvas) qgdVar.d;
        kfn kfnVar = (kfn) qgdVar.g;
        SparseArray sparseArray2 = kfnVar.f;
        SparseArray sparseArray3 = kfnVar.g;
        int i9 = kfnVar.b;
        SparseArray sparseArray4 = kfnVar.c;
        SparseArray sparseArray5 = kfnVar.d;
        SparseArray sparseArray6 = kfnVar.e;
        int i10 = kfnVar.f18203a;
        while (q8bVar.b() >= 48 && q8bVar.g(8) == 15) {
            int iG2 = q8bVar.g(8);
            int iG3 = q8bVar.g(16);
            int iG4 = q8bVar.g(16);
            int iD = q8bVar.d() + iG4;
            if (iG4 * 8 > q8bVar.b()) {
                f1t0.g0("DvbParser", "Data field length exceeds limit");
                q8bVar.o(q8bVar.b());
                sparseArray = sparseArray3;
                i4 = i9;
                paint = paint2;
                i5 = i10;
            } else {
                switch (iG2) {
                    case 16:
                        sparseArray = sparseArray3;
                        i4 = i9;
                        paint = paint2;
                        if (iG3 == i10) {
                            cf60 cf60Var = kfnVar.i;
                            int i11 = 8;
                            q8bVar.g(8);
                            int iG5 = q8bVar.g(4);
                            int iG6 = q8bVar.g(2);
                            q8bVar.o(2);
                            int i12 = iG4 - 2;
                            SparseArray sparseArray7 = new SparseArray();
                            while (i12 > 0) {
                                int iG7 = q8bVar.g(i11);
                                q8bVar.o(i11);
                                sparseArray7.put(iG7, new hfn(q8bVar.g(16), q8bVar.g(16)));
                                i10 = i10;
                                i12 -= 6;
                                i11 = 8;
                            }
                            i5 = i10;
                            cf60 cf60Var2 = new cf60((byte) 4, iG5, iG6, sparseArray7);
                            if (iG6 != 0) {
                                kfnVar.i = cf60Var2;
                                sparseArray4.clear();
                                sparseArray5.clear();
                                sparseArray6.clear();
                            } else if (cf60Var != null && cf60Var.b != iG5) {
                                kfnVar.i = cf60Var2;
                            }
                        } else {
                            i5 = i10;
                        }
                        break;
                    case 17:
                        cf60 cf60Var3 = kfnVar.i;
                        if (iG3 != i10 || cf60Var3 == null) {
                            sparseArray = sparseArray3;
                            i4 = i9;
                            paint = paint2;
                        } else {
                            int iG8 = q8bVar.g(8);
                            q8bVar.o(4);
                            boolean zF = q8bVar.f();
                            q8bVar.o(3);
                            int iG9 = q8bVar.g(16);
                            int iG10 = q8bVar.g(16);
                            q8bVar.g(3);
                            int iG11 = q8bVar.g(3);
                            int i13 = 2;
                            q8bVar.o(2);
                            int iG12 = q8bVar.g(8);
                            int iG13 = q8bVar.g(8);
                            int iG14 = q8bVar.g(4);
                            int iG15 = q8bVar.g(2);
                            q8bVar.o(2);
                            int i14 = iG4 - 10;
                            SparseArray sparseArray8 = new SparseArray();
                            while (i14 > 0) {
                                int i15 = i9;
                                int i16 = i14;
                                int iG16 = q8bVar.g(16);
                                int iG17 = q8bVar.g(i13);
                                q8bVar.g(i13);
                                Paint paint3 = paint2;
                                int iG18 = q8bVar.g(12);
                                SparseArray sparseArray9 = sparseArray3;
                                q8bVar.o(4);
                                int iG19 = q8bVar.g(12);
                                int i17 = i16 - 6;
                                if (iG17 == 1 || iG17 == 2) {
                                    q8bVar.g(8);
                                    q8bVar.g(8);
                                    i17 = i16 - 8;
                                }
                                sparseArray8.put(iG16, new jfn(iG18, iG19));
                                i14 = i17;
                                i9 = i15;
                                paint2 = paint3;
                                sparseArray3 = sparseArray9;
                                i13 = 2;
                            }
                            sparseArray = sparseArray3;
                            i4 = i9;
                            paint = paint2;
                            ifn ifnVar3 = new ifn(iG8, zF, iG9, iG10, iG11, iG12, iG13, iG14, iG15, sparseArray8);
                            if (cf60Var3.c == 0 && (ifnVar2 = (ifn) sparseArray4.get(iG8)) != null) {
                                SparseArray sparseArray10 = ifnVar2.j;
                                for (int i18 = 0; i18 < sparseArray10.size(); i18++) {
                                    ifnVar3.j.put(sparseArray10.keyAt(i18), (jfn) sparseArray10.valueAt(i18));
                                }
                            }
                            sparseArray4.put(ifnVar3.f14696a, ifnVar3);
                        }
                        i5 = i10;
                        break;
                    case 18:
                        if (iG3 == i10) {
                            ffn ffnVarQ = Q(q8bVar, iG4);
                            sparseArray5.put(ffnVarQ.f9454a, ffnVarQ);
                        } else if (iG3 == i9) {
                            ffn ffnVarQ2 = Q(q8bVar, iG4);
                            sparseArray2.put(ffnVarQ2.f9454a, ffnVarQ2);
                        }
                        sparseArray = sparseArray3;
                        i4 = i9;
                        paint = paint2;
                        i5 = i10;
                        break;
                    case ConnectionResult.SERVICE_MISSING_PERMISSION /* 19 */:
                        if (iG3 == i10) {
                            gfn gfnVarR = R(q8bVar);
                            sparseArray6.put(gfnVarR.f11215a, gfnVarR);
                        } else if (iG3 == i9) {
                            gfn gfnVarR2 = R(q8bVar);
                            sparseArray3.put(gfnVarR2.f11215a, gfnVarR2);
                        }
                        sparseArray = sparseArray3;
                        i4 = i9;
                        paint = paint2;
                        i5 = i10;
                        break;
                    case 20:
                        if (iG3 == i10) {
                            q8bVar.o(4);
                            boolean zF2 = q8bVar.f();
                            q8bVar.o(3);
                            int iG20 = q8bVar.g(16);
                            int iG21 = q8bVar.g(16);
                            if (zF2) {
                                int iG22 = q8bVar.g(16);
                                int iG23 = q8bVar.g(16);
                                int iG24 = q8bVar.g(16);
                                i6 = iG23;
                                iG = q8bVar.g(16);
                                i8 = iG24;
                                i7 = iG22;
                            } else {
                                i6 = iG20;
                                iG = iG21;
                                i7 = 0;
                                i8 = 0;
                            }
                            kfnVar.h = new b930(iG20, iG21, i7, i6, i8, iG);
                        }
                        sparseArray = sparseArray3;
                        i4 = i9;
                        paint = paint2;
                        i5 = i10;
                        break;
                    default:
                        sparseArray = sparseArray3;
                        i4 = i9;
                        paint = paint2;
                        i5 = i10;
                        break;
                }
                q8bVar.p(iD - q8bVar.d());
            }
            i10 = i5;
            i9 = i4;
            paint2 = paint;
            sparseArray3 = sparseArray;
        }
        SparseArray sparseArray11 = sparseArray3;
        Paint paint4 = paint2;
        cf60 cf60Var4 = kfnVar.i;
        if (cf60Var4 == null) {
            v3x v3xVar = b4x.b;
            ftfVar = new ftf(-9223372036854775807L, -9223372036854775807L, rcf0.e);
        } else {
            b930 b930Var = kfnVar.h;
            if (b930Var == null) {
                b930Var = (b930) qgdVar.e;
            }
            int i19 = b930Var.b;
            int i20 = b930Var.f2188a;
            Bitmap bitmap = (Bitmap) qgdVar.h;
            if (bitmap == null || i20 + 1 != bitmap.getWidth() || i19 + 1 != ((Bitmap) qgdVar.h).getHeight()) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i20 + 1, i19 + 1, Bitmap.Config.ARGB_8888);
                qgdVar.h = bitmapCreateBitmap;
                canvas.setBitmap(bitmapCreateBitmap);
            }
            ArrayList arrayList = new ArrayList();
            SparseArray sparseArray12 = (SparseArray) cf60Var4.d;
            int i21 = 0;
            while (i21 < sparseArray12.size()) {
                canvas.save();
                hfn hfnVar = (hfn) sparseArray12.valueAt(i21);
                ifn ifnVar4 = (ifn) sparseArray4.get(sparseArray12.keyAt(i21));
                int i22 = hfnVar.f12980a + b930Var.c;
                int i23 = hfnVar.b + b930Var.e;
                int i24 = ifnVar4.c;
                int i25 = ifnVar4.f;
                SparseArray sparseArray13 = sparseArray12;
                int i26 = ifnVar4.d;
                int i27 = i19;
                int i28 = i22 + i24;
                int i29 = i20;
                SparseArray sparseArray14 = sparseArray4;
                int i30 = i23 + i26;
                int i31 = i21;
                canvas.clipRect(i22, i23, Math.min(i28, b930Var.d), Math.min(i30, b930Var.f));
                ffn ffnVar = (ffn) sparseArray5.get(i25);
                if (ffnVar == null && (ffnVar = (ffn) sparseArray2.get(i25)) == null) {
                    ffnVar = (ffn) qgdVar.f;
                }
                int[] iArr = ffnVar.b;
                int[] iArr2 = ffnVar.c;
                int[] iArr3 = ffnVar.d;
                b930 b930Var2 = b930Var;
                SparseArray sparseArray15 = ifnVar4.j;
                SparseArray sparseArray16 = sparseArray2;
                int i32 = 0;
                while (i32 < sparseArray15.size()) {
                    int iKeyAt = sparseArray15.keyAt(i32);
                    SparseArray sparseArray17 = sparseArray15;
                    jfn jfnVar = (jfn) sparseArray15.valueAt(i32);
                    gfn gfnVar = (gfn) sparseArray6.get(iKeyAt);
                    int i33 = i32;
                    sparseArray11 = sparseArray11;
                    if (gfnVar == null) {
                        gfnVar = (gfn) sparseArray11.get(iKeyAt);
                    }
                    gfn gfnVar2 = gfnVar;
                    if (gfnVar2 != null) {
                        Paint paint5 = gfnVar2.b ? null : (Paint) qgdVar.b;
                        ifn ifnVar5 = ifnVar4;
                        int i34 = ifnVar5.e;
                        int i35 = jfnVar.f16436a + i22;
                        int i36 = jfnVar.b + i23;
                        int[] iArr4 = i34 == 3 ? iArr3 : i34 == 2 ? iArr2 : iArr;
                        ifnVar = ifnVar5;
                        P(gfnVar2.c, iArr4, i34, i35, i36, paint5, canvas);
                        P(gfnVar2.d, iArr4, i34, i35, i36 + 1, paint5, canvas);
                    } else {
                        sparseArray6 = sparseArray6;
                        ifnVar = ifnVar4;
                    }
                    qgdVar = this;
                    i22 = i22;
                    i23 = i23;
                    ifnVar4 = ifnVar;
                    i32 = i33 + 1;
                    i26 = i26;
                    sparseArray15 = sparseArray17;
                    iArr2 = iArr2;
                    sparseArray6 = sparseArray6;
                    i24 = i24;
                }
                int i37 = i26;
                SparseArray sparseArray18 = sparseArray6;
                int i38 = i23;
                ifn ifnVar6 = ifnVar4;
                int i39 = i22;
                int i40 = i24;
                int[] iArr5 = iArr2;
                if (ifnVar6.b) {
                    int i41 = ifnVar6.e;
                    paint4.setColor(i41 == 3 ? iArr3[ifnVar6.g] : i41 == 2 ? iArr5[ifnVar6.h] : iArr[ifnVar6.i]);
                    canvas.drawRect(i39, i38, i28, i30, paint4);
                } else {
                    paint4 = paint4;
                }
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap((Bitmap) this.h, i39, i38, i40, i37);
                float f = i29;
                float f2 = i39 / f;
                float f3 = i38;
                float f4 = i27;
                arrayList.add(new ctf(null, null, null, bitmapCreateBitmap2, f3 / f4, 0, 0, f2, 0, Integer.MIN_VALUE, -3.4028235E38f, i40 / f, i37 / f4, false, -16777216, Integer.MIN_VALUE, 0.0f, 0));
                canvas.drawColor(0, PorterDuff.Mode.CLEAR);
                canvas.restore();
                qgdVar = this;
                paint4 = paint4;
                sparseArray5 = sparseArray5;
                i19 = i27;
                i20 = i29;
                arrayList = arrayList;
                sparseArray12 = sparseArray13;
                sparseArray4 = sparseArray14;
                sparseArray2 = sparseArray16;
                sparseArray6 = sparseArray18;
                i21 = i31 + 1;
                b930Var = b930Var2;
            }
            ftfVar = new ftf(-9223372036854775807L, -9223372036854775807L, arrayList);
        }
        rbeVar.accept(ftfVar);
    }

    public wsy d0(a4d0 a4d0Var) {
        a4d0 a4d0VarC;
        g45 g45Var = (g45) this.b;
        a4d0Var.getClass();
        if ((a4d0Var.c & 2) != 2) {
            return Z(a4d0Var, true);
        }
        String string = ((h950) g45Var.b).getString(a4d0Var.f);
        kzj0 kzj0VarZ = Z(a4d0Var, true);
        roi0 roi0Var = (roi0) g45Var.d;
        int i2 = a4d0Var.c;
        if ((i2 & 4) == 4) {
            a4d0VarC = a4d0Var.g;
        } else {
            a4d0VarC = (i2 & 8) == 8 ? roi0Var.c(a4d0Var.h) : null;
        }
        a4d0VarC.getClass();
        return ((lkq) ((f6i) g45Var.f10647a).l).h0(a4d0Var, string, kzj0VarZ, Z(a4d0VarC, true));
    }

    public SettingsScreenFactoryImpl$getScreen$1 f0() {
        return pmi0.b((pmi0) this.g, false);
    }

    public BindPhoneNumberScreen g() {
        return new BindPhoneNumberScreen(new i38(17));
    }

    public VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen g0() {
        drm0 drm0VarK = ((es) ((ilp0) this.e).f14992a).k();
        svs0 svs0Var = mbu0.b;
        return new VerificationStatusScreens$AdditionalVerificationStatusFragmentScreen(0, (r9u) drm0VarK.f6568a);
    }

    public BindPhoneNumberScreen h(boolean z) {
        int i2 = !z ? 10 : 11;
        return new BindPhoneNumberScreen(z ? new j38(i2) : new i38(i2));
    }

    public h55 i() {
        String strConcat = ((Size) this.b) == null ? " resolution" : "";
        if (((Size) this.c) == null) {
            strConcat = strConcat.concat(" originalConfiguredResolution");
        }
        if (((agn) this.d) == null) {
            strConcat = strConcat.concat(" dynamicRange");
        }
        if (((Integer) this.e) == null) {
            strConcat = strConcat.concat(" sessionType");
        }
        if (((Range) this.f) == null) {
            strConcat = strConcat.concat(" expectedFrameRateRange");
        }
        if (((Boolean) this.h) == null) {
            strConcat = strConcat.concat(" zslDisabled");
        }
        if (strConcat.isEmpty()) {
            return new h55((Size) this.b, (Size) this.c, (agn) this.d, ((Integer) this.e).intValue(), (Range) this.f, (drd) this.g, ((Boolean) this.h).booleanValue());
        }
        jf4.n("Missing required properties:".concat(strConcat));
        return null;
    }

    @Override // a.dgd
    public synchronized p5d0 l(jkd0 jkd0Var) {
        g1x.q(jkd0Var, "Null interface requested.");
        return (p5d0) ((HashMap) this.c).get(jkd0Var);
    }

    public boolean n() {
        List listL;
        n660 n660Var = (n660) this.e;
        List listL2 = n660Var.l(true);
        return (listL2 == null || listL2.isEmpty()) && ((listL = n660Var.l(false)) == null || listL.isEmpty());
    }

    @Override // a.dgd
    public synchronized p5d0 o(jkd0 jkd0Var) {
        sdz sdzVar = (sdz) ((HashMap) this.d).get(jkd0Var);
        if (sdzVar != null) {
            return sdzVar;
        }
        return i;
    }

    public ChangePhoneNumberScreen p() {
        return new ChangePhoneNumberScreen(tqb.f34372a);
    }

    @Override // a.dgd
    public y680 q(jkd0 jkd0Var) {
        p5d0 p5d0VarL = l(jkd0Var);
        if (p5d0VarL == null) {
            return new y680(y680.c, y680.d);
        }
        return p5d0VarL instanceof y680 ? (y680) p5d0VarL : new y680(null, p5d0VarL);
    }

    public boolean r() {
        Object value;
        if (((Number) vtb.N(((dkj) this.d).f6232a.l.f30868a).f40549a.getValue()).longValue() == -1 || C() > 0) {
            return false;
        }
        p7m0 p7m0Var = ((epc) this.f).f8179a.l.f30868a;
        do {
            value = p7m0Var.getValue();
            ((Number) value).longValue();
        } while (!p7m0Var.m(value, -1L));
        return true;
    }

    @Override // a.lfn0
    public void reset() {
        kfn kfnVar = (kfn) this.g;
        kfnVar.c.clear();
        kfnVar.d.clear();
        kfnVar.e.clear();
        kfnVar.f.clear();
        kfnVar.g.clear();
        kfnVar.h = null;
        kfnVar.i = null;
    }

    public void t(HashMap map, boolean z) {
        ArrayDeque arrayDeque;
        for (Map.Entry entry : map.entrySet()) {
            pfd pfdVar = (pfd) entry.getKey();
            p5d0 p5d0Var = (p5d0) entry.getValue();
            byte b = pfdVar.d;
            if (b == 1 || (b == 2 && z)) {
                p5d0Var.get();
            }
        }
        nao naoVar = (nao) this.f;
        synchronized (naoVar) {
            try {
                arrayDeque = naoVar.b;
                if (arrayDeque != null) {
                    naoVar.b = null;
                } else {
                    arrayDeque = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayDeque != null) {
            Iterator it = arrayDeque.iterator();
            if (it.hasNext()) {
                throw rw2.h(it);
            }
        }
    }

    public String toString() {
        switch (this.f28679a) {
            case 20:
                String str = (String) this.d;
                qgd qgdVar = (qgd) this.c;
                return str.concat(qgdVar == null ? "" : ". Child of ".concat((String) qgdVar.d));
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public Object w(long j2, zje zjeVar, String str) {
        ue1 ue1Var;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof ue1) {
            ue1Var = (ue1) zjeVar;
            int i2 = ue1Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ue1Var.k = i2 - Integer.MIN_VALUE;
            } else {
                ue1Var = new ue1(this, zjeVar);
            }
        } else {
            ue1Var = new ue1(this, zjeVar);
        }
        ue1 ue1Var2 = ue1Var;
        Object objE = ue1Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = ue1Var2.k;
        if (i3 == 0) {
            z1x.P(objE);
            xex xexVar = (xex) this.e;
            knf0Var.getClass();
            String strC = knf0Var.c();
            ue1Var2.k = 1;
            objE = ((bx0) ((nc) xexVar.b).invoke()).e(str, "application/vnd.xenvelop+json", j2, strC, 22, new fk9(false), ue1Var2);
            if (objE == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objE);
        }
        nl nlVar = (nl) objE;
        nlVar.getClass();
        ll llVar = nlVar.f23704a;
        if (llVar == null) {
            jf4.k(null);
            return null;
        }
        Long l2 = llVar.f20224a;
        long jLongValue = l2 != null ? l2.longValue() : 0L;
        Double d = llVar.b;
        double dDoubleValue = d != null ? d.doubleValue() : 0.0d;
        String str2 = llVar.c;
        if (str2 == null) {
            str2 = "";
        }
        return new hl(jLongValue, dDoubleValue, str2);
    }

    public rrc x() {
        return new rrc(new dpi0((xxn0) this.h), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public Object z(long j2, zje zjeVar) {
        ve1 ve1Var;
        knf0 knf0Var = (knf0) this.d;
        if (zjeVar instanceof ve1) {
            ve1Var = (ve1) zjeVar;
            int i2 = ve1Var.k;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ve1Var.k = i2 - Integer.MIN_VALUE;
            } else {
                ve1Var = new ve1(this, zjeVar);
            }
        } else {
            ve1Var = new ve1(this, zjeVar);
        }
        ve1 ve1Var2 = ve1Var;
        Object objH = ve1Var2.i;
        wne wneVar = wne.f39444a;
        int i3 = ve1Var2.k;
        if (i3 == 0) {
            z1x.P(objH);
            xex xexVar = (xex) this.e;
            String strA = ((btt0) this.f).a();
            knf0Var.getClass();
            String strC = knf0Var.c();
            ve1Var2.k = 1;
            objH = ((bx0) ((nc) xexVar.b).invoke()).h(strA, j2, strC, 22, "application/vnd.xenvelop+json", new fk9(false), ve1Var2);
            if (objH == wneVar) {
                return wneVar;
            }
        } else {
            if (i3 != 1) {
                jf4.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z1x.P(objH);
        }
        ae8 ae8Var = (ae8) objH;
        ae8Var.getClass();
        yd8 yd8Var = ae8Var.f715a;
        if (yd8Var != null) {
            Integer num = yd8Var.f42420a;
            return new toe(num != null ? num.intValue() : 0);
        }
        jf4.k(null);
        return null;
    }

    public /* synthetic */ qgd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
        this.f28679a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.h = obj7;
    }

    public qgd(String str, String str2, Set set) {
        this.f28679a = (byte) 4;
        Set setUnmodifiableSet = set == null ? Collections.EMPTY_SET : Collections.unmodifiableSet(set);
        this.b = setUnmodifiableSet;
        Map map = Collections.EMPTY_MAP;
        this.d = map;
        this.e = str;
        this.f = str2;
        this.g = cuj0.f4988a;
        HashSet hashSet = new HashSet(setUnmodifiableSet);
        Iterator it = map.values().iterator();
        if (!it.hasNext()) {
            this.c = Collections.unmodifiableSet(hashSet);
            return;
        }
        throw rw2.h(it);
    }

    public qgd(xyt xytVar, x1u x1uVar, qf9 qf9Var, a6u a6uVar, rf9 rf9Var, pru pruVar, rou rouVar) {
        this.f28679a = (byte) 13;
        xytVar.getClass();
        pruVar.getClass();
        rouVar.getClass();
        this.b = xytVar;
        this.c = x1uVar;
        this.d = qf9Var;
        this.e = a6uVar;
        this.f = rf9Var;
        this.g = pruVar;
        this.h = rouVar;
    }

    public qgd(rtu rtuVar, ieu ieuVar, uzc uzcVar, n660 n660Var, v7i v7iVar, wsc wscVar, pru pruVar) {
        this.f28679a = (byte) 14;
        this.b = rtuVar;
        this.c = ieuVar;
        this.d = uzcVar;
        this.e = n660Var;
        this.f = v7iVar;
        this.g = wscVar;
        this.h = maz.b(new b6u(pruVar, (byte) 8));
    }

    public qgd(w5z w5zVar, uzc uzcVar, b3c0 b3c0Var, gst0 gst0Var, v7i v7iVar, t4v t4vVar, yqc yqcVar) {
        this.f28679a = (byte) 15;
        uzcVar.getClass();
        b3c0Var.getClass();
        gst0Var.getClass();
        this.b = w5zVar;
        this.c = uzcVar;
        this.d = b3c0Var;
        this.e = gst0Var;
        this.f = v7iVar;
        this.g = t4vVar;
        this.h = yqcVar;
    }

    public qgd(ali aliVar, n4u n4uVar, xoc xocVar, ep0 ep0Var, pru pruVar, wti wtiVar, wyu wyuVar) {
        this.f28679a = (byte) 12;
        wyuVar.getClass();
        this.b = aliVar;
        this.c = n4uVar;
        this.d = xocVar;
        this.e = ep0Var;
        this.f = pruVar;
        this.g = wtiVar;
        this.h = wyuVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public qgd(g45 g45Var, qgd qgdVar, List list, String str, String str2) {
        Map linkedHashMap;
        this.f28679a = (byte) 20;
        list.getClass();
        this.b = g45Var;
        this.c = qgdVar;
        this.d = str;
        this.e = str2;
        f6i f6iVar = (f6i) g45Var.f10647a;
        int i2 = 0;
        this.f = ((eu00) f6iVar.e).d(new mys0(this, 0 == true ? 1 : 0));
        this.g = ((eu00) f6iVar.e).d(new mys0(this, (byte) 1));
        if (list.isEmpty()) {
            linkedHashMap = lun.f20680a;
            linkedHashMap.getClass();
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                f4d0 f4d0Var = (f4d0) it.next();
                linkedHashMap.put(Integer.valueOf(f4d0Var.d), new ufk((g45) this.b, f4d0Var, i2));
                i2++;
            }
        }
        this.h = linkedHashMap;
    }

    public qgd(jvq jvqVar, qu quVar, v88 v88Var, kj5 kj5Var, lme0 lme0Var, eke0 eke0Var, lp4 lp4Var, o470 o470Var, jh70 jh70Var, nv20 nv20Var, ilp0 ilp0Var, mi70 mi70Var, pmi0 pmi0Var, wxs0 wxs0Var, zie0 zie0Var, bu90 bu90Var, cl5 cl5Var) {
        this.f28679a = (byte) 19;
        lp4Var.getClass();
        this.b = jvqVar;
        this.c = lp4Var;
        this.d = jh70Var;
        this.e = ilp0Var;
        this.f = mi70Var;
        this.g = pmi0Var;
        this.h = bu90Var;
    }

    public qgd(he1 he1Var, xzp xzpVar, knf0 knf0Var, xex xexVar, btt0 btt0Var, x2c0 x2c0Var, kuy kuyVar) {
        this.f28679a = (byte) 2;
        knf0Var.getClass();
        btt0Var.getClass();
        x2c0Var.getClass();
        kuyVar.getClass();
        this.b = he1Var;
        this.c = xzpVar;
        this.d = knf0Var;
        this.e = xexVar;
        this.f = btt0Var;
        this.g = x2c0Var;
        this.h = kuyVar;
    }

    public qgd(mne mneVar, duj dujVar, gii0 gii0Var, btt0 btt0Var, b3c0 b3c0Var, m1e m1eVar, wdk0 wdk0Var, ii iiVar, ctf0 ctf0Var, usd usdVar) {
        this.f28679a = (byte) 18;
        gii0Var.getClass();
        btt0Var.getClass();
        b3c0Var.getClass();
        m1eVar.getClass();
        wdk0Var.getClass();
        iiVar.getClass();
        ctf0Var.getClass();
        this.b = mneVar;
        this.c = dujVar;
        this.d = m1eVar;
        this.e = wdk0Var;
        this.f = iiVar;
        this.g = ctf0Var;
        this.h = usdVar;
    }

    public qgd(cad cadVar, ql5 ql5Var, f8w f8wVar, HistoryTypeModel historyTypeModel, ctf0 ctf0Var, pru pruVar) {
        this.f28679a = (byte) 7;
        this.b = historyTypeModel;
        this.c = ql5Var;
        this.d = f8wVar;
        this.e = cadVar;
        this.f = pruVar;
        this.g = ctf0Var;
        this.h = new tii(this, (byte) 1);
    }

    public qgd(v6k v6kVar, ctf0 ctf0Var, i1w0 i1w0Var, wyu wyuVar, peg0 peg0Var, fsd fsdVar) {
        this.f28679a = (byte) 8;
        this.b = wyuVar;
        this.c = peg0Var;
        this.d = fsdVar;
        this.e = v6kVar;
        this.f = ctf0Var;
        this.g = i1w0Var;
        this.h = new eni(this, (byte) 2);
    }

    public /* synthetic */ qgd(byte b) {
        this.f28679a = b;
    }

    public qgd(ii iiVar, sjl0 sjl0Var, g2v g2vVar, mne mneVar, ctf0 ctf0Var, duj dujVar, ul9 ul9Var) {
        this.f28679a = (byte) 6;
        this.b = ul9Var;
        this.c = sjl0Var;
        this.d = g2vVar;
        this.e = mneVar;
        this.f = ctf0Var;
        this.g = dujVar;
        this.h = n0k0.a(new uci(this, (byte) 14));
    }

    public qgd(cad cadVar, yag yagVar, Boolean bool, g2v g2vVar, duj dujVar, ul9 ul9Var) {
        this.f28679a = (byte) 5;
        this.b = yagVar;
        this.c = bool;
        this.d = ul9Var;
        this.e = g2vVar;
        this.f = dujVar;
        this.g = cadVar;
        this.h = n0k0.a(new pai(this, (byte) 3));
    }

    public qgd(mne mneVar, knf0 knf0Var, yvn0 yvn0Var, gii0 gii0Var, xxn0 xxn0Var, wyu wyuVar, wgu wguVar) {
        this.f28679a = (byte) 9;
        this.b = wyuVar;
        this.c = gii0Var;
        this.d = knf0Var;
        this.e = yvn0Var;
        this.f = mneVar;
        this.g = wguVar;
        this.h = xxn0Var;
    }

    public qgd(List list) {
        this.f28679a = (byte) 1;
        fq80 fq80Var = new fq80((byte[]) list.get(0));
        int iG = fq80Var.G();
        int iG2 = fq80Var.G();
        Paint paint = new Paint();
        this.b = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.c = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.d = new Canvas();
        this.e = new b930(719, 575, 0, 719, 0, 575);
        this.f = new ffn(0, new int[]{0, -1, -16777216, -8421505}, u(), v());
        this.g = new kfn(iG, iG2);
    }

    public qgd(Context context, wsd wsdVar, fpv0 fpv0Var, ezb0 ezb0Var, WorkDatabase workDatabase, ppv0 ppv0Var, ArrayList arrayList) {
        this.f28679a = (byte) 21;
        context.getClass();
        ezb0Var.getClass();
        this.b = wsdVar;
        this.c = fpv0Var;
        this.d = ezb0Var;
        this.e = workDatabase;
        this.f = ppv0Var;
        this.g = arrayList;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.h = applicationContext;
        new afm0();
    }
}
