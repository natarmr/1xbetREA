.class public final La/o950;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public e:Ljava/lang/CharSequence;

.field public f:Ljava/lang/CharSequence;

.field public g:Ljava/lang/CharSequence;

.field public h:I

.field public i:I

.field public final j:La/n0o0;

.field public final k:La/n0o0;

.field public final l:La/n0o0;

.field public final m:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v0, v1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const v1, 0x7f07070c

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, La/o950;->a:I

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const v1, 0x7f0706ea

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, p0, La/o950;->b:I

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const v1, 0x7f07072d

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iput v0, p0, La/o950;->c:I

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const v1, 0x7f070717

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput v0, p0, La/o950;->d:I

    .line 57
    .line 58
    new-instance v0, La/i7q;

    .line 59
    .line 60
    const/16 v1, 0x13

    .line 61
    .line 62
    invoke-direct {v0, p1, v1}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iput-object v0, p0, La/o950;->j:La/n0o0;

    .line 70
    .line 71
    new-instance v0, La/i7q;

    .line 72
    .line 73
    const/16 v1, 0x14

    .line 74
    .line 75
    invoke-direct {v0, p1, v1}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    iput-object v0, p0, La/o950;->k:La/n0o0;

    .line 83
    .line 84
    new-instance v0, La/i7q;

    .line 85
    .line 86
    const/16 v1, 0x15

    .line 87
    .line 88
    invoke-direct {v0, p1, v1}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 92
    .line 93
    .line 94
    move-result-object v0

    .line 95
    iput-object v0, p0, La/o950;->l:La/n0o0;

    .line 96
    .line 97
    new-instance v0, La/i7q;

    .line 98
    .line 99
    const/16 v1, 0x16

    .line 100
    .line 101
    invoke-direct {v0, p1, v1}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    iput-object p1, p0, La/o950;->m:La/n0o0;

    .line 109
    .line 110
    return-void
.end method

