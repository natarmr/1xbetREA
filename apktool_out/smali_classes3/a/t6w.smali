.class public final synthetic La/t6w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/x6w;


# direct methods
.method public synthetic constructor <init>(La/x6w;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/t6w;->a:B

    iput-object p1, p0, La/t6w;->b:La/x6w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/t6w;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/t6w;->b:La/x6w;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/x6w;->k2:La/art;

    .line 9
    .line 10
    new-instance v0, La/y6w;

    .line 11
    .line 12
    new-instance v1, La/t3t;

    .line 13
    .line 14
    const/16 v2, 0x1c

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
    new-instance v2, La/t3t;

    .line 27
    .line 28
    const/16 v3, 0x1d

    .line 29
    .line 30
    invoke-direct {v2, v0, v3}, La/t3t;-><init>(Ljava/lang/Object;B)V

    .line 31
    .line 32
    .line 33
    new-instance v3, La/x2w;

    .line 34
    .line 35
    const/4 v4, 0x5

    .line 36
    invoke-direct {v3, v4}, La/x2w;-><init>(B)V

    .line 37
    .line 38
    .line 39
    new-instance v4, La/f3s;

    .line 40
    .line 41
    const/16 v5, 0x1b

    .line 42
    .line 43
    invoke-direct {v4, v2, v1, v5}, La/f3s;-><init>(Ljava/lang/Object;Ljava/lang/Object;B)V

    .line 44
    .line 45
    .line 46
    new-instance v1, La/pkv;

    .line 47
    .line 48
    const/4 v2, 0x3

    .line 49
    const/16 v5, 0x11

    .line 50
    .line 51
    invoke-direct {v1, v2, v5}, La/pkv;-><init>(IB)V

    .line 52
    .line 53
    .line 54
    sget-object v2, La/btv;->m:La/btv;

    .line 55
    .line 56
    new-instance v5, La/gbn;

    .line 57
    .line 58
    invoke-direct {v5, v3, v1, v4, v2}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v5}, La/dp;->b(La/gbn;)V

    .line 62
    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_0
    iget-object p0, p0, La/x6w;->e2:La/fiu0;

    .line 66
    .line 67
    if-eqz p0, :cond_0

    .line 68
    .line 69
    return-object p0

    .line 70
    :cond_0
    const-string p0, "viewModelFactory"

    .line 71
    .line 72
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    const/4 p0, 0x0

    .line 76
    throw p0

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
