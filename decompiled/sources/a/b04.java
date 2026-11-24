package a;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes2.dex */
public final class b04 extends bnn0 implements Function2 {
    public final /* synthetic */ byte i;
    public boolean j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b04(int i, yje yjeVar, byte b) {
        super(i, yjeVar);
        this.i = b;
    }

    @Override // a.zw5
    public final yje create(Object obj, yje yjeVar) {
        switch (this.i) {
            case 0:
                b04 b04Var = new b04(2, yjeVar, (byte) 0);
                b04Var.j = ((Boolean) obj).booleanValue();
                return b04Var;
            case 1:
                return new b04(2, yjeVar, (byte) 1);
            case 2:
                return new b04(2, yjeVar, (byte) 2);
            case 3:
                return new b04(2, yjeVar, (byte) 3);
            case 4:
                b04 b04Var2 = new b04(2, yjeVar, (byte) 4);
                b04Var2.j = ((Boolean) obj).booleanValue();
                return b04Var2;
            case 5:
                b04 b04Var3 = new b04(2, yjeVar, (byte) 5);
                b04Var3.j = ((Boolean) obj).booleanValue();
                return b04Var3;
            case 6:
                return new b04(2, yjeVar, (byte) 6);
            default:
                b04 b04Var4 = new b04(2, yjeVar, (byte) 7);
                b04Var4.j = ((Boolean) obj).booleanValue();
                return b04Var4;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.i) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((b04) create(bool, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 1:
                return ((b04) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 2:
                return ((b04) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 3:
                return ((b04) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 4:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                return ((b04) create(bool2, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 5:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                return ((b04) create(bool3, (yje) obj2)).invokeSuspend(Unit.f46060a);
            case 6:
                return ((b04) create((vne) obj, (yje) obj2)).invokeSuspend(Unit.f46060a);
            default:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                return ((b04) create(bool4, (yje) obj2)).invokeSuspend(Unit.f46060a);
        }
    }

    @Override // a.zw5
    public final Object invokeSuspend(Object obj) {
        FirebaseMessaging firebaseMessaging;
        Task task;
        switch (this.i) {
            case 0:
                wne wneVar = wne.f39444a;
                z1x.P(obj);
                return Boolean.valueOf(!this.j);
            case 1:
                wne wneVar2 = wne.f39444a;
                boolean z = this.j;
                if (!z) {
                    z1x.P(obj);
                    uen uenVar = wen.b;
                    long jW0 = ibc.w0(30000L, bfn.MILLISECONDS);
                    this.j = true;
                    if (qcc.P(jW0, this) == wneVar2) {
                        return wneVar2;
                    }
                } else {
                    if (!z) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 2:
                wne wneVar3 = wne.f39444a;
                boolean z2 = this.j;
                if (!z2) {
                    z1x.P(obj);
                    uen uenVar2 = wen.b;
                    long jW1 = ibc.w0(30000L, bfn.MILLISECONDS);
                    this.j = true;
                    if (qcc.P(jW1, this) == wneVar3) {
                        return wneVar3;
                    }
                } else {
                    if (!z2) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 3:
                wne wneVar4 = wne.f39444a;
                boolean z3 = this.j;
                if (!z3) {
                    z1x.P(obj);
                    this.j = true;
                    if (qcc.O(3000L, this) == wneVar4) {
                        return wneVar4;
                    }
                } else {
                    if (!z3) {
                        jf4.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    z1x.P(obj);
                }
                return Unit.f46060a;
            case 4:
                boolean z4 = this.j;
                wne wneVar5 = wne.f39444a;
                z1x.P(obj);
                return Boolean.valueOf(!z4);
            case 5:
                boolean z5 = this.j;
                wne wneVar6 = wne.f39444a;
                z1x.P(obj);
                return Boolean.valueOf(z5);
            case 6:
                wne wneVar7 = wne.f39444a;
                boolean z6 = this.j;
                if (z6) {
                    if (z6) {
                        z1x.P(obj);
                        return obj;
                    }
                    jf4.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z1x.P(obj);
                synchronized (FirebaseMessaging.class) {
                    firebaseMessaging = FirebaseMessaging.getInstance(nfq.d());
                }
                if (firebaseMessaging.d.J()) {
                    task = Tasks.forException(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
                } else {
                    TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                    firebaseMessaging.g.execute(new llo(firebaseMessaging, taskCompletionSource, (byte) 2));
                    task = taskCompletionSource.getTask();
                }
                task.getClass();
                this.j = true;
                Object objH = msm0.h(task, this);
                return objH == wneVar7 ? wneVar7 : objH;
            default:
                boolean z7 = this.j;
                wne wneVar8 = wne.f39444a;
                z1x.P(obj);
                return Boolean.valueOf(!z7);
        }
    }
}
