.class public final synthetic La/cyz;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/eyz;


# direct methods
.method public synthetic constructor <init>(La/eyz;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/cyz;->a:B

    iput-object p1, p0, La/cyz;->b:La/eyz;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/cyz;->a:B

    .line 2
    .line 3
    sget-object v1, La/fxz;->a:La/fxz;

    .line 4
    .line 5
    iget-object p0, p0, La/cyz;->b:La/eyz;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, La/eyz;->O1:La/evz;

    .line 11
    .line 12
    invoke-virtual {p0}, La/eyz;->G0()La/k3t0;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    sget-object v0, La/eyz;->O1:La/evz;

    .line 23
    .line 24
    invoke-virtual {p0}, La/eyz;->G0()La/k3t0;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-virtual {p0, v1}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 32
    .line 33
    return-object p0

    .line 34
    :pswitch_1
    sget-object v0, La/eyz;->O1:La/evz;

    .line 35
    .line 36
    iget-object p0, p0, La/eyz;->K1:La/fiu0;

    .line 37
    .line 38
    if-eqz p0, :cond_0

    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_0
    const-string p0, "viewModelFactory"

    .line 42
    .line 43
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    const/4 p0, 0x0

    .line 47
    throw p0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
