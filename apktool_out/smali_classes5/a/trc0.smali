.class public final La/trc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vrc0;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:I

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:La/xg8;

.field public final j:Ljava/lang/String;

.field public final k:Ljava/lang/String;

.field public final l:Ljava/lang/String;


# direct methods
.method public constructor <init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILa/xg8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/trc0;->a:J

    .line 5
    .line 6
    iput-wide p3, p0, La/trc0;->b:J

    .line 7
    .line 8
    iput-object p5, p0, La/trc0;->c:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p6, p0, La/trc0;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p7, p0, La/trc0;->e:Ljava/lang/String;

    .line 13
    .line 14
    iput p8, p0, La/trc0;->f:I

    .line 15
    .line 16
    iput-object p9, p0, La/trc0;->g:Ljava/lang/String;

    .line 17
    .line 18
    iput p10, p0, La/trc0;->h:I

    .line 19
    .line 20
    iput-object p11, p0, La/trc0;->i:La/xg8;

    .line 21
    .line 22
    iput-object p12, p0, La/trc0;->j:Ljava/lang/String;

    .line 23
    .line 24
    iput-object p13, p0, La/trc0;->k:Ljava/lang/String;

    .line 25
    .line 26
    iput-object p14, p0, La/trc0;->l:Ljava/lang/String;

    .line 27
    .line 28
    return-void
.end method

.method public static a(La/trc0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)La/trc0;
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p4

    .line 4
    .line 5
    iget-wide v2, v0, La/trc0;->a:J

    .line 6
    .line 7
    move-wide v5, v2

    .line 8
    iget-wide v3, v0, La/trc0;->b:J

    .line 9
    .line 10
    move-wide v6, v5

    .line 11
    iget-object v5, v0, La/trc0;->c:Ljava/lang/String;

    .line 12
    .line 13
    move-wide v7, v6

    .line 14
    iget-object v6, v0, La/trc0;->d:Ljava/lang/String;

    .line 15
    .line 16
    move-wide v8, v7

    .line 17
    iget-object v7, v0, La/trc0;->e:Ljava/lang/String;

    .line 18
    .line 19
    move-wide v9, v8

    .line 20
    iget v8, v0, La/trc0;->f:I

    .line 21
    .line 22
    and-int/lit8 v2, v1, 0x40

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    iget-object v2, v0, La/trc0;->g:Ljava/lang/String;

    .line 27
    .line 28
    :goto_0
    move-wide v11, v9

    .line 29
    goto :goto_1

    .line 30
    :cond_0
    move-object/from16 v2, p1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :goto_1
    iget v10, v0, La/trc0;->h:I

    .line 34
    .line 35
    move-wide v12, v11

    .line 36
    iget-object v11, v0, La/trc0;->i:La/xg8;

    .line 37
    .line 38
    move-wide v13, v12

    .line 39
    iget-object v12, v0, La/trc0;->j:Ljava/lang/String;

    .line 40
    .line 41
    and-int/lit16 v9, v1, 0x400

    .line 42
    .line 43
    if-eqz v9, :cond_1

    .line 44
    .line 45
    iget-object v9, v0, La/trc0;->k:Ljava/lang/String;

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_1
    move-object/from16 v9, p2

    .line 49
    .line 50
    :goto_2
    and-int/lit16 v1, v1, 0x800

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    iget-object v0, v0, La/trc0;->l:Ljava/lang/String;

    .line 55
    .line 56
    goto :goto_3

    .line 57
    :cond_2
    move-object/from16 v0, p3

    .line 58
    .line 59
    :goto_3
    new-instance v1, La/trc0;

    .line 60
    .line 61
    move-wide v15, v13

    .line 62
    move-object v14, v0

    .line 63
    move-object v0, v1

    .line 64
    move-object v13, v9

    .line 65
    move-object v9, v2

    .line 66
    move-wide v1, v15

    .line 67
    invoke-direct/range {v0 .. v14}, La/trc0;-><init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;ILa/xg8;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    return-object v0
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/trc0;->d:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final B()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/trc0;->b:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final C()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/trc0;->g:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/trc0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/trc0;

    .line 12
    .line 13
    iget-wide v0, p0, La/trc0;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/trc0;->a:J

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto/16 :goto_0

    .line 22
    .line 23
    :cond_2
    iget-wide v0, p0, La/trc0;->b:J

    .line 24
    .line 25
    iget-wide v2, p1, La/trc0;->b:J

    .line 26
    .line 27
    cmp-long v0, v0, v2

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    goto/16 :goto_0

    .line 32
    .line 33
    :cond_3
    iget-object v0, p0, La/trc0;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/trc0;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v0

    .line 41
    if-nez v0, :cond_4

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_4
    iget-object v0, p0, La/trc0;->d:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v1, p1, La/trc0;->d:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_5

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_5
    iget-object v0, p0, La/trc0;->e:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v1, p1, La/trc0;->e:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    if-nez v0, :cond_6

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_6
    iget v0, p0, La/trc0;->f:I

    .line 67
    .line 68
    iget v1, p1, La/trc0;->f:I

    .line 69
    .line 70
    if-eq v0, v1, :cond_7

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_7
    iget-object v0, p0, La/trc0;->g:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v1, p1, La/trc0;->g:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_8

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_8
    iget v0, p0, La/trc0;->h:I

    .line 85
    .line 86
    iget v1, p1, La/trc0;->h:I

    .line 87
    .line 88
    if-eq v0, v1, :cond_9

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_9
    iget-object v0, p0, La/trc0;->i:La/xg8;

    .line 92
    .line 93
    iget-object v1, p1, La/trc0;->i:La/xg8;

    .line 94
    .line 95
    if-eq v0, v1, :cond_a

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_a
    iget-object v0, p0, La/trc0;->j:Ljava/lang/String;

    .line 99
    .line 100
    iget-object v1, p1, La/trc0;->j:Ljava/lang/String;

    .line 101
    .line 102
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-nez v0, :cond_b

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_b
    iget-object v0, p0, La/trc0;->k:Ljava/lang/String;

    .line 110
    .line 111
    iget-object v1, p1, La/trc0;->k:Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-nez v0, :cond_c

    .line 118
    .line 119
    goto :goto_0

    .line 120
    :cond_c
    iget-object p0, p0, La/trc0;->l:Ljava/lang/String;

    .line 121
    .line 122
    iget-object p1, p1, La/trc0;->l:Ljava/lang/String;

    .line 123
    .line 124
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-nez p0, :cond_d

    .line 129
    .line 130
    :goto_0
    const/4 p0, 0x0

    .line 131
    return p0

    .line 132
    :cond_d
    :goto_1
    const/4 p0, 0x1

    .line 133
    return p0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/trc0;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/trc0;->c:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getType()La/xg8;
    .locals 0

    .line 1
    iget-object p0, p0, La/trc0;->i:La/xg8;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h0()I
    .locals 0

    .line 1
    iget p0, p0, La/trc0;->f:I

    .line 2
    .line 3
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/trc0;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

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
    iget-wide v2, p0, La/trc0;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/trc0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/trc0;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/trc0;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, La/trc0;->f:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/trc0;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, La/trc0;->h:I

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/trc0;->i:La/xg8;

    .line 53
    .line 54
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    add-int/2addr v2, v0

    .line 59
    mul-int/2addr v2, v1

    .line 60
    iget-object v0, p0, La/trc0;->j:Ljava/lang/String;

    .line 61
    .line 62
    if-nez v0, :cond_0

    .line 63
    .line 64
    const/4 v0, 0x0

    .line 65
    goto :goto_0

    .line 66
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    :goto_0
    add-int/2addr v2, v0

    .line 71
    mul-int/2addr v2, v1

    .line 72
    iget-object v0, p0, La/trc0;->k:Ljava/lang/String;

    .line 73
    .line 74
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    iget-object p0, p0, La/trc0;->l:Ljava/lang/String;

    .line 79
    .line 80
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    add-int/2addr p0, v0

    .line 85
    return p0
