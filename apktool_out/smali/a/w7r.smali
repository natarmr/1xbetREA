.class public final La/w7r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;


# static fields
.field public static final b:[Ljava/lang/String;

.field public static final c:[Ljava/lang/String;

.field public static final d:La/a8z;

.field public static final e:La/a8z;


# instance fields
.field public final a:Landroid/database/sqlite/SQLiteDatabase;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    const-string v4, " OR IGNORE "

    .line 2
    .line 3
    const-string v5, " OR REPLACE "

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    const-string v1, " OR ROLLBACK "

    .line 8
    .line 9
    const-string v2, " OR ABORT "

    .line 10
    .line 11
    const-string v3, " OR FAIL "

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    sput-object v0, La/w7r;->b:[Ljava/lang/String;

    .line 18
    .line 19
    const/4 v0, 0x0

    .line 20
    new-array v0, v0, [Ljava/lang/String;

    .line 21
    .line 22
    sput-object v0, La/w7r;->c:[Ljava/lang/String;

    .line 23
    .line 24
    sget-object v0, La/wez;->a:La/wez;

    .line 25
    .line 26
    new-instance v1, La/v9q;

    .line 27
    .line 28
    const/16 v2, 0x1a

    .line 29
    .line 30
    invoke-direct {v1, v2}, La/v9q;-><init>(B)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    sput-object v1, La/w7r;->d:La/a8z;

    .line 38
    .line 39
    new-instance v1, La/v9q;

    .line 40
    .line 41
    const/16 v2, 0x1b

    .line 42
    .line 43
    invoke-direct {v1, v2}, La/v9q;-><init>(B)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, La/w7r;->e:La/a8z;

    .line 51
    .line 52
    return-void
.end method

.method public constructor <init>(Landroid/database/sqlite/SQLiteDatabase;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/w7r;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final P0()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/w7r;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->inTransaction()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final a()V
    .locals 0

    .line 1
    iget-object p0, p0, La/w7r;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransaction()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c()V
    .locals 0

    .line 1
    iget-object p0, p0, La/w7r;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->beginTransactionNonExclusive()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, La/w7r;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteClosable;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    sget-object v1, La/w7r;->e:La/a8z;

    .line 7
    .line 8
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Ljava/lang/reflect/Method;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    sget-object v2, La/w7r;->d:La/a8z;

    .line 17
    .line 18
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    check-cast v3, Ljava/lang/reflect/Method;

    .line 23
    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    check-cast v1, Ljava/lang/reflect/Method;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, Ljava/lang/reflect/Method;

    .line 40
    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, La/w7r;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 45
    .line 46
    const/4 v3, 0x0

    .line 47
    invoke-virtual {v2, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    if-eqz p0, :cond_0

    .line 52
    .line 53
    filled-new-array {v0, v3, v0, v3}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-virtual {v1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    return-void

    .line 61
    :cond_0
    const-string p0, "Required value was null."

    .line 62
    .line 63
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_1
    invoke-virtual {p0}, La/w7r;->a()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public final e(Ljava/lang/String;)La/d8r;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/d8r;

    .line 5
    .line 6
    iget-object p0, p0, La/w7r;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 7
    .line 8
    invoke-virtual {p0, p1}, Landroid/database/sqlite/SQLiteDatabase;->compileStatement(Ljava/lang/String;)Landroid/database/sqlite/SQLiteStatement;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0}, La/d8r;-><init>(Landroid/database/sqlite/SQLiteStatement;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public final k()V
    .locals 0

    .line 1
    iget-object p0, p0, La/w7r;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->endTransaction()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final l(Ljava/lang/String;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/w7r;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final n([Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)"

    .line 2
    .line 3
    iget-object p0, p0, La/w7r;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 4
    .line 5
    invoke-virtual {p0, v0, p1}, Landroid/database/sqlite/SQLiteDatabase;->execSQL(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final q(La/vkn0;)Landroid/database/Cursor;
    .locals 3

    .line 1
    new-instance v0, La/awh;

    .line 2
    .line 3
    const/16 v1, 0x1d

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, La/awh;-><init>(Ljava/lang/Object;B)V

    .line 6
    .line 7
    .line 8
    new-instance v1, La/v7r;

    .line 9
    .line 10
    invoke-direct {v1, v0}, La/v7r;-><init>(La/awh;)V

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, La/vkn0;->q()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object v0, La/w7r;->c:[Ljava/lang/String;

    .line 18
    .line 19
    const/4 v2, 0x0

    .line 20
    iget-object p0, p0, La/w7r;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 21
    .line 22
    invoke-virtual {p0, v1, p1, v0, v2}, Landroid/database/sqlite/SQLiteDatabase;->rawQueryWithFactory(Landroid/database/sqlite/SQLiteDatabase$CursorFactory;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public final r()V
    .locals 0

    .line 1
    iget-object p0, p0, La/w7r;->a:Landroid/database/sqlite/SQLiteDatabase;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/database/sqlite/SQLiteDatabase;->setTransactionSuccessful()V

    .line 4
    .line 5
    .line 6
    return-void
.end method
