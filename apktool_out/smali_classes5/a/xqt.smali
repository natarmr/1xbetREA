.class public final La/xqt;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:B

.field public final b:La/pzu;


# direct methods
.method public synthetic constructor <init>(La/pzu;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xqt;->a:B

    iput-object p1, p0, La/xqt;->b:La/pzu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/zje;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/xqt;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object v2, p0, La/xqt;->b:La/pzu;

    .line 5
    .line 6
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 7
    .line 8
    const/4 v4, 0x1

    .line 9
    const/high16 v5, -0x80000000

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v0, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    instance-of v0, p1, La/zyu;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    move-object v0, p1

    .line 20
    check-cast v0, La/zyu;

    .line 21
    .line 22
    iget v7, v0, La/zyu;->k:I

    .line 23
    .line 24
    and-int v8, v7, v5

    .line 25
    .line 26
    if-eqz v8, :cond_0

    .line 27
    .line 28
    sub-int/2addr v7, v5

    .line 29
    iput v7, v0, La/zyu;->k:I

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_0
    new-instance v0, La/zyu;

    .line 33
    .line 34
    invoke-direct {v0, p0, p1}, La/zyu;-><init>(La/xqt;La/zje;)V

    .line 35
    .line 36
    .line 37
    :goto_0
    iget-object p0, v0, La/zyu;->i:Ljava/lang/Object;

    .line 38
    .line 39
    sget-object p1, La/wne;->a:La/wne;

    .line 40
    .line 41
    iget v5, v0, La/zyu;->k:I

    .line 42
    .line 43
    if-eqz v5, :cond_2

    .line 44
    .line 45
    if-ne v5, v4, :cond_1

    .line 46
    .line 47
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_1
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    iput v4, v0, La/zyu;->k:I

    .line 59
    .line 60
    invoke-virtual {v2, v0}, La/pzu;->E(La/zje;)Ljava/io/Serializable;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    if-ne p0, p1, :cond_3

    .line 65
    .line 66
    move-object v6, p1

    .line 67
    goto :goto_2

    .line 68
    :cond_3
    :goto_1
    check-cast p0, Ljava/lang/Iterable;

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_5

    .line 79
    .line 80
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    move-object v0, p1

    .line 85
    check-cast v0, La/h85;

    .line 86
    .line 87
    iget-object v0, v0, La/h85;->b:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 88
    .line 89
    sget-object v2, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->p:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 90
    .line 91
    if-ne v0, v2, :cond_4

    .line 92
    .line 93
    move-object v6, p1

    .line 94
    :cond_5
    if-eqz v6, :cond_6

    .line 95
    .line 96
    move v1, v4

    .line 97
    :cond_6
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 98
    .line 99
    .line 100
    move-result-object v6

    .line 101
    :goto_2
    return-object v6

    .line 102
    :pswitch_0
    instance-of v0, p1, La/sju;

    .line 103
    .line 104
    if-eqz v0, :cond_7

    .line 105
    .line 106
    move-object v0, p1

    .line 107
    check-cast v0, La/sju;

    .line 108
    .line 109
    iget v7, v0, La/sju;->k:I

    .line 110
    .line 111
    and-int v8, v7, v5

    .line 112
    .line 113
    if-eqz v8, :cond_7

    .line 114
    .line 115
    sub-int/2addr v7, v5

    .line 116
    iput v7, v0, La/sju;->k:I

    .line 117
    .line 118
    goto :goto_3

    .line 119
    :cond_7
    new-instance v0, La/sju;

    .line 120
    .line 121
    invoke-direct {v0, p0, p1}, La/sju;-><init>(La/xqt;La/zje;)V

    .line 122
    .line 123
    .line 124
    :goto_3
    iget-object p0, v0, La/sju;->i:Ljava/lang/Object;

    .line 125
    .line 126
    sget-object p1, La/wne;->a:La/wne;

    .line 127
    .line 128
    iget v5, v0, La/sju;->k:I

    .line 129
    .line 130
    if-eqz v5, :cond_9

    .line 131
    .line 132
    if-ne v5, v4, :cond_8

    .line 133
    .line 134
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    goto :goto_4

    .line 138
    :cond_8
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto :goto_5

    .line 142
    :cond_9
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 143
    .line 144
    .line 145
    iput v4, v0, La/sju;->k:I

    .line 146
    .line 147
    invoke-virtual {v2, v0}, La/pzu;->E(La/zje;)Ljava/io/Serializable;

    .line 148
    .line 149
    .line 150
    move-result-object p0

    .line 151
    if-ne p0, p1, :cond_a

    .line 152
    .line 153
    move-object v6, p1

    .line 154
    goto :goto_5

    .line 155
    :cond_a
    :goto_4
    check-cast p0, Ljava/lang/Iterable;

    .line 156
    .line 157
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    :cond_b
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    if-eqz p1, :cond_d

    .line 166
    .line 167
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object p1

    .line 171
    move-object v0, p1

    .line 172
    check-cast v0, La/h85;

    .line 173
    .line 174
    iget-object v0, v0, La/h85;->b:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 175
    .line 176
    sget-object v2, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->g:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 177
    .line 178
    if-eq v0, v2, :cond_c

    .line 179
    .line 180
    sget-object v2, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->h:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 181
    .line 182
    if-eq v0, v2, :cond_c

    .line 183
    .line 184
    sget-object v2, Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;->i:Lorg/xplatform/responsible_game/impl/domain/models/LimitTypeEnum;

    .line 185
    .line 186
    if-ne v0, v2, :cond_b

    .line 187
    .line 188
    :cond_c
    move-object v6, p1

    .line 189
    :cond_d
    if-eqz v6, :cond_e

    .line 190
    .line 191
    move v1, v4

    .line 192
    :cond_e
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    :goto_5
    return-object v6

    .line 197
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public b()V
    .locals 4

    .line 1
    iget-object p0, p0, La/xqt;->b:La/pzu;

    .line 2
    .line 3
    iget-object p0, p0, La/pzu;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, La/dzz;

    .line 6
    .line 7
    iget-wide v0, p0, La/dzz;->d:J

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 16
    .line 17
    .line 18
    move-result-wide v0

    .line 19
    iput-wide v0, p0, La/dzz;->d:J

    .line 20
    .line 21
    :cond_0
    sget-object v0, La/wen;->b:La/uen;

    .line 22
    .line 23
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 24
    .line 25
    .line 26
    move-result-wide v0

    .line 27
    iget-wide v2, p0, La/dzz;->f:J

    .line 28
    .line 29
    sub-long/2addr v0, v2

    .line 30
    sget-object v2, La/bfn;->d:La/bfn;

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, La/ibc;->w0(JLa/bfn;)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    sget-object v2, La/bfn;->f:La/bfn;

    .line 37
    .line 38
    invoke-static {v0, v1, v2}, La/wen;->l(JLa/bfn;)J

    .line 39
    .line 40
    .line 41
    move-result-wide v0

    .line 42
    long-to-int v0, v0

    .line 43
    iput v0, p0, La/dzz;->e:I

    .line 44
    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    iput-wide v0, p0, La/dzz;->f:J

    .line 50
    .line 51
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 52
    .line 53
    .line 54
    move-result-wide v0

    .line 55
    iput-wide v0, p0, La/dzz;->g:J

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    iput-boolean v0, p0, La/dzz;->h:Z

    .line 59
    .line 60
    iget-object p0, p0, La/dzz;->a:La/ol60;

    .line 61
    .line 62
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 63
    .line 64
    invoke-virtual {p0, v0}, La/ol60;->f(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    return-void
.end method
