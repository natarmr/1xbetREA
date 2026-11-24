package a;

import android.util.Pair;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;

/* JADX INFO: loaded from: classes2.dex */
public final class tzw0 extends nav {
    public static final /* synthetic */ int l = 0;

    static {
        Pair.create(new zow0((byte) 25), Tasks.forResult(null));
    }

    public final Task c(String str) {
        euo0 euo0VarA = s9w0.a();
        euo0VarA.f8431a = new arw0(str, (byte) 3);
        return b(0, euo0VarA.a());
    }
}
