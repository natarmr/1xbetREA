.class public final La/ot6;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/st6;


# direct methods
.method public synthetic constructor <init>(La/st6;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/ot6;->i:B

    iput-object p1, p0, La/ot6;->k:La/st6;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/ot6;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/ot6;->k:La/st6;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/ot6;

    .line 9
    .line 10
    const/4 v1, 0x6

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/ot6;-><init>(La/st6;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/ot6;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/ot6;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/ot6;-><init>(La/st6;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/ot6;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/ot6;

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/ot6;-><init>(La/st6;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/ot6;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/ot6;

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/ot6;-><init>(La/st6;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/ot6;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/ot6;

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/ot6;-><init>(La/st6;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/ot6;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_4
    new-instance v0, La/ot6;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-direct {v0, p0, p2, v1}, La/ot6;-><init>(La/st6;La/yje;B)V

    .line 57
    .line 58
    .line 59
    iput-object p1, v0, La/ot6;->j:Ljava/lang/Object;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_5
    new-instance v0, La/ot6;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-direct {v0, p0, p2, v1}, La/ot6;-><init>(La/st6;La/yje;B)V

    .line 66
    .line 67
    .line 68
    iput-object p1, v0, La/ot6;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/ot6;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/ke20;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/ot6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/ot6;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/ot6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/he20;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/ot6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/ot6;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/ot6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/apm0;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/ot6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/ot6;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/ot6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/ce20;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/ot6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/ot6;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/ot6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/f1o;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/ot6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/ot6;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/ot6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/od20;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/ot6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/ot6;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/ot6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, La/kd20;

    .line 109
    .line 110
    check-cast p2, La/yje;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, La/ot6;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/ot6;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/ot6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 22

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/ot6;->i:B

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    const/16 v3, 0x8

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    iget-object v5, v0, La/ot6;->k:La/st6;

    .line 10
    .line 11
    const/4 v6, 0x0

    .line 12
    packed-switch v1, :pswitch_data_0

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, La/ot6;->j:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, La/ke20;

    .line 18
    .line 19
    sget-object v1, La/wne;->a:La/wne;

    .line 20
    .line 21
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    sget-object v1, La/ie20;->a:La/ie20;

    .line 25
    .line 26
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-static {v0}, La/gnm0;->i(Landroidx/fragment/app/e;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 40
    .line 41
    .line 42
    move-result-object v0

    .line 43
    iget-object v0, v0, La/xyj0;->c:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setMakeBetButtonEnabled(Z)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_0
    sget-object v1, La/je20;->a:La/je20;

    .line 50
    .line 51
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_1

    .line 56
    .line 57
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-static {v0}, La/gnm0;->s(Landroidx/fragment/app/e;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    iget-object v0, v0, La/xyj0;->c:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 69
    .line 70
    invoke-virtual {v0, v4}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setMakeBetButtonEnabled(Z)V

    .line 71
    .line 72
    .line 73
    :goto_0
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :cond_1
    invoke-static {}, La/t9f;->b()V

    .line 77
    .line 78
    .line 79
    :goto_1
    return-object v6

    .line 80
    :pswitch_0
    iget-object v0, v0, La/ot6;->j:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v0, La/he20;

    .line 83
    .line 84
    sget-object v1, La/wne;->a:La/wne;

    .line 85
    .line 86
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    instance-of v1, v0, La/ge20;

    .line 90
    .line 91
    if-eqz v1, :cond_3

    .line 92
    .line 93
    sget-object v1, La/st6;->R1:La/yk5;

    .line 94
    .line 95
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 96
    .line 97
    .line 98
    move-result-object v1

    .line 99
    iget-object v1, v1, La/xyj0;->e:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 100
    .line 101
    check-cast v0, La/ge20;

    .line 102
    .line 103
    iget-object v2, v0, La/ge20;->a:La/ank0;

    .line 104
    .line 105
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-virtual {v2, v3}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    invoke-virtual {v1, v2}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->setHeaderValue(Ljava/lang/CharSequence;)V

    .line 114
    .line 115
    .line 116
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    iget-object v1, v1, La/xyj0;->e:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 121
    .line 122
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    iget-object v0, v0, La/ge20;->d:Ljava/util/ArrayList;

    .line 127
    .line 128
    new-instance v3, Ljava/util/ArrayList;

    .line 129
    .line 130
    const/16 v6, 0xa

    .line 131
    .line 132
    invoke-static {v0, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 133
    .line 134
    .line 135
    move-result v6

    .line 136
    invoke-direct {v3, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 144
    .line 145
    .line 146
    move-result v6

    .line 147
    if-eqz v6, :cond_2

    .line 148
    .line 149
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v6

    .line 153
    check-cast v6, La/mvo0;

    .line 154
    .line 155
    new-instance v7, La/nvo0;

    .line 156
    .line 157
    invoke-direct {v7, v2}, La/nvo0;-><init>(Landroid/content/Context;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {v7, v6}, La/nvo0;->setModel(La/mvo0;)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    goto :goto_2

    .line 167
    :cond_2
    invoke-virtual {v1, v3}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->setContent(Ljava/util/List;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iget-object v0, v0, La/xyj0;->e:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 175
    .line 176
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->e()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    iget-object v0, v0, La/xyj0;->e:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 184
    .line 185
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 186
    .line 187
    .line 188
    goto :goto_3

    .line 189
    :cond_3
    instance-of v1, v0, La/de20;

    .line 190
    .line 191
    if-eqz v1, :cond_4

    .line 192
    .line 193
    sget-object v0, La/st6;->R1:La/yk5;

    .line 194
    .line 195
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 196
    .line 197
    .line 198
    move-result-object v0

    .line 199
    iget-object v0, v0, La/xyj0;->e:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 200
    .line 201
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->e()V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    iget-object v0, v0, La/xyj0;->e:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 209
    .line 210
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->f()V

    .line 211
    .line 212
    .line 213
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    iget-object v0, v0, La/xyj0;->e:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 218
    .line 219
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 220
    .line 221
    .line 222
    goto :goto_3

    .line 223
    :cond_4
    sget-object v1, La/fe20;->a:La/fe20;

    .line 224
    .line 225
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result v1

    .line 229
    if-eqz v1, :cond_5

    .line 230
    .line 231
    sget-object v0, La/st6;->R1:La/yk5;

    .line 232
    .line 233
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    iget-object v0, v0, La/xyj0;->e:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 238
    .line 239
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->g()V

    .line 240
    .line 241
    .line 242
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 243
    .line 244
    .line 245
    move-result-object v0

    .line 246
    iget-object v0, v0, La/xyj0;->e:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 247
    .line 248
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 249
    .line 250
    .line 251
    goto :goto_3

    .line 252
    :cond_5
    sget-object v1, La/ee20;->a:La/ee20;

    .line 253
    .line 254
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 255
    .line 256
    .line 257
    move-result v0

    .line 258
    if-eqz v0, :cond_6

    .line 259
    .line 260
    sget-object v0, La/st6;->R1:La/yk5;

    .line 261
    .line 262
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    iget-object v0, v0, La/xyj0;->e:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 267
    .line 268
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;->e()V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 272
    .line 273
    .line 274
    move-result-object v0

    .line 275
    iget-object v0, v0, La/xyj0;->e:Lorg/xplatform/ui_core/viewcomponents/views/TaxExpandableSpoiler;

    .line 276
    .line 277
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 278
    .line 279
    .line 280
    :goto_3
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 281
    .line 282
    goto :goto_4

    .line 283
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 284
    .line 285
    .line 286
    :goto_4
    return-object v6

    .line 287
    :pswitch_1
    iget-object v0, v0, La/ot6;->j:Ljava/lang/Object;

    .line 288
    .line 289
    check-cast v0, La/apm0;

    .line 290
    .line 291
    sget-object v1, La/wne;->a:La/wne;

    .line 292
    .line 293
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 294
    .line 295
    .line 296
    sget-object v1, La/st6;->R1:La/yk5;

    .line 297
    .line 298
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    iget-object v1, v1, La/xyj0;->c:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 303
    .line 304
    iget-boolean v2, v0, La/apm0;->c:Z

    .line 305
    .line 306
    iget-object v3, v0, La/apm0;->g:La/pz4;

    .line 307
    .line 308
    invoke-virtual {v1, v2}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setVisibilityStepButtons(Z)V

    .line 309
    .line 310
    .line 311
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 312
    .line 313
    .line 314
    move-result-object v1

    .line 315
    iget-object v1, v1, La/xyj0;->c:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 316
    .line 317
    iget-boolean v2, v0, La/apm0;->i:Z

    .line 318
    .line 319
    invoke-virtual {v1, v2}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->y(Z)V

    .line 320
    .line 321
    .line 322
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 323
    .line 324
    .line 325
    move-result-object v1

    .line 326
    iget-object v1, v1, La/xyj0;->c:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 327
    .line 328
    iget-object v7, v0, La/apm0;->a:Ljava/lang/String;

    .line 329
    .line 330
    invoke-virtual {v1, v6, v7}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->w(Ljava/lang/Integer;Ljava/lang/String;)V

    .line 331
    .line 332
    .line 333
    if-eqz v2, :cond_7

    .line 334
    .line 335
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    iget-object v0, v0, La/xyj0;->c:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 340
    .line 341
    const-string v1, ""

    .line 342
    .line 343
    invoke-virtual {v0, v1, v4}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->x(Ljava/lang/String;Z)V

    .line 344
    .line 345
    .line 346
    goto :goto_5

    .line 347
    :cond_7
    iget-object v1, v0, La/apm0;->b:La/ank0;

    .line 348
    .line 349
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 350
    .line 351
    .line 352
    move-result-object v2

    .line 353
    invoke-virtual {v1, v2}, La/ank0;->c(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 354
    .line 355
    .line 356
    move-result-object v1

    .line 357
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    iget-object v2, v2, La/xyj0;->c:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 362
    .line 363
    iget-boolean v4, v0, La/apm0;->h:Z

    .line 364
    .line 365
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 366
    .line 367
    .line 368
    move-result-object v6

    .line 369
    invoke-virtual {v2, v6, v4}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->x(Ljava/lang/String;Z)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 373
    .line 374
    .line 375
    move-result-object v2

    .line 376
    iget-object v2, v2, La/xyj0;->c:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 377
    .line 378
    invoke-virtual {v2, v1}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setBetLimitsText(Landroid/text/Spannable;)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 382
    .line 383
    .line 384
    move-result-object v1

    .line 385
    iget-object v1, v1, La/xyj0;->c:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 386
    .line 387
    iget-boolean v2, v0, La/apm0;->d:Z

    .line 388
    .line 389
    invoke-virtual {v1, v2}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setPlusButtonEnabled(Z)V

    .line 390
    .line 391
    .line 392
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 393
    .line 394
    .line 395
    move-result-object v1

    .line 396
    iget-object v1, v1, La/xyj0;->c:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 397
    .line 398
    iget-boolean v2, v0, La/apm0;->e:Z

    .line 399
    .line 400
    invoke-virtual {v1, v2}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setMinusButtonEnabled(Z)V

    .line 401
    .line 402
    .line 403
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 404
    .line 405
    .line 406
    move-result-object v1

    .line 407
    iget-object v1, v1, La/xyj0;->c:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 408
    .line 409
    iget-boolean v0, v0, La/apm0;->f:Z

    .line 410
    .line 411
    invoke-virtual {v1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setMakeBetButtonEnabled(Z)V

    .line 412
    .line 413
    .line 414
    iget-boolean v0, v3, La/pz4;->a:Z

    .line 415
    .line 416
    if-eqz v0, :cond_8

    .line 417
    .line 418
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 419
    .line 420
    .line 421
    move-result-object v0

    .line 422
    iget-object v0, v0, La/xyj0;->c:Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;

    .line 423
    .line 424
    new-instance v1, Ljava/math/BigDecimal;

    .line 425
    .line 426
    iget-wide v2, v3, La/pz4;->b:D

    .line 427
    .line 428
    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v2

    .line 432
    invoke-direct {v1, v2}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0, v1}, Lorg/xplatform/ui_core/viewcomponents/views/BetInputView;->setMaxValue(Ljava/math/BigDecimal;)V

    .line 436
    .line 437
    .line 438
    :cond_8
    :goto_5
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 439
    .line 440
    return-object v0

    .line 441
    :pswitch_2
    iget-object v0, v0, La/ot6;->j:Ljava/lang/Object;

    .line 442
    .line 443
    check-cast v0, La/ce20;

    .line 444
    .line 445
    sget-object v1, La/wne;->a:La/wne;

    .line 446
    .line 447
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 448
    .line 449
    .line 450
    if-eqz v0, :cond_a

    .line 451
    .line 452
    instance-of v1, v0, La/ae20;

    .line 453
    .line 454
    if-eqz v1, :cond_9

    .line 455
    .line 456
    sget-object v0, La/st6;->R1:La/yk5;

    .line 457
    .line 458
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 459
    .line 460
    .line 461
    move-result-object v0

    .line 462
    iget-object v0, v0, La/xyj0;->f:Landroid/widget/TextView;

    .line 463
    .line 464
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 465
    .line 466
    .line 467
    goto :goto_6

    .line 468
    :cond_9
    instance-of v1, v0, La/be20;

    .line 469
    .line 470
    if-eqz v1, :cond_a

    .line 471
    .line 472
    sget-object v1, La/st6;->R1:La/yk5;

    .line 473
    .line 474
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 475
    .line 476
    .line 477
    move-result-object v1

    .line 478
    iget-object v1, v1, La/xyj0;->f:Landroid/widget/TextView;

    .line 479
    .line 480
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 481
    .line 482
    .line 483
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 484
    .line 485
    .line 486
    move-result-object v1

    .line 487
    iget-object v1, v1, La/xyj0;->f:Landroid/widget/TextView;

    .line 488
    .line 489
    check-cast v0, La/be20;

    .line 490
    .line 491
    iget-object v0, v0, La/be20;->a:La/ank0;

    .line 492
    .line 493
    invoke-virtual {v5}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 494
    .line 495
    .line 496
    move-result-object v2

    .line 497
    invoke-virtual {v0, v2}, La/ank0;->b(Landroid/content/Context;)Landroid/text/SpannableString;

    .line 498
    .line 499
    .line 500
    move-result-object v0

    .line 501
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 502
    .line 503
    .line 504
    :goto_6
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 505
    .line 506
    goto :goto_7

    .line 507
    :cond_a
    invoke-static {}, La/t9f;->b()V

    .line 508
    .line 509
    .line 510
    :goto_7
    return-object v6

    .line 511
    :pswitch_3
    iget-object v1, v0, La/ot6;->j:Ljava/lang/Object;

    .line 512
    .line 513
    check-cast v1, La/f1o;

    .line 514
    .line 515
    sget-object v2, La/wne;->a:La/wne;

    .line 516
    .line 517
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 518
    .line 519
    .line 520
    if-eqz v1, :cond_10

    .line 521
    .line 522
    instance-of v2, v1, La/e1o;

    .line 523
    .line 524
    iget-object v9, v0, La/ot6;->k:La/st6;

    .line 525
    .line 526
    if-eqz v2, :cond_c

    .line 527
    .line 528
    iget-object v7, v9, La/st6;->N1:La/wdk0;

    .line 529
    .line 530
    if-eqz v7, :cond_b

    .line 531
    .line 532
    check-cast v1, La/e1o;

    .line 533
    .line 534
    iget-object v8, v1, La/e1o;->a:La/xdk0;

    .line 535
    .line 536
    invoke-virtual {v9}, La/st6;->G0()La/xyj0;

    .line 537
    .line 538
    .line 539
    move-result-object v0

    .line 540
    iget-object v11, v0, La/xyj0;->d:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 541
    .line 542
    const/4 v13, 0x0

    .line 543
    const/16 v14, 0x3f4

    .line 544
    .line 545
    const/4 v10, 0x0

    .line 546
    const/4 v12, 0x0

    .line 547
    invoke-static/range {v7 .. v14}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 548
    .line 549
    .line 550
    goto/16 :goto_8

    .line 551
    .line 552
    :cond_b
    const-string v0, "snackbarManager"

    .line 553
    .line 554
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 555
    .line 556
    .line 557
    throw v6

    .line 558
    :cond_c
    instance-of v0, v1, La/d1o;

    .line 559
    .line 560
    const-string v2, "actionDialogManager"

    .line 561
    .line 562
    const v3, 0x7f13032f

    .line 563
    .line 564
    .line 565
    const v4, 0x7f1307bb

    .line 566
    .line 567
    .line 568
    if-eqz v0, :cond_e

    .line 569
    .line 570
    iget-object v0, v9, La/st6;->L1:La/ii;

    .line 571
    .line 572
    if-eqz v0, :cond_d

    .line 573
    .line 574
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 575
    .line 576
    invoke-virtual {v9, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 577
    .line 578
    .line 579
    move-result-object v11

    .line 580
    check-cast v1, La/d1o;

    .line 581
    .line 582
    iget-object v12, v1, La/d1o;->a:Ljava/lang/String;

    .line 583
    .line 584
    const v1, 0x7f13115a

    .line 585
    .line 586
    .line 587
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v13

    .line 591
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 592
    .line 593
    .line 594
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 595
    .line 596
    .line 597
    move-result-object v14

    .line 598
    sget-object v19, La/n12;->b:La/n12;

    .line 599
    .line 600
    const/16 v20, 0x0

    .line 601
    .line 602
    const/16 v21, 0x5d0

    .line 603
    .line 604
    const/4 v15, 0x0

    .line 605
    const-string v16, "request_insufficient_founds_dialog_key"

    .line 606
    .line 607
    const/16 v17, 0x0

    .line 608
    .line 609
    const/16 v18, 0x0

    .line 610
    .line 611
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 612
    .line 613
    .line 614
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 615
    .line 616
    .line 617
    move-result-object v1

    .line 618
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 619
    .line 620
    .line 621
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 622
    .line 623
    .line 624
    goto :goto_8

    .line 625
    :cond_d
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 626
    .line 627
    .line 628
    throw v6

    .line 629
    :cond_e
    instance-of v0, v1, La/c1o;

    .line 630
    .line 631
    if-eqz v0, :cond_10

    .line 632
    .line 633
    iget-object v0, v9, La/st6;->L1:La/ii;

    .line 634
    .line 635
    if-eqz v0, :cond_f

    .line 636
    .line 637
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 638
    .line 639
    invoke-virtual {v9, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 640
    .line 641
    .line 642
    move-result-object v11

    .line 643
    check-cast v1, La/c1o;

    .line 644
    .line 645
    iget-object v12, v1, La/c1o;->a:Ljava/lang/String;

    .line 646
    .line 647
    const v1, 0x7f130e5d

    .line 648
    .line 649
    .line 650
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 651
    .line 652
    .line 653
    move-result-object v13

    .line 654
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 655
    .line 656
    .line 657
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 658
    .line 659
    .line 660
    move-result-object v14

    .line 661
    sget-object v19, La/n12;->b:La/n12;

    .line 662
    .line 663
    const/16 v20, 0x0

    .line 664
    .line 665
    const/16 v21, 0x5d0

    .line 666
    .line 667
    const/4 v15, 0x0

    .line 668
    const-string v16, "request_bet_exists_dialog_key"

    .line 669
    .line 670
    const/16 v17, 0x0

    .line 671
    .line 672
    const/16 v18, 0x0

    .line 673
    .line 674
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 675
    .line 676
    .line 677
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 678
    .line 679
    .line 680
    move-result-object v1

    .line 681
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 682
    .line 683
    .line 684
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 685
    .line 686
    .line 687
    :goto_8
    sget-object v0, La/st6;->R1:La/yk5;

    .line 688
    .line 689
    invoke-virtual {v9}, La/st6;->H0()La/rg20;

    .line 690
    .line 691
    .line 692
    move-result-object v0

    .line 693
    iget-object v0, v0, La/rg20;->K:La/p7m0;

    .line 694
    .line 695
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 696
    .line 697
    .line 698
    sget-object v1, La/rd20;->a:La/rd20;

    .line 699
    .line 700
    invoke-virtual {v0, v6, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 701
    .line 702
    .line 703
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 704
    .line 705
    goto :goto_9

    .line 706
    :cond_f
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 707
    .line 708
    .line 709
    throw v6

    .line 710
    :cond_10
    invoke-static {}, La/t9f;->b()V

    .line 711
    .line 712
    .line 713
    :goto_9
    return-object v6

    .line 714
    :pswitch_4
    iget-object v0, v0, La/ot6;->j:Ljava/lang/Object;

    .line 715
    .line 716
    check-cast v0, La/od20;

    .line 717
    .line 718
    sget-object v1, La/wne;->a:La/wne;

    .line 719
    .line 720
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 721
    .line 722
    .line 723
    instance-of v1, v0, La/nd20;

    .line 724
    .line 725
    if-eqz v1, :cond_12

    .line 726
    .line 727
    sget-object v1, La/st6;->R1:La/yk5;

    .line 728
    .line 729
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 730
    .line 731
    .line 732
    move-result-object v1

    .line 733
    iget-object v1, v1, La/xyj0;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 734
    .line 735
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 736
    .line 737
    .line 738
    invoke-virtual {v1}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->x()V

    .line 739
    .line 740
    .line 741
    check-cast v0, La/nd20;

    .line 742
    .line 743
    iget-object v3, v0, La/nd20;->b:La/ke;

    .line 744
    .line 745
    invoke-virtual {v1, v3}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->setModel(La/ke;)V

    .line 746
    .line 747
    .line 748
    iget-boolean v0, v0, La/nd20;->d:Z

    .line 749
    .line 750
    if-eqz v0, :cond_11

    .line 751
    .line 752
    const v0, 0x7f13040a

    .line 753
    .line 754
    .line 755
    invoke-virtual {v5, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 756
    .line 757
    .line 758
    move-result-object v0

    .line 759
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 760
    .line 761
    .line 762
    invoke-virtual {v1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->setChangeBalanceBtnText(Ljava/lang/String;)V

    .line 763
    .line 764
    .line 765
    new-instance v0, La/mt6;

    .line 766
    .line 767
    invoke-direct {v0, v5, v2}, La/mt6;-><init>(La/st6;B)V

    .line 768
    .line 769
    .line 770
    invoke-virtual {v1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->setChangeBalanceClickListener(Landroid/view/View$OnClickListener;)V

    .line 771
    .line 772
    .line 773
    goto :goto_a

    .line 774
    :cond_11
    const v0, 0x7f13110f

    .line 775
    .line 776
    .line 777
    invoke-virtual {v5, v0}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 778
    .line 779
    .line 780
    move-result-object v0

    .line 781
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 782
    .line 783
    .line 784
    invoke-virtual {v1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->setChangeBalanceBtnText(Ljava/lang/String;)V

    .line 785
    .line 786
    .line 787
    new-instance v0, La/mt6;

    .line 788
    .line 789
    const/4 v2, 0x2

    .line 790
    invoke-direct {v0, v5, v2}, La/mt6;-><init>(La/st6;B)V

    .line 791
    .line 792
    .line 793
    invoke-virtual {v1, v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->setChangeBalanceClickListener(Landroid/view/View$OnClickListener;)V

    .line 794
    .line 795
    .line 796
    goto :goto_a

    .line 797
    :cond_12
    sget-object v1, La/ld20;->a:La/ld20;

    .line 798
    .line 799
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 800
    .line 801
    .line 802
    move-result v1

    .line 803
    if-eqz v1, :cond_13

    .line 804
    .line 805
    sget-object v0, La/st6;->R1:La/yk5;

    .line 806
    .line 807
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 808
    .line 809
    .line 810
    move-result-object v0

    .line 811
    iget-object v0, v0, La/xyj0;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 812
    .line 813
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 814
    .line 815
    .line 816
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 817
    .line 818
    .line 819
    move-result-object v0

    .line 820
    iget-object v0, v0, La/xyj0;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 821
    .line 822
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->x()V

    .line 823
    .line 824
    .line 825
    goto :goto_a

    .line 826
    :cond_13
    sget-object v1, La/md20;->a:La/md20;

    .line 827
    .line 828
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 829
    .line 830
    .line 831
    move-result v0

    .line 832
    if-eqz v0, :cond_14

    .line 833
    .line 834
    sget-object v0, La/st6;->R1:La/yk5;

    .line 835
    .line 836
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 837
    .line 838
    .line 839
    move-result-object v0

    .line 840
    iget-object v0, v0, La/xyj0;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 841
    .line 842
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 843
    .line 844
    .line 845
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    iget-object v0, v0, La/xyj0;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 850
    .line 851
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->v()V

    .line 852
    .line 853
    .line 854
    :goto_a
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 855
    .line 856
    goto :goto_b

    .line 857
    :cond_14
    invoke-static {}, La/t9f;->b()V

    .line 858
    .line 859
    .line 860
    :goto_b
    return-object v6

    .line 861
    :pswitch_5
    iget-object v0, v0, La/ot6;->j:Ljava/lang/Object;

    .line 862
    .line 863
    check-cast v0, La/kd20;

    .line 864
    .line 865
    sget-object v1, La/wne;->a:La/wne;

    .line 866
    .line 867
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 868
    .line 869
    .line 870
    sget-object v1, La/id20;->a:La/id20;

    .line 871
    .line 872
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 873
    .line 874
    .line 875
    move-result v1

    .line 876
    if-eqz v1, :cond_15

    .line 877
    .line 878
    sget-object v0, La/st6;->R1:La/yk5;

    .line 879
    .line 880
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 881
    .line 882
    .line 883
    move-result-object v0

    .line 884
    iget-object v0, v0, La/xyj0;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 885
    .line 886
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->u()V

    .line 887
    .line 888
    .line 889
    goto :goto_c

    .line 890
    :cond_15
    sget-object v1, La/jd20;->a:La/jd20;

    .line 891
    .line 892
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 893
    .line 894
    .line 895
    move-result v0

    .line 896
    if-eqz v0, :cond_16

    .line 897
    .line 898
    sget-object v0, La/st6;->R1:La/yk5;

    .line 899
    .line 900
    invoke-virtual {v5}, La/st6;->G0()La/xyj0;

    .line 901
    .line 902
    .line 903
    move-result-object v0

    .line 904
    iget-object v0, v0, La/xyj0;->b:Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;

    .line 905
    .line 906
    invoke-virtual {v0}, Lorg/xplatform/ui_core/viewcomponents/views/MakeBetBalanceViewDs;->w()V

    .line 907
    .line 908
    .line 909
    :goto_c
    sget-object v6, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 910
    .line 911
    goto :goto_d

    .line 912
    :cond_16
    invoke-static {}, La/t9f;->b()V

    .line 913
    .line 914
    .line 915
    :goto_d
    return-object v6

    .line 916
    nop

    .line 917
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
