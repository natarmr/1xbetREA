.class public final La/ttd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/aud;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:J

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:D

.field public final i:B


# direct methods
.method public constructor <init>(JJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DI)V
    .locals 0

    .line 1
    invoke-static {p7, p8, p9, p10}, La/cs0;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, La/ttd;->a:J

    .line 8
    .line 9
    iput-wide p3, p0, La/ttd;->b:J

    .line 10
    .line 11
    iput-wide p5, p0, La/ttd;->c:J

    .line 12
    .line 13
    iput-object p7, p0, La/ttd;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p8, p0, La/ttd;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p9, p0, La/ttd;->f:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p10, p0, La/ttd;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput-wide p11, p0, La/ttd;->h:D

    .line 22
    .line 23
    iput-byte p13, p0, La/ttd;->i:B

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
    instance-of v0, p1, La/ttd;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/ttd;

    .line 11
    .line 12
    iget-wide v0, p0, La/ttd;->a:J

    .line 13
    .line 14
    iget-wide v2, p1, La/ttd;->a:J

    .line 15
    .line 16
    cmp-long v0, v0, v2

    .line 17
    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_2
    iget-wide v0, p0, La/ttd;->b:J

    .line 22
    .line 23
    iget-wide v2, p1, La/ttd;->b:J

    .line 24
    .line 25
    cmp-long v0, v0, v2

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_3
    iget-wide v0, p0, La/ttd;->c:J

    .line 31
    .line 32
    iget-wide v2, p1, La/ttd;->c:J

    .line 33
    .line 34
    cmp-long v0, v0, v2

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_4
    iget-object v0, p0, La/ttd;->d:Ljava/lang/String;

    .line 40
    .line 41
    iget-object v1, p1, La/ttd;->d:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v0

    .line 47
    if-nez v0, :cond_5

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_5
    iget-object v0, p0, La/ttd;->e:Ljava/lang/String;

    .line 51
    .line 52
    iget-object v1, p1, La/ttd;->e:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-nez v0, :cond_6

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_6
    iget-object v0, p0, La/ttd;->f:Ljava/lang/String;

    .line 62
    .line 63
    iget-object v1, p1, La/ttd;->f:Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/ttd;->g:Ljava/lang/String;

    .line 73
    .line 74
    iget-object v1, p1, La/ttd;->g:Ljava/lang/String;

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
    iget-wide v0, p0, La/ttd;->h:D

    .line 84
    .line 85
    iget-wide v2, p1, La/ttd;->h:D

    .line 86
    .line 87
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_9

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_9
    iget-byte p0, p0, La/ttd;->i:B

    .line 95
    .line 96
    iget-byte p1, p1, La/ttd;->i:B

    .line 97
    .line 98
    if-eq p0, p1, :cond_a

    .line 99
    .line 100
    :goto_0
    const/4 p0, 0x0

    .line 101
    return p0

    .line 102
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 103
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/ttd;->a:J

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
    iget-wide v2, p0, La/ttd;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-wide v2, p0, La/ttd;->c:J

    .line 17
    .line 18
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/ttd;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/ttd;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/ttd;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/ttd;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-wide v2, p0, La/ttd;->h:D

    .line 47
    .line 48
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-byte p0, p0, La/ttd;->i:B

    .line 53
    .line 54
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    add-int/2addr p0, v0

    .line 59
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "EventAdded(sportId="

    .line 2
    .line 3
    const-string v1, ", subSportId="

    .line 4
    .line 5
    iget-wide v2, p0, La/ttd;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    iget-wide v1, p0, La/ttd;->b:J

    .line 12
    .line 13
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    const-string v1, ", couponSize="

    .line 17
    .line 18
    const-string v2, ", matchName="

    .line 19
    .line 20
    iget-wide v3, p0, La/ttd;->c:J

    .line 21
    .line 22
    invoke-static {v0, v1, v3, v4, v2}, La/kng0;->A(Ljava/lang/StringBuilder;Ljava/lang/String;JLjava/lang/String;)V

    .line 23
    .line 24
    .line 25
    const-string v1, ", groupName="

    .line 26
    .line 27
    const-string v2, ", betName="

    .line 28
    .line 29
    iget-object v3, p0, La/ttd;->d:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v4, p0, La/ttd;->e:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    const-string v1, ", coefViewName="

    .line 37
    .line 38
    const-string v2, ", calcualtedCoef="

    .line 39
    .line 40
    iget-object v3, p0, La/ttd;->f:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v4, p0, La/ttd;->g:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    const-string v1, ", coefViewTypeId="

    .line 48
    .line 49
    iget-wide v2, p0, La/ttd;->h:D

    .line 50
    .line 51
    iget-byte p0, p0, La/ttd;->i:B

    .line 52
    .line 53
    invoke-static {v0, v2, v3, v1, p0}, La/rz4;->w(Ljava/lang/StringBuilder;DLjava/lang/String;I)V

    .line 54
    .line 55
    .line 56
    const-string p0, ")"

    .line 57
    .line 58
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    return-object p0
.end method
