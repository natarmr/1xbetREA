.class public final synthetic La/vfc0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/yfc0;


# direct methods
.method public synthetic constructor <init>(La/yfc0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/vfc0;->a:B

    iput-object p1, p0, La/vfc0;->b:La/yfc0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/vfc0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/vfc0;->b:La/yfc0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/yfc0;->l2:La/xi70;

    .line 9
    .line 10
    new-instance v0, La/tfc0;

    .line 11
    .line 12
    new-instance v1, La/l8c0;

    .line 13
    .line 14
    iget-object p0, p0, La/yfc0;->h2:La/kiu0;

    .line 15
    .line 16
    invoke-virtual {p0}, La/kiu0;->getValue()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    move-object v3, p0

    .line 21
    check-cast v3, La/jhc0;

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const/16 v8, 0xf

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    const-class v4, La/jhc0;

    .line 28
    .line 29
    const-string v5, "onPromoCodeClicked"

    .line 30
    .line 31
    const-string v6, "onPromoCodeClicked(Ljava/lang/String;)V"

    .line 32
    .line 33
    invoke-direct/range {v1 .. v8}, La/l8c0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v0}, La/i26;-><init>()V

    .line 37
    .line 38
    .line 39
    iget-object p0, v0, La/i26;->e:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p0, La/dp;

    .line 42
    .line 43
    new-instance v2, La/t4c0;

    .line 44
    .line 45
    const/16 v3, 0x11

    .line 46
    .line 47
    invoke-direct {v2, v3}, La/t4c0;-><init>(B)V

    .line 48
    .line 49
    .line 50
    new-instance v3, La/ppb0;

    .line 51
    .line 52
    const/16 v4, 0xf

    .line 53
    .line 54
    invoke-direct {v3, v1, v4}, La/ppb0;-><init>(Ljava/lang/Object;B)V

    .line 55
    .line 56
    .line 57
    new-instance v1, La/o5c0;

    .line 58
    .line 59
    const/4 v4, 0x3

    .line 60
    const/16 v5, 0x9

    .line 61
    .line 62
    invoke-direct {v1, v4, v5}, La/o5c0;-><init>(IB)V

    .line 63
    .line 64
    .line 65
    sget-object v4, La/x4c0;->l:La/x4c0;

    .line 66
    .line 67
    new-instance v5, La/gbn;

    .line 68
    .line 69
    invoke-direct {v5, v2, v1, v3, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, v5}, La/dp;->b(La/gbn;)V

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :pswitch_0
    iget-object p0, p0, La/yfc0;->g2:La/fiu0;

    .line 77
    .line 78
    if-eqz p0, :cond_0

    .line 79
    .line 80
    return-object p0

    .line 81
    :cond_0
    const-string p0, "viewModelFactory"

    .line 82
    .line 83
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    const/4 p0, 0x0

    .line 87
    throw p0

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
