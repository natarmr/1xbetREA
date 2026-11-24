.class public final La/sdp;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/tdp;


# instance fields
.field public final a:J

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:I

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:I

.field public final j:Z


# direct methods
.method public constructor <init>(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;IIZ)V
    .locals 0

    .line 1
    invoke-static {p3, p4, p5, p7, p8}, La/ohs0;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, La/sdp;->a:J

    .line 8
    .line 9
    iput-object p3, p0, La/sdp;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p4, p0, La/sdp;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p5, p0, La/sdp;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput p6, p0, La/sdp;->e:I

    .line 16
    .line 17
    iput-object p7, p0, La/sdp;->f:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p8, p0, La/sdp;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput p9, p0, La/sdp;->h:I

    .line 22
    .line 23
    iput p10, p0, La/sdp;->i:I

    .line 24
    .line 25
    iput-boolean p11, p0, La/sdp;->j:Z

    .line 26
    .line 27
    return-void
.end method


# virtual methods
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
    instance-of v1, p1, La/sdp;

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
    check-cast p1, La/sdp;

    .line 12
    .line 13
    iget-wide v3, p0, La/sdp;->a:J

    .line 14
    .line 15
    iget-wide v5, p1, La/sdp;->a:J

    .line 16
    .line 17
    cmp-long v1, v3, v5

    .line 18
    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    return v2

    .line 22
    :cond_2
    iget-object v1, p0, La/sdp;->b:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v3, p1, La/sdp;->b:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v1

    .line 30
    if-nez v1, :cond_3

    .line 31
    .line 32
    return v2

    .line 33
    :cond_3
    iget-object v1, p0, La/sdp;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v3, p1, La/sdp;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_4

    .line 42
    .line 43
    return v2

    .line 44
    :cond_4
    iget-object v1, p0, La/sdp;->d:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v3, p1, La/sdp;->d:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_5

    .line 53
    .line 54
    return v2

    .line 55
    :cond_5
    iget v1, p0, La/sdp;->e:I

    .line 56
    .line 57
    iget v3, p1, La/sdp;->e:I

    .line 58
    .line 59
    if-eq v1, v3, :cond_6

    .line 60
    .line 61
    return v2

    .line 62
    :cond_6
    iget-object v1, p0, La/sdp;->f:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v3, p1, La/sdp;->f:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-nez v1, :cond_7

    .line 71
    .line 72
    return v2

    .line 73
    :cond_7
    iget-object v1, p0, La/sdp;->g:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v3, p1, La/sdp;->g:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-nez v1, :cond_8

    .line 82
    .line 83
    return v2

    .line 84
    :cond_8
    iget v1, p0, La/sdp;->h:I

    .line 85
    .line 86
    iget v3, p1, La/sdp;->h:I

    .line 87
    .line 88
    if-eq v1, v3, :cond_9

    .line 89
    .line 90
    return v2

    .line 91
    :cond_9
    iget v1, p0, La/sdp;->i:I

    .line 92
    .line 93
    iget v3, p1, La/sdp;->i:I

    .line 94
    .line 95
    if-eq v1, v3, :cond_a

    .line 96
    .line 97
    return v2

    .line 98
    :cond_a
    iget-boolean p0, p0, La/sdp;->j:Z

    .line 99
    .line 100
    iget-boolean p1, p1, La/sdp;->j:Z

    .line 101
    .line 102
    if-eq p0, p1, :cond_b

    .line 103
    .line 104
    return v2

    .line 105
    :cond_b
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-wide v0, p0, La/sdp;->a:J

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
    iget-object v2, p0, La/sdp;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/sdp;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/sdp;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/sdp;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/sdp;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/sdp;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, La/sdp;->h:I

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v2, p0, La/sdp;->i:I

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-boolean p0, p0, La/sdp;->j:Z

    .line 59
    .line 60
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int/2addr p0, v0

    .line 65
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "ViewedCard(id="

    .line 2
    .line 3
    const-string v1, ", imageUrl="

    .line 4
    .line 5
    iget-wide v2, p0, La/sdp;->a:J

    .line 6
    .line 7
    iget-object v4, p0, La/sdp;->b:Ljava/lang/String;

    .line 8
    .line 9
    invoke-static {v2, v3, v0, v1, v4}, La/axq;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    const-string v1, ", fallbackImageUrl="

    .line 14
    .line 15
    const-string v2, ", champLabel="

    .line 16
    .line 17
    iget-object v3, p0, La/sdp;->c:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v4, p0, La/sdp;->d:Ljava/lang/String;

    .line 20
    .line 21
    invoke-static {v0, v1, v3, v2, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v1, ", captionIcon="

    .line 25
    .line 26
    const-string v2, ", opponentLabel="

    .line 27
    .line 28
    iget v3, p0, La/sdp;->e:I

    .line 29
    .line 30
    iget-object v4, p0, La/sdp;->f:Ljava/lang/String;

    .line 31
    .line 32
    invoke-static {v3, v1, v2, v4, v0}, La/w6x;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 33
    .line 34
    .line 35
    const-string v1, ", infoLabel="

    .line 36
    .line 37
    const-string v2, ", placeholder="

    .line 38
    .line 39
    iget v3, p0, La/sdp;->h:I

    .line 40
    .line 41
    iget-object v4, p0, La/sdp;->g:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v3, v1, v4, v2, v0}, La/axq;->s(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 44
    .line 45
    .line 46
    const-string v1, ", errorRes="

    .line 47
    .line 48
    const-string v2, ", underMaintenance="

    .line 49
    .line 50
    iget v3, p0, La/sdp;->i:I

    .line 51
    .line 52
    iget-boolean p0, p0, La/sdp;->j:Z

    .line 53
    .line 54
    invoke-static {v3, v1, v2, v0, p0}, La/dw9;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 55
    .line 56
    .line 57
    const-string p0, ")"

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method
