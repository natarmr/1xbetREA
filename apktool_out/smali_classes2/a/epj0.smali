.class public final La/epj0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/gpj0;


# direct methods
.method public synthetic constructor <init>(La/gpj0;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/epj0;->i:B

    iput-object p1, p0, La/epj0;->k:La/gpj0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/epj0;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/epj0;->k:La/gpj0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/epj0;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/epj0;-><init>(La/gpj0;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/epj0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/epj0;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/epj0;-><init>(La/gpj0;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/epj0;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    nop

    .line 27
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/epj0;->i:B

    .line 2
    .line 3
    check-cast p1, La/gji0;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/epj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/epj0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/epj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/epj0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/epj0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/epj0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    nop

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget-byte v0, p0, La/epj0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/epj0;->k:La/gpj0;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/wne;->a:La/wne;

    .line 10
    .line 11
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, La/epj0;->j:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, La/gji0;

    .line 17
    .line 18
    iget-object p1, v1, La/gpj0;->f:La/qyb0;

    .line 19
    .line 20
    invoke-virtual {v1, p0}, La/gpj0;->d(La/gji0;)Z

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    iget-object v3, p0, La/gji0;->c:Ljava/util/Map;

    .line 25
    .line 26
    const-string v4, "FirebaseSessions"

    .line 27
    .line 28
    const/4 v5, 0x1

    .line 29
    if-eqz v3, :cond_9

    .line 30
    .line 31
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget-boolean v6, p1, La/qyb0;->f:Z

    .line 35
    .line 36
    const/4 v7, 0x0

    .line 37
    if-eqz v6, :cond_0

    .line 38
    .line 39
    goto/16 :goto_3

    .line 40
    .line 41
    :cond_0
    iget-object v6, p1, La/qyb0;->a:Landroid/content/Context;

    .line 42
    .line 43
    invoke-static {v6}, La/m7x;->F(Landroid/content/Context;)Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    new-instance v8, Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 57
    .line 58
    .line 59
    move-result v9

    .line 60
    if-eqz v9, :cond_3

    .line 61
    .line 62
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v9

    .line 66
    check-cast v9, La/ryb0;

    .line 67
    .line 68
    iget-object v10, v9, La/ryb0;->a:Ljava/lang/String;

    .line 69
    .line 70
    invoke-interface {v3, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v10

    .line 74
    check-cast v10, La/oyb0;

    .line 75
    .line 76
    if-eqz v10, :cond_2

    .line 77
    .line 78
    new-instance v11, Lkotlin/Pair;

    .line 79
    .line 80
    invoke-direct {v11, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_2
    move-object v11, v2

    .line 85
    :goto_1
    if-eqz v11, :cond_1

    .line 86
    .line 87
    invoke-virtual {v8, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_3
    invoke-virtual {v8}, Ljava/util/ArrayList;->isEmpty()Z

    .line 92
    .line 93
    .line 94
    move-result v6

    .line 95
    if-eqz v6, :cond_5

    .line 96
    .line 97
    :cond_4
    move v7, v5

    .line 98
    goto :goto_3

    .line 99
    :cond_5
    invoke-virtual {v8}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v6

    .line 103
    :cond_6
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-eqz v8, :cond_4

    .line 108
    .line 109
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    check-cast v8, Lkotlin/Pair;

    .line 114
    .line 115
    iget-object v9, v8, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v9, La/ryb0;

    .line 118
    .line 119
    iget-object v8, v8, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v8, La/oyb0;

    .line 122
    .line 123
    invoke-virtual {p1}, La/qyb0;->a()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v10

    .line 127
    iget-object v11, v9, La/ryb0;->a:Ljava/lang/String;

    .line 128
    .line 129
    invoke-static {v10, v11}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    iget v9, v9, La/ryb0;->b:I

    .line 134
    .line 135
    if-eqz v10, :cond_7

    .line 136
    .line 137
    iget v10, v8, La/oyb0;->a:I

    .line 138
    .line 139
    if-ne v9, v10, :cond_6

    .line 140
    .line 141
    iget-object v9, p1, La/qyb0;->d:La/n0o0;

    .line 142
    .line 143
    invoke-virtual {v9}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v9

    .line 147
    check-cast v9, Ljava/lang/String;

    .line 148
    .line 149
    iget-object v8, v8, La/oyb0;->b:Ljava/lang/String;

    .line 150
    .line 151
    invoke-static {v9, v8}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 152
    .line 153
    .line 154
    move-result v8

    .line 155
    if-nez v8, :cond_8

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_7
    iget v8, v8, La/oyb0;->a:I

    .line 159
    .line 160
    if-eq v9, v8, :cond_8

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_8
    :goto_3
    if-eqz v7, :cond_a

    .line 164
    .line 165
    const-string v6, "Cold app start detected"

    .line 166
    .line 167
    invoke-static {v4, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 168
    .line 169
    .line 170
    goto :goto_4

    .line 171
    :cond_9
    const-string v6, "No process data map"

    .line 172
    .line 173
    invoke-static {v4, v6}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 174
    .line 175
    .line 176
    move v7, v5

    .line 177
    :cond_a
    :goto_4
    invoke-virtual {v1, p0}, La/gpj0;->c(La/gji0;)Z

    .line 178
    .line 179
    .line 180
    move-result v4

    .line 181
    if-eqz v7, :cond_b

    .line 182
    .line 183
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    sget-object v3, La/lun;->a:La/lun;

    .line 187
    .line 188
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1, v3}, La/qyb0;->b(Ljava/util/Map;)Ljava/util/Map;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    goto :goto_5

    .line 196
    :cond_b
    if-eqz v4, :cond_c

    .line 197
    .line 198
    invoke-virtual {p1, v3}, La/qyb0;->b(Ljava/util/Map;)Ljava/util/Map;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    :cond_c
    :goto_5
    if-eqz v7, :cond_d

    .line 203
    .line 204
    move-object v6, v2

    .line 205
    goto :goto_6

    .line 206
    :cond_d
    iget-object v6, p0, La/gji0;->a:La/pji0;

    .line 207
    .line 208
    :goto_6
    const/4 v8, 0x3

    .line 209
    if-nez v0, :cond_f

    .line 210
    .line 211
    if-eqz v7, :cond_e

    .line 212
    .line 213
    goto :goto_7

    .line 214
    :cond_e
    if-eqz v4, :cond_10

    .line 215
    .line 216
    invoke-virtual {p1, v3}, La/qyb0;->b(Ljava/util/Map;)Ljava/util/Map;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    invoke-static {p0, v2, v2, p1, v8}, La/gji0;->a(La/gji0;La/pji0;La/pgq0;Ljava/util/Map;I)La/gji0;

    .line 221
    .line 222
    .line 223
    move-result-object p0

    .line 224
    goto :goto_8

    .line 225
    :cond_f
    :goto_7
    iget-object p0, v1, La/gpj0;->b:La/vji0;

    .line 226
    .line 227
    invoke-virtual {p0, v6}, La/vji0;->a(La/pji0;)La/pji0;

    .line 228
    .line 229
    .line 230
    move-result-object p0

    .line 231
    iget-object v0, v1, La/gpj0;->c:La/uji0;

    .line 232
    .line 233
    iget-object v1, v0, La/uji0;->e:Lkotlin/coroutines/CoroutineContext;

    .line 234
    .line 235
    invoke-static {v1}, La/d5c;->a(Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    new-instance v4, La/sji0;

    .line 240
    .line 241
    invoke-direct {v4, v0, p0, v2}, La/sji0;-><init>(La/uji0;La/pji0;La/yje;)V

    .line 242
    .line 243
    .line 244
    invoke-static {v1, v2, v2, v4, v8}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 245
    .line 246
    .line 247
    iput-boolean v5, p1, La/qyb0;->f:Z

    .line 248
    .line 249
    new-instance p1, La/gji0;

    .line 250
    .line 251
    invoke-direct {p1, p0, v2, v3}, La/gji0;-><init>(La/pji0;La/pgq0;Ljava/util/Map;)V

    .line 252
    .line 253
    .line 254
    move-object p0, p1

    .line 255
    :cond_10
    :goto_8
    return-object p0

    .line 256
    :pswitch_0
    sget-object v0, La/wne;->a:La/wne;

    .line 257
    .line 258
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 259
    .line 260
    .line 261
    iget-object p0, p0, La/epj0;->j:Ljava/lang/Object;

    .line 262
    .line 263
    check-cast p0, La/gji0;

    .line 264
    .line 265
    iget-object p1, v1, La/gpj0;->d:La/olq0;

    .line 266
    .line 267
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 268
    .line 269
    .line 270
    invoke-static {}, La/olq0;->a()La/pgq0;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    const/4 v0, 0x5

    .line 275
    invoke-static {p0, v2, p1, v2, v0}, La/gji0;->a(La/gji0;La/pji0;La/pgq0;Ljava/util/Map;I)La/gji0;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    return-object p0

    .line 280
    nop

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
