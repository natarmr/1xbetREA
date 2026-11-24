.class public final La/wlj0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:Z

.field public final c:La/dxh0;

.field public final d:La/a4x;

.field public final e:La/a4x;

.field public final f:La/mtl;

.field public final g:Z

.field public final h:La/mdm;

.field public final i:I


# direct methods
.method public constructor <init>(IZLa/dxh0;La/a4x;La/a4x;La/mtl;ZLa/mdm;I)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput p1, p0, La/wlj0;->a:I

    .line 11
    .line 12
    iput-boolean p2, p0, La/wlj0;->b:Z

    .line 13
    .line 14
    iput-object p3, p0, La/wlj0;->c:La/dxh0;

    .line 15
    .line 16
    iput-object p4, p0, La/wlj0;->d:La/a4x;

    .line 17
    .line 18
    iput-object p5, p0, La/wlj0;->e:La/a4x;

    .line 19
    .line 20
    iput-object p6, p0, La/wlj0;->f:La/mtl;

    .line 21
    .line 22
    iput-boolean p7, p0, La/wlj0;->g:Z

    .line 23
    .line 24
    iput-object p8, p0, La/wlj0;->h:La/mdm;

    .line 25
    .line 26
    iput p9, p0, La/wlj0;->i:I

    .line 27
    .line 28
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    instance-of v0, p1, La/wlj0;

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_1
    check-cast p1, La/wlj0;

    .line 10
    .line 11
    iget v0, p0, La/wlj0;->a:I

    .line 12
    .line 13
    iget v1, p1, La/wlj0;->a:I

    .line 14
    .line 15
    if-eq v0, v1, :cond_2

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_2
    iget-boolean v0, p0, La/wlj0;->b:Z

    .line 19
    .line 20
    iget-boolean v1, p1, La/wlj0;->b:Z

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_3
    iget-object v0, p0, La/wlj0;->c:La/dxh0;

    .line 26
    .line 27
    iget-object v1, p1, La/wlj0;->c:La/dxh0;

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-nez v0, :cond_4

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_4
    iget-object v0, p0, La/wlj0;->d:La/a4x;

    .line 37
    .line 38
    iget-object v1, p1, La/wlj0;->d:La/a4x;

    .line 39
    .line 40
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/wlj0;->e:La/a4x;

    .line 48
    .line 49
    iget-object v1, p1, La/wlj0;->e:La/a4x;

    .line 50
    .line 51
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/wlj0;->f:La/mtl;

    .line 59
    .line 60
    iget-object v1, p1, La/wlj0;->f:La/mtl;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, La/mtl;->equals(Ljava/lang/Object;)Z

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
    iget-boolean v0, p0, La/wlj0;->g:Z

    .line 70
    .line 71
    iget-boolean v1, p1, La/wlj0;->g:Z

    .line 72
    .line 73
    if-eq v0, v1, :cond_8

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_8
    iget-object v0, p0, La/wlj0;->h:La/mdm;

    .line 77
    .line 78
    iget-object v1, p1, La/wlj0;->h:La/mdm;

    .line 79
    .line 80
    invoke-virtual {v0, v1}, La/mdm;->equals(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-nez v0, :cond_9

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_9
    iget p0, p0, La/wlj0;->i:I

    .line 88
    .line 89
    iget p1, p1, La/wlj0;->i:I

    .line 90
    .line 91
    if-eq p0, p1, :cond_a

    .line 92
    .line 93
    :goto_0
    const/4 p0, 0x0

    .line 94
    return p0

    .line 95
    :cond_a
    :goto_1
    const/4 p0, 0x1

    .line 96
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget v0, p0, La/wlj0;->a:I

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
    iget-boolean v2, p0, La/wlj0;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/wlj0;->c:La/dxh0;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/hne;->h(La/dxh0;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/wlj0;->d:La/a4x;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/wlj0;->e:La/a4x;

    .line 29
    .line 30
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/wlj0;->f:La/mtl;

    .line 35
    .line 36
    iget-object v2, v2, La/mtl;->a:La/a4x;

    .line 37
    .line 38
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    iget-boolean v2, p0, La/wlj0;->g:Z

    .line 43
    .line 44
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v2, p0, La/wlj0;->h:La/mdm;

    .line 49
    .line 50
    invoke-static {v2, v0, v1}, La/f140;->d(La/mdm;II)I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    iget p0, p0, La/wlj0;->i:I

    .line 55
    .line 56
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    add-int/2addr p0, v0

    .line 61
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", showTabs="

    .line 2
    .line 3
    const-string v1, ", segmentedControlStyle="

    .line 4
    .line 5
    iget v2, p0, La/wlj0;->a:I

    .line 6
    .line 7
    const-string v3, "ShareAppByQrCodeUiState(currentTab="

    .line 8
    .line 9
    iget-boolean v4, p0, La/wlj0;->b:Z

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v1, v4}, La/h97;->l(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-object v1, p0, La/wlj0;->c:La/dxh0;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", screenTabs="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, La/wlj0;->d:La/a4x;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", appLinks="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, La/wlj0;->e:La/a4x;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", bottomBarModel="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, La/wlj0;->f:La/mtl;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", hasErrorWhileLoadingData="

    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    iget-boolean v1, p0, La/wlj0;->g:Z

    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    const-string v1, ", dsEmptyConfig="

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    iget-object v1, p0, La/wlj0;->h:La/mdm;

    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v1, ", logoImageResource="

    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    const-string v1, ")"

    .line 76
    .line 77
    iget p0, p0, La/wlj0;->i:I

    .line 78
    .line 79
    invoke-static {p0, v1, v0}, La/rz4;->j(ILjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    return-object p0
.end method
