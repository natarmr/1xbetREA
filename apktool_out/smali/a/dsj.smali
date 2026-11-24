.class public final synthetic La/dsj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/sg00;
.implements La/rbe;


# instance fields
.field public final synthetic a:J

.field public final synthetic b:I

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/ft2;IJJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/dsj;->c:Ljava/lang/Object;

    iput p2, p0, La/dsj;->b:I

    iput-wide p3, p0, La/dsj;->a:J

    return-void
.end method

.method public synthetic constructor <init>(La/mfn0;JI)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/dsj;->c:Ljava/lang/Object;

    iput-wide p2, p0, La/dsj;->a:J

    iput p4, p0, La/dsj;->b:I

    return-void
.end method


# virtual methods
.method public accept(Ljava/lang/Object;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, La/dsj;->c:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast v1, La/mfn0;

    .line 6
    .line 7
    move-object/from16 v2, p1

    .line 8
    .line 9
    check-cast v2, La/ftf;

    .line 10
    .line 11
    iget-object v3, v1, La/mfn0;->h:Landroidx/media3/common/b;

    .line 12
    .line 13
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    iget-object v3, v2, La/ftf;->a:La/b4x;

    .line 17
    .line 18
    iget-wide v4, v2, La/ftf;->c:J

    .line 19
    .line 20
    new-instance v6, La/sd9;

    .line 21
    .line 22
    const/4 v7, 0x2

    .line 23
    invoke-direct {v6, v7}, La/sd9;-><init>(B)V

    .line 24
    .line 25
    .line 26
    new-instance v7, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-interface {v3}, Ljava/util/Collection;->size()I

    .line 29
    .line 30
    .line 31
    move-result v8

    .line 32
    invoke-direct {v7, v8}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v3}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v8

    .line 43
    if-eqz v8, :cond_0

    .line 44
    .line 45
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v8

    .line 49
    invoke-virtual {v6, v8}, La/sd9;->apply(Ljava/lang/Object;)Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    check-cast v8, Landroid/os/Bundle;

    .line 54
    .line 55
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_0
    new-instance v3, Landroid/os/Bundle;

    .line 60
    .line 61
    invoke-direct {v3}, Landroid/os/Bundle;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v6, "c"

    .line 65
    .line 66
    invoke-virtual {v3, v6, v7}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 67
    .line 68
    .line 69
    const-string v6, "d"

    .line 70
    .line 71
    invoke-virtual {v3, v6, v4, v5}, Landroid/os/BaseBundle;->putLong(Ljava/lang/String;J)V

    .line 72
    .line 73
    .line 74
    invoke-static {}, Landroid/os/Parcel;->obtain()Landroid/os/Parcel;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    invoke-virtual {v4, v3}, Landroid/os/Parcel;->writeBundle(Landroid/os/Bundle;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4}, Landroid/os/Parcel;->marshall()[B

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v4}, Landroid/os/Parcel;->recycle()V

    .line 86
    .line 87
    .line 88
    iget-object v4, v1, La/mfn0;->c:La/fq80;

    .line 89
    .line 90
    array-length v5, v3

    .line 91
    invoke-virtual {v4, v3, v5}, La/fq80;->K([BI)V

    .line 92
    .line 93
    .line 94
    iget-object v5, v1, La/mfn0;->a:La/ncs0;

    .line 95
    .line 96
    array-length v6, v3

    .line 97
    invoke-interface {v5, v6, v4}, La/ncs0;->a(ILa/fq80;)V

    .line 98
    .line 99
    .line 100
    iget-wide v4, v2, La/ftf;->b:J

    .line 101
    .line 102
    const-wide v6, -0x7fffffffffffffffL    # -4.9E-324

    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    cmp-long v2, v4, v6

    .line 108
    .line 109
    iget-object v6, v1, La/mfn0;->h:Landroidx/media3/common/b;

    .line 110
    .line 111
    iget-wide v7, v0, La/dsj;->a:J

    .line 112
    .line 113
    const/4 v9, 0x1

    .line 114
    const-wide v10, 0x7fffffffffffffffL

    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    if-nez v2, :cond_2

    .line 120
    .line 121
    iget-wide v4, v6, Landroidx/media3/common/b;->u:J

    .line 122
    .line 123
    cmp-long v2, v4, v10

    .line 124
    .line 125
    if-nez v2, :cond_1

    .line 126
    .line 127
    move v2, v9

    .line 128
    goto :goto_1

    .line 129
    :cond_1
    const/4 v2, 0x0

    .line 130
    :goto_1
    invoke-static {v2}, La/x0x;->K(Z)V

    .line 131
    .line 132
    .line 133
    :goto_2
    move-wide v11, v7

    .line 134
    goto :goto_3

    .line 135
    :cond_2
    iget-wide v12, v6, Landroidx/media3/common/b;->u:J

    .line 136
    .line 137
    cmp-long v2, v12, v10

    .line 138
    .line 139
    if-nez v2, :cond_3

    .line 140
    .line 141
    add-long/2addr v7, v4

    .line 142
    goto :goto_2

    .line 143
    :cond_3
    add-long v7, v4, v12

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :goto_3
    iget-object v10, v1, La/mfn0;->a:La/ncs0;

    .line 147
    .line 148
    iget v0, v0, La/dsj;->b:I

    .line 149
    .line 150
    or-int/lit8 v13, v0, 0x1

    .line 151
    .line 152
    array-length v14, v3

    .line 153
    const/4 v15, 0x0

    .line 154
    const/16 v16, 0x0

    .line 155
    .line 156
    invoke-interface/range {v10 .. v16}, La/ncs0;->b(JIIILa/mcs0;)V

    .line 157
    .line 158
    .line 159
    return-void
.end method

.method public invoke(Ljava/lang/Object;)V
    .locals 10

    .line 1
    iget-object v0, p0, La/dsj;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, La/ft2;

    .line 4
    .line 5
    check-cast p1, La/gt2;

    .line 6
    .line 7
    check-cast p1, La/kn30;

    .line 8
    .line 9
    iget-object v1, p1, La/kn30;->h:Ljava/util/HashMap;

    .line 10
    .line 11
    iget-object v2, p1, La/kn30;->i:Ljava/util/HashMap;

    .line 12
    .line 13
    iget-object v3, v0, La/ft2;->d:La/vn30;

    .line 14
    .line 15
    if-eqz v3, :cond_2

    .line 16
    .line 17
    iget-object p1, p1, La/kn30;->c:La/owj;

    .line 18
    .line 19
    iget-object v0, v0, La/ft2;->b:La/bmq0;

    .line 20
    .line 21
    invoke-virtual {p1, v0, v3}, La/owj;->c(La/bmq0;La/vn30;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    check-cast v0, Ljava/lang/Long;

    .line 30
    .line 31
    invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ljava/lang/Long;

    .line 36
    .line 37
    const-wide/16 v4, 0x0

    .line 38
    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    move-wide v6, v4

    .line 42
    goto :goto_0

    .line 43
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 44
    .line 45
    .line 46
    move-result-wide v6

    .line 47
    :goto_0
    iget-wide v8, p0, La/dsj;->a:J

    .line 48
    .line 49
    add-long/2addr v6, v8

    .line 50
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v2, p1, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    if-nez v3, :cond_1

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 61
    .line 62
    .line 63
    move-result-wide v4

    .line 64
    :goto_1
    iget p0, p0, La/dsj;->b:I

    .line 65
    .line 66
    int-to-long v2, p0

    .line 67
    add-long/2addr v4, v2

    .line 68
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    invoke-virtual {v1, p1, p0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    :cond_2
    return-void
.end method
