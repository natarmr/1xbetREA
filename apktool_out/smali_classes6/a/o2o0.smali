.class public final La/o2o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s2o0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:La/a4x;

.field public final d:La/a4x;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/lang/String;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:La/y1m;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;La/a4x;La/a4x;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;La/y1m;)V
    .locals 0

    .line 1
    invoke-static {p1, p2, p7, p8, p9}, La/ohs0;->z(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/o2o0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iput-object p2, p0, La/o2o0;->b:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, La/o2o0;->c:La/a4x;

    .line 12
    .line 13
    iput-object p4, p0, La/o2o0;->d:La/a4x;

    .line 14
    .line 15
    iput-object p5, p0, La/o2o0;->e:Ljava/lang/String;

    .line 16
    .line 17
    iput-object p6, p0, La/o2o0;->f:Ljava/lang/String;

    .line 18
    .line 19
    iput-object p7, p0, La/o2o0;->g:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p8, p0, La/o2o0;->h:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p9, p0, La/o2o0;->i:Ljava/lang/String;

    .line 24
    .line 25
    iput-object p10, p0, La/o2o0;->j:La/y1m;

    .line 26
    .line 27
    return-void
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
    instance-of v0, p1, La/o2o0;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_0

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/o2o0;

    .line 12
    .line 13
    iget-object v0, p0, La/o2o0;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/o2o0;->a:Ljava/lang/String;

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
    goto/16 :goto_0

    .line 24
    .line 25
    :cond_2
    iget-object v0, p0, La/o2o0;->b:Ljava/lang/String;

    .line 26
    .line 27
    iget-object v1, p1, La/o2o0;->b:Ljava/lang/String;

    .line 28
    .line 29
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/o2o0;->c:La/a4x;

    .line 37
    .line 38
    iget-object v1, p1, La/o2o0;->c:La/a4x;

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
    iget-object v0, p0, La/o2o0;->d:La/a4x;

    .line 48
    .line 49
    iget-object v1, p1, La/o2o0;->d:La/a4x;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_5
    iget-object v0, p0, La/o2o0;->e:Ljava/lang/String;

    .line 59
    .line 60
    iget-object v1, p1, La/o2o0;->e:Ljava/lang/String;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_6
    iget-object v0, p0, La/o2o0;->f:Ljava/lang/String;

    .line 70
    .line 71
    iget-object v1, p1, La/o2o0;->f:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_7

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_7
    iget-object v0, p0, La/o2o0;->g:Ljava/lang/String;

    .line 81
    .line 82
    iget-object v1, p1, La/o2o0;->g:Ljava/lang/String;

    .line 83
    .line 84
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_8

    .line 89
    .line 90
    goto :goto_0

    .line 91
    :cond_8
    iget-object v0, p0, La/o2o0;->h:Ljava/lang/String;

    .line 92
    .line 93
    iget-object v1, p1, La/o2o0;->h:Ljava/lang/String;

    .line 94
    .line 95
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    if-nez v0, :cond_9

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_9
    iget-object v0, p0, La/o2o0;->i:Ljava/lang/String;

    .line 103
    .line 104
    iget-object v1, p1, La/o2o0;->i:Ljava/lang/String;

    .line 105
    .line 106
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_a

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_a
    iget-object p0, p0, La/o2o0;->j:La/y1m;

    .line 114
    .line 115
    iget-object p1, p1, La/o2o0;->j:La/y1m;

    .line 116
    .line 117
    invoke-virtual {p0, p1}, La/y1m;->equals(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    if-nez p0, :cond_b

    .line 122
    .line 123
    goto :goto_0

    .line 124
    :cond_b
    sget-object p0, La/r2n;->a:La/r2n;

    .line 125
    .line 126
    invoke-virtual {p0, p0}, La/r2n;->equals(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    if-nez p0, :cond_c

    .line 131
    .line 132
    :goto_0
    const/4 p0, 0x0

    .line 133
    return p0

    .line 134
    :cond_c
    :goto_1
    const/4 p0, 0x1

    .line 135
    return p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, La/o2o0;->a:Ljava/lang/String;

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
    iget-object v2, p0, La/o2o0;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, La/o2o0;->c:La/a4x;

    .line 17
    .line 18
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-object v2, p0, La/o2o0;->d:La/a4x;

    .line 23
    .line 24
    invoke-static {v2, v0, v1}, La/cs0;->b(La/a4x;II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    iget-object v2, p0, La/o2o0;->e:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v2, p0, La/o2o0;->f:Ljava/lang/String;

    .line 35
    .line 36
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    iget-object v2, p0, La/o2o0;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    iget-object v2, p0, La/o2o0;->h:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    iget-object v2, p0, La/o2o0;->i:Ljava/lang/String;

    .line 53
    .line 54
    invoke-static {v0, v1, v2}, La/ua80;->b(IILjava/lang/String;)I

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    iget-object p0, p0, La/o2o0;->j:La/y1m;

    .line 59
    .line 60
    invoke-virtual {p0}, La/y1m;->hashCode()I

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    add-int/2addr p0, v0

    .line 65
    mul-int/2addr p0, v1

    .line 66
    const v0, 0x15a5fe96

    .line 67
    .line 68
    .line 69
    add-int/2addr p0, v0

    .line 70
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", secondOpponentLabel="

    .line 2
    .line 3
    const-string v1, ", firstOpponentDiceList="

    .line 4
    .line 5
    const-string v2, "DicePoker(firstOpponentLabel="

    .line 6
    .line 7
    iget-object v3, p0, La/o2o0;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, La/o2o0;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, La/b1j;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    const-string v1, ", secondOpponentDiceList="

    .line 16
    .line 17
    const-string v2, ", firstOpponentCombinationLabel="

    .line 18
    .line 19
    iget-object v3, p0, La/o2o0;->c:La/a4x;

    .line 20
    .line 21
    iget-object v4, p0, La/o2o0;->d:La/a4x;

    .line 22
    .line 23
    invoke-static {v0, v3, v1, v4, v2}, La/hne;->y(Ljava/lang/StringBuilder;La/a4x;Ljava/lang/String;La/a4x;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v1, ", secondOpponentCombinationLabel="

    .line 27
    .line 28
    const-string v2, ", gameLabel="

    .line 29
    .line 30
    iget-object v3, p0, La/o2o0;->e:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v4, p0, La/o2o0;->f:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const-string v1, ", infoLabel="

    .line 38
    .line 39
    const-string v2, ", tagLiveText="

    .line 40
    .line 41
    iget-object v3, p0, La/o2o0;->g:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v4, p0, La/o2o0;->h:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v0, v3, v1, v4, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    iget-object v1, p0, La/o2o0;->i:Ljava/lang/String;

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", scoreModel="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, La/o2o0;->j:La/y1m;

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string p0, ", options="

    .line 64
    .line 65
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    sget-object p0, La/r2n;->a:La/r2n;

    .line 69
    .line 70
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p0, ")"

    .line 74
    .line 75
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0
.end method
