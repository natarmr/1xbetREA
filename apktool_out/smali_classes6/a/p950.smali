.class public final La/p950;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements La/l12;


# instance fields
.field public a:Lorg/xplatform/uikit/components/dialog/DialogFields;

.field public b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public g:I

.field public h:I

.field public i:I

.field public final j:Landroidx/core/widget/NestedScrollView;

.field public final k:La/o950;

.field public final l:Landroid/widget/TextView;

.field public final m:La/n0o0;

.field public final n:La/n0o0;

.field public final o:La/n0o0;

.field public final p:La/n0o0;

.field public final q:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 14

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    invoke-direct {p0, p1, v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 4
    .line 5
    .line 6
    new-instance v2, Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 7
    .line 8
    sget-object v11, La/n12;->a:La/n12;

    .line 9
    .line 10
    const/4 v12, 0x0

    .line 11
    const/16 v13, 0x5fb

    .line 12
    .line 13
    const/4 v3, 0x0

    .line 14
    const/4 v4, 0x0

    .line 15
    const-string v5, ""

    .line 16
    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v9, 0x0

    .line 21
    const/4 v10, 0x0

    .line 22
    invoke-direct/range {v2 .. v13}, Lorg/xplatform/uikit/components/dialog/DialogFields;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/xplatform/uikit/components/dialog/utils/ActionDialogButtonStyle;La/n12;ZI)V

    .line 23
    .line 24
    .line 25
    iput-object v2, p0, La/p950;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 26
    .line 27
    const v0, 0x7fffffff

    .line 28
    .line 29
    .line 30
    iput v0, p0, La/p950;->b:I

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const v1, 0x7f0706ea

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iput v0, p0, La/p950;->c:I

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const v1, 0x7f0706f8

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput v0, p0, La/p950;->d:I

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const v1, 0x7f070633

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iput v0, p0, La/p950;->e:I

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const v1, 0x7f0706bd

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iput v0, p0, La/p950;->f:I

    .line 83
    .line 84
    new-instance v0, Landroidx/core/widget/NestedScrollView;

    .line 85
    .line 86
    invoke-direct {v0, p1}, Landroidx/core/widget/NestedScrollView;-><init>(Landroid/content/Context;)V

    .line 87
    .line 88
    .line 89
    invoke-static {}, La/jmu0;->d()I

    .line 90
    .line 91
    .line 92
    move-result v1

    .line 93
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 94
    .line 95
    .line 96
    iput-object v0, p0, La/p950;->j:Landroidx/core/widget/NestedScrollView;

    .line 97
    .line 98
    new-instance v0, La/o950;

    .line 99
    .line 100
    invoke-direct {v0, p1}, La/o950;-><init>(Landroid/content/Context;)V

    .line 101
    .line 102
    .line 103
    invoke-static {}, La/jmu0;->d()I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 108
    .line 109
    .line 110
    iput-object v0, p0, La/p950;->k:La/o950;

    .line 111
    .line 112
    new-instance v0, Landroid/widget/TextView;

    .line 113
    .line 114
    invoke-direct {v0, p1}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 115
    .line 116
    .line 117
    invoke-static {}, La/jmu0;->d()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-virtual {v0, v1}, Landroid/view/View;->setId(I)V

    .line 122
    .line 123
    .line 124
    const-string v1, "topButton"

    .line 125
    .line 126
    invoke-virtual {v0, v1}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 127
    .line 128
    .line 129
    const v1, 0x7f140487

    .line 130
    .line 131
    .line 132
    invoke-static {v1, v0}, La/cem0;->n(ILandroid/widget/TextView;)V

    .line 133
    .line 134
    .line 135
    const/4 v1, 0x4

    .line 136
    invoke-virtual {v0, v1}, Landroid/view/View;->setTextAlignment(I)V

    .line 137
    .line 138
    .line 139
    const/4 v1, 0x2

    .line 140
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 141
    .line 142
    .line 143
    sget-object v1, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 144
    .line 145
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 146
    .line 147
    .line 148
    iput-object v0, p0, La/p950;->l:Landroid/widget/TextView;

    .line 149
    .line 150
    new-instance v0, La/i7q;

    .line 151
    .line 152
    const/16 v1, 0x17

    .line 153
    .line 154
    invoke-direct {v0, p1, v1}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 155
    .line 156
    .line 157
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    iput-object v0, p0, La/p950;->m:La/n0o0;

    .line 162
    .line 163
    new-instance v0, La/i7q;

    .line 164
    .line 165
    const/16 v1, 0x18

    .line 166
    .line 167
    invoke-direct {v0, p1, v1}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 168
    .line 169
    .line 170
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    iput-object v0, p0, La/p950;->n:La/n0o0;

    .line 175
    .line 176
    new-instance v0, La/i7q;

    .line 177
    .line 178
    const/16 v1, 0x19

    .line 179
    .line 180
    invoke-direct {v0, p1, v1}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 181
    .line 182
    .line 183
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 184
    .line 185
    .line 186
    move-result-object v0

    .line 187
    iput-object v0, p0, La/p950;->o:La/n0o0;

    .line 188
    .line 189
    new-instance v0, La/i7q;

    .line 190
    .line 191
    const/16 v1, 0x1a

    .line 192
    .line 193
    invoke-direct {v0, p1, v1}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 194
    .line 195
    .line 196
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    iput-object v0, p0, La/p950;->p:La/n0o0;

    .line 201
    .line 202
    new-instance v0, La/i7q;

    .line 203
    .line 204
    const/16 v1, 0x1b

    .line 205
    .line 206
    invoke-direct {v0, p1, v1}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 207
    .line 208
    .line 209
    invoke-static {v0}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 210
    .line 211
    .line 212
    move-result-object p1

    .line 213
    iput-object p1, p0, La/p950;->q:La/n0o0;

    .line 214
    .line 215
    return-void
