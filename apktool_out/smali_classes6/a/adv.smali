.class public final La/adv;
.super La/k5;
.source "SourceFile"


# instance fields
.field public l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;


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
    instance-of p1, p0, La/idj;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x2

    .line 13
    return p0

    .line 14
    :cond_1
    instance-of p1, p0, La/eyl0;

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    const/4 p0, 0x3

    .line 19
    return p0

    .line 20
    :cond_2
    instance-of p1, p0, La/qkc;

    .line 21
    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    const/4 p0, 0x4

    .line 25
    return p0

    .line 26
    :cond_3
    instance-of p0, p0, La/tih0;

    .line 27
    .line 28
    if-eqz p0, :cond_4

    .line 29
    .line 30
    const/4 p0, 0x5

    .line 31
    return p0

    .line 32
    :cond_4
    :goto_0
    const/4 p0, 0x1

    .line 33
    return p0
.end method

.method public final g()La/nmo0;
    .locals 0

    .line 1
    iget-object p0, p0, La/adv;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j(La/w5;La/y8b;)V
    .locals 8

    .line 1
    instance-of p0, p1, La/jdj;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    instance-of p0, p2, La/idj;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    check-cast p1, La/jdj;

    .line 10
    .line 11
    check-cast p2, La/idj;

    .line 12
    .line 13
    iget-object p0, p1, La/jdj;->u:La/wcu0;

    .line 14
    .line 15
    iget-object p1, p0, La/wcu0;->d:Landroid/widget/TextView;

    .line 16
    .line 17
    iget-object v0, p2, La/idj;->d:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    .line 21
    .line 22
    iget-object p0, p0, La/wcu0;->c:Landroid/widget/TextView;

    .line 23
    .line 24
    iget-object p1, p2, La/idj;->e:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_0
    instance-of p0, p1, La/jyl0;

    .line 31
    .line 32
    if-eqz p0, :cond_1

    .line 33
    .line 34
    instance-of p0, p2, La/eyl0;

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    check-cast p1, La/jyl0;

    .line 39
    .line 40
    check-cast p2, La/eyl0;

    .line 41
    .line 42
    sget-object p0, La/u0d;->a:Ljava/util/List;

    .line 43
    .line 44
    iget-object p0, p1, La/jyl0;->u:La/jk30;

    .line 45
    .line 46
    iget-object v0, p0, La/jk30;->c:Landroid/widget/ImageView;

    .line 47
    .line 48
    iget-object v1, p2, La/eyl0;->e:Ljava/lang/String;

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    const/16 v7, 0x1fc

    .line 52
    .line 53
    const v2, 0x7f080af4

    .line 54
    .line 55
    .line 56
    const/4 v3, 0x0

    .line 57
    const/4 v4, 0x0

    .line 58
    const/4 v5, 0x0

    .line 59
    invoke-static/range {v0 .. v7}, La/u0d;->j(Landroid/widget/ImageView;Ljava/lang/String;IILjava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    .line 60
    .line 61
    .line 62
    iget-object p0, p0, La/jk30;->d:Landroid/widget/TextView;

    .line 63
    .line 64
    iget-object p1, p2, La/eyl0;->d:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_1
    instance-of p0, p1, La/rkc;

    .line 71
    .line 72
    if-eqz p0, :cond_2

    .line 73
    .line 74
    instance-of p0, p2, La/qkc;

    .line 75
    .line 76
    if-eqz p0, :cond_2

    .line 77
    .line 78
    check-cast p1, La/rkc;

    .line 79
    .line 80
    check-cast p2, La/qkc;

    .line 81
    .line 82
    iget-object p0, p1, La/rkc;->u:La/d5e0;

    .line 83
    .line 84
    iget-object p0, p0, La/d5e0;->c:Landroid/widget/TextView;

    .line 85
    .line 86
    iget-object p1, p2, La/qkc;->d:Ljava/lang/String;

    .line 87
    .line 88
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 89
    .line 90
    .line 91
    return-void

    .line 92
    :cond_2
    instance-of p0, p1, La/uih0;

    .line 93
    .line 94
    if-eqz p0, :cond_3

    .line 95
    .line 96
    instance-of p0, p2, La/tih0;

    .line 97
    .line 98
    if-eqz p0, :cond_3

    .line 99
    .line 100
    check-cast p1, La/uih0;

    .line 101
    .line 102
    check-cast p2, La/tih0;

    .line 103
    .line 104
    iget-object p0, p1, La/uih0;->u:La/d5e0;

    .line 105
    .line 106
    iget-object p0, p0, La/d5e0;->c:Landroid/widget/TextView;

    .line 107
    .line 108
    iget-object p1, p2, La/tih0;->d:Ljava/lang/String;

    .line 109
    .line 110
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 111
    .line 112
    .line 113
    :cond_3
    return-void
.end method

.method public final k(La/w5;La/y8b;)V
    .locals 0

    .line 1
    instance-of p0, p2, La/hcv;

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    .line 5
    instance-of p0, p1, La/icv;

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    check-cast p1, La/icv;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    :goto_0
    if-eqz p1, :cond_1

    .line 14
    .line 15
    check-cast p2, La/hcv;

    .line 16
    .line 17
    iget-object p0, p1, La/icv;->u:La/d5e0;

    .line 18
    .line 19
    iget-object p0, p0, La/d5e0;->c:Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object p1, p2, La/hcv;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    iget p1, p2, La/hcv;->e:I

    .line 27
    .line 28
    or-int/lit8 p1, p1, 0x10

    .line 29
    .line 30
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public final m(Landroid/view/ViewGroup;I)La/w5;
    .locals 5

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
    const-string v1, "Missing required view with ID: "

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/4 v3, 0x2

    .line 14
    if-eq p2, v3, :cond_6

    .line 15
    .line 16
    const/4 v4, 0x3

    .line 17
    if-eq p2, v4, :cond_4

    .line 18
    .line 19
    const/4 v3, 0x4

    .line 20
    if-eq p2, v3, :cond_2

    .line 21
    .line 22
    const/4 v3, 0x5

    .line 23
    if-ne p2, v3, :cond_1

    .line 24
    .line 25
    new-instance p2, La/uih0;

    .line 26
    .line 27
    const v3, 0x7f0d063d

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v3, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    const p1, 0x7f0a11f0

    .line 35
    .line 36
    .line 37
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    check-cast v2, Landroid/widget/TextView;

    .line 42
    .line 43
    if-eqz v2, :cond_0

    .line 44
    .line 45
    new-instance p1, La/d5e0;

    .line 46
    .line 47
    check-cast p0, Landroid/widget/FrameLayout;

    .line 48
    .line 49
    const/16 v0, 0xe

    .line 50
    .line 51
    invoke-direct {p1, p0, v2, v0}, La/d5e0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;B)V

    .line 52
    .line 53
    .line 54
    invoke-direct {p2, p1}, La/uih0;-><init>(La/d5e0;)V

    .line 55
    .line 56
    .line 57
    return-object p2

    .line 58
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :cond_1
    new-instance p0, Ljava/lang/Exception;

    .line 75
    .line 76
    const-string p1, ""

    .line 77
    .line 78
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    throw p0

    .line 82
    :cond_2
    new-instance p2, La/rkc;

    .line 83
    .line 84
    const v3, 0x7f0d0639

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, v3, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    const p1, 0x7f0a109b

    .line 92
    .line 93
    .line 94
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    check-cast v2, Landroid/widget/TextView;

    .line 99
    .line 100
    if-eqz v2, :cond_3

    .line 101
    .line 102
    new-instance p1, La/d5e0;

    .line 103
    .line 104
    check-cast p0, Landroid/widget/FrameLayout;

    .line 105
    .line 106
    const/16 v0, 0xc

    .line 107
    .line 108
    invoke-direct {p1, p0, v2, v0}, La/d5e0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;B)V

    .line 109
    .line 110
    .line 111
    invoke-direct {p2, p1}, La/rkc;-><init>(La/d5e0;)V

    .line 112
    .line 113
    .line 114
    return-object p2

    .line 115
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    return-object v0

    .line 131
    :cond_4
    new-instance p2, La/jyl0;

    .line 132
    .line 133
    const v4, 0x7f0d063e

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0, v4, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    const p1, 0x7f0a0819

    .line 141
    .line 142
    .line 143
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, Landroid/widget/ImageView;

    .line 148
    .line 149
    if-eqz v2, :cond_5

    .line 150
    .line 151
    const p1, 0x7f0a1260

    .line 152
    .line 153
    .line 154
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    check-cast v4, Landroid/widget/TextView;

    .line 159
    .line 160
    if-eqz v4, :cond_5

    .line 161
    .line 162
    new-instance p1, La/jk30;

    .line 163
    .line 164
    check-cast p0, Landroid/widget/LinearLayout;

    .line 165
    .line 166
    invoke-direct {p1, p0, v2, v4, v3}, La/jk30;-><init>(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/TextView;B)V

    .line 167
    .line 168
    .line 169
    invoke-direct {p2, p1}, La/jyl0;-><init>(La/jk30;)V

    .line 170
    .line 171
    .line 172
    return-object p2

    .line 173
    :cond_5
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p0

    .line 181
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 186
    .line 187
    .line 188
    return-object v0

    .line 189
    :cond_6
    new-instance p2, La/jdj;

    .line 190
    .line 191
    const v3, 0x7f0d063b

    .line 192
    .line 193
    .line 194
    invoke-virtual {p0, v3, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    const p1, 0x7f0a10d8

    .line 199
    .line 200
    .line 201
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 202
    .line 203
    .line 204
    move-result-object v3

    .line 205
    check-cast v3, Landroid/widget/TextView;

    .line 206
    .line 207
    if-eqz v3, :cond_7

    .line 208
    .line 209
    const p1, 0x7f0a10da

    .line 210
    .line 211
    .line 212
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 213
    .line 214
    .line 215
    move-result-object v4

    .line 216
    check-cast v4, Landroid/widget/TextView;

    .line 217
    .line 218
    if-eqz v4, :cond_7

    .line 219
    .line 220
    new-instance p1, La/wcu0;

    .line 221
    .line 222
    check-cast p0, Landroid/widget/LinearLayout;

    .line 223
    .line 224
    invoke-direct {p1, p0, v3, v4, v2}, La/wcu0;-><init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;Landroid/widget/TextView;B)V

    .line 225
    .line 226
    .line 227
    invoke-direct {p2, p1}, La/jdj;-><init>(La/wcu0;)V

    .line 228
    .line 229
    .line 230
    return-object p2

    .line 231
    :cond_7
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 240
    .line 241
    .line 242
    move-result-object p0

    .line 243
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 244
    .line 245
    .line 246
    return-object v0
