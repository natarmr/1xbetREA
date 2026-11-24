.class public final La/hsj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/hbj;
.implements La/lq80;


# instance fields
.field public a:Ljava/lang/Object;

.field public b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(La/gii0;B)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    packed-switch p2, :pswitch_data_0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/hsj;->a:Ljava/lang/Object;

    .line 11
    .line 12
    new-instance p1, La/ucj;

    .line 13
    .line 14
    const/16 p2, 0xe

    .line 15
    .line 16
    invoke-direct {p1, p0, p2}, La/ucj;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, La/hsj;->b:Ljava/lang/Object;

    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/hsj;->a:Ljava/lang/Object;

    .line 26
    .line 27
    new-instance p1, La/yip;

    .line 28
    .line 29
    const/4 p2, 0x7

    .line 30
    invoke-direct {p1, p0, p2}, La/yip;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    iput-object p1, p0, La/hsj;->b:Ljava/lang/Object;

    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, La/hsj;->a:Ljava/lang/Object;

    .line 40
    .line 41
    new-instance p1, La/ntl;

    .line 42
    .line 43
    const/16 p2, 0x15

    .line 44
    .line 45
    invoke-direct {p1, p0, p2}, La/ntl;-><init>(Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    iput-object p1, p0, La/hsj;->b:Ljava/lang/Object;

    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x7
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/j1q0;La/n31;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput-object p1, p0, La/hsj;->a:Ljava/lang/Object;

    .line 63
    iput-object p2, p0, La/hsj;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/lhf0;La/j1q0;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, La/hsj;->a:Ljava/lang/Object;

    .line 59
    iput-object p2, p0, La/hsj;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/mii0;La/gst0;)V
    .locals 0

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 55
    iput-object p1, p0, La/hsj;->a:Ljava/lang/Object;

    .line 56
    iput-object p2, p0, La/hsj;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/vby;La/us00;)V
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    iput-object p1, p0, La/hsj;->a:Ljava/lang/Object;

    .line 53
    iput-object p2, p0, La/hsj;->b:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    .line 64
    new-instance v0, La/yqc;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, La/yqc;-><init>(B)V

    .line 65
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 66
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, La/hsj;->a:Ljava/lang/Object;

    .line 67
    iput-object v0, p0, La/hsj;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 0

    .line 60
    iput-object p1, p0, La/hsj;->a:Ljava/lang/Object;

    iput-object p2, p0, La/hsj;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;La/c4m0;La/jkm;)V
    .locals 0

    .line 68
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    iput-object p2, p0, La/hsj;->a:Ljava/lang/Object;

    .line 71
    iput-object p3, p0, La/hsj;->b:Ljava/lang/Object;

    .line 72
    invoke-static {p1}, Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;->b(Lorg/xplatform/uikit/components/lottie_empty/DsLottieEmpty;)La/bby;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-static {p0}, La/e3c;->n(La/bby;)V

    .line 73
    :cond_0
    new-instance p0, La/edl;

    const/16 p3, 0x11

    invoke-direct {p0, p1, p3}, La/edl;-><init>(Ljava/lang/Object;B)V

    invoke-virtual {p2, p0}, La/pby;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)La/nwk;

    return-void
.end method


