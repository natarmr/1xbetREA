.class public final La/zhl;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:La/vn30;

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CopyOnWriteArrayList;ILa/vn30;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/zhl;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    iput p2, p0, La/zhl;->a:I

    iput-object p3, p0, La/zhl;->b:La/vn30;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(La/rbe;)V
    .locals 4

    .line 1
    iget-object p0, p0, La/zhl;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, La/ao30;

    .line 18
    .line 19
    iget-object v1, v0, La/ao30;->b:La/bo30;

    .line 20
    .line 21
    iget-object v0, v0, La/ao30;->a:Landroid/os/Handler;

    .line 22
    .line 23
    new-instance v2, La/llo;

    .line 24
    .line 25
    const/16 v3, 0x18

    .line 26
    .line 27
    invoke-direct {v2, p1, v1, v3}, La/llo;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v2}, La/vtt0;->Q(Landroid/os/Handler;Ljava/lang/Runnable;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    return-void
.end method

.method public b(La/wn00;IILandroidx/media3/common/b;ILjava/lang/Object;JJ)V
    .locals 10

    .line 1
    new-instance v0, La/in30;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, La/vtt0;->Y(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, La/vtt0;->Y(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move v1, p2

    .line 12
    move v2, p3

    .line 13
    move-object v3, p4

    .line 14
    move v4, p5

    .line 15
    move-object/from16 v5, p6

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, La/in30;-><init>(IILandroidx/media3/common/b;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    new-instance p2, La/yn30;

    .line 21
    .line 22
    const/4 p3, 0x1

    .line 23
    invoke-direct {p2, p0, p1, v0, p3}, La/yn30;-><init>(La/zhl;La/wn00;La/in30;B)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p2}, La/zhl;->a(La/rbe;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public c(La/wn00;IILandroidx/media3/common/b;ILjava/lang/Object;JJ)V
    .locals 10

    .line 1
    new-instance v0, La/in30;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, La/vtt0;->Y(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, La/vtt0;->Y(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move v1, p2

    .line 12
    move v2, p3

    .line 13
    move-object v3, p4

    .line 14
    move v4, p5

    .line 15
    move-object/from16 v5, p6

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, La/in30;-><init>(IILandroidx/media3/common/b;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    new-instance p2, La/yn30;

    .line 21
    .line 22
    const/4 p3, 0x0

    .line 23
    invoke-direct {p2, p0, p1, v0, p3}, La/yn30;-><init>(La/zhl;La/wn00;La/in30;B)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p2}, La/zhl;->a(La/rbe;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public d(La/wn00;IILandroidx/media3/common/b;ILjava/lang/Object;JJLjava/io/IOException;Z)V
    .locals 10

    .line 1
    new-instance v0, La/in30;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, La/vtt0;->Y(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, La/vtt0;->Y(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move v1, p2

    .line 12
    move v2, p3

    .line 13
    move-object v3, p4

    .line 14
    move v4, p5

    .line 15
    move-object/from16 v5, p6

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, La/in30;-><init>(IILandroidx/media3/common/b;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    move-object p5, v0

    .line 21
    new-instance p2, La/zn30;

    .line 22
    .line 23
    move-object p3, p0

    .line 24
    move-object p4, p1

    .line 25
    move-object/from16 p6, p11

    .line 26
    .line 27
    move/from16 p7, p12

    .line 28
    .line 29
    invoke-direct/range {p2 .. p7}, La/zn30;-><init>(La/zhl;La/wn00;La/in30;Ljava/io/IOException;Z)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, p2}, La/zhl;->a(La/rbe;)V

    .line 33
    .line 34
    .line 35
    return-void
.end method

.method public e(La/wn00;ILjava/io/IOException;Z)V
    .locals 13

    .line 1
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    const/4 v3, -0x1

    .line 12
    const/4 v4, 0x0

    .line 13
    const/4 v5, 0x0

    .line 14
    const/4 v6, 0x0

    .line 15
    move-object v0, p0

    .line 16
    move-object v1, p1

    .line 17
    move v2, p2

    .line 18
    move-object/from16 v11, p3

    .line 19
    .line 20
    move/from16 v12, p4

    .line 21
    .line 22
    invoke-virtual/range {v0 .. v12}, La/zhl;->d(La/wn00;IILandroidx/media3/common/b;ILjava/lang/Object;JJLjava/io/IOException;Z)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public f(La/wn00;IILandroidx/media3/common/b;ILjava/lang/Object;JJI)V
    .locals 10

    .line 1
    new-instance v0, La/in30;

    .line 2
    .line 3
    invoke-static/range {p7 .. p8}, La/vtt0;->Y(J)J

    .line 4
    .line 5
    .line 6
    move-result-wide v6

    .line 7
    invoke-static/range {p9 .. p10}, La/vtt0;->Y(J)J

    .line 8
    .line 9
    .line 10
    move-result-wide v8

    .line 11
    move v1, p2

    .line 12
    move v2, p3

    .line 13
    move-object v3, p4

    .line 14
    move v4, p5

    .line 15
    move-object/from16 v5, p6

    .line 16
    .line 17
    invoke-direct/range {v0 .. v9}, La/in30;-><init>(IILandroidx/media3/common/b;ILjava/lang/Object;JJ)V

    .line 18
    .line 19
    .line 20
    new-instance p2, La/xn30;

    .line 21
    .line 22
    move/from16 p3, p11

    .line 23
    .line 24
    invoke-direct {p2, p0, p1, v0, p3}, La/xn30;-><init>(La/zhl;La/wn00;La/in30;I)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, p2}, La/zhl;->a(La/rbe;)V

    .line 28
    .line 29
    .line 30
    return-void
.end method
