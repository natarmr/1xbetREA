.class public final synthetic La/r0w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/t0w;


# direct methods
.method public synthetic constructor <init>(La/t0w;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/r0w;->a:B

    iput-object p1, p0, La/r0w;->b:La/t0w;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 9

    .line 1
    iget-byte v0, p0, La/r0w;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    sget-object v0, La/t0w;->l2:La/art;

    .line 7
    .line 8
    new-instance v0, La/o0w;

    .line 9
    .line 10
    new-instance v1, La/vft;

    .line 11
    .line 12
    const/4 v7, 0x0

    .line 13
    const/16 v8, 0x15

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    iget-object v3, p0, La/r0w;->b:La/t0w;

    .line 17
    .line 18
    const-class v4, La/t0w;

    .line 19
    .line 20
    const-string v5, "onItemClick"

    .line 21
    .line 22
    const-string v6, "onItemClick(Lorg/xplatform/bethistory/core/domain/model/DateFilterTypeModel;)V"

    .line 23
    .line 24
    invoke-direct/range {v1 .. v8}, La/vft;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;IB)V

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, La/i26;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object p0, v0, La/i26;->e:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast p0, La/dp;

    .line 33
    .line 34
    new-instance v2, La/s3t;

    .line 35
    .line 36
    const/16 v3, 0x1c

    .line 37
    .line 38
    invoke-direct {v2, v3}, La/s3t;-><init>(B)V

    .line 39
    .line 40
    .line 41
    new-instance v3, La/t3t;

    .line 42
    .line 43
    const/16 v4, 0x15

    .line 44
    .line 45
    invoke-direct {v3, v1, v4}, La/t3t;-><init>(Ljava/lang/Object;B)V

    .line 46
    .line 47
    .line 48
    new-instance v1, La/pkv;

    .line 49
    .line 50
    const/4 v4, 0x3

    .line 51
    const/16 v5, 0xb

    .line 52
    .line 53
    invoke-direct {v1, v4, v5}, La/pkv;-><init>(IB)V

    .line 54
    .line 55
    .line 56
    sget-object v4, La/btv;->g:La/btv;

    .line 57
    .line 58
    new-instance v5, La/gbn;

    .line 59
    .line 60
    invoke-direct {v5, v2, v1, v3, v4}, La/gbn;-><init>(Lkotlin/jvm/functions/Function2;La/xdr;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v5}, La/dp;->b(La/gbn;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_0
    iget-object p0, p0, La/r0w;->b:La/t0w;

    .line 68
    .line 69
    iget-object p0, p0, La/t0w;->e2:La/fiu0;

    .line 70
    .line 71
    if-eqz p0, :cond_0

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_0
    const-string p0, "viewModelFactory"

    .line 75
    .line 76
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const/4 p0, 0x0

    .line 80
    throw p0

    .line 81
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
