.class public final synthetic La/iv7;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/xdr;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/jv7;


# direct methods
.method public synthetic constructor <init>(La/jv7;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/iv7;->a:B

    iput-object p1, p0, La/iv7;->b:La/jv7;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 30

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/iv7;->a:B

    .line 4
    .line 5
    sget-object v2, La/jm40;->b:La/jm40;

    .line 6
    .line 7
    const/4 v3, 0x1

    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v0, v0, La/iv7;->b:La/jv7;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    move-object/from16 v1, p1

    .line 15
    .line 16
    check-cast v1, La/y5d;

    .line 17
    .line 18
    move-object/from16 v5, p2

    .line 19
    .line 20
    check-cast v5, La/fet;

    .line 21
    .line 22
    move-object/from16 v6, p3

    .line 23
    .line 24
    check-cast v6, Ljava/lang/Integer;

    .line 25
    .line 26
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    sget-object v7, La/jv7;->l2:La/kl5;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    and-int/lit8 v1, v6, 0x11

    .line 36
    .line 37
    const/16 v7, 0x10

    .line 38
    .line 39
    if-eq v1, v7, :cond_0

    .line 40
    .line 41
    move v1, v3

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    move v1, v4

    .line 44
    :goto_0
    and-int/2addr v3, v6

    .line 45
    invoke-virtual {v5, v3, v1}, La/fet;->U(IZ)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_1

    .line 50
    .line 51
    iget-object v1, v0, La/jv7;->k2:La/khf0;

    .line 52
    .line 53
    sget-object v3, La/jv7;->m2:[La/iiy;

    .line 54
    .line 55
    aget-object v3, v3, v4

    .line 56
    .line 57
    invoke-virtual {v1, v0, v3}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    check-cast v0, Lorg/xplatform/bet_history/history/presentation/dialog/bet_summary/BetsSummaryInfoUiModel;

    .line 62
    .line 63
    const/16 v1, 0x46

    .line 64
    .line 65
    invoke-static {v2, v0, v5, v1}, La/ccq0;->c(La/mm40;Lorg/xplatform/bet_history/history/presentation/dialog/bet_summary/BetsSummaryInfoUiModel;La/fet;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_1
    invoke-virtual {v5}, La/fet;->X()V

    .line 70
    .line 71
    .line 72
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 73
    .line 74
    return-object v0

    .line 75
    :pswitch_0
    move-object/from16 v1, p1

    .line 76
    .line 77
    check-cast v1, La/y5d;

    .line 78
    .line 79
    move-object/from16 v12, p2

    .line 80
    .line 81
    check-cast v12, La/fet;

    .line 82
    .line 83
    move-object/from16 v5, p3

    .line 84
    .line 85
    check-cast v5, Ljava/lang/Integer;

    .line 86
    .line 87
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    sget-object v6, La/jv7;->l2:La/kl5;

    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    and-int/lit8 v6, v5, 0x6

    .line 97
    .line 98
    if-nez v6, :cond_3

    .line 99
    .line 100
    invoke-virtual {v12, v1}, La/fet;->g(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v6

    .line 104
    if-eqz v6, :cond_2

    .line 105
    .line 106
    const/4 v6, 0x4

    .line 107
    goto :goto_2

    .line 108
    :cond_2
    const/4 v6, 0x2

    .line 109
    :goto_2
    or-int/2addr v5, v6

    .line 110
    :cond_3
    and-int/lit8 v6, v5, 0x13

    .line 111
    .line 112
    const/16 v7, 0x12

    .line 113
    .line 114
    if-eq v6, v7, :cond_4

    .line 115
    .line 116
    move v6, v3

    .line 117
    goto :goto_3

    .line 118
    :cond_4
    move v6, v4

    .line 119
    :goto_3
    and-int/2addr v5, v3

    .line 120
    invoke-virtual {v12, v5, v6}, La/fet;->U(IZ)Z

    .line 121
    .line 122
    .line 123
    move-result v5

    .line 124
    if-eqz v5, :cond_5

    .line 125
    .line 126
    const/high16 v15, 0x3f800000    # 1.0f

    .line 127
    .line 128
    invoke-static {v2, v15}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    sget-object v6, La/gqw0;->n:La/xx7;

    .line 133
    .line 134
    invoke-virtual {v1, v5, v6}, La/y5d;->a(La/mm40;La/xx7;)La/mm40;

    .line 135
    .line 136
    .line 137
    move-result-object v16

    .line 138
    sget-object v1, La/qmk;->a:La/zcl;

    .line 139
    .line 140
    const/16 v20, 0x0

    .line 141
    .line 142
    const/16 v21, 0xd

    .line 143
    .line 144
    const/16 v17, 0x0

    .line 145
    .line 146
    const/high16 v18, 0x41c00000    # 24.0f

    .line 147
    .line 148
    const/16 v19, 0x0

    .line 149
    .line 150
    invoke-static/range {v16 .. v21}, La/s5x0;->N(La/mm40;FFFFI)La/mm40;

    .line 151
    .line 152
    .line 153
    move-result-object v5

    .line 154
    const v1, 0x7f1306d1

    .line 155
    .line 156
    .line 157
    invoke-static {v1, v4, v12}, La/rsm0;->w(IILa/fet;)Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v6

    .line 161
    const/4 v13, 0x0

    .line 162
    const/16 v14, 0x1c

    .line 163
    .line 164
    const-wide/16 v7, 0x0

    .line 165
    .line 166
    const/4 v9, 0x0

    .line 167
    const-wide/16 v10, 0x0

    .line 168
    .line 169
    invoke-static/range {v5 .. v14}, La/wwb;->i(La/mm40;Ljava/lang/String;JIJLa/fet;II)V

    .line 170
    .line 171
    .line 172
    invoke-static {v2, v15}, La/o7k0;->d(La/mm40;F)La/mm40;

    .line 173
    .line 174
    .line 175
    move-result-object v1

    .line 176
    const/high16 v2, 0x41000000    # 8.0f

    .line 177
    .line 178
    const/4 v5, 0x0

    .line 179
    invoke-static {v1, v5, v2, v3}, La/s5x0;->L(La/mm40;FFI)La/mm40;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    iget-object v1, v0, La/jv7;->k2:La/khf0;

    .line 184
    .line 185
    sget-object v2, La/jv7;->m2:[La/iiy;

    .line 186
    .line 187
    aget-object v2, v2, v4

    .line 188
    .line 189
    invoke-virtual {v1, v0, v2}, La/khf0;->w(Landroidx/fragment/app/Fragment;La/iiy;)Landroid/os/Parcelable;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    check-cast v0, Lorg/xplatform/bet_history/history/presentation/dialog/bet_summary/BetsSummaryInfoUiModel;

    .line 194
    .line 195
    iget-object v5, v0, Lorg/xplatform/bet_history/history/presentation/dialog/bet_summary/BetsSummaryInfoUiModel;->a:Ljava/lang/String;

    .line 196
    .line 197
    sget-object v0, La/j1t0;->e:La/zfn;

    .line 198
    .line 199
    invoke-virtual {v12, v0}, La/fet;->k(Landroidx/compose/runtime/d;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    check-cast v0, La/g1t0;

    .line 204
    .line 205
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    invoke-static {}, La/g1t0;->k()La/y9q0;

    .line 209
    .line 210
    .line 211
    move-result-object v0

    .line 212
    invoke-static {v0, v12}, La/ibm0;->n(La/y9q0;La/fet;)La/y9q0;

    .line 213
    .line 214
    .line 215
    move-result-object v25

    .line 216
    new-instance v0, La/f2q0;

    .line 217
    .line 218
    const/4 v1, 0x3

    .line 219
    invoke-direct {v0, v1}, La/f2q0;-><init>(I)V

    .line 220
    .line 221
    .line 222
    const/16 v28, 0x6000

    .line 223
    .line 224
    const v29, 0x1bbfc

    .line 225
    .line 226
    .line 227
    const/4 v9, 0x0

    .line 228
    move-object/from16 v26, v12

    .line 229
    .line 230
    const/4 v12, 0x0

    .line 231
    const/4 v13, 0x0

    .line 232
    const/4 v14, 0x0

    .line 233
    const-wide/16 v15, 0x0

    .line 234
    .line 235
    const-wide/16 v18, 0x0

    .line 236
    .line 237
    const/16 v20, 0x0

    .line 238
    .line 239
    const/16 v21, 0x0

    .line 240
    .line 241
    const/16 v22, 0x2

    .line 242
    .line 243
    const/16 v23, 0x0

    .line 244
    .line 245
    const/16 v24, 0x0

    .line 246
    .line 247
    const/16 v27, 0x0

    .line 248
    .line 249
    move-object/from16 v17, v0

    .line 250
    .line 251
    invoke-static/range {v5 .. v29}, La/v8q0;->a(Ljava/lang/String;La/mm40;JLa/n05;JLa/lsq;La/psq;La/nrq;JLa/f2q0;JIZIILkotlin/jvm/functions/Function1;La/y9q0;La/fet;III)V

    .line 252
    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_5
    invoke-virtual {v12}, La/fet;->X()V

    .line 256
    .line 257
    .line 258
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 259
    .line 260
    return-object v0

    .line 261
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
