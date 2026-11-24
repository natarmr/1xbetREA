.class public final La/gva;
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
    const/16 p0, 0x9

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
    const/16 p0, 0x8

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
    iget-object p0, p0, La/gva;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 2
    .line 3
    return-object p0
.end method

.method public final j(La/w5;La/y8b;)V
    .locals 2

    .line 1
    instance-of p0, p1, La/vzr0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    instance-of p0, p2, La/cva;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, La/cva;

    .line 12
    .line 13
    :cond_0
    if-eqz v0, :cond_8

    .line 14
    .line 15
    check-cast p1, La/vzr0;

    .line 16
    .line 17
    iget-object p0, p1, La/vzr0;->u:La/bdu0;

    .line 18
    .line 19
    iget-object p0, p0, La/bdu0;->c:Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object p1, v0, La/cva;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    instance-of p0, p1, La/c5p0;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-eqz p0, :cond_3

    .line 31
    .line 32
    instance-of p0, p2, La/bva;

    .line 33
    .line 34
    if-eqz p0, :cond_2

    .line 35
    .line 36
    move-object v0, p2

    .line 37
    check-cast v0, La/bva;

    .line 38
    .line 39
    :cond_2
    if-eqz v0, :cond_8

    .line 40
    .line 41
    check-cast p1, La/c5p0;

    .line 42
    .line 43
    iget-object p0, p1, La/c5p0;->u:La/jk30;

    .line 44
    .line 45
    iget-object p1, p0, La/jk30;->d:Landroid/widget/TextView;

    .line 46
    .line 47
    iget-object p2, v0, La/bva;->d:Ljava/lang/String;

    .line 48
    .line 49
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    .line 51
    .line 52
    sget-object p1, La/u0d;->a:Ljava/util/List;

    .line 53
    .line 54
    iget-object p0, p0, La/jk30;->c:Landroid/widget/ImageView;

    .line 55
    .line 56
    iget-object p1, v0, La/bva;->e:Ljava/lang/String;

    .line 57
    .line 58
    const/16 p2, 0xb

    .line 59
    .line 60
    invoke-static {p0, p1, v1, p2}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :cond_3
    instance-of p0, p1, La/i2u0;

    .line 65
    .line 66
    if-eqz p0, :cond_5

    .line 67
    .line 68
    instance-of p0, p2, La/dva;

    .line 69
    .line 70
    if-eqz p0, :cond_4

    .line 71
    .line 72
    move-object v0, p2

    .line 73
    check-cast v0, La/dva;

    .line 74
    .line 75
    :cond_4
    if-eqz v0, :cond_8

    .line 76
    .line 77
    check-cast p1, La/i2u0;

    .line 78
    .line 79
    iget-object p0, p1, La/i2u0;->u:La/bdu0;

    .line 80
    .line 81
    iget-object p0, p0, La/bdu0;->c:Landroid/widget/TextView;

    .line 82
    .line 83
    iget-object p1, v0, La/dva;->d:Ljava/lang/String;

    .line 84
    .line 85
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 86
    .line 87
    .line 88
    return-void

    .line 89
    :cond_5
    instance-of p0, p1, La/ttq;

    .line 90
    .line 91
    if-eqz p0, :cond_7

    .line 92
    .line 93
    instance-of p0, p2, La/ava;

    .line 94
    .line 95
    if-eqz p0, :cond_6

    .line 96
    .line 97
    move-object v0, p2

    .line 98
    check-cast v0, La/ava;

    .line 99
    .line 100
    :cond_6
    if-eqz v0, :cond_8

    .line 101
    .line 102
    check-cast p1, La/ttq;

    .line 103
    .line 104
    invoke-virtual {p1, v0}, La/ttq;->v(La/ava;)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_7
    instance-of p0, p1, La/itq;

    .line 109
    .line 110
    if-eqz p0, :cond_8

    .line 111
    .line 112
    sget-object p0, La/j5d;->a:Landroid/util/TypedValue;

    .line 113
    .line 114
    iget-object p0, p1, La/xhe0;->a:Landroid/view/View;

    .line 115
    .line 116
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    const p2, 0x7f040ae8

    .line 124
    .line 125
    .line 126
    invoke-static {p0, p2, v1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    invoke-virtual {p1, p0}, La/w5;->u(I)V

    .line 131
    .line 132
    .line 133
    :cond_8
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
    instance-of p0, p1, La/zih0;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    if-eqz p0, :cond_1

    .line 5
    .line 6
    instance-of p0, p2, La/eva;

    .line 7
    .line 8
    if-eqz p0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, La/eva;

    .line 12
    .line 13
    :cond_0
    if-eqz v0, :cond_3

    .line 14
    .line 15
    check-cast p1, La/zih0;

    .line 16
    .line 17
    iget-object p0, p1, La/zih0;->u:La/bdu0;

    .line 18
    .line 19
    iget-object p0, p0, La/bdu0;->c:Landroid/widget/TextView;

    .line 20
    .line 21
    iget-object p1, v0, La/eva;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    instance-of p0, p1, La/ogr0;

    .line 28
    .line 29
    if-eqz p0, :cond_3

    .line 30
    .line 31
    instance-of p0, p2, La/fva;

    .line 32
    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    move-object v0, p2

    .line 36
    check-cast v0, La/fva;

    .line 37
    .line 38
    :cond_2
    if-eqz v0, :cond_3

    .line 39
    .line 40
    check-cast p1, La/ogr0;

    .line 41
    .line 42
    invoke-virtual {p1, v0}, La/ogr0;->v(La/fva;)V

    .line 43
    .line 44
    .line 45
    :cond_3
    return-void
.end method

.method public final o(Landroid/view/ViewGroup;La/y8b;)Landroid/view/View;
    .locals 2

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    new-instance v0, La/mrq0;

    .line 13
    .line 14
    invoke-static {p0, p1}, La/bdu0;->a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)La/bdu0;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-direct {v0, p0}, La/mrq0;-><init>(La/bdu0;)V

    .line 19
    .line 20
    .line 21
    new-instance p0, Landroid/widget/FrameLayout$LayoutParams;

    .line 22
    .line 23
    const v1, 0x7f0706ba

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v1}, La/vqd;->d(Landroid/view/ViewGroup;I)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    const/4 v1, -0x2

    .line 31
    invoke-direct {p0, v1, p1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 32
    .line 33
    .line 34
    iget-object p1, v0, La/xhe0;->a:Landroid/view/View;

    .line 35
    .line 36
    invoke-virtual {p1, p0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 37
    .line 38
    .line 39
    iget-object p0, v0, La/mrq0;->u:La/bdu0;

    .line 40
    .line 41
    iget-object p0, p0, La/bdu0;->c:Landroid/widget/TextView;

    .line 42
    .line 43
    instance-of v0, p2, La/vih0;

    .line 44
    .line 45
    if-eqz v0, :cond_0

    .line 46
    .line 47
    check-cast p2, La/vih0;

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/4 p2, 0x0

    .line 51
    :goto_0
    if-eqz p2, :cond_1

    .line 52
    .line 53
    iget-object p2, p2, La/vih0;->d:Ljava/lang/String;

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const-string p2, ""

    .line 57
    .line 58
    :goto_1
    invoke-virtual {p0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    .line 60
    .line 61
    return-object p1
.end method

.method public final r(Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/gva;->l:Lorg/xplatform/ui_core/viewcomponents/views/scrollable_table/table_view/TableViewImpl;

    .line 2
    .line 3
    return-void
.end method
