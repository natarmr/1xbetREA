.class public Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;
.super Lcom/huawei/agconnect/config/AGConnectServicesConfig;
.source "SourceFile"


# instance fields
.field public final c:Landroid/content/Context;

.field public final d:Ljava/lang/String;

.field public volatile e:Lcom/huawei/agconnect/config/ConfigReader;

.field public final f:Ljava/lang/Object;

.field public g:Lcom/huawei/agconnect/AGCRoutePolicy;

.field public final h:Ljava/util/HashMap;

.field public volatile i:Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/Object;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->f:Ljava/lang/Object;

    .line 10
    .line 11
    sget-object v0, Lcom/huawei/agconnect/AGCRoutePolicy;->b:Lcom/huawei/agconnect/AGCRoutePolicy;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->g:Lcom/huawei/agconnect/AGCRoutePolicy;

    .line 14
    .line 15
    new-instance v0, Ljava/util/HashMap;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->h:Ljava/util/HashMap;

    .line 21
    .line 22
    iput-object p1, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->c:Landroid/content/Context;

    .line 23
    .line 24
    iput-object p2, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->d:Ljava/lang/String;

    .line 25
    .line 26
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "DEFAULT_INSTANCE"

    return-object p0
.end method

.method public final b()Lcom/huawei/agconnect/AGCRoutePolicy;
    .locals 3

    .line 1
    sget-object v0, Lcom/huawei/agconnect/AGCRoutePolicy;->b:Lcom/huawei/agconnect/AGCRoutePolicy;

    const-string v1, "AGC_ConfigImpl"

    const-string v2, "getRoutePolicy"

    invoke-static {v1, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v1, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->g:Lcom/huawei/agconnect/AGCRoutePolicy;

    if-ne v1, v0, :cond_0

    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->e:Lcom/huawei/agconnect/config/ConfigReader;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->d()V

    :cond_0
    iget-object p0, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->g:Lcom/huawei/agconnect/AGCRoutePolicy;

    return-object p0
.end method

.method public final d()V
    .locals 5

    .line 1
    const-string v0, "AGC_ConfigImpl"

    .line 2
    .line 3
    const-string v1, "initConfigReader"

    .line 4
    .line 5
    invoke-static {v0, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->e:Lcom/huawei/agconnect/config/ConfigReader;

    .line 9
    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->f:Ljava/lang/Object;

    .line 13
    .line 14
    monitor-enter v0

    .line 15
    :try_start_0
    iget-object v1, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->e:Lcom/huawei/agconnect/config/ConfigReader;

    .line 16
    .line 17
    if-nez v1, :cond_0

    .line 18
    .line 19
    new-instance v1, Lcom/huawei/agconnect/config/impl/SecurityResourcesReader;

    .line 20
    .line 21
    iget-object v2, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->c:Landroid/content/Context;

    .line 22
    .line 23
    iget-object v3, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->d:Ljava/lang/String;

    .line 24
    .line 25
    invoke-direct {v1, v2, v3}, Lcom/huawei/agconnect/config/impl/SecurityResourcesReader;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->e:Lcom/huawei/agconnect/config/ConfigReader;

    .line 29
    .line 30
    new-instance v1, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;

    .line 31
    .line 32
    iget-object v2, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->e:Lcom/huawei/agconnect/config/ConfigReader;

    .line 33
    .line 34
    invoke-direct {v1, v2}, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;-><init>(Lcom/huawei/agconnect/config/ConfigReader;)V

    .line 35
    .line 36
    .line 37
    iput-object v1, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->i:Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :catchall_0
    move-exception p0

    .line 41
    goto :goto_2

    .line 42
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->g:Lcom/huawei/agconnect/AGCRoutePolicy;

    .line 43
    .line 44
    sget-object v2, Lcom/huawei/agconnect/AGCRoutePolicy;->b:Lcom/huawei/agconnect/AGCRoutePolicy;

    .line 45
    .line 46
    if-ne v1, v2, :cond_2

    .line 47
    .line 48
    iget-object v1, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->e:Lcom/huawei/agconnect/config/ConfigReader;

    .line 49
    .line 50
    if-eqz v1, :cond_1

    .line 51
    .line 52
    iget-object v1, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->e:Lcom/huawei/agconnect/config/ConfigReader;

    .line 53
    .line 54
    const-string v2, "/region"

    .line 55
    .line 56
    check-cast v1, Lcom/huawei/agconnect/config/impl/SecurityResourcesReader;

    .line 57
    .line 58
    const/4 v3, 0x0

    .line 59
    invoke-virtual {v1, v2, v3}, Lcom/huawei/agconnect/config/impl/SecurityResourcesReader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    iget-object v2, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->e:Lcom/huawei/agconnect/config/ConfigReader;

    .line 64
    .line 65
    const-string v4, "/agcgw/url"

    .line 66
    .line 67
    check-cast v2, Lcom/huawei/agconnect/config/impl/SecurityResourcesReader;

    .line 68
    .line 69
    invoke-virtual {v2, v4, v3}, Lcom/huawei/agconnect/config/impl/SecurityResourcesReader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    invoke-static {v1, v2}, Lcom/huawei/agconnect/config/impl/Utils;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/huawei/agconnect/AGCRoutePolicy;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    iput-object v1, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->g:Lcom/huawei/agconnect/AGCRoutePolicy;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_1
    const-string p0, "AGConnectServiceConfig"

    .line 81
    .line 82
    const-string v1, "get route fail , config not ready"

    .line 83
    .line 84
    invoke-static {p0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 85
    .line 86
    .line 87
    :cond_2
    :goto_1
    monitor-exit v0

    .line 88
    return-void

    .line 89
    :goto_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    throw p0

    .line 91
    :cond_3
    return-void
.end method

.method public final getContext()Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->c:Landroid/content/Context;

    return-object p0
.end method

.method public final getString(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->e:Lcom/huawei/agconnect/config/ConfigReader;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->d()V

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v1, 0x0

    .line 13
    if-lez v0, :cond_1

    .line 14
    .line 15
    :goto_0
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/16 v2, 0x2f

    .line 20
    .line 21
    if-ne v0, v2, :cond_1

    .line 22
    .line 23
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v0, "/"

    .line 31
    .line 32
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->h:Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    check-cast v0, Ljava/lang/String;

    .line 43
    .line 44
    const-string v1, "AGC_ConfigImpl"

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    const-string p0, "use customValue"

    .line 49
    .line 50
    :goto_1
    invoke-static {v1, p0}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    return-object v0

    .line 54
    :cond_2
    sget-object v0, Lcom/huawei/agconnect/JsonProcessingFactory;->a:Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v2

    .line 60
    const/4 v3, 0x0

    .line 61
    if-nez v2, :cond_4

    .line 62
    .line 63
    :cond_3
    move-object v0, v3

    .line 64
    goto :goto_2

    .line 65
    :cond_4
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    check-cast v0, Lcom/huawei/agconnect/JsonProcessingFactory$JsonProcessor;

    .line 70
    .line 71
    if-eqz v0, :cond_3

    .line 72
    .line 73
    invoke-interface {v0, p0}, Lcom/huawei/agconnect/JsonProcessingFactory$JsonProcessor;->a(Lcom/huawei/agconnect/AGConnectOptions;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    :goto_2
    if-eqz v0, :cond_5

    .line 78
    .line 79
    const-string p0, "use processValue"

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_5
    iget-object v0, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->e:Lcom/huawei/agconnect/config/ConfigReader;

    .line 83
    .line 84
    check-cast v0, Lcom/huawei/agconnect/config/impl/SecurityResourcesReader;

    .line 85
    .line 86
    invoke-virtual {v0, p1, v3}, Lcom/huawei/agconnect/config/impl/SecurityResourcesReader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p1

    .line 90
    invoke-static {p1}, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;->b(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eqz v0, :cond_6

    .line 95
    .line 96
    iget-object p0, p0, Lcom/huawei/agconnect/config/impl/AGConnectServicesConfigImpl;->i:Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;

    .line 97
    .line 98
    invoke-virtual {p0, p1}, Lcom/huawei/agconnect/config/impl/DecryptExclamationMark;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object p0

    .line 102
    return-object p0

    .line 103
    :cond_6
    return-object p1
.end method
