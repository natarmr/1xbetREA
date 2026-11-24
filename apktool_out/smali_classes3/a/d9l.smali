.class public final La/d9l;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:La/a8z;

.field public final k:La/a8z;

.field public final l:La/a8z;

.field public final m:La/a8z;

.field public final n:La/a8z;

.field public final o:La/a8z;

.field public final p:La/a8z;

.field public final q:La/a8z;

.field public final r:La/a8z;

.field public s:I

.field public final t:La/l7l;

.field public final u:La/x23;

.field public v:Z

.field public w:Z

.field public x:Z


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 5

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
    const v2, 0x7f070673

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iput v0, p0, La/d9l;->a:I

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    const v2, 0x7f07069b

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iput v0, p0, La/d9l;->b:I

    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    const v2, 0x7f07068c

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iput v0, p0, La/d9l;->c:I

    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    const v2, 0x7f0706e6

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iput v0, p0, La/d9l;->d:I

    .line 57
    .line 58
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const v2, 0x7f0706b0

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    iput v0, p0, La/d9l;->f:I

    .line 70
    .line 71
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    const v2, 0x7f07070c

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    iput v0, p0, La/d9l;->g:I

    .line 83
    .line 84
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const v2, 0x7f070717

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    iput v0, p0, La/d9l;->h:I

    .line 96
    .line 97
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    const v2, 0x7f07072d

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    iput v0, p0, La/d9l;->i:I

    .line 109
    .line 110
    new-instance v0, La/c9l;

    .line 111
    .line 112
    invoke-direct {v0, p1, p0, v1}, La/c9l;-><init>(Landroid/content/Context;La/d9l;B)V

    .line 113
    .line 114
    .line 115
    sget-object v2, La/wez;->b:La/wez;

    .line 116
    .line 117
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    iput-object v0, p0, La/d9l;->j:La/a8z;

    .line 122
    .line 123
    new-instance v0, La/c9l;

    .line 124
    .line 125
    const/4 v3, 0x1

    .line 126
    invoke-direct {v0, p1, p0, v3}, La/c9l;-><init>(Landroid/content/Context;La/d9l;B)V

    .line 127
    .line 128
    .line 129
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 130
    .line 131
    .line 132
    move-result-object v0

    .line 133
    iput-object v0, p0, La/d9l;->k:La/a8z;

    .line 134
    .line 135
    new-instance v0, La/c9l;

    .line 136
    .line 137
    const/4 v4, 0x2

    .line 138
    invoke-direct {v0, p1, p0, v4}, La/c9l;-><init>(Landroid/content/Context;La/d9l;B)V

    .line 139
    .line 140
    .line 141
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 142
    .line 143
    .line 144
    move-result-object v0

    .line 145
    iput-object v0, p0, La/d9l;->l:La/a8z;

    .line 146
    .line 147
    new-instance v0, La/c9l;

    .line 148
    .line 149
    const/4 v4, 0x3

    .line 150
    invoke-direct {v0, p1, p0, v4}, La/c9l;-><init>(Landroid/content/Context;La/d9l;B)V

    .line 151
    .line 152
    .line 153
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    iput-object v0, p0, La/d9l;->m:La/a8z;

    .line 158
    .line 159
    new-instance v0, La/c9l;

    .line 160
    .line 161
    const/4 v4, 0x4

    .line 162
    invoke-direct {v0, p1, p0, v4}, La/c9l;-><init>(Landroid/content/Context;La/d9l;B)V

    .line 163
    .line 164
    .line 165
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    iput-object v0, p0, La/d9l;->n:La/a8z;

    .line 170
    .line 171
    new-instance v0, La/c9l;

    .line 172
    .line 173
    const/4 v4, 0x5

    .line 174
    invoke-direct {v0, p1, p0, v4}, La/c9l;-><init>(Landroid/content/Context;La/d9l;B)V

    .line 175
    .line 176
    .line 177
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    iput-object v0, p0, La/d9l;->o:La/a8z;

    .line 182
    .line 183
    new-instance v0, La/c9l;

    .line 184
    .line 185
    const/4 v4, 0x6

    .line 186
    invoke-direct {v0, p1, p0, v4}, La/c9l;-><init>(Landroid/content/Context;La/d9l;B)V

    .line 187
    .line 188
    .line 189
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    iput-object v0, p0, La/d9l;->p:La/a8z;

    .line 194
    .line 195
    new-instance v0, La/c9l;

    .line 196
    .line 197
    const/4 v4, 0x7

    .line 198
    invoke-direct {v0, p1, p0, v4}, La/c9l;-><init>(Landroid/content/Context;La/d9l;B)V

    .line 199
    .line 200
    .line 201
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    iput-object v0, p0, La/d9l;->q:La/a8z;

    .line 206
    .line 207
    new-instance v0, La/c9l;

    .line 208
    .line 209
    const/16 v4, 0x8

    .line 210
    .line 211
    invoke-direct {v0, p1, p0, v4}, La/c9l;-><init>(Landroid/content/Context;La/d9l;B)V

    .line 212
    .line 213
    .line 214
    invoke-static {v2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    iput-object p1, p0, La/d9l;->r:La/a8z;

    .line 219
    .line 220
    new-instance p1, La/l7l;

    .line 221
    .line 222
    invoke-direct {p1, p0}, La/l7l;-><init>(La/d9l;)V

    .line 223
    .line 224
    .line 225
    iput-object p1, p0, La/d9l;->t:La/l7l;

    .line 226
    .line 227
    new-instance p1, La/x23;

    .line 228
    .line 229
    invoke-direct {p0}, La/d9l;->getMapImageView()Landroid/widget/ImageView;

    .line 230
    .line 231
    .line 232
    move-result-object v0

    .line 233
    invoke-direct {p1, v0}, La/x23;-><init>(Landroid/widget/ImageView;)V

    .line 234
    .line 235
    .line 236
    iput-object p1, p0, La/d9l;->u:La/x23;

    .line 237
    .line 238
    iput-boolean v3, p0, La/d9l;->v:Z

    .line 239
    .line 240
    iput-boolean v3, p0, La/d9l;->w:Z

    .line 241
    .line 242
    invoke-virtual {p0, v1}, Landroid/view/View;->setLayoutDirection(I)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0, v1}, Landroid/view/View;->setWillNotDraw(Z)V

    .line 246
    .line 247
    .line 248
    return-void
