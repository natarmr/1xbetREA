.class public final La/p6d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/gmq;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/gmq;

.field public final synthetic c:La/gmq;

.field public final synthetic d:La/xdr;


# direct methods
.method public synthetic constructor <init>(La/gmq;La/gmq;La/xdr;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/p6d;->a:B

    iput-object p1, p0, La/p6d;->b:La/gmq;

    iput-object p2, p0, La/p6d;->c:La/gmq;

    iput-object p3, p0, La/p6d;->d:La/xdr;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(La/kmq;La/yje;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-byte v0, p0, La/p6d;->a:B

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x2

    .line 7
    new-array v0, v0, [La/gmq;

    .line 8
    .line 9
    const/4 v1, 0x0

    .line 10
    iget-object v2, p0, La/p6d;->b:La/gmq;

    .line 11
    .line 12
    aput-object v2, v0, v1

    .line 13
    .line 14
    const/4 v1, 0x1

    .line 15
    iget-object v2, p0, La/p6d;->c:La/gmq;

    .line 16
    .line 17
    aput-object v2, v0, v1

    .line 18
    .line 19
    sget-object v1, La/pul;->j:La/pul;

    .line 20
    .line 21
    new-instance v2, La/kh1;

    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    const/16 v4, 0x9

    .line 25
    .line 26
    iget-object p0, p0, La/p6d;->d:La/xdr;

    .line 27
    .line 28
    invoke-direct {v2, p0, v3, v4}, La/kh1;-><init>(Ljava/lang/Object;La/yje;B)V

    .line 29
    .line 30
    .line 31
    invoke-static {p2, p1, v2, v1, v0}, La/tdc;->G(La/yje;La/kmq;La/xdr;Lkotlin/jvm/functions/Function0;[La/gmq;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    sget-object p1, La/wne;->a:La/wne;

    .line 36
    .line 37
    if-ne p0, p1, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 41
    .line 42
    :goto_0
    return-object p0

    .line 43
    :pswitch_0
    new-instance v0, La/s6d;

    .line 44
    .line 45
    iget-object v4, p0, La/p6d;->d:La/xdr;

    .line 46
    .line 47
    const/4 v5, 0x0

    .line 48
    iget-object v1, p0, La/p6d;->b:La/gmq;

    .line 49
    .line 50
    iget-object v2, p0, La/p6d;->c:La/gmq;

    .line 51
    .line 52
    move-object v3, p1

    .line 53
    invoke-direct/range {v0 .. v5}, La/s6d;-><init>(La/gmq;La/gmq;La/kmq;La/xdr;La/yje;)V

    .line 54
    .line 55
    .line 56
    invoke-static {p2, v0}, La/d5c;->J(La/yje;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    sget-object p1, La/wne;->a:La/wne;

    .line 61
    .line 62
    if-ne p0, p1, :cond_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 66
    .line 67
    :goto_1
    return-object p0

    .line 68
    nop

    .line 69
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
