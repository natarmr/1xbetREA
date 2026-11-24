.class public final La/uzj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/s5k0;


# instance fields
.field public final synthetic a:B

.field public b:Z

.field public final c:La/s5k0;

.field public final d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(La/s5k0;Ljava/lang/Object;B)V
    .locals 0

    .line 1
    iput-byte p3, p0, La/uzj;->a:B

    iput-object p1, p0, La/uzj;->c:La/s5k0;

    iput-object p2, p0, La/uzj;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final F0(La/f99;J)V
    .locals 8

    .line 1
    iget-byte v0, p0, La/uzj;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/uzj;->d:Ljava/lang/Object;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-boolean v0, p0, La/uzj;->b:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1, p2, p3}, La/f99;->skip(J)V

    .line 13
    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    :try_start_0
    iget-object v0, p0, La/uzj;->c:La/s5k0;

    .line 17
    .line 18
    invoke-interface {v0, p1, p2, p3}, La/s5k0;->F0(La/f99;J)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception v0

    .line 23
    move-object p1, v0

    .line 24
    const/4 p2, 0x1

    .line 25
    iput-boolean p2, p0, La/uzj;->b:Z

    .line 26
    .line 27
    check-cast v1, La/e3j;

    .line 28
    .line 29
    invoke-virtual {v1, p1}, La/e3j;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    :goto_0
    return-void

    .line 33
    :pswitch_0
    check-cast v1, Ljava/util/zip/Deflater;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    iget-wide v2, p1, La/f99;->b:J

    .line 39
    .line 40
    const-wide/16 v4, 0x0

    .line 41
    .line 42
    move-wide v6, p2

    .line 43
    invoke-static/range {v2 .. v7}, La/cy2;->x(JJJ)V

    .line 44
    .line 45
    .line 46
    :goto_1
    const-wide/16 v2, 0x0

    .line 47
    .line 48
    cmp-long v0, p2, v2

    .line 49
    .line 50
    const/4 v2, 0x0

    .line 51
    if-lez v0, :cond_2

    .line 52
    .line 53
    iget-object v0, p1, La/f99;->a:La/uvh0;

    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    iget v3, v0, La/uvh0;->c:I

    .line 59
    .line 60
    iget v4, v0, La/uvh0;->b:I

    .line 61
    .line 62
    sub-int/2addr v3, v4

    .line 63
    int-to-long v3, v3

    .line 64
    invoke-static {p2, p3, v3, v4}, Ljava/lang/Math;->min(JJ)J

    .line 65
    .line 66
    .line 67
    move-result-wide v3

    .line 68
    long-to-int v3, v3

    .line 69
    iget-object v4, v0, La/uvh0;->a:[B

    .line 70
    .line 71
    iget v5, v0, La/uvh0;->b:I

    .line 72
    .line 73
    invoke-virtual {v1, v4, v5, v3}, Ljava/util/zip/Deflater;->setInput([BII)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v2}, La/uzj;->a(Z)V

    .line 77
    .line 78
    .line 79
    iget-wide v4, p1, La/f99;->b:J

    .line 80
    .line 81
    int-to-long v6, v3

    .line 82
    sub-long/2addr v4, v6

    .line 83
    iput-wide v4, p1, La/f99;->b:J

    .line 84
    .line 85
    iget v2, v0, La/uvh0;->b:I

    .line 86
    .line 87
    add-int/2addr v2, v3

    .line 88
    iput v2, v0, La/uvh0;->b:I

    .line 89
    .line 90
    iget v3, v0, La/uvh0;->c:I

    .line 91
    .line 92
    if-ne v2, v3, :cond_1

    .line 93
    .line 94
    invoke-virtual {v0}, La/uvh0;->a()La/uvh0;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    iput-object v2, p1, La/f99;->a:La/uvh0;

    .line 99
    .line 100
    invoke-static {v0}, La/mwh0;->a(La/uvh0;)V

    .line 101
    .line 102
    .line 103
    :cond_1
    sub-long/2addr p2, v6

    .line 104
    goto :goto_1

    .line 105
    :cond_2
    sget-object p0, La/ffb0;->e:[B

    .line 106
    .line 107
    invoke-virtual {v1, p0, v2, v2}, Ljava/util/zip/Deflater;->setInput([BII)V

    .line 108
    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public a(Z)V
    .locals 8

    .line 1
    iget-object v0, p0, La/uzj;->d:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/zip/Deflater;

    .line 4
    .line 5
    iget-object p0, p0, La/uzj;->c:La/s5k0;

    .line 6
    .line 7
    check-cast p0, La/yae0;

    .line 8
    .line 9
    iget-object v1, p0, La/yae0;->b:La/f99;

    .line 10
    .line 11
    :cond_0
    :goto_0
    const/4 v2, 0x1

    .line 12
    invoke-virtual {v1, v2}, La/f99;->S(I)La/uvh0;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    iget-object v3, v2, La/uvh0;->a:[B

    .line 17
    .line 18
    iget v4, v2, La/uvh0;->c:I

    .line 19
    .line 20
    const-string v5, "Deflater already closed"

    .line 21
    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    rsub-int v6, v4, 0x2000

    .line 25
    .line 26
    const/4 v7, 0x2

    .line 27
    :try_start_0
    invoke-virtual {v0, v3, v4, v6, v7}, Ljava/util/zip/Deflater;->deflate([BIII)I

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    goto :goto_1

    .line 32
    :catch_0
    move-exception p0

    .line 33
    goto :goto_2

    .line 34
    :catch_1
    move-exception p0

    .line 35
    goto :goto_3

    .line 36
    :cond_1
    rsub-int v6, v4, 0x2000

    .line 37
    .line 38
    invoke-virtual {v0, v3, v4, v6}, Ljava/util/zip/Deflater;->deflate([BII)I

    .line 39
    .line 40
    .line 41
    move-result v3
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 42
    :goto_1
    if-lez v3, :cond_2

    .line 43
    .line 44
    iget v4, v2, La/uvh0;->c:I

    .line 45
    .line 46
    add-int/2addr v4, v3

    .line 47
    iput v4, v2, La/uvh0;->c:I

    .line 48
    .line 49
    iget-wide v4, v1, La/f99;->b:J

    .line 50
    .line 51
    int-to-long v2, v3

    .line 52
    add-long/2addr v4, v2

    .line 53
    iput-wide v4, v1, La/f99;->b:J

    .line 54
    .line 55
    invoke-virtual {p0}, La/yae0;->a()La/t99;

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    invoke-virtual {v0}, Ljava/util/zip/Deflater;->needsInput()Z

    .line 60
    .line 61
    .line 62
    move-result v3

    .line 63
    if-eqz v3, :cond_0

    .line 64
    .line 65
    iget p0, v2, La/uvh0;->b:I

    .line 66
    .line 67
    iget p1, v2, La/uvh0;->c:I

    .line 68
    .line 69
    if-ne p0, p1, :cond_3

    .line 70
    .line 71
    invoke-virtual {v2}, La/uvh0;->a()La/uvh0;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    iput-object p0, v1, La/f99;->a:La/uvh0;

    .line 76
    .line 77
    invoke-static {v2}, La/mwh0;->a(La/uvh0;)V

    .line 78
    .line 79
    .line 80
    :cond_3
    return-void

    .line 81
    :goto_2
    invoke-static {v5, p0}, La/csj;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    return-void

    .line 85
    :goto_3
    invoke-static {v5, p0}, La/csj;->c(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 86
    .line 87
    .line 88
    return-void
.end method

.method public final close()V
    .locals 4

    .line 1
    iget-byte v0, p0, La/uzj;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/uzj;->d:Ljava/lang/Object;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    iget-object v3, p0, La/uzj;->c:La/s5k0;

    .line 7
    .line 8
    packed-switch v0, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-interface {v3}, La/s5k0;->close()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    goto :goto_0

    .line 15
    :catch_0
    move-exception v0

    .line 16
    iput-boolean v2, p0, La/uzj;->b:Z

    .line 17
    .line 18
    check-cast v1, La/e3j;

    .line 19
    .line 20
    invoke-virtual {v1, v0}, La/e3j;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :pswitch_0
    check-cast v1, Ljava/util/zip/Deflater;

    .line 25
    .line 26
    iget-boolean v0, p0, La/uzj;->b:Z

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    goto :goto_4

    .line 31
    :cond_0
    :try_start_1
    invoke-virtual {v1}, Ljava/util/zip/Deflater;->finish()V

    .line 32
    .line 33
    .line 34
    const/4 v0, 0x0

    .line 35
    invoke-virtual {p0, v0}, La/uzj;->a(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    .line 37
    .line 38
    const/4 v0, 0x0

    .line 39
    goto :goto_1

    .line 40
    :catchall_0
    move-exception v0

    .line 41
    :goto_1
    :try_start_2
    invoke-virtual {v1}, Ljava/util/zip/Deflater;->end()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 42
    .line 43
    .line 44
    goto :goto_2

    .line 45
    :catchall_1
    move-exception v1

    .line 46
    if-nez v0, :cond_1

    .line 47
    .line 48
    move-object v0, v1

    .line 49
    :cond_1
    :goto_2
    :try_start_3
    check-cast v3, La/yae0;

    .line 50
    .line 51
    invoke-virtual {v3}, La/yae0;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 52
    .line 53
    .line 54
    goto :goto_3

    .line 55
    :catchall_2
    move-exception v1

    .line 56
    if-nez v0, :cond_2

    .line 57
    .line 58
    move-object v0, v1

    .line 59
    :cond_2
    :goto_3
    iput-boolean v2, p0, La/uzj;->b:Z

    .line 60
    .line 61
    if-nez v0, :cond_3

    .line 62
    .line 63
    :goto_4
    return-void

    .line 64
    :cond_3
    throw v0

    .line 65
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final flush()V
    .locals 3

    .line 1
    iget-byte v0, p0, La/uzj;->a:B

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    iget-object v2, p0, La/uzj;->c:La/s5k0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    :try_start_0
    invoke-interface {v2}, La/s5k0;->flush()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    goto :goto_0

    .line 13
    :catch_0
    move-exception v0

    .line 14
    iput-boolean v1, p0, La/uzj;->b:Z

    .line 15
    .line 16
    iget-object p0, p0, La/uzj;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p0, La/e3j;

    .line 19
    .line 20
    invoke-virtual {p0, v0}, La/e3j;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    :goto_0
    return-void

    .line 24
    :pswitch_0
    invoke-virtual {p0, v1}, La/uzj;->a(Z)V

    .line 25
    .line 26
    .line 27
    check-cast v2, La/yae0;

    .line 28
    .line 29
    invoke-virtual {v2}, La/yae0;->flush()V

    .line 30
    .line 31
    .line 32
    return-void

    .line 33
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h()La/fmq0;
    .locals 1

    .line 1
    iget-byte v0, p0, La/uzj;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/uzj;->c:La/s5k0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, La/s5k0;->h()La/fmq0;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    return-object p0

    .line 13
    :pswitch_0
    check-cast p0, La/yae0;

    .line 14
    .line 15
    iget-object p0, p0, La/yae0;->a:La/s5k0;

    .line 16
    .line 17
    invoke-interface {p0}, La/s5k0;->h()La/fmq0;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-byte v0, p0, La/uzj;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v1, "DeflaterSink("

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, La/uzj;->c:La/s5k0;

    .line 19
    .line 20
    check-cast p0, La/yae0;

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const/16 p0, 0x29

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
