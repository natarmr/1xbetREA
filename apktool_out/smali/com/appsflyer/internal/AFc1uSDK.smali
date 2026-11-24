.class public final Lcom/appsflyer/internal/AFc1uSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFc1vSDK;


# instance fields
.field private final AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1qSDK;

.field private final AFLogger:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private final d:Lcom/appsflyer/internal/AFc1kSDK;

.field private final registerClient:Lcom/appsflyer/internal/AFd1zSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFd1zSDK;Lcom/appsflyer/internal/AFc1kSDK;)V
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 11
    .line 12
    iput-object p2, p0, Lcom/appsflyer/internal/AFc1uSDK;->d:Lcom/appsflyer/internal/AFc1kSDK;

    .line 13
    .line 14
    new-instance p1, Lcom/appsflyer/internal/AFc1qSDK;

    .line 15
    .line 16
    new-instance p2, Lcom/appsflyer/internal/AFc1pSDK;

    .line 17
    .line 18
    sget-object v0, Lcom/appsflyer/internal/AFd1bSDK;->registerClient:Lcom/appsflyer/internal/AFd1bSDK;

    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "ConversionsCache"

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    invoke-direct {p2, v1, v0, v2}, Lcom/appsflyer/internal/AFc1pSDK;-><init>(Ljava/lang/String;Ljava/util/List;I)V

    .line 28
    .line 29
    .line 30
    new-instance v0, Lcom/appsflyer/internal/AFc1pSDK;

    .line 31
    .line 32
    sget-object v3, Lcom/appsflyer/internal/AFd1bSDK;->w:Lcom/appsflyer/internal/AFd1bSDK;

    .line 33
    .line 34
    invoke-static {v3}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    const-string v4, "AttrCache"

    .line 39
    .line 40
    invoke-direct {v0, v4, v3, v2}, Lcom/appsflyer/internal/AFc1pSDK;-><init>(Ljava/lang/String;Ljava/util/List;I)V

    .line 41
    .line 42
    .line 43
    new-instance v2, Lcom/appsflyer/internal/AFc1pSDK;

    .line 44
    .line 45
    sget-object v5, Lcom/appsflyer/internal/AFd1bSDK;->afErrorLog:Lcom/appsflyer/internal/AFd1bSDK;

    .line 46
    .line 47
    sget-object v6, Lcom/appsflyer/internal/AFd1bSDK;->AFLoggerLogLevel:Lcom/appsflyer/internal/AFd1bSDK;

    .line 48
    .line 49
    sget-object v7, Lcom/appsflyer/internal/AFd1bSDK;->valueOf:Lcom/appsflyer/internal/AFd1bSDK;

    .line 50
    .line 51
    sget-object v8, Lcom/appsflyer/internal/AFd1bSDK;->getLevel:Lcom/appsflyer/internal/AFd1bSDK;

    .line 52
    .line 53
    sget-object v9, Lcom/appsflyer/internal/AFd1bSDK;->values:Lcom/appsflyer/internal/AFd1bSDK;

    .line 54
    .line 55
    sget-object v10, Lcom/appsflyer/internal/AFd1bSDK;->afWarnLog:Lcom/appsflyer/internal/AFd1bSDK;

    .line 56
    .line 57
    filled-new-array/range {v5 .. v10}, [Lcom/appsflyer/internal/AFd1bSDK;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    invoke-static {v3}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    const/16 v5, 0x28

    .line 66
    .line 67
    const-string v6, "OtherCache"

    .line 68
    .line 69
    invoke-direct {v2, v6, v3, v5}, Lcom/appsflyer/internal/AFc1pSDK;-><init>(Ljava/lang/String;Ljava/util/List;I)V

    .line 70
    .line 71
    .line 72
    filled-new-array {p2, v0, v2}, [Lcom/appsflyer/internal/AFc1pSDK;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-static {p2}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 77
    .line 78
    .line 79
    move-result-object p2

    .line 80
    invoke-direct {p1, p2}, Lcom/appsflyer/internal/AFc1qSDK;-><init>(Ljava/util/List;)V

    .line 81
    .line 82
    .line 83
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1uSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1qSDK;

    .line 84
    .line 85
    const/4 p1, 0x0

    .line 86
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    new-instance p2, Lkotlin/Pair;

    .line 91
    .line 92
    invoke-direct {p2, v1, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 93
    .line 94
    .line 95
    new-instance v0, Lkotlin/Pair;

    .line 96
    .line 97
    invoke-direct {v0, v4, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    new-instance v1, Lkotlin/Pair;

    .line 101
    .line 102
    invoke-direct {v1, v6, p1}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 103
    .line 104
    .line 105
    filled-new-array {p2, v0, v1}, [Lkotlin/Pair;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-static {p1}, La/xp20;->h([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    .line 110
    .line 111
    .line 112
    move-result-object p1

    .line 113
    iput-object p1, p0, Lcom/appsflyer/internal/AFc1uSDK;->AFLogger:Ljava/util/Map;

    .line 114
    .line 115
    return-void
.end method

.method private final registerClient(Lcom/appsflyer/internal/AFe1zSDK;)Lcom/appsflyer/internal/AFc1pSDK;
    .locals 2

    .line 516
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1uSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1qSDK;

    .line 517
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1qSDK;->d:Ljava/util/List;

    .line 518
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/appsflyer/internal/AFc1pSDK;

    .line 519
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1pSDK;->unregisterClient:Ljava/util/List;

    .line 520
    invoke-interface {v1, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    :goto_0
    check-cast v0, Lcom/appsflyer/internal/AFc1pSDK;

    return-object v0
.end method

.method private final registerClient()V
    .locals 7

    .line 521
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1uSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1qSDK;

    .line 522
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1qSDK;->d:Ljava/util/List;

    .line 523
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/appsflyer/internal/AFc1pSDK;

    .line 524
    iget-object v2, v1, Lcom/appsflyer/internal/AFc1pSDK;->d:Ljava/lang/String;

    .line 525
    new-instance v3, Ljava/io/File;

    .line 526
    new-instance v4, Ljava/io/File;

    .line 527
    iget-object v5, p0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 528
    iget-object v5, v5, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 529
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 530
    invoke-virtual {v5}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    move-result-object v5

    const-string v6, "AFRequestCache"

    invoke-direct {v4, v5, v6}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 531
    invoke-direct {v3, v4, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 532
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    move-result v2

    const/4 v4, 0x0

    if-nez v2, :cond_0

    .line 533
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 534
    iget-object v2, p0, Lcom/appsflyer/internal/AFc1uSDK;->AFLogger:Ljava/util/Map;

    .line 535
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1pSDK;->d:Ljava/lang/String;

    .line 536
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 537
    :cond_0
    iget-object v2, p0, Lcom/appsflyer/internal/AFc1uSDK;->AFLogger:Ljava/util/Map;

    .line 538
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1pSDK;->d:Ljava/lang/String;

    .line 539
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v3

    if-eqz v3, :cond_1

    array-length v4, v3

    :cond_1
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_2
    return-void
.end method

.method private final registerClient(Ljava/io/File;)Z
    .locals 10

    .line 511
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 512
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1uSDK;->registerClient()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    const/4 p0, 0x1

    return p0

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    .line 513
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->CACHE:Lcom/appsflyer/sdk_base/logger/LogTag;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p0

    const-string p1, "Could not delete "

    const-string v2, " from cache"

    .line 514
    invoke-static {p1, p0, v2}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/16 v8, 0x78

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    .line 515
    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    const/4 p0, 0x0

    return p0
.end method

.method private static unregisterClient(Ljava/io/File;)Lcom/appsflyer/internal/AFc1sSDK;
    .locals 8

    .line 212
    :try_start_0
    new-instance v1, Ljava/io/InputStreamReader;

    new-instance v0, Ljava/io/FileInputStream;

    invoke-direct {v0, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V

    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    move-result-object v2

    invoke-direct {v1, v0, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 213
    :try_start_1
    invoke-virtual {p0}, Ljava/io/File;->length()J

    move-result-wide v2

    long-to-int v0, v2

    new-array v0, v0, [C

    .line 214
    invoke-virtual {v1, v0}, Ljava/io/Reader;->read([C)I

    .line 215
    new-instance v2, Lcom/appsflyer/internal/AFc1sSDK;

    invoke-direct {v2, v0}, Lcom/appsflyer/internal/AFc1sSDK;-><init>([C)V

    .line 216
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p0

    .line 217
    iput-object p0, v2, Lcom/appsflyer/internal/AFc1sSDK;->registerClient:Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 218
    :try_start_2
    invoke-interface {v1}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    return-object v2

    :catchall_0
    move-exception v0

    move-object p0, v0

    .line 219
    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-static {v1, p0}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    move-exception v0

    move-object p0, v0

    move-object v3, p0

    .line 220
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 221
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->CACHE:Lcom/appsflyer/sdk_base/logger/LogTag;

    const/4 v6, 0x1

    const/4 v7, 0x0

    .line 222
    const-string v2, "Error while loading request from cache"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual/range {v0 .. v7}, Lcom/appsflyer/AFLogger;->e(Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZ)V

    const/4 p0, 0x0

    return-object p0
.end method

.method private final unregisterClient(Lcom/appsflyer/internal/AFe1zSDK;)Ljava/lang/String;
    .locals 0

    .line 223
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFc1uSDK;->registerClient(Lcom/appsflyer/internal/AFe1zSDK;)Lcom/appsflyer/internal/AFc1pSDK;

    move-result-object p0

    if-eqz p0, :cond_0

    .line 224
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1pSDK;->d:Ljava/lang/String;

    if-eqz p0, :cond_0

    return-object p0

    .line 225
    :cond_0
    const-string p0, "Cache do not support this type of events"

    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public final AFKeystoreWrapper()Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/appsflyer/internal/AFc1sSDK;",
            ">;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    const-string v1, "AFRequestCache"

    .line 4
    .line 5
    sget-object v2, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 6
    .line 7
    sget-object v3, Lcom/appsflyer/sdk_base/logger/LogTag;->CACHE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 8
    .line 9
    const/4 v6, 0x4

    .line 10
    const/4 v7, 0x0

    .line 11
    const-string v4, "Get Cached Requests"

    .line 12
    .line 13
    const/4 v5, 0x0

    .line 14
    invoke-static/range {v2 .. v7}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    new-instance v2, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    new-instance v3, Ljava/util/ArrayList;

    .line 23
    .line 24
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 25
    .line 26
    .line 27
    :try_start_0
    new-instance v4, Ljava/io/File;

    .line 28
    .line 29
    iget-object v5, v0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 30
    .line 31
    iget-object v5, v5, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 32
    .line 33
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v5}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 37
    .line 38
    .line 39
    move-result-object v5

    .line 40
    invoke-direct {v4, v5, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-nez v4, :cond_0

    .line 48
    .line 49
    new-instance v4, Ljava/io/File;

    .line 50
    .line 51
    iget-object v5, v0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 52
    .line 53
    iget-object v5, v5, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-direct {v4, v5, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v4}, Ljava/io/File;->mkdir()Z

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :catch_0
    move-exception v0

    .line 70
    move-object v6, v0

    .line 71
    goto/16 :goto_3

    .line 72
    .line 73
    :cond_0
    :goto_0
    iget-object v4, v0, Lcom/appsflyer/internal/AFc1uSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1qSDK;

    .line 74
    .line 75
    iget-object v4, v4, Lcom/appsflyer/internal/AFc1qSDK;->d:Ljava/util/List;

    .line 76
    .line 77
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_3

    .line 86
    .line 87
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, Lcom/appsflyer/internal/AFc1pSDK;

    .line 92
    .line 93
    iget-object v5, v5, Lcom/appsflyer/internal/AFc1pSDK;->d:Ljava/lang/String;

    .line 94
    .line 95
    new-instance v6, Ljava/io/File;

    .line 96
    .line 97
    new-instance v7, Ljava/io/File;

    .line 98
    .line 99
    iget-object v8, v0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 100
    .line 101
    iget-object v8, v8, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 102
    .line 103
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v8}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 107
    .line 108
    .line 109
    move-result-object v8

    .line 110
    invoke-direct {v7, v8, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-direct {v6, v7, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-nez v5, :cond_1

    .line 121
    .line 122
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 123
    .line 124
    .line 125
    :cond_1
    invoke-virtual {v6}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 126
    .line 127
    .line 128
    move-result-object v5

    .line 129
    if-nez v5, :cond_2

    .line 130
    .line 131
    const/4 v5, 0x0

    .line 132
    new-array v5, v5, [Ljava/io/File;

    .line 133
    .line 134
    :cond_2
    invoke-static {v3, v5}, La/w3d;->v(Ljava/util/Collection;[Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_3
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    :cond_4
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 143
    .line 144
    .line 145
    move-result v1

    .line 146
    if-eqz v1, :cond_5

    .line 147
    .line 148
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    check-cast v1, Ljava/io/File;

    .line 153
    .line 154
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 155
    .line 156
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->CACHE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 157
    .line 158
    invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v5

    .line 162
    new-instance v6, Ljava/lang/StringBuilder;

    .line 163
    .line 164
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 165
    .line 166
    .line 167
    const-string v7, "Found cached request: "

    .line 168
    .line 169
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v5

    .line 179
    const/4 v7, 0x4

    .line 180
    const/4 v8, 0x0

    .line 181
    const/4 v6, 0x0

    .line 182
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v1}, Lcom/appsflyer/internal/AFc1uSDK;->unregisterClient(Ljava/io/File;)Lcom/appsflyer/internal/AFc1sSDK;

    .line 186
    .line 187
    .line 188
    move-result-object v1

    .line 189
    if-eqz v1, :cond_4

    .line 190
    .line 191
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 192
    .line 193
    .line 194
    goto :goto_2

    .line 195
    :goto_3
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 196
    .line 197
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->CACHE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 198
    .line 199
    const/16 v11, 0x78

    .line 200
    .line 201
    const/4 v12, 0x0

    .line 202
    const-string v5, "Could not get cached requests"

    .line 203
    .line 204
    const/4 v7, 0x0

    .line 205
    const/4 v8, 0x0

    .line 206
    const/4 v9, 0x0

    .line 207
    const/4 v10, 0x0

    .line 208
    invoke-static/range {v3 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    :cond_5
    sget-object v13, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 212
    .line 213
    sget-object v14, Lcom/appsflyer/sdk_base/logger/LogTag;->CACHE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 214
    .line 215
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    const-string v1, "Found "

    .line 220
    .line 221
    const-string v3, " Cached Requests"

    .line 222
    .line 223
    invoke-static {v0, v1, v3}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object v15

    .line 227
    const/16 v17, 0x4

    .line 228
    .line 229
    const/16 v18, 0x0

    .line 230
    .line 231
    const/16 v16, 0x0

    .line 232
    .line 233
    invoke-static/range {v13 .. v18}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    return-object v2
.end method

.method public final AFLogger(Ljava/lang/String;)Z
    .locals 9

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    new-instance v0, Ljava/io/File;

    .line 6
    .line 7
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 8
    .line 9
    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "AFRequestCache"

    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    const/4 v1, 0x1

    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    new-instance p1, Ljava/io/File;

    .line 31
    .line 32
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 33
    .line 34
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-direct {p1, p0, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/io/File;->mkdir()Z

    .line 47
    .line 48
    .line 49
    return v1

    .line 50
    :cond_1
    sget-object v3, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 51
    .line 52
    sget-object v4, Lcom/appsflyer/sdk_base/logger/LogTag;->CACHE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 53
    .line 54
    const-string v0, "Deleting "

    .line 55
    .line 56
    const-string v5, " from cache"

    .line 57
    .line 58
    invoke-static {v0, p1, v5}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    const/4 v7, 0x4

    .line 63
    const/4 v8, 0x0

    .line 64
    const/4 v6, 0x0

    .line 65
    invoke-static/range {v3 .. v8}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, Lcom/appsflyer/internal/AFc1uSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1qSDK;

    .line 69
    .line 70
    iget-object v0, v0, Lcom/appsflyer/internal/AFc1qSDK;->d:Ljava/util/List;

    .line 71
    .line 72
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_3

    .line 81
    .line 82
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v3

    .line 86
    check-cast v3, Lcom/appsflyer/internal/AFc1pSDK;

    .line 87
    .line 88
    new-instance v4, Ljava/io/File;

    .line 89
    .line 90
    iget-object v3, v3, Lcom/appsflyer/internal/AFc1pSDK;->d:Ljava/lang/String;

    .line 91
    .line 92
    new-instance v5, Ljava/io/File;

    .line 93
    .line 94
    new-instance v6, Ljava/io/File;

    .line 95
    .line 96
    iget-object v7, p0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 97
    .line 98
    iget-object v7, v7, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 99
    .line 100
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v7}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 104
    .line 105
    .line 106
    move-result-object v7

    .line 107
    invoke-direct {v6, v7, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-direct {v5, v6, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    invoke-direct {v4, v5, p1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v4}, Ljava/io/File;->exists()Z

    .line 117
    .line 118
    .line 119
    move-result v3

    .line 120
    if-eqz v3, :cond_2

    .line 121
    .line 122
    invoke-direct {p0, v4}, Lcom/appsflyer/internal/AFc1uSDK;->registerClient(Ljava/io/File;)Z

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    return p0

    .line 127
    :cond_3
    return v1
.end method

.method public final d()V
    .locals 10

    .line 1
    const-string v0, "AF_CACHE_VERSION"

    .line 2
    .line 3
    :try_start_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1uSDK;->d:Lcom/appsflyer/internal/AFc1kSDK;

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    invoke-interface {v1, v0, v2}, Lcom/appsflyer/internal/AFc1kSDK;->AFLogger(Ljava/lang/String;I)I

    .line 7
    .line 8
    .line 9
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    const/4 v2, 0x3

    .line 11
    const-string v3, "AFRequestCache"

    .line 12
    .line 13
    if-ne v1, v2, :cond_0

    .line 14
    .line 15
    :try_start_1
    new-instance v0, Ljava/io/File;

    .line 16
    .line 17
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 18
    .line 19
    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-direct {v0, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    new-instance v0, Ljava/io/File;

    .line 38
    .line 39
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 40
    .line 41
    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 47
    .line 48
    .line 49
    move-result-object v1

    .line 50
    invoke-direct {v0, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1uSDK;->d:Lcom/appsflyer/internal/AFc1kSDK;

    .line 58
    .line 59
    invoke-interface {v1, v0, v2}, Lcom/appsflyer/internal/AFc1kSDK;->d(Ljava/lang/String;I)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Ljava/io/File;

    .line 63
    .line 64
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 65
    .line 66
    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-direct {v0, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_1

    .line 83
    .line 84
    new-instance v0, Ljava/io/File;

    .line 85
    .line 86
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 87
    .line 88
    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-direct {v0, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v0}, La/k0q;->d(Ljava/io/File;)V

    .line 101
    .line 102
    .line 103
    new-instance v0, Ljava/io/File;

    .line 104
    .line 105
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 106
    .line 107
    iget-object v1, v1, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 108
    .line 109
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-direct {v0, v1, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Ljava/io/File;->mkdir()Z

    .line 120
    .line 121
    .line 122
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1uSDK;->registerClient()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 123
    .line 124
    .line 125
    return-void

    .line 126
    :catch_0
    move-exception v0

    .line 127
    move-object p0, v0

    .line 128
    move-object v3, p0

    .line 129
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 130
    .line 131
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->CACHE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 132
    .line 133
    const/16 v8, 0x78

    .line 134
    .line 135
    const/4 v9, 0x0

    .line 136
    const-string v2, "Could not init cache"

    .line 137
    .line 138
    const/4 v4, 0x0

    .line 139
    const/4 v5, 0x0

    .line 140
    const/4 v6, 0x0

    .line 141
    const/4 v7, 0x0

    .line 142
    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    return-void
.end method

.method public final registerClient(Lcom/appsflyer/internal/AFc1sSDK;)Ljava/lang/String;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    const-string v2, "AFRequestCache"

    .line 6
    .line 7
    const-string v3, "Cache overflown for type "

    .line 8
    .line 9
    const-string v4, "Cache request: done, cacheKey: "

    .line 10
    .line 11
    const-string v5, "Caching request with URL: "

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    :try_start_0
    iget-object v7, v1, Lcom/appsflyer/internal/AFc1sSDK;->AFLogger:Lcom/appsflyer/internal/AFe1zSDK;

    .line 18
    .line 19
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    new-instance v8, Ljava/io/File;

    .line 23
    .line 24
    new-instance v9, Ljava/io/File;

    .line 25
    .line 26
    iget-object v10, v0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 27
    .line 28
    iget-object v10, v10, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 29
    .line 30
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v10}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 34
    .line 35
    .line 36
    move-result-object v10

    .line 37
    invoke-direct {v9, v10, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-direct {v0, v7}, Lcom/appsflyer/internal/AFc1uSDK;->unregisterClient(Lcom/appsflyer/internal/AFe1zSDK;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v7

    .line 44
    invoke-direct {v8, v9, v7}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v8}, Ljava/io/File;->exists()Z

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-nez v7, :cond_0

    .line 52
    .line 53
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    .line 54
    .line 55
    .line 56
    goto :goto_0

    .line 57
    :catch_0
    move-exception v0

    .line 58
    move-object v10, v0

    .line 59
    move-object v13, v6

    .line 60
    goto/16 :goto_6

    .line 61
    .line 62
    :cond_0
    :goto_0
    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 63
    .line 64
    sget-object v10, Lcom/appsflyer/sdk_base/logger/LogTag;->CACHE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 65
    .line 66
    iget-object v9, v1, Lcom/appsflyer/internal/AFc1sSDK;->unregisterClient:Ljava/lang/String;

    .line 67
    .line 68
    new-instance v11, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v11, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    const/4 v13, 0x4

    .line 81
    const/4 v14, 0x0

    .line 82
    const/4 v12, 0x0

    .line 83
    move-object v9, v7

    .line 84
    invoke-static/range {v9 .. v14}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 88
    .line 89
    .line 90
    move-result-wide v11

    .line 91
    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    new-instance v13, Ljava/io/File;

    .line 96
    .line 97
    invoke-direct {v13, v8, v5}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 98
    .line 99
    .line 100
    :try_start_1
    invoke-virtual {v13}, Ljava/io/File;->createNewFile()Z

    .line 101
    .line 102
    .line 103
    new-instance v8, Ljava/io/OutputStreamWriter;

    .line 104
    .line 105
    new-instance v9, Ljava/io/FileOutputStream;

    .line 106
    .line 107
    invoke-virtual {v13}, Ljava/io/File;->getPath()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v11

    .line 111
    const/4 v14, 0x1

    .line 112
    invoke-direct {v9, v11, v14}, Ljava/io/FileOutputStream;-><init>(Ljava/lang/String;Z)V

    .line 113
    .line 114
    .line 115
    invoke-static {}, Ljava/nio/charset/Charset;->defaultCharset()Ljava/nio/charset/Charset;

    .line 116
    .line 117
    .line 118
    move-result-object v11

    .line 119
    invoke-direct {v8, v9, v11}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/nio/charset/Charset;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 120
    .line 121
    .line 122
    :try_start_2
    const-string v9, "version="

    .line 123
    .line 124
    invoke-virtual {v8, v9}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 125
    .line 126
    .line 127
    iget-object v9, v1, Lcom/appsflyer/internal/AFc1sSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 128
    .line 129
    invoke-virtual {v8, v9}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    const/16 v9, 0xa

    .line 133
    .line 134
    invoke-virtual {v8, v9}, Ljava/io/Writer;->write(I)V

    .line 135
    .line 136
    .line 137
    const-string v11, "url="

    .line 138
    .line 139
    invoke-virtual {v8, v11}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    iget-object v11, v1, Lcom/appsflyer/internal/AFc1sSDK;->unregisterClient:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v8, v11}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v8, v9}, Ljava/io/Writer;->write(I)V

    .line 148
    .line 149
    .line 150
    const-string v11, "data="

    .line 151
    .line 152
    invoke-virtual {v8, v11}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 153
    .line 154
    .line 155
    iget-object v11, v1, Lcom/appsflyer/internal/AFc1sSDK;->d:[B

    .line 156
    .line 157
    const/4 v12, 0x2

    .line 158
    invoke-static {v11, v12}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v11

    .line 162
    invoke-virtual {v8, v11}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v8, v9}, Ljava/io/Writer;->write(I)V

    .line 166
    .line 167
    .line 168
    iget-object v11, v1, Lcom/appsflyer/internal/AFc1sSDK;->AFLogger:Lcom/appsflyer/internal/AFe1zSDK;

    .line 169
    .line 170
    const-string v15, "type="

    .line 171
    .line 172
    invoke-virtual {v8, v15}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 173
    .line 174
    .line 175
    invoke-interface {v11}, Lcom/appsflyer/internal/AFe1zSDK;->unregisterClient()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v11

    .line 179
    invoke-virtual {v8, v11}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v8, v9}, Ljava/io/Writer;->write(I)V

    .line 183
    .line 184
    .line 185
    iget-object v11, v1, Lcom/appsflyer/internal/AFc1sSDK;->e:Ljava/util/Map;

    .line 186
    .line 187
    if-eqz v11, :cond_2

    .line 188
    .line 189
    invoke-interface {v11}, Ljava/util/Map;->isEmpty()Z

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    if-eqz v11, :cond_1

    .line 194
    .line 195
    goto :goto_1

    .line 196
    :cond_1
    const-string v11, "headers="

    .line 197
    .line 198
    invoke-virtual {v8, v11}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    new-instance v11, Lorg/json/JSONObject;

    .line 202
    .line 203
    iget-object v15, v1, Lcom/appsflyer/internal/AFc1sSDK;->e:Ljava/util/Map;

    .line 204
    .line 205
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-direct {v11, v15}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v11

    .line 215
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    sget-object v15, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 219
    .line 220
    invoke-virtual {v11, v15}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 221
    .line 222
    .line 223
    move-result-object v11

    .line 224
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 225
    .line 226
    .line 227
    invoke-static {v11, v12}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 228
    .line 229
    .line 230
    move-result-object v11

    .line 231
    invoke-virtual {v8, v11}, Ljava/io/Writer;->write(Ljava/lang/String;)V

    .line 232
    .line 233
    .line 234
    invoke-virtual {v8, v9}, Ljava/io/Writer;->write(I)V

    .line 235
    .line 236
    .line 237
    goto :goto_1

    .line 238
    :catchall_0
    move-exception v0

    .line 239
    move-object v1, v0

    .line 240
    goto/16 :goto_5

    .line 241
    .line 242
    :cond_2
    :goto_1
    invoke-virtual {v8}, Ljava/io/Writer;->flush()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 243
    .line 244
    .line 245
    :try_start_3
    invoke-interface {v8}, Ljava/io/Closeable;->close()V

    .line 246
    .line 247
    .line 248
    new-instance v8, Ljava/lang/StringBuilder;

    .line 249
    .line 250
    invoke-direct {v8, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 254
    .line 255
    .line 256
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 257
    .line 258
    .line 259
    move-result-object v9

    .line 260
    const/4 v11, 0x4

    .line 261
    const/4 v12, 0x0

    .line 262
    move-object v8, v10

    .line 263
    const/4 v10, 0x0

    .line 264
    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 265
    .line 266
    .line 267
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1sSDK;->AFLogger:Lcom/appsflyer/internal/AFe1zSDK;

    .line 268
    .line 269
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 270
    .line 271
    .line 272
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFc1uSDK;->registerClient(Lcom/appsflyer/internal/AFe1zSDK;)Lcom/appsflyer/internal/AFc1pSDK;

    .line 273
    .line 274
    .line 275
    move-result-object v4

    .line 276
    if-eqz v4, :cond_3

    .line 277
    .line 278
    iget v4, v4, Lcom/appsflyer/internal/AFc1pSDK;->AFKeystoreWrapper:I

    .line 279
    .line 280
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 281
    .line 282
    .line 283
    move-result-object v4

    .line 284
    goto :goto_2

    .line 285
    :catch_1
    move-exception v0

    .line 286
    move-object v10, v0

    .line 287
    goto/16 :goto_6

    .line 288
    .line 289
    :cond_3
    move-object v4, v6

    .line 290
    :goto_2
    if-eqz v4, :cond_8

    .line 291
    .line 292
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    iget-object v9, v0, Lcom/appsflyer/internal/AFc1uSDK;->AFLogger:Ljava/util/Map;

    .line 297
    .line 298
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFc1uSDK;->registerClient(Lcom/appsflyer/internal/AFe1zSDK;)Lcom/appsflyer/internal/AFc1pSDK;

    .line 299
    .line 300
    .line 301
    move-result-object v10

    .line 302
    if-eqz v10, :cond_7

    .line 303
    .line 304
    iget-object v10, v10, Lcom/appsflyer/internal/AFc1pSDK;->d:Ljava/lang/String;

    .line 305
    .line 306
    if-eqz v10, :cond_7

    .line 307
    .line 308
    invoke-interface {v9, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    move-result-object v9

    .line 312
    check-cast v9, Ljava/lang/Integer;

    .line 313
    .line 314
    if-eqz v9, :cond_4

    .line 315
    .line 316
    invoke-virtual {v9}, Ljava/lang/Number;->intValue()I

    .line 317
    .line 318
    .line 319
    move-result v9

    .line 320
    goto :goto_3

    .line 321
    :cond_4
    const/4 v9, 0x0

    .line 322
    :goto_3
    if-lt v9, v4, :cond_6

    .line 323
    .line 324
    add-int/2addr v9, v14

    .line 325
    sub-int v4, v9, v4

    .line 326
    .line 327
    new-instance v9, Ljava/lang/StringBuilder;

    .line 328
    .line 329
    invoke-direct {v9, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 330
    .line 331
    .line 332
    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    const-string v3, ", removing "

    .line 336
    .line 337
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 338
    .line 339
    .line 340
    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    const-string v3, " item(s)"

    .line 344
    .line 345
    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 349
    .line 350
    .line 351
    move-result-object v9

    .line 352
    const/4 v11, 0x4

    .line 353
    const/4 v12, 0x0

    .line 354
    const/4 v10, 0x0

    .line 355
    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 356
    .line 357
    .line 358
    new-instance v3, Ljava/io/File;

    .line 359
    .line 360
    new-instance v7, Ljava/io/File;

    .line 361
    .line 362
    iget-object v8, v0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 363
    .line 364
    iget-object v8, v8, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 365
    .line 366
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    invoke-virtual {v8}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 370
    .line 371
    .line 372
    move-result-object v8

    .line 373
    invoke-direct {v7, v8, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 374
    .line 375
    .line 376
    invoke-direct {v0, v1}, Lcom/appsflyer/internal/AFc1uSDK;->unregisterClient(Lcom/appsflyer/internal/AFe1zSDK;)Ljava/lang/String;

    .line 377
    .line 378
    .line 379
    move-result-object v1

    .line 380
    invoke-direct {v3, v7, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 384
    .line 385
    .line 386
    move-result v1

    .line 387
    if-nez v1, :cond_5

    .line 388
    .line 389
    invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z

    .line 390
    .line 391
    .line 392
    :cond_5
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    if-eqz v1, :cond_6

    .line 397
    .line 398
    new-instance v2, Lcom/appsflyer/internal/AFc1uSDK$2;

    .line 399
    .line 400
    invoke-direct {v2}, Lcom/appsflyer/internal/AFc1uSDK$2;-><init>()V

    .line 401
    .line 402
    .line 403
    invoke-static {v1, v2}, La/tx3;->Y([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    invoke-static {v1, v4}, Lkotlin/collections/CollectionsKt;->D0(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 408
    .line 409
    .line 410
    move-result-object v1

    .line 411
    if-eqz v1, :cond_6

    .line 412
    .line 413
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 414
    .line 415
    .line 416
    move-result-object v1

    .line 417
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 418
    .line 419
    .line 420
    move-result v2

    .line 421
    if-eqz v2, :cond_6

    .line 422
    .line 423
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 424
    .line 425
    .line 426
    move-result-object v2

    .line 427
    check-cast v2, Ljava/io/File;

    .line 428
    .line 429
    invoke-virtual {v2}, Ljava/io/File;->delete()Z

    .line 430
    .line 431
    .line 432
    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 433
    .line 434
    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->CACHE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 435
    .line 436
    invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 437
    .line 438
    .line 439
    move-result-object v2

    .line 440
    new-instance v3, Ljava/lang/StringBuilder;

    .line 441
    .line 442
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 443
    .line 444
    .line 445
    const-string v4, "Cache entry "

    .line 446
    .line 447
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    const-string v2, " removed"

    .line 454
    .line 455
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v9

    .line 462
    const/4 v11, 0x4

    .line 463
    const/4 v12, 0x0

    .line 464
    const/4 v10, 0x0

    .line 465
    invoke-static/range {v7 .. v12}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 466
    .line 467
    .line 468
    goto :goto_4

    .line 469
    :cond_6
    invoke-direct {v0}, Lcom/appsflyer/internal/AFc1uSDK;->registerClient()V

    .line 470
    .line 471
    .line 472
    return-object v5

    .line 473
    :cond_7
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 474
    .line 475
    const-string v1, "Cache do not support this type of events"

    .line 476
    .line 477
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 478
    .line 479
    .line 480
    throw v0
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 481
    :cond_8
    return-object v5

    .line 482
    :goto_5
    :try_start_4
    throw v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 483
    :catchall_1
    move-exception v0

    .line 484
    :try_start_5
    invoke-static {v8, v1}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 485
    .line 486
    .line 487
    throw v0
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 488
    :goto_6
    if-eqz v13, :cond_9

    .line 489
    .line 490
    invoke-virtual {v13}, Ljava/io/File;->delete()Z

    .line 491
    .line 492
    .line 493
    :cond_9
    sget-object v7, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 494
    .line 495
    sget-object v8, Lcom/appsflyer/sdk_base/logger/LogTag;->CACHE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 496
    .line 497
    const/16 v15, 0x78

    .line 498
    .line 499
    const/16 v16, 0x0

    .line 500
    .line 501
    const-string v9, "Could not cache request"

    .line 502
    .line 503
    const/4 v11, 0x0

    .line 504
    const/4 v12, 0x0

    .line 505
    const/4 v13, 0x0

    .line 506
    const/4 v14, 0x0

    .line 507
    invoke-static/range {v7 .. v16}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 508
    .line 509
    .line 510
    return-object v6
.end method

.method public final unregisterClient()V
    .locals 12

    .line 1
    const-string v0, "AFRequestCache"

    .line 2
    .line 3
    :try_start_0
    new-instance v1, Ljava/io/File;

    .line 4
    .line 5
    iget-object v2, p0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 6
    .line 7
    iget-object v2, v2, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    new-instance v1, Ljava/io/File;

    .line 26
    .line 27
    iget-object p0, p0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 28
    .line 29
    iget-object p0, p0, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 30
    .line 31
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    invoke-direct {v1, p0, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/io/File;->mkdir()Z

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_0
    iget-object v1, p0, Lcom/appsflyer/internal/AFc1uSDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFc1qSDK;

    .line 46
    .line 47
    iget-object v1, v1, Lcom/appsflyer/internal/AFc1qSDK;->d:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_2

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    check-cast v2, Lcom/appsflyer/internal/AFc1pSDK;

    .line 64
    .line 65
    iget-object v2, v2, Lcom/appsflyer/internal/AFc1pSDK;->d:Ljava/lang/String;

    .line 66
    .line 67
    new-instance v3, Ljava/io/File;

    .line 68
    .line 69
    new-instance v4, Ljava/io/File;

    .line 70
    .line 71
    iget-object v5, p0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 72
    .line 73
    iget-object v5, v5, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 74
    .line 75
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v5}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    invoke-direct {v4, v5, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    invoke-direct {v3, v4, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 89
    .line 90
    .line 91
    move-result-object v2

    .line 92
    if-eqz v2, :cond_1

    .line 93
    .line 94
    array-length v3, v2

    .line 95
    const/4 v4, 0x0

    .line 96
    :goto_0
    if-ge v4, v3, :cond_1

    .line 97
    .line 98
    aget-object v5, v2, v4

    .line 99
    .line 100
    sget-object v6, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 101
    .line 102
    sget-object v7, Lcom/appsflyer/sdk_base/logger/LogTag;->CACHE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 103
    .line 104
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    new-instance v9, Ljava/lang/StringBuilder;

    .line 109
    .line 110
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 111
    .line 112
    .line 113
    const-string v10, "ClearCache : Found cached request "

    .line 114
    .line 115
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    const/4 v10, 0x4

    .line 126
    const/4 v11, 0x0

    .line 127
    const/4 v9, 0x0

    .line 128
    invoke-static/range {v6 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v5}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v8

    .line 135
    new-instance v9, Ljava/lang/StringBuilder;

    .line 136
    .line 137
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 138
    .line 139
    .line 140
    const-string v10, "Deleting "

    .line 141
    .line 142
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 143
    .line 144
    .line 145
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    const-string v8, " from cache"

    .line 149
    .line 150
    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v8

    .line 157
    const/4 v10, 0x4

    .line 158
    const/4 v11, 0x0

    .line 159
    const/4 v9, 0x0

    .line 160
    invoke-static/range {v6 .. v11}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->i$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;ZILjava/lang/Object;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v5}, Ljava/io/File;->delete()Z

    .line 164
    .line 165
    .line 166
    add-int/lit8 v4, v4, 0x1

    .line 167
    .line 168
    goto :goto_0

    .line 169
    :cond_2
    new-instance v1, Ljava/io/File;

    .line 170
    .line 171
    iget-object v2, p0, Lcom/appsflyer/internal/AFc1uSDK;->registerClient:Lcom/appsflyer/internal/AFd1zSDK;

    .line 172
    .line 173
    iget-object v2, v2, Lcom/appsflyer/internal/AFd1zSDK;->d:Landroid/content/Context;

    .line 174
    .line 175
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Landroid/content/Context;->getFilesDir()Ljava/io/File;

    .line 179
    .line 180
    .line 181
    move-result-object v2

    .line 182
    invoke-direct {v1, v2, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    invoke-static {v1}, La/k0q;->d(Ljava/io/File;)V

    .line 186
    .line 187
    .line 188
    invoke-direct {p0}, Lcom/appsflyer/internal/AFc1uSDK;->registerClient()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 189
    .line 190
    .line 191
    return-void

    .line 192
    :catch_0
    move-exception v0

    .line 193
    move-object p0, v0

    .line 194
    move-object v3, p0

    .line 195
    sget-object v0, Lcom/appsflyer/AFLogger;->INSTANCE:Lcom/appsflyer/AFLogger;

    .line 196
    .line 197
    sget-object v1, Lcom/appsflyer/sdk_base/logger/LogTag;->CACHE:Lcom/appsflyer/sdk_base/logger/LogTag;

    .line 198
    .line 199
    const/16 v8, 0x78

    .line 200
    .line 201
    const/4 v9, 0x0

    .line 202
    const-string v2, "Could not clearCache request"

    .line 203
    .line 204
    const/4 v4, 0x0

    .line 205
    const/4 v5, 0x0

    .line 206
    const/4 v6, 0x0

    .line 207
    const/4 v7, 0x0

    .line 208
    invoke-static/range {v0 .. v9}, Lcom/appsflyer/sdk_base/logger/AFLoggerBase;->e$default(Lcom/appsflyer/sdk_base/logger/AFLoggerBase;Lcom/appsflyer/sdk_base/logger/LogTag;Ljava/lang/String;Ljava/lang/Throwable;ZZZZILjava/lang/Object;)V

    .line 209
    .line 210
    .line 211
    return-void
.end method
