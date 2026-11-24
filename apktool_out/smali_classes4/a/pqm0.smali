.class public final La/pqm0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public final synthetic k:La/rqm0;


# direct methods
.method public synthetic constructor <init>(La/rqm0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/pqm0;->i:B

    iput-object p1, p0, La/pqm0;->k:La/rqm0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/pqm0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/pqm0;->k:La/rqm0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/pqm0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/pqm0;-><init>(La/rqm0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    check-cast p1, Ljava/lang/Boolean;

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    iput-boolean p0, v0, La/pqm0;->j:Z

    .line 21
    .line 22
    return-object v0

    .line 23
    :pswitch_0
    new-instance p1, La/pqm0;

    .line 24
    .line 25
    const/4 v0, 0x0

    .line 26
    invoke-direct {p1, p0, p2, v0}, La/pqm0;-><init>(La/rqm0;La/yje;B)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/pqm0;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/Boolean;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    .line 10
    .line 11
    check-cast p2, La/yje;

    .line 12
    .line 13
    invoke-virtual {p0, p1, p2}, La/pqm0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    check-cast p0, La/pqm0;

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    invoke-virtual {p0, p1}, La/pqm0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :pswitch_0
    check-cast p1, La/vne;

    .line 27
    .line 28
    check-cast p2, La/yje;

    .line 29
    .line 30
    invoke-virtual {p0, p1, p2}, La/pqm0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    check-cast p0, La/pqm0;

    .line 35
    .line 36
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 37
    .line 38
    invoke-virtual {p0, p1}, La/pqm0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    return-object p0

    .line 43
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/pqm0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/pqm0;->k:La/rqm0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-boolean p0, p0, La/pqm0;->j:Z

    .line 11
    .line 12
    sget-object v0, La/wne;->a:La/wne;

    .line 13
    .line 14
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    if-eqz p0, :cond_4

    .line 18
    .line 19
    iget-object p0, v1, La/rqm0;->q:La/pru;

    .line 20
    .line 21
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-object p0, p0, La/sff0;->c:La/ech;

    .line 26
    .line 27
    iget-object p0, p0, La/ech;->o:La/g5h;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eq p0, v3, :cond_1

    .line 34
    .line 35
    const/4 p1, 0x2

    .line 36
    if-eq p0, p1, :cond_1

    .line 37
    .line 38
    iget-object p0, v1, La/rqm0;->u:La/bby;

    .line 39
    .line 40
    if-eqz p0, :cond_0

    .line 41
    .line 42
    invoke-interface {p0, v2}, La/bby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 43
    .line 44
    .line 45
    :cond_0
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 46
    .line 47
    .line 48
    move-result-object v3

    .line 49
    iget-object p0, v1, La/rqm0;->j:La/mne;

    .line 50
    .line 51
    iget-object v6, p0, La/mne;->a:La/rwj;

    .line 52
    .line 53
    new-instance v4, La/mqm0;

    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    invoke-direct {v4, v1, p0}, La/mqm0;-><init>(La/rqm0;B)V

    .line 57
    .line 58
    .line 59
    new-instance v7, La/pqm0;

    .line 60
    .line 61
    invoke-direct {v7, v1, v2, p0}, La/pqm0;-><init>(La/rqm0;La/yje;B)V

    .line 62
    .line 63
    .line 64
    const/16 v8, 0xa

    .line 65
    .line 66
    const/4 v5, 0x0

    .line 67
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    iput-object p0, v1, La/rqm0;->u:La/bby;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    const/16 p0, 0x2e

    .line 75
    .line 76
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    iget-object p1, v1, La/rqm0;->b:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage;

    .line 81
    .line 82
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Real;

    .line 83
    .line 84
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_2

    .line 89
    .line 90
    const/16 p1, 0x2d

    .line 91
    .line 92
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    filled-new-array {p1, p0}, [Ljava/lang/Integer;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-static {p0}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    goto :goto_0

    .line 105
    :cond_2
    sget-object v0, Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;->INSTANCE:Lorg/xplatform/cyber/section/api/domain/entity/CyberGamesPage$Virtual;

    .line 106
    .line 107
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result p1

    .line 111
    if-eqz p1, :cond_3

    .line 112
    .line 113
    const/16 p0, 0x56

    .line 114
    .line 115
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    goto :goto_0

    .line 124
    :cond_3
    invoke-static {p0}, Lkotlin/collections/a;->c(Ljava/lang/Object;)Ljava/util/List;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    :goto_0
    invoke-static {v1}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 129
    .line 130
    .line 131
    move-result-object v4

    .line 132
    new-instance v5, La/mqm0;

    .line 133
    .line 134
    invoke-direct {v5, v1, v3}, La/mqm0;-><init>(La/rqm0;B)V

    .line 135
    .line 136
    .line 137
    new-instance v8, La/qqm0;

    .line 138
    .line 139
    invoke-direct {v8, v1, p0, v2}, La/qqm0;-><init>(La/rqm0;Ljava/util/List;La/yje;)V

    .line 140
    .line 141
    .line 142
    const/16 v9, 0xe

    .line 143
    .line 144
    const/4 v6, 0x0

    .line 145
    const/4 v7, 0x0

    .line 146
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 147
    .line 148
    .line 149
    goto :goto_1

    .line 150
    :cond_4
    invoke-virtual {v1}, La/rqm0;->x()V

    .line 151
    .line 152
    .line 153
    :goto_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 157
    .line 158
    iget-boolean v4, p0, La/pqm0;->j:Z

    .line 159
    .line 160
    if-eqz v4, :cond_6

    .line 161
    .line 162
    if-ne v4, v3, :cond_5

    .line 163
    .line 164
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 165
    .line 166
    .line 167
    goto :goto_4

    .line 168
    :cond_5
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 169
    .line 170
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    goto :goto_5

    .line 174
    :cond_6
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 175
    .line 176
    .line 177
    iget-object p1, v1, La/rqm0;->l:La/rpt;

    .line 178
    .line 179
    iget-object p1, p1, La/rpt;->a:Ljava/lang/Object;

    .line 180
    .line 181
    check-cast p1, La/dih;

    .line 182
    .line 183
    iget-object p1, p1, La/dih;->a:La/cih;

    .line 184
    .line 185
    iget-object p1, p1, La/cih;->a:La/q7d0;

    .line 186
    .line 187
    sget-object v2, La/xun;->a:La/xun;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    invoke-virtual {p1}, La/q7d0;->a()Landroid/content/SharedPreferences;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    const-string v4, "CYBER_PROMO_IDS"

    .line 200
    .line 201
    invoke-interface {p1, v4, v2}, Landroid/content/SharedPreferences;->getStringSet(Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    if-nez p1, :cond_7

    .line 206
    .line 207
    goto :goto_2

    .line 208
    :cond_7
    move-object v2, p1

    .line 209
    :goto_2
    check-cast v2, Ljava/lang/Iterable;

    .line 210
    .line 211
    invoke-static {v2}, Lkotlin/collections/CollectionsKt;->L0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    iget-object v2, v1, La/rqm0;->m:La/hvt;

    .line 216
    .line 217
    iget-object v2, v2, La/hvt;->a:La/b2g;

    .line 218
    .line 219
    iget-object v2, v2, La/b2g;->a:La/ehf0;

    .line 220
    .line 221
    iget-object v2, v2, La/ehf0;->c:Ljava/lang/Object;

    .line 222
    .line 223
    check-cast v2, La/or30;

    .line 224
    .line 225
    iget-object v2, v2, La/or30;->a:La/p7m0;

    .line 226
    .line 227
    new-instance v4, La/h2c;

    .line 228
    .line 229
    const/16 v5, 0x10

    .line 230
    .line 231
    invoke-direct {v4, v2, v5}, La/h2c;-><init>(La/p7m0;B)V

    .line 232
    .line 233
    .line 234
    new-instance v2, La/r980;

    .line 235
    .line 236
    const/16 v5, 0x1b

    .line 237
    .line 238
    invoke-direct {v2, v1, p1, v5}, La/r980;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 239
    .line 240
    .line 241
    iput-boolean v3, p0, La/pqm0;->j:Z

    .line 242
    .line 243
    new-instance p1, La/uap;

    .line 244
    .line 245
    const/16 v1, 0xc

    .line 246
    .line 247
    invoke-direct {p1, v2, v1}, La/uap;-><init>(La/kmq;B)V

    .line 248
    .line 249
    .line 250
    invoke-interface {v4, p1, p0}, La/gmq;->c(La/kmq;La/yje;)Ljava/lang/Object;

    .line 251
    .line 252
    .line 253
    move-result-object p0

    .line 254
    sget-object p1, La/wne;->a:La/wne;

    .line 255
    .line 256
    if-ne p0, p1, :cond_8

    .line 257
    .line 258
    goto :goto_3

    .line 259
    :cond_8
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 260
    .line 261
    :goto_3
    if-ne p0, v0, :cond_9

    .line 262
    .line 263
    move-object v2, v0

    .line 264
    goto :goto_5

    .line 265
    :cond_9
    :goto_4
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    :goto_5
    return-object v2

    .line 268
    nop

    .line 269
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
