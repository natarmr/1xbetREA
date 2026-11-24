.class public final Lcom/appsflyer/internal/AFb1sSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e"
    }
    d2 = {
        "Lcom/appsflyer/internal/AFb1sSDK;",
        "",
        "Lcom/appsflyer/internal/AFh1pSDK;",
        "event",
        "",
        "rawData",
        "<init>",
        "(Lcom/appsflyer/internal/AFh1pSDK;[B)V",
        "",
        "afInfoLog",
        "()V",
        "registerClient",
        "Lcom/appsflyer/internal/AFh1pSDK;",
        "d",
        "[B",
        "AFLogger"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final d:[B

.field private final registerClient:Lcom/appsflyer/internal/AFh1pSDK;


# direct methods
.method public constructor <init>(Lcom/appsflyer/internal/AFh1pSDK;[B)V
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
    iput-object p1, p0, Lcom/appsflyer/internal/AFb1sSDK;->registerClient:Lcom/appsflyer/internal/AFh1pSDK;

    .line 8
    .line 9
    iput-object p2, p0, Lcom/appsflyer/internal/AFb1sSDK;->d:[B

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final afInfoLog()V
    .locals 8

    .line 1
    const v0, -0x60621a20

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, 0x12bb9330

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    :try_start_0
    sget-object v2, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    .line 16
    .line 17
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const/4 v4, 0x0

    .line 22
    const v5, 0xdfb0

    .line 23
    .line 24
    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatDelay()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    shr-int/lit8 v3, v3, 0x10

    .line 33
    .line 34
    add-int/2addr v3, v5

    .line 35
    int-to-char v3, v3

    .line 36
    invoke-static {}, Landroid/os/Process;->myTid()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    shr-int/lit8 v6, v6, 0x16

    .line 41
    .line 42
    add-int/lit8 v6, v6, 0x57

    .line 43
    .line 44
    const/16 v7, 0x30

    .line 45
    .line 46
    invoke-static {v7}, Landroid/text/AndroidCharacter;->getMirror(C)C

    .line 47
    .line 48
    .line 49
    move-result v7

    .line 50
    add-int/lit8 v7, v7, -0xb

    .line 51
    .line 52
    invoke-static {v3, v6, v7}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    check-cast v3, Ljava/lang/Class;

    .line 57
    .line 58
    invoke-virtual {v3, v4}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :goto_0
    check-cast v3, Ljava/lang/reflect/Constructor;

    .line 66
    .line 67
    invoke-virtual {v3, v4}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    iget-object v3, p0, Lcom/appsflyer/internal/AFb1sSDK;->registerClient:Lcom/appsflyer/internal/AFh1pSDK;

    .line 72
    .line 73
    iget-object p0, p0, Lcom/appsflyer/internal/AFb1sSDK;->d:[B

    .line 74
    .line 75
    const/4 v4, 0x2

    .line 76
    :try_start_1
    new-array v4, v4, [Ljava/lang/Object;

    .line 77
    .line 78
    const/4 v6, 0x1

    .line 79
    aput-object p0, v4, v6

    .line 80
    .line 81
    const/4 p0, 0x0

    .line 82
    aput-object v3, v4, p0

    .line 83
    .line 84
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    if-eqz p0, :cond_1

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getKeyRepeatTimeout()I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    shr-int/lit8 p0, p0, 0x10

    .line 96
    .line 97
    add-int/2addr p0, v5

    .line 98
    int-to-char p0, p0

    .line 99
    const-string v3, ""

    .line 100
    .line 101
    invoke-static {v3}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    .line 102
    .line 103
    .line 104
    move-result v3

    .line 105
    rsub-int/lit8 v3, v3, 0x56

    .line 106
    .line 107
    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    shr-int/lit8 v5, v5, 0x10

    .line 112
    .line 113
    add-int/lit8 v5, v5, 0x25

    .line 114
    .line 115
    invoke-static {p0, v3, v5}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, Ljava/lang/Class;

    .line 120
    .line 121
    const-string v3, "AFLogger"

    .line 122
    .line 123
    const-class v5, Lcom/appsflyer/internal/AFh1pSDK;

    .line 124
    .line 125
    const-class v6, [B

    .line 126
    .line 127
    filled-new-array {v5, v6}, [Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual {p0, v3, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    :goto_1
    check-cast p0, Ljava/lang/reflect/Method;

    .line 139
    .line 140
    invoke-virtual {p0, v1, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    .line 142
    .line 143
    return-void

    .line 144
    :catchall_0
    move-exception p0

    .line 145
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    if-eqz v0, :cond_2

    .line 150
    .line 151
    throw v0

    .line 152
    :cond_2
    throw p0
.end method
