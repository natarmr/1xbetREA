.class public final La/mpt0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/dfn0;
.implements La/zuw0;


# instance fields
.field public final synthetic a:B

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(B)V
    .locals 4

    iput-byte p1, p0, La/mpt0;->a:B

    packed-switch p1, :pswitch_data_0

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, La/nbw0;

    const-string v0, ""

    const-wide/16 v1, 0x0

    const/4 v3, 0x0

    invoke-direct {p1, v0, v1, v2, v3}, La/nbw0;-><init>(Ljava/lang/String;JLjava/util/HashMap;)V

    iput-object p1, p0, La/mpt0;->b:Ljava/lang/Object;

    new-instance p1, La/nbw0;

    .line 75
    invoke-direct {p1, v0, v1, v2, v3}, La/nbw0;-><init>(Ljava/lang/String;JLjava/util/HashMap;)V

    iput-object p1, p0, La/mpt0;->d:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    .line 76
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La/mpt0;->c:Ljava/lang/Object;

    return-void

    .line 77
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(La/m6x0;Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 1

    const/4 v0, 0x5

    iput-byte v0, p0, La/mpt0;->a:B

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, La/mpt0;->b:Ljava/lang/Object;

    iput-object p3, p0, La/mpt0;->c:Ljava/lang/Object;

    iput-object p1, p0, La/mpt0;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(La/nbw0;)V
    .locals 1

    const/4 v0, 0x2

    iput-byte v0, p0, La/mpt0;->a:B

    .line 79
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/mpt0;->b:Ljava/lang/Object;

    invoke-virtual {p1}, La/nbw0;->a()La/nbw0;

    move-result-object p1

    iput-object p1, p0, La/mpt0;->d:Ljava/lang/Object;

    new-instance p1, Ljava/util/ArrayList;

    .line 80
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, La/mpt0;->c:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/io/Serializable;Ljava/lang/Object;B)V
    .locals 0

    .line 81
    iput-byte p4, p0, La/mpt0;->a:B

    iput-object p1, p0, La/mpt0;->b:Ljava/lang/Object;

    iput-object p2, p0, La/mpt0;->c:Ljava/lang/Object;

    iput-object p3, p0, La/mpt0;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    iput-byte v0, p0, La/mpt0;->a:B

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 10
    .line 11
    .line 12
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iput-object v1, p0, La/mpt0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    mul-int/lit8 v1, v1, 0x2

    .line 23
    .line 24
    new-array v1, v1, [J

    .line 25
    .line 26
    iput-object v1, p0, La/mpt0;->c:Ljava/lang/Object;

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-ge v1, v2, :cond_0

    .line 34
    .line 35
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    check-cast v2, La/o5v0;

    .line 40
    .line 41
    mul-int/lit8 v3, v1, 0x2

    .line 42
    .line 43
    iget-object v4, p0, La/mpt0;->c:Ljava/lang/Object;

    .line 44
    .line 45
    check-cast v4, [J

    .line 46
    .line 47
    iget-wide v5, v2, La/o5v0;->b:J

    .line 48
    .line 49
    aput-wide v5, v4, v3

    .line 50
    .line 51
    add-int/2addr v3, v0

    .line 52
    iget-wide v5, v2, La/o5v0;->c:J

    .line 53
    .line 54
    aput-wide v5, v4, v3

    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    iget-object p1, p0, La/mpt0;->c:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p1, [J

    .line 62
    .line 63
    array-length v0, p1

    .line 64
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([JI)[J

    .line 65
    .line 66
    .line 67
    move-result-object p1

    .line 68
    iput-object p1, p0, La/mpt0;->d:Ljava/lang/Object;

    .line 69
    .line 70
    invoke-static {p1}, Ljava/util/Arrays;->sort([J)V

    .line 71
    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public a(J)I
    .locals 1

    .line 1
    iget-object p0, p0, La/mpt0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-static {p0, p1, p2, v0}, La/vtt0;->b([JJZ)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    array-length p0, p0

    .line 11
    if-ge p1, p0, :cond_0

    .line 12
    .line 13
    return p1

    .line 14
    :cond_0
    const/4 p0, -0x1

    .line 15
    return p0
.end method

.method public b()La/nrw0;
    .locals 4

    .line 1
    iget-object v0, p0, La/mpt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/srw0;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    iget-object v2, p0, La/mpt0;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, La/rkt0;

    .line 11
    .line 12
    if-eqz v2, :cond_8

    .line 13
    .line 14
    iget v3, v0, La/srw0;->a:I

    .line 15
    .line 16
    iget-object v2, v2, La/rkt0;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v2, La/icw0;

    .line 19
    .line 20
    iget-object v2, v2, La/icw0;->a:[B

    .line 21
    .line 22
    array-length v2, v2

    .line 23
    if-ne v3, v2, :cond_7

    .line 24
    .line 25
    invoke-virtual {v0}, La/srw0;->a()Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    iget-object v0, p0, La/mpt0;->d:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v0, Ljava/lang/Integer;

    .line 34
    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const-string p0, "Cannot create key without ID requirement with parameters with ID requirement"

    .line 39
    .line 40
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    return-object v1

    .line 44
    :cond_1
    :goto_0
    iget-object v0, p0, La/mpt0;->b:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v0, La/srw0;

    .line 47
    .line 48
    invoke-virtual {v0}, La/srw0;->a()Z

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-nez v0, :cond_3

    .line 53
    .line 54
    iget-object v0, p0, La/mpt0;->d:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ljava/lang/Integer;

    .line 57
    .line 58
    if-nez v0, :cond_2

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const-string p0, "Cannot create key with ID requirement with parameters without ID requirement"

    .line 62
    .line 63
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-object v1

    .line 67
    :cond_3
    :goto_1
    iget-object v0, p0, La/mpt0;->b:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v0, La/srw0;

    .line 70
    .line 71
    iget-object v0, v0, La/srw0;->b:La/m60;

    .line 72
    .line 73
    sget-object v2, La/m60;->j:La/m60;

    .line 74
    .line 75
    if-ne v0, v2, :cond_4

    .line 76
    .line 77
    sget-object v0, La/q6x0;->a:La/icw0;

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_4
    sget-object v2, La/m60;->i:La/m60;

    .line 81
    .line 82
    if-ne v0, v2, :cond_5

    .line 83
    .line 84
    iget-object v0, p0, La/mpt0;->d:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast v0, Ljava/lang/Integer;

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-static {v0}, La/q6x0;->a(I)La/icw0;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    goto :goto_2

    .line 97
    :cond_5
    sget-object v2, La/m60;->h:La/m60;

    .line 98
    .line 99
    if-ne v0, v2, :cond_6

    .line 100
    .line 101
    iget-object v0, p0, La/mpt0;->d:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast v0, Ljava/lang/Integer;

    .line 104
    .line 105
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    invoke-static {v0}, La/q6x0;->b(I)La/icw0;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :goto_2
    new-instance v1, La/nrw0;

    .line 114
    .line 115
    iget-object v2, p0, La/mpt0;->b:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v2, La/srw0;

    .line 118
    .line 119
    iget-object v3, p0, La/mpt0;->c:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v3, La/rkt0;

    .line 122
    .line 123
    iget-object p0, p0, La/mpt0;->d:Ljava/lang/Object;

    .line 124
    .line 125
    check-cast p0, Ljava/lang/Integer;

    .line 126
    .line 127
    invoke-direct {v1, v2, v3, v0, p0}, La/nrw0;-><init>(La/srw0;La/rkt0;La/icw0;Ljava/lang/Integer;)V

    .line 128
    .line 129
    .line 130
    return-object v1

    .line 131
    :cond_6
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p0

    .line 135
    const-string v0, "Unknown AesGcmSivParameters.Variant: "

    .line 136
    .line 137
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object p0

    .line 141
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-object v1

    .line 145
    :cond_7
    const-string p0, "Key size mismatch"

    .line 146
    .line 147
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    return-object v1

    .line 151
    :cond_8
    const-string p0, "Cannot build without parameters and/or key material"

    .line 152
    .line 153
    invoke-static {p0}, La/hny;->o(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    return-object v1
.end method

.method public c(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 8

    .line 1
    iget-object p1, p0, La/mpt0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p1

    .line 4
    check-cast v0, La/m6x0;

    .line 5
    .line 6
    iget-object p1, p0, La/mpt0;->b:Ljava/lang/Object;

    .line 7
    .line 8
    move-object v5, p1

    .line 9
    check-cast v5, Ljava/lang/String;

    .line 10
    .line 11
    iget-object p0, p0, La/mpt0;->c:Ljava/lang/Object;

    .line 12
    .line 13
    move-object v6, p0

    .line 14
    check-cast v6, Ljava/util/ArrayList;

    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    move v2, p2

    .line 18
    move-object v3, p3

    .line 19
    move-object v4, p4

    .line 20
    move-object v7, p5

    .line 21
    invoke-virtual/range {v0 .. v7}, La/m6x0;->w(ZILjava/lang/Throwable;[BLjava/lang/String;Ljava/util/List;Ljava/util/Map;)V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/mpt0;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, La/mpt0;

    .line 12
    .line 13
    iget-object v1, p0, La/mpt0;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, La/nbw0;

    .line 16
    .line 17
    invoke-virtual {v1}, La/nbw0;->a()La/nbw0;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-direct {v0, v1}, La/mpt0;-><init>(La/nbw0;)V

    .line 22
    .line 23
    .line 24
    iget-object p0, p0, La/mpt0;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p0, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    if-eqz v1, :cond_0

    .line 37
    .line 38
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    check-cast v1, La/nbw0;

    .line 43
    .line 44
    iget-object v2, v0, La/mpt0;->c:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-virtual {v1}, La/nbw0;->a()La/nbw0;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-object v0

    .line 57
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
.end method

.method public e(J)Ljava/util/List;
    .locals 9

    .line 1
    iget-object v0, p0, La/mpt0;->b:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/List;

    .line 4
    .line 5
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v2, Ljava/util/ArrayList;

    .line 11
    .line 12
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 18
    .line 19
    .line 20
    move-result v5

    .line 21
    if-ge v4, v5, :cond_2

    .line 22
    .line 23
    iget-object v5, p0, La/mpt0;->c:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v5, [J

    .line 26
    .line 27
    mul-int/lit8 v6, v4, 0x2

    .line 28
    .line 29
    aget-wide v7, v5, v6

    .line 30
    .line 31
    cmp-long v7, v7, p1

    .line 32
    .line 33
    if-gtz v7, :cond_1

    .line 34
    .line 35
    add-int/lit8 v6, v6, 0x1

    .line 36
    .line 37
    aget-wide v6, v5, v6

    .line 38
    .line 39
    cmp-long v5, p1, v6

    .line 40
    .line 41
    if-gez v5, :cond_1

    .line 42
    .line 43
    invoke-interface {v0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, La/o5v0;

    .line 48
    .line 49
    iget-object v6, v5, La/o5v0;->a:La/ctf;

    .line 50
    .line 51
    iget v7, v6, La/ctf;->e:F

    .line 52
    .line 53
    const v8, -0x800001

    .line 54
    .line 55
    .line 56
    cmpl-float v7, v7, v8

    .line 57
    .line 58
    if-nez v7, :cond_0

    .line 59
    .line 60
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_0
    invoke-virtual {v1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    :cond_1
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_2
    new-instance p0, La/w5v0;

    .line 71
    .line 72
    invoke-direct {p0, v3}, La/w5v0;-><init>(B)V

    .line 73
    .line 74
    .line 75
    invoke-static {v2, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 76
    .line 77
    .line 78
    :goto_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-ge v3, p0, :cond_3

    .line 83
    .line 84
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    check-cast p0, La/o5v0;

    .line 89
    .line 90
    iget-object p0, p0, La/o5v0;->a:La/ctf;

    .line 91
    .line 92
    invoke-virtual {p0}, La/ctf;->a()La/btf;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    rsub-int/lit8 p1, v3, -0x1

    .line 97
    .line 98
    int-to-float p1, p1

    .line 99
    iput p1, p0, La/btf;->e:F

    .line 100
    .line 101
    const/4 p1, 0x1

    .line 102
    iput p1, p0, La/btf;->f:I

    .line 103
    .line 104
    invoke-virtual {p0}, La/btf;->a()La/ctf;

    .line 105
    .line 106
    .line 107
    move-result-object p0

    .line 108
    invoke-virtual {v1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    add-int/lit8 v3, v3, 0x1

    .line 112
    .line 113
    goto :goto_2

    .line 114
    :cond_3
    return-object v1
.end method

.method public j(I)J
    .locals 3

    .line 1
    iget-object p0, p0, La/mpt0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [J

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x1

    .line 7
    if-ltz p1, :cond_0

    .line 8
    .line 9
    move v2, v1

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move v2, v0

    .line 12
    :goto_0
    invoke-static {v2}, La/x0x;->A(Z)V

    .line 13
    .line 14
    .line 15
    array-length v2, p0

    .line 16
    if-ge p1, v2, :cond_1

    .line 17
    .line 18
    move v0, v1

    .line 19
    :cond_1
    invoke-static {v0}, La/x0x;->A(Z)V

    .line 20
    .line 21
    .line 22
    aget-wide v0, p0, p1

    .line 23
    .line 24
    return-wide v0
.end method

.method public l()I
    .locals 0

    .line 1
    iget-object p0, p0, La/mpt0;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, [J

    .line 4
    .line 5
    array-length p0, p0

    .line 6
    return p0
.end method
