.class public final La/rx30;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sx30;


# instance fields
.field public final a:La/o0x;

.field public final b:J

.field public final c:La/miz;

.field public final d:I

.field public final e:J

.field public final f:J

.field public final g:La/rc5;

.field public final h:La/ene;


# direct methods
.method public constructor <init>(La/o0x;JLa/miz;IJLa/rc5;I)V
    .locals 2

    .line 1
    and-int/lit8 v0, p9, 0x2

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    sget-object p2, La/s6t0;->a:La/pz40;

    .line 6
    .line 7
    invoke-static {}, La/s6t0;->b()La/taq0;

    .line 8
    .line 9
    .line 10
    move-result-object p2

    .line 11
    iget-object p2, p2, La/taq0;->a:Lorg/xplatform/uikit/compose/color/ThemeColors;

    .line 12
    .line 13
    invoke-virtual {p2}, Lorg/xplatform/uikit/compose/color/ThemeColors;->getPrimary-0d7_KjU()J

    .line 14
    .line 15
    .line 16
    move-result-wide p2

    .line 17
    :cond_0
    and-int/lit8 v0, p9, 0x4

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    sget-object p4, La/liz;->a:La/liz;

    .line 22
    .line 23
    :cond_1
    and-int/lit8 v0, p9, 0x10

    .line 24
    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    move-wide p6, p2

    .line 28
    :cond_2
    sget-object v0, La/s6t0;->a:La/pz40;

    .line 29
    .line 30
    sget-object v0, Lorg/xplatform/uikit/compose/color/StaticColors;->INSTANCE:Lorg/xplatform/uikit/compose/color/StaticColors;

    .line 31
    .line 32
    invoke-virtual {v0}, Lorg/xplatform/uikit/compose/color/StaticColors;->getTransparent-0d7_KjU()J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    and-int/lit8 p9, p9, 0x40

    .line 37
    .line 38
    if-eqz p9, :cond_3

    .line 39
    .line 40
    new-instance p8, La/pc5;

    .line 41
    .line 42
    const/4 p9, 0x0

    .line 43
    invoke-direct {p8, p9}, La/pc5;-><init>(La/y3d;)V

    .line 44
    .line 45
    .line 46
    :cond_3
    sget-object p9, La/qmk;->m:La/zcl;

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, La/rx30;->a:La/o0x;

    .line 55
    .line 56
    iput-wide p2, p0, La/rx30;->b:J

    .line 57
    .line 58
    iput-object p4, p0, La/rx30;->c:La/miz;

    .line 59
    .line 60
    iput p5, p0, La/rx30;->d:I

    .line 61
    .line 62
    iput-wide p6, p0, La/rx30;->e:J

    .line 63
    .line 64
    iput-wide v0, p0, La/rx30;->f:J

    .line 65
    .line 66
    iput-object p8, p0, La/rx30;->g:La/rc5;

    .line 67
    .line 68
    iput-object p9, p0, La/rx30;->h:La/ene;

    .line 69
    .line 70
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
    instance-of v0, p1, La/rx30;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_1
    check-cast p1, La/rx30;

    .line 11
    .line 12
    iget-object v0, p0, La/rx30;->a:La/o0x;

    .line 13
    .line 14
    iget-object v1, p1, La/rx30;->a:La/o0x;

    .line 15
    .line 16
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_2
    iget-wide v0, p1, La/rx30;->b:J

    .line 24
    .line 25
    sget v2, La/y3d;->h:I

    .line 26
    .line 27
    iget-wide v2, p0, La/rx30;->b:J

    .line 28
    .line 29
    invoke-static {v2, v3, v0, v1}, La/h2t0;->a(JJ)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_3

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_3
    iget-object v0, p0, La/rx30;->c:La/miz;

    .line 37
    .line 38
    iget-object v1, p1, La/rx30;->c:La/miz;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_4
    iget v0, p0, La/rx30;->d:I

    .line 48
    .line 49
    iget v1, p1, La/rx30;->d:I

    .line 50
    .line 51
    if-eq v0, v1, :cond_5

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_5
    iget-wide v0, p0, La/rx30;->e:J

    .line 55
    .line 56
    iget-wide v2, p1, La/rx30;->e:J

    .line 57
    .line 58
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_6

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_6
    iget-wide v0, p0, La/rx30;->f:J

    .line 66
    .line 67
    iget-wide v2, p1, La/rx30;->f:J

    .line 68
    .line 69
    invoke-static {v0, v1, v2, v3}, La/h2t0;->a(JJ)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_7

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_7
    iget-object v0, p0, La/rx30;->g:La/rc5;

    .line 77
    .line 78
    iget-object v1, p1, La/rx30;->g:La/rc5;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_8

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_8
    iget-object p0, p0, La/rx30;->h:La/ene;

    .line 88
    .line 89
    iget-object p1, p1, La/rx30;->h:La/ene;

    .line 90
    .line 91
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-nez p0, :cond_9

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_9
    const/high16 p0, 0x41c00000    # 24.0f

    .line 99
    .line 100
    invoke-static {p0, p0}, La/ycl;->b(FF)Z

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-nez p0, :cond_a

    .line 105
    .line 106
    :goto_0
    const/4 p0, 0x0

    .line 107
    return p0

    .line 108
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 109
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/rx30;->a:La/o0x;

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
    sget v2, La/y3d;->h:I

    .line 11
    .line 12
    sget-object v2, La/h2t0;->b:La/g2t0;

    .line 13
    .line 14
    iget-wide v2, p0, La/rx30;->b:J

    .line 15
    .line 16
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    iget-object v2, p0, La/rx30;->c:La/miz;

    .line 21
    .line 22
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    add-int/2addr v2, v0

    .line 27
    mul-int/2addr v2, v1

    .line 28
    iget v0, p0, La/rx30;->d:I

    .line 29
    .line 30
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-wide v2, p0, La/rx30;->e:J

    .line 35
    .line 36
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-wide v2, p0, La/rx30;->f:J

    .line 41
    .line 42
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/rx30;->g:La/rc5;

    .line 47
    .line 48
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    add-int/2addr v2, v0

    .line 53
    mul-int/2addr v2, v1

    .line 54
    iget-object p0, p0, La/rx30;->h:La/ene;

    .line 55
    .line 56
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    add-int/2addr p0, v2

    .line 61
    mul-int/2addr p0, v1

    .line 62
    const/high16 v0, 0x41c00000    # 24.0f

    .line 63
    .line 64
    invoke-static {v0}, Ljava/lang/Float;->hashCode(F)I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    add-int/2addr v0, p0

    .line 69
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-wide v0, p0, La/rx30;->b:J

    .line 2
    .line 3
    invoke-static {v0, v1}, La/y3d;->i(J)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-wide v1, p0, La/rx30;->e:J

    .line 8
    .line 9
    invoke-static {v1, v2}, La/y3d;->i(J)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    iget-wide v2, p0, La/rx30;->f:J

    .line 14
    .line 15
    invoke-static {v2, v3}, La/y3d;->i(J)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    const/high16 v3, 0x41c00000    # 24.0f

    .line 20
    .line 21
    invoke-static {v3}, La/ycl;->c(F)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    new-instance v4, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    const-string v5, "IconBack(imageLink="

    .line 28
    .line 29
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v5, p0, La/rx30;->a:La/o0x;

    .line 33
    .line 34
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v5, ", imageTintColor="

    .line 38
    .line 39
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    const-string v0, ", badge="

    .line 46
    .line 47
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object v0, p0, La/rx30;->c:La/miz;

    .line 51
    .line 52
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    const-string v0, ", placeholderResId="

    .line 56
    .line 57
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    iget v0, p0, La/rx30;->d:I

    .line 61
    .line 62
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v0, ", placeholderTintColor="

    .line 66
    .line 67
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v0, ", imageStrokeColor="

    .line 71
    .line 72
    const-string v5, ", background="

    .line 73
    .line 74
    invoke-static {v4, v1, v0, v2, v5}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    iget-object v0, p0, La/rx30;->g:La/rc5;

    .line 78
    .line 79
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    const-string v0, ", backgroundRadius="

    .line 83
    .line 84
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    iget-object p0, p0, La/rx30;->h:La/ene;

    .line 88
    .line 89
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    const-string p0, ", iconSize="

    .line 93
    .line 94
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string p0, ")"

    .line 98
    .line 99
    invoke-static {v4, v3, p0}, La/axq;->n(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0
.end method
