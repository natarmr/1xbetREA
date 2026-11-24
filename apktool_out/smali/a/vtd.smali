.class public final La/vtd;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/aud;


# instance fields
.field public final a:J

.field public final b:J

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:D

.field public final h:B


# direct methods
.method public constructor <init>(JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DI)V
    .locals 0

    .line 1
    invoke-static {p5, p6, p7, p8}, La/cs0;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, La/vtd;->a:J

    .line 8
    .line 9
    iput-wide p3, p0, La/vtd;->b:J

    .line 10
    .line 11
    iput-object p5, p0, La/vtd;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-object p6, p0, La/vtd;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p7, p0, La/vtd;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p8, p0, La/vtd;->f:Ljava/lang/String;

    .line 18
    .line 19
    iput-wide p9, p0, La/vtd;->g:D

    .line 20
    .line 21
    iput-byte p11, p0, La/vtd;->h:B

    .line 22
    .line 23
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
    instance-of v0, p1, La/vtd;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/vtd;

    .line 10
    .line 11
    iget-wide v0, p0, La/vtd;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, La/vtd;->a:J

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    iget-wide v0, p0, La/vtd;->b:J

    .line 21
    .line 22
    iget-wide v2, p1, La/vtd;->b:J

    .line 23
    .line 24
    cmp-long v0, v0, v2

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_3
    iget-object v0, p0, La/vtd;->c:Ljava/lang/String;

    .line 30
    .line 31
    iget-object v1, p1, La/vtd;->c:Ljava/lang/String;

    .line 32
    .line 33
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-nez v0, :cond_4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iget-object v0, p0, La/vtd;->d:Ljava/lang/String;

    .line 41
    .line 42
    iget-object v1, p1, La/vtd;->d:Ljava/lang/String;

    .line 43
    .line 44
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-nez v0, :cond_5

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_5
    iget-object v0, p0, La/vtd;->e:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v1, p1, La/vtd;->e:Ljava/lang/String;

    .line 54
    .line 55
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-nez v0, :cond_6

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_6
    iget-object v0, p0, La/vtd;->f:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v1, p1, La/vtd;->f:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    if-nez v0, :cond_7

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_7
    iget-wide v0, p0, La/vtd;->g:D

    .line 74
    .line 75
    iget-wide v2, p1, La/vtd;->g:D

    .line 76
    .line 77
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Double;->compare(DD)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_8

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_8
    iget-byte p0, p0, La/vtd;->h:B

    .line 85
    .line 86
    iget-byte p1, p1, La/vtd;->h:B

    .line 87
    .line 88
    if-eq p0, p1, :cond_9

    .line 89
    .line 90
    :goto_0
    const/4 p0, 0x0

    .line 91
    return p0

    .line 92
    :cond_9
    :goto_1
    const/4 p0, 0x1

    .line 93
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/vtd;->a:J

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
    iget-wide v2, p0, La/vtd;->b:J

    .line 11
    .line 12
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/vtd;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/vtd;->d:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/vtd;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/vtd;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-wide v2, p0, La/vtd;->g:D

    .line 41
    .line 42
    invoke-static {v2, v3, v0, v1}, La/brm0;->d(DII)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-byte p0, p0, La/vtd;->h:B

    .line 47
    .line 48
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    add-int/2addr p0, v0

    .line 53
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "EventChanged(sportId="

    .line 2
    .line 3
    const-string v1, ", subSportId="

    .line 4
    .line 5
    iget-wide v2, p0, La/vtd;->a:J

    .line 6
    .line 7
    invoke-static {v2, v3, v0, v1}, La/kng0;->q(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, ", matchName="

    .line 12
    .line 13
    iget-wide v2, p0, La/vtd;->b:J

    .line 14
    .line 15
    iget-object v4, p0, La/vtd;->c:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v2, v3, v1, v4}, La/kng0;->z(Ljava/lang/StringBuilder;JLjava/lang/String;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string v1, ", groupName="

    .line 21
    .line 22
    const-string v2, ", betName="

    .line 23
    .line 24
    iget-object v3, p0, La/vtd;->d:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v4, p0, La/vtd;->e:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v0, v1, v3, v2, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    const-string v1, ", coefViewName="

    .line 32
    .line 33
    const-string v2, ", calcualtedCoef="

    .line 34
    .line 35
    iget-object v3, p0, La/vtd;->f:Ljava/lang/String;

    .line 36
    .line 37
    invoke-static {v0, v1, v3, v2}, La/hne;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    const-string v1, ", coefViewTypeId="

    .line 41
    .line 42
    iget-wide v2, p0, La/vtd;->g:D

    .line 43
    .line 44
    iget-byte p0, p0, La/vtd;->h:B

    .line 45
    .line 46
    invoke-static {v0, v2, v3, v1, p0}, La/rz4;->w(Ljava/lang/StringBuilder;DLjava/lang/String;I)V

    .line 47
    .line 48
    .line 49
    const-string p0, ")"

    .line 50
    .line 51
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    return-object p0
.end method