.end method

.method public final n(Landroid/view/ViewGroup;I)La/w5;
    .locals 2

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
    new-instance p2, La/icv;

    .line 10
    .line 11
    const v0, 0x7f0d063a

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const p1, 0x7f0a11f0

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    check-cast v0, Landroid/widget/TextView;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    new-instance p1, La/d5e0;

    .line 31
    .line 32
    check-cast p0, Landroid/widget/FrameLayout;

    .line 33
    .line 34
    const/16 v1, 0xd

    .line 35
    .line 36
    invoke-direct {p1, p0, v0, v1}, La/d5e0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;B)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p2, p1}, La/icv;-><init>(La/d5e0;)V

    .line 40
    .line 41
    .line 42
    return-object p2

    .line 43
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    const-string p1, "Missing required view with ID: "

    .line 52
    .line 53
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    return-object p0
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
    const v0, 0x7f07071e

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
    invoke-direct {p2, v0, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

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
    .locals 2

    .line 1
    new-instance p0, La/sun;

    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    const v0, 0x7f0d063c

    .line 12
    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    check-cast p1, Landroid/widget/FrameLayout;

    .line 22
    .line 23
    invoke-direct {p0, p1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    const-string p0, "rootView"

    .line 28
    .line 29
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public final r(Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/adv;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 2
    .line 3
    return-void
.end method
