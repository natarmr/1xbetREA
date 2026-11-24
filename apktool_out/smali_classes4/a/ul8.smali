.class public final La/ul8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vl8;


# instance fields
.field public final a:J

.field public final b:La/imm;

.field public final c:Z

.field public final d:La/ijl;

.field public final e:La/jjl;

.field public final f:La/gjl;

.field public final g:La/bgi0;

.field public final h:J

.field public final i:Z

.field public final j:La/mdm;


# direct methods
.method public constructor <init>(JLa/imm;ZLa/ijl;La/jjl;La/gjl;La/bgi0;JZLa/mdm;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-wide p1, p0, La/ul8;->a:J

    .line 23
    .line 24
    iput-object p3, p0, La/ul8;->b:La/imm;

    .line 25
    .line 26
    iput-boolean p4, p0, La/ul8;->c:Z

    .line 27
    .line 28
    iput-object p5, p0, La/ul8;->d:La/ijl;

    .line 29
    .line 30
    iput-object p6, p0, La/ul8;->e:La/jjl;

    .line 31
    .line 32
    iput-object p7, p0, La/ul8;->f:La/gjl;

    .line 33
    .line 34
    iput-object p8, p0, La/ul8;->g:La/bgi0;

    .line 35
    .line 36
    iput-wide p9, p0, La/ul8;->h:J

    .line 37
    .line 38
    iput-boolean p11, p0, La/ul8;->i:Z

    .line 39
    .line 40
    iput-object p12, p0, La/ul8;->j:La/mdm;

    .line 41
    .line 42
    return-void
.end method


# virtual methods
.method public final a()La/imm;
    .locals 0

    .line 1
    iget-object p0, p0, La/ul8;->b:La/imm;

    .line 2
    .line 3
    return-object p0
.end method

.method public final c()La/ijl;
    .locals 0

    .line 1
    iget-object p0, p0, La/ul8;->d:La/ijl;

    .line 2
    .line 3
    return-object p0
.end method

.method public final d()La/jjl;
    .locals 0

    .line 1
    iget-object p0, p0, La/ul8;->e:La/jjl;

    .line 2
    .line 3
    return-object p0
.end method

.method public final e()La/gjl;
    .locals 0

    .line 1
    iget-object p0, p0, La/ul8;->f:La/gjl;

    .line 2
    .line 3
    return-object p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/ul8;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, La/ul8;

    .line 12
    .line 13
    iget-wide v3, p1, La/ul8;->a:J

    .line 14
    .line 15
    sget v1, La/y3d;->h:I

    .line 16
    .line 17
    iget-wide v5, p0, La/ul8;->a:J

    .line 18
    .line 19
    invoke-static {v5, v6, v3, v4}, La/h2t0;->a(JJ)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    return v2

    .line 26
    :cond_2
    iget-object v1, p0, La/ul8;->b:La/imm;

    .line 27
    .line 28
    iget-object v3, p1, La/ul8;->b:La/imm;

    .line 29
    .line 30
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    return v2

    .line 37
    :cond_3
    iget-boolean v1, p0, La/ul8;->c:Z

    .line 38
    .line 39
    iget-boolean v3, p1, La/ul8;->c:Z

    .line 40
    .line 41
    if-eq v1, v3, :cond_4

    .line 42
    .line 43
    return v2

    .line 44
    :cond_4
    iget-object v1, p0, La/ul8;->d:La/ijl;

    .line 45
    .line 46
    iget-object v3, p1, La/ul8;->d:La/ijl;

    .line 47
    .line 48
    if-eq v1, v3, :cond_5

    .line 49
    .line 50
    return v2

    .line 51
    :cond_5
    iget-object v1, p0, La/ul8;->e:La/jjl;

    .line 52
    .line 53
    iget-object v3, p1, La/ul8;->e:La/jjl;

    .line 54
    .line 55
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_6

    .line 60
    .line 61
    return v2

    .line 62
    :cond_6
    iget-object v1, p0, La/ul8;->f:La/gjl;

    .line 63
    .line 64
    iget-object v3, p1, La/ul8;->f:La/gjl;

    .line 65
    .line 66
    if-eq v1, v3, :cond_7

    .line 67
    .line 68
    return v2

    .line 69
    :cond_7
    iget-object v1, p0, La/ul8;->g:La/bgi0;

    .line 70
    .line 71
    iget-object v3, p1, La/ul8;->g:La/bgi0;

    .line 72
    .line 73
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v1

    .line 77
    if-nez v1, :cond_8

    .line 78
    .line 79
    return v2

    .line 80
    :cond_8
    iget-wide v3, p0, La/ul8;->h:J

    .line 81
    .line 82
    iget-wide v5, p1, La/ul8;->h:J

    .line 83
    .line 84
    invoke-static {v3, v4, v5, v6}, La/h2t0;->a(JJ)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-nez v1, :cond_9

    .line 89
    .line 90
    return v2

    .line 91
    :cond_9
    iget-boolean v1, p0, La/ul8;->i:Z

    .line 92
    .line 93
    iget-boolean v3, p1, La/ul8;->i:Z

    .line 94
    .line 95
    if-eq v1, v3, :cond_a

    .line 96
    .line 97
    return v2

    .line 98
    :cond_a
    iget-object p0, p0, La/ul8;->j:La/mdm;

    .line 99
    .line 100
    iget-object p1, p1, La/ul8;->j:La/mdm;

    .line 101
    .line 102
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-nez p0, :cond_b

    .line 107
    .line 108
    return v2

    .line 109
    :cond_b
    return v0
.end method

.method public final f()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/ul8;->i:Z

    .line 2
    .line 3
    return p0
.end method

.method public final g()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/ul8;->c:Z

    .line 2
    .line 3
    return p0
.end method

.method public final h()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/ul8;->h:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    sget v0, La/y3d;->h:I

    .line 2
    .line 3
    sget-object v0, La/h2t0;->b:La/g2t0;

    .line 4
    .line 5
    iget-wide v0, p0, La/ul8;->a:J

    .line 6
    .line 7
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/16 v1, 0x1f

    .line 12
    .line 13
    mul-int/2addr v0, v1

    .line 14
    iget-object v2, p0, La/ul8;->b:La/imm;

    .line 15
    .line 16
    invoke-static {v2, v0, v1}, La/h97;->a(La/imm;II)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-boolean v2, p0, La/ul8;->c:Z

    .line 21
    .line 22
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v2, p0, La/ul8;->d:La/ijl;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    add-int/2addr v2, v0

    .line 33
    mul-int/2addr v2, v1

    .line 34
    iget-object v0, p0, La/ul8;->e:La/jjl;

    .line 35
    .line 36
    invoke-virtual {v0}, La/jjl;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    add-int/2addr v0, v2

    .line 41
    mul-int/2addr v0, v1

    .line 42
    iget-object v2, p0, La/ul8;->f:La/gjl;

    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    add-int/2addr v2, v0

    .line 49
    mul-int/2addr v2, v1

    .line 50
    iget-object v0, p0, La/ul8;->g:La/bgi0;

    .line 51
    .line 52
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    add-int/2addr v0, v2

    .line 57
    mul-int/2addr v0, v1

    .line 58
    iget-wide v2, p0, La/ul8;->h:J

    .line 59
    .line 60
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-boolean v2, p0, La/ul8;->i:Z

    .line 65
    .line 66
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object p0, p0, La/ul8;->j:La/mdm;

    .line 71
    .line 72
    invoke-virtual {p0}, La/mdm;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    add-int/2addr p0, v0

    .line 77
    return p0
.end method

.method public final i()J
    .locals 2

    .line 1
    iget-wide v0, p0, La/ul8;->a:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final j()La/bgi0;
    .locals 0

    .line 1
    iget-object p0, p0, La/ul8;->g:La/bgi0;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-wide v0, p0, La/ul8;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/ul8;->h:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Ljava/lang/StringBuilder;

    .line 14
    .line 15
    const-string v3, "Error(screenBgColor="

    .line 16
    .line 17
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v0, ", navBarUiModel="

    .line 24
    .line 25
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v0, p0, La/ul8;->b:La/imm;

    .line 29
    .line 30
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, ", accountSelectionVisible="

    .line 34
    .line 35
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-boolean v0, p0, La/ul8;->c:Z

    .line 39
    .line 40
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v0, ", accountSelectionStyle="

    .line 44
    .line 45
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object v0, p0, La/ul8;->d:La/ijl;

    .line 49
    .line 50
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v0, ", accountSelectionUiModel="

    .line 54
    .line 55
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v0, p0, La/ul8;->e:La/jjl;

    .line 59
    .line 60
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v0, ", accountSelectionColorMode="

    .line 64
    .line 65
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    iget-object v0, p0, La/ul8;->f:La/gjl;

    .line 69
    .line 70
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v0, ", topContentSeparatorStyle="

    .line 74
    .line 75
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    iget-object v0, p0, La/ul8;->g:La/bgi0;

    .line 79
    .line 80
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v0, ", systemBarsColor="

    .line 84
    .line 85
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    const-string v0, ", tabBarVisible="

    .line 92
    .line 93
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    iget-boolean v0, p0, La/ul8;->i:Z

    .line 97
    .line 98
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v0, ", config="

    .line 102
    .line 103
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    iget-object p0, p0, La/ul8;->j:La/mdm;

    .line 107
    .line 108
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string p0, ")"

    .line 112
    .line 113
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object p0

    .line 120
    return-object p0
.end method
