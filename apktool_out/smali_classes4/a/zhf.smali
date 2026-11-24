.class public final La/zhf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/p6t0;
.implements La/s0h;


# instance fields
.field public final a:J

.field public final b:La/shf;

.field public final c:La/kff;

.field public final d:Ljava/lang/String;

.field public final e:La/thf;

.field public final f:La/vhf;

.field public final g:La/phf;

.field public final h:Ljava/lang/String;

.field public final i:Ljava/lang/String;

.field public final j:La/igg0;

.field public final k:Z


# direct methods
.method public constructor <init>(JLa/shf;La/kff;Ljava/lang/String;La/thf;La/vhf;La/phf;Ljava/lang/String;Ljava/lang/String;La/igg0;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, La/zhf;->a:J

    .line 5
    .line 6
    iput-object p3, p0, La/zhf;->b:La/shf;

    .line 7
    .line 8
    iput-object p4, p0, La/zhf;->c:La/kff;

    .line 9
    .line 10
    iput-object p5, p0, La/zhf;->d:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p6, p0, La/zhf;->e:La/thf;

    .line 13
    .line 14
    iput-object p7, p0, La/zhf;->f:La/vhf;

    .line 15
    .line 16
    iput-object p8, p0, La/zhf;->g:La/phf;

    .line 17
    .line 18
    iput-object p9, p0, La/zhf;->h:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p10, p0, La/zhf;->i:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p11, p0, La/zhf;->j:La/igg0;

    .line 23
    .line 24
    iput-boolean p12, p0, La/zhf;->k:Z

    .line 25
    .line 26
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
    instance-of v0, p1, La/zhf;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    goto/16 :goto_1

    .line 10
    .line 11
    :cond_1
    check-cast p1, La/zhf;

    .line 12
    .line 13
    iget-wide v0, p0, La/zhf;->a:J

    .line 14
    .line 15
    iget-wide v2, p1, La/zhf;->a:J

    .line 16
    .line 17
    cmp-long v0, v0, v2

    .line 18
    .line 19
    if-eqz v0, :cond_2

    .line 20
    .line 21
    goto/16 :goto_1

    .line 22
    .line 23
    :cond_2
    iget-object v0, p0, La/zhf;->b:La/shf;

    .line 24
    .line 25
    iget-object v1, p1, La/zhf;->b:La/shf;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, La/shf;->equals(Ljava/lang/Object;)Z

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
    iget-object v0, p0, La/zhf;->c:La/kff;

    .line 35
    .line 36
    iget-object v1, p1, La/zhf;->c:La/kff;

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
    iget-object v0, p0, La/zhf;->d:Ljava/lang/String;

    .line 46
    .line 47
    iget-object v1, p1, La/zhf;->d:Ljava/lang/String;

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
    iget-object v0, p0, La/zhf;->e:La/thf;

    .line 57
    .line 58
    iget-object v1, p1, La/zhf;->e:La/thf;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, La/thf;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-nez v0, :cond_6

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_6
    iget-object v0, p0, La/zhf;->f:La/vhf;

    .line 68
    .line 69
    iget-object v1, p1, La/zhf;->f:La/vhf;

    .line 70
    .line 71
    invoke-virtual {v0, v1}, La/vhf;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-nez v0, :cond_7

    .line 76
    .line 77
    goto :goto_1

    .line 78
    :cond_7
    iget-object v0, p0, La/zhf;->g:La/phf;

    .line 79
    .line 80
    iget-object v1, p1, La/zhf;->g:La/phf;

    .line 81
    .line 82
    invoke-virtual {v0, v1}, La/phf;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v0

    .line 86
    if-nez v0, :cond_8

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_8
    iget-object v0, p0, La/zhf;->h:Ljava/lang/String;

    .line 90
    .line 91
    iget-object v1, p1, La/zhf;->h:Ljava/lang/String;

    .line 92
    .line 93
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-nez v0, :cond_9

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_9
    iget-object v0, p0, La/zhf;->i:Ljava/lang/String;

    .line 101
    .line 102
    iget-object v1, p1, La/zhf;->i:Ljava/lang/String;

    .line 103
    .line 104
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v0

    .line 108
    if-nez v0, :cond_a

    .line 109
    .line 110
    goto :goto_1

    .line 111
    :cond_a
    iget-object v0, p0, La/zhf;->j:La/igg0;

    .line 112
    .line 113
    iget-object v1, p1, La/zhf;->j:La/igg0;

    .line 114
    .line 115
    if-ne v0, v1, :cond_c

    .line 116
    .line 117
    iget-boolean p0, p0, La/zhf;->k:Z

    .line 118
    .line 119
    iget-boolean p1, p1, La/zhf;->k:Z

    .line 120
    .line 121
    if-eq p0, p1, :cond_b

    .line 122
    .line 123
    goto :goto_1

    .line 124
    :cond_b
    :goto_0
    const/4 p0, 0x1

    .line 125
    return p0

    .line 126
    :cond_c
    :goto_1
    const/4 p0, 0x0

    .line 127
    return p0
.end method

.method public final g(La/p6t0;La/p6t0;)Z
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
    instance-of p0, p1, La/zhf;

    .line 8
    .line 9
    const/4 v0, 0x0

    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    instance-of p0, p2, La/zhf;

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    check-cast p1, La/zhf;

    .line 17
    .line 18
    iget-wide p0, p1, La/zhf;->a:J

    .line 19
    .line 20
    check-cast p2, La/zhf;

    .line 21
    .line 22
    iget-wide v1, p2, La/zhf;->a:J

    .line 23
    .line 24
    cmp-long p0, p0, v1

    .line 25
    .line 26
    if-nez p0, :cond_0

    .line 27
    .line 28
    const/4 p0, 0x1

    .line 29
    return p0

    .line 30
    :cond_0
    return v0
.end method

.method public final getKey()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "CRYSTAL_KEY"

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
    const v0, -0x402232d6

    .line 2
    .line 3
    .line 4
    iget-wide v1, p0, La/zhf;->a:J

    .line 5
    .line 6
    const/16 v3, 0x1f

    .line 7
    .line 8
    invoke-static {v0, v3, v1, v2}, La/rw2;->b(IIJ)I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    iget-object v1, p0, La/zhf;->b:La/shf;

    .line 13
    .line 14
    invoke-virtual {v1}, La/shf;->hashCode()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    add-int/2addr v1, v0

    .line 19
    mul-int/2addr v1, v3

    .line 20
    iget-object v0, p0, La/zhf;->c:La/kff;

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    add-int/2addr v0, v1

    .line 27
    mul-int/2addr v0, v3

    .line 28
    iget-object v1, p0, La/zhf;->d:Ljava/lang/String;

    .line 29
    .line 30
    invoke-static {v0, v3, v1}, La/ua80;->b(IILjava/lang/String;)I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    iget-object v1, p0, La/zhf;->e:La/thf;

    .line 35
    .line 36
    invoke-virtual {v1}, La/thf;->hashCode()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    add-int/2addr v1, v0

    .line 41
    mul-int/2addr v1, v3

    .line 42
    iget-object v0, p0, La/zhf;->f:La/vhf;

    .line 43
    .line 44
    invoke-virtual {v0}, La/vhf;->hashCode()I

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    add-int/2addr v0, v1

    .line 49
    mul-int/2addr v0, v3

    .line 50
    iget-object v1, p0, La/zhf;->g:La/phf;

    .line 51
    .line 52
    invoke-virtual {v1}, La/phf;->hashCode()I

    .line 53
    .line 54
    .line 55
    move-result v1

    .line 56
    add-int/2addr v1, v0

    .line 57
    mul-int/2addr v1, v3

    .line 58
    iget-object v0, p0, La/zhf;->h:Ljava/lang/String;

    .line 59
    .line 60
    invoke-static {v1, v3, v0}, La/ua80;->b(IILjava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    iget-object v1, p0, La/zhf;->i:Ljava/lang/String;

    .line 65
    .line 66
    invoke-static {v0, v3, v1}, La/ua80;->b(IILjava/lang/String;)I

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    iget-object v1, p0, La/zhf;->j:La/igg0;

    .line 71
    .line 72
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result v1

    .line 76
    add-int/2addr v1, v0

    .line 77
    mul-int/2addr v1, v3

    .line 78
    iget-boolean p0, p0, La/zhf;->k:Z

    .line 79
    .line 80
    invoke-static {p0}, Ljava/lang/Boolean;->hashCode(Z)I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    add-int/2addr p0, v1

    .line 85
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
    instance-of p0, p1, La/zhf;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    instance-of p0, p2, La/zhf;

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
    check-cast p1, La/zhf;

    .line 21
    .line 22
    iget-object v0, p1, La/zhf;->b:La/shf;

    .line 23
    .line 24
    check-cast p2, La/zhf;

    .line 25
    .line 26
    iget-object v1, p2, La/zhf;->b:La/shf;

    .line 27
    .line 28
    invoke-static {p0, v0, v1}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    iget-object v0, p1, La/zhf;->c:La/kff;

    .line 32
    .line 33
    new-instance v1, La/rhf;

    .line 34
    .line 35
    invoke-direct {v1, v0}, La/rhf;-><init>(La/kff;)V

    .line 36
    .line 37
    .line 38
    iget-object v0, p2, La/zhf;->c:La/kff;

    .line 39
    .line 40
    new-instance v2, La/rhf;

    .line 41
    .line 42
    invoke-direct {v2, v0}, La/rhf;-><init>(La/kff;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 46
    .line 47
    .line 48
    iget-object v0, p1, La/zhf;->d:Ljava/lang/String;

    .line 49
    .line 50
    new-instance v1, La/qhf;

    .line 51
    .line 52
    invoke-direct {v1, v0}, La/qhf;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    iget-object v0, p2, La/zhf;->d:Ljava/lang/String;

    .line 56
    .line 57
    new-instance v2, La/qhf;

    .line 58
    .line 59
    invoke-direct {v2, v0}, La/qhf;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    iget-object v0, p1, La/zhf;->e:La/thf;

    .line 66
    .line 67
    iget-object v1, p2, La/zhf;->e:La/thf;

    .line 68
    .line 69
    invoke-static {p0, v0, v1}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    iget-object v0, p1, La/zhf;->f:La/vhf;

    .line 73
    .line 74
    iget-object v1, p2, La/zhf;->f:La/vhf;

    .line 75
    .line 76
    invoke-static {p0, v0, v1}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    iget-object v0, p1, La/zhf;->g:La/phf;

    .line 80
    .line 81
    iget-object v1, p2, La/zhf;->g:La/phf;

    .line 82
    .line 83
    invoke-static {p0, v0, v1}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    iget-object v0, p1, La/zhf;->h:Ljava/lang/String;

    .line 87
    .line 88
    new-instance v1, La/uhf;

    .line 89
    .line 90
    invoke-direct {v1, v0}, La/uhf;-><init>(Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iget-object v0, p2, La/zhf;->h:Ljava/lang/String;

    .line 94
    .line 95
    new-instance v2, La/uhf;

    .line 96
    .line 97
    invoke-direct {v2, v0}, La/uhf;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    iget-object v0, p1, La/zhf;->i:Ljava/lang/String;

    .line 104
    .line 105
    new-instance v1, La/whf;

    .line 106
    .line 107
    invoke-direct {v1, v0}, La/whf;-><init>(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    iget-object v0, p2, La/zhf;->i:Ljava/lang/String;

    .line 111
    .line 112
    new-instance v2, La/whf;

    .line 113
    .line 114
    invoke-direct {v2, v0}, La/whf;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-static {p0, v1, v2}, La/k9x;->G(Ljava/util/Collection;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    iget-object p1, p1, La/zhf;->j:La/igg0;

    .line 121
    .line 122
    new-instance v0, La/xhf;

    .line 123
    .line 124
    invoke-direct {v0, p1}, La/xhf;-><init>(La/igg0;)V

    .line 125
    .line 126
    .line 127
    iget-object p1, p2, La/zhf;->j:La/igg0;

    .line 128
    .line 129
    new-instance p2, La/xhf;

    .line 130
    .line 131
    invoke-direct {p2, p1}, La/xhf;-><init>(La/igg0;)V

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
    .locals 9

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "GameState(value="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, La/zhf;->c:La/kff;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ")"

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object v2, p0, La/zhf;->d:Ljava/lang/String;

    .line 23
    .line 24
    const-string v3, "FieldDescription(value="

    .line 25
    .line 26
    invoke-static {v3, v2, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    iget-object v3, p0, La/zhf;->h:Ljava/lang/String;

    .line 31
    .line 32
    const-string v4, "PlayerOneResult(value="

    .line 33
    .line 34
    invoke-static {v4, v3, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v3

    .line 38
    iget-object v4, p0, La/zhf;->i:Ljava/lang/String;

    .line 39
    .line 40
    const-string v5, "PlayerTwoResult(value="

    .line 41
    .line 42
    invoke-static {v5, v4, v1}, La/kng0;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    new-instance v5, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v6, "RoundState(value="

    .line 49
    .line 50
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    iget-object v6, p0, La/zhf;->j:La/igg0;

    .line 54
    .line 55
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    new-instance v6, Ljava/lang/StringBuilder;

    .line 66
    .line 67
    const-string v7, "CrystalUiModel(key=CRYSTAL_KEY, gameId="

    .line 68
    .line 69
    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    iget-wide v7, p0, La/zhf;->a:J

    .line 73
    .line 74
    invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    const-string v7, ", gameText="

    .line 78
    .line 79
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    iget-object v7, p0, La/zhf;->b:La/shf;

    .line 83
    .line 84
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    const-string v7, ", gameState="

    .line 88
    .line 89
    const-string v8, ", fieldDescription="

    .line 90
    .line 91
    invoke-static {v6, v7, v0, v8, v2}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const-string v0, ", playerOneInfo="

    .line 95
    .line 96
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 97
    .line 98
    .line 99
    iget-object v0, p0, La/zhf;->e:La/thf;

    .line 100
    .line 101
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    const-string v0, ", playerTwoInfo="

    .line 105
    .line 106
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object v0, p0, La/zhf;->f:La/vhf;

    .line 110
    .line 111
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string v0, ", countdownTime="

    .line 115
    .line 116
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    iget-object v0, p0, La/zhf;->g:La/phf;

    .line 120
    .line 121
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string v0, ", playerOneResult="

    .line 125
    .line 126
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    const-string v0, ", playerTwoResult="

    .line 133
    .line 134
    const-string v2, ", roundState="

    .line 135
    .line 136
    invoke-static {v6, v0, v4, v2, v5}, La/f140;->v(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 137
    .line 138
    .line 139
    const-string v0, ", supportRtl="

    .line 140
    .line 141
    iget-boolean p0, p0, La/zhf;->k:Z

    .line 142
    .line 143
    invoke-static {v6, v0, p0, v1}, La/f140;->n(Ljava/lang/StringBuilder;Ljava/lang/String;ZLjava/lang/String;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    return-object p0
.end method
