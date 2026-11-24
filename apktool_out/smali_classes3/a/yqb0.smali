.class public final synthetic La/yqb0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function0;


# instance fields
.field public final synthetic a:B

.field public final synthetic b:La/crb0;


# direct methods
.method public synthetic constructor <init>(La/crb0;B)V
    .locals 0

    .line 1
    iput-byte p2, p0, La/yqb0;->a:B

    iput-object p1, p0, La/yqb0;->b:La/crb0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-byte v0, p0, La/yqb0;->a:B

    .line 2
    .line 3
    iget-object p0, p0, La/yqb0;->b:La/crb0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object v0, La/crb0;->S1:La/jh70;

    .line 9
    .line 10
    invoke-virtual {p0}, La/crb0;->H0()La/orb0;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, La/orb0;->x()V

    .line 15
    .line 16
    .line 17
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 18
    .line 19
    return-object p0

    .line 20
    :pswitch_0
    sget-object v0, La/crb0;->S1:La/jh70;

    .line 21
    .line 22
    invoke-virtual {p0}, La/crb0;->H0()La/orb0;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, La/orb0;->x()V

    .line 27
    .line 28
    .line 29
    sget-object p0, Lkotlin/Unit;->a:Lkotlin/Unit;

    .line 30
    .line 31
    return-object p0

    .line 32
    :pswitch_1
    iget-object p0, p0, La/crb0;->O1:La/fiu0;

    .line 33
    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    return-object p0

    .line 37
    :cond_0
    const-string p0, "viewModelFactory"

    .line 38
    .line 39
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->h(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    const/4 p0, 0x0

    .line 43
    throw p0

    .line 44
    nop

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
