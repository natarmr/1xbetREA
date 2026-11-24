.class public final La/zvv0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:La/nsv0;

.field public final d:La/nsv0;

.field public final e:La/nsv0;

.field public final f:I

.field public final g:F

.field public final h:I

.field public final i:F

.field public final j:F


# direct methods
.method public constructor <init>(IILa/nsv0;La/nsv0;La/nsv0;IFIFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, La/zvv0;->a:I

    .line 5
    .line 6
    iput p2, p0, La/zvv0;->b:I

    .line 7
    .line 8
    iput-object p3, p0, La/zvv0;->c:La/nsv0;

    .line 9
    .line 10
    iput-object p4, p0, La/zvv0;->d:La/nsv0;

    .line 11
    .line 12
    iput-object p5, p0, La/zvv0;->e:La/nsv0;

    .line 13
    .line 14
    iput p6, p0, La/zvv0;->f:I

    .line 15
    .line 16
    iput p7, p0, La/zvv0;->g:F

    .line 17
    .line 18
    iput p8, p0, La/zvv0;->h:I

    .line 19
    .line 20
    iput p9, p0, La/zvv0;->i:F

    .line 21
    .line 22
    iput p10, p0, La/zvv0;->j:F

    .line 23
    .line 24
    return-void
.end method

.method public static a(La/zvv0;IILa/nsv0;La/nsv0;La/nsv0;IFIFFI)La/zvv0;
    .locals 11

    .line 1
    move/from16 v0, p11

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    iget p1, p0, La/zvv0;->a:I

    .line 8
    .line 9
    :cond_0
    move v1, p1

    .line 10
    and-int/lit8 p1, v0, 0x2

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget p2, p0, La/zvv0;->b:I

    .line 15
    .line 16
    :cond_1
    move v2, p2

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    and-int/lit8 p1, v0, 0x10

    .line 24
    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    iget-object p3, p0, La/zvv0;->c:La/nsv0;

    .line 28
    .line 29
    :cond_2
    move-object v3, p3

    .line 30
    and-int/lit8 p1, v0, 0x20

    .line 31
    .line 32
    if-eqz p1, :cond_3

    .line 33
    .line 34
    iget-object p4, p0, La/zvv0;->d:La/nsv0;

    .line 35
    .line 36
    :cond_3
    move-object v4, p4

    .line 37
    and-int/lit8 p1, v0, 0x40

    .line 38
    .line 39
    if-eqz p1, :cond_4

    .line 40
    .line 41
    iget-object p1, p0, La/zvv0;->e:La/nsv0;

    .line 42
    .line 43
    move-object v5, p1

    .line 44
    goto :goto_0

    .line 45
    :cond_4
    move-object/from16 v5, p5

    .line 46
    .line 47
    :goto_0
    and-int/lit16 p1, v0, 0x80

    .line 48
    .line 49
    if-eqz p1, :cond_5

    .line 50
    .line 51
    iget p1, p0, La/zvv0;->f:I

    .line 52
    .line 53
    move v6, p1

    .line 54
    goto :goto_1

    .line 55
    :cond_5
    move/from16 v6, p6

    .line 56
    .line 57
    :goto_1
    and-int/lit16 p1, v0, 0x100

    .line 58
    .line 59
    if-eqz p1, :cond_6

    .line 60
    .line 61
    iget p1, p0, La/zvv0;->g:F

    .line 62
    .line 63
    move v7, p1

    .line 64
    goto :goto_2

    .line 65
    :cond_6
    move/from16 v7, p7

    .line 66
    .line 67
    :goto_2
    and-int/lit16 p1, v0, 0x200

    .line 68
    .line 69
    if-eqz p1, :cond_7

    .line 70
    .line 71
    iget p1, p0, La/zvv0;->h:I

    .line 72
    .line 73
    move v8, p1

    .line 74
    goto :goto_3

    .line 75
    :cond_7
    move/from16 v8, p8

    .line 76
    .line 77
    :goto_3
    and-int/lit16 p1, v0, 0x400

    .line 78
    .line 79
    if-eqz p1, :cond_8

    .line 80
    .line 81
    iget p1, p0, La/zvv0;->i:F

    .line 82
    .line 83
    move v9, p1

    .line 84
    goto :goto_4

    .line 85
    :cond_8
    move/from16 v9, p9

    .line 86
    .line 87
    :goto_4
    and-int/lit16 p1, v0, 0x800

    .line 88
    .line 89
    if-eqz p1, :cond_9

    .line 90
    .line 91
    iget p1, p0, La/zvv0;->j:F

    .line 92
    .line 93
    move v10, p1

    .line 94
    goto :goto_5

    .line 95
    :cond_9
    move/from16 v10, p10

    .line 96
    .line 97
    :goto_5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    new-instance v0, La/zvv0;

    .line 101
    .line 102
    invoke-direct/range {v0 .. v10}, La/zvv0;-><init>(IILa/nsv0;La/nsv0;La/nsv0;IFIFF)V

    .line 103
    .line 104
    .line 105
    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_1

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/zvv0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/zvv0;

    .line 12
    .line 13
    iget v0, p0, La/zvv0;->a:I

    .line 14
    .line 15
    iget v1, p1, La/zvv0;->a:I

    .line 16
    .line 17
    if-eq v0, v1, :cond_2

    .line 18
    .line 19
    goto/16 :goto_0

    .line 20
    .line 21
    :cond_2
    iget v0, p0, La/zvv0;->b:I

    .line 22
    .line 23
    iget v1, p1, La/zvv0;->b:I

    .line 24
    .line 25
    if-eq v0, v1, :cond_3

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_3
    const/4 v0, 0x0

    .line 29
    invoke-static {v0, v0}, La/ycl;->b(FF)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-nez v1, :cond_4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_4
    invoke-static {v0, v0}, La/ycl;->b(FF)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_5

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_5
    iget-object v0, p0, La/zvv0;->c:La/nsv0;

    .line 44
    .line 45
    iget-object v1, p1, La/zvv0;->c:La/nsv0;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, La/nsv0;->equals(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-nez v0, :cond_6

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_6
    iget-object v0, p0, La/zvv0;->d:La/nsv0;

    .line 55
    .line 56
    iget-object v1, p1, La/zvv0;->d:La/nsv0;

    .line 57
    .line 58
    invoke-virtual {v0, v1}, La/nsv0;->equals(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-nez v0, :cond_7

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_7
    iget-object v0, p0, La/zvv0;->e:La/nsv0;

    .line 66
    .line 67
    iget-object v1, p1, La/zvv0;->e:La/nsv0;

    .line 68
    .line 69
    invoke-virtual {v0, v1}, La/nsv0;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-nez v0, :cond_8

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_8
    iget v0, p0, La/zvv0;->f:I

    .line 77
    .line 78
    iget v1, p1, La/zvv0;->f:I

    .line 79
    .line 80
    if-eq v0, v1, :cond_9

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_9
    iget v0, p0, La/zvv0;->g:F

    .line 84
    .line 85
    iget v1, p1, La/zvv0;->g:F

    .line 86
    .line 87
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-nez v0, :cond_a

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_a
    iget v0, p0, La/zvv0;->h:I

    .line 95
    .line 96
    iget v1, p1, La/zvv0;->h:I

    .line 97
    .line 98
    if-eq v0, v1, :cond_b

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_b
    iget v0, p0, La/zvv0;->i:F

    .line 102
    .line 103
    iget v1, p1, La/zvv0;->i:F

    .line 104
    .line 105
    invoke-static {v0, v1}, La/ycl;->b(FF)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-nez v0, :cond_c

    .line 110
    .line 111
    goto :goto_0

    .line 112
    :cond_c
    iget p0, p0, La/zvv0;->j:F

    .line 113
    .line 114
    iget p1, p1, La/zvv0;->j:F

    .line 115
    .line 116
    invoke-static {p0, p1}, Ljava/lang/Float;->compare(FF)I

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-eqz p0, :cond_d

    .line 121
    .line 122
    :goto_0
    const/4 p0, 0x0

    .line 123
    return p0

    .line 124
    :cond_d
    :goto_1
    const/4 p0, 0x1

    .line 125
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/zvv0;->a:I

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
    iget v2, p0, La/zvv0;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    iget-object v2, p0, La/zvv0;->c:La/nsv0;

    .line 26
    .line 27
    invoke-virtual {v2}, La/nsv0;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    add-int/2addr v2, v0

    .line 32
    mul-int/2addr v2, v1

    .line 33
    iget-object v0, p0, La/zvv0;->d:La/nsv0;

    .line 34
    .line 35
    invoke-virtual {v0}, La/nsv0;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    add-int/2addr v0, v2

    .line 40
    mul-int/2addr v0, v1

    .line 41
    iget-object v2, p0, La/zvv0;->e:La/nsv0;

    .line 42
    .line 43
    invoke-virtual {v2}, La/nsv0;->hashCode()I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    add-int/2addr v2, v0

    .line 48
    mul-int/2addr v2, v1

    .line 49
    iget v0, p0, La/zvv0;->f:I

    .line 50
    .line 51
    invoke-static {v0, v2, v1}, La/twn;->a(III)I

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    iget v2, p0, La/zvv0;->g:F

    .line 56
    .line 57
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    iget v2, p0, La/zvv0;->h:I

    .line 62
    .line 63
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 64
    .line 65
    .line 66
    move-result v0

    .line 67
    iget v2, p0, La/zvv0;->i:F

    .line 68
    .line 69
    invoke-static {v0, v2, v1}, Lc;->a(IFI)I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    iget p0, p0, La/zvv0;->j:F

    .line 74
    .line 75
    invoke-static {p0}, Ljava/lang/Float;->hashCode(F)I

    .line 76
    .line 77
    .line 78
    move-result p0

    .line 79
    add-int/2addr p0, v0

    .line 80
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-static {v0}, La/ycl;->c(F)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iget v2, p0, La/zvv0;->g:F

    .line 11
    .line 12
    invoke-static {v2}, La/ycl;->c(F)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget v3, p0, La/zvv0;->i:F

    .line 17
    .line 18
    invoke-static {v3}, La/ycl;->c(F)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const-string v4, ", sheetHeightPx="

    .line 23
    .line 24
    const-string v5, ", sheetTop="

    .line 25
    .line 26
    const-string v6, "XBottomSheetRects(sheetTopPx="

    .line 27
    .line 28
    iget v7, p0, La/zvv0;->a:I

    .line 29
    .line 30
    iget v8, p0, La/zvv0;->b:I

    .line 31
    .line 32
    invoke-static {v6, v7, v4, v5, v8}, La/dw9;->t(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    const-string v5, ", sheetHeight="

    .line 37
    .line 38
    const-string v6, ", topBlock="

    .line 39
    .line 40
    invoke-static {v4, v1, v5, v0, v6}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, La/zvv0;->c:La/nsv0;

    .line 44
    .line 45
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v0, ", middleBlock="

    .line 49
    .line 50
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    iget-object v0, p0, La/zvv0;->d:La/nsv0;

    .line 54
    .line 55
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string v0, ", bottomBlock="

    .line 59
    .line 60
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    iget-object v0, p0, La/zvv0;->e:La/nsv0;

    .line 64
    .line 65
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v0, ", navBarPaddingPx="

    .line 69
    .line 70
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    iget v0, p0, La/zvv0;->f:I

    .line 74
    .line 75
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v0, ", navBarPadding="

    .line 79
    .line 80
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    const-string v0, ", statusBarPaddingPx="

    .line 84
    .line 85
    const-string v1, ", statusBarPadding="

    .line 86
    .line 87
    iget v5, p0, La/zvv0;->h:I

    .line 88
    .line 89
    invoke-static {v5, v2, v0, v1, v4}, La/twn;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    const-string v0, ", keyboardProgress="

    .line 96
    .line 97
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    iget p0, p0, La/zvv0;->j:F

    .line 101
    .line 102
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    const-string p0, ")"

    .line 106
    .line 107
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    return-object p0
.end method
