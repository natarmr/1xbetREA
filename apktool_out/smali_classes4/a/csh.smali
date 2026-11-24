.class public final La/csh;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/dsh;


# direct methods
.method public synthetic constructor <init>(La/dsh;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/csh;->i:B

    iput-object p1, p0, La/csh;->k:La/dsh;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/csh;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/csh;->k:La/dsh;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/csh;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/csh;-><init>(La/dsh;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/csh;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/csh;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/csh;-><init>(La/dsh;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/csh;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/csh;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/o5s0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/csh;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/csh;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/csh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/och;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/csh;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/csh;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/csh;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/csh;->i:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, v0, La/csh;->k:La/dsh;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v0, v0, La/csh;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, La/o5s0;

    .line 14
    .line 15
    sget-object v1, La/wne;->a:La/wne;

    .line 16
    .line 17
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    iget-object v3, v3, La/dsh;->M1:La/wdk0;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    iget-object v2, v0, La/o5s0;->a:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, v0, La/o5s0;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v0, v0, La/o5s0;->d:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v1, v3, v2, v4, v0}, La/n6x;->F(La/kxq;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    const-string v0, "snackbarManager"

    .line 41
    .line 42
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v2

    .line 46
    :cond_1
    :goto_0
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_0
    iget-object v1, v3, La/dsh;->Q1:La/yqc;

    .line 50
    .line 51
    iget-object v0, v0, La/csh;->j:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v0, La/och;

    .line 54
    .line 55
    sget-object v4, La/wne;->a:La/wne;

    .line 56
    .line 57
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    if-eqz v0, :cond_5

    .line 61
    .line 62
    instance-of v4, v0, La/mch;

    .line 63
    .line 64
    const/4 v5, 0x0

    .line 65
    const/16 v6, 0x8

    .line 66
    .line 67
    if-eqz v4, :cond_2

    .line 68
    .line 69
    sget-object v2, La/dsh;->V1:La/usd;

    .line 70
    .line 71
    invoke-virtual {v3}, La/dsh;->G0()La/buh;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    iget-object v2, v2, La/buh;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 76
    .line 77
    check-cast v0, La/mch;

    .line 78
    .line 79
    iget-object v4, v0, La/mch;->a:La/jkm;

    .line 80
    .line 81
    iget-short v0, v0, La/mch;->b:S

    .line 82
    .line 83
    int-to-long v7, v0

    .line 84
    new-instance v9, La/oye;

    .line 85
    .line 86
    invoke-virtual {v3}, La/dsh;->H0()La/rsh;

    .line 87
    .line 88
    .line 89
    move-result-object v11

    .line 90
    const/4 v15, 0x0

    .line 91
    const/16 v16, 0x1b

    .line 92
    .line 93
    const/4 v10, 0x0

    .line 94
    const-class v12, La/rsh;

    .line 95
    .line 96
    const-string v13, "setEndTimerState"

    .line 97
    .line 98
    const-string v14, "setEndTimerState()V"

    .line 99
    .line 100
    invoke-direct/range {v9 .. v16}, La/oye;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v4, v7, v8, v9}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->b(La/jkm;JLkotlin/jvm/functions/Function0;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, La/dsh;->G0()La/buh;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    iget-object v0, v0, La/buh;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 111
    .line 112
    invoke-virtual {v0, v5}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, La/dsh;->G0()La/buh;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    iget-object v0, v0, La/buh;->d:La/ewe;

    .line 120
    .line 121
    iget-object v0, v0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 122
    .line 123
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v3}, La/dsh;->G0()La/buh;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    iget-object v0, v0, La/buh;->d:La/ewe;

    .line 131
    .line 132
    iget-object v0, v0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 133
    .line 134
    invoke-static {v0}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 135
    .line 136
    .line 137
    sget-object v0, La/iun;->a:La/iun;

    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    iget-object v1, v1, La/yqc;->b:Ljava/lang/Object;

    .line 146
    .line 147
    check-cast v1, La/xrh;

    .line 148
    .line 149
    if-eqz v1, :cond_4

    .line 150
    .line 151
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 152
    .line 153
    .line 154
    goto :goto_1

    .line 155
    :cond_2
    instance-of v4, v0, La/lch;

    .line 156
    .line 157
    if-eqz v4, :cond_3

    .line 158
    .line 159
    sget-object v2, La/dsh;->V1:La/usd;

    .line 160
    .line 161
    invoke-virtual {v3}, La/dsh;->G0()La/buh;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    iget-object v2, v2, La/buh;->d:La/ewe;

    .line 166
    .line 167
    iget-object v2, v2, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 168
    .line 169
    invoke-virtual {v2, v6}, Landroid/view/View;->setVisibility(I)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v3}, La/dsh;->G0()La/buh;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    iget-object v2, v2, La/buh;->d:La/ewe;

    .line 177
    .line 178
    iget-object v2, v2, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 179
    .line 180
    invoke-static {v2}, La/x0x;->O(Landroid/view/ViewGroup;)V

    .line 181
    .line 182
    .line 183
    invoke-virtual {v3}, La/dsh;->G0()La/buh;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    iget-object v2, v2, La/buh;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 188
    .line 189
    invoke-virtual {v2, v6}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 190
    .line 191
    .line 192
    check-cast v0, La/lch;

    .line 193
    .line 194
    iget-object v0, v0, La/lch;->a:Ljava/util/List;

    .line 195
    .line 196
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 200
    .line 201
    .line 202
    iget-object v1, v1, La/yqc;->b:Ljava/lang/Object;

    .line 203
    .line 204
    check-cast v1, La/xrh;

    .line 205
    .line 206
    if-eqz v1, :cond_4

    .line 207
    .line 208
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 209
    .line 210
    .line 211
    goto :goto_1

    .line 212
    :cond_3
    instance-of v0, v0, La/nch;

    .line 213
    .line 214
    if-eqz v0, :cond_5

    .line 215
    .line 216
    sget-object v0, La/dsh;->V1:La/usd;

    .line 217
    .line 218
    invoke-virtual {v3}, La/dsh;->G0()La/buh;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    iget-object v0, v0, La/buh;->d:La/ewe;

    .line 223
    .line 224
    iget-object v0, v0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 225
    .line 226
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v3}, La/dsh;->G0()La/buh;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    iget-object v0, v0, La/buh;->d:La/ewe;

    .line 234
    .line 235
    iget-object v0, v0, La/ewe;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 236
    .line 237
    invoke-static {v0}, La/x0x;->s(Landroid/view/ViewGroup;)V

    .line 238
    .line 239
    .line 240
    invoke-virtual {v3}, La/dsh;->G0()La/buh;

    .line 241
    .line 242
    .line 243
    move-result-object v0

    .line 244
    iget-object v0, v0, La/buh;->b:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 245
    .line 246
    invoke-virtual {v0, v6}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 247
    .line 248
    .line 249
    sget-object v0, La/iun;->a:La/iun;

    .line 250
    .line 251
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 252
    .line 253
    .line 254
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 255
    .line 256
    .line 257
    iget-object v1, v1, La/yqc;->b:Ljava/lang/Object;

    .line 258
    .line 259
    check-cast v1, La/xrh;

    .line 260
    .line 261
    if-eqz v1, :cond_4

    .line 262
    .line 263
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 264
    .line 265
    .line 266
    :cond_4
    :goto_1
    sget-object v2, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    goto :goto_2

    .line 269
    :cond_5
    invoke-static {}, La/t9f;->b()V

    .line 270
    .line 271
    .line 272
    :goto_2
    return-object v2

    .line 273
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
