.class public final synthetic La/zuj0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/kvj0;


# direct methods
.method public synthetic constructor <init>(La/kvj0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/zuj0;->a:B

    iput-object p1, p0, La/zuj0;->b:La/kvj0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-byte v0, p0, La/zuj0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/zuj0;->b:La/kvj0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/kvj0;->S1:La/eke0;

    .line 9
    .line 10
    invoke-static {p0}, La/sj3;->T(Landroidx/fragment/app/Fragment;)V

    .line 11
    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 14
    .line 15
    return-object p0

    .line 16
    :pswitch_0
    sget-object v0, La/kvj0;->S1:La/eke0;

    .line 17
    .line 18
    invoke-virtual {p0}, La/kvj0;->M0()La/yxj0;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    iget-object v0, p0, La/yxj0;->U:La/bby;

    .line 23
    .line 24
    const/4 v1, 0x1

    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-interface {v0}, La/bby;->isActive()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-ne v0, v1, :cond_0

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    invoke-virtual {p0, v1}, La/yxj0;->C(Z)V

    .line 35
    .line 36
    .line 37
    :goto_0
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 38
    .line 39
    return-object p0

    .line 40
    :pswitch_1
    iget-object p0, p0, La/kvj0;->N1:La/fhi;

    .line 41
    .line 42
    if-eqz p0, :cond_1

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_1
    const-string p0, "viewModelFactory"

    .line 46
    .line 47
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    const/4 p0, 0x0

    .line 51
    throw p0

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
