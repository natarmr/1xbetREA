.class public final synthetic La/ni;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/pi;


# direct methods
.method public synthetic constructor <init>(La/pi;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ni;->a:B

    iput-object p1, p0, La/ni;->b:La/pi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ni;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ni;->b:La/pi;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/pi;->l2:La/rek0;

    .line 9
    .line 10
    new-instance v0, La/uh;

    .line 11
    .line 12
    new-instance v1, La/t0;

    .line 13
    .line 14
    iget-object p0, p0, La/pi;->i2:La/kiu0;

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
    check-cast v3, La/wj;

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const/16 v8, 0xc

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    const-class v4, La/wj;

    .line 28
    .line 29
    const-string v5, "onActionClicked"

    .line 30
    .line 31
    const-string v6, "onActionClicked(Lorg/xplatform/sportgame/action_menu/impl/presentation/adapter/ActionUiModel;)V"

    .line 32
    .line 33
    invoke-direct/range {v1 .. v8}, La/t0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 34
    .line 35
    .line 36
    sget-object p0, La/nk;->a:La/ek5;

    .line 37
    .line 38
    invoke-direct {v0, p0}, La/zz3;-><init>(La/dtb;)V

    .line 39
    .line 40
    .line 41
    new-instance p0, La/hhd;

    .line 42
    .line 43
    const/16 v2, 0x15

    .line 44
    .line 45
    invoke-direct {p0, v2}, La/hhd;-><init>(B)V

    .line 46
    .line 47
    .line 48
    new-instance v2, La/t1;

    .line 49
    .line 50
    const/16 v3, 0xb

    .line 51
    .line 52
    invoke-direct {v2, v1, v3}, La/t1;-><init>(Ljava/lang/Object;B)V

    .line 53
    .line 54
    .line 55
    new-instance v1, La/l9;

    .line 56
    .line 57
    const/4 v3, 0x3

    .line 58
    const/16 v4, 0xd

    .line 59
    .line 60
    invoke-direct {v1, v3, v4}, La/l9;-><init>(IB)V

    .line 61
    .line 62
    .line 63
    sget-object v3, La/m9;->o:La/m9;

    .line 64
    .line 65
    new-instance v4, La/gbn;

    .line 66
    .line 67
    invoke-direct {v4, p0, v1, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 68
    .line 69
    .line 70
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 71
    .line 72
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 73
    .line 74
    .line 75
    return-object v0

    .line 76
    :pswitch_0
    sget-object v0, La/pi;->l2:La/rek0;

    .line 77
    .line 78
    iget-object p0, p0, La/pi;->h2:La/fiu0;

    .line 79
    .line 80
    if-eqz p0, :cond_0

    .line 81
    .line 82
    return-object p0

    .line 83
    :cond_0
    const-string p0, "viewModelFactory"

    .line 84
    .line 85
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 86
    .line 87
    .line 88
    const/4 p0, 0x0

    .line 89
    throw p0

    .line 90
    :pswitch_1
    sget-object v0, La/pi;->l2:La/rek0;

    .line 91
    .line 92
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    return-object p0

    .line 104
    nop

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
