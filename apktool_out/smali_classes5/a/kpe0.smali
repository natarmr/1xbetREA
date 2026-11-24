.class public final synthetic La/kpe0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ppe0;


# direct methods
.method public synthetic constructor <init>(La/ppe0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/kpe0;->a:B

    iput-object p1, p0, La/kpe0;->b:La/ppe0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/kpe0;->a:B

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    iget-object p0, p0, La/kpe0;->b:La/ppe0;

    .line 5
    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    sget-object v0, La/ppe0;->S1:La/zie0;

    .line 10
    .line 11
    invoke-virtual {p0}, La/ppe0;->H0()La/tpe0;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    iget-object v0, p0, La/tpe0;->i:La/p7m0;

    .line 16
    .line 17
    sget-object v2, La/vpe0;->b:La/vpe0;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1, v2}, La/p7m0;->o(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    new-instance v4, La/rpe0;

    .line 30
    .line 31
    const/4 v0, 0x0

    .line 32
    invoke-direct {v4, p0, v0}, La/rpe0;-><init>(La/tpe0;B)V

    .line 33
    .line 34
    .line 35
    new-instance v7, La/coc0;

    .line 36
    .line 37
    const/16 v0, 0xf

    .line 38
    .line 39
    invoke-direct {v7, p0, v1, v0}, La/coc0;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 40
    .line 41
    .line 42
    const/16 v8, 0xe

    .line 43
    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v6, 0x0

    .line 46
    invoke-static/range {v3 .. v8}, La/sac;->V(La/vne;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;I)La/bby;

    .line 47
    .line 48
    .line 49
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 50
    .line 51
    return-object p0

    .line 52
    :pswitch_0
    iget-object p0, p0, La/ppe0;->M1:La/fiu0;

    .line 53
    .line 54
    if-eqz p0, :cond_0

    .line 55
    .line 56
    return-object p0

    .line 57
    :cond_0
    const-string p0, "viewModelFactory"

    .line 58
    .line 59
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v1

    .line 63
    :pswitch_1
    sget-object v0, La/ppe0;->S1:La/zie0;

    .line 64
    .line 65
    invoke-virtual {p0}, La/ppe0;->H0()La/tpe0;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    iget-object p0, p0, La/tpe0;->f:La/pzu;

    .line 70
    .line 71
    invoke-virtual {p0}, La/pzu;->B()V

    .line 72
    .line 73
    .line 74
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 75
    .line 76
    return-object p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
