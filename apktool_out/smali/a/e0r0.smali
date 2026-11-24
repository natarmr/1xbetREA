.class public final La/e0r0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public synthetic k:Ljava/lang/Object;

.field public final synthetic l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/cyu;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/sip;La/yje;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/e0r0;->i:B

    .line 20
    iput-object p1, p0, La/e0r0;->l:Ljava/lang/Object;

    iput-object p2, p0, La/e0r0;->m:Ljava/lang/Object;

    iput-object p3, p0, La/e0r0;->n:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/mie0;La/fge0;La/clz;La/n1r;La/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/e0r0;->i:B

    .line 19
    iput-object p1, p0, La/e0r0;->k:Ljava/lang/Object;

    iput-object p2, p0, La/e0r0;->l:Ljava/lang/Object;

    iput-object p3, p0, La/e0r0;->m:Ljava/lang/Object;

    iput-object p4, p0, La/e0r0;->n:Ljava/lang/Object;

    invoke-direct {p0, v0, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(ZLa/yez;La/cqq;La/pkk0;La/wpq;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/e0r0;->i:B

    .line 3
    .line 4
    iput-boolean p1, p0, La/e0r0;->j:Z

    .line 5
    .line 6
    iput-object p2, p0, La/e0r0;->k:Ljava/lang/Object;

    .line 7
    .line 8
    iput-object p3, p0, La/e0r0;->l:Ljava/lang/Object;

    .line 9
    .line 10
    iput-object p4, p0, La/e0r0;->m:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, La/e0r0;->n:Ljava/lang/Object;

    .line 13
    .line 14
    const/4 p1, 0x2

    .line 15
    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 12

    .line 1
    iget-byte v0, p0, La/e0r0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/e0r0;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/e0r0;->m:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/e0r0;->l:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v4, La/e0r0;

    .line 13
    .line 14
    iget-object p0, p0, La/e0r0;->k:Ljava/lang/Object;

    .line 15
    .line 16
    move-object v5, p0

    .line 17
    check-cast v5, La/mie0;

    .line 18
    .line 19
    move-object v6, v3

    .line 20
    check-cast v6, La/fge0;

    .line 21
    .line 22
    move-object v7, v2

    .line 23
    check-cast v7, La/clz;

    .line 24
    .line 25
    move-object v8, v1

    .line 26
    check-cast v8, La/n1r;

    .line 27
    .line 28
    move-object v9, p2

    .line 29
    invoke-direct/range {v4 .. v9}, La/e0r0;-><init>(La/mie0;La/fge0;La/clz;La/n1r;La/yje;)V

    .line 30
    .line 31
    .line 32
    return-object v4

    .line 33
    :pswitch_0
    move-object v9, p2

    .line 34
    new-instance v5, La/e0r0;

    .line 35
    .line 36
    iget-boolean v6, p0, La/e0r0;->j:Z

    .line 37
    .line 38
    iget-object p0, p0, La/e0r0;->k:Ljava/lang/Object;

    .line 39
    .line 40
    move-object v7, p0

    .line 41
    check-cast v7, La/yez;

    .line 42
    .line 43
    move-object v8, v3

    .line 44
    check-cast v8, La/cqq;

    .line 45
    .line 46
    check-cast v2, La/pkk0;

    .line 47
    .line 48
    move-object v10, v1

    .line 49
    check-cast v10, La/wpq;

    .line 50
    .line 51
    move-object v11, v9

    .line 52
    move-object v9, v2

    .line 53
    invoke-direct/range {v5 .. v11}, La/e0r0;-><init>(ZLa/yez;La/cqq;La/pkk0;La/wpq;La/yje;)V

    .line 54
    .line 55
    .line 56
    return-object v5

    .line 57
    :pswitch_1
    move-object v9, p2

    .line 58
    new-instance p0, La/e0r0;

    .line 59
    .line 60
    check-cast v3, La/cyu;

    .line 61
    .line 62
    check-cast v2, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 63
    .line 64
    check-cast v1, La/sip;

    .line 65
    .line 66
    invoke-direct {p0, v3, v2, v1, v9}, La/e0r0;-><init>(La/cyu;Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/sip;La/yje;)V

    .line 67
    .line 68
    .line 69
    iput-object p1, p0, La/e0r0;->k:Ljava/lang/Object;

    .line 70
    .line 71
    return-object p0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/e0r0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/vne;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/e0r0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/e0r0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/e0r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/vne;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/e0r0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/e0r0;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/e0r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/kmq;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/e0r0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/e0r0;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/e0r0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/e0r0;->i:B

    .line 2
    .line 3
    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/e0r0;->l:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, p0, La/e0r0;->m:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, p0, La/e0r0;->n:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v6, La/n1r;

    .line 17
    .line 18
    check-cast v5, La/clz;

    .line 19
    .line 20
    move-object v11, v4

    .line 21
    check-cast v11, La/fge0;

    .line 22
    .line 23
    sget-object v0, La/wne;->a:La/wne;

    .line 24
    .line 25
    iget-boolean v4, p0, La/e0r0;->j:Z

    .line 26
    .line 27
    if-eqz v4, :cond_1

    .line 28
    .line 29
    if-ne v4, v3, :cond_0

    .line 30
    .line 31
    :try_start_0
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    .line 33
    .line 34
    goto :goto_2

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    move-object p0, v0

    .line 37
    goto :goto_4

    .line 38
    :cond_0
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    goto :goto_3

    .line 42
    :cond_1
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object p1, p0, La/e0r0;->k:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast p1, La/mie0;

    .line 48
    .line 49
    iget-object p1, p1, La/mie0;->a:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast p1, La/ls40;

    .line 52
    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    iget-object v1, v11, La/fge0;->x:Lkotlin/coroutines/CoroutineContext;

    .line 56
    .line 57
    invoke-static {v1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    iput-object v1, p1, La/ls40;->b:La/sje;

    .line 62
    .line 63
    :cond_2
    :try_start_1
    iput-boolean v3, p0, La/e0r0;->j:Z

    .line 64
    .line 65
    new-instance v10, La/ege0;

    .line 66
    .line 67
    const/4 v9, 0x0

    .line 68
    invoke-direct {v10, v11, v9}, La/ege0;-><init>(La/fge0;La/yje;)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p0}, La/yje;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    invoke-static {p1}, La/s0x;->P(Lkotlin/coroutines/CoroutineContext;)La/qq40;

    .line 76
    .line 77
    .line 78
    move-result-object v12

    .line 79
    iget-object p1, v11, La/fge0;->a:La/o39;

    .line 80
    .line 81
    new-instance v7, La/wn2;

    .line 82
    .line 83
    const/16 v8, 0x17

    .line 84
    .line 85
    invoke-direct/range {v7 .. v12}, La/wn2;-><init>(BLa/yje;Ljava/io/Serializable;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    invoke-static {p1, v7, p0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    if-ne p0, v0, :cond_3

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_3
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 96
    .line 97
    :goto_0
    if-ne p0, v0, :cond_4

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_4
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 101
    .line 102
    :goto_1
    if-ne p0, v0, :cond_5

    .line 103
    .line 104
    move-object v2, v0

    .line 105
    goto :goto_3

    .line 106
    :cond_5
    :goto_2
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    invoke-virtual {p0, v6}, La/glz;->f(La/blz;)V

    .line 111
    .line 112
    .line 113
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 114
    .line 115
    :goto_3
    return-object v2

    .line 116
    :goto_4
    invoke-interface {v5}, La/clz;->x()La/glz;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    invoke-virtual {p1, v6}, La/glz;->f(La/blz;)V

    .line 121
    .line 122
    .line 123
    throw p0

    .line 124
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 125
    .line 126
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    iget-boolean p1, p0, La/e0r0;->j:Z

    .line 130
    .line 131
    if-eqz p1, :cond_6

    .line 132
    .line 133
    iget-object p0, p0, La/e0r0;->k:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast p0, La/yez;

    .line 136
    .line 137
    invoke-virtual {p0}, La/yez;->c()Z

    .line 138
    .line 139
    .line 140
    move-result p0

    .line 141
    if-eqz p0, :cond_6

    .line 142
    .line 143
    check-cast v4, La/cqq;

    .line 144
    .line 145
    invoke-static {v4}, La/cqq;->a(La/cqq;)V

    .line 146
    .line 147
    .line 148
    check-cast v5, La/pkk0;

    .line 149
    .line 150
    if-eqz v5, :cond_7

    .line 151
    .line 152
    check-cast v5, La/r3k;

    .line 153
    .line 154
    invoke-virtual {v5}, La/r3k;->b()V

    .line 155
    .line 156
    .line 157
    goto :goto_5

    .line 158
    :cond_6
    check-cast v6, La/wpq;

    .line 159
    .line 160
    check-cast v6, La/ypq;

    .line 161
    .line 162
    invoke-virtual {v6, v3}, La/ypq;->b(Z)V

    .line 163
    .line 164
    .line 165
    :cond_7
    :goto_5
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_1
    iget-object v0, p0, La/e0r0;->k:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v0, La/kmq;

    .line 171
    .line 172
    sget-object v7, La/wne;->a:La/wne;

    .line 173
    .line 174
    iget-boolean v8, p0, La/e0r0;->j:Z

    .line 175
    .line 176
    if-eqz v8, :cond_9

    .line 177
    .line 178
    if-ne v8, v3, :cond_8

    .line 179
    .line 180
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 181
    .line 182
    .line 183
    goto :goto_6

    .line 184
    :cond_8
    invoke-static {v1}, La/jf4;->n(Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    goto :goto_7

    .line 188
    :cond_9
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    check-cast v4, La/cyu;

    .line 192
    .line 193
    iget-object p1, v4, La/cyu;->c:Ljava/lang/Object;

    .line 194
    .line 195
    check-cast p1, La/n660;

    .line 196
    .line 197
    check-cast v5, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 198
    .line 199
    check-cast v6, La/sip;

    .line 200
    .line 201
    invoke-virtual {p1, v5, v6}, La/n660;->r(Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;La/sip;)La/or30;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-virtual {p1}, La/or30;->b()Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object p1

    .line 209
    check-cast p1, Ljava/util/List;

    .line 210
    .line 211
    if-eqz p1, :cond_a

    .line 212
    .line 213
    iput-object v2, p0, La/e0r0;->k:Ljava/lang/Object;

    .line 214
    .line 215
    iput-boolean v3, p0, La/e0r0;->j:Z

    .line 216
    .line 217
    invoke-interface {v0, p1, p0}, La/kmq;->a(Ljava/lang/Object;La/yje;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    if-ne p0, v7, :cond_a

    .line 222
    .line 223
    move-object v2, v7

    .line 224
    goto :goto_7

    .line 225
    :cond_a
    :goto_6
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 226
    .line 227
    :goto_7
    return-object v2

    .line 228
    nop

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
