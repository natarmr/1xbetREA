.class public final synthetic La/v3w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/y3w;


# direct methods
.method public synthetic constructor <init>(La/y3w;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/v3w;->a:B

    iput-object p1, p0, La/v3w;->b:La/y3w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/v3w;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/v3w;->b:La/y3w;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/y3w;->n2:La/sqt;

    .line 9
    .line 10
    new-instance v0, La/z3w;

    .line 11
    .line 12
    new-instance v1, La/t3t;

    .line 13
    .line 14
    const/16 v2, 0x18

    .line 15
    .line 16
    invoke-direct {v1, p0, v2}, La/t3t;-><init>(Ljava/lang/Object;B)V

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, La/i26;-><init>()V

    .line 20
    .line 21
    .line 22
    iget-object p0, v0, La/i26;->e:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p0, La/dp;

    .line 25
    .line 26
    new-instance v2, La/x2w;

    .line 27
    .line 28
    const/4 v3, 0x1

    .line 29
    invoke-direct {v2, v3}, La/x2w;-><init>(B)V

    .line 30
    .line 31
    .line 32
    new-instance v3, La/t3t;

    .line 33
    .line 34
    const/16 v4, 0x19

    .line 35
    .line 36
    invoke-direct {v3, v1, v4}, La/t3t;-><init>(Ljava/lang/Object;B)V

    .line 37
    .line 38
    .line 39
    new-instance v1, La/pkv;

    .line 40
    .line 41
    const/4 v4, 0x3

    .line 42
    const/16 v5, 0xe

    .line 43
    .line 44
    invoke-direct {v1, v4, v5}, La/pkv;-><init>(IB)V

    .line 45
    .line 46
    .line 47
    sget-object v4, La/btv;->j:La/btv;

    .line 48
    .line 49
    new-instance v5, La/gbn;

    .line 50
    .line 51
    invoke-direct {v5, v2, v1, v3, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v5}, La/dp;->b(La/gbn;)V

    .line 55
    .line 56
    .line 57
    return-object v0

    .line 58
    :pswitch_0
    iget-object p0, p0, La/y3w;->j2:La/fiu0;

    .line 59
    .line 60
    if-eqz p0, :cond_0

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_0
    const-string p0, "viewModelFactory"

    .line 64
    .line 65
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    throw p0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
