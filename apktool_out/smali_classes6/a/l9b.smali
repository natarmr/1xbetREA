.class public final La/l9b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/m9b;


# instance fields
.field public final a:Ljava/util/List;

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:Ljava/util/List;

.field public final k:I

.field public final l:Z


# direct methods
.method public constructor <init>(Ljava/util/List;IIIIIIIILjava/util/List;IZ)V
    .locals 1

    .line 1
    sget-object v0, La/sw5;->b:La/cl5;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, La/l9b;->a:Ljava/util/List;

    .line 13
    .line 14
    iput p2, p0, La/l9b;->b:I

    .line 15
    .line 16
    iput p3, p0, La/l9b;->c:I

    .line 17
    .line 18
    iput p4, p0, La/l9b;->d:I

    .line 19
    .line 20
    iput p5, p0, La/l9b;->e:I

    .line 21
    .line 22
    iput p6, p0, La/l9b;->f:I

    .line 23
    .line 24
    iput p7, p0, La/l9b;->g:I

    .line 25
    .line 26
    iput p8, p0, La/l9b;->h:I

    .line 27
    .line 28
    iput p9, p0, La/l9b;->i:I

    .line 29
    .line 30
    iput-object p10, p0, La/l9b;->j:Ljava/util/List;

    .line 31
    .line 32
    iput p11, p0, La/l9b;->k:I

    .line 33
    .line 34
    iput-boolean p12, p0, La/l9b;->l:Z

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public final a()Ljava/util/List;
    .locals 0

    .line 1
    iget-object p0, p0, La/l9b;->a:Ljava/util/List;

    .line 2
    .line 3
    return-object p0
