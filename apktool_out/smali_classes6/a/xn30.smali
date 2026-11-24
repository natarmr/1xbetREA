.class public final synthetic La/xn30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/rbe;
.implements La/ybo0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/gym0;ILa/l5r;La/j1l0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xn30;->b:Ljava/lang/Object;

    iput p2, p0, La/xn30;->a:I

    iput-object p3, p0, La/xn30;->c:Ljava/lang/Object;

    iput-object p4, p0, La/xn30;->d:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/zhl;La/wn00;La/in30;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/xn30;->b:Ljava/lang/Object;

    iput-object p2, p0, La/xn30;->c:Ljava/lang/Object;

    iput-object p3, p0, La/xn30;->d:Ljava/lang/Object;

    iput p4, p0, La/xn30;->a:I

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget-object v0, p0, La/xn30;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/zhl;

    .line 4
    .line 5
    iget-object v1, p0, La/xn30;->c:Ljava/lang/Object;

    .line 6
    .line 7
    move-object v5, v1

    .line 8
    check-cast v5, La/wn00;

    .line 9
    .line 10
    iget-object v1, p0, La/xn30;->d:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v6, v1

    .line 13
    check-cast v6, La/in30;

    .line 14
    .line 15
    move-object v2, p1

    .line 16
    check-cast v2, La/bo30;

    .line 17
    .line 18
    iget v3, v0, La/zhl;->a:I

    .line 19
    .line 20
    iget-object v4, v0, La/zhl;->b:La/vn30;

    .line 21
    .line 22
    iget v7, p0, La/xn30;->a:I

    .line 23
    .line 24
    invoke-interface/range {v2 .. v7}, La/bo30;->i(ILa/vn30;La/wn00;La/in30;I)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public g(La/tbo0;I)V
    .locals 8

    .line 1
    iget-object v0, p0, La/xn30;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/gym0;

    .line 4
    .line 5
    iget-object v1, p0, La/xn30;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, La/l5r;

    .line 8
    .line 9
    iget-object v2, p0, La/xn30;->d:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v2, La/j1l0;

    .line 12
    .line 13
    iget-object v3, v0, La/gym0;->e:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {v3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    check-cast v3, La/swm0;

    .line 20
    .line 21
    invoke-virtual {v3}, La/swm0;->a()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const/4 v5, 0x0

    .line 26
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 27
    .line 28
    .line 29
    move-result v6

    .line 30
    if-eqz v6, :cond_0

    .line 31
    .line 32
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-nez v6, :cond_0

    .line 37
    .line 38
    iget-object v6, p1, La/tbo0;->e:La/vbo0;

    .line 39
    .line 40
    invoke-virtual {v6, v4}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 41
    .line 42
    .line 43
    :cond_0
    iput-object v4, p1, La/tbo0;->a:Ljava/lang/CharSequence;

    .line 44
    .line 45
    iget-object v4, p1, La/tbo0;->e:La/vbo0;

    .line 46
    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    invoke-virtual {v4}, La/vbo0;->f()V

    .line 50
    .line 51
    .line 52
    :cond_1
    instance-of v4, v3, La/pwm0;

    .line 53
    .line 54
    iget-object v6, p1, La/tbo0;->e:La/vbo0;

    .line 55
    .line 56
    if-eqz v4, :cond_2

    .line 57
    .line 58
    invoke-static {v6}, La/vbo0;->a(La/vbo0;)La/gf5;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    sget v4, La/vbo0;->l:I

    .line 67
    .line 68
    iget-object v4, v6, La/vbo0;->d:Landroid/view/View;

    .line 69
    .line 70
    if-eqz v4, :cond_3

    .line 71
    .line 72
    invoke-virtual {v6}, La/vbo0;->c()V

    .line 73
    .line 74
    .line 75
    :cond_3
    iput-object v5, v6, La/vbo0;->e:La/gf5;

    .line 76
    .line 77
    :goto_0
    iget-object v4, p1, La/tbo0;->e:La/vbo0;

    .line 78
    .line 79
    invoke-static {v4, v5}, La/a4n0;->l(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 80
    .line 81
    .line 82
    iget-object v4, p1, La/tbo0;->e:La/vbo0;

    .line 83
    .line 84
    invoke-virtual {v4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 85
    .line 86
    .line 87
    move-result-object v4

    .line 88
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v4}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 100
    .line 101
    .line 102
    move-result v4

    .line 103
    const/4 v5, 0x1

    .line 104
    const/4 v6, 0x0

    .line 105
    if-ne v4, v5, :cond_4

    .line 106
    .line 107
    move v4, v5

    .line 108
    goto :goto_1

    .line 109
    :cond_4
    move v4, v6

    .line 110
    :goto_1
    iget-object v7, v0, La/gym0;->e:Ljava/util/List;

    .line 111
    .line 112
    invoke-interface {v7}, Ljava/util/List;->size()I

    .line 113
    .line 114
    .line 115
    move-result v7

    .line 116
    if-ne v7, v5, :cond_5

    .line 117
    .line 118
    iget-object p0, p1, La/tbo0;->e:La/vbo0;

    .line 119
    .line 120
    invoke-virtual {p0, v6, v6, v6, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_5
    iget p0, p0, La/xn30;->a:I

    .line 125
    .line 126
    if-nez p2, :cond_6

    .line 127
    .line 128
    if-eqz v4, :cond_6

    .line 129
    .line 130
    iget-object v0, p1, La/tbo0;->e:La/vbo0;

    .line 131
    .line 132
    invoke-virtual {v0, v6, v6, p0, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 133
    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_6
    if-nez p2, :cond_7

    .line 137
    .line 138
    if-nez v4, :cond_7

    .line 139
    .line 140
    iget-object v0, p1, La/tbo0;->e:La/vbo0;

    .line 141
    .line 142
    invoke-virtual {v0, p0, v6, v6, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 143
    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_7
    iget-object v5, v0, La/gym0;->e:Ljava/util/List;

    .line 147
    .line 148
    invoke-static {v5}, La/q3d;->i(Ljava/util/List;)I

    .line 149
    .line 150
    .line 151
    move-result v5

    .line 152
    if-ne p2, v5, :cond_8

    .line 153
    .line 154
    if-eqz v4, :cond_8

    .line 155
    .line 156
    iget-object v0, p1, La/tbo0;->e:La/vbo0;

    .line 157
    .line 158
    invoke-virtual {v0, p0, v6, v6, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 159
    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_8
    iget-object v0, v0, La/gym0;->e:Ljava/util/List;

    .line 163
    .line 164
    invoke-static {v0}, La/q3d;->i(Ljava/util/List;)I

    .line 165
    .line 166
    .line 167
    move-result v0

    .line 168
    if-ne p2, v0, :cond_9

    .line 169
    .line 170
    if-nez v4, :cond_9

    .line 171
    .line 172
    iget-object v0, p1, La/tbo0;->e:La/vbo0;

    .line 173
    .line 174
    invoke-virtual {v0, v6, v6, p0, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 175
    .line 176
    .line 177
    goto :goto_2

    .line 178
    :cond_9
    iget-object p0, p1, La/tbo0;->e:La/vbo0;

    .line 179
    .line 180
    invoke-virtual {p0, v6, v6, v6, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 181
    .line 182
    .line 183
    :goto_2
    iget-object p0, p1, La/tbo0;->e:La/vbo0;

    .line 184
    .line 185
    new-instance p1, La/fym0;

    .line 186
    .line 187
    invoke-direct {p1, v1, p2, v2, v3}, La/fym0;-><init>(La/l5r;ILa/j1l0;La/swm0;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {p0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 191
    .line 192
    .line 193
    return-void
.end method
