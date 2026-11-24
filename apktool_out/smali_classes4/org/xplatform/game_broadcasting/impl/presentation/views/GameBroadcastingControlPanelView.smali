.class public final Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# static fields
.field public static final synthetic A:I


# instance fields
.field public final q:La/a8z;

.field public final r:La/n0o0;

.field public final s:La/n0o0;

.field public final t:La/n0o0;

.field public final u:La/n0o0;

.field public final v:La/n0o0;

.field public final w:La/n0o0;

.field public final x:La/n0o0;

.field public final y:La/n0o0;

.field public final z:La/n0o0;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 244
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x0

    const/4 v1, 0x6

    invoke-direct {p0, p1, v0, v1}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .line 243
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v0, 0x4

    invoke-direct {p0, p1, p2, v0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    .line 1
    and-int/lit8 p3, p3, 0x2

    .line 2
    .line 3
    if-eqz p3, :cond_0

    .line 4
    .line 5
    const/4 p2, 0x0

    .line 6
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p3, 0x0

    .line 10
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 11
    .line 12
    .line 13
    sget-object p2, La/wez;->b:La/wez;

    .line 14
    .line 15
    new-instance v0, La/nsr;

    .line 16
    .line 17
    invoke-direct {v0, p0, p0, p3}, La/nsr;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    invoke-static {p2, v0}, La/maz;->a(La/wez;Lkotlin/jvm/functions/Function0;)La/a8z;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->q:La/a8z;

    .line 25
    .line 26
    new-instance p2, La/i7q;

    .line 27
    .line 28
    const/4 v0, 0x3

    .line 29
    invoke-direct {p2, p1, v0}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 30
    .line 31
    .line 32
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->r:La/n0o0;

    .line 37
    .line 38
    new-instance p2, La/i7q;

    .line 39
    .line 40
    const/4 v0, 0x4

    .line 41
    invoke-direct {p2, p1, v0}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 42
    .line 43
    .line 44
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 45
    .line 46
    .line 47
    move-result-object p2

    .line 48
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->s:La/n0o0;

    .line 49
    .line 50
    new-instance p2, La/i7q;

    .line 51
    .line 52
    const/4 v0, 0x5

    .line 53
    invoke-direct {p2, p1, v0}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 54
    .line 55
    .line 56
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 57
    .line 58
    .line 59
    move-result-object p2

    .line 60
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->t:La/n0o0;

    .line 61
    .line 62
    new-instance p2, La/i7q;

    .line 63
    .line 64
    const/4 v0, 0x6

    .line 65
    invoke-direct {p2, p1, v0}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 66
    .line 67
    .line 68
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 69
    .line 70
    .line 71
    move-result-object p2

    .line 72
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->u:La/n0o0;

    .line 73
    .line 74
    new-instance p2, La/i7q;

    .line 75
    .line 76
    const/4 v0, 0x7

    .line 77
    invoke-direct {p2, p1, v0}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 78
    .line 79
    .line 80
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->v:La/n0o0;

    .line 85
    .line 86
    new-instance p2, La/i7q;

    .line 87
    .line 88
    const/16 v0, 0x8

    .line 89
    .line 90
    invoke-direct {p2, p1, v0}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 91
    .line 92
    .line 93
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 94
    .line 95
    .line 96
    move-result-object p2

    .line 97
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->w:La/n0o0;

    .line 98
    .line 99
    new-instance p2, La/i7q;

    .line 100
    .line 101
    const/16 v0, 0x9

    .line 102
    .line 103
    invoke-direct {p2, p1, v0}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 104
    .line 105
    .line 106
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 107
    .line 108
    .line 109
    move-result-object p2

    .line 110
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->x:La/n0o0;

    .line 111
    .line 112
    new-instance p2, La/i7q;

    .line 113
    .line 114
    const/16 v0, 0xa

    .line 115
    .line 116
    invoke-direct {p2, p1, v0}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 117
    .line 118
    .line 119
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->y:La/n0o0;

    .line 124
    .line 125
    new-instance p2, La/i7q;

    .line 126
    .line 127
    const/16 v0, 0xb

    .line 128
    .line 129
    invoke-direct {p2, p1, v0}, La/i7q;-><init>(Landroid/content/Context;B)V

    .line 130
    .line 131
    .line 132
    invoke-static {p2}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    iput-object p2, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->z:La/n0o0;

    .line 137
    .line 138
    const p2, 0x7f08022e

    .line 139
    .line 140
    .line 141
    invoke-static {p2, p1}, La/epv0;->U(ILandroid/content/Context;)Landroid/graphics/drawable/Drawable;

    .line 142
    .line 143
    .line 144
    move-result-object p1

    .line 145
    invoke-virtual {p0, p1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 146
    .line 147
    .line 148
    const/4 p1, 0x0

    .line 149
    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    .line 150
    .line 151
    .line 152
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iget-object p1, p1, La/dhu0;->f:Landroid/widget/ImageView;

    .line 157
    .line 158
    invoke-virtual {p1, p3}, Landroid/view/View;->setEnabled(Z)V

    .line 159
    .line 160
    .line 161
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    iget-object p1, p1, La/dhu0;->f:Landroid/widget/ImageView;

    .line 166
    .line 167
    invoke-virtual {p1, p3}, Landroid/view/View;->setClickable(Z)V

    .line 168
    .line 169
    .line 170
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    iget-object p1, p1, La/dhu0;->e:Landroid/widget/ImageView;

    .line 175
    .line 176
    invoke-virtual {p1, p3}, Landroid/view/View;->setEnabled(Z)V

    .line 177
    .line 178
    .line 179
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 180
    .line 181
    .line 182
    move-result-object p1

    .line 183
    iget-object p1, p1, La/dhu0;->e:Landroid/widget/ImageView;

    .line 184
    .line 185
    invoke-virtual {p1, p3}, Landroid/view/View;->setClickable(Z)V

    .line 186
    .line 187
    .line 188
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 189
    .line 190
    .line 191
    move-result-object p1

    .line 192
    iget-object p1, p1, La/dhu0;->c:Landroid/widget/ImageView;

    .line 193
    .line 194
    invoke-virtual {p1, p3}, Landroid/view/View;->setEnabled(Z)V

    .line 195
    .line 196
    .line 197
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    iget-object p1, p1, La/dhu0;->c:Landroid/widget/ImageView;

    .line 202
    .line 203
    invoke-virtual {p1, p3}, Landroid/view/View;->setClickable(Z)V

    .line 204
    .line 205
    .line 206
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 207
    .line 208
    .line 209
    move-result-object p1

    .line 210
    iget-object p1, p1, La/dhu0;->d:Landroid/widget/ImageView;

    .line 211
    .line 212
    invoke-virtual {p1, p3}, Landroid/view/View;->setEnabled(Z)V

    .line 213
    .line 214
    .line 215
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 216
    .line 217
    .line 218
    move-result-object p1

    .line 219
    iget-object p1, p1, La/dhu0;->d:Landroid/widget/ImageView;

    .line 220
    .line 221
    invoke-virtual {p1, p3}, Landroid/view/View;->setClickable(Z)V

    .line 222
    .line 223
    .line 224
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    iget-object p1, p1, La/dhu0;->b:Landroid/widget/ImageView;

    .line 229
    .line 230
    invoke-virtual {p1, p3}, Landroid/view/View;->setEnabled(Z)V

    .line 231
    .line 232
    .line 233
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 234
    .line 235
    .line 236
    move-result-object p0

    .line 237
    iget-object p0, p0, La/dhu0;->b:Landroid/widget/ImageView;

    .line 238
    .line 239
    invoke-virtual {p0, p3}, Landroid/view/View;->setClickable(Z)V

    .line 240
    .line 241
    .line 242
    return-void
.end method

.method private final getBinding()La/dhu0;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->q:La/a8z;

    .line 2
    .line 3
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    check-cast p0, La/dhu0;

    .line 11
    .line 12
    return-object p0
.end method

.method private final getFromFullscreenDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->w:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getFromWindowDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->u:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getGoToZone2DFormatDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->y:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getGoToZone3DFormatDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->z:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getPauseDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->r:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getPlayDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->s:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getStopDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->x:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getToFullscreenDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->v:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method

.method private final getToWindowDrawable()Landroid/graphics/drawable/Drawable;
    .locals 0

    .line 1
    iget-object p0, p0, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->t:La/n0o0;

    .line 2
    .line 3
    invoke-virtual {p0}, La/n0o0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Landroid/graphics/drawable/Drawable;

    .line 8
    .line 9
    return-object p0
.end method


# virtual methods
.method public final onDetachedFromWindow()V
    .locals 0

    .line 1
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public final onLayout(ZIIII)V
    .locals 0

    .line 1
    invoke-super/range {p0 .. p5}, Landroidx/constraintlayout/widget/ConstraintLayout;->onLayout(ZIIII)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iget-object p1, p1, La/dhu0;->e:Landroid/widget/ImageView;

    .line 9
    .line 10
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 11
    .line 12
    .line 13
    move-result-object p2

    .line 14
    iget-object p2, p2, La/dhu0;->c:Landroid/widget/ImageView;

    .line 15
    .line 16
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 17
    .line 18
    .line 19
    move-result-object p3

    .line 20
    iget-object p3, p3, La/dhu0;->d:Landroid/widget/ImageView;

    .line 21
    .line 22
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 23
    .line 24
    .line 25
    move-result-object p4

    .line 26
    iget-object p4, p4, La/dhu0;->f:Landroid/widget/ImageView;

    .line 27
    .line 28
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 29
    .line 30
    .line 31
    move-result-object p5

    .line 32
    iget-object p5, p5, La/dhu0;->b:Landroid/widget/ImageView;

    .line 33
    .line 34
    filled-new-array {p1, p2, p3, p4, p5}, [Landroid/widget/ImageView;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {p1}, La/q3d;->j([Ljava/lang/Object;)Ljava/util/List;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    new-instance p2, Ljava/util/ArrayList;

    .line 43
    .line 44
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 52
    .line 53
    .line 54
    move-result p3

    .line 55
    if-eqz p3, :cond_1

    .line 56
    .line 57
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p3

    .line 61
    move-object p4, p3

    .line 62
    check-cast p4, Landroid/widget/ImageView;

    .line 63
    .line 64
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p4}, Landroid/view/View;->getVisibility()I

    .line 68
    .line 69
    .line 70
    move-result p4

    .line 71
    if-nez p4, :cond_0

    .line 72
    .line 73
    invoke-virtual {p2, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_1
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result p2

    .line 85
    if-eqz p2, :cond_2

    .line 86
    .line 87
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    check-cast p2, Landroid/widget/ImageView;

    .line 92
    .line 93
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    const p3, 0x7f0706ea

    .line 97
    .line 98
    .line 99
    invoke-static {p2, p0, p3, p3}, La/wgm0;->t(Landroid/view/View;Landroidx/constraintlayout/widget/ConstraintLayout;II)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_2
    return-void
.end method

.method public final setPlayDrawable(Z)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/dhu0;->c:Landroid/widget/ImageView;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getPauseDrawable()Landroid/graphics/drawable/Drawable;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getPlayDrawable()Landroid/graphics/drawable/Drawable;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :goto_0
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public final setZoneFormatDrawable(La/w3w0;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iget-object v0, v0, La/dhu0;->f:Landroid/widget/ImageView;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    if-ne p1, v1, :cond_0

    .line 18
    .line 19
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getGoToZone3DFormatDrawable()Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {}, La/t9f;->b()V

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_1
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getGoToZone2DFormatDrawable()Landroid/graphics/drawable/Drawable;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :goto_0
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public final setZoneFormatIsVisible(Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p0, p0, La/dhu0;->f:Landroid/widget/ImageView;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/16 p1, 0x8

    .line 12
    .line 13
    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final u(La/dke;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of v0, p1, La/yys;

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p1, La/yys;

    .line 12
    .line 13
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v0, v0, La/dhu0;->e:Landroid/widget/ImageView;

    .line 18
    .line 19
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getToWindowDrawable()Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 24
    .line 25
    .line 26
    new-instance v4, La/ksr;

    .line 27
    .line 28
    invoke-direct {v4, p1, v3}, La/ksr;-><init>(La/yys;B)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    iget-object v0, v0, La/dhu0;->c:Landroid/widget/ImageView;

    .line 39
    .line 40
    new-instance v3, La/ksr;

    .line 41
    .line 42
    invoke-direct {v3, p1, v2}, La/ksr;-><init>(La/yys;B)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 46
    .line 47
    .line 48
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    iget-object v0, v0, La/dhu0;->b:Landroid/widget/ImageView;

    .line 53
    .line 54
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getToFullscreenDrawable()Landroid/graphics/drawable/Drawable;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 59
    .line 60
    .line 61
    new-instance p0, La/ksr;

    .line 62
    .line 63
    invoke-direct {p0, p1, v1}, La/ksr;-><init>(La/yys;B)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 67
    .line 68
    .line 69
    return-void

    .line 70
    :cond_0
    instance-of v0, p1, La/wzs;

    .line 71
    .line 72
    const/4 v4, 0x3

    .line 73
    if-eqz v0, :cond_1

    .line 74
    .line 75
    check-cast p1, La/wzs;

    .line 76
    .line 77
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    iget-object v0, v0, La/dhu0;->e:Landroid/widget/ImageView;

    .line 82
    .line 83
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getFromWindowDrawable()Landroid/graphics/drawable/Drawable;

    .line 84
    .line 85
    .line 86
    move-result-object v5

    .line 87
    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 88
    .line 89
    .line 90
    new-instance v5, La/msr;

    .line 91
    .line 92
    invoke-direct {v5, p1, v3}, La/msr;-><init>(La/wzs;B)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 96
    .line 97
    .line 98
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    iget-object v0, v0, La/dhu0;->c:Landroid/widget/ImageView;

    .line 103
    .line 104
    new-instance v5, La/msr;

    .line 105
    .line 106
    invoke-direct {v5, p1, v2}, La/msr;-><init>(La/wzs;B)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 110
    .line 111
    .line 112
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    iget-object v0, v0, La/dhu0;->b:Landroid/widget/ImageView;

    .line 117
    .line 118
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getToFullscreenDrawable()Landroid/graphics/drawable/Drawable;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 123
    .line 124
    .line 125
    new-instance v2, La/msr;

    .line 126
    .line 127
    invoke-direct {v2, p1, v1}, La/msr;-><init>(La/wzs;B)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 131
    .line 132
    .line 133
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 134
    .line 135
    .line 136
    move-result-object v0

    .line 137
    iget-object v0, v0, La/dhu0;->d:Landroid/widget/ImageView;

    .line 138
    .line 139
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 140
    .line 141
    .line 142
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getStopDrawable()Landroid/graphics/drawable/Drawable;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 147
    .line 148
    .line 149
    new-instance p0, La/msr;

    .line 150
    .line 151
    invoke-direct {p0, p1, v4}, La/msr;-><init>(La/wzs;B)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 155
    .line 156
    .line 157
    return-void

    .line 158
    :cond_1
    instance-of v0, p1, La/e1t;

    .line 159
    .line 160
    if-eqz v0, :cond_2

    .line 161
    .line 162
    check-cast p1, La/e1t;

    .line 163
    .line 164
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    iget-object v0, v0, La/dhu0;->e:Landroid/widget/ImageView;

    .line 169
    .line 170
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getToWindowDrawable()Landroid/graphics/drawable/Drawable;

    .line 171
    .line 172
    .line 173
    move-result-object v5

    .line 174
    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 175
    .line 176
    .line 177
    new-instance v5, La/isr;

    .line 178
    .line 179
    invoke-direct {v5, p1, v4}, La/isr;-><init>(La/e1t;B)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {v0, v5}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 183
    .line 184
    .line 185
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    iget-object v0, v0, La/dhu0;->c:Landroid/widget/ImageView;

    .line 190
    .line 191
    new-instance v4, La/isr;

    .line 192
    .line 193
    invoke-direct {v4, p1, v3}, La/isr;-><init>(La/e1t;B)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 197
    .line 198
    .line 199
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 200
    .line 201
    .line 202
    move-result-object v0

    .line 203
    iget-object v0, v0, La/dhu0;->b:Landroid/widget/ImageView;

    .line 204
    .line 205
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getToFullscreenDrawable()Landroid/graphics/drawable/Drawable;

    .line 206
    .line 207
    .line 208
    move-result-object v4

    .line 209
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 210
    .line 211
    .line 212
    new-instance v4, La/isr;

    .line 213
    .line 214
    invoke-direct {v4, p1, v2}, La/isr;-><init>(La/e1t;B)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v0, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 218
    .line 219
    .line 220
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    iget-object v0, v0, La/dhu0;->f:Landroid/widget/ImageView;

    .line 225
    .line 226
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 227
    .line 228
    .line 229
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getGoToZone3DFormatDrawable()Landroid/graphics/drawable/Drawable;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 234
    .line 235
    .line 236
    new-instance p0, La/isr;

    .line 237
    .line 238
    invoke-direct {p0, p1, v1}, La/isr;-><init>(La/e1t;B)V

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 242
    .line 243
    .line 244
    return-void

    .line 245
    :cond_2
    instance-of v0, p1, La/p89;

    .line 246
    .line 247
    const/4 v5, 0x4

    .line 248
    if-eqz v0, :cond_3

    .line 249
    .line 250
    check-cast p1, La/p89;

    .line 251
    .line 252
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    iget-object v0, v0, La/dhu0;->e:Landroid/widget/ImageView;

    .line 257
    .line 258
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getToWindowDrawable()Landroid/graphics/drawable/Drawable;

    .line 259
    .line 260
    .line 261
    move-result-object v6

    .line 262
    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 263
    .line 264
    .line 265
    new-instance v6, La/jsr;

    .line 266
    .line 267
    invoke-direct {v6, p1, v3}, La/jsr;-><init>(La/p89;B)V

    .line 268
    .line 269
    .line 270
    invoke-virtual {v0, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 271
    .line 272
    .line 273
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 274
    .line 275
    .line 276
    move-result-object v0

    .line 277
    iget-object v0, v0, La/dhu0;->c:Landroid/widget/ImageView;

    .line 278
    .line 279
    new-instance v6, La/jsr;

    .line 280
    .line 281
    invoke-direct {v6, p1, v2}, La/jsr;-><init>(La/p89;B)V

    .line 282
    .line 283
    .line 284
    invoke-virtual {v0, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 285
    .line 286
    .line 287
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    iget-object v0, v0, La/dhu0;->b:Landroid/widget/ImageView;

    .line 292
    .line 293
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getFromFullscreenDrawable()Landroid/graphics/drawable/Drawable;

    .line 294
    .line 295
    .line 296
    move-result-object v2

    .line 297
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 298
    .line 299
    .line 300
    new-instance v2, La/jsr;

    .line 301
    .line 302
    invoke-direct {v2, p1, v1}, La/jsr;-><init>(La/p89;B)V

    .line 303
    .line 304
    .line 305
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 306
    .line 307
    .line 308
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    iget-object v0, v0, La/dhu0;->d:Landroid/widget/ImageView;

    .line 313
    .line 314
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 315
    .line 316
    .line 317
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getStopDrawable()Landroid/graphics/drawable/Drawable;

    .line 318
    .line 319
    .line 320
    move-result-object v1

    .line 321
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 322
    .line 323
    .line 324
    new-instance v1, La/jsr;

    .line 325
    .line 326
    invoke-direct {v1, p1, v4}, La/jsr;-><init>(La/p89;B)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 330
    .line 331
    .line 332
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 333
    .line 334
    .line 335
    move-result-object v0

    .line 336
    iget-object v0, v0, La/dhu0;->f:Landroid/widget/ImageView;

    .line 337
    .line 338
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 339
    .line 340
    .line 341
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getGoToZone3DFormatDrawable()Landroid/graphics/drawable/Drawable;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 346
    .line 347
    .line 348
    new-instance p0, La/jsr;

    .line 349
    .line 350
    invoke-direct {p0, p1, v5}, La/jsr;-><init>(La/p89;B)V

    .line 351
    .line 352
    .line 353
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 354
    .line 355
    .line 356
    return-void

    .line 357
    :cond_3
    instance-of v0, p1, La/x1t;

    .line 358
    .line 359
    if-eqz v0, :cond_4

    .line 360
    .line 361
    check-cast p1, La/x1t;

    .line 362
    .line 363
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 364
    .line 365
    .line 366
    move-result-object v0

    .line 367
    iget-object v0, v0, La/dhu0;->e:Landroid/widget/ImageView;

    .line 368
    .line 369
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getFromWindowDrawable()Landroid/graphics/drawable/Drawable;

    .line 370
    .line 371
    .line 372
    move-result-object v6

    .line 373
    invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 374
    .line 375
    .line 376
    new-instance v6, La/lsr;

    .line 377
    .line 378
    invoke-direct {v6, p1, v3}, La/lsr;-><init>(La/x1t;B)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v0, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 382
    .line 383
    .line 384
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 385
    .line 386
    .line 387
    move-result-object v0

    .line 388
    iget-object v0, v0, La/dhu0;->c:Landroid/widget/ImageView;

    .line 389
    .line 390
    new-instance v6, La/lsr;

    .line 391
    .line 392
    invoke-direct {v6, p1, v2}, La/lsr;-><init>(La/x1t;B)V

    .line 393
    .line 394
    .line 395
    invoke-virtual {v0, v6}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 396
    .line 397
    .line 398
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 399
    .line 400
    .line 401
    move-result-object v0

    .line 402
    iget-object v0, v0, La/dhu0;->b:Landroid/widget/ImageView;

    .line 403
    .line 404
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getToFullscreenDrawable()Landroid/graphics/drawable/Drawable;

    .line 405
    .line 406
    .line 407
    move-result-object v2

    .line 408
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 409
    .line 410
    .line 411
    new-instance v2, La/lsr;

    .line 412
    .line 413
    invoke-direct {v2, p1, v1}, La/lsr;-><init>(La/x1t;B)V

    .line 414
    .line 415
    .line 416
    invoke-virtual {v0, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 417
    .line 418
    .line 419
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 420
    .line 421
    .line 422
    move-result-object v0

    .line 423
    iget-object v0, v0, La/dhu0;->d:Landroid/widget/ImageView;

    .line 424
    .line 425
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 426
    .line 427
    .line 428
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getStopDrawable()Landroid/graphics/drawable/Drawable;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 433
    .line 434
    .line 435
    new-instance v1, La/lsr;

    .line 436
    .line 437
    invoke-direct {v1, p1, v4}, La/lsr;-><init>(La/x1t;B)V

    .line 438
    .line 439
    .line 440
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 441
    .line 442
    .line 443
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 444
    .line 445
    .line 446
    move-result-object v0

    .line 447
    iget-object v0, v0, La/dhu0;->f:Landroid/widget/ImageView;

    .line 448
    .line 449
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 450
    .line 451
    .line 452
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getGoToZone3DFormatDrawable()Landroid/graphics/drawable/Drawable;

    .line 453
    .line 454
    .line 455
    move-result-object p0

    .line 456
    invoke-virtual {v0, p0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 457
    .line 458
    .line 459
    new-instance p0, La/lsr;

    .line 460
    .line 461
    invoke-direct {p0, p1, v5}, La/lsr;-><init>(La/x1t;B)V

    .line 462
    .line 463
    .line 464
    invoke-virtual {v0, p0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 465
    .line 466
    .line 467
    return-void

    .line 468
    :cond_4
    invoke-static {}, La/t9f;->b()V

    .line 469
    .line 470
    .line 471
    return-void
.end method

.method public final v()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/dhu0;->f:Landroid/widget/ImageView;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, La/dhu0;->f:Landroid/widget/ImageView;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, La/dhu0;->e:Landroid/widget/ImageView;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v0, v0, La/dhu0;->e:Landroid/widget/ImageView;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v0, v0, La/dhu0;->c:Landroid/widget/ImageView;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v0, v0, La/dhu0;->c:Landroid/widget/ImageView;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v0, v0, La/dhu0;->d:Landroid/widget/ImageView;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v0, v0, La/dhu0;->d:Landroid/widget/ImageView;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-object v0, v0, La/dhu0;->b:Landroid/widget/ImageView;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    iget-object p0, p0, La/dhu0;->b:Landroid/widget/ImageView;

    .line 88
    .line 89
    invoke-virtual {p0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 90
    .line 91
    .line 92
    return-void
.end method

.method public final w()V
    .locals 2

    .line 1
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    iget-object v0, v0, La/dhu0;->f:Landroid/widget/ImageView;

    .line 6
    .line 7
    const/4 v1, 0x1

    .line 8
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v0, v0, La/dhu0;->f:Landroid/widget/ImageView;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 18
    .line 19
    .line 20
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    iget-object v0, v0, La/dhu0;->e:Landroid/widget/ImageView;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iget-object v0, v0, La/dhu0;->e:Landroid/widget/ImageView;

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 36
    .line 37
    .line 38
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    iget-object v0, v0, La/dhu0;->c:Landroid/widget/ImageView;

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 45
    .line 46
    .line 47
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    iget-object v0, v0, La/dhu0;->c:Landroid/widget/ImageView;

    .line 52
    .line 53
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 54
    .line 55
    .line 56
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget-object v0, v0, La/dhu0;->d:Landroid/widget/ImageView;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 63
    .line 64
    .line 65
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    iget-object v0, v0, La/dhu0;->d:Landroid/widget/ImageView;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 72
    .line 73
    .line 74
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    iget-object v0, v0, La/dhu0;->b:Landroid/widget/ImageView;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 81
    .line 82
    .line 83
    invoke-direct {p0}, Lorg/xplatform/game_broadcasting/impl/presentation/views/GameBroadcastingControlPanelView;->getBinding()La/dhu0;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    iget-object p0, p0, La/dhu0;->b:Landroid/widget/ImageView;

    .line 88
    .line 89
    invoke-virtual {p0, v1}, Landroid/view/View;->setClickable(Z)V

    .line 90
    .line 91
    .line 92
    return-void
.end method
