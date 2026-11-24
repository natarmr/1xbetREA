.class public final synthetic La/eun0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pun0;


# direct methods
.method public synthetic constructor <init>(La/pun0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/eun0;->a:B

    iput-object p1, p0, La/eun0;->b:La/pun0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-byte v1, v0, La/eun0;->a:B

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v0, v0, La/eun0;->b:La/pun0;

    .line 7
    .line 8
    packed-switch v1, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    move-object/from16 v1, p1

    .line 12
    .line 13
    check-cast v1, Ljava/lang/Throwable;

    .line 14
    .line 15
    move-object/from16 v3, p2

    .line 16
    .line 17
    check-cast v3, Ljava/lang/String;

    .line 18
    .line 19
    invoke-static {v3, v1}, La/b1j;->z(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    .line 22
    iget-object v0, v0, La/pun0;->x:La/p7m0;

    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    sget-object v1, La/fun0;->a:La/fun0;

    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 33
    .line 34
    return-object v0

    .line 35
    :pswitch_0
    move-object/from16 v1, p1

    .line 36
    .line 37
    check-cast v1, Ljava/lang/Throwable;

    .line 38
    .line 39
    move-object/from16 v3, p2

    .line 40
    .line 41
    check-cast v3, Ljava/lang/String;

    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    iget-object v1, v0, La/pun0;->d:La/mne;

    .line 57
    .line 58
    iget-object v7, v1, La/mne;->a:La/rwj;

    .line 59
    .line 60
    new-instance v5, La/ndn0;

    .line 61
    .line 62
    iget-object v10, v0, La/pun0;->e:La/duj;

    .line 63
    .line 64
    const/4 v14, 0x0

    .line 65
    const/16 v15, 0x11

    .line 66
    .line 67
    const/4 v9, 0x1

    .line 68
    const-class v11, La/duj;

    .line 69
    .line 70
    const-string v12, "handleError"

    .line 71
    .line 72
    const-string v13, "handleError(Ljava/lang/Throwable;)V"

    .line 73
    .line 74
    move-object v8, v5

    .line 75
    invoke-direct/range {v8 .. v15}, La/ndn0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 76
    .line 77
    .line 78
    new-instance v8, La/ssl0;

    .line 79
    .line 80
    invoke-direct {v8, v0, v3, v2}, La/ssl0;-><init>(La/pun0;Ljava/lang/String;La/yje;)V

    .line 81
    .line 82
    .line 83
    const/16 v9, 0xa

    .line 84
    .line 85
    const/4 v6, 0x0

    .line 86
    invoke-static/range {v4 .. v9}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 87
    .line 88
    .line 89
    sget-object v0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 90
    .line 91
    return-object v0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
