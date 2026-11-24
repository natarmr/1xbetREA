.class public final La/v1s0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;


# instance fields
.field public final a:B

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Z

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:Ljava/lang/String;


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZIII)V
    .locals 1

    .line 1
    invoke-static {p4, p5, p6}, La/brm0;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    long-to-int v0, p1

    .line 8
    iput-byte v0, p0, La/v1s0;->a:B

    .line 9
    .line 10
    iput-object p3, p0, La/v1s0;->b:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p4, p0, La/v1s0;->c:Ljava/lang/String;

    .line 13
    .line 14
    iput-object p5, p0, La/v1s0;->d:Ljava/lang/String;

    .line 15
    .line 16
    iput-object p6, p0, La/v1s0;->e:Ljava/lang/String;

    .line 17
    .line 18
    iput-boolean p7, p0, La/v1s0;->f:Z

    .line 19
    .line 20
    iput p8, p0, La/v1s0;->g:I

    .line 21
    .line 22
    iput p9, p0, La/v1s0;->h:I

    .line 23
    .line 24
    iput p10, p0, La/v1s0;->i:I

    .line 25
    .line 26
    const-class p3, La/v1s0;

    .line 27
    .line 28
    sget-object p4, La/sre0;->a:La/tre0;

    .line 29
    .line 30
    invoke-virtual {p4, p3}, La/tre0;->b(Ljava/lang/Class;)La/sgy;

    .line 31
    .line 32
    .line 33
    move-result-object p3

    .line 34
    invoke-interface {p3}, La/sgy;->J()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p3

    .line 38
    new-instance p4, Ljava/lang/StringBuilder;

    .line 39
    .line 40
    invoke-direct {p4}, Ljava/lang/StringBuilder;-><init>()V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string p3, "_"

    .line 47
    .line 48
    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p4, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, La/v1s0;->j:Ljava/lang/String;

    .line 59
    .line 60
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/v1s0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/v1s0;

    .line 10
    .line 11
    iget-byte v0, p0, La/v1s0;->a:B

    .line 12
    .line 13
    int-to-long v0, v0

    .line 14
    iget-byte v2, p1, La/v1s0;->a:B

    .line 15
    .line 16
    int-to-long v2, v2

    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, La/v1s0;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, p1, La/v1s0;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-nez v0, :cond_3

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_3
    iget-object v0, p0, La/v1s0;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/v1s0;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/v1s0;->d:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v1, p1, La/v1s0;->d:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/v1s0;->e:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v1, p1, La/v1s0;->e:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/v1s0;->f:Z

    .line 67
    .line 68
    iget-boolean v1, p1, La/v1s0;->f:Z

    .line 69
    .line 70
    if-eq v0, v1, :cond_7

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_7
    iget v0, p0, La/v1s0;->g:I

    .line 74
    .line 75
    iget v1, p1, La/v1s0;->g:I

    .line 76
    .line 77
    if-eq v0, v1, :cond_8

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_8
    iget v0, p0, La/v1s0;->h:I

    .line 81
    .line 82
    iget v1, p1, La/v1s0;->h:I

    .line 83
    .line 84
    if-eq v0, v1, :cond_9

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_9
    iget p0, p0, La/v1s0;->i:I

    .line 88
    .line 89
    iget p1, p1, La/v1s0;->i:I

    .line 90
    .line 91
    if-eq p0, p1, :cond_a

    .line 92
    .line 93
    :goto_0
    const/4 p0, 0x0

    .line 94
    return p0

    .line 95
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 96
    return p0
.end method

.method public final g(La/p6t0;La/p6t0;)Z
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
    invoke-interface {p1}, La/p6t0;->getKey()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p2}, La/p6t0;->getKey()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/v1s0;->j:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(La/p6t0;La/p6t0;)Z
    .locals 0

    .line 1
    invoke-static {p1, p2, p1, p2}, La/rw2;->y(La/p6t0;La/p6t0;La/p6t0;La/p6t0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-byte v0, p0, La/v1s0;->a:B

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    const/16 v1, 0x1f

    .line 9
    .line 10
    mul-int/2addr v0, v1

    .line 11
    iget-object v2, p0, La/v1s0;->b:Ljava/lang/String;

    .line 12
    .line 13
    const/16 v3, 0x745f

    .line 14
    .line 15
    invoke-static {v0, v3, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iget-object v2, p0, La/v1s0;->c:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v2, p0, La/v1s0;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v2, p0, La/v1s0;->e:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-boolean v2, p0, La/v1s0;->f:Z

    .line 38
    .line 39
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    iget v2, p0, La/v1s0;->g:I

    .line 44
    .line 45
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget v2, p0, La/v1s0;->h:I

    .line 50
    .line 51
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget p0, p0, La/v1s0;->i:I

    .line 56
    .line 57
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 58
    .line 59
    .line 60
    move-result p0

    .line 61
    add-int/2addr p0, v0

    .line 62
    return p0
.end method

.method public final o(La/p6t0;La/p6t0;)Ljava/util/Collection;
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
    sget-object p0, La/iun;->a:La/iun;

    .line 8
    .line 9
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    iget-byte v0, p0, La/v1s0;->a:B

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    const-string v2, "TournamentInformationUiModel(id="

    .line 5
    .line 6
    const-string v3, ", date="

    .line 7
    .line 8
    iget-object v4, p0, La/v1s0;->b:Ljava/lang/String;

    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3, v4}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, ", type=, place=, descriptionShort="

    .line 15
    .line 16
    const-string v2, ", descriptionLong="

    .line 17
    .line 18
    iget-object v3, p0, La/v1s0;->c:Ljava/lang/String;

    .line 19
    .line 20
    iget-object v4, p0, La/v1s0;->d:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v0, v1, v3, v2, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v1, ", total="

    .line 26
    .line 27
    const-string v2, ", collapsed="

    .line 28
    .line 29
    iget-object v3, p0, La/v1s0;->e:Ljava/lang/String;

    .line 30
    .line 31
    iget-boolean v4, p0, La/v1s0;->f:Z

    .line 32
    .line 33
    invoke-static {v1, v3, v2, v0, v4}, La/w6x;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 34
    .line 35
    .line 36
    const-string v1, ", totalColorStart="

    .line 37
    .line 38
    const-string v2, ", totalColorEnd="

    .line 39
    .line 40
    iget v3, p0, La/v1s0;->g:I

    .line 41
    .line 42
    iget v4, p0, La/v1s0;->h:I

    .line 43
    .line 44
    invoke-static {v3, v4, v1, v2, v0}, La/rw2;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 45
    .line 46
    .line 47
    const-string v1, ", descriptionTitleColor="

    .line 48
    .line 49
    const-string v2, ")"

    .line 50
    .line 51
    iget p0, p0, La/v1s0;->i:I

    .line 52
    .line 53
    invoke-static {v0, v1, p0, v2}, La/vqd;->p(Ljava/lang/StringBuilder;Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    return-object p0
.end method
