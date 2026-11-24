.class public final La/ddh;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:B

.field public final c:La/uch;

.field public final d:La/adh;

.field public final e:La/wch;

.field public final f:La/ank0;

.field public final g:La/ank0;

.field public final h:I

.field public final i:La/xch;

.field public final j:Ljava/lang/String;

.field public final k:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;JLa/uch;La/adh;La/wch;La/ank0;La/ank0;ILa/xch;Ljava/lang/String;Z)V
    .locals 0

    .line 1
    invoke-virtual {p11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/ddh;->a:Ljava/lang/String;

    .line 8
    .line 9
    long-to-int p1, p2

    .line 10
    iput-byte p1, p0, La/ddh;->b:B

    .line 11
    .line 12
    iput-object p4, p0, La/ddh;->c:La/uch;

    .line 13
    .line 14
    iput-object p5, p0, La/ddh;->d:La/adh;

    .line 15
    .line 16
    iput-object p6, p0, La/ddh;->e:La/wch;

    .line 17
    .line 18
    iput-object p7, p0, La/ddh;->f:La/ank0;

    .line 19
    .line 20
    iput-object p8, p0, La/ddh;->g:La/ank0;

    .line 21
    .line 22
    iput p9, p0, La/ddh;->h:I

    .line 23
    .line 24
    iput-object p10, p0, La/ddh;->i:La/xch;

    .line 25
    .line 26
    iput-object p11, p0, La/ddh;->j:Ljava/lang/String;

    .line 27
    .line 28
    iput-boolean p12, p0, La/ddh;->k:Z

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_0

    .line 4
    .line 5
    :cond_0
    instance-of v0, p1, La/ddh;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/ddh;

    .line 12
    .line 13
    iget-object v0, p0, La/ddh;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v1, p1, La/ddh;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

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
    iget-byte v0, p0, La/ddh;->b:B

    .line 26
    .line 27
    int-to-long v0, v0

    .line 28
    iget-byte v2, p1, La/ddh;->b:B

    .line 29
    .line 30
    int-to-long v2, v2

    .line 31
    cmp-long v0, v0, v2

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_3
    iget-object v0, p0, La/ddh;->c:La/uch;

    .line 37
    .line 38
    iget-object v1, p1, La/ddh;->c:La/uch;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, La/uch;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-nez v0, :cond_4

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_4
    iget-object v0, p0, La/ddh;->d:La/adh;

    .line 48
    .line 49
    iget-object v1, p1, La/ddh;->d:La/adh;

    .line 50
    .line 51
    invoke-virtual {v0, v1}, La/adh;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-nez v0, :cond_5

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_5
    iget-object v0, p0, La/ddh;->e:La/wch;

    .line 59
    .line 60
    iget-object v1, p1, La/ddh;->e:La/wch;

    .line 61
    .line 62
    invoke-virtual {v0, v1}, La/wch;->equals(Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    if-nez v0, :cond_6

    .line 67
    .line 68
    goto :goto_1

    .line 69
    :cond_6
    iget-object v0, p0, La/ddh;->f:La/ank0;

    .line 70
    .line 71
    iget-object v1, p1, La/ddh;->f:La/ank0;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, La/ank0;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_7

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_7
    iget-object v0, p0, La/ddh;->g:La/ank0;

    .line 81
    .line 82
    iget-object v1, p1, La/ddh;->g:La/ank0;

    .line 83
    .line 84
    invoke-virtual {v0, v1}, La/ank0;->equals(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-nez v0, :cond_8

    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_8
    iget v0, p0, La/ddh;->h:I

    .line 92
    .line 93
    iget v1, p1, La/ddh;->h:I

    .line 94
    .line 95
    if-ne v0, v1, :cond_b

    .line 96
    .line 97
    iget-object v0, p0, La/ddh;->i:La/xch;

    .line 98
    .line 99
    iget-object v1, p1, La/ddh;->i:La/xch;

    .line 100
    .line 101
    invoke-virtual {v0, v1}, La/xch;->equals(Ljava/lang/Object;)Z

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    if-nez v0, :cond_9

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_9
    iget-object v0, p0, La/ddh;->j:Ljava/lang/String;

    .line 109
    .line 110
    iget-object v1, p1, La/ddh;->j:Ljava/lang/String;

    .line 111
    .line 112
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-nez v0, :cond_a

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_a
    iget-boolean p0, p0, La/ddh;->k:Z

    .line 120
    .line 121
    iget-boolean p1, p1, La/ddh;->k:Z

    .line 122
    .line 123
    if-ne p0, p1, :cond_b

    .line 124
    .line 125
    :goto_0
    const/4 p0, 0x1

    .line 126
    return p0

    .line 127
    :cond_b
    :goto_1
    const/4 p0, 0x0

    .line 128
    return p0
.end method

.method public final g(La/p6t0;La/p6t0;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, La/ddh;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/ddh;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    check-cast p1, La/ddh;

    .line 16
    .line 17
    iget-byte p0, p1, La/ddh;->b:B

    .line 18
    .line 19
    int-to-long p0, p0

    .line 20
    check-cast p2, La/ddh;

    .line 21
    .line 22
    iget-byte p2, p2, La/ddh;->b:B

    .line 23
    .line 24
    int-to-long v0, p2

    .line 25
    cmp-long p0, p0, v0

    .line 26
    .line 27
    if-nez p0, :cond_0

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_0
    const/4 p0, 0x0

    .line 32
    return p0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, La/ddh;->a:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(La/p6t0;La/p6t0;)Z
    .locals 0

    .line 1
    invoke-static {p1, p2, p1, p2}, La/rw2;->y(La/p6t0;La/p6t0;La/p6t0;La/p6t0;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, La/ddh;->a:Ljava/lang/String;

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
    iget-byte v2, p0, La/ddh;->b:B

    .line 11
    .line 12
    int-to-long v2, v2

    .line 13
    invoke-static {v0, v1, v2, v3}, La/rw2;->b(IIJ)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    iget-object v2, p0, La/ddh;->c:La/uch;

    .line 18
    .line 19
    invoke-virtual {v2}, La/uch;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    add-int/2addr v2, v0

    .line 24
    mul-int/2addr v2, v1

    .line 25
    iget-object v0, p0, La/ddh;->d:La/adh;

    .line 26
    .line 27
    invoke-virtual {v0}, La/adh;->hashCode()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    add-int/2addr v0, v2

    .line 32
    mul-int/2addr v0, v1

    .line 33
    iget-object v2, p0, La/ddh;->e:La/wch;

    .line 34
    .line 35
    invoke-virtual {v2}, La/wch;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    add-int/2addr v2, v0

    .line 40
    mul-int/2addr v2, v1

    .line 41
    iget-object v0, p0, La/ddh;->f:La/ank0;

    .line 42
    .line 43
    iget-object v0, v0, La/ank0;->a:Ljava/util/List;

    .line 44
    .line 45
    invoke-static {v2, v1, v0}, La/dw9;->a(IILjava/util/List;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    iget-object v2, p0, La/ddh;->g:La/ank0;

    .line 50
    .line 51
    iget-object v2, v2, La/ank0;->a:Ljava/util/List;

    .line 52
    .line 53
    invoke-static {v0, v1, v2}, La/dw9;->a(IILjava/util/List;)I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    iget v2, p0, La/ddh;->h:I

    .line 58
    .line 59
    invoke-static {v2, v0, v1}, La/twn;->a(III)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget-object v2, p0, La/ddh;->i:La/xch;

    .line 64
    .line 65
    invoke-virtual {v2}, La/xch;->hashCode()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    add-int/2addr v2, v0

    .line 70
    mul-int/2addr v2, v1

    .line 71
    iget-object v0, p0, La/ddh;->j:Ljava/lang/String;

    .line 72
    .line 73
    invoke-static {v2, v1, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    iget-boolean p0, p0, La/ddh;->k:Z

    .line 78
    .line 79
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 80
    .line 81
    .line 82
    move-result p0

    .line 83
    add-int/2addr p0, v0

    .line 84
    return p0
.end method

.method public final o(La/p6t0;La/p6t0;)Ljava/util/Collection;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, La/ddh;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/ddh;

    .line 12
    .line 13
    if-eqz p0, :cond_0

    .line 14
    .line 15
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    check-cast p1, La/ddh;

    .line 21
    .line 22
    iget-object v0, p1, La/ddh;->c:La/uch;

    .line 23
    .line 24
    check-cast p2, La/ddh;

    .line 25
    .line 26
    iget-object v1, p2, La/ddh;->c:La/uch;

    .line 27
    .line 28
    invoke-static {p0, v0, v1}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p1, La/ddh;->d:La/adh;

    .line 32
    .line 33
    iget-object v1, p2, La/ddh;->d:La/adh;

    .line 34
    .line 35
    invoke-static {p0, v0, v1}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p1, La/ddh;->e:La/wch;

    .line 39
    .line 40
    iget-object v1, p2, La/ddh;->e:La/wch;

    .line 41
    .line 42
    invoke-static {p0, v0, v1}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    iget-object v0, p1, La/ddh;->f:La/ank0;

    .line 46
    .line 47
    new-instance v1, La/vch;

    .line 48
    .line 49
    invoke-direct {v1, v0}, La/vch;-><init>(La/ank0;)V

    .line 50
    .line 51
    .line 52
    iget-object v0, p2, La/ddh;->f:La/ank0;

    .line 53
    .line 54
    new-instance v2, La/vch;

    .line 55
    .line 56
    invoke-direct {v2, v0}, La/vch;-><init>(La/ank0;)V

    .line 57
    .line 58
    .line 59
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    iget-object v0, p1, La/ddh;->g:La/ank0;

    .line 63
    .line 64
    new-instance v1, La/bdh;

    .line 65
    .line 66
    invoke-direct {v1, v0}, La/bdh;-><init>(La/ank0;)V

    .line 67
    .line 68
    .line 69
    iget-object v0, p2, La/ddh;->g:La/ank0;

    .line 70
    .line 71
    new-instance v2, La/bdh;

    .line 72
    .line 73
    invoke-direct {v2, v0}, La/bdh;-><init>(La/ank0;)V

    .line 74
    .line 75
    .line 76
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget v0, p1, La/ddh;->h:I

    .line 80
    .line 81
    new-instance v1, La/tch;

    .line 82
    .line 83
    invoke-direct {v1, v0}, La/tch;-><init>(I)V

    .line 84
    .line 85
    .line 86
    iget v0, p2, La/ddh;->h:I

    .line 87
    .line 88
    new-instance v2, La/tch;

    .line 89
    .line 90
    invoke-direct {v2, v0}, La/tch;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    iget-object v0, p1, La/ddh;->i:La/xch;

    .line 97
    .line 98
    iget-object v1, p2, La/ddh;->i:La/xch;

    .line 99
    .line 100
    invoke-static {p0, v0, v1}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p1, La/ddh;->j:Ljava/lang/String;

    .line 104
    .line 105
    new-instance v1, La/ych;

    .line 106
    .line 107
    invoke-direct {v1, v0}, La/ych;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object v0, p2, La/ddh;->j:Ljava/lang/String;

    .line 111
    .line 112
    new-instance v2, La/ych;

    .line 113
    .line 114
    invoke-direct {v2, v0}, La/ych;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget-boolean p1, p1, La/ddh;->k:Z

    .line 121
    .line 122
    new-instance v0, La/zch;

    .line 123
    .line 124
    invoke-direct {v0, p1}, La/zch;-><init>(Z)V

    .line 125
    .line 126
    .line 127
    iget-boolean p1, p2, La/ddh;->k:Z

    .line 128
    .line 129
    new-instance p2, La/zch;

    .line 130
    .line 131
    invoke-direct {p2, p1}, La/zch;-><init>(Z)V

    .line 132
    .line 133
    .line 134
    invoke-static {p0, v0, p2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 138
    .line 139
    .line 140
    move-result p1

    .line 141
    if-nez p1, :cond_0

    .line 142
    .line 143
    return-object p0

    .line 144
    :cond_0
    const/4 p0, 0x0

    .line 145
    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    .line 1
    iget-byte v0, p0, La/ddh;->b:B

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    const-string v2, "FirstTeamScore(value="

    .line 5
    .line 6
    iget-object v3, p0, La/ddh;->f:La/ank0;

    .line 7
    .line 8
    const-string v4, ")"

    .line 9
    .line 10
    invoke-static {v2, v3, v4}, La/w6x;->p(Ljava/lang/String;La/ank0;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    iget-object v3, p0, La/ddh;->g:La/ank0;

    .line 15
    .line 16
    const-string v5, "SecondTeamScore(value="

    .line 17
    .line 18
    invoke-static {v5, v3, v4}, La/w6x;->p(Ljava/lang/String;La/ank0;Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    iget v5, p0, La/ddh;->h:I

    .line 23
    .line 24
    const-string v6, "Background(value="

    .line 25
    .line 26
    invoke-static {v5, v6, v4}, La/ua80;->e(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    iget-object v6, p0, La/ddh;->j:Ljava/lang/String;

    .line 31
    .line 32
    const-string v7, "MapName(value="

    .line 33
    .line 34
    invoke-static {v7, v6, v4}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    iget-boolean v7, p0, La/ddh;->k:Z

    .line 39
    .line 40
    const-string v8, "ScoreVisibility(value="

    .line 41
    .line 42
    invoke-static {v8, v4, v7}, Lc;->d(Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v7

    .line 46
    const-string v8, "CyberSeriesMapsUiModel(key="

    .line 47
    .line 48
    const-string v9, ", id="

    .line 49
    .line 50
    iget-object v10, p0, La/ddh;->a:Ljava/lang/String;

    .line 51
    .line 52
    invoke-static {v0, v1, v8, v10, v9}, La/f140;->o(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    const-string v1, ", firstTeam="

    .line 57
    .line 58
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    iget-object v1, p0, La/ddh;->c:La/uch;

    .line 62
    .line 63
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    const-string v1, ", secondTeam="

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    iget-object v1, p0, La/ddh;->d:La/adh;

    .line 72
    .line 73
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    const-string v1, ", mapBackground="

    .line 77
    .line 78
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    iget-object v1, p0, La/ddh;->e:La/wch;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string v1, ", firstTeamScore="

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    const-string v1, ", secondTeamScore="

    .line 95
    .line 96
    const-string v2, ", background="

    .line 97
    .line 98
    invoke-static {v0, v1, v3, v2, v5}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    const-string v1, ", mapDescription="

    .line 102
    .line 103
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    iget-object p0, p0, La/ddh;->i:La/xch;

    .line 107
    .line 108
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string p0, ", mapName="

    .line 112
    .line 113
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string p0, ", scoreVisibility="

    .line 120
    .line 121
    invoke-static {v0, p0, v7, v4}, La/rw2;->o(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    return-object p0
.end method
