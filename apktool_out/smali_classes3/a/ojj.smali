.class public final La/ojj;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/ony;


# direct methods
.method public constructor <init>(La/ony;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/ojj;->a:La/ony;

    .line 11
    .line 12
    return-void

    .line 13
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/ojj;->a:La/ony;

    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, La/ojj;->a:La/ony;

    .line 23
    .line 24
    return-void

    .line 25
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public a(La/gv00;La/zje;)Ljava/io/Serializable;
    .locals 7

    .line 1
    instance-of v0, p2, La/kfi0;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/kfi0;

    .line 7
    .line 8
    iget v1, v0, La/kfi0;->k:I

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
    iput v1, v0, La/kfi0;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/kfi0;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/kfi0;-><init>(La/ojj;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/kfi0;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/kfi0;->k:I

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
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 42
    .line 43
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    return-object v4

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    :try_start_1
    sget-object p2, La/j0g0;->b:La/e0g0;

    .line 51
    .line 52
    iget-object p0, p0, La/ojj;->a:La/ony;

    .line 53
    .line 54
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 55
    .line 56
    invoke-direct {p2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v2, "event"

    .line 60
    .line 61
    const-string v5, "userId"

    .line 62
    .line 63
    iget-object v6, p1, La/gv00;->a:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v6}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-interface {p2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    const-string v5, "wifiName"

    .line 73
    .line 74
    iget-object v6, p1, La/gv00;->b:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v6}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-interface {p2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    const-string v5, "carrierName"

    .line 84
    .line 85
    iget-object v6, p1, La/gv00;->c:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v6}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    invoke-interface {p2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    const-string v5, "crashLogs"

    .line 95
    .line 96
    iget-object p1, p1, La/gv00;->d:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {p1}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-interface {p2, v5, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    new-instance p1, La/tny;

    .line 106
    .line 107
    invoke-static {p2}, La/xp20;->n(Ljava/util/Map;)Ljava/util/Map;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-direct {p1, v2, p2}, La/tny;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 112
    .line 113
    .line 114
    iput v3, v0, La/kfi0;->k:I

    .line 115
    .line 116
    check-cast p0, La/rny;

    .line 117
    .line 118
    iget-object p2, p0, La/rny;->f:La/mne;

    .line 119
    .line 120
    iget-object p2, p2, La/mne;->b:La/dvj;

    .line 121
    .line 122
    new-instance v2, La/u5u;

    .line 123
    .line 124
    const/16 v3, 0x1d

    .line 125
    .line 126
    invoke-direct {v2, p0, p1, v4, v3}, La/u5u;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 127
    .line 128
    .line 129
    invoke-static {p2, v2, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    if-ne p2, v1, :cond_3

    .line 134
    .line 135
    return-object v1

    .line 136
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 137
    .line 138
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 139
    .line 140
    .line 141
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :catchall_0
    move-exception p0

    .line 145
    sget-object p1, La/j0g0;->b:La/e0g0;

    .line 146
    .line 147
    new-instance p2, La/g0g0;

    .line 148
    .line 149
    invoke-direct {p2, p0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    :goto_2
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 153
    .line 154
    instance-of p1, p2, La/g0g0;

    .line 155
    .line 156
    if-eqz p1, :cond_4

    .line 157
    .line 158
    move-object p2, p0

    .line 159
    :cond_4
    return-object p2
.end method

.method public b(La/jb90;)V
    .locals 5

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p1, La/jb90;->a:La/ib90;

    .line 7
    .line 8
    iget-object v2, p1, La/jb90;->d:Ljava/lang/String;

    .line 9
    .line 10
    iget-object v3, v1, La/ib90;->a:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v3}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const-string v4, "ErrorType"

    .line 17
    .line 18
    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    iget-object v3, p1, La/jb90;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v3}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    const-string v4, "url"

    .line 28
    .line 29
    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    iget v3, p1, La/jb90;->c:I

    .line 33
    .line 34
    if-lez v3, :cond_0

    .line 35
    .line 36
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    invoke-static {v3}, La/ncy;->b(Ljava/lang/Number;)La/jdy;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    const-string v4, "statusCode"

    .line 45
    .line 46
    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-lez v3, :cond_1

    .line 54
    .line 55
    const-string v3, "description"

    .line 56
    .line 57
    invoke-static {v2}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_1
    sget-object v2, La/ib90;->b:La/ib90;

    .line 65
    .line 66
    if-ne v1, v2, :cond_2

    .line 67
    .line 68
    iget-boolean p1, p1, La/jb90;->e:Z

    .line 69
    .line 70
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1}, La/ncy;->a(Ljava/lang/Boolean;)La/jdy;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const-string v1, "sslProceeded"

    .line 79
    .line 80
    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    :cond_2
    new-instance p1, La/tny;

    .line 84
    .line 85
    invoke-static {v0}, La/xp20;->n(Ljava/util/Map;)Ljava/util/Map;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    const-string v1, "event"

    .line 90
    .line 91
    invoke-direct {p1, v1, v0}, La/tny;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 92
    .line 93
    .line 94
    iget-object p0, p0, La/ojj;->a:La/ony;

    .line 95
    .line 96
    check-cast p0, La/rny;

    .line 97
    .line 98
    const-string v0, "depositErrorEvent"

    .line 99
    .line 100
    invoke-virtual {p0, v0, p1}, La/rny;->a(Ljava/lang/String;La/tny;)V

    .line 101
    .line 102
    .line 103
    return-void
.end method

.method public c(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, La/wgm0;->s(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object p2

    .line 8
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v1, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    invoke-direct {v1, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const-string p1, "\n"

    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-static {p1}, La/ncy;->c(Ljava/lang/String;)La/jdy;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    const-string p2, "Debug"

    .line 35
    .line 36
    invoke-interface {v0, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    new-instance p1, La/tny;

    .line 40
    .line 41
    invoke-static {v0}, La/xp20;->n(Ljava/util/Map;)Ljava/util/Map;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    const-string v1, "event"

    .line 46
    .line 47
    invoke-direct {p1, v1, v0}, La/tny;-><init>(Ljava/lang/String;Ljava/util/Map;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/ojj;->a:La/ony;

    .line 51
    .line 52
    check-cast p0, La/rny;

    .line 53
    .line 54
    invoke-virtual {p0, p2, p1}, La/rny;->a(Ljava/lang/String;La/tny;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method
