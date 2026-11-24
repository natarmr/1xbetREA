.class public final La/nv2;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;

.field public c:F

.field public final synthetic d:La/rv2;


# direct methods
.method public constructor <init>(La/rv2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/nv2;->d:La/rv2;

    .line 5
    .line 6
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 7
    .line 8
    iput p1, p0, La/nv2;->c:F

    .line 9
    .line 10
    return-void
.end method

.method public static synthetic b(La/nv2;F)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-virtual {p0, p1, v0}, La/nv2;->a(FF)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public final a(FF)V
    .locals 7

    .line 1
    iget-object v0, p0, La/nv2;->d:La/rv2;

    .line 2
    .line 3
    iget-object v1, v0, La/rv2;->c:La/pz40;

    .line 4
    .line 5
    iget-object v2, v0, La/rv2;->f:La/agk0;

    .line 6
    .line 7
    invoke-virtual {v2}, La/agk0;->l()F

    .line 8
    .line 9
    .line 10
    move-result v3

    .line 11
    invoke-virtual {v2, p1}, La/agk0;->m(F)V

    .line 12
    .line 13
    .line 14
    iget-object v4, v0, La/rv2;->g:La/agk0;

    .line 15
    .line 16
    invoke-virtual {v4, p2}, La/agk0;->m(F)V

    .line 17
    .line 18
    .line 19
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    .line 20
    .line 21
    .line 22
    move-result p2

    .line 23
    if-eqz p2, :cond_0

    .line 24
    .line 25
    goto/16 :goto_4

    .line 26
    .line 27
    :cond_0
    cmpl-float p1, p1, v3

    .line 28
    .line 29
    const/4 p2, 0x0

    .line 30
    const/4 v3, 0x1

    .line 31
    if-ltz p1, :cond_1

    .line 32
    .line 33
    move p1, v3

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    move p1, p2

    .line 36
    :goto_0
    invoke-virtual {v0}, La/rv2;->d()La/vtj;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    move-object v5, v1

    .line 41
    check-cast v5, La/hgk0;

    .line 42
    .line 43
    invoke-virtual {v5}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v6

    .line 47
    invoke-virtual {v4, v6}, La/vtj;->d(Ljava/lang/Object;)F

    .line 48
    .line 49
    .line 50
    move-result v4

    .line 51
    invoke-virtual {v2}, La/agk0;->l()F

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    cmpg-float v4, v6, v4

    .line 56
    .line 57
    if-nez v4, :cond_5

    .line 58
    .line 59
    invoke-virtual {v2}, La/agk0;->l()F

    .line 60
    .line 61
    .line 62
    move-result p2

    .line 63
    if-eqz p1, :cond_2

    .line 64
    .line 65
    const/high16 v3, 0x3f800000    # 1.0f

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const/high16 v3, -0x40800000    # -1.0f

    .line 69
    .line 70
    :goto_1
    add-float/2addr p2, v3

    .line 71
    invoke-virtual {v0}, La/rv2;->d()La/vtj;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v3, p2, p1}, La/vtj;->b(FZ)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    if-nez p2, :cond_3

    .line 80
    .line 81
    invoke-virtual {v5}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p2

    .line 85
    :cond_3
    if-eqz p1, :cond_4

    .line 86
    .line 87
    invoke-virtual {v5}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v3

    .line 91
    iput-object v3, p0, La/nv2;->a:Ljava/lang/Object;

    .line 92
    .line 93
    iput-object p2, p0, La/nv2;->b:Ljava/lang/Object;

    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_4
    iput-object p2, p0, La/nv2;->a:Ljava/lang/Object;

    .line 97
    .line 98
    invoke-virtual {v5}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    move-result-object p2

    .line 102
    iput-object p2, p0, La/nv2;->b:Ljava/lang/Object;

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    invoke-virtual {v0}, La/rv2;->d()La/vtj;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-virtual {v2}, La/agk0;->l()F

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    invoke-virtual {v4, v6, p2}, La/vtj;->b(FZ)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object p2

    .line 117
    if-nez p2, :cond_6

    .line 118
    .line 119
    invoke-virtual {v5}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object p2

    .line 123
    :cond_6
    invoke-virtual {v0}, La/rv2;->d()La/vtj;

    .line 124
    .line 125
    .line 126
    move-result-object v4

    .line 127
    invoke-virtual {v2}, La/agk0;->l()F

    .line 128
    .line 129
    .line 130
    move-result v6

    .line 131
    invoke-virtual {v4, v6, v3}, La/vtj;->b(FZ)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    if-nez v3, :cond_7

    .line 136
    .line 137
    invoke-virtual {v5}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    :cond_7
    iput-object p2, p0, La/nv2;->a:Ljava/lang/Object;

    .line 142
    .line 143
    iput-object v3, p0, La/nv2;->b:Ljava/lang/Object;

    .line 144
    .line 145
    :goto_2
    invoke-virtual {v0}, La/rv2;->d()La/vtj;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    iget-object v3, p0, La/nv2;->a:Ljava/lang/Object;

    .line 150
    .line 151
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p2, v3}, La/vtj;->d(Ljava/lang/Object;)F

    .line 155
    .line 156
    .line 157
    move-result p2

    .line 158
    invoke-virtual {v0}, La/rv2;->d()La/vtj;

    .line 159
    .line 160
    .line 161
    move-result-object v3

    .line 162
    iget-object v4, p0, La/nv2;->b:Ljava/lang/Object;

    .line 163
    .line 164
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    invoke-virtual {v3, v4}, La/vtj;->d(Ljava/lang/Object;)F

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    sub-float/2addr p2, v3

    .line 172
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 173
    .line 174
    .line 175
    move-result p2

    .line 176
    iput p2, p0, La/nv2;->c:F

    .line 177
    .line 178
    invoke-virtual {v2}, La/agk0;->l()F

    .line 179
    .line 180
    .line 181
    move-result p2

    .line 182
    invoke-virtual {v0}, La/rv2;->d()La/vtj;

    .line 183
    .line 184
    .line 185
    move-result-object v0

    .line 186
    invoke-virtual {v5}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    invoke-virtual {v0, v2}, La/vtj;->d(Ljava/lang/Object;)F

    .line 191
    .line 192
    .line 193
    move-result v0

    .line 194
    sub-float/2addr p2, v0

    .line 195
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 196
    .line 197
    .line 198
    move-result p2

    .line 199
    iget v0, p0, La/nv2;->c:F

    .line 200
    .line 201
    const/high16 v2, 0x40000000    # 2.0f

    .line 202
    .line 203
    div-float/2addr v0, v2

    .line 204
    cmpl-float p2, p2, v0

    .line 205
    .line 206
    if-ltz p2, :cond_a

    .line 207
    .line 208
    if-eqz p1, :cond_8

    .line 209
    .line 210
    iget-object p0, p0, La/nv2;->b:Ljava/lang/Object;

    .line 211
    .line 212
    goto :goto_3

    .line 213
    :cond_8
    iget-object p0, p0, La/nv2;->a:Ljava/lang/Object;

    .line 214
    .line 215
    :goto_3
    if-nez p0, :cond_9

    .line 216
    .line 217
    invoke-virtual {v5}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    move-result-object p0

    .line 221
    :cond_9
    check-cast v1, La/hgk0;

    .line 222
    .line 223
    invoke-virtual {v1, p0}, La/hgk0;->setValue(Ljava/lang/Object;)V

    .line 224
    .line 225
    .line 226
    :cond_a
    :goto_4
    return-void
.end method
