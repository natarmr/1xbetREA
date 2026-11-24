.class public final synthetic La/ebq0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gbq0;


# direct methods
.method public synthetic constructor <init>(La/gbq0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ebq0;->a:B

    iput-object p1, p0, La/ebq0;->b:La/gbq0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/ebq0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/ebq0;->b:La/gbq0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/gbq0;->m2:La/s2m0;

    .line 9
    .line 10
    new-instance v0, La/cbq0;

    .line 11
    .line 12
    new-instance v1, La/w6q0;

    .line 13
    .line 14
    iget-object p0, p0, La/gbq0;->i2:La/kiu0;

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
    check-cast v3, La/nbq0;

    .line 22
    .line 23
    const/4 v7, 0x0

    .line 24
    const/4 v8, 0x2

    .line 25
    const/4 v2, 0x1

    .line 26
    const-class v4, La/nbq0;

    .line 27
    .line 28
    const-string v5, "onClickedCallTheme"

    .line 29
    .line 30
    const-string v6, "onClickedCallTheme(I)V"

    .line 31
    .line 32
    invoke-direct/range {v1 .. v8}, La/w6q0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0}, La/qv5;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance p0, La/im8;

    .line 39
    .line 40
    const/16 v2, 0xd

    .line 41
    .line 42
    invoke-direct {p0, v2}, La/im8;-><init>(B)V

    .line 43
    .line 44
    .line 45
    new-instance v2, La/d38;

    .line 46
    .line 47
    const/16 v3, 0x16

    .line 48
    .line 49
    invoke-direct {v2, v1, v3}, La/d38;-><init>(Ljava/lang/Object;B)V

    .line 50
    .line 51
    .line 52
    new-instance v1, La/lq4;

    .line 53
    .line 54
    const/4 v3, 0x3

    .line 55
    const/16 v4, 0xf

    .line 56
    .line 57
    invoke-direct {v1, v3, v4}, La/lq4;-><init>(IB)V

    .line 58
    .line 59
    .line 60
    sget-object v3, La/zx3;->y:La/zx3;

    .line 61
    .line 62
    new-instance v4, La/gbn;

    .line 63
    .line 64
    invoke-direct {v4, p0, v1, v2, v3}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 65
    .line 66
    .line 67
    iget-object p0, v0, La/zz3;->d:La/dp;

    .line 68
    .line 69
    invoke-virtual {p0, v4}, La/dp;->b(La/gbn;)V

    .line 70
    .line 71
    .line 72
    return-object v0

    .line 73
    :pswitch_0
    sget-object v0, La/gbq0;->m2:La/s2m0;

    .line 74
    .line 75
    iget-object p0, p0, La/gbq0;->g2:La/fiu0;

    .line 76
    .line 77
    if-eqz p0, :cond_0

    .line 78
    .line 79
    return-object p0

    .line 80
    :cond_0
    const-string p0, "viewModelFactory"

    .line 81
    .line 82
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    const/4 p0, 0x0

    .line 86
    throw p0

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
