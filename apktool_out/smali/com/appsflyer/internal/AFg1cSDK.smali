.class public final Lcom/appsflyer/internal/AFg1cSDK;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;
    }
.end annotation


# instance fields
.field private final AFKeystoreWrapper:Ljava/lang/String;

.field private AFLogger:Ljava/lang/StringBuilder;

.field private final unregisterClient:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    .line 17
    .line 18
    const/4 v0, 0x0

    .line 19
    iput-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFKeystoreWrapper:Ljava/lang/String;

    .line 20
    .line 21
    return-void
.end method

.method private AFLogger()V
    .locals 2

    .line 129
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 130
    :cond_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1cSDK;->registerClient()Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    move-result-object v0

    .line 131
    sget-object v1, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->AFKeystoreWrapper:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    if-ne v0, v1, :cond_1

    .line 132
    sget-object v0, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->registerClient:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    .line 133
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p0, v1, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 134
    :cond_1
    sget-object v1, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->registerClient:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    if-ne v0, v1, :cond_2

    .line 135
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    const/16 v0, 0x2c

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void

    .line 136
    :cond_2
    sget-object v1, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    if-ne v0, v1, :cond_3

    .line 137
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    const-string v1, ":"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 138
    sget-object v0, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->AFLogger:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    .line 139
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-interface {p0, v1, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    return-void

    .line 140
    :cond_3
    sget-object p0, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->force:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    if-ne v0, p0, :cond_4

    :goto_0
    return-void

    .line 141
    :cond_4
    new-instance p0, Lcom/appsflyer/internal/AFg1hSDK;

    const-string v0, "Nesting problem"

    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFg1hSDK;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private registerClient()Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    .line 10
    .line 11
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    add-int/lit8 v0, v0, -0x1

    .line 16
    .line 17
    invoke-interface {p0, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    new-instance p0, Lcom/appsflyer/internal/AFg1hSDK;

    .line 25
    .line 26
    const-string v0, "Nesting problem"

    .line 27
    .line 28
    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFg1hSDK;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw p0
.end method


# virtual methods
.method public final AFKeystoreWrapper(Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;Ljava/lang/String;)Lcom/appsflyer/internal/AFg1cSDK;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-gtz v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    new-instance p0, Lcom/appsflyer/internal/AFg1hSDK;

    .line 19
    .line 20
    const-string p1, "Nesting problem: multiple top-level roots"

    .line 21
    .line 22
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFg1hSDK;-><init>(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    throw p0

    .line 26
    :cond_1
    :goto_0
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger()V

    .line 27
    .line 28
    .line 29
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    .line 30
    .line 31
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    .line 35
    .line 36
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    return-object p0
.end method

.method public final AFLogger(Ljava/lang/String;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "\""

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x0

    .line 13
    :goto_0
    if-ge v2, v0, :cond_4

    .line 14
    .line 15
    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    const/16 v4, 0xc

    .line 20
    .line 21
    if-eq v3, v4, :cond_3

    .line 22
    .line 23
    const/16 v4, 0xd

    .line 24
    .line 25
    if-eq v3, v4, :cond_2

    .line 26
    .line 27
    const/16 v4, 0x22

    .line 28
    .line 29
    const/16 v5, 0x5c

    .line 30
    .line 31
    if-eq v3, v4, :cond_1

    .line 32
    .line 33
    const/16 v4, 0x2f

    .line 34
    .line 35
    if-eq v3, v4, :cond_1

    .line 36
    .line 37
    if-eq v3, v5, :cond_1

    .line 38
    .line 39
    packed-switch v3, :pswitch_data_0

    .line 40
    .line 41
    .line 42
    iget-object v4, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const/16 v5, 0x1f

    .line 45
    .line 46
    if-gt v3, v5, :cond_0

    .line 47
    .line 48
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 49
    .line 50
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    const-string v6, "\\u%04x"

    .line 59
    .line 60
    invoke-static {v5, v6, v3}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_0
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    goto :goto_1

    .line 72
    :pswitch_0
    iget-object v3, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v4, "\\n"

    .line 75
    .line 76
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    goto :goto_1

    .line 80
    :pswitch_1
    iget-object v3, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    .line 81
    .line 82
    const-string v4, "\\t"

    .line 83
    .line 84
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :pswitch_2
    iget-object v3, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v4, "\\b"

    .line 91
    .line 92
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    iget-object v4, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    .line 97
    .line 98
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    iget-object v3, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    .line 106
    .line 107
    const-string v4, "\\r"

    .line 108
    .line 109
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_3
    iget-object v3, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    .line 114
    .line 115
    const-string v4, "\\f"

    .line 116
    .line 117
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    :goto_1
    add-int/lit8 v2, v2, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_4
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    return-void

    .line 129
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d(Ljava/lang/Object;)Lcom/appsflyer/internal/AFg1cSDK;
    .locals 7

    .line 1
    const v0, -0x5c17f40d

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v1, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    .line 9
    .line 10
    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_7

    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    invoke-static {v1, v1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    int-to-char v2, v2

    .line 22
    invoke-static {}, Landroid/view/KeyEvent;->getMaxKeyCode()I

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    shr-int/lit8 v3, v3, 0x10

    .line 27
    .line 28
    rsub-int v3, v3, 0x13e

    .line 29
    .line 30
    const-wide/16 v4, 0x0

    .line 31
    .line 32
    invoke-static {v4, v5}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    add-int/lit8 v4, v4, 0x26

    .line 37
    .line 38
    invoke-static {v2, v3, v4}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    check-cast v2, Ljava/lang/Class;

    .line 43
    .line 44
    invoke-virtual {v2, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_2

    .line 49
    .line 50
    :try_start_0
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v2

    .line 54
    sget-object v3, Lcom/appsflyer/internal/AFa1bSDK;->getInstance:Ljava/util/Map;

    .line 55
    .line 56
    invoke-interface {v3, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    if-eqz v4, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    invoke-static {v1, v1}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    int-to-char v4, v4

    .line 68
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    shr-int/lit8 v5, v5, 0x10

    .line 73
    .line 74
    rsub-int v5, v5, 0x13e

    .line 75
    .line 76
    const-string v6, ""

    .line 77
    .line 78
    invoke-static {v6, v1}, Landroid/text/TextUtils;->getOffsetBefore(Ljava/lang/CharSequence;I)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    rsub-int/lit8 v1, v1, 0x25

    .line 83
    .line 84
    invoke-static {v4, v5, v1}, Lcom/appsflyer/internal/AFa1bSDK;->AFLogger(CII)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    check-cast v1, Ljava/lang/Class;

    .line 89
    .line 90
    const-string v4, "AFLogger"

    .line 91
    .line 92
    const-class v5, Lcom/appsflyer/internal/AFg1cSDK;

    .line 93
    .line 94
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-virtual {v1, v4, v5}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    invoke-interface {v3, v0, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    :goto_0
    check-cast v4, Ljava/lang/reflect/Method;

    .line 106
    .line 107
    invoke-virtual {v4, p1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 108
    .line 109
    .line 110
    return-object p0

    .line 111
    :catchall_0
    move-exception p0

    .line 112
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    if-eqz p1, :cond_1

    .line 117
    .line 118
    throw p1

    .line 119
    :cond_1
    throw p0

    .line 120
    :cond_2
    instance-of v0, p1, Lcom/appsflyer/internal/AFg1gSDK;

    .line 121
    .line 122
    if-eqz v0, :cond_3

    .line 123
    .line 124
    check-cast p1, Lcom/appsflyer/internal/AFg1gSDK;

    .line 125
    .line 126
    invoke-virtual {p1, p0}, Lcom/appsflyer/internal/AFg1gSDK;->registerClient(Lcom/appsflyer/internal/AFg1cSDK;)V

    .line 127
    .line 128
    .line 129
    return-object p0

    .line 130
    :cond_3
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger()V

    .line 131
    .line 132
    .line 133
    if-eqz p1, :cond_6

    .line 134
    .line 135
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 136
    .line 137
    if-nez v0, :cond_6

    .line 138
    .line 139
    sget-object v0, Lcom/appsflyer/internal/AFg1gSDK;->d:Ljava/lang/Object;

    .line 140
    .line 141
    if-ne p1, v0, :cond_4

    .line 142
    .line 143
    goto :goto_1

    .line 144
    :cond_4
    instance-of v0, p1, Ljava/lang/Number;

    .line 145
    .line 146
    if-eqz v0, :cond_5

    .line 147
    .line 148
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    .line 149
    .line 150
    check-cast p1, Ljava/lang/Number;

    .line 151
    .line 152
    invoke-static {p1}, Lcom/appsflyer/internal/AFg1gSDK;->AFKeystoreWrapper(Ljava/lang/Number;)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    return-object p0

    .line 160
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p0, p1}, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    return-object p0

    .line 168
    :cond_6
    :goto_1
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    .line 169
    .line 170
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    return-object p0

    .line 174
    :cond_7
    new-instance p0, Lcom/appsflyer/internal/AFg1hSDK;

    .line 175
    .line 176
    const-string p1, "Nesting problem"

    .line 177
    .line 178
    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFg1hSDK;-><init>(Ljava/lang/String;)V

    .line 179
    .line 180
    .line 181
    throw p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x0

    .line 10
    return-object p0

    .line 11
    :cond_0
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method

.method public final unregisterClient(Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;Ljava/lang/String;)Lcom/appsflyer/internal/AFg1cSDK;
    .locals 1

    .line 43
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1cSDK;->registerClient()Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    move-result-object v0

    if-eq v0, p2, :cond_1

    if-ne v0, p1, :cond_0

    goto :goto_0

    .line 44
    :cond_0
    new-instance p0, Lcom/appsflyer/internal/AFg1hSDK;

    const-string p1, "Nesting problem"

    invoke-direct {p0, p1}, Lcom/appsflyer/internal/AFg1hSDK;-><init>(Ljava/lang/String;)V

    throw p0

    .line 45
    :cond_1
    :goto_0
    iget-object p1, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p2

    add-int/lit8 p2, p2, -0x1

    invoke-interface {p1, p2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 46
    iget-object p1, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public final unregisterClient()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/appsflyer/internal/AFg1cSDK;->registerClient()Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->AFLogger:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    .line 6
    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/appsflyer/internal/AFg1cSDK;->AFLogger:Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const/16 v1, 0x2c

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    sget-object v1, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->d:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    .line 18
    .line 19
    if-ne v0, v1, :cond_1

    .line 20
    .line 21
    :goto_0
    sget-object v0, Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;->unregisterClient:Lcom/appsflyer/internal/AFg1cSDK$AFa1ySDK;

    .line 22
    .line 23
    iget-object p0, p0, Lcom/appsflyer/internal/AFg1cSDK;->unregisterClient:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    add-int/lit8 v1, v1, -0x1

    .line 30
    .line 31
    invoke-interface {p0, v1, v0}, Ljava/util/List;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    new-instance p0, Lcom/appsflyer/internal/AFg1hSDK;

    .line 36
    .line 37
    const-string v0, "Nesting problem"

    .line 38
    .line 39
    invoke-direct {p0, v0}, Lcom/appsflyer/internal/AFg1hSDK;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    throw p0
.end method
