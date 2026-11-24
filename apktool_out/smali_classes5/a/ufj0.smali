.class public final synthetic La/ufj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ngj0;


# direct methods
.method public synthetic constructor <init>(La/ngj0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/ufj0;->a:B

    iput-object p1, p0, La/ufj0;->b:La/ngj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    .line 1
    iget-byte v0, p0, La/ufj0;->a:B

    .line 2
    .line 3
    const/16 v1, 0xe

    .line 4
    .line 5
    iget-object p0, p0, La/ufj0;->b:La/ngj0;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance v0, La/mej0;

    .line 11
    .line 12
    invoke-direct {v0, v1}, La/mej0;-><init>(B)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 16
    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_0
    iget-object v0, p0, La/ngj0;->r:La/s31;

    .line 22
    .line 23
    invoke-virtual {v0}, La/s31;->w()V

    .line 24
    .line 25
    .line 26
    iget-object v0, p0, La/ngj0;->Q:La/s64;

    .line 27
    .line 28
    const-string v1, "oneclick"

    .line 29
    .line 30
    invoke-virtual {v0, v1}, La/s64;->e(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    sget-object v0, La/w0j0;->a:La/w0j0;

    .line 34
    .line 35
    invoke-virtual {p0, v0}, La/i3t0;->G(Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 39
    .line 40
    return-object p0

    .line 41
    :pswitch_1
    new-instance v0, La/cxi0;

    .line 42
    .line 43
    const/4 v2, 0x1

    .line 44
    invoke-direct {v0, v1, v2}, La/cxi0;-><init>(BZ)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v0}, La/i3t0;->H(Lkotlin/jvm/functions/Function2;)V

    .line 48
    .line 49
    .line 50
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 51
    .line 52
    return-object p0

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
