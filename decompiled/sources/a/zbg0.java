package a;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PowerManager;
import android.util.Property;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.work.impl.foreground.SystemForegroundService;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.text.StringsKt;
import org.xplatform.cyber.section.api.championships.universal.presentation.UniversalChampResultsParams;
import org.xplatform.tile_matching.presentation.views.TileMatchingGameFieldView;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class zbg0 implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f44114a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ zbg0(xdk0 xdk0Var, wdk0 wdk0Var, rrm rrmVar, Function0 function0) {
        this.f44114a = (byte) 1;
        this.c = xdk0Var;
        this.d = wdk0Var;
        this.e = rrmVar;
        this.b = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object next;
        switch (this.f44114a) {
            case 0:
                Function0 function0 = (Function0) this.b;
                Function0 function1 = (Function0) this.c;
                hc50 hc50Var = (hc50) this.d;
                acg0 acg0Var = (acg0) this.e;
                function0.invoke();
                function1.invoke();
                hc50Var.d.invoke();
                acg0Var.i.getClass();
                return Unit.f46060a;
            case 1:
                xdk0 xdk0Var = (xdk0) this.c;
                wdk0 wdk0Var = (wdk0) this.d;
                LinkedHashMap linkedHashMap = wdk0Var.d;
                rrm rrmVar = (rrm) this.e;
                Function0 function2 = (Function0) this.b;
                String str = xdk0Var.g;
                if (str != null) {
                    if (StringsKt.W(str)) {
                        str = null;
                    }
                    if (str != null) {
                        WeakReference weakReference = (WeakReference) linkedHashMap.get(str);
                        if ((weakReference != null ? (rrm) weakReference.get() : null) == rrmVar) {
                            linkedHashMap.remove(str);
                        }
                    }
                }
                if (wdk0Var.e.contains(rrmVar)) {
                    return Unit.f46060a;
                }
                function2.invoke();
                return Unit.f46060a;
            case 2:
                kie0 kie0Var = (kie0) this.b;
                TileMatchingGameFieldView tileMatchingGameFieldView = (TileMatchingGameFieldView) this.c;
                List list = (List) this.d;
                List list2 = (List) this.e;
                int i = TileMatchingGameFieldView.h;
                kie0Var.f18333a++;
                ArrayList<zdq0> arrayList = tileMatchingGameFieldView.d;
                if (arrayList.size() == kie0Var.f18333a) {
                    for (zdq0 zdq0Var : arrayList) {
                        zdq0Var.setRow$tile_matching(zdq0Var.getRow$tile_matching() - 5);
                        zdq0Var.setY(zdq0Var.getY() - (tileMatchingGameFieldView.getHeight() * 5));
                    }
                    kie0 kie0Var2 = new kie0();
                    kie0 kie0Var3 = new kie0();
                    ArrayList arrayList2 = new ArrayList(r3d.q(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        int i2 = ((xdq0) it.next()).c;
                        List list3 = tileMatchingGameFieldView.b;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : list3) {
                            if (((zdq0) obj).getColumn$tile_matching() == i2) {
                                arrayList3.add(obj);
                            }
                        }
                        arrayList2.add(CollectionsKt.A0(arrayList3, new tgo0((byte) 15)));
                    }
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        int i3 = 0;
                        for (Object obj2 : (List) it2.next()) {
                            int i4 = i3 + 1;
                            if (i3 < 0) {
                                q3d.p();
                                throw null;
                            }
                            zdq0 zdq0Var2 = (zdq0) obj2;
                            if (zdq0Var2.getRow$tile_matching() != i3) {
                                kie0Var2.f18333a++;
                                Iterator it3 = list2.iterator();
                                while (true) {
                                    if (it3.hasNext()) {
                                        next = it3.next();
                                        xdq0 xdq0Var = (xdq0) next;
                                        if (xdq0Var.b != i3 || xdq0Var.c != zdq0Var2.getColumn$tile_matching()) {
                                        }
                                    } else {
                                        next = null;
                                    }
                                }
                                xdq0 xdq0Var2 = (xdq0) next;
                                if (xdq0Var2 != null) {
                                    zdq0Var2.setType$tile_matching(xdq0Var2.f40708a);
                                }
                                ck60 ck60Var = new ck60(kie0Var3, kie0Var2, tileMatchingGameFieldView, (byte) 21);
                                float height = i3 * zdq0Var2.getHeight();
                                zdq0Var2.i = i3;
                                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(zdq0Var2, (Property<zdq0, Float>) View.Y, height);
                                objectAnimatorOfFloat.addListener(new x73(null, new h3q0((Object) ck60Var, (byte) 11), 11));
                                objectAnimatorOfFloat.setDuration(650L).start();
                            }
                            i3 = i4;
                        }
                    }
                }
                return Unit.f46060a;
            case 3:
                ujd ujdVar = (ujd) this.b;
                Fragment fragment = (Fragment) this.c;
                v2t0 v2t0Var = (v2t0) this.d;
                k3t0 k3t0Var = (k3t0) this.e;
                ujdVar.c(fragment, new lr2(), new ebh(k3t0Var, (byte) 12));
                ebh ebhVar = new ebh(k3t0Var, (byte) 13);
                v2t0Var.getClass();
                fragment.C().u0("REQUEST_KEY_CLOSE_GAME", fragment, new b0l0(ebhVar, (byte) 27));
                return Unit.f46060a;
            case 4:
                UniversalChampResultsParams universalChampResultsParams = (UniversalChampResultsParams) this.b;
                wiu wiuVar = (wiu) this.c;
                pru pruVar = (pru) this.d;
                r9u r9uVar = (r9u) this.e;
                long j = universalChampResultsParams.d;
                Long lValueOf = j != 0 ? Long.valueOf(j) : null;
                Date date = new Date(lValueOf != null ? lValueOf.longValue() : System.currentTimeMillis());
                Locale localeA = wiuVar.a();
                sff0 sff0VarA = pruVar.a();
                ygp ygpVar = ygp.t;
                j1q0 j1q0Var = r9uVar.f30104a;
                j1q0Var.getClass();
                return new ubt0(true, date, null, localeA, null, sff0VarA, j1q0Var.f15748a.d(ygpVar));
            default:
                wov0 wov0Var = (wov0) this.b;
                UUID uuid = (UUID) this.c;
                lvq lvqVar = (lvq) this.d;
                Context context = (Context) this.e;
                String string = uuid.toString();
                ppv0 ppv0VarE = wov0Var.c.e(string);
                if (ppv0VarE == null || ppv0VarE.b.a()) {
                    jf4.n("Calls to setForegroundAsync() must complete before a ListenableWorker signals completion of work by returning an instance of Result.");
                } else {
                    ezb0 ezb0Var = wov0Var.b;
                    synchronized (ezb0Var.k) {
                        try {
                            wv00.f().g(ezb0.l, "Moving WorkSpec (" + string + ") to the foreground");
                            nqv0 nqv0Var = (nqv0) ezb0Var.g.remove(string);
                            if (nqv0Var != null) {
                                if (ezb0Var.f8664a == null) {
                                    PowerManager.WakeLock wakeLockA = rvu0.a(ezb0Var.b);
                                    ezb0Var.f8664a = wakeLockA;
                                    wakeLockA.acquire();
                                }
                                ezb0Var.f.put(string, nqv0Var);
                                Intent intentB = o9o0.b(ezb0Var.b, jpm0.k(nqv0Var.f23975a), lvqVar);
                                Context context2 = ezb0Var.b;
                                if (Build.VERSION.SDK_INT >= 26) {
                                    ga3.J(context2, intentB);
                                } else {
                                    context2.startService(intentB);
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                        break;
                    }
                    xov0 xov0VarK = jpm0.k(ppv0VarE);
                    String str2 = o9o0.j;
                    Intent intent = new Intent(context, (Class<?>) SystemForegroundService.class);
                    intent.setAction("ACTION_NOTIFY");
                    intent.putExtra("KEY_NOTIFICATION_ID", lvqVar.f20727a);
                    intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", lvqVar.b);
                    intent.putExtra("KEY_NOTIFICATION", lvqVar.c);
                    intent.putExtra("KEY_WORKSPEC_ID", xov0VarK.f41241a);
                    intent.putExtra("KEY_GENERATION", xov0VarK.b);
                    context.startService(intent);
                }
                return null;
        }
    }

    public /* synthetic */ zbg0(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.f44114a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
