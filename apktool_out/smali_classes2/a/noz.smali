.class public final synthetic La/noz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/qoz;


# direct methods
.method public synthetic constructor <init>(La/qoz;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/noz;->a:B

    iput-object p1, p0, La/noz;->b:La/qoz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/noz;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/noz;->b:La/qoz;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/qoz;->N1:La/sqt;

    .line 9
    .line 10
    iget-object p0, p0, La/qoz;->K1:La/fiu0;

    .line 11
    .line 12
    if-eqz p0, :cond_0

    .line 13
    .line 14
    return-object p0

    .line 15
    :cond_0
    const-string p0, "viewModelFactory"

    .line 16
    .line 17
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0

    .line 22
    :pswitch_0
    sget-object v0, La/qoz;->N1:La/sqt;

    .line 23
    .line 24
    iget-object p0, p0, La/qoz;->M1:La/a8z;

    .line 25
    .line 26
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, La/k3t0;

    .line 31
    .line 32
    sget-object v0, La/joz;->a:La/joz;

    .line 33
    .line 34
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_1
    sget-object v0, La/qoz;->N1:La/sqt;

    .line 41
    .line 42
    iget-object p0, p0, La/qoz;->M1:La/a8z;

    .line 43
    .line 44
    invoke-interface {p0}, La/a8z;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast p0, La/k3t0;

    .line 49
    .line 50
    sget-object v0, La/ioz;->a:La/ioz;

    .line 51
    .line 52
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 56
    .line 57
    return-object p0

    .line 58
    nop

    .line 59
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
