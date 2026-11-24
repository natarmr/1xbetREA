.class public final Landroidx/work/impl/workers/DiagnosticsWorker;
.super Landroidx/work/Worker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Landroidx/work/impl/workers/DiagnosticsWorker;",
        "Landroidx/work/Worker;",
        "Landroid/content/Context;",
        "context",
        "Landroidx/work/WorkerParameters;",
        "parameters",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "work-runtime"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final c()La/mg00;
    .locals 9

    .line 1
    iget-object p0, p0, La/og00;->a:Landroid/content/Context;

    .line 2
    .line 3
    invoke-static {p0}, La/cpv0;->d(Landroid/content/Context;)La/cpv0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object v0, p0, La/cpv0;->c:Landroidx/work/impl/WorkDatabase;

    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->y()La/upv0;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->w()La/hpv0;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->z()La/zpv0;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->v()La/s9o0;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    iget-object p0, p0, La/cpv0;->b:La/wsd;

    .line 32
    .line 33
    iget-object p0, p0, La/wsd;->d:La/s2m0;

    .line 34
    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    const-wide/32 v6, 0x5265c00

    .line 40
    .line 41
    .line 42
    sub-long/2addr v4, v6

    .line 43
    iget-object p0, v1, La/upv0;->a:La/aeg0;

    .line 44
    .line 45
    new-instance v6, La/r2a0;

    .line 46
    .line 47
    const/16 v7, 0x16

    .line 48
    .line 49
    invoke-direct {v6, v7, v4, v5}, La/r2a0;-><init>(BJ)V

    .line 50
    .line 51
    .line 52
    const/4 v4, 0x1

    .line 53
    const/4 v5, 0x0

    .line 54
    invoke-static {p0, v4, v5, v6}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    check-cast p0, Ljava/util/List;

    .line 59
    .line 60
    iget-object v1, v1, La/upv0;->a:La/aeg0;

    .line 61
    .line 62
    new-instance v6, La/ejv0;

    .line 63
    .line 64
    const/16 v7, 0xe

    .line 65
    .line 66
    invoke-direct {v6, v7}, La/ejv0;-><init>(B)V

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v4, v5, v6}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    check-cast v6, Ljava/util/List;

    .line 74
    .line 75
    new-instance v7, La/ejv0;

    .line 76
    .line 77
    const/16 v8, 0xb

    .line 78
    .line 79
    invoke-direct {v7, v8}, La/ejv0;-><init>(B)V

    .line 80
    .line 81
    .line 82
    invoke-static {v1, v4, v5, v7}, La/kpb;->h0(La/aeg0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    check-cast v1, Ljava/util/List;

    .line 87
    .line 88
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    if-nez v4, :cond_0

    .line 93
    .line 94
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 95
    .line 96
    .line 97
    move-result-object v4

    .line 98
    sget-object v5, La/fik;->a:Ljava/lang/String;

    .line 99
    .line 100
    const-string v7, "Recently completed work:\n\n"

    .line 101
    .line 102
    invoke-virtual {v4, v5, v7}, La/wv00;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    invoke-static {v2, v3, v0, p0}, La/fik;->a(La/hpv0;La/zpv0;La/s9o0;Ljava/util/List;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {v4, v5, p0}, La/wv00;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    :cond_0
    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-nez p0, :cond_1

    .line 121
    .line 122
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    sget-object v4, La/fik;->a:Ljava/lang/String;

    .line 127
    .line 128
    const-string v5, "Running work:\n\n"

    .line 129
    .line 130
    invoke-virtual {p0, v4, v5}, La/wv00;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 134
    .line 135
    .line 136
    move-result-object p0

    .line 137
    invoke-static {v2, v3, v0, v6}, La/fik;->a(La/hpv0;La/zpv0;La/s9o0;Ljava/util/List;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    invoke-virtual {p0, v4, v5}, La/wv00;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_1
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 145
    .line 146
    .line 147
    move-result p0

    .line 148
    if-nez p0, :cond_2

    .line 149
    .line 150
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    sget-object v4, La/fik;->a:Ljava/lang/String;

    .line 155
    .line 156
    const-string v5, "Enqueued work:\n\n"

    .line 157
    .line 158
    invoke-virtual {p0, v4, v5}, La/wv00;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-static {}, La/wv00;->f()La/wv00;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-static {v2, v3, v0, v1}, La/fik;->a(La/hpv0;La/zpv0;La/s9o0;Ljava/util/List;)Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    invoke-virtual {p0, v4, v0}, La/wv00;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    :cond_2
    invoke-static {}, La/ng00;->a()La/mg00;

    .line 173
    .line 174
    .line 175
    move-result-object p0

    .line 176
    return-object p0
.end method
