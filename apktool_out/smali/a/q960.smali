.class public final La/q960;
.super La/v73;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:La/kkf0;

.field public final e:Ljava/util/ArrayList;

.field public final f:I


# direct methods
.method public constructor <init>(IIILa/kkf0;Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/q960;->a:I

    .line 5
    .line 6
    iput p2, p0, La/q960;->b:I

    .line 7
    .line 8
    iput p3, p0, La/q960;->c:I

    .line 9
    .line 10
    iput-object p4, p0, La/q960;->d:La/kkf0;

    .line 11
    .line 12
    iput-object p5, p0, La/q960;->e:Ljava/util/ArrayList;

    .line 13
    .line 14
    const/4 p4, -0x1

    .line 15
    if-ne p3, p4, :cond_0

    .line 16
    .line 17
    const p1, 0x7fffffff

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    add-int/lit8 p3, p3, 0x1

    .line 22
    .line 23
    mul-int/2addr p3, p1

    .line 24
    add-int p1, p3, p2

    .line 25
    .line 26
    :goto_0
    iput p1, p0, La/q960;->f:I

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final b(La/hz40;II)V
    .locals 12

    .line 1
    iget-object p2, p0, La/q960;->e:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    :goto_0
    if-ge v1, v0, :cond_8

    .line 9
    .line 10
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    check-cast v2, La/r0d0;

    .line 15
    .line 16
    instance-of v3, v2, La/q0d0;

    .line 17
    .line 18
    if-nez v3, :cond_7

    .line 19
    .line 20
    instance-of v3, v2, La/t0d0;

    .line 21
    .line 22
    iget-object v8, p0, La/q960;->d:La/kkf0;

    .line 23
    .line 24
    iget v4, p0, La/q960;->b:I

    .line 25
    .line 26
    if-eqz v3, :cond_1

    .line 27
    .line 28
    move-object v3, v2

    .line 29
    check-cast v3, La/t0d0;

    .line 30
    .line 31
    iget-object v3, v3, La/p0d0;->a:Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1, v3}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    check-cast v5, La/jlq;

    .line 38
    .line 39
    if-nez v5, :cond_0

    .line 40
    .line 41
    new-instance v5, La/jlq;

    .line 42
    .line 43
    invoke-direct {v5}, La/o0d0;-><init>()V

    .line 44
    .line 45
    .line 46
    :cond_0
    move-object v10, v5

    .line 47
    iget-object v11, v10, La/o0d0;->a:Ljava/util/ArrayList;

    .line 48
    .line 49
    move v5, v4

    .line 50
    new-instance v4, La/boq0;

    .line 51
    .line 52
    add-int/2addr v5, p3

    .line 53
    iget v7, p0, La/q960;->c:I

    .line 54
    .line 55
    move-object v9, v2

    .line 56
    check-cast v9, La/p0d0;

    .line 57
    .line 58
    iget v6, p0, La/q960;->a:I

    .line 59
    .line 60
    invoke-direct/range {v4 .. v9}, La/boq0;-><init>(IIILa/kkf0;La/p0d0;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1, v3, v10}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    move v5, v4

    .line 71
    instance-of v3, v2, La/s0d0;

    .line 72
    .line 73
    if-eqz v3, :cond_3

    .line 74
    .line 75
    move-object v3, v2

    .line 76
    check-cast v3, La/s0d0;

    .line 77
    .line 78
    iget-object v3, v3, La/p0d0;->a:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {p1, v3}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    check-cast v4, La/o4d;

    .line 85
    .line 86
    if-nez v4, :cond_2

    .line 87
    .line 88
    new-instance v4, La/o4d;

    .line 89
    .line 90
    invoke-direct {v4}, La/o0d0;-><init>()V

    .line 91
    .line 92
    .line 93
    :cond_2
    move-object v10, v4

    .line 94
    iget-object v11, v10, La/o0d0;->a:Ljava/util/ArrayList;

    .line 95
    .line 96
    new-instance v4, La/boq0;

    .line 97
    .line 98
    add-int/2addr v5, p3

    .line 99
    iget v7, p0, La/q960;->c:I

    .line 100
    .line 101
    move-object v9, v2

    .line 102
    check-cast v9, La/p0d0;

    .line 103
    .line 104
    iget v6, p0, La/q960;->a:I

    .line 105
    .line 106
    invoke-direct/range {v4 .. v9}, La/boq0;-><init>(IIILa/kkf0;La/p0d0;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    invoke-virtual {p1, v3, v10}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    goto :goto_1

    .line 116
    :cond_3
    instance-of v3, v2, La/v0d0;

    .line 117
    .line 118
    if-eqz v3, :cond_5

    .line 119
    .line 120
    move-object v3, v2

    .line 121
    check-cast v3, La/v0d0;

    .line 122
    .line 123
    iget-object v3, v3, La/p0d0;->a:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {p1, v3}, La/hz40;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    check-cast v4, La/b390;

    .line 130
    .line 131
    if-nez v4, :cond_4

    .line 132
    .line 133
    new-instance v4, La/b390;

    .line 134
    .line 135
    invoke-direct {v4}, La/o0d0;-><init>()V

    .line 136
    .line 137
    .line 138
    :cond_4
    move-object v10, v4

    .line 139
    iget-object v11, v10, La/o0d0;->a:Ljava/util/ArrayList;

    .line 140
    .line 141
    new-instance v4, La/boq0;

    .line 142
    .line 143
    add-int/2addr v5, p3

    .line 144
    iget v7, p0, La/q960;->c:I

    .line 145
    .line 146
    move-object v9, v2

    .line 147
    check-cast v9, La/p0d0;

    .line 148
    .line 149
    iget v6, p0, La/q960;->a:I

    .line 150
    .line 151
    invoke-direct/range {v4 .. v9}, La/boq0;-><init>(IIILa/kkf0;La/p0d0;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v3, v10}, La/hz40;->n(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 158
    .line 159
    .line 160
    goto :goto_1

    .line 161
    :cond_5
    instance-of v2, v2, La/u0d0;

    .line 162
    .line 163
    if-eqz v2, :cond_6

    .line 164
    .line 165
    goto :goto_1

    .line 166
    :cond_6
    invoke-static {}, La/t9f;->b()V

    .line 167
    .line 168
    .line 169
    return-void

    .line 170
    :cond_7
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 171
    .line 172
    goto/16 :goto_0

    .line 173
    .line 174
    :cond_8
    return-void
.end method

.method public final c()I
    .locals 0

    .line 1
    iget p0, p0, La/q960;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/q960;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/q960;

    .line 10
    .line 11
    iget v0, p0, La/q960;->a:I

    .line 12
    .line 13
    iget v1, p1, La/q960;->a:I

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget v0, p0, La/q960;->b:I

    .line 19
    .line 20
    iget v1, p1, La/q960;->b:I

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget v0, p0, La/q960;->c:I

    .line 26
    .line 27
    iget v1, p1, La/q960;->c:I

    .line 28
    .line 29
    if-eq v0, v1, :cond_4

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_4
    iget-object v0, p0, La/q960;->d:La/kkf0;

    .line 33
    .line 34
    iget-object v1, p1, La/q960;->d:La/kkf0;

    .line 35
    .line 36
    if-eq v0, v1, :cond_5

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_5
    iget-object p0, p0, La/q960;->e:Ljava/util/ArrayList;

    .line 40
    .line 41
    iget-object p1, p1, La/q960;->e:Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p0

    .line 47
    if-nez p0, :cond_6

    .line 48
    .line 49
    :goto_0
    const/4 p0, 0x0

    .line 50
    return p0

    .line 51
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 52
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/q960;->a:I

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget v2, p0, La/q960;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/q960;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/q960;->d:La/kkf0;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object p0, p0, La/q960;->e:Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v2

    .line 37
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", startDelay="

    .line 2
    .line 3
    const-string v1, ", repeatCount="

    .line 4
    .line 5
    const-string v2, "ObjectAnimator(duration="

    .line 6
    .line 7
    iget v3, p0, La/q960;->a:I

    .line 8
    .line 9
    iget v4, p0, La/q960;->b:I

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1, v4}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget v1, p0, La/q960;->c:I

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", repeatMode="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/q960;->d:La/kkf0;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", holders="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v1, ")"

    .line 36
    .line 37
    iget-object p0, p0, La/q960;->e:Ljava/util/ArrayList;

    .line 38
    .line 39
    invoke-static {v0, p0, v1}, La/rz4;->n(Ljava/lang/StringBuilder;Ljava/util/ArrayList;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0
.end method
