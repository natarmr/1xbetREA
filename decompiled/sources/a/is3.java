package a;

import android.content.Context;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal._UtilJvmKt;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RealConnectionPool;
import org.platform.app.ApplicationLoader;

/* JADX INFO: loaded from: classes2.dex */
public final class is3 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public final /* synthetic */ ApplicationLoader j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ is3(ApplicationLoader applicationLoader, yje yjeVar, byte b) {
        super(2, yjeVar);
        this.i = b;
        this.j = applicationLoader;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        byte b = this.i;
        ApplicationLoader applicationLoader = this.j;
        switch (b) {
            case 0:
                return new is3(applicationLoader, yjeVar, (byte) 0);
            case 1:
                return new is3(applicationLoader, yjeVar, (byte) 1);
            case 2:
                return new is3(applicationLoader, yjeVar, (byte) 2);
            default:
                return new is3(applicationLoader, yjeVar, (byte) 3);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                return ((is3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((is3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((is3) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                return ((is3) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        ArrayList arrayListQ0;
        Socket socket;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                ApplicationLoader applicationLoader = this.j;
                ApplicationLoader applicationLoader2 = ApplicationLoader.v1;
                applicationLoader.h();
                return Unit.f46060a;
            case 1:
                wne wneVar2 = wne.f39444a;
                z1x.P(obj);
                ApplicationLoader applicationLoader3 = this.j;
                ApplicationLoader applicationLoader4 = ApplicationLoader.v1;
                Context applicationContext = applicationLoader3.getApplicationContext();
                applicationContext.getClass();
                cpv0 cpv0VarD = cpv0.d(applicationContext);
                cpv0VarD.getClass();
                std stdVar = cpv0VarD.b.f;
                xgi0 xgi0Var = cpv0VarD.d.f9946a;
                xgi0Var.getClass();
                r8x.T(stdVar, "CancelWorkByTag_CouponNotificationWorker", xgi0Var, new h5a(cpv0VarD, "CouponNotificationWorker"));
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                z1x.P(obj);
                euc eucVar = (euc) this.j.c().K1.get();
                synchronized (eucVar) {
                    List listZ = tx3.z(new duc[]{eucVar.g, eucVar.i, eucVar.j, eucVar.k});
                    ArrayList arrayList = eucVar.h;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    if (it.hasNext()) {
                        if (it.next() == null) {
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                    arrayListQ0 = CollectionsKt.q0(listZ, arrayList2);
                }
                Iterator it2 = arrayListQ0.iterator();
                while (it2.hasNext()) {
                    RealConnectionPool realConnectionPool = ((duc) it2.next()).f6692a.E.f46084a;
                    Iterator it3 = realConnectionPool.d.iterator();
                    it3.getClass();
                    while (it3.hasNext()) {
                        RealConnection realConnection = (RealConnection) it3.next();
                        realConnection.getClass();
                        synchronized (realConnection) {
                            if (realConnection.q.isEmpty()) {
                                it3.remove();
                                realConnection.k = true;
                                socket = realConnection.e;
                            } else {
                                socket = null;
                            }
                            break;
                        }
                        if (socket != null) {
                            _UtilJvmKt.c(socket);
                        }
                    }
                    if (realConnectionPool.d.isEmpty()) {
                        realConnectionPool.b.a();
                    }
                }
                return Unit.f46060a;
            default:
                wne wneVar4 = wne.f39444a;
                z1x.P(obj);
                z7z z7zVar = this.j.f46267a;
                if (z7zVar != null) {
                    ((vwb0) z7zVar.get()).b().getBoolean("preload_probe", false);
                    return Unit.f46060a;
                }
                Intrinsics.h("privatePreferencesWrapper");
                throw null;
        }
    }
}
