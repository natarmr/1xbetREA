.class public final La/ywe;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/axe;


# direct methods
.method public synthetic constructor <init>(La/axe;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ywe;->i:B

    iput-object p1, p0, La/ywe;->k:La/axe;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ywe;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ywe;->k:La/axe;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ywe;

    .line 9
    .line 10
    const/4 v1, 0x6

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ywe;-><init>(La/axe;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/ywe;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/ywe;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/ywe;-><init>(La/axe;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/ywe;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/ywe;

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/ywe;-><init>(La/axe;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/ywe;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/ywe;

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/ywe;-><init>(La/axe;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/ywe;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/ywe;

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/ywe;-><init>(La/axe;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/ywe;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_4
    new-instance v0, La/ywe;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-direct {v0, p0, p2, v1}, La/ywe;-><init>(La/axe;La/yje;B)V

    .line 57
    .line 58
    .line 59
    iput-object p1, v0, La/ywe;->j:Ljava/lang/Object;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_5
    new-instance v0, La/ywe;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-direct {v0, p0, p2, v1}, La/ywe;-><init>(La/axe;La/yje;B)V

    .line 66
    .line 67
    .line 68
    iput-object p1, v0, La/ywe;->j:Ljava/lang/Object;

    .line 69
    .line 70
    return-object v0

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/ywe;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/c4f;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ywe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ywe;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ywe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/r720;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ywe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ywe;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ywe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/et7;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/ywe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/ywe;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/ywe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/ije;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/ywe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/ywe;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/ywe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/hn5;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/ywe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/ywe;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/ywe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/pwq0;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/ywe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/ywe;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/ywe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, La/n9h0;

    .line 109
    .line 110
    check-cast p2, La/yje;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, La/ywe;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/ywe;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/ywe;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    return-object p0

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 29

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ywe;->i:B

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    const/4 v3, 0x2

    .line 8
    const/16 v4, 0x8

    .line 9
    .line 10
    iget-object v5, v0, La/ywe;->k:La/axe;

    .line 11
    .line 12
    const/4 v6, 0x0

    .line 13
    const/4 v7, 0x1

    .line 14
    const/4 v8, 0x0

    .line 15
    packed-switch v1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v1, v0, La/ywe;->j:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v1, La/c4f;

    .line 21
    .line 22
    sget-object v4, La/wne;->a:La/wne;

    .line 23
    .line 24
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    if-nez v1, :cond_0

    .line 28
    .line 29
    goto/16 :goto_1

    .line 30
    .line 31
    :cond_0
    instance-of v4, v1, La/n3f;

    .line 32
    .line 33
    const v5, 0x7f13032f

    .line 34
    .line 35
    .line 36
    const v9, 0x7f130e5d

    .line 37
    .line 38
    .line 39
    iget-object v11, v0, La/ywe;->k:La/axe;

    .line 40
    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    check-cast v1, La/n3f;

    .line 44
    .line 45
    iget-wide v12, v1, La/n3f;->a:J

    .line 46
    .line 47
    iget v0, v1, La/n3f;->b:I

    .line 48
    .line 49
    iget v1, v1, La/n3f;->c:I

    .line 50
    .line 51
    sget-object v2, La/axe;->e2:La/kud;

    .line 52
    .line 53
    invoke-virtual {v11}, La/axe;->J0()La/ii;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    new-instance v14, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 58
    .line 59
    invoke-virtual {v11, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v15

    .line 63
    invoke-virtual {v11, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v16

    .line 67
    invoke-virtual {v11, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v17

    .line 71
    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v11, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v18

    .line 78
    sget-object v23, La/n12;->a:La/n12;

    .line 79
    .line 80
    const/16 v24, 0x0

    .line 81
    .line 82
    const/16 v25, 0x5d0

    .line 83
    .line 84
    const/16 v19, 0x0

    .line 85
    .line 86
    const-string v20, "COUPON_DELETE_EVENT_REQUEST_KEY"

    .line 87
    .line 88
    const/16 v21, 0x0

    .line 89
    .line 90
    const/16 v22, 0x0

    .line 91
    .line 92
    invoke-direct/range {v14 .. v25}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v2, v14, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const-string v1, "COUPON_DELETE_EVENT_REQUEST_KEY"

    .line 110
    .line 111
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->g(Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    new-instance v0, La/wwe;

    .line 115
    .line 116
    invoke-direct {v0, v11, v12, v13, v7}, La/wwe;-><init>(La/axe;JB)V

    .line 117
    .line 118
    .line 119
    invoke-static {v11, v1, v0}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 120
    .line 121
    .line 122
    new-instance v0, La/wwe;

    .line 123
    .line 124
    invoke-direct {v0, v11, v12, v13, v3}, La/wwe;-><init>(La/axe;JB)V

    .line 125
    .line 126
    .line 127
    invoke-static {v11, v1, v0}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 128
    .line 129
    .line 130
    goto/16 :goto_1

    .line 131
    .line 132
    :cond_1
    instance-of v0, v1, La/o3f;

    .line 133
    .line 134
    if-eqz v0, :cond_2

    .line 135
    .line 136
    check-cast v1, La/o3f;

    .line 137
    .line 138
    iget-wide v12, v1, La/o3f;->a:J

    .line 139
    .line 140
    iget v14, v1, La/o3f;->b:I

    .line 141
    .line 142
    iget-boolean v15, v1, La/o3f;->c:Z

    .line 143
    .line 144
    iget v0, v1, La/o3f;->d:I

    .line 145
    .line 146
    iget v1, v1, La/o3f;->e:I

    .line 147
    .line 148
    sget-object v2, La/axe;->e2:La/kud;

    .line 149
    .line 150
    invoke-virtual {v11}, La/axe;->J0()La/ii;

    .line 151
    .line 152
    .line 153
    move-result-object v2

    .line 154
    new-instance v16, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 155
    .line 156
    invoke-virtual {v11, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v17

    .line 160
    invoke-virtual {v11, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v18

    .line 164
    invoke-virtual {v11, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v19

    .line 168
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v11, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object v20

    .line 175
    sget-object v25, La/n12;->a:La/n12;

    .line 176
    .line 177
    const/16 v26, 0x0

    .line 178
    .line 179
    const/16 v27, 0x5d0

    .line 180
    .line 181
    const/16 v21, 0x0

    .line 182
    .line 183
    const-string v22, "COUPON_DELETE_EVENT_FROM_BLOCK_REQUEST_KEY"

    .line 184
    .line 185
    const/16 v23, 0x0

    .line 186
    .line 187
    const/16 v24, 0x0

    .line 188
    .line 189
    invoke-direct/range {v16 .. v27}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 190
    .line 191
    .line 192
    move-object/from16 v0, v16

    .line 193
    .line 194
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 195
    .line 196
    .line 197
    move-result-object v1

    .line 198
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v2, v0, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 202
    .line 203
    .line 204
    new-instance v10, La/vwe;

    .line 205
    .line 206
    const/16 v16, 0x0

    .line 207
    .line 208
    invoke-direct/range {v10 .. v16}, La/vwe;-><init>(La/axe;JIZB)V

    .line 209
    .line 210
    .line 211
    const-string v0, "COUPON_DELETE_EVENT_FROM_BLOCK_REQUEST_KEY"

    .line 212
    .line 213
    invoke-static {v11, v0, v10}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 214
    .line 215
    .line 216
    new-instance v1, La/wwe;

    .line 217
    .line 218
    invoke-direct {v1, v11, v12, v13, v8}, La/wwe;-><init>(La/axe;JB)V

    .line 219
    .line 220
    .line 221
    invoke-static {v11, v0, v1}, La/ccq0;->T(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 222
    .line 223
    .line 224
    goto/16 :goto_1

    .line 225
    .line 226
    :cond_2
    instance-of v0, v1, La/u3f;

    .line 227
    .line 228
    const v4, 0x7f130e07

    .line 229
    .line 230
    .line 231
    const v10, 0x7f131843

    .line 232
    .line 233
    .line 234
    const v12, 0x7f130162

    .line 235
    .line 236
    .line 237
    if-eqz v0, :cond_3

    .line 238
    .line 239
    check-cast v1, La/u3f;

    .line 240
    .line 241
    iget-wide v2, v1, La/u3f;->a:J

    .line 242
    .line 243
    iget v14, v1, La/u3f;->b:I

    .line 244
    .line 245
    iget-boolean v15, v1, La/u3f;->c:Z

    .line 246
    .line 247
    sget-object v0, La/axe;->e2:La/kud;

    .line 248
    .line 249
    invoke-virtual {v11}, La/axe;->J0()La/ii;

    .line 250
    .line 251
    .line 252
    move-result-object v0

    .line 253
    new-instance v16, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 254
    .line 255
    invoke-virtual {v11, v12}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object v17

    .line 259
    const v1, 0x7f130530

    .line 260
    .line 261
    .line 262
    invoke-virtual {v11, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 263
    .line 264
    .line 265
    move-result-object v18

    .line 266
    invoke-virtual {v11, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v19

    .line 270
    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v11, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 274
    .line 275
    .line 276
    move-result-object v20

    .line 277
    sget-object v25, La/n12;->a:La/n12;

    .line 278
    .line 279
    const/16 v26, 0x0

    .line 280
    .line 281
    const/16 v27, 0x5d0

    .line 282
    .line 283
    const/16 v21, 0x0

    .line 284
    .line 285
    const-string v22, "COUPON_DELETE_MULTI_BET_EVENT_FROM_BLOCK_REQUEST_KEY"

    .line 286
    .line 287
    const/16 v23, 0x0

    .line 288
    .line 289
    const/16 v24, 0x0

    .line 290
    .line 291
    invoke-direct/range {v16 .. v27}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 292
    .line 293
    .line 294
    move-object/from16 v1, v16

    .line 295
    .line 296
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 297
    .line 298
    .line 299
    move-result-object v4

    .line 300
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    invoke-virtual {v0, v1, v4}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 304
    .line 305
    .line 306
    new-instance v10, La/vwe;

    .line 307
    .line 308
    const/16 v16, 0x1

    .line 309
    .line 310
    move-wide v12, v2

    .line 311
    invoke-direct/range {v10 .. v16}, La/vwe;-><init>(La/axe;JIZB)V

    .line 312
    .line 313
    .line 314
    const-string v0, "COUPON_DELETE_MULTI_BET_EVENT_FROM_BLOCK_REQUEST_KEY"

    .line 315
    .line 316
    invoke-static {v11, v0, v10}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 317
    .line 318
    .line 319
    goto/16 :goto_1

    .line 320
    .line 321
    :cond_3
    instance-of v0, v1, La/k3f;

    .line 322
    .line 323
    if-eqz v0, :cond_4

    .line 324
    .line 325
    new-instance v0, La/yw9;

    .line 326
    .line 327
    const/16 v2, 0x1a

    .line 328
    .line 329
    invoke-direct {v0, v11, v1, v2}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 330
    .line 331
    .line 332
    sget-object v1, La/axe;->e2:La/kud;

    .line 333
    .line 334
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    iget-object v1, v1, Landroidx/fragment/app/e;->c:La/pmi;

    .line 339
    .line 340
    invoke-virtual {v1}, La/pmi;->p()Ljava/util/List;

    .line 341
    .line 342
    .line 343
    move-result-object v1

    .line 344
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 345
    .line 346
    .line 347
    move-result v1

    .line 348
    if-gt v1, v7, :cond_1c

    .line 349
    .line 350
    invoke-virtual {v0}, La/yw9;->invoke()Ljava/lang/Object;

    .line 351
    .line 352
    .line 353
    goto/16 :goto_1

    .line 354
    .line 355
    :cond_4
    instance-of v0, v1, La/l3f;

    .line 356
    .line 357
    if-eqz v0, :cond_5

    .line 358
    .line 359
    check-cast v1, La/l3f;

    .line 360
    .line 361
    iget-object v0, v1, La/l3f;->a:Ljava/lang/String;

    .line 362
    .line 363
    sget-object v1, La/axe;->e2:La/kud;

    .line 364
    .line 365
    invoke-virtual {v11}, La/axe;->J0()La/ii;

    .line 366
    .line 367
    .line 368
    move-result-object v1

    .line 369
    new-instance v12, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 370
    .line 371
    const v2, 0x7f1311af

    .line 372
    .line 373
    .line 374
    invoke-virtual {v11, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 375
    .line 376
    .line 377
    move-result-object v13

    .line 378
    const v2, 0x7f13053e

    .line 379
    .line 380
    .line 381
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 382
    .line 383
    .line 384
    move-result-object v3

    .line 385
    invoke-virtual {v11, v2, v3}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 386
    .line 387
    .line 388
    move-result-object v14

    .line 389
    const v2, 0x7f1304fc

    .line 390
    .line 391
    .line 392
    invoke-virtual {v11, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v15

    .line 396
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 397
    .line 398
    .line 399
    invoke-virtual {v11, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 400
    .line 401
    .line 402
    move-result-object v16

    .line 403
    sget-object v21, La/n12;->a:La/n12;

    .line 404
    .line 405
    const/16 v22, 0x0

    .line 406
    .line 407
    const/16 v23, 0x5d0

    .line 408
    .line 409
    const/16 v17, 0x0

    .line 410
    .line 411
    const-string v18, "COUPON_SAVE_REQUEST_KEY"

    .line 412
    .line 413
    const/16 v19, 0x0

    .line 414
    .line 415
    const/16 v20, 0x0

    .line 416
    .line 417
    invoke-direct/range {v12 .. v23}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 418
    .line 419
    .line 420
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 425
    .line 426
    .line 427
    invoke-virtual {v1, v12, v2}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 428
    .line 429
    .line 430
    new-instance v1, La/yw9;

    .line 431
    .line 432
    const/16 v2, 0x18

    .line 433
    .line 434
    invoke-direct {v1, v11, v0, v2}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 435
    .line 436
    .line 437
    const-string v0, "COUPON_SAVE_REQUEST_KEY"

    .line 438
    .line 439
    invoke-static {v11, v0, v1}, La/ccq0;->V(Landroidx/fragment/app/Fragment;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 440
    .line 441
    .line 442
    goto/16 :goto_1

    .line 443
    .line 444
    :cond_5
    instance-of v0, v1, La/s3f;

    .line 445
    .line 446
    if-eqz v0, :cond_6

    .line 447
    .line 448
    sget-object v0, La/axe;->e2:La/kud;

    .line 449
    .line 450
    invoke-virtual {v11}, La/axe;->P0()V

    .line 451
    .line 452
    .line 453
    goto/16 :goto_1

    .line 454
    .line 455
    :cond_6
    instance-of v0, v1, La/y3f;

    .line 456
    .line 457
    const v13, 0x7f131159

    .line 458
    .line 459
    .line 460
    const v14, 0x7f13051a

    .line 461
    .line 462
    .line 463
    if-eqz v0, :cond_7

    .line 464
    .line 465
    sget-object v0, La/axe;->e2:La/kud;

    .line 466
    .line 467
    invoke-virtual {v11}, La/axe;->J0()La/ii;

    .line 468
    .line 469
    .line 470
    move-result-object v0

    .line 471
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 472
    .line 473
    invoke-virtual {v11, v14}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 474
    .line 475
    .line 476
    move-result-object v16

    .line 477
    invoke-virtual {v11, v13}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 478
    .line 479
    .line 480
    move-result-object v17

    .line 481
    invoke-virtual {v11, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 482
    .line 483
    .line 484
    move-result-object v18

    .line 485
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 486
    .line 487
    .line 488
    invoke-virtual {v11, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 489
    .line 490
    .line 491
    move-result-object v19

    .line 492
    sget-object v24, La/n12;->a:La/n12;

    .line 493
    .line 494
    const/16 v25, 0x0

    .line 495
    .line 496
    const/16 v26, 0x5d0

    .line 497
    .line 498
    const/16 v20, 0x0

    .line 499
    .line 500
    const-string v21, "COUPON_REPLACE_AFTER_LOAD_REQUEST_KEY"

    .line 501
    .line 502
    const/16 v22, 0x0

    .line 503
    .line 504
    const/16 v23, 0x0

    .line 505
    .line 506
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 510
    .line 511
    .line 512
    move-result-object v1

    .line 513
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 514
    .line 515
    .line 516
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 517
    .line 518
    .line 519
    goto/16 :goto_1

    .line 520
    .line 521
    :cond_7
    instance-of v0, v1, La/i3f;

    .line 522
    .line 523
    if-eqz v0, :cond_8

    .line 524
    .line 525
    check-cast v1, La/i3f;

    .line 526
    .line 527
    iget-object v0, v1, La/i3f;->a:Ljava/util/ArrayList;

    .line 528
    .line 529
    sget-object v1, La/axe;->e2:La/kud;

    .line 530
    .line 531
    sget-object v1, La/n4f;->k2:La/kwd;

    .line 532
    .line 533
    const v2, 0x7f130529

    .line 534
    .line 535
    .line 536
    invoke-virtual {v11, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 537
    .line 538
    .line 539
    move-result-object v2

    .line 540
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 541
    .line 542
    .line 543
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 544
    .line 545
    .line 546
    move-result-object v3

    .line 547
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    const-string v1, "CHANGE_SYSTEM_REQUEST_KEY"

    .line 554
    .line 555
    invoke-static {v2, v0, v1, v3}, La/kwd;->g(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Landroidx/fragment/app/e;)V

    .line 556
    .line 557
    .line 558
    goto/16 :goto_1

    .line 559
    .line 560
    :cond_8
    instance-of v0, v1, La/b4f;

    .line 561
    .line 562
    if-eqz v0, :cond_a

    .line 563
    .line 564
    sget-object v0, La/axe;->e2:La/kud;

    .line 565
    .line 566
    iget-object v0, v11, La/axe;->S1:La/poq0;

    .line 567
    .line 568
    if-eqz v0, :cond_9

    .line 569
    .line 570
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 571
    .line 572
    .line 573
    move-result-object v0

    .line 574
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 575
    .line 576
    .line 577
    sget-object v1, La/fk60;->b:La/uuz;

    .line 578
    .line 579
    sget-object v1, La/noq0;->m2:La/y2m0;

    .line 580
    .line 581
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 582
    .line 583
    .line 584
    const-string v1, "TipsDialogTag"

    .line 585
    .line 586
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 587
    .line 588
    .line 589
    move-result-object v3

    .line 590
    if-nez v3, :cond_1c

    .line 591
    .line 592
    new-instance v3, La/noq0;

    .line 593
    .line 594
    invoke-direct {v3}, La/noq0;-><init>()V

    .line 595
    .line 596
    .line 597
    sget-object v4, La/noq0;->n2:[La/iiy;

    .line 598
    .line 599
    const/4 v5, 0x3

    .line 600
    aget-object v5, v4, v5

    .line 601
    .line 602
    iget-object v6, v3, La/noq0;->h2:La/zz2;

    .line 603
    .line 604
    const/4 v7, 0x5

    .line 605
    invoke-virtual {v6, v3, v5, v7}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 606
    .line 607
    .line 608
    iget-object v5, v3, La/noq0;->i2:La/phf0;

    .line 609
    .line 610
    const/4 v6, 0x4

    .line 611
    aget-object v4, v4, v6

    .line 612
    .line 613
    invoke-virtual {v5, v3, v4, v2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 614
    .line 615
    .line 616
    invoke-static {v3, v0, v1}, La/sj3;->E0(La/sik;Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 617
    .line 618
    .line 619
    goto/16 :goto_1

    .line 620
    .line 621
    :cond_9
    const-string v0, "tipsDialogFeature"

    .line 622
    .line 623
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 624
    .line 625
    .line 626
    throw v6

    .line 627
    :cond_a
    instance-of v0, v1, La/h3f;

    .line 628
    .line 629
    if-eqz v0, :cond_b

    .line 630
    .line 631
    check-cast v1, La/h3f;

    .line 632
    .line 633
    iget-object v0, v1, La/h3f;->a:Ljava/lang/String;

    .line 634
    .line 635
    sget-object v1, La/axe;->e2:La/kud;

    .line 636
    .line 637
    new-instance v1, Landroid/content/Intent;

    .line 638
    .line 639
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 640
    .line 641
    .line 642
    const-string v2, "android.intent.action.SEND"

    .line 643
    .line 644
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 645
    .line 646
    .line 647
    const-string v2, "android.intent.extra.TEXT"

    .line 648
    .line 649
    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 650
    .line 651
    .line 652
    const-string v0, "text/plain"

    .line 653
    .line 654
    invoke-virtual {v1, v0}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 655
    .line 656
    .line 657
    invoke-static {v1, v6}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 658
    .line 659
    .line 660
    move-result-object v0

    .line 661
    invoke-virtual {v11, v0}, Landroidx/fragment/app/Fragment;->w0(Landroid/content/Intent;)V

    .line 662
    .line 663
    .line 664
    goto/16 :goto_1

    .line 665
    .line 666
    :cond_b
    instance-of v0, v1, La/m3f;

    .line 667
    .line 668
    if-eqz v0, :cond_c

    .line 669
    .line 670
    sget-object v0, La/axe;->e2:La/kud;

    .line 671
    .line 672
    invoke-virtual {v11}, La/axe;->O0()V

    .line 673
    .line 674
    .line 675
    goto/16 :goto_1

    .line 676
    .line 677
    :cond_c
    instance-of v0, v1, La/a4f;

    .line 678
    .line 679
    if-eqz v0, :cond_e

    .line 680
    .line 681
    iget-object v10, v11, La/axe;->U1:La/wdk0;

    .line 682
    .line 683
    if-eqz v10, :cond_d

    .line 684
    .line 685
    new-instance v12, La/xdk0;

    .line 686
    .line 687
    check-cast v1, La/a4f;

    .line 688
    .line 689
    iget-object v13, v1, La/a4f;->c:La/sek0;

    .line 690
    .line 691
    iget-object v14, v1, La/a4f;->a:Ljava/lang/String;

    .line 692
    .line 693
    iget-object v15, v1, La/a4f;->b:Ljava/lang/String;

    .line 694
    .line 695
    const/16 v18, 0x0

    .line 696
    .line 697
    const/16 v19, 0x78

    .line 698
    .line 699
    const/16 v16, 0x0

    .line 700
    .line 701
    const/16 v17, 0x0

    .line 702
    .line 703
    invoke-direct/range {v12 .. v19}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 704
    .line 705
    .line 706
    invoke-virtual {v11}, La/axe;->L0()La/pzq;

    .line 707
    .line 708
    .line 709
    move-result-object v0

    .line 710
    iget-object v14, v0, La/pzq;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 711
    .line 712
    const/16 v17, 0x3e4

    .line 713
    .line 714
    const/4 v13, 0x0

    .line 715
    const/4 v15, 0x1

    .line 716
    move-object/from16 v28, v12

    .line 717
    .line 718
    move-object v12, v11

    .line 719
    move-object/from16 v11, v28

    .line 720
    .line 721
    invoke-static/range {v10 .. v17}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 722
    .line 723
    .line 724
    goto/16 :goto_1

    .line 725
    .line 726
    :cond_d
    const-string v0, "snackbarManager"

    .line 727
    .line 728
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 729
    .line 730
    .line 731
    throw v6

    .line 732
    :cond_e
    instance-of v0, v1, La/r3f;

    .line 733
    .line 734
    if-eqz v0, :cond_f

    .line 735
    .line 736
    check-cast v1, La/r3f;

    .line 737
    .line 738
    iget v0, v1, La/r3f;->a:I

    .line 739
    .line 740
    iget-object v1, v1, La/r3f;->b:Ljava/lang/String;

    .line 741
    .line 742
    sget-object v2, La/axe;->e2:La/kud;

    .line 743
    .line 744
    invoke-virtual {v11}, La/axe;->J0()La/ii;

    .line 745
    .line 746
    .line 747
    move-result-object v2

    .line 748
    new-instance v12, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 749
    .line 750
    const v3, 0x7f130840

    .line 751
    .line 752
    .line 753
    invoke-virtual {v11, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 754
    .line 755
    .line 756
    move-result-object v13

    .line 757
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 758
    .line 759
    .line 760
    move-result-object v0

    .line 761
    filled-new-array {v0, v1}, [Ljava/lang/Object;

    .line 762
    .line 763
    .line 764
    move-result-object v0

    .line 765
    const v1, 0x7f13083e

    .line 766
    .line 767
    .line 768
    invoke-virtual {v11, v1, v0}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 769
    .line 770
    .line 771
    move-result-object v14

    .line 772
    invoke-virtual {v11, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 773
    .line 774
    .line 775
    move-result-object v15

    .line 776
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 777
    .line 778
    .line 779
    sget-object v21, La/n12;->a:La/n12;

    .line 780
    .line 781
    const/16 v22, 0x0

    .line 782
    .line 783
    const/16 v23, 0x5f8

    .line 784
    .line 785
    const/16 v16, 0x0

    .line 786
    .line 787
    const/16 v17, 0x0

    .line 788
    .line 789
    const/16 v18, 0x0

    .line 790
    .line 791
    const/16 v19, 0x0

    .line 792
    .line 793
    const/16 v20, 0x0

    .line 794
    .line 795
    invoke-direct/range {v12 .. v23}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 796
    .line 797
    .line 798
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 799
    .line 800
    .line 801
    move-result-object v0

    .line 802
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 803
    .line 804
    .line 805
    invoke-virtual {v2, v12, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 806
    .line 807
    .line 808
    goto/16 :goto_1

    .line 809
    .line 810
    :cond_f
    instance-of v0, v1, La/t3f;

    .line 811
    .line 812
    if-eqz v0, :cond_10

    .line 813
    .line 814
    check-cast v1, La/t3f;

    .line 815
    .line 816
    iget v0, v1, La/t3f;->a:I

    .line 817
    .line 818
    sget-object v1, La/axe;->e2:La/kud;

    .line 819
    .line 820
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 821
    .line 822
    .line 823
    move-result-object v1

    .line 824
    const-string v2, "BET_AMOUNT_BOTTOM_SHEET_TAG"

    .line 825
    .line 826
    invoke-virtual {v1, v2}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 827
    .line 828
    .line 829
    move-result-object v1

    .line 830
    if-nez v1, :cond_1c

    .line 831
    .line 832
    const/4 v1, -0x1

    .line 833
    if-eq v0, v1, :cond_1c

    .line 834
    .line 835
    sget-object v1, La/wd6;->o2:La/cl5;

    .line 836
    .line 837
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    new-instance v1, La/wd6;

    .line 841
    .line 842
    invoke-direct {v1}, La/wd6;-><init>()V

    .line 843
    .line 844
    .line 845
    sget-object v4, La/wd6;->p2:[La/iiy;

    .line 846
    .line 847
    aget-object v5, v4, v7

    .line 848
    .line 849
    iget-object v7, v1, La/wd6;->h2:La/zz2;

    .line 850
    .line 851
    invoke-virtual {v7, v1, v5, v0}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 852
    .line 853
    .line 854
    iget-object v0, v1, La/wd6;->i2:La/phf0;

    .line 855
    .line 856
    aget-object v3, v4, v3

    .line 857
    .line 858
    const-string v4, "COUPON_BET_AMOUNT_REQUEST_KEY"

    .line 859
    .line 860
    invoke-virtual {v0, v1, v3, v4}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 861
    .line 862
    .line 863
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 864
    .line 865
    .line 866
    move-result-object v0

    .line 867
    invoke-virtual {v1, v0, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 868
    .line 869
    .line 870
    invoke-virtual {v11}, La/axe;->M0()La/r7f;

    .line 871
    .line 872
    .line 873
    move-result-object v0

    .line 874
    iget-object v0, v0, La/r7f;->c2:La/p7m0;

    .line 875
    .line 876
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 877
    .line 878
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 879
    .line 880
    .line 881
    invoke-virtual {v0, v6, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 882
    .line 883
    .line 884
    goto/16 :goto_1

    .line 885
    .line 886
    :cond_10
    instance-of v0, v1, La/j3f;

    .line 887
    .line 888
    if-eqz v0, :cond_12

    .line 889
    .line 890
    sget-object v0, La/axe;->e2:La/kud;

    .line 891
    .line 892
    iget-object v12, v11, La/axe;->R1:La/ynb;

    .line 893
    .line 894
    if-eqz v12, :cond_11

    .line 895
    .line 896
    sget-object v13, La/bm5;->i:La/bm5;

    .line 897
    .line 898
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 899
    .line 900
    .line 901
    move-result-object v15

    .line 902
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 903
    .line 904
    .line 905
    const-string v17, "CHANGE_BALANCE_REQUEST_KEY"

    .line 906
    .line 907
    const/16 v18, 0x1ee

    .line 908
    .line 909
    const/4 v14, 0x0

    .line 910
    const/16 v16, 0x0

    .line 911
    .line 912
    invoke-static/range {v12 .. v18}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 913
    .line 914
    .line 915
    goto/16 :goto_1

    .line 916
    .line 917
    :cond_11
    const-string v0, "changeBalanceDialogProvider"

    .line 918
    .line 919
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 920
    .line 921
    .line 922
    throw v6

    .line 923
    :cond_12
    instance-of v0, v1, La/g3f;

    .line 924
    .line 925
    if-eqz v0, :cond_13

    .line 926
    .line 927
    sget-object v0, La/axe;->e2:La/kud;

    .line 928
    .line 929
    invoke-virtual {v11}, La/axe;->L0()La/pzq;

    .line 930
    .line 931
    .line 932
    move-result-object v0

    .line 933
    iget-object v0, v0, La/pzq;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 934
    .line 935
    invoke-static {v0, v8}, La/kcx;->G(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 936
    .line 937
    .line 938
    invoke-virtual {v11}, La/axe;->L0()La/pzq;

    .line 939
    .line 940
    .line 941
    move-result-object v0

    .line 942
    iget-object v0, v0, La/pzq;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 943
    .line 944
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()La/yge0;

    .line 945
    .line 946
    .line 947
    move-result-object v0

    .line 948
    if-eqz v0, :cond_1c

    .line 949
    .line 950
    invoke-virtual {v0}, La/yge0;->d()I

    .line 951
    .line 952
    .line 953
    move-result v0

    .line 954
    if-nez v0, :cond_1c

    .line 955
    .line 956
    invoke-virtual {v11}, La/axe;->L0()La/pzq;

    .line 957
    .line 958
    .line 959
    move-result-object v0

    .line 960
    iget-object v0, v0, La/pzq;->m:Landroidx/core/widget/NestedScrollView;

    .line 961
    .line 962
    invoke-virtual {v0}, Landroid/view/View;->getScrollX()I

    .line 963
    .line 964
    .line 965
    move-result v1

    .line 966
    rsub-int/lit8 v1, v1, 0x0

    .line 967
    .line 968
    invoke-virtual {v0}, Landroid/view/View;->getScrollY()I

    .line 969
    .line 970
    .line 971
    move-result v2

    .line 972
    rsub-int/lit8 v2, v2, 0x0

    .line 973
    .line 974
    invoke-virtual {v0, v1, v2, v8}, Landroidx/core/widget/NestedScrollView;->u(IIZ)V

    .line 975
    .line 976
    .line 977
    goto/16 :goto_1

    .line 978
    .line 979
    :cond_13
    instance-of v0, v1, La/x3f;

    .line 980
    .line 981
    if-eqz v0, :cond_14

    .line 982
    .line 983
    sget-object v0, La/axe;->e2:La/kud;

    .line 984
    .line 985
    invoke-virtual {v11}, La/axe;->J0()La/ii;

    .line 986
    .line 987
    .line 988
    move-result-object v0

    .line 989
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 990
    .line 991
    invoke-virtual {v11, v14}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 992
    .line 993
    .line 994
    move-result-object v16

    .line 995
    const v1, 0x7f131158

    .line 996
    .line 997
    .line 998
    invoke-virtual {v11, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 999
    .line 1000
    .line 1001
    move-result-object v17

    .line 1002
    invoke-virtual {v11, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v18

    .line 1006
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1007
    .line 1008
    .line 1009
    invoke-virtual {v11, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1010
    .line 1011
    .line 1012
    move-result-object v19

    .line 1013
    sget-object v24, La/n12;->a:La/n12;

    .line 1014
    .line 1015
    const/16 v25, 0x0

    .line 1016
    .line 1017
    const/16 v26, 0x5d0

    .line 1018
    .line 1019
    const/16 v20, 0x0

    .line 1020
    .line 1021
    const-string v21, "COUPON_REPLACE_AFTER_GENERATE_REQUEST_KEY"

    .line 1022
    .line 1023
    const/16 v22, 0x0

    .line 1024
    .line 1025
    const/16 v23, 0x0

    .line 1026
    .line 1027
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1028
    .line 1029
    .line 1030
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v1

    .line 1034
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1035
    .line 1036
    .line 1037
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1038
    .line 1039
    .line 1040
    goto/16 :goto_1

    .line 1041
    .line 1042
    :cond_14
    instance-of v0, v1, La/z3f;

    .line 1043
    .line 1044
    if-eqz v0, :cond_15

    .line 1045
    .line 1046
    sget-object v0, La/axe;->e2:La/kud;

    .line 1047
    .line 1048
    invoke-virtual {v11}, La/axe;->J0()La/ii;

    .line 1049
    .line 1050
    .line 1051
    move-result-object v0

    .line 1052
    new-instance v15, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1053
    .line 1054
    invoke-virtual {v11, v14}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v16

    .line 1058
    invoke-virtual {v11, v13}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1059
    .line 1060
    .line 1061
    move-result-object v17

    .line 1062
    invoke-virtual {v11, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1063
    .line 1064
    .line 1065
    move-result-object v18

    .line 1066
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1067
    .line 1068
    .line 1069
    invoke-virtual {v11, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1070
    .line 1071
    .line 1072
    move-result-object v19

    .line 1073
    sget-object v24, La/n12;->a:La/n12;

    .line 1074
    .line 1075
    const/16 v25, 0x0

    .line 1076
    .line 1077
    const/16 v26, 0x5d0

    .line 1078
    .line 1079
    const/16 v20, 0x0

    .line 1080
    .line 1081
    const-string v21, "COUPON_REPLACE_WITH_DEEP_LINK_REQUEST_KEY"

    .line 1082
    .line 1083
    const/16 v22, 0x0

    .line 1084
    .line 1085
    const/16 v23, 0x0

    .line 1086
    .line 1087
    invoke-direct/range {v15 .. v26}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1088
    .line 1089
    .line 1090
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v1

    .line 1094
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1095
    .line 1096
    .line 1097
    invoke-virtual {v0, v15, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1098
    .line 1099
    .line 1100
    goto/16 :goto_1

    .line 1101
    .line 1102
    :cond_15
    instance-of v0, v1, La/v3f;

    .line 1103
    .line 1104
    if-eqz v0, :cond_16

    .line 1105
    .line 1106
    sget-object v0, La/axe;->e2:La/kud;

    .line 1107
    .line 1108
    invoke-virtual {v11}, La/axe;->J0()La/ii;

    .line 1109
    .line 1110
    .line 1111
    move-result-object v0

    .line 1112
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1113
    .line 1114
    invoke-virtual {v11, v12}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v14

    .line 1118
    const v1, 0x7f130511

    .line 1119
    .line 1120
    .line 1121
    invoke-virtual {v11, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1122
    .line 1123
    .line 1124
    move-result-object v15

    .line 1125
    invoke-virtual {v11, v10}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1126
    .line 1127
    .line 1128
    move-result-object v16

    .line 1129
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1130
    .line 1131
    .line 1132
    invoke-virtual {v11, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1133
    .line 1134
    .line 1135
    move-result-object v17

    .line 1136
    sget-object v22, La/n12;->a:La/n12;

    .line 1137
    .line 1138
    const/16 v23, 0x0

    .line 1139
    .line 1140
    const/16 v24, 0x5d0

    .line 1141
    .line 1142
    const/16 v18, 0x0

    .line 1143
    .line 1144
    const-string v19, "COUPON_NOT_ENOUGH_BLOCKS_FOR_CONDITION_BET_REQUEST_KEY"

    .line 1145
    .line 1146
    const/16 v20, 0x0

    .line 1147
    .line 1148
    const/16 v21, 0x0

    .line 1149
    .line 1150
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1151
    .line 1152
    .line 1153
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1154
    .line 1155
    .line 1156
    move-result-object v1

    .line 1157
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1158
    .line 1159
    .line 1160
    invoke-virtual {v0, v13, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1161
    .line 1162
    .line 1163
    goto/16 :goto_1

    .line 1164
    .line 1165
    :cond_16
    instance-of v0, v1, La/p3f;

    .line 1166
    .line 1167
    if-eqz v0, :cond_17

    .line 1168
    .line 1169
    check-cast v1, La/p3f;

    .line 1170
    .line 1171
    iget-object v15, v1, La/p3f;->a:Ljava/lang/String;

    .line 1172
    .line 1173
    sget-object v0, La/axe;->e2:La/kud;

    .line 1174
    .line 1175
    invoke-virtual {v11}, La/axe;->J0()La/ii;

    .line 1176
    .line 1177
    .line 1178
    move-result-object v0

    .line 1179
    new-instance v13, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1180
    .line 1181
    invoke-virtual {v11, v12}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1182
    .line 1183
    .line 1184
    move-result-object v14

    .line 1185
    invoke-virtual {v11, v9}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1186
    .line 1187
    .line 1188
    move-result-object v16

    .line 1189
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1190
    .line 1191
    .line 1192
    sget-object v22, La/n12;->b:La/n12;

    .line 1193
    .line 1194
    const/16 v23, 0x0

    .line 1195
    .line 1196
    const/16 v24, 0x5f8

    .line 1197
    .line 1198
    const/16 v17, 0x0

    .line 1199
    .line 1200
    const/16 v18, 0x0

    .line 1201
    .line 1202
    const/16 v19, 0x0

    .line 1203
    .line 1204
    const/16 v20, 0x0

    .line 1205
    .line 1206
    const/16 v21, 0x0

    .line 1207
    .line 1208
    invoke-direct/range {v13 .. v24}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1209
    .line 1210
    .line 1211
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v1

    .line 1215
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1216
    .line 1217
    .line 1218
    invoke-virtual {v0, v13, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1219
    .line 1220
    .line 1221
    goto/16 :goto_1

    .line 1222
    .line 1223
    :cond_17
    instance-of v0, v1, La/d3f;

    .line 1224
    .line 1225
    if-eqz v0, :cond_18

    .line 1226
    .line 1227
    sget-object v0, La/axe;->e2:La/kud;

    .line 1228
    .line 1229
    iget-object v0, v11, La/axe;->M1:La/phf0;

    .line 1230
    .line 1231
    sget-object v1, La/axe;->f2:[La/iiy;

    .line 1232
    .line 1233
    aget-object v1, v1, v7

    .line 1234
    .line 1235
    invoke-virtual {v0, v11, v1, v2}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1236
    .line 1237
    .line 1238
    goto/16 :goto_1

    .line 1239
    .line 1240
    :cond_18
    instance-of v0, v1, La/e3f;

    .line 1241
    .line 1242
    if-eqz v0, :cond_1a

    .line 1243
    .line 1244
    sget-object v0, La/axe;->e2:La/kud;

    .line 1245
    .line 1246
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1247
    .line 1248
    .line 1249
    move-result-object v0

    .line 1250
    iget-object v0, v0, Landroidx/fragment/app/e;->c:La/pmi;

    .line 1251
    .line 1252
    invoke-virtual {v0}, La/pmi;->p()Ljava/util/List;

    .line 1253
    .line 1254
    .line 1255
    move-result-object v0

    .line 1256
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1257
    .line 1258
    .line 1259
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 1260
    .line 1261
    .line 1262
    move-result-object v0

    .line 1263
    :cond_19
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1264
    .line 1265
    .line 1266
    move-result v1

    .line 1267
    if-eqz v1, :cond_1c

    .line 1268
    .line 1269
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v1

    .line 1273
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 1274
    .line 1275
    instance-of v2, v1, La/sik;

    .line 1276
    .line 1277
    if-eqz v2, :cond_19

    .line 1278
    .line 1279
    check-cast v1, La/sik;

    .line 1280
    .line 1281
    invoke-virtual {v1}, La/sik;->y0()V

    .line 1282
    .line 1283
    .line 1284
    goto :goto_0

    .line 1285
    :cond_1a
    instance-of v0, v1, La/w3f;

    .line 1286
    .line 1287
    if-eqz v0, :cond_1b

    .line 1288
    .line 1289
    sget-object v0, La/axe;->e2:La/kud;

    .line 1290
    .line 1291
    invoke-virtual {v11}, La/axe;->J0()La/ii;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v0

    .line 1295
    new-instance v12, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1296
    .line 1297
    const v1, 0x7f130ed5

    .line 1298
    .line 1299
    .line 1300
    invoke-virtual {v11, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1301
    .line 1302
    .line 1303
    move-result-object v13

    .line 1304
    const v1, 0x7f130ed4

    .line 1305
    .line 1306
    .line 1307
    invoke-virtual {v11, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v14

    .line 1311
    const v1, 0x7f130e5c

    .line 1312
    .line 1313
    .line 1314
    invoke-virtual {v11, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1315
    .line 1316
    .line 1317
    move-result-object v15

    .line 1318
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1319
    .line 1320
    .line 1321
    sget-object v21, La/n12;->a:La/n12;

    .line 1322
    .line 1323
    const/16 v22, 0x0

    .line 1324
    .line 1325
    const/16 v23, 0x5f8

    .line 1326
    .line 1327
    const/16 v16, 0x0

    .line 1328
    .line 1329
    const/16 v17, 0x0

    .line 1330
    .line 1331
    const/16 v18, 0x0

    .line 1332
    .line 1333
    const/16 v19, 0x0

    .line 1334
    .line 1335
    const/16 v20, 0x0

    .line 1336
    .line 1337
    invoke-direct/range {v12 .. v23}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1338
    .line 1339
    .line 1340
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1341
    .line 1342
    .line 1343
    move-result-object v1

    .line 1344
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1345
    .line 1346
    .line 1347
    invoke-virtual {v0, v12, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1348
    .line 1349
    .line 1350
    goto :goto_1

    .line 1351
    :cond_1b
    instance-of v0, v1, La/q3f;

    .line 1352
    .line 1353
    if-eqz v0, :cond_1c

    .line 1354
    .line 1355
    sget-object v0, La/axe;->e2:La/kud;

    .line 1356
    .line 1357
    invoke-virtual {v11}, La/axe;->J0()La/ii;

    .line 1358
    .line 1359
    .line 1360
    move-result-object v0

    .line 1361
    new-instance v12, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1362
    .line 1363
    const v1, 0x7f130759

    .line 1364
    .line 1365
    .line 1366
    invoke-virtual {v11, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v13

    .line 1370
    const v1, 0x7f130758

    .line 1371
    .line 1372
    .line 1373
    invoke-virtual {v11, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1374
    .line 1375
    .line 1376
    move-result-object v14

    .line 1377
    const v1, 0x7f130e5e

    .line 1378
    .line 1379
    .line 1380
    invoke-virtual {v11, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1381
    .line 1382
    .line 1383
    move-result-object v15

    .line 1384
    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1385
    .line 1386
    .line 1387
    sget-object v21, La/n12;->a:La/n12;

    .line 1388
    .line 1389
    const/16 v22, 0x0

    .line 1390
    .line 1391
    const/16 v23, 0x5f8

    .line 1392
    .line 1393
    const/16 v16, 0x0

    .line 1394
    .line 1395
    const/16 v17, 0x0

    .line 1396
    .line 1397
    const/16 v18, 0x0

    .line 1398
    .line 1399
    const/16 v19, 0x0

    .line 1400
    .line 1401
    const/16 v20, 0x0

    .line 1402
    .line 1403
    invoke-direct/range {v12 .. v23}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1404
    .line 1405
    .line 1406
    invoke-virtual {v11}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1407
    .line 1408
    .line 1409
    move-result-object v1

    .line 1410
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1411
    .line 1412
    .line 1413
    invoke-virtual {v0, v12, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1414
    .line 1415
    .line 1416
    :cond_1c
    :goto_1
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1417
    .line 1418
    return-object v0

    .line 1419
    :pswitch_0
    iget-object v0, v0, La/ywe;->j:Ljava/lang/Object;

    .line 1420
    .line 1421
    check-cast v0, La/r720;

    .line 1422
    .line 1423
    sget-object v1, La/wne;->a:La/wne;

    .line 1424
    .line 1425
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1426
    .line 1427
    .line 1428
    invoke-interface {v0}, La/r720;->a()Z

    .line 1429
    .line 1430
    .line 1431
    move-result v1

    .line 1432
    if-nez v1, :cond_1d

    .line 1433
    .line 1434
    sget-object v1, La/b920;->U1:La/htz;

    .line 1435
    .line 1436
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1437
    .line 1438
    .line 1439
    new-instance v1, La/b920;

    .line 1440
    .line 1441
    invoke-direct {v1}, La/b920;-><init>()V

    .line 1442
    .line 1443
    .line 1444
    goto :goto_2

    .line 1445
    :cond_1d
    sget-object v1, La/i820;->U1:La/atz;

    .line 1446
    .line 1447
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1448
    .line 1449
    .line 1450
    new-instance v1, La/i820;

    .line 1451
    .line 1452
    invoke-direct {v1}, La/i820;-><init>()V

    .line 1453
    .line 1454
    .line 1455
    :goto_2
    instance-of v2, v0, La/q720;

    .line 1456
    .line 1457
    const-string v3, "MakeBetFragment"

    .line 1458
    .line 1459
    if-eqz v2, :cond_20

    .line 1460
    .line 1461
    sget-object v0, La/axe;->e2:La/kud;

    .line 1462
    .line 1463
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 1464
    .line 1465
    .line 1466
    move-result-object v0

    .line 1467
    iget-object v0, v0, La/pzq;->d:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 1468
    .line 1469
    invoke-virtual {v0, v8}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setVisibility(I)V

    .line 1470
    .line 1471
    .line 1472
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1473
    .line 1474
    .line 1475
    move-result-object v0

    .line 1476
    invoke-virtual {v0, v3}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v0

    .line 1480
    if-eqz v0, :cond_1e

    .line 1481
    .line 1482
    goto :goto_3

    .line 1483
    :cond_1e
    move v7, v8

    .line 1484
    :goto_3
    if-nez v7, :cond_1f

    .line 1485
    .line 1486
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1487
    .line 1488
    .line 1489
    move-result-object v0

    .line 1490
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1491
    .line 1492
    .line 1493
    new-instance v2, La/zb5;

    .line 1494
    .line 1495
    invoke-direct {v2, v0}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 1496
    .line 1497
    .line 1498
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 1499
    .line 1500
    .line 1501
    move-result-object v0

    .line 1502
    iget-object v0, v0, La/pzq;->i:Landroid/widget/FrameLayout;

    .line 1503
    .line 1504
    invoke-virtual {v0}, Landroid/view/View;->getId()I

    .line 1505
    .line 1506
    .line 1507
    move-result v0

    .line 1508
    invoke-virtual {v2, v0, v1, v3}, La/zb5;->o(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)V

    .line 1509
    .line 1510
    .line 1511
    invoke-virtual {v2}, La/zb5;->f()V

    .line 1512
    .line 1513
    .line 1514
    :cond_1f
    if-nez v7, :cond_21

    .line 1515
    .line 1516
    invoke-virtual {v5}, La/axe;->I0()V

    .line 1517
    .line 1518
    .line 1519
    goto :goto_4

    .line 1520
    :cond_20
    instance-of v0, v0, La/p720;

    .line 1521
    .line 1522
    if-eqz v0, :cond_21

    .line 1523
    .line 1524
    sget-object v0, La/axe;->e2:La/kud;

    .line 1525
    .line 1526
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 1527
    .line 1528
    .line 1529
    move-result-object v0

    .line 1530
    iget-object v0, v0, La/pzq;->d:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 1531
    .line 1532
    invoke-virtual {v0, v4}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setVisibility(I)V

    .line 1533
    .line 1534
    .line 1535
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v0

    .line 1539
    invoke-virtual {v0, v3}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1540
    .line 1541
    .line 1542
    move-result-object v0

    .line 1543
    if-eqz v0, :cond_21

    .line 1544
    .line 1545
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v1

    .line 1549
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1550
    .line 1551
    .line 1552
    new-instance v2, La/zb5;

    .line 1553
    .line 1554
    invoke-direct {v2, v1}, La/zb5;-><init>(Landroidx/fragment/app/e;)V

    .line 1555
    .line 1556
    .line 1557
    invoke-virtual {v2, v0}, La/zb5;->n(Landroidx/fragment/app/Fragment;)V

    .line 1558
    .line 1559
    .line 1560
    invoke-virtual {v2}, La/zb5;->f()V

    .line 1561
    .line 1562
    .line 1563
    :cond_21
    :goto_4
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1564
    .line 1565
    return-object v0

    .line 1566
    :pswitch_1
    iget-object v0, v0, La/ywe;->j:Ljava/lang/Object;

    .line 1567
    .line 1568
    check-cast v0, La/et7;

    .line 1569
    .line 1570
    sget-object v1, La/wne;->a:La/wne;

    .line 1571
    .line 1572
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1573
    .line 1574
    .line 1575
    sget-object v1, La/axe;->e2:La/kud;

    .line 1576
    .line 1577
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 1578
    .line 1579
    .line 1580
    move-result-object v1

    .line 1581
    iget-object v1, v1, La/pzq;->e:Landroidx/compose/ui/platform/ComposeView;

    .line 1582
    .line 1583
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1584
    .line 1585
    .line 1586
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v1

    .line 1590
    iget-object v1, v1, La/pzq;->e:Landroidx/compose/ui/platform/ComposeView;

    .line 1591
    .line 1592
    new-instance v2, La/eod;

    .line 1593
    .line 1594
    const/16 v3, 0xa

    .line 1595
    .line 1596
    invoke-direct {v2, v0, v5, v3}, La/eod;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1597
    .line 1598
    .line 1599
    new-instance v0, La/ugd;

    .line 1600
    .line 1601
    const v3, 0x2cb91668

    .line 1602
    .line 1603
    .line 1604
    invoke-direct {v0, v3, v7, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1605
    .line 1606
    .line 1607
    invoke-static {v1, v6, v0}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 1608
    .line 1609
    .line 1610
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1611
    .line 1612
    return-object v0

    .line 1613
    :pswitch_2
    iget-object v1, v5, La/axe;->b2:La/a8z;

    .line 1614
    .line 1615
    iget-object v0, v0, La/ywe;->j:Ljava/lang/Object;

    .line 1616
    .line 1617
    check-cast v0, La/ije;

    .line 1618
    .line 1619
    sget-object v2, La/wne;->a:La/wne;

    .line 1620
    .line 1621
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1622
    .line 1623
    .line 1624
    if-nez v0, :cond_22

    .line 1625
    .line 1626
    goto/16 :goto_5

    .line 1627
    .line 1628
    :cond_22
    instance-of v2, v0, La/xie;

    .line 1629
    .line 1630
    if-eqz v2, :cond_23

    .line 1631
    .line 1632
    check-cast v0, La/xie;

    .line 1633
    .line 1634
    iget-object v0, v0, La/xie;->a:La/mdm;

    .line 1635
    .line 1636
    sget-object v1, La/axe;->e2:La/kud;

    .line 1637
    .line 1638
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 1639
    .line 1640
    .line 1641
    move-result-object v1

    .line 1642
    iget-object v1, v1, La/pzq;->h:Landroidx/compose/ui/platform/ComposeView;

    .line 1643
    .line 1644
    invoke-virtual {v1, v8}, Landroid/view/View;->setVisibility(I)V

    .line 1645
    .line 1646
    .line 1647
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 1648
    .line 1649
    .line 1650
    move-result-object v1

    .line 1651
    iget-object v1, v1, La/pzq;->h:Landroidx/compose/ui/platform/ComposeView;

    .line 1652
    .line 1653
    new-instance v2, La/eod;

    .line 1654
    .line 1655
    invoke-direct {v2, v0, v5, v4}, La/eod;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1656
    .line 1657
    .line 1658
    new-instance v0, La/ugd;

    .line 1659
    .line 1660
    const v3, -0x1ce85757

    .line 1661
    .line 1662
    .line 1663
    invoke-direct {v0, v3, v7, v2}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 1664
    .line 1665
    .line 1666
    invoke-static {v1, v0}, La/b1j;->t(Landroidx/compose/ui/platform/ComposeView;La/ugd;)V

    .line 1667
    .line 1668
    .line 1669
    goto/16 :goto_5

    .line 1670
    .line 1671
    :cond_23
    instance-of v2, v0, La/eje;

    .line 1672
    .line 1673
    if-eqz v2, :cond_29

    .line 1674
    .line 1675
    sget-object v2, La/axe;->e2:La/kud;

    .line 1676
    .line 1677
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 1678
    .line 1679
    .line 1680
    move-result-object v2

    .line 1681
    iget-object v2, v2, La/pzq;->h:Landroidx/compose/ui/platform/ComposeView;

    .line 1682
    .line 1683
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1684
    .line 1685
    .line 1686
    check-cast v0, La/eje;

    .line 1687
    .line 1688
    iget-boolean v2, v0, La/eje;->c:Z

    .line 1689
    .line 1690
    if-eqz v2, :cond_25

    .line 1691
    .line 1692
    iget-object v2, v5, La/axe;->a2:La/qse;

    .line 1693
    .line 1694
    if-eqz v2, :cond_24

    .line 1695
    .line 1696
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 1697
    .line 1698
    .line 1699
    move-result-object v4

    .line 1700
    iget-object v4, v4, La/pzq;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 1701
    .line 1702
    invoke-virtual {v4, v2}, Landroidx/recyclerview/widget/RecyclerView;->s0(La/fhe0;)V

    .line 1703
    .line 1704
    .line 1705
    :cond_24
    iput-object v6, v5, La/axe;->a2:La/qse;

    .line 1706
    .line 1707
    iget-boolean v2, v0, La/eje;->d:Z

    .line 1708
    .line 1709
    new-instance v4, La/qse;

    .line 1710
    .line 1711
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1712
    .line 1713
    .line 1714
    move-result-object v7

    .line 1715
    invoke-direct {v4, v2, v8, v7}, La/qse;-><init>(ZZLandroid/content/Context;)V

    .line 1716
    .line 1717
    .line 1718
    iput-object v4, v5, La/axe;->a2:La/qse;

    .line 1719
    .line 1720
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 1721
    .line 1722
    .line 1723
    move-result-object v2

    .line 1724
    iget-object v2, v2, La/pzq;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 1725
    .line 1726
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 1727
    .line 1728
    .line 1729
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 1730
    .line 1731
    .line 1732
    move-result-object v2

    .line 1733
    iget-object v2, v2, La/pzq;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 1734
    .line 1735
    new-instance v4, La/a4e;

    .line 1736
    .line 1737
    invoke-direct {v4, v5, v2, v3}, La/a4e;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1738
    .line 1739
    .line 1740
    invoke-virtual {v2, v4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 1741
    .line 1742
    .line 1743
    :cond_25
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1744
    .line 1745
    .line 1746
    move-result-object v2

    .line 1747
    check-cast v2, La/tre;

    .line 1748
    .line 1749
    iget-object v3, v0, La/eje;->a:Ljava/util/List;

    .line 1750
    .line 1751
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1752
    .line 1753
    .line 1754
    move-result v4

    .line 1755
    if-eqz v4, :cond_26

    .line 1756
    .line 1757
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1758
    .line 1759
    .line 1760
    move-result-object v4

    .line 1761
    check-cast v4, La/tre;

    .line 1762
    .line 1763
    invoke-virtual {v4}, La/yge0;->g()V

    .line 1764
    .line 1765
    .line 1766
    :cond_26
    invoke-virtual {v2, v3}, La/zz3;->A(Ljava/util/List;)V

    .line 1767
    .line 1768
    .line 1769
    iget-boolean v0, v0, La/eje;->b:Z

    .line 1770
    .line 1771
    iget-object v2, v5, La/axe;->X1:La/vyx;

    .line 1772
    .line 1773
    if-eqz v0, :cond_27

    .line 1774
    .line 1775
    if-nez v2, :cond_29

    .line 1776
    .line 1777
    new-instance v0, La/nwe;

    .line 1778
    .line 1779
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1780
    .line 1781
    .line 1782
    move-result-object v1

    .line 1783
    check-cast v1, La/tre;

    .line 1784
    .line 1785
    invoke-direct {v0, v1}, La/nwe;-><init>(La/tre;)V

    .line 1786
    .line 1787
    .line 1788
    new-instance v1, La/vyx;

    .line 1789
    .line 1790
    invoke-direct {v1, v0}, La/vyx;-><init>(La/syx;)V

    .line 1791
    .line 1792
    .line 1793
    iput-object v1, v5, La/axe;->X1:La/vyx;

    .line 1794
    .line 1795
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 1796
    .line 1797
    .line 1798
    move-result-object v0

    .line 1799
    iget-object v0, v0, La/pzq;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 1800
    .line 1801
    invoke-virtual {v1, v0}, La/vyx;->i(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 1802
    .line 1803
    .line 1804
    goto :goto_5

    .line 1805
    :cond_27
    if-eqz v2, :cond_28

    .line 1806
    .line 1807
    invoke-virtual {v2, v6}, La/vyx;->i(Landroidx/recyclerview/widget/RecyclerView;)V

    .line 1808
    .line 1809
    .line 1810
    :cond_28
    iput-object v6, v5, La/axe;->X1:La/vyx;

    .line 1811
    .line 1812
    :cond_29
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1813
    .line 1814
    return-object v0

    .line 1815
    :pswitch_3
    iget-object v0, v0, La/ywe;->j:Ljava/lang/Object;

    .line 1816
    .line 1817
    check-cast v0, La/hn5;

    .line 1818
    .line 1819
    sget-object v1, La/wne;->a:La/wne;

    .line 1820
    .line 1821
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1822
    .line 1823
    .line 1824
    sget-object v1, La/axe;->e2:La/kud;

    .line 1825
    .line 1826
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 1827
    .line 1828
    .line 1829
    move-result-object v1

    .line 1830
    iget-object v1, v1, La/pzq;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 1831
    .line 1832
    iget-boolean v2, v0, La/hn5;->e:Z

    .line 1833
    .line 1834
    if-eqz v2, :cond_2a

    .line 1835
    .line 1836
    move v4, v8

    .line 1837
    :cond_2a
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1838
    .line 1839
    .line 1840
    iget-boolean v1, v0, La/hn5;->e:Z

    .line 1841
    .line 1842
    if-eqz v1, :cond_2b

    .line 1843
    .line 1844
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 1845
    .line 1846
    .line 1847
    move-result-object v1

    .line 1848
    iget-object v1, v1, La/pzq;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 1849
    .line 1850
    iget v2, v0, La/hn5;->d:I

    .line 1851
    .line 1852
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->setStyle(I)V

    .line 1853
    .line 1854
    .line 1855
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 1856
    .line 1857
    .line 1858
    move-result-object v1

    .line 1859
    iget-object v1, v1, La/pzq;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 1860
    .line 1861
    iget-object v2, v0, La/hn5;->a:Ljava/lang/String;

    .line 1862
    .line 1863
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->setAccountTitle(Ljava/lang/CharSequence;)V

    .line 1864
    .line 1865
    .line 1866
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 1867
    .line 1868
    .line 1869
    move-result-object v1

    .line 1870
    iget-object v1, v1, La/pzq;->b:Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;

    .line 1871
    .line 1872
    iget-object v2, v0, La/hn5;->b:Ljava/lang/String;

    .line 1873
    .line 1874
    iget-object v0, v0, La/hn5;->c:Ljava/lang/String;

    .line 1875
    .line 1876
    invoke-virtual {v1, v2, v0}, Lorg/xplatform/uikit/components/account_selection/DsAccountSelection;->x(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 1877
    .line 1878
    .line 1879
    :cond_2b
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1880
    .line 1881
    return-object v0

    .line 1882
    :pswitch_4
    iget-object v0, v0, La/ywe;->j:Ljava/lang/Object;

    .line 1883
    .line 1884
    check-cast v0, La/pwq0;

    .line 1885
    .line 1886
    sget-object v1, La/wne;->a:La/wne;

    .line 1887
    .line 1888
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1889
    .line 1890
    .line 1891
    sget-object v1, La/axe;->e2:La/kud;

    .line 1892
    .line 1893
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 1894
    .line 1895
    .line 1896
    move-result-object v1

    .line 1897
    iget-object v1, v1, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 1898
    .line 1899
    invoke-virtual {v1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->getTitle()Ljava/lang/CharSequence;

    .line 1900
    .line 1901
    .line 1902
    move-result-object v1

    .line 1903
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 1904
    .line 1905
    .line 1906
    move-result v1

    .line 1907
    if-nez v1, :cond_2e

    .line 1908
    .line 1909
    iget-boolean v1, v0, La/pwq0;->m:Z

    .line 1910
    .line 1911
    iget-boolean v9, v0, La/pwq0;->a:Z

    .line 1912
    .line 1913
    iget-boolean v10, v0, La/pwq0;->b:Z

    .line 1914
    .line 1915
    iget-boolean v11, v0, La/pwq0;->c:Z

    .line 1916
    .line 1917
    new-instance v12, Ljava/util/ArrayList;

    .line 1918
    .line 1919
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 1920
    .line 1921
    .line 1922
    if-eqz v10, :cond_2c

    .line 1923
    .line 1924
    new-instance v13, La/hc50;

    .line 1925
    .line 1926
    sget-object v15, La/ybg0;->a:La/ybg0;

    .line 1927
    .line 1928
    new-instance v10, La/twe;

    .line 1929
    .line 1930
    const/16 v14, 0xb

    .line 1931
    .line 1932
    invoke-direct {v10, v5, v14}, La/twe;-><init>(La/axe;B)V

    .line 1933
    .line 1934
    .line 1935
    const/16 v18, 0x7f0

    .line 1936
    .line 1937
    const-string v14, "MAKE_BET_SETTINGS"

    .line 1938
    .line 1939
    const v16, 0x7f0809fc

    .line 1940
    .line 1941
    .line 1942
    move-object/from16 v17, v10

    .line 1943
    .line 1944
    invoke-direct/range {v13 .. v18}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;I)V

    .line 1945
    .line 1946
    .line 1947
    invoke-virtual {v12, v13}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1948
    .line 1949
    .line 1950
    :cond_2c
    if-eqz v11, :cond_2d

    .line 1951
    .line 1952
    new-instance v14, La/hc50;

    .line 1953
    .line 1954
    sget-object v16, La/ybg0;->a:La/ybg0;

    .line 1955
    .line 1956
    new-instance v10, La/twe;

    .line 1957
    .line 1958
    const/16 v11, 0xc

    .line 1959
    .line 1960
    invoke-direct {v10, v5, v11}, La/twe;-><init>(La/axe;B)V

    .line 1961
    .line 1962
    .line 1963
    const/16 v19, 0x7f0

    .line 1964
    .line 1965
    const-string v15, "REMOVE_BUTTON"

    .line 1966
    .line 1967
    const v17, 0x7f080a30

    .line 1968
    .line 1969
    .line 1970
    move-object/from16 v18, v10

    .line 1971
    .line 1972
    invoke-direct/range {v14 .. v19}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;I)V

    .line 1973
    .line 1974
    .line 1975
    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1976
    .line 1977
    .line 1978
    :cond_2d
    new-instance v15, La/hc50;

    .line 1979
    .line 1980
    sget-object v17, La/ybg0;->a:La/ybg0;

    .line 1981
    .line 1982
    new-instance v10, La/twe;

    .line 1983
    .line 1984
    const/16 v11, 0xd

    .line 1985
    .line 1986
    invoke-direct {v10, v5, v11}, La/twe;-><init>(La/axe;B)V

    .line 1987
    .line 1988
    .line 1989
    const/16 v20, 0x7f0

    .line 1990
    .line 1991
    const-string v16, "MORE_BUTTON"

    .line 1992
    .line 1993
    const v18, 0x7f080994

    .line 1994
    .line 1995
    .line 1996
    move-object/from16 v19, v10

    .line 1997
    .line 1998
    invoke-direct/range {v15 .. v20}, La/hc50;-><init>(Ljava/lang/String;La/ybg0;ILkotlin/jvm/functions/Function0;I)V

    .line 1999
    .line 2000
    .line 2001
    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2002
    .line 2003
    .line 2004
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2005
    .line 2006
    .line 2007
    move-result-object v10

    .line 2008
    iget-object v10, v10, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 2009
    .line 2010
    invoke-virtual {v10, v12}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtons(Ljava/util/ArrayList;)V

    .line 2011
    .line 2012
    .line 2013
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2014
    .line 2015
    .line 2016
    move-result-object v11

    .line 2017
    const v12, 0x7f040b0b

    .line 2018
    .line 2019
    .line 2020
    invoke-static {v12, v11}, La/m5d;->b(ILandroid/content/Context;)I

    .line 2021
    .line 2022
    .line 2023
    move-result v11

    .line 2024
    invoke-static {v11}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2025
    .line 2026
    .line 2027
    move-result-object v11

    .line 2028
    invoke-virtual {v10, v11}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setNavigationBarButtonsColorStateList(Landroid/content/res/ColorStateList;)V

    .line 2029
    .line 2030
    .line 2031
    invoke-virtual {v5, v1, v9}, La/axe;->H0(ZZ)V

    .line 2032
    .line 2033
    .line 2034
    :cond_2e
    iget-boolean v1, v0, La/pwq0;->m:Z

    .line 2035
    .line 2036
    iget-object v9, v0, La/pwq0;->f:Ljava/util/List;

    .line 2037
    .line 2038
    iget-boolean v10, v0, La/pwq0;->g:Z

    .line 2039
    .line 2040
    iget-boolean v11, v0, La/pwq0;->i:Z

    .line 2041
    .line 2042
    iget-boolean v12, v0, La/pwq0;->a:Z

    .line 2043
    .line 2044
    invoke-virtual {v5, v1, v12}, La/axe;->H0(ZZ)V

    .line 2045
    .line 2046
    .line 2047
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2048
    .line 2049
    .line 2050
    move-result-object v12

    .line 2051
    iget-object v12, v12, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 2052
    .line 2053
    iget-boolean v13, v0, La/pwq0;->j:Z

    .line 2054
    .line 2055
    if-eqz v13, :cond_2f

    .line 2056
    .line 2057
    if-nez v1, :cond_2f

    .line 2058
    .line 2059
    move v13, v7

    .line 2060
    goto :goto_6

    .line 2061
    :cond_2f
    move v13, v8

    .line 2062
    :goto_6
    invoke-virtual {v12, v13}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitleIconVisible(Z)V

    .line 2063
    .line 2064
    .line 2065
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v12

    .line 2069
    iget-object v12, v12, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 2070
    .line 2071
    if-nez v1, :cond_30

    .line 2072
    .line 2073
    iget-object v2, v0, La/pwq0;->e:Ljava/lang/String;

    .line 2074
    .line 2075
    :cond_30
    invoke-virtual {v12, v2}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 2076
    .line 2077
    .line 2078
    if-eqz v10, :cond_34

    .line 2079
    .line 2080
    if-nez v1, :cond_34

    .line 2081
    .line 2082
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2083
    .line 2084
    .line 2085
    move-result-object v2

    .line 2086
    iget-object v2, v2, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 2087
    .line 2088
    iget-object v2, v2, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 2089
    .line 2090
    invoke-virtual {v2, v7}, Landroid/view/View;->setClickable(Z)V

    .line 2091
    .line 2092
    .line 2093
    iget-object v12, v2, La/wf40;->b:La/wc50;

    .line 2094
    .line 2095
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 2096
    .line 2097
    .line 2098
    move-result v12

    .line 2099
    if-eqz v12, :cond_33

    .line 2100
    .line 2101
    if-eq v12, v7, :cond_32

    .line 2102
    .line 2103
    if-ne v12, v3, :cond_31

    .line 2104
    .line 2105
    iget-object v2, v2, La/wf40;->j:La/q4n0;

    .line 2106
    .line 2107
    iget-object v2, v2, La/q4n0;->b:La/ssq0;

    .line 2108
    .line 2109
    invoke-virtual {v2, v7}, Landroid/view/View;->setClickable(Z)V

    .line 2110
    .line 2111
    .line 2112
    goto :goto_7

    .line 2113
    :cond_31
    invoke-static {}, La/t9f;->b()V

    .line 2114
    .line 2115
    .line 2116
    goto/16 :goto_d

    .line 2117
    .line 2118
    :cond_32
    iget-object v2, v2, La/wf40;->i:La/yrb0;

    .line 2119
    .line 2120
    iget-object v2, v2, La/yrb0;->b:La/ssq0;

    .line 2121
    .line 2122
    invoke-virtual {v2, v7}, Landroid/view/View;->setClickable(Z)V

    .line 2123
    .line 2124
    .line 2125
    goto :goto_7

    .line 2126
    :cond_33
    iget-object v2, v2, La/wf40;->h:La/ssq0;

    .line 2127
    .line 2128
    invoke-virtual {v2, v7}, Landroid/view/View;->setClickable(Z)V

    .line 2129
    .line 2130
    .line 2131
    :goto_7
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2132
    .line 2133
    .line 2134
    move-result-object v2

    .line 2135
    iget-object v2, v2, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 2136
    .line 2137
    new-instance v3, La/yw9;

    .line 2138
    .line 2139
    const/16 v12, 0x17

    .line 2140
    .line 2141
    invoke-direct {v3, v5, v9, v12}, La/yw9;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2142
    .line 2143
    .line 2144
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setOnTitlesClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 2145
    .line 2146
    .line 2147
    goto :goto_8

    .line 2148
    :cond_34
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2149
    .line 2150
    .line 2151
    move-result-object v2

    .line 2152
    iget-object v2, v2, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 2153
    .line 2154
    iget-object v2, v2, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d:La/wf40;

    .line 2155
    .line 2156
    invoke-virtual {v2, v8}, Landroid/view/View;->setClickable(Z)V

    .line 2157
    .line 2158
    .line 2159
    iget-object v12, v2, La/wf40;->b:La/wc50;

    .line 2160
    .line 2161
    invoke-virtual {v12}, Ljava/lang/Enum;->ordinal()I

    .line 2162
    .line 2163
    .line 2164
    move-result v12

    .line 2165
    if-eqz v12, :cond_37

    .line 2166
    .line 2167
    if-eq v12, v7, :cond_36

    .line 2168
    .line 2169
    if-ne v12, v3, :cond_35

    .line 2170
    .line 2171
    iget-object v2, v2, La/wf40;->j:La/q4n0;

    .line 2172
    .line 2173
    iget-object v2, v2, La/q4n0;->b:La/ssq0;

    .line 2174
    .line 2175
    invoke-virtual {v2, v8}, Landroid/view/View;->setClickable(Z)V

    .line 2176
    .line 2177
    .line 2178
    goto :goto_8

    .line 2179
    :cond_35
    invoke-static {}, La/t9f;->b()V

    .line 2180
    .line 2181
    .line 2182
    goto/16 :goto_d

    .line 2183
    .line 2184
    :cond_36
    iget-object v2, v2, La/wf40;->i:La/yrb0;

    .line 2185
    .line 2186
    iget-object v2, v2, La/yrb0;->b:La/ssq0;

    .line 2187
    .line 2188
    invoke-virtual {v2, v8}, Landroid/view/View;->setClickable(Z)V

    .line 2189
    .line 2190
    .line 2191
    goto :goto_8

    .line 2192
    :cond_37
    iget-object v2, v2, La/wf40;->h:La/ssq0;

    .line 2193
    .line 2194
    invoke-virtual {v2, v8}, Landroid/view/View;->setClickable(Z)V

    .line 2195
    .line 2196
    .line 2197
    :goto_8
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2198
    .line 2199
    .line 2200
    move-result-object v2

    .line 2201
    iget-object v2, v2, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 2202
    .line 2203
    invoke-virtual {v2, v10}, Landroid/view/View;->setClickable(Z)V

    .line 2204
    .line 2205
    .line 2206
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2207
    .line 2208
    .line 2209
    move-result-object v2

    .line 2210
    iget-object v2, v2, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 2211
    .line 2212
    invoke-virtual {v2}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->d()V

    .line 2213
    .line 2214
    .line 2215
    if-eqz v11, :cond_38

    .line 2216
    .line 2217
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2218
    .line 2219
    .line 2220
    move-result-object v2

    .line 2221
    iget-object v2, v2, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 2222
    .line 2223
    iget-object v2, v2, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c:La/bcg0;

    .line 2224
    .line 2225
    iget-object v2, v2, La/bcg0;->d:La/acg0;

    .line 2226
    .line 2227
    iget-object v2, v2, La/acg0;->e:Ljava/util/ArrayList;

    .line 2228
    .line 2229
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 2230
    .line 2231
    .line 2232
    move-result-object v2

    .line 2233
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 2234
    .line 2235
    .line 2236
    move-result v3

    .line 2237
    if-eqz v3, :cond_38

    .line 2238
    .line 2239
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 2240
    .line 2241
    .line 2242
    move-result-object v3

    .line 2243
    check-cast v3, La/e1i;

    .line 2244
    .line 2245
    invoke-virtual {v3, v8}, Landroid/view/View;->setVisibility(I)V

    .line 2246
    .line 2247
    .line 2248
    goto :goto_9

    .line 2249
    :cond_38
    iget-boolean v2, v0, La/pwq0;->h:Z

    .line 2250
    .line 2251
    const-string v3, "MORE_BUTTON"

    .line 2252
    .line 2253
    if-eqz v2, :cond_39

    .line 2254
    .line 2255
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 2256
    .line 2257
    .line 2258
    move-result v2

    .line 2259
    if-nez v2, :cond_39

    .line 2260
    .line 2261
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2262
    .line 2263
    .line 2264
    move-result-object v2

    .line 2265
    iget-object v2, v2, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 2266
    .line 2267
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->g(Ljava/lang/String;)V

    .line 2268
    .line 2269
    .line 2270
    goto :goto_a

    .line 2271
    :cond_39
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2272
    .line 2273
    .line 2274
    move-result-object v2

    .line 2275
    iget-object v2, v2, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 2276
    .line 2277
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c(Ljava/lang/String;)V

    .line 2278
    .line 2279
    .line 2280
    :goto_a
    iget-boolean v2, v0, La/pwq0;->b:Z

    .line 2281
    .line 2282
    const-string v3, "MAKE_BET_SETTINGS"

    .line 2283
    .line 2284
    if-eqz v2, :cond_3a

    .line 2285
    .line 2286
    if-eqz v11, :cond_3a

    .line 2287
    .line 2288
    iget-boolean v2, v0, La/pwq0;->d:Z

    .line 2289
    .line 2290
    if-eqz v2, :cond_3a

    .line 2291
    .line 2292
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2293
    .line 2294
    .line 2295
    move-result-object v2

    .line 2296
    iget-object v2, v2, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 2297
    .line 2298
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->g(Ljava/lang/String;)V

    .line 2299
    .line 2300
    .line 2301
    goto :goto_b

    .line 2302
    :cond_3a
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2303
    .line 2304
    .line 2305
    move-result-object v2

    .line 2306
    iget-object v2, v2, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 2307
    .line 2308
    invoke-virtual {v2, v3}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->c(Ljava/lang/String;)V

    .line 2309
    .line 2310
    .line 2311
    :goto_b
    iget-object v2, v5, La/axe;->c2:Landroidx/compose/ui/platform/ComposeView;

    .line 2312
    .line 2313
    if-eqz v2, :cond_3b

    .line 2314
    .line 2315
    new-instance v3, La/eod;

    .line 2316
    .line 2317
    const/16 v9, 0x9

    .line 2318
    .line 2319
    invoke-direct {v3, v0, v5, v9}, La/eod;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 2320
    .line 2321
    .line 2322
    new-instance v9, La/ugd;

    .line 2323
    .line 2324
    const v10, -0x3f56fdb1

    .line 2325
    .line 2326
    .line 2327
    invoke-direct {v9, v10, v7, v3}, La/ugd;-><init>(IZLjava/lang/Object;)V

    .line 2328
    .line 2329
    .line 2330
    invoke-static {v2, v6, v9}, La/pkd;->i(Landroidx/compose/ui/platform/ComposeView;Lkotlin/jvm/functions/Function2;La/ugd;)V

    .line 2331
    .line 2332
    .line 2333
    :cond_3b
    iget-object v0, v0, La/pwq0;->l:La/hao0;

    .line 2334
    .line 2335
    if-nez v0, :cond_3c

    .line 2336
    .line 2337
    if-eqz v1, :cond_3d

    .line 2338
    .line 2339
    :cond_3c
    if-eqz v11, :cond_3d

    .line 2340
    .line 2341
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2342
    .line 2343
    .line 2344
    move-result-object v0

    .line 2345
    iget-object v0, v0, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 2346
    .line 2347
    iget-object v0, v0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    .line 2348
    .line 2349
    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 2350
    .line 2351
    .line 2352
    goto :goto_c

    .line 2353
    :cond_3d
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2354
    .line 2355
    .line 2356
    move-result-object v0

    .line 2357
    iget-object v0, v0, La/pzq;->l:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 2358
    .line 2359
    iget-object v0, v0, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b:La/oiz;

    .line 2360
    .line 2361
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2362
    .line 2363
    .line 2364
    :goto_c
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2365
    .line 2366
    :goto_d
    return-object v6

    .line 2367
    :pswitch_5
    iget-object v0, v0, La/ywe;->j:Ljava/lang/Object;

    .line 2368
    .line 2369
    check-cast v0, La/n9h0;

    .line 2370
    .line 2371
    sget-object v1, La/wne;->a:La/wne;

    .line 2372
    .line 2373
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2374
    .line 2375
    .line 2376
    sget-object v1, La/axe;->e2:La/kud;

    .line 2377
    .line 2378
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2379
    .line 2380
    .line 2381
    move-result-object v1

    .line 2382
    iget-object v1, v1, La/pzq;->j:Landroid/widget/FrameLayout;

    .line 2383
    .line 2384
    iget-boolean v2, v0, La/n9h0;->a:Z

    .line 2385
    .line 2386
    iget-boolean v3, v0, La/n9h0;->d:Z

    .line 2387
    .line 2388
    iget-boolean v6, v0, La/n9h0;->g:Z

    .line 2389
    .line 2390
    if-eqz v2, :cond_3e

    .line 2391
    .line 2392
    move v2, v8

    .line 2393
    goto :goto_e

    .line 2394
    :cond_3e
    move v2, v4

    .line 2395
    :goto_e
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2396
    .line 2397
    .line 2398
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2399
    .line 2400
    .line 2401
    move-result-object v1

    .line 2402
    iget-object v1, v1, La/pzq;->c:Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;

    .line 2403
    .line 2404
    if-nez v6, :cond_3f

    .line 2405
    .line 2406
    move v2, v8

    .line 2407
    goto :goto_f

    .line 2408
    :cond_3f
    move v2, v4

    .line 2409
    :goto_f
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2410
    .line 2411
    .line 2412
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2413
    .line 2414
    .line 2415
    move-result-object v1

    .line 2416
    iget-object v1, v1, La/pzq;->q:Landroidx/recyclerview/widget/RecyclerView;

    .line 2417
    .line 2418
    iget-boolean v2, v0, La/n9h0;->c:Z

    .line 2419
    .line 2420
    if-eqz v2, :cond_40

    .line 2421
    .line 2422
    move v2, v8

    .line 2423
    goto :goto_10

    .line 2424
    :cond_40
    move v2, v4

    .line 2425
    :goto_10
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2426
    .line 2427
    .line 2428
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2429
    .line 2430
    .line 2431
    move-result-object v1

    .line 2432
    iget-object v1, v1, La/pzq;->m:Landroidx/core/widget/NestedScrollView;

    .line 2433
    .line 2434
    if-eqz v3, :cond_41

    .line 2435
    .line 2436
    move v2, v8

    .line 2437
    goto :goto_11

    .line 2438
    :cond_41
    move v2, v4

    .line 2439
    :goto_11
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2440
    .line 2441
    .line 2442
    if-eqz v3, :cond_47

    .line 2443
    .line 2444
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2445
    .line 2446
    .line 2447
    move-result-object v1

    .line 2448
    iget-object v1, v1, La/pzq;->n:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 2449
    .line 2450
    if-eqz v6, :cond_42

    .line 2451
    .line 2452
    move v2, v8

    .line 2453
    goto :goto_12

    .line 2454
    :cond_42
    move v2, v4

    .line 2455
    :goto_12
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2456
    .line 2457
    .line 2458
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2459
    .line 2460
    .line 2461
    move-result-object v1

    .line 2462
    iget-object v1, v1, La/pzq;->p:Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;

    .line 2463
    .line 2464
    iget-object v2, v0, La/n9h0;->e:Ljava/lang/String;

    .line 2465
    .line 2466
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/middle/DsCellMiddleTitle;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 2467
    .line 2468
    .line 2469
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2470
    .line 2471
    .line 2472
    move-result-object v1

    .line 2473
    iget-object v1, v1, La/pzq;->o:Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;

    .line 2474
    .line 2475
    sget-object v2, La/j5d;->a:Landroid/util/TypedValue;

    .line 2476
    .line 2477
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2478
    .line 2479
    .line 2480
    move-result-object v2

    .line 2481
    const v3, 0x7f040aeb

    .line 2482
    .line 2483
    .line 2484
    invoke-static {v2, v3, v8}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 2485
    .line 2486
    .line 2487
    move-result v2

    .line 2488
    invoke-static {v2}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 2489
    .line 2490
    .line 2491
    move-result-object v2

    .line 2492
    invoke-virtual {v1, v2}, Lorg/xplatform/uikit/components/cells/left/DsCellLeftIcon;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 2493
    .line 2494
    .line 2495
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2496
    .line 2497
    .line 2498
    move-result-object v1

    .line 2499
    iget-object v1, v1, La/pzq;->k:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 2500
    .line 2501
    iget-boolean v2, v0, La/n9h0;->h:Z

    .line 2502
    .line 2503
    if-eqz v2, :cond_43

    .line 2504
    .line 2505
    move v2, v8

    .line 2506
    goto :goto_13

    .line 2507
    :cond_43
    move v2, v4

    .line 2508
    :goto_13
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2509
    .line 2510
    .line 2511
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2512
    .line 2513
    .line 2514
    move-result-object v1

    .line 2515
    iget-object v1, v1, La/pzq;->r:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 2516
    .line 2517
    iget-boolean v2, v0, La/n9h0;->i:Z

    .line 2518
    .line 2519
    if-eqz v2, :cond_44

    .line 2520
    .line 2521
    move v2, v8

    .line 2522
    goto :goto_14

    .line 2523
    :cond_44
    move v2, v4

    .line 2524
    :goto_14
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2525
    .line 2526
    .line 2527
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2528
    .line 2529
    .line 2530
    move-result-object v1

    .line 2531
    iget-object v1, v1, La/pzq;->g:Lorg/xplatform/uikit/components/cells/DsMenuCell;

    .line 2532
    .line 2533
    iget-boolean v2, v0, La/n9h0;->j:Z

    .line 2534
    .line 2535
    if-eqz v2, :cond_45

    .line 2536
    .line 2537
    move v2, v8

    .line 2538
    goto :goto_15

    .line 2539
    :cond_45
    move v2, v4

    .line 2540
    :goto_15
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 2541
    .line 2542
    .line 2543
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2544
    .line 2545
    .line 2546
    move-result-object v1

    .line 2547
    iget-object v1, v1, La/pzq;->e:Landroidx/compose/ui/platform/ComposeView;

    .line 2548
    .line 2549
    iget-boolean v0, v0, La/n9h0;->k:Z

    .line 2550
    .line 2551
    if-eqz v0, :cond_46

    .line 2552
    .line 2553
    move v4, v8

    .line 2554
    :cond_46
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 2555
    .line 2556
    .line 2557
    :cond_47
    if-eqz v6, :cond_48

    .line 2558
    .line 2559
    invoke-virtual {v5}, La/axe;->L0()La/pzq;

    .line 2560
    .line 2561
    .line 2562
    move-result-object v0

    .line 2563
    iget-object v0, v0, La/pzq;->d:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 2564
    .line 2565
    new-instance v1, La/jw5;

    .line 2566
    .line 2567
    invoke-direct {v1, v5, v7}, La/jw5;-><init>(Ljava/lang/Object;B)V

    .line 2568
    .line 2569
    .line 2570
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    .line 2571
    .line 2572
    .line 2573
    :cond_48
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2574
    .line 2575
    return-object v0

    .line 2576
    nop

    .line 2577
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