.method private final getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;
    .locals 0

    .line 1
    iget-object p0, p0, La/o950;->l:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getCheckerMessage()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, La/o950;->m:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/TextView;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getMessage()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, La/o950;->k:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/TextView;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getTitle()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, La/o950;->j:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/TextView;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/o950;->e:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iput-object p2, p0, La/o950;->f:Ljava/lang/CharSequence;

    .line 4
    .line 5
    iput-object p3, p0, La/o950;->g:Ljava/lang/CharSequence;

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, La/o950;->e:Ljava/lang/CharSequence;

    .line 11
    .line 12
    const/4 p2, 0x0

    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    if-nez p1, :cond_0

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    invoke-direct {p0}, La/o950;->getTitle()Landroid/widget/TextView;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iget-object p3, p0, La/o950;->e:Ljava/lang/CharSequence;

    .line 27
    .line 28
    if-eqz p3, :cond_1

    .line 29
    .line 30
    invoke-static {p3}, La/f1t0;->L(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move-object p3, p2

    .line 36
    :goto_0
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 37
    .line 38
    .line 39
    invoke-direct {p0}, La/o950;->getTitle()Landroid/widget/TextView;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 44
    .line 45
    .line 46
    :cond_2
    :goto_1
    iget-object p1, p0, La/o950;->f:Ljava/lang/CharSequence;

    .line 47
    .line 48
    if-eqz p1, :cond_5

    .line 49
    .line 50
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    if-nez p1, :cond_3

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_3
    invoke-direct {p0}, La/o950;->getMessage()Landroid/widget/TextView;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    iget-object p3, p0, La/o950;->f:Ljava/lang/CharSequence;

    .line 62
    .line 63
    if-eqz p3, :cond_4

    .line 64
    .line 65
    invoke-static {p3}, La/f1t0;->L(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 66
    .line 67
    .line 68
    move-result-object p3

    .line 69
    goto :goto_2

    .line 70
    :cond_4
    move-object p3, p2

    .line 71
    :goto_2
    invoke-virtual {p1, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0}, La/o950;->getMessage()Landroid/widget/TextView;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 79
    .line 80
    .line 81
    :cond_5
    :goto_3
    iget-object p1, p0, La/o950;->g:Ljava/lang/CharSequence;

    .line 82
    .line 83
    if-eqz p1, :cond_8

    .line 84
    .line 85
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-nez p1, :cond_6

    .line 90
    .line 91
    goto :goto_4

    .line 92
    :cond_6
    invoke-direct {p0}, La/o950;->getCheckerMessage()Landroid/widget/TextView;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    iget-object p3, p0, La/o950;->g:Ljava/lang/CharSequence;

    .line 97
    .line 98
    if-eqz p3, :cond_7

    .line 99
    .line 100
    invoke-static {p3}, La/f1t0;->L(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    :cond_7
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 105
    .line 106
    .line 107
    invoke-direct {p0}, La/o950;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 108
    .line 109
    .line 110
    move-result-object p1

    .line 111
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 112
    .line 113
    .line 114
    invoke-direct {p0}, La/o950;->getCheckerMessage()Landroid/widget/TextView;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 119
    .line 120
    .line 121
    :cond_8
    :goto_4
    return-void
.end method

.method public final getChecker()Lorg/xplatform/uikit/components/check_box/DsCheckbox;
    .locals 0

    .line 1
    invoke-direct {p0}, La/o950;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public final onLayout(ZIIII)V
    .locals 8

    .line 1
    iget-object v0, p0, La/o950;->e:Ljava/lang/CharSequence;

    .line 2
    .line 3
    iget v6, p0, La/o950;->a:I

    .line 4
    .line 5
    if-eqz v0, :cond_1

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-direct {p0}, La/o950;->getTitle()Landroid/widget/TextView;

    .line 15
    .line 16
    .line 17
    move-result-object v4

    .line 18
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-direct {p0}, La/o950;->getTitle()Landroid/widget/TextView;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int v3, v0, v6

    .line 31
    .line 32
    const/4 v0, 0x0

    .line 33
    iget v1, p0, La/o950;->a:I

    .line 34
    .line 35
    move-object v5, p0

    .line 36
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 37
    .line 38
    .line 39
    :cond_1
    :goto_0
    iget-object v0, p0, La/o950;->f:Ljava/lang/CharSequence;

    .line 40
    .line 41
    if-eqz v0, :cond_3

    .line 42
    .line 43
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_2

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_2
    invoke-direct {p0}, La/o950;->getMessage()Landroid/widget/TextView;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget v0, p0, La/o950;->h:I

    .line 55
    .line 56
    add-int v1, v6, v0

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 59
    .line 60
    .line 61
    move-result v2

    .line 62
    iget v0, p0, La/o950;->h:I

    .line 63
    .line 64
    add-int/2addr v0, v6

    .line 65
    invoke-direct {p0}, La/o950;->getMessage()Landroid/widget/TextView;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    add-int/2addr v3, v0

    .line 74
    const/4 v0, 0x0

    .line 75
    move-object v5, p0

    .line 76
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 77
    .line 78
    .line 79
    :cond_3
    :goto_1
    iget-object v0, p0, La/o950;->g:Ljava/lang/CharSequence;

    .line 80
    .line 81
    if-eqz v0, :cond_5

    .line 82
    .line 83
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    if-nez v0, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    invoke-direct {p0}, La/o950;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    invoke-direct {p0}, La/o950;->getCheckerMessage()Landroid/widget/TextView;

    .line 99
    .line 100
    .line 101
    move-result-object v1

    .line 102
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    iget v1, p0, La/o950;->h:I

    .line 111
    .line 112
    add-int/2addr v6, v1

    .line 113
    iget v1, p0, La/o950;->i:I

    .line 114
    .line 115
    add-int/2addr v6, v1

    .line 116
    iget v7, p0, La/o950;->d:I

    .line 117
    .line 118
    add-int/2addr v6, v7

    .line 119
    div-int/lit8 v0, v0, 0x2

    .line 120
    .line 121
    add-int/2addr v6, v0

    .line 122
    invoke-direct {p0}, La/o950;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-direct {p0}, La/o950;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    div-int/lit8 v0, v0, 0x2

    .line 135
    .line 136
    sub-int v1, v6, v0

    .line 137
    .line 138
    invoke-direct {p0}, La/o950;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    add-int v2, v0, v7

    .line 147
    .line 148
    invoke-direct {p0}, La/o950;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 153
    .line 154
    .line 155
    move-result v0

    .line 156
    div-int/lit8 v0, v0, 0x2

    .line 157
    .line 158
    add-int v3, v0, v6

    .line 159
    .line 160
    iget v0, p0, La/o950;->d:I

    .line 161
    .line 162
    move-object v5, p0

    .line 163
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 164
    .line 165
    .line 166
    invoke-direct {p0}, La/o950;->getCheckerMessage()Landroid/widget/TextView;

    .line 167
    .line 168
    .line 169
    move-result-object v4

    .line 170
    invoke-direct {p0}, La/o950;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredWidth()I

    .line 175
    .line 176
    .line 177
    move-result v0

    .line 178
    add-int/2addr v0, v7

    .line 179
    add-int/2addr v0, v7

    .line 180
    invoke-direct {p0}, La/o950;->getCheckerMessage()Landroid/widget/TextView;

    .line 181
    .line 182
    .line 183
    move-result-object v1

    .line 184
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 185
    .line 186
    .line 187
    move-result v1

    .line 188
    div-int/lit8 v1, v1, 0x2

    .line 189
    .line 190
    sub-int v1, v6, v1

    .line 191
    .line 192
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 193
    .line 194
    .line 195
    move-result v2

    .line 196
    invoke-direct {p0}, La/o950;->getCheckerMessage()Landroid/widget/TextView;

    .line 197
    .line 198
    .line 199
    move-result-object v3

    .line 200
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 201
    .line 202
    .line 203
    move-result v3

    .line 204
    div-int/lit8 v3, v3, 0x2

    .line 205
    .line 206
    add-int/2addr v3, v6

    .line 207
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 208
    .line 209
    .line 210
    :cond_5
    :goto_2
    return-void
.end method

.method public final onMeasure(II)V
    .locals 5

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, La/o950;->e:Ljava/lang/CharSequence;

    .line 6
    .line 7
    const/high16 v1, 0x40000000    # 2.0f

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    invoke-direct {p0}, La/o950;->getTitle()Landroid/widget/TextView;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2, v0, p2}, Landroid/view/View;->measure(II)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    iget-object v0, p0, La/o950;->f:Ljava/lang/CharSequence;

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_2

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_2
    invoke-static {p1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    invoke-direct {p0}, La/o950;->getMessage()Landroid/widget/TextView;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-virtual {v2, v0, p2}, Landroid/view/View;->measure(II)V

    .line 49
    .line 50
    .line 51
    :cond_3
    :goto_1
    iget-object v0, p0, La/o950;->g:Ljava/lang/CharSequence;

    .line 52
    .line 53
    iget v2, p0, La/o950;->d:I

    .line 54
    .line 55
    const/4 v3, 0x0

    .line 56
    if-eqz v0, :cond_5

    .line 57
    .line 58
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_4

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_4
    invoke-direct {p0}, La/o950;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-virtual {v0, v3, v3}, Landroid/view/View;->measure(II)V

    .line 70
    .line 71
    .line 72
    sub-int v0, p1, v2

    .line 73
    .line 74
    invoke-direct {p0}, La/o950;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredWidth()I

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    sub-int/2addr v0, v4

    .line 83
    sub-int/2addr v0, v2

    .line 84
    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    invoke-direct {p0}, La/o950;->getCheckerMessage()Landroid/widget/TextView;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-virtual {v1, v0, p2}, Landroid/view/View;->measure(II)V

    .line 93
    .line 94
    .line 95
    :cond_5
    :goto_2
    iget-object p2, p0, La/o950;->e:Ljava/lang/CharSequence;

    .line 96
    .line 97
    if-eqz p2, :cond_7

    .line 98
    .line 99
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 100
    .line 101
    .line 102
    move-result p2

    .line 103
    if-nez p2, :cond_6

    .line 104
    .line 105
    goto :goto_3

    .line 106
    :cond_6
    invoke-direct {p0}, La/o950;->getTitle()Landroid/widget/TextView;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 111
    .line 112
    .line 113
    move-result p2

    .line 114
    iget v0, p0, La/o950;->c:I

    .line 115
    .line 116
    add-int/2addr p2, v0

    .line 117
    goto :goto_4

    .line 118
    :cond_7
    :goto_3
    move p2, v3

    .line 119
    :goto_4
    iput p2, p0, La/o950;->h:I

    .line 120
    .line 121
    iget-object p2, p0, La/o950;->f:Ljava/lang/CharSequence;

    .line 122
    .line 123
    iget v0, p0, La/o950;->b:I

    .line 124
    .line 125
    if-eqz p2, :cond_9

    .line 126
    .line 127
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 128
    .line 129
    .line 130
    move-result p2

    .line 131
    if-nez p2, :cond_8

    .line 132
    .line 133
    goto :goto_5

    .line 134
    :cond_8
    invoke-direct {p0}, La/o950;->getMessage()Landroid/widget/TextView;

    .line 135
    .line 136
    .line 137
    move-result-object p2

    .line 138
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 139
    .line 140
    .line 141
    move-result p2

    .line 142
    add-int/2addr p2, v0

    .line 143
    goto :goto_6

    .line 144
    :cond_9
    :goto_5
    move p2, v3

    .line 145
    :goto_6
    iput p2, p0, La/o950;->i:I

    .line 146
    .line 147
    iget-object p2, p0, La/o950;->g:Ljava/lang/CharSequence;

    .line 148
    .line 149
    if-eqz p2, :cond_b

    .line 150
    .line 151
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 152
    .line 153
    .line 154
    move-result p2

    .line 155
    if-nez p2, :cond_a

    .line 156
    .line 157
    goto :goto_7

    .line 158
    :cond_a
    invoke-direct {p0}, La/o950;->getCheckBox()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 159
    .line 160
    .line 161
    move-result-object p2

    .line 162
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 163
    .line 164
    .line 165
    move-result p2

    .line 166
    invoke-direct {p0}, La/o950;->getCheckerMessage()Landroid/widget/TextView;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredHeight()I

    .line 171
    .line 172
    .line 173
    move-result v1

    .line 174
    invoke-static {p2, v1}, Ljava/lang/Math;->max(II)I

    .line 175
    .line 176
    .line 177
    move-result p2

    .line 178
    add-int/2addr p2, v2

    .line 179
    add-int v3, p2, v0

    .line 180
    .line 181
    :cond_b
    :goto_7
    iget p2, p0, La/o950;->a:I

    .line 182
    .line 183
    iget v0, p0, La/o950;->h:I

    .line 184
    .line 185
    add-int/2addr p2, v0

    .line 186
    iget v0, p0, La/o950;->i:I

    .line 187
    .line 188
    add-int/2addr p2, v0

    .line 189
    add-int/2addr p2, v3

    .line 190
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 191
    .line 192
    .line 193
    return-void
.end method
