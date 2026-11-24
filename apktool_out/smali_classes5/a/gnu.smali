.class public final La/gnu;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/dq00;


# direct methods
.method public synthetic constructor <init>(La/dq00;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/gnu;->a:La/dq00;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()La/p6d;
    .locals 5

    .line 1
    iget-object p0, p0, La/gnu;->a:La/dq00;

    .line 2
    .line 3
    iget-object v0, p0, La/dq00;->b:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v0, La/yp90;

    .line 6
    .line 7
    iget-object v0, v0, La/yp90;->a:La/p7m0;

    .line 8
    .line 9
    new-instance v1, La/i89;

    .line 10
    .line 11
    const/16 v2, 0x16

    .line 12
    .line 13
    invoke-direct {v1, v0, v2}, La/i89;-><init>(La/gmq;B)V

    .line 14
    .line 15
    .line 16
    new-instance v0, La/xp90;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    invoke-direct {v0, v1, v2}, La/xp90;-><init>(La/i89;B)V

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, La/dq00;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v1, La/imb;

    .line 25
    .line 26
    iget-object v1, v1, La/imb;->a:La/p7m0;

    .line 27
    .line 28
    new-instance v2, La/wx4;

    .line 29
    .line 30
    const/4 v3, 0x0

    .line 31
    const/16 v4, 0x1c

    .line 32
    .line 33
    invoke-direct {v2, p0, v3, v4}, La/wx4;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 34
    .line 35
    .line 36
    new-instance p0, La/p6d;

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-direct {p0, v0, v1, v2, v3}, La/p6d;-><init>(La/gmq;La/gmq;La/xdr;B)V

    .line 40
    .line 41
    .line 42
    return-object p0
.end method

.method public b(Ljava/lang/String;Ljava/util/List;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    const/16 v1, 0xa

    .line 10
    .line 11
    invoke-static {p2, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 16
    .line 17
    .line 18
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    .line 20
    .line 21
    move-result-object p2

    .line 22
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_3

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    check-cast v1, La/qkt;

    .line 33
    .line 34
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    iget v3, v1, La/qkt;->a:I

    .line 38
    .line 39
    iget-boolean v11, v1, La/qkt;->g:Z

    .line 40
    .line 41
    iget-object v2, v1, La/qkt;->c:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v4, v1, La/qkt;->b:Ljava/lang/String;

    .line 44
    .line 45
    const-string v5, "+"

    .line 46
    .line 47
    const-string v6, " "

    .line 48
    .line 49
    invoke-static {v5, v2, v6, v4}, La/ua80;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    iget-object v2, v1, La/qkt;->f:Ljava/lang/String;

    .line 54
    .line 55
    const-string v4, "http://"

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    invoke-static {v2, v4, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-nez v4, :cond_2

    .line 63
    .line 64
    const-string v4, "https://"

    .line 65
    .line 66
    invoke-static {v2, v4, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 67
    .line 68
    .line 69
    move-result v4

    .line 70
    if-eqz v4, :cond_0

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_0
    const-string v4, "/"

    .line 74
    .line 75
    invoke-static {v2, v4, v5}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_1
    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    :goto_1
    invoke-virtual {p1, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    :cond_2
    :goto_2
    move-object v8, v2

    .line 91
    iget-wide v4, v1, La/qkt;->e:J

    .line 92
    .line 93
    iget-object v9, v1, La/qkt;->c:Ljava/lang/String;

    .line 94
    .line 95
    iget-object v6, v1, La/qkt;->h:La/cm90;

    .line 96
    .line 97
    iget-object v10, v1, La/qkt;->d:Ljava/lang/String;

    .line 98
    .line 99
    new-instance v2, La/gq90;

    .line 100
    .line 101
    invoke-direct/range {v2 .. v11}, La/gq90;-><init>(IJLa/cm90;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :cond_3
    iget-object p0, p0, La/gnu;->a:La/dq00;

    .line 109
    .line 110
    invoke-virtual {p0, v0}, La/dq00;->k(Ljava/util/List;)V

    .line 111
    .line 112
    .line 113
    return-void
.end method

.method public c(Ljava/util/List;)V
    .locals 13

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/ArrayList;

    .line 5
    .line 6
    const/16 v1, 0xa

    .line 7
    .line 8
    invoke-static {p1, v1}, La/r3d;->q(Ljava/lang/Iterable;I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_4

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, La/qkt;

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    iget v3, v1, La/qkt;->a:I

    .line 35
    .line 36
    iget-boolean v12, v1, La/qkt;->g:Z

    .line 37
    .line 38
    iget-object v2, v1, La/qkt;->c:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v4, v1, La/qkt;->b:Ljava/lang/String;

    .line 41
    .line 42
    const-string v5, " "

    .line 43
    .line 44
    invoke-static {v2, v5, v4}, La/w6x;->q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    iget-object v8, v1, La/qkt;->b:Ljava/lang/String;

    .line 49
    .line 50
    new-instance v2, Ljava/lang/StringBuilder;

    .line 51
    .line 52
    sget-object v4, La/ujn;->h:Ljava/lang/String;

    .line 53
    .line 54
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object v4, v1, La/qkt;->f:Ljava/lang/String;

    .line 58
    .line 59
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    const/4 v6, 0x0

    .line 67
    if-nez v5, :cond_0

    .line 68
    .line 69
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_0
    sget-object v5, La/ujn;->h:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v4, v5, v6}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-nez v5, :cond_3

    .line 80
    .line 81
    const-string v5, "https://"

    .line 82
    .line 83
    invoke-static {v4, v5, v6}, Lkotlin/text/c;->x(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 84
    .line 85
    .line 86
    move-result v5

    .line 87
    if-eqz v5, :cond_1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 91
    .line 92
    .line 93
    move-result v5

    .line 94
    const/16 v9, 0x2f

    .line 95
    .line 96
    if-lez v5, :cond_2

    .line 97
    .line 98
    const-string v5, "/"

    .line 99
    .line 100
    invoke-static {v2, v5}, Lkotlin/text/StringsKt;->S(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-nez v5, :cond_2

    .line 105
    .line 106
    invoke-virtual {v2, v9}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    :cond_2
    const/4 v5, 0x1

    .line 110
    new-array v5, v5, [C

    .line 111
    .line 112
    aput-char v9, v5, v6

    .line 113
    .line 114
    invoke-static {v4, v5}, Lkotlin/text/StringsKt;->y0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v4

    .line 118
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_3
    :goto_1
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->setLength(I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    :goto_2
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v9

    .line 132
    iget-object v10, v1, La/qkt;->c:Ljava/lang/String;

    .line 133
    .line 134
    iget-object v6, v1, La/qkt;->h:La/cm90;

    .line 135
    .line 136
    iget-wide v4, v1, La/qkt;->e:J

    .line 137
    .line 138
    iget-object v11, v1, La/qkt;->d:Ljava/lang/String;

    .line 139
    .line 140
    new-instance v2, La/kq90;

    .line 141
    .line 142
    invoke-direct/range {v2 .. v12}, La/kq90;-><init>(IJLa/cm90;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    goto/16 :goto_0

    .line 149
    .line 150
    :cond_4
    iget-object p0, p0, La/gnu;->a:La/dq00;

    .line 151
    .line 152
    invoke-virtual {p0, v0}, La/dq00;->k(Ljava/util/List;)V

    .line 153
    .line 154
    .line 155
    return-void
.end method
