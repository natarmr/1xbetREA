package a;

import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class d9v implements Continuation, e0l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ byte f5720a;
    public final /* synthetic */ String b;

    public /* synthetic */ d9v(a6u a6uVar, String str) {
        this.f5720a = (byte) 1;
        this.b = str;
    }

    @Override // a.e0l0
    public Iterator d(qo8 qo8Var, CharSequence charSequence) {
        return new c0l0(qo8Var, charSequence, this.b, (byte) 1);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws ExecutionException {
        byte b = this.f5720a;
        String str = this.b;
        switch (b) {
            case 0:
                if (!task.isSuccessful()) {
                    throw new ExecutionException(task.getException());
                }
                String str2 = (String) task.getResult();
                if (TextUtils.isEmpty(str2) || !str2.endsWith(str)) {
                    throw new ExecutionException(new IllegalArgumentException("Unexpected Error: FID NOT matching!"));
                }
                return str;
            default:
                return !task.isSuccessful() ? Tasks.forException(a6u.n(task)) : Tasks.forResult(new Pair((String) task.getResult(), str));
        }
    }

    public /* synthetic */ d9v(String str, byte b) {
        this.f5720a = b;
        this.b = str;
    }
}
