.class public abstract La/ojw0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected transient zza:I


# virtual methods
.method public final a()La/vjw0;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    move-object v1, p0

    .line 3
    check-cast v1, La/jkw0;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, La/jkw0;->b(La/dlw0;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sget-object v2, La/sjw0;->b:La/vjw0;

    .line 10
    .line 11
    new-array v2, v1, [B

    .line 12
    .line 13
    new-instance v3, La/yjw0;

    .line 14
    .line 15
    invoke-direct {v3, v2, v1}, La/yjw0;-><init>([BI)V

    .line 16
    .line 17
    .line 18
    move-object v1, p0

    .line 19
    check-cast v1, La/jkw0;

    .line 20
    .line 21
    invoke-virtual {v1, v3}, La/jkw0;->k(La/p4;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, La/p4;->f1()V

    .line 25
    .line 26
    .line 27
    new-instance v1, La/vjw0;

    .line 28
    .line 29
    invoke-direct {v1, v2}, La/vjw0;-><init>([B)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 30
    .line 31
    .line 32
    return-object v1

    .line 33
    :catch_0
    move-exception v1

    .line 34
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    const-string v2, "Serializing "

    .line 43
    .line 44
    const-string v3, " to a ByteString threw an IOException (should never happen)."

    .line 45
    .line 46
    invoke-static {v2, p0, v3}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-static {p0, v1}, La/e9d0;->m(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    return-object v0
.end method

.method public abstract b(La/dlw0;)I
.end method

.method public final c()[B
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    move-object v1, p0

    .line 3
    check-cast v1, La/jkw0;

    .line 4
    .line 5
    invoke-virtual {v1, v0}, La/jkw0;->b(La/dlw0;)I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    new-array v2, v1, [B

    .line 10
    .line 11
    new-instance v3, La/yjw0;

    .line 12
    .line 13
    invoke-direct {v3, v2, v1}, La/yjw0;-><init>([BI)V

    .line 14
    .line 15
    .line 16
    move-object v1, p0

    .line 17
    check-cast v1, La/jkw0;

    .line 18
    .line 19
    invoke-virtual {v1, v3}, La/jkw0;->k(La/p4;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3}, La/p4;->f1()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    .line 24
    .line 25
    return-object v2

    .line 26
    :catch_0
    move-exception v1

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v2, "Serializing "

    .line 36
    .line 37
    const-string v3, " to a byte array threw an IOException (should never happen)."

    .line 38
    .line 39
    invoke-static {v2, p0, v3}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0, v1}, La/e9d0;->m(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 44
    .line 45
    .line 46
    return-object v0
.end method
