.class public final synthetic La/ehj;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/j5b0;


# direct methods
.method public synthetic constructor <init>(La/j5b0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ehj;->a:B

    iput-object p1, p0, La/ehj;->b:La/j5b0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/ehj;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ehj;->b:La/j5b0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/y4b0;->c:La/y4b0;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, La/j5b0;->x(La/y4b0;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    sget-object v0, La/y4b0;->a:La/y4b0;

    .line 17
    .line 18
    invoke-virtual {p0, v0}, La/j5b0;->x(La/y4b0;)V

    .line 19
    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_1
    iget-object p0, p0, La/j5b0;->l:La/pru;

    .line 25
    .line 26
    invoke-virtual {p0}, La/pru;->a()La/sff0;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0

    .line 31
    :pswitch_2
    iget-object p0, p0, La/j5b0;->h:La/iij;

    .line 32
    .line 33
    iget-object p0, p0, La/iij;->f:Ljava/lang/Object;

    .line 34
    .line 35
    check-cast p0, La/ouu;

    .line 36
    .line 37
    new-instance v0, La/xa50;

    .line 38
    .line 39
    invoke-direct {v0}, La/xa50;-><init>()V

    .line 40
    .line 41
    .line 42
    const/4 v1, 0x1

    .line 43
    invoke-virtual {p0, v0, v1}, La/ouu;->q(La/cb50;Z)V

    .line 44
    .line 45
    .line 46
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 47
    .line 48
    return-object p0

    .line 49
    :pswitch_3
    iget-object p0, p0, La/j5b0;->h:La/iij;

    .line 50
    .line 51
    invoke-virtual {p0}, La/eiu0;->s()La/diu0;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-static {v0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    iget-object v1, p0, La/iij;->e:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast v1, La/mne;

    .line 62
    .line 63
    iget-object v1, v1, La/mne;->b:La/dvj;

    .line 64
    .line 65
    new-instance v2, La/hij;

    .line 66
    .line 67
    const/4 v3, 0x0

    .line 68
    const/4 v4, 0x0

    .line 69
    invoke-direct {v2, p0, v4, v3}, La/hij;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 70
    .line 71
    .line 72
    const/4 p0, 0x2

    .line 73
    invoke-static {v0, v1, v4, v2, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 74
    .line 75
    .line 76
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 77
    .line 78
    return-object p0

    .line 79
    :pswitch_4
    invoke-virtual {p0}, La/j5b0;->y()V

    .line 80
    .line 81
    .line 82
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 83
    .line 84
    return-object p0

    .line 85
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
