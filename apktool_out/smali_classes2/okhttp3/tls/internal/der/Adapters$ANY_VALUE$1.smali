.class public final Lokhttp3/tls/internal/der/Adapters$ANY_VALUE$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lokhttp3/tls/internal/der/DerAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lokhttp3/tls/internal/der/Adapters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lokhttp3/tls/internal/der/DerAdapter<",
        "Lokhttp3/tls/internal/der/AnyValue;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001\u00a8\u0006\u0003"
    }
    d2 = {
        "okhttp3/tls/internal/der/Adapters$ANY_VALUE$1",
        "Lokhttp3/tls/internal/der/DerAdapter;",
        "Lokhttp3/tls/internal/der/AnyValue;",
        "okhttp-tls"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public final b(Lokhttp3/tls/internal/der/DerWriter;Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p2, Lokhttp3/tls/internal/der/AnyValue;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget v2, p2, Lokhttp3/tls/internal/der/AnyValue;->a:I

    .line 10
    .line 11
    iget-wide v3, p2, Lokhttp3/tls/internal/der/AnyValue;->b:J

    .line 12
    .line 13
    new-instance v5, La/k1;

    .line 14
    .line 15
    const/16 p0, 0xf

    .line 16
    .line 17
    invoke-direct {v5, p1, p2, p0}, La/k1;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 18
    .line 19
    .line 20
    const-string v1, "ANY"

    .line 21
    .line 22
    move-object v0, p1

    .line 23
    invoke-virtual/range {v0 .. v5}, Lokhttp3/tls/internal/der/DerWriter;->b(Ljava/lang/String;IJLkotlin/jvm/functions/Function1;)V

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final c(Lokhttp3/tls/internal/der/DerHeader;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    return p0
.end method

.method public final d(Lokhttp3/tls/internal/der/DerReader;)Ljava/lang/Object;
    .locals 20

    .line 1
    move-object/from16 v1, p1

    .line 2
    .line 3
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v1}, Lokhttp3/tls/internal/der/DerReader;->c()Lokhttp3/tls/internal/der/DerHeader;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const/4 v2, 0x1

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    move v0, v2

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    iget-object v3, v1, Lokhttp3/tls/internal/der/DerReader;->e:Ljava/util/ArrayList;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v0, :cond_4

    .line 20
    .line 21
    iget-object v0, v1, Lokhttp3/tls/internal/der/DerReader;->g:Lokhttp3/tls/internal/der/DerHeader;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    iget-wide v5, v0, Lokhttp3/tls/internal/der/DerHeader;->d:J

    .line 27
    .line 28
    iput-object v4, v1, Lokhttp3/tls/internal/der/DerReader;->g:Lokhttp3/tls/internal/der/DerHeader;

    .line 29
    .line 30
    iget-wide v7, v1, Lokhttp3/tls/internal/der/DerReader;->c:J

    .line 31
    .line 32
    iget-boolean v9, v1, Lokhttp3/tls/internal/der/DerReader;->f:Z

    .line 33
    .line 34
    const-wide/16 v10, -0x1

    .line 35
    .line 36
    cmp-long v12, v5, v10

    .line 37
    .line 38
    if-eqz v12, :cond_1

    .line 39
    .line 40
    invoke-virtual {v1}, Lokhttp3/tls/internal/der/DerReader;->a()J

    .line 41
    .line 42
    .line 43
    move-result-wide v12

    .line 44
    add-long/2addr v12, v5

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    move-wide v12, v10

    .line 47
    :goto_1
    cmp-long v5, v7, v10

    .line 48
    .line 49
    if-eqz v5, :cond_3

    .line 50
    .line 51
    cmp-long v5, v12, v7

    .line 52
    .line 53
    if-gtz v5, :cond_2

    .line 54
    .line 55
    goto :goto_2

    .line 56
    :cond_2
    const-string v0, "enclosed object too large"

    .line 57
    .line 58
    invoke-static {v0}, La/e9d0;->j(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v4

    .line 62
    :cond_3
    :goto_2
    iput-wide v12, v1, Lokhttp3/tls/internal/der/DerReader;->c:J

    .line 63
    .line 64
    iget-boolean v5, v0, Lokhttp3/tls/internal/der/DerHeader;->c:Z

    .line 65
    .line 66
    iput-boolean v5, v1, Lokhttp3/tls/internal/der/DerReader;->f:Z

    .line 67
    .line 68
    const-string v5, "ANY"

    .line 69
    .line 70
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    :try_start_0
    iget-object v5, v1, Lokhttp3/tls/internal/der/DerReader;->b:La/zae0;

    .line 74
    .line 75
    invoke-virtual {v1}, Lokhttp3/tls/internal/der/DerReader;->b()J

    .line 76
    .line 77
    .line 78
    move-result-wide v10

    .line 79
    invoke-virtual {v5, v10, v11}, La/zae0;->q0(J)La/qg9;

    .line 80
    .line 81
    .line 82
    move-result-object v19

    .line 83
    new-instance v12, Lokhttp3/tls/internal/der/AnyValue;

    .line 84
    .line 85
    iget v13, v0, Lokhttp3/tls/internal/der/DerHeader;->a:I

    .line 86
    .line 87
    iget-wide v14, v0, Lokhttp3/tls/internal/der/DerHeader;->b:J

    .line 88
    .line 89
    iget-boolean v5, v0, Lokhttp3/tls/internal/der/DerHeader;->c:Z

    .line 90
    .line 91
    iget-wide v10, v0, Lokhttp3/tls/internal/der/DerHeader;->d:J

    .line 92
    .line 93
    move/from16 v16, v5

    .line 94
    .line 95
    move-wide/from16 v17, v10

    .line 96
    .line 97
    invoke-direct/range {v12 .. v19}, Lokhttp3/tls/internal/der/AnyValue;-><init>(IJZJLa/qg9;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    .line 100
    iput-object v4, v1, Lokhttp3/tls/internal/der/DerReader;->g:Lokhttp3/tls/internal/der/DerHeader;

    .line 101
    .line 102
    iput-wide v7, v1, Lokhttp3/tls/internal/der/DerReader;->c:J

    .line 103
    .line 104
    iput-boolean v9, v1, Lokhttp3/tls/internal/der/DerReader;->f:Z

    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    sub-int/2addr v0, v2

    .line 111
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    return-object v12

    .line 115
    :catchall_0
    move-exception v0

    .line 116
    iput-object v4, v1, Lokhttp3/tls/internal/der/DerReader;->g:Lokhttp3/tls/internal/der/DerHeader;

    .line 117
    .line 118
    iput-wide v7, v1, Lokhttp3/tls/internal/der/DerReader;->c:J

    .line 119
    .line 120
    iput-boolean v9, v1, Lokhttp3/tls/internal/der/DerReader;->f:Z

    .line 121
    .line 122
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    sub-int/2addr v1, v2

    .line 127
    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    throw v0

    .line 131
    :cond_4
    const-string v0, "expected a value"

    .line 132
    .line 133
    invoke-static {v0}, La/e9d0;->j(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    return-object v4
.end method
