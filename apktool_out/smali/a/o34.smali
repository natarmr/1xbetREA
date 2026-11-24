.class public final La/o34;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La/k050;

.field public b:Landroid/media/AudioTrack;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, La/k050;

    .line 5
    .line 6
    invoke-direct {v0}, La/k050;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, La/o34;->a:La/k050;

    .line 10
    .line 11
    return-void
.end method


# virtual methods
.method public final a(La/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p1, La/l34;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/l34;

    .line 7
    .line 8
    iget v1, v0, La/l34;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/l34;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/l34;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/l34;-><init>(La/o34;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/l34;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/l34;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, La/l34;->i:La/k050;

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, La/o34;->a:La/k050;

    .line 53
    .line 54
    iput-object p1, v0, La/l34;->i:La/k050;

    .line 55
    .line 56
    iput v3, v0, La/l34;->l:I

    .line 57
    .line 58
    invoke-virtual {p1, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    move-object v0, p1

    .line 66
    :goto_1
    :try_start_0
    iget-object p1, p0, La/o34;->b:Landroid/media/AudioTrack;

    .line 67
    .line 68
    iput-object v4, p0, La/o34;->b:Landroid/media/AudioTrack;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    if-nez p1, :cond_4

    .line 71
    .line 72
    goto :goto_2

    .line 73
    :cond_4
    :try_start_1
    invoke-virtual {p1}, Landroid/media/AudioTrack;->stop()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 74
    .line 75
    .line 76
    :catch_0
    :try_start_2
    invoke-virtual {p1}, Landroid/media/AudioTrack;->release()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 77
    .line 78
    .line 79
    :catch_1
    :goto_2
    const/4 p1, 0x2

    .line 80
    const/16 v1, 0x1f40

    .line 81
    .line 82
    const/4 v2, 0x4

    .line 83
    :try_start_3
    invoke-static {v1, v2, p1}, Landroid/media/AudioTrack;->getMinBufferSize(III)I

    .line 84
    .line 85
    .line 86
    move-result v5
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 87
    const/16 v6, 0xf00

    .line 88
    .line 89
    if-ge v5, v6, :cond_5

    .line 90
    .line 91
    move v5, v6

    .line 92
    :cond_5
    :try_start_4
    new-instance v6, Landroid/media/AudioTrack$Builder;

    .line 93
    .line 94
    invoke-direct {v6}, Landroid/media/AudioTrack$Builder;-><init>()V

    .line 95
    .line 96
    .line 97
    new-instance v7, Landroid/media/AudioAttributes$Builder;

    .line 98
    .line 99
    invoke-direct {v7}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v7, p1}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    invoke-virtual {v7}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 107
    .line 108
    .line 109
    move-result-object v7

    .line 110
    invoke-virtual {v6, v7}, Landroid/media/AudioTrack$Builder;->setAudioAttributes(Landroid/media/AudioAttributes;)Landroid/media/AudioTrack$Builder;

    .line 111
    .line 112
    .line 113
    move-result-object v6

    .line 114
    new-instance v7, Landroid/media/AudioFormat$Builder;

    .line 115
    .line 116
    invoke-direct {v7}, Landroid/media/AudioFormat$Builder;-><init>()V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v7, p1}, Landroid/media/AudioFormat$Builder;->setEncoding(I)Landroid/media/AudioFormat$Builder;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-virtual {p1, v1}, Landroid/media/AudioFormat$Builder;->setSampleRate(I)Landroid/media/AudioFormat$Builder;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-virtual {p1, v2}, Landroid/media/AudioFormat$Builder;->setChannelMask(I)Landroid/media/AudioFormat$Builder;

    .line 128
    .line 129
    .line 130
    move-result-object p1

    .line 131
    invoke-virtual {p1}, Landroid/media/AudioFormat$Builder;->build()Landroid/media/AudioFormat;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    invoke-virtual {v6, p1}, Landroid/media/AudioTrack$Builder;->setAudioFormat(Landroid/media/AudioFormat;)Landroid/media/AudioTrack$Builder;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p1, v5}, Landroid/media/AudioTrack$Builder;->setBufferSizeInBytes(I)Landroid/media/AudioTrack$Builder;

    .line 140
    .line 141
    .line 142
    move-result-object p1

    .line 143
    invoke-virtual {p1, v3}, Landroid/media/AudioTrack$Builder;->setTransferMode(I)Landroid/media/AudioTrack$Builder;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    invoke-virtual {p1}, Landroid/media/AudioTrack$Builder;->build()Landroid/media/AudioTrack;

    .line 148
    .line 149
    .line 150
    move-result-object p1

    .line 151
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    const/16 v1, 0x280

    .line 155
    .line 156
    new-array v2, v1, [S

    .line 157
    .line 158
    const/4 v3, 0x0

    .line 159
    invoke-virtual {p1, v2, v3, v1}, Landroid/media/AudioTrack;->write([SII)I

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1}, Landroid/media/AudioTrack;->play()V

    .line 163
    .line 164
    .line 165
    iput-object p1, p0, La/o34;->b:Landroid/media/AudioTrack;
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 166
    .line 167
    goto :goto_3

    .line 168
    :catchall_0
    move-exception p0

    .line 169
    goto :goto_4

    .line 170
    :catch_2
    :goto_3
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 174
    .line 175
    return-object p0

    .line 176
    :goto_4
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    throw p0
.end method

.method public final b(La/zje;)Ljava/lang/Object;
    .locals 5

    .line 1
    instance-of v0, p1, La/m34;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, La/m34;

    .line 7
    .line 8
    iget v1, v0, La/m34;->l:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/m34;->l:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/m34;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, La/m34;-><init>(La/o34;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, La/m34;->j:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/m34;->l:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x0

    .line 33
    if-eqz v2, :cond_2

    .line 34
    .line 35
    if-ne v2, v3, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, La/m34;->i:La/k050;

    .line 38
    .line 39
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 44
    .line 45
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    return-object v4

    .line 49
    :cond_2
    invoke-static {p1}, La/z1x;->P(Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    iget-object p1, p0, La/o34;->a:La/k050;

    .line 53
    .line 54
    iput-object p1, v0, La/m34;->i:La/k050;

    .line 55
    .line 56
    iput v3, v0, La/m34;->l:I

    .line 57
    .line 58
    invoke-virtual {p1, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    if-ne v0, v1, :cond_3

    .line 63
    .line 64
    return-object v1

    .line 65
    :cond_3
    move-object v0, p1

    .line 66
    :goto_1
    :try_start_0
    iget-object p1, p0, La/o34;->b:Landroid/media/AudioTrack;

    .line 67
    .line 68
    iput-object v4, p0, La/o34;->b:Landroid/media/AudioTrack;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 69
    .line 70
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_4
    :try_start_1
    invoke-virtual {p1}, Landroid/media/AudioTrack;->stop()V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 77
    .line 78
    .line 79
    :catch_0
    :try_start_2
    invoke-virtual {p1}, Landroid/media/AudioTrack;->release()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 80
    .line 81
    .line 82
    :catch_1
    :goto_2
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :catchall_0
    move-exception p0

    .line 86
    invoke-interface {v0, v4}, La/i050;->c(Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    throw p0
.end method

.method public final c([SLa/zje;)Ljava/lang/Object;
    .locals 8

    .line 1
    instance-of v0, p2, La/n34;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p2

    .line 6
    check-cast v0, La/n34;

    .line 7
    .line 8
    iget v1, v0, La/n34;->o:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, La/n34;->o:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, La/n34;

    .line 21
    .line 22
    invoke-direct {v0, p0, p2}, La/n34;-><init>(La/o34;La/zje;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p2, v0, La/n34;->m:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, La/wne;->a:La/wne;

    .line 28
    .line 29
    iget v2, v0, La/n34;->o:I

    .line 30
    .line 31
    const/4 v3, 0x1

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x0

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    if-eq v2, v3, :cond_2

    .line 37
    .line 38
    if-ne v2, v4, :cond_1

    .line 39
    .line 40
    iget p1, v0, La/n34;->l:I

    .line 41
    .line 42
    iget v2, v0, La/n34;->k:I

    .line 43
    .line 44
    iget-object v6, v0, La/n34;->j:La/k050;

    .line 45
    .line 46
    check-cast v6, Landroid/media/AudioTrack;

    .line 47
    .line 48
    iget-object v6, v0, La/n34;->i:[S

    .line 49
    .line 50
    :try_start_0
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    move p2, p1

    .line 54
    move-object p1, v6

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 57
    .line 58
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 59
    .line 60
    .line 61
    return-object v5

    .line 62
    :cond_2
    iget p1, v0, La/n34;->l:I

    .line 63
    .line 64
    iget v2, v0, La/n34;->k:I

    .line 65
    .line 66
    iget-object v6, v0, La/n34;->j:La/k050;

    .line 67
    .line 68
    iget-object v7, v0, La/n34;->i:[S

    .line 69
    .line 70
    :try_start_1
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 71
    .line 72
    .line 73
    move p2, p1

    .line 74
    move-object p1, v7

    .line 75
    goto :goto_2

    .line 76
    :cond_3
    invoke-static {p2}, La/z1x;->P(Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    array-length p2, p1

    .line 80
    const/4 v2, 0x0

    .line 81
    :cond_4
    :goto_1
    if-lez p2, :cond_9

    .line 82
    .line 83
    :try_start_2
    iget-object v6, p0, La/o34;->a:La/k050;

    .line 84
    .line 85
    iput-object p1, v0, La/n34;->i:[S

    .line 86
    .line 87
    iput-object v6, v0, La/n34;->j:La/k050;

    .line 88
    .line 89
    iput v2, v0, La/n34;->k:I

    .line 90
    .line 91
    iput p2, v0, La/n34;->l:I

    .line 92
    .line 93
    iput v3, v0, La/n34;->o:I

    .line 94
    .line 95
    invoke-virtual {v6, v0}, La/k050;->d(La/yje;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v7
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 99
    if-ne v7, v1, :cond_5

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :cond_5
    :goto_2
    :try_start_3
    iget-object v7, p0, La/o34;->b:Landroid/media/AudioTrack;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 103
    .line 104
    :try_start_4
    invoke-interface {v6, v5}, La/i050;->c(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    if-nez v7, :cond_6

    .line 108
    .line 109
    new-instance p0, Ljava/lang/Integer;

    .line 110
    .line 111
    invoke-direct {p0, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 112
    .line 113
    .line 114
    return-object p0

    .line 115
    :cond_6
    invoke-virtual {v7, p1, v2, p2}, Landroid/media/AudioTrack;->write([SII)I

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-gez v6, :cond_7

    .line 120
    .line 121
    goto :goto_4

    .line 122
    :cond_7
    if-nez v6, :cond_8

    .line 123
    .line 124
    sget-object v6, La/wen;->b:La/uen;

    .line 125
    .line 126
    sget-object v6, La/bfn;->d:La/bfn;

    .line 127
    .line 128
    invoke-static {v4, v6}, La/ibc;->v0(ILa/bfn;)J

    .line 129
    .line 130
    .line 131
    move-result-wide v6

    .line 132
    iput-object p1, v0, La/n34;->i:[S

    .line 133
    .line 134
    iput-object v5, v0, La/n34;->j:La/k050;

    .line 135
    .line 136
    iput v2, v0, La/n34;->k:I

    .line 137
    .line 138
    iput p2, v0, La/n34;->l:I

    .line 139
    .line 140
    iput v4, v0, La/n34;->o:I

    .line 141
    .line 142
    invoke-static {v6, v7, v0}, La/qcc;->P(JLa/yje;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v6

    .line 146
    if-ne v6, v1, :cond_4

    .line 147
    .line 148
    :goto_3
    return-object v1

    .line 149
    :cond_8
    add-int/2addr v2, v6

    .line 150
    sub-int/2addr p2, v6

    .line 151
    goto :goto_1

    .line 152
    :catchall_0
    move-exception p0

    .line 153
    invoke-interface {v6, v5}, La/i050;->c(Ljava/lang/Object;)V

    .line 154
    .line 155
    .line 156
    throw p0

    .line 157
    :cond_9
    :goto_4
    new-instance p0, Ljava/lang/Integer;

    .line 158
    .line 159
    invoke-direct {p0, v2}, Ljava/lang/Integer;-><init>(I)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 160
    .line 161
    .line 162
    return-object p0

    .line 163
    :catch_0
    new-instance p0, Ljava/lang/Integer;

    .line 164
    .line 165
    invoke-direct {p0, v2}, Ljava/lang/Integer;-><init>(I)V

    .line 166
    .line 167
    .line 168
    return-object p0
.end method
