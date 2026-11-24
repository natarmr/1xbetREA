.class public final La/sv30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nw30;


# instance fields
.field public final a:La/iz30;

.field public final b:Z

.field public final c:La/r040;

.field public final d:I

.field public final e:J

.field public final f:J

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:I

.field public final j:J


# direct methods
.method public constructor <init>(La/iz30;ZLa/r040;IJJLjava/lang/String;Ljava/lang/String;IJ)V
    .locals 0

    .line 1
    invoke-static {p3, p9, p10}, La/w6x;->y(La/r040;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/sv30;->a:La/iz30;

    .line 8
    .line 9
    iput-boolean p2, p0, La/sv30;->b:Z

    .line 10
    .line 11
    iput-object p3, p0, La/sv30;->c:La/r040;

    .line 12
    .line 13
    iput p4, p0, La/sv30;->d:I

    .line 14
    .line 15
    iput-wide p5, p0, La/sv30;->e:J

    .line 16
    .line 17
    iput-wide p7, p0, La/sv30;->f:J

    .line 18
    .line 19
    iput-object p9, p0, La/sv30;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p10, p0, La/sv30;->h:Ljava/lang/String;

    .line 22
    .line 23
    iput p11, p0, La/sv30;->i:I

    .line 24
    .line 25
    iput-wide p12, p0, La/sv30;->j:J

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
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/sv30;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/sv30;

    .line 11
    .line 12
    iget-object v0, p0, La/sv30;->a:La/iz30;

    .line 13
    .line 14
    iget-object v1, p1, La/sv30;->a:La/iz30;

    .line 15
    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_2
    iget-boolean v0, p0, La/sv30;->b:Z

    .line 20
    .line 21
    iget-boolean v1, p1, La/sv30;->b:Z

    .line 22
    .line 23
    if-eq v0, v1, :cond_3

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_3
    iget-object v0, p0, La/sv30;->c:La/r040;

    .line 27
    .line 28
    iget-object v1, p1, La/sv30;->c:La/r040;

    .line 29
    .line 30
    if-eq v0, v1, :cond_4

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_4
    iget v0, p0, La/sv30;->d:I

    .line 34
    .line 35
    iget v1, p1, La/sv30;->d:I

    .line 36
    .line 37
    if-eq v0, v1, :cond_5

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_5
    iget-wide v0, p1, La/sv30;->e:J

    .line 41
    .line 42
    sget v2, La/y3d;->h:I

    .line 43
    .line 44
    iget-wide v2, p0, La/sv30;->e:J

    .line 45
    .line 46
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    if-nez v0, :cond_6

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_6
    iget-wide v0, p0, La/sv30;->f:J

    .line 54
    .line 55
    iget-wide v2, p1, La/sv30;->f:J

    .line 56
    .line 57
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-nez v0, :cond_7

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_7
    iget-object v0, p0, La/sv30;->g:Ljava/lang/String;

    .line 65
    .line 66
    iget-object v1, p1, La/sv30;->g:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    if-nez v0, :cond_8

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_8
    iget-object v0, p0, La/sv30;->h:Ljava/lang/String;

    .line 76
    .line 77
    iget-object v1, p1, La/sv30;->h:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-nez v0, :cond_9

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_9
    iget v0, p0, La/sv30;->i:I

    .line 87
    .line 88
    iget v1, p1, La/sv30;->i:I

    .line 89
    .line 90
    if-eq v0, v1, :cond_a

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_a
    iget-wide v0, p0, La/sv30;->j:J

    .line 94
    .line 95
    iget-wide p0, p1, La/sv30;->j:J

    .line 96
    .line 97
    invoke-static {v0, v1, p0, p1}, La/h2t0;->a(JJ)Z

    .line 98
    .line 99
    .line 100
    move-result p0

    .line 101
    if-nez p0, :cond_b

    .line 102
    .line 103
    :goto_0
    const/4 p0, 0x0

    .line 104
    return p0

    .line 105
    :cond_b
    :goto_1
    const/4 p0, 0x1

    .line 106
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/sv30;->a:La/iz30;

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
    iget-boolean v2, p0, La/sv30;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/sv30;->c:La/r040;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/w6x;->f(La/r040;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/sv30;->d:I

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
    iget-wide v2, p0, La/sv30;->e:J

    .line 33
    .line 34
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-wide v2, p0, La/sv30;->f:J

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-object v2, p0, La/sv30;->g:Ljava/lang/String;

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, La/sv30;->h:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget v2, p0, La/sv30;->i:I

    .line 57
    .line 58
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget-wide v1, p0, La/sv30;->j:J

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
    iget-object p0, p0, La/sv30;->a:La/iz30;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()La/r040;
    .locals 0

    .line 1
    iget-object p0, p0, La/sv30;->c:La/r040;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-wide v0, p0, La/sv30;->e:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/sv30;->f:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, La/sv30;->j:J

    .line 14
    .line 15
    invoke-static {v2, v3}, La/y3d;->i(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const-string v3, ", isBadgeVisible="

    .line 20
    .line 21
    const-string v4, ", menuSectionType="

    .line 22
    .line 23
    const-string v5, "DecoratedTintMenuUiItem(menuItemModel="

    .line 24
    .line 25
    iget-object v6, p0, La/sv30;->a:La/iz30;

    .line 26
    .line 27
    iget-boolean v7, p0, La/sv30;->b:Z

    .line 28
    .line 29
    invoke-static {v5, v6, v3, v7, v4}, La/w6x;->s(Ljava/lang/String;La/iz30;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    const-string v4, ", iconResId="

    .line 34
    .line 35
    const-string v5, ", iconTint="

    .line 36
    .line 37
    iget-object v6, p0, La/sv30;->c:La/r040;

    .line 38
    .line 39
    iget v7, p0, La/sv30;->d:I

    .line 40
    .line 41
    invoke-static {v3, v6, v4, v7, v5}, La/f140;->t(Ljava/lang/StringBuilder;La/r040;Ljava/lang/String;ILjava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string v4, ", iconBackgroundTint="

    .line 45
    .line 46
    const-string v5, ", title="

    .line 47
    .line 48
    invoke-static {v3, v0, v4, v1, v5}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    const-string v0, ", subtitle="

    .line 52
    .line 53
    const-string v1, ", endIcon="

    .line 54
    .line 55
    iget-object v4, p0, La/sv30;->g:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v5, p0, La/sv30;->h:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v3, v4, v0, v5, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    const-string v0, ", backgroundTint="

    .line 63
    .line 64
    const-string v1, ")"

    .line 65
    .line 66
    iget p0, p0, La/sv30;->i:I

    .line 67
    .line 68
    invoke-static {p0, v0, v2, v1, v3}, La/rw2;->k(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    return-object p0
.end method
