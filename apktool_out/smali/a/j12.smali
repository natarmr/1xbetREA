.class public La/j12;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/f12;

.field public final b:I


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const/4 v0, 0x0

    .line 23
    invoke-static {v0, p1}, La/k12;->g(ILandroid/content/Context;)I

    move-result v0

    invoke-direct {p0, p1, v0}, La/j12;-><init>(Landroid/content/Context;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;I)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/f12;

    .line 5
    .line 6
    new-instance v1, Landroid/view/ContextThemeWrapper;

    .line 7
    .line 8
    invoke-static {p2, p1}, La/k12;->g(ILandroid/content/Context;)I

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    invoke-direct {v1, p1, v2}, Landroid/view/ContextThemeWrapper;-><init>(Landroid/content/Context;I)V

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1}, La/f12;-><init>(Landroid/view/ContextThemeWrapper;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, La/j12;->a:La/f12;

    .line 19
    .line 20
    iput p2, p0, La/j12;->b:I

    .line 21
    .line 22
    return-void
.end method


# virtual methods
.method public create()La/k12;
    .locals 10

    .line 1
    new-instance v0, La/k12;

    .line 2
    .line 3
    iget-object v1, p0, La/j12;->a:La/f12;

    .line 4
    .line 5
    iget-object v2, v1, La/f12;->a:Landroid/view/ContextThemeWrapper;

    .line 6
    .line 7
    iget p0, p0, La/j12;->b:I

    .line 8
    .line 9
    invoke-direct {v0, v2, p0}, La/k12;-><init>(Landroid/view/ContextThemeWrapper;I)V

    .line 10
    .line 11
    .line 12
    iget-object p0, v1, La/f12;->e:Landroid/view/View;

    .line 13
    .line 14
    iget-object v2, v0, La/k12;->g:La/i12;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    iput-object p0, v2, La/i12;->v:Landroid/view/View;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p0, v1, La/f12;->d:Ljava/lang/CharSequence;

    .line 23
    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    iput-object p0, v2, La/i12;->d:Ljava/lang/CharSequence;

    .line 27
    .line 28
    iget-object v4, v2, La/i12;->t:Landroid/widget/TextView;

    .line 29
    .line 30
    if-eqz v4, :cond_1

    .line 31
    .line 32
    invoke-virtual {v4, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    .line 34
    .line 35
    :cond_1
    iget-object v4, v2, La/i12;->c:Landroid/view/Window;

    .line 36
    .line 37
    invoke-virtual {v4, p0}, Landroid/view/Window;->setTitle(Ljava/lang/CharSequence;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    iget-object p0, v1, La/f12;->c:Landroid/graphics/drawable/Drawable;

    .line 41
    .line 42
    if-eqz p0, :cond_3

    .line 43
    .line 44
    iput-object p0, v2, La/i12;->r:Landroid/graphics/drawable/Drawable;

    .line 45
    .line 46
    iget-object v4, v2, La/i12;->s:Landroid/widget/ImageView;

    .line 47
    .line 48
    if-eqz v4, :cond_3

    .line 49
    .line 50
    invoke-virtual {v4, v3}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 51
    .line 52
    .line 53
    iget-object v4, v2, La/i12;->s:Landroid/widget/ImageView;

    .line 54
    .line 55
    invoke-virtual {v4, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 56
    .line 57
    .line 58
    :cond_3
    :goto_0
    iget-object p0, v1, La/f12;->f:Ljava/lang/CharSequence;

    .line 59
    .line 60
    if-nez p0, :cond_4

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    const/4 v4, -0x1

    .line 64
    iget-object v5, v1, La/f12;->g:Landroid/content/DialogInterface$OnClickListener;

    .line 65
    .line 66
    invoke-virtual {v2, v4, p0, v5}, La/i12;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 67
    .line 68
    .line 69
    :goto_1
    iget-object p0, v1, La/f12;->h:Ljava/lang/CharSequence;

    .line 70
    .line 71
    if-nez p0, :cond_5

    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_5
    const/4 v4, -0x2

    .line 75
    iget-object v5, v1, La/f12;->i:Landroid/content/DialogInterface$OnClickListener;

    .line 76
    .line 77
    invoke-virtual {v2, v4, p0, v5}, La/i12;->c(ILjava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)V

    .line 78
    .line 79
    .line 80
    :goto_2
    iget-object p0, v1, La/f12;->k:Landroid/widget/ListAdapter;

    .line 81
    .line 82
    const/4 v4, 0x1

    .line 83
    const/4 v5, 0x0

    .line 84
    if-eqz p0, :cond_a

    .line 85
    .line 86
    iget-object p0, v1, La/f12;->b:Landroid/view/LayoutInflater;

    .line 87
    .line 88
    iget v6, v2, La/i12;->z:I

    .line 89
    .line 90
    invoke-virtual {p0, v6, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    check-cast p0, Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 95
    .line 96
    iget-boolean v6, v1, La/f12;->n:Z

    .line 97
    .line 98
    if-eqz v6, :cond_6

    .line 99
    .line 100
    iget v6, v2, La/i12;->A:I

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_6
    iget v6, v2, La/i12;->B:I

    .line 104
    .line 105
    :goto_3
    iget-object v7, v1, La/f12;->k:Landroid/widget/ListAdapter;

    .line 106
    .line 107
    if-eqz v7, :cond_7

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_7
    new-instance v7, La/h12;

    .line 111
    .line 112
    iget-object v8, v1, La/f12;->a:Landroid/view/ContextThemeWrapper;

    .line 113
    .line 114
    const v9, 0x1020014

    .line 115
    .line 116
    .line 117
    invoke-direct {v7, v8, v6, v9, v5}, Landroid/widget/ArrayAdapter;-><init>(Landroid/content/Context;II[Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :goto_4
    iput-object v7, v2, La/i12;->w:Landroid/widget/ListAdapter;

    .line 121
    .line 122
    iget v6, v1, La/f12;->o:I

    .line 123
    .line 124
    iput v6, v2, La/i12;->x:I

    .line 125
    .line 126
    iget-object v6, v1, La/f12;->l:Landroid/content/DialogInterface$OnClickListener;

    .line 127
    .line 128
    if-eqz v6, :cond_8

    .line 129
    .line 130
    new-instance v6, La/e12;

    .line 131
    .line 132
    invoke-direct {v6, v1, v2, v3}, La/e12;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, v6}, Landroid/widget/AdapterView;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 136
    .line 137
    .line 138
    :cond_8
    iget-boolean v6, v1, La/f12;->n:Z

    .line 139
    .line 140
    if-eqz v6, :cond_9

    .line 141
    .line 142
    invoke-virtual {p0, v4}, Landroid/widget/AbsListView;->setChoiceMode(I)V

    .line 143
    .line 144
    .line 145
    :cond_9
    iput-object p0, v2, La/i12;->e:Landroidx/appcompat/app/AlertController$RecycleListView;

    .line 146
    .line 147
    :cond_a
    iget-object p0, v1, La/f12;->m:Landroid/view/View;

    .line 148
    .line 149
    if-eqz p0, :cond_b

    .line 150
    .line 151
    iput-object p0, v2, La/i12;->f:Landroid/view/View;

    .line 152
    .line 153
    iput-boolean v3, v2, La/i12;->g:Z

    .line 154
    .line 155
    :cond_b
    invoke-virtual {v0, v4}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {v0, v4}, Landroid/app/Dialog;->setCanceledOnTouchOutside(Z)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v5}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 165
    .line 166
    .line 167
    iget-object p0, v1, La/f12;->j:La/xy30;

    .line 168
    .line 169
    if-eqz p0, :cond_c

    .line 170
    .line 171
    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnKeyListener(Landroid/content/DialogInterface$OnKeyListener;)V

    .line 172
    .line 173
    .line 174
    :cond_c
    return-object v0
.end method

.method public getContext()Landroid/content/Context;
    .locals 0

    .line 1
    iget-object p0, p0, La/j12;->a:La/f12;

    .line 2
    .line 3
    iget-object p0, p0, La/f12;->a:Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    return-object p0
.end method

.method public setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)La/j12;
    .locals 2

    .line 1
    iget-object v0, p0, La/j12;->a:La/f12;

    .line 2
    .line 3
    iget-object v1, v0, La/f12;->a:Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, v0, La/f12;->h:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iput-object p2, v0, La/f12;->i:Landroid/content/DialogInterface$OnClickListener;

    .line 12
    .line 13
    return-object p0
.end method

.method public setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)La/j12;
    .locals 2

    .line 1
    iget-object v0, p0, La/j12;->a:La/f12;

    .line 2
    .line 3
    iget-object v1, v0, La/f12;->a:Landroid/view/ContextThemeWrapper;

    .line 4
    .line 5
    invoke-virtual {v1, p1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iput-object p1, v0, La/f12;->f:Ljava/lang/CharSequence;

    .line 10
    .line 11
    iput-object p2, v0, La/f12;->g:Landroid/content/DialogInterface$OnClickListener;

    .line 12
    .line 13
    return-object p0
.end method

.method public setTitle(Ljava/lang/CharSequence;)La/j12;
    .locals 1

    .line 1
    iget-object v0, p0, La/j12;->a:La/f12;

    .line 2
    .line 3
    iput-object p1, v0, La/f12;->d:Ljava/lang/CharSequence;

    .line 4
    .line 5
    return-object p0
.end method

.method public setView(Landroid/view/View;)La/j12;
    .locals 1

    .line 1
    iget-object v0, p0, La/j12;->a:La/f12;

    .line 2
    .line 3
    iput-object p1, v0, La/f12;->m:Landroid/view/View;

    .line 4
    .line 5
    return-object p0
.end method
