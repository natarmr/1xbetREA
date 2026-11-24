.class public final La/iu90;
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
    instance-of p1, p0, La/dva;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    return p0

    .line 14
    :cond_1
    instance-of p1, p0, La/cva;

    .line 15
    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    const/4 p0, 0x2

    .line 19
    return p0

    .line 20
    :cond_2
    instance-of p1, p0, La/bva;

    .line 21
    .line 22
    if-eqz p1, :cond_3

    .line 23
    .line 24
    const/4 p0, 0x3

    .line 25
    return p0

    .line 26
    :cond_3
    instance-of p1, p0, La/zua;

    .line 27
    .line 28
    if-eqz p1, :cond_4

    .line 29
    .line 30
    const/4 p0, 0x4

    .line 31
    return p0

    .line 32
    :cond_4
    instance-of p0, p0, La/ava;

    .line 33
    .line 34
    if-eqz p0, :cond_5

    .line 35
    .line 36
    const/16 p0, 0xa

    .line 37
    .line 38
    return p0

    .line 39
    :cond_5
    :goto_0
    const/4 p0, 0x5

    .line 40
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
    instance-of p1, p0, La/xua;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x7

    .line 13
    return p0

    .line 14
    :cond_1
    instance-of p0, p0, La/yua;

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
    const/4 p0, 0x5

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
    instance-of p1, p0, La/fva;

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    .line 12
    const/16 p0, 0xb

    .line 13
    .line 14
    return p0

    .line 15
    :cond_1
    instance-of p0, p0, La/eva;

    .line 16
    .line 17
    if-eqz p0, :cond_2

    .line 18
    .line 19
    const/16 p0, 0xc

    .line 20
    .line 21
    return p0

    .line 22
    :cond_2
    :goto_0
    const/4 p0, 0x5

    .line 23
    return p0
.end method

