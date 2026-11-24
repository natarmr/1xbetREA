.class public final synthetic La/zwi0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/xxi0;


# direct methods
.method public synthetic constructor <init>(La/xxi0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zwi0;->a:B

    iput-object p1, p0, La/zwi0;->b:La/xxi0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/zwi0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/zwi0;->b:La/xxi0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    new-instance v0, La/obg;

    .line 9
    .line 10
    const/16 v1, 0x1d

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-direct {v0, v1, v2}, La/obg;-><init>(BZ)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    iget-object v0, p0, La/xxi0;->r:La/s31;

    .line 23
    .line 24
    invoke-virtual {v0}, La/s31;->w()V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, La/xxi0;->P:La/s64;

    .line 28
    .line 29
    const-string v1, "oneclick"

    .line 30
    .line 31
    invoke-virtual {v0, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    sget-object v0, La/w0j0;->a:La/w0j0;

    .line 35
    .line 36
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_1
    new-instance v0, La/kui0;

    .line 43
    .line 44
    const/4 v1, 0x7

    .line 45
    invoke-direct {v0, v1}, La/kui0;-><init>(B)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

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
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