# virtual methods
.method public a(Landroid/net/Uri;La/lbj;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, La/hsj;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/lq80;

    .line 4
    .line 5
    invoke-interface {v0, p1, p2}, La/lq80;->a(Landroid/net/Uri;La/lbj;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, La/nbw;

    .line 10
    .line 11
    iget-object p0, p0, La/hsj;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p0, Ljava/util/List;

    .line 14
    .line 15
    if-eqz p0, :cond_1

    .line 16
    .line 17
    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result p2

    .line 21
    if-eqz p2, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-virtual {p1, p0}, La/nbw;->a(Ljava/util/List;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    check-cast p0, La/nbw;

    .line 29
    .line 30
    return-object p0

    .line 31
    :cond_1
    :goto_0
    return-object p1
.end method

.method public b(Ljava/util/List;)La/a8q0;
    .locals 10

    .line 1
    const/4 v1, 0x0

    .line 2
    :try_start_0
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 3
    .line 4
    .line 5
    move-result v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_2

    .line 6
    const/4 v2, 0x0

    .line 7
    move-object v3, v1

    .line 8
    :goto_0
    if-ge v2, v0, :cond_0

    .line 9
    .line 10
    :try_start_1
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    check-cast v4, La/vjn;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 15
    .line 16
    :try_start_2
    iget-object v3, p0, La/hsj;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v3, La/z55;

    .line 19
    .line 20
    invoke-interface {v4, v3}, La/vjn;->a(La/z55;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 21
    .line 22
    .line 23
    add-int/lit8 v2, v2, 0x1

    .line 24
    .line 25
    move-object v3, v4

    .line 26
    goto :goto_0

    .line 27
    :catch_0
    move-exception v0

    .line 28
    move-object v1, v4

    .line 29
    goto :goto_2

    .line 30
    :catch_1
    move-exception v0

    .line 31
    move-object v1, v3

    .line 32
    goto :goto_2

    .line 33
    :cond_0
    iget-object p1, p0, La/hsj;->b:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p1, La/z55;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v0, La/j83;

    .line 41
    .line 42
    iget-object p1, p1, La/z55;->f:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p1, La/tyc;

    .line 45
    .line 46
    invoke-virtual {p1}, La/tyc;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-direct {v0, p1}, La/j83;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object p1, p0, La/hsj;->b:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, La/z55;

    .line 56
    .line 57
    iget v2, p1, La/z55;->b:I

    .line 58
    .line 59
    iget p1, p1, La/z55;->c:I

    .line 60
    .line 61
    invoke-static {v2, p1}, La/s7n0;->e(II)J

    .line 62
    .line 63
    .line 64
    move-result-wide v2

    .line 65
    new-instance p1, La/o9q0;

    .line 66
    .line 67
    invoke-direct {p1, v2, v3}, La/o9q0;-><init>(J)V

    .line 68
    .line 69
    .line 70
    iget-object v4, p0, La/hsj;->a:Ljava/lang/Object;

    .line 71
    .line 72
    check-cast v4, La/a8q0;

    .line 73
    .line 74
    iget-wide v4, v4, La/a8q0;->b:J

    .line 75
    .line 76
    invoke-static {v4, v5}, La/o9q0;->g(J)Z

    .line 77
    .line 78
    .line 79
    move-result v4

    .line 80
    if-nez v4, :cond_1

    .line 81
    .line 82
    move-object v1, p1

    .line 83
    :cond_1
    if-eqz v1, :cond_2

    .line 84
    .line 85
    iget-wide v1, v1, La/o9q0;->a:J

    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    invoke-static {v2, v3}, La/o9q0;->e(J)I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    invoke-static {v2, v3}, La/o9q0;->f(J)I

    .line 93
    .line 94
    .line 95
    move-result v1

    .line 96
    invoke-static {p1, v1}, La/s7n0;->e(II)J

    .line 97
    .line 98
    .line 99
    move-result-wide v1

    .line 100
    :goto_1
    iget-object p1, p0, La/hsj;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, La/z55;

    .line 103
    .line 104
    invoke-virtual {p1}, La/z55;->g()La/o9q0;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    new-instance v3, La/a8q0;

    .line 109
    .line 110
    invoke-direct {v3, v0, v1, v2, p1}, La/a8q0;-><init>(La/j83;JLa/o9q0;)V

    .line 111
    .line 112
    .line 113
    iput-object v3, p0, La/hsj;->a:Ljava/lang/Object;

    .line 114
    .line 115
    return-object v3

    .line 116
    :catch_2
    move-exception v0

    .line 117
    :goto_2
    new-instance v2, Ljava/lang/RuntimeException;

    .line 118
    .line 119
    new-instance v4, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 122
    .line 123
    .line 124
    iget-object v3, p0, La/hsj;->b:Ljava/lang/Object;

    .line 125
    .line 126
    check-cast v3, La/z55;

    .line 127
    .line 128
    iget-object v3, v3, La/z55;->f:Ljava/lang/Object;

    .line 129
    .line 130
    check-cast v3, La/tyc;

    .line 131
    .line 132
    invoke-virtual {v3}, La/tyc;->B()I

    .line 133
    .line 134
    .line 135
    move-result v3

    .line 136
    iget-object v5, p0, La/hsj;->b:Ljava/lang/Object;

    .line 137
    .line 138
    check-cast v5, La/z55;

    .line 139
    .line 140
    invoke-virtual {v5}, La/z55;->g()La/o9q0;

    .line 141
    .line 142
    .line 143
    move-result-object v5

    .line 144
    iget-object v6, p0, La/hsj;->b:Ljava/lang/Object;

    .line 145
    .line 146
    check-cast v6, La/z55;

    .line 147
    .line 148
    iget v7, v6, La/z55;->b:I

    .line 149
    .line 150
    iget v6, v6, La/z55;->c:I

    .line 151
    .line 152
    invoke-static {v7, v6}, La/s7n0;->e(II)J

    .line 153
    .line 154
    .line 155
    move-result-wide v6

    .line 156
    invoke-static {v6, v7}, La/o9q0;->h(J)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    new-instance v7, Ljava/lang/StringBuilder;

    .line 161
    .line 162
    const-string v8, "Error while applying EditCommand batch to buffer (length="

    .line 163
    .line 164
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 168
    .line 169
    .line 170
    const-string v3, ", composition="

    .line 171
    .line 172
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    const-string v3, ", selection="

    .line 179
    .line 180
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    const-string v3, "):"

    .line 187
    .line 188
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 189
    .line 190
    .line 191
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v3

    .line 195
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    const/16 v3, 0xa

    .line 199
    .line 200
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 201
    .line 202
    .line 203
    new-instance v8, La/yhn;

    .line 204
    .line 205
    invoke-direct {v8, v1, p0}, La/yhn;-><init>(La/vjn;La/hsj;)V

    .line 206
    .line 207
    .line 208
    const/16 v9, 0x3c

    .line 209
    .line 210
    const-string v5, "\n"

    .line 211
    .line 212
    const/4 v6, 0x0

    .line 213
    const/4 v7, 0x0

    .line 214
    move-object v3, p1

    .line 215
    invoke-static/range {v3 .. v9}, Lkotlin/collections/CollectionsKt;->a0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-direct {v2, p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    throw v2
.end method

.method public c(La/sdq;La/sdq;)F
    .locals 4

    .line 1
    iget v0, p1, La/d3g0;->a:F

    .line 2
    .line 3
    float-to-int v0, v0

    .line 4
    iget v1, p1, La/d3g0;->b:F

    .line 5
    .line 6
    float-to-int v1, v1

    .line 7
    iget v2, p2, La/d3g0;->a:F

    .line 8
    .line 9
    float-to-int v2, v2

    .line 10
    iget v3, p2, La/d3g0;->b:F

    .line 11
    .line 12
    float-to-int v3, v3

    .line 13
    invoke-virtual {p0, v0, v1, v2, v3}, La/hsj;->w(IIII)F

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget p2, p2, La/d3g0;->a:F

    .line 18
    .line 19
    float-to-int p2, p2

    .line 20
    iget p1, p1, La/d3g0;->a:F

    .line 21
    .line 22
    float-to-int p1, p1

    .line 23
    invoke-virtual {p0, p2, v3, p1, v1}, La/hsj;->w(IIII)F

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    invoke-static {v0}, Ljava/lang/Float;->isNaN(F)Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    const/high16 p2, 0x40e00000    # 7.0f

    .line 32
    .line 33
    if-eqz p1, :cond_0

    .line 34
    .line 35
    div-float/2addr p0, p2

    .line 36
    return p0

    .line 37
    :cond_0
    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-eqz p1, :cond_1

    .line 42
    .line 43
    div-float/2addr v0, p2

    .line 44
    return v0

    .line 45
    :cond_1
    add-float/2addr v0, p0

    .line 46
    const/high16 p0, 0x41600000    # 14.0f

    .line 47
    .line 48
    div-float/2addr v0, p0

    .line 49
    return v0
.end method

.method public d()La/jbj;
    .locals 2

    .line 1
    new-instance v0, La/ntj;

    .line 2
    .line 3
    iget-object v1, p0, La/hsj;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, Landroid/content/Context;

    .line 6
    .line 7
    iget-object p0, p0, La/hsj;->b:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast p0, La/yqc;

    .line 10
    .line 11
    invoke-virtual {p0}, La/yqc;->d()La/jbj;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-direct {v0, v1, p0}, La/ntj;-><init>(Landroid/content/Context;La/jbj;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method

.method public e()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, La/hsj;->a:Ljava/lang/Object;

    .line 3
    .line 4
    iput-object v0, p0, La/hsj;->b:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method

.method public f(FFII)La/c22;
    .locals 11

    .line 1
    mul-float/2addr p2, p1

    .line 2
    float-to-int p2, p2

    .line 3
    sub-int v0, p3, p2

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    .line 7
    .line 8
    .line 9
    move-result v4

    .line 10
    iget-object v0, p0, La/hsj;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, La/r68;

    .line 13
    .line 14
    iget v2, v0, La/r68;->a:I

    .line 15
    .line 16
    const/4 v10, 0x1

    .line 17
    sub-int/2addr v2, v10

    .line 18
    add-int/2addr p3, p2

    .line 19
    invoke-static {v2, p3}, Ljava/lang/Math;->min(II)I

    .line 20
    .line 21
    .line 22
    move-result p3

    .line 23
    sub-int v6, p3, v4

    .line 24
    .line 25
    int-to-float p3, v6

    .line 26
    const/high16 v2, 0x40400000    # 3.0f

    .line 27
    .line 28
    mul-float/2addr v2, p1

    .line 29
    cmpg-float p3, p3, v2

    .line 30
    .line 31
    if-ltz p3, :cond_c

    .line 32
    .line 33
    sub-int p3, p4, p2

    .line 34
    .line 35
    invoke-static {v1, p3}, Ljava/lang/Math;->max(II)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    iget p3, v0, La/r68;->b:I

    .line 40
    .line 41
    sub-int/2addr p3, v10

    .line 42
    add-int/2addr p4, p2

    .line 43
    invoke-static {p3, p4}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    sub-int v7, p2, v5

    .line 48
    .line 49
    int-to-float p2, v7

    .line 50
    cmpg-float p2, p2, v2

    .line 51
    .line 52
    if-ltz p2, :cond_b

    .line 53
    .line 54
    new-instance v2, La/d22;

    .line 55
    .line 56
    iget-object p2, p0, La/hsj;->a:Ljava/lang/Object;

    .line 57
    .line 58
    move-object v3, p2

    .line 59
    check-cast v3, La/r68;

    .line 60
    .line 61
    iget-object p0, p0, La/hsj;->b:Ljava/lang/Object;

    .line 62
    .line 63
    move-object v9, p0

    .line 64
    check-cast v9, La/e3g0;

    .line 65
    .line 66
    move v8, p1

    .line 67
    invoke-direct/range {v2 .. v9}, La/d22;-><init>(La/r68;IIIIFLa/e3g0;)V

    .line 68
    .line 69
    .line 70
    iget p0, v2, La/d22;->e:I

    .line 71
    .line 72
    iget p1, v2, La/d22;->c:I

    .line 73
    .line 74
    add-int/2addr p0, p1

    .line 75
    iget p2, v2, La/d22;->f:I

    .line 76
    .line 77
    div-int/lit8 p3, p2, 0x2

    .line 78
    .line 79
    iget p4, v2, La/d22;->d:I

    .line 80
    .line 81
    add-int/2addr p3, p4

    .line 82
    const/4 p4, 0x3

    .line 83
    new-array p4, p4, [I

    .line 84
    .line 85
    move v0, v1

    .line 86
    :goto_0
    if-ge v0, p2, :cond_9

    .line 87
    .line 88
    and-int/lit8 v4, v0, 0x1

    .line 89
    .line 90
    const/4 v5, 0x2

    .line 91
    if-nez v4, :cond_0

    .line 92
    .line 93
    add-int/lit8 v4, v0, 0x1

    .line 94
    .line 95
    div-int/2addr v4, v5

    .line 96
    goto :goto_1

    .line 97
    :cond_0
    add-int/lit8 v4, v0, 0x1

    .line 98
    .line 99
    div-int/2addr v4, v5

    .line 100
    neg-int v4, v4

    .line 101
    :goto_1
    add-int/2addr v4, p3

    .line 102
    aput v1, p4, v1

    .line 103
    .line 104
    aput v1, p4, v10

    .line 105
    .line 106
    aput v1, p4, v5

    .line 107
    .line 108
    move v6, p1

    .line 109
    :goto_2
    if-ge v6, p0, :cond_1

    .line 110
    .line 111
    invoke-virtual {v3, v6, v4}, La/r68;->b(II)Z

    .line 112
    .line 113
    .line 114
    move-result v7

    .line 115
    if-nez v7, :cond_1

    .line 116
    .line 117
    add-int/lit8 v6, v6, 0x1

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_1
    move v7, v1

    .line 121
    :goto_3
    if-ge v6, p0, :cond_7

    .line 122
    .line 123
    invoke-virtual {v3, v6, v4}, La/r68;->b(II)Z

    .line 124
    .line 125
    .line 126
    move-result v8

    .line 127
    if-eqz v8, :cond_5

    .line 128
    .line 129
    if-ne v7, v10, :cond_2

    .line 130
    .line 131
    aget v8, p4, v10

    .line 132
    .line 133
    add-int/2addr v8, v10

    .line 134
    aput v8, p4, v10

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_2
    if-ne v7, v5, :cond_4

    .line 138
    .line 139
    invoke-virtual {v2, p4}, La/d22;->a([I)Z

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    if-eqz v7, :cond_3

    .line 144
    .line 145
    invoke-virtual {v2, v4, v6, p4}, La/d22;->b(II[I)La/c22;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    if-eqz v7, :cond_3

    .line 150
    .line 151
    return-object v7

    .line 152
    :cond_3
    aget v7, p4, v5

    .line 153
    .line 154
    aput v7, p4, v1

    .line 155
    .line 156
    aput v10, p4, v10

    .line 157
    .line 158
    aput v1, p4, v5

    .line 159
    .line 160
    move v7, v10

    .line 161
    goto :goto_4

    .line 162
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 163
    .line 164
    aget v8, p4, v7

    .line 165
    .line 166
    add-int/2addr v8, v10

    .line 167
    aput v8, p4, v7

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_5
    if-ne v7, v10, :cond_6

    .line 171
    .line 172
    add-int/lit8 v7, v7, 0x1

    .line 173
    .line 174
    :cond_6
    aget v8, p4, v7

    .line 175
    .line 176
    add-int/2addr v8, v10

    .line 177
    aput v8, p4, v7

    .line 178
    .line 179
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 180
    .line 181
    goto :goto_3

    .line 182
    :cond_7
    invoke-virtual {v2, p4}, La/d22;->a([I)Z

    .line 183
    .line 184
    .line 185
    move-result v5

    .line 186
    if-eqz v5, :cond_8

    .line 187
    .line 188
    invoke-virtual {v2, v4, p0, p4}, La/d22;->b(II[I)La/c22;

    .line 189
    .line 190
    .line 191
    move-result-object v4

    .line 192
    if-eqz v4, :cond_8

    .line 193
    .line 194
    return-object v4

    .line 195
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 196
    .line 197
    goto :goto_0

    .line 198
    :cond_9
    iget-object p0, v2, La/d22;->b:Ljava/util/ArrayList;

    .line 199
    .line 200
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 201
    .line 202
    .line 203
    move-result p1

    .line 204
    if-nez p1, :cond_a

    .line 205
    .line 206
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    move-result-object p0

    .line 210
    check-cast p0, La/c22;

    .line 211
    .line 212
    return-object p0

    .line 213
    :cond_a
    invoke-static {}, La/o660;->a()La/o660;

    .line 214
    .line 215
    .line 216
    move-result-object p0

    .line 217
    throw p0

    .line 218
    :cond_b
    invoke-static {}, La/o660;->a()La/o660;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    throw p0

    .line 223
    :cond_c
    invoke-static {}, La/o660;->a()La/o660;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    throw p0
.end method

.method public g()La/gos0;
    .locals 3

    .line 1
    iget-object v0, p0, La/hsj;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/us00;

    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "translations/ApplicationTranslations.json"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    sget-object v1, Lkotlin/text/Charsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 19
    .line 20
    new-instance v2, Ljava/io/InputStreamReader;

    .line 21
    .line 22
    invoke-direct {v2, v0, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Ljava/io/BufferedReader;

    .line 26
    .line 27
    const/16 v1, 0x2000

    .line 28
    .line 29
    invoke-direct {v0, v2, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V

    .line 30
    .line 31
    .line 32
    :try_start_0
    invoke-static {v0}, La/n8n0;->k(Ljava/io/Reader;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    invoke-interface {v0}, Ljava/io/Closeable;->close()V

    .line 37
    .line 38
    .line 39
    iget-object p0, p0, La/hsj;->a:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, La/vby;

    .line 42
    .line 43
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    sget-object v0, La/gos0;->Companion:La/zns0;

    .line 47
    .line 48
    invoke-virtual {v0}, La/zns0;->serializer()La/jiy;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    check-cast v0, La/jiy;

    .line 53
    .line 54
    invoke-virtual {p0, v0, v1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/gos0;

    .line 59
    .line 60
    return-object p0

    .line 61
    :catchall_0
    move-exception p0

    .line 62
    :try_start_1
    throw p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    :catchall_1
    move-exception v1

    .line 64
    invoke-static {v0, p0}, La/bkb;->E(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    throw v1
.end method

.method public h(Ljava/util/Set;IJJILa/zje;)Ljava/io/Serializable;
    .locals 40

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p8

    .line 4
    .line 5
    iget-object v2, v0, La/hsj;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, La/knf0;

    .line 8
    .line 9
    instance-of v3, v1, La/ybt;

    .line 10
    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    move-object v3, v1

    .line 14
    check-cast v3, La/ybt;

    .line 15
    .line 16
    iget v4, v3, La/ybt;->k:I

    .line 17
    .line 18
    const/high16 v5, -0x80000000

    .line 19
    .line 20
    and-int v6, v4, v5

    .line 21
    .line 22
    if-eqz v6, :cond_0

    .line 23
    .line 24
    sub-int/2addr v4, v5

    .line 25
    iput v4, v3, La/ybt;->k:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    new-instance v3, La/ybt;

    .line 29
    .line 30
    invoke-direct {v3, v0, v1}, La/ybt;-><init>(La/hsj;La/zje;)V

    .line 31
    .line 32
    .line 33
    :goto_0
    iget-object v1, v3, La/ybt;->i:Ljava/lang/Object;

    .line 34
    .line 35
    sget-object v4, La/wne;->a:La/wne;

    .line 36
    .line 37
    iget v5, v3, La/ybt;->k:I

    .line 38
    .line 39
    const/4 v6, 0x0

    .line 40
    const/4 v7, 0x1

    .line 41
    if-eqz v5, :cond_2

    .line 42
    .line 43
    if-ne v5, v7, :cond_1

    .line 44
    .line 45
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto/16 :goto_1

    .line 49
    .line 50
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 51
    .line 52
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    return-object v6

    .line 56
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    iget-object v0, v0, La/hsj;->a:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v0, La/nmo;

    .line 62
    .line 63
    invoke-virtual {v2}, La/knf0;->c()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual/range {p1 .. p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    new-instance v2, La/jo20;

    .line 71
    .line 72
    invoke-direct {v2}, La/jo20;-><init>()V

    .line 73
    .line 74
    .line 75
    move-object/from16 v8, p1

    .line 76
    .line 77
    check-cast v8, Ljava/lang/Iterable;

    .line 78
    .line 79
    const/4 v12, 0x0

    .line 80
    const/16 v13, 0x3f

    .line 81
    .line 82
    const/4 v9, 0x0

    .line 83
    const/4 v10, 0x0

    .line 84
    const/4 v11, 0x0

    .line 85
    invoke-static/range {v8 .. v13}, Lkotlin/collections/CollectionsKt;->b0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v5

    .line 89
    const-string v8, "ChampIds"

    .line 90
    .line 91
    invoke-virtual {v2, v8, v5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    const-string v5, "country"

    .line 95
    .line 96
    invoke-static/range {p2 .. p2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v8

    .line 100
    invoke-virtual {v2, v5, v8}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    const-string v5, "DateFrom"

    .line 104
    .line 105
    invoke-static/range {p3 .. p4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    invoke-virtual {v2, v5, v8}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    const-string v5, "DateTo"

    .line 113
    .line 114
    invoke-static/range {p5 .. p6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v8

    .line 118
    invoke-virtual {v2, v5, v8}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    const-string v5, "lng"

    .line 122
    .line 123
    invoke-virtual {v2, v5, v1}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    const-string v1, "ref"

    .line 127
    .line 128
    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    invoke-virtual {v2, v1, v5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    const-string v1, "gr"

    .line 136
    .line 137
    const/16 v5, 0x54d

    .line 138
    .line 139
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-virtual {v2, v1, v5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    const/4 v1, -0x1

    .line 147
    move/from16 v5, p7

    .line 148
    .line 149
    if-eq v5, v1, :cond_3

    .line 150
    .line 151
    const-string v1, "CyberType"

    .line 152
    .line 153
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v5

    .line 157
    invoke-virtual {v2, v1, v5}, La/jo20;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    :cond_3
    invoke-virtual {v2}, La/jo20;->b()La/jo20;

    .line 161
    .line 162
    .line 163
    move-result-object v1

    .line 164
    iput v7, v3, La/ybt;->k:I

    .line 165
    .line 166
    iget-object v0, v0, La/nmo;->a:Ljava/lang/Object;

    .line 167
    .line 168
    check-cast v0, La/wgn;

    .line 169
    .line 170
    invoke-virtual {v0}, La/wgn;->invoke()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    check-cast v0, La/lct;

    .line 175
    .line 176
    invoke-interface {v0, v1, v3}, La/lct;->a(Ljava/util/Map;La/yje;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v1

    .line 180
    if-ne v1, v4, :cond_4

    .line 181
    .line 182
    return-object v4

    .line 183
    :cond_4
    :goto_1
    check-cast v1, La/dx5;

    .line 184
    .line 185
    invoke-virtual {v1}, La/dx5;->a()Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    check-cast v0, La/kct;

    .line 190
    .line 191
    iget-object v0, v0, La/kct;->b:Ljava/util/List;

    .line 192
    .line 193
    if-eqz v0, :cond_20

    .line 194
    .line 195
    new-instance v1, Ljava/util/ArrayList;

    .line 196
    .line 197
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 198
    .line 199
    .line 200
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 201
    .line 202
    .line 203
    move-result-object v0

    .line 204
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 205
    .line 206
    .line 207
    move-result v2

    .line 208
    if-eqz v2, :cond_1f

    .line 209
    .line 210
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 211
    .line 212
    .line 213
    move-result-object v2

    .line 214
    check-cast v2, La/fct;

    .line 215
    .line 216
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 217
    .line 218
    .line 219
    iget-object v3, v2, La/fct;->c:Ljava/lang/String;

    .line 220
    .line 221
    iget-object v4, v2, La/fct;->a:Ljava/lang/Long;

    .line 222
    .line 223
    iget-object v5, v2, La/fct;->p:Ljava/lang/Long;

    .line 224
    .line 225
    if-eqz v3, :cond_5

    .line 226
    .line 227
    iget-object v3, v2, La/fct;->f:Ljava/lang/String;

    .line 228
    .line 229
    if-eqz v3, :cond_5

    .line 230
    .line 231
    if-nez v5, :cond_6

    .line 232
    .line 233
    :cond_5
    move-object/from16 p0, v0

    .line 234
    .line 235
    move-object/from16 p8, v6

    .line 236
    .line 237
    goto/16 :goto_13

    .line 238
    .line 239
    :cond_6
    if-eqz v4, :cond_1d

    .line 240
    .line 241
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 242
    .line 243
    .line 244
    move-result-wide v8

    .line 245
    invoke-virtual {v4}, Ljava/lang/Long;->longValue()J

    .line 246
    .line 247
    .line 248
    move-result-wide v10

    .line 249
    iget-object v3, v2, La/fct;->b:Ljava/lang/Long;

    .line 250
    .line 251
    const-wide/16 v12, 0x0

    .line 252
    .line 253
    if-eqz v3, :cond_7

    .line 254
    .line 255
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 256
    .line 257
    .line 258
    move-result-wide v3

    .line 259
    goto :goto_3

    .line 260
    :cond_7
    move-wide v3, v12

    .line 261
    :goto_3
    iget-object v7, v2, La/fct;->d:Ljava/lang/Long;

    .line 262
    .line 263
    if-eqz v7, :cond_8

    .line 264
    .line 265
    invoke-virtual {v7}, Ljava/lang/Long;->longValue()J

    .line 266
    .line 267
    .line 268
    move-result-wide v12

    .line 269
    :cond_8
    move-wide v14, v12

    .line 270
    iget-object v7, v2, La/fct;->e:Ljava/lang/String;

    .line 271
    .line 272
    const-string v12, ""

    .line 273
    .line 274
    if-nez v7, :cond_9

    .line 275
    .line 276
    move-object/from16 v16, v12

    .line 277
    .line 278
    goto :goto_4

    .line 279
    :cond_9
    move-object/from16 v16, v7

    .line 280
    .line 281
    :goto_4
    iget-object v7, v2, La/fct;->c:Ljava/lang/String;

    .line 282
    .line 283
    iget-object v13, v2, La/fct;->j:Ljava/util/List;

    .line 284
    .line 285
    if-nez v13, :cond_a

    .line 286
    .line 287
    sget-object v13, La/iun;->a:La/iun;

    .line 288
    .line 289
    :cond_a
    move-object/from16 v23, v13

    .line 290
    .line 291
    iget-object v13, v2, La/fct;->k:Ljava/util/List;

    .line 292
    .line 293
    if-nez v13, :cond_b

    .line 294
    .line 295
    sget-object v13, La/iun;->a:La/iun;

    .line 296
    .line 297
    :cond_b
    move-object/from16 v24, v13

    .line 298
    .line 299
    iget-object v13, v2, La/fct;->f:Ljava/lang/String;

    .line 300
    .line 301
    move-object/from16 p8, v6

    .line 302
    .line 303
    iget-object v6, v2, La/fct;->g:Ljava/lang/String;

    .line 304
    .line 305
    if-nez v6, :cond_c

    .line 306
    .line 307
    move-object/from16 v26, v12

    .line 308
    .line 309
    goto :goto_5

    .line 310
    :cond_c
    move-object/from16 v26, v6

    .line 311
    .line 312
    :goto_5
    iget-object v6, v2, La/fct;->h:Ljava/util/List;

    .line 313
    .line 314
    if-nez v6, :cond_d

    .line 315
    .line 316
    sget-object v6, La/iun;->a:La/iun;

    .line 317
    .line 318
    :cond_d
    move-object/from16 v27, v6

    .line 319
    .line 320
    iget-object v6, v2, La/fct;->i:Ljava/util/List;

    .line 321
    .line 322
    if-nez v6, :cond_e

    .line 323
    .line 324
    sget-object v6, La/iun;->a:La/iun;

    .line 325
    .line 326
    :cond_e
    move-object/from16 v28, v6

    .line 327
    .line 328
    iget-object v6, v2, La/fct;->l:Ljava/lang/String;

    .line 329
    .line 330
    if-eqz v6, :cond_f

    .line 331
    .line 332
    invoke-static {v6}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 333
    .line 334
    .line 335
    move-result-object v6

    .line 336
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object v6

    .line 340
    goto :goto_6

    .line 341
    :cond_f
    move-object/from16 v6, p8

    .line 342
    .line 343
    :goto_6
    if-nez v6, :cond_10

    .line 344
    .line 345
    move-object/from16 v29, v12

    .line 346
    .line 347
    goto :goto_7

    .line 348
    :cond_10
    move-object/from16 v29, v6

    .line 349
    .line 350
    :goto_7
    iget-object v6, v2, La/fct;->m:Ljava/lang/String;

    .line 351
    .line 352
    if-eqz v6, :cond_11

    .line 353
    .line 354
    invoke-static {v6}, Lkotlin/text/StringsKt;->u0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 355
    .line 356
    .line 357
    move-result-object v6

    .line 358
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 359
    .line 360
    .line 361
    move-result-object v6

    .line 362
    goto :goto_8

    .line 363
    :cond_11
    move-object/from16 v6, p8

    .line 364
    .line 365
    :goto_8
    if-nez v6, :cond_12

    .line 366
    .line 367
    move-object/from16 v30, v12

    .line 368
    .line 369
    goto :goto_9

    .line 370
    :cond_12
    move-object/from16 v30, v6

    .line 371
    .line 372
    :goto_9
    iget-object v6, v2, La/fct;->n:Ljava/lang/String;

    .line 373
    .line 374
    if-nez v6, :cond_13

    .line 375
    .line 376
    move-object/from16 v31, v12

    .line 377
    .line 378
    goto :goto_a

    .line 379
    :cond_13
    move-object/from16 v31, v6

    .line 380
    .line 381
    :goto_a
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    .line 382
    .line 383
    .line 384
    move-result-wide v32

    .line 385
    iget-object v5, v2, La/fct;->t:Ljava/util/HashMap;

    .line 386
    .line 387
    if-eqz v5, :cond_14

    .line 388
    .line 389
    :goto_b
    move-object/from16 v34, v5

    .line 390
    .line 391
    goto :goto_c

    .line 392
    :cond_14
    sget-object v5, La/lun;->a:La/lun;

    .line 393
    .line 394
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 395
    .line 396
    .line 397
    goto :goto_b

    .line 398
    :goto_c
    iget-object v5, v2, La/fct;->u:Ljava/lang/String;

    .line 399
    .line 400
    if-nez v5, :cond_15

    .line 401
    .line 402
    move-object/from16 v35, v12

    .line 403
    .line 404
    goto :goto_d

    .line 405
    :cond_15
    move-object/from16 v35, v5

    .line 406
    .line 407
    :goto_d
    iget-object v5, v2, La/fct;->v:Ljava/lang/Boolean;

    .line 408
    .line 409
    const/4 v6, 0x0

    .line 410
    if-eqz v5, :cond_16

    .line 411
    .line 412
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 413
    .line 414
    .line 415
    move-result v5

    .line 416
    move/from16 v36, v5

    .line 417
    .line 418
    goto :goto_e

    .line 419
    :cond_16
    move/from16 v36, v6

    .line 420
    .line 421
    :goto_e
    iget-object v5, v2, La/fct;->w:Ljava/lang/Integer;

    .line 422
    .line 423
    if-eqz v5, :cond_17

    .line 424
    .line 425
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 426
    .line 427
    .line 428
    move-result v5

    .line 429
    move/from16 v37, v5

    .line 430
    .line 431
    goto :goto_f

    .line 432
    :cond_17
    move/from16 v37, v6

    .line 433
    .line 434
    :goto_f
    iget-object v5, v2, La/fct;->q:Ljava/lang/Integer;

    .line 435
    .line 436
    if-eqz v5, :cond_18

    .line 437
    .line 438
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 439
    .line 440
    .line 441
    move-result v6

    .line 442
    :cond_18
    move/from16 v38, v6

    .line 443
    .line 444
    iget-object v2, v2, La/fct;->r:Ljava/util/List;

    .line 445
    .line 446
    if-eqz v2, :cond_1c

    .line 447
    .line 448
    new-instance v5, Ljava/util/ArrayList;

    .line 449
    .line 450
    const/16 v6, 0xa

    .line 451
    .line 452
    invoke-static {v2, v6}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 453
    .line 454
    .line 455
    move-result v6

    .line 456
    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    .line 457
    .line 458
    .line 459
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 460
    .line 461
    .line 462
    move-result-object v2

    .line 463
    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 464
    .line 465
    .line 466
    move-result v6

    .line 467
    if-eqz v6, :cond_1b

    .line 468
    .line 469
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 470
    .line 471
    .line 472
    move-result-object v6

    .line 473
    check-cast v6, La/ict;

    .line 474
    .line 475
    move-object/from16 p0, v0

    .line 476
    .line 477
    new-instance v0, La/scp;

    .line 478
    .line 479
    move-object/from16 p1, v2

    .line 480
    .line 481
    iget-object v2, v6, La/ict;->a:Ljava/lang/String;

    .line 482
    .line 483
    if-nez v2, :cond_19

    .line 484
    .line 485
    move-object v2, v12

    .line 486
    :cond_19
    iget-object v6, v6, La/ict;->b:Ljava/lang/String;

    .line 487
    .line 488
    if-nez v6, :cond_1a

    .line 489
    .line 490
    move-object v6, v12

    .line 491
    :cond_1a
    invoke-direct {v0, v2, v6}, La/scp;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 492
    .line 493
    .line 494
    invoke-virtual {v5, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 495
    .line 496
    .line 497
    move-object/from16 v0, p0

    .line 498
    .line 499
    move-object/from16 v2, p1

    .line 500
    .line 501
    goto :goto_10

    .line 502
    :cond_1b
    move-object/from16 p0, v0

    .line 503
    .line 504
    :goto_11
    move-object/from16 v39, v5

    .line 505
    .line 506
    move-object/from16 v19, v7

    .line 507
    .line 508
    goto :goto_12

    .line 509
    :cond_1c
    move-object/from16 p0, v0

    .line 510
    .line 511
    sget-object v5, La/iun;->a:La/iun;

    .line 512
    .line 513
    goto :goto_11

    .line 514
    :goto_12
    new-instance v7, La/l2g0;

    .line 515
    .line 516
    const-wide/16 v17, 0x0

    .line 517
    .line 518
    const-wide/16 v20, 0x0

    .line 519
    .line 520
    const-string v22, ""

    .line 521
    .line 522
    move-object/from16 v25, v13

    .line 523
    .line 524
    move-wide v12, v3

    .line 525
    invoke-direct/range {v7 .. v39}, La/l2g0;-><init>(JJJJLjava/lang/String;JLjava/lang/String;JLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;Ljava/lang/String;ZIILjava/util/List;)V

    .line 526
    .line 527
    .line 528
    goto :goto_14

    .line 529
    :cond_1d
    move-object/from16 p8, v6

    .line 530
    .line 531
    invoke-static/range {p8 .. p8}, La/jf4;->k(Ljava/lang/String;)V

    .line 532
    .line 533
    .line 534
    return-object p8

    .line 535
    :goto_13
    move-object/from16 v7, p8

    .line 536
    .line 537
    :goto_14
    if-eqz v7, :cond_1e

    .line 538
    .line 539
    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 540
    .line 541
    .line 542
    :cond_1e
    move-object/from16 v0, p0

    .line 543
    .line 544
    move-object/from16 v6, p8

    .line 545
    .line 546
    goto/16 :goto_2

    .line 547
    .line 548
    :cond_1f
    return-object v1

    .line 549
    :cond_20
    sget-object v0, La/iun;->a:La/iun;

    .line 550
    .line 551
    return-object v0
.end method

.method public i()D
    .locals 2

    .line 1
    iget-object v0, p0, La/hsj;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/g45;

    .line 4
    .line 5
    iget-object v0, v0, La/g45;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, La/ave;

    .line 8
    .line 9
    iget-object v0, v0, La/ave;->a:La/q4f;

    .line 10
    .line 11
    sget-object v1, La/uzt;->a:[I

    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    aget v0, v1, v0

    .line 18
    .line 19
    iget-object p0, p0, La/hsj;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, La/khf0;

    .line 22
    .line 23
    iget-object p0, p0, La/khf0;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast p0, La/lye;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    if-ne v0, v1, :cond_0

    .line 29
    .line 30
    iget-object p0, p0, La/lye;->a:La/g0f;

    .line 31
    .line 32
    iget-wide v0, p0, La/g0f;->h:D

    .line 33
    .line 34
    return-wide v0

    .line 35
    :cond_0
    iget-object p0, p0, La/lye;->a:La/g0f;

    .line 36
    .line 37
    iget-wide v0, p0, La/g0f;->g:D

    .line 38
    .line 39
    return-wide v0
.end method

.method public j(ILjava/lang/String;Ljava/lang/String;DDZZ)La/ay3;
    .locals 9

    .line 1
    move-wide v0, p6

    .line 2
    sget-object v2, La/r78;->p:La/r78;

    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v3, p0, La/hsj;->a:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v3, La/g45;

    .line 13
    .line 14
    iget-object v3, v3, La/g45;->c:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v3, La/ave;

    .line 17
    .line 18
    iget-object v3, v3, La/ave;->a:La/q4f;

    .line 19
    .line 20
    invoke-static {p2}, Lkotlin/text/StringsKt;->W(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v4

    .line 24
    if-eqz v4, :cond_0

    .line 25
    .line 26
    sget-object v4, La/q4f;->m:La/q4f;

    .line 27
    .line 28
    if-eq v3, v4, :cond_0

    .line 29
    .line 30
    sget-object p0, La/t78;->p:La/t78;

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_0
    sget-object v4, La/q4f;->m:La/q4f;

    .line 34
    .line 35
    const-wide/16 v5, 0x0

    .line 36
    .line 37
    if-ne v3, v4, :cond_7

    .line 38
    .line 39
    invoke-static {p2}, La/wvb;->O(Ljava/lang/String;)D

    .line 40
    .line 41
    .line 42
    move-result-wide v2

    .line 43
    iget-object p0, p0, La/hsj;->b:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast p0, La/ni9;

    .line 46
    .line 47
    invoke-virtual {p0, p1}, La/ni9;->a(I)La/g0f;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    iget-boolean p0, p0, La/g0f;->t:Z

    .line 52
    .line 53
    if-eqz p0, :cond_1

    .line 54
    .line 55
    const-wide/high16 p0, 0x4000000000000000L    # 2.0

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_1
    const-wide/high16 p0, 0x3ff0000000000000L    # 1.0

    .line 59
    .line 60
    :goto_0
    mul-double/2addr p0, v0

    .line 61
    cmpg-double p2, v0, v5

    .line 62
    .line 63
    if-nez p2, :cond_2

    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_2
    if-eqz p9, :cond_3

    .line 67
    .line 68
    :goto_1
    const/4 p2, 0x1

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    const/4 p2, 0x0

    .line 71
    :goto_2
    sget-object v4, La/pn40;->a:La/pn40;

    .line 72
    .line 73
    invoke-static {p4, p5}, La/pn40;->q(D)D

    .line 74
    .line 75
    .line 76
    move-result-wide v7

    .line 77
    cmpg-double v4, v2, v7

    .line 78
    .line 79
    if-gez v4, :cond_4

    .line 80
    .line 81
    cmpl-double v4, v2, v5

    .line 82
    .line 83
    if-lez v4, :cond_4

    .line 84
    .line 85
    new-instance p0, La/w78;

    .line 86
    .line 87
    invoke-static {p4, p5}, La/pn40;->q(D)D

    .line 88
    .line 89
    .line 90
    move-result-wide p1

    .line 91
    invoke-direct {p0, p3, p1, p2}, La/w78;-><init>(Ljava/lang/String;D)V

    .line 92
    .line 93
    .line 94
    return-object p0

    .line 95
    :cond_4
    if-nez p2, :cond_5

    .line 96
    .line 97
    if-nez p8, :cond_5

    .line 98
    .line 99
    invoke-static {v0, v1}, La/pn40;->q(D)D

    .line 100
    .line 101
    .line 102
    move-result-wide v0

    .line 103
    cmpl-double v0, v2, v0

    .line 104
    .line 105
    if-lez v0, :cond_5

    .line 106
    .line 107
    new-instance p2, La/v78;

    .line 108
    .line 109
    invoke-static {p0, p1}, La/pn40;->q(D)D

    .line 110
    .line 111
    .line 112
    move-result-wide p0

    .line 113
    invoke-direct {p2, p3, p0, p1}, La/v78;-><init>(Ljava/lang/String;D)V

    .line 114
    .line 115
    .line 116
    return-object p2

    .line 117
    :cond_5
    if-eqz p2, :cond_6

    .line 118
    .line 119
    new-instance p0, La/x78;

    .line 120
    .line 121
    invoke-static {p4, p5}, La/pn40;->q(D)D

    .line 122
    .line 123
    .line 124
    move-result-wide p1

    .line 125
    invoke-direct {p0, p3, p1, p2}, La/x78;-><init>(Ljava/lang/String;D)V

    .line 126
    .line 127
    .line 128
    return-object p0

    .line 129
    :cond_6
    new-instance p2, La/s78;

    .line 130
    .line 131
    invoke-static {p4, p5}, La/pn40;->q(D)D

    .line 132
    .line 133
    .line 134
    move-result-wide v0

    .line 135
    invoke-static {p0, p1}, La/pn40;->q(D)D

    .line 136
    .line 137
    .line 138
    move-result-wide p0

    .line 139
    move-wide/from16 p7, p0

    .line 140
    .line 141
    move-object p4, p2

    .line 142
    move-object/from16 p9, p3

    .line 143
    .line 144
    move-wide p5, v0

    .line 145
    invoke-direct/range {p4 .. p9}, La/s78;-><init>(DDLjava/lang/String;)V

    .line 146
    .line 147
    .line 148
    move-object p0, p4

    .line 149
    return-object p0

    .line 150
    :cond_7
    invoke-static {p2}, Lkotlin/text/b;->i(Ljava/lang/String;)Ljava/lang/Double;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    if-nez v4, :cond_8

    .line 155
    .line 156
    sget-object p0, La/u78;->p:La/u78;

    .line 157
    .line 158
    return-object p0

    .line 159
    :cond_8
    sget-object v4, La/q4f;->h:La/q4f;

    .line 160
    .line 161
    if-ne v3, v4, :cond_c

    .line 162
    .line 163
    invoke-static {p2}, La/wvb;->O(Ljava/lang/String;)D

    .line 164
    .line 165
    .line 166
    move-result-wide v3

    .line 167
    if-nez p1, :cond_9

    .line 168
    .line 169
    sget-object p2, La/pn40;->a:La/pn40;

    .line 170
    .line 171
    invoke-static {p4, p5}, La/pn40;->q(D)D

    .line 172
    .line 173
    .line 174
    move-result-wide v7

    .line 175
    cmpg-double p2, v3, v7

    .line 176
    .line 177
    if-gez p2, :cond_9

    .line 178
    .line 179
    new-instance p1, La/w78;

    .line 180
    .line 181
    invoke-static {p4, p5}, La/pn40;->q(D)D

    .line 182
    .line 183
    .line 184
    move-result-wide v0

    .line 185
    invoke-direct {p1, p3, v0, v1}, La/w78;-><init>(Ljava/lang/String;D)V

    .line 186
    .line 187
    .line 188
    return-object p1

    .line 189
    :cond_9
    if-eqz p9, :cond_a

    .line 190
    .line 191
    if-eqz p1, :cond_c

    .line 192
    .line 193
    :cond_a
    sget-object p1, La/pn40;->a:La/pn40;

    .line 194
    .line 195
    invoke-static {v0, v1}, La/pn40;->q(D)D

    .line 196
    .line 197
    .line 198
    move-result-wide p1

    .line 199
    cmpl-double p1, v3, p1

    .line 200
    .line 201
    if-lez p1, :cond_c

    .line 202
    .line 203
    invoke-static {v0, v1}, La/pn40;->q(D)D

    .line 204
    .line 205
    .line 206
    move-result-wide p1

    .line 207
    cmpg-double p1, p1, v5

    .line 208
    .line 209
    if-nez p1, :cond_b

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_b
    new-instance p1, La/v78;

    .line 213
    .line 214
    invoke-direct {p1, p3, v0, v1}, La/v78;-><init>(Ljava/lang/String;D)V

    .line 215
    .line 216
    .line 217
    return-object p1

    .line 218
    :cond_c
    :goto_3
    return-object v2
.end method

.method public k(JLjava/util/List;Ljava/util/List;Ljava/lang/String;IZ)La/vsg0;
    .locals 12

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/hsj;->b:Ljava/lang/Object;

    .line 11
    .line 12
    move-object v3, v0

    .line 13
    check-cast v3, La/n31;

    .line 14
    .line 15
    iget-object p0, p0, La/hsj;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast p0, La/j1q0;

    .line 18
    .line 19
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 20
    .line 21
    invoke-virtual {p0}, La/m1q0;->a()Z

    .line 22
    .line 23
    .line 24
    move-result v9

    .line 25
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    new-instance v1, La/l31;

    .line 29
    .line 30
    const/4 v11, 0x0

    .line 31
    move-wide v6, p1

    .line 32
    move-object v5, p3

    .line 33
    move-object/from16 v8, p4

    .line 34
    .line 35
    move-object/from16 v10, p5

    .line 36
    .line 37
    move/from16 v4, p6

    .line 38
    .line 39
    move/from16 v2, p7

    .line 40
    .line 41
    invoke-direct/range {v1 .. v11}, La/l31;-><init>(ZLa/n31;ILjava/util/List;JLjava/util/List;ZLjava/lang/String;La/yje;)V

    .line 42
    .line 43
    .line 44
    new-instance p0, La/vsg0;

    .line 45
    .line 46
    invoke-direct {p0, v1}, La/vsg0;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 47
    .line 48
    .line 49
    return-object p0
.end method

.method public l(Ljava/lang/String;Ljava/lang/String;La/zje;)Ljava/io/Serializable;
    .locals 24

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    instance-of v2, v1, La/mgu;

    .line 6
    .line 7
    if-eqz v2, :cond_0

    .line 8
    .line 9
    move-object v2, v1

    .line 10
    check-cast v2, La/mgu;

    .line 11
    .line 12
    iget v3, v2, La/mgu;->k:I

    .line 13
    .line 14
    const/high16 v4, -0x80000000

    .line 15
    .line 16
    and-int v5, v3, v4

    .line 17
    .line 18
    if-eqz v5, :cond_0

    .line 19
    .line 20
    sub-int/2addr v3, v4

    .line 21
    iput v3, v2, La/mgu;->k:I

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v2, La/mgu;

    .line 25
    .line 26
    invoke-direct {v2, v0, v1}, La/mgu;-><init>(La/hsj;La/zje;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    iget-object v1, v2, La/mgu;->i:Ljava/lang/Object;

    .line 30
    .line 31
    sget-object v3, La/wne;->a:La/wne;

    .line 32
    .line 33
    iget v4, v2, La/mgu;->k:I

    .line 34
    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    if-ne v4, v5, :cond_1

    .line 39
    .line 40
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    return-object v0

    .line 51
    :cond_2
    invoke-static {v1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object v1, v0, La/hsj;->a:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v1, La/y3v;

    .line 57
    .line 58
    iget-object v0, v0, La/hsj;->b:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, La/rpt;

    .line 61
    .line 62
    invoke-virtual {v0}, La/rpt;->a()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    iput v5, v2, La/mgu;->k:I

    .line 67
    .line 68
    move-object/from16 v4, p1

    .line 69
    .line 70
    move-object/from16 v5, p2

    .line 71
    .line 72
    invoke-virtual {v1, v0, v2, v4, v5}, La/y3v;->f(ILa/zje;Ljava/lang/String;Ljava/lang/String;)Ljava/io/Serializable;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    if-ne v1, v3, :cond_3

    .line 77
    .line 78
    return-object v3

    .line 79
    :cond_3
    :goto_1
    move-object v2, v1

    .line 80
    check-cast v2, La/n3w;

    .line 81
    .line 82
    iget-object v0, v2, La/n3w;->z1:La/hxu;

    .line 83
    .line 84
    iget-object v0, v0, La/hxu;->f:La/ivo0;

    .line 85
    .line 86
    sget-object v1, La/ivo0;->c:La/ivo0;

    .line 87
    .line 88
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_4

    .line 93
    .line 94
    iget-object v0, v2, La/n3w;->z1:La/hxu;

    .line 95
    .line 96
    iget-object v3, v0, La/hxu;->f:La/ivo0;

    .line 97
    .line 98
    iget-wide v13, v3, La/ivo0;->b:D

    .line 99
    .line 100
    const-wide/16 v3, 0x0

    .line 101
    .line 102
    const/16 v5, 0x5f

    .line 103
    .line 104
    invoke-static {v0, v1, v3, v4, v5}, La/hxu;->a(La/hxu;La/ivo0;DI)La/hxu;

    .line 105
    .line 106
    .line 107
    move-result-object v20

    .line 108
    const v22, -0x8001

    .line 109
    .line 110
    .line 111
    const v23, -0x100001

    .line 112
    .line 113
    .line 114
    const/4 v3, 0x0

    .line 115
    const-wide/16 v4, 0x0

    .line 116
    .line 117
    const/4 v6, 0x0

    .line 118
    const/4 v7, 0x0

    .line 119
    const-wide/16 v8, 0x0

    .line 120
    .line 121
    const/4 v10, 0x0

    .line 122
    const-wide/16 v11, 0x0

    .line 123
    .line 124
    const/4 v15, 0x0

    .line 125
    const/16 v16, 0x0

    .line 126
    .line 127
    const/16 v17, 0x0

    .line 128
    .line 129
    const/16 v18, 0x0

    .line 130
    .line 131
    const/16 v19, 0x0

    .line 132
    .line 133
    const/16 v21, 0x0

    .line 134
    .line 135
    invoke-static/range {v2 .. v23}, La/n3w;->d(La/n3w;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;JLa/e4f;DDLjava/lang/String;Ljava/lang/String;La/q4f;ZLjava/lang/String;La/hxu;Ljava/util/List;II)La/n3w;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    return-object v0

    .line 140
    :cond_4
    return-object v2
.end method

.method public m(JJLa/zje;)Ljava/lang/Enum;
    .locals 10

    .line 1
    instance-of v0, p5, La/d8u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/d8u;

    .line 7
    .line 8
    iget v1, v0, La/d8u;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/d8u;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/d8u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p5}, La/d8u;-><init>(La/hsj;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p5, v0, La/d8u;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/d8u;->n:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x0

    .line 33
    const/4 v5, 0x1

    .line 34
    const/4 v6, 0x2

    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    if-eq v2, v5, :cond_2

    .line 38
    .line 39
    if-ne v2, v6, :cond_1

    .line 40
    .line 41
    iget p0, v0, La/d8u;->k:I

    .line 42
    .line 43
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    return-object v3

    .line 53
    :cond_2
    iget-wide p3, v0, La/d8u;->j:J

    .line 54
    .line 55
    iget-wide p1, v0, La/d8u;->i:J

    .line 56
    .line 57
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_3
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    iget-object p5, p0, La/hsj;->a:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast p5, La/zfo;

    .line 67
    .line 68
    iput-wide p1, v0, La/d8u;->i:J

    .line 69
    .line 70
    iput-wide p3, v0, La/d8u;->j:J

    .line 71
    .line 72
    iput v5, v0, La/d8u;->n:I

    .line 73
    .line 74
    invoke-virtual {p5, v0}, La/zfo;->b(La/yje;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p5

    .line 78
    if-ne p5, v1, :cond_4

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    :goto_1
    check-cast p5, Ljava/lang/Iterable;

    .line 82
    .line 83
    invoke-interface {p5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 84
    .line 85
    .line 86
    move-result-object p5

    .line 87
    :cond_5
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    if-eqz v2, :cond_6

    .line 92
    .line 93
    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    move-object v5, v2

    .line 98
    check-cast v5, La/ueo;

    .line 99
    .line 100
    iget-wide v7, v5, La/ueo;->a:J

    .line 101
    .line 102
    cmp-long v5, v7, p1

    .line 103
    .line 104
    if-nez v5, :cond_5

    .line 105
    .line 106
    move-object v3, v2

    .line 107
    :cond_6
    check-cast v3, La/ueo;

    .line 108
    .line 109
    if-eqz v3, :cond_7

    .line 110
    .line 111
    iget p5, v3, La/ueo;->d:I

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_7
    move p5, v4

    .line 115
    :goto_2
    iget-object p0, p0, La/hsj;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast p0, La/edo;

    .line 118
    .line 119
    iput-wide p1, v0, La/d8u;->i:J

    .line 120
    .line 121
    iput-wide p3, v0, La/d8u;->j:J

    .line 122
    .line 123
    iput p5, v0, La/d8u;->k:I

    .line 124
    .line 125
    iput v6, v0, La/d8u;->n:I

    .line 126
    .line 127
    invoke-virtual {p0, p3, p4, v0}, La/edo;->a(JLa/zje;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    if-ne p0, v1, :cond_8

    .line 132
    .line 133
    :goto_3
    return-object v1

    .line 134
    :cond_8
    move v9, p5

    .line 135
    move-object p5, p0

    .line 136
    move p0, v9

    .line 137
    :goto_4
    check-cast p5, La/xco;

    .line 138
    .line 139
    if-eqz p5, :cond_9

    .line 140
    .line 141
    iget-boolean v4, p5, La/xco;->e:Z

    .line 142
    .line 143
    :cond_9
    if-eqz v4, :cond_a

    .line 144
    .line 145
    sget-object p0, La/fho;->b:La/fho;

    .line 146
    .line 147
    return-object p0

    .line 148
    :cond_a
    if-ne p0, v6, :cond_b

    .line 149
    .line 150
    sget-object p0, La/fho;->c:La/fho;

    .line 151
    .line 152
    return-object p0

    .line 153
    :cond_b
    const/4 p1, 0x3

    .line 154
    if-ne p0, p1, :cond_c

    .line 155
    .line 156
    sget-object p0, La/fho;->d:La/fho;

    .line 157
    .line 158
    return-object p0

    .line 159
    :cond_c
    sget-object p0, La/fho;->a:La/fho;

    .line 160
    .line 161
    return-object p0
.end method

.method public n(ILa/zje;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p2, La/w2u;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/w2u;

    .line 7
    .line 8
    iget v1, v0, La/w2u;->n:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/w2u;->n:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/w2u;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/w2u;-><init>(La/hsj;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/w2u;->l:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/w2u;->n:I

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v5, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 41
    .line 42
    .line 43
    return-object p2

    .line 44
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    return-object v3

    .line 50
    :cond_2
    iget p1, v0, La/w2u;->j:I

    .line 51
    .line 52
    iget p0, v0, La/w2u;->i:I

    .line 53
    .line 54
    iget-object v2, v0, La/w2u;->k:La/cyu;

    .line 55
    .line 56
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    iget-object p2, p0, La/hsj;->a:Ljava/lang/Object;

    .line 64
    .line 65
    move-object v2, p2

    .line 66
    check-cast v2, La/cyu;

    .line 67
    .line 68
    iget-object p0, p0, La/hsj;->b:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p0, La/sjl0;

    .line 71
    .line 72
    iput-object v2, v0, La/w2u;->k:La/cyu;

    .line 73
    .line 74
    iput p1, v0, La/w2u;->i:I

    .line 75
    .line 76
    iput p1, v0, La/w2u;->j:I

    .line 77
    .line 78
    iput v5, v0, La/w2u;->n:I

    .line 79
    .line 80
    invoke-virtual {p0, v0}, La/sjl0;->d(La/zje;)Ljava/io/Serializable;

    .line 81
    .line 82
    .line 83
    move-result-object p2

    .line 84
    if-ne p2, v1, :cond_4

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move p0, p1

    .line 88
    :goto_1
    check-cast p2, Ljava/util/List;

    .line 89
    .line 90
    iput-object v3, v0, La/w2u;->k:La/cyu;

    .line 91
    .line 92
    iput p0, v0, La/w2u;->i:I

    .line 93
    .line 94
    iput v4, v0, La/w2u;->n:I

    .line 95
    .line 96
    invoke-virtual {v2, p1, v0, p2}, La/cyu;->l(ILa/zje;Ljava/util/List;)Ljava/io/Serializable;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    if-ne p0, v1, :cond_5

    .line 101
    .line 102
    :goto_2
    return-object v1

    .line 103
    :cond_5
    return-object p0
.end method

.method public o(JJLa/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p5, La/prt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p5

    .line 6
    check-cast v0, La/prt;

    .line 7
    .line 8
    iget v1, v0, La/prt;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/prt;->o:I

    .line 18
    .line 19
    :goto_0
    move-object v6, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/prt;

    .line 22
    .line 23
    invoke-direct {v0, p0, p5}, La/prt;-><init>(La/hsj;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object p5, v6, La/prt;->m:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v0, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v1, v6, La/prt;->o:I

    .line 32
    .line 33
    const/4 v7, 0x2

    .line 34
    const/4 v2, 0x1

    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    if-eq v1, v2, :cond_2

    .line 38
    .line 39
    if-ne v1, v7, :cond_1

    .line 40
    .line 41
    iget-wide p0, v6, La/prt;->l:D

    .line 42
    .line 43
    iget-object p2, v6, La/prt;->k:La/ig5;

    .line 44
    .line 45
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    goto :goto_4

    .line 49
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 50
    .line 51
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    const/4 p0, 0x0

    .line 55
    return-object p0

    .line 56
    :cond_2
    iget-wide p3, v6, La/prt;->j:J

    .line 57
    .line 58
    iget-wide p1, v6, La/prt;->i:J

    .line 59
    .line 60
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    invoke-static {p5}, La/z1x;->P(Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    iget-object p5, p0, La/hsj;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p5, La/qrt;

    .line 70
    .line 71
    iput-wide p1, v6, La/prt;->i:J

    .line 72
    .line 73
    iput-wide p3, v6, La/prt;->j:J

    .line 74
    .line 75
    iput v2, v6, La/prt;->o:I

    .line 76
    .line 77
    iget-object v1, p5, La/qrt;->a:La/fuj0;

    .line 78
    .line 79
    move-wide v2, p1

    .line 80
    move-wide v4, p3

    .line 81
    invoke-virtual/range {v1 .. v6}, La/fuj0;->p(JJLa/zje;)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object p5

    .line 85
    if-ne p5, v0, :cond_4

    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_4
    move-wide p1, v2

    .line 89
    move-wide p3, v4

    .line 90
    :goto_2
    check-cast p5, La/ig5;

    .line 91
    .line 92
    iget-wide v1, p5, La/ig5;->a:D

    .line 93
    .line 94
    iget-object p0, p0, La/hsj;->b:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast p0, La/q0u;

    .line 97
    .line 98
    iget-object v3, p5, La/ig5;->b:Ljava/lang/String;

    .line 99
    .line 100
    iput-object p5, v6, La/prt;->k:La/ig5;

    .line 101
    .line 102
    iput-wide p1, v6, La/prt;->i:J

    .line 103
    .line 104
    iput-wide p3, v6, La/prt;->j:J

    .line 105
    .line 106
    iput-wide v1, v6, La/prt;->l:D

    .line 107
    .line 108
    iput v7, v6, La/prt;->o:I

    .line 109
    .line 110
    invoke-virtual {p0, v3, v6}, La/q0u;->a(Ljava/lang/String;La/zje;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    if-ne p0, v0, :cond_5

    .line 115
    .line 116
    :goto_3
    return-object v0

    .line 117
    :cond_5
    move-object p2, p5

    .line 118
    move-object p5, p0

    .line 119
    move-wide p0, v1

    .line 120
    :goto_4
    check-cast p5, Ljava/lang/String;

    .line 121
    .line 122
    iget-boolean p2, p2, La/ig5;->c:Z

    .line 123
    .line 124
    new-instance p3, La/ig5;

    .line 125
    .line 126
    invoke-direct {p3, p0, p1, p5, p2}, La/ig5;-><init>(DLjava/lang/String;Z)V

    .line 127
    .line 128
    .line 129
    return-object p3
.end method

.method public p(JLa/zje;Z)Ljava/lang/Object;
    .locals 19

    .line 1
    move-object/from16 v0, p3

    .line 2
    .line 3
    instance-of v1, v0, La/zau;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-object v1, v0

    .line 8
    check-cast v1, La/zau;

    .line 9
    .line 10
    iget v2, v1, La/zau;->p:I

    .line 11
    .line 12
    const/high16 v3, -0x80000000

    .line 13
    .line 14
    and-int v4, v2, v3

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    sub-int/2addr v2, v3

    .line 19
    iput v2, v1, La/zau;->p:I

    .line 20
    .line 21
    move-object/from16 v2, p0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v1, La/zau;

    .line 25
    .line 26
    move-object/from16 v2, p0

    .line 27
    .line 28
    invoke-direct {v1, v2, v0}, La/zau;-><init>(La/hsj;La/zje;)V

    .line 29
    .line 30
    .line 31
    :goto_0
    iget-object v0, v1, La/zau;->n:Ljava/lang/Object;

    .line 32
    .line 33
    sget-object v3, La/wne;->a:La/wne;

    .line 34
    .line 35
    iget v4, v1, La/zau;->p:I

    .line 36
    .line 37
    const/4 v5, 0x2

    .line 38
    const/4 v6, 0x0

    .line 39
    const/4 v7, 0x1

    .line 40
    if-eqz v4, :cond_4

    .line 41
    .line 42
    if-eq v4, v7, :cond_3

    .line 43
    .line 44
    if-ne v4, v5, :cond_2

    .line 45
    .line 46
    iget v2, v1, La/zau;->m:I

    .line 47
    .line 48
    iget v4, v1, La/zau;->l:I

    .line 49
    .line 50
    iget-boolean v8, v1, La/zau;->j:Z

    .line 51
    .line 52
    iget-wide v9, v1, La/zau;->i:J

    .line 53
    .line 54
    iget-object v11, v1, La/zau;->k:La/hsj;

    .line 55
    .line 56
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    move/from16 v18, v4

    .line 60
    .line 61
    move-object v4, v1

    .line 62
    move v1, v8

    .line 63
    move v8, v2

    .line 64
    move-object v2, v11

    .line 65
    move/from16 v11, v18

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_2
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 69
    .line 70
    invoke-static {v0}, La/jf4;->n(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    return-object v0

    .line 75
    :cond_3
    iget v2, v1, La/zau;->m:I

    .line 76
    .line 77
    iget v4, v1, La/zau;->l:I

    .line 78
    .line 79
    iget-boolean v8, v1, La/zau;->j:Z

    .line 80
    .line 81
    iget-wide v9, v1, La/zau;->i:J

    .line 82
    .line 83
    iget-object v11, v1, La/zau;->k:La/hsj;

    .line 84
    .line 85
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    .line 88
    goto/16 :goto_2

    .line 89
    .line 90
    :catchall_0
    move-exception v0

    .line 91
    goto/16 :goto_5

    .line 92
    .line 93
    :cond_4
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    move-wide/from16 v9, p1

    .line 97
    .line 98
    move-object v4, v1

    .line 99
    move v8, v6

    .line 100
    move v11, v8

    .line 101
    move/from16 v1, p4

    .line 102
    .line 103
    :goto_1
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 104
    .line 105
    iget-object v0, v2, La/hsj;->a:Ljava/lang/Object;

    .line 106
    .line 107
    check-cast v0, La/u8u;

    .line 108
    .line 109
    sget-object v12, La/uaq0;->a:La/s9m0;

    .line 110
    .line 111
    iget-object v13, v2, La/hsj;->b:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v13, La/wyu;

    .line 114
    .line 115
    invoke-virtual {v13}, La/wyu;->a()La/uaq0;

    .line 116
    .line 117
    .line 118
    move-result-object v13

    .line 119
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    invoke-static {v13}, La/s9m0;->j(La/uaq0;)Z

    .line 123
    .line 124
    .line 125
    move-result v12

    .line 126
    xor-int/2addr v12, v7

    .line 127
    iput-object v2, v4, La/zau;->k:La/hsj;

    .line 128
    .line 129
    iput-wide v9, v4, La/zau;->i:J

    .line 130
    .line 131
    iput-boolean v1, v4, La/zau;->j:Z

    .line 132
    .line 133
    iput v11, v4, La/zau;->l:I

    .line 134
    .line 135
    iput v8, v4, La/zau;->m:I

    .line 136
    .line 137
    iput v7, v4, La/zau;->p:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 138
    .line 139
    :try_start_2
    iget-object v13, v0, La/u8u;->c:Ljava/lang/Object;

    .line 140
    .line 141
    check-cast v13, La/jr0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 142
    .line 143
    move v14, v8

    .line 144
    move-object v8, v13

    .line 145
    :try_start_3
    sget-object v13, La/uzb0;->a:La/uzb0;

    .line 146
    .line 147
    iget-object v0, v0, La/u8u;->b:Ljava/lang/Object;

    .line 148
    .line 149
    check-cast v0, La/j1q0;

    .line 150
    .line 151
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 152
    .line 153
    invoke-virtual {v0}, La/m1q0;->a()Z

    .line 154
    .line 155
    .line 156
    move-result v15
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 157
    move/from16 v16, v14

    .line 158
    .line 159
    :try_start_4
    const-string v14, ""
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 160
    .line 161
    move/from16 v17, v11

    .line 162
    .line 163
    move v11, v12

    .line 164
    const v12, 0x7fffffff

    .line 165
    .line 166
    .line 167
    move/from16 v18, v16

    .line 168
    .line 169
    move-object/from16 v16, v4

    .line 170
    .line 171
    move/from16 v4, v18

    .line 172
    .line 173
    :try_start_5
    invoke-virtual/range {v8 .. v16}, La/jr0;->c(JZILa/uzb0;Ljava/lang/String;ZLa/zje;)Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 177
    if-ne v0, v3, :cond_5

    .line 178
    .line 179
    goto/16 :goto_9

    .line 180
    .line 181
    :cond_5
    move v8, v1

    .line 182
    move-object v11, v2

    .line 183
    move v2, v4

    .line 184
    move-object/from16 v1, v16

    .line 185
    .line 186
    move/from16 v4, v17

    .line 187
    .line 188
    :goto_2
    :try_start_6
    check-cast v0, La/mi1;

    .line 189
    .line 190
    sget-object v1, La/j0g0;->b:La/e0g0;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 191
    .line 192
    goto/16 :goto_b

    .line 193
    .line 194
    :catchall_1
    move-exception v0

    .line 195
    goto :goto_3

    .line 196
    :catchall_2
    move-exception v0

    .line 197
    move/from16 v17, v16

    .line 198
    .line 199
    move-object/from16 v16, v4

    .line 200
    .line 201
    move/from16 v4, v17

    .line 202
    .line 203
    goto :goto_4

    .line 204
    :catchall_3
    move-exception v0

    .line 205
    move-object/from16 v16, v4

    .line 206
    .line 207
    move/from16 v17, v11

    .line 208
    .line 209
    move v4, v14

    .line 210
    goto :goto_3

    .line 211
    :catchall_4
    move-exception v0

    .line 212
    move-object/from16 v16, v4

    .line 213
    .line 214
    move v4, v8

    .line 215
    goto :goto_4

    .line 216
    :goto_3
    move v8, v1

    .line 217
    move-object v11, v2

    .line 218
    move v2, v4

    .line 219
    move-object/from16 v1, v16

    .line 220
    .line 221
    move/from16 v4, v17

    .line 222
    .line 223
    goto :goto_5

    .line 224
    :catchall_5
    move-exception v0

    .line 225
    move-object/from16 v16, v4

    .line 226
    .line 227
    move v4, v8

    .line 228
    :goto_4
    move/from16 v17, v11

    .line 229
    .line 230
    goto :goto_3

    .line 231
    :goto_5
    if-eqz v4, :cond_6

    .line 232
    .line 233
    instance-of v12, v0, La/zhi0;

    .line 234
    .line 235
    if-eqz v12, :cond_6

    .line 236
    .line 237
    move-object v12, v0

    .line 238
    check-cast v12, La/zhi0;

    .line 239
    .line 240
    iget-boolean v12, v12, La/zhi0;->e:Z

    .line 241
    .line 242
    if-eqz v12, :cond_6

    .line 243
    .line 244
    move v12, v7

    .line 245
    goto :goto_6

    .line 246
    :cond_6
    move v12, v6

    .line 247
    :goto_6
    instance-of v13, v0, Ljava/util/concurrent/CancellationException;

    .line 248
    .line 249
    if-nez v13, :cond_e

    .line 250
    .line 251
    instance-of v13, v0, Ljava/net/ConnectException;

    .line 252
    .line 253
    if-nez v13, :cond_e

    .line 254
    .line 255
    if-nez v12, :cond_e

    .line 256
    .line 257
    instance-of v12, v0, La/zhi0;

    .line 258
    .line 259
    if-eqz v12, :cond_9

    .line 260
    .line 261
    move-object v12, v0

    .line 262
    check-cast v12, La/zhi0;

    .line 263
    .line 264
    iget-boolean v13, v12, La/zhi0;->f:Z

    .line 265
    .line 266
    if-nez v13, :cond_8

    .line 267
    .line 268
    iget-boolean v12, v12, La/zhi0;->e:Z

    .line 269
    .line 270
    if-eqz v12, :cond_7

    .line 271
    .line 272
    goto :goto_7

    .line 273
    :cond_7
    move v12, v6

    .line 274
    goto :goto_8

    .line 275
    :cond_8
    :goto_7
    move v12, v7

    .line 276
    goto :goto_8

    .line 277
    :cond_9
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 278
    .line 279
    .line 280
    move-result v12

    .line 281
    if-nez v12, :cond_7

    .line 282
    .line 283
    goto :goto_7

    .line 284
    :goto_8
    add-int/2addr v2, v7

    .line 285
    const/4 v13, 0x3

    .line 286
    if-gt v2, v13, :cond_b

    .line 287
    .line 288
    if-eqz v12, :cond_a

    .line 289
    .line 290
    goto :goto_a

    .line 291
    :cond_a
    const-string v12, "error ("

    .line 292
    .line 293
    const-string v13, "): "

    .line 294
    .line 295
    invoke-static {v2, v12, v13, v0}, La/b1j;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object v0

    .line 299
    sget-object v12, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 300
    .line 301
    invoke-virtual {v12, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 302
    .line 303
    .line 304
    iput-object v11, v1, La/zau;->k:La/hsj;

    .line 305
    .line 306
    iput-wide v9, v1, La/zau;->i:J

    .line 307
    .line 308
    iput-boolean v8, v1, La/zau;->j:Z

    .line 309
    .line 310
    iput v4, v1, La/zau;->l:I

    .line 311
    .line 312
    iput v2, v1, La/zau;->m:I

    .line 313
    .line 314
    iput v5, v1, La/zau;->p:I

    .line 315
    .line 316
    const-wide/16 v12, 0xbb8

    .line 317
    .line 318
    invoke-static {v12, v13, v1}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    if-ne v0, v3, :cond_1

    .line 323
    .line 324
    :goto_9
    return-object v3

    .line 325
    :cond_b
    :goto_a
    sget-object v1, La/j0g0;->b:La/e0g0;

    .line 326
    .line 327
    new-instance v1, La/g0g0;

    .line 328
    .line 329
    invoke-direct {v1, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 330
    .line 331
    .line 332
    move-object v0, v1

    .line 333
    :goto_b
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 334
    .line 335
    .line 336
    check-cast v0, La/mi1;

    .line 337
    .line 338
    iget-object v0, v0, La/mi1;->b:Ljava/util/List;

    .line 339
    .line 340
    new-instance v1, Ljava/util/ArrayList;

    .line 341
    .line 342
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 343
    .line 344
    .line 345
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 346
    .line 347
    .line 348
    move-result-object v0

    .line 349
    :cond_c
    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 350
    .line 351
    .line 352
    move-result v2

    .line 353
    if-eqz v2, :cond_d

    .line 354
    .line 355
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 356
    .line 357
    .line 358
    move-result-object v2

    .line 359
    move-object v3, v2

    .line 360
    check-cast v3, La/x2q;

    .line 361
    .line 362
    iget-object v4, v3, La/x2q;->c:La/w3q;

    .line 363
    .line 364
    sget-object v5, La/w3q;->a:La/w3q;

    .line 365
    .line 366
    if-ne v4, v5, :cond_c

    .line 367
    .line 368
    iget-object v3, v3, La/x2q;->d:Ljava/util/List;

    .line 369
    .line 370
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 371
    .line 372
    .line 373
    move-result v3

    .line 374
    if-nez v3, :cond_c

    .line 375
    .line 376
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 377
    .line 378
    .line 379
    goto :goto_c

    .line 380
    :cond_d
    new-instance v0, La/mi1;

    .line 381
    .line 382
    invoke-direct {v0, v9, v10, v1}, La/mi1;-><init>(JLjava/util/List;)V

    .line 383
    .line 384
    .line 385
    return-object v0

    .line 386
    :cond_e
    throw v0
.end method

.method public q(ZLa/zje;)Ljava/lang/Object;
    .locals 12

    .line 1
    instance-of v0, p2, La/you;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/you;

    .line 7
    .line 8
    iget v1, v0, La/you;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/you;->o:I

    .line 18
    .line 19
    :goto_0
    move-object p2, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    new-instance v0, La/you;

    .line 22
    .line 23
    invoke-direct {v0, p0, p2}, La/you;-><init>(La/hsj;La/zje;)V

    .line 24
    .line 25
    .line 26
    goto :goto_0

    .line 27
    :goto_1
    iget-object v0, p2, La/you;->m:Ljava/lang/Object;

    .line 28
    .line 29
    sget-object v1, La/wne;->a:La/wne;

    .line 30
    .line 31
    iget v2, p2, La/you;->o:I

    .line 32
    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x1

    .line 36
    if-eqz v2, :cond_4

    .line 37
    .line 38
    if-eq v2, v5, :cond_3

    .line 39
    .line 40
    if-ne v2, v3, :cond_2

    .line 41
    .line 42
    iget p0, p2, La/you;->l:I

    .line 43
    .line 44
    iget p1, p2, La/you;->k:I

    .line 45
    .line 46
    iget-boolean v2, p2, La/you;->i:Z

    .line 47
    .line 48
    iget-object v6, p2, La/you;->j:La/hsj;

    .line 49
    .line 50
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    :cond_1
    move v11, v2

    .line 54
    move-object v2, p2

    .line 55
    move p2, p1

    .line 56
    move p1, p0

    .line 57
    move-object p0, v6

    .line 58
    goto :goto_2

    .line 59
    :cond_2
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 60
    .line 61
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return-object p0

    .line 66
    :cond_3
    iget p0, p2, La/you;->l:I

    .line 67
    .line 68
    iget p1, p2, La/you;->k:I

    .line 69
    .line 70
    iget-boolean v2, p2, La/you;->i:Z

    .line 71
    .line 72
    iget-object v6, p2, La/you;->j:La/hsj;

    .line 73
    .line 74
    :try_start_0
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :catchall_0
    move-exception v0

    .line 79
    goto :goto_5

    .line 80
    :cond_4
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    move v11, p1

    .line 84
    move-object v2, p2

    .line 85
    move p1, v4

    .line 86
    move p2, p1

    .line 87
    :goto_2
    :try_start_1
    sget-object v0, La/j0g0;->b:La/e0g0;

    .line 88
    .line 89
    iget-object v0, p0, La/hsj;->b:Ljava/lang/Object;

    .line 90
    .line 91
    move-object v9, v0

    .line 92
    check-cast v9, La/n660;

    .line 93
    .line 94
    iget-object v0, p0, La/hsj;->a:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, La/j1q0;

    .line 97
    .line 98
    iget-object v0, v0, La/j1q0;->a:La/m1q0;

    .line 99
    .line 100
    invoke-virtual {v0}, La/m1q0;->a()Z

    .line 101
    .line 102
    .line 103
    move-result v10

    .line 104
    iput-object p0, v2, La/you;->j:La/hsj;

    .line 105
    .line 106
    iput-boolean v11, v2, La/you;->i:Z

    .line 107
    .line 108
    iput p2, v2, La/you;->k:I

    .line 109
    .line 110
    iput p1, v2, La/you;->l:I

    .line 111
    .line 112
    iput v5, v2, La/you;->o:I

    .line 113
    .line 114
    iget-object v0, v9, La/n660;->a:Ljava/lang/Object;

    .line 115
    .line 116
    check-cast v0, La/mne;

    .line 117
    .line 118
    iget-object v0, v0, La/mne;->b:La/dvj;

    .line 119
    .line 120
    new-instance v6, La/no0;

    .line 121
    .line 122
    const/4 v7, 0x3

    .line 123
    const/4 v8, 0x0

    .line 124
    invoke-direct/range {v6 .. v11}, La/no0;-><init>(BLa/yje;Ljava/lang/Object;ZZ)V

    .line 125
    .line 126
    .line 127
    invoke-static {v0, v6, v2}, La/qjj;->d0(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;La/yje;)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 131
    if-ne v0, v1, :cond_5

    .line 132
    .line 133
    goto/16 :goto_9

    .line 134
    .line 135
    :cond_5
    move-object v6, p0

    .line 136
    move p0, p1

    .line 137
    move p1, p2

    .line 138
    move-object p2, v2

    .line 139
    move v2, v11

    .line 140
    :goto_3
    :try_start_2
    check-cast v0, La/vhc0;

    .line 141
    .line 142
    sget-object p0, La/j0g0;->b:La/e0g0;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 143
    .line 144
    goto/16 :goto_b

    .line 145
    .line 146
    :goto_4
    move-object v6, p0

    .line 147
    move p0, p1

    .line 148
    move p1, p2

    .line 149
    move-object p2, v2

    .line 150
    move v2, v11

    .line 151
    goto :goto_5

    .line 152
    :catchall_1
    move-exception v0

    .line 153
    goto :goto_4

    .line 154
    :goto_5
    if-eqz p1, :cond_6

    .line 155
    .line 156
    instance-of v7, v0, La/zhi0;

    .line 157
    .line 158
    if-eqz v7, :cond_6

    .line 159
    .line 160
    move-object v7, v0

    .line 161
    check-cast v7, La/zhi0;

    .line 162
    .line 163
    iget-boolean v7, v7, La/zhi0;->e:Z

    .line 164
    .line 165
    if-eqz v7, :cond_6

    .line 166
    .line 167
    move v7, v5

    .line 168
    goto :goto_6

    .line 169
    :cond_6
    move v7, v4

    .line 170
    :goto_6
    instance-of v8, v0, Ljava/util/concurrent/CancellationException;

    .line 171
    .line 172
    if-nez v8, :cond_c

    .line 173
    .line 174
    instance-of v8, v0, Ljava/net/ConnectException;

    .line 175
    .line 176
    if-nez v8, :cond_c

    .line 177
    .line 178
    if-nez v7, :cond_c

    .line 179
    .line 180
    instance-of v7, v0, La/zhi0;

    .line 181
    .line 182
    if-eqz v7, :cond_9

    .line 183
    .line 184
    move-object v7, v0

    .line 185
    check-cast v7, La/zhi0;

    .line 186
    .line 187
    iget-boolean v8, v7, La/zhi0;->f:Z

    .line 188
    .line 189
    if-nez v8, :cond_8

    .line 190
    .line 191
    iget-boolean v7, v7, La/zhi0;->e:Z

    .line 192
    .line 193
    if-eqz v7, :cond_7

    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_7
    move v7, v4

    .line 197
    goto :goto_8

    .line 198
    :cond_8
    :goto_7
    move v7, v5

    .line 199
    goto :goto_8

    .line 200
    :cond_9
    invoke-static {v0}, La/hic;->C(Ljava/lang/Throwable;)Z

    .line 201
    .line 202
    .line 203
    move-result v7

    .line 204
    if-nez v7, :cond_7

    .line 205
    .line 206
    goto :goto_7

    .line 207
    :goto_8
    add-int/2addr p0, v5

    .line 208
    const/4 v8, 0x3

    .line 209
    if-gt p0, v8, :cond_b

    .line 210
    .line 211
    if-eqz v7, :cond_a

    .line 212
    .line 213
    goto :goto_a

    .line 214
    :cond_a
    const-string v7, "error ("

    .line 215
    .line 216
    const-string v8, "): "

    .line 217
    .line 218
    invoke-static {p0, v7, v8, v0}, La/b1j;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    sget-object v7, Ljava/lang/System;->out:Ljava/io/PrintStream;

    .line 223
    .line 224
    invoke-virtual {v7, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    .line 225
    .line 226
    .line 227
    iput-object v6, p2, La/you;->j:La/hsj;

    .line 228
    .line 229
    iput-boolean v2, p2, La/you;->i:Z

    .line 230
    .line 231
    iput p1, p2, La/you;->k:I

    .line 232
    .line 233
    iput p0, p2, La/you;->l:I

    .line 234
    .line 235
    iput v3, p2, La/you;->o:I

    .line 236
    .line 237
    const-wide/16 v7, 0xbb8

    .line 238
    .line 239
    invoke-static {v7, v8, p2}, La/qcc;->O(JLa/yje;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    move-result-object v0

    .line 243
    if-ne v0, v1, :cond_1

    .line 244
    .line 245
    :goto_9
    return-object v1

    .line 246
    :cond_b
    :goto_a
    sget-object p0, La/j0g0;->b:La/e0g0;

    .line 247
    .line 248
    new-instance p0, La/g0g0;

    .line 249
    .line 250
    invoke-direct {p0, v0}, La/g0g0;-><init>(Ljava/lang/Throwable;)V

    .line 251
    .line 252
    .line 253
    move-object v0, p0

    .line 254
    :goto_b
    invoke-static {v0}, La/z1x;->P(Ljava/lang/Object;)V

    .line 255
    .line 256
    .line 257
    return-object v0

    .line 258
    :cond_c
    throw v0
.end method

.method public r([La/z7b;La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/twt;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/twt;

    .line 7
    .line 8
    iget v1, v0, La/twt;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/twt;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/twt;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/twt;-><init>(La/hsj;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/twt;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/twt;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    iget-object p1, v0, La/twt;->i:[La/z7b;

    .line 37
    .line 38
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 43
    .line 44
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const/4 p0, 0x0

    .line 48
    return-object p0

    .line 49
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p2, p0, La/hsj;->a:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast p2, La/lhf0;

    .line 55
    .line 56
    iget-object p0, p0, La/hsj;->b:Ljava/lang/Object;

    .line 57
    .line 58
    check-cast p0, La/j1q0;

    .line 59
    .line 60
    iget-object p0, p0, La/j1q0;->a:La/m1q0;

    .line 61
    .line 62
    invoke-virtual {p0}, La/m1q0;->a()Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    iput-object p1, v0, La/twt;->i:[La/z7b;

    .line 67
    .line 68
    iput v3, v0, La/twt;->l:I

    .line 69
    .line 70
    invoke-virtual {p2, p0, v0}, La/lhf0;->e(ZLa/zje;)Ljava/io/Serializable;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    if-ne p2, v1, :cond_3

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Iterable;

    .line 78
    .line 79
    new-instance p0, Ljava/util/ArrayList;

    .line 80
    .line 81
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 82
    .line 83
    .line 84
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    :goto_2
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-eqz v0, :cond_6

    .line 93
    .line 94
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    move-object v1, v0

    .line 99
    check-cast v1, La/vh0;

    .line 100
    .line 101
    array-length v2, p1

    .line 102
    const/4 v3, 0x0

    .line 103
    :goto_3
    if-ge v3, v2, :cond_5

    .line 104
    .line 105
    aget-object v4, p1, v3

    .line 106
    .line 107
    iget-byte v4, v4, La/z7b;->a:B

    .line 108
    .line 109
    int-to-long v4, v4

    .line 110
    iget-wide v6, v1, La/vh0;->f:J

    .line 111
    .line 112
    cmp-long v4, v4, v6

    .line 113
    .line 114
    if-nez v4, :cond_4

    .line 115
    .line 116
    goto :goto_2

    .line 117
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 118
    .line 119
    goto :goto_3

    .line 120
    :cond_5
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_2

    .line 124
    :cond_6
    new-instance p1, Ljava/util/ArrayList;

    .line 125
    .line 126
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 130
    .line 131
    .line 132
    move-result-object p2

    .line 133
    :cond_7
    :goto_4
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_8

    .line 138
    .line 139
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    move-object v1, v0

    .line 144
    check-cast v1, La/vh0;

    .line 145
    .line 146
    iget-object v1, v1, La/vh0;->d:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 149
    .line 150
    .line 151
    move-result v1

    .line 152
    if-nez v1, :cond_7

    .line 153
    .line 154
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_8
    new-instance p2, Ljava/util/ArrayList;

    .line 159
    .line 160
    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    :cond_9
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 168
    .line 169
    .line 170
    move-result v0

    .line 171
    if-eqz v0, :cond_a

    .line 172
    .line 173
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    move-object v1, v0

    .line 178
    check-cast v1, La/vh0;

    .line 179
    .line 180
    iget-object v1, v1, La/vh0;->d:Ljava/lang/String;

    .line 181
    .line 182
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 183
    .line 184
    .line 185
    move-result v1

    .line 186
    if-lez v1, :cond_9

    .line 187
    .line 188
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 189
    .line 190
    .line 191
    goto :goto_5

    .line 192
    :cond_a
    new-instance p0, La/a3b;

    .line 193
    .line 194
    invoke-direct {p0, p1, p2}, La/a3b;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 195
    .line 196
    .line 197
    return-object p0
.end method

.method public s()Ljava/math/BigDecimal;
    .locals 6

    .line 1
    new-instance v0, Ljava/math/BigDecimal;

    .line 2
    .line 3
    iget-object v1, p0, La/hsj;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/w5z;

    .line 6
    .line 7
    iget-object v1, v1, La/w5z;->c:Ljava/lang/Object;

    .line 8
    .line 9
    check-cast v1, La/gkr0;

    .line 10
    .line 11
    invoke-virtual {v1}, La/gkr0;->a()La/bn7;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    iget-wide v1, v1, La/bn7;->a:D

    .line 16
    .line 17
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, La/hsj;->b:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, La/pyu;

    .line 27
    .line 28
    iget-object p0, p0, La/pyu;->a:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, La/w5z;

    .line 31
    .line 32
    iget-object p0, p0, La/w5z;->d:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast p0, La/sd80;

    .line 35
    .line 36
    invoke-virtual {p0}, La/sd80;->a()Ljava/util/Map;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_3

    .line 45
    .line 46
    new-instance v1, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-interface {p0}, Ljava/util/Map;->size()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v2

    .line 67
    if-eqz v2, :cond_0

    .line 68
    .line 69
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    check-cast v2, Ljava/util/Map$Entry;

    .line 74
    .line 75
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Ljava/util/Set;

    .line 80
    .line 81
    invoke-interface {v2}, Ljava/util/Set;->size()I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    int-to-long v2, v2

    .line 86
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v1

    .line 102
    if-eqz v1, :cond_2

    .line 103
    .line 104
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v2

    .line 112
    if-eqz v2, :cond_1

    .line 113
    .line 114
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    check-cast v2, Ljava/lang/Number;

    .line 119
    .line 120
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 121
    .line 122
    .line 123
    move-result-wide v2

    .line 124
    check-cast v1, Ljava/lang/Number;

    .line 125
    .line 126
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 127
    .line 128
    .line 129
    move-result-wide v4

    .line 130
    mul-long/2addr v4, v2

    .line 131
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    goto :goto_1

    .line 136
    :cond_1
    check-cast v1, Ljava/lang/Number;

    .line 137
    .line 138
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 139
    .line 140
    .line 141
    move-result-wide v1

    .line 142
    goto :goto_2

    .line 143
    :cond_2
    const-string p0, "Empty collection can\'t be reduced."

    .line 144
    .line 145
    invoke-static {p0}, La/v4i0;->p(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    const/4 p0, 0x0

    .line 149
    return-object p0

    .line 150
    :cond_3
    const-wide/16 v1, 0x0

    .line 151
    .line 152
    :goto_2
    invoke-static {v1, v2}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, p0}, Ljava/math/BigDecimal;->multiply(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 160
    .line 161
    .line 162
    move-result-object p0

    .line 163
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 164
    .line 165
    .line 166
    return-object p0
.end method

.method public t()Z
    .locals 4

    .line 1
    iget-object v0, p0, La/hsj;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/rpt;

    .line 4
    .line 5
    invoke-virtual {v0}, La/rpt;->g()La/cit0;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    new-instance v1, La/szf;

    .line 10
    .line 11
    iget-boolean v2, v0, La/cit0;->H:Z

    .line 12
    .line 13
    iget-boolean v0, v0, La/cit0;->I:Z

    .line 14
    .line 15
    invoke-direct {v1, v2, v0}, La/szf;-><init>(ZZ)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/hsj;->a:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p0, La/lrc;

    .line 21
    .line 22
    iget-object p0, p0, La/lrc;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, La/h0f;

    .line 25
    .line 26
    iget-object v3, p0, La/h0f;->b:La/szf;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    iput-object v1, p0, La/h0f;->b:La/szf;

    .line 32
    .line 33
    if-nez v3, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iget-boolean p0, v3, La/szf;->a:Z

    .line 37
    .line 38
    if-ne p0, v2, :cond_2

    .line 39
    .line 40
    iget-boolean p0, v3, La/szf;->b:Z

    .line 41
    .line 42
    if-eq p0, v0, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 46
    return p0

    .line 47
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 48
    return p0
.end method

.method public u(ILa/zje;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    instance-of v0, p2, La/ryk;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/ryk;

    .line 7
    .line 8
    iget v1, v0, La/ryk;->k:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/ryk;->k:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/ryk;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/ryk;-><init>(La/hsj;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/ryk;->i:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/ryk;->k:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    if-ne v2, v3, :cond_1

    .line 35
    .line 36
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 41
    .line 42
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    const/4 p0, 0x0

    .line 46
    return-object p0

    .line 47
    :cond_2
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, La/hsj;->b:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast p0, La/ucj;

    .line 53
    .line 54
    invoke-virtual {p0}, La/ucj;->invoke()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, La/lyk;

    .line 59
    .line 60
    iput v3, v0, La/ryk;->k:I

    .line 61
    .line 62
    invoke-interface {p0, p1, p3, v0}, La/lyk;->b(ILjava/lang/String;La/yje;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p2

    .line 66
    if-ne p2, v1, :cond_3

    .line 67
    .line 68
    return-object v1

    .line 69
    :cond_3
    :goto_1
    check-cast p2, La/dx5;

    .line 70
    .line 71
    invoke-virtual {p2}, La/dx5;->a()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    return-object p0
.end method

.method public v(IIII)F
    .locals 17

    .line 1
    sub-int v0, p4, p2

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Math;->abs(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    sub-int v1, p3, p1

    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v3, 0x1

    .line 14
    if-le v0, v1, :cond_0

    .line 15
    .line 16
    move v0, v3

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    :goto_0
    if-eqz v0, :cond_1

    .line 20
    .line 21
    move/from16 v4, p1

    .line 22
    .line 23
    move/from16 v1, p2

    .line 24
    .line 25
    move/from16 v6, p3

    .line 26
    .line 27
    move/from16 v5, p4

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move/from16 v1, p1

    .line 31
    .line 32
    move/from16 v4, p2

    .line 33
    .line 34
    move/from16 v5, p3

    .line 35
    .line 36
    move/from16 v6, p4

    .line 37
    .line 38
    :goto_1
    sub-int v7, v5, v1

    .line 39
    .line 40
    invoke-static {v7}, Ljava/lang/Math;->abs(I)I

    .line 41
    .line 42
    .line 43
    move-result v7

    .line 44
    sub-int v8, v6, v4

    .line 45
    .line 46
    invoke-static {v8}, Ljava/lang/Math;->abs(I)I

    .line 47
    .line 48
    .line 49
    move-result v8

    .line 50
    neg-int v9, v7

    .line 51
    const/4 v10, 0x2

    .line 52
    div-int/2addr v9, v10

    .line 53
    const/4 v11, -0x1

    .line 54
    if-ge v1, v5, :cond_2

    .line 55
    .line 56
    move v12, v3

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    move v12, v11

    .line 59
    :goto_2
    if-ge v4, v6, :cond_3

    .line 60
    .line 61
    move v11, v3

    .line 62
    :cond_3
    add-int/2addr v5, v12

    .line 63
    move v13, v1

    .line 64
    move v14, v4

    .line 65
    const/4 v15, 0x0

    .line 66
    :goto_3
    if-eq v13, v5, :cond_b

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    move v2, v14

    .line 71
    goto :goto_4

    .line 72
    :cond_4
    move v2, v13

    .line 73
    :goto_4
    if-eqz v0, :cond_5

    .line 74
    .line 75
    move v10, v13

    .line 76
    goto :goto_5

    .line 77
    :cond_5
    move v10, v14

    .line 78
    :goto_5
    move/from16 v16, v0

    .line 79
    .line 80
    if-ne v15, v3, :cond_6

    .line 81
    .line 82
    move v0, v3

    .line 83
    move/from16 p2, v7

    .line 84
    .line 85
    move-object/from16 v3, p0

    .line 86
    .line 87
    goto :goto_6

    .line 88
    :cond_6
    const/4 v0, 0x0

    .line 89
    move-object/from16 v3, p0

    .line 90
    .line 91
    move/from16 p2, v7

    .line 92
    .line 93
    :goto_6
    iget-object v7, v3, La/hsj;->a:Ljava/lang/Object;

    .line 94
    .line 95
    check-cast v7, La/r68;

    .line 96
    .line 97
    invoke-virtual {v7, v2, v10}, La/r68;->b(II)Z

    .line 98
    .line 99
    .line 100
    move-result v2

    .line 101
    if-ne v0, v2, :cond_8

    .line 102
    .line 103
    const/4 v0, 0x2

    .line 104
    if-ne v15, v0, :cond_7

    .line 105
    .line 106
    invoke-static {v13, v14, v1, v4}, La/q7x;->w(IIII)F

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    return v0

    .line 111
    :cond_7
    add-int/lit8 v15, v15, 0x1

    .line 112
    .line 113
    :cond_8
    add-int/2addr v9, v8

    .line 114
    if-lez v9, :cond_a

    .line 115
    .line 116
    if-ne v14, v6, :cond_9

    .line 117
    .line 118
    const/4 v0, 0x2

    .line 119
    goto :goto_7

    .line 120
    :cond_9
    add-int/2addr v14, v11

    .line 121
    sub-int v9, v9, p2

    .line 122
    .line 123
    :cond_a
    add-int/2addr v13, v12

    .line 124
    move/from16 v7, p2

    .line 125
    .line 126
    move/from16 v0, v16

    .line 127
    .line 128
    const/4 v3, 0x1

    .line 129
    const/4 v10, 0x2

    .line 130
    goto :goto_3

    .line 131
    :cond_b
    move v0, v10

    .line 132
    :goto_7
    if-ne v15, v0, :cond_c

    .line 133
    .line 134
    invoke-static {v5, v6, v1, v4}, La/q7x;->w(IIII)F

    .line 135
    .line 136
    .line 137
    move-result v0

    .line 138
    return v0

    .line 139
    :cond_c
    const/high16 v0, 0x7fc00000    # Float.NaN

    .line 140
    .line 141
    return v0
.end method

.method public w(IIII)F
    .locals 7

    .line 1
    iget-object v0, p0, La/hsj;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/r68;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2, p3, p4}, La/hsj;->v(IIII)F

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    sub-int/2addr p3, p1

    .line 10
    sub-int p3, p1, p3

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    const/high16 v3, 0x3f800000    # 1.0f

    .line 14
    .line 15
    if-gez p3, :cond_0

    .line 16
    .line 17
    int-to-float v4, p1

    .line 18
    sub-int p3, p1, p3

    .line 19
    .line 20
    int-to-float p3, p3

    .line 21
    div-float/2addr v4, p3

    .line 22
    move p3, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    iget v4, v0, La/r68;->a:I

    .line 25
    .line 26
    if-lt p3, v4, :cond_1

    .line 27
    .line 28
    add-int/lit8 v5, v4, -0x1

    .line 29
    .line 30
    sub-int/2addr v5, p1

    .line 31
    int-to-float v5, v5

    .line 32
    sub-int/2addr p3, p1

    .line 33
    int-to-float p3, p3

    .line 34
    div-float p3, v5, p3

    .line 35
    .line 36
    add-int/lit8 v4, v4, -0x1

    .line 37
    .line 38
    move v6, v4

    .line 39
    move v4, p3

    .line 40
    move p3, v6

    .line 41
    goto :goto_0

    .line 42
    :cond_1
    move v4, v3

    .line 43
    :goto_0
    int-to-float v5, p2

    .line 44
    sub-int/2addr p4, p2

    .line 45
    int-to-float p4, p4

    .line 46
    mul-float/2addr p4, v4

    .line 47
    sub-float p4, v5, p4

    .line 48
    .line 49
    float-to-int p4, p4

    .line 50
    if-gez p4, :cond_2

    .line 51
    .line 52
    sub-int p4, p2, p4

    .line 53
    .line 54
    int-to-float p4, p4

    .line 55
    div-float/2addr v5, p4

    .line 56
    goto :goto_1

    .line 57
    :cond_2
    iget v0, v0, La/r68;->b:I

    .line 58
    .line 59
    if-lt p4, v0, :cond_3

    .line 60
    .line 61
    add-int/lit8 v2, v0, -0x1

    .line 62
    .line 63
    sub-int/2addr v2, p2

    .line 64
    int-to-float v2, v2

    .line 65
    sub-int/2addr p4, p2

    .line 66
    int-to-float p4, p4

    .line 67
    div-float v5, v2, p4

    .line 68
    .line 69
    add-int/lit8 v2, v0, -0x1

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_3
    move v2, p4

    .line 73
    move v5, v3

    .line 74
    :goto_1
    int-to-float p4, p1

    .line 75
    sub-int/2addr p3, p1

    .line 76
    int-to-float p3, p3

    .line 77
    mul-float/2addr p3, v5

    .line 78
    add-float/2addr p3, p4

    .line 79
    float-to-int p3, p3

    .line 80
    invoke-virtual {p0, p1, p2, p3, v2}, La/hsj;->v(IIII)F

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    add-float/2addr p0, v1

    .line 85
    sub-float/2addr p0, v3

    .line 86
    return p0
.end method
