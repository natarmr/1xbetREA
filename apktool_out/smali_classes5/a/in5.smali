.class public final La/in5;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z

.field public final b:Z

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:J

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)V
    .locals 0

    .line 1
    invoke-static {p6, p7, p8}, La/brm0;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p9, p0, La/in5;->a:Z

    .line 8
    .line 9
    iput-boolean p10, p0, La/in5;->b:Z

    .line 10
    .line 11
    iput-object p3, p0, La/in5;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p4, p0, La/in5;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p5, p0, La/in5;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-wide p1, p0, La/in5;->f:J

    .line 18
    .line 19
    iput-object p6, p0, La/in5;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p7, p0, La/in5;->h:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p8, p0, La/in5;->i:Ljava/lang/String;

    .line 24
    .line 25
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
    instance-of v0, p1, La/in5;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/in5;

    .line 11
    .line 12
    iget-boolean v0, p0, La/in5;->a:Z

    .line 13
    .line 14
    iget-boolean v1, p1, La/in5;->a:Z

    .line 15
    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget-boolean v0, p0, La/in5;->b:Z

    .line 20
    .line 21
    iget-boolean v1, p1, La/in5;->b:Z

    .line 22
    .line 23
    if-eq v0, v1, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    iget-object v0, p0, La/in5;->c:Ljava/lang/String;

    .line 27
    .line 28
    iget-object v1, p1, La/in5;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-nez v0, :cond_4

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_4
    iget-object v0, p0, La/in5;->d:Ljava/lang/String;

    .line 38
    .line 39
    iget-object v1, p1, La/in5;->d:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-nez v0, :cond_5

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_5
    iget-object v0, p0, La/in5;->e:Ljava/lang/String;

    .line 49
    .line 50
    iget-object v1, p1, La/in5;->e:Ljava/lang/String;

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_6

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_6
    iget-wide v0, p1, La/in5;->f:J

    .line 60
    .line 61
    sget v2, La/y3d;->h:I

    .line 62
    .line 63
    iget-wide v2, p0, La/in5;->f:J

    .line 64
    .line 65
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_7

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_7
    iget-object v0, p0, La/in5;->g:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v1, p1, La/in5;->g:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_8

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_8
    iget-object v0, p0, La/in5;->h:Ljava/lang/String;

    .line 84
    .line 85
    iget-object v1, p1, La/in5;->h:Ljava/lang/String;

    .line 86
    .line 87
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_9

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_9
    iget-object p0, p0, La/in5;->i:Ljava/lang/String;

    .line 95
    .line 96
    iget-object p1, p1, La/in5;->i:Ljava/lang/String;

    .line 97
    .line 98
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result p0

    .line 102
    if-nez p0, :cond_a

    .line 103
    .line 104
    :goto_0
    const/4 p0, 0x0

    .line 105
    return p0

    .line 106
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 107
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-boolean v0, p0, La/in5;->a:Z

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

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
    iget-boolean v2, p0, La/in5;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/in5;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/in5;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/in5;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    sget v2, La/y3d;->h:I

    .line 35
    .line 36
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 37
    .line 38
    iget-wide v2, p0, La/in5;->f:J

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, La/in5;->g:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, La/in5;->h:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object p0, p0, La/in5;->i:Ljava/lang/String;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    add-int/2addr p0, v0

    .line 63
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-wide v0, p0, La/in5;->f:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, ", showRegistrationsButtons="

    .line 8
    .line 9
    const-string v2, ", money="

    .line 10
    .line 11
    const-string v3, "BalanceUiState(showBalance="

    .line 12
    .line 13
    iget-boolean v4, p0, La/in5;->a:Z

    .line 14
    .line 15
    iget-boolean v5, p0, La/in5;->b:Z

    .line 16
    .line 17
    invoke-static {v3, v1, v2, v4, v5}, La/f140;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const-string v2, ", currency="

    .line 22
    .line 23
    const-string v3, ", balanceName="

    .line 24
    .line 25
    iget-object v4, p0, La/in5;->c:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v5, p0, La/in5;->d:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v1, v4, v2, v5, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v2, ", authorizationButtonsBackground="

    .line 33
    .line 34
    const-string v3, ", authorizationButtonLabel="

    .line 35
    .line 36
    iget-object v4, p0, La/in5;->e:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v1, v4, v2, v0, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 39
    .line 40
    .line 41
    const-string v0, ", registrationButtonLabel="

    .line 42
    .line 43
    const-string v2, ", topUpButtonLabel="

    .line 44
    .line 45
    iget-object v3, p0, La/in5;->g:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v4, p0, La/in5;->h:Ljava/lang/String;

    .line 48
    .line 49
    invoke-static {v1, v3, v0, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const-string v0, ")"

    .line 53
    .line 54
    iget-object p0, p0, La/in5;->i:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v1, p0, v0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method
