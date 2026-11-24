.class public final La/ryn;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tlx;


# instance fields
.field public final a:La/gbe0;

.field public final b:La/td9;

.field public final c:La/chf0;

.field public final d:La/nr00;


# direct methods
.method public constructor <init>(La/gbe0;La/td9;La/chf0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/ryn;->a:La/gbe0;

    .line 5
    .line 6
    iput-object p2, p0, La/ryn;->b:La/td9;

    .line 7
    .line 8
    iput-object p3, p0, La/ryn;->c:La/chf0;

    .line 9
    .line 10
    new-instance p2, La/nr00;

    .line 11
    .line 12
    invoke-direct {p2, p1, p3}, La/nr00;-><init>(La/gbe0;La/chf0;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, La/ryn;->d:La/nr00;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(La/ibe0;La/zje;)Ljava/lang/Object;
    .locals 21

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v7, p1

    .line 4
    .line 5
    move-object/from16 v0, p2

    .line 6
    .line 7
    iget-object v2, v1, La/ryn;->d:La/nr00;

    .line 8
    .line 9
    instance-of v3, v0, La/qyn;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v0

    .line 14
    check-cast v3, La/qyn;

    .line 15
    .line 16
    iget v4, v3, La/qyn;->l:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, La/qyn;->l:I

    .line 26
    .line 27
    :goto_0
    move-object v10, v3

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    new-instance v3, La/qyn;

    .line 30
    .line 31
    invoke-direct {v3, v1, v0}, La/qyn;-><init>(La/ryn;La/zje;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :goto_1
    iget-object v0, v10, La/qyn;->j:Ljava/lang/Object;

    .line 36
    .line 37
    sget-object v11, La/wne;->a:La/wne;

    .line 38
    .line 39
    iget v3, v10, La/qyn;->l:I

    .line 40
    .line 41
    const/4 v12, 0x1

    .line 42
    const/4 v4, 0x0

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    if-ne v3, v12, :cond_1

    .line 46
    .line 47
    iget-object v1, v10, La/qyn;->i:La/ibe0;

    .line 48
    .line 49
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    .line 51
    .line 52
    return-object v0

    .line 53
    :catchall_0
    move-exception v0

    .line 54
    move-object v7, v1

    .line 55
    goto/16 :goto_7

    .line 56
    .line 57
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 58
    .line 59
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    return-object v4

    .line 63
    :cond_2
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    :try_start_1
    iget-object v0, v7, La/ibe0;->d:Ljava/lang/Object;

    .line 67
    .line 68
    move-object v15, v0

    .line 69
    check-cast v15, La/o1x;

    .line 70
    .line 71
    iget-object v0, v15, La/o1x;->b:Ljava/lang/Object;

    .line 72
    .line 73
    iget-object v3, v7, La/ibe0;->f:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v3, La/f7k0;

    .line 76
    .line 77
    iget-object v5, v7, La/ibe0;->g:Ljava/lang/Object;

    .line 78
    .line 79
    check-cast v5, La/gqw0;

    .line 80
    .line 81
    iget-object v6, v1, La/ryn;->c:La/chf0;

    .line 82
    .line 83
    invoke-virtual {v6, v15, v3}, La/chf0;->c0(La/o1x;La/f7k0;)La/a780;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    iget-object v8, v6, La/a780;->c:La/j1h0;

    .line 88
    .line 89
    iget-object v9, v1, La/ryn;->a:La/gbe0;

    .line 90
    .line 91
    iget-object v9, v9, La/gbe0;->d:La/ngd;

    .line 92
    .line 93
    iget-object v9, v9, La/ngd;->b:Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v9}, Ljava/util/Collection;->size()I

    .line 96
    .line 97
    .line 98
    move-result v13

    .line 99
    const/4 v4, 0x0

    .line 100
    :goto_2
    if-ge v4, v13, :cond_4

    .line 101
    .line 102
    invoke-interface {v9, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v16

    .line 106
    move-object/from16 v14, v16

    .line 107
    .line 108
    check-cast v14, Lkotlin/Pair;

    .line 109
    .line 110
    iget-object v12, v14, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast v12, La/v23;

    .line 113
    .line 114
    iget-object v14, v14, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v14, La/sgy;

    .line 117
    .line 118
    invoke-interface {v14, v0}, La/sgy;->r(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v14

    .line 122
    if-eqz v14, :cond_3

    .line 123
    .line 124
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v12, v0, v6}, La/v23;->a(Ljava/lang/Object;La/a780;)La/aot0;

    .line 128
    .line 129
    .line 130
    move-result-object v12

    .line 131
    if-eqz v12, :cond_3

    .line 132
    .line 133
    move-object v0, v12

    .line 134
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 135
    .line 136
    const/4 v12, 0x1

    .line 137
    goto :goto_2

    .line 138
    :cond_4
    invoke-virtual {v2, v15, v0, v6, v5}, La/nr00;->i(La/o1x;Ljava/lang/Object;La/a780;La/gqw0;)La/jr30;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    if-eqz v4, :cond_5

    .line 143
    .line 144
    invoke-virtual {v2, v15, v4, v3, v8}, La/nr00;->e(La/o1x;La/jr30;La/f7k0;La/j1h0;)La/kr30;

    .line 145
    .line 146
    .line 147
    move-result-object v2

    .line 148
    goto :goto_3

    .line 149
    :catchall_1
    move-exception v0

    .line 150
    goto :goto_7

    .line 151
    :cond_5
    const/4 v2, 0x0

    .line 152
    :goto_3
    if-eqz v2, :cond_9

    .line 153
    .line 154
    iget-object v0, v2, La/kr30;->b:Ljava/util/Map;

    .line 155
    .line 156
    new-instance v13, La/hhn0;

    .line 157
    .line 158
    iget-object v14, v2, La/kr30;->a:La/dyw;

    .line 159
    .line 160
    sget-object v16, La/ibj;->a:La/ibj;

    .line 161
    .line 162
    const-string v1, "coil#disk_cache_key"

    .line 163
    .line 164
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v1

    .line 168
    instance-of v2, v1, Ljava/lang/String;

    .line 169
    .line 170
    if-eqz v2, :cond_6

    .line 171
    .line 172
    check-cast v1, Ljava/lang/String;

    .line 173
    .line 174
    move-object/from16 v18, v1

    .line 175
    .line 176
    goto :goto_4

    .line 177
    :cond_6
    const/16 v18, 0x0

    .line 178
    .line 179
    :goto_4
    const-string v1, "coil#is_sampled"

    .line 180
    .line 181
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 182
    .line 183
    .line 184
    move-result-object v0

    .line 185
    instance-of v1, v0, Ljava/lang/Boolean;

    .line 186
    .line 187
    if-eqz v1, :cond_7

    .line 188
    .line 189
    check-cast v0, Ljava/lang/Boolean;

    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_7
    const/4 v0, 0x0

    .line 193
    :goto_5
    if-eqz v0, :cond_8

    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 196
    .line 197
    .line 198
    move-result v0

    .line 199
    move/from16 v19, v0

    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_8
    const/16 v19, 0x0

    .line 203
    .line 204
    :goto_6
    iget-boolean v0, v7, La/ibe0;->b:Z

    .line 205
    .line 206
    move/from16 v20, v0

    .line 207
    .line 208
    move-object/from16 v17, v4

    .line 209
    .line 210
    invoke-direct/range {v13 .. v20}, La/hhn0;-><init>(La/dyw;La/o1x;La/ibj;La/jr30;Ljava/lang/String;ZZ)V

    .line 211
    .line 212
    .line 213
    return-object v13

    .line 214
    :cond_9
    move-object/from16 v17, v4

    .line 215
    .line 216
    iget-object v12, v15, La/o1x;->j:Lkotlin/coroutines/CoroutineContext;

    .line 217
    .line 218
    move-object v3, v0

    .line 219
    new-instance v0, La/s6d;

    .line 220
    .line 221
    const/4 v8, 0x0

    .line 222
    const/4 v9, 0x4

    .line 223
    move-object v4, v6

    .line 224
    move-object v2, v15

    .line 225
    move-object/from16 v6, v17

    .line 226
    .line 227
    invoke-direct/range {v0 .. v9}, La/s6d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 228
    .line 229
    .line 230
    iput-object v7, v10, La/qyn;->i:La/ibe0;

    .line 231
    .line 232
    const/4 v1, 0x1

    .line 233
    iput v1, v10, La/qyn;->l:I

    .line 234
    .line 235
    invoke-static {v12, v0, v10}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 239
    if-ne v0, v11, :cond_a

    .line 240
    .line 241
    return-object v11

    .line 242
    :cond_a
    return-object v0

    .line 243
    :goto_7
    instance-of v1, v0, Ljava/util/concurrent/CancellationException;

    .line 244
    .line 245
    if-nez v1, :cond_b

    .line 246
    .line 247
    iget-object v1, v7, La/ibe0;->d:Ljava/lang/Object;

    .line 248
    .line 249
    check-cast v1, La/o1x;

    .line 250
    .line 251
    invoke-static {v1, v0}, La/v2n0;->d(La/o1x;Ljava/lang/Throwable;)La/r1o;

    .line 252
    .line 253
    .line 254
    move-result-object v0

    .line 255
    return-object v0

    .line 256
    :cond_b
    throw v0
.end method

.method public final b(La/hmk0;La/ngd;La/o1x;Ljava/lang/Object;La/a780;La/gqw0;La/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p7, La/nyn;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p7

    .line 6
    check-cast v0, La/nyn;

    .line 7
    .line 8
    iget v1, v0, La/nyn;->r:I

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
    iput v1, v0, La/nyn;->r:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/nyn;

    .line 21
    .line 22
    invoke-direct {v0, p0, p7}, La/nyn;-><init>(La/ryn;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p0, v0, La/nyn;->p:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object p7, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v1, v0, La/nyn;->r:I

    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x1

    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    if-ne v1, v3, :cond_1

    .line 36
    .line 37
    iget p1, v0, La/nyn;->o:I

    .line 38
    .line 39
    iget-object p2, v0, La/nyn;->n:La/gqw0;

    .line 40
    .line 41
    iget-object p3, v0, La/nyn;->m:La/a780;

    .line 42
    .line 43
    iget-object p4, v0, La/nyn;->l:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object p5, v0, La/nyn;->k:La/o1x;

    .line 46
    .line 47
    iget-object p6, v0, La/nyn;->j:La/ngd;

    .line 48
    .line 49
    iget-object v1, v0, La/nyn;->i:La/hmk0;

    .line 50
    .line 51
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    move-object v5, p6

    .line 55
    move-object p6, p2

    .line 56
    move-object p2, v5

    .line 57
    move-object v5, p5

    .line 58
    move-object p5, p3

    .line 59
    move-object p3, v5

    .line 60
    goto :goto_4

    .line 61
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 62
    .line 63
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v2

    .line 67
    :cond_2
    invoke-static {p0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    :goto_1
    iget-object v1, p2, La/ngd;->g:La/n0o0;

    .line 72
    .line 73
    invoke-virtual {v1}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Ljava/util/List;

    .line 78
    .line 79
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    :goto_2
    if-ge p0, v1, :cond_4

    .line 84
    .line 85
    iget-object v4, p2, La/ngd;->g:La/n0o0;

    .line 86
    .line 87
    invoke-virtual {v4}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    check-cast v4, Ljava/util/List;

    .line 92
    .line 93
    invoke-interface {v4, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    check-cast v4, La/nkj;

    .line 98
    .line 99
    invoke-interface {v4, p1, p5}, La/nkj;->a(La/hmk0;La/a780;)La/okj;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    if-eqz v4, :cond_3

    .line 104
    .line 105
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    new-instance v1, Lkotlin/Pair;

    .line 110
    .line 111
    invoke-direct {v1, v4, p0}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    goto :goto_3

    .line 115
    :cond_3
    add-int/lit8 p0, p0, 0x1

    .line 116
    .line 117
    goto :goto_2

    .line 118
    :cond_4
    move-object v1, v2

    .line 119
    :goto_3
    if-eqz v1, :cond_9

    .line 120
    .line 121
    iget-object p0, v1, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 122
    .line 123
    check-cast p0, La/okj;

    .line 124
    .line 125
    iget-object v1, v1, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v1, Ljava/lang/Number;

    .line 128
    .line 129
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 130
    .line 131
    .line 132
    move-result v1

    .line 133
    add-int/2addr v1, v3

    .line 134
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    iput-object p1, v0, La/nyn;->i:La/hmk0;

    .line 138
    .line 139
    iput-object p2, v0, La/nyn;->j:La/ngd;

    .line 140
    .line 141
    iput-object p3, v0, La/nyn;->k:La/o1x;

    .line 142
    .line 143
    iput-object p4, v0, La/nyn;->l:Ljava/lang/Object;

    .line 144
    .line 145
    iput-object p5, v0, La/nyn;->m:La/a780;

    .line 146
    .line 147
    iput-object p6, v0, La/nyn;->n:La/gqw0;

    .line 148
    .line 149
    iput v1, v0, La/nyn;->o:I

    .line 150
    .line 151
    iput v3, v0, La/nyn;->r:I

    .line 152
    .line 153
    invoke-interface {p0, v0}, La/okj;->a(La/yje;)Ljava/lang/Object;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    if-ne p0, p7, :cond_5

    .line 158
    .line 159
    return-object p7

    .line 160
    :cond_5
    move v5, v1

    .line 161
    move-object v1, p1

    .line 162
    move p1, v5

    .line 163
    :goto_4
    check-cast p0, La/hkj;

    .line 164
    .line 165
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    if-eqz p0, :cond_8

    .line 169
    .line 170
    new-instance p1, La/myn;

    .line 171
    .line 172
    iget-object p2, p0, La/hkj;->a:La/dyw;

    .line 173
    .line 174
    iget-boolean p0, p0, La/hkj;->b:Z

    .line 175
    .line 176
    iget-object p3, v1, La/hmk0;->c:La/ibj;

    .line 177
    .line 178
    iget-object p4, v1, La/hmk0;->a:La/y1x;

    .line 179
    .line 180
    instance-of p5, p4, La/izp;

    .line 181
    .line 182
    if-eqz p5, :cond_6

    .line 183
    .line 184
    check-cast p4, La/izp;

    .line 185
    .line 186
    goto :goto_5

    .line 187
    :cond_6
    move-object p4, v2

    .line 188
    :goto_5
    if-eqz p4, :cond_7

    .line 189
    .line 190
    iget-object v2, p4, La/izp;->c:Ljava/lang/String;

    .line 191
    .line 192
    :cond_7
    invoke-direct {p1, p2, p0, p3, v2}, La/myn;-><init>(La/dyw;ZLa/ibj;Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    return-object p1

    .line 196
    :cond_8
    move p0, p1

    .line 197
    move-object p1, v1

    .line 198
    goto :goto_1

    .line 199
    :cond_9
    const-string p0, "Unable to create a decoder that supports: "

    .line 200
    .line 201
    invoke-static {p4, p0}, La/hny;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 202
    .line 203
    .line 204
    return-object v2
.end method

.method public final c(La/o1x;Ljava/lang/Object;La/a780;La/gqw0;La/zje;)Ljava/lang/Object;
    .locals 15

    .line 1
    move-object/from16 v1, p5

    .line 2
    .line 3
    instance-of v2, v1, La/oyn;

    .line 4
    .line 5
    if-eqz v2, :cond_0

    .line 6
    .line 7
    move-object v2, v1

    .line 8
    check-cast v2, La/oyn;

    .line 9
    .line 10
    iget v3, v2, La/oyn;->r:I

    .line 11
    .line 12
    const/high16 v4, -0x80000000

    .line 13
    .line 14
    and-int v5, v3, v4

    .line 15
    .line 16
    if-eqz v5, :cond_0

    .line 17
    .line 18
    sub-int/2addr v3, v4

    .line 19
    iput v3, v2, La/oyn;->r:I

    .line 20
    .line 21
    :goto_0
    move-object v6, v2

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    new-instance v2, La/oyn;

    .line 24
    .line 25
    invoke-direct {v2, p0, v1}, La/oyn;-><init>(La/ryn;La/zje;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :goto_1
    iget-object v1, v6, La/oyn;->p:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v9, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v2, v6, La/oyn;->r:I

    .line 34
    .line 35
    const/4 v10, 0x3

    .line 36
    const/4 v11, 0x2

    .line 37
    const/4 v3, 0x1

    .line 38
    const/4 v12, 0x0

    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    if-eq v2, v3, :cond_3

    .line 42
    .line 43
    if-eq v2, v11, :cond_2

    .line 44
    .line 45
    if-ne v2, v10, :cond_1

    .line 46
    .line 47
    iget-object v0, v6, La/oyn;->o:La/mie0;

    .line 48
    .line 49
    check-cast v0, La/myn;

    .line 50
    .line 51
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    goto/16 :goto_9

    .line 55
    .line 56
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v12

    .line 62
    :cond_2
    iget-object v2, v6, La/oyn;->n:La/mie0;

    .line 63
    .line 64
    iget-object v0, v6, La/oyn;->l:La/mie0;

    .line 65
    .line 66
    iget-object v3, v6, La/oyn;->k:La/gqw0;

    .line 67
    .line 68
    iget-object v4, v6, La/oyn;->i:La/o1x;

    .line 69
    .line 70
    :try_start_0
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 71
    .line 72
    .line 73
    move-object v14, v6

    .line 74
    goto/16 :goto_3

    .line 75
    .line 76
    :catchall_0
    move-exception v0

    .line 77
    goto/16 :goto_a

    .line 78
    .line 79
    :cond_3
    iget-object v2, v6, La/oyn;->o:La/mie0;

    .line 80
    .line 81
    iget-object v3, v6, La/oyn;->n:La/mie0;

    .line 82
    .line 83
    iget-object v4, v6, La/oyn;->m:La/mie0;

    .line 84
    .line 85
    iget-object v5, v6, La/oyn;->l:La/mie0;

    .line 86
    .line 87
    iget-object v7, v6, La/oyn;->k:La/gqw0;

    .line 88
    .line 89
    iget-object v8, v6, La/oyn;->j:Ljava/lang/Object;

    .line 90
    .line 91
    iget-object v13, v6, La/oyn;->i:La/o1x;

    .line 92
    .line 93
    :try_start_1
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 94
    .line 95
    .line 96
    move-object v14, v6

    .line 97
    move-object v6, v5

    .line 98
    move-object v5, v8

    .line 99
    move-object v8, v4

    .line 100
    move-object v4, v13

    .line 101
    goto :goto_2

    .line 102
    :catchall_1
    move-exception v0

    .line 103
    move-object v2, v3

    .line 104
    goto/16 :goto_a

    .line 105
    .line 106
    :cond_4
    invoke-static {v1}, La/ohs0;->j(Ljava/lang/Object;)La/mie0;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    move-object/from16 v1, p3

    .line 111
    .line 112
    iput-object v1, v7, La/mie0;->a:Ljava/lang/Object;

    .line 113
    .line 114
    new-instance v8, La/mie0;

    .line 115
    .line 116
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 117
    .line 118
    .line 119
    iget-object v1, p0, La/ryn;->a:La/gbe0;

    .line 120
    .line 121
    iget-object v1, v1, La/gbe0;->d:La/ngd;

    .line 122
    .line 123
    iput-object v1, v8, La/mie0;->a:Ljava/lang/Object;

    .line 124
    .line 125
    new-instance v13, La/mie0;

    .line 126
    .line 127
    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    .line 128
    .line 129
    .line 130
    :try_start_2
    iget-object v1, p0, La/ryn;->c:La/chf0;

    .line 131
    .line 132
    iget-object v2, v7, La/mie0;->a:Ljava/lang/Object;

    .line 133
    .line 134
    check-cast v2, La/a780;

    .line 135
    .line 136
    invoke-virtual {v1, v2}, La/chf0;->k0(La/a780;)La/a780;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    iput-object v1, v7, La/mie0;->a:Ljava/lang/Object;

    .line 141
    .line 142
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    iget-object v1, v8, La/mie0;->a:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v1, La/ngd;

    .line 148
    .line 149
    iget-object v2, v7, La/mie0;->a:Ljava/lang/Object;

    .line 150
    .line 151
    move-object v4, v2

    .line 152
    check-cast v4, La/a780;

    .line 153
    .line 154
    move-object/from16 v2, p1

    .line 155
    .line 156
    iput-object v2, v6, La/oyn;->i:La/o1x;

    .line 157
    .line 158
    move-object/from16 v5, p2

    .line 159
    .line 160
    iput-object v5, v6, La/oyn;->j:Ljava/lang/Object;

    .line 161
    .line 162
    move-object/from16 v14, p4

    .line 163
    .line 164
    iput-object v14, v6, La/oyn;->k:La/gqw0;

    .line 165
    .line 166
    iput-object v7, v6, La/oyn;->l:La/mie0;

    .line 167
    .line 168
    iput-object v8, v6, La/oyn;->m:La/mie0;

    .line 169
    .line 170
    iput-object v13, v6, La/oyn;->n:La/mie0;

    .line 171
    .line 172
    iput-object v13, v6, La/oyn;->o:La/mie0;

    .line 173
    .line 174
    iput v3, v6, La/oyn;->r:I

    .line 175
    .line 176
    move-object v0, p0

    .line 177
    move-object v3, v5

    .line 178
    move-object v5, v14

    .line 179
    invoke-virtual/range {v0 .. v6}, La/ryn;->d(La/ngd;La/o1x;Ljava/lang/Object;La/a780;La/gqw0;La/zje;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 183
    move-object v14, v6

    .line 184
    if-ne v1, v9, :cond_5

    .line 185
    .line 186
    goto/16 :goto_8

    .line 187
    .line 188
    :cond_5
    move-object/from16 v4, p1

    .line 189
    .line 190
    move-object/from16 v5, p2

    .line 191
    .line 192
    move-object v6, v7

    .line 193
    move-object v2, v13

    .line 194
    move-object v3, v2

    .line 195
    move-object/from16 v7, p4

    .line 196
    .line 197
    :goto_2
    :try_start_3
    iput-object v1, v2, La/mie0;->a:Ljava/lang/Object;

    .line 198
    .line 199
    iget-object v0, v3, La/mie0;->a:Ljava/lang/Object;

    .line 200
    .line 201
    move-object v1, v0

    .line 202
    check-cast v1, La/gqp;

    .line 203
    .line 204
    instance-of v2, v1, La/hmk0;

    .line 205
    .line 206
    if-eqz v2, :cond_7

    .line 207
    .line 208
    iget-object v13, v4, La/o1x;->k:Lkotlin/coroutines/CoroutineContext;

    .line 209
    .line 210
    new-instance v0, La/s6d;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 211
    .line 212
    move-object v2, v3

    .line 213
    move-object v3, v8

    .line 214
    const/4 v8, 0x0

    .line 215
    move-object v1, p0

    .line 216
    :try_start_4
    invoke-direct/range {v0 .. v8}, La/s6d;-><init>(La/ryn;La/mie0;La/mie0;La/o1x;Ljava/lang/Object;La/mie0;La/gqw0;La/yje;)V

    .line 217
    .line 218
    .line 219
    iput-object v4, v14, La/oyn;->i:La/o1x;

    .line 220
    .line 221
    iput-object v12, v14, La/oyn;->j:Ljava/lang/Object;

    .line 222
    .line 223
    iput-object v7, v14, La/oyn;->k:La/gqw0;

    .line 224
    .line 225
    iput-object v6, v14, La/oyn;->l:La/mie0;

    .line 226
    .line 227
    iput-object v12, v14, La/oyn;->m:La/mie0;

    .line 228
    .line 229
    iput-object v2, v14, La/oyn;->n:La/mie0;

    .line 230
    .line 231
    iput-object v12, v14, La/oyn;->o:La/mie0;

    .line 232
    .line 233
    iput v11, v14, La/oyn;->r:I

    .line 234
    .line 235
    invoke-static {v13, v0, v14}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    if-ne v1, v9, :cond_6

    .line 240
    .line 241
    goto :goto_8

    .line 242
    :cond_6
    move-object v0, v6

    .line 243
    move-object v3, v7

    .line 244
    :goto_3
    check-cast v1, La/myn;

    .line 245
    .line 246
    move-object v6, v0

    .line 247
    move-object v7, v3

    .line 248
    :goto_4
    move-object v3, v2

    .line 249
    goto :goto_5

    .line 250
    :cond_7
    move-object v2, v3

    .line 251
    instance-of v1, v1, La/wzw;

    .line 252
    .line 253
    if-eqz v1, :cond_c

    .line 254
    .line 255
    new-instance v1, La/myn;

    .line 256
    .line 257
    move-object v3, v0

    .line 258
    check-cast v3, La/wzw;

    .line 259
    .line 260
    iget-object v3, v3, La/wzw;->a:La/dyw;

    .line 261
    .line 262
    move-object v5, v0

    .line 263
    check-cast v5, La/wzw;

    .line 264
    .line 265
    iget-boolean v5, v5, La/wzw;->b:Z

    .line 266
    .line 267
    check-cast v0, La/wzw;

    .line 268
    .line 269
    iget-object v0, v0, La/wzw;->c:La/ibj;

    .line 270
    .line 271
    invoke-direct {v1, v3, v5, v0, v12}, La/myn;-><init>(La/dyw;ZLa/ibj;Ljava/lang/String;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 272
    .line 273
    .line 274
    goto :goto_4

    .line 275
    :goto_5
    iget-object v0, v3, La/mie0;->a:Ljava/lang/Object;

    .line 276
    .line 277
    instance-of v2, v0, La/hmk0;

    .line 278
    .line 279
    if-eqz v2, :cond_8

    .line 280
    .line 281
    check-cast v0, La/hmk0;

    .line 282
    .line 283
    goto :goto_6

    .line 284
    :cond_8
    move-object v0, v12

    .line 285
    :goto_6
    if-eqz v0, :cond_9

    .line 286
    .line 287
    iget-object v0, v0, La/hmk0;->a:La/y1x;

    .line 288
    .line 289
    if-eqz v0, :cond_9

    .line 290
    .line 291
    :try_start_5
    invoke-static {v0}, La/ohs0;->y(Ljava/lang/AutoCloseable;)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_0
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 292
    .line 293
    .line 294
    goto :goto_7

    .line 295
    :catch_0
    move-exception v0

    .line 296
    throw v0

    .line 297
    :catch_1
    :cond_9
    :goto_7
    iget-object v0, v6, La/mie0;->a:Ljava/lang/Object;

    .line 298
    .line 299
    check-cast v0, La/a780;

    .line 300
    .line 301
    iput-object v12, v14, La/oyn;->i:La/o1x;

    .line 302
    .line 303
    iput-object v12, v14, La/oyn;->j:Ljava/lang/Object;

    .line 304
    .line 305
    iput-object v12, v14, La/oyn;->k:La/gqw0;

    .line 306
    .line 307
    iput-object v12, v14, La/oyn;->l:La/mie0;

    .line 308
    .line 309
    iput-object v12, v14, La/oyn;->m:La/mie0;

    .line 310
    .line 311
    iput-object v12, v14, La/oyn;->n:La/mie0;

    .line 312
    .line 313
    iput-object v12, v14, La/oyn;->o:La/mie0;

    .line 314
    .line 315
    iput v10, v14, La/oyn;->r:I

    .line 316
    .line 317
    invoke-static {v1, v4, v0, v7, v14}, La/xkb;->i0(La/myn;La/o1x;La/a780;La/gqw0;La/zje;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    if-ne v1, v9, :cond_a

    .line 322
    .line 323
    :goto_8
    return-object v9

    .line 324
    :cond_a
    :goto_9
    check-cast v1, La/myn;

    .line 325
    .line 326
    iget-object v0, v1, La/myn;->a:La/dyw;

    .line 327
    .line 328
    sget-object v2, La/lut0;->a:[Landroid/graphics/Bitmap$Config;

    .line 329
    .line 330
    instance-of v2, v0, La/b78;

    .line 331
    .line 332
    if-eqz v2, :cond_b

    .line 333
    .line 334
    check-cast v0, La/b78;

    .line 335
    .line 336
    iget-object v0, v0, La/b78;->a:Landroid/graphics/Bitmap;

    .line 337
    .line 338
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->prepareToDraw()V

    .line 339
    .line 340
    .line 341
    :cond_b
    return-object v1

    .line 342
    :cond_c
    :try_start_6
    new-instance v0, La/m460;

    .line 343
    .line 344
    invoke-direct {v0}, Ljava/lang/RuntimeException;-><init>()V

    .line 345
    .line 346
    .line 347
    throw v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 348
    :catchall_2
    move-exception v0

    .line 349
    move-object v2, v13

    .line 350
    :goto_a
    iget-object v1, v2, La/mie0;->a:Ljava/lang/Object;

    .line 351
    .line 352
    instance-of v2, v1, La/hmk0;

    .line 353
    .line 354
    if-eqz v2, :cond_d

    .line 355
    .line 356
    move-object v12, v1

    .line 357
    check-cast v12, La/hmk0;

    .line 358
    .line 359
    :cond_d
    if-eqz v12, :cond_e

    .line 360
    .line 361
    iget-object v1, v12, La/hmk0;->a:La/y1x;

    .line 362
    .line 363
    if-eqz v1, :cond_e

    .line 364
    .line 365
    :try_start_7
    invoke-static {v1}, La/ohs0;->y(Ljava/lang/AutoCloseable;)V
    :try_end_7
    .catch Ljava/lang/RuntimeException; {:try_start_7 .. :try_end_7} :catch_2
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_3

    .line 366
    .line 367
    .line 368
    goto :goto_b

    .line 369
    :catch_2
    move-exception v0

    .line 370
    throw v0

    .line 371
    :catch_3
    :cond_e
    :goto_b
    throw v0
.end method

.method public final d(La/ngd;La/o1x;Ljava/lang/Object;La/a780;La/gqw0;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p6, La/pyn;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p6

    .line 6
    check-cast v0, La/pyn;

    .line 7
    .line 8
    iget v1, v0, La/pyn;->q:I

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
    iput v1, v0, La/pyn;->q:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/pyn;

    .line 21
    .line 22
    invoke-direct {v0, p0, p6}, La/pyn;-><init>(La/ryn;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p6, v0, La/pyn;->o:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/pyn;->q:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x1

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v4, :cond_1

    .line 36
    .line 37
    iget p1, v0, La/pyn;->n:I

    .line 38
    .line 39
    iget-object p2, v0, La/pyn;->m:La/gqw0;

    .line 40
    .line 41
    iget-object p3, v0, La/pyn;->l:La/a780;

    .line 42
    .line 43
    iget-object p4, v0, La/pyn;->k:Ljava/lang/Object;

    .line 44
    .line 45
    iget-object p5, v0, La/pyn;->j:La/o1x;

    .line 46
    .line 47
    iget-object v2, v0, La/pyn;->i:La/ngd;

    .line 48
    .line 49
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v7, v2

    .line 53
    move v2, p1

    .line 54
    move-object p1, v7

    .line 55
    move-object v7, p5

    .line 56
    move-object p5, p2

    .line 57
    move-object p2, v7

    .line 58
    move-object v7, p4

    .line 59
    move-object p4, p3

    .line 60
    move-object p3, v7

    .line 61
    goto/16 :goto_4

    .line 62
    .line 63
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 64
    .line 65
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v3

    .line 69
    :cond_2
    invoke-static {p6}, La/z1x;->P(Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    const/4 p6, 0x0

    .line 73
    :goto_1
    iget-object v2, p1, La/ngd;->f:La/n0o0;

    .line 74
    .line 75
    invoke-virtual {v2}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Ljava/util/List;

    .line 80
    .line 81
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    :goto_2
    if-ge p6, v2, :cond_4

    .line 86
    .line 87
    iget-object v5, p1, La/ngd;->f:La/n0o0;

    .line 88
    .line 89
    invoke-virtual {v5}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    check-cast v5, Ljava/util/List;

    .line 94
    .line 95
    invoke-interface {v5, p6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v5

    .line 99
    check-cast v5, Lkotlin/Pair;

    .line 100
    .line 101
    iget-object v6, v5, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v6, La/nqp;

    .line 104
    .line 105
    iget-object v5, v5, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v5, La/sgy;

    .line 108
    .line 109
    invoke-interface {v5, p3}, La/sgy;->r(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-eqz v5, :cond_3

    .line 114
    .line 115
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    iget-object v5, p0, La/ryn;->a:La/gbe0;

    .line 119
    .line 120
    invoke-interface {v6, p3, p4, v5}, La/nqp;->a(Ljava/lang/Object;La/a780;La/gbe0;)La/oqp;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    if-eqz v5, :cond_3

    .line 125
    .line 126
    invoke-static {p6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object p6

    .line 130
    new-instance v2, Lkotlin/Pair;

    .line 131
    .line 132
    invoke-direct {v2, v5, p6}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 133
    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_3
    add-int/lit8 p6, p6, 0x1

    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_4
    move-object v2, v3

    .line 140
    :goto_3
    if-eqz v2, :cond_9

    .line 141
    .line 142
    iget-object p6, v2, Lkotlin/Pair;->a:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p6, La/oqp;

    .line 145
    .line 146
    iget-object v2, v2, Lkotlin/Pair;->b:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v2, Ljava/lang/Number;

    .line 149
    .line 150
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    add-int/2addr v2, v4

    .line 155
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 156
    .line 157
    .line 158
    iput-object p1, v0, La/pyn;->i:La/ngd;

    .line 159
    .line 160
    iput-object p2, v0, La/pyn;->j:La/o1x;

    .line 161
    .line 162
    iput-object p3, v0, La/pyn;->k:Ljava/lang/Object;

    .line 163
    .line 164
    iput-object p4, v0, La/pyn;->l:La/a780;

    .line 165
    .line 166
    iput-object p5, v0, La/pyn;->m:La/gqw0;

    .line 167
    .line 168
    iput v2, v0, La/pyn;->n:I

    .line 169
    .line 170
    iput v4, v0, La/pyn;->q:I

    .line 171
    .line 172
    invoke-interface {p6, v0}, La/oqp;->a(La/pyn;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object p6

    .line 176
    if-ne p6, v1, :cond_5

    .line 177
    .line 178
    return-object v1

    .line 179
    :cond_5
    :goto_4
    check-cast p6, La/gqp;

    .line 180
    .line 181
    :try_start_0
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 182
    .line 183
    .line 184
    if-eqz p6, :cond_6

    .line 185
    .line 186
    return-object p6

    .line 187
    :cond_6
    move p6, v2

    .line 188
    goto :goto_1

    .line 189
    :catchall_0
    move-exception p0

    .line 190
    instance-of p1, p6, La/hmk0;

    .line 191
    .line 192
    if-eqz p1, :cond_7

    .line 193
    .line 194
    move-object v3, p6

    .line 195
    check-cast v3, La/hmk0;

    .line 196
    .line 197
    :cond_7
    if-eqz v3, :cond_8

    .line 198
    .line 199
    iget-object p1, v3, La/hmk0;->a:La/y1x;

    .line 200
    .line 201
    if-eqz p1, :cond_8

    .line 202
    .line 203
    :try_start_1
    invoke-static {p1}, La/ohs0;->y(Ljava/lang/AutoCloseable;)V
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 204
    .line 205
    .line 206
    goto :goto_5

    .line 207
    :catch_0
    move-exception p0

    .line 208
    throw p0

    .line 209
    :catch_1
    :cond_8
    :goto_5
    throw p0

    .line 210
    :cond_9
    const-string p0, "Unable to create a fetcher that supports: "

    .line 211
    .line 212
    invoke-static {p3, p0}, La/hny;->t(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    return-object v3
.end method