.end method

.method public static final b(La/d9l;)Lkotlin/Unit;
    .locals 2

    .line 1
    invoke-direct {p0}, La/d9l;->getAegisTextView()La/j8l;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/16 v1, 0x8

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, La/d9l;->t:La/l7l;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    iput-boolean v0, p0, La/l7l;->q:Z

    .line 14
    .line 15
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 16
    .line 17
    return-object p0
.end method

.method private final getAegisTextView()La/j8l;
    .locals 0

    .line 1
    iget-object p0, p0, La/d9l;->l:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/j8l;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getDireSideTextView()La/o7l;
    .locals 0

    .line 1
    iget-object p0, p0, La/d9l;->k:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/o7l;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getDireTeamIcon()Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, La/d9l;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/ImageView;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getMapImageView()Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, La/d9l;->r:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/ImageView;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getNetWorthTextView()La/j8l;
    .locals 0

    .line 1
    iget-object p0, p0, La/d9l;->m:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/j8l;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getRadiantSideTextView()La/o7l;
    .locals 0

    .line 1
    iget-object p0, p0, La/d9l;->j:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/o7l;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getRadiantTeamIcon()Landroid/widget/ImageView;
    .locals 0

    .line 1
    iget-object p0, p0, La/d9l;->p:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/widget/ImageView;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getRoshanTextView()La/j8l;
    .locals 0

    .line 1
    iget-object p0, p0, La/d9l;->o:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/j8l;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getTormentorTextView()La/j8l;
    .locals 0

    .line 1
    iget-object p0, p0, La/d9l;->n:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, La/j8l;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final a(La/q8l;La/vne;)V
    .locals 10

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p1, La/q8l;->b:Z

    .line 5
    .line 6
    iput-boolean v0, p0, La/d9l;->v:Z

    .line 7
    .line 8
    invoke-direct {p0}, La/d9l;->getAegisTextView()La/j8l;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-wide v3, p1, La/q8l;->a:J

    .line 13
    .line 14
    new-instance v8, La/ucj;

    .line 15
    .line 16
    const/16 v2, 0x15

    .line 17
    .line 18
    invoke-direct {v8, p0, v2}, La/ucj;-><init>(Ljava/lang/Object;B)V

    .line 19
    .line 20
    .line 21
    const/16 v9, 0x18

    .line 22
    .line 23
    const v2, 0x7f080498

    .line 24
    .line 25
    .line 26
    const/4 v6, 0x0

    .line 27
    const/4 v7, 0x0

    .line 28
    move-object v5, p2

    .line 29
    invoke-static/range {v1 .. v9}, La/j8l;->l(La/j8l;IJLa/vne;IFLa/ucj;I)V

    .line 30
    .line 31
    .line 32
    invoke-direct {p0}, La/d9l;->getAegisTextView()La/j8l;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iget-boolean p1, p1, La/q8l;->c:Z

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    const/4 v1, 0x0

    .line 41
    goto :goto_0

    .line 42
    :cond_0
    const/16 v1, 0x8

    .line 43
    .line 44
    :goto_0
    invoke-virtual {p2, v1}, Landroid/view/View;->setVisibility(I)V

    .line 45
    .line 46
    .line 47
    iget-object p0, p0, La/d9l;->t:La/l7l;

    .line 48
    .line 49
    iput-boolean p1, p0, La/l7l;->q:Z

    .line 50
    .line 51
    iput-boolean v0, p0, La/l7l;->m:Z

    .line 52
    .line 53
    return-void
.end method

