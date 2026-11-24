.class public final La/d5i;
.super Landroidx/appcompat/widget/AppCompatTextView;
.source "SourceFile"

# interfaces
.implements La/e5i;


# instance fields
.field public i:Z

.field public j:I

.field public k:I

.field public l:Ljava/lang/CharSequence;

.field public m:Ljava/lang/CharSequence;


# virtual methods
.method public final e(Landroid/content/res/TypedArray;)V
    .locals 6

    .line 1
    const-string v0, "DSTextFieldHelperView"

    .line 2
    .line 3
    invoke-virtual {p0, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    const/16 v0, 0x12

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 9
    .line 10
    .line 11
    const/16 v0, 0x13

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getType(I)I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/16 v2, 0x1d

    .line 18
    .line 19
    const/16 v3, 0x1c

    .line 20
    .line 21
    const/4 v4, 0x1

    .line 22
    if-eq v1, v4, :cond_1

    .line 23
    .line 24
    if-eq v1, v3, :cond_0

    .line 25
    .line 26
    if-eq v1, v2, :cond_0

    .line 27
    .line 28
    iget v0, p0, La/d5i;->j:I

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    iget v1, p0, La/d5i;->j:I

    .line 32
    .line 33
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    goto :goto_0

    .line 38
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    iget v5, p0, La/d5i;->j:I

    .line 46
    .line 47
    invoke-virtual {p1, v0, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    invoke-static {v0, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    :goto_0
    iput v0, p0, La/d5i;->j:I

    .line 56
    .line 57
    const/16 v0, 0x16

    .line 58
    .line 59
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getType(I)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eq v1, v4, :cond_3

    .line 64
    .line 65
    if-eq v1, v3, :cond_2

    .line 66
    .line 67
    if-eq v1, v2, :cond_2

    .line 68
    .line 69
    iget v0, p0, La/d5i;->k:I

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_2
    iget v1, p0, La/d5i;->j:I

    .line 73
    .line 74
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    goto :goto_1

    .line 79
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    iget v2, p0, La/d5i;->k:I

    .line 87
    .line 88
    invoke-virtual {p1, v0, v2}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-static {v0, v1}, La/m5d;->b(ILandroid/content/Context;)I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    :goto_1
    iput v0, p0, La/d5i;->k:I

    .line 97
    .line 98
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    const/16 v1, 0x15

    .line 106
    .line 107
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-static {p1, v0, v1}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v0

    .line 115
    iput-object v0, p0, La/d5i;->m:Ljava/lang/CharSequence;

    .line 116
    .line 117
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    const/16 v1, 0x11

    .line 125
    .line 126
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    invoke-static {p1, v0, v1}, La/ktt0;->p(Landroid/content/res/TypedArray;Landroid/content/Context;Ljava/lang/Integer;)Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    iput-object v0, p0, La/d5i;->l:Ljava/lang/CharSequence;

    .line 135
    .line 136
    const/16 v0, 0x17

    .line 137
    .line 138
    invoke-virtual {p0}, Landroid/widget/TextView;->getTextSize()F

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 143
    .line 144
    .line 145
    move-result v0

    .line 146
    const/4 v1, 0x0

    .line 147
    invoke-virtual {p0, v1, v0}, Landroidx/appcompat/widget/AppCompatTextView;->setTextSize(IF)V

    .line 148
    .line 149
    .line 150
    const/16 v0, 0x1f

    .line 151
    .line 152
    iget-boolean v1, p0, La/d5i;->i:Z

    .line 153
    .line 154
    invoke-virtual {p1, v0, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 155
    .line 156
    .line 157
    move-result p1

    .line 158
    iput-boolean p1, p0, La/d5i;->i:Z

    .line 159
    .line 160
    if-eqz p1, :cond_4

    .line 161
    .line 162
    iget p1, p0, La/d5i;->j:I

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_4
    iget p1, p0, La/d5i;->k:I

    .line 166
    .line 167
    :goto_2
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p0}, La/d5i;->j()V

    .line 171
    .line 172
    .line 173
    return-void
.end method

.method public final j()V
    .locals 1

    .line 1
    iget-boolean v0, p0, La/d5i;->i:Z

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La/d5i;->l:Ljava/lang/CharSequence;

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    .line 9
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    iget-object v0, p0, La/d5i;->l:Ljava/lang/CharSequence;

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    :goto_0
    iget-object v0, p0, La/d5i;->m:Ljava/lang/CharSequence;

    .line 20
    .line 21
    :goto_1
    invoke-virtual {p0, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public final setErrorText(Ljava/lang/CharSequence;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/d5i;->l:Ljava/lang/CharSequence;

    .line 2
    .line 3
    invoke-virtual {p0}, La/d5i;->j()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final setValue(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, La/d5i;->m:Ljava/lang/CharSequence;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    if-eqz p1, :cond_2

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    iget-object v0, p0, La/d5i;->m:Ljava/lang/CharSequence;

    .line 22
    .line 23
    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    invoke-virtual {p0}, Landroid/view/View;->requestLayout()V

    .line 30
    .line 31
    .line 32
    :cond_2
    :goto_0
    iput-object p1, p0, La/d5i;->m:Ljava/lang/CharSequence;

    .line 33
    .line 34
    invoke-virtual {p0}, La/d5i;->j()V

    .line 35
    .line 36
    .line 37
    return-void
.end method
