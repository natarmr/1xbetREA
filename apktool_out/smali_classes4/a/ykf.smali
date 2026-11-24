.class public final synthetic La/ykf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/alf;


# direct methods
.method public synthetic constructor <init>(La/alf;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ykf;->a:B

    iput-object p1, p0, La/ykf;->b:La/alf;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ykf;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/ykf;->b:La/alf;

    .line 6
    .line 7
    packed-switch v1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    move-object/from16 v1, p1

    .line 11
    .line 12
    check-cast v1, La/ims;

    .line 13
    .line 14
    sget-object v2, La/alf;->a2:La/kud;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, La/alf;->H0()La/k3t0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v2, La/dkf;

    .line 24
    .line 25
    invoke-direct {v2, v1}, La/dkf;-><init>(La/ims;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object v0

    .line 34
    :pswitch_0
    move-object/from16 v1, p1

    .line 35
    .line 36
    check-cast v1, La/nus;

    .line 37
    .line 38
    sget-object v2, La/alf;->a2:La/kud;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, La/alf;->H0()La/k3t0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v2, La/mkf;

    .line 48
    .line 49
    invoke-direct {v2, v1}, La/mkf;-><init>(La/nus;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_1
    move-object/from16 v1, p1

    .line 59
    .line 60
    check-cast v1, La/vmf;

    .line 61
    .line 62
    sget-object v2, La/alf;->a2:La/kud;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    instance-of v2, v1, La/smf;

    .line 68
    .line 69
    const/4 v3, 0x0

    .line 70
    const/4 v4, 0x1

    .line 71
    const-string v5, "snackbarManager"

    .line 72
    .line 73
    if-eqz v2, :cond_2

    .line 74
    .line 75
    check-cast v1, La/smf;

    .line 76
    .line 77
    iget-object v1, v1, La/smf;->a:La/wus;

    .line 78
    .line 79
    iget-object v2, v0, La/alf;->Q1:La/xi70;

    .line 80
    .line 81
    if-eqz v2, :cond_1

    .line 82
    .line 83
    iget-object v6, v0, La/alf;->M1:La/wdk0;

    .line 84
    .line 85
    if-eqz v6, :cond_0

    .line 86
    .line 87
    new-instance v3, La/ykf;

    .line 88
    .line 89
    invoke-direct {v3, v0, v4}, La/ykf;-><init>(La/alf;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v1, v2, v6, v3}, La/ntb;->S(Landroidx/fragment/app/Fragment;La/wus;La/xi70;La/wdk0;Lkotlin/jvm/functions/Function1;)V

    .line 93
    .line 94
    .line 95
    goto/16 :goto_0

    .line 96
    .line 97
    :cond_0
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    throw v3

    .line 101
    :cond_1
    const-string v0, "quickBetDialogNavigator"

    .line 102
    .line 103
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v3

    .line 107
    :cond_2
    instance-of v2, v1, La/tmf;

    .line 108
    .line 109
    if-eqz v2, :cond_4

    .line 110
    .line 111
    check-cast v1, La/tmf;

    .line 112
    .line 113
    iget-object v8, v1, La/tmf;->a:Ljava/lang/String;

    .line 114
    .line 115
    iget-object v1, v0, La/alf;->M1:La/wdk0;

    .line 116
    .line 117
    if-eqz v1, :cond_3

    .line 118
    .line 119
    new-instance v6, La/xdk0;

    .line 120
    .line 121
    sget-object v7, La/rek0;->b:La/rek0;

    .line 122
    .line 123
    const/4 v12, 0x0

    .line 124
    const/16 v13, 0x7c

    .line 125
    .line 126
    const/4 v9, 0x0

    .line 127
    const/4 v10, 0x0

    .line 128
    const/4 v11, 0x0

    .line 129
    invoke-direct/range {v6 .. v13}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 130
    .line 131
    .line 132
    iget-object v2, v0, La/alf;->W1:La/s0r;

    .line 133
    .line 134
    sget-object v3, La/alf;->b2:[La/iiy;

    .line 135
    .line 136
    aget-object v3, v3, v4

    .line 137
    .line 138
    invoke-virtual {v2, v3, v0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 143
    .line 144
    .line 145
    check-cast v2, La/aid;

    .line 146
    .line 147
    iget-object v12, v2, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 148
    .line 149
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 150
    .line 151
    .line 152
    move-result-object v11

    .line 153
    const/16 v16, 0x0

    .line 154
    .line 155
    const/16 v17, 0x78

    .line 156
    .line 157
    const/4 v13, 0x0

    .line 158
    const/4 v14, 0x0

    .line 159
    const/4 v15, 0x0

    .line 160
    move-object v9, v1

    .line 161
    move-object v10, v6

    .line 162
    invoke-static/range {v9 .. v17}, La/wdk0;->j(La/wdk0;La/xdk0;La/kxq;Landroid/view/View;Lkotlin/jvm/functions/Function0;ZZLjava/lang/Integer;I)La/ndk0;

    .line 163
    .line 164
    .line 165
    goto :goto_0

    .line 166
    :cond_3
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    throw v3

    .line 170
    :cond_4
    instance-of v2, v1, La/umf;

    .line 171
    .line 172
    const/4 v6, 0x2

    .line 173
    if-eqz v2, :cond_6

    .line 174
    .line 175
    iget-object v1, v0, La/alf;->R1:La/poq0;

    .line 176
    .line 177
    if-eqz v1, :cond_5

    .line 178
    .line 179
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 180
    .line 181
    .line 182
    move-result-object v1

    .line 183
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    sget-object v2, La/fk60;->b:La/uuz;

    .line 187
    .line 188
    sget-object v2, La/ki60;->q2:La/htz;

    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 191
    .line 192
    .line 193
    const-string v2, "OnboardingBottomSheetContainerFragment"

    .line 194
    .line 195
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    if-nez v3, :cond_7

    .line 200
    .line 201
    new-instance v3, La/ki60;

    .line 202
    .line 203
    invoke-direct {v3}, La/ki60;-><init>()V

    .line 204
    .line 205
    .line 206
    sget-object v5, La/ki60;->r2:[La/iiy;

    .line 207
    .line 208
    aget-object v4, v5, v4

    .line 209
    .line 210
    iget-object v7, v3, La/ki60;->n2:La/zz2;

    .line 211
    .line 212
    const/16 v8, 0x15

    .line 213
    .line 214
    invoke-virtual {v7, v3, v4, v8}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 215
    .line 216
    .line 217
    iget-object v4, v3, La/ki60;->o2:La/phf0;

    .line 218
    .line 219
    aget-object v5, v5, v6

    .line 220
    .line 221
    const-string v6, ""

    .line 222
    .line 223
    invoke-virtual {v4, v3, v5, v6}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 224
    .line 225
    .line 226
    invoke-static {v3, v1, v2}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    goto :goto_0

    .line 230
    :cond_5
    const-string v0, "tipsDialogFeature"

    .line 231
    .line 232
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    throw v3

    .line 236
    :cond_6
    instance-of v2, v1, La/rmf;

    .line 237
    .line 238
    if-eqz v2, :cond_9

    .line 239
    .line 240
    check-cast v1, La/rmf;

    .line 241
    .line 242
    iget-object v1, v1, La/rmf;->a:La/xa30;

    .line 243
    .line 244
    iget-object v2, v0, La/alf;->M1:La/wdk0;

    .line 245
    .line 246
    if-eqz v2, :cond_8

    .line 247
    .line 248
    new-instance v3, La/ykf;

    .line 249
    .line 250
    invoke-direct {v3, v0, v6}, La/ykf;-><init>(La/alf;B)V

    .line 251
    .line 252
    .line 253
    invoke-static {v0, v1, v2, v3}, La/cww;->v(Landroidx/fragment/app/Fragment;La/xa30;La/wdk0;Lkotlin/jvm/functions/Function1;)V

    .line 254
    .line 255
    .line 256
    :cond_7
    :goto_0
    invoke-virtual {v0}, La/alf;->H0()La/k3t0;

    .line 257
    .line 258
    .line 259
    move-result-object v0

    .line 260
    sget-object v1, La/xjf;->a:La/xjf;

    .line 261
    .line 262
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 263
    .line 264
    .line 265
    sget-object v3, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 266
    .line 267
    goto :goto_1

    .line 268
    :cond_8
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    throw v3

    .line 272
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 273
    .line 274
    .line 275
    :goto_1
    return-object v3

    .line 276
    nop

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
