.class public final La/jpk0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:J

.field public final g:La/lwk0;

.field public final h:La/ipk0;

.field public final i:Z

.field public final j:J

.field public final k:Z


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLa/lwk0;La/ipk0;ZJZ)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, La/jpk0;->a:I

    .line 8
    .line 9
    iput-object p2, p0, La/jpk0;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, La/jpk0;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, La/jpk0;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p5, p0, La/jpk0;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-wide p6, p0, La/jpk0;->f:J

    .line 18
    .line 19
    iput-object p8, p0, La/jpk0;->g:La/lwk0;

    .line 20
    .line 21
    iput-object p9, p0, La/jpk0;->h:La/ipk0;

    .line 22
    .line 23
    iput-boolean p10, p0, La/jpk0;->i:Z

    .line 24
    .line 25
    iput-wide p11, p0, La/jpk0;->j:J

    .line 26
    .line 27
    iput-boolean p13, p0, La/jpk0;->k:Z

    .line 28
    .line 29
    return-void
.end method

.method public static a(La/jpk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLa/lwk0;ZI)La/jpk0;
    .locals 14

    .line 1
    move/from16 v0, p8

    .line 2
    .line 3
    iget v1, p0, La/jpk0;->a:I

    .line 4
    .line 5
    iget-object v2, p0, La/jpk0;->b:Ljava/lang/String;

    .line 6
    .line 7
    and-int/lit8 v3, v0, 0x4

    .line 8
    .line 9
    if-eqz v3, :cond_0

    .line 10
    .line 11
    iget-object v3, p0, La/jpk0;->c:Ljava/lang/String;

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v3, p1

    .line 15
    :goto_0
    and-int/lit8 v4, v0, 0x8

    .line 16
    .line 17
    if-eqz v4, :cond_1

    .line 18
    .line 19
    iget-object v4, p0, La/jpk0;->d:Ljava/lang/String;

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    move-object/from16 v4, p2

    .line 23
    .line 24
    :goto_1
    and-int/lit8 v5, v0, 0x10

    .line 25
    .line 26
    if-eqz v5, :cond_2

    .line 27
    .line 28
    iget-object v5, p0, La/jpk0;->e:Ljava/lang/String;

    .line 29
    .line 30
    goto :goto_2

    .line 31
    :cond_2
    move-object/from16 v5, p3

    .line 32
    .line 33
    :goto_2
    and-int/lit8 v6, v0, 0x20

    .line 34
    .line 35
    if-eqz v6, :cond_3

    .line 36
    .line 37
    iget-wide v6, p0, La/jpk0;->f:J

    .line 38
    .line 39
    goto :goto_3

    .line 40
    :cond_3
    move-wide/from16 v6, p4

    .line 41
    .line 42
    :goto_3
    and-int/lit8 v8, v0, 0x40

    .line 43
    .line 44
    if-eqz v8, :cond_4

    .line 45
    .line 46
    iget-object v8, p0, La/jpk0;->g:La/lwk0;

    .line 47
    .line 48
    goto :goto_4

    .line 49
    :cond_4
    move-object/from16 v8, p6

    .line 50
    .line 51
    :goto_4
    iget-object v9, p0, La/jpk0;->h:La/ipk0;

    .line 52
    .line 53
    iget-boolean v10, p0, La/jpk0;->i:Z

    .line 54
    .line 55
    iget-wide v11, p0, La/jpk0;->j:J

    .line 56
    .line 57
    and-int/lit16 v0, v0, 0x400

    .line 58
    .line 59
    if-eqz v0, :cond_5

    .line 60
    .line 61
    iget-boolean v0, p0, La/jpk0;->k:Z

    .line 62
    .line 63
    move v13, v0

    .line 64
    goto :goto_5

    .line 65
    :cond_5
    move/from16 v13, p7

    .line 66
    .line 67
    :goto_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    new-instance v0, La/jpk0;

    .line 74
    .line 75
    invoke-direct/range {v0 .. v13}, La/jpk0;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLa/lwk0;La/ipk0;ZJZ)V

    .line 76
    .line 77
    .line 78
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/jpk0;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto/16 :goto_0

    .line 11
    .line 12
    :cond_1
    check-cast p1, La/jpk0;

    .line 13
    .line 14
    iget v0, p0, La/jpk0;->a:I

    .line 15
    .line 16
    iget v2, p1, La/jpk0;->a:I

    .line 17
    .line 18
    if-eq v0, v2, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    iget-object v0, p0, La/jpk0;->b:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v2, p1, La/jpk0;->b:Ljava/lang/String;

    .line 24
    .line 25
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-nez v0, :cond_3

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_3
    iget-object v0, p0, La/jpk0;->c:Ljava/lang/String;

    .line 33
    .line 34
    iget-object v2, p1, La/jpk0;->c:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_4

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_4
    iget-object v0, p0, La/jpk0;->d:Ljava/lang/String;

    .line 44
    .line 45
    iget-object v2, p1, La/jpk0;->d:Ljava/lang/String;

    .line 46
    .line 47
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_5

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_5
    iget-object v0, p0, La/jpk0;->e:Ljava/lang/String;

    .line 55
    .line 56
    iget-object v2, p1, La/jpk0;->e:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_6

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_6
    iget-wide v2, p0, La/jpk0;->f:J

    .line 66
    .line 67
    iget-wide v4, p1, La/jpk0;->f:J

    .line 68
    .line 69
    cmp-long v0, v2, v4

    .line 70
    .line 71
    if-nez v0, :cond_c

    .line 72
    .line 73
    iget-object v0, p0, La/jpk0;->g:La/lwk0;

    .line 74
    .line 75
    iget-object v2, p1, La/jpk0;->g:La/lwk0;

    .line 76
    .line 77
    invoke-virtual {v0, v2}, La/lwk0;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_7

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_7
    iget-object v0, p0, La/jpk0;->h:La/ipk0;

    .line 85
    .line 86
    iget-object v2, p1, La/jpk0;->h:La/ipk0;

    .line 87
    .line 88
    invoke-virtual {v0, v2}, La/ipk0;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_8

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_8
    iget-boolean v0, p0, La/jpk0;->i:Z

    .line 96
    .line 97
    iget-boolean v2, p1, La/jpk0;->i:Z

    .line 98
    .line 99
    if-eq v0, v2, :cond_9

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_9
    iget-wide v2, p0, La/jpk0;->j:J

    .line 103
    .line 104
    iget-wide v4, p1, La/jpk0;->j:J

    .line 105
    .line 106
    invoke-static {v2, v3, v4, v5}, La/znq0;->e(JJ)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_a

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_a
    iget-boolean p0, p0, La/jpk0;->k:Z

    .line 114
    .line 115
    iget-boolean p1, p1, La/jpk0;->k:Z

    .line 116
    .line 117
    if-eq p0, p1, :cond_b

    .line 118
    .line 119
    :goto_0
    return v1

    .line 120
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 121
    return p0

    .line 122
    :cond_c
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, La/jpk0;->a:I

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
    iget-object v2, p0, La/jpk0;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/jpk0;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/jpk0;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/jpk0;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, La/jpk0;->f:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/jpk0;->g:La/lwk0;

    .line 41
    .line 42
    invoke-virtual {v2}, La/lwk0;->hashCode()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    add-int/2addr v2, v0

    .line 47
    mul-int/2addr v2, v1

    .line 48
    iget-object v0, p0, La/jpk0;->h:La/ipk0;

    .line 49
    .line 50
    invoke-virtual {v0}, La/ipk0;->hashCode()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    add-int/2addr v0, v2

    .line 55
    mul-int/2addr v0, v1

    .line 56
    iget-boolean v2, p0, La/jpk0;->i:Z

    .line 57
    .line 58
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-wide v2, p0, La/jpk0;->j:J

    .line 63
    .line 64
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-boolean p0, p0, La/jpk0;->k:Z

    .line 69
    .line 70
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    add-int/2addr p0, v0

    .line 75
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-wide v0, p0, La/jpk0;->f:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/ynq0;->g(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/jpk0;->j:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/znq0;->h(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, ", title="

    .line 14
    .line 15
    const-string v3, ", backgroundUrl="

    .line 16
    .line 17
    iget v4, p0, La/jpk0;->a:I

    .line 18
    .line 19
    const-string v5, "SpecialEventMainStateModel(eventId="

    .line 20
    .line 21
    iget-object v6, p0, La/jpk0;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v4, v5, v2, v6, v3}, La/vqd;->r(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, ", leftPlayerImageUrl="

    .line 28
    .line 29
    const-string v4, ", rightPlayerImageUrl="

    .line 30
    .line 31
    iget-object v5, p0, La/jpk0;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v6, p0, La/jpk0;->d:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v2, v5, v3, v6, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    const-string v3, ", eventStartTimerValue="

    .line 39
    .line 40
    const-string v4, ", tabsStateModel="

    .line 41
    .line 42
    iget-object v5, p0, La/jpk0;->e:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v2, v5, v3, v0, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    iget-object v0, p0, La/jpk0;->g:La/lwk0;

    .line 48
    .line 49
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string v0, ", screenSettings="

    .line 53
    .line 54
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    iget-object v0, p0, La/jpk0;->h:La/ipk0;

    .line 58
    .line 59
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    const-string v0, ", hasTimer="

    .line 63
    .line 64
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    const-string v0, ", eventStartTime="

    .line 68
    .line 69
    const-string v3, ", isThemeDark="

    .line 70
    .line 71
    iget-boolean v4, p0, La/jpk0;->i:Z

    .line 72
    .line 73
    invoke-static {v0, v1, v3, v2, v4}, La/f140;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 74
    .line 75
    .line 76
    const-string v0, ")"

    .line 77
    .line 78
    iget-boolean p0, p0, La/jpk0;->k:Z

    .line 79
    .line 80
    invoke-static {v2, p0, v0}, La/rw2;->p(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0
.end method
