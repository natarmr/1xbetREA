.class public final La/rmb0;
.super La/x1;
.source "SourceFile"


# static fields
.field public static final g1:La/peb0;


# instance fields
.field public final A:La/pz40;

.field public B:Z

.field public final f1:[I

.field public j:Lkotlin/jvm/functions/Function0;

.field public k:La/wmb0;

.field public l:Ljava/lang/String;

.field public final m:Landroid/view/View;

.field public final n:Z

.field public final o:La/mi70;

.field public final p:Landroid/view/WindowManager;

.field public final q:Landroid/view/WindowManager$LayoutParams;

.field public r:La/vmb0;

.field public s:La/k6z;

.field public final t:La/pz40;

.field public final u:La/pz40;

.field public v:La/mkx;

.field public final w:La/zbk;

.field public final x:Landroid/graphics/Rect;

.field public final y:La/pgk0;

.field public z:La/ma3;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, La/peb0;

    .line 2
    .line 3
    const/16 v1, 0x12

    .line 4
    .line 5
    invoke-direct {v0, v1}, La/peb0;-><init>(B)V

    .line 6
    .line 7
    .line 8
    sput-object v0, La/rmb0;->g1:La/peb0;

    .line 9
    .line 10
    return-void
.end method

.method public constructor <init>(Lkotlin/jvm/functions/Function0;La/wmb0;Ljava/lang/String;Landroid/view/View;La/w6k;La/vmb0;Ljava/util/UUID;Z)V
    .locals 3

    .line 1
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1e

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    .line 7
    new-instance v0, La/umb0;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/16 v1, 0x1d

    .line 14
    .line 15
    if-lt v0, v1, :cond_1

    .line 16
    .line 17
    new-instance v0, La/smb0;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    new-instance v0, La/mi70;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 26
    .line 27
    .line 28
    :goto_0
    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x0

    .line 33
    invoke-direct {p0, v1, v2}, La/x1;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 34
    .line 35
    .line 36
    iput-object p1, p0, La/rmb0;->j:Lkotlin/jvm/functions/Function0;

    .line 37
    .line 38
    iput-object p2, p0, La/rmb0;->k:La/wmb0;

    .line 39
    .line 40
    iput-object p3, p0, La/rmb0;->l:Ljava/lang/String;

    .line 41
    .line 42
    iput-object p4, p0, La/rmb0;->m:Landroid/view/View;

    .line 43
    .line 44
    iput-boolean p8, p0, La/rmb0;->n:Z

    .line 45
    .line 46
    iput-object v0, p0, La/rmb0;->o:La/mi70;

    .line 47
    .line 48
    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    const-string p2, "window"

    .line 53
    .line 54
    invoke-virtual {p1, p2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    check-cast p1, Landroid/view/WindowManager;

    .line 62
    .line 63
    iput-object p1, p0, La/rmb0;->p:Landroid/view/WindowManager;

    .line 64
    .line 65
    new-instance p1, Landroid/view/WindowManager$LayoutParams;

    .line 66
    .line 67
    invoke-direct {p1}, Landroid/view/WindowManager$LayoutParams;-><init>()V

    .line 68
    .line 69
    .line 70
    const p2, 0x800033

    .line 71
    .line 72
    .line 73
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->gravity:I

    .line 74
    .line 75
    iget-object p2, p0, La/rmb0;->k:La/wmb0;

    .line 76
    .line 77
    invoke-static {p4}, La/k13;->b(Landroid/view/View;)Z

    .line 78
    .line 79
    .line 80
    move-result p3

    .line 81
    iget-boolean p8, p2, La/wmb0;->b:Z

    .line 82
    .line 83
    iget p2, p2, La/wmb0;->a:I

    .line 84
    .line 85
    if-eqz p8, :cond_2

    .line 86
    .line 87
    if-eqz p3, :cond_2

    .line 88
    .line 89
    or-int/lit16 p2, p2, 0x2000

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_2
    if-eqz p8, :cond_3

    .line 93
    .line 94
    if-nez p3, :cond_3

    .line 95
    .line 96
    and-int/lit16 p2, p2, -0x2001

    .line 97
    .line 98
    :cond_3
    :goto_1
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 99
    .line 100
    iget-object p2, p0, La/rmb0;->k:La/wmb0;

    .line 101
    .line 102
    iget-short p2, p2, La/wmb0;->f:S

    .line 103
    .line 104
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->type:I

    .line 105
    .line 106
    invoke-virtual {p4}, Landroid/view/View;->getApplicationWindowToken()Landroid/os/IBinder;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    iput-object p2, p1, Landroid/view/WindowManager$LayoutParams;->token:Landroid/os/IBinder;

    .line 111
    .line 112
    const/4 p2, -0x2

    .line 113
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 114
    .line 115
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 116
    .line 117
    const/4 p2, -0x3

    .line 118
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->format:I

    .line 119
    .line 120
    invoke-virtual {p4}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 121
    .line 122
    .line 123
    move-result-object p2

    .line 124
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 125
    .line 126
    .line 127
    move-result-object p2

    .line 128
    const p3, 0x7f130695

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2, p3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p2

    .line 135
    invoke-virtual {p1, p2}, Landroid/view/WindowManager$LayoutParams;->setTitle(Ljava/lang/CharSequence;)V

    .line 136
    .line 137
    .line 138
    iput-object p1, p0, La/rmb0;->q:Landroid/view/WindowManager$LayoutParams;

    .line 139
    .line 140
    iput-object p6, p0, La/rmb0;->r:La/vmb0;

    .line 141
    .line 142
    sget-object p1, La/k6z;->a:La/k6z;

    .line 143
    .line 144
    iput-object p1, p0, La/rmb0;->s:La/k6z;

    .line 145
    .line 146
    invoke-static {v2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    iput-object p1, p0, La/rmb0;->t:La/pz40;

    .line 151
    .line 152
    invoke-static {v2}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iput-object p1, p0, La/rmb0;->u:La/pz40;

    .line 157
    .line 158
    new-instance p1, La/ssa0;

    .line 159
    .line 160
    const/4 p2, 0x7

    .line 161
    invoke-direct {p1, p0, p2}, La/ssa0;-><init>(Ljava/lang/Object;B)V

    .line 162
    .line 163
    .line 164
    invoke-static {p1}, La/jgk0;->b(Lkotlin/jvm/functions/Function0;)La/zbk;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    iput-object p1, p0, La/rmb0;->w:La/zbk;

    .line 169
    .line 170
    new-instance p1, Landroid/graphics/Rect;

    .line 171
    .line 172
    invoke-direct {p1}, Landroid/graphics/Rect;-><init>()V

    .line 173
    .line 174
    .line 175
    iput-object p1, p0, La/rmb0;->x:Landroid/graphics/Rect;

    .line 176
    .line 177
    new-instance p1, La/pgk0;

    .line 178
    .line 179
    new-instance p2, La/f13;

    .line 180
    .line 181
    const/4 p3, 0x2

    .line 182
    invoke-direct {p2, p0, p3}, La/f13;-><init>(La/rmb0;B)V

    .line 183
    .line 184
    .line 185
    invoke-direct {p1, p2}, La/pgk0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 186
    .line 187
    .line 188
    iput-object p1, p0, La/rmb0;->y:La/pgk0;

    .line 189
    .line 190
    const p1, 0x1020002

    .line 191
    .line 192
    .line 193
    invoke-virtual {p0, p1}, Landroid/view/View;->setId(I)V

    .line 194
    .line 195
    .line 196
    invoke-static {p4}, La/s7n0;->l(Landroid/view/View;)La/clz;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    const p2, 0x7f0a1426

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    invoke-static {p4}, La/n8n0;->h(Landroid/view/View;)La/riu0;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    const p2, 0x7f0a142a

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 214
    .line 215
    .line 216
    invoke-static {p4}, La/w7n0;->p(Landroid/view/View;)La/i0h0;

    .line 217
    .line 218
    .line 219
    move-result-object p1

    .line 220
    const p2, 0x7f0a1429

    .line 221
    .line 222
    .line 223
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    new-instance p1, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    const-string p2, "Popup:"

    .line 229
    .line 230
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1, p7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object p1

    .line 240
    const p2, 0x7f0a037f

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0, p2, p1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    const/4 p1, 0x0

    .line 247
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 248
    .line 249
    .line 250
    const/high16 p1, 0x41000000    # 8.0f

    .line 251
    .line 252
    invoke-interface {p5, p1}, La/w6k;->w0(F)F

    .line 253
    .line 254
    .line 255
    move-result p1

    .line 256
    invoke-virtual {p0, p1}, Landroid/view/View;->setElevation(F)V

    .line 257
    .line 258
    .line 259
    new-instance p1, La/ruc;

    .line 260
    .line 261
    const/4 p2, 0x3

    .line 262
    invoke-direct {p1, p2}, La/ruc;-><init>(B)V

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0, p1}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 266
    .line 267
    .line 268
    sget-object p1, La/vbw0;->a:La/ugd;

    .line 269
    .line 270
    invoke-static {p1}, Landroidx/compose/runtime/e;->e(Ljava/lang/Object;)La/pz40;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    iput-object p1, p0, La/rmb0;->A:La/pz40;

    .line 275
    .line 276
    new-array p1, p3, [I

    .line 277
    .line 278
    iput-object p1, p0, La/rmb0;->f1:[I

    .line 279
    .line 280
    return-void
.end method

.method private final getContent()Lkotlin/jvm/functions/Function2;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function2<",
            "La/fet;",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object p0, p0, La/rmb0;->A:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, Lkotlin/jvm/functions/Function2;

    .line 10
    .line 11
    return-object p0
.end method

.method private final getDisplayBounds()La/mkx;
    .locals 4

    .line 1
    iget-object v0, p0, La/rmb0;->k:La/wmb0;

    .line 2
    .line 3
    iget v0, v0, La/wmb0;->a:I

    .line 4
    .line 5
    and-int/lit16 v0, v0, 0x200

    .line 6
    .line 7
    iget-object v1, p0, La/rmb0;->m:Landroid/view/View;

    .line 8
    .line 9
    iget-object v2, p0, La/rmb0;->x:Landroid/graphics/Rect;

    .line 10
    .line 11
    iget-object p0, p0, La/rmb0;->o:La/mi70;

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    invoke-virtual {p0, v2, v1}, La/mi70;->a(Landroid/graphics/Rect;Landroid/view/View;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    new-instance p0, La/mkx;

    .line 26
    .line 27
    iget v0, v2, Landroid/graphics/Rect;->left:I

    .line 28
    .line 29
    iget v1, v2, Landroid/graphics/Rect;->top:I

    .line 30
    .line 31
    iget v3, v2, Landroid/graphics/Rect;->right:I

    .line 32
    .line 33
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 34
    .line 35
    invoke-direct {p0, v0, v1, v3, v2}, La/mkx;-><init>(IIII)V

    .line 36
    .line 37
    .line 38
    return-object p0
.end method

.method public static synthetic getParams$ui$annotations()V
    .locals 0

    .line 1
    return-void
.end method

.method private final getParentLayoutCoordinates()La/j6z;
    .locals 0

    .line 1
    iget-object p0, p0, La/rmb0;->u:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/j6z;

    .line 10
    .line 11
    return-object p0
.end method

.method public static final m(La/rmb0;)Z
    .locals 3

    .line 1
    invoke-direct {p0}, La/rmb0;->getParentLayoutCoordinates()La/j6z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, La/j6z;->h()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v1

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    invoke-virtual {p0}, La/rmb0;->getPopupContentSize-bOM6tXw()La/qkx;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    if-eqz p0, :cond_1

    .line 23
    .line 24
    const/4 p0, 0x1

    .line 25
    return p0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return p0
.end method

.method private final setContent(Lkotlin/jvm/functions/Function2;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "La/fet;",
            "-",
            "Ljava/lang/Integer;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    iget-object p0, p0, La/rmb0;->A:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method private final setParentLayoutCoordinates(La/j6z;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/rmb0;->u:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(ILa/fet;)V
    .locals 5

    .line 1
    const v0, -0x331e2520

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2, v0}, La/fet;->g0(I)La/fet;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2, p0}, La/fet;->i(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x2

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    const/4 v0, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move v0, v1

    .line 17
    :goto_0
    or-int/2addr v0, p1

    .line 18
    and-int/lit8 v2, v0, 0x3

    .line 19
    .line 20
    const/4 v3, 0x0

    .line 21
    const/4 v4, 0x1

    .line 22
    if-eq v2, v1, :cond_1

    .line 23
    .line 24
    move v1, v4

    .line 25
    goto :goto_1

    .line 26
    :cond_1
    move v1, v3

    .line 27
    :goto_1
    and-int/2addr v0, v4

    .line 28
    invoke-virtual {p2, v0, v1}, La/fet;->U(IZ)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-direct {p0}, La/rmb0;->getContent()Lkotlin/jvm/functions/Function2;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    invoke-interface {v0, p2, v1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    goto :goto_2

    .line 46
    :cond_2
    invoke-virtual {p2}, La/fet;->X()V

    .line 47
    .line 48
    .line 49
    :goto_2
    invoke-virtual {p2}, La/fet;->u()La/yfe0;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    if-eqz p2, :cond_3

    .line 54
    .line 55
    new-instance v0, La/lma0;

    .line 56
    .line 57
    const/16 v1, 0xd

    .line 58
    .line 59
    invoke-direct {v0, p0, p1, v1}, La/lma0;-><init>(Ljava/lang/Object;IB)V

    .line 60
    .line 61
    .line 62
    iput-object v0, p2, La/yfe0;->d:Lkotlin/jvm/functions/Function2;

    .line 63
    .line 64
    :cond_3
    return-void
.end method

.method public final dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 3

    .line 1
    iget-object v0, p0, La/rmb0;->k:La/wmb0;

    .line 2
    .line 3
    iget-boolean v0, v0, La/wmb0;->c:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x4

    .line 17
    if-eq v0, v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/16 v1, 0x6f

    .line 24
    .line 25
    if-ne v0, v1, :cond_5

    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getKeyDispatcherState()Landroid/view/KeyEvent$DispatcherState;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    return p0

    .line 38
    :cond_2
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x1

    .line 43
    if-nez v1, :cond_3

    .line 44
    .line 45
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getRepeatCount()I

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-nez v1, :cond_3

    .line 50
    .line 51
    invoke-virtual {v0, p1, p0}, Landroid/view/KeyEvent$DispatcherState;->startTracking(Landroid/view/KeyEvent;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    return v2

    .line 55
    :cond_3
    invoke-virtual {p1}, Landroid/view/KeyEvent;->getAction()I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-ne v1, v2, :cond_5

    .line 60
    .line 61
    invoke-virtual {v0, p1}, Landroid/view/KeyEvent$DispatcherState;->isTracking(Landroid/view/KeyEvent;)Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_5

    .line 66
    .line 67
    invoke-virtual {p1}, Landroid/view/KeyEvent;->isCanceled()Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_5

    .line 72
    .line 73
    iget-object p0, p0, La/rmb0;->j:Lkotlin/jvm/functions/Function0;

    .line 74
    .line 75
    if-eqz p0, :cond_4

    .line 76
    .line 77
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    :cond_4
    return v2

    .line 81
    :cond_5
    invoke-super {p0, p1}, Landroid/view/View;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    return p0
.end method

.method public final g(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, La/x1;->g(ZIIII)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, La/rmb0;->k:La/wmb0;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    invoke-virtual {p0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredWidth()I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    iget-object p3, p0, La/rmb0;->q:Landroid/view/WindowManager$LayoutParams;

    .line 22
    .line 23
    iput p2, p3, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/view/View;->getMeasuredHeight()I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iput p1, p3, Landroid/view/WindowManager$LayoutParams;->height:I

    .line 30
    .line 31
    iget-object p1, p0, La/rmb0;->o:La/mi70;

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    iget-object p1, p0, La/rmb0;->p:Landroid/view/WindowManager;

    .line 37
    .line 38
    invoke-interface {p1, p0, p3}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final getCanCalculatePosition()Z
    .locals 0

    .line 1
    iget-object p0, p0, La/rmb0;->w:La/zbk;

    .line 2
    .line 3
    invoke-virtual {p0}, La/zbk;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public final getParams$ui()Landroid/view/WindowManager$LayoutParams;
    .locals 0

    .line 1
    iget-object p0, p0, La/rmb0;->q:Landroid/view/WindowManager$LayoutParams;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getParentLayoutDirection()La/k6z;
    .locals 0

    .line 1
    iget-object p0, p0, La/rmb0;->s:La/k6z;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getPopupContentSize-bOM6tXw()La/qkx;
    .locals 0

    .line 1
    iget-object p0, p0, La/rmb0;->t:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    check-cast p0, La/qkx;

    .line 10
    .line 11
    return-object p0
.end method

.method public final getPositionProvider()La/vmb0;
    .locals 0

    .line 1
    iget-object p0, p0, La/rmb0;->r:La/vmb0;

    .line 2
    .line 3
    return-object p0
.end method

.method public getShouldCreateCompositionOnAttachedToWindow()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/rmb0;->B:Z

    .line 2
    .line 3
    return p0
.end method

.method public getSubCompositionView()La/x1;
    .locals 0

    .line 1
    return-object p0
.end method

.method public final getTestTag()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/rmb0;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public bridge synthetic getViewRoot()Landroid/view/View;
    .locals 0

    .line 1
    const/4 p0, 0x0

    return-object p0
.end method

.method public final h(II)V
    .locals 1

    .line 1
    iget-object p1, p0, La/rmb0;->k:La/wmb0;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, La/rmb0;->getDisplayBounds()La/mkx;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget p2, p1, La/mkx;->c:I

    .line 11
    .line 12
    iget v0, p1, La/mkx;->a:I

    .line 13
    .line 14
    sub-int/2addr p2, v0

    .line 15
    const/high16 v0, -0x80000000

    .line 16
    .line 17
    invoke-static {p2, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    invoke-virtual {p1}, La/mkx;->a()I

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    invoke-static {p1, v0}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    invoke-super {p0, p2, p1}, La/x1;->h(II)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public final n(La/nld;Lkotlin/jvm/functions/Function2;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, La/x1;->setParentCompositionContext(La/nld;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p2}, La/rmb0;->setContent(Lkotlin/jvm/functions/Function2;)V

    .line 5
    .line 6
    .line 7
    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, La/rmb0;->B:Z

    .line 9
    .line 10
    return-void
.end method

.method public final o(Lkotlin/jvm/functions/Function0;La/wmb0;Ljava/lang/String;La/k6z;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/rmb0;->j:Lkotlin/jvm/functions/Function0;

    .line 2
    .line 3
    iput-object p3, p0, La/rmb0;->l:Ljava/lang/String;

    .line 4
    .line 5
    iget-object p1, p0, La/rmb0;->k:La/wmb0;

    .line 6
    .line 7
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iput-object p2, p0, La/rmb0;->k:La/wmb0;

    .line 18
    .line 19
    iget-object p1, p0, La/rmb0;->m:Landroid/view/View;

    .line 20
    .line 21
    invoke-static {p1}, La/k13;->b(Landroid/view/View;)Z

    .line 22
    .line 23
    .line 24
    move-result p1

    .line 25
    iget-boolean p3, p2, La/wmb0;->b:Z

    .line 26
    .line 27
    iget p2, p2, La/wmb0;->a:I

    .line 28
    .line 29
    if-eqz p3, :cond_1

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    or-int/lit16 p2, p2, 0x2000

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    if-eqz p3, :cond_2

    .line 37
    .line 38
    if-nez p1, :cond_2

    .line 39
    .line 40
    and-int/lit16 p2, p2, -0x2001

    .line 41
    .line 42
    :cond_2
    :goto_0
    iget-object p1, p0, La/rmb0;->q:Landroid/view/WindowManager$LayoutParams;

    .line 43
    .line 44
    iput p2, p1, Landroid/view/WindowManager$LayoutParams;->flags:I

    .line 45
    .line 46
    iget-object p2, p0, La/rmb0;->o:La/mi70;

    .line 47
    .line 48
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    iget-object p2, p0, La/rmb0;->p:Landroid/view/WindowManager;

    .line 52
    .line 53
    invoke-interface {p2, p0, p1}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 54
    .line 55
    .line 56
    :goto_1
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    .line 57
    .line 58
    .line 59
    move-result p1

    .line 60
    if-eqz p1, :cond_4

    .line 61
    .line 62
    const/4 p2, 0x1

    .line 63
    if-ne p1, p2, :cond_3

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-static {}, La/t9f;->b()V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_4
    const/4 p2, 0x0

    .line 71
    :goto_2
    invoke-super {p0, p2}, Landroid/view/View;->setLayoutDirection(I)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public final onAttachedToWindow()V
    .locals 3

    .line 1
    invoke-super {p0}, La/x1;->onAttachedToWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/rmb0;->y:La/pgk0;

    .line 5
    .line 6
    invoke-virtual {v0}, La/pgk0;->e()V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, La/rmb0;->k:La/wmb0;

    .line 10
    .line 11
    iget-boolean v0, v0, La/wmb0;->c:Z

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 16
    .line 17
    const/16 v1, 0x21

    .line 18
    .line 19
    if-ge v0, v1, :cond_0

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object v0, p0, La/rmb0;->z:La/ma3;

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    iget-object v0, p0, La/rmb0;->j:Lkotlin/jvm/functions/Function0;

    .line 27
    .line 28
    new-instance v1, La/ma3;

    .line 29
    .line 30
    const/4 v2, 0x0

    .line 31
    invoke-direct {v1, v0, v2}, La/ma3;-><init>(Ljava/lang/Object;B)V

    .line 32
    .line 33
    .line 34
    iput-object v1, p0, La/rmb0;->z:La/ma3;

    .line 35
    .line 36
    move-object v0, v1

    .line 37
    :cond_1
    invoke-static {p0, v0}, La/f7;->t(La/rmb0;Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    :cond_2
    :goto_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, La/rmb0;->y:La/pgk0;

    .line 5
    .line 6
    iget-object v1, v0, La/pgk0;->h:La/jk8;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    invoke-virtual {v1}, La/jk8;->a()V

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0}, La/pgk0;->a()V

    .line 14
    .line 15
    .line 16
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 17
    .line 18
    const/16 v1, 0x21

    .line 19
    .line 20
    if-lt v0, v1, :cond_1

    .line 21
    .line 22
    iget-object v0, p0, La/rmb0;->z:La/ma3;

    .line 23
    .line 24
    invoke-static {p0, v0}, La/f7;->u(La/rmb0;La/ma3;)V

    .line 25
    .line 26
    .line 27
    :cond_1
    const/4 v0, 0x0

    .line 28
    iput-object v0, p0, La/rmb0;->z:La/ma3;

    .line 29
    .line 30
    return-void
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4

    .line 1
    iget-object v0, p0, La/rmb0;->k:La/wmb0;

    .line 2
    .line 3
    iget-boolean v0, v0, La/wmb0;->d:Z

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0

    .line 12
    :cond_0
    const/4 v0, 0x1

    .line 13
    if-eqz p1, :cond_2

    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    if-nez v1, :cond_2

    .line 20
    .line 21
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x0

    .line 26
    cmpg-float v1, v1, v2

    .line 27
    .line 28
    if-ltz v1, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 35
    .line 36
    .line 37
    move-result v3

    .line 38
    int-to-float v3, v3

    .line 39
    cmpl-float v1, v1, v3

    .line 40
    .line 41
    if-gez v1, :cond_1

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    cmpg-float v1, v1, v2

    .line 48
    .line 49
    if-ltz v1, :cond_1

    .line 50
    .line 51
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 56
    .line 57
    .line 58
    move-result v2

    .line 59
    int-to-float v2, v2

    .line 60
    cmpl-float v1, v1, v2

    .line 61
    .line 62
    if-ltz v1, :cond_2

    .line 63
    .line 64
    :cond_1
    iget-object p0, p0, La/rmb0;->j:Lkotlin/jvm/functions/Function0;

    .line 65
    .line 66
    if-eqz p0, :cond_3

    .line 67
    .line 68
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    return v0

    .line 72
    :cond_2
    if-eqz p1, :cond_4

    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    const/4 v2, 0x4

    .line 79
    if-ne v1, v2, :cond_4

    .line 80
    .line 81
    iget-object p0, p0, La/rmb0;->j:Lkotlin/jvm/functions/Function0;

    .line 82
    .line 83
    if-eqz p0, :cond_3

    .line 84
    .line 85
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    :cond_3
    return v0

    .line 89
    :cond_4
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 90
    .line 91
    .line 92
    move-result p0

    .line 93
    return p0
.end method

.method public final p()V
    .locals 11

    .line 1
    invoke-direct {p0}, La/rmb0;->getParentLayoutCoordinates()La/j6z;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_3

    .line 6
    .line 7
    invoke-interface {v0}, La/j6z;->h()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_1
    invoke-interface {v0}, La/j6z;->g()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    iget-boolean v3, p0, La/rmb0;->n:Z

    .line 23
    .line 24
    const-wide/16 v4, 0x0

    .line 25
    .line 26
    if-eqz v3, :cond_2

    .line 27
    .line 28
    invoke-interface {v0, v4, v5}, La/j6z;->R(J)J

    .line 29
    .line 30
    .line 31
    move-result-wide v3

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    invoke-interface {v0, v4, v5}, La/j6z;->G(J)J

    .line 34
    .line 35
    .line 36
    move-result-wide v3

    .line 37
    :goto_1
    const/16 v0, 0x20

    .line 38
    .line 39
    shr-long v5, v3, v0

    .line 40
    .line 41
    long-to-int v5, v5

    .line 42
    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    const-wide v6, 0xffffffffL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    and-long/2addr v3, v6

    .line 56
    long-to-int v3, v3

    .line 57
    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 62
    .line 63
    .line 64
    move-result v3

    .line 65
    int-to-long v4, v5

    .line 66
    shl-long/2addr v4, v0

    .line 67
    int-to-long v8, v3

    .line 68
    and-long/2addr v8, v6

    .line 69
    or-long v3, v4, v8

    .line 70
    .line 71
    new-instance v5, La/mkx;

    .line 72
    .line 73
    shr-long v8, v3, v0

    .line 74
    .line 75
    long-to-int v8, v8

    .line 76
    and-long/2addr v3, v6

    .line 77
    long-to-int v3, v3

    .line 78
    shr-long v9, v1, v0

    .line 79
    .line 80
    long-to-int v0, v9

    .line 81
    add-int/2addr v0, v8

    .line 82
    and-long/2addr v1, v6

    .line 83
    long-to-int v1, v1

    .line 84
    add-int/2addr v1, v3

    .line 85
    invoke-direct {v5, v8, v3, v0, v1}, La/mkx;-><init>(IIII)V

    .line 86
    .line 87
    .line 88
    iget-object v0, p0, La/rmb0;->v:La/mkx;

    .line 89
    .line 90
    invoke-virtual {v5, v0}, La/mkx;->equals(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-nez v0, :cond_3

    .line 95
    .line 96
    iput-object v5, p0, La/rmb0;->v:La/mkx;

    .line 97
    .line 98
    invoke-virtual {p0}, La/rmb0;->r()V

    .line 99
    .line 100
    .line 101
    :cond_3
    :goto_2
    return-void
.end method

.method public final q(La/j6z;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, La/rmb0;->setParentLayoutCoordinates(La/j6z;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, La/rmb0;->p()V

    .line 5
    .line 6
    .line 7
    return-void
.end method

.method public final r()V
    .locals 13

    .line 1
    iget-object v3, p0, La/rmb0;->v:La/mkx;

    .line 2
    .line 3
    if-nez v3, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, La/rmb0;->getPopupContentSize-bOM6tXw()La/qkx;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-wide v6, v0, La/qkx;->a:J

    .line 13
    .line 14
    invoke-direct {p0}, La/rmb0;->getDisplayBounds()La/mkx;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget v1, v0, La/mkx;->c:I

    .line 19
    .line 20
    iget v2, v0, La/mkx;->a:I

    .line 21
    .line 22
    sub-int/2addr v1, v2

    .line 23
    invoke-virtual {v0}, La/mkx;->a()I

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    int-to-long v1, v1

    .line 28
    const/16 v8, 0x20

    .line 29
    .line 30
    shl-long/2addr v1, v8

    .line 31
    int-to-long v4, v0

    .line 32
    const-wide v9, 0xffffffffL

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    and-long/2addr v4, v9

    .line 38
    or-long/2addr v4, v1

    .line 39
    new-instance v1, La/lie0;

    .line 40
    .line 41
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 42
    .line 43
    .line 44
    const-wide/16 v11, 0x0

    .line 45
    .line 46
    iput-wide v11, v1, La/lie0;->a:J

    .line 47
    .line 48
    new-instance v0, La/qmb0;

    .line 49
    .line 50
    move-object v2, p0

    .line 51
    invoke-direct/range {v0 .. v7}, La/qmb0;-><init>(La/lie0;La/rmb0;La/mkx;JJ)V

    .line 52
    .line 53
    .line 54
    iget-object p0, v2, La/rmb0;->y:La/pgk0;

    .line 55
    .line 56
    sget-object v3, La/rmb0;->g1:La/peb0;

    .line 57
    .line 58
    invoke-virtual {p0, v2, v3, v0}, La/pgk0;->d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 59
    .line 60
    .line 61
    iget-wide v0, v1, La/lie0;->a:J

    .line 62
    .line 63
    shr-long v6, v0, v8

    .line 64
    .line 65
    long-to-int p0, v6

    .line 66
    iget-object v3, v2, La/rmb0;->q:Landroid/view/WindowManager$LayoutParams;

    .line 67
    .line 68
    iput p0, v3, Landroid/view/WindowManager$LayoutParams;->x:I

    .line 69
    .line 70
    and-long/2addr v0, v9

    .line 71
    long-to-int p0, v0

    .line 72
    iput p0, v3, Landroid/view/WindowManager$LayoutParams;->y:I

    .line 73
    .line 74
    iget-object p0, v2, La/rmb0;->k:La/wmb0;

    .line 75
    .line 76
    iget-boolean p0, p0, La/wmb0;->e:Z

    .line 77
    .line 78
    iget-object v0, v2, La/rmb0;->o:La/mi70;

    .line 79
    .line 80
    if-eqz p0, :cond_1

    .line 81
    .line 82
    shr-long v6, v4, v8

    .line 83
    .line 84
    long-to-int p0, v6

    .line 85
    and-long/2addr v4, v9

    .line 86
    long-to-int v1, v4

    .line 87
    invoke-virtual {v0, v2, p0, v1}, La/mi70;->b(La/rmb0;II)V

    .line 88
    .line 89
    .line 90
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    iget-object p0, v2, La/rmb0;->p:Landroid/view/WindowManager;

    .line 94
    .line 95
    invoke-interface {p0, v2, v3}, Landroid/view/ViewManager;->updateViewLayout(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 96
    .line 97
    .line 98
    :cond_2
    :goto_0
    return-void
.end method

.method public setLayoutDirection(I)V
    .locals 0

    .line 1
    return-void
.end method

.method public final setParentLayoutDirection(La/k6z;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/rmb0;->s:La/k6z;

    .line 2
    .line 3
    return-void
.end method

.method public final setPopupContentSize-fhxjrPA(La/qkx;)V
    .locals 0

    .line 1
    iget-object p0, p0, La/rmb0;->t:La/pz40;

    .line 2
    .line 3
    check-cast p0, La/hgk0;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public final setPositionProvider(La/vmb0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/rmb0;->r:La/vmb0;

    .line 2
    .line 3
    return-void
.end method

.method public final setTestTag(Ljava/lang/String;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/rmb0;->l:Ljava/lang/String;

    .line 2
    .line 3
    return-void
.end method
