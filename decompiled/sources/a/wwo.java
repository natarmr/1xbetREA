package a;

import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public final class wwo extends k4 {
    public final a c = new a();

    public static final class a extends ThreadLocal {
        @Override // java.lang.ThreadLocal
        public final Object initialValue() {
            return new Random();
        }
    }

    @Override // a.k4
    public final Random e() {
        Object obj = this.c.get();
        obj.getClass();
        return (Random) obj;
    }
}
