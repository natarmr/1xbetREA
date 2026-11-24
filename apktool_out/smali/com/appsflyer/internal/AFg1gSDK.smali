.class public final Lcom/appsflyer/internal/AFg1gSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final AFLogger:Ljava/lang/Double;

.field public static final d:Ljava/lang/Object;


# instance fields
.field private final unregisterClient:Ljava/util/LinkedHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/LinkedHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/appsflyer/internal/AFg1gSDK$4;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/appsflyer/internal/AFg1gSDK$4;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/appsflyer/internal/AFg1gSDK;->d:Ljava/lang/Object;

    .line 7
    .line 8
    const-wide/high16 v0, -0x8000000000000000L

    .line 9
    .line 10
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    sput-object v0, Lcom/appsflyer/internal/AFg1gSDK;->AFLogger:Ljava/lang/Double;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 167
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 168
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    iput-object v0, p0, Lcom/appsflyer/internal/AFg1gSDK;->unregisterClient:Ljava/util/LinkedHashMap;

    return-void
.end method

.method private constructor <init>(Ljava/lang/Object;)V
    .locals 9

    .line 1
    const v0, 0x3b8b4547

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, -0x46d1e5b6

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 16
    .line 17
    .line 18
    :try_start_0
    sget-object v2, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    .line 19
    .line 20
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    const-string v4, "AFLogger"

    .line 25
    .line 26
    const/4 v5, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    :try_start_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumDrawingCacheSize()I

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    shr-int/lit8 v3, v3, 0x18

    .line 36
    .line 37
    int-to-char v3, v3

    .line 38
    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollFriction()F

    .line 39
    .line 40
    .line 41
    move-result v7

    .line 42
    const/4 v8, 0x0

    .line 43
    cmpl-float v7, v7, v8

    .line 44
    .line 45
    add-int/lit16 v7, v7, 0x162

    .line 46
    .line 47
    invoke-static {v6}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    add-int/lit8 v8, v8, 0x25

    .line 52
    .line 53
    invoke-static {v3, v7, v8}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v3

    .line 57
    check-cast v3, Ljava/lang/Class;

    .line 58
    .line 59
    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-interface {v2, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    :goto_0
    check-cast v3, Ljava/lang/reflect/Method;

    .line 67
    .line 68
    invoke-virtual {v3, p1, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 72
    instance-of v1, p1, Lcom/appsflyer/internal/AFg1gSDK;

    .line 73
    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    check-cast p1, Lcom/appsflyer/internal/AFg1gSDK;

    .line 77
    .line 78
    iget-object p1, p1, Lcom/appsflyer/internal/AFg1gSDK;->unregisterClient:Ljava/util/LinkedHashMap;

    .line 79
    .line 80
    iput-object p1, p0, Lcom/appsflyer/internal/AFg1gSDK;->unregisterClient:Ljava/util/LinkedHashMap;

    .line 81
    .line 82
    return-void

    .line 83
    :cond_1
    const-string p0, "AFJsonObject"

    .line 84
    .line 85
    const/4 v1, 0x2

    .line 86
    :try_start_2
    new-array v1, v1, [Ljava/lang/Object;

    .line 87
    .line 88
    const/4 v3, 0x1

    .line 89
    aput-object p0, v1, v3

    .line 90
    .line 91
    aput-object p1, v1, v6

    .line 92
    .line 93
    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    if-eqz p0, :cond_2

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    invoke-static {v6}, Landroid/graphics/Color;->alpha(I)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    const p1, 0x9337

    .line 105
    .line 106
    .line 107
    sub-int/2addr p1, p0

    .line 108
    int-to-char p0, p1

    .line 109
    invoke-static {}, Landroid/view/ViewConfiguration;->getPressedStateDuration()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    shr-int/lit8 p1, p1, 0x10

    .line 114
    .line 115
    rsub-int p1, p1, 0x11a

    .line 116
    .line 117
    invoke-static {v6, v6}, Landroid/view/View;->resolveSize(II)I

    .line 118
    .line 119
    .line 120
    move-result v3

    .line 121
    rsub-int/lit8 v3, v3, 0x24

    .line 122
    .line 123
    invoke-static {p0, p1, v3}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    check-cast p0, Ljava/lang/Class;

    .line 128
    .line 129
    const-class p1, Ljava/lang/Object;

    .line 130
    .line 131
    const-class v3, Ljava/lang/String;

    .line 132
    .line 133
    filled-new-array {p1, v3}, [Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-virtual {p0, v4, p1}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-interface {v2, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    :goto_1
    check-cast p0, Ljava/lang/reflect/Method;

    .line 145
    .line 146
    invoke-virtual {p0, v5, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object p0

    .line 150
    check-cast p0, Ljava/lang/Throwable;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 151
    .line 152
    throw p0

    .line 153
    :catchall_0
    move-exception p0

    .line 154
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    if-eqz p1, :cond_3

    .line 159
    .line 160
    throw p1

    .line 161
    :cond_3
    throw p0
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 5

    const v0, -0x16fac023

    .line 169
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :try_start_0
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    invoke-static {v2}, Landroid/graphics/Color;->green(I)I

    move-result v3

    int-to-char v3, v3

    invoke-static {v2}, Landroid/graphics/Color;->alpha(I)I

    move-result v2

    rsub-int v2, v2, 0x163

    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    add-int/lit8 v4, v4, 0x25

    invoke-static {v3, v2, v4}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Class;

    const-class v3, Ljava/lang/String;

    filled-new-array {v3}, [Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    check-cast v2, Ljava/lang/reflect/Constructor;

    invoke-virtual {v2, p1}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFg1gSDK;-><init>(Ljava/lang/Object;)V

    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_1

    throw p1

    :cond_1
    throw p0
.end method

.method public constructor <init>(Ljava/util/Map;)V
    .locals 3

    .line 162
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1gSDK;-><init>()V

    .line 163
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 164
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 165
    iget-object v2, p0, Lcom/appsflyer/internal/AFg1gSDK;->unregisterClient:Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, Lcom/appsflyer/internal/AFg1gSDK;->registerClient(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v1, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 166
    :cond_0
    const-string p0, "key == null"

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    return-void
.end method

.method public static AFKeystoreWrapper(Ljava/lang/Number;)Ljava/lang/String;
    .locals 11

    .line 1
    const v0, -0x7442d146

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz p0, :cond_4

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/Number;->doubleValue()D

    .line 11
    .line 12
    .line 13
    move-result-wide v1

    .line 14
    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    sget-object v4, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    .line 23
    .line 24
    invoke-interface {v4, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    const/4 v5, 0x0

    .line 32
    invoke-static {v5, v5}, Landroid/view/View;->getDefaultSize(II)I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    const v7, 0x9337

    .line 37
    .line 38
    .line 39
    sub-int/2addr v7, v6

    .line 40
    int-to-char v6, v7

    .line 41
    invoke-static {v5}, Landroid/util/TypedValue;->complexToFloat(I)F

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    const/4 v7, 0x0

    .line 46
    cmpl-float v5, v5, v7

    .line 47
    .line 48
    add-int/lit16 v5, v5, 0x11a

    .line 49
    .line 50
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    .line 51
    .line 52
    .line 53
    move-result-wide v7

    .line 54
    const-wide/16 v9, 0x0

    .line 55
    .line 56
    cmp-long v7, v7, v9

    .line 57
    .line 58
    add-int/lit8 v7, v7, 0x23

    .line 59
    .line 60
    invoke-static {v6, v5, v7}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    check-cast v5, Ljava/lang/Class;

    .line 65
    .line 66
    const-string v6, "d"

    .line 67
    .line 68
    sget-object v7, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    invoke-virtual {v5, v6, v7}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-interface {v4, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    :goto_0
    check-cast v5, Ljava/lang/reflect/Method;

    .line 82
    .line 83
    const/4 v0, 0x0

    .line 84
    invoke-virtual {v5, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    check-cast v0, Ljava/lang/Double;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    sget-object v0, Lcom/appsflyer/internal/AFg1gSDK;->AFLogger:Ljava/lang/Double;

    .line 94
    .line 95
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-eqz v0, :cond_1

    .line 100
    .line 101
    const-string p0, "-0"

    .line 102
    .line 103
    return-object p0

    .line 104
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 105
    .line 106
    .line 107
    move-result-wide v3

    .line 108
    long-to-double v5, v3

    .line 109
    cmpl-double v0, v1, v5

    .line 110
    .line 111
    if-nez v0, :cond_2

    .line 112
    .line 113
    invoke-static {v3, v4}, Ljava/lang/Long;->toString(J)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0

    .line 118
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    return-object p0

    .line 123
    :catchall_0
    move-exception p0

    .line 124
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    if-eqz v0, :cond_3

    .line 129
    .line 130
    throw v0

    .line 131
    :cond_3
    throw p0

    .line 132
    :cond_4
    new-instance p0, Lcom/appsflyer/internal/AFg1hSDK;

    .line 133
    .line 134
    const-string v0, "Number must be non-null"

    .line 135
    .line 136
    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFg1hSDK;-><init>(Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    throw p0
.end method

.method public static registerClient(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    const v0, 0x70b7f16a

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const v1, -0x64a5990b

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const v2, -0x29af3e44

    .line 16
    .line 17
    .line 18
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, ""

    .line 23
    .line 24
    if-nez p0, :cond_0

    .line 25
    .line 26
    sget-object p0, Lcom/appsflyer/internal/AFg1gSDK;->d:Ljava/lang/Object;

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    const/4 v4, 0x0

    .line 30
    invoke-static {v4}, Landroid/graphics/Color;->green(I)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    int-to-char v5, v5

    .line 35
    invoke-static {v4}, Landroid/telephony/cdma/CdmaCellLocation;->convertQuartSecToDecDegrees(I)D

    .line 36
    .line 37
    .line 38
    move-result-wide v6

    .line 39
    const-wide/16 v8, 0x0

    .line 40
    .line 41
    cmpl-double v6, v6, v8

    .line 42
    .line 43
    add-int/lit16 v6, v6, 0x13e

    .line 44
    .line 45
    invoke-static {v4, v4, v4}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 46
    .line 47
    .line 48
    move-result v7

    .line 49
    rsub-int/lit8 v7, v7, 0x25

    .line 50
    .line 51
    invoke-static {v5, v6, v7}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    check-cast v5, Ljava/lang/Class;

    .line 56
    .line 57
    invoke-virtual {v5, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v5

    .line 61
    if-nez v5, :cond_10

    .line 62
    .line 63
    instance-of v5, p0, Lcom/appsflyer/internal/AFg1gSDK;

    .line 64
    .line 65
    if-eqz v5, :cond_1

    .line 66
    .line 67
    return-object p0

    .line 68
    :cond_1
    :try_start_0
    instance-of v5, p0, Lorg/json/JSONArray;

    .line 69
    .line 70
    if-eqz v5, :cond_4

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v5
    :try_end_0
    .catch Lcom/appsflyer/internal/AFg1hSDK; {:try_start_0 .. :try_end_0} :catch_0

    .line 76
    :try_start_1
    filled-new-array {v5}, [Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v5

    .line 80
    sget-object v6, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    .line 81
    .line 82
    invoke-interface {v6, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    if-eqz v7, :cond_2

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_2
    invoke-static {v4, v4}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    int-to-char v7, v7

    .line 94
    invoke-static {v3, v4, v4}, Landroid/text/TextUtils;->getCapsMode(Ljava/lang/CharSequence;II)I

    .line 95
    .line 96
    .line 97
    move-result v8

    .line 98
    add-int/lit16 v8, v8, 0x13e

    .line 99
    .line 100
    invoke-static {v4, v4}, Landroid/view/View;->combineMeasuredStates(II)I

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    rsub-int/lit8 v9, v9, 0x25

    .line 105
    .line 106
    invoke-static {v7, v8, v9}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    check-cast v7, Ljava/lang/Class;

    .line 111
    .line 112
    const-class v8, Ljava/lang/String;

    .line 113
    .line 114
    filled-new-array {v8}, [Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    invoke-virtual {v7, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 119
    .line 120
    .line 121
    move-result-object v7

    .line 122
    invoke-interface {v6, v2, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    :goto_0
    check-cast v7, Ljava/lang/reflect/Constructor;

    .line 126
    .line 127
    invoke-virtual {v7, v5}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 131
    return-object p0

    .line 132
    :catchall_0
    move-exception v2

    .line 133
    :try_start_2
    invoke-virtual {v2}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 134
    .line 135
    .line 136
    move-result-object v5

    .line 137
    if-eqz v5, :cond_3

    .line 138
    .line 139
    throw v5

    .line 140
    :cond_3
    throw v2

    .line 141
    :cond_4
    instance-of v2, p0, Lorg/json/JSONObject;

    .line 142
    .line 143
    if-eqz v2, :cond_5

    .line 144
    .line 145
    new-instance v2, Lcom/appsflyer/internal/AFg1gSDK;

    .line 146
    .line 147
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v5

    .line 151
    invoke-direct {v2, v5}, Lcom/appsflyer/internal/AFg1gSDK;-><init>(Ljava/lang/String;)V
    :try_end_2
    .catch Lcom/appsflyer/internal/AFg1hSDK; {:try_start_2 .. :try_end_2} :catch_0

    .line 152
    .line 153
    .line 154
    return-object v2

    .line 155
    :catch_0
    :cond_5
    sget-object v2, Lcom/appsflyer/internal/AFg1gSDK;->d:Ljava/lang/Object;

    .line 156
    .line 157
    invoke-virtual {p0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 158
    .line 159
    .line 160
    move-result v2

    .line 161
    if-eqz v2, :cond_6

    .line 162
    .line 163
    goto/16 :goto_3

    .line 164
    .line 165
    :cond_6
    :try_start_3
    instance-of v2, p0, Ljava/util/Collection;

    .line 166
    .line 167
    if-eqz v2, :cond_9

    .line 168
    .line 169
    check-cast p0, Ljava/util/Collection;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    .line 170
    .line 171
    :try_start_4
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    sget-object v0, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    .line 176
    .line 177
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    if-eqz v2, :cond_7

    .line 182
    .line 183
    goto :goto_1

    .line 184
    :cond_7
    invoke-static {}, Landroid/os/Process;->getElapsedCpuTime()J

    .line 185
    .line 186
    .line 187
    move-result-wide v5

    .line 188
    const-wide/16 v7, 0x0

    .line 189
    .line 190
    cmp-long v2, v5, v7

    .line 191
    .line 192
    add-int/lit8 v2, v2, -0x1

    .line 193
    .line 194
    int-to-char v2, v2

    .line 195
    invoke-static {v4}, Landroid/graphics/Color;->alpha(I)I

    .line 196
    .line 197
    .line 198
    move-result v5

    .line 199
    rsub-int v5, v5, 0x13e

    .line 200
    .line 201
    invoke-static {v3, v4}, Landroid/text/TextUtils;->getOffsetAfter(Ljava/lang/CharSequence;I)I

    .line 202
    .line 203
    .line 204
    move-result v3

    .line 205
    add-int/lit8 v3, v3, 0x25

    .line 206
    .line 207
    invoke-static {v2, v5, v3}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v2

    .line 211
    check-cast v2, Ljava/lang/Class;

    .line 212
    .line 213
    const-class v3, Ljava/util/Collection;

    .line 214
    .line 215
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    :goto_1
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 227
    .line 228
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    .line 230
    .line 231
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 232
    return-object p0

    .line 233
    :catchall_1
    move-exception p0

    .line 234
    :try_start_5
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 235
    .line 236
    .line 237
    move-result-object v0

    .line 238
    if-eqz v0, :cond_8

    .line 239
    .line 240
    throw v0

    .line 241
    :cond_8
    throw p0

    .line 242
    :cond_9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    move-result-object v1

    .line 246
    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    .line 247
    .line 248
    .line 249
    move-result v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 250
    if-eqz v1, :cond_c

    .line 251
    .line 252
    :try_start_6
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    move-result-object p0

    .line 256
    sget-object v1, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    .line 257
    .line 258
    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    if-eqz v2, :cond_a

    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_a
    const/16 v2, 0x30

    .line 266
    .line 267
    invoke-static {v3, v2, v4, v4}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;CII)I

    .line 268
    .line 269
    .line 270
    move-result v2

    .line 271
    rsub-int/lit8 v2, v2, -0x1

    .line 272
    .line 273
    int-to-char v2, v2

    .line 274
    invoke-static {v4, v4, v4}, Landroid/view/View;->resolveSizeAndState(III)I

    .line 275
    .line 276
    .line 277
    move-result v3

    .line 278
    add-int/lit16 v3, v3, 0x13e

    .line 279
    .line 280
    invoke-static {}, Landroid/media/AudioTrack;->getMaxVolume()F

    .line 281
    .line 282
    .line 283
    move-result v4

    .line 284
    const/4 v5, 0x0

    .line 285
    cmpl-float v4, v4, v5

    .line 286
    .line 287
    add-int/lit8 v4, v4, 0x24

    .line 288
    .line 289
    invoke-static {v2, v3, v4}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    move-result-object v2

    .line 293
    check-cast v2, Ljava/lang/Class;

    .line 294
    .line 295
    const-class v3, Ljava/lang/Object;

    .line 296
    .line 297
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 298
    .line 299
    .line 300
    move-result-object v3

    .line 301
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 302
    .line 303
    .line 304
    move-result-object v2

    .line 305
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    .line 307
    .line 308
    :goto_2
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 309
    .line 310
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    .line 312
    .line 313
    move-result-object p0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 314
    return-object p0

    .line 315
    :catchall_2
    move-exception p0

    .line 316
    :try_start_7
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 317
    .line 318
    .line 319
    move-result-object v0

    .line 320
    if-eqz v0, :cond_b

    .line 321
    .line 322
    throw v0

    .line 323
    :cond_b
    throw p0

    .line 324
    :cond_c
    instance-of v0, p0, Ljava/util/Map;

    .line 325
    .line 326
    if-eqz v0, :cond_d

    .line 327
    .line 328
    new-instance v0, Lcom/appsflyer/internal/AFg1gSDK;

    .line 329
    .line 330
    check-cast p0, Ljava/util/Map;

    .line 331
    .line 332
    invoke-direct {v0, p0}, Lcom/appsflyer/internal/AFg1gSDK;-><init>(Ljava/util/Map;)V
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    .line 333
    .line 334
    .line 335
    return-object v0

    .line 336
    :cond_d
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 337
    .line 338
    if-nez v0, :cond_10

    .line 339
    .line 340
    instance-of v0, p0, Ljava/lang/Byte;

    .line 341
    .line 342
    if-nez v0, :cond_10

    .line 343
    .line 344
    instance-of v0, p0, Ljava/lang/Character;

    .line 345
    .line 346
    if-nez v0, :cond_10

    .line 347
    .line 348
    instance-of v0, p0, Ljava/lang/Double;

    .line 349
    .line 350
    if-nez v0, :cond_10

    .line 351
    .line 352
    instance-of v0, p0, Ljava/lang/Float;

    .line 353
    .line 354
    if-nez v0, :cond_10

    .line 355
    .line 356
    instance-of v0, p0, Ljava/lang/Integer;

    .line 357
    .line 358
    if-nez v0, :cond_10

    .line 359
    .line 360
    instance-of v0, p0, Ljava/lang/Long;

    .line 361
    .line 362
    if-nez v0, :cond_10

    .line 363
    .line 364
    instance-of v0, p0, Ljava/lang/Short;

    .line 365
    .line 366
    if-nez v0, :cond_10

    .line 367
    .line 368
    instance-of v0, p0, Ljava/lang/String;

    .line 369
    .line 370
    if-eqz v0, :cond_e

    .line 371
    .line 372
    goto :goto_3

    .line 373
    :cond_e
    :try_start_8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 374
    .line 375
    .line 376
    move-result-object v0

    .line 377
    invoke-virtual {v0}, Ljava/lang/Class;->getPackage()Ljava/lang/Package;

    .line 378
    .line 379
    .line 380
    move-result-object v0

    .line 381
    invoke-virtual {v0}, Ljava/lang/Package;->getName()Ljava/lang/String;

    .line 382
    .line 383
    .line 384
    move-result-object v0

    .line 385
    const-string v1, "java."

    .line 386
    .line 387
    invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 388
    .line 389
    .line 390
    move-result v0

    .line 391
    if-eqz v0, :cond_f

    .line 392
    .line 393
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 394
    .line 395
    .line 396
    move-result-object p0
    :try_end_8
    .catch Ljava/lang/Exception; {:try_start_8 .. :try_end_8} :catch_1

    .line 397
    return-object p0

    .line 398
    :catch_1
    :cond_f
    const/4 p0, 0x0

    .line 399
    :cond_10
    :goto_3
    return-object p0
.end method


# virtual methods
.method public final AFKeystoreWrapper(Ljava/lang/String;Ljava/lang/Object;)Lcom/appsflyer/internal/AFg1gSDK;
    .locals 6

    const v0, -0x7442d146

    .line 140
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    if-nez p2, :cond_0

    .line 141
    iget-object p2, p0, Lcom/appsflyer/internal/AFg1gSDK;->unregisterClient:Ljava/util/LinkedHashMap;

    invoke-virtual {p2, p1}, Ljava/util/AbstractMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    .line 142
    :cond_0
    instance-of v1, p2, Ljava/lang/Number;

    if-eqz v1, :cond_3

    .line 143
    move-object v1, p2

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    :try_start_0
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-eqz v3, :cond_1

    goto :goto_0

    :cond_1
    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    const v4, 0x9337

    sub-int/2addr v4, v3

    int-to-char v3, v4

    invoke-static {}, Landroid/view/ViewConfiguration;->getDoubleTapTimeout()I

    move-result v4

    shr-int/lit8 v4, v4, 0x10

    add-int/lit16 v4, v4, 0x11a

    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v5

    shr-int/lit8 v5, v5, 0x16

    rsub-int/lit8 v5, v5, 0x24

    invoke-static {v3, v4, v5}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Class;

    const-string v4, "d"

    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    filled-new-array {v5}, [Ljava/lang/Class;

    move-result-object v5

    invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    check-cast v3, Ljava/lang/reflect/Method;

    const/4 v0, 0x0

    invoke-virtual {v3, v0, v1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Double;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_2

    throw p1

    :cond_2
    throw p0

    .line 144
    :cond_3
    :goto_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1gSDK;->unregisterClient:Ljava/util/LinkedHashMap;

    if-eqz p1, :cond_4

    invoke-virtual {v0, p1, p2}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0

    .line 145
    :cond_4
    new-instance p0, Lcom/appsflyer/internal/AFg1hSDK;

    const-string p1, "Names must be non-null"

    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFg1hSDK;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final registerClient(Lcom/appsflyer/internal/AFg1cSDK;)V
    .locals 2

    .line 400
    sget-object v0, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->d:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    const-string v1, "{"

    invoke-virtual {p1, v0, v1}, Lcom/appsflyer/internal/AFg1cSDK;->AFKeystoreWrapper(Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;Ljava/lang/String;)Lcom/appsflyer/internal/AFg1cSDK;

    .line 401
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1gSDK;->unregisterClient:Ljava/util/LinkedHashMap;

    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 402
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 403
    invoke-virtual {p1}, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient()V

    .line 404
    invoke-virtual {p1, v1}, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger(Ljava/lang/String;)V

    .line 405
    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/appsflyer/internal/AFg1cSDK;->d(Ljava/lang/Object;)Lcom/appsflyer/internal/AFg1cSDK;

    goto :goto_0

    .line 406
    :cond_0
    new-instance p0, Lcom/appsflyer/internal/AFg1hSDK;

    const-string p1, "Names must be non-null"

    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFg1hSDK;-><init>(Ljava/lang/String;)V

    throw p0

    .line 407
    :cond_1
    sget-object p0, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->d:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    sget-object v0, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->AFLogger:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    const-string v1, "}"

    invoke-virtual {p1, p0, v0, v1}, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient(Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;Ljava/lang/String;)Lcom/appsflyer/internal/AFg1cSDK;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    :try_start_0
    new-instance v0, Lcom/appsflyer/internal/AFg1cSDK;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/appsflyer/internal/AFg1cSDK;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/appsflyer/internal/AFg1gSDK;->registerClient(Lcom/appsflyer/internal/AFg1cSDK;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/appsflyer/internal/AFg1cSDK;->toString()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0
    :try_end_0
    .catch Lcom/appsflyer/internal/AFg1hSDK; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    return-object p0

    .line 14
    :catch_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method
