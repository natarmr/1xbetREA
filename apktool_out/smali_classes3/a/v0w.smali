.class public final La/v0w;
.super La/w46;
.source "SourceFile"


# instance fields
.field public final b:Z

.field public final c:Z

.field public final d:La/p7m0;


# direct methods
.method public constructor <init>(La/jru;La/mne;ZZLa/duj;)V
    .locals 11

    .line 1
    invoke-direct {p0}, La/w46;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, La/v0w;->b:Z

    .line 5
    .line 6
    iput-boolean p4, p0, La/v0w;->c:Z

    .line 7
    .line 8
    sget-object v1, La/iun;->a:La/iun;

    .line 9
    .line 10
    invoke-static {v1}, La/q7m0;->a(Ljava/lang/Object;)La/p7m0;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iput-object v1, p0, La/v0w;->d:La/p7m0;

    .line 15
    .line 16
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    iget-object v2, p2, La/mne;->b:La/dvj;

    .line 21
    .line 22
    new-instance v3, La/vft;

    .line 23
    .line 24
    const/4 v9, 0x0

    .line 25
    const/16 v10, 0x16

    .line 26
    .line 27
    const/4 v4, 0x1

    .line 28
    const-class v6, La/duj;

    .line 29
    .line 30
    const-string v7, "handleError"

    .line 31
    .line 32
    const-string v8, "handleError(Ljava/lang/Throwable;)V"

    .line 33
    .line 34
    move-object/from16 v5, p5

    .line 35
    .line 36
    invoke-direct/range {v3 .. v10}, La/vft;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 37
    .line 38
    .line 39
    new-instance v4, La/j0s;

    .line 40
    .line 41
    const/4 v5, 0x0

    .line 42
    const/16 v6, 0x1a

    .line 43
    .line 44
    invoke-direct {v4, p1, p0, v5, v6}, La/j0s;-><init>(Ljava/lang/Object;Ljava/lang/Object;La/yje;B)V

    .line 45
    .line 46
    .line 47
    const/16 v0, 0xa

    .line 48
    .line 49
    move/from16 p5, v0

    .line 50
    .line 51
    move-object p0, v1

    .line 52
    move-object p3, v2

    .line 53
    move-object p1, v3

    .line 54
    move-object p4, v4

    .line 55
    move-object p2, v5

    .line 56
    invoke-static/range {p0 .. p5}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 57
    .line 58
    .line 59
    return-void
.end method
