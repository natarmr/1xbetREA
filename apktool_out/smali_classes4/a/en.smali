.class public final synthetic La/en;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/vne;

.field public final synthetic c:Lkotlin/jvm/functions/Function1;

.field public final synthetic d:La/pz40;

.field public final synthetic e:La/xcz;


# direct methods
.method public synthetic constructor <init>(La/vne;Lkotlin/jvm/functions/Function1;La/pz40;La/xcz;B)V
    .locals 0

    .line 2
    iput-byte p5, p0, La/en;->a:B

    iput-object p1, p0, La/en;->b:La/vne;

    iput-object p2, p0, La/en;->c:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, La/en;->d:La/pz40;

    iput-object p4, p0, La/en;->e:La/xcz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;La/vne;La/pz40;La/xcz;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    iput-byte v0, p0, La/en;->a:B

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La/en;->c:Lkotlin/jvm/functions/Function1;

    iput-object p2, p0, La/en;->b:La/vne;

    iput-object p3, p0, La/en;->d:La/pz40;

    iput-object p4, p0, La/en;->e:La/xcz;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget-byte v0, p0, La/en;->a:B

    .line 2
    .line 3
    const/4 v1, 0x3

    .line 4
    iget-object v2, p0, La/en;->c:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    iget-object v3, p0, La/en;->b:La/vne;

    .line 7
    .line 8
    move-object v6, p1

    .line 9
    check-cast v6, Ljava/lang/String;

    .line 10
    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    new-instance v4, La/in;

    .line 18
    .line 19
    const/4 v9, 0x2

    .line 20
    iget-object v5, p0, La/en;->d:La/pz40;

    .line 21
    .line 22
    iget-object v7, p0, La/en;->e:La/xcz;

    .line 23
    .line 24
    const/4 v8, 0x0

    .line 25
    invoke-direct/range {v4 .. v9}, La/in;-><init>(La/pz40;Ljava/lang/String;La/xcz;La/yje;B)V

    .line 26
    .line 27
    .line 28
    invoke-static {v3, v8, v8, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 29
    .line 30
    .line 31
    invoke-interface {v2, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_0
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    new-instance v4, La/in;

    .line 41
    .line 42
    const/4 v9, 0x1

    .line 43
    iget-object v5, p0, La/en;->d:La/pz40;

    .line 44
    .line 45
    iget-object v7, p0, La/en;->e:La/xcz;

    .line 46
    .line 47
    const/4 v8, 0x0

    .line 48
    invoke-direct/range {v4 .. v9}, La/in;-><init>(La/pz40;Ljava/lang/String;La/xcz;La/yje;B)V

    .line 49
    .line 50
    .line 51
    invoke-static {v3, v8, v8, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 52
    .line 53
    .line 54
    invoke-interface {v2, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_1
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    new-instance p1, La/pm;

    .line 64
    .line 65
    invoke-direct {p1, v6}, La/pm;-><init>(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-interface {v2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 69
    .line 70
    .line 71
    new-instance v4, La/in;

    .line 72
    .line 73
    const/4 v9, 0x0

    .line 74
    iget-object v5, p0, La/en;->d:La/pz40;

    .line 75
    .line 76
    iget-object v7, p0, La/en;->e:La/xcz;

    .line 77
    .line 78
    const/4 v8, 0x0

    .line 79
    invoke-direct/range {v4 .. v9}, La/in;-><init>(La/pz40;Ljava/lang/String;La/xcz;La/yje;B)V

    .line 80
    .line 81
    .line 82
    invoke-static {v3, v8, v8, v4, v1}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 83
    .line 84
    .line 85
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 86
    .line 87
    return-object p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