.method public final c(La/z8l;La/vne;)V
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/d9l;->getRoshanTextView()La/j8l;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-wide v2, p1, La/z8l;->a:J

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    const/16 v8, 0x38

    .line 12
    .line 13
    const v1, 0x7f0804ad

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    move-object v4, p2

    .line 19
    invoke-static/range {v0 .. v8}, La/j8l;->l(La/j8l;IJLa/vne;IFLa/ucj;I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, La/d9l;->getRoshanTextView()La/j8l;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iget-boolean p1, p1, La/z8l;->b:Z

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/16 v0, 0x8

    .line 33
    .line 34
    :goto_0
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, La/d9l;->t:La/l7l;

    .line 38
    .line 39
    iput-boolean p1, p0, La/l7l;->r:Z

    .line 40
    .line 41
    return-void
.end method

.method public final d(La/a9l;La/vne;)V
    .locals 9

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/d9l;->getTormentorTextView()La/j8l;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-wide v2, p1, La/a9l;->a:J

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    const/16 v8, 0x38

    .line 12
    .line 13
    const v1, 0x7f0804b8

    .line 14
    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    move-object v4, p2

    .line 19
    invoke-static/range {v0 .. v8}, La/j8l;->l(La/j8l;IJLa/vne;IFLa/ucj;I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, La/d9l;->getTormentorTextView()La/j8l;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iget-boolean p1, p1, La/a9l;->b:Z

    .line 27
    .line 28
    if-eqz p1, :cond_0

    .line 29
    .line 30
    const/4 v0, 0x0

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    const/16 v0, 0x8

    .line 33
    .line 34
    :goto_0
    invoke-virtual {p2, v0}, Landroid/view/View;->setVisibility(I)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p0, La/d9l;->t:La/l7l;

    .line 38
    .line 39
    iput-boolean p1, p0, La/l7l;->p:Z

    .line 40
    .line 41
    return-void
.end method

.method public final onDraw(Landroid/graphics/Canvas;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-object/from16 v1, p0

    .line 7
    .line 8
    iget-object v1, v1, La/d9l;->t:La/l7l;

    .line 9
    .line 10
    iget-object v2, v1, La/l7l;->a:La/d9l;

    .line 11
    .line 12
    iget-object v3, v1, La/l7l;->u:La/a8z;

    .line 13
    .line 14
    iget v4, v1, La/l7l;->g:I

    .line 15
    .line 16
    iget v5, v1, La/l7l;->d:F

    .line 17
    .line 18
    iget v6, v1, La/l7l;->c:I

    .line 19
    .line 20
    iget-object v7, v1, La/l7l;->s:Landroid/graphics/RectF;

    .line 21
    .line 22
    iget v8, v1, La/l7l;->l:I

    .line 23
    .line 24
    int-to-float v8, v8

    .line 25
    iget v9, v1, La/l7l;->f:I

    .line 26
    .line 27
    int-to-float v10, v9

    .line 28
    const/4 v11, 0x0

    .line 29
    invoke-virtual {v7, v11, v11, v8, v10}, Landroid/graphics/RectF;->set(FFFF)V

    .line 30
    .line 31
    .line 32
    iget v8, v1, La/l7l;->e:F

    .line 33
    .line 34
    invoke-virtual {v1}, La/l7l;->b()Landroid/graphics/Paint;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    invoke-virtual {v0, v7, v8, v8, v10}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 39
    .line 40
    .line 41
    iget v10, v1, La/l7l;->k:I

    .line 42
    .line 43
    int-to-float v12, v10

    .line 44
    add-float/2addr v12, v11

    .line 45
    iget v13, v1, La/l7l;->l:I

    .line 46
    .line 47
    add-int/2addr v13, v10

    .line 48
    int-to-float v10, v13

    .line 49
    int-to-float v13, v9

    .line 50
    invoke-virtual {v7, v12, v11, v10, v13}, Landroid/graphics/RectF;->set(FFFF)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, La/l7l;->b()Landroid/graphics/Paint;

    .line 54
    .line 55
    .line 56
    move-result-object v10

    .line 57
    invoke-virtual {v0, v7, v8, v8, v10}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 58
    .line 59
    .line 60
    iget v10, v1, La/l7l;->l:I

    .line 61
    .line 62
    iget v12, v1, La/l7l;->b:I

    .line 63
    .line 64
    add-int/2addr v10, v12

    .line 65
    int-to-float v13, v10

    .line 66
    add-int/2addr v10, v9

    .line 67
    int-to-float v10, v10

    .line 68
    int-to-float v14, v9

    .line 69
    invoke-virtual {v7, v13, v11, v10, v14}, Landroid/graphics/RectF;->set(FFFF)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1}, La/l7l;->b()Landroid/graphics/Paint;

    .line 73
    .line 74
    .line 75
    move-result-object v10

    .line 76
    invoke-virtual {v0, v7, v8, v8, v10}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 77
    .line 78
    .line 79
    const/4 v8, 0x0

    .line 80
    invoke-virtual {v1, v8, v0}, La/l7l;->a(ILandroid/graphics/Canvas;)V

    .line 81
    .line 82
    .line 83
    iget v10, v1, La/l7l;->k:I

    .line 84
    .line 85
    invoke-virtual {v1, v10, v0}, La/l7l;->a(ILandroid/graphics/Canvas;)V

    .line 86
    .line 87
    .line 88
    iget-boolean v10, v1, La/l7l;->o:Z

    .line 89
    .line 90
    const/4 v11, 0x2

    .line 91
    if-nez v10, :cond_0

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_0
    iget-boolean v10, v1, La/l7l;->n:Z

    .line 95
    .line 96
    if-eqz v10, :cond_1

    .line 97
    .line 98
    move v10, v8

    .line 99
    goto :goto_0

    .line 100
    :cond_1
    iget v10, v1, La/l7l;->k:I

    .line 101
    .line 102
    :goto_0
    add-int v13, v6, v10

    .line 103
    .line 104
    int-to-float v13, v13

    .line 105
    iget v14, v1, La/l7l;->h:I

    .line 106
    .line 107
    add-int v15, v14, v4

    .line 108
    .line 109
    add-int/2addr v15, v6

    .line 110
    int-to-float v15, v15

    .line 111
    iget v8, v1, La/l7l;->l:I

    .line 112
    .line 113
    sub-int/2addr v8, v6

    .line 114
    add-int/2addr v8, v10

    .line 115
    int-to-float v8, v8

    .line 116
    invoke-static {v4, v11, v14, v6}, La/vqd;->a(IIII)I

    .line 117
    .line 118
    .line 119
    move-result v10

    .line 120
    int-to-float v10, v10

    .line 121
    invoke-virtual {v7, v13, v15, v8, v10}, Landroid/graphics/RectF;->set(FFFF)V

    .line 122
    .line 123
    .line 124
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    move-result-object v8

    .line 128
    check-cast v8, Landroid/graphics/Paint;

    .line 129
    .line 130
    invoke-virtual {v0, v7, v5, v5, v8}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 131
    .line 132
    .line 133
    :goto_1
    iget-boolean v8, v1, La/l7l;->p:Z

    .line 134
    .line 135
    if-nez v8, :cond_2

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_2
    iget-boolean v8, v1, La/l7l;->r:Z

    .line 139
    .line 140
    if-eqz v8, :cond_3

    .line 141
    .line 142
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 143
    .line 144
    .line 145
    move-result v8

    .line 146
    div-int/2addr v8, v11

    .line 147
    add-int/2addr v8, v12

    .line 148
    int-to-float v8, v8

    .line 149
    add-int v10, v9, v12

    .line 150
    .line 151
    int-to-float v10, v10

    .line 152
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 153
    .line 154
    .line 155
    move-result v13

    .line 156
    div-int/2addr v13, v11

    .line 157
    add-int/2addr v13, v6

    .line 158
    iget v14, v1, La/l7l;->j:I

    .line 159
    .line 160
    invoke-static {v13, v14, v6, v12}, La/hne;->D(IIII)I

    .line 161
    .line 162
    .line 163
    move-result v13

    .line 164
    int-to-float v13, v13

    .line 165
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 166
    .line 167
    .line 168
    move-result v14

    .line 169
    int-to-float v14, v14

    .line 170
    invoke-virtual {v7, v8, v10, v13, v14}, Landroid/graphics/RectF;->set(FFFF)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {v1}, La/l7l;->b()Landroid/graphics/Paint;

    .line 174
    .line 175
    .line 176
    move-result-object v8

    .line 177
    invoke-virtual {v0, v7, v5, v5, v8}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 178
    .line 179
    .line 180
    goto :goto_2

    .line 181
    :cond_3
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 182
    .line 183
    .line 184
    move-result v8

    .line 185
    div-int/2addr v8, v11

    .line 186
    iget v10, v1, La/l7l;->j:I

    .line 187
    .line 188
    div-int/2addr v10, v11

    .line 189
    sub-int/2addr v8, v10

    .line 190
    sub-int/2addr v8, v6

    .line 191
    int-to-float v8, v8

    .line 192
    add-int v10, v9, v12

    .line 193
    .line 194
    int-to-float v10, v10

    .line 195
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 196
    .line 197
    .line 198
    move-result v13

    .line 199
    div-int/2addr v13, v11

    .line 200
    iget v14, v1, La/l7l;->j:I

    .line 201
    .line 202
    div-int/2addr v14, v11

    .line 203
    add-int/2addr v14, v13

    .line 204
    add-int/2addr v14, v6

    .line 205
    int-to-float v13, v14

    .line 206
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 207
    .line 208
    .line 209
    move-result v14

    .line 210
    int-to-float v14, v14

    .line 211
    invoke-virtual {v7, v8, v10, v13, v14}, Landroid/graphics/RectF;->set(FFFF)V

    .line 212
    .line 213
    .line 214
    invoke-virtual {v1}, La/l7l;->b()Landroid/graphics/Paint;

    .line 215
    .line 216
    .line 217
    move-result-object v8

    .line 218
    invoke-virtual {v0, v7, v5, v5, v8}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 219
    .line 220
    .line 221
    :goto_2
    iget-boolean v8, v1, La/l7l;->q:Z

    .line 222
    .line 223
    if-nez v8, :cond_4

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_4
    iget-boolean v8, v1, La/l7l;->m:Z

    .line 227
    .line 228
    if-eqz v8, :cond_5

    .line 229
    .line 230
    const/4 v8, 0x0

    .line 231
    goto :goto_3

    .line 232
    :cond_5
    iget v8, v1, La/l7l;->k:I

    .line 233
    .line 234
    :goto_3
    add-int v10, v6, v8

    .line 235
    .line 236
    int-to-float v10, v10

    .line 237
    sub-int v13, v9, v6

    .line 238
    .line 239
    sub-int v4, v13, v4

    .line 240
    .line 241
    int-to-float v4, v4

    .line 242
    iget v14, v1, La/l7l;->l:I

    .line 243
    .line 244
    sub-int/2addr v14, v6

    .line 245
    add-int/2addr v14, v8

    .line 246
    int-to-float v8, v14

    .line 247
    int-to-float v13, v13

    .line 248
    invoke-virtual {v7, v10, v4, v8, v13}, Landroid/graphics/RectF;->set(FFFF)V

    .line 249
    .line 250
    .line 251
    invoke-interface {v3}, La/a8z;->getValue()Ljava/lang/Object;

    .line 252
    .line 253
    .line 254
    move-result-object v3

    .line 255
    check-cast v3, Landroid/graphics/Paint;

    .line 256
    .line 257
    invoke-virtual {v0, v7, v5, v5, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 258
    .line 259
    .line 260
    :goto_4
    iget-boolean v3, v1, La/l7l;->r:Z

    .line 261
    .line 262
    if-nez v3, :cond_6

    .line 263
    .line 264
    return-void

    .line 265
    :cond_6
    iget-boolean v3, v1, La/l7l;->p:Z

    .line 266
    .line 267
    if-eqz v3, :cond_7

    .line 268
    .line 269
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 270
    .line 271
    .line 272
    move-result v3

    .line 273
    div-int/2addr v3, v11

    .line 274
    iget v4, v1, La/l7l;->i:I

    .line 275
    .line 276
    sub-int/2addr v3, v4

    .line 277
    sub-int/2addr v3, v6

    .line 278
    sub-int/2addr v3, v6

    .line 279
    sub-int/2addr v3, v12

    .line 280
    int-to-float v3, v3

    .line 281
    add-int/2addr v9, v12

    .line 282
    int-to-float v4, v9

    .line 283
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 284
    .line 285
    .line 286
    move-result v6

    .line 287
    div-int/2addr v6, v11

    .line 288
    sub-int/2addr v6, v12

    .line 289
    int-to-float v6, v6

    .line 290
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 291
    .line 292
    .line 293
    move-result v2

    .line 294
    int-to-float v2, v2

    .line 295
    invoke-virtual {v7, v3, v4, v6, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1}, La/l7l;->b()Landroid/graphics/Paint;

    .line 299
    .line 300
    .line 301
    move-result-object v1

    .line 302
    invoke-virtual {v0, v7, v5, v5, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 303
    .line 304
    .line 305
    return-void

    .line 306
    :cond_7
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 307
    .line 308
    .line 309
    move-result v3

    .line 310
    div-int/2addr v3, v11

    .line 311
    iget v4, v1, La/l7l;->i:I

    .line 312
    .line 313
    div-int/2addr v4, v11

    .line 314
    sub-int/2addr v3, v4

    .line 315
    sub-int/2addr v3, v6

    .line 316
    int-to-float v3, v3

    .line 317
    add-int/2addr v9, v12

    .line 318
    int-to-float v4, v9

    .line 319
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 320
    .line 321
    .line 322
    move-result v8

    .line 323
    div-int/2addr v8, v11

    .line 324
    iget v9, v1, La/l7l;->i:I

    .line 325
    .line 326
    div-int/2addr v9, v11

    .line 327
    add-int/2addr v9, v8

    .line 328
    add-int/2addr v9, v6

    .line 329
    int-to-float v6, v9

    .line 330
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 331
    .line 332
    .line 333
    move-result v2

    .line 334
    int-to-float v2, v2

    .line 335
    invoke-virtual {v7, v3, v4, v6, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 336
    .line 337
    .line 338
    invoke-virtual {v1}, La/l7l;->b()Landroid/graphics/Paint;

    .line 339
    .line 340
    .line 341
    move-result-object v1

    .line 342
    invoke-virtual {v0, v7, v5, v5, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 343
    .line 344
    .line 345
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 6

    .line 1
    invoke-direct {p0}, La/d9l;->getRoshanTextView()La/j8l;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 6
    .line 7
    .line 8
    move-result p1

    .line 9
    invoke-direct {p0}, La/d9l;->getTormentorTextView()La/j8l;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-virtual {p2}, Landroid/view/View;->getMeasuredWidth()I

    .line 14
    .line 15
    .line 16
    move-result p2

    .line 17
    iget-object p3, p0, La/d9l;->t:La/l7l;

    .line 18
    .line 19
    iput p1, p3, La/l7l;->i:I

    .line 20
    .line 21
    iput p2, p3, La/l7l;->j:I

    .line 22
    .line 23
    iget-object p1, p3, La/l7l;->a:La/d9l;

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iget p2, p3, La/l7l;->f:I

    .line 30
    .line 31
    sub-int/2addr p1, p2

    .line 32
    const/4 p4, 0x2

    .line 33
    div-int/2addr p1, p4

    .line 34
    iget p5, p3, La/l7l;->b:I

    .line 35
    .line 36
    sub-int/2addr p1, p5

    .line 37
    iput p1, p3, La/l7l;->l:I

    .line 38
    .line 39
    invoke-static {p5, p4, p2, p1}, La/vqd;->a(IIII)I

    .line 40
    .line 41
    .line 42
    move-result p1

    .line 43
    iput p1, p3, La/l7l;->k:I

    .line 44
    .line 45
    iget p1, p0, La/d9l;->h:I

    .line 46
    .line 47
    mul-int/lit8 p2, p1, 0x2

    .line 48
    .line 49
    iget p3, p0, La/d9l;->a:I

    .line 50
    .line 51
    add-int/2addr p2, p3

    .line 52
    iget p5, p0, La/d9l;->e:I

    .line 53
    .line 54
    add-int/2addr p2, p5

    .line 55
    iget-boolean p5, p0, La/d9l;->v:Z

    .line 56
    .line 57
    const/4 v0, 0x0

    .line 58
    if-eqz p5, :cond_0

    .line 59
    .line 60
    move p5, v0

    .line 61
    goto :goto_0

    .line 62
    :cond_0
    move p5, p2

    .line 63
    :goto_0
    iget-boolean v1, p0, La/d9l;->w:Z

    .line 64
    .line 65
    if-eqz v1, :cond_1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    move v0, p2

    .line 69
    :goto_1
    invoke-direct {p0}, La/d9l;->getRadiantSideTextView()La/o7l;

    .line 70
    .line 71
    .line 72
    move-result-object v1

    .line 73
    iget v2, p0, La/d9l;->e:I

    .line 74
    .line 75
    invoke-direct {p0}, La/d9l;->getRadiantSideTextView()La/o7l;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    sub-int/2addr v2, v3

    .line 84
    div-int/2addr v2, p4

    .line 85
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 86
    .line 87
    .line 88
    move-result v3

    .line 89
    invoke-direct {p0}, La/d9l;->getRadiantSideTextView()La/o7l;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 94
    .line 95
    .line 96
    move-result v4

    .line 97
    iget v5, p0, La/d9l;->b:I

    .line 98
    .line 99
    add-int/2addr v4, v5

    .line 100
    div-int/2addr v4, p4

    .line 101
    sub-int/2addr v3, v4

    .line 102
    invoke-static {v1, v2, v3}, La/bcm0;->s(Landroid/view/View;II)V

    .line 103
    .line 104
    .line 105
    invoke-direct {p0}, La/d9l;->getDireSideTextView()La/o7l;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    iget v2, p0, La/d9l;->e:I

    .line 110
    .line 111
    invoke-direct {p0}, La/d9l;->getDireSideTextView()La/o7l;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 116
    .line 117
    .line 118
    move-result v3

    .line 119
    sub-int/2addr v2, v3

    .line 120
    div-int/2addr v2, p4

    .line 121
    add-int/2addr v2, p2

    .line 122
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    invoke-direct {p0}, La/d9l;->getDireSideTextView()La/o7l;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v4}, Landroid/view/View;->getMeasuredHeight()I

    .line 131
    .line 132
    .line 133
    move-result v4

    .line 134
    add-int/2addr v4, v5

    .line 135
    div-int/2addr v4, p4

    .line 136
    sub-int/2addr v3, v4

    .line 137
    invoke-static {v1, v2, v3}, La/bcm0;->s(Landroid/view/View;II)V

    .line 138
    .line 139
    .line 140
    invoke-direct {p0}, La/d9l;->getAegisTextView()La/j8l;

    .line 141
    .line 142
    .line 143
    move-result-object v1

    .line 144
    iget v2, p0, La/d9l;->e:I

    .line 145
    .line 146
    invoke-direct {p0}, La/d9l;->getAegisTextView()La/j8l;

    .line 147
    .line 148
    .line 149
    move-result-object v3

    .line 150
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredWidth()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    sub-int/2addr v2, v3

    .line 155
    div-int/2addr v2, p4

    .line 156
    add-int/2addr v2, p5

    .line 157
    iget p5, p0, La/d9l;->i:I

    .line 158
    .line 159
    sub-int/2addr p3, p5

    .line 160
    invoke-direct {p0}, La/d9l;->getAegisTextView()La/j8l;

    .line 161
    .line 162
    .line 163
    move-result-object v3

    .line 164
    invoke-virtual {v3}, Landroid/view/View;->getMeasuredHeight()I

    .line 165
    .line 166
    .line 167
    move-result v3

    .line 168
    iget v4, p0, La/d9l;->c:I

    .line 169
    .line 170
    add-int/2addr v3, v4

    .line 171
    div-int/2addr v3, p4

    .line 172
    sub-int/2addr p3, v3

    .line 173
    invoke-static {v1, v2, p3}, La/bcm0;->s(Landroid/view/View;II)V

    .line 174
    .line 175
    .line 176
    invoke-direct {p0}, La/d9l;->getNetWorthTextView()La/j8l;

    .line 177
    .line 178
    .line 179
    move-result-object p3

    .line 180
    iget v1, p0, La/d9l;->e:I

    .line 181
    .line 182
    invoke-direct {p0}, La/d9l;->getNetWorthTextView()La/j8l;

    .line 183
    .line 184
    .line 185
    move-result-object v2

    .line 186
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 187
    .line 188
    .line 189
    move-result v2

    .line 190
    sub-int/2addr v1, v2

    .line 191
    div-int/2addr v1, p4

    .line 192
    add-int/2addr v1, v0

    .line 193
    iget v0, p0, La/d9l;->d:I

    .line 194
    .line 195
    add-int/2addr v0, v4

    .line 196
    add-int/2addr v0, p5

    .line 197
    invoke-direct {p0}, La/d9l;->getNetWorthTextView()La/j8l;

    .line 198
    .line 199
    .line 200
    move-result-object v2

    .line 201
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 202
    .line 203
    .line 204
    move-result v2

    .line 205
    sub-int/2addr v4, v2

    .line 206
    div-int/2addr v4, p4

    .line 207
    add-int/2addr v4, v0

    .line 208
    invoke-static {p3, v1, v4}, La/bcm0;->s(Landroid/view/View;II)V

    .line 209
    .line 210
    .line 211
    invoke-direct {p0}, La/d9l;->getRoshanTextView()La/j8l;

    .line 212
    .line 213
    .line 214
    move-result-object p3

    .line 215
    invoke-direct {p0}, La/d9l;->getTormentorTextView()La/j8l;

    .line 216
    .line 217
    .line 218
    move-result-object v0

    .line 219
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 220
    .line 221
    .line 222
    move-result v0

    .line 223
    if-nez v0, :cond_2

    .line 224
    .line 225
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 226
    .line 227
    .line 228
    move-result v0

    .line 229
    div-int/2addr v0, p4

    .line 230
    invoke-direct {p0}, La/d9l;->getRoshanTextView()La/j8l;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 235
    .line 236
    .line 237
    move-result v1

    .line 238
    sub-int/2addr v0, v1

    .line 239
    sub-int/2addr v0, p1

    .line 240
    sub-int/2addr v0, p5

    .line 241
    goto :goto_2

    .line 242
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 243
    .line 244
    .line 245
    move-result v0

    .line 246
    invoke-direct {p0}, La/d9l;->getRoshanTextView()La/j8l;

    .line 247
    .line 248
    .line 249
    move-result-object v1

    .line 250
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 251
    .line 252
    .line 253
    move-result v1

    .line 254
    sub-int/2addr v0, v1

    .line 255
    div-int/2addr v0, p4

    .line 256
    :goto_2
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 257
    .line 258
    .line 259
    move-result v1

    .line 260
    invoke-direct {p0}, La/d9l;->getRoshanTextView()La/j8l;

    .line 261
    .line 262
    .line 263
    move-result-object v2

    .line 264
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 265
    .line 266
    .line 267
    move-result v2

    .line 268
    add-int/2addr v2, v5

    .line 269
    div-int/2addr v2, p4

    .line 270
    sub-int/2addr v1, v2

    .line 271
    invoke-static {p3, v0, v1}, La/bcm0;->s(Landroid/view/View;II)V

    .line 272
    .line 273
    .line 274
    invoke-direct {p0}, La/d9l;->getTormentorTextView()La/j8l;

    .line 275
    .line 276
    .line 277
    move-result-object p3

    .line 278
    invoke-direct {p0}, La/d9l;->getRoshanTextView()La/j8l;

    .line 279
    .line 280
    .line 281
    move-result-object v0

    .line 282
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 283
    .line 284
    .line 285
    move-result v0

    .line 286
    if-nez v0, :cond_3

    .line 287
    .line 288
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 289
    .line 290
    .line 291
    move-result v0

    .line 292
    div-int/2addr v0, p4

    .line 293
    add-int/2addr v0, p5

    .line 294
    add-int/2addr v0, p1

    .line 295
    goto :goto_3

    .line 296
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 297
    .line 298
    .line 299
    move-result v0

    .line 300
    invoke-direct {p0}, La/d9l;->getTormentorTextView()La/j8l;

    .line 301
    .line 302
    .line 303
    move-result-object v1

    .line 304
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 305
    .line 306
    .line 307
    move-result v1

    .line 308
    sub-int/2addr v0, v1

    .line 309
    div-int/2addr v0, p4

    .line 310
    :goto_3
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredHeight()I

    .line 311
    .line 312
    .line 313
    move-result v1

    .line 314
    invoke-direct {p0}, La/d9l;->getTormentorTextView()La/j8l;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredHeight()I

    .line 319
    .line 320
    .line 321
    move-result v2

    .line 322
    add-int/2addr v2, v5

    .line 323
    div-int/2addr v2, p4

    .line 324
    sub-int/2addr v1, v2

    .line 325
    invoke-static {p3, v0, v1}, La/bcm0;->s(Landroid/view/View;II)V

    .line 326
    .line 327
    .line 328
    invoke-direct {p0}, La/d9l;->getRadiantTeamIcon()Landroid/widget/ImageView;

    .line 329
    .line 330
    .line 331
    move-result-object p3

    .line 332
    iget v0, p0, La/d9l;->e:I

    .line 333
    .line 334
    invoke-direct {p0}, La/d9l;->getRadiantTeamIcon()Landroid/widget/ImageView;

    .line 335
    .line 336
    .line 337
    move-result-object v1

    .line 338
    invoke-virtual {v1}, Landroid/view/View;->getMeasuredWidth()I

    .line 339
    .line 340
    .line 341
    move-result v1

    .line 342
    sub-int/2addr v0, v1

    .line 343
    div-int/2addr v0, p4

    .line 344
    iget v1, p0, La/d9l;->g:I

    .line 345
    .line 346
    invoke-static {p3, v0, v1}, La/bcm0;->s(Landroid/view/View;II)V

    .line 347
    .line 348
    .line 349
    invoke-direct {p0}, La/d9l;->getDireTeamIcon()Landroid/widget/ImageView;

    .line 350
    .line 351
    .line 352
    move-result-object p3

    .line 353
    iget v0, p0, La/d9l;->e:I

    .line 354
    .line 355
    invoke-direct {p0}, La/d9l;->getDireTeamIcon()Landroid/widget/ImageView;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    invoke-virtual {v2}, Landroid/view/View;->getMeasuredWidth()I

    .line 360
    .line 361
    .line 362
    move-result v2

    .line 363
    sub-int/2addr v0, v2

    .line 364
    div-int/2addr v0, p4

    .line 365
    add-int/2addr v0, p2

    .line 366
    invoke-static {p3, v0, v1}, La/bcm0;->s(Landroid/view/View;II)V

    .line 367
    .line 368
    .line 369
    invoke-direct {p0}, La/d9l;->getMapImageView()Landroid/widget/ImageView;

    .line 370
    .line 371
    .line 372
    move-result-object p2

    .line 373
    iget p0, p0, La/d9l;->e:I

    .line 374
    .line 375
    add-int/2addr p0, p1

    .line 376
    add-int/2addr p0, p5

    .line 377
    invoke-static {p2, p0, p5}, La/bcm0;->s(Landroid/view/View;II)V

    .line 378
    .line 379
    .line 380
    return-void
.end method

.method public final onMeasure(II)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getMeasuredWidth()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget v1, p0, La/d9l;->a:I

    .line 6
    .line 7
    sub-int/2addr v0, v1

    .line 8
    div-int/lit8 v0, v0, 0x2

    .line 9
    .line 10
    iget v2, p0, La/d9l;->h:I

    .line 11
    .line 12
    sub-int/2addr v0, v2

    .line 13
    iput v0, p0, La/d9l;->e:I

    .line 14
    .line 15
    iget v3, p0, La/d9l;->i:I

    .line 16
    .line 17
    mul-int/lit8 v3, v3, 0x2

    .line 18
    .line 19
    sub-int/2addr v0, v3

    .line 20
    sub-int/2addr v0, v2

    .line 21
    iput v0, p0, La/d9l;->s:I

    .line 22
    .line 23
    invoke-direct {p0}, La/d9l;->getRadiantSideTextView()La/o7l;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0}, La/bcm0;->u(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, La/d9l;->getDireSideTextView()La/o7l;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {v0}, La/bcm0;->u(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    invoke-direct {p0}, La/d9l;->getAegisTextView()La/j8l;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget v2, p0, La/d9l;->s:I

    .line 42
    .line 43
    const/high16 v4, -0x80000000

    .line 44
    .line 45
    invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const/4 v5, 0x0

    .line 50
    invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    invoke-virtual {v0, v2, v6}, Landroid/view/View;->measure(II)V

    .line 55
    .line 56
    .line 57
    invoke-direct {p0}, La/d9l;->getNetWorthTextView()La/j8l;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    iget v2, p0, La/d9l;->s:I

    .line 62
    .line 63
    invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    invoke-virtual {v0, v2, v6}, Landroid/view/View;->measure(II)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0}, La/d9l;->getRadiantTeamIcon()Landroid/widget/ImageView;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget v2, p0, La/d9l;->f:I

    .line 79
    .line 80
    invoke-static {v0, v2, v2}, La/bcm0;->t(Landroid/view/View;II)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p0}, La/d9l;->getDireTeamIcon()Landroid/widget/ImageView;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-static {v0, v2, v2}, La/bcm0;->t(Landroid/view/View;II)V

    .line 88
    .line 89
    .line 90
    invoke-direct {p0}, La/d9l;->getTormentorTextView()La/j8l;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    iget v2, p0, La/d9l;->s:I

    .line 95
    .line 96
    invoke-static {v2, v4}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    invoke-static {v5, v5}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 101
    .line 102
    .line 103
    move-result v4

    .line 104
    invoke-virtual {v0, v2, v4}, Landroid/view/View;->measure(II)V

    .line 105
    .line 106
    .line 107
    invoke-direct {p0}, La/d9l;->getRoshanTextView()La/j8l;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    invoke-static {v0}, La/bcm0;->u(Landroid/view/View;)V

    .line 112
    .line 113
    .line 114
    invoke-direct {p0}, La/d9l;->getMapImageView()Landroid/widget/ImageView;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    sub-int/2addr v1, v3

    .line 119
    invoke-static {v0, v1, v1}, La/bcm0;->t(Landroid/view/View;II)V

    .line 120
    .line 121
    .line 122
    iget-object v0, p0, La/d9l;->u:La/x23;

    .line 123
    .line 124
    invoke-virtual {v0}, La/x23;->e()V

    .line 125
    .line 126
    .line 127
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 128
    .line 129
    .line 130
    move-result p1

    .line 131
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 132
    .line 133
    .line 134
    move-result p2

    .line 135
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 136
    .line 137
    .line 138
    return-void
.end method

.method public final setDireSide(La/r8l;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/d9l;->getDireSideTextView()La/o7l;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p1, p1, La/r8l;->a:Ljava/lang/String;

    .line 9
    .line 10
    iget v0, p0, La/o7l;->j:I

    .line 11
    .line 12
    iget v1, p0, La/o7l;->i:F

    .line 13
    .line 14
    const v2, 0x7f0804a0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1, v2, v0, p1}, La/o7l;->j(FIILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setDireTeamIcon(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 5
    .line 6
    invoke-direct {p0}, La/d9l;->getDireTeamIcon()Landroid/widget/ImageView;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const v0, 0x7f080cf7

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    invoke-static {p0, p1, v0, v1}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final setMapBuildings(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "La/a3l;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/d9l;->x:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v0, La/k0l;

    .line 9
    .line 10
    const/4 v6, 0x0

    .line 11
    const/16 v7, 0x9

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    const-class v3, La/d9l;

    .line 15
    .line 16
    const-string v4, "addView"

    .line 17
    .line 18
    const-string v5, "addView(Landroid/view/View;)V"

    .line 19
    .line 20
    move-object v2, p0

    .line 21
    invoke-direct/range {v0 .. v7}, La/k0l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 22
    .line 23
    .line 24
    move-object v8, v0

    .line 25
    new-instance v0, La/k0l;

    .line 26
    .line 27
    const/16 v7, 0xa

    .line 28
    .line 29
    const-string v4, "removeView"

    .line 30
    .line 31
    const-string v5, "removeView(Landroid/view/View;)V"

    .line 32
    .line 33
    invoke-direct/range {v0 .. v7}, La/k0l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 34
    .line 35
    .line 36
    iget-object v1, p0, La/d9l;->u:La/x23;

    .line 37
    .line 38
    invoke-virtual {v1, p1, v8, v0}, La/x23;->g(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 39
    .line 40
    .line 41
    :cond_0
    return-void
.end method

.method public final setMapHeroes(Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "La/o5l;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/d9l;->x:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    new-instance v1, La/k0l;

    .line 9
    .line 10
    const/4 v7, 0x0

    .line 11
    const/16 v8, 0xb

    .line 12
    .line 13
    const/4 v2, 0x1

    .line 14
    const-class v4, La/d9l;

    .line 15
    .line 16
    const-string v5, "addView"

    .line 17
    .line 18
    const-string v6, "addView(Landroid/view/View;)V"

    .line 19
    .line 20
    move-object v3, p0

    .line 21
    invoke-direct/range {v1 .. v8}, La/k0l;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 22
    .line 23
    .line 24
    iget-object p0, v3, La/d9l;->u:La/x23;

    .line 25
    .line 26
    invoke-virtual {p0, p1, v1}, La/x23;->h(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    return-void
.end method

.method public final setNetWorth(La/w8l;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p1, La/w8l;->b:Z

    .line 5
    .line 6
    iput-boolean v0, p0, La/d9l;->w:Z

    .line 7
    .line 8
    invoke-direct {p0}, La/d9l;->getNetWorthTextView()La/j8l;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    iget-object v2, p1, La/w8l;->a:Ljava/lang/String;

    .line 13
    .line 14
    iget v3, v1, La/j8l;->j:I

    .line 15
    .line 16
    iget v4, v1, La/j8l;->i:F

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    const/4 v5, 0x0

    .line 22
    invoke-virtual {v1, v5, v4}, Landroidx/appcompat/widget/AppCompatTextView;->setTextSize(IF)V

    .line 23
    .line 24
    .line 25
    const v4, 0x7f0804a4

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, v4, v3}, La/j8l;->j(II)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, La/d9l;->getNetWorthTextView()La/j8l;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    iget-boolean p1, p1, La/w8l;->c:Z

    .line 39
    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_0
    const/16 v5, 0x8

    .line 44
    .line 45
    :goto_0
    invoke-virtual {v1, v5}, Landroid/view/View;->setVisibility(I)V

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, La/d9l;->t:La/l7l;

    .line 49
    .line 50
    iput-boolean p1, p0, La/l7l;->o:Z

    .line 51
    .line 52
    iput-boolean v0, p0, La/l7l;->n:Z

    .line 53
    .line 54
    return-void
.end method

.method public final setRadiantSide(La/x8l;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, La/d9l;->getRadiantSideTextView()La/o7l;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    iget-object p1, p1, La/x8l;->a:Ljava/lang/String;

    .line 9
    .line 10
    iget v0, p0, La/o7l;->j:I

    .line 11
    .line 12
    iget v1, p0, La/o7l;->i:F

    .line 13
    .line 14
    const v2, 0x7f0804ac

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1, v2, v0, p1}, La/o7l;->j(FIILjava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public final setRadiantTeamIcon(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/u0d;->a:Ljava/util/List;

    .line 5
    .line 6
    invoke-direct {p0}, La/d9l;->getRadiantTeamIcon()Landroid/widget/ImageView;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const v0, 0x7f080cf7

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x3

    .line 14
    invoke-static {p0, p1, v0, v1}, La/u0d;->n(Landroid/widget/ImageView;Ljava/lang/String;II)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
