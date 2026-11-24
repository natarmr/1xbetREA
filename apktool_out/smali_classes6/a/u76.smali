.class public final La/u76;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/b86;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:La/c280;

.field public final f:La/c280;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:J

.field public final j:La/stm;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLa/c280;La/c280;Ljava/lang/String;Ljava/lang/String;JLa/stm;)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p3, p8, p9}, La/ohs0;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/u76;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, La/u76;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, La/u76;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-wide p4, p0, La/u76;->d:J

    .line 14
    .line 15
    iput-object p6, p0, La/u76;->e:La/c280;

    .line 16
    .line 17
    iput-object p7, p0, La/u76;->f:La/c280;

    .line 18
    .line 19
    iput-object p8, p0, La/u76;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p9, p0, La/u76;->h:Ljava/lang/String;

    .line 22
    .line 23
    iput-wide p10, p0, La/u76;->i:J

    .line 24
    .line 25
    iput-object p12, p0, La/u76;->j:La/stm;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
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
    instance-of v0, p1, La/u76;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/u76;

    .line 12
    .line 13
    iget-object v0, p0, La/u76;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/u76;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, La/u76;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, La/u76;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    iget-object v0, p0, La/u76;->c:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v1, p1, La/u76;->c:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    iget-wide v0, p1, La/u76;->d:J

    .line 48
    .line 49
    sget v2, La/y3d;->h:I

    .line 50
    .line 51
    iget-wide v2, p0, La/u76;->d:J

    .line 52
    .line 53
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    if-nez v0, :cond_5

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_5
    iget-object v0, p0, La/u76;->e:La/c280;

    .line 61
    .line 62
    iget-object v1, p1, La/u76;->e:La/c280;

    .line 63
    .line 64
    invoke-virtual {v0, v1}, La/c280;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    if-nez v0, :cond_6

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_6
    iget-object v0, p0, La/u76;->f:La/c280;

    .line 72
    .line 73
    iget-object v1, p1, La/u76;->f:La/c280;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, La/c280;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    if-nez v0, :cond_7

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_7
    iget-object v0, p0, La/u76;->g:Ljava/lang/String;

    .line 83
    .line 84
    iget-object v1, p1, La/u76;->g:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    if-nez v0, :cond_8

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_8
    iget-object v0, p0, La/u76;->h:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v1, p1, La/u76;->h:Ljava/lang/String;

    .line 96
    .line 97
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_9

    .line 102
    .line 103
    goto :goto_0

    .line 104
    :cond_9
    iget-wide v0, p0, La/u76;->i:J

    .line 105
    .line 106
    iget-wide v2, p1, La/u76;->i:J

    .line 107
    .line 108
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-nez v0, :cond_a

    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_a
    iget-object p0, p0, La/u76;->j:La/stm;

    .line 116
    .line 117
    iget-object p1, p1, La/u76;->j:La/stm;

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result p0

    .line 123
    if-nez p0, :cond_b

    .line 124
    .line 125
    :goto_0
    const/4 p0, 0x0

    .line 126
    return p0

    .line 127
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 128
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/u76;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    iget-object v2, p0, La/u76;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/u76;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sget v2, La/y3d;->h:I

    .line 23
    .line 24
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 25
    .line 26
    iget-wide v2, p0, La/u76;->d:J

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, La/u76;->e:La/c280;

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, La/hne;->g(La/c280;II)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v2, p0, La/u76;->f:La/c280;

    .line 39
    .line 40
    invoke-static {v2, v0, v1}, La/hne;->g(La/c280;II)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, La/u76;->g:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, La/u76;->h:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-wide v2, p0, La/u76;->i:J

    .line 57
    .line 58
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-object p0, p0, La/u76;->j:La/stm;

    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    add-int/2addr p0, v0

    .line 69
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 7

    .line 1
    iget-wide v0, p0, La/u76;->d:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/u76;->i:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, ", teamOneName="

    .line 14
    .line 15
    const-string v3, ", teamOneScore="

    .line 16
    .line 17
    const-string v4, "Cricket(infoLabel="

    .line 18
    .line 19
    iget-object v5, p0, La/u76;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v6, p0, La/u76;->b:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v4, v5, v2, v6, v3}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    const-string v3, ", teamOneScoreColor="

    .line 28
    .line 29
    const-string v4, ", teamOneLogo="

    .line 30
    .line 31
    iget-object v5, p0, La/u76;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v2, v5, v3, v0, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v0, ", teamTwoLogo="

    .line 37
    .line 38
    const-string v3, ", teamTwoName="

    .line 39
    .line 40
    iget-object v4, p0, La/u76;->e:La/c280;

    .line 41
    .line 42
    iget-object v5, p0, La/u76;->f:La/c280;

    .line 43
    .line 44
    invoke-static {v2, v4, v0, v5, v3}, La/f140;->u(Ljava/lang/StringBuilder;La/c280;Ljava/lang/String;La/c280;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string v0, ", teamTwoScore="

    .line 48
    .line 49
    const-string v3, ", teamTwoScoreColor="

    .line 50
    .line 51
    iget-object v4, p0, La/u76;->g:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v5, p0, La/u76;->h:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v2, v4, v0, v5, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    const-string v0, ", options="

    .line 62
    .line 63
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    iget-object p0, p0, La/u76;->j:La/stm;

    .line 67
    .line 68
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    const-string p0, ")"

    .line 72
    .line 73
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method