.end method

.method private final getBottomSeparator()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, La/p950;->q:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/view/View;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getMiddleSeparator()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, La/p950;->p:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/view/View;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getNegativeButton()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, La/p950;->m:La/n0o0;

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

.method private final getNeutralButton()Landroid/widget/TextView;
    .locals 0

    .line 1
    iget-object p0, p0, La/p950;->n:La/n0o0;

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

.method private final getTopSeparator()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, La/p950;->o:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/view/View;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a(Landroid/widget/TextView;)V
    .locals 10

    .line 1
    iget-object v0, p0, La/p950;->l:Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-virtual {v0}, Landroid/view/View;->getBottom()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    iget v1, p0, La/p950;->c:I

    .line 8
    .line 9
    add-int v3, v0, v1

    .line 10
    .line 11
    iget v0, p0, La/p950;->h:I

    .line 12
    .line 13
    add-int/2addr v0, v3

    .line 14
    add-int v5, v3, v1

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    iget v4, p0, La/p950;->d:I

    .line 21
    .line 22
    sub-int v6, v2, v4

    .line 23
    .line 24
    sub-int v7, v0, v1

    .line 25
    .line 26
    iget v4, p0, La/p950;->d:I

    .line 27
    .line 28
    move-object v9, p0

    .line 29
    move-object v8, p1

    .line 30
    invoke-static/range {v4 .. v9}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 31
    .line 32
    .line 33
    move-object v7, v9

    .line 34
    invoke-direct {v7}, La/p950;->getMiddleSeparator()Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-virtual {v7}, Landroid/view/View;->getMeasuredWidth()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    iget p0, v7, La/p950;->e:I

    .line 43
    .line 44
    add-int v5, v3, p0

    .line 45
    .line 46
    const/4 v2, 0x0

    .line 47
    invoke-static/range {v2 .. v7}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 48
    .line 49
    .line 50
    return-void
.end method

.method public getChecker()Lorg/xplatform/uikit/components/check_box/DsCheckbox;
    .locals 0

    .line 1
    iget-object p0, p0, La/p950;->k:La/o950;

    .line 2
    .line 3
    invoke-virtual {p0}, La/o950;->getChecker()Lorg/xplatform/uikit/components/check_box/DsCheckbox;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getCheckerText()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/p950;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/uikit/components/dialog/DialogFields;->g:Ljava/lang/CharSequence;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object p0

    .line 15
    :cond_1
    :goto_0
    const-string p0, ""

    .line 16
    .line 17
    return-object p0
.end method

.method public getMessage()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/p950;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/uikit/components/dialog/DialogFields;->b:Ljava/lang/CharSequence;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object p0

    .line 15
    :cond_1
    :goto_0
    const-string p0, ""

    .line 16
    .line 17
    return-object p0
.end method

