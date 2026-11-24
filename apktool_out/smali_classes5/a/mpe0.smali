.class public final synthetic La/mpe0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/k4r;


# instance fields
.field public final synthetic a:La/ppe0;


# direct methods
.method public synthetic constructor <init>(La/ppe0;)V
    .locals 0

    .line 1
    iput-object p1, p0, La/mpe0;->a:La/ppe0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public i(Landroid/os/Bundle;Ljava/lang/String;)V
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    sget-object v1, La/ppe0;->S1:La/zie0;

    .line 4
    .line 5
    invoke-virtual/range {p2 .. p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "RESULT_KEY_DATE_TIME_CALENDAR_REQUEST"

    .line 9
    .line 10
    move-object/from16 v2, p2

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    const-string v1, "RESULT_KEY_CALENDAR_START_SIMPLE_DATE"

    .line 20
    .line 21
    const-wide/16 v2, 0x0

    .line 22
    .line 23
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 24
    .line 25
    .line 26
    move-result-wide v6

    .line 27
    const-string v1, "RESULT_KEY_CALENDAR_END_SIMPLE_DATE"

    .line 28
    .line 29
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;J)J

    .line 30
    .line 31
    .line 32
    move-result-wide v8

    .line 33
    move-object/from16 v0, p0

    .line 34
    .line 35
    iget-object v0, v0, La/mpe0;->a:La/ppe0;

    .line 36
    .line 37
    invoke-virtual {v0}, La/ppe0;->H0()La/tpe0;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    iget-object v0, v5, La/tpe0;->j:La/p7m0;

    .line 42
    .line 43
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 44
    .line 45
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    invoke-virtual {v0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    iget-object v0, v5, La/tpe0;->i:La/p7m0;

    .line 53
    .line 54
    sget-object v1, La/vpe0;->b:La/vpe0;

    .line 55
    .line 56
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    invoke-static {v5}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 63
    .line 64
    .line 65
    move-result-object v0

    .line 66
    new-instance v11, La/rpe0;

    .line 67
    .line 68
    const/4 v1, 0x1

    .line 69
    invoke-direct {v11, v5, v1}, La/rpe0;-><init>(La/tpe0;B)V

    .line 70
    .line 71
    .line 72
    new-instance v14, La/upp;

    .line 73
    .line 74
    const/4 v10, 0x0

    .line 75
    move-object v4, v14

    .line 76
    invoke-direct/range {v4 .. v10}, La/upp;-><init>(La/tpe0;JJLa/yje;)V

    .line 77
    .line 78
    .line 79
    const/16 v15, 0xe

    .line 80
    .line 81
    const/4 v12, 0x0

    .line 82
    const/4 v13, 0x0

    .line 83
    move-object v10, v0

    .line 84
    invoke-static/range {v10 .. v15}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 85
    .line 86
    .line 87
    return-void
.end method
