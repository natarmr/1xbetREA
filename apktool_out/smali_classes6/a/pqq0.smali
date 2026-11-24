.class public final La/pqq0;
.super La/k5;
.source "SourceFile"


# instance fields
.field public l:La/nmo0;


# virtual methods
.method public final b(II)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, La/k5;->a(II)La/y8b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    instance-of p1, p0, La/h4q0;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    instance-of p1, p0, La/r5d;

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    const/4 p0, 0x1

    .line 19
    return p0

    .line 20
    :cond_2
    instance-of p1, p0, La/q5d;

    .line 21
    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    const/4 p0, 0x2

    .line 25
    return p0

    .line 26
    :cond_3
    instance-of p0, p0, La/tjb;

    .line 27
    .line 28
    if-eqz p0, :cond_4

    .line 29
    .line 30
    const/4 p0, 0x3

    .line 31
    return p0

    .line 32
    :cond_4
    :goto_0
    const/4 p0, 0x4

    .line 33
    return p0
.end method

.method public final d(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/k5;->c(I)La/y8b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    instance-of p1, p0, La/r5d;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x5

    .line 13
    return p0

    .line 14
    :cond_1
    instance-of p0, p0, La/q5d;

    .line 15
    .line 16
    if-eqz p0, :cond_2

    .line 17
    .line 18
    const/4 p0, 0x6

    .line 19
    return p0

    .line 20
    :cond_2
    :goto_0
    const/4 p0, 0x7

    .line 21
    return p0
.end method

.method public final f(I)I
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/k5;->e(I)La/y8b;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    instance-of p1, p0, La/phg0;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    const/16 p0, 0x9

    .line 13
    .line 14
    return p0

    .line 15
    :cond_1
    instance-of p0, p0, La/nhg0;

    .line 16
    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    const/16 p0, 0x8

    .line 20
    .line 21
    return p0

    .line 22
    :cond_2
    :goto_0
    const/4 p0, 0x4

    .line 23
    return p0
.end method

.method public final g()La/nmo0;
    .locals 0

    .line 1
    iget-object p0, p0, La/pqq0;->l:La/nmo0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j(La/w5;La/y8b;)V
    .locals 10

    .line 1
    instance-of p0, p1, La/j4q0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const v1, 0x7f070747

    .line 5
    .line 6
    .line 7
    const v2, 0x7f07074a

    .line 8
    .line 9
    .line 10
    const v3, 0x7f070748

    .line 11
    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    check-cast p1, La/j4q0;

    .line 16
    .line 17
    check-cast p2, La/h4q0;

    .line 18
    .line 19
    iget-object p0, p1, La/j4q0;->u:La/bdu0;

    .line 20
    .line 21
    iget-object p0, p0, La/bdu0;->c:Landroid/widget/TextView;

    .line 22
    .line 23
    iget-object p1, p2, La/h4q0;->d:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 33
    .line 34
    .line 35
    move-result p1

    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 41
    .line 42
    .line 43
    move-result p2

    .line 44
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    invoke-static {p0, p1, p2, v1, v0}, La/aem0;->r(Landroid/widget/TextView;IIII)V

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :cond_0
    instance-of p0, p1, La/u5d;

    .line 57
    .line 58
    if-eqz p0, :cond_1

    .line 59
    .line 60
    check-cast p1, La/u5d;

    .line 61
    .line 62
    check-cast p2, La/s5d;

    .line 63
    .line 64
    invoke-virtual {p1, p2}, La/u5d;->v(La/s5d;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :cond_1
    instance-of p0, p1, La/ujb;

    .line 69
    .line 70
    if-eqz p0, :cond_5

    .line 71
    .line 72
    check-cast p1, La/ujb;

    .line 73
    .line 74
    check-cast p2, La/tjb;

    .line 75
    .line 76
    iget-object p0, p2, La/tjb;->j:Ljava/lang/String;

    .line 77
    .line 78
    iget-object p1, p1, La/ujb;->u:La/uk5;

    .line 79
    .line 80
    iget-object v4, p1, La/uk5;->d:Landroid/view/View;

    .line 81
    .line 82
    check-cast v4, Landroid/widget/TextView;

    .line 83
    .line 84
    iget-object v5, p1, La/uk5;->g:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v5, La/vd7;

    .line 87
    .line 88
    iget-object v6, p1, La/uk5;->f:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v6, La/vd7;

    .line 91
    .line 92
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 93
    .line 94
    .line 95
    move-result-object v7

    .line 96
    invoke-virtual {v7, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 97
    .line 98
    .line 99
    move-result v7

    .line 100
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    invoke-virtual {v8, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    invoke-virtual {v4}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    invoke-virtual {v9, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    invoke-static {v4, v7, v8, v9, v0}, La/aem0;->r(Landroid/widget/TextView;IIII)V

    .line 117
    .line 118
    .line 119
    iget-object v7, p2, La/tjb;->i:Ljava/lang/String;

    .line 120
    .line 121
    iget-object v8, p2, La/tjb;->h:Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {v4, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    const/16 v9, 0x8

    .line 131
    .line 132
    if-lez p0, :cond_2

    .line 133
    .line 134
    move p0, v0

    .line 135
    goto :goto_0

    .line 136
    :cond_2
    move p0, v9

    .line 137
    :goto_0
    invoke-virtual {v4, p0}, Landroid/view/View;->setVisibility(I)V

    .line 138
    .line 139
    .line 140
    iget-object p0, p1, La/uk5;->c:Landroid/view/View;

    .line 141
    .line 142
    check-cast p0, Landroid/widget/TextView;

    .line 143
    .line 144
    invoke-virtual {p0, v8}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 148
    .line 149
    .line 150
    move-result v4

    .line 151
    if-lez v4, :cond_3

    .line 152
    .line 153
    move v4, v0

    .line 154
    goto :goto_1

    .line 155
    :cond_3
    move v4, v9

    .line 156
    :goto_1
    invoke-virtual {p0, v4}, Landroid/view/View;->setVisibility(I)V

    .line 157
    .line 158
    .line 159
    iget-object p0, p1, La/uk5;->e:Landroid/view/View;

    .line 160
    .line 161
    check-cast p0, Landroid/widget/TextView;

    .line 162
    .line 163
    invoke-virtual {p0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result p1

    .line 170
    if-lez p1, :cond_4

    .line 171
    .line 172
    move v9, v0

    .line 173
    :cond_4
    invoke-virtual {p0, v9}, Landroid/view/View;->setVisibility(I)V

    .line 174
    .line 175
    .line 176
    iget-object p0, v6, La/vd7;->c:Landroid/view/View;

    .line 177
    .line 178
    check-cast p0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 179
    .line 180
    iget-object p1, p2, La/tjb;->d:Ljava/lang/String;

    .line 181
    .line 182
    const/4 v4, 0x0

    .line 183
    const/16 v7, 0xe

    .line 184
    .line 185
    invoke-static {p0, p1, v4, v7}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    .line 186
    .line 187
    .line 188
    iget-object p0, v6, La/vd7;->d:Landroid/view/View;

    .line 189
    .line 190
    check-cast p0, Landroid/widget/TextView;

    .line 191
    .line 192
    iget-object p1, p2, La/tjb;->f:Ljava/lang/String;

    .line 193
    .line 194
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 202
    .line 203
    .line 204
    move-result p1

    .line 205
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    invoke-virtual {v6, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 210
    .line 211
    .line 212
    move-result v6

    .line 213
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 214
    .line 215
    .line 216
    move-result-object v8

    .line 217
    invoke-virtual {v8, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 218
    .line 219
    .line 220
    move-result v8

    .line 221
    invoke-static {p0, p1, v6, v8, v0}, La/aem0;->r(Landroid/widget/TextView;IIII)V

    .line 222
    .line 223
    .line 224
    iget-object p0, v5, La/vd7;->c:Landroid/view/View;

    .line 225
    .line 226
    check-cast p0, Lorg/xplatform/uikit/components/team_logo/DsTeamLogo;

    .line 227
    .line 228
    iget-object p1, p2, La/tjb;->e:Ljava/lang/String;

    .line 229
    .line 230
    invoke-static {p0, p1, v4, v7}, Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;->i(Lorg/xplatform/uikit/components/views/LoadableShapeableImageView;Ljava/lang/String;Landroid/graphics/drawable/Drawable;I)V

    .line 231
    .line 232
    .line 233
    iget-object p0, v5, La/vd7;->d:Landroid/view/View;

    .line 234
    .line 235
    check-cast p0, Landroid/widget/TextView;

    .line 236
    .line 237
    iget-object p1, p2, La/tjb;->g:Ljava/lang/String;

    .line 238
    .line 239
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 243
    .line 244
    .line 245
    move-result-object p1

    .line 246
    invoke-virtual {p1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 247
    .line 248
    .line 249
    move-result p1

    .line 250
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 251
    .line 252
    .line 253
    move-result-object p2

    .line 254
    invoke-virtual {p2, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 255
    .line 256
    .line 257
    move-result p2

    .line 258
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 259
    .line 260
    .line 261
    move-result-object v2

    .line 262
    invoke-virtual {v2, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 263
    .line 264
    .line 265
    move-result v1

    .line 266
    invoke-static {p0, p1, p2, v1, v0}, La/aem0;->r(Landroid/widget/TextView;IIII)V

    .line 267
    .line 268
    .line 269
    :cond_5
    return-void
.end method

.method public final k(La/w5;La/y8b;)V
    .locals 0

    .line 1
    instance-of p0, p1, La/u5d;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    check-cast p1, La/u5d;

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-eqz p1, :cond_1

    .line 10
    .line 11
    check-cast p2, La/s5d;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, La/u5d;->v(La/s5d;)V

    .line 14
    .line 15
    .line 16
    :cond_1
    return-void
.end method

.method public final l(La/w5;La/y8b;)V
    .locals 0

    .line 1
    instance-of p0, p1, La/ohg0;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    check-cast p1, La/ohg0;

    .line 6
    .line 7
    check-cast p2, La/nhg0;

    .line 8
    .line 9
    sget-object p0, La/u0d;->a:Ljava/util/List;

    .line 10
    .line 11
    iget-object p0, p1, La/ohg0;->u:La/nq8;

    .line 12
    .line 13
    iget-object p0, p0, La/nq8;->c:Landroid/view/View;

    .line 14
    .line 15
    check-cast p0, Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 16
    .line 17
    iget-object p1, p2, La/nhg0;->d:Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {p0, p1}, La/u0d;->k(Landroid/widget/ImageView;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void

    .line 23
    :cond_0
    instance-of p0, p1, La/qhg0;

    .line 24
    .line 25
    if-eqz p0, :cond_1

    .line 26
    .line 27
    check-cast p1, La/qhg0;

    .line 28
    .line 29
    check-cast p2, La/phg0;

    .line 30
    .line 31
    iget-object p0, p1, La/qhg0;->u:La/bdu0;

    .line 32
    .line 33
    iget-object p0, p0, La/bdu0;->c:Landroid/widget/TextView;

    .line 34
    .line 35
    iget-object p1, p2, La/phg0;->d:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    :cond_1
    return-void
.end method

.method public final m(Landroid/view/ViewGroup;I)La/w5;
    .locals 10

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x0

    .line 10
    const/4 v1, 0x3

    .line 11
    const-string v2, "Missing required view with ID: "

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    if-eqz p2, :cond_3

    .line 15
    .line 16
    const/4 v4, 0x1

    .line 17
    if-eq p2, v4, :cond_2

    .line 18
    .line 19
    const/4 v4, 0x2

    .line 20
    if-eq p2, v4, :cond_2

    .line 21
    .line 22
    if-ne p2, v1, :cond_1

    .line 23
    .line 24
    new-instance p2, La/ujb;

    .line 25
    .line 26
    const v1, 0x7f0d0627

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v1, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    const p1, 0x7f0a05a9

    .line 34
    .line 35
    .line 36
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 37
    .line 38
    .line 39
    move-result-object v1

    .line 40
    if-eqz v1, :cond_0

    .line 41
    .line 42
    invoke-static {v1}, La/vd7;->b(Landroid/view/View;)La/vd7;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    const p1, 0x7f0a0d3f

    .line 47
    .line 48
    .line 49
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    if-eqz v1, :cond_0

    .line 54
    .line 55
    invoke-static {v1}, La/vd7;->b(Landroid/view/View;)La/vd7;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    const p1, 0x7f0a10d7

    .line 60
    .line 61
    .line 62
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    move-object v7, v1

    .line 67
    check-cast v7, Landroid/widget/TextView;

    .line 68
    .line 69
    if-eqz v7, :cond_0

    .line 70
    .line 71
    const p1, 0x7f0a11a7

    .line 72
    .line 73
    .line 74
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    move-object v8, v1

    .line 79
    check-cast v8, Landroid/widget/TextView;

    .line 80
    .line 81
    if-eqz v8, :cond_0

    .line 82
    .line 83
    const p1, 0x7f0a1258

    .line 84
    .line 85
    .line 86
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    move-object v9, v1

    .line 91
    check-cast v9, Landroid/widget/TextView;

    .line 92
    .line 93
    if-eqz v9, :cond_0

    .line 94
    .line 95
    new-instance v3, La/uk5;

    .line 96
    .line 97
    move-object v4, p0

    .line 98
    check-cast v4, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 99
    .line 100
    invoke-direct/range {v3 .. v9}, La/uk5;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;La/vd7;La/vd7;Landroid/widget/TextView;Landroid/widget/TextView;Landroid/widget/TextView;)V

    .line 101
    .line 102
    .line 103
    invoke-direct {p2, v3}, La/ujb;-><init>(La/uk5;)V

    .line 104
    .line 105
    .line 106
    return-object p2

    .line 107
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    return-object v0

    .line 123
    :cond_1
    new-instance p0, Ljava/lang/Throwable;

    .line 124
    .line 125
    const-string p1, "ViewHolder for "

    .line 126
    .line 127
    const-string v0, " wasn\'t found"

    .line 128
    .line 129
    invoke-static {p2, p1, v0}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p0

    .line 137
    :cond_2
    new-instance p2, La/u5d;

    .line 138
    .line 139
    invoke-static {p0, p1}, La/d5e0;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/d5e0;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    invoke-direct {p2, p0}, La/u5d;-><init>(La/d5e0;)V

    .line 144
    .line 145
    .line 146
    return-object p2

    .line 147
    :cond_3
    new-instance p2, La/j4q0;

    .line 148
    .line 149
    const v4, 0x7f0d0679

    .line 150
    .line 151
    .line 152
    invoke-virtual {p0, v4, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    const p1, 0x7f0a10bf

    .line 157
    .line 158
    .line 159
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    check-cast v3, Landroid/widget/TextView;

    .line 164
    .line 165
    if-eqz v3, :cond_4

    .line 166
    .line 167
    new-instance p1, La/bdu0;

    .line 168
    .line 169
    check-cast p0, Landroid/widget/FrameLayout;

    .line 170
    .line 171
    invoke-direct {p1, p0, v3, v1}, La/bdu0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;B)V

    .line 172
    .line 173
    .line 174
    invoke-direct {p2, p1}, La/j4q0;-><init>(La/bdu0;)V

    .line 175
    .line 176
    .line 177
    return-object p2

    .line 178
    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 179
    .line 180
    .line 181
    move-result-object p0

    .line 182
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p0

    .line 186
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 191
    .line 192
    .line 193
    return-object v0
.end method

.method public final n(Landroid/view/ViewGroup;I)La/w5;
    .locals 1

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x5

    .line 10
    if-eq p2, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x6

    .line 13
    if-ne p2, v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    new-instance p0, Ljava/lang/Throwable;

    .line 17
    .line 18
    const-string p1, "ViewHolder for "

    .line 19
    .line 20
    const-string v0, " wasn\'t found"

    .line 21
    .line 22
    invoke-static {p2, p1, v0}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0

    .line 30
    :cond_1
    :goto_0
    new-instance p2, La/u5d;

    .line 31
    .line 32
    invoke-static {p0, p1}, La/d5e0;->d(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/d5e0;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-direct {p2, p0}, La/u5d;-><init>(La/d5e0;)V

    .line 37
    .line 38
    .line 39
    return-object p2
.end method

.method public final o(Landroid/view/ViewGroup;La/y8b;)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance p0, Landroid/widget/FrameLayout;

    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    invoke-direct {p0, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    new-instance p2, Landroid/widget/FrameLayout$LayoutParams;

    .line 14
    .line 15
    const v0, 0x7f070714

    .line 16
    .line 17
    .line 18
    invoke-static {p1, v0}, La/vqd;->d(Landroid/view/ViewGroup;I)I

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    const/4 v0, 0x0

    .line 23
    invoke-direct {p2, p1, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public final p(Landroid/view/ViewGroup;I)La/w5;
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/16 v0, 0x8

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    const-string v2, "Missing required view with ID: "

    .line 13
    .line 14
    const/4 v3, 0x0

    .line 15
    if-eq p2, v0, :cond_2

    .line 16
    .line 17
    const/16 v0, 0x9

    .line 18
    .line 19
    if-ne p2, v0, :cond_1

    .line 20
    .line 21
    new-instance p2, La/qhg0;

    .line 22
    .line 23
    const v0, 0x7f0d066e

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, v0, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    const p1, 0x7f0a118e

    .line 31
    .line 32
    .line 33
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Landroid/widget/TextView;

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    .line 41
    new-instance p1, La/bdu0;

    .line 42
    .line 43
    check-cast p0, Landroid/widget/FrameLayout;

    .line 44
    .line 45
    const/4 v1, 0x1

    .line 46
    invoke-direct {p1, p0, v0, v1}, La/bdu0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;B)V

    .line 47
    .line 48
    .line 49
    invoke-direct {p2, p1}, La/qhg0;-><init>(La/bdu0;)V

    .line 50
    .line 51
    .line 52
    return-object p2

    .line 53
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_1
    new-instance p0, Ljava/lang/Throwable;

    .line 70
    .line 71
    const-string p1, "ViewHolder for "

    .line 72
    .line 73
    const-string v0, " wasn\'t found"

    .line 74
    .line 75
    invoke-static {p2, p1, v0}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p1

    .line 79
    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    throw p0

    .line 83
    :cond_2
    new-instance p2, La/ohg0;

    .line 84
    .line 85
    const v0, 0x7f0d066d

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v0, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    const p1, 0x7f0a08bd

    .line 93
    .line 94
    .line 95
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Lorg/xplatform/uikit/components/views/LoadableImageView;

    .line 100
    .line 101
    if-eqz v0, :cond_3

    .line 102
    .line 103
    new-instance p1, La/nq8;

    .line 104
    .line 105
    check-cast p0, Landroid/widget/FrameLayout;

    .line 106
    .line 107
    const/16 v1, 0x12

    .line 108
    .line 109
    invoke-direct {p1, p0, v0, v1}, La/nq8;-><init>(Landroid/view/View;Landroid/view/View;B)V

    .line 110
    .line 111
    .line 112
    invoke-direct {p2, p1}, La/ohg0;-><init>(La/nq8;)V

    .line 113
    .line 114
    .line 115
    return-object p2

    .line 116
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object p0

    .line 124
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object v1
.end method

.method public final r(Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/pqq0;->l:La/nmo0;

    .line 2
    .line 3
    return-void
.end method
