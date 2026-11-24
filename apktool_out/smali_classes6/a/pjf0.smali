.class public final La/pjf0;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public final synthetic j:Ljava/lang/Object;

.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;

.field public synthetic m:Ljava/lang/Object;

.field public final synthetic n:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/dn0;La/mlr;ILa/lu0;La/yje;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/pjf0;->i:B

    .line 19
    iput-object p1, p0, La/pjf0;->j:Ljava/lang/Object;

    iput-object p2, p0, La/pjf0;->l:Ljava/lang/Object;

    iput p3, p0, La/pjf0;->k:I

    iput-object p4, p0, La/pjf0;->n:Ljava/lang/Object;

    invoke-direct {p0, v0, p5}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method

.method public constructor <init>(La/tcj;Ljava/util/List;ILa/v9v0;La/cgk0;La/yje;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-byte v0, p0, La/pjf0;->i:B

    .line 3
    .line 4
    iput-object p1, p0, La/pjf0;->m:Ljava/lang/Object;

    .line 5
    .line 6
    iput-object p2, p0, La/pjf0;->j:Ljava/lang/Object;

    .line 7
    .line 8
    iput p3, p0, La/pjf0;->k:I

    .line 9
    .line 10
    iput-object p4, p0, La/pjf0;->l:Ljava/lang/Object;

    .line 11
    .line 12
    iput-object p5, p0, La/pjf0;->n:Ljava/lang/Object;

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

.method public constructor <init>(Ljava/util/List;ILa/v9v0;La/tcj;La/cgk0;La/yje;)V
    .locals 1

    const/4 v0, 0x1

    iput-byte v0, p0, La/pjf0;->i:B

    .line 20
    iput-object p1, p0, La/pjf0;->j:Ljava/lang/Object;

    iput p2, p0, La/pjf0;->k:I

    iput-object p3, p0, La/pjf0;->l:Ljava/lang/Object;

    iput-object p4, p0, La/pjf0;->m:Ljava/lang/Object;

    iput-object p5, p0, La/pjf0;->n:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 12

    .line 1
    iget-byte v0, p0, La/pjf0;->i:B

    .line 2
    .line 3
    iget-object v1, p0, La/pjf0;->n:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, La/pjf0;->l:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v3, p0, La/pjf0;->j:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    new-instance v4, La/pjf0;

    .line 13
    .line 14
    move-object v5, v3

    .line 15
    check-cast v5, La/dn0;

    .line 16
    .line 17
    move-object v6, v2

    .line 18
    check-cast v6, La/mlr;

    .line 19
    .line 20
    iget v7, p0, La/pjf0;->k:I

    .line 21
    .line 22
    move-object v8, v1

    .line 23
    check-cast v8, La/lu0;

    .line 24
    .line 25
    move-object v9, p2

    .line 26
    invoke-direct/range {v4 .. v9}, La/pjf0;-><init>(La/dn0;La/mlr;ILa/lu0;La/yje;)V

    .line 27
    .line 28
    .line 29
    iput-object p1, v4, La/pjf0;->m:Ljava/lang/Object;

    .line 30
    .line 31
    return-object v4

    .line 32
    :pswitch_0
    move-object v11, p2

    .line 33
    new-instance v5, La/pjf0;

    .line 34
    .line 35
    move-object v6, v3

    .line 36
    check-cast v6, Ljava/util/List;

    .line 37
    .line 38
    move-object v8, v2

    .line 39
    check-cast v8, La/v9v0;

    .line 40
    .line 41
    iget-object p1, p0, La/pjf0;->m:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v9, p1

    .line 44
    check-cast v9, La/tcj;

    .line 45
    .line 46
    move-object v10, v1

    .line 47
    check-cast v10, La/cgk0;

    .line 48
    .line 49
    iget v7, p0, La/pjf0;->k:I

    .line 50
    .line 51
    invoke-direct/range {v5 .. v11}, La/pjf0;-><init>(Ljava/util/List;ILa/v9v0;La/tcj;La/cgk0;La/yje;)V

    .line 52
    .line 53
    .line 54
    return-object v5

    .line 55
    :pswitch_1
    move-object v11, p2

    .line 56
    new-instance v5, La/pjf0;

    .line 57
    .line 58
    iget-object p1, p0, La/pjf0;->m:Ljava/lang/Object;

    .line 59
    .line 60
    move-object v6, p1

    .line 61
    check-cast v6, La/tcj;

    .line 62
    .line 63
    move-object v7, v3

    .line 64
    check-cast v7, Ljava/util/List;

    .line 65
    .line 66
    move-object v9, v2

    .line 67
    check-cast v9, La/v9v0;

    .line 68
    .line 69
    move-object v10, v1

    .line 70
    check-cast v10, La/cgk0;

    .line 71
    .line 72
    iget v8, p0, La/pjf0;->k:I

    .line 73
    .line 74
    invoke-direct/range {v5 .. v11}, La/pjf0;-><init>(La/tcj;Ljava/util/List;ILa/v9v0;La/cgk0;La/yje;)V

    .line 75
    .line 76
    .line 77
    return-object v5

    .line 78
    nop

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/pjf0;->i:B

    .line 2
    .line 3
    check-cast p1, La/vne;

    .line 4
    .line 5
    check-cast p2, La/yje;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/pjf0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/pjf0;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/pjf0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    invoke-virtual {p0, p1, p2}, La/pjf0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, La/pjf0;

    .line 28
    .line 29
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, La/pjf0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :pswitch_1
    invoke-virtual {p0, p1, p2}, La/pjf0;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    check-cast p0, La/pjf0;

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 43
    .line 44
    invoke-virtual {p0, p1}, La/pjf0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    .line 1
    iget-byte v0, p0, La/pjf0;->i:B

    .line 2
    .line 3
    iget v1, p0, La/pjf0;->k:I

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, La/pjf0;->n:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, p0, La/pjf0;->l:Ljava/lang/Object;

    .line 10
    .line 11
    iget-object v6, p0, La/pjf0;->j:Ljava/lang/Object;

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, La/pjf0;->m:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, La/vne;

    .line 19
    .line 20
    sget-object v1, La/wne;->a:La/wne;

    .line 21
    .line 22
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v7, La/gm0;

    .line 26
    .line 27
    move-object v8, v6

    .line 28
    check-cast v8, La/dn0;

    .line 29
    .line 30
    move-object v9, v5

    .line 31
    check-cast v9, La/mlr;

    .line 32
    .line 33
    move-object v11, v4

    .line 34
    check-cast v11, La/lu0;

    .line 35
    .line 36
    const/4 v12, 0x0

    .line 37
    iget v10, p0, La/pjf0;->k:I

    .line 38
    .line 39
    invoke-direct/range {v7 .. v12}, La/gm0;-><init>(La/dn0;La/mlr;ILa/lu0;La/yje;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x3

    .line 43
    invoke-static {v0, v3, v3, v7, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    new-instance p1, La/fm0;

    .line 48
    .line 49
    invoke-direct {p1, v8, v2}, La/fm0;-><init>(La/dn0;B)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/pby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    .line 53
    .line 54
    .line 55
    return-object p0

    .line 56
    :pswitch_0
    check-cast v4, La/cgk0;

    .line 57
    .line 58
    iget-object p0, p0, La/pjf0;->m:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast p0, La/tcj;

    .line 61
    .line 62
    check-cast v5, La/v9v0;

    .line 63
    .line 64
    iget-object v0, v5, La/v9v0;->a:Ljava/util/List;

    .line 65
    .line 66
    sget-object v7, La/wne;->a:La/wne;

    .line 67
    .line 68
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    check-cast v6, Ljava/util/List;

    .line 72
    .line 73
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    check-cast p1, La/t9v0;

    .line 78
    .line 79
    iget-boolean p1, p1, La/t9v0;->e:Z

    .line 80
    .line 81
    if-eqz p1, :cond_0

    .line 82
    .line 83
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 84
    .line 85
    goto/16 :goto_5

    .line 86
    .line 87
    :cond_0
    invoke-virtual {v4}, La/cgk0;->l()I

    .line 88
    .line 89
    .line 90
    move-result p1

    .line 91
    invoke-static {v0}, La/q3d;->i(Ljava/util/List;)I

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    invoke-static {p1, v2, v7}, La/l1e0;->d(III)I

    .line 96
    .line 97
    .line 98
    move-result p1

    .line 99
    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    check-cast p1, La/u9v0;

    .line 104
    .line 105
    iget-object p1, p1, La/u9v0;->c:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast p1, Ljava/lang/Number;

    .line 108
    .line 109
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result p1

    .line 113
    invoke-static {p0}, La/up90;->e(La/tcj;)Z

    .line 114
    .line 115
    .line 116
    move-result v7

    .line 117
    if-eqz v7, :cond_1

    .line 118
    .line 119
    invoke-static {v6, v1, v5, p0}, La/idx;->l(Ljava/util/List;ILa/v9v0;La/tcj;)V

    .line 120
    .line 121
    .line 122
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 123
    .line 124
    goto/16 :goto_5

    .line 125
    .line 126
    :cond_1
    iget-object v7, p0, La/tcj;->a:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 127
    .line 128
    if-eqz v7, :cond_2

    .line 129
    .line 130
    iget v7, v7, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->a:I

    .line 131
    .line 132
    goto :goto_0

    .line 133
    :cond_2
    const/high16 v7, -0x80000000

    .line 134
    .line 135
    :goto_0
    iget-object v8, p0, La/tcj;->b:Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 136
    .line 137
    if-eqz v8, :cond_3

    .line 138
    .line 139
    iget v8, v8, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;->a:I

    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_3
    const v8, 0x7fffffff

    .line 143
    .line 144
    .line 145
    :goto_1
    if-ge p1, v7, :cond_4

    .line 146
    .line 147
    move p1, v7

    .line 148
    :cond_4
    invoke-static {p1, v8}, Ljava/lang/Math;->min(II)I

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v7

    .line 156
    check-cast v7, La/u9v0;

    .line 157
    .line 158
    if-eqz v7, :cond_5

    .line 159
    .line 160
    iget-object v3, v7, La/u9v0;->c:Ljava/lang/Object;

    .line 161
    .line 162
    check-cast v3, Ljava/lang/Integer;

    .line 163
    .line 164
    :cond_5
    const/4 v7, 0x1

    .line 165
    if-eqz v3, :cond_9

    .line 166
    .line 167
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    sub-int v3, p1, v3

    .line 172
    .line 173
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    check-cast v8, La/t9v0;

    .line 178
    .line 179
    iget-object v8, v8, La/t9v0;->b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 180
    .line 181
    invoke-virtual {v8}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    sub-int/2addr v8, v7

    .line 186
    invoke-static {v3, v2, v8}, La/l1e0;->d(III)I

    .line 187
    .line 188
    .line 189
    move-result v3

    .line 190
    invoke-static {v3, v0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 191
    .line 192
    .line 193
    move-result-object v8

    .line 194
    check-cast v8, La/u9v0;

    .line 195
    .line 196
    if-eqz v8, :cond_6

    .line 197
    .line 198
    iget-object v8, v8, La/u9v0;->c:Ljava/lang/Object;

    .line 199
    .line 200
    check-cast v8, Ljava/lang/Number;

    .line 201
    .line 202
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 203
    .line 204
    .line 205
    move-result v8

    .line 206
    if-ne v8, p1, :cond_6

    .line 207
    .line 208
    move v2, v3

    .line 209
    goto :goto_4

    .line 210
    :cond_6
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    move v3, v2

    .line 215
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 216
    .line 217
    .line 218
    move-result v8

    .line 219
    if-eqz v8, :cond_8

    .line 220
    .line 221
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 222
    .line 223
    .line 224
    move-result-object v8

    .line 225
    check-cast v8, La/u9v0;

    .line 226
    .line 227
    iget-object v8, v8, La/u9v0;->c:Ljava/lang/Object;

    .line 228
    .line 229
    check-cast v8, Ljava/lang/Number;

    .line 230
    .line 231
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 232
    .line 233
    .line 234
    move-result v8

    .line 235
    if-ne v8, p1, :cond_7

    .line 236
    .line 237
    goto :goto_3

    .line 238
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 239
    .line 240
    goto :goto_2

    .line 241
    :cond_8
    const/4 v3, -0x1

    .line 242
    :goto_3
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    check-cast v0, La/t9v0;

    .line 247
    .line 248
    iget-object v0, v0, La/t9v0;->b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 249
    .line 250
    invoke-virtual {v0}, Landroidx/compose/runtime/snapshots/SnapshotStateList;->size()I

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    sub-int/2addr v0, v7

    .line 255
    invoke-static {v3, v2, v0}, La/l1e0;->d(III)I

    .line 256
    .line 257
    .line 258
    move-result v2

    .line 259
    :cond_9
    :goto_4
    invoke-static {v6, v1, v5, p0}, La/idx;->l(Ljava/util/List;ILa/v9v0;La/tcj;)V

    .line 260
    .line 261
    .line 262
    invoke-virtual {v4}, La/cgk0;->l()I

    .line 263
    .line 264
    .line 265
    move-result v0

    .line 266
    if-eq v2, v0, :cond_a

    .line 267
    .line 268
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 269
    .line 270
    .line 271
    move-result-object p0

    .line 272
    check-cast p0, La/t9v0;

    .line 273
    .line 274
    iget-object p0, p0, La/t9v0;->d:La/okt0;

    .line 275
    .line 276
    invoke-virtual {p0, v2}, La/okt0;->i(I)V

    .line 277
    .line 278
    .line 279
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 280
    .line 281
    goto :goto_5

    .line 282
    :cond_a
    iget-object p0, p0, La/tcj;->c:Lkotlin/jvm/functions/Function1;

    .line 283
    .line 284
    new-instance v0, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;

    .line 285
    .line 286
    invoke-direct {v0, p1, v7, v7}, Lorg/xplatform/uikit/compose/components/picker/model/SimpleDate;-><init>(III)V

    .line 287
    .line 288
    .line 289
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    .line 291
    .line 292
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 293
    .line 294
    :goto_5
    return-object p0

    .line 295
    :pswitch_1
    sget-object v0, La/wne;->a:La/wne;

    .line 296
    .line 297
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 298
    .line 299
    .line 300
    check-cast v6, Ljava/util/List;

    .line 301
    .line 302
    check-cast v5, La/v9v0;

    .line 303
    .line 304
    iget-object p0, p0, La/pjf0;->m:Ljava/lang/Object;

    .line 305
    .line 306
    check-cast p0, La/tcj;

    .line 307
    .line 308
    invoke-static {v6, v1, v5, p0}, La/idx;->l(Ljava/util/List;ILa/v9v0;La/tcj;)V

    .line 309
    .line 310
    .line 311
    invoke-static {p0}, La/up90;->e(La/tcj;)Z

    .line 312
    .line 313
    .line 314
    move-result p0

    .line 315
    if-eqz p0, :cond_b

    .line 316
    .line 317
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 318
    .line 319
    goto :goto_6

    .line 320
    :cond_b
    invoke-interface {v6, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 321
    .line 322
    .line 323
    move-result-object p0

    .line 324
    check-cast p0, La/t9v0;

    .line 325
    .line 326
    iget-object p0, p0, La/t9v0;->d:La/okt0;

    .line 327
    .line 328
    check-cast v4, La/cgk0;

    .line 329
    .line 330
    invoke-virtual {v4}, La/cgk0;->l()I

    .line 331
    .line 332
    .line 333
    move-result p1

    .line 334
    invoke-virtual {p0, p1}, La/okt0;->i(I)V

    .line 335
    .line 336
    .line 337
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 338
    .line 339
    :goto_6
    return-object p0

    .line 340
    nop

    .line 341
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
