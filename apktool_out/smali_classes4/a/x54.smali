.class public final synthetic La/x54;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/a64;


# direct methods
.method public synthetic constructor <init>(La/a64;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/x54;->a:B

    iput-object p1, p0, La/x54;->b:La/a64;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/x54;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/x54;->b:La/a64;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/a64;->l2:La/jdk0;

    .line 9
    .line 10
    new-instance v0, La/w54;

    .line 11
    .line 12
    new-instance v1, La/bk2;

    .line 13
    .line 14
    iget-object p0, p0, La/a64;->i2:La/kiu0;

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
    check-cast v3, La/m64;

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const/16 v8, 0x1a

    .line 25
    .line 26
    const/4 v2, 0x1

    .line 27
    const-class v4, La/m64;

    .line 28
    .line 29
    const-string v5, "onAuthEntryPointClick"

    .line 30
    .line 31
    const-string v6, "onAuthEntryPointClick(I)V"

    .line 32
    .line 33
    invoke-direct/range {v1 .. v8}, La/bk2;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 34
    .line 35
    .line 36
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 37
    .line 38
    .line 39
    new-instance p0, La/o33;

    .line 40
    .line 41
    const/16 v2, 0xb

    .line 42
    .line 43
    invoke-direct {p0, v2}, La/o33;-><init>(B)V

    .line 44
    .line 45
    .line 46
    new-instance v2, La/b33;

    .line 47
    .line 48
    const/16 v3, 0xe

    .line 49
    .line 50
    invoke-direct {v2, v1, v3}, La/b33;-><init>(Ljava/lang/Object;B)V

    .line 51
    .line 52
    .line 53
    new-instance v1, La/l9;

    .line 54
    .line 55
    const/4 v3, 0x3

    .line 56
    const/16 v4, 0x18

    .line 57
    .line 58
    invoke-direct {v1, v3, v4}, La/l9;-><init>(IB)V

    .line 59
    .line 60
    .line 61
    sget-object v3, La/zx3;->d:La/zx3;

    .line 62
    .line 63
    new-instance v4, La/gbn;

    .line 64
    .line 65
    invoke-direct {v4, p0, v1, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 66
    .line 67
    .line 68
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 69
    .line 70
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 71
    .line 72
    .line 73
    return-object v0

    .line 74
    :pswitch_0
    sget-object v0, La/a64;->l2:La/jdk0;

    .line 75
    .line 76
    iget-object p0, p0, La/a64;->g2:La/fiu0;

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
