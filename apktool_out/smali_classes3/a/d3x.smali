.class public final synthetic La/d3x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/z6e;

.field public final synthetic c:La/z6e;

.field public final synthetic d:La/nhe0;

.field public final synthetic e:La/z6e;


# direct methods
.method public synthetic constructor <init>(La/z6e;La/z6e;La/nhe0;La/z6e;B)V
    .locals 0

    .line 1
    iput-byte p5, p0, La/d3x;->a:B

    iput-object p1, p0, La/d3x;->b:La/z6e;

    iput-object p2, p0, La/d3x;->c:La/z6e;

    iput-object p3, p0, La/d3x;->d:La/nhe0;

    iput-object p4, p0, La/d3x;->e:La/z6e;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/d3x;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x2

    .line 5
    iget-object v3, p0, La/d3x;->e:La/z6e;

    .line 6
    .line 7
    iget-object v4, p0, La/d3x;->d:La/nhe0;

    .line 8
    .line 9
    iget-object v5, p0, La/d3x;->c:La/z6e;

    .line 10
    .line 11
    iget-object p0, p0, La/d3x;->b:La/z6e;

    .line 12
    .line 13
    check-cast p1, La/cp;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    new-instance v0, La/bg5;

    .line 22
    .line 23
    invoke-direct {v0, p0, v5}, La/bg5;-><init>(La/z6e;La/z6e;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p1, La/cp;->u:La/yfu0;

    .line 27
    .line 28
    check-cast p0, La/e2k;

    .line 29
    .line 30
    iget-object v5, p0, La/e2k;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 31
    .line 32
    new-instance v6, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 33
    .line 34
    iget-object v7, p1, La/cp;->w:Landroid/content/Context;

    .line 35
    .line 36
    invoke-direct {v6, v7, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 37
    .line 38
    .line 39
    new-instance v2, La/f3x;

    .line 40
    .line 41
    const/4 v8, 0x1

    .line 42
    invoke-direct {v2, v0, v8}, La/f3x;-><init>(La/bg5;B)V

    .line 43
    .line 44
    .line 45
    iput-object v2, v6, Landroidx/recyclerview/widget/GridLayoutManager;->m1:La/c2;

    .line 46
    .line 47
    invoke-virtual {v5, v6}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 48
    .line 49
    .line 50
    iget-object v2, p0, La/e2k;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 51
    .line 52
    new-instance v5, La/kq8;

    .line 53
    .line 54
    invoke-direct {v5, v7}, La/kq8;-><init>(Landroid/content/Context;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->setRecycledViewPool(La/nhe0;)V

    .line 67
    .line 68
    .line 69
    iget-object v1, p0, La/e2k;->a:Landroid/widget/LinearLayout;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    new-instance v2, La/lfr;

    .line 75
    .line 76
    const/16 v4, 0xb

    .line 77
    .line 78
    invoke-direct {v2, v1, p0, v4}, La/lfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 79
    .line 80
    .line 81
    invoke-static {v1, v2}, La/tl60;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 82
    .line 83
    .line 84
    iget-object v1, p0, La/e2k;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 85
    .line 86
    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    if-eqz v1, :cond_0

    .line 91
    .line 92
    const v2, 0x7f040afc

    .line 93
    .line 94
    .line 95
    invoke-static {v1, v7, v2}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 96
    .line 97
    .line 98
    :cond_0
    iget-object p0, p0, La/e2k;->b:Landroid/widget/ImageView;

    .line 99
    .line 100
    new-instance v1, La/pzp;

    .line 101
    .line 102
    const/4 v2, 0x5

    .line 103
    invoke-direct {v1, p1, v3, v2}, La/pzp;-><init>(La/cp;La/z6e;B)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 107
    .line 108
    .line 109
    new-instance p0, La/e3x;

    .line 110
    .line 111
    invoke-direct {p0, p1, v0, v8}, La/e3x;-><init>(La/cp;La/bg5;B)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 115
    .line 116
    .line 117
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 121
    .line 122
    .line 123
    new-instance v0, La/bg5;

    .line 124
    .line 125
    invoke-direct {v0, p0, v5}, La/bg5;-><init>(La/z6e;La/z6e;)V

    .line 126
    .line 127
    .line 128
    iget-object p0, p1, La/cp;->u:La/yfu0;

    .line 129
    .line 130
    check-cast p0, La/d2k;

    .line 131
    .line 132
    iget-object v5, p0, La/d2k;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 133
    .line 134
    new-instance v6, Landroidx/recyclerview/widget/GridLayoutManager;

    .line 135
    .line 136
    iget-object v7, p1, La/cp;->w:Landroid/content/Context;

    .line 137
    .line 138
    invoke-direct {v6, v7, v2}, Landroidx/recyclerview/widget/GridLayoutManager;-><init>(Landroid/content/Context;I)V

    .line 139
    .line 140
    .line 141
    new-instance v2, La/f3x;

    .line 142
    .line 143
    const/4 v8, 0x0

    .line 144
    invoke-direct {v2, v0, v8}, La/f3x;-><init>(La/bg5;B)V

    .line 145
    .line 146
    .line 147
    iput-object v2, v6, Landroidx/recyclerview/widget/GridLayoutManager;->m1:La/c2;

    .line 148
    .line 149
    invoke-virtual {v5, v6}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/b;)V

    .line 150
    .line 151
    .line 152
    iget-object v2, p0, La/d2k;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 153
    .line 154
    new-instance v5, La/kq8;

    .line 155
    .line 156
    invoke-direct {v5, v7}, La/kq8;-><init>(Landroid/content/Context;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v2, v5}, Landroidx/recyclerview/widget/RecyclerView;->m(La/fhe0;)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(La/ehe0;)V

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(La/yge0;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->setRecycledViewPool(La/nhe0;)V

    .line 169
    .line 170
    .line 171
    iget-object v1, p0, La/d2k;->a:Landroid/widget/LinearLayout;

    .line 172
    .line 173
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    new-instance v2, La/mfr;

    .line 177
    .line 178
    const/16 v4, 0x8

    .line 179
    .line 180
    invoke-direct {v2, v1, p0, v4}, La/mfr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 181
    .line 182
    .line 183
    invoke-static {v1, v2}, La/tl60;->a(Landroid/view/View;Ljava/lang/Runnable;)V

    .line 184
    .line 185
    .line 186
    iget-object v1, p0, La/d2k;->d:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 187
    .line 188
    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    if-eqz v1, :cond_1

    .line 193
    .line 194
    const v2, 0x7f040ae3

    .line 195
    .line 196
    .line 197
    invoke-static {v1, v7, v2}, La/sj3;->B0(Landroid/graphics/drawable/Drawable;Landroid/content/Context;I)V

    .line 198
    .line 199
    .line 200
    :cond_1
    iget-object p0, p0, La/d2k;->c:Landroid/widget/ImageView;

    .line 201
    .line 202
    new-instance v1, La/pzp;

    .line 203
    .line 204
    const/4 v2, 0x4

    .line 205
    invoke-direct {v1, v3, p1, v2}, La/pzp;-><init>(La/z6e;La/cp;B)V

    .line 206
    .line 207
    .line 208
    invoke-virtual {p0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 209
    .line 210
    .line 211
    new-instance p0, La/e3x;

    .line 212
    .line 213
    invoke-direct {p0, p1, v0, v8}, La/e3x;-><init>(La/cp;La/bg5;B)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1, p0}, La/cp;->t(Lkotlin/jvm/functions/Function1;)V

    .line 217
    .line 218
    .line 219
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 220
    .line 221
    return-object p0

    .line 222
    nop

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
