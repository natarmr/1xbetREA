.class public final La/rv1;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/uv1;


# direct methods
.method public synthetic constructor <init>(La/uv1;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/rv1;->i:B

    iput-object p1, p0, La/rv1;->k:La/uv1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/rv1;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/rv1;->k:La/uv1;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/rv1;

    .line 9
    .line 10
    const/4 v1, 0x2

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/rv1;-><init>(La/uv1;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/rv1;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/rv1;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/rv1;-><init>(La/uv1;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/rv1;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/rv1;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/rv1;-><init>(La/uv1;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/rv1;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/rv1;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/sw00;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/rv1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/rv1;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/rv1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, Ljava/util/List;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/rv1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/rv1;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/rv1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, Ljava/lang/Throwable;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/rv1;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/rv1;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/rv1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/rv1;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/rv1;->k:La/uv1;

    .line 6
    .line 7
    iget-object v0, v0, La/rv1;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v1, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    move-object v1, v0

    .line 13
    check-cast v1, La/sw00;

    .line 14
    .line 15
    sget-object v0, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    sget v0, La/uv1;->X:I

    .line 21
    .line 22
    iget-object v3, v2, La/i3t0;->i:La/ocj;

    .line 23
    .line 24
    iget-object v4, v3, La/ocj;->a:La/p7m0;

    .line 25
    .line 26
    :cond_0
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-object v5, v0

    .line 34
    check-cast v5, La/yu1;

    .line 35
    .line 36
    iget-boolean v7, v1, La/sw00;->a:Z

    .line 37
    .line 38
    const/16 v22, 0x0

    .line 39
    .line 40
    const v23, 0x1ffffef

    .line 41
    .line 42
    .line 43
    const/4 v6, 0x0

    .line 44
    const/4 v8, 0x0

    .line 45
    const/4 v9, 0x0

    .line 46
    const/4 v10, 0x0

    .line 47
    const/4 v11, 0x0

    .line 48
    const/4 v12, 0x0

    .line 49
    const/4 v13, 0x0

    .line 50
    const/4 v14, 0x0

    .line 51
    const/4 v15, 0x0

    .line 52
    const/16 v16, 0x0

    .line 53
    .line 54
    const/16 v17, 0x0

    .line 55
    .line 56
    const/16 v18, 0x0

    .line 57
    .line 58
    const/16 v19, 0x0

    .line 59
    .line 60
    const/16 v20, 0x0

    .line 61
    .line 62
    const/16 v21, 0x0

    .line 63
    .line 64
    invoke-static/range {v5 .. v23}, La/yu1;->a(La/yu1;La/bv1;ZLa/ql5;La/dt1;La/dt1;La/dt1;La/dt1;La/gu1;Ljava/util/LinkedHashMap;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Set;Ljava/util/LinkedHashSet;I)La/yu1;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-virtual {v4, v0, v5}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-eqz v0, :cond_0

    .line 73
    .line 74
    iget-boolean v0, v1, La/sw00;->a:Z

    .line 75
    .line 76
    iget-object v1, v2, La/uv1;->T:La/c4m0;

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    if-eqz v0, :cond_2

    .line 80
    .line 81
    if-eqz v1, :cond_1

    .line 82
    .line 83
    invoke-virtual {v1, v4}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 84
    .line 85
    .line 86
    :cond_1
    iget-object v0, v2, La/uv1;->v:La/soc;

    .line 87
    .line 88
    invoke-virtual {v0}, La/soc;->b()V

    .line 89
    .line 90
    .line 91
    iget-object v0, v2, La/uv1;->u:La/ali;

    .line 92
    .line 93
    invoke-virtual {v0}, La/ali;->o()La/gmq;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    new-instance v1, La/rv1;

    .line 98
    .line 99
    const/4 v3, 0x1

    .line 100
    invoke-direct {v1, v2, v4, v3}, La/rv1;-><init>(La/uv1;La/yje;B)V

    .line 101
    .line 102
    .line 103
    new-instance v3, La/fnq;

    .line 104
    .line 105
    const/4 v4, 0x4

    .line 106
    invoke-direct {v3, v0, v1, v4}, La/fnq;-><init>(La/gmq;Lkotlin/jvm/functions/Function2;B)V

    .line 107
    .line 108
    .line 109
    invoke-static {v2}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    iget-object v1, v2, La/uv1;->L:La/mne;

    .line 114
    .line 115
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 116
    .line 117
    invoke-static {v0, v1}, La/d5c;->S(La/vne;Lkotlin/coroutines/CoroutineContext;)La/sje;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    sget-object v1, La/sv1;->h:La/sv1;

    .line 122
    .line 123
    invoke-static {v3, v0, v1}, La/sac;->T(La/gmq;La/vne;Lkotlin/jvm/functions/Function2;)La/c4m0;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    iput-object v0, v2, La/uv1;->T:La/c4m0;

    .line 128
    .line 129
    goto :goto_0

    .line 130
    :cond_2
    if-eqz v1, :cond_3

    .line 131
    .line 132
    invoke-virtual {v1, v4}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 133
    .line 134
    .line 135
    :cond_3
    iget-object v0, v3, La/ocj;->a:La/p7m0;

    .line 136
    .line 137
    :cond_4
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    move-object v2, v1

    .line 145
    check-cast v2, La/yu1;

    .line 146
    .line 147
    sget-object v18, La/xun;->a:La/xun;

    .line 148
    .line 149
    const/16 v19, 0x0

    .line 150
    .line 151
    const v20, 0x17fffff

    .line 152
    .line 153
    .line 154
    const/4 v3, 0x0

    .line 155
    const/4 v4, 0x0

    .line 156
    const/4 v5, 0x0

    .line 157
    const/4 v6, 0x0

    .line 158
    const/4 v7, 0x0

    .line 159
    const/4 v8, 0x0

    .line 160
    const/4 v9, 0x0

    .line 161
    const/4 v10, 0x0

    .line 162
    const/4 v11, 0x0

    .line 163
    const/4 v12, 0x0

    .line 164
    const/4 v13, 0x0

    .line 165
    const/4 v14, 0x0

    .line 166
    const/4 v15, 0x0

    .line 167
    const/16 v16, 0x0

    .line 168
    .line 169
    const/16 v17, 0x0

    .line 170
    .line 171
    invoke-static/range {v2 .. v20}, La/yu1;->a(La/yu1;La/bv1;ZLa/ql5;La/dt1;La/dt1;La/dt1;La/dt1;La/gu1;Ljava/util/LinkedHashMap;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Set;Ljava/util/LinkedHashSet;I)La/yu1;

    .line 172
    .line 173
    .line 174
    move-result-object v2

    .line 175
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v1

    .line 179
    if-eqz v1, :cond_4

    .line 180
    .line 181
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 182
    .line 183
    return-object v0

    .line 184
    :pswitch_0
    check-cast v0, Ljava/util/List;

    .line 185
    .line 186
    sget-object v1, La/wne;->a:La/wne;

    .line 187
    .line 188
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 189
    .line 190
    .line 191
    new-instance v1, La/bo0;

    .line 192
    .line 193
    const/4 v3, 0x6

    .line 194
    invoke-direct {v1, v0, v3}, La/bo0;-><init>(Ljava/util/List;B)V

    .line 195
    .line 196
    .line 197
    sget v0, La/uv1;->X:I

    .line 198
    .line 199
    invoke-virtual {v2, v1}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 200
    .line 201
    .line 202
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 203
    .line 204
    return-object v0

    .line 205
    :pswitch_1
    check-cast v0, Ljava/lang/Throwable;

    .line 206
    .line 207
    sget-object v1, La/wne;->a:La/wne;

    .line 208
    .line 209
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 210
    .line 211
    .line 212
    sget v1, La/uv1;->X:I

    .line 213
    .line 214
    iget-object v1, v2, La/i3t0;->i:La/ocj;

    .line 215
    .line 216
    iget-object v1, v1, La/ocj;->a:La/p7m0;

    .line 217
    .line 218
    :cond_5
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v3

    .line 222
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 223
    .line 224
    .line 225
    move-object v4, v3

    .line 226
    check-cast v4, La/yu1;

    .line 227
    .line 228
    const/16 v21, 0x0

    .line 229
    .line 230
    const v22, 0x1fffeff

    .line 231
    .line 232
    .line 233
    const/4 v5, 0x0

    .line 234
    const/4 v6, 0x0

    .line 235
    const/4 v7, 0x0

    .line 236
    const/4 v8, 0x0

    .line 237
    sget-object v9, La/bt1;->a:La/bt1;

    .line 238
    .line 239
    const/4 v10, 0x0

    .line 240
    const/4 v11, 0x0

    .line 241
    const/4 v12, 0x0

    .line 242
    const/4 v13, 0x0

    .line 243
    const/4 v14, 0x0

    .line 244
    const/4 v15, 0x0

    .line 245
    const/16 v16, 0x0

    .line 246
    .line 247
    const/16 v17, 0x0

    .line 248
    .line 249
    const/16 v18, 0x0

    .line 250
    .line 251
    const/16 v19, 0x0

    .line 252
    .line 253
    const/16 v20, 0x0

    .line 254
    .line 255
    invoke-static/range {v4 .. v22}, La/yu1;->a(La/yu1;La/bv1;ZLa/ql5;La/dt1;La/dt1;La/dt1;La/dt1;La/gu1;Ljava/util/LinkedHashMap;ZZZLjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Set;Ljava/util/LinkedHashSet;I)La/yu1;

    .line 256
    .line 257
    .line 258
    move-result-object v4

    .line 259
    invoke-virtual {v1, v3, v4}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v3

    .line 263
    if-eqz v3, :cond_5

    .line 264
    .line 265
    iget-object v1, v2, La/uv1;->r:La/duj;

    .line 266
    .line 267
    new-instance v2, La/xg1;

    .line 268
    .line 269
    const/16 v3, 0xf

    .line 270
    .line 271
    invoke-direct {v2, v3}, La/xg1;-><init>(B)V

    .line 272
    .line 273
    .line 274
    invoke-virtual {v1, v0, v2}, La/duj;->b(Ljava/lang/Throwable;Lkotlin/jvm/functions/Function2;)V

    .line 275
    .line 276
    .line 277
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 278
    .line 279
    return-object v0

    .line 280
    nop

    .line 281
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
