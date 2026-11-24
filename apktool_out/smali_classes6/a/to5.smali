.class public final La/to5;
.super Landroid/widget/LinearLayout;
.source "SourceFile"


# instance fields
.field public final a:Landroid/widget/TextView;

.field public final b:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    invoke-direct {p0, p1, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const v1, 0x7f070717

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    const v2, 0x7f0706e2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const v3, 0x7f0706ea

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    const v4, 0x7f07074b

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    const v5, 0x7f07074a

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimension(I)F

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    new-instance v5, Landroid/widget/TextView;

    .line 64
    .line 65
    invoke-direct {v5, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 66
    .line 67
    .line 68
    const v6, 0x7f14044f

    .line 69
    .line 70
    .line 71
    invoke-static {v6, v5}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 72
    .line 73
    .line 74
    const/4 v6, 0x0

    .line 75
    invoke-virtual {v5, v6, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 76
    .line 77
    .line 78
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 79
    .line 80
    const/4 v7, -0x1

    .line 81
    const/4 v8, -0x2

    .line 82
    invoke-direct {v3, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v5, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 86
    .line 87
    .line 88
    const/4 v3, 0x7

    .line 89
    invoke-static {v6, v0, v3, v5}, La/jmu0;->l(IIILandroid/view/View;)V

    .line 90
    .line 91
    .line 92
    sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 93
    .line 94
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 95
    .line 96
    .line 97
    invoke-static {}, La/by7;->c()La/by7;

    .line 98
    .line 99
    .line 100
    move-result-object v9

    .line 101
    iget-boolean v9, v9, La/by7;->a:Z

    .line 102
    .line 103
    const v10, 0x800003

    .line 104
    .line 105
    .line 106
    const v11, 0x800005

    .line 107
    .line 108
    .line 109
    if-eqz v9, :cond_0

    .line 110
    .line 111
    move v9, v11

    .line 112
    goto :goto_0

    .line 113
    :cond_0
    move v9, v10

    .line 114
    :goto_0
    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setGravity(I)V

    .line 115
    .line 116
    .line 117
    const/4 v9, 0x3

    .line 118
    invoke-virtual {v5, v9}, Landroid/view/View;->setLayoutDirection(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v5, v9}, Landroid/view/View;->setTextDirection(I)V

    .line 122
    .line 123
    .line 124
    iput-object v5, p0, La/to5;->a:Landroid/widget/TextView;

    .line 125
    .line 126
    new-instance v5, Landroid/widget/TextView;

    .line 127
    .line 128
    invoke-direct {v5, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 129
    .line 130
    .line 131
    const p1, 0x7f14046f

    .line 132
    .line 133
    .line 134
    invoke-static {p1, v5}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {v5, v6, v4}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 138
    .line 139
    .line 140
    new-instance p1, Landroid/widget/LinearLayout$LayoutParams;

    .line 141
    .line 142
    invoke-direct {p1, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v5, p1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 146
    .line 147
    .line 148
    const/4 p1, 0x2

    .line 149
    invoke-virtual {v5, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v5, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 153
    .line 154
    .line 155
    invoke-static {}, La/by7;->c()La/by7;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    iget-boolean p1, p1, La/by7;->a:Z

    .line 160
    .line 161
    if-eqz p1, :cond_1

    .line 162
    .line 163
    move v10, v11

    .line 164
    :cond_1
    invoke-virtual {v5, v10}, Landroid/widget/TextView;->setGravity(I)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v5, v9}, Landroid/view/View;->setLayoutDirection(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v5, v9}, Landroid/view/View;->setTextDirection(I)V

    .line 171
    .line 172
    .line 173
    iput-object v5, p0, La/to5;->b:Landroid/widget/TextView;

    .line 174
    .line 175
    invoke-virtual {p0, v2, v0, v2, v1}, Landroid/view/View;->setPaddingRelative(IIII)V

    .line 176
    .line 177
    .line 178
    const/4 p1, 0x1

    .line 179
    invoke-virtual {p0, p1}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 180
    .line 181
    .line 182
    return-void
.end method

.method private final getSubtitleIndex()I
    .locals 1

    .line 1
    new-instance v0, La/ihu0;

    .line 2
    .line 3
    invoke-direct {v0, p0}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, La/to5;->a:Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-static {v0, p0}, La/pgi0;->m(Lkotlin/sequences/Sequence;Ljava/lang/Object;)I

    .line 9
    .line 10
    .line 11
    move-result p0

    .line 12
    if-ltz p0, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return p0
.end method


# virtual methods
.method public final setSubtitle(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/to5;->b:Landroid/widget/TextView;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    const/4 v1, 0x2

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v1, 0x1

    .line 18
    :goto_0
    iget-object v2, p0, La/to5;->a:Landroid/widget/TextView;

    .line 19
    .line 20
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :cond_1
    new-instance p1, La/ihu0;

    .line 34
    .line 35
    invoke-direct {p1, p0}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 36
    .line 37
    .line 38
    invoke-static {p1, v0}, La/pgi0;->m(Lkotlin/sequences/Sequence;Ljava/lang/Object;)I

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-ltz p1, :cond_2

    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    invoke-direct {p0}, La/to5;->getSubtitleIndex()I

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public final setTitle(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/to5;->a:Landroid/widget/TextView;

    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    new-instance p1, La/ihu0;

    .line 20
    .line 21
    invoke-direct {p1, p0}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 22
    .line 23
    .line 24
    invoke-static {p1, v0}, La/pgi0;->m(Lkotlin/sequences/Sequence;Ljava/lang/Object;)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-ltz p1, :cond_1

    .line 29
    .line 30
    return-void

    .line 31
    :cond_1
    const/4 p1, 0x0

    .line 32
    invoke-virtual {p0, v0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 33
    .line 34
    .line 35
    return-void
.end method
