.class public final La/qvf;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/vuu0;


# instance fields
.field public final a:Z

.field public final b:La/smk0;

.field public final c:Ljava/lang/String;

.field public final d:J


# direct methods
.method public constructor <init>(ZLa/smk0;Ljava/lang/String;J)V
    .locals 0

    .line 1
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-boolean p1, p0, La/qvf;->a:Z

    .line 8
    .line 9
    iput-object p2, p0, La/qvf;->b:La/smk0;

    .line 10
    .line 11
    iput-object p3, p0, La/qvf;->c:Ljava/lang/String;

    .line 12
    .line 13
    iput-wide p4, p0, La/qvf;->d:J

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final a(La/j83;)La/nls0;
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    iget-object v2, v1, La/j83;->b:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-lez v2, :cond_3

    .line 15
    .line 16
    iget-object v2, v0, La/qvf;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    iget-boolean v4, v0, La/qvf;->a:Z

    .line 23
    .line 24
    if-lez v3, :cond_0

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_0
    if-eqz v4, :cond_3

    .line 28
    .line 29
    :goto_0
    new-instance v3, La/h83;

    .line 30
    .line 31
    invoke-direct {v3}, La/h83;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3, v1}, La/h83;->b(La/j83;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    const-string v6, " "

    .line 42
    .line 43
    if-lez v5, :cond_1

    .line 44
    .line 45
    invoke-virtual {v3, v6}, La/h83;->c(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    new-instance v7, La/smk0;

    .line 49
    .line 50
    const/16 v26, 0x0

    .line 51
    .line 52
    const v27, 0xfffe

    .line 53
    .line 54
    .line 55
    iget-wide v8, v0, La/qvf;->d:J

    .line 56
    .line 57
    const-wide/16 v10, 0x0

    .line 58
    .line 59
    const/4 v12, 0x0

    .line 60
    const/4 v13, 0x0

    .line 61
    const/4 v14, 0x0

    .line 62
    const/4 v15, 0x0

    .line 63
    const/16 v16, 0x0

    .line 64
    .line 65
    const-wide/16 v17, 0x0

    .line 66
    .line 67
    const/16 v19, 0x0

    .line 68
    .line 69
    const/16 v20, 0x0

    .line 70
    .line 71
    const/16 v21, 0x0

    .line 72
    .line 73
    const-wide/16 v22, 0x0

    .line 74
    .line 75
    const/16 v24, 0x0

    .line 76
    .line 77
    const/16 v25, 0x0

    .line 78
    .line 79
    invoke-direct/range {v7 .. v27}, La/smk0;-><init>(JJLa/psq;La/lsq;La/msq;La/nrq;Ljava/lang/String;JLa/j56;La/f8q0;La/rs00;JLa/k5q0;La/ljj0;La/agc;I)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v7}, La/h83;->g(La/smk0;)I

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    :try_start_0
    invoke-virtual {v3, v2}, La/h83;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v5}, La/h83;->d(I)V

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :catchall_0
    move-exception v0

    .line 94
    invoke-virtual {v3, v5}, La/h83;->d(I)V

    .line 95
    .line 96
    .line 97
    throw v0

    .line 98
    :cond_1
    :goto_1
    if-eqz v4, :cond_2

    .line 99
    .line 100
    invoke-virtual {v3, v6}, La/h83;->c(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    iget-object v0, v0, La/qvf;->b:La/smk0;

    .line 104
    .line 105
    invoke-virtual {v3, v0}, La/h83;->g(La/smk0;)I

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    :try_start_1
    const-string v0, "x2"

    .line 110
    .line 111
    invoke-virtual {v3, v0}, La/h83;->c(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 112
    .line 113
    .line 114
    invoke-virtual {v3, v2}, La/h83;->d(I)V

    .line 115
    .line 116
    .line 117
    goto :goto_2

    .line 118
    :catchall_1
    move-exception v0

    .line 119
    invoke-virtual {v3, v2}, La/h83;->d(I)V

    .line 120
    .line 121
    .line 122
    throw v0

    .line 123
    :cond_2
    :goto_2
    invoke-virtual {v3}, La/h83;->h()La/j83;

    .line 124
    .line 125
    .line 126
    move-result-object v0

    .line 127
    goto :goto_3

    .line 128
    :cond_3
    move-object v0, v1

    .line 129
    :goto_3
    new-instance v2, La/nls0;

    .line 130
    .line 131
    new-instance v3, La/rrc;

    .line 132
    .line 133
    const/16 v4, 0x8

    .line 134
    .line 135
    invoke-direct {v3, v1, v4}, La/rrc;-><init>(Ljava/lang/Object;B)V

    .line 136
    .line 137
    .line 138
    invoke-direct {v2, v0, v3}, La/nls0;-><init>(La/j83;La/qe60;)V

    .line 139
    .line 140
    .line 141
    return-object v2
.end method
