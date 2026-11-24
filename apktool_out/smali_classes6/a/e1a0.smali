.class public final La/e1a0;
.super La/yge0;
.source "SourceFile"


# instance fields
.field public final synthetic d:B

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public final g:Ljava/lang/Object;

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/r6x;Lkotlin/jvm/functions/Function1;Ljava/util/Date;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/e1a0;->d:B

    .line 3
    .line 4
    invoke-direct {p0}, La/yge0;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/e1a0;->e:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, La/e1a0;->f:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance p1, La/yz3;

    .line 12
    .line 13
    new-instance p2, La/pn20;

    .line 14
    .line 15
    const/16 v0, 0xb

    .line 16
    .line 17
    invoke-direct {p2, v0}, La/pn20;-><init>(B)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p1, p0, p2}, La/yz3;-><init>(La/yge0;La/dtb;)V

    .line 21
    .line 22
    .line 23
    iput-object p1, p0, La/e1a0;->g:Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    invoke-virtual {p1, p3}, Ljava/util/Calendar;->setTime(Ljava/util/Date;)V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, La/e1a0;->h:Ljava/lang/Object;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(Landroidx/media3/ui/PlayerControlView;[Ljava/lang/String;[Landroid/graphics/drawable/Drawable;)V
    .locals 1

    const/4 v0, 0x0

    iput-byte v0, p0, La/e1a0;->d:B

    .line 35
    iput-object p1, p0, La/e1a0;->h:Ljava/lang/Object;

    invoke-direct {p0}, La/yge0;-><init>()V

    .line 36
    iput-object p2, p0, La/e1a0;->e:Ljava/lang/Object;

    .line 37
    array-length p1, p2

    new-array p1, p1, [Ljava/lang/String;

    iput-object p1, p0, La/e1a0;->f:Ljava/lang/Object;

    .line 38
    iput-object p3, p0, La/e1a0;->g:Ljava/lang/Object;

    return-void
.end method

.method public static B(Ljava/util/Calendar;Ljava/util/Calendar;)Z
    .locals 2

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    .line 3
    .line 4
    .line 5
    move-result v1

    .line 6
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-ne v1, v0, :cond_0

    .line 11
    .line 12
    const/4 v0, 0x2

    .line 13
    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-ne v1, v0, :cond_0

    .line 22
    .line 23
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    invoke-virtual {p1, v0}, Ljava/util/Calendar;->get(I)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-ne p0, p1, :cond_0

    .line 33
    .line 34
    return v0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return p0
.end method


# virtual methods
.method public A(I)Z
    .locals 2

    .line 1
    iget-object p0, p0, La/e1a0;->h:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Landroidx/media3/ui/PlayerControlView;

    .line 4
    .line 5
    iget-object v0, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    if-eqz p1, :cond_3

    .line 11
    .line 12
    const/4 v1, 0x1

    .line 13
    if-eq p1, v1, :cond_1

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/16 p1, 0x1e

    .line 17
    .line 18
    check-cast v0, La/ulo;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, La/ulo;->w(I)Z

    .line 21
    .line 22
    .line 23
    move-result p1

    .line 24
    if-eqz p1, :cond_2

    .line 25
    .line 26
    iget-object p0, p0, Landroidx/media3/ui/PlayerControlView;->Q1:La/my90;

    .line 27
    .line 28
    const/16 p1, 0x1d

    .line 29
    .line 30
    check-cast p0, La/ulo;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, La/ulo;->w(I)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-eqz p0, :cond_2

    .line 37
    .line 38
    :goto_0
    return v1

    .line 39
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 40
    return p0

    .line 41
    :cond_3
    const/16 p0, 0xd

    .line 42
    .line 43
    check-cast v0, La/ulo;

    .line 44
    .line 45
    invoke-virtual {v0, p0}, La/ulo;->w(I)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    return p0
.end method

.method public final d()I
    .locals 1

    .line 1
    iget-byte v0, p0, La/e1a0;->d:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/e1a0;->g:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast p0, La/yz3;

    .line 9
    .line 10
    iget-object p0, p0, La/yz3;->f:Ljava/util/List;

    .line 11
    .line 12
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    return p0

    .line 17
    :pswitch_0
    iget-object p0, p0, La/e1a0;->e:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, [Ljava/lang/String;

    .line 20
    .line 21
    array-length p0, p0

    .line 22
    return p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(I)J
    .locals 1

    .line 1
    iget-byte v0, p0, La/e1a0;->d:B

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, La/yge0;->e(I)J

    move-result-wide p0

    return-wide p0

    :pswitch_0
    int-to-long p0, p1

    return-wide p0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final n(La/xhe0;I)V
    .locals 7

    .line 1
    iget-byte v0, p0, La/e1a0;->d:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x8

    .line 5
    .line 6
    iget-object v3, p0, La/e1a0;->g:Ljava/lang/Object;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    check-cast p1, La/ybh0;

    .line 12
    .line 13
    check-cast v3, La/yz3;

    .line 14
    .line 15
    iget-object p0, v3, La/yz3;->f:Ljava/util/List;

    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-static {p2, p0}, Lkotlin/collections/CollectionsKt;->W(ILjava/util/List;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    check-cast p0, Ljava/util/Calendar;

    .line 25
    .line 26
    if-eqz p0, :cond_3

    .line 27
    .line 28
    iget-object p2, p1, La/ybh0;->u:La/xxx;

    .line 29
    .line 30
    const/4 v0, 0x5

    .line 31
    invoke-virtual {p0, v0}, Ljava/util/Calendar;->get(I)I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sget-object v3, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    .line 40
    .line 41
    const-string v4, "%02d"

    .line 42
    .line 43
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    const/4 v5, 0x1

    .line 48
    invoke-static {v4, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-static {v3, v0, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const/4 v3, 0x2

    .line 57
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    invoke-virtual {p0, v3, v3, v4}, Ljava/util/Calendar;->getDisplayName(IILjava/util/Locale;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    iget-object p1, p1, La/ybh0;->v:La/e1a0;

    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    invoke-virtual {v4, v5}, Ljava/util/Calendar;->get(I)I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    invoke-virtual {p0, v5}, Ljava/util/Calendar;->get(I)I

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eq v5, v4, :cond_0

    .line 83
    .line 84
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    goto :goto_0

    .line 89
    :cond_0
    const-string v4, ""

    .line 90
    .line 91
    :goto_0
    iget-object v5, p2, La/xxx;->c:Landroid/widget/TextView;

    .line 92
    .line 93
    iget-object v6, p2, La/xxx;->e:Landroid/widget/TextView;

    .line 94
    .line 95
    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 96
    .line 97
    .line 98
    iget-object v0, p2, La/xxx;->d:Landroid/widget/TextView;

    .line 99
    .line 100
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v6, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-lez v0, :cond_1

    .line 111
    .line 112
    move v0, v1

    .line 113
    goto :goto_1

    .line 114
    :cond_1
    move v0, v2

    .line 115
    :goto_1
    invoke-virtual {v6, v0}, Landroid/view/View;->setVisibility(I)V

    .line 116
    .line 117
    .line 118
    iget-object v0, p2, La/xxx;->a:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 119
    .line 120
    iget-object v3, p1, La/e1a0;->h:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v3, Ljava/util/Calendar;

    .line 123
    .line 124
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    invoke-static {p0, v3}, La/e1a0;->B(Ljava/util/Calendar;Ljava/util/Calendar;)Z

    .line 128
    .line 129
    .line 130
    move-result v3

    .line 131
    invoke-virtual {v0, v3}, Landroid/view/View;->setSelected(Z)V

    .line 132
    .line 133
    .line 134
    iget-object p1, p1, La/e1a0;->e:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p1, La/r6x;

    .line 137
    .line 138
    instance-of p1, p1, La/o6x;

    .line 139
    .line 140
    if-eqz p1, :cond_3

    .line 141
    .line 142
    iget-object p1, p2, La/xxx;->b:Landroid/widget/ImageView;

    .line 143
    .line 144
    invoke-static {}, Ljava/util/Calendar;->getInstance()Ljava/util/Calendar;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    invoke-static {p0, p2}, La/e1a0;->B(Ljava/util/Calendar;Ljava/util/Calendar;)Z

    .line 152
    .line 153
    .line 154
    move-result p0

    .line 155
    if-eqz p0, :cond_2

    .line 156
    .line 157
    goto :goto_2

    .line 158
    :cond_2
    move v1, v2

    .line 159
    :goto_2
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 160
    .line 161
    .line 162
    :cond_3
    return-void

    .line 163
    :pswitch_0
    check-cast p1, La/d1a0;

    .line 164
    .line 165
    invoke-virtual {p0, p2}, La/e1a0;->A(I)Z

    .line 166
    .line 167
    .line 168
    move-result v0

    .line 169
    iget-object v4, p1, La/xhe0;->a:Landroid/view/View;

    .line 170
    .line 171
    if-eqz v0, :cond_4

    .line 172
    .line 173
    new-instance v0, La/hhe0;

    .line 174
    .line 175
    const/4 v1, -0x1

    .line 176
    const/4 v5, -0x2

    .line 177
    invoke-direct {v0, v1, v5}, La/hhe0;-><init>(II)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v4, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 181
    .line 182
    .line 183
    goto :goto_3

    .line 184
    :cond_4
    new-instance v0, La/hhe0;

    .line 185
    .line 186
    invoke-direct {v0, v1, v1}, La/hhe0;-><init>(II)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v4, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 190
    .line 191
    .line 192
    :goto_3
    iget-object v0, p1, La/d1a0;->u:Landroid/widget/TextView;

    .line 193
    .line 194
    iget-object v1, p0, La/e1a0;->e:Ljava/lang/Object;

    .line 195
    .line 196
    check-cast v1, [Ljava/lang/String;

    .line 197
    .line 198
    aget-object v1, v1, p2

    .line 199
    .line 200
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 201
    .line 202
    .line 203
    iget-object p0, p0, La/e1a0;->f:Ljava/lang/Object;

    .line 204
    .line 205
    check-cast p0, [Ljava/lang/String;

    .line 206
    .line 207
    aget-object p0, p0, p2

    .line 208
    .line 209
    iget-object v0, p1, La/d1a0;->v:Landroid/widget/TextView;

    .line 210
    .line 211
    if-nez p0, :cond_5

    .line 212
    .line 213
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 214
    .line 215
    .line 216
    goto :goto_4

    .line 217
    :cond_5
    invoke-virtual {v0, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 218
    .line 219
    .line 220
    :goto_4
    check-cast v3, [Landroid/graphics/drawable/Drawable;

    .line 221
    .line 222
    aget-object p0, v3, p2

    .line 223
    .line 224
    iget-object p1, p1, La/d1a0;->w:Landroid/widget/ImageView;

    .line 225
    .line 226
    if-nez p0, :cond_6

    .line 227
    .line 228
    invoke-virtual {p1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 229
    .line 230
    .line 231
    goto :goto_5

    .line 232
    :cond_6
    invoke-virtual {p1, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 233
    .line 234
    .line 235
    :goto_5
    return-void

    .line 236
    nop

    .line 237
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final p(Landroid/view/ViewGroup;I)La/xhe0;
    .locals 2

    .line 1
    iget-byte p2, p0, La/e1a0;->d:B

    .line 2
    .line 3
    packed-switch p2, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p2, La/ybh0;

    .line 7
    .line 8
    invoke-direct {p2, p0, p1}, La/ybh0;-><init>(La/e1a0;Landroid/view/ViewGroup;)V

    .line 9
    .line 10
    .line 11
    return-object p2

    .line 12
    :pswitch_0
    iget-object p0, p0, La/e1a0;->h:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Landroidx/media3/ui/PlayerControlView;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-static {p2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    const v0, 0x7f0d01bd

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x0

    .line 28
    invoke-virtual {p2, v0, p1, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    new-instance p2, La/d1a0;

    .line 33
    .line 34
    invoke-direct {p2, p0, p1}, La/d1a0;-><init>(Landroidx/media3/ui/PlayerControlView;Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    return-object p2

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public z()I
    .locals 4

    .line 1
    iget-object v0, p0, La/e1a0;->g:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/yz3;

    .line 4
    .line 5
    iget-object v0, v0, La/yz3;->f:Ljava/util/List;

    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/4 v1, 0x0

    .line 15
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    check-cast v2, Ljava/util/Calendar;

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    iget-object v3, p0, La/e1a0;->h:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Ljava/util/Calendar;

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/util/Calendar;->getTime()Ljava/util/Date;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_0

    .line 47
    .line 48
    return v1

    .line 49
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 p0, -0x1

    .line 53
    return p0
.end method
