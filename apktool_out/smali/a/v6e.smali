.class public final synthetic La/v6e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:I

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Ljava/lang/Object;

.field public final synthetic f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/e7e;Landroidx/recyclerview/widget/RecyclerView;ILandroid/widget/ImageView;Landroid/widget/TextView;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/v6e;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/v6e;->d:Ljava/lang/Object;

    iput-object p2, p0, La/v6e;->b:Ljava/lang/Object;

    iput p3, p0, La/v6e;->c:I

    iput-object p4, p0, La/v6e;->e:Ljava/lang/Object;

    iput-object p5, p0, La/v6e;->f:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(La/go30;Landroid/util/Pair;La/wn00;La/in30;I)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput-byte v0, p0, La/v6e;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/v6e;->d:Ljava/lang/Object;

    iput-object p2, p0, La/v6e;->b:Ljava/lang/Object;

    iput-object p3, p0, La/v6e;->e:Ljava/lang/Object;

    iput-object p4, p0, La/v6e;->f:Ljava/lang/Object;

    iput p5, p0, La/v6e;->c:I

    return-void
.end method

.method public synthetic constructor <init>(Landroidx/recyclerview/widget/RecyclerView;ILa/e7e;Landroid/widget/ImageView;Landroid/widget/TextView;)V
    .locals 1

    .line 3
    const/4 v0, 0x1

    iput-byte v0, p0, La/v6e;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/v6e;->b:Ljava/lang/Object;

    iput p2, p0, La/v6e;->c:I

    iput-object p3, p0, La/v6e;->d:Ljava/lang/Object;

    iput-object p4, p0, La/v6e;->e:Ljava/lang/Object;

    iput-object p5, p0, La/v6e;->f:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 13

    .line 1
    iget-byte v1, p0, La/v6e;->a:B

    .line 2
    .line 3
    iget-object v2, p0, La/v6e;->f:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v3, p0, La/v6e;->e:Ljava/lang/Object;

    .line 6
    .line 7
    iget-object v4, p0, La/v6e;->b:Ljava/lang/Object;

    .line 8
    .line 9
    iget-object v5, p0, La/v6e;->d:Ljava/lang/Object;

    .line 10
    .line 11
    packed-switch v1, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    check-cast v5, La/go30;

    .line 15
    .line 16
    check-cast v4, Landroid/util/Pair;

    .line 17
    .line 18
    move-object v9, v3

    .line 19
    check-cast v9, La/wn00;

    .line 20
    .line 21
    move-object v10, v2

    .line 22
    check-cast v10, La/in30;

    .line 23
    .line 24
    iget-object v1, v5, La/go30;->b:La/jo30;

    .line 25
    .line 26
    iget-object v6, v1, La/jo30;->i:La/fsj;

    .line 27
    .line 28
    iget-object v1, v4, Landroid/util/Pair;->first:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v1, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    iget-object v1, v4, Landroid/util/Pair;->second:Ljava/lang/Object;

    .line 37
    .line 38
    move-object v8, v1

    .line 39
    check-cast v8, La/vn30;

    .line 40
    .line 41
    iget v11, p0, La/v6e;->c:I

    .line 42
    .line 43
    invoke-virtual/range {v6 .. v11}, La/fsj;->i(ILa/vn30;La/wn00;La/in30;I)V

    .line 44
    .line 45
    .line 46
    return-void

    .line 47
    :pswitch_0
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 48
    .line 49
    move-object v1, v5

    .line 50
    check-cast v1, La/e7e;

    .line 51
    .line 52
    check-cast v3, Landroid/widget/ImageView;

    .line 53
    .line 54
    move-object v5, v2

    .line 55
    check-cast v5, Landroid/widget/TextView;

    .line 56
    .line 57
    sget-object v2, La/e7e;->d2:La/kwd;

    .line 58
    .line 59
    move-object v2, v3

    .line 60
    iget v3, p0, La/v6e;->c:I

    .line 61
    .line 62
    invoke-static {v4, v3}, La/kcx;->G(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 63
    .line 64
    .line 65
    iget-object v0, v1, La/e7e;->S1:Landroid/os/Handler;

    .line 66
    .line 67
    iget-object v6, v1, La/e7e;->b2:Ljava/lang/Runnable;

    .line 68
    .line 69
    invoke-virtual {v0, v6}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 70
    .line 71
    .line 72
    new-instance v0, La/v6e;

    .line 73
    .line 74
    move-object v12, v4

    .line 75
    move-object v4, v2

    .line 76
    move-object v2, v12

    .line 77
    invoke-direct/range {v0 .. v5}, La/v6e;-><init>(La/e7e;Landroidx/recyclerview/widget/RecyclerView;ILandroid/widget/ImageView;Landroid/widget/TextView;)V

    .line 78
    .line 79
    .line 80
    iput-object v0, v1, La/e7e;->b2:Ljava/lang/Runnable;

    .line 81
    .line 82
    iget-object v1, v1, La/e7e;->S1:Landroid/os/Handler;

    .line 83
    .line 84
    const-wide/16 v2, 0x190

    .line 85
    .line 86
    invoke-virtual {v1, v0, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 87
    .line 88
    .line 89
    return-void

    .line 90
    :pswitch_1
    move-object v6, v5

    .line 91
    check-cast v6, La/e7e;

    .line 92
    .line 93
    move-object v5, v4

    .line 94
    check-cast v5, Landroidx/recyclerview/widget/RecyclerView;

    .line 95
    .line 96
    move-object v7, v3

    .line 97
    check-cast v7, Landroid/widget/ImageView;

    .line 98
    .line 99
    move-object v8, v2

    .line 100
    check-cast v8, Landroid/widget/TextView;

    .line 101
    .line 102
    const/4 v1, 0x0

    .line 103
    iput-boolean v1, v6, La/e7e;->a2:Z

    .line 104
    .line 105
    invoke-virtual {v6}, La/e7e;->J0()La/fae;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    invoke-virtual {v6}, La/e7e;->I0()I

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    invoke-virtual {v2, v3}, La/fae;->C(I)V

    .line 114
    .line 115
    .line 116
    iget v0, p0, La/v6e;->c:I

    .line 117
    .line 118
    invoke-virtual {v5, v0}, Landroidx/recyclerview/widget/RecyclerView;->O(I)La/xhe0;

    .line 119
    .line 120
    .line 121
    move-result-object v0

    .line 122
    if-eqz v0, :cond_5

    .line 123
    .line 124
    iget-object v0, v0, La/xhe0;->a:Landroid/view/View;

    .line 125
    .line 126
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    instance-of v2, v2, Landroid/graphics/drawable/RippleDrawable;

    .line 134
    .line 135
    if-eqz v2, :cond_0

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 139
    .line 140
    const/4 v3, 0x0

    .line 141
    if-eqz v2, :cond_1

    .line 142
    .line 143
    check-cast v0, Landroid/view/ViewGroup;

    .line 144
    .line 145
    goto :goto_0

    .line 146
    :cond_1
    move-object v0, v3

    .line 147
    :goto_0
    if-eqz v0, :cond_4

    .line 148
    .line 149
    new-instance v2, La/ihu0;

    .line 150
    .line 151
    invoke-direct {v2, v0}, La/ihu0;-><init>(Landroid/view/ViewGroup;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v2}, La/ihu0;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    :cond_2
    move-object v2, v0

    .line 159
    check-cast v2, La/jhu0;

    .line 160
    .line 161
    invoke-virtual {v2}, La/jhu0;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-eqz v4, :cond_3

    .line 166
    .line 167
    invoke-virtual {v2}, La/jhu0;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    move-object v4, v2

    .line 172
    check-cast v4, Landroid/view/View;

    .line 173
    .line 174
    invoke-virtual {v4}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 175
    .line 176
    .line 177
    move-result-object v4

    .line 178
    instance-of v4, v4, Landroid/graphics/drawable/RippleDrawable;

    .line 179
    .line 180
    if-eqz v4, :cond_2

    .line 181
    .line 182
    move-object v3, v2

    .line 183
    :cond_3
    move-object v0, v3

    .line 184
    check-cast v0, Landroid/view/View;

    .line 185
    .line 186
    goto :goto_1

    .line 187
    :cond_4
    move-object v0, v3

    .line 188
    :goto_1
    if-eqz v0, :cond_5

    .line 189
    .line 190
    const/4 v2, 0x1

    .line 191
    invoke-virtual {v0, v2}, Landroid/view/View;->setPressed(Z)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0, v1}, Landroid/view/View;->setPressed(Z)V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, Landroid/view/View;->performClick()Z

    .line 198
    .line 199
    .line 200
    :cond_5
    new-instance v4, La/hf5;

    .line 201
    .line 202
    const/4 v9, 0x4

    .line 203
    invoke-direct/range {v4 .. v9}, La/hf5;-><init>(Landroid/view/View;Ljava/lang/Object;Landroid/view/View;Landroid/view/View;B)V

    .line 204
    .line 205
    .line 206
    invoke-static {v5, v4}, La/tl60;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 207
    .line 208
    .line 209
    return-void

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