.end method

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
    instance-of v1, p1, La/l9b;

    .line 6
    .line 7
    if-nez v1, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/l9b;

    .line 12
    .line 13
    iget-object v1, p0, La/l9b;->a:Ljava/util/List;

    .line 14
    .line 15
    iget-object v2, p1, La/l9b;->a:Ljava/util/List;

    .line 16
    .line 17
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    iget v1, p0, La/l9b;->b:I

    .line 25
    .line 26
    iget v2, p1, La/l9b;->b:I

    .line 27
    .line 28
    if-eq v1, v2, :cond_3

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_3
    iget v1, p0, La/l9b;->c:I

    .line 32
    .line 33
    iget v2, p1, La/l9b;->c:I

    .line 34
    .line 35
    if-eq v1, v2, :cond_4

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_4
    iget v1, p0, La/l9b;->d:I

    .line 39
    .line 40
    iget v2, p1, La/l9b;->d:I

    .line 41
    .line 42
    if-eq v1, v2, :cond_5

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_5
    iget v1, p0, La/l9b;->e:I

    .line 46
    .line 47
    iget v2, p1, La/l9b;->e:I

    .line 48
    .line 49
    if-eq v1, v2, :cond_6

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_6
    iget v1, p0, La/l9b;->f:I

    .line 53
    .line 54
    iget v2, p1, La/l9b;->f:I

    .line 55
    .line 56
    if-eq v1, v2, :cond_7

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_7
    iget v1, p0, La/l9b;->g:I

    .line 60
    .line 61
    iget v2, p1, La/l9b;->g:I

    .line 62
    .line 63
    if-eq v1, v2, :cond_8

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_8
    iget v1, p0, La/l9b;->h:I

    .line 67
    .line 68
    iget v2, p1, La/l9b;->h:I

    .line 69
    .line 70
    if-eq v1, v2, :cond_9

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_9
    iget v1, p0, La/l9b;->i:I

    .line 74
    .line 75
    iget v2, p1, La/l9b;->i:I

    .line 76
    .line 77
    if-eq v1, v2, :cond_a

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_a
    iget-object v1, p0, La/l9b;->j:Ljava/util/List;

    .line 81
    .line 82
    iget-object v2, p1, La/l9b;->j:Ljava/util/List;

    .line 83
    .line 84
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v1

    .line 88
    if-nez v1, :cond_b

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_b
    iget v1, p0, La/l9b;->k:I

    .line 92
    .line 93
    iget v2, p1, La/l9b;->k:I

    .line 94
    .line 95
    if-eq v1, v2, :cond_c

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_c
    iget-boolean p0, p0, La/l9b;->l:Z

    .line 99
    .line 100
    iget-boolean p1, p1, La/l9b;->l:Z

    .line 101
    .line 102
    if-eq p0, p1, :cond_d

    .line 103
    .line 104
    :goto_0
    const/4 p0, 0x0

    .line 105
    return p0

    .line 106
    :cond_d
    sget-object p0, La/sw5;->b:La/cl5;

    .line 107
    .line 108
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/l9b;->a:Ljava/util/List;

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
    iget v2, p0, La/l9b;->b:I

    .line 11
    .line 12
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget v2, p0, La/l9b;->c:I

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget v2, p0, La/l9b;->d:I

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget v2, p0, La/l9b;->e:I

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget v2, p0, La/l9b;->f:I

    .line 35
    .line 36
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget v2, p0, La/l9b;->g:I

    .line 41
    .line 42
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget v2, p0, La/l9b;->h:I

    .line 47
    .line 48
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget v2, p0, La/l9b;->i:I

    .line 53
    .line 54
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object v2, p0, La/l9b;->j:Ljava/util/List;

    .line 59
    .line 60
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget v2, p0, La/l9b;->k:I

    .line 65
    .line 66
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    const/4 v2, 0x2

    .line 71
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    iget-boolean p0, p0, La/l9b;->l:Z

    .line 76
    .line 77
    invoke-static {v0, v1, p0}, La/brm0;->e(IIZ)I

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    sget-object v0, La/sw5;->f:La/sw5;

    .line 82
    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 84
    .line 85
    .line 86
    move-result v0

    .line 87
    add-int/2addr v0, p0

    .line 88
    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    sget-object v0, La/sw5;->f:La/sw5;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "Grid(childUiItems="

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    iget-object v2, p0, La/l9b;->a:Ljava/util/List;

    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v2, ", outsideMarginTop="

    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget v2, p0, La/l9b;->b:I

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, ", outsideMarginHorizontal="

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v2, ", insideMarginBottom="

    .line 31
    .line 32
    const-string v3, ", insideMarginLeft="

    .line 33
    .line 34
    iget v4, p0, La/l9b;->c:I

    .line 35
    .line 36
    iget v5, p0, La/l9b;->d:I

    .line 37
    .line 38
    invoke-static {v4, v5, v2, v3, v1}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 39
    .line 40
    .line 41
    const-string v2, ", insideMarginRight="

    .line 42
    .line 43
    const-string v3, ", insideMarginBetweenItems="

    .line 44
    .line 45
    iget v4, p0, La/l9b;->e:I

    .line 46
    .line 47
    iget v5, p0, La/l9b;->f:I

    .line 48
    .line 49
    invoke-static {v4, v5, v2, v3, v1}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 50
    .line 51
    .line 52
    const-string v2, ", backgroundColor="

    .line 53
    .line 54
    const-string v3, ", insideItemBackground="

    .line 55
    .line 56
    iget v4, p0, La/l9b;->g:I

    .line 57
    .line 58
    iget v5, p0, La/l9b;->h:I

    .line 59
    .line 60
    invoke-static {v4, v5, v2, v3, v1}, La/axq;->r(IILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 61
    .line 62
    .line 63
    const-string v2, ", skipItemsInsideBackground="

    .line 64
    .line 65
    const-string v3, ", accordionBottomRoundCorners="

    .line 66
    .line 67
    iget v4, p0, La/l9b;->i:I

    .line 68
    .line 69
    iget-object v5, p0, La/l9b;->j:Ljava/util/List;

    .line 70
    .line 71
    invoke-static {v4, v2, v3, v1, v5}, La/ohs0;->v(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    .line 72
    .line 73
    .line 74
    const-string v2, ", spanSize=2, isRTL="

    .line 75
    .line 76
    const-string v3, ", insideItemRoundCornersType="

    .line 77
    .line 78
    iget v4, p0, La/l9b;->k:I

    .line 79
    .line 80
    iget-boolean p0, p0, La/l9b;->l:Z

    .line 81
    .line 82
    invoke-static {v4, v2, v3, v1, p0}, La/brm0;->w(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string p0, ")"

    .line 89
    .line 90
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    return-object p0
.end method
