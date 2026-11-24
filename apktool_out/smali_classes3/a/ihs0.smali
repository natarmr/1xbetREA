.class public abstract La/ihs0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(La/qks0;Z)La/qcm;
    .locals 2

    .line 1
    iget-object v0, p0, La/qks0;->e:La/fks0;

    .line 2
    .line 3
    sget-object v1, La/fks0;->c:La/fks0;

    .line 4
    .line 5
    if-ne v0, v1, :cond_0

    .line 6
    .line 7
    sget-object p0, La/ncm;->c:La/ncm;

    .line 8
    .line 9
    new-instance p1, La/pcm;

    .line 10
    .line 11
    invoke-direct {p1, p0}, La/pcm;-><init>(La/ncm;)V

    .line 12
    .line 13
    .line 14
    return-object p1

    .line 15
    :cond_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    iget-object p1, p0, La/qks0;->b:Ljava/lang/String;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    sget-object p0, La/ncm;->b:La/ncm;

    .line 26
    .line 27
    new-instance p1, La/pcm;

    .line 28
    .line 29
    invoke-direct {p1, p0}, La/pcm;-><init>(La/ncm;)V

    .line 30
    .line 31
    .line 32
    return-object p1

    .line 33
    :cond_1
    new-instance p1, La/n0x;

    .line 34
    .line 35
    iget-object p0, p0, La/qks0;->c:Ljava/lang/String;

    .line 36
    .line 37
    invoke-direct {p1, p0}, La/n0x;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    new-instance p0, La/ocm;

    .line 41
    .line 42
    invoke-direct {p0, p1}, La/ocm;-><init>(La/n0x;)V

    .line 43
    .line 44
    .line 45
    return-object p0
.end method

.method public static final b(La/qks0;La/ctf0;La/qcm;)La/ucm;
    .locals 11

    .line 1
    new-instance v0, La/ucm;

    .line 2
    .line 3
    iget-boolean v1, p0, La/qks0;->f:Z

    .line 4
    .line 5
    iget-object v2, p0, La/qks0;->b:Ljava/lang/String;

    .line 6
    .line 7
    iget-object v3, p0, La/qks0;->e:La/fks0;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    iget-wide v4, p0, La/qks0;->a:J

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const-wide/16 v4, -0x1

    .line 15
    .line 16
    :goto_0
    invoke-virtual {v3}, La/fks0;->a()Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    const/4 v6, 0x0

    .line 21
    if-eqz v1, :cond_1

    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    new-array v1, v6, [Ljava/lang/Object;

    .line 30
    .line 31
    iget-object v7, p1, La/ctf0;->b:La/lsm0;

    .line 32
    .line 33
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    const v8, 0x7f1305f4

    .line 38
    .line 39
    .line 40
    invoke-virtual {v7, v8, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    goto :goto_1

    .line 45
    :cond_1
    sget-object v1, La/fks0;->c:La/fks0;

    .line 46
    .line 47
    if-ne v3, v1, :cond_2

    .line 48
    .line 49
    new-array v1, v6, [Ljava/lang/Object;

    .line 50
    .line 51
    iget-object v7, p1, La/ctf0;->b:La/lsm0;

    .line 52
    .line 53
    invoke-static {v1, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    const v8, 0x7f131192

    .line 58
    .line 59
    .line 60
    invoke-virtual {v7, v8, v1}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    goto :goto_1

    .line 65
    :cond_2
    move-object v1, v2

    .line 66
    :goto_1
    iget-object p0, p0, La/qks0;->d:Ljava/lang/String;

    .line 67
    .line 68
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 69
    .line 70
    .line 71
    move-result v7

    .line 72
    if-lez v7, :cond_3

    .line 73
    .line 74
    invoke-virtual {v3}, La/fks0;->b()Z

    .line 75
    .line 76
    .line 77
    move-result v7

    .line 78
    if-eqz v7, :cond_3

    .line 79
    .line 80
    new-instance p0, La/rcm;

    .line 81
    .line 82
    iget v2, v3, La/fks0;->a:I

    .line 83
    .line 84
    new-array v3, v6, [Ljava/lang/Object;

    .line 85
    .line 86
    iget-object p1, p1, La/ctf0;->b:La/lsm0;

    .line 87
    .line 88
    invoke-static {v3, v6}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v3

    .line 92
    invoke-virtual {p1, v2, v3}, La/lsm0;->a(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    invoke-direct {p0, p1}, La/rcm;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-lez p1, :cond_4

    .line 105
    .line 106
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    if-lez p1, :cond_4

    .line 111
    .line 112
    new-instance p1, La/rcm;

    .line 113
    .line 114
    invoke-direct {p1, p0}, La/rcm;-><init>(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    move-object p0, p1

    .line 118
    goto :goto_2

    .line 119
    :cond_4
    sget-object p0, La/scm;->a:La/scm;

    .line 120
    .line 121
    :goto_2
    const/4 v6, 0x1

    .line 122
    move-wide v9, v4

    .line 123
    move-object v4, v1

    .line 124
    move-wide v1, v9

    .line 125
    move-object v5, p0

    .line 126
    move-object v3, p2

    .line 127
    invoke-direct/range {v0 .. v6}, La/ucm;-><init>(JLa/qcm;Ljava/lang/String;La/tcm;Z)V

    .line 128
    .line 129
    .line 130
    return-object v0
.end method
