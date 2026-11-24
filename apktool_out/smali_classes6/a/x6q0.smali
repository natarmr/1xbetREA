.class public final La/x6q0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:La/p6q0;

.field public final c:La/t7q0;

.field public final d:Z

.field public final e:Z

.field public final f:La/b6q0;

.field public final g:La/q7q0;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:La/a7n;

.field public final k:I


# direct methods
.method public constructor <init>(Ljava/lang/String;La/p6q0;La/t7q0;ZZLa/y5q0;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 1

    .line 1
    and-int/lit16 v0, p10, 0x80

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p6, 0x0

    .line 6
    :cond_0
    and-int/lit16 v0, p10, 0x400

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    const-string p8, ""

    .line 11
    .line 12
    :cond_1
    sget-object v0, La/a7n;->a:La/a7n;

    .line 13
    .line 14
    and-int/lit16 p10, p10, 0x4000

    .line 15
    .line 16
    if-eqz p10, :cond_2

    .line 17
    .line 18
    const/4 p9, -0x1

    .line 19
    :cond_2
    invoke-static {p1, p7, p8}, La/brm0;->B(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    iput-object p1, p0, La/x6q0;->a:Ljava/lang/String;

    .line 26
    .line 27
    iput-object p2, p0, La/x6q0;->b:La/p6q0;

    .line 28
    .line 29
    iput-object p3, p0, La/x6q0;->c:La/t7q0;

    .line 30
    .line 31
    iput-boolean p4, p0, La/x6q0;->d:Z

    .line 32
    .line 33
    iput-boolean p5, p0, La/x6q0;->e:Z

    .line 34
    .line 35
    iput-object p6, p0, La/x6q0;->f:La/b6q0;

    .line 36
    .line 37
    sget-object p1, La/q7q0;->a:La/q7q0;

    .line 38
    .line 39
    iput-object p1, p0, La/x6q0;->g:La/q7q0;

    .line 40
    .line 41
    iput-object p7, p0, La/x6q0;->h:Ljava/lang/String;

    .line 42
    .line 43
    iput-object p8, p0, La/x6q0;->i:Ljava/lang/String;

    .line 44
    .line 45
    iput-object v0, p0, La/x6q0;->j:La/a7n;

    .line 46
    .line 47
    iput p9, p0, La/x6q0;->k:I

    .line 48
    .line 49
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/x6q0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/x6q0;

    .line 12
    .line 13
    iget-object v0, p0, La/x6q0;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/x6q0;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_2

    .line 22
    .line 23
    goto/16 :goto_1

    .line 24
    .line 25
    :cond_2
    sget-object v0, La/e6q0;->a:La/e6q0;

    .line 26
    .line 27
    invoke-virtual {v0, v0}, La/e6q0;->equals(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_3
    iget-object v0, p0, La/x6q0;->b:La/p6q0;

    .line 35
    .line 36
    iget-object v1, p1, La/x6q0;->b:La/p6q0;

    .line 37
    .line 38
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_4

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_4
    iget-object v0, p0, La/x6q0;->c:La/t7q0;

    .line 46
    .line 47
    iget-object v1, p1, La/x6q0;->c:La/t7q0;

    .line 48
    .line 49
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-nez v0, :cond_5

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_5
    iget-boolean v0, p0, La/x6q0;->d:Z

    .line 57
    .line 58
    iget-boolean v1, p1, La/x6q0;->d:Z

    .line 59
    .line 60
    if-eq v0, v1, :cond_6

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_6
    iget-boolean v0, p0, La/x6q0;->e:Z

    .line 64
    .line 65
    iget-boolean v1, p1, La/x6q0;->e:Z

    .line 66
    .line 67
    if-eq v0, v1, :cond_7

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_7
    iget-object v0, p0, La/x6q0;->f:La/b6q0;

    .line 71
    .line 72
    iget-object v1, p1, La/x6q0;->f:La/b6q0;

    .line 73
    .line 74
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-nez v0, :cond_8

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_8
    iget-object v0, p0, La/x6q0;->g:La/q7q0;

    .line 82
    .line 83
    iget-object v1, p1, La/x6q0;->g:La/q7q0;

    .line 84
    .line 85
    invoke-virtual {v0, v1}, La/q7q0;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_9

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_9
    iget-object v0, p0, La/x6q0;->h:Ljava/lang/String;

    .line 93
    .line 94
    iget-object v1, p1, La/x6q0;->h:Ljava/lang/String;

    .line 95
    .line 96
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_a

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_a
    iget-object v0, p0, La/x6q0;->i:Ljava/lang/String;

    .line 104
    .line 105
    iget-object v1, p1, La/x6q0;->i:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v0

    .line 111
    if-nez v0, :cond_b

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_b
    iget-object v0, p0, La/x6q0;->j:La/a7n;

    .line 115
    .line 116
    iget-object v1, p1, La/x6q0;->j:La/a7n;

    .line 117
    .line 118
    if-eq v0, v1, :cond_c

    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_c
    iget p0, p0, La/x6q0;->k:I

    .line 122
    .line 123
    iget p1, p1, La/x6q0;->k:I

    .line 124
    .line 125
    if-ne p0, p1, :cond_d

    .line 126
    .line 127
    :goto_0
    const/4 p0, 0x1

    .line 128
    return p0

    .line 129
    :cond_d
    :goto_1
    const/4 p0, 0x0

    .line 130
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/x6q0;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

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
    const v2, -0x16008ed5

    .line 11
    .line 12
    .line 13
    add-int/2addr v0, v2

    .line 14
    mul-int/2addr v0, v1

    .line 15
    iget-object v2, p0, La/x6q0;->b:La/p6q0;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    add-int/2addr v2, v0

    .line 22
    mul-int/2addr v2, v1

    .line 23
    iget-object v0, p0, La/x6q0;->c:La/t7q0;

    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    add-int/2addr v0, v2

    .line 30
    mul-int/2addr v0, v1

    .line 31
    iget-boolean v2, p0, La/x6q0;->d:Z

    .line 32
    .line 33
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    iget-boolean v2, p0, La/x6q0;->e:Z

    .line 38
    .line 39
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    iget-object v3, p0, La/x6q0;->f:La/b6q0;

    .line 49
    .line 50
    if-nez v3, :cond_0

    .line 51
    .line 52
    move v3, v2

    .line 53
    goto :goto_0

    .line 54
    :cond_0
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    :goto_0
    add-int/2addr v0, v3

    .line 59
    mul-int/2addr v0, v1

    .line 60
    const v3, 0x176b697f

    .line 61
    .line 62
    .line 63
    add-int/2addr v0, v3

    .line 64
    mul-int/2addr v0, v1

    .line 65
    iget-object v3, p0, La/x6q0;->h:Ljava/lang/String;

    .line 66
    .line 67
    invoke-static {v0, v1, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    iget-object v3, p0, La/x6q0;->i:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v0, v1, v3}, La/ua80;->b(IILjava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    invoke-static {v0, v1, v2}, La/brm0;->e(IIZ)I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    const/4 v2, -0x1

    .line 82
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    iget-object v2, p0, La/x6q0;->j:La/a7n;

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    add-int/2addr v2, v0

    .line 93
    mul-int/2addr v2, v1

    .line 94
    iget p0, p0, La/x6q0;->k:I

    .line 95
    .line 96
    invoke-static {p0}, Ljava/lang/Integer;->hashCode(I)I

    .line 97
    .line 98
    .line 99
    move-result p0

    .line 100
    add-int/2addr p0, v2

    .line 101
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, La/x6q0;->k:I

    .line 2
    .line 3
    invoke-static {v0}, La/j3x;->a(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 8
    .line 9
    const-string v2, "TextFieldMultilineBasicUiModel(value="

    .line 10
    .line 11
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    iget-object v2, p0, La/x6q0;->a:Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v2, ", textFieldCellLeftStyle="

    .line 20
    .line 21
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    sget-object v2, La/e6q0;->a:La/e6q0;

    .line 25
    .line 26
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    const-string v2, ", textFieldCellRightStyle="

    .line 30
    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    iget-object v2, p0, La/x6q0;->b:La/p6q0;

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v2, ", supportingTextStyle="

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    iget-object v2, p0, La/x6q0;->c:La/t7q0;

    .line 45
    .line 46
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v2, ", enabled="

    .line 50
    .line 51
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v2, ", error="

    .line 55
    .line 56
    const-string v3, ", loading=false, textAppearance="

    .line 57
    .line 58
    iget-boolean v4, p0, La/x6q0;->d:Z

    .line 59
    .line 60
    iget-boolean v5, p0, La/x6q0;->e:Z

    .line 61
    .line 62
    invoke-static {v2, v3, v1, v4, v5}, La/ua80;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;ZZ)V

    .line 63
    .line 64
    .line 65
    iget-object v2, p0, La/x6q0;->f:La/b6q0;

    .line 66
    .line 67
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string v2, ", textFieldStyle="

    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    iget-object v2, p0, La/x6q0;->g:La/q7q0;

    .line 76
    .line 77
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    const-string v2, ", labelText="

    .line 81
    .line 82
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string v2, ", placeholderText="

    .line 86
    .line 87
    const-string v3, ", disableTopLabel=false, capitalization=Unspecified, textDirection="

    .line 88
    .line 89
    iget-object v4, p0, La/x6q0;->h:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v5, p0, La/x6q0;->i:Ljava/lang/String;

    .line 92
    .line 93
    invoke-static {v1, v4, v2, v5, v3}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    iget-object p0, p0, La/x6q0;->j:La/a7n;

    .line 97
    .line 98
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string p0, ", imeAction="

    .line 102
    .line 103
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string p0, ")"

    .line 110
    .line 111
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    return-object p0
.end method
