.class public abstract La/vby;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final d:La/uby;


# instance fields
.field public final a:La/dcy;

.field public final b:La/qaj;

.field public final c:La/vqc;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    .line 1
    new-instance v0, La/uby;

    .line 2
    .line 3
    new-instance v1, La/dcy;

    .line 4
    .line 5
    sget-object v9, La/olc;->c:La/olc;

    .line 6
    .line 7
    const/4 v10, 0x1

    .line 8
    const/4 v2, 0x0

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    const-string v5, "    "

    .line 12
    .line 13
    const/4 v6, 0x0

    .line 14
    const-string v7, "type"

    .line 15
    .line 16
    const/4 v8, 0x1

    .line 17
    invoke-direct/range {v1 .. v10}, La/dcy;-><init>(ZZZLjava/lang/String;ZLjava/lang/String;ZLa/olc;Z)V

    .line 18
    .line 19
    .line 20
    sget-object v2, La/qhi0;->a:La/qaj;

    .line 21
    .line 22
    invoke-direct {v0, v1, v2}, La/vby;-><init>(La/dcy;La/qaj;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, La/vby;->d:La/uby;

    .line 26
    .line 27
    return-void
.end method

.method public constructor <init>(La/dcy;La/qaj;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/vby;->a:La/dcy;

    .line 5
    .line 6
    iput-object p2, p0, La/vby;->b:La/qaj;

    .line 7
    .line 8
    new-instance p1, La/vqc;

    .line 9
    .line 10
    const/16 p2, 0x19

    .line 11
    .line 12
    invoke-direct {p1, p2}, La/vqc;-><init>(B)V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, La/vby;->c:La/vqc;

    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final a(La/jiy;La/mcy;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of v0, p2, La/edy;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v0, La/ody;

    .line 13
    .line 14
    check-cast p2, La/edy;

    .line 15
    .line 16
    const/16 v2, 0xc

    .line 17
    .line 18
    invoke-direct {v0, p0, p2, v1, v2}, La/ody;-><init>(La/vby;La/edy;Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_0
    instance-of v0, p2, La/yby;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    new-instance v0, La/pdy;

    .line 27
    .line 28
    check-cast p2, La/yby;

    .line 29
    .line 30
    invoke-direct {v0, p0, p2}, La/pdy;-><init>(La/vby;La/yby;)V

    .line 31
    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    instance-of v0, p2, La/xcy;

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    sget-object v0, La/bdy;->INSTANCE:La/bdy;

    .line 39
    .line 40
    invoke-virtual {p2, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-static {}, La/t9f;->b()V

    .line 48
    .line 49
    .line 50
    return-object v1

    .line 51
    :cond_3
    :goto_0
    new-instance v0, La/kdy;

    .line 52
    .line 53
    check-cast p2, La/jdy;

    .line 54
    .line 55
    invoke-direct {v0, p0, p2, v1}, La/kdy;-><init>(La/vby;La/mcy;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :goto_1
    invoke-virtual {v0, p1}, La/t2;->w(La/jiy;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public final b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p2}, La/qsm0;->e(La/vby;Ljava/lang/String;)La/fp;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v0, La/xrm0;

    .line 12
    .line 13
    sget-object v2, La/jrv0;->c:La/jrv0;

    .line 14
    .line 15
    invoke-interface {p1}, La/jiy;->getDescriptor()La/ugi0;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v5, 0x0

    .line 20
    move-object v1, p0

    .line 21
    invoke-direct/range {v0 .. v5}, La/xrm0;-><init>(La/vby;La/jrv0;La/fp;La/ugi0;La/drq;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, La/xrm0;->w(La/jiy;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {v3}, La/fp;->h()B

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    const/16 p2, 0xa

    .line 33
    .line 34
    if-ne p1, p2, :cond_0

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_0
    new-instance p0, Ljava/lang/StringBuilder;

    .line 38
    .line 39
    const-string p1, "Expected EOF after parsing, but had "

    .line 40
    .line 41
    invoke-direct {p0, p1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    iget-object p1, v3, La/fp;->g:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast p1, Ljava/lang/String;

    .line 47
    .line 48
    iget p2, v3, La/fp;->b:I

    .line 49
    .line 50
    add-int/lit8 p2, p2, -0x1

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Ljava/lang/String;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result p1

    .line 56
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    const-string p1, " instead"

    .line 60
    .line 61
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    const/4 p1, 0x0

    .line 69
    const/4 p2, 0x6

    .line 70
    const/4 v0, 0x0

    .line 71
    invoke-static {v3, p0, p1, v0, p2}, La/fp;->t(La/fp;Ljava/lang/String;ILjava/lang/String;I)V

    .line 72
    .line 73
    .line 74
    throw v0
.end method

.method public final c(La/jiy;Ljava/lang/Object;)La/mcy;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/mie0;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, La/ldy;

    .line 10
    .line 11
    new-instance v2, La/cx2;

    .line 12
    .line 13
    const/16 v3, 0x9

    .line 14
    .line 15
    invoke-direct {v2, v0, v3}, La/cx2;-><init>(La/mie0;B)V

    .line 16
    .line 17
    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-direct {v1, p0, v2, v3}, La/ldy;-><init>(La/vby;Lkotlin/jvm/functions/Function1;B)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, p1, p2}, La/ldy;->C(La/jiy;Ljava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    iget-object p0, v0, La/mie0;->a:Ljava/lang/Object;

    .line 26
    .line 27
    if-eqz p0, :cond_0

    .line 28
    .line 29
    check-cast p0, La/mcy;

    .line 30
    .line 31
    return-object p0

    .line 32
    :cond_0
    const-string p0, "result"

    .line 33
    .line 34
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    const/4 p0, 0x0

    .line 38
    throw p0
.end method

.method public final d(La/jiy;Ljava/lang/Object;)Ljava/lang/String;
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/y78;

    .line 5
    .line 6
    const/4 v1, 0x6

    .line 7
    const/4 v2, 0x0

    .line 8
    invoke-direct {v0, v1, v2}, La/y78;-><init>(BZ)V

    .line 9
    .line 10
    .line 11
    sget-object v1, La/jub;->c:La/jub;

    .line 12
    .line 13
    monitor-enter v1

    .line 14
    :try_start_0
    iget-object v3, v1, La/jub;->a:La/xw3;

    .line 15
    .line 16
    invoke-virtual {v3}, La/xw3;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const/4 v5, 0x0

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    move-object v3, v5

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {v3}, La/xw3;->removeLast()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    :goto_0
    check-cast v3, [C

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    iget v4, v1, La/jub;->b:I

    .line 34
    .line 35
    array-length v5, v3

    .line 36
    sub-int/2addr v4, v5

    .line 37
    iput v4, v1, La/jub;->b:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    .line 39
    move-object v5, v3

    .line 40
    goto :goto_1

    .line 41
    :catchall_0
    move-exception p0

    .line 42
    goto :goto_2

    .line 43
    :cond_1
    :goto_1
    monitor-exit v1

    .line 44
    if-nez v5, :cond_2

    .line 45
    .line 46
    const/16 v1, 0x80

    .line 47
    .line 48
    new-array v5, v1, [C

    .line 49
    .line 50
    :cond_2
    iput-object v5, v0, La/y78;->c:Ljava/lang/Object;

    .line 51
    .line 52
    :try_start_1
    new-instance v1, La/yrm0;

    .line 53
    .line 54
    sget-object v3, La/jrv0;->c:La/jrv0;

    .line 55
    .line 56
    sget-object v4, La/jrv0;->h:La/c0o;

    .line 57
    .line 58
    invoke-virtual {v4}, La/c0o;->b()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    new-array v4, v4, [La/scy;

    .line 63
    .line 64
    new-instance v5, La/s88;

    .line 65
    .line 66
    const/4 v6, 0x5

    .line 67
    invoke-direct {v5, v0, v6, v2}, La/s88;-><init>(Ljava/lang/Object;BZ)V

    .line 68
    .line 69
    .line 70
    invoke-direct {v1, v5, p0, v3, v4}, La/yrm0;-><init>(La/s88;La/vby;La/jrv0;[La/scy;)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, p1, p2}, La/yrm0;->C(La/jiy;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, La/y78;->toString()Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 80
    invoke-virtual {v0}, La/y78;->u()V

    .line 81
    .line 82
    .line 83
    return-object p0

    .line 84
    :catchall_1
    move-exception p0

    .line 85
    invoke-virtual {v0}, La/y78;->u()V

    .line 86
    .line 87
    .line 88
    throw p0

    .line 89
    :goto_2
    monitor-exit v1

    .line 90
    throw p0
.end method

.method public final e(Ljava/lang/String;)La/mcy;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, La/qcy;->a:La/qcy;

    .line 5
    .line 6
    invoke-virtual {p0, v0, p1}, La/vby;->b(La/jiy;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    check-cast p0, La/mcy;

    .line 11
    .line 12
    return-object p0
.end method
