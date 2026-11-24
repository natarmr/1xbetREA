.class public final La/tv30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nw30;


# instance fields
.field public final a:Z

.field public final b:La/r040;

.field public final c:I

.field public final d:J

.field public final e:J

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:I

.field public final i:J


# direct methods
.method public constructor <init>(ZLa/r040;IJJLjava/lang/String;Ljava/lang/String;IJ)V
    .locals 1

    .line 1
    sget-object v0, La/iz30;->a:La/htz;

    .line 2
    .line 3
    invoke-static {p2, p8, p9}, La/w6x;->y(La/r040;Ljava/lang/String;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-boolean p1, p0, La/tv30;->a:Z

    .line 10
    .line 11
    iput-object p2, p0, La/tv30;->b:La/r040;

    .line 12
    .line 13
    iput p3, p0, La/tv30;->c:I

    .line 14
    .line 15
    iput-wide p4, p0, La/tv30;->d:J

    .line 16
    .line 17
    iput-wide p6, p0, La/tv30;->e:J

    .line 18
    .line 19
    iput-object p8, p0, La/tv30;->f:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p9, p0, La/tv30;->g:Ljava/lang/String;

    .line 22
    .line 23
    iput p10, p0, La/tv30;->h:I

    .line 24
    .line 25
    iput-wide p11, p0, La/tv30;->i:J

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
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/tv30;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/tv30;

    .line 10
    .line 11
    sget-object v0, La/iz30;->a:La/htz;

    .line 12
    .line 13
    iget-boolean v0, p0, La/tv30;->a:Z

    .line 14
    .line 15
    iget-boolean v1, p1, La/tv30;->a:Z

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_2
    iget-object v0, p0, La/tv30;->b:La/r040;

    .line 21
    .line 22
    iget-object v1, p1, La/tv30;->b:La/r040;

    .line 23
    .line 24
    if-eq v0, v1, :cond_3

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_3
    iget v0, p0, La/tv30;->c:I

    .line 28
    .line 29
    iget v1, p1, La/tv30;->c:I

    .line 30
    .line 31
    if-eq v0, v1, :cond_4

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_4
    iget-wide v0, p1, La/tv30;->d:J

    .line 35
    .line 36
    sget v2, La/y3d;->h:I

    .line 37
    .line 38
    iget-wide v2, p0, La/tv30;->d:J

    .line 39
    .line 40
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_5

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_5
    iget-wide v0, p0, La/tv30;->e:J

    .line 48
    .line 49
    iget-wide v2, p1, La/tv30;->e:J

    .line 50
    .line 51
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_6

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_6
    iget-object v0, p0, La/tv30;->f:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v1, p1, La/tv30;->f:Ljava/lang/String;

    .line 61
    .line 62
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_7

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_7
    iget-object v0, p0, La/tv30;->g:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v1, p1, La/tv30;->g:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_8

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_8
    iget v0, p0, La/tv30;->h:I

    .line 81
    .line 82
    iget v1, p1, La/tv30;->h:I

    .line 83
    .line 84
    if-eq v0, v1, :cond_9

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_9
    iget-wide v0, p0, La/tv30;->i:J

    .line 88
    .line 89
    iget-wide p0, p1, La/tv30;->i:J

    .line 90
    .line 91
    invoke-static {v0, v1, p0, p1}, La/h2t0;->a(JJ)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-nez p0, :cond_a

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
    sget-object v0, La/iz30;->t:La/iz30;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-boolean v2, p0, La/tv30;->a:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/tv30;->b:La/r040;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/w6x;->f(La/r040;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/tv30;->c:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    sget v2, La/y3d;->h:I

    .line 29
    .line 30
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 31
    .line 32
    iget-wide v2, p0, La/tv30;->d:J

    .line 33
    .line 34
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-wide v2, p0, La/tv30;->e:J

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, La/tv30;->f:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, La/tv30;->g:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget v2, p0, La/tv30;->h:I

    .line 57
    .line 58
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-wide v1, p0, La/tv30;->i:J

    .line 63
    .line 64
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 65
    .line 66
    .line 67
    move-result p0

    .line 68
    add-int/2addr p0, v0

    .line 69
    return p0
.end method

.method public final m()La/iz30;
    .locals 0

    .line 1
    sget-object p0, La/iz30;->t:La/iz30;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()La/r040;
    .locals 0

    .line 1
    iget-object p0, p0, La/tv30;->b:La/r040;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    sget-object v0, La/iz30;->t:La/iz30;

    .line 2
    .line 3
    iget-wide v1, p0, La/tv30;->d:J

    .line 4
    .line 5
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    iget-wide v2, p0, La/tv30;->e:J

    .line 10
    .line 11
    invoke-static {v2, v3}, La/y3d;->i(J)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    iget-wide v3, p0, La/tv30;->i:J

    .line 16
    .line 17
    invoke-static {v3, v4}, La/y3d;->i(J)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    const-string v4, ", isBadgeVisible="

    .line 22
    .line 23
    const-string v5, ", menuSectionType="

    .line 24
    .line 25
    const-string v6, "DecoratedVirtualTintMenuUiItem(menuItemModel="

    .line 26
    .line 27
    iget-boolean v7, p0, La/tv30;->a:Z

    .line 28
    .line 29
    invoke-static {v6, v0, v4, v7, v5}, La/w6x;->s(Ljava/lang/String;La/iz30;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v4, ", iconResId="

    .line 34
    .line 35
    const-string v5, ", iconTint="

    .line 36
    .line 37
    iget-object v6, p0, La/tv30;->b:La/r040;

    .line 38
    .line 39
    iget v7, p0, La/tv30;->c:I

    .line 40
    .line 41
    invoke-static {v0, v6, v4, v7, v5}, La/f140;->t(Ljava/lang/StringBuilder;La/r040;Ljava/lang/String;ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string v4, ", iconBackgroundTint="

    .line 45
    .line 46
    const-string v5, ", title="

    .line 47
    .line 48
    invoke-static {v0, v1, v4, v2, v5}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v1, ", subtitle="

    .line 52
    .line 53
    const-string v2, ", endIcon="

    .line 54
    .line 55
    iget-object v4, p0, La/tv30;->f:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v5, p0, La/tv30;->g:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v0, v4, v1, v5, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v1, ", backgroundTint="

    .line 63
    .line 64
    const-string v2, ")"

    .line 65
    .line 66
    iget p0, p0, La/tv30;->h:I

    .line 67
    .line 68
    invoke-static {p0, v1, v3, v2, v0}, La/rw2;->k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method
