.class public final La/j3u0;
.super La/k3u0;
.source "SourceFile"


# instance fields
.field public final m:La/n0o0;


# direct methods
.method public constructor <init>(La/kp9;La/k3u0;ILa/g93;La/g950;La/wsy;ZZZLa/wsy;La/gmk0;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct/range {p0 .. p11}, La/k3u0;-><init>(La/kp9;La/k3u0;ILa/g93;La/g950;La/wsy;ZZZLa/wsy;La/gmk0;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p12}, La/maz;->b(Lkotlin/jvm/functions/Function0;)La/n0o0;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, La/j3u0;->m:La/n0o0;

    .line 18
    .line 19
    return-void
.end method


# virtual methods
.method public final p1(La/per;La/g950;I)La/k3u0;
    .locals 13

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, La/j3u0;

    .line 5
    .line 6
    invoke-virtual {p0}, La/p4;->getAnnotations()La/g93;

    .line 7
    .line 8
    .line 9
    move-result-object v4

    .line 10
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, La/s3u0;->getType()La/wsy;

    .line 14
    .line 15
    .line 16
    move-result-object v6

    .line 17
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, La/k3u0;->q1()Z

    .line 21
    .line 22
    .line 23
    move-result v7

    .line 24
    new-instance v12, La/cvs0;

    .line 25
    .line 26
    const/16 v1, 0x8

    .line 27
    .line 28
    invoke-direct {v12, p0, v1}, La/cvs0;-><init>(Ljava/lang/Object;B)V

    .line 29
    .line 30
    .line 31
    const/4 v2, 0x0

    .line 32
    iget-boolean v8, p0, La/k3u0;->i:Z

    .line 33
    .line 34
    iget-boolean v9, p0, La/k3u0;->j:Z

    .line 35
    .line 36
    iget-object v10, p0, La/k3u0;->k:La/wsy;

    .line 37
    .line 38
    sget-object v11, La/gmk0;->x0:La/gne0;

    .line 39
    .line 40
    move-object v1, p1

    .line 41
    move-object v5, p2

    .line 42
    move/from16 v3, p3

    .line 43
    .line 44
    invoke-direct/range {v0 .. v12}, La/j3u0;-><init>(La/kp9;La/k3u0;ILa/g93;La/g950;La/wsy;ZZZLa/wsy;La/gmk0;Lkotlin/jvm/functions/Function0;)V

    .line 45
    .line 46
    .line 47
    return-object v0
.end method
