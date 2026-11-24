.class public final synthetic La/zt20;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xdr;

.field public final synthetic c:La/ym6;

.field public final synthetic d:La/eao;


# direct methods
.method public synthetic constructor <init>(La/xdr;La/ym6;La/eao;B)V
    .locals 0

    .line 1
    iput-byte p4, p0, La/zt20;->a:B

    iput-object p1, p0, La/zt20;->b:La/xdr;

    iput-object p2, p0, La/zt20;->c:La/ym6;

    iput-object p3, p0, La/zt20;->d:La/eao;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    .line 1
    iget-byte v0, p0, La/zt20;->a:B

    .line 2
    .line 3
    iget-object v1, p0, La/zt20;->d:La/eao;

    .line 4
    .line 5
    iget-object v2, p0, La/zt20;->c:La/ym6;

    .line 6
    .line 7
    iget-object p0, p0, La/zt20;->b:La/xdr;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    iget-wide v3, v2, La/ym6;->a:J

    .line 13
    .line 14
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    iget-wide v3, v1, La/eao;->e:J

    .line 19
    .line 20
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-wide v2, v2, La/ym6;->b:D

    .line 25
    .line 26
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-interface {p0, v0, v1, v2}, La/xdr;->F(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_0
    new-instance v0, La/zt20;

    .line 37
    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-direct {v0, p0, v2, v1, v3}, La/zt20;-><init>(La/xdr;La/ym6;La/eao;B)V

    .line 40
    .line 41
    .line 42
    sget-object p0, La/ivb0;->b:La/ymx;

    .line 43
    .line 44
    invoke-static {p0, v0}, La/fxb;->D(La/ymx;Lkotlin/jvm/functions/Function0;)La/bjj;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, La/bjj;->a()V

    .line 49
    .line 50
    .line 51
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 52
    .line 53
    return-object p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
