.class public final synthetic La/uz00;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/wz00;


# direct methods
.method public synthetic constructor <init>(La/wz00;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/uz00;->a:B

    iput-object p1, p0, La/uz00;->b:La/wz00;

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
    iget-byte v1, v0, La/uz00;->a:B

    .line 4
    .line 5
    iget-object v0, v0, La/uz00;->b:La/wz00;

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
    sget-object v2, La/wz00;->b2:La/wsz;

    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, La/wz00;->H0()La/k3t0;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v2, La/oy00;

    .line 24
    .line 25
    invoke-direct {v2, v1}, La/oy00;-><init>(La/ims;)V

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
    sget-object v2, La/wz00;->b2:La/wsz;

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, La/wz00;->H0()La/k3t0;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    new-instance v2, La/xy00;

    .line 48
    .line 49
    invoke-direct {v2, v1}, La/xy00;-><init>(La/nus;)V

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
    check-cast v1, La/l310;

    .line 61
    .line 62
    sget-object v2, La/wz00;->b2:La/wsz;

    .line 63
    .line 64
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    instance-of v2, v1, La/i310;

    .line 68
    .line 69
    const/4 v3, 0x1

    .line 70
    const/4 v4, 0x0

    .line 71
    const-string v5, "snackbarManager"

    .line 72
    .line 73
    if-eqz v2, :cond_2

    .line 74
    .line 75
    check-cast v1, La/i310;

    .line 76
    .line 77
    iget-object v1, v1, La/i310;->a:La/wus;

    .line 78
    .line 79
    iget-object v2, v0, La/wz00;->R1:La/xi70;

    .line 80
    .line 81
    if-eqz v2, :cond_1

    .line 82
    .line 83
    iget-object v6, v0, La/wz00;->P1:La/wdk0;

    .line 84
    .line 85
    if-eqz v6, :cond_0

    .line 86
    .line 87
    new-instance v4, La/uz00;

    .line 88
    .line 89
    invoke-direct {v4, v0, v3}, La/uz00;-><init>(La/wz00;B)V

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v1, v2, v6, v4}, La/ntb;->S(Landroidx/fragment/app/Fragment;La/wus;La/xi70;La/wdk0;Lkotlin/jvm/functions/Function1;)V

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
    throw v4

    .line 101
    :cond_1
    const-string v0, "quickBetDialogNavigator"

    .line 102
    .line 103
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    throw v4

    .line 107
    :cond_2
    instance-of v2, v1, La/j310;

    .line 108
    .line 109
    if-eqz v2, :cond_4

    .line 110
    .line 111
    check-cast v1, La/j310;

    .line 112
    .line 113
    iget-object v8, v1, La/j310;->a:Ljava/lang/String;

    .line 114
    .line 115
    iget-object v1, v0, La/wz00;->P1:La/wdk0;

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
    iget-object v2, v0, La/wz00;->Y1:La/s0r;

    .line 133
    .line 134
    sget-object v3, La/wz00;->c2:[La/iiy;

    .line 135
    .line 136
    const/4 v4, 0x0

    .line 137
    aget-object v3, v3, v4

    .line 138
    .line 139
    invoke-virtual {v2, v3, v0}, La/s0r;->n(La/iiy;Ljava/lang/Object;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    check-cast v2, La/aid;

    .line 147
    .line 148
    iget-object v12, v2, La/aid;->a:Landroidx/compose/ui/platform/ComposeView;

    .line 149
    .line 150
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 151
    .line 152
    .line 153
    move-result-object v11

    .line 154
    const/16 v16, 0x0

    .line 155
    .line 156
    const/16 v17, 0x78

    .line 157
    .line 158
    const/4 v13, 0x0

    .line 159
    const/4 v14, 0x0

    .line 160
    const/4 v15, 0x0

    .line 161
    move-object v9, v1

    .line 162
    move-object v10, v6

    .line 163
    invoke-static/range {v9 .. v17}, La/wdk0;->j(La/wdk0;La/xdk0;La/kxq;Landroid/view/View;Lkotlin/jvm/functions/Function0;ZZLjava/lang/Integer;I)La/ndk0;

    .line 164
    .line 165
    .line 166
    goto :goto_0

    .line 167
    :cond_3
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 168
    .line 169
    .line 170
    throw v4

    .line 171
    :cond_4
    instance-of v2, v1, La/k310;

    .line 172
    .line 173
    const/4 v6, 0x2

    .line 174
    if-eqz v2, :cond_6

    .line 175
    .line 176
    iget-object v1, v0, La/wz00;->Q1:La/poq0;

    .line 177
    .line 178
    if-eqz v1, :cond_5

    .line 179
    .line 180
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    sget-object v2, La/fk60;->b:La/uuz;

    .line 188
    .line 189
    sget-object v2, La/ki60;->q2:La/htz;

    .line 190
    .line 191
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    const-string v2, "OnboardingBottomSheetContainerFragment"

    .line 195
    .line 196
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 197
    .line 198
    .line 199
    move-result-object v4

    .line 200
    if-nez v4, :cond_7

    .line 201
    .line 202
    new-instance v4, La/ki60;

    .line 203
    .line 204
    invoke-direct {v4}, La/ki60;-><init>()V

    .line 205
    .line 206
    .line 207
    sget-object v5, La/ki60;->r2:[La/iiy;

    .line 208
    .line 209
    aget-object v3, v5, v3

    .line 210
    .line 211
    iget-object v7, v4, La/ki60;->n2:La/zz2;

    .line 212
    .line 213
    const/16 v8, 0x15

    .line 214
    .line 215
    invoke-virtual {v7, v4, v3, v8}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 216
    .line 217
    .line 218
    iget-object v3, v4, La/ki60;->o2:La/phf0;

    .line 219
    .line 220
    aget-object v5, v5, v6

    .line 221
    .line 222
    const-string v6, ""

    .line 223
    .line 224
    invoke-virtual {v3, v4, v5, v6}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 225
    .line 226
    .line 227
    invoke-static {v4, v1, v2}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    goto :goto_0

    .line 231
    :cond_5
    const-string v0, "tipsDialogFeature"

    .line 232
    .line 233
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 234
    .line 235
    .line 236
    throw v4

    .line 237
    :cond_6
    instance-of v2, v1, La/h310;

    .line 238
    .line 239
    if-eqz v2, :cond_9

    .line 240
    .line 241
    check-cast v1, La/h310;

    .line 242
    .line 243
    iget-object v1, v1, La/h310;->a:La/xa30;

    .line 244
    .line 245
    iget-object v2, v0, La/wz00;->P1:La/wdk0;

    .line 246
    .line 247
    if-eqz v2, :cond_8

    .line 248
    .line 249
    new-instance v3, La/uz00;

    .line 250
    .line 251
    invoke-direct {v3, v0, v6}, La/uz00;-><init>(La/wz00;B)V

    .line 252
    .line 253
    .line 254
    invoke-static {v0, v1, v2, v3}, La/cww;->v(Landroidx/fragment/app/Fragment;La/xa30;La/wdk0;Lkotlin/jvm/functions/Function1;)V

    .line 255
    .line 256
    .line 257
    :cond_7
    :goto_0
    invoke-virtual {v0}, La/wz00;->H0()La/k3t0;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    sget-object v1, La/gy00;->a:La/gy00;

    .line 262
    .line 263
    invoke-virtual {v0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 264
    .line 265
    .line 266
    sget-object v4, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 267
    .line 268
    goto :goto_1

    .line 269
    :cond_8
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 270
    .line 271
    .line 272
    throw v4

    .line 273
    :cond_9
    invoke-static {}, La/t9f;->b()V

    .line 274
    .line 275
    .line 276
    :goto_1
    return-object v4

    .line 277
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
