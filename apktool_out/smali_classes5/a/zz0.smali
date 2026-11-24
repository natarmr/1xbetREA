.class public final synthetic La/zz0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:J

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILa/pz40;La/aaj;J)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    iput-byte v0, p0, La/zz0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, La/zz0;->c:I

    iput-object p2, p0, La/zz0;->d:Ljava/lang/Object;

    iput-object p3, p0, La/zz0;->e:Ljava/lang/Object;

    iput-wide p4, p0, La/zz0;->b:J

    return-void
.end method

.method public synthetic constructor <init>(La/pu90;ILa/pu90;J)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput-byte v0, p0, La/zz0;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/zz0;->d:Ljava/lang/Object;

    iput p2, p0, La/zz0;->c:I

    iput-object p3, p0, La/zz0;->e:Ljava/lang/Object;

    iput-wide p4, p0, La/zz0;->b:J

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/io/Serializable;JIB)V
    .locals 0

    .line 3
    iput-byte p6, p0, La/zz0;->a:B

    iput-object p1, p0, La/zz0;->d:Ljava/lang/Object;

    iput-object p2, p0, La/zz0;->e:Ljava/lang/Object;

    iput-wide p3, p0, La/zz0;->b:J

    iput p5, p0, La/zz0;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/zz0;->a:B

    .line 4
    .line 5
    iget-wide v2, v0, La/zz0;->b:J

    .line 6
    .line 7
    iget v4, v0, La/zz0;->c:I

    .line 8
    .line 9
    const/4 v5, 0x0

    .line 10
    iget-object v6, v0, La/zz0;->e:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object v7, v0, La/zz0;->d:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v1, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast v7, La/pz40;

    .line 18
    .line 19
    check-cast v6, La/aaj;

    .line 20
    .line 21
    move-object/from16 v8, p1

    .line 22
    .line 23
    check-cast v8, La/fhl;

    .line 24
    .line 25
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-interface {v7}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, Ljava/util/List;

    .line 33
    .line 34
    invoke-static {v1}, La/q3d;->i(Ljava/util/List;)I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    iget-wide v9, v0, La/zz0;->b:J

    .line 39
    .line 40
    if-ne v4, v1, :cond_0

    .line 41
    .line 42
    iget-object v0, v6, La/aaj;->d:La/kmo;

    .line 43
    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    sget-object v0, La/qmk;->a:La/zcl;

    .line 47
    .line 48
    const/4 v0, 0x3

    .line 49
    const/high16 v1, 0x41800000    # 16.0f

    .line 50
    .line 51
    invoke-static {v5, v5, v1, v1, v0}, La/vgg0;->c(FFFFI)La/ugg0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {v8}, La/fhl;->d()J

    .line 56
    .line 57
    .line 58
    move-result-wide v1

    .line 59
    invoke-interface {v8}, La/fhl;->getLayoutDirection()La/k6z;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    invoke-virtual {v0, v1, v2, v3, v8}, La/cne;->a(JLa/k6z;La/w6k;)La/x1x;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-static {v8, v0, v9, v10}, La/z1x;->E(La/fhl;La/x1x;J)V

    .line 68
    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_0
    const/16 v18, 0x0

    .line 72
    .line 73
    const/16 v19, 0x7e

    .line 74
    .line 75
    const-wide/16 v11, 0x0

    .line 76
    .line 77
    const-wide/16 v13, 0x0

    .line 78
    .line 79
    const/4 v15, 0x0

    .line 80
    const/16 v16, 0x0

    .line 81
    .line 82
    const/16 v17, 0x0

    .line 83
    .line 84
    invoke-static/range {v8 .. v19}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 85
    .line 86
    .line 87
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 88
    .line 89
    return-object v0

    .line 90
    :pswitch_0
    check-cast v7, La/pu90;

    .line 91
    .line 92
    check-cast v6, La/pu90;

    .line 93
    .line 94
    move-object/from16 v0, p1

    .line 95
    .line 96
    check-cast v0, La/ou90;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    if-eqz v7, :cond_1

    .line 102
    .line 103
    iget v1, v7, La/pu90;->b:I

    .line 104
    .line 105
    sub-int v1, v4, v1

    .line 106
    .line 107
    div-int/lit8 v1, v1, 0x2

    .line 108
    .line 109
    const/4 v8, 0x0

    .line 110
    invoke-virtual {v0, v7, v8, v1, v5}, La/ou90;->m(La/pu90;IIF)V

    .line 111
    .line 112
    .line 113
    :cond_1
    if-eqz v6, :cond_2

    .line 114
    .line 115
    invoke-static {v2, v3}, La/p4e;->i(J)I

    .line 116
    .line 117
    .line 118
    move-result v1

    .line 119
    iget v2, v6, La/pu90;->a:I

    .line 120
    .line 121
    sub-int/2addr v1, v2

    .line 122
    iget v2, v6, La/pu90;->b:I

    .line 123
    .line 124
    sub-int/2addr v4, v2

    .line 125
    div-int/lit8 v4, v4, 0x2

    .line 126
    .line 127
    invoke-virtual {v0, v6, v1, v4, v5}, La/ou90;->m(La/pu90;IIF)V

    .line 128
    .line 129
    .line 130
    :cond_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 131
    .line 132
    return-object v0

    .line 133
    :pswitch_1
    check-cast v7, La/uzg;

    .line 134
    .line 135
    move-object v1, v6

    .line 136
    check-cast v1, Ljava/lang/String;

    .line 137
    .line 138
    move-object/from16 v6, p1

    .line 139
    .line 140
    check-cast v6, La/k0w0;

    .line 141
    .line 142
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    iget-object v7, v7, La/uzg;->f:La/gr00;

    .line 146
    .line 147
    new-instance v2, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;

    .line 148
    .line 149
    move-object v3, v2

    .line 150
    const/4 v2, 0x0

    .line 151
    move-object v4, v3

    .line 152
    iget v3, v0, La/zz0;->c:I

    .line 153
    .line 154
    move-object v8, v4

    .line 155
    iget-wide v4, v0, La/zz0;->b:J

    .line 156
    .line 157
    move-object v0, v8

    .line 158
    invoke-direct/range {v0 .. v5}, Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;-><init>(Ljava/lang/String;IIJ)V

    .line 159
    .line 160
    .line 161
    new-instance v1, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;

    .line 162
    .line 163
    invoke-direct {v1, v0, v7}, Lorg/xplatform/cyber/cyberstatistic/impl/navigation/CyberGameStatisticScreenFactoryImpl$getCyberGameStatisticScreen$1;-><init>(Lorg/xplatform/cyber/cyberstatistic/api/navigation/CyberGameStatisticScreenParams;La/gr00;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v6, v1}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 167
    .line 168
    .line 169
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 170
    .line 171
    return-object v0

    .line 172
    :pswitch_2
    check-cast v7, La/a01;

    .line 173
    .line 174
    check-cast v6, La/mlr;

    .line 175
    .line 176
    move-object/from16 v1, p1

    .line 177
    .line 178
    check-cast v1, La/k0w0;

    .line 179
    .line 180
    iget-object v4, v7, La/a01;->B:La/uf3;

    .line 181
    .line 182
    iget-wide v8, v6, La/mlr;->a:J

    .line 183
    .line 184
    iget-object v10, v6, La/mlr;->f:Ljava/lang/String;

    .line 185
    .line 186
    iget-wide v11, v6, La/mlr;->c:J

    .line 187
    .line 188
    iget-boolean v13, v6, La/mlr;->l:Z

    .line 189
    .line 190
    iget-wide v14, v6, La/mlr;->b:J

    .line 191
    .line 192
    iget-boolean v5, v6, La/mlr;->m:Z

    .line 193
    .line 194
    move-object/from16 v16, v4

    .line 195
    .line 196
    iget-boolean v4, v6, La/mlr;->n:Z

    .line 197
    .line 198
    invoke-virtual {v7, v6, v2, v3}, La/a01;->O(La/mlr;J)Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v22

    .line 202
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    const/16 v17, 0x0

    .line 209
    .line 210
    iget v0, v0, La/zz0;->c:I

    .line 211
    .line 212
    const/16 v20, 0x0

    .line 213
    .line 214
    const/16 v21, 0x0

    .line 215
    .line 216
    const/16 v23, 0x1

    .line 217
    .line 218
    move/from16 v18, v0

    .line 219
    .line 220
    move/from16 v19, v4

    .line 221
    .line 222
    move/from16 v16, v5

    .line 223
    .line 224
    invoke-static/range {v8 .. v23}, La/jdk0;->f(JLjava/lang/String;JZJZZIZZZLjava/lang/String;Z)Lorg/xplatform/aggregator/game/impl/game/navigation/AggregatorGameScreens$AggregatorPreloadGameScreen;

    .line 225
    .line 226
    .line 227
    move-result-object v0

    .line 228
    invoke-virtual {v1, v0}, La/k0w0;->h(La/m7h0;)La/ikt0;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    iget-object v0, v0, La/ikt0;->a:Ljava/lang/Object;

    .line 233
    .line 234
    check-cast v0, La/c8d;

    .line 235
    .line 236
    sget-object v1, La/cfx0;->o:La/bjk;

    .line 237
    .line 238
    iget-boolean v2, v6, La/mlr;->n:Z

    .line 239
    .line 240
    xor-int/lit8 v2, v2, 0x1

    .line 241
    .line 242
    new-instance v3, La/v7d;

    .line 243
    .line 244
    invoke-direct {v3, v2, v1, v1}, La/v7d;-><init>(ZLa/bjk;La/bjk;)V

    .line 245
    .line 246
    .line 247
    iput-object v3, v0, La/c8d;->a:La/w7d;

    .line 248
    .line 249
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 250
    .line 251
    return-object v0

    .line 252
    nop

    .line 253
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
