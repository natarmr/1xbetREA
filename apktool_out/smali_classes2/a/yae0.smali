.class public final La/yae0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/t99;


# instance fields
.field public final a:La/s5k0;

.field public final b:La/f99;

.field public c:Z


# direct methods
.method public constructor <init>(La/s5k0;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, La/yae0;->a:La/s5k0;

    .line 8
    .line 9
    new-instance p1, La/f99;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, La/yae0;->b:La/f99;

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final B([BI)La/t99;
    .locals 1

    .line 1
    iget-boolean v0, p0, La/yae0;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, La/yae0;->b:La/f99;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, La/f99;->U([BI)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/yae0;->a()La/t99;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "closed"

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final D(Ljava/lang/String;)La/t99;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/yae0;->c:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, La/yae0;->b:La/f99;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, La/f99;->c0(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/yae0;->a()La/t99;

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const-string p0, "closed"

    .line 18
    .line 19
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public final F0(La/f99;J)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/yae0;->c:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, La/yae0;->b:La/f99;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2, p3}, La/f99;->F0(La/f99;J)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/yae0;->a()La/t99;

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :cond_0
    const-string p0, "closed"

    .line 18
    .line 19
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-void
.end method

.method public final I0(J)La/t99;
    .locals 1

    .line 1
    iget-boolean v0, p0, La/yae0;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, La/yae0;->b:La/f99;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, La/f99;->X(J)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/yae0;->a()La/t99;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "closed"

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final N0(La/qg9;)La/t99;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/yae0;->c:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, La/yae0;->b:La/f99;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, La/f99;->T(La/qg9;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/yae0;->a()La/t99;

    .line 14
    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_0
    const-string p0, "closed"

    .line 18
    .line 19
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    return-object p0
.end method

.method public final P(La/emk0;)J
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    const-wide/16 v0, 0x0

    .line 5
    .line 6
    :goto_0
    iget-object v2, p0, La/yae0;->b:La/f99;

    .line 7
    .line 8
    const-wide/16 v3, 0x2000

    .line 9
    .line 10
    invoke-interface {p1, v2, v3, v4}, La/emk0;->Y(La/f99;J)J

    .line 11
    .line 12
    .line 13
    move-result-wide v2

    .line 14
    const-wide/16 v4, -0x1

    .line 15
    .line 16
    cmp-long v4, v2, v4

    .line 17
    .line 18
    if-eqz v4, :cond_0

    .line 19
    .line 20
    add-long/2addr v0, v2

    .line 21
    invoke-virtual {p0}, La/yae0;->a()La/t99;

    .line 22
    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-wide v0
.end method

.method public final a()La/t99;
    .locals 5

    .line 1
    iget-boolean v0, p0, La/yae0;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La/yae0;->b:La/f99;

    .line 6
    .line 7
    invoke-virtual {v0}, La/f99;->c()J

    .line 8
    .line 9
    .line 10
    move-result-wide v1

    .line 11
    const-wide/16 v3, 0x0

    .line 12
    .line 13
    cmp-long v3, v1, v3

    .line 14
    .line 15
    if-lez v3, :cond_0

    .line 16
    .line 17
    iget-object v3, p0, La/yae0;->a:La/s5k0;

    .line 18
    .line 19
    invoke-interface {v3, v0, v1, v2}, La/s5k0;->F0(La/f99;J)V

    .line 20
    .line 21
    .line 22
    :cond_0
    return-object p0

    .line 23
    :cond_1
    const-string p0, "closed"

    .line 24
    .line 25
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const/4 p0, 0x0

    .line 29
    return-object p0
.end method

.method public final close()V
    .locals 6

    .line 1
    iget-object v0, p0, La/yae0;->a:La/s5k0;

    .line 2
    .line 3
    iget-boolean v1, p0, La/yae0;->c:Z

    .line 4
    .line 5
    if-nez v1, :cond_3

    .line 6
    .line 7
    :try_start_0
    iget-object v1, p0, La/yae0;->b:La/f99;

    .line 8
    .line 9
    iget-wide v2, v1, La/f99;->b:J

    .line 10
    .line 11
    const-wide/16 v4, 0x0

    .line 12
    .line 13
    cmp-long v4, v2, v4

    .line 14
    .line 15
    if-lez v4, :cond_0

    .line 16
    .line 17
    invoke-interface {v0, v1, v2, v3}, La/s5k0;->F0(La/f99;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    goto :goto_1

    .line 23
    :cond_0
    :goto_0
    const/4 v1, 0x0

    .line 24
    :goto_1
    :try_start_1
    invoke-interface {v0}, La/s5k0;->close()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 25
    .line 26
    .line 27
    goto :goto_2

    .line 28
    :catchall_1
    move-exception v0

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    move-object v1, v0

    .line 32
    :cond_1
    :goto_2
    const/4 v0, 0x1

    .line 33
    iput-boolean v0, p0, La/yae0;->c:Z

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    goto :goto_3

    .line 38
    :cond_2
    throw v1

    .line 39
    :cond_3
    :goto_3
    return-void
.end method

.method public final flush()V
    .locals 5

    .line 1
    iget-boolean v0, p0, La/yae0;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, La/yae0;->b:La/f99;

    .line 6
    .line 7
    iget-wide v1, v0, La/f99;->b:J

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    cmp-long v3, v1, v3

    .line 12
    .line 13
    iget-object p0, p0, La/yae0;->a:La/s5k0;

    .line 14
    .line 15
    if-lez v3, :cond_0

    .line 16
    .line 17
    invoke-interface {p0, v0, v1, v2}, La/s5k0;->F0(La/f99;J)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-interface {p0}, La/s5k0;->flush()V

    .line 21
    .line 22
    .line 23
    return-void

    .line 24
    :cond_1
    const-string p0, "closed"

    .line 25
    .line 26
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final g()La/f99;
    .locals 0

    .line 1
    iget-object p0, p0, La/yae0;->b:La/f99;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h()La/fmq0;
    .locals 0

    .line 1
    iget-object p0, p0, La/yae0;->a:La/s5k0;

    .line 2
    .line 3
    invoke-interface {p0}, La/s5k0;->h()La/fmq0;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final i0(J)La/t99;
    .locals 1

    .line 1
    iget-boolean v0, p0, La/yae0;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, La/yae0;->b:La/f99;

    .line 6
    .line 7
    invoke-virtual {v0, p1, p2}, La/f99;->W(J)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/yae0;->a()La/t99;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "closed"

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final isOpen()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, La/yae0;->c:Z

    .line 2
    .line 3
    xor-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "buffer("

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, La/yae0;->a:La/s5k0;

    .line 9
    .line 10
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const/16 p0, 0x29

    .line 14
    .line 15
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public final write(Ljava/nio/ByteBuffer;)I
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    iget-boolean v0, p0, La/yae0;->c:Z

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iget-object v0, p0, La/yae0;->b:La/f99;

    .line 9
    .line 10
    invoke-virtual {v0, p1}, La/f99;->write(Ljava/nio/ByteBuffer;)I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-virtual {p0}, La/yae0;->a()La/t99;

    .line 15
    .line 16
    .line 17
    return p1

    .line 18
    :cond_0
    const-string p0, "closed"

    .line 19
    .line 20
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 p0, 0x0

    .line 24
    return p0
.end method

.method public final write([B)La/t99;
    .locals 2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    iget-boolean v0, p0, La/yae0;->c:Z

    if-nez v0, :cond_0

    .line 26
    iget-object v0, p0, La/yae0;->b:La/f99;

    .line 27
    array-length v1, p1

    invoke-virtual {v0, p1, v1}, La/f99;->U([BI)V

    .line 28
    invoke-virtual {p0}, La/yae0;->a()La/t99;

    return-object p0

    .line 29
    :cond_0
    const-string p0, "closed"

    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    const/4 p0, 0x0

    return-object p0
.end method

.method public final writeByte(I)La/t99;
    .locals 1

    .line 1
    iget-boolean v0, p0, La/yae0;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, La/yae0;->b:La/f99;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, La/f99;->V(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/yae0;->a()La/t99;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "closed"

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final writeInt(I)La/t99;
    .locals 1

    .line 1
    iget-boolean v0, p0, La/yae0;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, La/yae0;->b:La/f99;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, La/f99;->Z(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/yae0;->a()La/t99;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "closed"

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method

.method public final writeShort(I)La/t99;
    .locals 1

    .line 1
    iget-boolean v0, p0, La/yae0;->c:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object v0, p0, La/yae0;->b:La/f99;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, La/f99;->a0(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, La/yae0;->a()La/t99;

    .line 11
    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string p0, "closed"

    .line 15
    .line 16
    invoke-static {p0}, La/jf4;->n(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return-object p0
.end method
