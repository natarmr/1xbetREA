.class public final La/ane0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/us00;

.field public final b:La/vwb0;

.field public final c:La/vby;

.field public final d:La/n0o0;

.field public e:La/kds0;

.field public f:Z


# direct methods
.method public constructor <init>(La/us00;La/vwb0;La/vby;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ane0;->a:La/us00;

    .line 5
    .line 6
    iput-object p2, p0, La/ane0;->b:La/vwb0;

    .line 7
    .line 8
    iput-object p3, p0, La/ane0;->c:La/vby;

    .line 9
    .line 10
    new-instance p1, La/tie0;

    .line 11
    .line 12
    const/4 p2, 0x5

    .line 13
    invoke-direct {p1, p0, p2}, La/tie0;-><init>(Ljava/lang/Object;B)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/ane0;->d:La/n0o0;

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public final a()La/aoe0;
    .locals 2

    .line 1
    iget-object v0, p0, La/ane0;->e:La/kds0;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, La/ane0;->c()La/kds0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    new-instance v0, La/kds0;

    .line 12
    .line 13
    invoke-virtual {p0}, La/ane0;->b()La/aoe0;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-direct {v0, v1}, La/kds0;-><init>(La/aoe0;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    iput-object v0, p0, La/ane0;->e:La/kds0;

    .line 21
    .line 22
    iget-object p0, v0, La/kds0;->c:La/aoe0;

    .line 23
    .line 24
    if-nez p0, :cond_1

    .line 25
    .line 26
    new-instance p0, La/aoe0;

    .line 27
    .line 28
    invoke-direct {p0}, La/aoe0;-><init>()V

    .line 29
    .line 30
    .line 31
    :cond_1
    return-object p0
.end method

.method public final b()La/aoe0;
    .locals 4

    .line 1
    const-string v0, "REFERRAL_KEY"

    .line 2
    .line 3
    iget-object v1, p0, La/ane0;->b:La/vwb0;

    .line 4
    .line 5
    :try_start_0
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 6
    .line 7
    const-string v2, ""

    .line 8
    .line 9
    invoke-virtual {v1, v0, v2}, La/vwb0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    if-nez v3, :cond_0

    .line 18
    .line 19
    const-string v2, "referal"

    .line 20
    .line 21
    invoke-virtual {p0, v2}, La/ane0;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    goto :goto_0

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    :goto_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-lez v3, :cond_1

    .line 33
    .line 34
    invoke-virtual {v1, v0, v2}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v0, p0, La/ane0;->c:La/vby;

    .line 38
    .line 39
    sget-object v1, La/aoe0;->Companion:La/zne0;

    .line 40
    .line 41
    invoke-virtual {v1}, La/zne0;->serializer()La/jiy;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, La/jiy;

    .line 46
    .line 47
    invoke-virtual {v0, v1, v2}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    check-cast v0, La/aoe0;

    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_1
    new-instance v0, La/aoe0;

    .line 55
    .line 56
    invoke-direct {v0}, La/aoe0;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :goto_1
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 61
    .line 62
    new-instance v1, La/g0g0;

    .line 63
    .line 64
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    move-object v0, v1

    .line 68
    :goto_2
    new-instance v1, La/aoe0;

    .line 69
    .line 70
    invoke-direct {v1}, La/aoe0;-><init>()V

    .line 71
    .line 72
    .line 73
    instance-of v2, v0, La/g0g0;

    .line 74
    .line 75
    if-eqz v2, :cond_2

    .line 76
    .line 77
    move-object v0, v1

    .line 78
    :cond_2
    check-cast v0, La/aoe0;

    .line 79
    .line 80
    const/4 v1, 0x0

    .line 81
    iput-boolean v1, p0, La/ane0;->f:Z

    .line 82
    .line 83
    return-object v0
.end method

.method public final c()La/kds0;
    .locals 5

    .line 1
    const-string v0, "REFERRAL_KEY_V2"

    .line 2
    .line 3
    iget-object v1, p0, La/ane0;->b:La/vwb0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    sget-object v3, La/j0g0;->b:La/e0g0;

    .line 7
    .line 8
    const-string v3, ""

    .line 9
    .line 10
    invoke-virtual {v1, v0, v3}, La/vwb0;->c(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v4

    .line 18
    if-nez v4, :cond_0

    .line 19
    .line 20
    const-string v3, "init.json"

    .line 21
    .line 22
    invoke-virtual {p0, v3}, La/ane0;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    goto :goto_0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    :goto_0
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-lez v4, :cond_1

    .line 34
    .line 35
    invoke-virtual {v1, v0, v3}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p0, La/ane0;->c:La/vby;

    .line 39
    .line 40
    sget-object v1, La/kds0;->Companion:La/jds0;

    .line 41
    .line 42
    invoke-virtual {v1}, La/jds0;->serializer()La/jiy;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, La/jiy;

    .line 47
    .line 48
    invoke-virtual {v0, v1, v3}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, La/kds0;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_1
    move-object v0, v2

    .line 56
    goto :goto_2

    .line 57
    :goto_1
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 58
    .line 59
    new-instance v1, La/g0g0;

    .line 60
    .line 61
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    move-object v0, v1

    .line 65
    :goto_2
    nop

    .line 66
    instance-of v1, v0, La/g0g0;

    .line 67
    .line 68
    if-eqz v1, :cond_2

    .line 69
    .line 70
    move-object v0, v2

    .line 71
    :cond_2
    check-cast v0, La/kds0;

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    const/4 v1, 0x1

    .line 76
    iput-boolean v1, p0, La/ane0;->f:Z

    .line 77
    .line 78
    move-object v2, v0

    .line 79
    :cond_3
    return-object v2
.end method

.method public final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, La/ane0;->d:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {v0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Set;

    .line 8
    .line 9
    invoke-interface {v0, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    const-string v1, ""

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    return-object v1

    .line 18
    :cond_0
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 19
    .line 20
    iget-object p0, p0, La/ane0;->a:La/us00;

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    sget-object p1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 34
    .line 35
    new-instance v0, Ljava/io/InputStreamReader;

    .line 36
    .line 37
    invoke-direct {v0, p0, p1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 38
    .line 39
    .line 40
    new-instance p0, Ljava/io/BufferedReader;

    .line 41
    .line 42
    const/16 p1, 0x2000

    .line 43
    .line 44
    invoke-direct {p0, v0, p1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    :try_start_1
    invoke-static {p0}, La/n8n0;->k(Ljava/io/Reader;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_1

    .line 55
    :catchall_0
    move-exception p0

    .line 56
    goto :goto_0

    .line 57
    :catchall_1
    move-exception p1

    .line 58
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 59
    :catchall_2
    move-exception v0

    .line 60
    :try_start_4
    invoke-static {p0, p1}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 64
    :goto_0
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 65
    .line 66
    new-instance p1, La/g0g0;

    .line 67
    .line 68
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    :goto_1
    instance-of p0, p1, La/g0g0;

    .line 72
    .line 73
    if-eqz p0, :cond_1

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_1
    move-object v1, p1

    .line 77
    :goto_2
    check-cast v1, Ljava/lang/String;

    .line 78
    .line 79
    return-object v1
.end method

.method public final e(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/kds0;->Companion:La/jds0;

    .line 5
    .line 6
    invoke-virtual {v0}, La/jds0;->serializer()La/jiy;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    check-cast v0, La/jiy;

    .line 11
    .line 12
    iget-object v1, p0, La/ane0;->c:La/vby;

    .line 13
    .line 14
    invoke-virtual {v1, v0, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    check-cast v0, La/kds0;

    .line 19
    .line 20
    iget-object v1, v0, La/kds0;->c:La/aoe0;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    iget-object v1, v1, La/aoe0;->c:Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    iget-object v1, p0, La/ane0;->b:La/vwb0;

    .line 36
    .line 37
    const-string v2, "REFERRAL_KEY_V2"

    .line 38
    .line 39
    invoke-virtual {v1, v2, p1}, La/vwb0;->h(Ljava/lang/String;Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iput-object v0, p0, La/ane0;->e:La/kds0;

    .line 43
    .line 44
    :cond_1
    :goto_0
    return-void
.end method
