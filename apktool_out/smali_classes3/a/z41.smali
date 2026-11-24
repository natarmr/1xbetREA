.class public final La/z41;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/us00;

.field public final b:La/vby;

.field public final c:La/q7d0;

.field public final d:La/n0o0;

.field public final e:La/n0o0;

.field public final f:La/n0o0;

.field public final g:Ljava/util/concurrent/ConcurrentHashMap;

.field public final h:La/k050;


# direct methods
.method public constructor <init>(La/vby;La/us00;La/q7d0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, La/z41;->a:La/us00;

    .line 5
    .line 6
    iput-object p1, p0, La/z41;->b:La/vby;

    .line 7
    .line 8
    iput-object p3, p0, La/z41;->c:La/q7d0;

    .line 9
    .line 10
    new-instance p1, La/v41;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    invoke-direct {p1, p0, p2}, La/v41;-><init>(La/z41;B)V

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iput-object p1, p0, La/z41;->d:La/n0o0;

    .line 21
    .line 22
    new-instance p1, La/v41;

    .line 23
    .line 24
    const/4 p2, 0x1

    .line 25
    invoke-direct {p1, p0, p2}, La/v41;-><init>(La/z41;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    iput-object p1, p0, La/z41;->e:La/n0o0;

    .line 33
    .line 34
    new-instance p1, La/v41;

    .line 35
    .line 36
    const/4 p2, 0x2

    .line 37
    invoke-direct {p1, p0, p2}, La/v41;-><init>(La/z41;B)V

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    iput-object p1, p0, La/z41;->f:La/n0o0;

    .line 45
    .line 46
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 49
    .line 50
    .line 51
    iput-object p1, p0, La/z41;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 52
    .line 53
    new-instance p1, La/k050;

    .line 54
    .line 55
    invoke-direct {p1}, La/k050;-><init>()V

    .line 56
    .line 57
    .line 58
    iput-object p1, p0, La/z41;->h:La/k050;

    .line 59
    .line 60
    return-void
.end method

.method public static b(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    sget-object p1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 23
    .line 24
    invoke-virtual {p0, p1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {p0}, Ljava/util/UUID;->nameUUIDFromBytes([B)Ljava/util/UUID;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/util/UUID;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)La/f51;
    .locals 3

    .line 1
    :try_start_0
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 2
    .line 3
    iget-object v0, p0, La/z41;->b:La/vby;

    .line 4
    .line 5
    iget-object p0, p0, La/z41;->a:La/us00;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, p1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 12
    .line 13
    .line 14
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 15
    :try_start_1
    invoke-virtual {p0}, Ljava/io/InputStream;->available()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    new-array p1, p1, [B

    .line 20
    .line 21
    invoke-virtual {p0, p1}, Ljava/io/InputStream;->read([B)I

    .line 22
    .line 23
    .line 24
    new-instance v1, Ljava/lang/String;

    .line 25
    .line 26
    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 27
    .line 28
    invoke-direct {v1, p1, v2}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 29
    .line 30
    .line 31
    :try_start_2
    invoke-interface {p0}, Ljava/io/Closeable;->close()V

    .line 32
    .line 33
    .line 34
    sget-object p0, La/f51;->Companion:La/e51;

    .line 35
    .line 36
    invoke-virtual {p0}, La/e51;->serializer()La/jiy;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/jiy;

    .line 41
    .line 42
    invoke-virtual {v0, p0, v1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    check-cast p0, La/f51;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    move-exception p1

    .line 50
    :try_start_3
    throw p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 51
    :catchall_1
    move-exception v0

    .line 52
    :try_start_4
    invoke-static {p0, p1}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 56
    :catchall_2
    move-exception p0

    .line 57
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 58
    .line 59
    new-instance p1, La/g0g0;

    .line 60
    .line 61
    invoke-direct {p1, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    move-object p0, p1

    .line 65
    :goto_0
    invoke-static {p0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    if-nez p1, :cond_0

    .line 70
    .line 71
    check-cast p0, La/f51;

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_0
    new-instance p0, La/g2;

    .line 75
    .line 76
    const/4 p1, 0x2

    .line 77
    invoke-direct {p0, p1}, La/g2;-><init>(B)V

    .line 78
    .line 79
    .line 80
    throw p0
.end method

.method public final c(Ljava/lang/String;La/mi0;ILjava/lang/String;)La/f51;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    const/4 v1, 0x1

    .line 15
    if-lez v0, :cond_0

    .line 16
    .line 17
    move v0, v1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    iget-byte v2, p2, La/mi0;->a:B

    .line 21
    .line 22
    invoke-static {v2, p1, p3, p4}, La/z41;->b(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p3, p0, La/z41;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    invoke-virtual {p3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p4

    .line 32
    if-nez p4, :cond_6

    .line 33
    .line 34
    :try_start_0
    sget-object p4, La/j0g0;->b:La/e0g0;

    .line 35
    .line 36
    invoke-virtual {p0, p1, p2, v0}, La/z41;->e(Ljava/lang/String;La/mi0;Z)La/f51;

    .line 37
    .line 38
    .line 39
    move-result-object p4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p4

    .line 42
    sget-object v2, La/j0g0;->b:La/e0g0;

    .line 43
    .line 44
    new-instance v2, La/g0g0;

    .line 45
    .line 46
    invoke-direct {v2, p4}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 47
    .line 48
    .line 49
    move-object p4, v2

    .line 50
    :goto_1
    invoke-static {p4}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    if-nez v2, :cond_1

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_1
    sget-object p4, La/w41;->a:[I

    .line 58
    .line 59
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    aget p2, p4, p2

    .line 64
    .line 65
    if-ne p2, v1, :cond_2

    .line 66
    .line 67
    if-eqz v0, :cond_2

    .line 68
    .line 69
    iget-object p0, p0, La/z41;->e:La/n0o0;

    .line 70
    .line 71
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    check-cast p0, La/f51;

    .line 76
    .line 77
    :goto_2
    move-object p4, p0

    .line 78
    goto :goto_3

    .line 79
    :cond_2
    if-ne p2, v1, :cond_3

    .line 80
    .line 81
    iget-object p0, p0, La/z41;->f:La/n0o0;

    .line 82
    .line 83
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    check-cast p0, La/f51;

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    const/4 p4, 0x2

    .line 91
    iget-object p0, p0, La/z41;->d:La/n0o0;

    .line 92
    .line 93
    if-ne p2, p4, :cond_4

    .line 94
    .line 95
    if-eqz v0, :cond_4

    .line 96
    .line 97
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object p0

    .line 101
    check-cast p0, La/f51;

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    check-cast p0, La/f51;

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :goto_3
    check-cast p4, La/f51;

    .line 112
    .line 113
    invoke-virtual {p3, p1, p4}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    if-nez p0, :cond_5

    .line 118
    .line 119
    goto :goto_4

    .line 120
    :cond_5
    move-object p4, p0

    .line 121
    :cond_6
    :goto_4
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    check-cast p4, La/f51;

    .line 125
    .line 126
    return-object p4
.end method

.method public final d(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    iget-object p0, p0, La/z41;->a:La/us00;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getNoBackupFilesDir()Ljava/io/File;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/io/File;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v0, "myAggregatorConfiguration"

    .line 12
    .line 13
    const-string v1, ".json"

    .line 14
    .line 15
    invoke-static {p0, v0, p1, v1}, La/kng0;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final e(Ljava/lang/String;La/mi0;Z)La/f51;
    .locals 3

    .line 1
    sget-object v0, La/w41;->a:[I

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    aget p2, v0, p2

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-ne p2, v0, :cond_0

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    const-string p2, "LAST_AUTH_MY_AGGREGATOR_KEY"

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-ne p2, v0, :cond_1

    .line 18
    .line 19
    const-string p2, "LAST_UN_AUTH_MY_AGGREGATOR_KEY"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x2

    .line 23
    if-ne p2, v0, :cond_2

    .line 24
    .line 25
    if-eqz p3, :cond_2

    .line 26
    .line 27
    const-string p2, "LAST_AUTH_MY_VIRTUAL_KEY"

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const-string p2, "LAST_UN_AUTH_MY_VIRTUAL_KEY"

    .line 31
    .line 32
    :goto_0
    iget-object p3, p0, La/z41;->c:La/q7d0;

    .line 33
    .line 34
    invoke-virtual {p3}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, ""

    .line 39
    .line 40
    invoke-interface {v0, p2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_3

    .line 45
    .line 46
    move-object v0, v1

    .line 47
    :cond_3
    const-string v2, "_SCREEN_CONFIG_"

    .line 48
    .line 49
    invoke-virtual {p2, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-static {v0, p2, v1, v2}, Lkotlin/text/c;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p2

    .line 58
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    if-eqz p1, :cond_5

    .line 63
    .line 64
    invoke-virtual {p3}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    invoke-interface {p1, v0, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    if-nez p1, :cond_4

    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_4
    move-object v1, p1

    .line 76
    :goto_1
    sget-object p1, La/f51;->Companion:La/e51;

    .line 77
    .line 78
    invoke-virtual {p1}, La/e51;->serializer()La/jiy;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    check-cast p1, La/jiy;

    .line 83
    .line 84
    iget-object p0, p0, La/z41;->b:La/vby;

    .line 85
    .line 86
    invoke-virtual {p0, p1, v1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    check-cast p0, La/f51;

    .line 91
    .line 92
    return-object p0

    .line 93
    :cond_5
    new-instance p0, La/g2;

    .line 94
    .line 95
    const/4 p1, 0x7

    .line 96
    invoke-direct {p0, p1}, La/g2;-><init>(B)V

    .line 97
    .line 98
    .line 99
    throw p0
.end method

.method public final f(Ljava/lang/String;La/mi0;ILjava/lang/String;La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p5, La/x41;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/x41;

    .line 7
    .line 8
    iget v1, v0, La/x41;->m:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/x41;->m:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/x41;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/x41;-><init>(La/z41;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/x41;->k:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/x41;->m:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, La/x41;->j:La/k050;

    .line 38
    .line 39
    iget-object p2, v0, La/x41;->i:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    return-object v4

    .line 51
    :cond_2
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-byte p2, p2, La/mi0;->a:B

    .line 55
    .line 56
    invoke-static {p2, p1, p3, p4}, La/z41;->b(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    iput-object p2, v0, La/x41;->i:Ljava/lang/String;

    .line 61
    .line 62
    iget-object p1, p0, La/z41;->h:La/k050;

    .line 63
    .line 64
    iput-object p1, v0, La/x41;->j:La/k050;

    .line 65
    .line 66
    iput v3, v0, La/x41;->m:I

    .line 67
    .line 68
    invoke-virtual {p1, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p3

    .line 72
    if-ne p3, v1, :cond_3

    .line 73
    .line 74
    return-object v1

    .line 75
    :cond_3
    :goto_1
    :try_start_0
    invoke-virtual {p0, p2}, La/z41;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    new-instance p3, Landroid/util/AtomicFile;

    .line 80
    .line 81
    new-instance p4, Ljava/io/File;

    .line 82
    .line 83
    invoke-direct {p4, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-direct {p3, p4}, Landroid/util/AtomicFile;-><init>(Ljava/io/File;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 87
    .line 88
    .line 89
    :try_start_1
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 90
    .line 91
    invoke-virtual {p3}, Landroid/util/AtomicFile;->readFully()[B

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    new-instance p3, Ljava/lang/String;

    .line 96
    .line 97
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    sget-object p4, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 101
    .line 102
    invoke-direct {p3, p2, p4}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 103
    .line 104
    .line 105
    iget-object p0, p0, La/z41;->b:La/vby;

    .line 106
    .line 107
    sget-object p2, La/f51;->Companion:La/e51;

    .line 108
    .line 109
    invoke-virtual {p2}, La/e51;->serializer()La/jiy;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    check-cast p2, La/jiy;

    .line 114
    .line 115
    invoke-virtual {p0, p2, p3}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, La/f51;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :catchall_0
    move-exception p0

    .line 123
    :try_start_2
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 124
    .line 125
    new-instance p2, La/g0g0;

    .line 126
    .line 127
    invoke-direct {p2, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 128
    .line 129
    .line 130
    move-object p0, p2

    .line 131
    :goto_2
    invoke-static {p0}, La/j0g0;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    if-nez p2, :cond_4

    .line 136
    .line 137
    check-cast p0, La/f51;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 138
    .line 139
    invoke-interface {p1, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    return-object p0

    .line 143
    :catchall_1
    move-exception p0

    .line 144
    goto :goto_3

    .line 145
    :cond_4
    :try_start_3
    new-instance p0, La/g2;

    .line 146
    .line 147
    const/4 p2, 0x7

    .line 148
    invoke-direct {p0, p2}, La/g2;-><init>(B)V

    .line 149
    .line 150
    .line 151
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 152
    :goto_3
    invoke-interface {p1, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 153
    .line 154
    .line 155
    throw p0
.end method

.method public final g(Ljava/lang/String;La/mi0;ILjava/lang/String;La/f51;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p6, La/y41;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, La/y41;

    .line 7
    .line 8
    iget v1, v0, La/y41;->p:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/y41;->p:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/y41;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, La/y41;-><init>(La/z41;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, La/y41;->n:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/y41;->p:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object p1, v0, La/y41;->m:La/k050;

    .line 38
    .line 39
    iget-object p2, v0, La/y41;->l:Ljava/lang/String;

    .line 40
    .line 41
    iget-object p5, v0, La/y41;->k:La/f51;

    .line 42
    .line 43
    iget-object p3, v0, La/y41;->j:La/mi0;

    .line 44
    .line 45
    iget-object p4, v0, La/y41;->i:Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 52
    .line 53
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    return-object v4

    .line 57
    :cond_2
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-byte p6, p2, La/mi0;->a:B

    .line 61
    .line 62
    invoke-static {p6, p1, p3, p4}, La/z41;->b(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    iput-object p1, v0, La/y41;->i:Ljava/lang/String;

    .line 67
    .line 68
    iput-object p2, v0, La/y41;->j:La/mi0;

    .line 69
    .line 70
    iput-object p5, v0, La/y41;->k:La/f51;

    .line 71
    .line 72
    iput-object p3, v0, La/y41;->l:Ljava/lang/String;

    .line 73
    .line 74
    iget-object p4, p0, La/z41;->h:La/k050;

    .line 75
    .line 76
    iput-object p4, v0, La/y41;->m:La/k050;

    .line 77
    .line 78
    iput v3, v0, La/y41;->p:I

    .line 79
    .line 80
    invoke-virtual {p4, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p6

    .line 84
    if-ne p6, v1, :cond_3

    .line 85
    .line 86
    return-object v1

    .line 87
    :cond_3
    move-object v5, p4

    .line 88
    move-object p4, p1

    .line 89
    move-object p1, v5

    .line 90
    move-object v5, p3

    .line 91
    move-object p3, p2

    .line 92
    move-object p2, v5

    .line 93
    :goto_1
    :try_start_0
    invoke-virtual {p0, p2}, La/z41;->d(Ljava/lang/String;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p6

    .line 97
    new-instance v0, Landroid/util/AtomicFile;

    .line 98
    .line 99
    new-instance v1, Ljava/io/File;

    .line 100
    .line 101
    invoke-direct {v1, p6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    invoke-direct {v0, v1}, Landroid/util/AtomicFile;-><init>(Ljava/io/File;)V

    .line 105
    .line 106
    .line 107
    iget-object p6, p0, La/z41;->b:La/vby;

    .line 108
    .line 109
    sget-object v1, La/f51;->Companion:La/e51;

    .line 110
    .line 111
    invoke-virtual {v1}, La/e51;->serializer()La/jiy;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    check-cast v1, La/jiy;

    .line 116
    .line 117
    invoke-virtual {p6, v1, p5}, La/vby;->d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 121
    :try_start_1
    invoke-virtual {v0}, Landroid/util/AtomicFile;->startWrite()Ljava/io/FileOutputStream;

    .line 122
    .line 123
    .line 124
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 125
    :try_start_2
    sget-object v2, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 126
    .line 127
    invoke-virtual {p6, v2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 128
    .line 129
    .line 130
    move-result-object v2

    .line 131
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1, v2}, Ljava/io/FileOutputStream;->write([B)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1}, Landroid/util/AtomicFile;->finishWrite(Ljava/io/FileOutputStream;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p4}, Ljava/lang/String;->length()I

    .line 141
    .line 142
    .line 143
    move-result p4

    .line 144
    if-lez p4, :cond_4

    .line 145
    .line 146
    goto :goto_2

    .line 147
    :cond_4
    const/4 v3, 0x0

    .line 148
    :goto_2
    invoke-virtual {p0, p2, p3, v3, p6}, La/z41;->h(Ljava/lang/String;La/mi0;ZLjava/lang/String;)V

    .line 149
    .line 150
    .line 151
    iget-object p0, p0, La/z41;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 152
    .line 153
    invoke-virtual {p0, p2, p5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    check-cast p0, La/f51;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 158
    .line 159
    invoke-interface {p1, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 160
    .line 161
    .line 162
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 163
    .line 164
    return-object p0

    .line 165
    :catchall_0
    move-exception p0

    .line 166
    goto :goto_3

    .line 167
    :catchall_1
    move-exception p0

    .line 168
    move-object v1, v4

    .line 169
    :goto_3
    if-eqz v1, :cond_5

    .line 170
    .line 171
    :try_start_3
    invoke-virtual {v0, v1}, Landroid/util/AtomicFile;->failWrite(Ljava/io/FileOutputStream;)V

    .line 172
    .line 173
    .line 174
    goto :goto_4

    .line 175
    :catchall_2
    move-exception p0

    .line 176
    goto :goto_5

    .line 177
    :cond_5
    :goto_4
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 178
    :goto_5
    invoke-interface {p1, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 179
    .line 180
    .line 181
    throw p0
.end method

.method public final h(Ljava/lang/String;La/mi0;ZLjava/lang/String;)V
    .locals 4

    .line 1
    sget-object v0, La/w41;->a:[I

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    aget p2, v0, p2

    .line 8
    .line 9
    const/4 v0, 0x1

    .line 10
    if-ne p2, v0, :cond_0

    .line 11
    .line 12
    if-eqz p3, :cond_0

    .line 13
    .line 14
    const-string p2, "LAST_AUTH_MY_AGGREGATOR_KEY"

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    if-ne p2, v0, :cond_1

    .line 18
    .line 19
    const-string p2, "LAST_UN_AUTH_MY_AGGREGATOR_KEY"

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v0, 0x2

    .line 23
    if-ne p2, v0, :cond_2

    .line 24
    .line 25
    if-eqz p3, :cond_2

    .line 26
    .line 27
    const-string p2, "LAST_AUTH_MY_VIRTUAL_KEY"

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const-string p2, "LAST_UN_AUTH_MY_VIRTUAL_KEY"

    .line 31
    .line 32
    :goto_0
    const-string p3, "_SCREEN_CONFIG_"

    .line 33
    .line 34
    invoke-static {p2, p3, p1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p2, p3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    iget-object p0, p0, La/z41;->c:La/q7d0;

    .line 43
    .line 44
    invoke-virtual {p0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-interface {v1}, Landroid/content/SharedPreferences;->getAll()Ljava/util/Map;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    check-cast v1, Ljava/lang/Iterable;

    .line 68
    .line 69
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-eqz v2, :cond_4

    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    check-cast v2, Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    const/4 v3, 0x0

    .line 89
    invoke-static {v2, p3, v3}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v3

    .line 93
    if-eqz v3, :cond_3

    .line 94
    .line 95
    invoke-interface {v0, v2}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 96
    .line 97
    .line 98
    goto :goto_1

    .line 99
    :cond_4
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, p1, p4}, La/q7d0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p2, p1}, La/q7d0;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 106
    .line 107
    .line 108
    return-void
.end method