.method public final g()La/nmo0;
    .locals 0

    .line 1
    iget-object p0, p0, La/iu90;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j(La/w5;La/y8b;)V
    .locals 2

    .line 1
    instance-of p0, p1, La/qun;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    instance-of p0, p2, La/w8b;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, La/w8b;

    .line 12
    .line 13
    :cond_0
    if-eqz v0, :cond_6

    .line 14
    .line 15
    check-cast p1, La/qun;

    .line 16
    .line 17
    iget-object p0, p1, La/qun;->u:La/d5e0;

    .line 18
    .line 19
    iget-object p0, p0, La/d5e0;->c:Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object p1, v0, La/w8b;->a:La/h9b;

    .line 22
    .line 23
    iget-object p1, p1, La/h9b;->a:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    instance-of p0, p1, La/pun;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz p0, :cond_3

    .line 33
    .line 34
    instance-of p0, p2, La/bva;

    .line 35
    .line 36
    if-eqz p0, :cond_2

    .line 37
    .line 38
    move-object v0, p2

    .line 39
    check-cast v0, La/bva;

    .line 40
    .line 41
    :cond_2
    if-eqz v0, :cond_6

    .line 42
    .line 43
    check-cast p1, La/pun;

    .line 44
    .line 45
    iget-object p0, p1, La/pun;->u:La/jk30;

    .line 46
    .line 47
    iget-object p1, p0, La/jk30;->d:Landroid/widget/TextView;

    .line 48
    .line 49
    iget-object p2, v0, La/bva;->d:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    .line 53
    .line 54
    sget-object p1, La/u0d;->a:Ljava/util/List;

    .line 55
    .line 56
    iget-object p0, p0, La/jk30;->c:Landroid/widget/ImageView;

    .line 57
    .line 58
    iget-object p1, v0, La/bva;->e:Ljava/lang/String;

    .line 59
    .line 60
    const/16 p2, 0xb

    .line 61
    .line 62
    invoke-static {p0, p1, v1, p2}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_3
    instance-of p0, p1, La/ttq;

    .line 67
    .line 68
    if-eqz p0, :cond_5

    .line 69
    .line 70
    instance-of p0, p2, La/ava;

    .line 71
    .line 72
    if-eqz p0, :cond_4

    .line 73
    .line 74
    move-object v0, p2

    .line 75
    check-cast v0, La/ava;

    .line 76
    .line 77
    :cond_4
    if-eqz v0, :cond_6

    .line 78
    .line 79
    check-cast p1, La/ttq;

    .line 80
    .line 81
    invoke-virtual {p1, v0}, La/ttq;->v(La/ava;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :cond_5
    instance-of p0, p1, La/itq;

    .line 86
    .line 87
    if-eqz p0, :cond_6

    .line 88
    .line 89
    sget-object p0, La/j5d;->a:Landroid/util/TypedValue;

    .line 90
    .line 91
    iget-object p0, p1, La/xhe0;->a:Landroid/view/View;

    .line 92
    .line 93
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    const p2, 0x7f040ae8

    .line 101
    .line 102
    .line 103
    invoke-static {p0, p2, v1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 104
    .line 105
    .line 106
    move-result p0

    .line 107
    invoke-virtual {p1, p0}, La/w5;->u(I)V

    .line 108
    .line 109
    .line 110
    :cond_6
    return-void
.end method

.method public final k(La/w5;La/y8b;)V
    .locals 1

    .line 1
    instance-of p0, p1, La/aww;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    instance-of p0, p2, La/xua;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, La/xua;

    .line 12
    .line 13
    :cond_0
    if-eqz v0, :cond_3

    .line 14
    .line 15
    check-cast p1, La/aww;

    .line 16
    .line 17
    iget-object p0, p1, La/aww;->u:La/nq8;

    .line 18
    .line 19
    iget-object p0, p0, La/nq8;->c:Landroid/view/View;

    .line 20
    .line 21
    check-cast p0, Landroid/widget/ImageView;

    .line 22
    .line 23
    iget p1, v0, La/xua;->d:I

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    instance-of p0, p1, La/mrq0;

    .line 30
    .line 31
    if-eqz p0, :cond_3

    .line 32
    .line 33
    instance-of p0, p2, La/yua;

    .line 34
    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    move-object v0, p2

    .line 38
    check-cast v0, La/yua;

    .line 39
    .line 40
    :cond_2
    if-eqz v0, :cond_3

    .line 41
    .line 42
    check-cast p1, La/mrq0;

    .line 43
    .line 44
    iget-object p0, p1, La/mrq0;->u:La/bdu0;

    .line 45
    .line 46
    iget-object p0, p0, La/bdu0;->c:Landroid/widget/TextView;

    .line 47
    .line 48
    iget-object p1, v0, La/yua;->d:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 51
    .line 52
    .line 53
    :cond_3
    return-void
.end method

.method public final l(La/w5;La/y8b;)V
    .locals 1

    .line 1
    instance-of p0, p2, La/fva;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    check-cast p2, La/fva;

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-object p2, v0

    .line 10
    :goto_0
    if-eqz p2, :cond_2

    .line 11
    .line 12
    instance-of p0, p1, La/ogr0;

    .line 13
    .line 14
    if-eqz p0, :cond_1

    .line 15
    .line 16
    move-object v0, p1

    .line 17
    check-cast v0, La/ogr0;

    .line 18
    .line 19
    :cond_1
    if-eqz v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {v0, p2}, La/ogr0;->v(La/fva;)V

    .line 22
    .line 23
    .line 24
    :cond_2
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
    const/4 v0, 0x1

    .line 10
    const/16 v1, 0xa

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const-string v3, "Missing required view with ID: "

    .line 14
    .line 15
    const/4 v4, 0x0

    .line 16
    if-eq p2, v0, :cond_5

    .line 17
    .line 18
    const/4 v0, 0x2

    .line 19
    if-eq p2, v0, :cond_5

    .line 20
    .line 21
    const/4 v0, 0x3

    .line 22
    if-eq p2, v0, :cond_3

    .line 23
    .line 24
    const/4 v0, 0x4

    .line 25
    if-eq p2, v0, :cond_1

    .line 26
    .line 27
    if-eq p2, v1, :cond_0

    .line 28
    .line 29
    new-instance p2, La/sun;

    .line 30
    .line 31
    invoke-static {p0, p1}, La/auh;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/auh;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    iget-object p0, p0, La/auh;->b:Landroid/widget/FrameLayout;

    .line 36
    .line 37
    invoke-direct {p2, p0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 38
    .line 39
    .line 40
    return-object p2

    .line 41
    :cond_0
    new-instance p2, La/ttq;

    .line 42
    .line 43
    invoke-static {p0, p1}, La/d5e0;->e(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/d5e0;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-direct {p2, p0}, La/ttq;-><init>(La/d5e0;)V

    .line 48
    .line 49
    .line 50
    return-object p2

    .line 51
    :cond_1
    new-instance p2, La/itq;

    .line 52
    .line 53
    const v0, 0x7f0d0635

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    if-eqz p0, :cond_2

    .line 61
    .line 62
    check-cast p0, Landroid/widget/FrameLayout;

    .line 63
    .line 64
    invoke-direct {p2, p0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 65
    .line 66
    .line 67
    return-object p2

    .line 68
    :cond_2
    const-string p0, "rootView"

    .line 69
    .line 70
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    return-object v2

    .line 74
    :cond_3
    new-instance p2, La/pun;

    .line 75
    .line 76
    const v1, 0x7f0d0648

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v1, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    const p1, 0x7f0a08ca

    .line 84
    .line 85
    .line 86
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    check-cast v1, Landroid/widget/ImageView;

    .line 91
    .line 92
    if-eqz v1, :cond_4

    .line 93
    .line 94
    const p1, 0x7f0a1243

    .line 95
    .line 96
    .line 97
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    check-cast v4, Landroid/widget/TextView;

    .line 102
    .line 103
    if-eqz v4, :cond_4

    .line 104
    .line 105
    new-instance p1, La/jk30;

    .line 106
    .line 107
    check-cast p0, Landroid/widget/LinearLayout;

    .line 108
    .line 109
    invoke-direct {p1, p0, v1, v4, v0}, La/jk30;-><init>(Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/TextView;B)V

    .line 110
    .line 111
    .line 112
    invoke-direct {p2, p1}, La/pun;-><init>(La/jk30;)V

    .line 113
    .line 114
    .line 115
    return-object p2

    .line 116
    :cond_4
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
    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    return-object v2

    .line 132
    :cond_5
    new-instance p2, La/qun;

    .line 133
    .line 134
    const v0, 0x7f0d0633

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, v0, p1, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    const p1, 0x7f0a10d6

    .line 142
    .line 143
    .line 144
    invoke-static {p0, p1}, La/yum0;->f(Landroid/view/View;I)Landroid/view/View;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    check-cast v0, Landroid/widget/TextView;

    .line 149
    .line 150
    if-eqz v0, :cond_6

    .line 151
    .line 152
    new-instance p1, La/d5e0;

    .line 153
    .line 154
    check-cast p0, Landroid/widget/FrameLayout;

    .line 155
    .line 156
    invoke-direct {p1, p0, v0, v1}, La/d5e0;-><init>(Landroid/widget/FrameLayout;Landroid/widget/TextView;B)V

    .line 157
    .line 158
    .line 159
    invoke-direct {p2, p1}, La/qun;-><init>(La/d5e0;)V

    .line 160
    .line 161
    .line 162
    return-object p2

    .line 163
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    invoke-static {p0}, La/hny;->u(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    return-object v2
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
    const/4 v0, 0x6

    .line 10
    if-eq p2, v0, :cond_1

    .line 11
    .line 12
    const/4 v0, 0x7

    .line 13
    if-ne p2, v0, :cond_0

    .line 14
    .line 15
    new-instance p2, La/aww;

    .line 16
    .line 17
    invoke-static {p0, p1}, La/nq8;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/nq8;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-direct {p2, p0}, La/aww;-><init>(La/nq8;)V

    .line 22
    .line 23
    .line 24
    return-object p2

    .line 25
    :cond_0
    new-instance p0, Ljava/lang/Throwable;

    .line 26
    .line 27
    const-string p1, "Unknown column type"

    .line 28
    .line 29
    invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    throw p0

    .line 33
    :cond_1
    new-instance p2, La/mrq0;

    .line 34
    .line 35
    invoke-static {p0, p1}, La/bdu0;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/bdu0;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-direct {p2, p0}, La/mrq0;-><init>(La/bdu0;)V

    .line 40
    .line 41
    .line 42
    return-object p2
.end method

.method public final o(Landroid/view/ViewGroup;La/y8b;)Landroid/view/View;
    .locals 0

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
    move-result-object p1

    .line 10
    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 11
    .line 12
    .line 13
    new-instance p1, Landroid/widget/FrameLayout$LayoutParams;

    .line 14
    .line 15
    const/4 p2, 0x0

    .line 16
    invoke-direct {p1, p2, p2}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 20
    .line 21
    .line 22
    return-object p0
.end method

.method public final p(Landroid/view/ViewGroup;I)La/w5;
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
    const/16 v0, 0xb

    .line 10
    .line 11
    if-ne p2, v0, :cond_0

    .line 12
    .line 13
    new-instance p2, La/ogr0;

    .line 14
    .line 15
    invoke-static {p0, p1}, La/bdu0;->b(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/bdu0;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-direct {p2, p0}, La/ogr0;-><init>(La/bdu0;)V

    .line 20
    .line 21
    .line 22
    return-object p2

    .line 23
    :cond_0
    new-instance p2, La/sun;

    .line 24
    .line 25
    invoke-static {p0, p1}, La/auh;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/auh;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    iget-object p0, p0, La/auh;->b:Landroid/widget/FrameLayout;

    .line 30
    .line 31
    invoke-direct {p2, p0}, La/xhe0;-><init>(Landroid/view/View;)V

    .line 32
    .line 33
    .line 34
    return-object p2
.end method

.method public final r(Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/iu90;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 2
    .line 3
    return-void
.end method
