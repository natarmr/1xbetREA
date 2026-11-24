.class public final La/rv30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/nw30;


# instance fields
.field public final a:La/iz30;

.field public final b:Z

.field public final c:La/r040;

.field public final d:J

.field public final e:I

.field public final f:J

.field public final g:J

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:I

.field public final k:Ljava/util/List;

.field public final l:La/bzw;


# direct methods
.method public constructor <init>(La/iz30;ZLa/r040;JIJJLjava/lang/String;Ljava/lang/String;ILjava/util/List;La/bzw;)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object p1, p0, La/rv30;->a:La/iz30;

    .line 17
    .line 18
    iput-boolean p2, p0, La/rv30;->b:Z

    .line 19
    .line 20
    iput-object p3, p0, La/rv30;->c:La/r040;

    .line 21
    .line 22
    iput-wide p4, p0, La/rv30;->d:J

    .line 23
    .line 24
    iput p6, p0, La/rv30;->e:I

    .line 25
    .line 26
    iput-wide p7, p0, La/rv30;->f:J

    .line 27
    .line 28
    iput-wide p9, p0, La/rv30;->g:J

    .line 29
    .line 30
    iput-object p11, p0, La/rv30;->h:Ljava/lang/String;

    .line 31
    .line 32
    iput-object p12, p0, La/rv30;->i:Ljava/lang/String;

    .line 33
    .line 34
    iput p13, p0, La/rv30;->j:I

    .line 35
    .line 36
    iput-object p14, p0, La/rv30;->k:Ljava/util/List;

    .line 37
    .line 38
    iput-object p15, p0, La/rv30;->l:La/bzw;

    .line 39
    .line 40
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
    instance-of v1, p1, La/rv30;

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
    check-cast p1, La/rv30;

    .line 12
    .line 13
    iget-object v1, p0, La/rv30;->a:La/iz30;

    .line 14
    .line 15
    iget-object v3, p1, La/rv30;->a:La/iz30;

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-boolean v1, p0, La/rv30;->b:Z

    .line 21
    .line 22
    iget-boolean v3, p1, La/rv30;->b:Z

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget-object v1, p0, La/rv30;->c:La/r040;

    .line 28
    .line 29
    iget-object v3, p1, La/rv30;->c:La/r040;

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget-wide v3, p1, La/rv30;->d:J

    .line 35
    .line 36
    sget v1, La/y3d;->h:I

    .line 37
    .line 38
    iget-wide v5, p0, La/rv30;->d:J

    .line 39
    .line 40
    invoke-static {v5, v6, v3, v4}, La/h2t0;->a(JJ)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-nez v1, :cond_5

    .line 45
    .line 46
    return v2

    .line 47
    :cond_5
    iget v1, p0, La/rv30;->e:I

    .line 48
    .line 49
    iget v3, p1, La/rv30;->e:I

    .line 50
    .line 51
    if-eq v1, v3, :cond_6

    .line 52
    .line 53
    return v2

    .line 54
    :cond_6
    iget-wide v3, p0, La/rv30;->f:J

    .line 55
    .line 56
    iget-wide v5, p1, La/rv30;->f:J

    .line 57
    .line 58
    invoke-static {v3, v4, v5, v6}, La/h2t0;->a(JJ)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_7

    .line 63
    .line 64
    return v2

    .line 65
    :cond_7
    iget-wide v3, p0, La/rv30;->g:J

    .line 66
    .line 67
    iget-wide v5, p1, La/rv30;->g:J

    .line 68
    .line 69
    invoke-static {v3, v4, v5, v6}, La/h2t0;->a(JJ)Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-nez v1, :cond_8

    .line 74
    .line 75
    return v2

    .line 76
    :cond_8
    iget-object v1, p0, La/rv30;->h:Ljava/lang/String;

    .line 77
    .line 78
    iget-object v3, p1, La/rv30;->h:Ljava/lang/String;

    .line 79
    .line 80
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v1

    .line 84
    if-nez v1, :cond_9

    .line 85
    .line 86
    return v2

    .line 87
    :cond_9
    iget-object v1, p0, La/rv30;->i:Ljava/lang/String;

    .line 88
    .line 89
    iget-object v3, p1, La/rv30;->i:Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_a

    .line 96
    .line 97
    return v2

    .line 98
    :cond_a
    iget v1, p0, La/rv30;->j:I

    .line 99
    .line 100
    iget v3, p1, La/rv30;->j:I

    .line 101
    .line 102
    if-eq v1, v3, :cond_b

    .line 103
    .line 104
    return v2

    .line 105
    :cond_b
    iget-object v1, p0, La/rv30;->k:Ljava/util/List;

    .line 106
    .line 107
    iget-object v3, p1, La/rv30;->k:Ljava/util/List;

    .line 108
    .line 109
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v1

    .line 113
    if-nez v1, :cond_c

    .line 114
    .line 115
    return v2

    .line 116
    :cond_c
    iget-object p0, p0, La/rv30;->l:La/bzw;

    .line 117
    .line 118
    iget-object p1, p1, La/rv30;->l:La/bzw;

    .line 119
    .line 120
    if-eq p0, p1, :cond_d

    .line 121
    .line 122
    return v2

    .line 123
    :cond_d
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/rv30;->a:La/iz30;

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
    iget-boolean v2, p0, La/rv30;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/rv30;->c:La/r040;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/w6x;->f(La/r040;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    sget v2, La/y3d;->h:I

    .line 23
    .line 24
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 25
    .line 26
    iget-wide v2, p0, La/rv30;->d:J

    .line 27
    .line 28
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    iget v2, p0, La/rv30;->e:I

    .line 33
    .line 34
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    iget-wide v2, p0, La/rv30;->f:J

    .line 39
    .line 40
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-wide v2, p0, La/rv30;->g:J

    .line 45
    .line 46
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, La/rv30;->h:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    iget-object v2, p0, La/rv30;->i:Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    iget v2, p0, La/rv30;->j:I

    .line 63
    .line 64
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    iget-object v2, p0, La/rv30;->k:Ljava/util/List;

    .line 69
    .line 70
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    iget-object p0, p0, La/rv30;->l:La/bzw;

    .line 75
    .line 76
    if-nez p0, :cond_0

    .line 77
    .line 78
    const/4 p0, 0x0

    .line 79
    goto :goto_0

    .line 80
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    :goto_0
    add-int/2addr v0, p0

    .line 85
    return v0
.end method

.method public final m()La/iz30;
    .locals 0

    .line 1
    iget-object p0, p0, La/rv30;->a:La/iz30;

    .line 2
    .line 3
    return-object p0
.end method

.method public final n()La/r040;
    .locals 0

    .line 1
    iget-object p0, p0, La/rv30;->c:La/r040;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    .line 1
    iget-wide v0, p0, La/rv30;->d:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/rv30;->f:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, La/rv30;->g:J

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
    const-string v5, "DecoratedMenuUiItem(menuItemModel="

    .line 24
    .line 25
    iget-object v6, p0, La/rv30;->a:La/iz30;

    .line 26
    .line 27
    iget-boolean v7, p0, La/rv30;->b:Z

    .line 28
    .line 29
    invoke-static {v5, v6, v3, v7, v4}, La/w6x;->s(Ljava/lang/String;La/iz30;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    iget-object v4, p0, La/rv30;->c:La/r040;

    .line 34
    .line 35
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v4, ", badgeBackgroundTint="

    .line 39
    .line 40
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    const-string v0, ", iconResId="

    .line 47
    .line 48
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string v0, ", iconTint="

    .line 52
    .line 53
    const-string v4, ", iconBackgroundTint="

    .line 54
    .line 55
    iget v5, p0, La/rv30;->e:I

    .line 56
    .line 57
    invoke-static {v5, v0, v1, v4, v3}, La/kng0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 58
    .line 59
    .line 60
    const-string v0, ", title="

    .line 61
    .line 62
    const-string v1, ", subtitle="

    .line 63
    .line 64
    iget-object v4, p0, La/rv30;->h:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v3, v2, v0, v4, v1}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    const-string v0, ", endIcon="

    .line 70
    .line 71
    const-string v1, ", backgroundGradientColors="

    .line 72
    .line 73
    iget v2, p0, La/rv30;->j:I

    .line 74
    .line 75
    iget-object v4, p0, La/rv30;->i:Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v2, v4, v0, v1, v3}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 78
    .line 79
    .line 80
    iget-object v0, p0, La/rv30;->k:Ljava/util/List;

    .line 81
    .line 82
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v0, ", endIconBlendMode="

    .line 86
    .line 87
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    iget-object p0, p0, La/rv30;->l:La/bzw;

    .line 91
    .line 92
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string p0, ")"

    .line 96
    .line 97
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0
.end method