.method public getNegativeButton()Landroid/view/View;
    .locals 0

    .line 10
    invoke-direct {p0}, La/p950;->getNegativeButton()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public getNeutralButton()Landroid/view/View;
    .locals 0

    .line 10
    invoke-direct {p0}, La/p950;->getNeutralButton()Landroid/widget/TextView;

    move-result-object p0

    return-object p0
.end method

.method public getPositiveButton()Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, La/p950;->l:Landroid/widget/TextView;

    .line 2
    .line 3
    return-object p0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/p950;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 2
    .line 3
    iget-object p0, p0, Lorg/xplatform/uikit/components/dialog/DialogFields;->a:Ljava/lang/CharSequence;

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    return-object p0

    .line 15
    :cond_1
    :goto_0
    const-string p0, ""

    .line 16
    .line 17
    return-object p0
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    .line 1
    iget-object p4, p0, La/p950;->j:Landroidx/core/widget/NestedScrollView;

    .line 2
    .line 3
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredWidth()I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    move-object v5, p0

    .line 8
    iget p0, v5, La/p950;->d:I

    .line 9
    .line 10
    add-int p2, p1, p0

    .line 11
    .line 12
    invoke-virtual {p4}, Landroid/view/View;->getMeasuredHeight()I

    .line 13
    .line 14
    .line 15
    move-result p3

    .line 16
    const/4 p1, 0x0

    .line 17
    move-object p5, v5

    .line 18
    invoke-static/range {p0 .. p5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p4}, Landroid/view/View;->getBottom()I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    iget p1, v5, La/p950;->g:I

    .line 26
    .line 27
    add-int/2addr p1, p0

    .line 28
    iget p2, v5, La/p950;->c:I

    .line 29
    .line 30
    add-int v1, p0, p2

    .line 31
    .line 32
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 33
    .line 34
    .line 35
    move-result p3

    .line 36
    iget p4, v5, La/p950;->d:I

    .line 37
    .line 38
    sub-int v2, p3, p4

    .line 39
    .line 40
    sub-int v3, p1, p2

    .line 41
    .line 42
    iget v0, v5, La/p950;->d:I

    .line 43
    .line 44
    iget-object v4, v5, La/p950;->l:Landroid/widget/TextView;

    .line 45
    .line 46
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 47
    .line 48
    .line 49
    move-object p1, v4

    .line 50
    invoke-direct {v5}, La/p950;->getTopSeparator()Landroid/view/View;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    iget p3, v5, La/p950;->e:I

    .line 59
    .line 60
    add-int v3, p0, p3

    .line 61
    .line 62
    const/4 v0, 0x0

    .line 63
    move v1, p0

    .line 64
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 65
    .line 66
    .line 67
    iget-object p0, v5, La/p950;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 68
    .line 69
    iget-object p0, p0, Lorg/xplatform/uikit/components/dialog/DialogFields;->d:Ljava/lang/CharSequence;

    .line 70
    .line 71
    const/4 p5, 0x1

    .line 72
    if-eqz p0, :cond_1

    .line 73
    .line 74
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    if-nez p0, :cond_0

    .line 79
    .line 80
    goto :goto_0

    .line 81
    :cond_0
    move p0, v0

    .line 82
    goto :goto_1

    .line 83
    :cond_1
    :goto_0
    move p0, p5

    .line 84
    :goto_1
    iget-object v1, v5, La/p950;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 85
    .line 86
    iget-object v1, v1, Lorg/xplatform/uikit/components/dialog/DialogFields;->e:Ljava/lang/CharSequence;

    .line 87
    .line 88
    if-eqz v1, :cond_3

    .line 89
    .line 90
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-nez v1, :cond_2

    .line 95
    .line 96
    goto :goto_2

    .line 97
    :cond_2
    move p5, v0

    .line 98
    :cond_3
    :goto_2
    if-nez p0, :cond_4

    .line 99
    .line 100
    if-nez p5, :cond_4

    .line 101
    .line 102
    invoke-direct {v5}, La/p950;->getNeutralButton()Landroid/widget/TextView;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    invoke-virtual {v5, p0}, La/p950;->a(Landroid/widget/TextView;)V

    .line 107
    .line 108
    .line 109
    invoke-direct {v5}, La/p950;->getNegativeButton()Landroid/widget/TextView;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {p1}, Landroid/view/View;->getBottom()I

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    add-int/2addr p0, p2

    .line 118
    iget p1, v5, La/p950;->h:I

    .line 119
    .line 120
    add-int/2addr p0, p1

    .line 121
    iget p1, v5, La/p950;->i:I

    .line 122
    .line 123
    add-int/2addr p1, p0

    .line 124
    add-int v1, p0, p2

    .line 125
    .line 126
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 127
    .line 128
    .line 129
    move-result p5

    .line 130
    sub-int v2, p5, p4

    .line 131
    .line 132
    sub-int v3, p1, p2

    .line 133
    .line 134
    iget v0, v5, La/p950;->d:I

    .line 135
    .line 136
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 137
    .line 138
    .line 139
    invoke-direct {v5}, La/p950;->getBottomSeparator()Landroid/view/View;

    .line 140
    .line 141
    .line 142
    move-result-object v4

    .line 143
    invoke-virtual {v5}, Landroid/view/View;->getMeasuredWidth()I

    .line 144
    .line 145
    .line 146
    move-result v2

    .line 147
    add-int v3, p0, p3

    .line 148
    .line 149
    const/4 v0, 0x0

    .line 150
    move v1, p0

    .line 151
    invoke-static/range {v0 .. v5}, La/jmu0;->f(IIIILandroid/view/View;Landroid/view/ViewGroup;)V

    .line 152
    .line 153
    .line 154
    return-void

    .line 155
    :cond_4
    if-nez p0, :cond_5

    .line 156
    .line 157
    invoke-direct {v5}, La/p950;->getNegativeButton()Landroid/widget/TextView;

    .line 158
    .line 159
    .line 160
    move-result-object p0

    .line 161
    invoke-virtual {v5, p0}, La/p950;->a(Landroid/widget/TextView;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_5
    if-nez p5, :cond_6

    .line 166
    .line 167
    invoke-direct {v5}, La/p950;->getNeutralButton()Landroid/widget/TextView;

    .line 168
    .line 169
    .line 170
    move-result-object p0

    .line 171
    invoke-virtual {v5, p0}, La/p950;->a(Landroid/widget/TextView;)V

    .line 172
    .line 173
    .line 174
    :cond_6
    return-void
.end method

.method public final onMeasure(II)V
    .locals 8

    .line 1
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget v1, p0, La/p950;->d:I

    .line 10
    .line 11
    mul-int/lit8 v1, v1, 0x2

    .line 12
    .line 13
    sub-int v1, p1, v1

    .line 14
    .line 15
    const/high16 v2, 0x40000000    # 2.0f

    .line 16
    .line 17
    invoke-static {v1, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    const/high16 v3, -0x80000000

    .line 22
    .line 23
    invoke-static {v0, v3}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    iget-object v3, p0, La/p950;->k:La/o950;

    .line 28
    .line 29
    invoke-virtual {v3, v1, p2}, Landroid/view/View;->measure(II)V

    .line 30
    .line 31
    .line 32
    iget-object p2, p0, La/p950;->l:Landroid/widget/TextView;

    .line 33
    .line 34
    invoke-virtual {p2, v1, v0}, Landroid/view/View;->measure(II)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    iget v4, p0, La/p950;->c:I

    .line 42
    .line 43
    mul-int/lit8 v4, v4, 0x2

    .line 44
    .line 45
    add-int/2addr p2, v4

    .line 46
    iput p2, p0, La/p950;->g:I

    .line 47
    .line 48
    iget-object p2, p0, La/p950;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 49
    .line 50
    iget-object p2, p2, Lorg/xplatform/uikit/components/dialog/DialogFields;->d:Ljava/lang/CharSequence;

    .line 51
    .line 52
    const/4 v5, 0x1

    .line 53
    const/4 v6, 0x0

    .line 54
    if-eqz p2, :cond_1

    .line 55
    .line 56
    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    .line 57
    .line 58
    .line 59
    move-result p2

    .line 60
    if-nez p2, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move p2, v6

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    :goto_0
    move p2, v5

    .line 66
    :goto_1
    iget-object v7, p0, La/p950;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 67
    .line 68
    iget-object v7, v7, Lorg/xplatform/uikit/components/dialog/DialogFields;->e:Ljava/lang/CharSequence;

    .line 69
    .line 70
    if-eqz v7, :cond_3

    .line 71
    .line 72
    invoke-interface {v7}, Ljava/lang/CharSequence;->length()I

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-nez v7, :cond_2

    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_2
    move v5, v6

    .line 80
    :cond_3
    :goto_2
    if-nez v5, :cond_4

    .line 81
    .line 82
    if-nez p2, :cond_4

    .line 83
    .line 84
    invoke-direct {p0}, La/p950;->getNeutralButton()Landroid/widget/TextView;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    invoke-virtual {p2, v1, v0}, Landroid/view/View;->measure(II)V

    .line 89
    .line 90
    .line 91
    invoke-direct {p0}, La/p950;->getNeutralButton()Landroid/widget/TextView;

    .line 92
    .line 93
    .line 94
    move-result-object p2

    .line 95
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 96
    .line 97
    .line 98
    move-result p2

    .line 99
    add-int/2addr p2, v4

    .line 100
    iput p2, p0, La/p950;->i:I

    .line 101
    .line 102
    invoke-direct {p0}, La/p950;->getNegativeButton()Landroid/widget/TextView;

    .line 103
    .line 104
    .line 105
    move-result-object p2

    .line 106
    invoke-virtual {p2, v1, v0}, Landroid/view/View;->measure(II)V

    .line 107
    .line 108
    .line 109
    invoke-direct {p0}, La/p950;->getNegativeButton()Landroid/widget/TextView;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 114
    .line 115
    .line 116
    move-result p2

    .line 117
    add-int/2addr p2, v4

    .line 118
    iput p2, p0, La/p950;->h:I

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :cond_4
    if-nez v5, :cond_5

    .line 122
    .line 123
    invoke-direct {p0}, La/p950;->getNeutralButton()Landroid/widget/TextView;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-virtual {p2, v1, v0}, Landroid/view/View;->measure(II)V

    .line 128
    .line 129
    .line 130
    invoke-direct {p0}, La/p950;->getNeutralButton()Landroid/widget/TextView;

    .line 131
    .line 132
    .line 133
    move-result-object p2

    .line 134
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 135
    .line 136
    .line 137
    move-result p2

    .line 138
    add-int/2addr p2, v4

    .line 139
    iput p2, p0, La/p950;->h:I

    .line 140
    .line 141
    goto :goto_3

    .line 142
    :cond_5
    if-nez p2, :cond_6

    .line 143
    .line 144
    invoke-direct {p0}, La/p950;->getNegativeButton()Landroid/widget/TextView;

    .line 145
    .line 146
    .line 147
    move-result-object p2

    .line 148
    invoke-virtual {p2, v1, v0}, Landroid/view/View;->measure(II)V

    .line 149
    .line 150
    .line 151
    invoke-direct {p0}, La/p950;->getNegativeButton()Landroid/widget/TextView;

    .line 152
    .line 153
    .line 154
    move-result-object p2

    .line 155
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredHeight()I

    .line 156
    .line 157
    .line 158
    move-result p2

    .line 159
    add-int/2addr p2, v4

    .line 160
    iput p2, p0, La/p950;->h:I

    .line 161
    .line 162
    :cond_6
    :goto_3
    iget p2, p0, La/p950;->g:I

    .line 163
    .line 164
    iget v0, p0, La/p950;->h:I

    .line 165
    .line 166
    add-int/2addr p2, v0

    .line 167
    iget v0, p0, La/p950;->i:I

    .line 168
    .line 169
    add-int/2addr p2, v0

    .line 170
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 171
    .line 172
    .line 173
    move-result v0

    .line 174
    add-int/2addr v0, p2

    .line 175
    iget v4, p0, La/p950;->f:I

    .line 176
    .line 177
    iget v5, p0, La/p950;->b:I

    .line 178
    .line 179
    invoke-static {v4, v5}, Ljava/lang/Math;->min(II)I

    .line 180
    .line 181
    .line 182
    move-result v4

    .line 183
    iget-object v5, p0, La/p950;->j:Landroidx/core/widget/NestedScrollView;

    .line 184
    .line 185
    if-le v0, v4, :cond_7

    .line 186
    .line 187
    sub-int p2, v4, p2

    .line 188
    .line 189
    invoke-static {p2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 190
    .line 191
    .line 192
    move-result p2

    .line 193
    invoke-virtual {v5, v1, p2}, Landroid/view/View;->measure(II)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0, p1, v4}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 197
    .line 198
    .line 199
    return-void

    .line 200
    :cond_7
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 201
    .line 202
    .line 203
    move-result p2

    .line 204
    invoke-static {p2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 205
    .line 206
    .line 207
    move-result p2

    .line 208
    invoke-virtual {v5, v1, p2}, Landroid/view/View;->measure(II)V

    .line 209
    .line 210
    .line 211
    invoke-virtual {p0, p1, v0}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 212
    .line 213
    .line 214
    return-void
.end method

.method public setMaxContentHeight(I)V
    .locals 0

    .line 1
    iput p1, p0, La/p950;->b:I

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setModel(Lorg/xplatform/uikit/components/dialog/DialogFields;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/p950;->a:Lorg/xplatform/uikit/components/dialog/DialogFields;

    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/p950;->j:Landroidx/core/widget/NestedScrollView;

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 12
    .line 13
    .line 14
    iget-object v1, p1, Lorg/xplatform/uikit/components/dialog/DialogFields;->a:Ljava/lang/CharSequence;

    .line 15
    .line 16
    iget-object v2, p1, Lorg/xplatform/uikit/components/dialog/DialogFields;->e:Ljava/lang/CharSequence;

    .line 17
    .line 18
    iget-object v3, p1, Lorg/xplatform/uikit/components/dialog/DialogFields;->b:Ljava/lang/CharSequence;

    .line 19
    .line 20
    iget-object v4, p1, Lorg/xplatform/uikit/components/dialog/DialogFields;->g:Ljava/lang/CharSequence;

    .line 21
    .line 22
    iget-object v5, p0, La/p950;->k:La/o950;

    .line 23
    .line 24
    invoke-virtual {v5, v1, v3, v4}, La/o950;->a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v5}, Landroidx/core/widget/NestedScrollView;->addView(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 31
    .line 32
    .line 33
    iget-object v0, p1, Lorg/xplatform/uikit/components/dialog/DialogFields;->c:Ljava/lang/CharSequence;

    .line 34
    .line 35
    iget-object v1, p0, La/p950;->l:Landroid/widget/TextView;

    .line 36
    .line 37
    invoke-virtual {v1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    invoke-direct {p0}, La/p950;->getTopSeparator()Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, p1, Lorg/xplatform/uikit/components/dialog/DialogFields;->d:Ljava/lang/CharSequence;

    .line 51
    .line 52
    const/4 v0, 0x1

    .line 53
    const/4 v1, 0x0

    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-nez v3, :cond_0

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_0
    move v3, v1

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    :goto_0
    move v3, v0

    .line 66
    :goto_1
    if-eqz v2, :cond_3

    .line 67
    .line 68
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 69
    .line 70
    .line 71
    move-result v4

    .line 72
    if-nez v4, :cond_2

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_2
    move v0, v1

    .line 76
    :cond_3
    :goto_2
    if-nez v3, :cond_4

    .line 77
    .line 78
    invoke-direct {p0}, La/p950;->getNegativeButton()Landroid/widget/TextView;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    .line 84
    .line 85
    invoke-direct {p0}, La/p950;->getNegativeButton()Landroid/widget/TextView;

    .line 86
    .line 87
    .line 88
    move-result-object p1

    .line 89
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 90
    .line 91
    .line 92
    :cond_4
    if-nez v3, :cond_5

    .line 93
    .line 94
    if-nez v0, :cond_5

    .line 95
    .line 96
    invoke-direct {p0}, La/p950;->getBottomSeparator()Landroid/view/View;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 101
    .line 102
    .line 103
    :cond_5
    if-nez v0, :cond_6

    .line 104
    .line 105
    invoke-direct {p0}, La/p950;->getNeutralButton()Landroid/widget/TextView;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 110
    .line 111
    .line 112
    invoke-direct {p0}, La/p950;->getNeutralButton()Landroid/widget/TextView;

    .line 113
    .line 114
    .line 115
    move-result-object p1

    .line 116
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 117
    .line 118
    .line 119
    :cond_6
    if-eqz v3, :cond_8

    .line 120
    .line 121
    if-nez v0, :cond_7

    .line 122
    .line 123
    goto :goto_3

    .line 124
    :cond_7
    return-void

    .line 125
    :cond_8
    :goto_3
    invoke-direct {p0}, La/p950;->getMiddleSeparator()Landroid/view/View;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 130
    .line 131
    .line 132
    return-void
.end method
