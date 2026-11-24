.class public final La/q1w;
.super La/bnn0;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic i:B

.field public synthetic j:Ljava/lang/Object;

.field public final synthetic k:La/s1w;


# direct methods
.method public synthetic constructor <init>(La/s1w;La/yje;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/q1w;->i:B

    iput-object p1, p0, La/q1w;->k:La/s1w;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, La/bnn0;-><init>(ILa/yje;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;La/yje;)La/yje;
    .locals 2

    .line 1
    iget-byte v0, p0, La/q1w;->i:B

    .line 2
    .line 3
    iget-object p0, p0, La/q1w;->k:La/s1w;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/q1w;

    .line 9
    .line 10
    const/4 v1, 0x6

    .line 11
    invoke-direct {v0, p0, p2, v1}, La/q1w;-><init>(La/s1w;La/yje;B)V

    .line 12
    .line 13
    .line 14
    iput-object p1, v0, La/q1w;->j:Ljava/lang/Object;

    .line 15
    .line 16
    return-object v0

    .line 17
    :pswitch_0
    new-instance v0, La/q1w;

    .line 18
    .line 19
    const/4 v1, 0x5

    .line 20
    invoke-direct {v0, p0, p2, v1}, La/q1w;-><init>(La/s1w;La/yje;B)V

    .line 21
    .line 22
    .line 23
    iput-object p1, v0, La/q1w;->j:Ljava/lang/Object;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    new-instance v0, La/q1w;

    .line 27
    .line 28
    const/4 v1, 0x4

    .line 29
    invoke-direct {v0, p0, p2, v1}, La/q1w;-><init>(La/s1w;La/yje;B)V

    .line 30
    .line 31
    .line 32
    iput-object p1, v0, La/q1w;->j:Ljava/lang/Object;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_2
    new-instance v0, La/q1w;

    .line 36
    .line 37
    const/4 v1, 0x3

    .line 38
    invoke-direct {v0, p0, p2, v1}, La/q1w;-><init>(La/s1w;La/yje;B)V

    .line 39
    .line 40
    .line 41
    iput-object p1, v0, La/q1w;->j:Ljava/lang/Object;

    .line 42
    .line 43
    return-object v0

    .line 44
    :pswitch_3
    new-instance v0, La/q1w;

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    invoke-direct {v0, p0, p2, v1}, La/q1w;-><init>(La/s1w;La/yje;B)V

    .line 48
    .line 49
    .line 50
    iput-object p1, v0, La/q1w;->j:Ljava/lang/Object;

    .line 51
    .line 52
    return-object v0

    .line 53
    :pswitch_4
    new-instance v0, La/q1w;

    .line 54
    .line 55
    const/4 v1, 0x1

    .line 56
    invoke-direct {v0, p0, p2, v1}, La/q1w;-><init>(La/s1w;La/yje;B)V

    .line 57
    .line 58
    .line 59
    iput-object p1, v0, La/q1w;->j:Ljava/lang/Object;

    .line 60
    .line 61
    return-object v0

    .line 62
    :pswitch_5
    new-instance v0, La/q1w;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-direct {v0, p0, p2, v1}, La/q1w;-><init>(La/s1w;La/yje;B)V

    .line 66
    .line 67
    .line 68
    iput-object p1, v0, La/q1w;->j:Ljava/lang/Object;

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
    iget-byte v0, p0, La/q1w;->i:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, La/l9h0;

    .line 7
    .line 8
    check-cast p2, La/yje;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, La/q1w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    check-cast p0, La/q1w;

    .line 15
    .line 16
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, La/q1w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :pswitch_0
    check-cast p1, La/gn5;

    .line 24
    .line 25
    check-cast p2, La/yje;

    .line 26
    .line 27
    invoke-virtual {p0, p1, p2}, La/q1w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    check-cast p0, La/q1w;

    .line 32
    .line 33
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    invoke-virtual {p0, p1}, La/q1w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :pswitch_1
    check-cast p1, La/p9w;

    .line 41
    .line 42
    check-cast p2, La/yje;

    .line 43
    .line 44
    invoke-virtual {p0, p1, p2}, La/q1w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/q1w;

    .line 49
    .line 50
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    invoke-virtual {p0, p1}, La/q1w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :pswitch_2
    check-cast p1, La/s9w;

    .line 58
    .line 59
    check-cast p2, La/yje;

    .line 60
    .line 61
    invoke-virtual {p0, p1, p2}, La/q1w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    check-cast p0, La/q1w;

    .line 66
    .line 67
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 68
    .line 69
    invoke-virtual {p0, p1}, La/q1w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :pswitch_3
    check-cast p1, La/h7d;

    .line 75
    .line 76
    check-cast p2, La/yje;

    .line 77
    .line 78
    invoke-virtual {p0, p1, p2}, La/q1w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    check-cast p0, La/q1w;

    .line 83
    .line 84
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 85
    .line 86
    invoke-virtual {p0, p1}, La/q1w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    return-object p0

    .line 91
    :pswitch_4
    check-cast p1, La/t4w;

    .line 92
    .line 93
    check-cast p2, La/yje;

    .line 94
    .line 95
    invoke-virtual {p0, p1, p2}, La/q1w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    check-cast p0, La/q1w;

    .line 100
    .line 101
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 102
    .line 103
    invoke-virtual {p0, p1}, La/q1w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :pswitch_5
    check-cast p1, La/s4w;

    .line 109
    .line 110
    check-cast p2, La/yje;

    .line 111
    .line 112
    invoke-virtual {p0, p1, p2}, La/q1w;->create(Ljava/lang/Object;La/yje;)La/yje;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    check-cast p0, La/q1w;

    .line 117
    .line 118
    sget-object p1, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 119
    .line 120
    invoke-virtual {p0, p1}, La/q1w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 34

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/q1w;->i:B

    .line 4
    .line 5
    const v2, 0x7f080be5

    .line 6
    .line 7
    .line 8
    const v3, 0x7f1304dc

    .line 9
    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    const v5, 0x7f13032f

    .line 13
    .line 14
    .line 15
    const v6, 0x7f130e5d

    .line 16
    .line 17
    .line 18
    const/4 v9, 0x0

    .line 19
    iget-object v10, v0, La/q1w;->k:La/s1w;

    .line 20
    .line 21
    packed-switch v1, :pswitch_data_0

    .line 22
    .line 23
    .line 24
    iget-object v0, v0, La/q1w;->j:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast v0, La/l9h0;

    .line 27
    .line 28
    sget-object v1, La/wne;->a:La/wne;

    .line 29
    .line 30
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    iget-boolean v1, v0, La/l9h0;->a:Z

    .line 34
    .line 35
    iget-boolean v2, v0, La/l9h0;->n:Z

    .line 36
    .line 37
    iget-boolean v3, v0, La/l9h0;->i:Z

    .line 38
    .line 39
    iget-boolean v4, v0, La/l9h0;->h:Z

    .line 40
    .line 41
    iget-object v5, v0, La/l9h0;->d:La/s77;

    .line 42
    .line 43
    if-nez v1, :cond_1

    .line 44
    .line 45
    iget-boolean v1, v0, La/l9h0;->b:Z

    .line 46
    .line 47
    if-eqz v1, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    move v1, v9

    .line 51
    goto :goto_1

    .line 52
    :cond_1
    :goto_0
    const/4 v1, 0x1

    .line 53
    :goto_1
    sget-object v6, La/s1w;->d2:La/bst;

    .line 54
    .line 55
    if-nez v4, :cond_2

    .line 56
    .line 57
    sget-object v6, La/s77;->g:La/s77;

    .line 58
    .line 59
    if-eq v5, v6, :cond_2

    .line 60
    .line 61
    invoke-virtual {v10}, La/s1w;->L0()La/sys0;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    sget-object v12, La/sys0;->c:La/sys0;

    .line 66
    .line 67
    if-eq v6, v12, :cond_2

    .line 68
    .line 69
    const/4 v6, 0x1

    .line 70
    goto :goto_2

    .line 71
    :cond_2
    move v6, v9

    .line 72
    :goto_2
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 73
    .line 74
    .line 75
    move-result-object v12

    .line 76
    iget-object v12, v12, La/t1w;->j:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 77
    .line 78
    invoke-virtual {v12, v6}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitleIconVisible(Z)V

    .line 79
    .line 80
    .line 81
    if-eqz v6, :cond_3

    .line 82
    .line 83
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 84
    .line 85
    .line 86
    move-result-object v6

    .line 87
    iget-object v6, v6, La/t1w;->j:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 88
    .line 89
    new-instance v12, La/n1w;

    .line 90
    .line 91
    const/16 v13, 0xa

    .line 92
    .line 93
    invoke-direct {v12, v10, v13}, La/n1w;-><init>(La/s1w;B)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6, v12}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setOnTitlesClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 97
    .line 98
    .line 99
    :cond_3
    xor-int/lit8 v6, v4, 0x1

    .line 100
    .line 101
    const-string v12, "MENU_FILTER_BUTTON"

    .line 102
    .line 103
    invoke-virtual {v10, v12, v6}, La/s1w;->O0(Ljava/lang/String;Z)V

    .line 104
    .line 105
    .line 106
    const-string v13, "MENU_COMPACT_BUTTON"

    .line 107
    .line 108
    invoke-virtual {v10, v13, v6}, La/s1w;->O0(Ljava/lang/String;Z)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 112
    .line 113
    .line 114
    move-result-object v6

    .line 115
    iget-object v6, v6, La/t1w;->h:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 116
    .line 117
    if-nez v4, :cond_4

    .line 118
    .line 119
    move v14, v9

    .line 120
    goto :goto_3

    .line 121
    :cond_4
    const/16 v14, 0x8

    .line 122
    .line 123
    :goto_3
    invoke-virtual {v6, v14}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setVisibility(I)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    iget-object v6, v6, La/t1w;->c:Lorg/xplatform/uikit/components/authorization_buttons/DsAuthorizationButtons;

    .line 131
    .line 132
    if-eqz v4, :cond_5

    .line 133
    .line 134
    move v14, v9

    .line 135
    goto :goto_4

    .line 136
    :cond_5
    const/16 v14, 0x8

    .line 137
    .line 138
    :goto_4
    invoke-virtual {v6, v14}, Landroid/view/View;->setVisibility(I)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    iget-object v6, v6, La/t1w;->j:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 146
    .line 147
    if-eqz v4, :cond_6

    .line 148
    .line 149
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 150
    .line 151
    .line 152
    move-result-object v14

    .line 153
    const v15, 0x7f07012f

    .line 154
    .line 155
    .line 156
    invoke-virtual {v14, v15}, Landroid/content/res/Resources;->getDimension(I)F

    .line 157
    .line 158
    .line 159
    move-result v14

    .line 160
    goto :goto_5

    .line 161
    :cond_6
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->G()Landroid/content/res/Resources;

    .line 162
    .line 163
    .line 164
    move-result-object v14

    .line 165
    const v15, 0x7f07012d

    .line 166
    .line 167
    .line 168
    invoke-virtual {v14, v15}, Landroid/content/res/Resources;->getDimension(I)F

    .line 169
    .line 170
    .line 171
    move-result v14

    .line 172
    :goto_5
    invoke-virtual {v6, v14}, Landroid/view/View;->setElevation(F)V

    .line 173
    .line 174
    .line 175
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 176
    .line 177
    .line 178
    move-result-object v6

    .line 179
    iget-object v6, v6, La/t1w;->g:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 180
    .line 181
    if-eqz v4, :cond_7

    .line 182
    .line 183
    move v14, v9

    .line 184
    goto :goto_6

    .line 185
    :cond_7
    const/16 v14, 0x8

    .line 186
    .line 187
    :goto_6
    invoke-virtual {v6, v14}, Landroid/view/View;->setVisibility(I)V

    .line 188
    .line 189
    .line 190
    iget-boolean v6, v0, La/l9h0;->o:Z

    .line 191
    .line 192
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 193
    .line 194
    .line 195
    move-result-object v14

    .line 196
    iget-object v14, v14, La/t1w;->p:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 197
    .line 198
    invoke-virtual {v14, v1}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setRefreshing(Z)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 202
    .line 203
    .line 204
    move-result-object v14

    .line 205
    iget-object v14, v14, La/t1w;->d:Landroid/view/View;

    .line 206
    .line 207
    if-eqz v1, :cond_8

    .line 208
    .line 209
    move v1, v9

    .line 210
    goto :goto_7

    .line 211
    :cond_8
    const/16 v1, 0x8

    .line 212
    .line 213
    :goto_7
    invoke-virtual {v14, v1}, Landroid/view/View;->setVisibility(I)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 217
    .line 218
    .line 219
    move-result-object v1

    .line 220
    iget-object v1, v1, La/t1w;->p:Lorg/xplatform/ui_core/viewcomponents/swiperefreshlayout/SwipeRefreshLayout;

    .line 221
    .line 222
    invoke-virtual {v1, v6}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;->setEnabled(Z)V

    .line 223
    .line 224
    .line 225
    iget-object v1, v0, La/l9h0;->j:Ljava/lang/String;

    .line 226
    .line 227
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    iget-object v6, v6, La/t1w;->j:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 232
    .line 233
    invoke-virtual {v10}, La/s1w;->L0()La/sys0;

    .line 234
    .line 235
    .line 236
    move-result-object v14

    .line 237
    invoke-static {v5, v1, v14}, La/g47;->a(La/s77;Ljava/lang/String;La/sys0;)Lorg/xplatform/ui_core/resources/UiText$ByRes;

    .line 238
    .line 239
    .line 240
    move-result-object v1

    .line 241
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 242
    .line 243
    .line 244
    move-result-object v14

    .line 245
    invoke-virtual {v1, v14}, Lorg/xplatform/ui_core/resources/UiText;->a(Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 246
    .line 247
    .line 248
    move-result-object v1

    .line 249
    invoke-virtual {v6, v1}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->setTitle(Ljava/lang/CharSequence;)V

    .line 250
    .line 251
    .line 252
    iget-boolean v1, v0, La/l9h0;->e:Z

    .line 253
    .line 254
    iget-boolean v6, v0, La/l9h0;->f:Z

    .line 255
    .line 256
    sget-object v14, La/s77;->c:La/s77;

    .line 257
    .line 258
    sget-object v15, La/s77;->d:La/s77;

    .line 259
    .line 260
    const/16 v16, 0x0

    .line 261
    .line 262
    sget-object v11, La/s77;->i:La/s77;

    .line 263
    .line 264
    sget-object v7, La/s77;->e:La/s77;

    .line 265
    .line 266
    sget-object v8, La/s77;->h:La/s77;

    .line 267
    .line 268
    filled-new-array {v14, v15, v11, v7, v8}, [La/s77;

    .line 269
    .line 270
    .line 271
    move-result-object v8

    .line 272
    invoke-static {v8}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 273
    .line 274
    .line 275
    move-result-object v8

    .line 276
    invoke-interface {v8, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v8

    .line 280
    if-eq v5, v14, :cond_a

    .line 281
    .line 282
    if-eq v5, v7, :cond_a

    .line 283
    .line 284
    sget-object v7, La/s77;->f:La/s77;

    .line 285
    .line 286
    if-ne v5, v7, :cond_9

    .line 287
    .line 288
    goto :goto_8

    .line 289
    :cond_9
    move v7, v9

    .line 290
    goto :goto_9

    .line 291
    :cond_a
    :goto_8
    const/4 v7, 0x1

    .line 292
    :goto_9
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 293
    .line 294
    .line 295
    move-result-object v11

    .line 296
    iget-object v11, v11, La/t1w;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 297
    .line 298
    if-eqz v8, :cond_b

    .line 299
    .line 300
    move v15, v9

    .line 301
    goto :goto_a

    .line 302
    :cond_b
    const/16 v15, 0x8

    .line 303
    .line 304
    :goto_a
    invoke-virtual {v11, v15}, Landroid/view/View;->setVisibility(I)V

    .line 305
    .line 306
    .line 307
    if-eqz v8, :cond_c

    .line 308
    .line 309
    if-nez v4, :cond_c

    .line 310
    .line 311
    const/4 v8, 0x1

    .line 312
    goto :goto_b

    .line 313
    :cond_c
    move v8, v9

    .line 314
    :goto_b
    invoke-virtual {v10, v12, v8}, La/s1w;->O0(Ljava/lang/String;Z)V

    .line 315
    .line 316
    .line 317
    if-eqz v7, :cond_d

    .line 318
    .line 319
    if-nez v4, :cond_d

    .line 320
    .line 321
    const/4 v4, 0x1

    .line 322
    goto :goto_c

    .line 323
    :cond_d
    move v4, v9

    .line 324
    :goto_c
    invoke-virtual {v10, v13, v4}, La/s1w;->O0(Ljava/lang/String;Z)V

    .line 325
    .line 326
    .line 327
    if-eqz v6, :cond_e

    .line 328
    .line 329
    const v4, 0x7f080a69

    .line 330
    .line 331
    .line 332
    goto :goto_d

    .line 333
    :cond_e
    const v4, 0x7f080a5e

    .line 334
    .line 335
    .line 336
    :goto_d
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    iget-object v6, v6, La/t1w;->j:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 341
    .line 342
    invoke-virtual {v6, v13}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b(Ljava/lang/String;)La/e1i;

    .line 343
    .line 344
    .line 345
    move-result-object v6

    .line 346
    if-eqz v6, :cond_f

    .line 347
    .line 348
    invoke-virtual {v6, v4}, La/e1i;->setNavigationBarButtonImageResource(I)V

    .line 349
    .line 350
    .line 351
    :cond_f
    const v4, 0x7f040b0b

    .line 352
    .line 353
    .line 354
    if-eqz v6, :cond_10

    .line 355
    .line 356
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 357
    .line 358
    .line 359
    move-result-object v7

    .line 360
    invoke-static {v4, v7}, La/m5d;->b(ILandroid/content/Context;)I

    .line 361
    .line 362
    .line 363
    move-result v7

    .line 364
    invoke-static {v7}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 365
    .line 366
    .line 367
    move-result-object v7

    .line 368
    invoke-virtual {v6, v7}, La/e1i;->setNavigationBarButtonTint(Landroid/content/res/ColorStateList;)V

    .line 369
    .line 370
    .line 371
    :cond_10
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 372
    .line 373
    .line 374
    move-result-object v6

    .line 375
    iget-object v6, v6, La/t1w;->m:Landroid/widget/LinearLayout;

    .line 376
    .line 377
    if-ne v5, v14, :cond_11

    .line 378
    .line 379
    if-eqz v1, :cond_11

    .line 380
    .line 381
    move v1, v9

    .line 382
    goto :goto_e

    .line 383
    :cond_11
    const/16 v1, 0x8

    .line 384
    .line 385
    :goto_e
    invoke-virtual {v6, v1}, Landroid/view/View;->setVisibility(I)V

    .line 386
    .line 387
    .line 388
    if-eqz v3, :cond_12

    .line 389
    .line 390
    const v1, 0x7f08079b

    .line 391
    .line 392
    .line 393
    goto :goto_f

    .line 394
    :cond_12
    const v1, 0x7f0807a1

    .line 395
    .line 396
    .line 397
    :goto_f
    if-eqz v3, :cond_13

    .line 398
    .line 399
    const v4, 0x7f040afc

    .line 400
    .line 401
    .line 402
    :cond_13
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 403
    .line 404
    .line 405
    move-result-object v5

    .line 406
    iget-object v5, v5, La/t1w;->j:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 407
    .line 408
    invoke-virtual {v5, v12}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b(Ljava/lang/String;)La/e1i;

    .line 409
    .line 410
    .line 411
    move-result-object v5

    .line 412
    if-eqz v5, :cond_14

    .line 413
    .line 414
    invoke-virtual {v5, v1}, La/e1i;->setNavigationBarButtonImageResource(I)V

    .line 415
    .line 416
    .line 417
    :cond_14
    if-eqz v5, :cond_15

    .line 418
    .line 419
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 420
    .line 421
    .line 422
    move-result-object v1

    .line 423
    invoke-static {v4, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 424
    .line 425
    .line 426
    move-result v1

    .line 427
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 428
    .line 429
    .line 430
    move-result-object v1

    .line 431
    invoke-virtual {v5, v1}, La/e1i;->setNavigationBarButtonTint(Landroid/content/res/ColorStateList;)V

    .line 432
    .line 433
    .line 434
    :cond_15
    iget-boolean v1, v0, La/l9h0;->c:Z

    .line 435
    .line 436
    invoke-virtual {v10, v12, v1}, La/s1w;->G0(Ljava/lang/String;Z)V

    .line 437
    .line 438
    .line 439
    invoke-virtual {v10, v13, v1}, La/s1w;->G0(Ljava/lang/String;Z)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 443
    .line 444
    .line 445
    move-result-object v4

    .line 446
    iget-object v4, v4, La/t1w;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 447
    .line 448
    invoke-virtual {v4, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 449
    .line 450
    .line 451
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 452
    .line 453
    .line 454
    move-result-object v4

    .line 455
    iget-object v4, v4, La/t1w;->k:Landroid/widget/LinearLayout;

    .line 456
    .line 457
    invoke-virtual {v4, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    iget-object v4, v4, La/t1w;->m:Landroid/widget/LinearLayout;

    .line 465
    .line 466
    invoke-virtual {v4, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 467
    .line 468
    .line 469
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 470
    .line 471
    .line 472
    move-result-object v4

    .line 473
    iget-object v4, v4, La/t1w;->l:Landroid/widget/LinearLayout;

    .line 474
    .line 475
    invoke-virtual {v4, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 476
    .line 477
    .line 478
    iget-boolean v1, v0, La/l9h0;->m:Z

    .line 479
    .line 480
    invoke-virtual {v10}, La/s1w;->J0()La/r5w;

    .line 481
    .line 482
    .line 483
    move-result-object v4

    .line 484
    invoke-virtual {v4}, La/gl80;->d()I

    .line 485
    .line 486
    .line 487
    move-result v4

    .line 488
    if-lez v4, :cond_16

    .line 489
    .line 490
    const/4 v4, 0x1

    .line 491
    goto :goto_10

    .line 492
    :cond_16
    move v4, v9

    .line 493
    :goto_10
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 494
    .line 495
    .line 496
    move-result-object v5

    .line 497
    iget-object v5, v5, La/t1w;->k:Landroid/widget/LinearLayout;

    .line 498
    .line 499
    if-eqz v1, :cond_17

    .line 500
    .line 501
    if-eqz v2, :cond_17

    .line 502
    .line 503
    const/4 v6, 0x1

    .line 504
    goto :goto_11

    .line 505
    :cond_17
    move v6, v9

    .line 506
    :goto_11
    invoke-virtual {v5, v6}, Landroid/view/View;->setClickable(Z)V

    .line 507
    .line 508
    .line 509
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 510
    .line 511
    .line 512
    move-result-object v5

    .line 513
    iget-object v5, v5, La/t1w;->j:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 514
    .line 515
    invoke-virtual {v5, v12}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b(Ljava/lang/String;)La/e1i;

    .line 516
    .line 517
    .line 518
    move-result-object v5

    .line 519
    if-eqz v5, :cond_18

    .line 520
    .line 521
    invoke-virtual {v5, v1}, La/e1i;->setNavigationBarButtonEnable(Z)V

    .line 522
    .line 523
    .line 524
    :cond_18
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    iget-object v5, v5, La/t1w;->j:Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;

    .line 529
    .line 530
    invoke-virtual {v5, v13}, Lorg/xplatform/uikit/components/navigation_bar/DsNavigationBar;->b(Ljava/lang/String;)La/e1i;

    .line 531
    .line 532
    .line 533
    move-result-object v5

    .line 534
    if-eqz v5, :cond_1b

    .line 535
    .line 536
    if-nez v1, :cond_1a

    .line 537
    .line 538
    if-eqz v4, :cond_19

    .line 539
    .line 540
    goto :goto_12

    .line 541
    :cond_19
    move v4, v9

    .line 542
    goto :goto_13

    .line 543
    :cond_1a
    :goto_12
    const/4 v4, 0x1

    .line 544
    :goto_13
    invoke-virtual {v5, v4}, La/e1i;->setNavigationBarButtonEnable(Z)V

    .line 545
    .line 546
    .line 547
    :cond_1b
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 548
    .line 549
    .line 550
    move-result-object v4

    .line 551
    iget-object v4, v4, La/t1w;->m:Landroid/widget/LinearLayout;

    .line 552
    .line 553
    invoke-virtual {v4, v1}, Landroid/view/View;->setClickable(Z)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 557
    .line 558
    .line 559
    move-result-object v4

    .line 560
    iget-object v4, v4, La/t1w;->l:Landroid/widget/LinearLayout;

    .line 561
    .line 562
    invoke-virtual {v4, v1}, Landroid/view/View;->setClickable(Z)V

    .line 563
    .line 564
    .line 565
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 566
    .line 567
    .line 568
    move-result-object v1

    .line 569
    iget-object v1, v1, La/t1w;->s:Landroid/widget/TextView;

    .line 570
    .line 571
    iget-object v4, v0, La/l9h0;->k:Lorg/xplatform/ui_core/resources/UiText;

    .line 572
    .line 573
    invoke-virtual {v10}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 574
    .line 575
    .line 576
    move-result-object v5

    .line 577
    invoke-virtual {v4, v5}, Lorg/xplatform/ui_core/resources/UiText;->a(Landroid/content/Context;)Ljava/lang/CharSequence;

    .line 578
    .line 579
    .line 580
    move-result-object v4

    .line 581
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 582
    .line 583
    .line 584
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 585
    .line 586
    .line 587
    move-result-object v1

    .line 588
    iget-object v1, v1, La/t1w;->k:Landroid/widget/LinearLayout;

    .line 589
    .line 590
    if-eqz v2, :cond_1c

    .line 591
    .line 592
    const/high16 v2, 0x3f800000    # 1.0f

    .line 593
    .line 594
    goto :goto_14

    .line 595
    :cond_1c
    const/high16 v2, 0x3f000000    # 0.5f

    .line 596
    .line 597
    :goto_14
    invoke-virtual {v1, v2}, Landroid/view/View;->setAlpha(F)V

    .line 598
    .line 599
    .line 600
    iget-object v0, v0, La/l9h0;->l:La/psd;

    .line 601
    .line 602
    instance-of v1, v0, La/osd;

    .line 603
    .line 604
    if-eqz v1, :cond_1e

    .line 605
    .line 606
    check-cast v0, La/osd;

    .line 607
    .line 608
    iget-object v0, v0, La/osd;->a:La/ra10;

    .line 609
    .line 610
    invoke-virtual {v10, v13, v9}, La/s1w;->G0(Ljava/lang/String;Z)V

    .line 611
    .line 612
    .line 613
    const/4 v1, 0x1

    .line 614
    invoke-virtual {v10, v13, v1}, La/s1w;->N0(Ljava/lang/String;Z)V

    .line 615
    .line 616
    .line 617
    if-eqz v3, :cond_1d

    .line 618
    .line 619
    invoke-virtual {v10, v12, v1}, La/s1w;->G0(Ljava/lang/String;Z)V

    .line 620
    .line 621
    .line 622
    goto :goto_15

    .line 623
    :cond_1d
    invoke-virtual {v10, v12, v9}, La/s1w;->G0(Ljava/lang/String;Z)V

    .line 624
    .line 625
    .line 626
    invoke-virtual {v10, v12, v1}, La/s1w;->N0(Ljava/lang/String;Z)V

    .line 627
    .line 628
    .line 629
    :goto_15
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 630
    .line 631
    .line 632
    move-result-object v1

    .line 633
    iget-object v1, v1, La/t1w;->o:Landroidx/recyclerview/widget/RecyclerView;

    .line 634
    .line 635
    const/16 v2, 0x8

    .line 636
    .line 637
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 638
    .line 639
    .line 640
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 641
    .line 642
    .line 643
    move-result-object v1

    .line 644
    iget-object v1, v1, La/t1w;->n:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 645
    .line 646
    new-instance v2, La/hf5;

    .line 647
    .line 648
    const/4 v3, 0x7

    .line 649
    invoke-direct {v2, v1, v1, v0, v3}, La/hf5;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 650
    .line 651
    .line 652
    invoke-static {v1, v2}, La/tl60;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 653
    .line 654
    .line 655
    goto :goto_16

    .line 656
    :cond_1e
    sget-object v1, La/lwf;->g:La/lwf;

    .line 657
    .line 658
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 659
    .line 660
    .line 661
    move-result v0

    .line 662
    if-eqz v0, :cond_1f

    .line 663
    .line 664
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 665
    .line 666
    .line 667
    move-result-object v0

    .line 668
    iget-object v0, v0, La/t1w;->n:Lorg/xplatform/uikit/components/lottie/LottieView;

    .line 669
    .line 670
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 671
    .line 672
    .line 673
    move-result-object v1

    .line 674
    iget-object v1, v1, La/t1w;->o:Landroidx/recyclerview/widget/RecyclerView;

    .line 675
    .line 676
    invoke-virtual {v1, v9}, Landroid/view/View;->setVisibility(I)V

    .line 677
    .line 678
    .line 679
    const/4 v1, 0x1

    .line 680
    invoke-virtual {v10, v13, v1}, La/s1w;->G0(Ljava/lang/String;Z)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v10, v13, v9}, La/s1w;->N0(Ljava/lang/String;Z)V

    .line 684
    .line 685
    .line 686
    invoke-virtual {v10, v12, v1}, La/s1w;->G0(Ljava/lang/String;Z)V

    .line 687
    .line 688
    .line 689
    invoke-virtual {v10, v12, v9}, La/s1w;->N0(Ljava/lang/String;Z)V

    .line 690
    .line 691
    .line 692
    new-instance v1, La/lfr;

    .line 693
    .line 694
    const/16 v2, 0x9

    .line 695
    .line 696
    invoke-direct {v1, v0, v0, v2}, La/lfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 697
    .line 698
    .line 699
    invoke-static {v0, v1}, La/tl60;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 700
    .line 701
    .line 702
    :goto_16
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 703
    .line 704
    goto :goto_17

    .line 705
    :cond_1f
    invoke-static {}, La/t9f;->b()V

    .line 706
    .line 707
    .line 708
    move-object/from16 v11, v16

    .line 709
    .line 710
    :goto_17
    return-object v11

    .line 711
    :pswitch_0
    const/16 v16, 0x0

    .line 712
    .line 713
    iget-object v0, v0, La/q1w;->j:Ljava/lang/Object;

    .line 714
    .line 715
    check-cast v0, La/gn5;

    .line 716
    .line 717
    sget-object v1, La/wne;->a:La/wne;

    .line 718
    .line 719
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 720
    .line 721
    .line 722
    if-eqz v0, :cond_21

    .line 723
    .line 724
    instance-of v1, v0, La/en5;

    .line 725
    .line 726
    if-eqz v1, :cond_20

    .line 727
    .line 728
    sget-object v1, La/s1w;->d2:La/bst;

    .line 729
    .line 730
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 731
    .line 732
    .line 733
    move-result-object v1

    .line 734
    iget-object v1, v1, La/t1w;->q:Landroid/widget/TextView;

    .line 735
    .line 736
    sget-object v2, La/pn40;->a:La/pn40;

    .line 737
    .line 738
    check-cast v0, La/en5;

    .line 739
    .line 740
    iget-object v0, v0, La/en5;->a:La/ql5;

    .line 741
    .line 742
    iget-wide v2, v0, La/ql5;->b:D

    .line 743
    .line 744
    iget-object v4, v0, La/ql5;->f:Ljava/lang/String;

    .line 745
    .line 746
    sget-object v5, La/p3u0;->c:La/p3u0;

    .line 747
    .line 748
    invoke-static {v2, v3, v4, v5}, La/pn40;->d(DLjava/lang/String;La/p3u0;)Ljava/lang/String;

    .line 749
    .line 750
    .line 751
    move-result-object v2

    .line 752
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 753
    .line 754
    .line 755
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 756
    .line 757
    .line 758
    move-result-object v1

    .line 759
    iget-object v1, v1, La/t1w;->r:Landroid/widget/TextView;

    .line 760
    .line 761
    iget-object v0, v0, La/ql5;->m:Ljava/lang/String;

    .line 762
    .line 763
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 764
    .line 765
    .line 766
    goto :goto_18

    .line 767
    :cond_20
    instance-of v0, v0, La/fn5;

    .line 768
    .line 769
    if-eqz v0, :cond_21

    .line 770
    .line 771
    :goto_18
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 772
    .line 773
    goto :goto_19

    .line 774
    :cond_21
    invoke-static {}, La/t9f;->b()V

    .line 775
    .line 776
    .line 777
    move-object/from16 v11, v16

    .line 778
    .line 779
    :goto_19
    return-object v11

    .line 780
    :pswitch_1
    const/16 v16, 0x0

    .line 781
    .line 782
    sget-object v1, La/rek0;->b:La/rek0;

    .line 783
    .line 784
    sget-object v20, La/qek0;->a:La/qek0;

    .line 785
    .line 786
    iget-object v7, v0, La/q1w;->j:Ljava/lang/Object;

    .line 787
    .line 788
    check-cast v7, La/p9w;

    .line 789
    .line 790
    sget-object v8, La/wne;->a:La/wne;

    .line 791
    .line 792
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 793
    .line 794
    .line 795
    instance-of v8, v7, La/a9w;

    .line 796
    .line 797
    iget-object v0, v0, La/q1w;->k:La/s1w;

    .line 798
    .line 799
    if-eqz v8, :cond_23

    .line 800
    .line 801
    iget-object v1, v0, La/s1w;->O1:La/ynb;

    .line 802
    .line 803
    if-eqz v1, :cond_22

    .line 804
    .line 805
    sget-object v22, La/bm5;->c:La/bm5;

    .line 806
    .line 807
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 808
    .line 809
    .line 810
    move-result-object v24

    .line 811
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 812
    .line 813
    .line 814
    check-cast v7, La/a9w;

    .line 815
    .line 816
    iget-boolean v0, v7, La/a9w;->a:Z

    .line 817
    .line 818
    const-string v26, "REQUEST_CHANGE_BALANCE_DIALOG_KEY"

    .line 819
    .line 820
    const/16 v27, 0x1ce

    .line 821
    .line 822
    const/16 v23, 0x0

    .line 823
    .line 824
    move/from16 v25, v0

    .line 825
    .line 826
    move-object/from16 v21, v1

    .line 827
    .line 828
    invoke-static/range {v21 .. v27}, La/ynb;->b(La/ynb;La/bm5;Ljava/lang/String;Landroidx/fragment/app/e;ZLjava/lang/String;I)V

    .line 829
    .line 830
    .line 831
    goto/16 :goto_1d

    .line 832
    .line 833
    :cond_22
    const-string v0, "changeBalanceDialogProvider"

    .line 834
    .line 835
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 836
    .line 837
    .line 838
    throw v16

    .line 839
    :cond_23
    instance-of v8, v7, La/i9w;

    .line 840
    .line 841
    if-eqz v8, :cond_24

    .line 842
    .line 843
    sget-object v1, La/dxv;->j2:La/bst;

    .line 844
    .line 845
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 850
    .line 851
    .line 852
    check-cast v7, La/i9w;

    .line 853
    .line 854
    iget v2, v7, La/i9w;->a:I

    .line 855
    .line 856
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 857
    .line 858
    .line 859
    new-instance v1, La/dxv;

    .line 860
    .line 861
    invoke-direct {v1}, La/dxv;-><init>()V

    .line 862
    .line 863
    .line 864
    sget-object v3, La/dxv;->k2:[La/iiy;

    .line 865
    .line 866
    aget-object v4, v3, v9

    .line 867
    .line 868
    iget-object v5, v1, La/dxv;->e2:La/zz2;

    .line 869
    .line 870
    invoke-virtual {v5, v1, v4, v2}, La/zz2;->I(Landroidx/fragment/app/Fragment;La/iiy;I)V

    .line 871
    .line 872
    .line 873
    iget-object v2, v1, La/dxv;->f2:La/phf0;

    .line 874
    .line 875
    const/16 v18, 0x1

    .line 876
    .line 877
    aget-object v3, v3, v18

    .line 878
    .line 879
    const-string v4, "REQUEST_HIDE_HISTORY_DIALOG_KEY"

    .line 880
    .line 881
    invoke-virtual {v2, v1, v3, v4}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 882
    .line 883
    .line 884
    const-string v2, "HideHistoryDialog"

    .line 885
    .line 886
    invoke-virtual {v1, v0, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 887
    .line 888
    .line 889
    goto/16 :goto_1d

    .line 890
    .line 891
    :cond_24
    instance-of v8, v7, La/b9w;

    .line 892
    .line 893
    const-string v10, "BetHistoryTypeDialog"

    .line 894
    .line 895
    const-string v11, "StatusFilterBottomSheetDialog"

    .line 896
    .line 897
    const/4 v12, 0x2

    .line 898
    if-eqz v8, :cond_26

    .line 899
    .line 900
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 901
    .line 902
    .line 903
    move-result-object v1

    .line 904
    invoke-virtual {v1, v11}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 905
    .line 906
    .line 907
    move-result-object v1

    .line 908
    if-nez v1, :cond_3f

    .line 909
    .line 910
    sget-object v1, La/o77;->k2:La/kl5;

    .line 911
    .line 912
    invoke-virtual {v0}, La/s1w;->L0()La/sys0;

    .line 913
    .line 914
    .line 915
    move-result-object v2

    .line 916
    check-cast v7, La/b9w;

    .line 917
    .line 918
    iget-object v3, v7, La/b9w;->a:Ljava/util/ArrayList;

    .line 919
    .line 920
    iget-boolean v5, v7, La/b9w;->b:Z

    .line 921
    .line 922
    iget-object v6, v7, La/b9w;->c:Ljava/lang/String;

    .line 923
    .line 924
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 925
    .line 926
    .line 927
    move-result-object v0

    .line 928
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 929
    .line 930
    .line 931
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 932
    .line 933
    .line 934
    invoke-virtual {v0, v10}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 935
    .line 936
    .line 937
    move-result-object v1

    .line 938
    if-eqz v1, :cond_25

    .line 939
    .line 940
    goto/16 :goto_1d

    .line 941
    .line 942
    :cond_25
    new-instance v1, La/o77;

    .line 943
    .line 944
    invoke-direct {v1}, La/o77;-><init>()V

    .line 945
    .line 946
    .line 947
    sget-object v7, La/o77;->l2:[La/iiy;

    .line 948
    .line 949
    const/4 v8, 0x4

    .line 950
    aget-object v8, v7, v8

    .line 951
    .line 952
    iget-object v11, v1, La/o77;->i2:La/yzn0;

    .line 953
    .line 954
    invoke-virtual {v11, v1, v8, v2}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 955
    .line 956
    .line 957
    iget-object v2, v1, La/o77;->e2:La/es;

    .line 958
    .line 959
    aget-object v8, v7, v9

    .line 960
    .line 961
    invoke-virtual {v2, v1, v8, v3}, La/es;->D(Landroidx/fragment/app/Fragment;La/iiy;Ljava/util/List;)V

    .line 962
    .line 963
    .line 964
    iget-object v2, v1, La/o77;->f2:La/cgx0;

    .line 965
    .line 966
    const/16 v18, 0x1

    .line 967
    .line 968
    aget-object v3, v7, v18

    .line 969
    .line 970
    invoke-virtual {v2, v1, v3, v5}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 971
    .line 972
    .line 973
    iget-object v2, v1, La/o77;->g2:La/phf0;

    .line 974
    .line 975
    aget-object v3, v7, v12

    .line 976
    .line 977
    invoke-virtual {v2, v1, v3, v6}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 978
    .line 979
    .line 980
    iget-object v2, v1, La/o77;->h2:La/phf0;

    .line 981
    .line 982
    aget-object v3, v7, v4

    .line 983
    .line 984
    const-string v4, "REQUEST_HIDE_BET_HISTORY_ITEM_KEY"

    .line 985
    .line 986
    invoke-virtual {v2, v1, v3, v4}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 987
    .line 988
    .line 989
    invoke-virtual {v1, v0, v10}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 990
    .line 991
    .line 992
    goto/16 :goto_1d

    .line 993
    .line 994
    :cond_26
    instance-of v4, v7, La/f9w;

    .line 995
    .line 996
    if-nez v4, :cond_3f

    .line 997
    .line 998
    instance-of v4, v7, La/v8w;

    .line 999
    .line 1000
    if-eqz v4, :cond_27

    .line 1001
    .line 1002
    invoke-virtual {v0}, La/s1w;->H0()La/ii;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v1

    .line 1006
    new-instance v6, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1007
    .line 1008
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1009
    .line 1010
    .line 1011
    move-result-object v7

    .line 1012
    const v2, 0x7f131477

    .line 1013
    .line 1014
    .line 1015
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1016
    .line 1017
    .line 1018
    move-result-object v8

    .line 1019
    const v2, 0x7f130ec2

    .line 1020
    .line 1021
    .line 1022
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1023
    .line 1024
    .line 1025
    move-result-object v9

    .line 1026
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1030
    .line 1031
    .line 1032
    move-result-object v10

    .line 1033
    sget-object v15, La/n12;->a:La/n12;

    .line 1034
    .line 1035
    const/16 v16, 0x0

    .line 1036
    .line 1037
    const/16 v17, 0x5d0

    .line 1038
    .line 1039
    const/4 v11, 0x0

    .line 1040
    const-string v12, "REQUEST_SETTINGS_PUSH_DIALOG_KEY"

    .line 1041
    .line 1042
    const/4 v13, 0x0

    .line 1043
    const/4 v14, 0x0

    .line 1044
    invoke-direct/range {v6 .. v17}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1045
    .line 1046
    .line 1047
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1048
    .line 1049
    .line 1050
    move-result-object v0

    .line 1051
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1052
    .line 1053
    .line 1054
    invoke-virtual {v1, v6, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1055
    .line 1056
    .line 1057
    goto/16 :goto_1d

    .line 1058
    .line 1059
    :cond_27
    instance-of v3, v7, La/d9w;

    .line 1060
    .line 1061
    if-eqz v3, :cond_28

    .line 1062
    .line 1063
    sget-object v1, La/t0w;->l2:La/art;

    .line 1064
    .line 1065
    check-cast v7, La/d9w;

    .line 1066
    .line 1067
    iget-boolean v2, v7, La/d9w;->a:Z

    .line 1068
    .line 1069
    iget-boolean v3, v7, La/d9w;->b:Z

    .line 1070
    .line 1071
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 1072
    .line 1073
    .line 1074
    move-result-object v0

    .line 1075
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1076
    .line 1077
    .line 1078
    const-string v1, "DateFilterBottomSheetDialog"

    .line 1079
    .line 1080
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1081
    .line 1082
    .line 1083
    move-result-object v4

    .line 1084
    if-nez v4, :cond_3f

    .line 1085
    .line 1086
    new-instance v4, La/t0w;

    .line 1087
    .line 1088
    invoke-direct {v4}, La/t0w;-><init>()V

    .line 1089
    .line 1090
    .line 1091
    sget-object v5, La/t0w;->m2:[La/iiy;

    .line 1092
    .line 1093
    const/16 v18, 0x1

    .line 1094
    .line 1095
    aget-object v6, v5, v18

    .line 1096
    .line 1097
    iget-object v7, v4, La/t0w;->h2:La/cgx0;

    .line 1098
    .line 1099
    invoke-virtual {v7, v4, v6, v2}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 1100
    .line 1101
    .line 1102
    iget-object v2, v4, La/t0w;->i2:La/cgx0;

    .line 1103
    .line 1104
    aget-object v6, v5, v12

    .line 1105
    .line 1106
    invoke-virtual {v2, v4, v6, v3}, La/cgx0;->v(Landroidx/fragment/app/Fragment;La/iiy;Z)V

    .line 1107
    .line 1108
    .line 1109
    iget-object v2, v4, La/t0w;->g2:La/phf0;

    .line 1110
    .line 1111
    aget-object v3, v5, v9

    .line 1112
    .line 1113
    const-string v5, "REQUEST_SELECT_DATE_FILTER_DIALOG_KEY"

    .line 1114
    .line 1115
    invoke-virtual {v2, v4, v3, v5}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1116
    .line 1117
    .line 1118
    invoke-virtual {v4, v0, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1119
    .line 1120
    .line 1121
    goto/16 :goto_1d

    .line 1122
    .line 1123
    :cond_28
    instance-of v3, v7, La/k9w;

    .line 1124
    .line 1125
    if-eqz v3, :cond_29

    .line 1126
    .line 1127
    sget-object v1, La/b3w;->h2:La/rqt;

    .line 1128
    .line 1129
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1130
    .line 1131
    .line 1132
    move-result-object v0

    .line 1133
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1134
    .line 1135
    .line 1136
    check-cast v7, La/k9w;

    .line 1137
    .line 1138
    iget-object v2, v7, La/k9w;->a:Lorg/xplatform/bethistory/domain/model/GeneralBetInfoModel;

    .line 1139
    .line 1140
    iget-object v3, v7, La/k9w;->b:Ljava/lang/String;

    .line 1141
    .line 1142
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1143
    .line 1144
    .line 1145
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1146
    .line 1147
    .line 1148
    const-string v1, "HistoryInfoDialog"

    .line 1149
    .line 1150
    invoke-virtual {v0, v1}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1151
    .line 1152
    .line 1153
    move-result-object v4

    .line 1154
    if-nez v4, :cond_3f

    .line 1155
    .line 1156
    new-instance v4, La/b3w;

    .line 1157
    .line 1158
    invoke-direct {v4}, La/b3w;-><init>()V

    .line 1159
    .line 1160
    .line 1161
    sget-object v5, La/b3w;->i2:[La/iiy;

    .line 1162
    .line 1163
    aget-object v6, v5, v9

    .line 1164
    .line 1165
    iget-object v7, v4, La/b3w;->e2:La/khf0;

    .line 1166
    .line 1167
    invoke-virtual {v7, v4, v6, v2}, La/khf0;->J(Landroidx/fragment/app/Fragment;La/iiy;Landroid/os/Parcelable;)V

    .line 1168
    .line 1169
    .line 1170
    iget-object v2, v4, La/b3w;->f2:La/phf0;

    .line 1171
    .line 1172
    const/16 v18, 0x1

    .line 1173
    .line 1174
    aget-object v5, v5, v18

    .line 1175
    .line 1176
    invoke-virtual {v2, v4, v5, v3}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1177
    .line 1178
    .line 1179
    invoke-virtual {v4, v0, v1}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1180
    .line 1181
    .line 1182
    goto/16 :goto_1d

    .line 1183
    .line 1184
    :cond_29
    instance-of v3, v7, La/e9w;

    .line 1185
    .line 1186
    if-eqz v3, :cond_2a

    .line 1187
    .line 1188
    sget-object v1, La/de90;->k2:La/xi70;

    .line 1189
    .line 1190
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1191
    .line 1192
    .line 1193
    move-result-object v8

    .line 1194
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1195
    .line 1196
    .line 1197
    check-cast v7, La/e9w;

    .line 1198
    .line 1199
    iget-wide v9, v7, La/e9w;->a:J

    .line 1200
    .line 1201
    iget v13, v7, La/e9w;->b:I

    .line 1202
    .line 1203
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1204
    .line 1205
    .line 1206
    const-wide/16 v11, 0x0

    .line 1207
    .line 1208
    const-string v14, "REQUEST_DATA_HISTORY_DIALOG_KEY"

    .line 1209
    .line 1210
    invoke-static/range {v8 .. v14}, La/xi70;->f(Landroidx/fragment/app/e;JJILjava/lang/String;)V

    .line 1211
    .line 1212
    .line 1213
    goto/16 :goto_1d

    .line 1214
    .line 1215
    :cond_2a
    instance-of v3, v7, La/n9w;

    .line 1216
    .line 1217
    if-eqz v3, :cond_2b

    .line 1218
    .line 1219
    sget-object v1, La/eei0;->i2:La/lme0;

    .line 1220
    .line 1221
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1222
    .line 1223
    .line 1224
    move-result-object v0

    .line 1225
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1226
    .line 1227
    .line 1228
    check-cast v7, La/n9w;

    .line 1229
    .line 1230
    iget-wide v2, v7, La/n9w;->a:J

    .line 1231
    .line 1232
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1233
    .line 1234
    .line 1235
    new-instance v1, La/eei0;

    .line 1236
    .line 1237
    invoke-direct {v1}, La/eei0;-><init>()V

    .line 1238
    .line 1239
    .line 1240
    sget-object v4, La/eei0;->j2:[La/iiy;

    .line 1241
    .line 1242
    aget-object v5, v4, v9

    .line 1243
    .line 1244
    iget-object v6, v1, La/eei0;->d2:La/r34;

    .line 1245
    .line 1246
    invoke-virtual {v6, v1, v5, v2, v3}, La/r34;->j(Landroidx/fragment/app/Fragment;La/iiy;J)V

    .line 1247
    .line 1248
    .line 1249
    iget-object v2, v1, La/eei0;->e2:La/phf0;

    .line 1250
    .line 1251
    const/16 v18, 0x1

    .line 1252
    .line 1253
    aget-object v3, v4, v18

    .line 1254
    .line 1255
    const-string v4, "REQUEST_SEND_MAIL_DIALOG_KEY"

    .line 1256
    .line 1257
    invoke-virtual {v2, v1, v3, v4}, La/phf0;->x(Landroidx/fragment/app/Fragment;La/iiy;Ljava/lang/String;)V

    .line 1258
    .line 1259
    .line 1260
    const-class v2, La/eei0;

    .line 1261
    .line 1262
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 1263
    .line 1264
    .line 1265
    move-result-object v2

    .line 1266
    invoke-virtual {v1, v0, v2}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1267
    .line 1268
    .line 1269
    goto/16 :goto_1d

    .line 1270
    .line 1271
    :cond_2b
    instance-of v3, v7, La/j9w;

    .line 1272
    .line 1273
    const v4, 0x7f1303fb

    .line 1274
    .line 1275
    .line 1276
    if-eqz v3, :cond_2c

    .line 1277
    .line 1278
    invoke-virtual {v0}, La/s1w;->H0()La/ii;

    .line 1279
    .line 1280
    .line 1281
    move-result-object v1

    .line 1282
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1283
    .line 1284
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1285
    .line 1286
    .line 1287
    move-result-object v8

    .line 1288
    const v2, 0x7f1309f0

    .line 1289
    .line 1290
    .line 1291
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v9

    .line 1295
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1296
    .line 1297
    .line 1298
    move-result-object v10

    .line 1299
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1300
    .line 1301
    .line 1302
    sget-object v16, La/n12;->a:La/n12;

    .line 1303
    .line 1304
    const/16 v17, 0x0

    .line 1305
    .line 1306
    const/16 v18, 0x5f8

    .line 1307
    .line 1308
    const/4 v11, 0x0

    .line 1309
    const/4 v12, 0x0

    .line 1310
    const/4 v13, 0x0

    .line 1311
    const/4 v14, 0x0

    .line 1312
    const/4 v15, 0x0

    .line 1313
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1314
    .line 1315
    .line 1316
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1317
    .line 1318
    .line 1319
    move-result-object v0

    .line 1320
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1321
    .line 1322
    .line 1323
    invoke-virtual {v1, v7, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1324
    .line 1325
    .line 1326
    goto/16 :goto_1d

    .line 1327
    .line 1328
    :cond_2c
    instance-of v3, v7, La/o9w;

    .line 1329
    .line 1330
    if-eqz v3, :cond_2e

    .line 1331
    .line 1332
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1333
    .line 1334
    .line 1335
    move-result-object v1

    .line 1336
    invoke-virtual {v1, v10}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1337
    .line 1338
    .line 1339
    move-result-object v1

    .line 1340
    if-nez v1, :cond_3f

    .line 1341
    .line 1342
    sget-object v1, La/x6w;->k2:La/art;

    .line 1343
    .line 1344
    check-cast v7, La/o9w;

    .line 1345
    .line 1346
    iget-object v2, v7, La/o9w;->a:La/s77;

    .line 1347
    .line 1348
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1349
    .line 1350
    .line 1351
    move-result-object v3

    .line 1352
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1353
    .line 1354
    .line 1355
    invoke-virtual {v0}, La/s1w;->L0()La/sys0;

    .line 1356
    .line 1357
    .line 1358
    move-result-object v0

    .line 1359
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1360
    .line 1361
    .line 1362
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1363
    .line 1364
    .line 1365
    invoke-virtual {v3, v11}, Landroidx/fragment/app/e;->J(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 1366
    .line 1367
    .line 1368
    move-result-object v1

    .line 1369
    if-eqz v1, :cond_2d

    .line 1370
    .line 1371
    goto/16 :goto_1d

    .line 1372
    .line 1373
    :cond_2d
    new-instance v1, La/x6w;

    .line 1374
    .line 1375
    invoke-direct {v1}, La/x6w;-><init>()V

    .line 1376
    .line 1377
    .line 1378
    sget-object v4, La/x6w;->l2:[La/iiy;

    .line 1379
    .line 1380
    const/16 v18, 0x1

    .line 1381
    .line 1382
    aget-object v5, v4, v18

    .line 1383
    .line 1384
    iget-object v6, v1, La/x6w;->i2:La/yzn0;

    .line 1385
    .line 1386
    invoke-virtual {v6, v1, v5, v2}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 1387
    .line 1388
    .line 1389
    iget-object v2, v1, La/x6w;->j2:La/yzn0;

    .line 1390
    .line 1391
    aget-object v4, v4, v12

    .line 1392
    .line 1393
    invoke-virtual {v2, v1, v4, v0}, La/yzn0;->u(Landroidx/fragment/app/Fragment;La/iiy;Ljava/io/Serializable;)V

    .line 1394
    .line 1395
    .line 1396
    invoke-virtual {v1, v3, v11}, La/sik;->H0(Landroidx/fragment/app/e;Ljava/lang/String;)V

    .line 1397
    .line 1398
    .line 1399
    goto/16 :goto_1d

    .line 1400
    .line 1401
    :cond_2e
    instance-of v3, v7, La/t8w;

    .line 1402
    .line 1403
    if-eqz v3, :cond_2f

    .line 1404
    .line 1405
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 1406
    .line 1407
    .line 1408
    goto/16 :goto_1d

    .line 1409
    .line 1410
    :cond_2f
    instance-of v3, v7, La/c9w;

    .line 1411
    .line 1412
    if-eqz v3, :cond_30

    .line 1413
    .line 1414
    invoke-virtual {v0}, La/s1w;->K0()La/wdk0;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v1

    .line 1418
    new-instance v19, La/xdk0;

    .line 1419
    .line 1420
    const v2, 0x7f130541

    .line 1421
    .line 1422
    .line 1423
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v21

    .line 1427
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1428
    .line 1429
    .line 1430
    const/16 v25, 0x0

    .line 1431
    .line 1432
    const/16 v26, 0x7c

    .line 1433
    .line 1434
    const/16 v22, 0x0

    .line 1435
    .line 1436
    const/16 v23, 0x0

    .line 1437
    .line 1438
    const/16 v24, 0x0

    .line 1439
    .line 1440
    invoke-direct/range {v19 .. v26}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1441
    .line 1442
    .line 1443
    const/16 v27, 0x0

    .line 1444
    .line 1445
    const/16 v28, 0x3fc

    .line 1446
    .line 1447
    const/16 v26, 0x0

    .line 1448
    .line 1449
    move-object/from16 v23, v0

    .line 1450
    .line 1451
    move-object/from16 v21, v1

    .line 1452
    .line 1453
    move-object/from16 v22, v19

    .line 1454
    .line 1455
    invoke-static/range {v21 .. v28}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1456
    .line 1457
    .line 1458
    goto/16 :goto_1d

    .line 1459
    .line 1460
    :cond_30
    move-object/from16 v23, v0

    .line 1461
    .line 1462
    instance-of v0, v7, La/m9w;

    .line 1463
    .line 1464
    if-eqz v0, :cond_31

    .line 1465
    .line 1466
    sget-object v0, La/oyd;->k2:La/std;

    .line 1467
    .line 1468
    invoke-virtual/range {v23 .. v23}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 1469
    .line 1470
    .line 1471
    move-result-object v1

    .line 1472
    check-cast v7, La/m9w;

    .line 1473
    .line 1474
    iget-object v2, v7, La/m9w;->a:La/n3w;

    .line 1475
    .line 1476
    iget-wide v3, v2, La/n3w;->m:D

    .line 1477
    .line 1478
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1479
    .line 1480
    .line 1481
    invoke-static {v1, v2, v3, v4}, La/std;->h(Landroidx/fragment/app/e;La/n3w;D)V

    .line 1482
    .line 1483
    .line 1484
    goto/16 :goto_1d

    .line 1485
    .line 1486
    :cond_31
    instance-of v0, v7, La/g9w;

    .line 1487
    .line 1488
    if-eqz v0, :cond_32

    .line 1489
    .line 1490
    invoke-virtual/range {v23 .. v23}, La/s1w;->K0()La/wdk0;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v21

    .line 1494
    new-instance v0, La/xdk0;

    .line 1495
    .line 1496
    check-cast v7, La/g9w;

    .line 1497
    .line 1498
    iget-object v2, v7, La/g9w;->a:Ljava/lang/String;

    .line 1499
    .line 1500
    const/4 v6, 0x0

    .line 1501
    const/16 v7, 0x7c

    .line 1502
    .line 1503
    const/4 v3, 0x0

    .line 1504
    const/4 v4, 0x0

    .line 1505
    const/4 v5, 0x0

    .line 1506
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1507
    .line 1508
    .line 1509
    const/16 v27, 0x0

    .line 1510
    .line 1511
    const/16 v28, 0x3fc

    .line 1512
    .line 1513
    const/16 v24, 0x0

    .line 1514
    .line 1515
    const/16 v25, 0x0

    .line 1516
    .line 1517
    const/16 v26, 0x0

    .line 1518
    .line 1519
    move-object/from16 v22, v0

    .line 1520
    .line 1521
    invoke-static/range {v21 .. v28}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1522
    .line 1523
    .line 1524
    goto/16 :goto_1d

    .line 1525
    .line 1526
    :cond_32
    move-object/from16 v8, v23

    .line 1527
    .line 1528
    instance-of v0, v7, La/y8w;

    .line 1529
    .line 1530
    if-eqz v0, :cond_33

    .line 1531
    .line 1532
    invoke-virtual {v8}, La/s1w;->K0()La/wdk0;

    .line 1533
    .line 1534
    .line 1535
    move-result-object v21

    .line 1536
    new-instance v0, La/xdk0;

    .line 1537
    .line 1538
    const v2, 0x7f13002c

    .line 1539
    .line 1540
    .line 1541
    invoke-virtual {v8, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v2

    .line 1545
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1546
    .line 1547
    .line 1548
    const/4 v6, 0x0

    .line 1549
    const/16 v7, 0x7c

    .line 1550
    .line 1551
    const/4 v3, 0x0

    .line 1552
    const/4 v4, 0x0

    .line 1553
    const/4 v5, 0x0

    .line 1554
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1555
    .line 1556
    .line 1557
    const/16 v27, 0x0

    .line 1558
    .line 1559
    const/16 v28, 0x3fc

    .line 1560
    .line 1561
    const/16 v24, 0x0

    .line 1562
    .line 1563
    const/16 v25, 0x0

    .line 1564
    .line 1565
    const/16 v26, 0x0

    .line 1566
    .line 1567
    move-object/from16 v22, v0

    .line 1568
    .line 1569
    move-object/from16 v23, v8

    .line 1570
    .line 1571
    invoke-static/range {v21 .. v28}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1572
    .line 1573
    .line 1574
    goto/16 :goto_1d

    .line 1575
    .line 1576
    :cond_33
    instance-of v0, v7, La/h9w;

    .line 1577
    .line 1578
    if-eqz v0, :cond_34

    .line 1579
    .line 1580
    invoke-virtual {v8}, La/s1w;->K0()La/wdk0;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v0

    .line 1584
    new-instance v19, La/xdk0;

    .line 1585
    .line 1586
    const v1, 0x7f13024b

    .line 1587
    .line 1588
    .line 1589
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1590
    .line 1591
    .line 1592
    move-result-object v21

    .line 1593
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1594
    .line 1595
    .line 1596
    new-instance v1, Ljava/lang/Integer;

    .line 1597
    .line 1598
    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 1599
    .line 1600
    .line 1601
    const/16 v26, 0x5c

    .line 1602
    .line 1603
    const/16 v22, 0x0

    .line 1604
    .line 1605
    const/16 v23, 0x0

    .line 1606
    .line 1607
    const/16 v24, 0x0

    .line 1608
    .line 1609
    move-object/from16 v25, v1

    .line 1610
    .line 1611
    invoke-direct/range {v19 .. v26}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1612
    .line 1613
    .line 1614
    const/16 v27, 0x0

    .line 1615
    .line 1616
    const/16 v28, 0x3fc

    .line 1617
    .line 1618
    const/16 v25, 0x0

    .line 1619
    .line 1620
    const/16 v26, 0x0

    .line 1621
    .line 1622
    move-object/from16 v21, v0

    .line 1623
    .line 1624
    move-object/from16 v23, v8

    .line 1625
    .line 1626
    move-object/from16 v22, v19

    .line 1627
    .line 1628
    invoke-static/range {v21 .. v28}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1629
    .line 1630
    .line 1631
    goto/16 :goto_1d

    .line 1632
    .line 1633
    :cond_34
    instance-of v0, v7, La/l9w;

    .line 1634
    .line 1635
    if-eqz v0, :cond_36

    .line 1636
    .line 1637
    invoke-virtual {v8}, La/s1w;->K0()La/wdk0;

    .line 1638
    .line 1639
    .line 1640
    move-result-object v0

    .line 1641
    new-instance v19, La/xdk0;

    .line 1642
    .line 1643
    check-cast v7, La/l9w;

    .line 1644
    .line 1645
    iget-boolean v1, v7, La/l9w;->a:Z

    .line 1646
    .line 1647
    if-eqz v1, :cond_35

    .line 1648
    .line 1649
    const v1, 0x7f131081

    .line 1650
    .line 1651
    .line 1652
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1653
    .line 1654
    .line 1655
    move-result-object v1

    .line 1656
    :goto_1a
    move-object/from16 v21, v1

    .line 1657
    .line 1658
    goto :goto_1b

    .line 1659
    :cond_35
    const v1, 0x7f13107f

    .line 1660
    .line 1661
    .line 1662
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1663
    .line 1664
    .line 1665
    move-result-object v1

    .line 1666
    goto :goto_1a

    .line 1667
    :goto_1b
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1668
    .line 1669
    .line 1670
    new-instance v1, Ljava/lang/Integer;

    .line 1671
    .line 1672
    const v2, 0x7f080be8

    .line 1673
    .line 1674
    .line 1675
    invoke-direct {v1, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 1676
    .line 1677
    .line 1678
    const/16 v26, 0x5c

    .line 1679
    .line 1680
    const/16 v22, 0x0

    .line 1681
    .line 1682
    const/16 v23, 0x0

    .line 1683
    .line 1684
    const/16 v24, 0x0

    .line 1685
    .line 1686
    move-object/from16 v25, v1

    .line 1687
    .line 1688
    invoke-direct/range {v19 .. v26}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 1689
    .line 1690
    .line 1691
    const/16 v27, 0x0

    .line 1692
    .line 1693
    const/16 v28, 0x3fc

    .line 1694
    .line 1695
    const/16 v25, 0x0

    .line 1696
    .line 1697
    const/16 v26, 0x0

    .line 1698
    .line 1699
    move-object/from16 v21, v0

    .line 1700
    .line 1701
    move-object/from16 v23, v8

    .line 1702
    .line 1703
    move-object/from16 v22, v19

    .line 1704
    .line 1705
    invoke-static/range {v21 .. v28}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 1706
    .line 1707
    .line 1708
    goto/16 :goto_1d

    .line 1709
    .line 1710
    :cond_36
    instance-of v0, v7, La/s8w;

    .line 1711
    .line 1712
    if-eqz v0, :cond_3a

    .line 1713
    .line 1714
    check-cast v7, La/s8w;

    .line 1715
    .line 1716
    iget-boolean v0, v7, La/s8w;->a:Z

    .line 1717
    .line 1718
    sget-object v1, La/s1w;->d2:La/bst;

    .line 1719
    .line 1720
    if-eqz v0, :cond_37

    .line 1721
    .line 1722
    invoke-virtual {v8}, La/s1w;->I0()La/t1w;

    .line 1723
    .line 1724
    .line 1725
    move-result-object v0

    .line 1726
    iget-object v0, v0, La/t1w;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 1727
    .line 1728
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v0

    .line 1732
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1733
    .line 1734
    .line 1735
    check-cast v0, La/ble;

    .line 1736
    .line 1737
    move-object/from16 v1, v16

    .line 1738
    .line 1739
    invoke-virtual {v0, v1}, La/ble;->b(La/yke;)V

    .line 1740
    .line 1741
    .line 1742
    invoke-virtual {v8}, La/s1w;->I0()La/t1w;

    .line 1743
    .line 1744
    .line 1745
    move-result-object v1

    .line 1746
    iget-object v1, v1, La/t1w;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 1747
    .line 1748
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1749
    .line 1750
    .line 1751
    invoke-virtual {v8}, La/s1w;->I0()La/t1w;

    .line 1752
    .line 1753
    .line 1754
    move-result-object v0

    .line 1755
    iget-object v0, v0, La/t1w;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 1756
    .line 1757
    const/4 v1, 0x1

    .line 1758
    invoke-virtual {v0, v1, v9, v1}, Lcom/google/android/material/appbar/AppBarLayout;->g(ZZZ)V

    .line 1759
    .line 1760
    .line 1761
    invoke-virtual {v8}, La/s1w;->I0()La/t1w;

    .line 1762
    .line 1763
    .line 1764
    move-result-object v0

    .line 1765
    iget-object v0, v0, La/t1w;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 1766
    .line 1767
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 1768
    .line 1769
    .line 1770
    goto/16 :goto_1d

    .line 1771
    .line 1772
    :cond_37
    move-object/from16 v1, v16

    .line 1773
    .line 1774
    invoke-virtual {v8}, La/s1w;->I0()La/t1w;

    .line 1775
    .line 1776
    .line 1777
    move-result-object v0

    .line 1778
    iget-object v0, v0, La/t1w;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 1779
    .line 1780
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1781
    .line 1782
    .line 1783
    move-result-object v0

    .line 1784
    instance-of v2, v0, La/ble;

    .line 1785
    .line 1786
    if-eqz v2, :cond_38

    .line 1787
    .line 1788
    move-object v11, v0

    .line 1789
    check-cast v11, La/ble;

    .line 1790
    .line 1791
    goto :goto_1c

    .line 1792
    :cond_38
    move-object v11, v1

    .line 1793
    :goto_1c
    if-eqz v11, :cond_39

    .line 1794
    .line 1795
    new-instance v0, Lcom/google/android/material/appbar/AppBarLayout$Behavior;

    .line 1796
    .line 1797
    invoke-direct {v0}, Lcom/google/android/material/appbar/AppBarLayout$Behavior;-><init>()V

    .line 1798
    .line 1799
    .line 1800
    invoke-virtual {v11, v0}, La/ble;->b(La/yke;)V

    .line 1801
    .line 1802
    .line 1803
    :cond_39
    invoke-virtual {v8}, La/s1w;->I0()La/t1w;

    .line 1804
    .line 1805
    .line 1806
    move-result-object v0

    .line 1807
    iget-object v0, v0, La/t1w;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 1808
    .line 1809
    const/4 v1, 0x1

    .line 1810
    invoke-virtual {v0, v1, v9, v1}, Lcom/google/android/material/appbar/AppBarLayout;->g(ZZZ)V

    .line 1811
    .line 1812
    .line 1813
    invoke-virtual {v8}, La/s1w;->I0()La/t1w;

    .line 1814
    .line 1815
    .line 1816
    move-result-object v0

    .line 1817
    iget-object v0, v0, La/t1w;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 1818
    .line 1819
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 1820
    .line 1821
    .line 1822
    goto/16 :goto_1d

    .line 1823
    .line 1824
    :cond_3a
    move-object/from16 v1, v16

    .line 1825
    .line 1826
    sget-object v0, La/x8w;->a:La/x8w;

    .line 1827
    .line 1828
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1829
    .line 1830
    .line 1831
    move-result v0

    .line 1832
    if-eqz v0, :cond_3b

    .line 1833
    .line 1834
    sget-object v0, La/s1w;->d2:La/bst;

    .line 1835
    .line 1836
    invoke-virtual {v8}, La/s1w;->H0()La/ii;

    .line 1837
    .line 1838
    .line 1839
    move-result-object v0

    .line 1840
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1841
    .line 1842
    const v1, 0x7f130162

    .line 1843
    .line 1844
    .line 1845
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1846
    .line 1847
    .line 1848
    move-result-object v10

    .line 1849
    const v1, 0x7f131247

    .line 1850
    .line 1851
    .line 1852
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1853
    .line 1854
    .line 1855
    move-result-object v11

    .line 1856
    invoke-virtual {v8, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1857
    .line 1858
    .line 1859
    move-result-object v12

    .line 1860
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1861
    .line 1862
    .line 1863
    sget-object v18, La/n12;->a:La/n12;

    .line 1864
    .line 1865
    const/16 v19, 0x0

    .line 1866
    .line 1867
    const/16 v20, 0x5f8

    .line 1868
    .line 1869
    const/4 v13, 0x0

    .line 1870
    const/4 v14, 0x0

    .line 1871
    const/4 v15, 0x0

    .line 1872
    const/16 v16, 0x0

    .line 1873
    .line 1874
    const/16 v17, 0x0

    .line 1875
    .line 1876
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1877
    .line 1878
    .line 1879
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1880
    .line 1881
    .line 1882
    move-result-object v1

    .line 1883
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1884
    .line 1885
    .line 1886
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1887
    .line 1888
    .line 1889
    goto/16 :goto_1d

    .line 1890
    .line 1891
    :cond_3b
    instance-of v0, v7, La/u8w;

    .line 1892
    .line 1893
    if-eqz v0, :cond_3c

    .line 1894
    .line 1895
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 1896
    .line 1897
    .line 1898
    move-result-object v0

    .line 1899
    check-cast v7, La/u8w;

    .line 1900
    .line 1901
    iget-object v1, v7, La/u8w;->a:Ljava/lang/String;

    .line 1902
    .line 1903
    iget-object v2, v7, La/u8w;->b:Ljava/lang/String;

    .line 1904
    .line 1905
    invoke-static {v0, v1, v2}, La/j120;->e0(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

    .line 1906
    .line 1907
    .line 1908
    goto :goto_1d

    .line 1909
    :cond_3c
    instance-of v0, v7, La/w8w;

    .line 1910
    .line 1911
    if-eqz v0, :cond_3d

    .line 1912
    .line 1913
    sget-object v0, La/s1w;->d2:La/bst;

    .line 1914
    .line 1915
    invoke-virtual {v8}, La/s1w;->I0()La/t1w;

    .line 1916
    .line 1917
    .line 1918
    move-result-object v0

    .line 1919
    iget-object v0, v0, La/t1w;->o:Landroidx/recyclerview/widget/RecyclerView;

    .line 1920
    .line 1921
    invoke-static {v0, v9}, La/kcx;->G(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 1922
    .line 1923
    .line 1924
    invoke-virtual {v8}, La/s1w;->I0()La/t1w;

    .line 1925
    .line 1926
    .line 1927
    move-result-object v0

    .line 1928
    iget-object v0, v0, La/t1w;->b:Lcom/google/android/material/appbar/AppBarLayout;

    .line 1929
    .line 1930
    const/4 v1, 0x1

    .line 1931
    invoke-virtual {v0, v1, v1, v1}, Lcom/google/android/material/appbar/AppBarLayout;->g(ZZZ)V

    .line 1932
    .line 1933
    .line 1934
    goto :goto_1d

    .line 1935
    :cond_3d
    sget-object v0, La/z8w;->a:La/z8w;

    .line 1936
    .line 1937
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 1938
    .line 1939
    .line 1940
    move-result v0

    .line 1941
    if-eqz v0, :cond_3e

    .line 1942
    .line 1943
    invoke-virtual {v8}, La/s1w;->H0()La/ii;

    .line 1944
    .line 1945
    .line 1946
    move-result-object v0

    .line 1947
    invoke-virtual {v8, v4}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1948
    .line 1949
    .line 1950
    move-result-object v10

    .line 1951
    const v1, 0x7f13029b

    .line 1952
    .line 1953
    .line 1954
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1955
    .line 1956
    .line 1957
    move-result-object v11

    .line 1958
    const v1, 0x7f130298

    .line 1959
    .line 1960
    .line 1961
    invoke-virtual {v8, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1962
    .line 1963
    .line 1964
    move-result-object v12

    .line 1965
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1966
    .line 1967
    .line 1968
    invoke-virtual {v8, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 1969
    .line 1970
    .line 1971
    move-result-object v13

    .line 1972
    sget-object v18, La/n12;->a:La/n12;

    .line 1973
    .line 1974
    new-instance v9, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 1975
    .line 1976
    const/16 v19, 0x0

    .line 1977
    .line 1978
    const/16 v20, 0x5d0

    .line 1979
    .line 1980
    const/4 v14, 0x0

    .line 1981
    const-string v15, "REQUEST_BIND_EMAIL_DIALOG_KEY"

    .line 1982
    .line 1983
    const/16 v16, 0x0

    .line 1984
    .line 1985
    const/16 v17, 0x0

    .line 1986
    .line 1987
    invoke-direct/range {v9 .. v20}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 1988
    .line 1989
    .line 1990
    invoke-virtual {v8}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 1991
    .line 1992
    .line 1993
    move-result-object v1

    .line 1994
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1995
    .line 1996
    .line 1997
    invoke-virtual {v0, v9, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 1998
    .line 1999
    .line 2000
    goto :goto_1d

    .line 2001
    :cond_3e
    invoke-static {}, La/t9f;->b()V

    .line 2002
    .line 2003
    .line 2004
    move-object v11, v1

    .line 2005
    goto :goto_1e

    .line 2006
    :cond_3f
    :goto_1d
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2007
    .line 2008
    :goto_1e
    return-object v11

    .line 2009
    :pswitch_2
    const/4 v1, 0x0

    .line 2010
    iget-object v0, v0, La/q1w;->j:Ljava/lang/Object;

    .line 2011
    .line 2012
    check-cast v0, La/s9w;

    .line 2013
    .line 2014
    sget-object v2, La/wne;->a:La/wne;

    .line 2015
    .line 2016
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2017
    .line 2018
    .line 2019
    sget-object v2, La/q9w;->a:La/q9w;

    .line 2020
    .line 2021
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2022
    .line 2023
    .line 2024
    move-result v2

    .line 2025
    const/4 v15, 0x0

    .line 2026
    if-eqz v2, :cond_40

    .line 2027
    .line 2028
    iget-object v0, v10, La/s1w;->Q1:La/c4m0;

    .line 2029
    .line 2030
    if-eqz v0, :cond_41

    .line 2031
    .line 2032
    invoke-virtual {v0, v15}, La/pby;->cancel(Ljava/util/concurrent/CancellationException;)V

    .line 2033
    .line 2034
    .line 2035
    goto :goto_1f

    .line 2036
    :cond_40
    instance-of v2, v0, La/r9w;

    .line 2037
    .line 2038
    if-eqz v2, :cond_42

    .line 2039
    .line 2040
    sget-object v1, La/s1w;->d2:La/bst;

    .line 2041
    .line 2042
    invoke-virtual {v10}, La/s1w;->J0()La/r5w;

    .line 2043
    .line 2044
    .line 2045
    move-result-object v1

    .line 2046
    iget-object v12, v1, La/gl80;->g:La/vae0;

    .line 2047
    .line 2048
    new-instance v14, La/j0s;

    .line 2049
    .line 2050
    const/16 v1, 0x1b

    .line 2051
    .line 2052
    invoke-direct {v14, v10, v0, v15, v1}, La/j0s;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 2053
    .line 2054
    .line 2055
    sget-object v0, La/lkz;->a:La/lkz;

    .line 2056
    .line 2057
    invoke-static {v10}, La/aac;->W(Landroidx/fragment/app/Fragment;)La/clz;

    .line 2058
    .line 2059
    .line 2060
    move-result-object v13

    .line 2061
    invoke-interface {v13}, La/clz;->x()La/glz;

    .line 2062
    .line 2063
    .line 2064
    move-result-object v0

    .line 2065
    invoke-static {v0}, La/x0x;->Q(La/glz;)La/tkz;

    .line 2066
    .line 2067
    .line 2068
    move-result-object v0

    .line 2069
    new-instance v11, La/hgv;

    .line 2070
    .line 2071
    const/16 v16, 0x0

    .line 2072
    .line 2073
    invoke-direct/range {v11 .. v16}, La/hgv;-><init>(La/gmq;La/clz;La/j0s;La/yje;B)V

    .line 2074
    .line 2075
    .line 2076
    invoke-static {v0, v15, v15, v11, v4}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 2077
    .line 2078
    .line 2079
    move-result-object v0

    .line 2080
    iput-object v0, v10, La/s1w;->Q1:La/c4m0;

    .line 2081
    .line 2082
    :cond_41
    :goto_1f
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2083
    .line 2084
    goto :goto_20

    .line 2085
    :cond_42
    invoke-static {}, La/t9f;->b()V

    .line 2086
    .line 2087
    .line 2088
    move-object v11, v1

    .line 2089
    :goto_20
    return-object v11

    .line 2090
    :pswitch_3
    iget-object v0, v0, La/q1w;->j:Ljava/lang/Object;

    .line 2091
    .line 2092
    check-cast v0, La/h7d;

    .line 2093
    .line 2094
    sget-object v1, La/wne;->a:La/wne;

    .line 2095
    .line 2096
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2097
    .line 2098
    .line 2099
    sget-object v1, La/s1w;->d2:La/bst;

    .line 2100
    .line 2101
    invoke-virtual {v10}, La/s1w;->M0()La/naw;

    .line 2102
    .line 2103
    .line 2104
    move-result-object v3

    .line 2105
    invoke-virtual {v10}, La/s1w;->J0()La/r5w;

    .line 2106
    .line 2107
    .line 2108
    move-result-object v1

    .line 2109
    invoke-virtual {v1}, La/gl80;->d()I

    .line 2110
    .line 2111
    .line 2112
    move-result v1

    .line 2113
    iget-object v4, v3, La/naw;->W0:La/p7m0;

    .line 2114
    .line 2115
    iget-object v2, v3, La/naw;->J:La/td9;

    .line 2116
    .line 2117
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2118
    .line 2119
    .line 2120
    iget-object v0, v0, La/h7d;->d:La/dp00;

    .line 2121
    .line 2122
    iget-object v5, v0, La/dp00;->a:La/mva;

    .line 2123
    .line 2124
    iget-object v0, v0, La/dp00;->c:La/mva;

    .line 2125
    .line 2126
    instance-of v6, v5, La/ap00;

    .line 2127
    .line 2128
    if-eqz v6, :cond_43

    .line 2129
    .line 2130
    iget-object v6, v2, La/td9;->e:Ljava/lang/Object;

    .line 2131
    .line 2132
    check-cast v6, La/mva;

    .line 2133
    .line 2134
    instance-of v6, v6, La/ap00;

    .line 2135
    .line 2136
    if-eqz v6, :cond_43

    .line 2137
    .line 2138
    const/16 v21, 0x1

    .line 2139
    .line 2140
    goto :goto_21

    .line 2141
    :cond_43
    move/from16 v21, v9

    .line 2142
    .line 2143
    :goto_21
    instance-of v6, v5, La/bp00;

    .line 2144
    .line 2145
    if-eqz v6, :cond_44

    .line 2146
    .line 2147
    iget-boolean v0, v0, La/mva;->a:Z

    .line 2148
    .line 2149
    if-eqz v0, :cond_44

    .line 2150
    .line 2151
    const/4 v0, 0x1

    .line 2152
    if-ge v1, v0, :cond_44

    .line 2153
    .line 2154
    iget-object v1, v2, La/td9;->c:Ljava/lang/Object;

    .line 2155
    .line 2156
    check-cast v1, La/s5w;

    .line 2157
    .line 2158
    iget-boolean v1, v1, La/s5w;->c:Z

    .line 2159
    .line 2160
    if-eqz v1, :cond_44

    .line 2161
    .line 2162
    move v8, v0

    .line 2163
    goto :goto_22

    .line 2164
    :cond_44
    move v8, v9

    .line 2165
    :goto_22
    instance-of v0, v5, La/zo00;

    .line 2166
    .line 2167
    iput-boolean v0, v3, La/naw;->V0:Z

    .line 2168
    .line 2169
    if-nez v21, :cond_45

    .line 2170
    .line 2171
    iget-object v1, v2, La/td9;->c:Ljava/lang/Object;

    .line 2172
    .line 2173
    check-cast v1, La/s5w;

    .line 2174
    .line 2175
    iget-boolean v1, v1, La/s5w;->c:Z

    .line 2176
    .line 2177
    if-eqz v1, :cond_45

    .line 2178
    .line 2179
    new-instance v1, La/bp00;

    .line 2180
    .line 2181
    invoke-direct {v1, v9}, La/mva;-><init>(Z)V

    .line 2182
    .line 2183
    .line 2184
    iput-object v1, v2, La/td9;->e:Ljava/lang/Object;

    .line 2185
    .line 2186
    :cond_45
    if-eqz v8, :cond_46

    .line 2187
    .line 2188
    sget-object v0, La/qb10;->b:La/qb10;

    .line 2189
    .line 2190
    invoke-virtual {v3, v0}, La/naw;->J(La/azw;)V

    .line 2191
    .line 2192
    .line 2193
    goto :goto_23

    .line 2194
    :cond_46
    if-eqz v0, :cond_47

    .line 2195
    .line 2196
    sget-object v0, La/qb10;->a:La/qb10;

    .line 2197
    .line 2198
    invoke-virtual {v3, v0}, La/naw;->J(La/azw;)V

    .line 2199
    .line 2200
    .line 2201
    goto :goto_23

    .line 2202
    :cond_47
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2203
    .line 2204
    .line 2205
    move-result-object v0

    .line 2206
    move-object/from16 v19, v0

    .line 2207
    .line 2208
    check-cast v19, La/l9h0;

    .line 2209
    .line 2210
    xor-int/lit8 v22, v21, 0x1

    .line 2211
    .line 2212
    const/16 v32, 0x0

    .line 2213
    .line 2214
    const/16 v33, 0x7ff9

    .line 2215
    .line 2216
    const/16 v20, 0x0

    .line 2217
    .line 2218
    const/16 v23, 0x0

    .line 2219
    .line 2220
    const/16 v24, 0x0

    .line 2221
    .line 2222
    const/16 v25, 0x0

    .line 2223
    .line 2224
    const/16 v26, 0x0

    .line 2225
    .line 2226
    const/16 v27, 0x0

    .line 2227
    .line 2228
    const/16 v28, 0x0

    .line 2229
    .line 2230
    const/16 v29, 0x0

    .line 2231
    .line 2232
    const/16 v30, 0x0

    .line 2233
    .line 2234
    const/16 v31, 0x0

    .line 2235
    .line 2236
    invoke-static/range {v19 .. v33}, La/l9h0;->a(La/l9h0;ZZZLa/s77;ZZZZZLorg/xplatform/ui_core/resources/UiText$ByRes;La/psd;ZZI)La/l9h0;

    .line 2237
    .line 2238
    .line 2239
    move-result-object v1

    .line 2240
    invoke-virtual {v4, v0, v1}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2241
    .line 2242
    .line 2243
    move-result v0

    .line 2244
    if-eqz v0, :cond_47

    .line 2245
    .line 2246
    if-eqz v6, :cond_48

    .line 2247
    .line 2248
    invoke-virtual {v4}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 2249
    .line 2250
    .line 2251
    move-result-object v0

    .line 2252
    check-cast v0, La/l9h0;

    .line 2253
    .line 2254
    iget-object v0, v0, La/l9h0;->l:La/psd;

    .line 2255
    .line 2256
    instance-of v0, v0, La/osd;

    .line 2257
    .line 2258
    if-eqz v0, :cond_48

    .line 2259
    .line 2260
    invoke-virtual {v3}, La/naw;->z()V

    .line 2261
    .line 2262
    .line 2263
    :cond_48
    :goto_23
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2264
    .line 2265
    return-object v0

    .line 2266
    :pswitch_4
    const/4 v1, 0x0

    .line 2267
    const/16 v2, 0x8

    .line 2268
    .line 2269
    iget-object v0, v0, La/q1w;->j:Ljava/lang/Object;

    .line 2270
    .line 2271
    check-cast v0, La/t4w;

    .line 2272
    .line 2273
    sget-object v3, La/wne;->a:La/wne;

    .line 2274
    .line 2275
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2276
    .line 2277
    .line 2278
    if-eqz v0, :cond_4a

    .line 2279
    .line 2280
    iget-boolean v0, v0, La/t4w;->a:Z

    .line 2281
    .line 2282
    sget-object v1, La/s1w;->d2:La/bst;

    .line 2283
    .line 2284
    invoke-virtual {v10}, La/s1w;->I0()La/t1w;

    .line 2285
    .line 2286
    .line 2287
    move-result-object v1

    .line 2288
    iget-object v1, v1, La/t1w;->i:Landroid/widget/FrameLayout;

    .line 2289
    .line 2290
    if-eqz v0, :cond_49

    .line 2291
    .line 2292
    move v7, v9

    .line 2293
    goto :goto_24

    .line 2294
    :cond_49
    move v7, v2

    .line 2295
    :goto_24
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 2296
    .line 2297
    .line 2298
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2299
    .line 2300
    goto :goto_25

    .line 2301
    :cond_4a
    invoke-static {}, La/t9f;->b()V

    .line 2302
    .line 2303
    .line 2304
    move-object v11, v1

    .line 2305
    :goto_25
    return-object v11

    .line 2306
    :pswitch_5
    const/16 v16, 0x0

    .line 2307
    .line 2308
    sget-object v1, La/qek0;->a:La/qek0;

    .line 2309
    .line 2310
    sget-object v8, La/rek0;->b:La/rek0;

    .line 2311
    .line 2312
    iget-object v4, v0, La/q1w;->j:Ljava/lang/Object;

    .line 2313
    .line 2314
    check-cast v4, La/s4w;

    .line 2315
    .line 2316
    sget-object v7, La/wne;->a:La/wne;

    .line 2317
    .line 2318
    invoke-static/range {p1 .. p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 2319
    .line 2320
    .line 2321
    sget-object v7, La/m4w;->a:La/m4w;

    .line 2322
    .line 2323
    invoke-static {v4, v7}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2324
    .line 2325
    .line 2326
    move-result v7

    .line 2327
    iget-object v9, v0, La/q1w;->k:La/s1w;

    .line 2328
    .line 2329
    if-eqz v7, :cond_4b

    .line 2330
    .line 2331
    invoke-virtual {v9}, La/s1w;->H0()La/ii;

    .line 2332
    .line 2333
    .line 2334
    move-result-object v0

    .line 2335
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2336
    .line 2337
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2338
    .line 2339
    .line 2340
    move-result-object v11

    .line 2341
    const v1, 0x7f130ede

    .line 2342
    .line 2343
    .line 2344
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2345
    .line 2346
    .line 2347
    move-result-object v12

    .line 2348
    const v1, 0x7f131843

    .line 2349
    .line 2350
    .line 2351
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2352
    .line 2353
    .line 2354
    move-result-object v13

    .line 2355
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2356
    .line 2357
    .line 2358
    const v1, 0x7f130e07

    .line 2359
    .line 2360
    .line 2361
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2362
    .line 2363
    .line 2364
    move-result-object v14

    .line 2365
    sget-object v19, La/n12;->a:La/n12;

    .line 2366
    .line 2367
    const/16 v20, 0x0

    .line 2368
    .line 2369
    const/16 v21, 0x5d0

    .line 2370
    .line 2371
    const/4 v15, 0x0

    .line 2372
    const-string v16, "REQUEST_SHOW_DELETE_SALE_DIALOG_KEY"

    .line 2373
    .line 2374
    const/16 v17, 0x0

    .line 2375
    .line 2376
    const/16 v18, 0x0

    .line 2377
    .line 2378
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2379
    .line 2380
    .line 2381
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2382
    .line 2383
    .line 2384
    move-result-object v1

    .line 2385
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2386
    .line 2387
    .line 2388
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2389
    .line 2390
    .line 2391
    goto/16 :goto_29

    .line 2392
    .line 2393
    :cond_4b
    instance-of v0, v4, La/o4w;

    .line 2394
    .line 2395
    if-eqz v0, :cond_4c

    .line 2396
    .line 2397
    sget-object v0, La/y3w;->n2:La/sqt;

    .line 2398
    .line 2399
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->F()Landroidx/fragment/app/e;

    .line 2400
    .line 2401
    .line 2402
    move-result-object v1

    .line 2403
    check-cast v4, La/o4w;

    .line 2404
    .line 2405
    iget-object v2, v4, La/o4w;->a:La/n3w;

    .line 2406
    .line 2407
    iget-boolean v3, v4, La/o4w;->b:Z

    .line 2408
    .line 2409
    invoke-virtual {v9}, La/s1w;->L0()La/sys0;

    .line 2410
    .line 2411
    .line 2412
    move-result-object v4

    .line 2413
    invoke-static {v0, v1, v2, v3, v4}, La/sqt;->g(La/sqt;Landroidx/fragment/app/e;La/n3w;ZLa/sys0;)V

    .line 2414
    .line 2415
    .line 2416
    goto/16 :goto_29

    .line 2417
    .line 2418
    :cond_4c
    instance-of v0, v4, La/n4w;

    .line 2419
    .line 2420
    if-eqz v0, :cond_4e

    .line 2421
    .line 2422
    check-cast v4, La/n4w;

    .line 2423
    .line 2424
    iget-object v0, v4, La/n4w;->a:Ljava/lang/String;

    .line 2425
    .line 2426
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 2427
    .line 2428
    .line 2429
    move-result v1

    .line 2430
    if-lez v1, :cond_4d

    .line 2431
    .line 2432
    const v1, 0x7f1309da

    .line 2433
    .line 2434
    .line 2435
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 2436
    .line 2437
    .line 2438
    move-result-object v0

    .line 2439
    invoke-virtual {v9, v1, v0}, Landroidx/fragment/app/Fragment;->I(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2440
    .line 2441
    .line 2442
    move-result-object v0

    .line 2443
    :goto_26
    move-object v11, v0

    .line 2444
    goto :goto_27

    .line 2445
    :cond_4d
    const-string v0, ""

    .line 2446
    .line 2447
    goto :goto_26

    .line 2448
    :goto_27
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2449
    .line 2450
    .line 2451
    invoke-virtual {v9}, La/s1w;->H0()La/ii;

    .line 2452
    .line 2453
    .line 2454
    move-result-object v0

    .line 2455
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2456
    .line 2457
    const v1, 0x7f1309c1

    .line 2458
    .line 2459
    .line 2460
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2461
    .line 2462
    .line 2463
    move-result-object v12

    .line 2464
    invoke-virtual {v9, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2465
    .line 2466
    .line 2467
    move-result-object v13

    .line 2468
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2469
    .line 2470
    .line 2471
    invoke-virtual {v9, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2472
    .line 2473
    .line 2474
    move-result-object v14

    .line 2475
    sget-object v19, La/n12;->a:La/n12;

    .line 2476
    .line 2477
    const/16 v20, 0x0

    .line 2478
    .line 2479
    const/16 v21, 0x5d0

    .line 2480
    .line 2481
    const/4 v15, 0x0

    .line 2482
    const-string v16, "REQUEST_HIDE_BET_HISTORY_ITEM_KEY"

    .line 2483
    .line 2484
    const/16 v17, 0x0

    .line 2485
    .line 2486
    const/16 v18, 0x0

    .line 2487
    .line 2488
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2489
    .line 2490
    .line 2491
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2492
    .line 2493
    .line 2494
    move-result-object v1

    .line 2495
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2496
    .line 2497
    .line 2498
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2499
    .line 2500
    .line 2501
    goto/16 :goto_29

    .line 2502
    .line 2503
    :cond_4e
    instance-of v0, v4, La/l4w;

    .line 2504
    .line 2505
    if-eqz v0, :cond_4f

    .line 2506
    .line 2507
    invoke-virtual {v9}, La/s1w;->H0()La/ii;

    .line 2508
    .line 2509
    .line 2510
    move-result-object v0

    .line 2511
    new-instance v10, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2512
    .line 2513
    const v1, 0x7f13051a

    .line 2514
    .line 2515
    .line 2516
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2517
    .line 2518
    .line 2519
    move-result-object v11

    .line 2520
    const v1, 0x7f130751

    .line 2521
    .line 2522
    .line 2523
    invoke-virtual {v9, v1}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2524
    .line 2525
    .line 2526
    move-result-object v12

    .line 2527
    invoke-virtual {v9, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2528
    .line 2529
    .line 2530
    move-result-object v13

    .line 2531
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2532
    .line 2533
    .line 2534
    invoke-virtual {v9, v5}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2535
    .line 2536
    .line 2537
    move-result-object v14

    .line 2538
    sget-object v19, La/n12;->a:La/n12;

    .line 2539
    .line 2540
    const/16 v20, 0x0

    .line 2541
    .line 2542
    const/16 v21, 0x5d0

    .line 2543
    .line 2544
    const/4 v15, 0x0

    .line 2545
    const-string v16, "REQUEST_COUPON_DIALOG_KEY"

    .line 2546
    .line 2547
    const/16 v17, 0x0

    .line 2548
    .line 2549
    const/16 v18, 0x0

    .line 2550
    .line 2551
    invoke-direct/range {v10 .. v21}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2552
    .line 2553
    .line 2554
    invoke-virtual {v9}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2555
    .line 2556
    .line 2557
    move-result-object v1

    .line 2558
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2559
    .line 2560
    .line 2561
    invoke-virtual {v0, v10, v1}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2562
    .line 2563
    .line 2564
    goto/16 :goto_29

    .line 2565
    .line 2566
    :cond_4f
    instance-of v0, v4, La/q4w;

    .line 2567
    .line 2568
    if-eqz v0, :cond_50

    .line 2569
    .line 2570
    invoke-virtual {v9}, La/s1w;->K0()La/wdk0;

    .line 2571
    .line 2572
    .line 2573
    move-result-object v17

    .line 2574
    new-instance v0, La/xdk0;

    .line 2575
    .line 2576
    const v3, 0x7f13123d

    .line 2577
    .line 2578
    .line 2579
    invoke-virtual {v9, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2580
    .line 2581
    .line 2582
    move-result-object v3

    .line 2583
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2584
    .line 2585
    .line 2586
    check-cast v4, La/q4w;

    .line 2587
    .line 2588
    iget-object v4, v4, La/q4w;->a:Ljava/lang/String;

    .line 2589
    .line 2590
    new-instance v6, Ljava/lang/Integer;

    .line 2591
    .line 2592
    invoke-direct {v6, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 2593
    .line 2594
    .line 2595
    const/16 v7, 0x58

    .line 2596
    .line 2597
    move-object v2, v3

    .line 2598
    move-object v3, v4

    .line 2599
    const/4 v4, 0x0

    .line 2600
    const/4 v5, 0x0

    .line 2601
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2602
    .line 2603
    .line 2604
    const/16 v23, 0x0

    .line 2605
    .line 2606
    const/16 v24, 0x3fc

    .line 2607
    .line 2608
    const/16 v20, 0x0

    .line 2609
    .line 2610
    const/16 v21, 0x0

    .line 2611
    .line 2612
    const/16 v22, 0x0

    .line 2613
    .line 2614
    move-object/from16 v18, v0

    .line 2615
    .line 2616
    move-object/from16 v19, v9

    .line 2617
    .line 2618
    invoke-static/range {v17 .. v24}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2619
    .line 2620
    .line 2621
    goto/16 :goto_29

    .line 2622
    .line 2623
    :cond_50
    move-object/from16 v19, v9

    .line 2624
    .line 2625
    instance-of v0, v4, La/j4w;

    .line 2626
    .line 2627
    if-eqz v0, :cond_52

    .line 2628
    .line 2629
    check-cast v4, La/j4w;

    .line 2630
    .line 2631
    iget-object v0, v4, La/j4w;->b:Ljava/lang/String;

    .line 2632
    .line 2633
    iget-object v1, v4, La/j4w;->a:[B

    .line 2634
    .line 2635
    sget-object v2, La/s1w;->d2:La/bst;

    .line 2636
    .line 2637
    invoke-virtual/range {v19 .. v19}, Landroidx/fragment/app/Fragment;->B()La/kxq;

    .line 2638
    .line 2639
    .line 2640
    move-result-object v2

    .line 2641
    if-eqz v2, :cond_58

    .line 2642
    .line 2643
    invoke-virtual {v2}, Landroid/app/Activity;->isFinishing()Z

    .line 2644
    .line 2645
    .line 2646
    move-result v3

    .line 2647
    if-nez v3, :cond_58

    .line 2648
    .line 2649
    :try_start_0
    const-string v3, "print"

    .line 2650
    .line 2651
    invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 2652
    .line 2653
    .line 2654
    move-result-object v3

    .line 2655
    instance-of v4, v3, Landroid/print/PrintManager;

    .line 2656
    .line 2657
    if-eqz v4, :cond_51

    .line 2658
    .line 2659
    move-object v11, v3

    .line 2660
    check-cast v11, Landroid/print/PrintManager;

    .line 2661
    .line 2662
    goto :goto_28

    .line 2663
    :cond_51
    move-object/from16 v11, v16

    .line 2664
    .line 2665
    :goto_28
    if-eqz v11, :cond_58

    .line 2666
    .line 2667
    sget v3, La/qb90;->e:I

    .line 2668
    .line 2669
    invoke-virtual/range {v19 .. v19}, Landroidx/fragment/app/Fragment;->o0()Landroid/content/Context;

    .line 2670
    .line 2671
    .line 2672
    move-result-object v3

    .line 2673
    invoke-static {v3, v0, v1}, La/xvw;->D(Landroid/content/Context;Ljava/lang/String;[B)La/qb90;

    .line 2674
    .line 2675
    .line 2676
    move-result-object v1

    .line 2677
    new-instance v3, Landroid/print/PrintAttributes$Builder;

    .line 2678
    .line 2679
    invoke-direct {v3}, Landroid/print/PrintAttributes$Builder;-><init>()V

    .line 2680
    .line 2681
    .line 2682
    invoke-virtual {v3}, Landroid/print/PrintAttributes$Builder;->build()Landroid/print/PrintAttributes;

    .line 2683
    .line 2684
    .line 2685
    move-result-object v3

    .line 2686
    invoke-virtual {v11, v0, v1, v3}, Landroid/print/PrintManager;->print(Ljava/lang/String;Landroid/print/PrintDocumentAdapter;Landroid/print/PrintAttributes;)Landroid/print/PrintJob;
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2687
    .line 2688
    .line 2689
    goto/16 :goto_29

    .line 2690
    .line 2691
    :catch_0
    invoke-virtual/range {v19 .. v19}, La/s1w;->K0()La/wdk0;

    .line 2692
    .line 2693
    .line 2694
    move-result-object v17

    .line 2695
    new-instance v18, La/xdk0;

    .line 2696
    .line 2697
    const-string v0, "PDFReader"

    .line 2698
    .line 2699
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 2700
    .line 2701
    .line 2702
    move-result-object v0

    .line 2703
    const v1, 0x7f1307c8

    .line 2704
    .line 2705
    .line 2706
    invoke-virtual {v2, v1, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 2707
    .line 2708
    .line 2709
    move-result-object v9

    .line 2710
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2711
    .line 2712
    .line 2713
    const/4 v13, 0x0

    .line 2714
    const/16 v14, 0x7c

    .line 2715
    .line 2716
    const/4 v10, 0x0

    .line 2717
    const/4 v11, 0x0

    .line 2718
    const/4 v12, 0x0

    .line 2719
    move-object/from16 v7, v18

    .line 2720
    .line 2721
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2722
    .line 2723
    .line 2724
    const/16 v23, 0x0

    .line 2725
    .line 2726
    const/16 v24, 0x3fc

    .line 2727
    .line 2728
    const/16 v20, 0x0

    .line 2729
    .line 2730
    const/16 v21, 0x0

    .line 2731
    .line 2732
    const/16 v22, 0x0

    .line 2733
    .line 2734
    invoke-static/range {v17 .. v24}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2735
    .line 2736
    .line 2737
    goto/16 :goto_29

    .line 2738
    .line 2739
    :cond_52
    move-object/from16 v0, v19

    .line 2740
    .line 2741
    instance-of v2, v4, La/h4w;

    .line 2742
    .line 2743
    if-eqz v2, :cond_53

    .line 2744
    .line 2745
    invoke-virtual {v0}, La/s1w;->K0()La/wdk0;

    .line 2746
    .line 2747
    .line 2748
    move-result-object v18

    .line 2749
    check-cast v4, La/h4w;

    .line 2750
    .line 2751
    iget-object v1, v4, La/h4w;->b:Ljava/lang/String;

    .line 2752
    .line 2753
    iget-object v2, v4, La/h4w;->a:Ljava/lang/String;

    .line 2754
    .line 2755
    const v3, 0x7f1304fe

    .line 2756
    .line 2757
    .line 2758
    invoke-virtual {v0, v3}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2759
    .line 2760
    .line 2761
    move-result-object v21

    .line 2762
    invoke-virtual/range {v21 .. v21}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2763
    .line 2764
    .line 2765
    new-instance v3, Ljava/lang/Integer;

    .line 2766
    .line 2767
    const v4, 0x7f080467

    .line 2768
    .line 2769
    .line 2770
    invoke-direct {v3, v4}, Ljava/lang/Integer;-><init>(I)V

    .line 2771
    .line 2772
    .line 2773
    const/16 v24, 0x0

    .line 2774
    .line 2775
    const/16 v25, 0x40

    .line 2776
    .line 2777
    const-string v19, "Bet Number"

    .line 2778
    .line 2779
    move-object/from16 v17, v0

    .line 2780
    .line 2781
    move-object/from16 v20, v1

    .line 2782
    .line 2783
    move-object/from16 v22, v2

    .line 2784
    .line 2785
    move-object/from16 v23, v3

    .line 2786
    .line 2787
    invoke-static/range {v17 .. v25}, La/j120;->M(Landroidx/fragment/app/Fragment;La/wdk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Landroid/view/ViewGroup;I)V

    .line 2788
    .line 2789
    .line 2790
    goto/16 :goto_29

    .line 2791
    .line 2792
    :cond_53
    move-object v9, v0

    .line 2793
    instance-of v0, v4, La/g4w;

    .line 2794
    .line 2795
    if-eqz v0, :cond_54

    .line 2796
    .line 2797
    invoke-virtual {v9}, La/s1w;->K0()La/wdk0;

    .line 2798
    .line 2799
    .line 2800
    move-result-object v17

    .line 2801
    new-instance v0, La/xdk0;

    .line 2802
    .line 2803
    const v2, 0x7f130330

    .line 2804
    .line 2805
    .line 2806
    invoke-virtual {v9, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2807
    .line 2808
    .line 2809
    move-result-object v2

    .line 2810
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2811
    .line 2812
    .line 2813
    const/4 v6, 0x0

    .line 2814
    const/16 v7, 0x7c

    .line 2815
    .line 2816
    const/4 v3, 0x0

    .line 2817
    const/4 v4, 0x0

    .line 2818
    const/4 v5, 0x0

    .line 2819
    invoke-direct/range {v0 .. v7}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2820
    .line 2821
    .line 2822
    const/16 v23, 0x0

    .line 2823
    .line 2824
    const/16 v24, 0x3fc

    .line 2825
    .line 2826
    const/16 v20, 0x0

    .line 2827
    .line 2828
    const/16 v21, 0x0

    .line 2829
    .line 2830
    const/16 v22, 0x0

    .line 2831
    .line 2832
    move-object/from16 v18, v0

    .line 2833
    .line 2834
    move-object/from16 v19, v9

    .line 2835
    .line 2836
    invoke-static/range {v17 .. v24}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2837
    .line 2838
    .line 2839
    goto/16 :goto_29

    .line 2840
    .line 2841
    :cond_54
    move-object v0, v9

    .line 2842
    instance-of v1, v4, La/i4w;

    .line 2843
    .line 2844
    if-nez v1, :cond_58

    .line 2845
    .line 2846
    instance-of v1, v4, La/k4w;

    .line 2847
    .line 2848
    if-eqz v1, :cond_55

    .line 2849
    .line 2850
    invoke-virtual {v0}, La/s1w;->H0()La/ii;

    .line 2851
    .line 2852
    .line 2853
    move-result-object v1

    .line 2854
    new-instance v7, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2855
    .line 2856
    const v2, 0x7f1307bb

    .line 2857
    .line 2858
    .line 2859
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2860
    .line 2861
    .line 2862
    move-result-object v8

    .line 2863
    const v2, 0x7f13115d

    .line 2864
    .line 2865
    .line 2866
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2867
    .line 2868
    .line 2869
    move-result-object v9

    .line 2870
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->H(I)Ljava/lang/String;

    .line 2871
    .line 2872
    .line 2873
    move-result-object v10

    .line 2874
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2875
    .line 2876
    .line 2877
    sget-object v16, La/n12;->b:La/n12;

    .line 2878
    .line 2879
    const/16 v17, 0x0

    .line 2880
    .line 2881
    const/16 v18, 0x5f8

    .line 2882
    .line 2883
    const/4 v11, 0x0

    .line 2884
    const/4 v12, 0x0

    .line 2885
    const/4 v13, 0x0

    .line 2886
    const/4 v14, 0x0

    .line 2887
    const/4 v15, 0x0

    .line 2888
    invoke-direct/range {v7 .. v18}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 2889
    .line 2890
    .line 2891
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->C()Landroidx/fragment/app/e;

    .line 2892
    .line 2893
    .line 2894
    move-result-object v0

    .line 2895
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2896
    .line 2897
    .line 2898
    invoke-virtual {v1, v7, v0}, La/ii;->d(Lorg/xplatform/uikit/components/dialog/DialogFields;Landroidx/fragment/app/e;)V

    .line 2899
    .line 2900
    .line 2901
    goto :goto_29

    .line 2902
    :cond_55
    instance-of v1, v4, La/p4w;

    .line 2903
    .line 2904
    if-eqz v1, :cond_56

    .line 2905
    .line 2906
    invoke-virtual {v0}, La/s1w;->K0()La/wdk0;

    .line 2907
    .line 2908
    .line 2909
    move-result-object v17

    .line 2910
    new-instance v18, La/xdk0;

    .line 2911
    .line 2912
    check-cast v4, La/p4w;

    .line 2913
    .line 2914
    iget-object v9, v4, La/p4w;->a:Ljava/lang/String;

    .line 2915
    .line 2916
    const/4 v13, 0x0

    .line 2917
    const/16 v14, 0x7c

    .line 2918
    .line 2919
    const/4 v10, 0x0

    .line 2920
    const/4 v11, 0x0

    .line 2921
    const/4 v12, 0x0

    .line 2922
    move-object/from16 v7, v18

    .line 2923
    .line 2924
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2925
    .line 2926
    .line 2927
    const/16 v23, 0x0

    .line 2928
    .line 2929
    const/16 v24, 0x3fc

    .line 2930
    .line 2931
    const/16 v20, 0x0

    .line 2932
    .line 2933
    const/16 v21, 0x0

    .line 2934
    .line 2935
    const/16 v22, 0x0

    .line 2936
    .line 2937
    move-object/from16 v19, v0

    .line 2938
    .line 2939
    invoke-static/range {v17 .. v24}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2940
    .line 2941
    .line 2942
    goto :goto_29

    .line 2943
    :cond_56
    move-object/from16 v19, v0

    .line 2944
    .line 2945
    instance-of v0, v4, La/r4w;

    .line 2946
    .line 2947
    if-eqz v0, :cond_57

    .line 2948
    .line 2949
    invoke-virtual/range {v19 .. v19}, La/s1w;->K0()La/wdk0;

    .line 2950
    .line 2951
    .line 2952
    move-result-object v17

    .line 2953
    new-instance v18, La/xdk0;

    .line 2954
    .line 2955
    check-cast v4, La/r4w;

    .line 2956
    .line 2957
    iget-object v9, v4, La/r4w;->a:Ljava/lang/String;

    .line 2958
    .line 2959
    const/4 v13, 0x0

    .line 2960
    const/16 v14, 0x7c

    .line 2961
    .line 2962
    const/4 v10, 0x0

    .line 2963
    const/4 v11, 0x0

    .line 2964
    const/4 v12, 0x0

    .line 2965
    move-object/from16 v7, v18

    .line 2966
    .line 2967
    invoke-direct/range {v7 .. v14}, La/xdk0;-><init>(La/sek0;Ljava/lang/String;Ljava/lang/String;La/idk0;La/kdk0;Ljava/lang/Integer;I)V

    .line 2968
    .line 2969
    .line 2970
    const/16 v23, 0x0

    .line 2971
    .line 2972
    const/16 v24, 0x3fc

    .line 2973
    .line 2974
    const/16 v20, 0x0

    .line 2975
    .line 2976
    const/16 v21, 0x0

    .line 2977
    .line 2978
    const/16 v22, 0x0

    .line 2979
    .line 2980
    invoke-static/range {v17 .. v24}, La/wdk0;->k(La/wdk0;La/xdk0;Landroidx/fragment/app/Fragment;Landroid/view/Window;Landroid/view/View;ZLjava/lang/Integer;I)La/ndk0;

    .line 2981
    .line 2982
    .line 2983
    goto :goto_29

    .line 2984
    :cond_57
    invoke-static {}, La/t9f;->b()V

    .line 2985
    .line 2986
    .line 2987
    move-object/from16 v11, v16

    .line 2988
    .line 2989
    goto :goto_2a

    .line 2990
    :cond_58
    :goto_29
    sget-object v11, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 2991
    .line 2992
    :goto_2a
    return-object v11

    .line 2993
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