.end method

.method public final m0()I
    .locals 0

    .line 1
    iget p0, p0, La/trc0;->h:I

    .line 2
    .line 3
    return p0
.end method

.method public final t0()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/trc0;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "Default(id="

    .line 2
    .line 3
    const-string v1, ", categoryId="

    .line 4
    .line 5
    iget-wide v2, p0, La/trc0;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, ", name="

    .line 12
    .line 13
    iget-wide v2, p0, La/trc0;->b:J

    .line 14
    .line 15
    iget-object v4, p0, La/trc0;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v2, v3, v1, v4}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v1, ", desc="

    .line 21
    .line 22
    const-string v2, ", slogan="

    .line 23
    .line 24
    iget-object v3, p0, La/trc0;->d:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v4, p0, La/trc0;->e:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0, v1, v3, v2, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v1, ", minBet="

    .line 32
    .line 33
    const-string v2, ", analyticsParamName="

    .line 34
    .line 35
    iget v3, p0, La/trc0;->f:I

    .line 36
    .line 37
    iget-object v4, p0, La/trc0;->g:Ljava/lang/String;

    .line 38
    .line 39
    invoke-static {v3, v1, v2, v4, v0}, La/w6x;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 40
    .line 41
    .line 42
    const-string v1, ", numFS="

    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    iget v1, p0, La/trc0;->h:I

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v1, ", type="

    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v1, p0, La/trc0;->i:La/xg8;

    .line 58
    .line 59
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v1, ", compositeKey="

    .line 63
    .line 64
    const-string v2, ", imageUrl="

    .line 65
    .line 66
    iget-object v3, p0, La/trc0;->j:Ljava/lang/String;

    .line 67
    .line 68
    iget-object v4, p0, La/trc0;->k:Ljava/lang/String;

    .line 69
    .line 70
    invoke-static {v0, v1, v3, v2, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string v1, ", detailImageUrl="

    .line 74
    .line 75
    const-string v2, ")"

    .line 76
    .line 77
    iget-object p0, p0, La/trc0;->l:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v0, v1, p0, v2}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method
