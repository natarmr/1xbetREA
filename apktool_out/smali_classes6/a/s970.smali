.class public final La/s970;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/lvl;

.field public final b:La/lvl;

.field public final c:Ljava/lang/String;

.field public final d:J

.field public final e:J


# direct methods
.method public constructor <init>(La/lvl;La/lvl;Ljava/lang/String;JJ)V
    .locals 1

    .line 1
    sget-object v0, La/ro8;->a:La/ro8;

    .line 2
    .line 3
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, La/s970;->a:La/lvl;

    .line 10
    .line 11
    iput-object p2, p0, La/s970;->b:La/lvl;

    .line 12
    .line 13
    iput-object p3, p0, La/s970;->c:Ljava/lang/String;

    .line 14
    .line 15
    iput-wide p4, p0, La/s970;->d:J

    .line 16
    .line 17
    iput-wide p6, p0, La/s970;->e:J

    .line 18
    .line 19
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
    instance-of v0, p1, La/s970;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/s970;

    .line 10
    .line 11
    iget-object v0, p0, La/s970;->a:La/lvl;

    .line 12
    .line 13
    iget-object v1, p1, La/s970;->a:La/lvl;

    .line 14
    .line 15
    invoke-virtual {v0, v1}, La/lvl;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    iget-object v0, p0, La/s970;->b:La/lvl;

    .line 23
    .line 24
    iget-object v1, p1, La/s970;->b:La/lvl;

    .line 25
    .line 26
    invoke-virtual {v0, v1}, La/lvl;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/s970;->c:Ljava/lang/String;

    .line 34
    .line 35
    iget-object v1, p1, La/s970;->c:Ljava/lang/String;

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
    sget-object v0, La/ro8;->a:La/ro8;

    .line 45
    .line 46
    iget-wide v0, p1, La/s970;->d:J

    .line 47
    .line 48
    sget v2, La/y3d;->h:I

    .line 49
    .line 50
    iget-wide v2, p0, La/s970;->d:J

    .line 51
    .line 52
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-nez v0, :cond_5

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_5
    iget-wide v0, p0, La/s970;->e:J

    .line 60
    .line 61
    iget-wide p0, p1, La/s970;->e:J

    .line 62
    .line 63
    invoke-static {v0, v1, p0, p1}, La/h2t0;->a(JJ)Z

    .line 64
    .line 65
    .line 66
    move-result p0

    .line 67
    if-nez p0, :cond_6

    .line 68
    .line 69
    :goto_0
    const/4 p0, 0x0

    .line 70
    return p0

    .line 71
    :cond_6
    :goto_1
    const/4 p0, 0x1

    .line 72
    return p0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    iget-object v0, p0, La/s970;->a:La/lvl;

    .line 2
    .line 3
    invoke-virtual {v0}, La/lvl;->hashCode()I

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
    iget-object v2, p0, La/s970;->b:La/lvl;

    .line 11
    .line 12
    invoke-virtual {v2}, La/lvl;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    add-int/2addr v2, v0

    .line 17
    mul-int/2addr v2, v1

    .line 18
    iget-object v0, p0, La/s970;->c:Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    sget-object v2, La/ro8;->b:La/ro8;

    .line 25
    .line 26
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    add-int/2addr v2, v0

    .line 31
    mul-int/2addr v2, v1

    .line 32
    sget v0, La/y3d;->h:I

    .line 33
    .line 34
    sget-object v0, La/h2t0;->b:La/g2t0;

    .line 35
    .line 36
    iget-wide v3, p0, La/s970;->d:J

    .line 37
    .line 38
    invoke-static {v2, v1, v3, v4}, La/rw2;->b(IIJ)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-wide v1, p0, La/s970;->e:J

    .line 43
    .line 44
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 45
    .line 46
    .line 47
    move-result p0

    .line 48
    add-int/2addr p0, v0

    .line 49
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    sget-object v0, La/ro8;->b:La/ro8;

    .line 2
    .line 3
    iget-wide v1, p0, La/s970;->d:J

    .line 4
    .line 5
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-wide v2, p0, La/s970;->e:J

    .line 10
    .line 11
    invoke-static {v2, v3}, La/y3d;->i(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v4, "Content(balanceItem="

    .line 18
    .line 19
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    iget-object v4, p0, La/s970;->a:La/lvl;

    .line 23
    .line 24
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v4, ", winSumItem="

    .line 28
    .line 29
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v4, p0, La/s970;->b:La/lvl;

    .line 33
    .line 34
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v4, ", bodyText="

    .line 38
    .line 39
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    iget-object p0, p0, La/s970;->c:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    const-string p0, ", bodyTextStyle="

    .line 48
    .line 49
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string p0, ", bodyTextColor="

    .line 56
    .line 57
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string p0, ", bodyTextBgColor="

    .line 61
    .line 62
    const-string v0, ")"

    .line 63
    .line 64
    invoke-static {v3, v1, p0, v2, v0}, La/ua80;->m(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    return-object p0
.end method
