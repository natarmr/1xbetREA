.class public final La/e7g;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/f7g;


# direct methods
.method public synthetic constructor <init>(La/f7g;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/e7g;->i:B

    iput-object p1, p0, La/e7g;->k:La/f7g;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/e7g;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/e7g;->k:La/f7g;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/e7g;

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/e7g;-><init>(La/f7g;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/e7g;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/e7g;

    .line 18
    .line 19
    const/4 v1, 0x0

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/e7g;-><init>(La/f7g;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/e7g;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/e7g;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/och;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/e7g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/e7g;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/e7g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/h7g;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/e7g;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/e7g;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/e7g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/e7g;->i:B

    .line 4
    .line 5
    iget-object v2, v0, La/e7g;->k:La/f7g;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    iget-object v1, v2, La/f7g;->l2:La/a8z;

    .line 12
    .line 13
    iget-object v0, v0, La/e7g;->j:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v0, La/och;

    .line 16
    .line 17
    sget-object v4, La/wne;->a:La/wne;

    .line 18
    .line 19
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    if-eqz v0, :cond_3

    .line 23
    .line 24
    instance-of v4, v0, La/lch;

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    invoke-virtual {v2}, La/f7g;->V0()La/b7g;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    iget-object v2, v2, La/b7g;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 33
    .line 34
    const/16 v3, 0x8

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    check-cast v1, La/x6g;

    .line 44
    .line 45
    check-cast v0, La/lch;

    .line 46
    .line 47
    iget-object v0, v0, La/lch;->a:Ljava/util/List;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, La/zz3;->A(Ljava/util/List;)V

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    instance-of v4, v0, La/mch;

    .line 54
    .line 55
    const/4 v5, 0x0

    .line 56
    if-eqz v4, :cond_1

    .line 57
    .line 58
    sget-object v3, La/f7g;->o2:La/nwd;

    .line 59
    .line 60
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, La/x6g;

    .line 65
    .line 66
    sget-object v3, La/iun;->a:La/iun;

    .line 67
    .line 68
    invoke-virtual {v1, v3}, La/zz3;->A(Ljava/util/List;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2}, La/f7g;->V0()La/b7g;

    .line 72
    .line 73
    .line 74
    move-result-object v1

    .line 75
    iget-object v1, v1, La/b7g;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 76
    .line 77
    check-cast v0, La/mch;

    .line 78
    .line 79
    iget-object v0, v0, La/mch;->a:La/jkm;

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->a(La/jkm;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, La/f7g;->V0()La/b7g;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iget-object v0, v0, La/b7g;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 89
    .line 90
    invoke-virtual {v0, v5}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_1
    instance-of v0, v0, La/nch;

    .line 95
    .line 96
    if-eqz v0, :cond_3

    .line 97
    .line 98
    const-wide/16 v6, -0x1

    .line 99
    .line 100
    invoke-static {v6, v7}, La/ozb;->K(J)La/pb10;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    sget-object v0, La/f7g;->o2:La/nwd;

    .line 105
    .line 106
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v0

    .line 110
    check-cast v0, La/x6g;

    .line 111
    .line 112
    sget-object v1, La/iun;->a:La/iun;

    .line 113
    .line 114
    invoke-virtual {v0, v1}, La/zz3;->A(Ljava/util/List;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v2}, La/f7g;->V0()La/b7g;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iget-object v0, v0, La/b7g;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 122
    .line 123
    iget-object v8, v2, La/f7g;->i2:La/g2v;

    .line 124
    .line 125
    if-eqz v8, :cond_2

    .line 126
    .line 127
    const/4 v14, 0x0

    .line 128
    const/16 v15, 0x1fe

    .line 129
    .line 130
    const/4 v10, 0x0

    .line 131
    const/4 v11, 0x0

    .line 132
    const/4 v12, 0x0

    .line 133
    const/4 v13, 0x0

    .line 134
    invoke-static/range {v8 .. v15}, La/g2v;->d(La/g2v;La/pb10;La/okm;La/ikm;IILkotlin/jvm/functions/Function0;I)La/jkm;

    .line 135
    .line 136
    .line 137
    move-result-object v1

    .line 138
    invoke-virtual {v0, v1}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->a(La/jkm;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2}, La/f7g;->V0()La/b7g;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iget-object v0, v0, La/b7g;->c:Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;

    .line 146
    .line 147
    invoke-virtual {v0, v5}, Lorg/xplatform/uikit/components/lottie_empty/DSLottieEmptyContainer;->setVisibility(I)V

    .line 148
    .line 149
    .line 150
    :goto_0
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :cond_2
    const-string v0, "lottieEmptyConfigurator"

    .line 154
    .line 155
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    throw v3

    .line 159
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 160
    .line 161
    .line 162
    :goto_1
    return-object v3

    .line 163
    :pswitch_0
    iget-object v0, v0, La/e7g;->j:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, La/h7g;

    .line 166
    .line 167
    sget-object v1, La/wne;->a:La/wne;

    .line 168
    .line 169
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    sget-object v1, La/h7g;->a:La/h7g;

    .line 173
    .line 174
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v1

    .line 178
    if-eqz v1, :cond_4

    .line 179
    .line 180
    invoke-virtual {v2}, La/yo8;->x0()V

    .line 181
    .line 182
    .line 183
    goto :goto_2

    .line 184
    :cond_4
    sget-object v1, La/h7g;->b:La/h7g;

    .line 185
    .line 186
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-eqz v0, :cond_6

    .line 191
    .line 192
    iget-object v0, v2, La/f7g;->h2:La/ii;

    .line 193
    .line 194
    if-eqz v0, :cond_5

    .line 195
    .line 196
    new-instance v4, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 197
    .line 198
    const v1, 0x7f1303fb

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 202
    .line 203
    .line 204
    move-result-object v5

    .line 205
    const v1, 0x7f1305c9

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v6

    .line 212
    const v1, 0x7f130e5c

    .line 213
    .line 214
    .line 215
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object v7

    .line 219
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 220
    .line 221
    .line 222
    sget-object v13, La/n12;->b:La/n12;

    .line 223
    .line 224
    const/4 v14, 0x0

    .line 225
    const/16 v15, 0x5f8

    .line 226
    .line 227
    const/4 v8, 0x0

    .line 228
    const/4 v9, 0x0

    .line 229
    const/4 v10, 0x0

    .line 230
    const/4 v11, 0x0

    .line 231
    const/4 v12, 0x0

    .line 232
    invoke-direct/range {v4 .. v15}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 236
    .line 237
    .line 238
    move-result-object v1

    .line 239
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v4, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 243
    .line 244
    .line 245
    goto :goto_2

    .line 246
    :cond_5
    const-string v0, "actionDialogManager"

    .line 247
    .line 248
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    throw v3

    .line 252
    :cond_6
    :goto_2
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 253
    .line 254
    return-object v0

    .line 255
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
