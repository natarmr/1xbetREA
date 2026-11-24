package a;

/* JADX INFO: loaded from: classes.dex */
public abstract class eg40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f7744a;
    public final byte b;

    /* JADX WARN: Multi-variable type inference failed */
    public eg40(int i, int i2) {
        this.f7744a = i;
        this.b = i2;
    }

    public void a(w7r w7rVar) {
        w7rVar.getClass();
        throw new q660("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void b(qpg0 qpg0Var) {
        qpg0Var.getClass();
        if (!(qpg0Var instanceof okn0)) {
            throw new q660("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        a(((okn0) qpg0Var).f25413a);
    }
}
