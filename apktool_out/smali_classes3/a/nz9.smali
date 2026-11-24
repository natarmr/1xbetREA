.class public final La/nz9;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/qz9;


# direct methods
.method public synthetic constructor <init>(La/qz9;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/nz9;->i:B

    iput-object p1, p0, La/nz9;->k:La/qz9;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/nz9;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/nz9;->k:La/qz9;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/nz9;

    .line 9
    .line 10
    const/4 v1, 0x6

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/nz9;-><init>(La/qz9;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/nz9;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/nz9;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/nz9;-><init>(La/qz9;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/nz9;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/nz9;

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/nz9;-><init>(La/qz9;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/nz9;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/nz9;

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/nz9;-><init>(La/qz9;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/nz9;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/nz9;

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/nz9;-><init>(La/qz9;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/nz9;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_4
    new-instance v0, La/nz9;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-direct {v0, p0, p2, v1}, La/nz9;-><init>(La/qz9;La/yje;B)V

    .line 57
    .line 58
    .line 59
    iput-object p1, v0, La/nz9;->j:Ljava/lang/Object;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_5
    new-instance v0, La/nz9;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-direct {v0, p0, p2, v1}, La/nz9;-><init>(La/qz9;La/yje;B)V

    .line 66
    .line 67
    .line 68
    iput-object p1, v0, La/nz9;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/nz9;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/ilu0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/nz9;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/nz9;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/nz9;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/a1k0;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/nz9;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/nz9;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/nz9;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/wub0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/nz9;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/nz9;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/nz9;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, Landroid/graphics/Bitmap;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/nz9;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/nz9;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/nz9;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/ike;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/nz9;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/nz9;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/nz9;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/sa80;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/nz9;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/nz9;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/nz9;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, La/h4a;

    .line 109
    .line 110
    check-cast p2, La/yje;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, La/nz9;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/nz9;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/nz9;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 21

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/nz9;->i:B

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const/16 v3, 0x8

    .line 7
    .line 8
    const/4 v4, 0x4

    .line 9
    const/4 v5, 0x3

    .line 10
    const/4 v6, 0x1

    .line 11
    const/4 v7, 0x0

    .line 12
    const/4 v8, 0x0

    .line 13
    packed-switch v1, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    iget-object v1, v0, La/nz9;->k:La/qz9;

    .line 17
    .line 18
    iget-object v2, v1, La/qz9;->r2:La/a8z;

    .line 19
    .line 20
    iget-object v0, v0, La/nz9;->j:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v0, La/ilu0;

    .line 23
    .line 24
    sget-object v3, La/wne;->a:La/wne;

    .line 25
    .line 26
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    instance-of v3, v0, La/elu0;

    .line 32
    .line 33
    if-eqz v3, :cond_0

    .line 34
    .line 35
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 36
    .line 37
    iget-object v0, v1, La/qz9;->p2:La/a8z;

    .line 38
    .line 39
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    check-cast v0, La/qog0;

    .line 44
    .line 45
    new-instance v2, La/lz9;

    .line 46
    .line 47
    invoke-direct {v2, v0, v1, v7}, La/lz9;-><init>(La/qog0;Landroidx/fragment/app/Fragment;B)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    iget-object v1, v0, La/qog0;->a:Ljava/util/LinkedHashSet;

    .line 54
    .line 55
    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, La/qog0;->a()V

    .line 59
    .line 60
    .line 61
    goto/16 :goto_0

    .line 62
    .line 63
    :cond_0
    instance-of v3, v0, La/flu0;

    .line 64
    .line 65
    if-eqz v3, :cond_1

    .line 66
    .line 67
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 68
    .line 69
    iget-object v0, v1, La/qz9;->i2:La/a8z;

    .line 70
    .line 71
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, La/ig00;

    .line 76
    .line 77
    new-instance v2, La/jz9;

    .line 78
    .line 79
    invoke-direct {v2, v1, v6}, La/jz9;-><init>(La/qz9;B)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-static {v1}, La/jiq0;->o0(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    invoke-interface {v0, v2, v1}, La/ig00;->a(Ljava/lang/Runnable;Ljava/util/concurrent/Executor;)V

    .line 91
    .line 92
    .line 93
    goto/16 :goto_0

    .line 94
    .line 95
    :cond_1
    instance-of v0, v0, La/glu0;

    .line 96
    .line 97
    if-eqz v0, :cond_3

    .line 98
    .line 99
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 100
    .line 101
    invoke-virtual {v1}, La/qz9;->R0()La/rz9;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    iget-object v0, v0, La/rz9;->j:Landroidx/appcompat/widget/AppCompatImageView;

    .line 106
    .line 107
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-virtual {v0}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 112
    .line 113
    .line 114
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    check-cast v0, La/oz9;

    .line 119
    .line 120
    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->canDetectOrientation()Z

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_2

    .line 125
    .line 126
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    check-cast v0, La/oz9;

    .line 131
    .line 132
    invoke-virtual {v0}, Landroid/view/OrientationEventListener;->enable()V

    .line 133
    .line 134
    .line 135
    :cond_2
    iget-object v0, v1, La/qz9;->k2:La/a8z;

    .line 136
    .line 137
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    check-cast v0, La/lyb0;

    .line 142
    .line 143
    iget-object v0, v0, La/lyb0;->a:La/rrd;

    .line 144
    .line 145
    invoke-virtual {v0}, La/rrd;->C()V

    .line 146
    .line 147
    .line 148
    iget-object v0, v1, La/qz9;->l2:La/a8z;

    .line 149
    .line 150
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    check-cast v0, La/oub0;

    .line 155
    .line 156
    invoke-virtual {v1}, La/qz9;->R0()La/rz9;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    iget-object v2, v2, La/rz9;->e:Landroidx/camera/view/PreviewView;

    .line 161
    .line 162
    invoke-virtual {v2}, Landroidx/camera/view/PreviewView;->getSurfaceProvider()La/nub0;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    invoke-virtual {v0, v2}, La/oub0;->H(La/nub0;)V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1}, La/qz9;->S0()La/d4a;

    .line 170
    .line 171
    .line 172
    move-result-object v0

    .line 173
    iget-object v0, v0, La/d4a;->j:La/p7m0;

    .line 174
    .line 175
    new-instance v2, La/nz9;

    .line 176
    .line 177
    const/4 v12, 0x0

    .line 178
    invoke-direct {v2, v1, v12, v7}, La/nz9;-><init>(La/qz9;La/yje;B)V

    .line 179
    .line 180
    .line 181
    sget-object v3, La/lkz;->a:La/lkz;

    .line 182
    .line 183
    invoke-static {v1}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-interface {v3}, La/clz;->x()La/glz;

    .line 188
    .line 189
    .line 190
    move-result-object v6

    .line 191
    invoke-static {v6}, La/x0x;->Q(La/glz;)La/tkz;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    new-instance v7, La/l19;

    .line 196
    .line 197
    invoke-direct {v7, v0, v3, v2, v12}, La/l19;-><init>(La/gmq;La/clz;La/nz9;La/yje;)V

    .line 198
    .line 199
    .line 200
    invoke-static {v6, v12, v12, v7, v5}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1}, La/qz9;->S0()La/d4a;

    .line 204
    .line 205
    .line 206
    move-result-object v0

    .line 207
    iget-object v9, v0, La/d4a;->l:La/p7m0;

    .line 208
    .line 209
    new-instance v11, La/nz9;

    .line 210
    .line 211
    invoke-direct {v11, v1, v12, v4}, La/nz9;-><init>(La/qz9;La/yje;B)V

    .line 212
    .line 213
    .line 214
    invoke-static {v1}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 215
    .line 216
    .line 217
    move-result-object v10

    .line 218
    invoke-interface {v10}, La/clz;->x()La/glz;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    new-instance v8, La/l19;

    .line 227
    .line 228
    const/4 v13, 0x0

    .line 229
    invoke-direct/range {v8 .. v13}, La/l19;-><init>(La/gmq;La/clz;La/nz9;La/yje;S)V

    .line 230
    .line 231
    .line 232
    invoke-static {v0, v12, v12, v8, v5}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1}, La/qz9;->S0()La/d4a;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    invoke-virtual {v0}, La/d4a;->A()V

    .line 240
    .line 241
    .line 242
    :goto_0
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 243
    .line 244
    goto :goto_1

    .line 245
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 246
    .line 247
    .line 248
    :goto_1
    return-object v8

    .line 249
    :pswitch_0
    const-string v1, "actionDialogManager"

    .line 250
    .line 251
    iget-object v2, v0, La/nz9;->k:La/qz9;

    .line 252
    .line 253
    iget-object v3, v2, La/qz9;->e2:La/yzn0;

    .line 254
    .line 255
    iget-object v0, v0, La/nz9;->j:Ljava/lang/Object;

    .line 256
    .line 257
    check-cast v0, La/a1k0;

    .line 258
    .line 259
    sget-object v4, La/wne;->a:La/wne;

    .line 260
    .line 261
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    if-eqz v0, :cond_10

    .line 265
    .line 266
    instance-of v4, v0, La/x0k0;

    .line 267
    .line 268
    if-eqz v4, :cond_4

    .line 269
    .line 270
    check-cast v0, La/x0k0;

    .line 271
    .line 272
    iget-object v1, v0, La/x0k0;->a:Landroid/graphics/Bitmap;

    .line 273
    .line 274
    iget-object v0, v0, La/x0k0;->b:Ljava/lang/String;

    .line 275
    .line 276
    sget-object v4, La/qz9;->t2:La/kl5;

    .line 277
    .line 278
    :try_start_0
    new-instance v4, Ljava/io/File;

    .line 279
    .line 280
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 281
    .line 282
    .line 283
    move-result-object v5

    .line 284
    invoke-virtual {v5}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    invoke-direct {v4, v5, v0}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 289
    .line 290
    .line 291
    new-instance v5, Ljava/io/FileOutputStream;

    .line 292
    .line 293
    invoke-direct {v5, v4}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 294
    .line 295
    .line 296
    :try_start_1
    sget-object v0, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    .line 297
    .line 298
    iget-object v8, v2, La/qz9;->d2:La/yzn0;

    .line 299
    .line 300
    sget-object v9, La/qz9;->u2:[La/iiy;

    .line 301
    .line 302
    aget-object v10, v9, v7

    .line 303
    .line 304
    invoke-virtual {v8, v2, v10}, La/yzn0;->k(Landroidx/fragment/app/Fragment;La/iiy;)Ljava/io/Serializable;

    .line 305
    .line 306
    .line 307
    move-result-object v8

    .line 308
    check-cast v8, La/kkd0;

    .line 309
    .line 310
    iget-byte v8, v8, La/kkd0;->a:B

    .line 311
    .line 312
    invoke-virtual {v1, v0, v8, v5}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 313
    .line 314
    .line 315
    :try_start_2
    invoke-virtual {v5}, Ljava/io/FileOutputStream;->close()V

    .line 316
    .line 317
    .line 318
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 327
    .line 328
    .line 329
    move-result-object v1

    .line 330
    new-instance v5, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 333
    .line 334
    .line 335
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 336
    .line 337
    .line 338
    const-string v1, ".provider"

    .line 339
    .line 340
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 344
    .line 345
    .line 346
    move-result-object v1

    .line 347
    invoke-static {v0, v4, v1}, Landroidx/core/content/FileProvider;->c(Landroid/content/Context;Ljava/io/File;Ljava/lang/String;)Landroid/net/Uri;

    .line 348
    .line 349
    .line 350
    move-result-object v0

    .line 351
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 352
    .line 353
    new-instance v1, La/l2a;

    .line 354
    .line 355
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v0

    .line 359
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    invoke-virtual {v4}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    invoke-direct {v1, v0, v4}, La/l2a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 370
    .line 371
    .line 372
    aget-object v0, v9, v6

    .line 373
    .line 374
    new-instance v4, La/j0g0;

    .line 375
    .line 376
    invoke-direct {v4, v1}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 377
    .line 378
    .line 379
    invoke-virtual {v3, v2, v0, v4}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 380
    .line 381
    .line 382
    invoke-virtual {v2}, La/qz9;->U0()V

    .line 383
    .line 384
    .line 385
    invoke-virtual {v2, v7, v7, v7}, La/sik;->z0(ZZZ)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 386
    .line 387
    .line 388
    goto/16 :goto_3

    .line 389
    .line 390
    :catch_0
    move-exception v0

    .line 391
    goto :goto_2

    .line 392
    :catchall_0
    move-exception v0

    .line 393
    move-object v1, v0

    .line 394
    :try_start_3
    throw v1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 395
    :catchall_1
    move-exception v0

    .line 396
    :try_start_4
    invoke-static {v5, v1}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 397
    .line 398
    .line 399
    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 400
    :goto_2
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 401
    .line 402
    new-instance v1, La/g0g0;

    .line 403
    .line 404
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 405
    .line 406
    .line 407
    sget-object v0, La/qz9;->u2:[La/iiy;

    .line 408
    .line 409
    aget-object v0, v0, v6

    .line 410
    .line 411
    new-instance v4, La/j0g0;

    .line 412
    .line 413
    invoke-direct {v4, v1}, La/j0g0;-><init>(Ljava/lang/Object;)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v3, v2, v0, v4}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2}, La/qz9;->S0()La/d4a;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    sget-object v1, La/u0k0;->a:La/u0k0;

    .line 424
    .line 425
    invoke-virtual {v0, v1}, La/d4a;->C(La/a1k0;)V

    .line 426
    .line 427
    .line 428
    goto/16 :goto_3

    .line 429
    .line 430
    :cond_4
    instance-of v3, v0, La/r0k0;

    .line 431
    .line 432
    if-eqz v3, :cond_5

    .line 433
    .line 434
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 435
    .line 436
    invoke-virtual {v2}, La/qz9;->R0()La/rz9;

    .line 437
    .line 438
    .line 439
    move-result-object v0

    .line 440
    iget-object v0, v0, La/rz9;->m:Landroidx/appcompat/widget/AppCompatImageView;

    .line 441
    .line 442
    invoke-virtual {v2}, La/qz9;->R0()La/rz9;

    .line 443
    .line 444
    .line 445
    move-result-object v1

    .line 446
    iget-object v1, v1, La/rz9;->e:Landroidx/camera/view/PreviewView;

    .line 447
    .line 448
    invoke-virtual {v1}, Landroidx/camera/view/PreviewView;->getBitmap()Landroid/graphics/Bitmap;

    .line 449
    .line 450
    .line 451
    move-result-object v1

    .line 452
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 453
    .line 454
    .line 455
    iget-object v0, v2, La/qz9;->n2:La/a8z;

    .line 456
    .line 457
    invoke-interface {v0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 458
    .line 459
    .line 460
    move-result-object v0

    .line 461
    check-cast v0, La/mzw;

    .line 462
    .line 463
    iget-object v1, v2, La/qz9;->h2:La/a8z;

    .line 464
    .line 465
    invoke-interface {v1}, La/a8z;->getValue()Ljava/lang/Object;

    .line 466
    .line 467
    .line 468
    move-result-object v1

    .line 469
    check-cast v1, Ljava/util/concurrent/ExecutorService;

    .line 470
    .line 471
    iget-object v2, v2, La/qz9;->s2:La/a8z;

    .line 472
    .line 473
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    check-cast v2, La/mz9;

    .line 478
    .line 479
    invoke-virtual {v0, v1, v2}, La/mzw;->K(Ljava/util/concurrent/Executor;La/mz9;)V

    .line 480
    .line 481
    .line 482
    goto/16 :goto_3

    .line 483
    .line 484
    :cond_5
    instance-of v3, v0, La/v0k0;

    .line 485
    .line 486
    const v4, 0x7f1303fb

    .line 487
    .line 488
    .line 489
    if-eqz v3, :cond_7

    .line 490
    .line 491
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 492
    .line 493
    iget-object v0, v2, La/qz9;->c2:La/ii;

    .line 494
    .line 495
    if-eqz v0, :cond_6

    .line 496
    .line 497
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 498
    .line 499
    invoke-virtual {v2, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 500
    .line 501
    .line 502
    move-result-object v10

    .line 503
    const v1, 0x7f130f39

    .line 504
    .line 505
    .line 506
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 507
    .line 508
    .line 509
    move-result-object v11

    .line 510
    const v1, 0x7f130ec2

    .line 511
    .line 512
    .line 513
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 514
    .line 515
    .line 516
    move-result-object v12

    .line 517
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 518
    .line 519
    .line 520
    const v1, 0x7f1307f8

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 524
    .line 525
    .line 526
    move-result-object v13

    .line 527
    const-string v15, "REQUEST_KEY_PERMISSION_DIALOG"

    .line 528
    .line 529
    sget-object v18, La/n12;->b:La/n12;

    .line 530
    .line 531
    const/16 v19, 0x0

    .line 532
    .line 533
    const/16 v20, 0x5d0

    .line 534
    .line 535
    const/4 v14, 0x0

    .line 536
    const/16 v16, 0x0

    .line 537
    .line 538
    const/16 v17, 0x0

    .line 539
    .line 540
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 541
    .line 542
    .line 543
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 544
    .line 545
    .line 546
    move-result-object v1

    .line 547
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 548
    .line 549
    .line 550
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 551
    .line 552
    .line 553
    goto/16 :goto_3

    .line 554
    .line 555
    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 556
    .line 557
    .line 558
    throw v8

    .line 559
    :cond_7
    instance-of v3, v0, La/q0k0;

    .line 560
    .line 561
    const v5, 0x7f130e5d

    .line 562
    .line 563
    .line 564
    if-eqz v3, :cond_9

    .line 565
    .line 566
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 567
    .line 568
    iget-object v0, v2, La/qz9;->c2:La/ii;

    .line 569
    .line 570
    if-eqz v0, :cond_8

    .line 571
    .line 572
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 573
    .line 574
    invoke-virtual {v2, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 575
    .line 576
    .line 577
    move-result-object v10

    .line 578
    const v1, 0x7f13032b

    .line 579
    .line 580
    .line 581
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 582
    .line 583
    .line 584
    move-result-object v11

    .line 585
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 586
    .line 587
    .line 588
    move-result-object v12

    .line 589
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 590
    .line 591
    .line 592
    const-string v15, "REQUEST_KEY_CAMERA_UNAVAILABLE_DIALOG"

    .line 593
    .line 594
    sget-object v18, La/n12;->b:La/n12;

    .line 595
    .line 596
    const/16 v19, 0x0

    .line 597
    .line 598
    const/16 v20, 0x5d8

    .line 599
    .line 600
    const/4 v13, 0x0

    .line 601
    const/4 v14, 0x0

    .line 602
    const/16 v16, 0x0

    .line 603
    .line 604
    const/16 v17, 0x0

    .line 605
    .line 606
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 607
    .line 608
    .line 609
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 610
    .line 611
    .line 612
    move-result-object v1

    .line 613
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 614
    .line 615
    .line 616
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 617
    .line 618
    .line 619
    goto/16 :goto_3

    .line 620
    .line 621
    :cond_8
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 622
    .line 623
    .line 624
    throw v8

    .line 625
    :cond_9
    instance-of v3, v0, La/t0k0;

    .line 626
    .line 627
    if-eqz v3, :cond_b

    .line 628
    .line 629
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 630
    .line 631
    iget-object v0, v2, La/qz9;->c2:La/ii;

    .line 632
    .line 633
    if-eqz v0, :cond_a

    .line 634
    .line 635
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 636
    .line 637
    invoke-virtual {v2, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v10

    .line 641
    const v1, 0x7f130328

    .line 642
    .line 643
    .line 644
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 645
    .line 646
    .line 647
    move-result-object v11

    .line 648
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 649
    .line 650
    .line 651
    move-result-object v12

    .line 652
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 653
    .line 654
    .line 655
    sget-object v18, La/n12;->b:La/n12;

    .line 656
    .line 657
    const/16 v19, 0x0

    .line 658
    .line 659
    const/16 v20, 0x5f8

    .line 660
    .line 661
    const/4 v13, 0x0

    .line 662
    const/4 v14, 0x0

    .line 663
    const/4 v15, 0x0

    .line 664
    const/16 v16, 0x0

    .line 665
    .line 666
    const/16 v17, 0x0

    .line 667
    .line 668
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 672
    .line 673
    .line 674
    move-result-object v1

    .line 675
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 676
    .line 677
    .line 678
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 679
    .line 680
    .line 681
    goto :goto_3

    .line 682
    :cond_a
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 683
    .line 684
    .line 685
    throw v8

    .line 686
    :cond_b
    instance-of v3, v0, La/u0k0;

    .line 687
    .line 688
    if-eqz v3, :cond_d

    .line 689
    .line 690
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 691
    .line 692
    iget-object v0, v2, La/qz9;->c2:La/ii;

    .line 693
    .line 694
    if-eqz v0, :cond_c

    .line 695
    .line 696
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 697
    .line 698
    invoke-virtual {v2, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 699
    .line 700
    .line 701
    move-result-object v10

    .line 702
    const v1, 0x7f130329

    .line 703
    .line 704
    .line 705
    invoke-virtual {v2, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 706
    .line 707
    .line 708
    move-result-object v11

    .line 709
    invoke-virtual {v2, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 710
    .line 711
    .line 712
    move-result-object v12

    .line 713
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 714
    .line 715
    .line 716
    sget-object v18, La/n12;->b:La/n12;

    .line 717
    .line 718
    const/16 v19, 0x0

    .line 719
    .line 720
    const/16 v20, 0x5f8

    .line 721
    .line 722
    const/4 v13, 0x0

    .line 723
    const/4 v14, 0x0

    .line 724
    const/4 v15, 0x0

    .line 725
    const/16 v16, 0x0

    .line 726
    .line 727
    const/16 v17, 0x0

    .line 728
    .line 729
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 730
    .line 731
    .line 732
    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 733
    .line 734
    .line 735
    move-result-object v1

    .line 736
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 737
    .line 738
    .line 739
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 740
    .line 741
    .line 742
    goto :goto_3

    .line 743
    :cond_c
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 744
    .line 745
    .line 746
    throw v8

    .line 747
    :cond_d
    instance-of v0, v0, La/y0k0;

    .line 748
    .line 749
    if-eqz v0, :cond_10

    .line 750
    .line 751
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 752
    .line 753
    invoke-virtual {v2}, La/qz9;->S0()La/d4a;

    .line 754
    .line 755
    .line 756
    move-result-object v0

    .line 757
    invoke-virtual {v2}, La/qz9;->R0()La/rz9;

    .line 758
    .line 759
    .line 760
    move-result-object v1

    .line 761
    iget-object v1, v1, La/rz9;->e:Landroidx/camera/view/PreviewView;

    .line 762
    .line 763
    invoke-virtual {v1}, Landroidx/camera/view/PreviewView;->getBitmap()Landroid/graphics/Bitmap;

    .line 764
    .line 765
    .line 766
    move-result-object v1

    .line 767
    if-eqz v1, :cond_e

    .line 768
    .line 769
    const v2, 0x3da3d70a    # 0.08f

    .line 770
    .line 771
    .line 772
    invoke-static {v1, v2}, La/wb;->G(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    .line 773
    .line 774
    .line 775
    move-result-object v8

    .line 776
    :cond_e
    move-object v1, v8

    .line 777
    iget-object v0, v0, La/d4a;->k:La/p7m0;

    .line 778
    .line 779
    :cond_f
    invoke-virtual {v0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 780
    .line 781
    .line 782
    move-result-object v2

    .line 783
    move-object v3, v2

    .line 784
    check-cast v3, Landroid/graphics/Bitmap;

    .line 785
    .line 786
    invoke-virtual {v0, v2, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 787
    .line 788
    .line 789
    move-result v2

    .line 790
    if-eqz v2, :cond_f

    .line 791
    .line 792
    :goto_3
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 793
    .line 794
    goto :goto_4

    .line 795
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 796
    .line 797
    .line 798
    :goto_4
    return-object v8

    .line 799
    :pswitch_1
    iget-object v1, v0, La/nz9;->j:Ljava/lang/Object;

    .line 800
    .line 801
    check-cast v1, La/wub0;

    .line 802
    .line 803
    sget-object v2, La/wne;->a:La/wne;

    .line 804
    .line 805
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 806
    .line 807
    .line 808
    iget-object v0, v0, La/nz9;->k:La/qz9;

    .line 809
    .line 810
    invoke-virtual {v0}, La/qz9;->R0()La/rz9;

    .line 811
    .line 812
    .line 813
    move-result-object v0

    .line 814
    iget-boolean v2, v1, La/wub0;->c:Z

    .line 815
    .line 816
    if-eqz v2, :cond_11

    .line 817
    .line 818
    iget-object v4, v0, La/rz9;->h:Landroidx/appcompat/widget/AppCompatImageView;

    .line 819
    .line 820
    iget-object v5, v1, La/wub0;->a:Landroid/graphics/Bitmap;

    .line 821
    .line 822
    invoke-virtual {v4, v5}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 823
    .line 824
    .line 825
    :cond_11
    iget-object v4, v0, La/rz9;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 826
    .line 827
    iget-object v0, v0, La/rz9;->m:Landroidx/appcompat/widget/AppCompatImageView;

    .line 828
    .line 829
    if-eqz v2, :cond_12

    .line 830
    .line 831
    move v5, v7

    .line 832
    goto :goto_5

    .line 833
    :cond_12
    move v5, v3

    .line 834
    :goto_5
    invoke-virtual {v4, v5}, Landroid/view/View;->setVisibility(I)V

    .line 835
    .line 836
    .line 837
    iget-boolean v1, v1, La/wub0;->d:Z

    .line 838
    .line 839
    if-eqz v1, :cond_13

    .line 840
    .line 841
    move v3, v7

    .line 842
    :cond_13
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 843
    .line 844
    .line 845
    if-eqz v2, :cond_14

    .line 846
    .line 847
    invoke-virtual {v0, v8}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 848
    .line 849
    .line 850
    :cond_14
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 851
    .line 852
    return-object v0

    .line 853
    :pswitch_2
    iget-object v1, v0, La/nz9;->j:Ljava/lang/Object;

    .line 854
    .line 855
    check-cast v1, Landroid/graphics/Bitmap;

    .line 856
    .line 857
    sget-object v2, La/wne;->a:La/wne;

    .line 858
    .line 859
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 860
    .line 861
    .line 862
    iget-object v0, v0, La/nz9;->k:La/qz9;

    .line 863
    .line 864
    invoke-virtual {v0}, La/qz9;->R0()La/rz9;

    .line 865
    .line 866
    .line 867
    move-result-object v0

    .line 868
    iget-object v0, v0, La/rz9;->j:Landroidx/appcompat/widget/AppCompatImageView;

    .line 869
    .line 870
    invoke-virtual {v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 871
    .line 872
    .line 873
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 874
    .line 875
    return-object v0

    .line 876
    :pswitch_3
    iget-object v1, v0, La/nz9;->j:Ljava/lang/Object;

    .line 877
    .line 878
    check-cast v1, La/ike;

    .line 879
    .line 880
    sget-object v9, La/wne;->a:La/wne;

    .line 881
    .line 882
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 883
    .line 884
    .line 885
    iget-object v9, v0, La/nz9;->k:La/qz9;

    .line 886
    .line 887
    sget-object v10, La/qz9;->t2:La/kl5;

    .line 888
    .line 889
    iget-object v9, v9, La/qz9;->n2:La/a8z;

    .line 890
    .line 891
    invoke-interface {v9}, La/a8z;->getValue()Ljava/lang/Object;

    .line 892
    .line 893
    .line 894
    move-result-object v9

    .line 895
    check-cast v9, La/mzw;

    .line 896
    .line 897
    iget v10, v1, La/ike;->c:I

    .line 898
    .line 899
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 900
    .line 901
    .line 902
    const-string v11, "ImageCapture"

    .line 903
    .line 904
    new-instance v12, Ljava/lang/StringBuilder;

    .line 905
    .line 906
    const-string v13, "setFlashMode: flashMode = "

    .line 907
    .line 908
    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 909
    .line 910
    .line 911
    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 912
    .line 913
    .line 914
    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 915
    .line 916
    .line 917
    move-result-object v12

    .line 918
    invoke-static {v11, v12}, La/l8x;->U(Ljava/lang/String;Ljava/lang/String;)V

    .line 919
    .line 920
    .line 921
    if-eqz v10, :cond_19

    .line 922
    .line 923
    if-eq v10, v6, :cond_19

    .line 924
    .line 925
    const/4 v6, 0x2

    .line 926
    if-eq v10, v6, :cond_19

    .line 927
    .line 928
    if-ne v10, v5, :cond_18

    .line 929
    .line 930
    iget-object v5, v9, La/mzw;->w:La/r7h0;

    .line 931
    .line 932
    iget-object v5, v5, La/r7h0;->a:La/kzw;

    .line 933
    .line 934
    if-eqz v5, :cond_17

    .line 935
    .line 936
    invoke-virtual {v9}, La/fot0;->d()La/s0a;

    .line 937
    .line 938
    .line 939
    move-result-object v5

    .line 940
    if-eqz v5, :cond_19

    .line 941
    .line 942
    invoke-virtual {v9}, La/fot0;->d()La/s0a;

    .line 943
    .line 944
    .line 945
    move-result-object v5

    .line 946
    if-eqz v5, :cond_15

    .line 947
    .line 948
    invoke-interface {v5}, La/lx9;->a()La/j0a;

    .line 949
    .line 950
    .line 951
    move-result-object v2

    .line 952
    invoke-interface {v2}, La/j0a;->h()I

    .line 953
    .line 954
    .line 955
    move-result v2

    .line 956
    :cond_15
    if-nez v2, :cond_16

    .line 957
    .line 958
    goto :goto_6

    .line 959
    :cond_16
    const-string v0, "Not a front camera despite setting FLASH_MODE_SCREEN"

    .line 960
    .line 961
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 962
    .line 963
    .line 964
    goto/16 :goto_a

    .line 965
    .line 966
    :cond_17
    const-string v0, "A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first."

    .line 967
    .line 968
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 969
    .line 970
    .line 971
    goto/16 :goto_a

    .line 972
    .line 973
    :cond_18
    const-string v0, "Invalid flash mode: "

    .line 974
    .line 975
    invoke-static {v10, v0}, La/twn;->m(ILjava/lang/String;)Ljava/lang/String;

    .line 976
    .line 977
    .line 978
    move-result-object v0

    .line 979
    invoke-static {v0}, La/jf4;->o(Ljava/lang/String;)V

    .line 980
    .line 981
    .line 982
    goto/16 :goto_a

    .line 983
    .line 984
    :cond_19
    :goto_6
    iget-object v5, v9, La/mzw;->s:Ljava/util/concurrent/atomic/AtomicReference;

    .line 985
    .line 986
    monitor-enter v5

    .line 987
    :try_start_5
    iput v10, v9, La/mzw;->u:I

    .line 988
    .line 989
    invoke-virtual {v9}, La/mzw;->L()V

    .line 990
    .line 991
    .line 992
    monitor-exit v5
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 993
    iget-object v2, v0, La/nz9;->k:La/qz9;

    .line 994
    .line 995
    invoke-virtual {v2}, La/qz9;->R0()La/rz9;

    .line 996
    .line 997
    .line 998
    move-result-object v2

    .line 999
    iget-object v2, v2, La/rz9;->i:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 1000
    .line 1001
    iget v5, v1, La/ike;->b:I

    .line 1002
    .line 1003
    invoke-virtual {v2, v5}, Landroidx/appcompat/widget/AppCompatImageButton;->setImageResource(I)V

    .line 1004
    .line 1005
    .line 1006
    iget-object v2, v0, La/nz9;->k:La/qz9;

    .line 1007
    .line 1008
    iget-object v2, v2, La/qz9;->q2:La/okz;

    .line 1009
    .line 1010
    if-eqz v2, :cond_1a

    .line 1011
    .line 1012
    iget-object v2, v2, La/okz;->c:La/t3a;

    .line 1013
    .line 1014
    iget-object v2, v2, La/t3a;->a:La/ap;

    .line 1015
    .line 1016
    iget-object v2, v2, La/ap;->c:La/yo;

    .line 1017
    .line 1018
    iget v5, v1, La/ike;->e:F

    .line 1019
    .line 1020
    invoke-virtual {v2, v5}, La/yo;->d(F)La/ig00;

    .line 1021
    .line 1022
    .line 1023
    :cond_1a
    iget-object v2, v0, La/nz9;->k:La/qz9;

    .line 1024
    .line 1025
    invoke-virtual {v2}, La/qz9;->R0()La/rz9;

    .line 1026
    .line 1027
    .line 1028
    move-result-object v2

    .line 1029
    iget-object v2, v2, La/rz9;->n:Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 1030
    .line 1031
    iget v5, v1, La/ike;->d:I

    .line 1032
    .line 1033
    invoke-virtual {v2, v5}, Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;->setSelectedPosition(I)V

    .line 1034
    .line 1035
    .line 1036
    iget-object v2, v0, La/nz9;->k:La/qz9;

    .line 1037
    .line 1038
    invoke-virtual {v2}, La/qz9;->R0()La/rz9;

    .line 1039
    .line 1040
    .line 1041
    move-result-object v2

    .line 1042
    iget-object v2, v2, La/rz9;->n:Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 1043
    .line 1044
    iget-boolean v5, v1, La/ike;->l:Z

    .line 1045
    .line 1046
    invoke-virtual {v2, v5}, Landroid/view/View;->setClickable(Z)V

    .line 1047
    .line 1048
    .line 1049
    iget-object v2, v0, La/nz9;->k:La/qz9;

    .line 1050
    .line 1051
    invoke-virtual {v2}, La/qz9;->R0()La/rz9;

    .line 1052
    .line 1053
    .line 1054
    move-result-object v2

    .line 1055
    iget-object v2, v2, La/rz9;->k:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 1056
    .line 1057
    iget-boolean v5, v1, La/ike;->j:Z

    .line 1058
    .line 1059
    invoke-virtual {v2, v5}, Landroid/view/View;->setClickable(Z)V

    .line 1060
    .line 1061
    .line 1062
    iget-object v2, v0, La/nz9;->k:La/qz9;

    .line 1063
    .line 1064
    invoke-virtual {v2}, La/qz9;->R0()La/rz9;

    .line 1065
    .line 1066
    .line 1067
    move-result-object v2

    .line 1068
    iget-object v2, v2, La/rz9;->i:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 1069
    .line 1070
    iget-boolean v5, v1, La/ike;->i:Z

    .line 1071
    .line 1072
    invoke-virtual {v2, v5}, Landroid/view/View;->setClickable(Z)V

    .line 1073
    .line 1074
    .line 1075
    iget-object v2, v0, La/nz9;->k:La/qz9;

    .line 1076
    .line 1077
    invoke-virtual {v2}, La/qz9;->R0()La/rz9;

    .line 1078
    .line 1079
    .line 1080
    move-result-object v2

    .line 1081
    iget-object v2, v2, La/rz9;->n:Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 1082
    .line 1083
    iget-boolean v5, v1, La/ike;->f:Z

    .line 1084
    .line 1085
    if-nez v5, :cond_1b

    .line 1086
    .line 1087
    move v5, v4

    .line 1088
    goto :goto_7

    .line 1089
    :cond_1b
    move v5, v7

    .line 1090
    :goto_7
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1091
    .line 1092
    .line 1093
    iget-object v2, v0, La/nz9;->k:La/qz9;

    .line 1094
    .line 1095
    invoke-virtual {v2}, La/qz9;->R0()La/rz9;

    .line 1096
    .line 1097
    .line 1098
    move-result-object v2

    .line 1099
    iget-object v2, v2, La/rz9;->k:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 1100
    .line 1101
    iget-boolean v5, v1, La/ike;->h:Z

    .line 1102
    .line 1103
    if-nez v5, :cond_1c

    .line 1104
    .line 1105
    move v5, v4

    .line 1106
    goto :goto_8

    .line 1107
    :cond_1c
    move v5, v7

    .line 1108
    :goto_8
    invoke-virtual {v2, v5}, Landroid/view/View;->setVisibility(I)V

    .line 1109
    .line 1110
    .line 1111
    iget-object v2, v0, La/nz9;->k:La/qz9;

    .line 1112
    .line 1113
    invoke-virtual {v2}, La/qz9;->R0()La/rz9;

    .line 1114
    .line 1115
    .line 1116
    move-result-object v2

    .line 1117
    iget-object v2, v2, La/rz9;->i:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 1118
    .line 1119
    iget-boolean v5, v1, La/ike;->g:Z

    .line 1120
    .line 1121
    if-nez v5, :cond_1d

    .line 1122
    .line 1123
    goto :goto_9

    .line 1124
    :cond_1d
    move v4, v7

    .line 1125
    :goto_9
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    .line 1126
    .line 1127
    .line 1128
    iget-object v0, v0, La/nz9;->k:La/qz9;

    .line 1129
    .line 1130
    invoke-virtual {v0}, La/qz9;->R0()La/rz9;

    .line 1131
    .line 1132
    .line 1133
    move-result-object v0

    .line 1134
    iget-object v0, v0, La/rz9;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 1135
    .line 1136
    iget-boolean v1, v1, La/ike;->a:Z

    .line 1137
    .line 1138
    if-eqz v1, :cond_1e

    .line 1139
    .line 1140
    move v3, v7

    .line 1141
    :cond_1e
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1142
    .line 1143
    .line 1144
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1145
    .line 1146
    :goto_a
    return-object v8

    .line 1147
    :catchall_2
    move-exception v0

    .line 1148
    :try_start_6
    monitor-exit v5
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    .line 1149
    throw v0

    .line 1150
    :pswitch_4
    iget-object v1, v0, La/nz9;->j:Ljava/lang/Object;

    .line 1151
    .line 1152
    check-cast v1, La/sa80;

    .line 1153
    .line 1154
    sget-object v3, La/wne;->a:La/wne;

    .line 1155
    .line 1156
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1157
    .line 1158
    .line 1159
    iget-object v0, v0, La/nz9;->k:La/qz9;

    .line 1160
    .line 1161
    sget-object v3, La/qz9;->t2:La/kl5;

    .line 1162
    .line 1163
    iget-object v3, v0, La/qz9;->o2:La/a8z;

    .line 1164
    .line 1165
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1166
    .line 1167
    .line 1168
    move-result-object v3

    .line 1169
    check-cast v3, La/jyw;

    .line 1170
    .line 1171
    iget v4, v1, La/sa80;->d:I

    .line 1172
    .line 1173
    iget-object v5, v3, La/fot0;->i:La/fpt0;

    .line 1174
    .line 1175
    check-cast v5, La/w0x;

    .line 1176
    .line 1177
    invoke-interface {v5, v2}, La/w0x;->s(I)I

    .line 1178
    .line 1179
    .line 1180
    move-result v5

    .line 1181
    if-eq v5, v2, :cond_20

    .line 1182
    .line 1183
    if-eq v5, v4, :cond_1f

    .line 1184
    .line 1185
    goto :goto_b

    .line 1186
    :cond_1f
    move v6, v7

    .line 1187
    goto/16 :goto_e

    .line 1188
    .line 1189
    :cond_20
    :goto_b
    iget-object v5, v3, La/fot0;->g:La/fpt0;

    .line 1190
    .line 1191
    invoke-virtual {v3, v5}, La/fot0;->n(La/drd;)La/ept0;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v5

    .line 1195
    invoke-interface {v5}, La/ept0;->e()La/fpt0;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v9

    .line 1199
    check-cast v9, La/w0x;

    .line 1200
    .line 1201
    invoke-interface {v9, v2}, La/w0x;->s(I)I

    .line 1202
    .line 1203
    .line 1204
    move-result v10

    .line 1205
    if-eq v10, v2, :cond_21

    .line 1206
    .line 1207
    if-eq v10, v4, :cond_22

    .line 1208
    .line 1209
    :cond_21
    move-object v11, v5

    .line 1210
    check-cast v11, La/gyw;

    .line 1211
    .line 1212
    iget-byte v12, v11, La/gyw;->a:B

    .line 1213
    .line 1214
    packed-switch v12, :pswitch_data_1

    .line 1215
    .line 1216
    .line 1217
    iget-object v11, v11, La/gyw;->b:La/wy40;

    .line 1218
    .line 1219
    sget-object v12, La/w0x;->l0:La/u15;

    .line 1220
    .line 1221
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v13

    .line 1225
    invoke-virtual {v11, v12, v13}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 1226
    .line 1227
    .line 1228
    sget-object v12, La/w0x;->m0:La/u15;

    .line 1229
    .line 1230
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1231
    .line 1232
    .line 1233
    move-result-object v13

    .line 1234
    invoke-virtual {v11, v12, v13}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 1235
    .line 1236
    .line 1237
    goto :goto_c

    .line 1238
    :pswitch_5
    iget-object v11, v11, La/gyw;->b:La/wy40;

    .line 1239
    .line 1240
    sget-object v12, La/w0x;->l0:La/u15;

    .line 1241
    .line 1242
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1243
    .line 1244
    .line 1245
    move-result-object v13

    .line 1246
    invoke-virtual {v11, v12, v13}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 1247
    .line 1248
    .line 1249
    goto :goto_c

    .line 1250
    :pswitch_6
    iget-object v11, v11, La/gyw;->b:La/wy40;

    .line 1251
    .line 1252
    sget-object v12, La/w0x;->l0:La/u15;

    .line 1253
    .line 1254
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1255
    .line 1256
    .line 1257
    move-result-object v13

    .line 1258
    invoke-virtual {v11, v12, v13}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 1259
    .line 1260
    .line 1261
    :cond_22
    :goto_c
    if-eq v10, v2, :cond_24

    .line 1262
    .line 1263
    if-eq v4, v2, :cond_24

    .line 1264
    .line 1265
    if-ne v10, v4, :cond_23

    .line 1266
    .line 1267
    goto :goto_d

    .line 1268
    :cond_23
    invoke-static {v10}, La/hp4;->K(I)I

    .line 1269
    .line 1270
    .line 1271
    move-result v2

    .line 1272
    invoke-static {v4}, La/hp4;->K(I)I

    .line 1273
    .line 1274
    .line 1275
    move-result v4

    .line 1276
    sub-int/2addr v4, v2

    .line 1277
    invoke-static {v4}, Ljava/lang/Math;->abs(I)I

    .line 1278
    .line 1279
    .line 1280
    move-result v2

    .line 1281
    rem-int/lit16 v2, v2, 0xb4

    .line 1282
    .line 1283
    const/16 v4, 0x5a

    .line 1284
    .line 1285
    if-ne v2, v4, :cond_24

    .line 1286
    .line 1287
    sget-object v2, La/w0x;->o0:La/u15;

    .line 1288
    .line 1289
    invoke-interface {v9, v2, v8}, La/qae0;->e(La/u15;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1290
    .line 1291
    .line 1292
    move-result-object v2

    .line 1293
    check-cast v2, Landroid/util/Size;

    .line 1294
    .line 1295
    if-eqz v2, :cond_24

    .line 1296
    .line 1297
    move-object v4, v5

    .line 1298
    check-cast v4, La/gyw;

    .line 1299
    .line 1300
    new-instance v8, Landroid/util/Size;

    .line 1301
    .line 1302
    invoke-virtual {v2}, Landroid/util/Size;->getHeight()I

    .line 1303
    .line 1304
    .line 1305
    move-result v9

    .line 1306
    invoke-virtual {v2}, Landroid/util/Size;->getWidth()I

    .line 1307
    .line 1308
    .line 1309
    move-result v2

    .line 1310
    invoke-direct {v8, v9, v2}, Landroid/util/Size;-><init>(II)V

    .line 1311
    .line 1312
    .line 1313
    iget-byte v2, v4, La/gyw;->a:B

    .line 1314
    .line 1315
    packed-switch v2, :pswitch_data_2

    .line 1316
    .line 1317
    .line 1318
    iget-object v2, v4, La/gyw;->b:La/wy40;

    .line 1319
    .line 1320
    sget-object v4, La/w0x;->o0:La/u15;

    .line 1321
    .line 1322
    invoke-virtual {v2, v4, v8}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 1323
    .line 1324
    .line 1325
    goto :goto_d

    .line 1326
    :pswitch_7
    iget-object v2, v4, La/gyw;->b:La/wy40;

    .line 1327
    .line 1328
    sget-object v4, La/w0x;->o0:La/u15;

    .line 1329
    .line 1330
    invoke-virtual {v2, v4, v8}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 1331
    .line 1332
    .line 1333
    goto :goto_d

    .line 1334
    :pswitch_8
    iget-object v2, v4, La/gyw;->b:La/wy40;

    .line 1335
    .line 1336
    sget-object v4, La/w0x;->o0:La/u15;

    .line 1337
    .line 1338
    invoke-virtual {v2, v4, v8}, La/wy40;->y(La/u15;Ljava/lang/Object;)V

    .line 1339
    .line 1340
    .line 1341
    :cond_24
    :goto_d
    invoke-interface {v5}, La/ept0;->e()La/fpt0;

    .line 1342
    .line 1343
    .line 1344
    move-result-object v2

    .line 1345
    iput-object v2, v3, La/fot0;->g:La/fpt0;

    .line 1346
    .line 1347
    invoke-virtual {v3}, La/fot0;->d()La/s0a;

    .line 1348
    .line 1349
    .line 1350
    move-result-object v2

    .line 1351
    if-nez v2, :cond_25

    .line 1352
    .line 1353
    iget-object v2, v3, La/fot0;->g:La/fpt0;

    .line 1354
    .line 1355
    iput-object v2, v3, La/fot0;->i:La/fpt0;

    .line 1356
    .line 1357
    goto :goto_e

    .line 1358
    :cond_25
    invoke-interface {v2}, La/s0a;->h()La/n0a;

    .line 1359
    .line 1360
    .line 1361
    move-result-object v2

    .line 1362
    iget-object v4, v3, La/fot0;->f:La/fpt0;

    .line 1363
    .line 1364
    iget-object v5, v3, La/fot0;->k:La/fpt0;

    .line 1365
    .line 1366
    invoke-virtual {v3, v2, v4, v5}, La/fot0;->q(La/n0a;La/fpt0;La/fpt0;)La/fpt0;

    .line 1367
    .line 1368
    .line 1369
    move-result-object v2

    .line 1370
    iput-object v2, v3, La/fot0;->i:La/fpt0;

    .line 1371
    .line 1372
    :goto_e
    if-eqz v6, :cond_26

    .line 1373
    .line 1374
    invoke-virtual {v3}, La/jyw;->J()V

    .line 1375
    .line 1376
    .line 1377
    :cond_26
    invoke-virtual {v0}, La/qz9;->R0()La/rz9;

    .line 1378
    .line 1379
    .line 1380
    move-result-object v2

    .line 1381
    iget-object v2, v2, La/rz9;->k:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 1382
    .line 1383
    invoke-static {v2, v1}, La/xcm0;->h(Landroid/view/View;La/sa80;)V

    .line 1384
    .line 1385
    .line 1386
    invoke-virtual {v0}, La/qz9;->R0()La/rz9;

    .line 1387
    .line 1388
    .line 1389
    move-result-object v2

    .line 1390
    iget-object v2, v2, La/rz9;->i:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 1391
    .line 1392
    invoke-static {v2, v1}, La/xcm0;->h(Landroid/view/View;La/sa80;)V

    .line 1393
    .line 1394
    .line 1395
    invoke-virtual {v0}, La/qz9;->R0()La/rz9;

    .line 1396
    .line 1397
    .line 1398
    move-result-object v2

    .line 1399
    iget-object v2, v2, La/rz9;->n:Lorg/xplatform/uikit/components/segmented_control/DsSegmentedGroup;

    .line 1400
    .line 1401
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1402
    .line 1403
    .line 1404
    move-result v3

    .line 1405
    :goto_f
    if-ge v7, v3, :cond_27

    .line 1406
    .line 1407
    invoke-virtual {v2, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 1408
    .line 1409
    .line 1410
    move-result-object v4

    .line 1411
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1412
    .line 1413
    .line 1414
    invoke-static {v4, v1}, La/xcm0;->h(Landroid/view/View;La/sa80;)V

    .line 1415
    .line 1416
    .line 1417
    add-int/lit8 v7, v7, 0x1

    .line 1418
    .line 1419
    goto :goto_f

    .line 1420
    :cond_27
    invoke-virtual {v0}, La/qz9;->R0()La/rz9;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v2

    .line 1424
    iget-object v2, v2, La/rz9;->c:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 1425
    .line 1426
    invoke-static {v2, v1}, La/xcm0;->h(Landroid/view/View;La/sa80;)V

    .line 1427
    .line 1428
    .line 1429
    invoke-virtual {v0}, La/qz9;->R0()La/rz9;

    .line 1430
    .line 1431
    .line 1432
    move-result-object v2

    .line 1433
    iget-object v2, v2, La/rz9;->b:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 1434
    .line 1435
    invoke-static {v2, v1}, La/xcm0;->h(Landroid/view/View;La/sa80;)V

    .line 1436
    .line 1437
    .line 1438
    invoke-virtual {v0}, La/qz9;->R0()La/rz9;

    .line 1439
    .line 1440
    .line 1441
    move-result-object v0

    .line 1442
    iget-object v0, v0, La/rz9;->f:Landroidx/appcompat/widget/AppCompatImageButton;

    .line 1443
    .line 1444
    invoke-static {v0, v1}, La/xcm0;->h(Landroid/view/View;La/sa80;)V

    .line 1445
    .line 1446
    .line 1447
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1448
    .line 1449
    return-object v0

    .line 1450
    :pswitch_9
    iget-object v1, v0, La/nz9;->k:La/qz9;

    .line 1451
    .line 1452
    iget-object v2, v1, La/qz9;->l2:La/a8z;

    .line 1453
    .line 1454
    iget-object v3, v1, La/qz9;->k2:La/a8z;

    .line 1455
    .line 1456
    iget-object v0, v0, La/nz9;->j:Ljava/lang/Object;

    .line 1457
    .line 1458
    check-cast v0, La/h4a;

    .line 1459
    .line 1460
    sget-object v4, La/wne;->a:La/wne;

    .line 1461
    .line 1462
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 1463
    .line 1464
    .line 1465
    instance-of v4, v0, La/f4a;

    .line 1466
    .line 1467
    if-eqz v4, :cond_2c

    .line 1468
    .line 1469
    sget-object v4, La/qz9;->t2:La/kl5;

    .line 1470
    .line 1471
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1472
    .line 1473
    .line 1474
    move-result-object v4

    .line 1475
    check-cast v4, La/lyb0;

    .line 1476
    .line 1477
    iget-object v4, v4, La/lyb0;->a:La/rrd;

    .line 1478
    .line 1479
    invoke-virtual {v4}, La/rrd;->C()V

    .line 1480
    .line 1481
    .line 1482
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v4

    .line 1486
    check-cast v4, La/oub0;

    .line 1487
    .line 1488
    invoke-virtual {v1}, La/qz9;->R0()La/rz9;

    .line 1489
    .line 1490
    .line 1491
    move-result-object v5

    .line 1492
    iget-object v5, v5, La/rz9;->e:Landroidx/camera/view/PreviewView;

    .line 1493
    .line 1494
    invoke-virtual {v5}, Landroidx/camera/view/PreviewView;->getSurfaceProvider()La/nub0;

    .line 1495
    .line 1496
    .line 1497
    move-result-object v5

    .line 1498
    invoke-virtual {v4, v5}, La/oub0;->H(La/nub0;)V

    .line 1499
    .line 1500
    .line 1501
    invoke-virtual {v1, v6}, La/qz9;->V0(Z)V

    .line 1502
    .line 1503
    .line 1504
    check-cast v0, La/f4a;

    .line 1505
    .line 1506
    iget-object v0, v0, La/f4a;->a:La/n2a;

    .line 1507
    .line 1508
    :try_start_7
    invoke-virtual {v1}, La/qz9;->R0()La/rz9;

    .line 1509
    .line 1510
    .line 1511
    move-result-object v4

    .line 1512
    iget-object v4, v4, La/rz9;->e:Landroidx/camera/view/PreviewView;

    .line 1513
    .line 1514
    invoke-virtual {v4}, Landroidx/camera/view/PreviewView;->getViewPort()La/wju0;

    .line 1515
    .line 1516
    .line 1517
    move-result-object v4

    .line 1518
    if-eqz v4, :cond_28

    .line 1519
    .line 1520
    move-object v8, v4

    .line 1521
    :cond_28
    if-nez v8, :cond_29

    .line 1522
    .line 1523
    iget-object v4, v1, La/qz9;->m2:La/a8z;

    .line 1524
    .line 1525
    invoke-interface {v4}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v4

    .line 1529
    move-object v8, v4

    .line 1530
    check-cast v8, La/wju0;

    .line 1531
    .line 1532
    :cond_29
    new-instance v4, La/lpt0;

    .line 1533
    .line 1534
    invoke-direct {v4}, La/lpt0;-><init>()V

    .line 1535
    .line 1536
    .line 1537
    iget-object v5, v4, La/lpt0;->b:Ljava/util/ArrayList;

    .line 1538
    .line 1539
    iput-object v8, v4, La/lpt0;->a:La/wju0;

    .line 1540
    .line 1541
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v2

    .line 1545
    check-cast v2, La/oub0;

    .line 1546
    .line 1547
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1548
    .line 1549
    .line 1550
    iget-object v2, v1, La/qz9;->o2:La/a8z;

    .line 1551
    .line 1552
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1553
    .line 1554
    .line 1555
    move-result-object v2

    .line 1556
    check-cast v2, La/jyw;

    .line 1557
    .line 1558
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1559
    .line 1560
    .line 1561
    iget-object v2, v1, La/qz9;->n2:La/a8z;

    .line 1562
    .line 1563
    invoke-interface {v2}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1564
    .line 1565
    .line 1566
    move-result-object v2

    .line 1567
    check-cast v2, La/mzw;

    .line 1568
    .line 1569
    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1570
    .line 1571
    .line 1572
    iget-object v2, v4, La/lpt0;->b:Ljava/util/ArrayList;

    .line 1573
    .line 1574
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1575
    .line 1576
    .line 1577
    move-result v5

    .line 1578
    xor-int/2addr v5, v6

    .line 1579
    const-string v6, "UseCase must not be empty."

    .line 1580
    .line 1581
    invoke-static {v6, v5}, La/z1x;->t(Ljava/lang/String;Z)V

    .line 1582
    .line 1583
    .line 1584
    iget-object v5, v4, La/lpt0;->c:Ljava/util/ArrayList;

    .line 1585
    .line 1586
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1587
    .line 1588
    .line 1589
    move-result-object v6

    .line 1590
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 1591
    .line 1592
    .line 1593
    move-result v8

    .line 1594
    if-nez v8, :cond_2b

    .line 1595
    .line 1596
    new-instance v6, La/mpt0;

    .line 1597
    .line 1598
    iget-object v4, v4, La/lpt0;->a:La/wju0;

    .line 1599
    .line 1600
    invoke-direct {v6, v4, v2, v5, v7}, La/mpt0;-><init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;B)V

    .line 1601
    .line 1602
    .line 1603
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 1604
    .line 1605
    .line 1606
    move-result-object v2

    .line 1607
    check-cast v2, La/lyb0;

    .line 1608
    .line 1609
    invoke-virtual {v2, v1, v0, v6}, La/lyb0;->a(La/clz;La/n2a;La/mpt0;)La/lx9;

    .line 1610
    .line 1611
    .line 1612
    move-result-object v0

    .line 1613
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 1614
    .line 1615
    const/16 v3, 0x18

    .line 1616
    .line 1617
    if-gt v2, v3, :cond_2a

    .line 1618
    .line 1619
    invoke-virtual {v1}, La/qz9;->R0()La/rz9;

    .line 1620
    .line 1621
    .line 1622
    move-result-object v2

    .line 1623
    iget-object v2, v2, La/rz9;->e:Landroidx/camera/view/PreviewView;

    .line 1624
    .line 1625
    invoke-virtual {v2}, Landroidx/camera/view/PreviewView;->getPreviewStreamState()La/wh00;

    .line 1626
    .line 1627
    .line 1628
    move-result-object v2

    .line 1629
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->K()La/n6r;

    .line 1630
    .line 1631
    .line 1632
    move-result-object v3

    .line 1633
    new-instance v4, La/iz9;

    .line 1634
    .line 1635
    const/4 v5, 0x7

    .line 1636
    invoke-direct {v4, v1, v5}, La/iz9;-><init>(La/qz9;B)V

    .line 1637
    .line 1638
    .line 1639
    new-instance v5, La/pz9;

    .line 1640
    .line 1641
    invoke-direct {v5, v4}, La/pz9;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 1642
    .line 1643
    .line 1644
    invoke-virtual {v2, v3, v5}, La/wh00;->e(La/clz;La/ee60;)V

    .line 1645
    .line 1646
    .line 1647
    goto :goto_10

    .line 1648
    :cond_2a
    move-object v2, v0

    .line 1649
    check-cast v2, La/okz;

    .line 1650
    .line 1651
    invoke-virtual {v2}, La/okz;->a()La/j0a;

    .line 1652
    .line 1653
    .line 1654
    move-result-object v2

    .line 1655
    check-cast v2, La/ewq;

    .line 1656
    .line 1657
    iget-object v2, v2, La/ewq;->a:La/n0a;

    .line 1658
    .line 1659
    invoke-interface {v2}, La/j0a;->b()La/wh00;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v2

    .line 1663
    new-instance v3, La/op7;

    .line 1664
    .line 1665
    move-object v4, v0

    .line 1666
    check-cast v4, La/okz;

    .line 1667
    .line 1668
    const/16 v5, 0x15

    .line 1669
    .line 1670
    invoke-direct {v3, v4, v1, v5}, La/op7;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 1671
    .line 1672
    .line 1673
    new-instance v4, La/pz9;

    .line 1674
    .line 1675
    invoke-direct {v4, v3}, La/pz9;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 1676
    .line 1677
    .line 1678
    invoke-virtual {v2, v1, v4}, La/wh00;->e(La/clz;La/ee60;)V

    .line 1679
    .line 1680
    .line 1681
    :goto_10
    check-cast v0, La/okz;

    .line 1682
    .line 1683
    iput-object v0, v1, La/qz9;->q2:La/okz;

    .line 1684
    .line 1685
    goto :goto_11

    .line 1686
    :cond_2b
    invoke-static {v6}, La/rw2;->h(Ljava/util/Iterator;)Ljava/lang/ClassCastException;

    .line 1687
    .line 1688
    .line 1689
    move-result-object v0

    .line 1690
    throw v0
    :try_end_7
    .catch Ljava/lang/Exception; {:try_start_7 .. :try_end_7} :catch_1

    .line 1691
    :catch_1
    invoke-virtual {v1}, La/qz9;->S0()La/d4a;

    .line 1692
    .line 1693
    .line 1694
    move-result-object v0

    .line 1695
    invoke-virtual {v0}, La/d4a;->w()V

    .line 1696
    .line 1697
    .line 1698
    goto :goto_11

    .line 1699
    :cond_2c
    sget-object v2, La/e4a;->a:La/e4a;

    .line 1700
    .line 1701
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1702
    .line 1703
    .line 1704
    move-result v2

    .line 1705
    if-eqz v2, :cond_2d

    .line 1706
    .line 1707
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 1708
    .line 1709
    invoke-virtual {v1, v6}, La/qz9;->V0(Z)V

    .line 1710
    .line 1711
    .line 1712
    goto :goto_11

    .line 1713
    :cond_2d
    sget-object v2, La/g4a;->a:La/g4a;

    .line 1714
    .line 1715
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1716
    .line 1717
    .line 1718
    move-result v0

    .line 1719
    if-eqz v0, :cond_2f

    .line 1720
    .line 1721
    sget-object v0, La/qz9;->t2:La/kl5;

    .line 1722
    .line 1723
    new-instance v0, Landroid/graphics/PointF;

    .line 1724
    .line 1725
    const/high16 v2, 0x3f000000    # 0.5f

    .line 1726
    .line 1727
    invoke-direct {v0, v2, v2}, Landroid/graphics/PointF;-><init>(FF)V

    .line 1728
    .line 1729
    .line 1730
    new-instance v2, La/wd40;

    .line 1731
    .line 1732
    iget v3, v0, Landroid/graphics/PointF;->x:F

    .line 1733
    .line 1734
    iget v0, v0, Landroid/graphics/PointF;->y:F

    .line 1735
    .line 1736
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1737
    .line 1738
    .line 1739
    iput v3, v2, La/wd40;->a:F

    .line 1740
    .line 1741
    iput v0, v2, La/wd40;->b:F

    .line 1742
    .line 1743
    iput-object v8, v2, La/wd40;->c:Landroid/util/Rational;

    .line 1744
    .line 1745
    new-instance v0, La/srn;

    .line 1746
    .line 1747
    invoke-direct {v0, v2}, La/srn;-><init>(La/wd40;)V

    .line 1748
    .line 1749
    .line 1750
    const-wide/16 v2, 0x7d0

    .line 1751
    .line 1752
    iput-wide v2, v0, La/srn;->a:J

    .line 1753
    .line 1754
    new-instance v2, La/srn;

    .line 1755
    .line 1756
    invoke-direct {v2, v0}, La/srn;-><init>(La/srn;)V

    .line 1757
    .line 1758
    .line 1759
    iget-object v0, v1, La/qz9;->q2:La/okz;

    .line 1760
    .line 1761
    if-eqz v0, :cond_2e

    .line 1762
    .line 1763
    iget-object v0, v0, La/okz;->c:La/t3a;

    .line 1764
    .line 1765
    iget-object v0, v0, La/t3a;->a:La/ap;

    .line 1766
    .line 1767
    iget-object v0, v0, La/ap;->c:La/yo;

    .line 1768
    .line 1769
    invoke-virtual {v0, v2}, La/yo;->c(La/srn;)La/ig00;

    .line 1770
    .line 1771
    .line 1772
    :cond_2e
    invoke-virtual {v1}, La/qz9;->R0()La/rz9;

    .line 1773
    .line 1774
    .line 1775
    move-result-object v0

    .line 1776
    iget-object v0, v0, La/rz9;->j:Landroidx/appcompat/widget/AppCompatImageView;

    .line 1777
    .line 1778
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 1779
    .line 1780
    .line 1781
    move-result-object v0

    .line 1782
    const/4 v2, 0x0

    .line 1783
    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->alpha(F)Landroid/view/ViewPropertyAnimator;

    .line 1784
    .line 1785
    .line 1786
    move-result-object v0

    .line 1787
    new-instance v2, La/jz9;

    .line 1788
    .line 1789
    invoke-direct {v2, v1, v7}, La/jz9;-><init>(La/qz9;B)V

    .line 1790
    .line 1791
    .line 1792
    invoke-virtual {v0, v2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 1793
    .line 1794
    .line 1795
    :goto_11
    sget-object v8, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 1796
    .line 1797
    goto :goto_12

    .line 1798
    :cond_2f
    invoke-static {}, La/t9f;->b()V

    .line 1799
    .line 1800
    .line 1801
    :goto_12
    return-object v8

    .line 1802
    nop

    .line 1803
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_9
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
    .end packed-switch

    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    :pswitch_data_2
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
    .end packed-switch
.end method
