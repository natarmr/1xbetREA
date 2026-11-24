.class public final La/q13;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/spg0;


# virtual methods
.method public final a(Ljava/lang/String;)La/qpg0;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 p0, 0x0

    .line 5
    invoke-static {p1, p0}, Landroid/database/sqlite/SQLiteDatabase;->openOrCreateDatabase(Ljava/lang/String;Landroid/database/sqlite/SQLiteDatabase$CursorFactory;)Landroid/database/sqlite/SQLiteDatabase;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    new-instance p1, La/nkn0;

    .line 10
    .line 11
    new-instance v0, La/w7r;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, p0}, La/w7r;-><init>(Landroid/database/sqlite/SQLiteDatabase;)V

    .line 17
    .line 18
    .line 19
    invoke-direct {p1, v0}, La/nkn0;-><init>(La/w7r;)V

    .line 20
    .line 21
    .line 22
    return-object p1
.end method

.method public final b()Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method
