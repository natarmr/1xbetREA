.class public final synthetic La/zae;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/dbe;


# direct methods
.method public synthetic constructor <init>(La/dbe;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zae;->a:B

    iput-object p1, p0, La/zae;->b:La/dbe;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-byte p1, p0, La/zae;->a:B

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object p0, p0, La/zae;->b:La/dbe;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p1, La/dbe;->k2:La/kud;

    .line 11
    .line 12
    invoke-virtual {p0}, La/dbe;->U0()La/ibe;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-static {p0}, La/jiu0;->a(La/diu0;)La/bvc;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-instance v0, La/igb;

    .line 21
    .line 22
    const/16 v2, 0xa

    .line 23
    .line 24
    invoke-direct {v0, p0, v1, v2}, La/igb;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x3

    .line 28
    invoke-static {p1, v1, v1, v0, p0}, La/qjj;->W(La/vne;Lkotlin/coroutines/CoroutineContext;La/yne;Lkotlin/jvm/functions/Function2;I)La/c4m0;

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_0
    sget-object p1, La/dbe;->k2:La/kud;

    .line 33
    .line 34
    invoke-virtual {p0}, La/dbe;->U0()La/ibe;

    .line 35
    .line 36
    .line 37
    move-result-object p0

    .line 38
    sget-object p1, La/vsf0;->c:La/vsf0;

    .line 39
    .line 40
    iget-object v2, p0, La/ibe;->b:La/p7m0;

    .line 41
    .line 42
    :cond_0
    invoke-virtual {v2}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    move-object v3, p0

    .line 47
    check-cast v3, La/hbe;

    .line 48
    .line 49
    invoke-static {v3, p1, v1, v0}, La/hbe;->a(La/hbe;La/vsf0;La/h9e0;I)La/hbe;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-virtual {v2, p0, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-eqz p0, :cond_0

    .line 58
    .line 59
    return-void

    .line 60
    :pswitch_1
    sget-object p1, La/dbe;->k2:La/kud;

    .line 61
    .line 62
    invoke-virtual {p0}, La/dbe;->U0()La/ibe;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    sget-object p1, La/vsf0;->b:La/vsf0;

    .line 67
    .line 68
    iget-object p0, p0, La/ibe;->b:La/p7m0;

    .line 69
    .line 70
    :cond_1
    invoke-virtual {p0}, La/p7m0;->getValue()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    move-object v3, v2

    .line 75
    check-cast v3, La/hbe;

    .line 76
    .line 77
    invoke-static {v3, p1, v1, v0}, La/hbe;->a(La/hbe;La/vsf0;La/h9e0;I)La/hbe;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-virtual {p0, v2, v3}, La/p7m0;->m(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_1

    .line 86
    .line 87
    return-void

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
