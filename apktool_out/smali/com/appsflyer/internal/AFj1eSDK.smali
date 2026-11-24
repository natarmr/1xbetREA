.class public final Lcom/appsflyer/internal/AFj1eSDK;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/appsflyer/internal/AFj1cSDK;


# instance fields
.field private final AFKeystoreWrapper:La/a8z;

.field private AFLogger:Lcom/appsflyer/share/platform_extension/PluginInfo;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lcom/appsflyer/c;

    .line 5
    .line 6
    const/4 v1, 0x5

    .line 7
    invoke-direct {v0, v1}, Lcom/appsflyer/c;-><init>(B)V

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    iput-object v0, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFKeystoreWrapper:La/a8z;

    .line 15
    .line 16
    return-void
.end method

.method private static final AFKeystoreWrapper()Lcom/appsflyer/share/platform_extension/PluginInfo;
    .locals 6

    .line 1
    new-instance v0, Lcom/appsflyer/share/platform_extension/PluginInfo;

    .line 2
    .line 3
    sget-object v1, Lcom/appsflyer/share/platform_extension/Plugin;->NATIVE:Lcom/appsflyer/share/platform_extension/Plugin;

    .line 4
    .line 5
    const/4 v4, 0x4

    .line 6
    const/4 v5, 0x0

    .line 7
    const-string v2, "7.0.1"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct/range {v0 .. v5}, Lcom/appsflyer/share/platform_extension/PluginInfo;-><init>(Lcom/appsflyer/share/platform_extension/Plugin;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 11
    .line 12
    .line 13
    return-object v0
.end method

.method public static synthetic a()Lcom/appsflyer/share/platform_extension/PluginInfo;
    .locals 1

    .line 1
    invoke-static {}, Lcom/appsflyer/internal/AFj1eSDK;->AFKeystoreWrapper()Lcom/appsflyer/share/platform_extension/PluginInfo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final AFLogger()Ljava/util/Map;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFLogger:Lcom/appsflyer/share/platform_extension/PluginInfo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFKeystoreWrapper:La/a8z;

    .line 6
    .line 7
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/appsflyer/share/platform_extension/PluginInfo;

    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, Lcom/appsflyer/share/platform_extension/PluginInfo;->getPlugin()Lcom/appsflyer/share/platform_extension/Plugin;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/appsflyer/share/platform_extension/Plugin;->getPluginName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Lkotlin/Pair;

    .line 22
    .line 23
    const-string v2, "platform"

    .line 24
    .line 25
    invoke-direct {v1, v2, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFLogger:Lcom/appsflyer/share/platform_extension/PluginInfo;

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFKeystoreWrapper:La/a8z;

    .line 33
    .line 34
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    check-cast v0, Lcom/appsflyer/share/platform_extension/PluginInfo;

    .line 39
    .line 40
    :cond_1
    invoke-virtual {v0}, Lcom/appsflyer/share/platform_extension/PluginInfo;->getVersion()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    new-instance v2, Lkotlin/Pair;

    .line 45
    .line 46
    const-string v3, "version"

    .line 47
    .line 48
    invoke-direct {v2, v3, v0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    filled-new-array {v1, v2}, [Lkotlin/Pair;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, La/xp20;->h([Lkotlin/Pair;)Ljava/util/LinkedHashMap;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFLogger:Lcom/appsflyer/share/platform_extension/PluginInfo;

    .line 60
    .line 61
    if-nez v1, :cond_2

    .line 62
    .line 63
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFKeystoreWrapper:La/a8z;

    .line 64
    .line 65
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    check-cast v1, Lcom/appsflyer/share/platform_extension/PluginInfo;

    .line 70
    .line 71
    :cond_2
    invoke-virtual {v1}, Lcom/appsflyer/share/platform_extension/PluginInfo;->getAdditionalParams()Ljava/util/Map;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    invoke-interface {v1}, Ljava/util/Map;->isEmpty()Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_4

    .line 80
    .line 81
    iget-object v1, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFLogger:Lcom/appsflyer/share/platform_extension/PluginInfo;

    .line 82
    .line 83
    if-nez v1, :cond_3

    .line 84
    .line 85
    iget-object p0, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFKeystoreWrapper:La/a8z;

    .line 86
    .line 87
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    move-object v1, p0

    .line 92
    check-cast v1, Lcom/appsflyer/share/platform_extension/PluginInfo;

    .line 93
    .line 94
    :cond_3
    invoke-virtual {v1}, Lcom/appsflyer/share/platform_extension/PluginInfo;->getAdditionalParams()Ljava/util/Map;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    const-string v1, "extras"

    .line 99
    .line 100
    invoke-interface {v0, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    :cond_4
    return-object v0
.end method

.method public final registerClient(Lcom/appsflyer/share/platform_extension/PluginInfo;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFLogger:Lcom/appsflyer/share/platform_extension/PluginInfo;

    .line 5
    .line 6
    return-void
.end method

.method public final unregisterClient()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFLogger:Lcom/appsflyer/share/platform_extension/PluginInfo;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/appsflyer/internal/AFj1eSDK;->AFKeystoreWrapper:La/a8z;

    .line 6
    .line 7
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    move-object v0, p0

    .line 12
    check-cast v0, Lcom/appsflyer/share/platform_extension/PluginInfo;

    .line 13
    .line 14
    :cond_0
    invoke-virtual {v0}, Lcom/appsflyer/share/platform_extension/PluginInfo;->getPlugin()Lcom/appsflyer/share/platform_extension/Plugin;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Lcom/appsflyer/share/platform_extension/Plugin;->getPluginName()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
