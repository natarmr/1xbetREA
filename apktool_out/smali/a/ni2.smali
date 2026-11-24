.class public final La/ni2;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic i:B

.field public j:Z

.field public k:Z

.field public l:Ljava/lang/Object;

.field public final synthetic m:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/ata0;La/yje;)V
    .locals 1

    const/4 v0, 0x3

    iput-byte v0, p0, La/ni2;->i:B

    .line 16
    iput-object p1, p0, La/ni2;->m:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/nn20;La/m97;La/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/ni2;->i:B

    .line 15
    iput-object p1, p0, La/ni2;->l:Ljava/lang/Object;

    iput-object p2, p0, La/ni2;->m:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/qi2;La/i8l0;ZLa/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/ni2;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/ni2;->l:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/ni2;->m:Ljava/lang/Object;

    .line 7
    .line 8
    iput-boolean p3, p0, La/ni2;->k:Z

    .line 9
    .line 10
    const/4 p1, 0x1

    .line 11
    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;ZLjava/lang/Object;La/yje;B)V
    .locals 0

    .line 17
    iput-byte p5, p0, La/ni2;->i:B

    iput-object p1, p0, La/ni2;->l:Ljava/lang/Object;

    iput-boolean p2, p0, La/ni2;->k:Z

    iput-object p3, p0, La/ni2;->m:Ljava/lang/Object;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p4}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(La/yje;)La/yje;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ni2;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/ni2;->m:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v2, La/ni2;

    .line 9
    .line 10
    iget-object v0, p0, La/ni2;->l:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, v0

    .line 13
    check-cast v3, Ljava/util/LinkedHashSet;

    .line 14
    .line 15
    iget-boolean v4, p0, La/ni2;->k:Z

    .line 16
    .line 17
    move-object v5, v1

    .line 18
    check-cast v5, La/xot0;

    .line 19
    .line 20
    const/4 v7, 0x4

    .line 21
    move-object v6, p1

    .line 22
    invoke-direct/range {v2 .. v7}, La/ni2;-><init>(Ljava/lang/Object;ZLjava/lang/Object;La/yje;B)V

    .line 23
    .line 24
    .line 25
    return-object v2

    .line 26
    :pswitch_0
    move-object v6, p1

    .line 27
    new-instance p0, La/ni2;

    .line 28
    .line 29
    check-cast v1, La/ata0;

    .line 30
    .line 31
    invoke-direct {p0, v1, v6}, La/ni2;-><init>(La/ata0;La/yje;)V

    .line 32
    .line 33
    .line 34
    return-object p0

    .line 35
    :pswitch_1
    move-object v6, p1

    .line 36
    new-instance p1, La/ni2;

    .line 37
    .line 38
    iget-object p0, p0, La/ni2;->l:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast p0, La/nn20;

    .line 41
    .line 42
    check-cast v1, La/m97;

    .line 43
    .line 44
    invoke-direct {p1, p0, v1, v6}, La/ni2;-><init>(La/nn20;La/m97;La/yje;)V

    .line 45
    .line 46
    .line 47
    return-object p1

    .line 48
    :pswitch_2
    move-object v6, p1

    .line 49
    new-instance v3, La/ni2;

    .line 50
    .line 51
    iget-object p1, p0, La/ni2;->l:Ljava/lang/Object;

    .line 52
    .line 53
    move-object v4, p1

    .line 54
    check-cast v4, La/iqi;

    .line 55
    .line 56
    iget-boolean v5, p0, La/ni2;->k:Z

    .line 57
    .line 58
    check-cast v1, Ljava/lang/String;

    .line 59
    .line 60
    const/4 v8, 0x1

    .line 61
    move-object v7, v6

    .line 62
    move-object v6, v1

    .line 63
    invoke-direct/range {v3 .. v8}, La/ni2;-><init>(Ljava/lang/Object;ZLjava/lang/Object;La/yje;B)V

    .line 64
    .line 65
    .line 66
    return-object v3

    .line 67
    :pswitch_3
    move-object v6, p1

    .line 68
    new-instance p1, La/ni2;

    .line 69
    .line 70
    iget-object v0, p0, La/ni2;->l:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v0, La/qi2;

    .line 73
    .line 74
    check-cast v1, La/i8l0;

    .line 75
    .line 76
    iget-boolean p0, p0, La/ni2;->k:Z

    .line 77
    .line 78
    invoke-direct {p1, v0, v1, p0, v6}, La/ni2;-><init>(La/qi2;La/i8l0;ZLa/yje;)V

    .line 79
    .line 80
    .line 81
    return-object p1

    .line 82
    nop

    .line 83
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ni2;->i:B

    .line 2
    .line 3
    check-cast p1, La/yje;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, La/ni2;->create(La/yje;)La/yje;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    check-cast p0, La/ni2;

    .line 13
    .line 14
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 15
    .line 16
    invoke-virtual {p0, p1}, La/ni2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    return-object p0

    .line 21
    :pswitch_0
    invoke-virtual {p0, p1}, La/ni2;->create(La/yje;)La/yje;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    check-cast p0, La/ni2;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 28
    .line 29
    invoke-virtual {p0, p1}, La/ni2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0

    .line 34
    :pswitch_1
    invoke-virtual {p0, p1}, La/ni2;->create(La/yje;)La/yje;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    check-cast p0, La/ni2;

    .line 39
    .line 40
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, La/ni2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    return-object p0

    .line 47
    :pswitch_2
    invoke-virtual {p0, p1}, La/ni2;->create(La/yje;)La/yje;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, La/ni2;

    .line 52
    .line 53
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 54
    .line 55
    invoke-virtual {p0, p1}, La/ni2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    return-object p0

    .line 60
    :pswitch_3
    invoke-virtual {p0, p1}, La/ni2;->create(La/yje;)La/yje;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    check-cast p0, La/ni2;

    .line 65
    .line 66
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 67
    .line 68
    invoke-virtual {p0, p1}, La/ni2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ni2;->i:B

    .line 4
    .line 5
    const-string v3, "call to \'resume\' before \'invoke\' with coroutine"

    .line 6
    .line 7
    iget-object v4, v0, La/ni2;->m:Ljava/lang/Object;

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    check-cast v4, La/xot0;

    .line 14
    .line 15
    iget-object v1, v4, La/xot0;->k:Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    sget-object v6, La/wne;->a:La/wne;

    .line 18
    .line 19
    iget-boolean v7, v0, La/ni2;->j:Z

    .line 20
    .line 21
    const/4 v11, 0x1

    .line 22
    if-eqz v7, :cond_1

    .line 23
    .line 24
    if-ne v7, v11, :cond_0

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    move-object/from16 v0, p1

    .line 30
    .line 31
    goto/16 :goto_3

    .line 32
    .line 33
    :cond_0
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    move-object v0, v5

    .line 37
    goto/16 :goto_3

    .line 38
    .line 39
    :cond_1
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const-string v3, "CXCP"

    .line 43
    .line 44
    invoke-static {v3}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-eqz v7, :cond_2

    .line 49
    .line 50
    const-string v7, "UseCaseCameraRequestControlImpl: Building SessionConfig..."

    .line 51
    .line 52
    invoke-static {v3, v7}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 53
    .line 54
    .line 55
    :cond_2
    new-instance v7, La/zii0;

    .line 56
    .line 57
    iget-object v8, v0, La/ni2;->l:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v8, Ljava/util/LinkedHashSet;

    .line 60
    .line 61
    iget-boolean v9, v0, La/ni2;->k:Z

    .line 62
    .line 63
    invoke-direct {v7, v8, v9}, La/zii0;-><init>(Ljava/util/Collection;Z)V

    .line 64
    .line 65
    .line 66
    iget-object v8, v7, La/zii0;->e:La/n0o0;

    .line 67
    .line 68
    invoke-virtual {v8}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    check-cast v8, La/wii0;

    .line 73
    .line 74
    invoke-virtual {v8}, La/wii0;->c()Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    if-eqz v8, :cond_3

    .line 79
    .line 80
    iget-object v5, v7, La/zii0;->f:La/n0o0;

    .line 81
    .line 82
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    check-cast v5, La/xii0;

    .line 87
    .line 88
    :cond_3
    if-nez v5, :cond_6

    .line 89
    .line 90
    invoke-static {v3}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    if-eqz v5, :cond_4

    .line 95
    .line 96
    const-string v5, "Using default SessionConfig"

    .line 97
    .line 98
    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 99
    .line 100
    .line 101
    :cond_4
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 102
    .line 103
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 104
    .line 105
    .line 106
    new-instance v7, Ljava/util/HashSet;

    .line 107
    .line 108
    invoke-direct {v7}, Ljava/util/HashSet;-><init>()V

    .line 109
    .line 110
    .line 111
    invoke-static {}, La/wy40;->l()La/wy40;

    .line 112
    .line 113
    .line 114
    move-result-object v8

    .line 115
    new-instance v9, Ljava/util/ArrayList;

    .line 116
    .line 117
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-static {}, La/tz40;->a()La/tz40;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    new-instance v12, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    new-instance v13, Ljava/util/ArrayList;

    .line 130
    .line 131
    invoke-direct {v13}, Ljava/util/ArrayList;-><init>()V

    .line 132
    .line 133
    .line 134
    new-instance v14, Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    .line 137
    .line 138
    .line 139
    new-instance v15, La/xii0;

    .line 140
    .line 141
    new-instance v2, Ljava/util/ArrayList;

    .line 142
    .line 143
    invoke-direct {v2, v5}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 144
    .line 145
    .line 146
    new-instance v5, Ljava/util/ArrayList;

    .line 147
    .line 148
    invoke-direct {v5, v12}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 149
    .line 150
    .line 151
    new-instance v12, Ljava/util/ArrayList;

    .line 152
    .line 153
    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 154
    .line 155
    .line 156
    new-instance v13, Ljava/util/ArrayList;

    .line 157
    .line 158
    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 159
    .line 160
    .line 161
    new-instance v20, La/t7a;

    .line 162
    .line 163
    new-instance v14, Ljava/util/ArrayList;

    .line 164
    .line 165
    invoke-direct {v14, v7}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 166
    .line 167
    .line 168
    invoke-static {v8}, La/b780;->j(La/drd;)La/b780;

    .line 169
    .line 170
    .line 171
    move-result-object v7

    .line 172
    move-object/from16 v18, v12

    .line 173
    .line 174
    new-instance v12, Ljava/util/ArrayList;

    .line 175
    .line 176
    invoke-direct {v12, v9}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 177
    .line 178
    .line 179
    sget-object v8, La/eoo0;->b:La/eoo0;

    .line 180
    .line 181
    new-instance v8, Landroid/util/ArrayMap;

    .line 182
    .line 183
    invoke-direct {v8}, Landroid/util/ArrayMap;-><init>()V

    .line 184
    .line 185
    .line 186
    iget-object v9, v10, La/eoo0;->a:Landroid/util/ArrayMap;

    .line 187
    .line 188
    invoke-virtual {v9}, Landroid/util/ArrayMap;->keySet()Ljava/util/Set;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    invoke-interface {v10}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 193
    .line 194
    .line 195
    move-result-object v10

    .line 196
    :goto_0
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    .line 197
    .line 198
    .line 199
    move-result v16

    .line 200
    if-eqz v16, :cond_5

    .line 201
    .line 202
    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 203
    .line 204
    .line 205
    move-result-object v16

    .line 206
    move-object/from16 v11, v16

    .line 207
    .line 208
    check-cast v11, Ljava/lang/String;

    .line 209
    .line 210
    move-object/from16 v16, v2

    .line 211
    .line 212
    invoke-virtual {v9, v11}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 213
    .line 214
    .line 215
    move-result-object v2

    .line 216
    invoke-virtual {v8, v11, v2}, Landroid/util/ArrayMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-object/from16 v2, v16

    .line 220
    .line 221
    const/4 v11, 0x1

    .line 222
    goto :goto_0

    .line 223
    :cond_5
    move-object/from16 v16, v2

    .line 224
    .line 225
    new-instance v2, La/eoo0;

    .line 226
    .line 227
    invoke-direct {v2, v8}, La/eoo0;-><init>(Landroid/util/ArrayMap;)V

    .line 228
    .line 229
    .line 230
    move-object v10, v7

    .line 231
    move-object/from16 v19, v13

    .line 232
    .line 233
    move-object v9, v14

    .line 234
    move-object/from16 v8, v20

    .line 235
    .line 236
    const/4 v11, 0x1

    .line 237
    move-object v13, v2

    .line 238
    invoke-direct/range {v8 .. v13}, La/t7a;-><init>(Ljava/util/ArrayList;La/b780;ILjava/util/ArrayList;La/eoo0;)V

    .line 239
    .line 240
    .line 241
    const/16 v21, 0x0

    .line 242
    .line 243
    const/16 v22, 0x0

    .line 244
    .line 245
    const/16 v23, 0x0

    .line 246
    .line 247
    const/16 v24, 0x0

    .line 248
    .line 249
    move-object/from16 v17, v5

    .line 250
    .line 251
    invoke-direct/range {v15 .. v24}, La/xii0;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;Ljava/util/ArrayList;La/t7a;La/vii0;Landroid/hardware/camera2/params/InputConfiguration;ILa/a55;)V

    .line 252
    .line 253
    .line 254
    move-object v5, v15

    .line 255
    :cond_6
    iget-object v2, v5, La/xii0;->g:La/t7a;

    .line 256
    .line 257
    invoke-static {v3}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 258
    .line 259
    .line 260
    move-result v5

    .line 261
    if-eqz v5, :cond_7

    .line 262
    .line 263
    const-string v5, "UseCaseCameraRequestControlImpl: SessionConfig built. Updating state..."

    .line 264
    .line 265
    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 266
    .line 267
    .line 268
    :cond_7
    sget-object v5, La/oot0;->a:La/oot0;

    .line 269
    .line 270
    sget-object v7, La/xot0;->l:La/odd;

    .line 271
    .line 272
    iget-object v7, v4, La/xot0;->e:La/tpt0;

    .line 273
    .line 274
    iget-object v7, v7, La/tpt0;->e:La/ex2;

    .line 275
    .line 276
    new-instance v8, La/rot0;

    .line 277
    .line 278
    new-instance v9, La/bbw0;

    .line 279
    .line 280
    const/16 v10, 0x10

    .line 281
    .line 282
    invoke-direct {v9, v10}, La/bbw0;-><init>(B)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2}, La/t7a;->a()Landroid/util/Range;

    .line 286
    .line 287
    .line 288
    move-result-object v10

    .line 289
    sget-object v12, La/h55;->h:Landroid/util/Range;

    .line 290
    .line 291
    invoke-virtual {v10, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 292
    .line 293
    .line 294
    move-result v10

    .line 295
    if-nez v10, :cond_8

    .line 296
    .line 297
    sget-object v10, Landroid/hardware/camera2/CaptureRequest;->CONTROL_AE_TARGET_FPS_RANGE:Landroid/hardware/camera2/CaptureRequest$Key;

    .line 298
    .line 299
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2}, La/t7a;->a()Landroid/util/Range;

    .line 303
    .line 304
    .line 305
    move-result-object v12

    .line 306
    invoke-static {v10}, La/s5x0;->C(Landroid/hardware/camera2/CaptureRequest$Key;)La/u15;

    .line 307
    .line 308
    .line 309
    move-result-object v10

    .line 310
    iget-object v13, v9, La/bbw0;->b:Ljava/lang/Object;

    .line 311
    .line 312
    check-cast v13, La/wy40;

    .line 313
    .line 314
    invoke-virtual {v13, v10, v12}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 315
    .line 316
    .line 317
    :cond_8
    iget-object v10, v2, La/t7a;->b:La/b780;

    .line 318
    .line 319
    invoke-virtual {v9, v10}, La/bbw0;->o(La/drd;)V

    .line 320
    .line 321
    .line 322
    iget-object v10, v2, La/t7a;->e:La/eoo0;

    .line 323
    .line 324
    new-instance v12, Ljava/util/LinkedHashMap;

    .line 325
    .line 326
    invoke-direct {v12}, Ljava/util/LinkedHashMap;-><init>()V

    .line 327
    .line 328
    .line 329
    iget-object v10, v10, La/eoo0;->a:Landroid/util/ArrayMap;

    .line 330
    .line 331
    invoke-virtual {v10}, Landroid/util/ArrayMap;->keySet()Ljava/util/Set;

    .line 332
    .line 333
    .line 334
    move-result-object v13

    .line 335
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 336
    .line 337
    .line 338
    check-cast v13, Ljava/lang/Iterable;

    .line 339
    .line 340
    invoke-interface {v13}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 341
    .line 342
    .line 343
    move-result-object v13

    .line 344
    :goto_1
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 345
    .line 346
    .line 347
    move-result v14

    .line 348
    if-eqz v14, :cond_9

    .line 349
    .line 350
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    move-result-object v14

    .line 354
    check-cast v14, Ljava/lang/String;

    .line 355
    .line 356
    invoke-virtual {v10, v14}, Landroid/util/ArrayMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    .line 358
    .line 359
    move-result-object v15

    .line 360
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    invoke-interface {v12, v14, v15}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    .line 365
    .line 366
    goto :goto_1

    .line 367
    :cond_9
    new-instance v10, Ljava/util/LinkedHashMap;

    .line 368
    .line 369
    invoke-direct {v10, v12}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 373
    .line 374
    .line 375
    iget-object v12, v2, La/t7a;->d:Ljava/util/List;

    .line 376
    .line 377
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 378
    .line 379
    .line 380
    new-instance v13, La/ux9;

    .line 381
    .line 382
    invoke-direct {v13}, La/ux9;-><init>()V

    .line 383
    .line 384
    .line 385
    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 386
    .line 387
    .line 388
    move-result-object v12

    .line 389
    :goto_2
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    .line 390
    .line 391
    .line 392
    move-result v14

    .line 393
    if-eqz v14, :cond_a

    .line 394
    .line 395
    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 396
    .line 397
    .line 398
    move-result-object v14

    .line 399
    check-cast v14, La/vx9;

    .line 400
    .line 401
    invoke-virtual {v13, v14, v7}, La/ux9;->b(La/vx9;Ljava/util/concurrent/Executor;)V

    .line 402
    .line 403
    .line 404
    goto :goto_2

    .line 405
    :cond_a
    const/4 v14, 0x1

    .line 406
    new-array v7, v14, [La/bmf0;

    .line 407
    .line 408
    const/4 v12, 0x0

    .line 409
    aput-object v13, v7, v12

    .line 410
    .line 411
    invoke-static {v7}, La/dui0;->c([Ljava/lang/Object;)Ljava/util/Set;

    .line 412
    .line 413
    .line 414
    move-result-object v7

    .line 415
    iget v12, v2, La/t7a;->c:I

    .line 416
    .line 417
    new-instance v13, La/onf0;

    .line 418
    .line 419
    invoke-direct {v13, v12}, La/onf0;-><init>(I)V

    .line 420
    .line 421
    .line 422
    invoke-direct {v8, v9, v10, v7, v13}, La/rot0;-><init>(La/bbw0;Ljava/util/Map;Ljava/util/Set;La/onf0;)V

    .line 423
    .line 424
    .line 425
    invoke-interface {v1, v5, v8}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    iget-object v5, v4, La/xot0;->c:La/kpt0;

    .line 429
    .line 430
    iget-object v2, v2, La/t7a;->a:Ljava/util/ArrayList;

    .line 431
    .line 432
    invoke-static {v2}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 433
    .line 434
    .line 435
    move-result-object v2

    .line 436
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v5, v2}, La/kpt0;->b(Ljava/util/List;)Ljava/util/LinkedHashSet;

    .line 440
    .line 441
    .line 442
    move-result-object v2

    .line 443
    invoke-static {v3}, La/l8x;->f0(Ljava/lang/String;)Z

    .line 444
    .line 445
    .line 446
    move-result v5

    .line 447
    if-eqz v5, :cond_b

    .line 448
    .line 449
    const-string v5, "UseCaseCameraRequestControlImpl: State update processing."

    .line 450
    .line 451
    invoke-static {v3, v5}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 452
    .line 453
    .line 454
    :cond_b
    invoke-static {v1}, La/xot0;->o(Ljava/util/LinkedHashMap;)La/rot0;

    .line 455
    .line 456
    .line 457
    move-result-object v1

    .line 458
    iput-boolean v11, v0, La/ni2;->j:Z

    .line 459
    .line 460
    invoke-virtual {v4, v1, v2, v0}, La/xot0;->r(La/rot0;Ljava/util/LinkedHashSet;La/zje;)Ljava/lang/Object;

    .line 461
    .line 462
    .line 463
    move-result-object v0

    .line 464
    if-ne v0, v6, :cond_c

    .line 465
    .line 466
    move-object v0, v6

    .line 467
    :cond_c
    :goto_3
    return-object v0

    .line 468
    :pswitch_0
    check-cast v4, La/ata0;

    .line 469
    .line 470
    sget-object v1, La/wne;->a:La/wne;

    .line 471
    .line 472
    iget-boolean v2, v0, La/ni2;->k:Z

    .line 473
    .line 474
    if-eqz v2, :cond_e

    .line 475
    .line 476
    const/4 v14, 0x1

    .line 477
    if-ne v2, v14, :cond_d

    .line 478
    .line 479
    iget-boolean v1, v0, La/ni2;->j:Z

    .line 480
    .line 481
    iget-object v0, v0, La/ni2;->l:Ljava/lang/Object;

    .line 482
    .line 483
    check-cast v0, La/sff0;

    .line 484
    .line 485
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 486
    .line 487
    .line 488
    move-object v2, v0

    .line 489
    move-object/from16 v0, p1

    .line 490
    .line 491
    goto :goto_4

    .line 492
    :cond_d
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 493
    .line 494
    .line 495
    goto :goto_5

    .line 496
    :cond_e
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 497
    .line 498
    .line 499
    iget-object v2, v4, La/ata0;->v:La/pru;

    .line 500
    .line 501
    invoke-virtual {v2}, La/pru;->a()La/sff0;

    .line 502
    .line 503
    .line 504
    move-result-object v2

    .line 505
    iget-object v3, v4, La/ata0;->C:La/lbu;

    .line 506
    .line 507
    invoke-virtual {v3}, La/lbu;->j()Z

    .line 508
    .line 509
    .line 510
    move-result v3

    .line 511
    iget-object v5, v4, La/ata0;->B:La/j3c;

    .line 512
    .line 513
    iput-object v2, v0, La/ni2;->l:Ljava/lang/Object;

    .line 514
    .line 515
    iput-boolean v3, v0, La/ni2;->j:Z

    .line 516
    .line 517
    const/4 v14, 0x1

    .line 518
    iput-boolean v14, v0, La/ni2;->k:Z

    .line 519
    .line 520
    invoke-virtual {v5, v0}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    if-ne v0, v1, :cond_f

    .line 525
    .line 526
    move-object v5, v1

    .line 527
    goto :goto_5

    .line 528
    :cond_f
    move v1, v3

    .line 529
    :goto_4
    check-cast v0, La/wcb;

    .line 530
    .line 531
    iget-object v3, v4, La/ata0;->E:La/y78;

    .line 532
    .line 533
    new-instance v10, La/bsa0;

    .line 534
    .line 535
    invoke-direct {v10, v2, v1, v0, v3}, La/bsa0;-><init>(La/sff0;ZLa/wcb;La/y78;)V

    .line 536
    .line 537
    .line 538
    iget-object v0, v4, La/i3t0;->i:La/ocj;

    .line 539
    .line 540
    iget-object v1, v0, La/ocj;->a:La/p7m0;

    .line 541
    .line 542
    :cond_10
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    move-result-object v0

    .line 546
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 547
    .line 548
    .line 549
    move-object v5, v0

    .line 550
    check-cast v5, La/nsa0;

    .line 551
    .line 552
    const/4 v12, 0x0

    .line 553
    const/16 v13, 0x3bf

    .line 554
    .line 555
    const/4 v6, 0x0

    .line 556
    const/4 v7, 0x0

    .line 557
    const/4 v8, 0x0

    .line 558
    const/4 v9, 0x0

    .line 559
    const/4 v11, 0x0

    .line 560
    invoke-static/range {v5 .. v13}, La/nsa0;->a(La/nsa0;La/pn00;La/pn00;La/pn00;ZLa/bsa0;ZLjava/util/List;I)La/nsa0;

    .line 561
    .line 562
    .line 563
    move-result-object v2

    .line 564
    invoke-virtual {v1, v0, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 565
    .line 566
    .line 567
    move-result v0

    .line 568
    if-eqz v0, :cond_10

    .line 569
    .line 570
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 571
    .line 572
    :goto_5
    return-object v5

    .line 573
    :pswitch_1
    iget-object v1, v0, La/ni2;->l:Ljava/lang/Object;

    .line 574
    .line 575
    check-cast v1, La/nn20;

    .line 576
    .line 577
    iget-object v2, v1, La/i3t0;->i:La/ocj;

    .line 578
    .line 579
    sget-object v6, La/wne;->a:La/wne;

    .line 580
    .line 581
    iget-boolean v7, v0, La/ni2;->k:Z

    .line 582
    .line 583
    const/4 v14, 0x1

    .line 584
    if-eqz v7, :cond_12

    .line 585
    .line 586
    if-ne v7, v14, :cond_11

    .line 587
    .line 588
    iget-boolean v0, v0, La/ni2;->j:Z

    .line 589
    .line 590
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 591
    .line 592
    .line 593
    move v3, v0

    .line 594
    move-object/from16 v0, p1

    .line 595
    .line 596
    goto :goto_6

    .line 597
    :cond_11
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 598
    .line 599
    .line 600
    goto/16 :goto_8

    .line 601
    .line 602
    :cond_12
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    iget-object v3, v1, La/nn20;->i0:La/lbu;

    .line 606
    .line 607
    invoke-virtual {v3}, La/lbu;->j()Z

    .line 608
    .line 609
    .line 610
    move-result v3

    .line 611
    check-cast v4, La/m97;

    .line 612
    .line 613
    iput-boolean v3, v0, La/ni2;->j:Z

    .line 614
    .line 615
    iput-boolean v14, v0, La/ni2;->k:Z

    .line 616
    .line 617
    invoke-virtual {v1, v3, v4, v0}, La/nn20;->R(ZLa/m97;La/zje;)Ljava/lang/Object;

    .line 618
    .line 619
    .line 620
    move-result-object v0

    .line 621
    if-ne v0, v6, :cond_13

    .line 622
    .line 623
    move-object v5, v6

    .line 624
    goto :goto_8

    .line 625
    :cond_13
    :goto_6
    check-cast v0, Ljava/lang/Boolean;

    .line 626
    .line 627
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 628
    .line 629
    .line 630
    move-result v6

    .line 631
    sget v0, La/nn20;->c1:I

    .line 632
    .line 633
    iget-object v0, v1, La/nn20;->z:La/pru;

    .line 634
    .line 635
    invoke-virtual {v0}, La/pru;->a()La/sff0;

    .line 636
    .line 637
    .line 638
    move-result-object v0

    .line 639
    iget-object v0, v0, La/sff0;->l:La/toc0;

    .line 640
    .line 641
    iget-boolean v0, v0, La/toc0;->g:Z

    .line 642
    .line 643
    if-eqz v0, :cond_14

    .line 644
    .line 645
    if-nez v3, :cond_14

    .line 646
    .line 647
    goto :goto_7

    .line 648
    :cond_14
    iget-object v1, v2, La/ocj;->a:La/p7m0;

    .line 649
    .line 650
    :cond_15
    invoke-virtual {v1}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 651
    .line 652
    .line 653
    move-result-object v0

    .line 654
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 655
    .line 656
    .line 657
    move-object v7, v0

    .line 658
    check-cast v7, La/b820;

    .line 659
    .line 660
    const/16 v19, 0x0

    .line 661
    .line 662
    const/16 v20, 0x1fef

    .line 663
    .line 664
    const/4 v8, 0x0

    .line 665
    const/4 v9, 0x0

    .line 666
    const/4 v10, 0x0

    .line 667
    const/4 v11, 0x0

    .line 668
    const/4 v12, 0x0

    .line 669
    const/4 v13, 0x0

    .line 670
    const/4 v14, 0x0

    .line 671
    const/4 v15, 0x0

    .line 672
    const/16 v16, 0x0

    .line 673
    .line 674
    const/16 v17, 0x0

    .line 675
    .line 676
    const/16 v18, 0x0

    .line 677
    .line 678
    invoke-static/range {v7 .. v20}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 679
    .line 680
    .line 681
    move-result-object v3

    .line 682
    invoke-virtual {v1, v0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 683
    .line 684
    .line 685
    move-result v0

    .line 686
    if-eqz v0, :cond_15

    .line 687
    .line 688
    :goto_7
    if-nez v6, :cond_17

    .line 689
    .line 690
    iget-object v0, v2, La/ocj;->a:La/p7m0;

    .line 691
    .line 692
    :cond_16
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 693
    .line 694
    .line 695
    move-result-object v1

    .line 696
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 697
    .line 698
    .line 699
    move-object v2, v1

    .line 700
    check-cast v2, La/b820;

    .line 701
    .line 702
    const/4 v14, 0x0

    .line 703
    const/16 v15, 0x1fdf

    .line 704
    .line 705
    const/4 v3, 0x0

    .line 706
    const/4 v4, 0x0

    .line 707
    const/4 v5, 0x0

    .line 708
    const/4 v6, 0x0

    .line 709
    const/4 v7, 0x0

    .line 710
    const/4 v8, 0x0

    .line 711
    const/4 v9, 0x0

    .line 712
    const/4 v10, 0x0

    .line 713
    const/4 v11, 0x0

    .line 714
    const/4 v12, 0x0

    .line 715
    const/4 v13, 0x0

    .line 716
    invoke-static/range {v2 .. v15}, La/b820;->a(La/b820;La/ly6;La/fo7;La/an5;La/rvj0;La/czc0;La/gx4;La/wtb0;ZZZZZI)La/b820;

    .line 717
    .line 718
    .line 719
    move-result-object v2

    .line 720
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 721
    .line 722
    .line 723
    move-result v1

    .line 724
    if-eqz v1, :cond_16

    .line 725
    .line 726
    :cond_17
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 727
    .line 728
    :goto_8
    return-object v5

    .line 729
    :pswitch_2
    sget-object v1, La/wne;->a:La/wne;

    .line 730
    .line 731
    iget-boolean v2, v0, La/ni2;->j:Z

    .line 732
    .line 733
    if-eqz v2, :cond_19

    .line 734
    .line 735
    const/4 v14, 0x1

    .line 736
    if-ne v2, v14, :cond_18

    .line 737
    .line 738
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 739
    .line 740
    .line 741
    move-object/from16 v0, p1

    .line 742
    .line 743
    goto :goto_9

    .line 744
    :cond_18
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 745
    .line 746
    .line 747
    move-object v0, v5

    .line 748
    goto :goto_9

    .line 749
    :cond_19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 750
    .line 751
    .line 752
    iget-object v2, v0, La/ni2;->l:Ljava/lang/Object;

    .line 753
    .line 754
    check-cast v2, La/iqi;

    .line 755
    .line 756
    iget-object v2, v2, La/iqi;->c:Ljava/lang/Object;

    .line 757
    .line 758
    move-object v6, v2

    .line 759
    check-cast v6, La/nhf0;

    .line 760
    .line 761
    iget-boolean v7, v0, La/ni2;->k:Z

    .line 762
    .line 763
    move-object v8, v4

    .line 764
    check-cast v8, Ljava/lang/String;

    .line 765
    .line 766
    const/4 v14, 0x1

    .line 767
    iput-boolean v14, v0, La/ni2;->j:Z

    .line 768
    .line 769
    iget-object v2, v6, La/nhf0;->d:Ljava/lang/Object;

    .line 770
    .line 771
    check-cast v2, La/mne;

    .line 772
    .line 773
    iget-object v2, v2, La/mne;->b:La/dvj;

    .line 774
    .line 775
    new-instance v5, La/xj1;

    .line 776
    .line 777
    const/4 v9, 0x0

    .line 778
    const/4 v10, 0x4

    .line 779
    invoke-direct/range {v5 .. v10}, La/xj1;-><init>(Ljava/lang/Object;ZLjava/lang/Object;La/yje;B)V

    .line 780
    .line 781
    .line 782
    invoke-static {v2, v5, v0}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    move-result-object v0

    .line 786
    if-ne v0, v1, :cond_1a

    .line 787
    .line 788
    move-object v0, v1

    .line 789
    :cond_1a
    :goto_9
    return-object v0

    .line 790
    :pswitch_3
    iget-object v1, v0, La/ni2;->l:Ljava/lang/Object;

    .line 791
    .line 792
    check-cast v1, La/qi2;

    .line 793
    .line 794
    sget-object v2, La/wne;->a:La/wne;

    .line 795
    .line 796
    iget-boolean v6, v0, La/ni2;->j:Z

    .line 797
    .line 798
    const/4 v14, 0x1

    .line 799
    if-eqz v6, :cond_1c

    .line 800
    .line 801
    if-ne v6, v14, :cond_1b

    .line 802
    .line 803
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 804
    .line 805
    .line 806
    move-object/from16 v3, p1

    .line 807
    .line 808
    goto :goto_a

    .line 809
    :cond_1b
    invoke-static {v3}, La/jf4;->n(Ljava/lang/String;)V

    .line 810
    .line 811
    .line 812
    goto :goto_b

    .line 813
    :cond_1c
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 814
    .line 815
    .line 816
    iget-object v3, v1, La/qi2;->o:La/j3c;

    .line 817
    .line 818
    iput-boolean v14, v0, La/ni2;->j:Z

    .line 819
    .line 820
    invoke-virtual {v3, v0}, La/j3c;->c(La/yje;)Ljava/lang/Object;

    .line 821
    .line 822
    .line 823
    move-result-object v3

    .line 824
    if-ne v3, v2, :cond_1d

    .line 825
    .line 826
    move-object v5, v2

    .line 827
    goto :goto_b

    .line 828
    :cond_1d
    :goto_a
    check-cast v3, La/wcb;

    .line 829
    .line 830
    new-instance v6, La/wh2;

    .line 831
    .line 832
    iget-object v2, v1, La/qi2;->t:La/g2v;

    .line 833
    .line 834
    check-cast v4, La/i8l0;

    .line 835
    .line 836
    iget-boolean v0, v0, La/ni2;->k:Z

    .line 837
    .line 838
    invoke-direct {v6, v3, v2, v4, v0}, La/wh2;-><init>(La/wcb;La/g2v;La/i8l0;Z)V

    .line 839
    .line 840
    .line 841
    iget-object v0, v1, La/i3t0;->i:La/ocj;

    .line 842
    .line 843
    iget-object v0, v0, La/ocj;->a:La/p7m0;

    .line 844
    .line 845
    :cond_1e
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 846
    .line 847
    .line 848
    move-result-object v1

    .line 849
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    move-object v5, v1

    .line 853
    check-cast v5, La/ei2;

    .line 854
    .line 855
    const/4 v11, 0x0

    .line 856
    const/16 v12, 0x7e

    .line 857
    .line 858
    const/4 v7, 0x0

    .line 859
    const/4 v8, 0x0

    .line 860
    const/4 v9, 0x0

    .line 861
    const/4 v10, 0x0

    .line 862
    invoke-static/range {v5 .. v12}, La/ei2;->a(La/ei2;La/wh2;ZLa/fqp0;ZZLjava/util/List;I)La/ei2;

    .line 863
    .line 864
    .line 865
    move-result-object v2

    .line 866
    invoke-virtual {v0, v1, v2}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 867
    .line 868
    .line 869
    move-result v1

    .line 870
    if-eqz v1, :cond_1e

    .line 871
    .line 872
    sget-object v5, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 873
    .line 874
    :goto_b
    return-object v5

    .line 875
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
