.class public final synthetic La/wwu0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/ywu0;


# direct methods
.method public synthetic constructor <init>(La/ywu0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/wwu0;->a:B

    iput-object p1, p0, La/wwu0;->b:La/ywu0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/wwu0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/wwu0;->b:La/ywu0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/ywu0;->s2:La/sxs0;

    .line 9
    .line 10
    invoke-virtual {p0}, La/ywu0;->P0()La/k3t0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, La/awu0;->a:La/awu0;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/k3t0;->x(Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    sget-object v0, La/ywu0;->s2:La/sxs0;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->R()Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {p0}, La/yo8;->y0()V

    .line 32
    .line 33
    .line 34
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 35
    .line 36
    return-object p0

    .line 37
    :pswitch_1
    new-instance v0, La/q0h0;

    .line 38
    .line 39
    iget-object p0, p0, La/ywu0;->k2:La/gzi;

    .line 40
    .line 41
    if-eqz p0, :cond_1

    .line 42
    .line 43
    invoke-direct {v0, p0}, La/q0h0;-><init>(La/p0h0;)V

    .line 44
    .line 45
    .line 46
    return-object v0

    .line 47
    :cond_1
    const-string p0, "viewModelFactory"

    .line 48
    .line 49
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    throw p0

    .line 54
    nop

    .line 55
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
