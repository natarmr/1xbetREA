.class public final synthetic La/xr80;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/as80;


# direct methods
.method public synthetic constructor <init>(La/as80;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/xr80;->a:B

    iput-object p1, p0, La/xr80;->b:La/as80;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/xr80;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/xr80;->b:La/as80;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/as80;->Y1:La/fl70;

    .line 9
    .line 10
    invoke-virtual {p0}, La/as80;->H0()La/jt80;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v0, La/yq80;->a:La/yq80;

    .line 15
    .line 16
    invoke-virtual {p0, v0}, La/jt80;->b0(La/lr80;)V

    .line 17
    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 20
    .line 21
    return-object p0

    .line 22
    :pswitch_0
    iget-object p0, p0, La/as80;->N1:La/fiu0;

    .line 23
    .line 24
    if-eqz p0, :cond_0

    .line 25
    .line 26
    return-object p0

    .line 27
    :cond_0
    const-string p0, "viewModelFactory"

    .line 28
    .line 29
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    throw p0

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
