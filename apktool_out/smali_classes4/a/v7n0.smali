.class public final La/v7n0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Z

.field public final g:J


# direct methods
.method public constructor <init>(IIIJLjava/lang/String;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, La/v7n0;->a:I

    .line 8
    .line 9
    iput p2, p0, La/v7n0;->b:I

    .line 10
    .line 11
    iput p3, p0, La/v7n0;->c:I

    .line 12
    .line 13
    iput-object p6, p0, La/v7n0;->d:Ljava/lang/String;

    .line 14
    .line 15
    iput-object p7, p0, La/v7n0;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-boolean p8, p0, La/v7n0;->f:Z

    .line 18
    .line 19
    iput-wide p4, p0, La/v7n0;->g:J

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, La/v7n0;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/v7n0;

    .line 11
    .line 12
    iget v1, p0, La/v7n0;->a:I

    .line 13
    .line 14
    iget v2, p1, La/v7n0;->a:I

    .line 15
    .line 16
    if-eq v1, v2, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget v1, p0, La/v7n0;->b:I

    .line 20
    .line 21
    iget v2, p1, La/v7n0;->b:I

    .line 22
    .line 23
    if-eq v1, v2, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    iget v1, p0, La/v7n0;->c:I

    .line 27
    .line 28
    iget v2, p1, La/v7n0;->c:I

    .line 29
    .line 30
    if-eq v1, v2, :cond_4

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_4
    iget-object v1, p0, La/v7n0;->d:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v2, p1, La/v7n0;->d:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    if-nez v1, :cond_5

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_5
    iget-object v1, p0, La/v7n0;->e:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v2, p1, La/v7n0;->e:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_6

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_6
    iget-boolean v1, p0, La/v7n0;->f:Z

    .line 56
    .line 57
    iget-boolean v2, p1, La/v7n0;->f:Z

    .line 58
    .line 59
    if-eq v1, v2, :cond_7

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_7
    iget-wide v1, p0, La/v7n0;->g:J

    .line 63
    .line 64
    iget-wide p0, p1, La/v7n0;->g:J

    .line 65
    .line 66
    cmp-long p0, v1, p0

    .line 67
    .line 68
    if-eqz p0, :cond_8

    .line 69
    .line 70
    :goto_0
    const/4 p0, 0x0

    .line 71
    return p0

    .line 72
    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget v0, p0, La/v7n0;->a:I

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
    iget v2, p0, La/v7n0;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/v7n0;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v2, 0x54d

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/v7n0;->d:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v2, 0x1

    .line 35
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    iget-object v2, p0, La/v7n0;->e:Ljava/lang/String;

    .line 40
    .line 41
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    iget-boolean v2, p0, La/v7n0;->f:Z

    .line 46
    .line 47
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    iget-wide v2, p0, La/v7n0;->g:J

    .line 52
    .line 53
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    const/16 v0, 0x16

    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    add-int/2addr v0, p0

    .line 64
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", userGeoCountryId="

    .line 2
    .line 3
    const-string v1, ", userRegistrationCountryId="

    .line 4
    .line 5
    const-string v2, "SubscriptionGamesRequest(cfView="

    .line 6
    .line 7
    iget v3, p0, La/v7n0;->a:I

    .line 8
    .line 9
    iget v4, p0, La/v7n0;->b:I

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1, v4}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", gr=1357, lng="

    .line 16
    .line 17
    const-string v2, ", ref=1, subId="

    .line 18
    .line 19
    iget v3, p0, La/v7n0;->c:I

    .line 20
    .line 21
    iget-object v4, p0, La/v7n0;->d:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v3, v1, v4, v2, v0}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", cutCoef="

    .line 27
    .line 28
    const-string v2, ", userId="

    .line 29
    .line 30
    iget-object v3, p0, La/v7n0;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-boolean v4, p0, La/v7n0;->f:Z

    .line 33
    .line 34
    invoke-static {v3, v1, v2, v0, v4}, La/brm0;->C(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", whence=22)"

    .line 38
    .line 39
    iget-wide v2, p0, La/v7n0;->g:J

    .line 40
    .line 41
    invoke-static {v2, v3, v1, v0}, La/brm0;->k(JLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    return-object p0
.end method
