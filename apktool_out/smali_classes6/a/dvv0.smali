.class public final La/dvv0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vj50;


# instance fields
.field public final a:La/ywv0;

.field public final b:La/l7m0;

.field public c:Z

.field public d:Z


# direct methods
.method public constructor <init>(La/ywv0;La/l7m0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, La/dvv0;->a:La/ywv0;

    .line 11
    .line 12
    iput-object p2, p0, La/dvv0;->b:La/l7m0;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final C(IJ)J
    .locals 6

    .line 1
    iget-object v0, p0, La/dvv0;->b:La/l7m0;

    .line 2
    .line 3
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    if-ne p1, v0, :cond_3

    .line 17
    .line 18
    iget-boolean p1, p0, La/dvv0;->c:Z

    .line 19
    .line 20
    if-eqz p1, :cond_0

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_0
    const-wide v1, 0xffffffffL

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    and-long p1, p2, v1

    .line 29
    .line 30
    long-to-int p1, p1

    .line 31
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    iget-boolean p2, p0, La/dvv0;->d:Z

    .line 36
    .line 37
    const/16 p3, 0x20

    .line 38
    .line 39
    const/4 v3, 0x0

    .line 40
    iget-object v4, p0, La/dvv0;->a:La/ywv0;

    .line 41
    .line 42
    if-eqz p2, :cond_1

    .line 43
    .line 44
    iget-object p0, v4, La/ywv0;->l:La/oxv0;

    .line 45
    .line 46
    neg-float p2, p1

    .line 47
    invoke-virtual {p0, p2}, La/oxv0;->a(F)V

    .line 48
    .line 49
    .line 50
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    int-to-long v3, p0

    .line 55
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    :goto_0
    int-to-long p0, p0

    .line 60
    shl-long p2, v3, p3

    .line 61
    .line 62
    and-long/2addr p0, v1

    .line 63
    or-long/2addr p0, p2

    .line 64
    return-wide p0

    .line 65
    :cond_1
    iget-object p2, v4, La/ywv0;->c:La/fht0;

    .line 66
    .line 67
    iget-object p2, p2, La/fht0;->d:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p2, La/hu5;

    .line 70
    .line 71
    if-nez p2, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    iget p2, p2, La/hu5;->c:I

    .line 75
    .line 76
    int-to-float p2, p2

    .line 77
    cmpg-float v5, p1, v3

    .line 78
    .line 79
    if-gez v5, :cond_3

    .line 80
    .line 81
    iget-object v5, v4, La/ywv0;->d:La/glt0;

    .line 82
    .line 83
    iget-object v5, v5, La/glt0;->c:Ljava/lang/Object;

    .line 84
    .line 85
    check-cast v5, La/t33;

    .line 86
    .line 87
    invoke-virtual {v5}, La/t33;->d()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v5

    .line 91
    check-cast v5, Ljava/lang/Number;

    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    .line 94
    .line 95
    .line 96
    move-result v5

    .line 97
    cmpg-float p2, v5, p2

    .line 98
    .line 99
    if-gez p2, :cond_3

    .line 100
    .line 101
    iput-boolean v0, p0, La/dvv0;->d:Z

    .line 102
    .line 103
    iget-object p0, v4, La/ywv0;->l:La/oxv0;

    .line 104
    .line 105
    neg-float p2, p1

    .line 106
    invoke-virtual {p0, p2}, La/oxv0;->a(F)V

    .line 107
    .line 108
    .line 109
    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 110
    .line 111
    .line 112
    move-result p0

    .line 113
    int-to-long v3, p0

    .line 114
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    goto :goto_0

    .line 119
    :cond_3
    :goto_1
    const-wide/16 p0, 0x0

    .line 120
    .line 121
    return-wide p0
.end method

.method public final I0(JLa/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-boolean p3, p0, La/dvv0;->c:Z

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-wide/16 v1, 0x0

    .line 5
    .line 6
    const/4 v3, 0x0

    .line 7
    iget-object v4, p0, La/dvv0;->a:La/ywv0;

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    iput-boolean v0, p0, La/dvv0;->c:Z

    .line 12
    .line 13
    iput-boolean v0, p0, La/dvv0;->d:Z

    .line 14
    .line 15
    iget-object p0, v4, La/ywv0;->f:La/mkt0;

    .line 16
    .line 17
    iget-object p0, p0, La/mkt0;->a:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast p0, La/pz40;

    .line 20
    .line 21
    check-cast p0, La/hgk0;

    .line 22
    .line 23
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Ljava/lang/Boolean;

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    iget-object p0, v4, La/ywv0;->l:La/oxv0;

    .line 36
    .line 37
    iget-object p0, p0, La/oxv0;->j:La/hcp0;

    .line 38
    .line 39
    new-instance p1, La/qxv0;

    .line 40
    .line 41
    invoke-direct {p1, v3}, La/qxv0;-><init>(F)V

    .line 42
    .line 43
    .line 44
    iget-object p0, p0, La/hcp0;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p0, La/q99;

    .line 47
    .line 48
    invoke-interface {p0, p1}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_0
    new-instance p0, La/g6u0;

    .line 52
    .line 53
    invoke-direct {p0, v1, v2}, La/g6u0;-><init>(J)V

    .line 54
    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_1
    iput-boolean v0, p0, La/dvv0;->c:Z

    .line 58
    .line 59
    iput-boolean v0, p0, La/dvv0;->d:Z

    .line 60
    .line 61
    iget-object p0, v4, La/ywv0;->f:La/mkt0;

    .line 62
    .line 63
    iget-object p3, v4, La/ywv0;->l:La/oxv0;

    .line 64
    .line 65
    iget-object p3, p3, La/oxv0;->j:La/hcp0;

    .line 66
    .line 67
    iget-object p0, p0, La/mkt0;->a:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast p0, La/pz40;

    .line 70
    .line 71
    check-cast p0, La/hgk0;

    .line 72
    .line 73
    invoke-virtual {p0}, La/hgk0;->getValue()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    check-cast p0, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    if-nez p0, :cond_2

    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_2
    iget-object p0, v4, La/ywv0;->c:La/fht0;

    .line 87
    .line 88
    iget-object v0, v4, La/ywv0;->d:La/glt0;

    .line 89
    .line 90
    iget-object v0, v0, La/glt0;->c:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v0, La/t33;

    .line 93
    .line 94
    invoke-virtual {v0}, La/t33;->d()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    check-cast v0, Ljava/lang/Number;

    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    iget-object p0, p0, La/fht0;->d:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast p0, La/hu5;

    .line 107
    .line 108
    if-eqz p0, :cond_5

    .line 109
    .line 110
    iget-object p0, p0, La/hu5;->e:Ljava/lang/Object;

    .line 111
    .line 112
    check-cast p0, Ljava/util/List;

    .line 113
    .line 114
    if-eqz p0, :cond_3

    .line 115
    .line 116
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result v4

    .line 120
    if-eqz v4, :cond_3

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_3
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    :cond_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v4

    .line 131
    if-eqz v4, :cond_5

    .line 132
    .line 133
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    check-cast v4, La/fsv0;

    .line 138
    .line 139
    iget v4, v4, La/fsv0;->b:I

    .line 140
    .line 141
    int-to-float v4, v4

    .line 142
    sub-float/2addr v4, v0

    .line 143
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 144
    .line 145
    .line 146
    move-result v4

    .line 147
    const/high16 v5, 0x3f800000    # 1.0f

    .line 148
    .line 149
    cmpg-float v4, v4, v5

    .line 150
    .line 151
    if-gez v4, :cond_4

    .line 152
    .line 153
    new-instance p0, La/qxv0;

    .line 154
    .line 155
    invoke-direct {p0, v3}, La/qxv0;-><init>(F)V

    .line 156
    .line 157
    .line 158
    iget-object p1, p3, La/hcp0;->c:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast p1, La/q99;

    .line 161
    .line 162
    invoke-interface {p1, p0}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_5
    :goto_0
    invoke-static {p1, p2}, La/g6u0;->c(J)F

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    new-instance v0, La/qxv0;

    .line 171
    .line 172
    invoke-direct {v0, p0}, La/qxv0;-><init>(F)V

    .line 173
    .line 174
    .line 175
    iget-object p0, p3, La/hcp0;->c:Ljava/lang/Object;

    .line 176
    .line 177
    check-cast p0, La/q99;

    .line 178
    .line 179
    invoke-interface {p0, v0}, La/jbi0;->f(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    const/4 p0, 0x2

    .line 183
    invoke-static {p1, p2, v3, v3, p0}, La/g6u0;->a(JFFI)J

    .line 184
    .line 185
    .line 186
    move-result-wide v1

    .line 187
    :goto_1
    new-instance p0, La/g6u0;

    .line 188
    .line 189
    invoke-direct {p0, v1, v2}, La/g6u0;-><init>(J)V

    .line 190
    .line 191
    .line 192
    return-object p0
.end method

.method public final S(IJJ)J
    .locals 3

    .line 1
    iget-object v0, p0, La/dvv0;->b:La/l7m0;

    .line 2
    .line 3
    invoke-interface {v0}, La/l7m0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Boolean;

    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_3

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    if-ne p1, v0, :cond_3

    .line 17
    .line 18
    const-wide v1, 0xffffffffL

    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    and-long p1, p2, v1

    .line 24
    .line 25
    long-to-int p1, p1

    .line 26
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    const/4 p2, 0x0

    .line 31
    cmpg-float p1, p1, p2

    .line 32
    .line 33
    if-nez p1, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    iput-boolean v0, p0, La/dvv0;->c:Z

    .line 37
    .line 38
    :goto_0
    and-long p3, p4, v1

    .line 39
    .line 40
    long-to-int p1, p3

    .line 41
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 42
    .line 43
    .line 44
    move-result p1

    .line 45
    iget-boolean p3, p0, La/dvv0;->c:Z

    .line 46
    .line 47
    if-nez p3, :cond_3

    .line 48
    .line 49
    iget-boolean p3, p0, La/dvv0;->d:Z

    .line 50
    .line 51
    if-eqz p3, :cond_1

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_1
    cmpg-float p3, p1, p2

    .line 55
    .line 56
    if-gtz p3, :cond_2

    .line 57
    .line 58
    goto :goto_1

    .line 59
    :cond_2
    iput-boolean v0, p0, La/dvv0;->d:Z

    .line 60
    .line 61
    iget-object p0, p0, La/dvv0;->a:La/ywv0;

    .line 62
    .line 63
    iget-object p0, p0, La/ywv0;->l:La/oxv0;

    .line 64
    .line 65
    neg-float p3, p1

    .line 66
    invoke-virtual {p0, p3}, La/oxv0;->a(F)V

    .line 67
    .line 68
    .line 69
    invoke-static {p2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    int-to-long p2, p0

    .line 74
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 75
    .line 76
    .line 77
    move-result p0

    .line 78
    int-to-long p0, p0

    .line 79
    const/16 p4, 0x20

    .line 80
    .line 81
    shl-long/2addr p2, p4

    .line 82
    and-long/2addr p0, v1

    .line 83
    or-long/2addr p0, p2

    .line 84
    return-wide p0

    .line 85
    :cond_3
    :goto_1
    const-wide/16 p0, 0x0

    .line 86
    .line 87
    return-wide p0
.end method

.method public final g(JJLa/zje;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput-boolean p1, p0, La/dvv0;->c:Z

    .line 3
    .line 4
    iput-boolean p1, p0, La/dvv0;->d:Z

    .line 5
    .line 6
    new-instance p0, La/g6u0;

    .line 7
    .line 8
    const-wide/16 p1, 0x0

    .line 9
    .line 10
    invoke-direct {p0, p1, p2}, La/g6u0;-><init>(J)V

    .line 11
    .line 12
    .line 13
    return-object p0
.end method
