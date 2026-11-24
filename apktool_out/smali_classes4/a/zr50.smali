.class public final La/zr50;
.super La/v46;
.source "SourceFile"


# instance fields
.field public final synthetic u:B

.field public final v:Ljava/lang/Object;

.field public final w:Ljava/lang/Object;

.field public final x:Ljava/lang/Object;

.field public y:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/view/View;La/p0z;La/b530;)V
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/zr50;->u:B

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 11
    .line 12
    .line 13
    iput-object p2, p0, La/zr50;->v:Ljava/lang/Object;

    .line 14
    .line 15
    iput-object p3, p0, La/zr50;->w:Ljava/lang/Object;

    .line 16
    .line 17
    const p2, 0x7f0a00a1

    .line 18
    .line 19
    .line 20
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object p3

    .line 24
    move-object v2, p3

    .line 25
    check-cast v2, Landroid/widget/TextView;

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    const p2, 0x7f0a025e

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    move-object v3, p3

    .line 37
    check-cast v3, Landroidx/recyclerview/widget/RecyclerView;

    .line 38
    .line 39
    if-eqz v3, :cond_0

    .line 40
    .line 41
    const p2, 0x7f0a0fdd

    .line 42
    .line 43
    .line 44
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object p3

    .line 48
    move-object v4, p3

    .line 49
    check-cast v4, Landroid/widget/TextView;

    .line 50
    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    new-instance v0, La/dc3;

    .line 54
    .line 55
    move-object v1, p1

    .line 56
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 57
    .line 58
    const/4 v5, 0x6

    .line 59
    invoke-direct/range {v0 .. v5}, La/dc3;-><init>(Landroid/view/ViewGroup;Landroid/widget/TextView;Landroid/view/View;Landroid/view/View;B)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p0, La/zr50;->x:Ljava/lang/Object;

    .line 63
    .line 64
    new-instance p2, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 65
    .line 66
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const/4 p3, 0x2

    .line 71
    const/4 v0, 0x0

    .line 72
    invoke-direct {p2, p1, p3, v0, v0}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;IIZ)V

    .line 73
    .line 74
    .line 75
    iput-object p2, p0, La/zr50;->y:Ljava/lang/Object;

    .line 76
    .line 77
    new-instance p0, La/nhe0;

    .line 78
    .line 79
    invoke-direct {p0}, La/nhe0;-><init>()V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, p2}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v3, p0}, Landroidx/recyclerview/widget/RecyclerView;->setRecycledViewPool(La/nhe0;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    const-string p1, "Missing required view with ID: "

    .line 98
    .line 99
    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    const/4 p0, 0x0

    .line 107
    throw p0
.end method

.method public constructor <init>(Landroid/view/View;La/ygq0;Lkotlin/jvm/functions/Function1;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/zr50;->u:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    invoke-direct {p0, p1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 109
    iput-object p1, p0, La/zr50;->v:Ljava/lang/Object;

    iput-object p2, p0, La/zr50;->w:Ljava/lang/Object;

    .line 110
    iput-object p3, p0, La/zr50;->x:Ljava/lang/Object;

    .line 111
    move-object p2, p1

    check-cast p2, Landroid/widget/LinearLayout;

    const p3, 0x7f0a0fc5

    .line 112
    invoke-static {p1, p3}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 113
    new-instance p1, La/lth;

    const/4 p3, 0x0

    invoke-direct {p1, p2, v0, p3}, La/lth;-><init>(Landroid/widget/LinearLayout;Landroid/widget/TextView;B)V

    .line 114
    iput-object p1, p0, La/zr50;->y:Ljava/lang/Object;

    return-void

    .line 115
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, p3}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 116
    const-string p1, "Missing required view with ID: "

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public constructor <init>(Landroid/view/View;Landroidx/recyclerview/widget/RecyclerView;La/jt50;)V
    .locals 7

    const/4 v0, 0x0

    iput-byte v0, p0, La/zr50;->u:B

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 117
    invoke-direct {p0, p1}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 118
    iput-object p2, p0, La/zr50;->v:Ljava/lang/Object;

    .line 119
    iput-object p3, p0, La/zr50;->w:Ljava/lang/Object;

    .line 120
    move-object v2, p1

    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    const p2, 0x7f0a08ba

    .line 121
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object p3

    move-object v3, p3

    check-cast v3, Landroid/widget/ImageView;

    if-eqz v3, :cond_0

    const p2, 0x7f0a0a09

    .line 122
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Lcom/google/android/material/card/MaterialCardView;

    if-eqz p3, :cond_0

    const p2, 0x7f0a121b

    .line 123
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object p3

    move-object v4, p3

    check-cast v4, Landroid/widget/TextView;

    if-eqz v4, :cond_0

    const p2, 0x7f0a121c

    .line 124
    invoke-static {p1, p2}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    move-result-object p3

    move-object v5, p3

    check-cast v5, Landroid/widget/TextView;

    if-eqz v5, :cond_0

    .line 125
    new-instance v1, La/j6j;

    const/4 v6, 0x3

    invoke-direct/range {v1 .. v6}, La/j6j;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/widget/TextView;B)V

    .line 126
    iput-object v1, p0, La/zr50;->x:Ljava/lang/Object;

    return-void

    .line 127
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    invoke-virtual {p0, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p0

    .line 128
    const-string p1, "Missing required view with ID: "

    invoke-virtual {p1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method


# virtual methods
.method public final t(Ljava/lang/Object;)V
    .locals 11

    .line 1
    iget-byte v0, p0, La/zr50;->u:B

    .line 2
    .line 3
    iget-object v1, p0, La/zr50;->x:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    iget-object v4, p0, La/zr50;->v:Ljava/lang/Object;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, La/ygq0;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget-object v0, p0, La/zr50;->y:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v0, La/lth;

    .line 20
    .line 21
    iget-object v1, v0, La/lth;->c:Landroid/widget/TextView;

    .line 22
    .line 23
    check-cast v4, Landroid/view/View;

    .line 24
    .line 25
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-static {p1}, La/ipm0;->i(La/ygq0;)I

    .line 30
    .line 31
    .line 32
    move-result v6

    .line 33
    invoke-virtual {v5, v6}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 48
    .line 49
    .line 50
    move-result v7

    .line 51
    if-lez v7, :cond_1

    .line 52
    .line 53
    invoke-virtual {v5, v2}, Ljava/lang/String;->charAt(I)C

    .line 54
    .line 55
    .line 56
    move-result v7

    .line 57
    invoke-static {v7}, Ljava/lang/Character;->isLowerCase(C)Z

    .line 58
    .line 59
    .line 60
    move-result v8

    .line 61
    if-eqz v8, :cond_1

    .line 62
    .line 63
    new-instance v8, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-static {v7}, Ljava/lang/Character;->toTitleCase(C)C

    .line 69
    .line 70
    .line 71
    move-result v9

    .line 72
    invoke-static {v7}, Ljava/lang/Character;->toUpperCase(C)C

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eq v9, v7, :cond_0

    .line 77
    .line 78
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_0
    invoke-virtual {v5, v2, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    invoke-virtual {v7, v6}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    :goto_0
    invoke-virtual {v5, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v5

    .line 107
    :cond_1
    invoke-virtual {v1, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 108
    .line 109
    .line 110
    iget-object v0, v0, La/lth;->c:Landroid/widget/TextView;

    .line 111
    .line 112
    iget-object v1, p0, La/zr50;->w:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v1, La/ygq0;

    .line 115
    .line 116
    if-ne v1, p1, :cond_2

    .line 117
    .line 118
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 119
    .line 120
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    const v3, 0x7f040afc

    .line 128
    .line 129
    .line 130
    invoke-static {v1, v3, v2}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 131
    .line 132
    .line 133
    move-result v1

    .line 134
    goto :goto_1

    .line 135
    :cond_2
    sget-object v1, La/j5d;->a:Landroid/util/TypedValue;

    .line 136
    .line 137
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    const v3, 0x7f040b72

    .line 145
    .line 146
    .line 147
    invoke-static {v1, v3, v2}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 148
    .line 149
    .line 150
    move-result v1

    .line 151
    :goto_1
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 152
    .line 153
    .line 154
    new-instance v0, La/bs50;

    .line 155
    .line 156
    const/16 v1, 0x11

    .line 157
    .line 158
    invoke-direct {v0, p0, p1, v1}, La/bs50;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :pswitch_0
    check-cast p1, La/qn50;

    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 168
    .line 169
    .line 170
    sget-object v0, La/uo5;->b:La/kj5;

    .line 171
    .line 172
    iget-object v4, p1, La/qn50;->b:La/bt5;

    .line 173
    .line 174
    iget v5, v4, La/bt5;->a:I

    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 177
    .line 178
    .line 179
    invoke-static {v5}, La/kj5;->f(I)La/uo5;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    new-instance v5, La/ba30;

    .line 184
    .line 185
    const/16 v6, 0x1b

    .line 186
    .line 187
    invoke-direct {v5, p0, v0, v6}, La/ba30;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 188
    .line 189
    .line 190
    new-instance v0, La/as50;

    .line 191
    .line 192
    invoke-direct {v0, v5}, La/as50;-><init>(La/ba30;)V

    .line 193
    .line 194
    .line 195
    check-cast v1, La/dc3;

    .line 196
    .line 197
    iget-object v5, v1, La/dc3;->c:Landroid/view/View;

    .line 198
    .line 199
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 200
    .line 201
    invoke-virtual {v5, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 202
    .line 203
    .line 204
    iget-object v5, v1, La/dc3;->d:Ljava/lang/Object;

    .line 205
    .line 206
    check-cast v5, Landroid/widget/TextView;

    .line 207
    .line 208
    iget-object v4, v4, La/bt5;->b:Ljava/lang/String;

    .line 209
    .line 210
    invoke-virtual {v5, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 211
    .line 212
    .line 213
    iget-object v1, v1, La/dc3;->e:Ljava/lang/Object;

    .line 214
    .line 215
    check-cast v1, Landroid/widget/TextView;

    .line 216
    .line 217
    iget-object v4, p1, La/qn50;->c:Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 220
    .line 221
    .line 222
    move-result v5

    .line 223
    const/4 v6, 0x3

    .line 224
    if-lt v5, v6, :cond_3

    .line 225
    .line 226
    goto :goto_2

    .line 227
    :cond_3
    const/16 v2, 0x8

    .line 228
    .line 229
    :goto_2
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 230
    .line 231
    .line 232
    new-instance v2, La/bs50;

    .line 233
    .line 234
    invoke-direct {v2, p0, p1, v3}, La/bs50;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 235
    .line 236
    .line 237
    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 238
    .line 239
    .line 240
    iget-object p0, p0, La/zr50;->y:Ljava/lang/Object;

    .line 241
    .line 242
    check-cast p0, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 243
    .line 244
    new-instance v1, La/eo6;

    .line 245
    .line 246
    const/4 v2, 0x2

    .line 247
    invoke-direct {v1, p1, v2}, La/eo6;-><init>(Ljava/lang/Object;B)V

    .line 248
    .line 249
    .line 250
    iput-object v1, p0, Landroidx/recyclerview/widget/GridLayoutManager;->m1:La/c2;

    .line 251
    .line 252
    invoke-virtual {v0, v4}, La/q4;->G(Ljava/util/List;)V

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :pswitch_1
    move-object v10, p1

    .line 257
    check-cast v10, La/ct5;

    .line 258
    .line 259
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 260
    .line 261
    .line 262
    check-cast v1, La/j6j;

    .line 263
    .line 264
    iget-object v6, p0, La/xhe0;->a:Landroid/view/View;

    .line 265
    .line 266
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 267
    .line 268
    .line 269
    move-object v8, v4

    .line 270
    check-cast v8, Landroidx/recyclerview/widget/RecyclerView;

    .line 271
    .line 272
    iget-object v7, v1, La/j6j;->e:Landroid/widget/ImageView;

    .line 273
    .line 274
    new-instance v5, La/kjn;

    .line 275
    .line 276
    move-object v9, p0

    .line 277
    invoke-direct/range {v5 .. v10}, La/kjn;-><init>(Landroid/view/View;Landroid/widget/ImageView;Landroidx/recyclerview/widget/RecyclerView;La/zr50;La/ct5;)V

    .line 278
    .line 279
    .line 280
    invoke-virtual {v8, v5}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 281
    .line 282
    .line 283
    new-instance p0, La/wg;

    .line 284
    .line 285
    const/16 p1, 0x1d

    .line 286
    .line 287
    invoke-direct {p0, v9, v10, p1}, La/wg;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 288
    .line 289
    .line 290
    invoke-virtual {v6, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 291
    .line 292
    .line 293
    iget-object p0, v1, La/j6j;->d:Landroid/widget/TextView;

    .line 294
    .line 295
    iget-object p1, v10, La/ct5;->d:Ljava/lang/String;

    .line 296
    .line 297
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 298
    .line 299
    .line 300
    iget-object p0, v1, La/j6j;->c:Landroid/widget/TextView;

    .line 301
    .line 302
    iget-object p1, v10, La/ct5;->e:Ljava/lang/String;

    .line 303
    .line 304
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 305
    .line 306
    .line 307
    return-void

    .line 308
    nop

    .line 309
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
