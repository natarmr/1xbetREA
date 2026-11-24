.class public final La/hs9;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/ks9;


# instance fields
.field public final a:J

.field public final b:I

.field public final c:J

.field public final d:J

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Z

.field public final i:La/wui0;


# direct methods
.method public constructor <init>(JIJJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLa/wui0;)V
    .locals 0

    .line 1
    invoke-virtual {p8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-wide p1, p0, La/hs9;->a:J

    .line 11
    .line 12
    iput p3, p0, La/hs9;->b:I

    .line 13
    .line 14
    iput-wide p4, p0, La/hs9;->c:J

    .line 15
    .line 16
    iput-wide p6, p0, La/hs9;->d:J

    .line 17
    .line 18
    iput-object p8, p0, La/hs9;->e:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p9, p0, La/hs9;->f:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p10, p0, La/hs9;->g:Ljava/lang/String;

    .line 23
    .line 24
    iput-boolean p11, p0, La/hs9;->h:Z

    .line 25
    .line 26
    iput-object p12, p0, La/hs9;->i:La/wui0;

    .line 27
    .line 28
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
    instance-of v0, p1, La/hs9;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/hs9;

    .line 10
    .line 11
    iget-wide v0, p0, La/hs9;->a:J

    .line 12
    .line 13
    iget-wide v2, p1, La/hs9;->a:J

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
    iget v0, p0, La/hs9;->b:I

    .line 21
    .line 22
    iget v1, p1, La/hs9;->b:I

    .line 23
    .line 24
    if-eq v0, v1, :cond_3

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_3
    iget-wide v0, p1, La/hs9;->c:J

    .line 28
    .line 29
    sget v2, La/y3d;->h:I

    .line 30
    .line 31
    iget-wide v2, p0, La/hs9;->c:J

    .line 32
    .line 33
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

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
    iget-wide v0, p0, La/hs9;->d:J

    .line 41
    .line 42
    iget-wide v2, p1, La/hs9;->d:J

    .line 43
    .line 44
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

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
    iget-object v0, p0, La/hs9;->e:Ljava/lang/String;

    .line 52
    .line 53
    iget-object v1, p1, La/hs9;->e:Ljava/lang/String;

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
    iget-object v0, p0, La/hs9;->f:Ljava/lang/String;

    .line 63
    .line 64
    iget-object v1, p1, La/hs9;->f:Ljava/lang/String;

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/hs9;->g:Ljava/lang/String;

    .line 74
    .line 75
    iget-object v1, p1, La/hs9;->g:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-nez v0, :cond_8

    .line 82
    .line 83
    goto :goto_0

    .line 84
    :cond_8
    iget-boolean v0, p0, La/hs9;->h:Z

    .line 85
    .line 86
    iget-boolean v1, p1, La/hs9;->h:Z

    .line 87
    .line 88
    if-eq v0, v1, :cond_9

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_9
    iget-object p0, p0, La/hs9;->i:La/wui0;

    .line 92
    .line 93
    iget-object p1, p1, La/hs9;->i:La/wui0;

    .line 94
    .line 95
    if-eq p0, p1, :cond_a

    .line 96
    .line 97
    :goto_0
    const/4 p0, 0x0

    .line 98
    return p0

    .line 99
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 100
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-wide v0, p0, La/hs9;->a:J

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
    iget v2, p0, La/hs9;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    sget v2, La/y3d;->h:I

    .line 17
    .line 18
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 19
    .line 20
    iget-wide v2, p0, La/hs9;->c:J

    .line 21
    .line 22
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-wide v2, p0, La/hs9;->d:J

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget-object v2, p0, La/hs9;->e:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-object v2, p0, La/hs9;->f:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, La/hs9;->g:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-boolean v2, p0, La/hs9;->h:Z

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object p0, p0, La/hs9;->i:La/wui0;

    .line 57
    .line 58
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

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
    .locals 7

    .line 1
    iget-wide v0, p0, La/hs9;->c:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/hs9;->d:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    const-string v2, "Extended(itemId="

    .line 14
    .line 15
    const-string v3, ", iconRes="

    .line 16
    .line 17
    iget v4, p0, La/hs9;->b:I

    .line 18
    .line 19
    iget-wide v5, p0, La/hs9;->a:J

    .line 20
    .line 21
    invoke-static {v4, v5, v6, v2, v3}, La/brm0;->q(IJLjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-string v3, ", iconTint="

    .line 26
    .line 27
    const-string v4, ", iconBackgroundTint="

    .line 28
    .line 29
    invoke-static {v2, v3, v0, v4, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v0, ", title="

    .line 33
    .line 34
    const-string v1, ", subtitle="

    .line 35
    .line 36
    iget-object v3, p0, La/hs9;->e:Ljava/lang/String;

    .line 37
    .line 38
    iget-object v4, p0, La/hs9;->f:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v2, v0, v3, v1, v4}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    const-string v0, ", caption="

    .line 44
    .line 45
    const-string v1, ", isCancelVisible="

    .line 46
    .line 47
    iget-object v3, p0, La/hs9;->g:Ljava/lang/String;

    .line 48
    .line 49
    iget-boolean v4, p0, La/hs9;->h:Z

    .line 50
    .line 51
    invoke-static {v0, v3, v1, v2, v4}, La/w6x;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 52
    .line 53
    .line 54
    const-string v0, ", position="

    .line 55
    .line 56
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    iget-object p0, p0, La/hs9;->i:La/wui0;

    .line 60
    .line 61
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    const-string p0, ")"

    .line 65
    .line 66
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0
.end method
