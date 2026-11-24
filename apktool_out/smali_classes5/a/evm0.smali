.class public final synthetic La/evm0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/hvm0;


# direct methods
.method public synthetic constructor <init>(La/hvm0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/evm0;->a:B

    iput-object p1, p0, La/evm0;->b:La/hvm0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/evm0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/evm0;->b:La/hvm0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/hvm0;->j2:La/y2m0;

    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->n0()La/kxq;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->getApplication()Landroid/app/Application;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    new-instance v0, La/fxm0;

    .line 23
    .line 24
    iget-object p0, p0, La/hvm0;->h2:La/j1l0;

    .line 25
    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    sget-object v1, La/fxm0;->f:La/pn20;

    .line 30
    .line 31
    invoke-direct {v0, v1}, La/zz3;-><init>(La/dtb;)V

    .line 32
    .line 33
    .line 34
    new-instance v1, La/acm0;

    .line 35
    .line 36
    const/4 v2, 0x2

    .line 37
    invoke-direct {v1, v2}, La/acm0;-><init>(B)V

    .line 38
    .line 39
    .line 40
    new-instance v2, La/zbm0;

    .line 41
    .line 42
    const/4 v3, 0x7

    .line 43
    invoke-direct {v2, p0, v3}, La/zbm0;-><init>(Lkotlin/jvm/functions/Function1;B)V

    .line 44
    .line 45
    .line 46
    new-instance p0, La/asj0;

    .line 47
    .line 48
    const/4 v3, 0x3

    .line 49
    const/16 v4, 0xc

    .line 50
    .line 51
    invoke-direct {p0, v3, v4}, La/asj0;-><init>(IB)V

    .line 52
    .line 53
    .line 54
    sget-object v3, La/wjj0;->s:La/wjj0;

    .line 55
    .line 56
    new-instance v4, La/gbn;

    .line 57
    .line 58
    invoke-direct {v4, v1, p0, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 59
    .line 60
    .line 61
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 62
    .line 63
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_1
    iget-object p0, p0, La/hvm0;->e2:La/fiu0;

    .line 68
    .line 69
    if-eqz p0, :cond_0

    .line 70
    .line 71
    return-object p0

    .line 72
    :cond_0
    const-string p0, "viewModelFactory"

    .line 73
    .line 74
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    const/4 p0, 0x0

    .line 78
    throw p0

    .line 79
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
