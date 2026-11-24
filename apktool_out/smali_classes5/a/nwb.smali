.class public final La/nwb;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:B

.field public final b:B

.field public final c:Z

.field public final d:Z

.field public final e:Z

.field public final f:Z

.field public final g:Z

.field public final h:Z

.field public final i:Landroid/graphics/Paint;

.field public final j:Landroid/graphics/Paint;

.field public final k:Landroid/graphics/Paint;

.field public final l:Landroid/graphics/Paint;

.field public final m:Landroid/graphics/Paint;

.field public final n:Landroid/graphics/Paint;

.field public final o:F

.field public final p:F

.field public final q:F

.field public final r:F

.field public final s:F

.field public final t:B

.field public u:[Ljava/lang/String;

.field public v:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    sget-object v0, La/j5d;->a:Landroid/util/TypedValue;

    .line 8
    .line 9
    const v0, 0x7f040b0b

    .line 10
    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    invoke-static {p1, v0, v1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const/16 v2, 0xe

    .line 18
    .line 19
    iput-byte v2, p0, La/nwb;->a:B

    .line 20
    .line 21
    const/16 v2, 0xc

    .line 22
    .line 23
    iput-byte v2, p0, La/nwb;->b:B

    .line 24
    .line 25
    const/4 v2, 0x1

    .line 26
    iput-boolean v2, p0, La/nwb;->c:Z

    .line 27
    .line 28
    iput-boolean v2, p0, La/nwb;->d:Z

    .line 29
    .line 30
    iput-boolean v2, p0, La/nwb;->e:Z

    .line 31
    .line 32
    iput-boolean v2, p0, La/nwb;->f:Z

    .line 33
    .line 34
    iput-boolean v2, p0, La/nwb;->g:Z

    .line 35
    .line 36
    iput-boolean v2, p0, La/nwb;->h:Z

    .line 37
    .line 38
    new-instance v3, Landroid/graphics/Paint;

    .line 39
    .line 40
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 41
    .line 42
    .line 43
    const v4, 0x7f040b15

    .line 44
    .line 45
    .line 46
    invoke-static {p1, v4, v1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setColor(I)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    invoke-virtual {v5}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    const/high16 v6, 0x3f800000    # 1.0f

    .line 62
    .line 63
    invoke-static {v2, v6, v5}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 68
    .line 69
    .line 70
    iput-object v3, p0, La/nwb;->i:Landroid/graphics/Paint;

    .line 71
    .line 72
    new-instance v3, Landroid/graphics/Paint;

    .line 73
    .line 74
    invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-static {p1, v4, v1}, La/j5d;->a(Landroid/content/Context;IZ)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setColor(I)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-virtual {v1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v2, v6, v1}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-virtual {v3, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 97
    .line 98
    .line 99
    iput-object v3, p0, La/nwb;->j:Landroid/graphics/Paint;

    .line 100
    .line 101
    new-instance v1, Landroid/graphics/Paint;

    .line 102
    .line 103
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 104
    .line 105
    .line 106
    iput-object v1, p0, La/nwb;->k:Landroid/graphics/Paint;

    .line 107
    .line 108
    new-instance v1, Landroid/graphics/Paint;

    .line 109
    .line 110
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 111
    .line 112
    .line 113
    iput-object v1, p0, La/nwb;->l:Landroid/graphics/Paint;

    .line 114
    .line 115
    new-instance v1, Landroid/graphics/Paint;

    .line 116
    .line 117
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 127
    .line 128
    .line 129
    move-result-object v3

    .line 130
    const v4, 0x7f07074a

    .line 131
    .line 132
    .line 133
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 138
    .line 139
    .line 140
    iput-object v1, p0, La/nwb;->m:Landroid/graphics/Paint;

    .line 141
    .line 142
    new-instance v1, Landroid/graphics/Paint;

    .line 143
    .line 144
    invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimension(I)F

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 162
    .line 163
    .line 164
    iput-object v1, p0, La/nwb;->n:Landroid/graphics/Paint;

    .line 165
    .line 166
    const/high16 v0, 0x40a00000    # 5.0f

    .line 167
    .line 168
    invoke-static {p1, v0}, La/b8k0;->z(Landroid/content/Context;F)F

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    iput v0, p0, La/nwb;->o:F

    .line 173
    .line 174
    const/high16 v0, 0x41000000    # 8.0f

    .line 175
    .line 176
    invoke-static {p1, v0}, La/b8k0;->z(Landroid/content/Context;F)F

    .line 177
    .line 178
    .line 179
    move-result v0

    .line 180
    iput v0, p0, La/nwb;->p:F

    .line 181
    .line 182
    const/high16 v0, 0x41a00000    # 20.0f

    .line 183
    .line 184
    invoke-static {p1, v0}, La/b8k0;->z(Landroid/content/Context;F)F

    .line 185
    .line 186
    .line 187
    move-result v0

    .line 188
    iput v0, p0, La/nwb;->q:F

    .line 189
    .line 190
    const/high16 v0, 0x40c00000    # 6.0f

    .line 191
    .line 192
    invoke-static {p1, v0}, La/b8k0;->z(Landroid/content/Context;F)F

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    iput v1, p0, La/nwb;->r:F

    .line 197
    .line 198
    invoke-static {p1, v0}, La/b8k0;->z(Landroid/content/Context;F)F

    .line 199
    .line 200
    .line 201
    move-result p1

    .line 202
    iput p1, p0, La/nwb;->s:F

    .line 203
    .line 204
    const/16 p1, 0x18

    .line 205
    .line 206
    iput-byte p1, p0, La/nwb;->t:B

    .line 207
    .line 208
    return-void
.end method
