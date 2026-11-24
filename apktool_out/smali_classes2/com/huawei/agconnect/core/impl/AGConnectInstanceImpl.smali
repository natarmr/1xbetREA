.class public Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;
.super Lcom/huawei/agconnect/AGConnectInstance;
.source "SourceFile"


# static fields
.field public static b:Ljava/util/ArrayList;

.field public static final c:Ljava/util/HashMap;

.field public static d:Ljava/lang/String;


# instance fields
.field public final a:Lcom/huawei/agconnect/AGConnectOptions;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->c:Ljava/util/HashMap;

    return-void
.end method

.method public constructor <init>(Lcom/huawei/agconnect/AGConnectOptions;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const-string v0, "AGConnectInstanceImpl init"

    .line 5
    .line 6
    const-string v1, "AGC_Instance"

    .line 7
    .line 8
    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 9
    .line 10
    .line 11
    iput-object p1, p0, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->a:Lcom/huawei/agconnect/AGConnectOptions;

    .line 12
    .line 13
    sget-object p0, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->b:Ljava/util/ArrayList;

    .line 14
    .line 15
    if-nez p0, :cond_0

    .line 16
    .line 17
    const-string p0, "please call `initialize()` first"

    .line 18
    .line 19
    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 20
    .line 21
    .line 22
    :cond_0
    new-instance p0, Lcom/huawei/agconnect/core/impl/ServiceRepository;

    .line 23
    .line 24
    sget-object v0, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->b:Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {p0, v0}, Lcom/huawei/agconnect/core/impl/ServiceRepository;-><init>(Ljava/util/List;)V

    .line 27
    .line 28
    .line 29
    new-instance p0, Lcom/huawei/agconnect/core/impl/ServiceRepository;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {p0, v0}, Lcom/huawei/agconnect/core/impl/ServiceRepository;-><init>(Ljava/util/List;)V

    .line 33
    .line 34
    .line 35
    instance-of p0, p1, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;

    .line 36
    .line 37
    if-eqz p0, :cond_1

    .line 38
    .line 39
    check-cast p1, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;

    .line 40
    .line 41
    iget-object p0, p1, Lcom/huawei/agconnect/config/impl/AGConnectOptionsImpl;->h:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-static {p0}, Lcom/huawei/agconnect/core/impl/ServiceRepository;->a(Ljava/util/List;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    const-string p0, "AGConnectInstanceImpl init end"

    .line 47
    .line 48
    invoke-static {v1, p0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 49
    .line 50
    .line 51
    return-void
.end method

.method public static declared-synchronized a(Lcom/huawei/agconnect/AGConnectOptions;Z)Lcom/huawei/agconnect/AGConnectInstance;
    .locals 3

    const-class v0, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->c:Ljava/util/HashMap;

    invoke-interface {p0}, Lcom/huawei/agconnect/AGConnectOptions;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/agconnect/AGConnectInstance;

    if-eqz v2, :cond_0

    if-eqz p1, :cond_1

    :cond_0
    new-instance v2, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;

    invoke-direct {v2, p0}, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;-><init>(Lcom/huawei/agconnect/AGConnectOptions;)V

    invoke-interface {p0}, Lcom/huawei/agconnect/AGConnectOptions;->a()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v1, p0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    monitor-exit v0

    return-object v2

    :catchall_0
    move-exception p0

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method

.method public static declared-synchronized b(Landroid/content/Context;Lcom/huawei/agconnect/config/AGConnectServicesConfig;)V
    .locals 4

    .line 1
    const-class v0, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    if-nez v1, :cond_0

    .line 9
    .line 10
    const-string v1, "AGC_Instance"

    .line 11
    .line 12
    const-string v2, "context.getApplicationContext null"

    .line 13
    .line 14
    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    move-object p0, v1

    .line 21
    :goto_0
    new-instance v1, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl$1;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 24
    .line 25
    .line 26
    const-string v2, "/agcgw/url"

    .line 27
    .line 28
    sget-object v3, Lcom/huawei/agconnect/JsonProcessingFactory;->a:Ljava/util/HashMap;

    .line 29
    .line 30
    invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    new-instance v1, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl$2;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 36
    .line 37
    .line 38
    const-string v2, "/agcgw/backurl"

    .line 39
    .line 40
    invoke-virtual {v3, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    sget-object v1, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->b:Ljava/util/ArrayList;

    .line 44
    .line 45
    if-nez v1, :cond_1

    .line 46
    .line 47
    new-instance v1, Lcom/huawei/agconnect/core/impl/ServiceRegistrarParser;

    .line 48
    .line 49
    invoke-direct {v1, p0}, Lcom/huawei/agconnect/core/impl/ServiceRegistrarParser;-><init>(Landroid/content/Context;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1}, Lcom/huawei/agconnect/core/impl/ServiceRegistrarParser;->a()Ljava/util/ArrayList;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    sput-object p0, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->b:Ljava/util/ArrayList;

    .line 57
    .line 58
    :cond_1
    const/4 p0, 0x1

    .line 59
    invoke-static {p1, p0}, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->a(Lcom/huawei/agconnect/AGConnectOptions;Z)Lcom/huawei/agconnect/AGConnectInstance;

    .line 60
    .line 61
    .line 62
    const-string p0, "DEFAULT_INSTANCE"

    .line 63
    .line 64
    sput-object p0, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->d:Ljava/lang/String;

    .line 65
    .line 66
    const-string p0, "AGC_Instance"

    .line 67
    .line 68
    const-string p1, "initFinish callback start"

    .line 69
    .line 70
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 71
    .line 72
    .line 73
    sget-object p0, Lcom/huawei/agconnect/core/impl/AGCInitFinishManagerImpl;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 74
    .line 75
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    if-nez p1, :cond_2

    .line 84
    .line 85
    const-string p0, "AGC_Instance"

    .line 86
    .line 87
    const-string p1, "AGC SDK initialize end"

    .line 88
    .line 89
    invoke-static {p0, p1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    .line 91
    .line 92
    monitor-exit v0

    .line 93
    return-void

    .line 94
    :cond_2
    :try_start_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    if-nez p0, :cond_3

    .line 99
    .line 100
    const/4 p0, 0x0

    .line 101
    throw p0

    .line 102
    :cond_3
    new-instance p0, Ljava/lang/ClassCastException;

    .line 103
    .line 104
    invoke-direct {p0}, Ljava/lang/ClassCastException;-><init>()V

    .line 105
    .line 106
    .line 107
    throw p0

    .line 108
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 109
    throw p0
.end method

.method public static declared-synchronized c(Ljava/lang/String;)Lcom/huawei/agconnect/AGConnectInstance;
    .locals 4

    .line 1
    const-string v0, "not find instance for : "

    const-class v1, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;

    monitor-enter v1

    :try_start_0
    sget-object v2, Lcom/huawei/agconnect/core/impl/AGConnectInstanceImpl;->c:Ljava/util/HashMap;

    invoke-virtual {v2, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/huawei/agconnect/AGConnectInstance;

    if-nez v2, :cond_1

    const-string v3, "DEFAULT_INSTANCE"

    invoke-virtual {v3, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const-string p0, "AGC_Instance"

    const-string v0, "please call `initialize()` first"

    invoke-static {p0, v0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_0
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "AGC_Instance"

    invoke-static {v0, p0}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    monitor-exit v1

    return-object v2

    :goto_1
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p0
.end method
