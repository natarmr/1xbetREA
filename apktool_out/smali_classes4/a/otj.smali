.class public final La/otj;
.super La/lm40;
.source "SourceFile"

# interfaces
.implements La/ehl;


# instance fields
.field public final o:La/gy40;

.field public p:Z

.field public q:Z

.field public r:Z


# direct methods
.method public constructor <init>(La/gy40;)V
    .locals 0

    .line 1
    invoke-direct {p0}, La/lm40;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, La/otj;->o:La/gy40;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final R0()V
    .locals 4

    .line 1
    invoke-virtual {p0}, La/lm40;->N0()La/vne;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, La/hij;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-direct {v1, p0, v3, v2}, La/hij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 10
    .line 11
    .line 12
    const/4 p0, 0x3

    .line 13
    invoke-static {v0, v3, v3, v1, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 14
    .line 15
    .line 16
    return-void
.end method

.method public final u0(La/g7z;)V
    .locals 12

    .line 1
    invoke-virtual {p1}, La/g7z;->a()V

    .line 2
    .line 3
    .line 4
    iget-object v2, p1, La/g7z;->a:La/a6a;

    .line 5
    .line 6
    iget-boolean v3, p0, La/otj;->p:Z

    .line 7
    .line 8
    if-eqz v3, :cond_0

    .line 9
    .line 10
    sget-wide v3, La/y3d;->b:J

    .line 11
    .line 12
    const v0, 0x3e99999a    # 0.3f

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v3, v4}, La/y3d;->c(FJ)J

    .line 16
    .line 17
    .line 18
    move-result-wide v3

    .line 19
    invoke-interface {v2}, La/fhl;->d()J

    .line 20
    .line 21
    .line 22
    move-result-wide v5

    .line 23
    const/4 v10, 0x0

    .line 24
    const/16 v11, 0x7a

    .line 25
    .line 26
    move-wide v1, v3

    .line 27
    const-wide/16 v3, 0x0

    .line 28
    .line 29
    const/4 v7, 0x0

    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v9, 0x0

    .line 32
    move-object v0, p1

    .line 33
    invoke-static/range {v0 .. v11}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :cond_0
    iget-boolean v1, p0, La/otj;->q:Z

    .line 38
    .line 39
    if-nez v1, :cond_2

    .line 40
    .line 41
    iget-boolean v0, p0, La/otj;->r:Z

    .line 42
    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    return-void

    .line 47
    :cond_2
    :goto_0
    sget-wide v0, La/y3d;->b:J

    .line 48
    .line 49
    const v3, 0x3dcccccd    # 0.1f

    .line 50
    .line 51
    .line 52
    invoke-static {v3, v0, v1}, La/y3d;->c(FJ)J

    .line 53
    .line 54
    .line 55
    move-result-wide v0

    .line 56
    invoke-interface {v2}, La/fhl;->d()J

    .line 57
    .line 58
    .line 59
    move-result-wide v5

    .line 60
    const/4 v10, 0x0

    .line 61
    const/16 v11, 0x7a

    .line 62
    .line 63
    const-wide/16 v3, 0x0

    .line 64
    .line 65
    const/4 v7, 0x0

    .line 66
    const/4 v8, 0x0

    .line 67
    const/4 v9, 0x0

    .line 68
    move-wide v1, v0

    .line 69
    move-object v0, p1

    .line 70
    invoke-static/range {v0 .. v11}, La/fhl;->u(La/fhl;JJJFLa/vtm0;La/a4d;II)V

    .line 71
    .line 72
    .line 73
    return-void
.end method
